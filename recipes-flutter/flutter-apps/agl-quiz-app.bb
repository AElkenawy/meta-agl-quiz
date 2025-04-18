SUMMARY = "AGL Quiz App - Flutter demo application"
DESCRIPTION = "A simple quiz app using Flutter for AGL"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRCREV = "e1eba15a18004b57aa74a3b5ad6d684d668b83e9"
SRC_URI = "git://github.com/AElkenawy/agl-quiz-app.git;branch=main;protocol=https"
SRC_URI[sha256sum] = "d99a55bb2a264d779fcf4255aa58f6e24b8cd282ff36a64ff20664d61b286417"
S = "${WORKDIR}/git"
#S = "${WORKDIR}/agl_quiz_app"

export LDFLAGS="-Wl,--hash-style=gnu"


SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

#DEPENDS += "flutter-sdk"

inherit flutter-app

#FLUTTER_APPLICATION_PATH = "${S}"

PUBSPEC_APPNAME = "agl_quiz_app"
FLUTTER_BUILD_ARGS = "bundle -v"

#FLUTTER_BUILD_TYPE = "linux"
