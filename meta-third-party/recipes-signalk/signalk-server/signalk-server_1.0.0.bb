LICENSE = "MIT"

inherit packagegroup

RDEPENDS_${PN} += " \
	nodejs \
	nodejs-npm \
	serialport \
	socketcan \
"