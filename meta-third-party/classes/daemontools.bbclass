DAEMON_PN ?= "${PN}"

DAEMONTOOLS ?= "daemontools-run"
DAEMONTOOLS_virtclass-cross = ""
DAEMONTOOLS_virtclass-native = ""
DAEMONTOOLS_virtclass-nativesdk = ""

DAEMONTOOLS_SERVICES_DIR ?= "/service"
DAEMONTOOLS_LOG_DIR_PREFIX = "${localstatedir}/log"
DAEMONTOOLS_LOG_DIR_PREFIX_bpp3 = "/log"

python () {
    pkg = d.getVar('DAEMON_PN', True)
    d.appendVar('RDEPENDS_' + pkg, ' ${DAEMONTOOLS}')
}

DAEMONTOOLS_preinst() {
	if test "x$D" = "x"; then
		if [ -d ${DAEMONTOOLS_SERVICES_DIR}/${PN} ]; then
			echo "Stopping ${PN}"
			svc -d ${DAEMONTOOLS_SERVICES_DIR}/${PN}
			svc -d ${DAEMONTOOLS_SERVICES_DIR}/${PN}/log
		fi
	fi
}

DAEMONTOOLS_postinst() {
	if test "x$D" = "x"; then
		if [ "x${DAEMONTOOLS_DOWN}" = "x" ]; then
			echo "Starting ${PN}"
			svc -u ${DAEMONTOOLS_SERVICES_DIR}/${PN}/log
			svc -u ${DAEMONTOOLS_SERVICES_DIR}/${PN}
		fi
	fi
}

DAEMONTOOLS_prerm() {
	if test "x$D" = "x"; then
		echo "Stopping ${PN}"
		svc -d ${DAEMONTOOLS_SERVICES_DIR}/${PN}
		svc -d ${DAEMONTOOLS_SERVICES_DIR}/${PN}/log
	fi
}

# opkg forgets to remove symlinks, dpkg doesn't so check if still there
DAEMONTOOLS_postrm() {
	if [ -d ${DAEMONTOOLS_SERVICES_DIR}/${PN} ]; then
		rm ${DAEMONTOOLS_SERVICES_DIR}/${PN}
	fi
}

def daemontools_after_parse(d):
    if d.getVar('DAEMONTOOLS_SERVICE_DIR') == None:
        raise bb.build.FuncFailed, "%s inherits daemontools but doesn't set DAEMONTOOLS_SERVICE_DIR" % d.getVar('FILE')

python __anonymous() {
    daemontools_after_parse(d)
}

python populate_packages_prepend () {
    def update_rcd_package(pkg):
        bb.debug(1, 'adding update-rc.d calls to postinst/postrm for %s' % pkg)
        localdata = bb.data.createCopy(d)
        overrides = localdata.getVar("OVERRIDES", True)
        localdata.setVar("OVERRIDES", "%s:%s" % (pkg, overrides))
        bb.data.update_data(localdata)

        """
        update_rc.d postinst is appended here because pkg_postinst may require to
        execute on the target. Not doing so may cause update_rc.d postinst invoked
        twice to cause unwanted warnings.
        """ 
        preinst = localdata.getVar('pkg_preinst', True)
        if not preinst:
            preinst = '#!/bin/sh\n'
        preinst += localdata.getVar('DAEMONTOOLS_preinst', True)
        d.setVar('pkg_preinst_%s' % pkg, preinst)

        postinst = localdata.getVar('pkg_postinst', True)
        if not postinst:
            postinst = '#!/bin/sh\n'
        postinst += localdata.getVar('DAEMONTOOLS_postinst', True)
        d.setVar('pkg_postinst_%s' % pkg, postinst)

        prerm = localdata.getVar('pkg_prerm', True)
        if not prerm:
            prerm = '#!/bin/sh\n'
        prerm += localdata.getVar('DAEMONTOOLS_prerm', True)
        d.setVar('pkg_prerm_%s' % pkg, prerm)

        postrm = localdata.getVar('pkg_postrm', True)
        if not postrm:
                postrm = '#!/bin/sh\n'
        postrm += localdata.getVar('DAEMONTOOLS_postrm', True)
        d.setVar('pkg_postrm_%s' % pkg, postrm)

    pkgs = d.getVar('DAEMONTOOLS_SERVICES', True)
    if pkgs == None:
        pkgs = d.getVar('DAEMON_PN', True)
        packages = (d.getVar('PACKAGES', True) or "").split()
        if not pkgs in packages and packages != []:
            pkgs = packages[0]
    for pkg in pkgs.split():
        update_rcd_package(pkg)
}


do_install_append() {
	SERVICE="${D}${DAEMONTOOLS_SERVICE_DIR}"

	install -d ${SERVICE}
	echo "#!/bin/sh" > ${SERVICE}/run
	echo "exec 2>&1" >> ${SERVICE}/run
	if [ "x${DAEMONTOOLS_SCRIPT}" = "x" ]; then
		DAEMONTOOLS_SCRIPT="exec ${DAEMONTOOLS_RUN}"
	fi
	echo "${DAEMONTOOLS_SCRIPT}" >> ${SERVICE}/run
	chmod 755 ${SERVICE}/run

	install -d ${SERVICE}/log
	echo "#!/bin/sh" > ${SERVICE}/log/run
	echo "exec 2>&1" >> ${SERVICE}/log/run
	if [ "x${DAEMONTOOLS_LOG_DIR}" = "x" ]; then
		DAEMONTOOLS_LOG_DIR="${DAEMONTOOLS_LOG_DIR_PREFIX}/${PN}"
	fi
	echo "exec multilog t s99999 n8 ${DAEMONTOOLS_LOG_DIR}" >> ${SERVICE}/log/run
	chmod 755 ${SERVICE}/log/run

	if [ "x${DAEMONTOOLS_DOWN}" != "x" ]; then
		touch ${SERVICE}/down
		touch ${SERVICE}/log/down
	fi

	install -d ${D}${DAEMONTOOLS_SERVICES_DIR}
	ln -s ${DAEMONTOOLS_SERVICE_DIR} ${D}${DAEMONTOOLS_SERVICES_DIR}/${PN}
}

FILES_${PN} += "${DAEMONTOOLS_SERVICES_DIR}"
