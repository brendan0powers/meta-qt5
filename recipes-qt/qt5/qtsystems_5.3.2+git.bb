require qt5-git.inc
require ${PN}.inc

# this wasn't released, the PV is set just to signify that this SRCREV was tested together
# with 5.3.2 version of other modules
PV = "5.3.2"
DEFAULT_PREFERENCE = "1"

QT_MODULE_BRANCH = "5.3"

# qtsystems wasn't released yet, last tag before this SRCREV is 5.0.0-beta1
# qt5-git PV is only to indicate that this recipe is compatible with qt5 5.3.2

SRCREV = "aa651c73bf7bc57c1b6b1bfcfa9afe901884a102"
