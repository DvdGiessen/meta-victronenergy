FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

VELIB_DEFAULT_DIRS = "1"
inherit ve_package

SRC_URI += "\
	file://overlays.sh \
	file://static-nodes.sh \
"

do_install_append() {
	echo RANDOM_SEED_FILE=${permanentlocalstatedir}/lib/random-seed \
		>${D}${sysconfdir}/default/urandom

	install -m 0755 ${WORKDIR}/static-nodes.sh ${D}${sysconfdir}/init.d
	install -m 0755 ${WORKDIR}/overlays.sh ${D}${sysconfdir}/init.d

	update-rc.d -r ${D} static-nodes.sh start 20 S .
	update-rc.d -r ${D} overlays.sh start 50 S .
}
