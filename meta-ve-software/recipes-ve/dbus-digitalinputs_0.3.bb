SUMMARY = "Provides dbus support for digital inputs on Venus"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d72366a45605591565f5bd03e155bc87"

inherit ve_package
inherit daemontools
inherit python-compile

SRC_URI = "gitsm://github.com/victronenergy/dbus-digitalinputs.git;protocol=https;tag=v${PV}"
S = "${WORKDIR}/git"

RDEPENDS_${PN} = " \
	localsettings \
	python-dbus \
	python-pygobject \
"

DAEMONTOOLS_RUN = "softlimit -d 100000000 -s 1000000 -a 100000000 ${bindir}/dbus_digitalinputs.py /dev/gpio/digital_input_*"

do_install () {
	install -d ${D}${bindir}
	cp -r ${S}/* ${D}${bindir}
}
