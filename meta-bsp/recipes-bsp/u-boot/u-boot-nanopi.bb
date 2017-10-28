DESCRIPTION="Upstream's U-boot configured for sunxi devices"

require u-boot.inc

DEPENDS += "dtc-native"

LICENSE = "GPLv2"

LIC_FILES_CHKSUM = "\
file://Licenses/Exceptions;md5=338a7cb1e52d0d1951f83e15319a3fe7 \
file://Licenses/bsd-2-clause.txt;md5=6a31f076f5773aabd8ff86191ad6fdd5 \
file://Licenses/bsd-3-clause.txt;md5=4a1190eac56a9db675d58ebe86eaf50c \
file://Licenses/eCos-2.0.txt;md5=b338cb12196b5175acd3aa63b0a0805c \
file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
file://Licenses/ibm-pibs.txt;md5=c49502a55e35e0a8a1dc271d944d6dba \
file://Licenses/isc.txt;md5=ec65f921308235311f34b79d844587eb \
file://Licenses/lgpl-2.0.txt;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
file://Licenses/lgpl-2.1.txt;md5=4fbd65380cdd255951079008b364516c \
file://Licenses/x11.txt;md5=b46f176c847b8742db02126fb8af92e2 \
"

COMPATIBLE_MACHINE = "(sun4i|sun5i|sun7i|sun8i|nanopi)"

DEFAULT_PREFERENCE_sun4i="1"
DEFAULT_PREFERENCE_sun5i="1"
DEFAULT_PREFERENCE_sun7i="1"
DEFAULT_PREFERENCE_sun8i="1"

SRC_URI = "git://git.denx.de/u-boot.git;branch=master \
           file://boot.cmd \
	   file://uEnv.txt \
           file://git/configs/nanopi_easysolar-display_defconfig \
           file://git/arch/arm/dts/nanopi_easysolar-display.dts \
           "

SRCREV = "c98ac3487e413c71e5d36322ef3324b21c6f60f9"

PV = "v2017.09"

S = "${WORKDIR}/git"

SPL_BINARY="u-boot-sunxi-with-spl.bin"

UBOOT_LOCALVERSION = "-venus"
UBOOT_ENV_SUFFIX = "scr"
UBOOT_ENV = "boot"
UBOOT_ENV_BINARY = "${UBOOT_ENV}.${UBOOT_ENV_SUFFIX}"

do_deploy_append() {
	${B}/tools/mkimage -C none -A arm -T script -d ${WORKDIR}/boot.cmd ${WORKDIR}/${UBOOT_ENV_BINARY}

	${B}/tools/mkenvimage -s 16384 -o ${DEPLOYDIR}/uboot.env ${WORKDIR}/uEnv.txt

	install ${WORKDIR}/boot.cmd ${DEPLOYDIR}/boot.cmd
	install ${WORKDIR}/${UBOOT_ENV_BINARY} ${DEPLOYDIR}/${UBOOT_ENV_BINARY}
	install ${WORKDIR}/git/${SPL_BINARY} ${DEPLOYDIR}/${SPL_BINARY}

	# Also deploy a symlink to make it easier to build a boot image later.
	install -d ${DEPLOYDIR}/boot
	
	ln -sf ../zImage ${DEPLOYDIR}/boot
	ln -sf ../zImage-nanopi_easysolar-display.dtb ${DEPLOYDIR}/boot/nanopi_easysolar-display.dtb
	ln -sf ../boot.cmd ${DEPLOYDIR}/boot/boot.cmd
	ln -sf ../uboot.env ${DEPLOYDIR}/boot
	ln -sf ../${UBOOT_ENV_BINARY} ${DEPLOYDIR}/boot/${UBOOT_ENV_BINARY}
	
}
do_deploy[dirs] += " ${DEPLOYDIR}/boot"

