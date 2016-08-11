---
layout: documentation
title: Raspberry Pi
---

{% include base.html %}

# Raspberry Pi

Because of it's low price, it's small form factor and the low energy consumption, the [Raspberry Pi](https://www.raspberrypi.org) is a quite popular platform for openHAB.
Be sure to use a [Raspberry Pi Generation 2](https://en.wikipedia.org/wiki/Raspberry_Pi#Specifications) or newer.

![Raspberry Pi 2 Model B](https://www.raspberrypi.org/wp-content/uploads/2015/02/Pi_2_Model_B.png)

## Introduction

In this article you will find **suggestions** on how to configure a dedicated Raspberry Pi to run as openHAB server.
Your personal preferences and needs may differ!

There's no pre-configured image for openHAB yet.
Setting up openHAB shouldn't be a problem following the instructions below.

If you get stuck at any point or want to learn more about the possibilities of the Raspberry Pi and Linux, many tutorials can be found on the internet, including:

* The [raspberrypi.org help articles](https://www.raspberrypi.org/help).
* Technical in-detail articles at [eLinux.org](http://elinux.org/RPi_Tutorials).

## Recommended Setup

You will need:

* Raspberry Pi (Generation 2 or newer), compare your existing device [here](https://en.wikipedia.org/wiki/Raspberry_Pi#Connectors) if you are unsure.
* SD card (8GB or more)
* Power supply
* Ethernet connection

For the beginning, we recommend to [download](https://www.raspberrypi.org/downloads/raspbian) and [install](https://www.raspberrypi.org/documentation/installation/installing-images/README.md) the latest Raspbian SD card image.
You may choose the "Lite" version.

Get your SD card and network cable plugged in, power up, and connect through the SSH remote console.
Booting up takes up to 10 minutes.
To connect with an SSH client (like Putty), you need to know the IP address or hostname of your device.
A standard Raspbian setup should be reachable either by the hostname "raspberrypi" or though the local domain name "raspberrypi.local".
If you are not able to connect, check your routers web frontend for newly connected devices.

Connected via SSH, execute the Raspbian configuration menu by running `sudo raspi-config`. Go through the following steps:

* Expand the file system
* Change your password
* (Change the host name if you wish, e.g. "openhabpi")
* From the advanced menu, change the memory split for the GPU to "16"
* Restart

As a good practice, run a full upgrade and install packages you like or need (a set of helpful packages is given as an example):

```shell
sudo apt-get update
sudo apt-get upgrade

sudo apt-get install screen mc vim git htop
```

Raspbian in the latest full versions already includes the [required](index.html#prerequisites) Oracle Java 8.
If you are using "Raspbian Lite" you need to install it:

```shell
sudo apt-get install oracle-java8-jdk
```

Install openHAB on your Raspberry Pi, as it is described in the [openHAB 2 on Linux](linux.html) article:

* [Package Repository based Installation on Linux](linux.html#package-repository-installation)
