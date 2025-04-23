DESCRIPTION = "Flutter-pi is a light-weight Flutter embedder for Raspberry Pi and other Linux systems."
HOMEPAGE = "https://github.com/ardera/flutter-pi"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=49fada46694956cdf2fc0292d72d888c"

SRCREV = "master"
SRC_URI = "git://github.com/ardera/flutter-pi.git;protocol=https;branch=main"

S = "${WORKDIR}/git"

DEPENDS = "wayland libxkbcommon mesa"

inherit cmake pkgconfig

EXTRA_OECMAKE = "-DFLUTTER_RUNTIME_PATH=/usr/share/flutter/agl_quiz_app/3.27.1/release"

do_install:append() {
    install -d ${D}${bindir}
    install -m 0755 ${B}/flutter-pi ${D}${bindir}/flutter-pi
}
