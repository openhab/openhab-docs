---
layout: documentation
title: QNAP NAS
---

# QNAP NAS

The [QNAP NAS](https://www.qnap.com) is a NAS server solution for your home, allowing the installation of additional packages.
Please find all details about the openHAB package for QNAP [here](https://github.com/openhab/openhab-qnap-qpkg).

## How to install

Check that your NAS has the most recent firmware version.
Follow the instructions shown if a new version is announced when opening the admin GUI.

1. Download the QPKG from the [releases section over on GitHub](https://github.com/openhab/openhab-qnap-qpkg/releases).

1. Create a directory for your addons, configurations and userdata, by either
    - Creating a share called "openHAB" (recommended)
    - Creating a folder called "openHAB" inside the "Public" share
    - Not creating any of them and therefore using `.qpkg/openHAB2/distribution` for all data (for testing or demonstration)

1. Go to your NAS's App Center and make sure you have got "JRE" (for x86-CPU based NAS) or "JRE_ARM" (for ARM-CPU based NAS) installed.
    If that is not the case, go to the "Developer-Tools" section of the App Center, install the appropriate version and wait for a while until the Java installation has finished.

1. Open the "Install manually" dialog in the App Center by clicking the gear-wheel on the upper-right corner of the App Center and choose the `qpkg` you have downloaded.

    ![AppCenter choose](https://raw.githubusercontent.com/openhab/openhab-qnap-qpkg/main/docs/QTS_4.2.0_AppCenter%20choose.png)

1. Confirm the installation

    ![AppCenter confirm](https://raw.githubusercontent.com/openhab/openhab-qnap-qpkg/main/docs/QTS_4.2.0_AppCenter%20confirm.png)

1. Wait while the package is being installed

1. When finished just close the dialog and wait for a while until openHAB has completely started.
    This may take several minutes.

    ![AppCenter finished](https://raw.githubusercontent.com/openhab/openhab-qnap-qpkg/main/docs/QTS_4.2.0_AppCenter%20finished.png)

1. Access openHAB via `http://NAS_IP_or_DNS_address:8090`.
    If the interface does not start, retry after another minute.
    The initial startup takes some time.

## How to uninstall

If you want to keep configuration files, copy them to a save place outside of the openhab-path.

1. Go to the "App Center" and remove the app like any other.

1. Additionally if wanted or needed, please remove the folders "addons", "conf" and "userdata" from the your directory, eg. "openHAB2" share or "Public"/openHAB2
   If you have installed openHAB2 to `.qpkg` (see "How to install", third option) then all files get removed automatically.

## Known issues

- Please check our issue tracker: [https://github.com/openhab/openhab-qnap-qpkg/issues](https://github.com/openhab/openhab-qnap-qpkg/issues)
