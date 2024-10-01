---
layout: documentation
title: QNAP NAS
---

:::

# QNAP NAS

[QNAP NAS](https://www.qnap.com/en) is a server solution for home and business, allowing the installation of additional packages.

## Prerequisite - X86_64 or ARM64 platform

You need to install openHAB from [here](https://www.myqnap.org/product/openhab/). It contains the latest stable OH version and Zulu17 JDK.

The easiest way is to install the [MyQNAP repo](https://www.myqnap.org/install-the-repo/) and install openHAB from there so that updates are shown when published.

QNAP NAS is based on Linux but it has limitations since it is not a full server. Therefore, it is recommended to use [WinSCP](https://winscp.net/eng/index.php) to access `userdata`, `addons` and `conf` folders, etc.

### USB dongles

USB dongles may or may not work as QTS (QNAP's operating system) might not include the necessary drivers. However, you can install [USB serial drivers](https://www.myqnap.org/product/usb-serial-drivers/) (preferrably from MyQNAP repo), maybe it will include missing drivers for the dongle.

### Manual update

The MyQNAP repo does not contain milestone versions and may not contain the latest openHAB stable version. In some situations you may prefer to update openHAB manually:

- Stop openhab (using "App Center")
- Navigate to OpenHab3 folder (physical address may be /share/CACHEDEV3_DATA/.qpkg/OpenHab3 but this depends on your install)
- delete folder runtime
- inside folder userdata, delete folders cache, etc, and tmp
- Download the desired openHAB version from github (zip file)
- Unzip and copy to OpenHab3 folder
- Give runtime/bin/karaf and runtime/bin/backup X permission (using F9 in WinSCP)
- Edit /etc/config/qpkg.conf to specify the installed version (also update install `Build` to avoid automatic updates)
- Start openhab (using "App Center")

### Other interesting packages provided by the MyQNAP repo

- Mosquitto (needs configuration after install)
- NodeJS v22 (required by zigbee2mqtt)
- QGit (required to install / update zigbee2mqtt)
- Node Red
- FFMpeg (complement to `IP Camera` binding)
- QPython312 (required by `HABApp`)
- UniFi (complement to `UniFi` binding)
