---
layout: documentation
title: QNAP NAS
---

{% include base.html %}

# QNAP NAS

The [QNAP NAS](https://www.qnap.com) is a NAS server solution for your home, allowing the installation of additional packages.
Download the latest openHAB package for QNAP from [here](https://github.com/openhab/openhab-qnap-qpkg).

![AppCenter enabled](https://github.com/openhab/openhab-qnap-qpkg/raw/master/docs/QTS_4.2.0_AppCenter%20enabled.png)

## How to install
1. Download the QPKG from the [releases section over on GitHub](https://github.com/openhab/openhab-qnap-qpkg/releases).

2. Create a directory for your addons, configurations and userdata, by

  1. Creating a share called "openHAB2" (recommended)
  2. Creating folder called "openHAB2" in "Public" share
  3. Not creating any of them and therefore using ".qpkg/openHAB2/distribution" for all data (for testing or demonstration)

3. Go to your NAS's App Center and make sure you have got "JRE" (for x86) or "JRE_ARM" (for ARM) installed. You can find the application via search function or under the category "Developer Tools".

4. Wait for a while until the Java installation has finished.

5. Open the "Install manually" dialog and choose the qpkg you have downloaded

  ![AppCenter choose](https://github.com/openhab/openhab-qnap-qpkg/raw/master/docs/QTS_4.2.0_AppCenter%20choose.png)

6. Confirm the installation 

  ![AppCenter confirm](https://github.com/openhab/openhab-qnap-qpkg/raw/master/docs/QTS_4.2.0_AppCenter%20confirm.png)

7. Wait while the package is being installed

  ![AppCenter installing](https://github.com/openhab/openhab-qnap-qpkg/raw/master/docs/QTS_4.2.0_AppCenter%20installing.png)

8. When finished just close the dialog and wait for a while until openHAB has completly started.

  ![AppCenter finished](https://github.com/openhab/openhab-qnap-qpkg/raw/master/docs/QTS_4.2.0_AppCenter%20finished.png)

9. Access openHAB via [http://NAS_IP_or_DNS_address:8090](#)

## How to uninstall
1. Go to the "App Center" and remove the app like any other.
2. If wanted/needed also remove "addons", "conf" and "userdata" from the your directory, eg. "openHAB2" share or "Public"/openHAB2
  * _REMEMBER_: If you have installed openHAB2 to ".qpkg" (see "How to install", section 2.3) then all files get removed directly!

## Known issues
* Please check our issue tracker: https://github.com/openhab/openhab-distro/issues
