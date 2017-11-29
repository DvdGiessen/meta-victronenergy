SUMMARY = "Add closed source wlan firmware to filesystem"
SOURCE = "https://github.com/armbian/firmware/tree/master/xr819"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://xr819/device-xradio.mk;md5=01a5e63ddf60e2a4af5b073cec783bb7"

COMPATIBLE_MACHINE = "nanopi"

S = "${WORKDIR}/git"

SRCREV = "455d6b6701178dafe7fd0168eb4a4ef78a8d24a3"

SRC_URI = " \
	gitsm://github.com/armbian/firmware.git;protocol=ssh;user=git;branch=master \
"

do_install() {
	install -d ${D}${base_libdir}/firmware/xr819/
	install -m 755 ${S}/xr819/boot_xr819.bin ${D}${base_libdir}/firmware/xr819/
	install -m 755 ${S}/xr819/sdd_xr819.bin ${D}${base_libdir}/firmware/xr819/
	install -m 755 ${S}/xr819/fw_xr819.bin ${D}${base_libdir}/firmware/xr819/

}


FILES_${PN} += "${base_libdir}/firmware/xr819/boot_xr819.bin \"
FILES_${PN} += "${base_libdir}/firmware/xr819/sdd_xr819.bin \"
FILES_${PN} += "${base_libdir}/firmware/xr819/fw_xr819.bin \"

PACKAGE_ARCH = "${MACHINE_ARCH}"
