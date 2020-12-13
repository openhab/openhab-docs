---
layout: documentation
title: Installation Overview
---

{% include base.html %}

# Installation Overview

openHAB is fully written in Java.
As such, it only depends on a Java Virtual Machine, which is available for many platforms.
openHAB can be executed on different versions of **macOS** and **Windows** and many different variants of **Linux** (Ubuntu, Raspbian, ...).

Please be aware of the fact, that openHAB is continously improved and changed.
Therefore, tutorials and help you may find on the internet for **might** be outdated!
Always keep this in mind, when searching for help and solutions.

## Platform Recommendations

1.  You are **new to openHAB** and want to give it a try? You are in luck:
    - Set up openHAB on your local PC or Mac in just a few steps.

1.  You gained some experience and want to use openHAB to seriously control your home?
    Typical hardware and software requirements are:
    - **24/7 availability:** A dedicated system connected by Ethernet and running continuously.
    - **Energy and space efficient:** A device capable of performing the task at hand without being exaggerated
    - **Extendibility:** Your system should be capable of running additional software like an MQTT broker or a persistence and graphing software.
    - **Peripherals:** Depending on your home automation hardware, you will need additional  peripheral devices such as a WiFi interface or a special USB radio module.

Many devices are suited to host a continuous installation of openHAB.
Experiences with different devices and environments can be found in the [community forum hardware section](https://community.openhab.org/c/hardware/server).

The [Raspberry Pi](rasppi.html) as a minimal sufficient device is quite popular, especially as we offer a quick setup with [openHABian](openhabian.html).
A popular alternative is [our solution for the Synology DiskStation](synology.html), which many users already own in their homes.
The previously mentioned [openHABian](openhabian.html) can also be used to kickstart your openHAB experience on existing Debian/Ubuntu based Linux systems.

Please check the menu to the left for all available options.

## Prerequisites

Make sure that you have an up to date **Java 11** platform installed on your host system.
Zulu is currently the recommended Java platform for openHAB.
[Download](https://www.azul.com/downloads/zulu-community/?&architecture=x86-64-bit&package=jdk#) and [installation](https://docs.azul.com/zulu/zuludocs/ZuluUserGuide/InstallingZulu/InstallationWindowsUsingZuluMSIFile.htm) instructions can be found on Azul Systems' Zulu website.
Oracle Java is also suitable for most configurations but licensing restrictions may apply.
OpenJDK may also be used, but it has some [known limitations](https://community.openhab.org/t/running-openhab-2-on-openjdk/21443/8?u=gatekeeper6838) with openHAB and is not recommended.

::: warning
Please note that higher versions than Java 11 are also not supported at the moment.
:::

| Java Platform                               | Advantages                                                                                                                                                                            | Disadvantages                                                                                                                                                                                                                                                                                                                        |
|---------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Azul Zulu](https://www.azul.com/downloads/) | Completely open source, fully certified Java SE compliant build of OpenJDK, embedded version optimized for ARM devices [available here](https://www.azul.com/downloads/zulu-embedded/) |                                                                                                                                                                                                                                                                                                                                      |
| [Oracle Java](https://java.com/en/)         | Full openHAB support on all platforms                                                                                                                                                 | [Licensing restrictions](https://blog.takipi.com/running-java-on-docker-youre-breaking-the-law/), manual installation required on many Linux systems: [Ubuntu](https://help.ubuntu.com/community/Java), [Mint](https://community.linuxmint.com/tutorial/view/1091), and [Debian](https://wiki.debian.org/Java/Sun) are some examples |
| [AdoptOpenJDK](https://adoptopenjdk.net)          | Open Source JDK backed by many large companies |                                                                                                                                                                                                                                                                                                                                      |

Please download and install the **Java 11** version of the JVM.
openHAB 3 will use Java 11 and you *can* go for it with 2.X, too, but be aware that although developers are working hard to make this work, there might be problems with the oldest parts of openHAB such as some of the v1 bindings due to non-backward compatible changes in Java 11.

The **64-bit version** of the JVM is recommended on platforms using a 64-bit OS and an Intel or AMD processor.

The **32-bit version** of the JVM is recommended on ARM platforms such as the Raspberry Pi.
The 32-bit JVM performs better on the ARM platform. Some add-ons use libraries that do not work with a 64-bit JVM on ARM.

Check your current Java version by opening a command line console and typing `java -version`:

```text
openjdk version "11.0.9.1" 2020-11-04 LTS
OpenJDK Runtime Environment Zulu11.43+55-CA (build 11.0.9.1+1-LTS)
OpenJDK 64-Bit Server VM Zulu11.43+55-CA (build 11.0.9.1+1-LTS, mixed mode)
```

## Setup variants

Before you can start, two decisions have to be made:

1.  openHAB is available as a platform independent archive file or through a package repository:
    - **Manual setup:** Download and extract a platform independent zip archive: [macOS](macos.html), [Windows](windows.html), [Linux](linux.html#manual-installation)
    - **Package setup:** Install through a package repository, including automatic updates.
    This option is only available for Debian or Ubuntu derivatives and the recommended choice: [Linux (apt/deb)](linux.html#package-repository-installation)

2.  Stable release or cutting edge:
    - **Stable:** Use the latest official release ([hosted on Bintray](https://bintray.com/openhab/mvn/openhab-distro)).
    - **Snapshot:** Benefit from the latest changes in the daily created snapshot ([hosted on openhab.org](https://ci.openhab.org/)).

## Installation

Please follow the instructions in the installation article matching your platform (see the menu to the left).

## Additional Steps

After you got openHAB set up and running, there are a few additional setup steps you should consider:

-   Configure a network share on your openHAB host device and mount it locally: [Linux Samba Share](linux.html#network-sharing), Windows file sharing, ...

-   Install [Visual Studio Code](https://code.visualstudio.com/Download) and the [openHAB VS Code Extension]({{base}}/configuration/editors.html#openhab-vs-code-extension) on your local machine, to manage your (remote) configuration files.
    The openHAB VS Code Extension comes with built-in support for the openHAB syntax and elements.

## Getting started

With the openHAB distribution up and running, you should now continue with
the [Beginner Tutorial]({{base}}/tutorial)
or by working on your own configuration.

## Help

The very active [openHAB Community Forum](https://community.openhab.org) provides many more details and hints.
If you run into any problems, use the search function or open a new thread with your detailed question.
