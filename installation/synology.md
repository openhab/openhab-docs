---
layout: documentation
title: Synology DiskStation
---

{% include base.html %}

# Synology DiskStation

The [DiskStation by Synology](https://www.synology.com/en-us/dsm) is a famous NAS server solution for your home, allowing the installation of additional packages.
We are proud to be able to provide an [openHAB Synology package](https://github.com/openhab/openhab-syno-spk).

Download the latest SPK package:
[Releases](https://github.com/openhab/openhab-syno-spk/releases)

## Installation

1.  Login and open the DiskStation Manager.
2.  Go to Main Menu → Package Center.
3.  Click on the Manual Install button.
4.  Click "Choose File" and select the previously downloaded openHAB `.spk` file.
5.  On the confirmation page: If you would like the package to run immediately after installation, make sure the box next to "Run after Installation" is ticked.
6. Click Apply to start installation.

## Configuration

The configuration files are located at:

```
/volume1/public/OpenHAB2/conf
```

## Tested devices

| DiskStation | Package version |
|-------------|-----------------|
| DS101j      | [1.8.3](https://github.com/openhab/openhab-syno-spk/releases/tag/1.8.3) |
| DS209       | [1.8.3](https://github.com/openhab/openhab-syno-spk/releases/tag/1.8.3) or [2.0.0-beta3](https://github.com/openhab/openhab-syno-spk/releases/tag/2.0.0-beta3) |
| DS216+II    | [2.0.0-beta3](https://github.com/openhab/openhab-syno-spk/releases/tag/2.0.0-beta3) |

> Please complete the list accordingly, thank you!
