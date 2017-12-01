DESCRIPTION = "VE character display server for easysolar"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9b0a9609befce3122afcc444da0fe825"

inherit ve_package
inherit daemontools

COMPATIBLE_MACHINE = "nanopi"

SRCREV = "70da07297597c0c85f1801b2b9bed81f7462c632"

SRC_URI = " \
	gitsm://github.com/victronenergy/dbus-characterdisplay.git;protocol=ssh;user=git;branch=master \
"

S = "${WORKDIR}/git"

RDEPENDS_${PN} = " \
	dbus-systemcalc-py \
	localsettings \
	python-dbus \
"

DAEMONTOOLS_SERVICE_DIR = "${bindir}/service"
DAEMONTOOLS_RUN = "softlimit -d 100000000 -s 1000000 -a 100000000 ${bindir}/dbus_characterdisplay.py"

do_install () {
	install -d ${D}${bindir}
	install -d ${D}/usr/lib/python2.7/	
	cp -r ${S}/dbus_characterdisplay.py ${D}${bindir}
	cp -r ${S}/i2c_lib.py ${D}/usr/lib/python2.7/
	cp -r ${S}/lcddriver.py ${D}/usr/lib/python2.7/
	cp -r ${S}/smbus.py ${D}/usr/lib/python2.7/
#	cp -r ${S}/* ${D}${bindir}

}

FILES_${PN} += "/usr/lib/python2.7/i2c_lib.py \"
FILES_${PN} += "/usr/lib/python2.7/lcddriver.py \"
FILES_${PN} += "/usr/lib/python2.7/smbus.py \"
