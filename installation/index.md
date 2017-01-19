---
layout: documentation
title: Installation Overview
---

{% include base.html %}

# Installation Overview

openHAB 2 is based on the Eclipse SmartHome framework and is fully written in Java.
As such, it only depends on a Java Virtual Machine, which is available for many platforms.
openHAB can be executed on different versions of **Mac OS X** and **Windows** and many different variants of **Linux** (Ubuntu, Raspbian, ...).

Please be aware of the fact, that openHAB 2 is based on a new core and introduces new concepts.
Therefore, tutorials and help you may find on the internet for openHAB 1 **might** be outdated!

## Platform Recommendations

1. You are **new to openHAB 2** and want to give it a try? You are in luck:
  - Set up openHAB 2 on your local PC or Mac in just a few steps.

2. You gained some experience and want to use openHAB to seriously control your home?
  Typical hardware and software requirements are:
    - **24/7 availability:** A dedicated system connected by Ethernet and running continuously.
    - **Energy and space efficient:** A device capable of performing the task at hand without being exaggerated
    - **Extendibility:** Your system should be capable of running additional software like an MQTT broker or a persistence and graphing software.
    - **Peripherals:** Depending on your home automation hardware, you will need additional peripheral devices such as a WiFi interface or a special USB radio module.

Many devices are suited to host a continuous installation of openHAB 2.
Experiences with different devices and environments can be found in the [community forum hardware section](https://community.openhab.org/c/hardware/server).

The [Raspberry Pi](rasppi.html) as a minimal sufficient device is quite popular, especially as we offer a quick setup with [openHABian](openhabian.html).
A popular alternative is [our solution for the Synology DiskStation](synology.html), which many users already own in their homes.

The previously mentioned [openHABian](openhabian.html) can also be used to kickstart your openHAB 2 experience on existing debian/ubuntu based Linux systems.

## Prerequisites

Make sure that you have an up to date version of the [Oracle Java Runtime Environment](https://java.com/en/download/manual.jsp) on your host system installed.
A famous choice is OpenJDK, however, Oracle Java Version 8 is recommended for openHAB.
openHAB may be unstable and slower executed by OpenJDK.

> Oracle Java offers significant performance advantages over OpenJDK on ARM platforms, and will expand the range of Java applications that run well [on the Raspberry Pi].

As for now, a pre-release Java 9 installation is not recommended and is not yet supported by openHAB 2.

For best compatibility, namely with the openHAB Cloud service [myopenhab.org](http://www.myopenhab.org), the minimum recommended Orcacle Java 8 revision is "111".
Attention: Most package managers serve an **older revision**.
Check your current Java version by opening a command line console and typing `java -version`:

```text
java version "1.8.0_111"
Java(TM) SE Runtime Environment (build 1.8.0_111-b14)
Java HotSpot(TM) Client VM (build 25.111-b14, mixed mode)
```

## Setup variants

Before you can start, three decisions have to be made:

1. openHAB 2 is available as a platform independent archive file or through a package repository:
  - **Manual setup:** Download and extract a platform independent zip archive: [Mac OS X](macosx.html), [Windows](windows.html), [Linux](linux.html#manual-installation)
  - **Package setup:** Install though a package repository, including automatic updates.
    This option is only available for Debian or Ubuntu derivatives and the recommended choice: [Linux (apt/deb)](linux.html#package-repository-installation)

2. Stable release or cutting edge:
  - **Stable:** Use the latest official release ([hosted on Bintray](https://bintray.com/openhab/mvn/openhab-distro)).
  - **Snapshot:** Benefit from the latest changes in the daily created snapshot ([hosted on CloudBees](https://openhab.ci.cloudbees.com/job/openHAB-Distribution)).

  Because openHAB 2 is still under development, it is recommended for experienced users to use the latest snapshot.

## Installation

Please follow the instructions in the installation article matching your platform.

## Additional Steps

After you got openHAB 2 set up and running, there are a few additional setup steps you should consider:

* Configure a network share on your openHAB host device and mount it locally: [Linux Samba Share](linux.html#network-sharing), Windows file sharing, ...
* Install the [Eclipse SmartHome Designer](designer.html) on your local machine, to manage your (remote) configuration files.
  The designer comes with built-in support for the openHAB syntax and elements.

## Getting started

With the openHAB 2 distribution up and running, you should now continue with
the [Demo Tutorial]({{base}}/tutorials/demo.html),
the [Beginner Tutorial]({{base}}/tutorials/beginner)
or by working on your own configuration.

## Help

The very active [openHAB Community Forum](https://community.openhab.org) provides many more details and hints.
If you run into any problems, use the search function or open a new thread with your detailed question.
