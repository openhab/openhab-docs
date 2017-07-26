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

The easiest way to install Java is to include the [PC-Loadletter Repo](http://packages.pcloadletter.co.uk/). Download [Java8 SE](http://www.oracle.com/technetwork/java/embedded/index.html) [(latest ARMv6)](http://www.oracle.com/technetwork/java/embedded/embedded-se/downloads/javase-embedded-downloads-2209751.html) [(Java Cryptography Extension if required)](http://www.oracle.com/technetwork/java/javase/downloads/jce8-download-2133166.html) and put them in the public folder of your NAS. Then start the installation of Java8 SE.

The easiest way to install Java is to install the Synology Java8 package from Package Center. After installation, OpenJDK will be used by default and must be upgraded. To upload Oracle JDK to Java8, click the Install Java / Upgrade Java button and then follow the onscreen instructions. The filename and format of the uploaded file will be checked before installation.

**Armada 370/XP** systems running DSM 6 require hard float ABI rather than the soft float used on DSM 5. If there is not a Java8 package in the Package Center, your machine may not be supported by the [Synology package](https://www.synology.com/en-us/dsm/packages/Java8).

The best option for older unsupported Synology models such as **PowerPC** and **ARJava SEM** is to include the *PC-Loadletter* Repo. [Download Java SE](http://tinyurl.com/javaembed) (Java Cryptography Extension if required) and put them in the *public* folder of your NAS. Then start the installation of Java8 SE.

*Note that it may be necessary to rename the downloaded file to match the name the Loadletter utility expects which may be an older version than what is currently available.*

The **Java8 PowerPC** versions are available from [Oracle](http://www.oracle.com/technetwork/java/embedded/embedded-se/downloads/javaseembedded8u6-2406243.html)

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

The location of the configuration files varies depending if a shared folder named public exists. The public folder is created automatically after your Synology NAS is first set up for certain models. The administrator can also create a public shared folder if desired. Synology does not document what models will automatically create a public folder. See [DiskStation Manager - Shared Folder](https://www.synology.com/en-us/knowledgebase/DSM/help/DSM/AdminCenter/file_share_desc)

If a public shared folder exists, the OpenHAB install script will place configuration files are located at:

`/volume1/public/openHAB2/conf/`

If no public shared folder exists, the OpenHAB install script will place configuration files are located at

`/volume1/@appstore/openHAB2/conf/`
