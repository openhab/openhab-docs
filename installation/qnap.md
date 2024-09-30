---
layout: documentation
title: QNAP NAS
---

:::

# QNAP NAS

[QNAP NAS](https://www.qnap.com/en) is a famous NAS server solution for home and business, allowing the installation of additional packages.

## Prerequisite - X86_64 or ARM64 platform

You need to install openHAB from [here](https://www.myqnap.org/product/openhab/). It contains the latest stable OH version and Zulu17 JDK.

The easyest way is to install the [MyQNAP repo](https://www.myqnap.org/install-the-repo/) and install openHAB from there so that updates are shown when published.

QNAP NAS is based on Linux but it has limitations since it is not a full server. Therefore it is recommended to use [WinSCP](https://winscp.net/eng/index.php) to access `userdata`, `addons` and `conf` folders, etc.

### USB dongles

USB dongles may work (or not). QTS (QNAP's operating system) may not include drivers, but you can install [USB serial drivers](https://www.myqnap.org/product/usb-serial-drivers/) (preferrably from MyQNAP repo), maybe it will include missing drivers for the dongle.

### Other interesting packages in MyQNAP repo

- Mosquitto (needs parametrization after install)
- NodeJS v22 (required by zigbee2mqtt)
- QGit (required to install / update zigbee2mqtt)
- Node Red
- FFMpeg (complement to `IP Camera` binding)
- QPython312 (required by `HABApp`)
- UniFi (complement to `UniFi` binding)
