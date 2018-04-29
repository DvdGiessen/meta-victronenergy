# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "A bcrypt library for NodeJS."
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   node_modules/nan/LICENSE.md
#   node_modules/node-pre-gyp/LICENSE
#   node_modules/node-pre-gyp/node_modules/npmlog/node_modules/are-we-there-yet/node_modules/readable-stream/LICENSE
#   node_modules/node-pre-gyp/node_modules/npmlog/node_modules/are-we-there-yet/node_modules/readable-stream/node_modules/string_decoder/LICENSE
#   node_modules/node-pre-gyp/node_modules/npmlog/node_modules/are-we-there-yet/node_modules/readable-stream/node_modules/process-nextick-args/license.md
#   node_modules/node-pre-gyp/node_modules/nopt/node_modules/abbrev/LICENSE
#   node_modules/node-pre-gyp/node_modules/tar-pack/LICENSE
#   node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/readable-stream/LICENSE
#   node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/readable-stream/node_modules/string_decoder/LICENSE
#   node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/readable-stream/node_modules/process-nextick-args/license.md
#   node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream-ignore/node_modules/minimatch/node_modules/brace-expansion/node_modules/balanced-match/LICENSE.md
#   node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream-ignore/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/fs.realpath/LICENSE
#   node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream-ignore/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/node_modules/balanced-match/LICENSE.md
#   node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/rimraf/node_modules/glob/node_modules/fs.realpath/LICENSE
#   node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/rimraf/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/node_modules/balanced-match/LICENSE.md
#   node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/tar/node_modules/block-stream/LICENCE
#   node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/tar/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/fs.realpath/LICENSE
#   node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/tar/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/node_modules/balanced-match/LICENSE.md
#   node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/fs.realpath/LICENSE
#   node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/node_modules/balanced-match/LICENSE.md
#   node_modules/node-pre-gyp/node_modules/rimraf/node_modules/glob/node_modules/fs.realpath/LICENSE
#   node_modules/node-pre-gyp/node_modules/rimraf/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/node_modules/balanced-match/LICENSE.md
#   node_modules/node-pre-gyp/node_modules/tar/node_modules/block-stream/LICENCE
#   node_modules/node-pre-gyp/node_modules/tar/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/fs.realpath/LICENSE
#   node_modules/node-pre-gyp/node_modules/tar/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/node_modules/balanced-match/LICENSE.md
#   node_modules/node-pre-gyp/node_modules/request/LICENSE
#   node_modules/node-pre-gyp/node_modules/request/node_modules/forever-agent/LICENSE
#   node_modules/node-pre-gyp/node_modules/request/node_modules/caseless/LICENSE
#   node_modules/node-pre-gyp/node_modules/request/node_modules/oauth-sign/LICENSE
#   node_modules/node-pre-gyp/node_modules/request/node_modules/tunnel-agent/LICENSE
#   node_modules/node-pre-gyp/node_modules/request/node_modules/isstream/LICENSE.md
#   node_modules/node-pre-gyp/node_modules/request/node_modules/aws-sign2/LICENSE
#   node_modules/node-pre-gyp/node_modules/request/node_modules/qs/LICENSE
#   node_modules/node-pre-gyp/node_modules/request/node_modules/tough-cookie/LICENSE
#   node_modules/node-pre-gyp/node_modules/request/node_modules/http-signature/node_modules/jsprim/LICENSE
#   node_modules/node-pre-gyp/node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/verror/LICENSE
#   node_modules/node-pre-gyp/node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/verror/node_modules/extsprintf/LICENSE
#   node_modules/node-pre-gyp/node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/extsprintf/LICENSE
#   node_modules/node-pre-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/dashdash/LICENSE.txt
#   node_modules/node-pre-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/ecc-jsbn/node_modules/jsbn/LICENSE
#   node_modules/node-pre-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/ecc-jsbn/lib/LICENSE-jsbn
#   node_modules/node-pre-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/bcrypt-pbkdf/node_modules/tweetnacl/LICENSE
#   node_modules/node-pre-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/asn1/LICENSE
#   node_modules/node-pre-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/tweetnacl/LICENSE
#   node_modules/node-pre-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/jsbn/LICENSE
#   node_modules/node-pre-gyp/node_modules/request/node_modules/hawk/LICENSE
#   node_modules/node-pre-gyp/node_modules/request/node_modules/hawk/node_modules/sntp/LICENSE
#   node_modules/node-pre-gyp/node_modules/request/node_modules/hawk/node_modules/sntp/node_modules/hoek/LICENSE
#   node_modules/node-pre-gyp/node_modules/request/node_modules/hawk/node_modules/boom/LICENSE
#   node_modules/node-pre-gyp/node_modules/request/node_modules/hawk/node_modules/boom/node_modules/hoek/LICENSE
#   node_modules/node-pre-gyp/node_modules/request/node_modules/hawk/node_modules/cryptiles/LICENSE
#   node_modules/node-pre-gyp/node_modules/request/node_modules/hawk/node_modules/cryptiles/node_modules/boom/LICENSE
#   node_modules/node-pre-gyp/node_modules/request/node_modules/hawk/node_modules/cryptiles/node_modules/boom/node_modules/hoek/LICENSE
#   node_modules/node-pre-gyp/node_modules/request/node_modules/hawk/node_modules/hoek/LICENSE
#   node_modules/node-pre-gyp/node_modules/rc/LICENSE.APACHE2
#   node_modules/node-pre-gyp/node_modules/rc/LICENSE.BSD
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "Unknown & MIT & Apache-2.0 & BSD-2-Clause & ISC & \
BSD-3-Clause & Unlicense"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4665b5424ab734549385bae891f8d35d \
                    file://node_modules/nan/LICENSE.md;md5=d7425f79f415dec8f013aa2869dd7a4e \
                    file://node_modules/node-pre-gyp/LICENSE;md5=7e13c3cf883a44ebcc74a8f568c0f6fb \
                    file://node_modules/node-pre-gyp/node_modules/npmlog/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/npmlog/node_modules/gauge/LICENSE;md5=43abbc6f9093aea69560715033788727 \
                    file://node_modules/node-pre-gyp/node_modules/npmlog/node_modules/gauge/node_modules/signal-exit/LICENSE.txt;md5=e29e20260a1c78dba16a233048565cde \
                    file://node_modules/node-pre-gyp/node_modules/npmlog/node_modules/gauge/node_modules/strip-ansi/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/node-pre-gyp/node_modules/npmlog/node_modules/gauge/node_modules/strip-ansi/node_modules/ansi-regex/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/node-pre-gyp/node_modules/npmlog/node_modules/gauge/node_modules/object-assign/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/node-pre-gyp/node_modules/npmlog/node_modules/gauge/node_modules/console-control-strings/LICENSE;md5=43abbc6f9093aea69560715033788727 \
                    file://node_modules/node-pre-gyp/node_modules/npmlog/node_modules/gauge/node_modules/wide-align/LICENSE;md5=9d215c9223fbef14a4642cc450e7ed4b \
                    file://node_modules/node-pre-gyp/node_modules/npmlog/node_modules/gauge/node_modules/wide-align/node_modules/string-width/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/node-pre-gyp/node_modules/npmlog/node_modules/gauge/node_modules/wide-align/node_modules/string-width/node_modules/strip-ansi/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/node-pre-gyp/node_modules/npmlog/node_modules/gauge/node_modules/wide-align/node_modules/string-width/node_modules/strip-ansi/node_modules/ansi-regex/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/node-pre-gyp/node_modules/npmlog/node_modules/gauge/node_modules/wide-align/node_modules/string-width/node_modules/code-point-at/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/node-pre-gyp/node_modules/npmlog/node_modules/gauge/node_modules/wide-align/node_modules/string-width/node_modules/is-fullwidth-code-point/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/node-pre-gyp/node_modules/npmlog/node_modules/gauge/node_modules/wide-align/node_modules/string-width/node_modules/is-fullwidth-code-point/node_modules/number-is-nan/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/node-pre-gyp/node_modules/npmlog/node_modules/gauge/node_modules/aproba/LICENSE;md5=9d215c9223fbef14a4642cc450e7ed4b \
                    file://node_modules/node-pre-gyp/node_modules/npmlog/node_modules/gauge/node_modules/has-unicode/LICENSE;md5=2bab5b1c26e9c44fc4e489bb98cfb196 \
                    file://node_modules/node-pre-gyp/node_modules/npmlog/node_modules/gauge/node_modules/string-width/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/node-pre-gyp/node_modules/npmlog/node_modules/gauge/node_modules/string-width/node_modules/strip-ansi/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/node-pre-gyp/node_modules/npmlog/node_modules/gauge/node_modules/string-width/node_modules/strip-ansi/node_modules/ansi-regex/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/node-pre-gyp/node_modules/npmlog/node_modules/gauge/node_modules/string-width/node_modules/code-point-at/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/node-pre-gyp/node_modules/npmlog/node_modules/gauge/node_modules/string-width/node_modules/is-fullwidth-code-point/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/node-pre-gyp/node_modules/npmlog/node_modules/gauge/node_modules/string-width/node_modules/is-fullwidth-code-point/node_modules/number-is-nan/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/node-pre-gyp/node_modules/npmlog/node_modules/console-control-strings/LICENSE;md5=43abbc6f9093aea69560715033788727 \
                    file://node_modules/node-pre-gyp/node_modules/npmlog/node_modules/set-blocking/LICENSE.txt;md5=8fd106383180f7bbb8f534414fdf7d35 \
                    file://node_modules/node-pre-gyp/node_modules/npmlog/node_modules/are-we-there-yet/LICENSE;md5=039a23da29f56411e6d75d7b7bc9de13 \
                    file://node_modules/node-pre-gyp/node_modules/npmlog/node_modules/are-we-there-yet/node_modules/readable-stream/LICENSE;md5=a67a7926e54316d90c14f74f71080977 \
                    file://node_modules/node-pre-gyp/node_modules/npmlog/node_modules/are-we-there-yet/node_modules/readable-stream/node_modules/string_decoder/LICENSE;md5=14af51f8c0a6c6e400b53e18c6e5f85c \
                    file://node_modules/node-pre-gyp/node_modules/npmlog/node_modules/are-we-there-yet/node_modules/readable-stream/node_modules/string_decoder/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/node-pre-gyp/node_modules/npmlog/node_modules/are-we-there-yet/node_modules/readable-stream/node_modules/process-nextick-args/license.md;md5=216769dac98a78ec088ee7cc6fad1dfa \
                    file://node_modules/node-pre-gyp/node_modules/npmlog/node_modules/are-we-there-yet/node_modules/readable-stream/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/node-pre-gyp/node_modules/npmlog/node_modules/are-we-there-yet/node_modules/readable-stream/node_modules/util-deprecate/LICENSE;md5=b7c99ef4b0f3ad9911a52219947f8cf0 \
                    file://node_modules/node-pre-gyp/node_modules/npmlog/node_modules/are-we-there-yet/node_modules/readable-stream/node_modules/core-util-is/LICENSE;md5=6126e36127d20ec0e2f637204a5c68ff \
                    file://node_modules/node-pre-gyp/node_modules/npmlog/node_modules/are-we-there-yet/node_modules/readable-stream/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/node-pre-gyp/node_modules/npmlog/node_modules/are-we-there-yet/node_modules/delegates/License;md5=039225978c07bc42e8c0ef2f72b81c09 \
                    file://node_modules/node-pre-gyp/node_modules/nopt/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/nopt/node_modules/osenv/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/nopt/node_modules/osenv/node_modules/os-homedir/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/node-pre-gyp/node_modules/nopt/node_modules/osenv/node_modules/os-tmpdir/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/node-pre-gyp/node_modules/nopt/node_modules/abbrev/LICENSE;md5=e9c0b639498fbe60d17b10099aba77c0 \
                    file://node_modules/node-pre-gyp/node_modules/mkdirp/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://node_modules/node-pre-gyp/node_modules/mkdirp/node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/LICENSE;md5=bbd174e5c1525a215e2f38ebfcca16e9 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/readable-stream/LICENSE;md5=a67a7926e54316d90c14f74f71080977 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/readable-stream/node_modules/string_decoder/LICENSE;md5=14af51f8c0a6c6e400b53e18c6e5f85c \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/readable-stream/node_modules/string_decoder/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/readable-stream/node_modules/process-nextick-args/license.md;md5=216769dac98a78ec088ee7cc6fad1dfa \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/readable-stream/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/readable-stream/node_modules/util-deprecate/LICENSE;md5=b7c99ef4b0f3ad9911a52219947f8cf0 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/readable-stream/node_modules/core-util-is/LICENSE;md5=6126e36127d20ec0e2f637204a5c68ff \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/readable-stream/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream-ignore/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream-ignore/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream-ignore/node_modules/minimatch/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream-ignore/node_modules/minimatch/node_modules/brace-expansion/LICENSE;md5=a5df515ef062cc3affd8c0ae59c059ec \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream-ignore/node_modules/minimatch/node_modules/brace-expansion/node_modules/balanced-match/LICENSE.md;md5=7fa99ddc3424107350ca6e9a24552085 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream-ignore/node_modules/minimatch/node_modules/brace-expansion/node_modules/concat-map/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream-ignore/node_modules/fstream/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream-ignore/node_modules/fstream/node_modules/mkdirp/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream-ignore/node_modules/fstream/node_modules/mkdirp/node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream-ignore/node_modules/fstream/node_modules/rimraf/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream-ignore/node_modules/fstream/node_modules/rimraf/node_modules/glob/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream-ignore/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/path-is-absolute/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream-ignore/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/inflight/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream-ignore/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/inflight/node_modules/once/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream-ignore/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/inflight/node_modules/once/node_modules/wrappy/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream-ignore/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/inflight/node_modules/wrappy/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream-ignore/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/once/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream-ignore/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/once/node_modules/wrappy/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream-ignore/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream-ignore/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/fs.realpath/LICENSE;md5=062470525c8e380f8567f665ef554d11 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream-ignore/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/minimatch/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream-ignore/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/LICENSE;md5=a5df515ef062cc3affd8c0ae59c059ec \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream-ignore/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/node_modules/balanced-match/LICENSE.md;md5=7fa99ddc3424107350ca6e9a24552085 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream-ignore/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/node_modules/concat-map/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream-ignore/node_modules/fstream/node_modules/graceful-fs/LICENSE;md5=fd63805fd8e3797063b247781e5ee6e4 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream-ignore/node_modules/fstream/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/uid-number/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/once/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/once/node_modules/wrappy/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/rimraf/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/rimraf/node_modules/glob/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/rimraf/node_modules/glob/node_modules/path-is-absolute/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/rimraf/node_modules/glob/node_modules/inflight/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/rimraf/node_modules/glob/node_modules/inflight/node_modules/once/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/rimraf/node_modules/glob/node_modules/inflight/node_modules/once/node_modules/wrappy/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/rimraf/node_modules/glob/node_modules/inflight/node_modules/wrappy/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/rimraf/node_modules/glob/node_modules/once/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/rimraf/node_modules/glob/node_modules/once/node_modules/wrappy/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/rimraf/node_modules/glob/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/rimraf/node_modules/glob/node_modules/fs.realpath/LICENSE;md5=062470525c8e380f8567f665ef554d11 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/rimraf/node_modules/glob/node_modules/minimatch/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/rimraf/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/LICENSE;md5=a5df515ef062cc3affd8c0ae59c059ec \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/rimraf/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/node_modules/balanced-match/LICENSE.md;md5=7fa99ddc3424107350ca6e9a24552085 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/rimraf/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/node_modules/concat-map/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/tar/LICENSE;md5=34c65f5b9b91f31827910d3b54bd6497 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/tar/node_modules/block-stream/LICENCE;md5=c695aba12d799c74e770d90e1c5d59aa \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/tar/node_modules/block-stream/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/tar/node_modules/block-stream/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/tar/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/tar/node_modules/fstream/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/tar/node_modules/fstream/node_modules/mkdirp/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/tar/node_modules/fstream/node_modules/mkdirp/node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/tar/node_modules/fstream/node_modules/rimraf/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/tar/node_modules/fstream/node_modules/rimraf/node_modules/glob/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/tar/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/path-is-absolute/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/tar/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/inflight/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/tar/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/inflight/node_modules/once/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/tar/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/inflight/node_modules/once/node_modules/wrappy/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/tar/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/inflight/node_modules/wrappy/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/tar/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/once/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/tar/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/once/node_modules/wrappy/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/tar/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/tar/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/fs.realpath/LICENSE;md5=062470525c8e380f8567f665ef554d11 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/tar/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/minimatch/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/tar/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/LICENSE;md5=a5df515ef062cc3affd8c0ae59c059ec \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/tar/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/node_modules/balanced-match/LICENSE.md;md5=7fa99ddc3424107350ca6e9a24552085 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/tar/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/node_modules/concat-map/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/tar/node_modules/fstream/node_modules/graceful-fs/LICENSE;md5=fd63805fd8e3797063b247781e5ee6e4 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/tar/node_modules/fstream/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/debug/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream/node_modules/mkdirp/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream/node_modules/mkdirp/node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream/node_modules/rimraf/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream/node_modules/rimraf/node_modules/glob/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/path-is-absolute/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/inflight/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/inflight/node_modules/once/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/inflight/node_modules/once/node_modules/wrappy/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/inflight/node_modules/wrappy/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/once/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/once/node_modules/wrappy/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/fs.realpath/LICENSE;md5=062470525c8e380f8567f665ef554d11 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/minimatch/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/LICENSE;md5=a5df515ef062cc3affd8c0ae59c059ec \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/node_modules/balanced-match/LICENSE.md;md5=7fa99ddc3424107350ca6e9a24552085 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/node_modules/concat-map/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream/node_modules/graceful-fs/LICENSE;md5=fd63805fd8e3797063b247781e5ee6e4 \
                    file://node_modules/node-pre-gyp/node_modules/tar-pack/node_modules/fstream/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/node-pre-gyp/node_modules/semver/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/rimraf/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/rimraf/node_modules/glob/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/rimraf/node_modules/glob/node_modules/path-is-absolute/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/node-pre-gyp/node_modules/rimraf/node_modules/glob/node_modules/inflight/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://node_modules/node-pre-gyp/node_modules/rimraf/node_modules/glob/node_modules/inflight/node_modules/once/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/rimraf/node_modules/glob/node_modules/inflight/node_modules/once/node_modules/wrappy/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/rimraf/node_modules/glob/node_modules/inflight/node_modules/wrappy/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/rimraf/node_modules/glob/node_modules/once/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/rimraf/node_modules/glob/node_modules/once/node_modules/wrappy/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/rimraf/node_modules/glob/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/node-pre-gyp/node_modules/rimraf/node_modules/glob/node_modules/fs.realpath/LICENSE;md5=062470525c8e380f8567f665ef554d11 \
                    file://node_modules/node-pre-gyp/node_modules/rimraf/node_modules/glob/node_modules/minimatch/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/rimraf/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/LICENSE;md5=a5df515ef062cc3affd8c0ae59c059ec \
                    file://node_modules/node-pre-gyp/node_modules/rimraf/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/node_modules/balanced-match/LICENSE.md;md5=7fa99ddc3424107350ca6e9a24552085 \
                    file://node_modules/node-pre-gyp/node_modules/rimraf/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/node_modules/concat-map/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/node-pre-gyp/node_modules/tar/LICENSE;md5=34c65f5b9b91f31827910d3b54bd6497 \
                    file://node_modules/node-pre-gyp/node_modules/tar/node_modules/block-stream/LICENCE;md5=c695aba12d799c74e770d90e1c5d59aa \
                    file://node_modules/node-pre-gyp/node_modules/tar/node_modules/block-stream/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar/node_modules/block-stream/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/node-pre-gyp/node_modules/tar/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/node-pre-gyp/node_modules/tar/node_modules/fstream/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar/node_modules/fstream/node_modules/mkdirp/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://node_modules/node-pre-gyp/node_modules/tar/node_modules/fstream/node_modules/mkdirp/node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/node-pre-gyp/node_modules/tar/node_modules/fstream/node_modules/rimraf/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar/node_modules/fstream/node_modules/rimraf/node_modules/glob/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/path-is-absolute/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/node-pre-gyp/node_modules/tar/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/inflight/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://node_modules/node-pre-gyp/node_modules/tar/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/inflight/node_modules/once/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/inflight/node_modules/once/node_modules/wrappy/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/inflight/node_modules/wrappy/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/once/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/once/node_modules/wrappy/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/node-pre-gyp/node_modules/tar/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/fs.realpath/LICENSE;md5=062470525c8e380f8567f665ef554d11 \
                    file://node_modules/node-pre-gyp/node_modules/tar/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/minimatch/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/LICENSE;md5=a5df515ef062cc3affd8c0ae59c059ec \
                    file://node_modules/node-pre-gyp/node_modules/tar/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/node_modules/balanced-match/LICENSE.md;md5=7fa99ddc3424107350ca6e9a24552085 \
                    file://node_modules/node-pre-gyp/node_modules/tar/node_modules/fstream/node_modules/rimraf/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/node_modules/concat-map/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/node-pre-gyp/node_modules/tar/node_modules/fstream/node_modules/graceful-fs/LICENSE;md5=fd63805fd8e3797063b247781e5ee6e4 \
                    file://node_modules/node-pre-gyp/node_modules/tar/node_modules/fstream/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/node-pre-gyp/node_modules/request/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/forever-agent/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/aws4/LICENSE;md5=ff6f181928a91d8631d565516b4db3cb \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/caseless/LICENSE;md5=e9dadf023ba6ebd98e3e0acb6e2470e3 \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/oauth-sign/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/performance-now/license.txt;md5=a07ae1b6dc33215d89a1281ee71c863c \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/json-stringify-safe/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/har-validator/LICENSE;md5=bfa81591facc9224e4c7451c8dc12958 \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/har-validator/node_modules/ajv/LICENSE;md5=715855234c57d97032971adfc0608a07 \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/har-validator/node_modules/ajv/node_modules/fast-json-stable-stringify/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/har-validator/node_modules/ajv/node_modules/fast-deep-equal/LICENSE;md5=ea87ade09b9e6da4f2e47904a4ee137b \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/har-validator/node_modules/ajv/node_modules/co/LICENSE;md5=1cb994f27906c83d46a3cc6d9e1d8d6c \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/har-validator/node_modules/ajv/node_modules/json-schema-traverse/LICENSE;md5=ea87ade09b9e6da4f2e47904a4ee137b \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/har-validator/node_modules/har-schema/LICENSE;md5=bfa81591facc9224e4c7451c8dc12958 \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/tunnel-agent/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/tunnel-agent/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/form-data/License;md5=7aa505292e2636a9e59d4d3f258f4819 \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/form-data/node_modules/combined-stream/License;md5=5270b4ddb6700d0a820e6d066744589c \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/form-data/node_modules/combined-stream/node_modules/delayed-stream/License;md5=5270b4ddb6700d0a820e6d066744589c \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/form-data/node_modules/asynckit/LICENSE;md5=177bc287fb9558bf3ea50b440c1c86ff \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/form-data/node_modules/mime-types/LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/form-data/node_modules/mime-types/node_modules/mime-db/LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/extend/LICENSE;md5=33d9f7a91df276ec16aa941032ee1476 \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/combined-stream/License;md5=5270b4ddb6700d0a820e6d066744589c \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/combined-stream/node_modules/delayed-stream/License;md5=5270b4ddb6700d0a820e6d066744589c \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/isstream/LICENSE.md;md5=1798150b9d70250c42b55b3530e6af2b \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/is-typedarray/LICENSE.md;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/aws-sign2/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/qs/LICENSE;md5=d5c7c6dc45a33a0a9620ed81315672d7 \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/tough-cookie/LICENSE;md5=ceb9c658d7a5d62bee6628c46832168e \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/tough-cookie/node_modules/punycode/LICENSE-MIT.txt;md5=ee9bd8b835cfcd512dd644540dd96987 \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/http-signature/LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/http-signature/node_modules/jsprim/LICENSE;md5=bc3c23d98d7aa86bbf232058884e19b2 \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/verror/LICENSE;md5=04fce49dd88d841ceb36616ab9789ce0 \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/verror/node_modules/core-util-is/LICENSE;md5=6126e36127d20ec0e2f637204a5c68ff \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/verror/node_modules/extsprintf/LICENSE;md5=bc3c23d98d7aa86bbf232058884e19b2 \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/extsprintf/LICENSE;md5=bc3c23d98d7aa86bbf232058884e19b2 \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/dashdash/LICENSE.txt;md5=ebce61c1a0900d798daaf5853c69ce72 \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/ecc-jsbn/LICENSE;md5=0d289b6d63cbcc18e4b2af9a5bd28b54 \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/ecc-jsbn/node_modules/jsbn/LICENSE;md5=c6ea389b6b52325149beeec27075c5ac \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/ecc-jsbn/lib/LICENSE-jsbn;md5=32052d48bacabd1c02e56c6889082a27 \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/bcrypt-pbkdf/node_modules/tweetnacl/LICENSE;md5=911690f51af322440237a253d695d19f \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/asn1/LICENSE;md5=5ce2f42143c298495637e28e40cd5462 \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/tweetnacl/LICENSE;md5=911690f51af322440237a253d695d19f \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/getpass/LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/jsbn/LICENSE;md5=c6ea389b6b52325149beeec27075c5ac \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/uuid/LICENSE.md;md5=c9420736e23afb538ba5fbe44197f0b4 \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/stringstream/LICENSE.txt;md5=3b3d0996fc07ae2d89c4659b9ffcbe2e \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/mime-types/LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/mime-types/node_modules/mime-db/LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/hawk/LICENSE;md5=aa3dcddf0039666585d9b80574526e38 \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/hawk/node_modules/sntp/LICENSE;md5=4ce2a96fc8315e28c47cc7b470e4ccdb \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/hawk/node_modules/sntp/node_modules/hoek/LICENSE;md5=a670c1b0730654cd87189993221cdf0d \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/hawk/node_modules/boom/LICENSE;md5=ccfa8265c53cf13b063280d0917eb517 \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/hawk/node_modules/boom/node_modules/hoek/LICENSE;md5=a670c1b0730654cd87189993221cdf0d \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/hawk/node_modules/cryptiles/LICENSE;md5=26920e2bf2057e454e3ab72a437e564e \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/hawk/node_modules/cryptiles/node_modules/boom/LICENSE;md5=ccfa8265c53cf13b063280d0917eb517 \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/hawk/node_modules/cryptiles/node_modules/boom/node_modules/hoek/LICENSE;md5=a670c1b0730654cd87189993221cdf0d \
                    file://node_modules/node-pre-gyp/node_modules/request/node_modules/hawk/node_modules/hoek/LICENSE;md5=a670c1b0730654cd87189993221cdf0d \
                    file://node_modules/node-pre-gyp/node_modules/rc/LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1 \
                    file://node_modules/node-pre-gyp/node_modules/rc/LICENSE.MIT;md5=e0f70a42adf526e6f5e605a94d98a420 \
                    file://node_modules/node-pre-gyp/node_modules/rc/LICENSE.BSD;md5=e7a2a325a0069e82aff675bbf74464a0 \
                    file://node_modules/node-pre-gyp/node_modules/rc/node_modules/ini/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/rc/node_modules/strip-json-comments/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/node-pre-gyp/node_modules/rc/node_modules/deep-extend/LICENSE;md5=827bb5781213ff1e9d2fe309bbfc0115 \
                    file://node_modules/node-pre-gyp/node_modules/rc/node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1"

