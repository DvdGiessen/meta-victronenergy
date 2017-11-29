DESCRIPTION = "An implementation of a Signal K central server for boats."
LICENSE = "Apache2"
LIC_FILES_CHKSUM = "file://../git/LICENSE;md5=34f8c1142fd6208a8be89399cb521df9"



# TODO: add patch to add venus-signalk
DEPENDS_${PN} += " nodejs"

SRC_URI = "git://github.com/SignalK/signalk-server-node.git;protocol=https;tag=v${PV}"

S = "${WORKDIR}/git"

# https://wiki.yoctoproject.org/wiki/TipsAndTricks/NPM was used as inspiration
# of below.

do_compile() {
    # changing the home directory to the working directory, the .npmrc will be created in this directory
    export HOME=${WORKDIR}

    # configure cache to be in working directory
    npm set cache ${WORKDIR}/npm_cache

    # clear local cache prior to each compile
    npm cache clear

    # compile and install node modules in source directory
    npm --arch=${TARGET_ARCH} --verbose install
}

do_install() {
    install -d ${D}/opt/victronenergy/signalk-node-server
    cp -r ${WORKDIR}/git/* ${D}/opt/victronenergy/signalk-node-server
}

FILES_${PN} += "/opt/victronenergy/signalk-node-server"
