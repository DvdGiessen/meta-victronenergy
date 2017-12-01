SECTION = "kernel"
DESCRIPTION = "Mainline Linux kernel"
#LICENSE = "GPLv2"
#LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

COMPATIBLE_MACHINE = "(sun4i|sun5i|sun7i|sun8i)"

inherit kernel

require linux-nanopi.inc
require recipes-kernel/linux/linux-dtb.inc

# Pull in the devicetree files into the rootfs
# RDEPENDS_kernel-base += "kernel-devicetree"

# Default is to use stable kernel version
# If you want to use latest git version set to "1"
DEFAULT_PREFERENCE = "-1" 

KERNEL_EXTRA_ARGS += "LOADADDR=${UBOOT_ENTRYPOINT}"

#PV = "4.13.8-mainline"
#SRC_URI = "https://www.kernel.org/pub/linux/kernel/v4.x/linux-4.13.8.tar.gz \
#	file://linux-4.13.8/arch/arm/boot/dts/nanopi_charactercontrol.dts \
#	file://00-readd-dwmac-sun8i-compatibles.patch \
#	file://defconfig \
#	"
#SRC_URI[md5sum] = "85e23c9b81f5ae371469b077704a3f18"
#SRC_URI[sha256sum] = "4719f9a7ee5c8e3a3a1d47b1cef5375fd616609494b229dd0dfd79216a1a8f73"
#S = "${WORKDIR}/linux-4.13.8"

PV = "4.13.8-mainline"
SRCREV_pn-${PN} = "d913bc0b6dac2b93233a0aff4ff418be8c615613" 
# add patches from armbian for sunxi-next to have a good base.
SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;protocol=git;branch=linux-4.13.y \
	file://git/arch/arm/boot/dts/nanopi_easysolar-display.dts \
	file://patches/00-01-sun4i-codec-remove-unneeded-check.patch \
	file://patches/00-02-sun8i-codec-constify-snd_soc_dai_ops.patch \
	file://patches/00-03-sunxi-codec-request-resets.patch \
	file://patches/00-04-sun4i-spdif-handle-clk_prepare_enable.patch \
	file://patches/00-05-sun4i-i2s-extend-quirks-scope.patch \
	file://patches/00-06-make-snd_soc_codec_driver-const.patch \
	file://patches/00-07-clkdiv-offset-quirks.patch \
	file://patches/00-08-regmap-config-quirks.patch \
	file://patches/00-09-tx-fifo-offset-quirks.patch \
	file://patches/00-10-small-cleanup.patch \
	file://patches/00-11-regmap-add-channels.patch \
	file://patches/00-12-add-extra-regfields.patch \
	file://patches/00-13-add-polarity-to-regfields.patch \
	file://patches/00-14-add-mclk-enable-to-regfields.patch \
	file://patches/00-15-add-dai-format-to-regfields.patch \
	file://patches/00-16-add-slave-select-bit-to-regfields.patch \
	file://patches/00-17-use-bitmask-for-enable.patch \
	file://patches/00-18-add-support-for-H3-i2s.patch \
	file://patches/00-19-add-H3-i2s-DT-nodes.patch \
	file://patches/00-20-add-i2s-DT-pins.patch \
	file://patches/00-readd-dwmac-sun8i-compatibles.patch \
	file://patches/00-readd-dwmac-sun8i-DT-bindings.patch \
	file://patches/01-00-fix-fractional-mode-nm-clocks.patch \
	file://patches/01-01-multiplier-fix-fractional-mode.patch \
	file://patches/01-02-remove-debug-messages.patch \
	file://patches/01-03-wait-for-lock-fractional.patch \
	file://patches/06-export-H3-clk-pll-de.patch \
	file://patches/14-sun4i-i2s-workarounds.patch \
	file://patches/15-clk-sunxi-ng-fix-runtime-warnings.patch \
	file://patches/19-add-audio-workarounds.patch \
	file://patches/21-sun4i-gpadc-iio-add-split-sun8i.patch \
	file://patches/22-sun4i-gpadc-iio-add-H3-support.patch \
	file://patches/23-sun4i-gpadc-iio-add-H3-thermal-sensor-DT.patch \
	file://patches/24-sun4i-gpadc-iio-add-H3-CPU-thermal-zone.patch \
	file://patches/25-sun4i-gpadc-iio-workaround-for-raw-0-read.patch \
	file://patches/30-sun4i-drm-add-GEM-allocator.patch \
	file://patches/31-drm-gem-cma-export-allocator.patch \
	file://patches/32-h3-DT-add-mali-node.patch \
	file://patches/33-pll-gpu-allow-set-rate-parent.patch \
	file://patches/39-rename-s_twi-pinctrl-functions.patch \
	file://patches/40-add-SY8106A-regulator-driver.patch \
	file://patches/41-h3-h5-Add-r_i2c-controller.patch \
	file://patches/42-h3-h5-Add-r_i2c-pins.patch \
	file://patches/43-H3-cpux-allow-set-parent.patch \
	file://patches/44-H3-clk-cpu-use-pll-notifier.patch \
	file://patches/45-add-h3-cpu-OPP-table.patch \
	file://patches/46-H3-add-opp-table-to-cpu.patch \
	file://patches/48-cpufreq-dt-auto-create-platdev.patch \
	file://patches/50-H5-add-opp-table-to-cpu.patch \
	file://patches/90-01-add_USB_wifi_drivers_8812au_8723du_rtl8192cu.patch \
	file://patches/90-02-add_USB_wifi_armbian_fixes-for-kernel-4.13.patch \
	file://patches/add-axp803-DT.patch \
	file://patches/add-BergMicro-SPI-flashes.patch \
	file://patches/add-configfs-overlay-for-v4.10.x.patch \
	file://patches/add-H27UBG8T2BTR-nand.patch \
	file://patches/add-overlay-compilation-support.patch \
	file://patches/add-realtek-8189fs-driver.patch \
	file://patches/add-sunxi-overlays.patch \
	file://patches/add-xradio-wireless-driver.patch \
	file://patches/axp20x-sysfs-interface.patch \
	file://patches/bash_to_afterinstall.patch \
	file://patches/fix-i2c2-reg-property.patch \
	file://patches/packaging-4.x-next.patch \
	file://patches/scripts-dtc-import-updates.patch \
	file://patches/set-DMA-coherent-pool-to-2M.patch \
	file://patches/spidev-remove-warnings.patch \
	file://patches/sunxi-musb-fix-oops-on-unload.patch \
	file://defconfig \
	"
S = "${WORKDIR}/git"