SRC_URI = "npm://registry.npmjs.org;name=bcrypt;version=${PV}"

NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

# Must be set after inherit npm since that itself sets S
S = "${WORKDIR}/npmpkg"
LICENSE_${PN}-nan = "MIT"
LICENSE_${PN}-node-pre-gyp-mkdirp-minimist = "MIT"
LICENSE_${PN}-node-pre-gyp-mkdirp = "MIT"
LICENSE_${PN}-node-pre-gyp-nopt-abbrev = "ISC"
LICENSE_${PN}-node-pre-gyp-nopt-osenv-os-homedir = "MIT"
LICENSE_${PN}-node-pre-gyp-nopt-osenv-os-tmpdir = "MIT"
LICENSE_${PN}-node-pre-gyp-nopt-osenv = "ISC"
LICENSE_${PN}-node-pre-gyp-nopt = "ISC"
LICENSE_${PN}-node-pre-gyp-npmlog-are-we-there-yet-delegates = "MIT"
LICENSE_${PN}-node-pre-gyp-npmlog-are-we-there-yet-readable-stream-core-util-is = "MIT"
LICENSE_${PN}-node-pre-gyp-npmlog-are-we-there-yet-readable-stream-inherits = "ISC"
LICENSE_${PN}-node-pre-gyp-npmlog-are-we-there-yet-readable-stream-isarray = "MIT"
LICENSE_${PN}-node-pre-gyp-npmlog-are-we-there-yet-readable-stream-process-nextick-args = "MIT"
LICENSE_${PN}-node-pre-gyp-npmlog-are-we-there-yet-readable-stream-safe-buffer = "MIT"
LICENSE_${PN}-node-pre-gyp-npmlog-are-we-there-yet-readable-stream-string-decoder-safe-buffer = "MIT"
LICENSE_${PN}-node-pre-gyp-npmlog-are-we-there-yet-readable-stream-string-decoder = "MIT"
LICENSE_${PN}-node-pre-gyp-npmlog-are-we-there-yet-readable-stream-util-deprecate = "MIT"
LICENSE_${PN}-node-pre-gyp-npmlog-are-we-there-yet-readable-stream = "MIT"
LICENSE_${PN}-node-pre-gyp-npmlog-are-we-there-yet = "ISC"
LICENSE_${PN}-node-pre-gyp-npmlog-console-control-strings = "ISC"
LICENSE_${PN}-node-pre-gyp-npmlog-gauge-aproba = "ISC"
LICENSE_${PN}-node-pre-gyp-npmlog-gauge-console-control-strings = "ISC"
LICENSE_${PN}-node-pre-gyp-npmlog-gauge-has-unicode = "ISC"
LICENSE_${PN}-node-pre-gyp-npmlog-gauge-object-assign = "MIT"
LICENSE_${PN}-node-pre-gyp-npmlog-gauge-signal-exit = "ISC"
LICENSE_${PN}-node-pre-gyp-npmlog-gauge-string-width-code-point-at = "MIT"
LICENSE_${PN}-node-pre-gyp-npmlog-gauge-string-width-is-fullwidth-code-point-number-is-nan = "MIT"
LICENSE_${PN}-node-pre-gyp-npmlog-gauge-string-width-is-fullwidth-code-point = "MIT"
LICENSE_${PN}-node-pre-gyp-npmlog-gauge-string-width-strip-ansi-ansi-regex = "MIT"
LICENSE_${PN}-node-pre-gyp-npmlog-gauge-string-width-strip-ansi = "MIT"
LICENSE_${PN}-node-pre-gyp-npmlog-gauge-string-width = "MIT"
LICENSE_${PN}-node-pre-gyp-npmlog-gauge-strip-ansi-ansi-regex = "MIT"
LICENSE_${PN}-node-pre-gyp-npmlog-gauge-strip-ansi = "MIT"
LICENSE_${PN}-node-pre-gyp-npmlog-gauge-wide-align-string-width-code-point-at = "MIT"
LICENSE_${PN}-node-pre-gyp-npmlog-gauge-wide-align-string-width-is-fullwidth-code-point-number-is-nan = "MIT"
LICENSE_${PN}-node-pre-gyp-npmlog-gauge-wide-align-string-width-is-fullwidth-code-point = "MIT"
LICENSE_${PN}-node-pre-gyp-npmlog-gauge-wide-align-string-width-strip-ansi-ansi-regex = "MIT"
LICENSE_${PN}-node-pre-gyp-npmlog-gauge-wide-align-string-width-strip-ansi = "MIT"
LICENSE_${PN}-node-pre-gyp-npmlog-gauge-wide-align-string-width = "MIT"
LICENSE_${PN}-node-pre-gyp-npmlog-gauge-wide-align = "ISC"
LICENSE_${PN}-node-pre-gyp-npmlog-gauge = "ISC"
LICENSE_${PN}-node-pre-gyp-npmlog-set-blocking = "ISC"
LICENSE_${PN}-node-pre-gyp-npmlog = "ISC"
LICENSE_${PN}-node-pre-gyp-rc-deep-extend = "MIT"
LICENSE_${PN}-node-pre-gyp-rc-ini = "ISC"
LICENSE_${PN}-node-pre-gyp-rc-minimist = "MIT"
LICENSE_${PN}-node-pre-gyp-rc-strip-json-comments = "MIT"
LICENSE_${PN}-node-pre-gyp-rc = "Unknown MIT"
LICENSE_${PN}-node-pre-gyp-request-aws-sign2 = "Apache-2.0"
LICENSE_${PN}-node-pre-gyp-request-aws4 = "MIT"
LICENSE_${PN}-node-pre-gyp-request-caseless = "Apache-2.0"
LICENSE_${PN}-node-pre-gyp-request-combined-stream-delayed-stream = "MIT"
LICENSE_${PN}-node-pre-gyp-request-combined-stream = "MIT"
LICENSE_${PN}-node-pre-gyp-request-extend = "MIT"
LICENSE_${PN}-node-pre-gyp-request-forever-agent = "Apache-2.0"
LICENSE_${PN}-node-pre-gyp-request-form-data-asynckit = "MIT"
LICENSE_${PN}-node-pre-gyp-request-form-data-combined-stream-delayed-stream = "MIT"
LICENSE_${PN}-node-pre-gyp-request-form-data-combined-stream = "MIT"
LICENSE_${PN}-node-pre-gyp-request-form-data-mime-types-mime-db = "MIT"
LICENSE_${PN}-node-pre-gyp-request-form-data-mime-types = "MIT"
LICENSE_${PN}-node-pre-gyp-request-form-data = "MIT"
LICENSE_${PN}-node-pre-gyp-request-har-validator-ajv-co = "MIT"
LICENSE_${PN}-node-pre-gyp-request-har-validator-ajv-fast-deep-equal = "MIT"
LICENSE_${PN}-node-pre-gyp-request-har-validator-ajv-fast-json-stable-stringify = "MIT"
LICENSE_${PN}-node-pre-gyp-request-har-validator-ajv-json-schema-traverse = "MIT"
LICENSE_${PN}-node-pre-gyp-request-har-validator-ajv = "MIT"
LICENSE_${PN}-node-pre-gyp-request-har-validator-har-schema = "ISC"
LICENSE_${PN}-node-pre-gyp-request-har-validator = "ISC"
LICENSE_${PN}-node-pre-gyp-request-hawk-boom-hoek = "BSD-3-Clause"
LICENSE_${PN}-node-pre-gyp-request-hawk-boom = "BSD-3-Clause"
LICENSE_${PN}-node-pre-gyp-request-hawk-cryptiles-boom-hoek = "BSD-3-Clause"
LICENSE_${PN}-node-pre-gyp-request-hawk-cryptiles-boom = "BSD-3-Clause"
LICENSE_${PN}-node-pre-gyp-request-hawk-cryptiles = "BSD-3-Clause"
LICENSE_${PN}-node-pre-gyp-request-hawk-hoek = "BSD-3-Clause"
LICENSE_${PN}-node-pre-gyp-request-hawk-sntp-hoek = "BSD-3-Clause"
LICENSE_${PN}-node-pre-gyp-request-hawk-sntp = "BSD-3-Clause"
LICENSE_${PN}-node-pre-gyp-request-hawk = "BSD-3-Clause"
LICENSE_${PN}-node-pre-gyp-request-http-signature-assert-plus = "MIT"
LICENSE_${PN}-node-pre-gyp-request-http-signature-jsprim-assert-plus = "MIT"
LICENSE_${PN}-node-pre-gyp-request-http-signature-jsprim-extsprintf = "MIT"
LICENSE_${PN}-node-pre-gyp-request-http-signature-jsprim-json-schema = "Unknown"
LICENSE_${PN}-node-pre-gyp-request-http-signature-jsprim-verror-assert-plus = "MIT"
LICENSE_${PN}-node-pre-gyp-request-http-signature-jsprim-verror-core-util-is = "MIT"
LICENSE_${PN}-node-pre-gyp-request-http-signature-jsprim-verror-extsprintf = "MIT"
LICENSE_${PN}-node-pre-gyp-request-http-signature-jsprim-verror = "MIT"
LICENSE_${PN}-node-pre-gyp-request-http-signature-jsprim = "MIT"
LICENSE_${PN}-node-pre-gyp-request-http-signature-sshpk-asn1 = "MIT"
LICENSE_${PN}-node-pre-gyp-request-http-signature-sshpk-assert-plus = "MIT"
LICENSE_${PN}-node-pre-gyp-request-http-signature-sshpk-bcrypt-pbkdf-tweetnacl = "Unlicense"
LICENSE_${PN}-node-pre-gyp-request-http-signature-sshpk-bcrypt-pbkdf = "BSD-3-Clause"
LICENSE_${PN}-node-pre-gyp-request-http-signature-sshpk-dashdash-assert-plus = "MIT"
LICENSE_${PN}-node-pre-gyp-request-http-signature-sshpk-dashdash = "MIT"
LICENSE_${PN}-node-pre-gyp-request-http-signature-sshpk-ecc-jsbn-jsbn = "MIT"
LICENSE_${PN}-node-pre-gyp-request-http-signature-sshpk-ecc-jsbn = "MIT Unknown"
LICENSE_${PN}-node-pre-gyp-request-http-signature-sshpk-getpass-assert-plus = "MIT"
LICENSE_${PN}-node-pre-gyp-request-http-signature-sshpk-getpass = "MIT"
LICENSE_${PN}-node-pre-gyp-request-http-signature-sshpk-jsbn = "MIT"
LICENSE_${PN}-node-pre-gyp-request-http-signature-sshpk-tweetnacl = "Unlicense"
LICENSE_${PN}-node-pre-gyp-request-http-signature-sshpk = "MIT"
LICENSE_${PN}-node-pre-gyp-request-http-signature = "MIT"
LICENSE_${PN}-node-pre-gyp-request-is-typedarray = "MIT"
LICENSE_${PN}-node-pre-gyp-request-isstream = "MIT"
LICENSE_${PN}-node-pre-gyp-request-json-stringify-safe = "ISC"
LICENSE_${PN}-node-pre-gyp-request-mime-types-mime-db = "MIT"
LICENSE_${PN}-node-pre-gyp-request-mime-types = "MIT"
LICENSE_${PN}-node-pre-gyp-request-oauth-sign = "Apache-2.0"
LICENSE_${PN}-node-pre-gyp-request-performance-now = "MIT"
LICENSE_${PN}-node-pre-gyp-request-qs = "BSD-3-Clause"
LICENSE_${PN}-node-pre-gyp-request-safe-buffer = "MIT"
LICENSE_${PN}-node-pre-gyp-request-stringstream = "MIT"
LICENSE_${PN}-node-pre-gyp-request-tough-cookie-punycode = "MIT"
LICENSE_${PN}-node-pre-gyp-request-tough-cookie = "BSD-3-Clause"
LICENSE_${PN}-node-pre-gyp-request-tunnel-agent-safe-buffer = "MIT"
LICENSE_${PN}-node-pre-gyp-request-tunnel-agent = "Apache-2.0"
LICENSE_${PN}-node-pre-gyp-request-uuid = "MIT"
LICENSE_${PN}-node-pre-gyp-request = "Apache-2.0"
LICENSE_${PN}-node-pre-gyp-rimraf-glob-fs.realpath = "ISC"
LICENSE_${PN}-node-pre-gyp-rimraf-glob-inflight-once-wrappy = "ISC"
LICENSE_${PN}-node-pre-gyp-rimraf-glob-inflight-once = "ISC"
LICENSE_${PN}-node-pre-gyp-rimraf-glob-inflight-wrappy = "ISC"
LICENSE_${PN}-node-pre-gyp-rimraf-glob-inflight = "ISC"
LICENSE_${PN}-node-pre-gyp-rimraf-glob-inherits = "ISC"
LICENSE_${PN}-node-pre-gyp-rimraf-glob-minimatch-brace-expansion-balanced-match = "MIT"
LICENSE_${PN}-node-pre-gyp-rimraf-glob-minimatch-brace-expansion-concat-map = "MIT"
LICENSE_${PN}-node-pre-gyp-rimraf-glob-minimatch-brace-expansion = "MIT"
LICENSE_${PN}-node-pre-gyp-rimraf-glob-minimatch = "ISC"
LICENSE_${PN}-node-pre-gyp-rimraf-glob-once-wrappy = "ISC"
LICENSE_${PN}-node-pre-gyp-rimraf-glob-once = "ISC"
LICENSE_${PN}-node-pre-gyp-rimraf-glob-path-is-absolute = "MIT"
LICENSE_${PN}-node-pre-gyp-rimraf-glob = "ISC"
LICENSE_${PN}-node-pre-gyp-rimraf = "ISC"
LICENSE_${PN}-node-pre-gyp-semver = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-block-stream-inherits = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-block-stream = "Unknown ISC"
LICENSE_${PN}-node-pre-gyp-tar-fstream-graceful-fs = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-fstream-inherits = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-fstream-mkdirp-minimist = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-fstream-mkdirp = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-fstream-rimraf-glob-fs.realpath = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-fstream-rimraf-glob-inflight-once-wrappy = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-fstream-rimraf-glob-inflight-once = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-fstream-rimraf-glob-inflight-wrappy = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-fstream-rimraf-glob-inflight = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-fstream-rimraf-glob-inherits = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-fstream-rimraf-glob-minimatch-brace-expansion-balanced-match = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-fstream-rimraf-glob-minimatch-brace-expansion-concat-map = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-fstream-rimraf-glob-minimatch-brace-expansion = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-fstream-rimraf-glob-minimatch = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-fstream-rimraf-glob-once-wrappy = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-fstream-rimraf-glob-once = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-fstream-rimraf-glob-path-is-absolute = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-fstream-rimraf-glob = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-fstream-rimraf = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-fstream = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-inherits = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-debug-ms = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-debug = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-graceful-fs = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-ignore-fstream-graceful-fs = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-ignore-fstream-inherits = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-ignore-fstream-mkdirp-minimist = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-ignore-fstream-mkdirp = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-ignore-fstream-rimraf-glob-fs.realpath = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-ignore-fstream-rimraf-glob-inflight-once-wrappy = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-ignore-fstream-rimraf-glob-inflight-once = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-ignore-fstream-rimraf-glob-inflight-wrappy = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-ignore-fstream-rimraf-glob-inflight = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-ignore-fstream-rimraf-glob-inherits = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-ignore-fstream-rimraf-glob-minimatch-brace-expansion-balanced-match = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-ignore-fstream-rimraf-glob-minimatch-brace-expansion-concat-map = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-ignore-fstream-rimraf-glob-minimatch-brace-expansion = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-ignore-fstream-rimraf-glob-minimatch = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-ignore-fstream-rimraf-glob-once-wrappy = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-ignore-fstream-rimraf-glob-once = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-ignore-fstream-rimraf-glob-path-is-absolute = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-ignore-fstream-rimraf-glob = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-ignore-fstream-rimraf = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-ignore-fstream = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-ignore-inherits = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-ignore-minimatch-brace-expansion-balanced-match = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-ignore-minimatch-brace-expansion-concat-map = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-ignore-minimatch-brace-expansion = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-ignore-minimatch = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-ignore = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-inherits = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-mkdirp-minimist = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-mkdirp = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-rimraf-glob-fs.realpath = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-rimraf-glob-inflight-once-wrappy = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-rimraf-glob-inflight-once = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-rimraf-glob-inflight-wrappy = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-rimraf-glob-inflight = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-rimraf-glob-inherits = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-rimraf-glob-minimatch-brace-expansion-balanced-match = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-rimraf-glob-minimatch-brace-expansion-concat-map = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-rimraf-glob-minimatch-brace-expansion = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-rimraf-glob-minimatch = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-rimraf-glob-once-wrappy = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-rimraf-glob-once = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-rimraf-glob-path-is-absolute = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-rimraf-glob = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream-rimraf = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-fstream = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-once-wrappy = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-once = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-readable-stream-core-util-is = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-readable-stream-inherits = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-readable-stream-isarray = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-readable-stream-process-nextick-args = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-readable-stream-safe-buffer = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-readable-stream-string-decoder-safe-buffer = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-readable-stream-string-decoder = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-readable-stream-util-deprecate = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-readable-stream = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-rimraf-glob-fs.realpath = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-rimraf-glob-inflight-once-wrappy = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-rimraf-glob-inflight-once = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-rimraf-glob-inflight-wrappy = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-rimraf-glob-inflight = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-rimraf-glob-inherits = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-rimraf-glob-minimatch-brace-expansion-balanced-match = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-rimraf-glob-minimatch-brace-expansion-concat-map = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-rimraf-glob-minimatch-brace-expansion = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-rimraf-glob-minimatch = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-rimraf-glob-once-wrappy = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-rimraf-glob-once = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-rimraf-glob-path-is-absolute = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-rimraf-glob = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-rimraf = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-tar-block-stream-inherits = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-tar-block-stream = "Unknown ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-tar-fstream-graceful-fs = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-tar-fstream-inherits = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-tar-fstream-mkdirp-minimist = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-tar-fstream-mkdirp = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-tar-fstream-rimraf-glob-fs.realpath = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-tar-fstream-rimraf-glob-inflight-once-wrappy = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-tar-fstream-rimraf-glob-inflight-once = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-tar-fstream-rimraf-glob-inflight-wrappy = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-tar-fstream-rimraf-glob-inflight = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-tar-fstream-rimraf-glob-inherits = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-tar-fstream-rimraf-glob-minimatch-brace-expansion-balanced-match = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-tar-fstream-rimraf-glob-minimatch-brace-expansion-concat-map = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-tar-fstream-rimraf-glob-minimatch-brace-expansion = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-tar-fstream-rimraf-glob-minimatch = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-tar-fstream-rimraf-glob-once-wrappy = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-tar-fstream-rimraf-glob-once = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-tar-fstream-rimraf-glob-path-is-absolute = "MIT"
LICENSE_${PN}-node-pre-gyp-tar-pack-tar-fstream-rimraf-glob = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-tar-fstream-rimraf = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-tar-fstream = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-tar-inherits = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-tar = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack-uid-number = "ISC"
LICENSE_${PN}-node-pre-gyp-tar-pack = "BSD-2-Clause"
LICENSE_${PN}-node-pre-gyp-tar = "ISC"
LICENSE_${PN}-node-pre-gyp = "BSD-3-Clause"
LICENSE_${PN} = "MIT"


