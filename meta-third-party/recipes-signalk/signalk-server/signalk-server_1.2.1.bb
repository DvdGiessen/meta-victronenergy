# Description: fetch & package signalk-server, without using OE npm-fetcher
#
# This recipe doesn't use the OE npm-fetcher since its buggy, not maintained,
# and also eternally slow in handling dependencies; of which signalk has many.
#
# Instead, only the packages that require compilation are done using that
# fetcher (see the other recipes), and the rest, all just .js and other
# files that do not need compilation, are retrieved using npm and then packaged.

LICENSE = "MIT"

inherit daemontools

SRC_URI = " \
	file://start-signalk.sh \
"

DEPENDS = " \
	nodejs-native \
"

RDEPENDS_${PN} += " \
	nodejs \
	nodejs-npm \
	serialport \
	socketcan \
"

DAEMONTOOLS_SERVICE_DIR = "${sysconfdir}/${PN}/service"
DAEMONTOOLS_RUN = "${libdir}/node_modules/signalk-server/bin/start-signalk.sh"

do_compile() {
	# Fetch & install signalk-server

	# TODO: the log shows various errors. They are in the packages that require
	# compiling, so don't hurt since they are deleted anyway. However, the error
	# now doesn't cause the package to fail, which it should. (and then the error
	# also needs fixing & circumventing. Best would be if we could skip all
	# compiling? (they are deleted afterwards anyway).
	npm install -g --prefix ./tmp signalk-server@${PV}

	# Next, remove the packages that contain compiled code
	# note that this means they must be installed in another way, ie by using
	# normal npm-fetcher from OE.
	rm -rf ./tmp/lib/node_modules/signalk-server/node_modules/bcrypt
	rm -rf ./tmp/lib/node_modules/signalk-server/node_modules/mdns
	rm -rf ./tmp/lib/node_modules/signalk-server/node_modules/serialport
	rm -rf ./tmp/lib/node_modules/signalk-server/node_modules/socketcan
}

do_install() {
        install -d ${D}/${libdir}/node_modules
	
	# find ${WORKDIR}/${BP}/tmp/lib/node_modules/signalk-server/ -type f -exec 'install -m 0755 "{}" ${D}${libdir}/node_modules/signalk-server' \;
	# above gives a an error. (find: `....`: no such file or directory). do the cp equivalent instead
	cp -R --no-dereference --preserve=mode,links -v ${WORKDIR}/${BP}/tmp/lib/node_modules/signalk-server ${D}${libdir}/node_modules/

	install -m 0755 ${WORKDIR}/start-signalk.sh ${D}${libdir}/node_modules/signalk-server/bin
}

FILES_${PN} += "${libdir}/node_modules/signalk-server"


