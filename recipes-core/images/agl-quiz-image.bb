require recipes-core/images/core-image-minimal.bb

DESCRIPTION = "Minimal AGL image with the Flutter Quiz App"

IMAGE_INSTALL += "agl-quiz-app"
IMAGE_INSTALL += "flutter-pi"
