---
layout: documentation
title: Synology DiskStation
---

{% include base.html %}

# Synology DiskStation

The [DiskStation by Synology](https://www.synology.com/en-us/dsm) is a famous NAS server solution for your home, allowing the installation of additional packages.
We are proud to be able to provide an [openHAB Synology package](https://github.com/openhab/openhab-syno-spk).

## Prerequisite - Install Java

Current releases of openHAB require Oracle Java due to the generation of certificates based on [EC](https://en.wikipedia.org/wiki/Elliptic_curve_cryptography) which is not available in free Java implementations.
If you see the following error you are likely using OpenJDK:

```text
java.security.NoSuchAlgorithmException: EC KeyPairGenerator not available
```

The easiest way to install Java is to install the Synology Java8 package from Package Center.
After installation, OpenJDK will be used by default and must be upgraded.
To update Oracle JDK to Java8, click the Install Java / Upgrade Java button and then follow the onscreen instructions.
The filename and format of the uploaded file will be checked before installation.

**Armada 370/XP** systems running DSM 6 require hard float ABI rather than the soft float used on DSM 5.
If there is not a Java8 package in the Package Center, your machine may not be supported by the [Synology package](https://www.synology.com/en-us/dsm/packages/Java8).

The best option for older unsupported Synology models such as **PowerPC** and **ARMv5** is to include the [PC-Loadletter](https://pcloadletter.co.uk/2011/08/23/java-package-for-synology/) Repo.
[Download Java SE](http://www.oracle.com/technetwork/java/embedded/embedded-se/downloads/index.html) [(latest ARMv6)](http://www.oracle.com/technetwork/java/embedded/embedded-se/downloads/javase-embedded-downloads-2209751.html) [(Java Cryptography Extension if required)](http://www.oracle.com/technetwork/java/javase/downloads/jce8-download-2133166.html) and put them in the *public* folder of your NAS.
Then start the installation of Java8 SE.

*Note that it may be necessary to rename the downloaded file to match the name the Loadletter utility expects which may be an older version than what is currently available.*

The **Java8 PowerPC** versions are available from [Oracle](http://www.oracle.com/technetwork/java/embedded/embedded-se/downloads/javaseembedded8u6-2406243.html).

## Installation

Download the latest SPK package: [Releases](https://github.com/openhab/openhab-syno-spk/releases)
The SPK is a wrapper to download the latest openHAB release and does not contain openHAB itself.

1. Login and open the DiskStation Manager.
2. Go to Main Menu → Package Center.
3. Click on the Manual Install button.
4. Click "Choose File" and select the previously downloaded openHAB `.spk` file.
5. On the confirmation page: If you would like the package to run immediately after installation, make sure the box next to "Run after Installation" is ticked.
6. Click Apply to start installation.

If your NAS cannot connect to the internet, the installer will tell you to download and place the ZIP file into your NAS public folder.

## Configuration

The location of configuration files by openHAB differs depending on wether or not a shared folder named `public` exists: 

* with public share folder: `/volume1/public/openHAB2/conf/`
* without public share folder: `/volume1/@appstore/openHAB2/conf/`

For certain Synology models the `public` folder is created automatically during the first setup.
The administrator can also create a public shared folder if desired.

Synology does not document which models will automatically create a public folder.
Refer to the Synology knowlegde base article on [Shared Folder](https://www.synology.com/en-us/knowledgebase/DSM/help/DSM/AdminCenter/file_share_desc) to learn more.
