---
layout: documentation
title: QNAP NAS
---

:::

# QNAP NAS

[QNAP NAS](https://www.qnap.com/en) is a famous NAS server solution for home and business, allowing the installation of additional packages.

## Prerequisite - X86_64 or ARM64 platform

You need to install openHAB from [here](https://www.myqnap.org/product/openhab/). It contains the latest stable OH version and Zulu17 JDK.

The easyest way is to [install the MyQNAP repo](https://www.myqnap.org/install-the-repo/) and install openHAB from there so that updates are shown when published.

QNAP NAS is based on Linux but it has limitations since it is not a full server. Therefore it is recommended to use [WinSCP](https://winscp.net/eng/index.php) to access `userdata`, `addons` and `conf` folders, etc.

:::tip USB dongles

USB dongles may work (or not). If not you may install [USB serial drivers](https://www.myqnap.org/product/usb-serial-drivers/) (preferrably from the MyQNAP repo)

### Mosquitto

You can find it in the MyQNAP repo.

### Node-Red

You can find it in the MyQNAP repo.

