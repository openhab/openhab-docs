---
layout: documentation
title: Synology DiskStation
---

{% include base.html %}

# Synology DiskStation

The [DiskStation by Synology](https://www.synology.com/en-us/dsm) is a famous NAS server solution for your home, allowing the installation of additional packages.
We are proud to be able to provide an [openHAB Synology package](https://github.com/openhab/openhab-syno-spk).

## Prerequisite - Install Java

Current releases of openHAB require Oracle Java due to the generation of certificates based on [EC](https://en.wikipedia.org/wiki/Elliptic_curve_cryptography) which is not available in free Java implementations. If you see the following error you are likely using OpenJDK:
    java.security.NoSuchAlgorithmException: EC KeyPairGenerator not available

The easiest way to install Java is to include the [PC-Loadletter Repo](http://packages.pcloadletter.co.uk/). Download [Java8 SE](http://www.oracle.com/technetwork/java/embedded/index.html) [(latest ARMv6)](http://www.oracle.com/technetwork/java/embedded/embedded-se/downloads/javase-embedded-downloads-2209751.html) [(Java Cryptography Extension if required)](http://www.oracle.com/technetwork/java/javase/downloads/jce8-download-2133166.html) and put them in the public folder of your NAS. Then start the installation of Java8 SE.

## Installation

Download the latest SPK package: [Releases](https://github.com/openhab/openhab-syno-spk/releases)
The SPK is a wrapper to download the latest openHAB release and does not contain openHAB itself.

1.  Login and open the DiskStation Manager.
2.  Go to Main Menu → Package Center.
3.  Click on the Manual Install button.
4.  Click "Choose File" and select the previously downloaded openHAB `.spk` file.
5.  On the confirmation page: If you would like the package to run immediately after installation, make sure the box next to "Run after Installation" is ticked.
6. Click Apply to start installation.

If your NAS cannot connect to the internet, the installer will tell you to download and place the ZIP file into your NAS public folder.

## Configuration

The configuration files are located at:

```
/volume1/@appstore/openHAB2/userdata/config
```

## Tested Devices

| DiskStation | Package version |
|-------------|-----------------|
| DS209       | [2.0.0-beta3](https://github.com/openhab/openhab-syno-spk/releases/tag/2.0.0-beta3) |
| DS216+II    | [2.0.0-beta3](https://github.com/openhab/openhab-syno-spk/releases/tag/2.0.0-beta3) |
| DS216+II    | [2.0.0.009-SNAPSHOT-DSM6](https://github.com/openhab/openhab-syno-spk/releases/tag/2.0.0.009-SNAPSHOT-DSM6) |
| DS216play   | [2.0.0.001-DSM6](https://github.com/openhab/openhab-syno-spk/releases/tag/2.0.0.001-DSM6) |
| DS916+      | [2.0.0.001-DSM6](https://github.com/openhab/openhab-syno-spk/releases/tag/2.0.0.001-DSM6) |

> Please complete the list accordingly, thank you!
