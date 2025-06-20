---
layout: documentation
title: Installation Overview
---

# Installation Overview

openHAB is written completely in Java.
As such, it only depends on a Java Virtual Machine (JVM), which is available for most platforms.
openHAB can be run on different versions of **macOS** and **Windows** and many different variants of **Linux** (Ubuntu, Raspberry Pi OS, etc.).

Please be aware of the fact that openHAB is continuously updated and improved.
Therefore, tutorials and help you may find on the Internet for it **may** be outdated!
Always keep this in mind when searching for help and solutions.

## Platform Recommendations

1. You are **new to openHAB** and just want to give it a try?
    - Set up openHAB on your local PC or Mac in just a few steps _or_
    - use a Raspberry Pi with [openHABian](openhabian.html)

1. You've gained some experience and want to use openHAB to seriously control your home?
    Typical hardware and software requirements are:
    - **24/7 availability:** A dedicated system connected by Ethernet and running continuously.
    - **Energy and space efficient:** A device capable of performing the task at hand without being excessive for your needs.
    - **Extendibility:** Your system should be capable of running additional software like an MQTT broker or persistence and graphing software.
    - **Peripherals:** Depending on your home automation hardware, you may need the ability to connect additional peripheral devices such as a WiFi interface or a special USB radio module.

Many devices are suited to host a continuous installation of openHAB.
Experiences with different devices and environments can be found in the [community forum hardware section](https://community.openhab.org/c/hardware/server).

We recommend to get a dedicated Raspberry Pi 4 (or newer) and to use [openHABian](openhabian.html) for quick setup.
openHABian is also available to kickstart your openHAB experience on existing Debian x86 based Linux systems.

## Prerequisites

Make sure that you have an up to date **64-bit** OS with **Java 21** JVM platform installed on your host system.
We recommended to use the openjdk package that comes with your Linux distribution.
If in doubt, explicitly install a JVM based on OpenJDK.

If your operating system does not include a **Java 21** JVM platform in its package repositories, we recommend installing the [Eclipse Temurin](https://adoptium.net/temurin/releases/?os=any&arch=any&version=21) JDK instead.
The [Azul Zulu](https://www.azul.com/downloads/?version=java-21-lts&package=jdk#zulu) JDK is a good alternative if you need a JVM compatible with older operating systems.
Oracle Java is also suitable for most configurations, but it is not recommended due to potential licensing restrictions.

| Java Platform                                                                        | Advantages                                                                                                                                                         | Disadvantages                                                                                                                                                                                                                                                                                                 |
|--------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Eclipse Temurin](https://adoptium.net/temurin/releases/?os=any&arch=any&version=21) | Open Source JDK backed by many large companies                                                                                                                     |                                                                                                                                                                                                                                                                                                               |
| [Azul Zulu](https://www.azul.com/downloads/?version=java-21-lts&package=jdk#zulu)    | Open source, fully certified Java SE compliant build of OpenJDK, embedded version optimized for ARM devices [available here](https://www.azul.com/downloads/#zulu) |                                                                                                                                                                                                                                                                                                               |
| [Oracle Java](https://java.com/en/)                                                  | Full openHAB support on all platforms                                                                                                                              | [Licensing restrictions](https://www.infoq.com/news/2016/03/docker-java/), manual installation required on many Linux systems: [Ubuntu](https://help.ubuntu.com/community/Java), [Mint](https://community.linuxmint.com/tutorial/view/1091), and [Debian](https://wiki.debian.org/Java/Sun) are some examples |

Please download and install the **64-bit version** of the **Java 21** version of the JVM.

Check your current Java version by opening a command line console and typing `java -version`:

```text
openjdk version "21.0.7" 2025-04-15 LTS
OpenJDK Runtime Environment Temurin-21.0.7+6 (build 21.0.7+6-LTS)
OpenJDK 64-Bit Server VM Temurin-21.0.7+6 (build 21.0.7+6-LTS, mixed mode, sharing)
```

## Setup variants

Before you can start, two decisions have to be made:

1. openHAB is available as a platform independent archive file or through a package repository:
    - **Manual setup:** Download and extract a platform independent zip archive: [macOS](macos.html), [Windows](windows.html), [Linux](linux.html#manual-installation)
    - **Package setup:** Install from a package repository, using a package manager such as apt or yum.
    This option is only available for certain Linux distributions such as Debian or Ubuntu derivatives, but allows you to take advantage of automatic updates and is the recommended choice: [Linux (apt/deb)](linux.html#package-repository-installation)

1. Stable release or cutting edge:
    - **Stable:** Use the latest official release [hosted on github](https://github.com/openhab/openhab-distro/releases/) (recommended for new users).
    - **Snapshot:** Benefit from the latest changes in the daily created snapshot ([hosted on openhab.org](https://ci.openhab.org/)).

## Installation

Please follow the instructions in the installation article matching your platform (see the menu to the left).

### Getting installation info

For many actions you need to know the pathes where openHAB checks for files, or where you need to install additional packages.
To find out where these locations are, e.g. where `$OPENHAB_CONF` points to, use the [console](https://www.openhab.org/docs/administration/console.html):

```shell
openhab-cli info
```

will result in e.g. for an [openHABian](https://www.openhab.org/docs/installation/openhabian.html) installation

```shell
Version:     5.0.0 (Build)

User:        openhab (Active Process 7466)
User Groups: openhab tty dialout audio bluetooth gpio

Directories: Folder Name      | Path                        | User:Group
             -----------      | ----                        | ----------
             OPENHAB_HOME     | /usr/share/openhab          | openhab:openhab
             OPENHAB_RUNTIME  | /usr/share/openhab/runtime  | openhab:openhab
             OPENHAB_USERDATA | /var/lib/openhab            | openhab:openhab
             OPENHAB_CONF     | /etc/openhab                | openhab:openhab
             OPENHAB_LOGDIR   | /var/log/openhab            | openhab:openhab

URLs:        http://169.254.63.209:8080
             https://169.254.63.209:8443
```

## Additional Steps

After you get openHAB set up and running, there are a few additional setup steps you should consider:

- Configure a network share on your openHAB host system using [Linux Samba Share](linux.html#network-sharing) for easier remote editing of configuration files.

- Install [Visual Studio Code](https://code.visualstudio.com/Download) and the [openHAB VS Code Extension]({{base}}/configuration/editors.html#openhab-vs-code-extension) on your local machine, to manage your (remote) configuration files.
    The openHAB VS Code Extension comes with built-in support for the openHAB syntax and elements.

## Getting started

With the openHAB distribution up and running, you should now continue with
the [Beginner Tutorial]({{base}}/tutorial)
or by working on your own configuration.

## Help

The very active [openHAB Community Forum](https://community.openhab.org) can provide you with many more details, hints, and tips.
If you run into any problems, use the search function in the forum or open a new thread with your detailed question.

## Upgrading

In some cases upgrading to a new version of openHAB requires additional steps.
For textual based configuration this can usually be done using a text editor or VS Code.
UI configuration updates to the JSON database should not be done manually but by using the upgrade tool.

The upgrade tool is a Java application and allows performing different steps.
Each step can only be executed once (unless you `--force` the tool to perform them again).
Currently the following steps are supported as arguments to `--command`:

- `itemCopyUnitToMetadata`: With openHAB 4 presentation and internal representation of the unit of an item are separated.
This step copies the unit set in the state description of an item to the new `unit` metadata.
This is necessary to keep units consistent for data persisted with previous versions of openHAB.
- `linkUpgradeJsProfile`: The JS Scripting transformation/profile has been removed because of changing to Java 17.
They have been replaced by the generic script transformation/profile which require different configuration options.
This step rewrites the profiles to the new format.

The upgrade tool needs to know the path to the openHAB userdata folder (e.g. `/var/lib/openhab` on most Debian like systems).
If the tool is not operated from that folder, it can be specified by using `--dir /var/lib/openhab` on the commandline.

Example:

```shell
java -jar upgradetool.jar --dir /var/lib/openhab --command itemCopyUnitToMetadata
```
