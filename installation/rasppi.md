---
layout: documentation
title: Raspberry Pi
---

{% include base.html %}

# Raspberry Pi

Because of its **low price**, its **small form factor** and the **low energy consumption**, the [Raspberry Pi](https://www.raspberrypi.org) is a quite popular platform for openHAB.
It is favored amongst existing users and a recommended choice for newcomers.

![Raspberry Pi 2 Model B](images/rpi2b.png)

If you want to learn more about the possibilities of the Raspberry Pi and Linux in general, many tutorials can be found on the internet.
These including the official [raspberrypi.org help articles](https://www.raspberrypi.org/help) or the in-detail articles at [eLinux.org](https://elinux.org/RPi_Tutorials).

Recommendations for a ["headless"](https://en.wikipedia.org/wiki/Headless_computer) hardware setup:

- [Raspberry Pi 2 or better](https://en.wikipedia.org/wiki/Raspberry_Pi#Specifications), compare your existing device [here](https://en.wikipedia.org/wiki/Raspberry_Pi#Connectors) if you are unsure.
- SD card (16GB or more to support [wear-leveling](https://en.wikipedia.org/wiki/Wear_leveling))
- Steady power supply
- Ethernet connection
- *No connected display or keyboard needed*

## Recommended Setup

We are proud to provide a **preconfigured image** for the Raspberry Pi, with the latest build of openHAB and many useful software components (like Samba, Grafana or Mosquitto) as optional setup steps.
The image provided by the **openHABian** projects is based on Raspbian and under constant improvement.

Check out more details about [openHABian, the hassle-free openHAB setup](openhabian.html).

## Manual Setup

If you want or need to set up openHAB on a Raspberry Pi by yourself, please follow these recommendations.
For the beginning, we recommend to [download](https://www.raspberrypi.org/downloads/raspbian) and [install](https://www.raspberrypi.org/documentation/installation/installing-images/README.md) the latest Raspbian SD card image.
You may choose the "Lite" version.

**Attention:**
As of the November 2016 release, Raspbian has the SSH server disabled by default.
You will have to enable it manually.
For headless setup, SSH can be enabled by placing a file named "ssh", without any extension, onto the boot partition of the SD card.

### Connecting: 

Get your SD card and network cable plugged in and power up.
Booting up takes up to 10 minutes.
To connect with an SSH client (like [Putty](https://www.raspberrypi.org/documentation/remote-access/ssh/windows.md)), you need to know the IP address or hostname of your device.
A standard Raspbian setup should be reachable either by the hostname "raspberrypi" or though the local domain name "raspberrypi.local".
If you are not able to connect, check your routers web frontend for newly connected devices.

### First Steps:
Connected via SSH, execute the Raspbian configuration menu by running `sudo raspi-config`.
Go through the following steps:

- Expand the file system
- Change your password
- (Change the host name if you wish, e.g. "openhabpi")
- From the advanced menu, change the memory split for the GPU to "16"
- Restart

As a good practice, run a full upgrade and install packages you like or need (a set of helpful packages is given as an example):

```shell
sudo apt-get update
sudo apt-get upgrade

sudo apt-get install screen mc vim git htop
```

**Note on Java:**
Raspbian in the latest full version already includes Oracle Java 11.
However, at the time of this writing, the installed revision is lower than the [recommended](index.html#prerequisites).
Raspbian Lite comes without Java to begin with.
 ### Manual setup of Zulu 11
The following steps refer specifically to Raspberry Pi devices. For a more general overview. please refer to the Linux article for instructions on [how to install the latest Java 11 revision](linux.html).

1. create a folder for Zulu 11 and make it the current folder. For instance, ``/opt/jdk``. You can use the commands
```
sudo mkdir /opt/jdk
cd /opt/jdk
```
2. verify the architecture of your device. You perform this issuing the command:
```
dpkg --print-architecture
```
this will show whether you need files for  Soft Float (```armsf```) or Hard Float (```armhf```) .
Raspberry Pi 4 runs on ARM32-bit HF architecture (```armhf```), for instance. 


Now, to install Zulu 11, you need to download and install a tar.gz package for your architecture following the steps described below (```armhf``` architecture assumed for reference):


3. Download the latest Zulu 11 build from [the Azul download page](https://www.azul.com/downloads/zulu-community/?version=java-11-lts&architecture=arm-32-bit-hf&package=jdk) - at the time of writing, it's `` zulu11.43.100-ca-jdk11.0.9.1-linux_aarch32hf ``. You can use the command:
```
sudo wget http://cdn.azul.com/zulu-embedded/bin/zulu11.43.100-ca-jdk11.0.9.1-linux_aarch32hf.tar.gz
```
4. Extract the archive
```
sudo tar -xzvf -zulu11.43.100-ca-jdk11.0.9.1-linux_aarch32hf
```
5. Install ```java``` and ```javac```
```
sudo update-alternatives --install /usr/bin/java java /opt/jdk/zulu11.43.100-ca-jdk11.0.9.1-linux_aarch32hf/bin/java 1
sudo update-alternatives --install /usr/bin/javac javac /opt/jdk/zulu11.43.100-ca-jdk11.0.9.1-linux_aarch32hf/bin/javac 1
```
6. change the current alternative:
```
sudo update-alternatives --config java
```
You'll be prompted to select the alternative, pick the zulu11 you installed.

5. If you wish so, you can now delete the downloaded tar file
```
sudo rm *.tar.gz
```
### Installation:
Finally install openHAB on your Raspberry Pi, just as it is described in the [openHAB on Linux](linux.html) article:

- [Package Repository based Installation on Linux](linux.html#package-repository-installation)
