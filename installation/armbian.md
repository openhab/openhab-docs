---
layout: documentation
title: Armbian
---

{% include base.html %}

# Armbian

## What is Armbian?

Armbian is a base operating system platform for single board computers.

- comes in desktop, minimal or server variant,
- has clean and highly optimised user space,
- is Ubuntu and Debian compatible,
- is supported with vibrant community,
- comes with a powerful SDK which allows reproduction and customisation,
- supports many 3rd party wireless drivers with advanced functionalities,
- supports Docker, disk encryption, Wireguard VPN any many other features.

## Recommended hardware

OpenHab will run on any Armbian [supported hardware](https://www.armbian.com/download/?device_support=Supported) but performance will vary due to hardware limitations. It is recommended to choose boards that have at least:


- 512 Kb of memory (on minimal or server image)
- eMMC or [quality SD card](https://docs.armbian.com/User-Guide_Getting-Started/#how-to-prepare-a-sd-card)
- 4 core
- wired networking


![Armbian](images/boards1.png)

## Supported images

CLI, desktop or minimal. If you choose a minimal image, you need to install armbian-config first.

## Setup

**First Steps:**

1. Prepare Armbian as usual - [login as root / 1234, change root password, create username. You don't need to perform any other steps](https://docs.armbian.com/User-Guide_Getting-Started/).

2. Update

```shell
sudo apt-get update
sudo apt-get upgrade
sudo armbian-config
```

3. Run armbian-config

```shell
sudo armbian-config
```

![Armbian config](images/armbian-step1.png)
![System and 3rd party software](images/armbian-step2.png)
![Softy](images/armbian-step3.png)

Select OpenHAB with **SPACE** and press **ENTER**

![Openhab](images/armbian-step4.png)

Wait 5 to 10 minutes depending on your hardware. During this time you can leave armbian-config and check if installation was succesfull by checking what openhab is doing on the system:

```shell
sudo htop -u openhab
```

![Observe activities with htop](images/armbian-step5.png)

If you don't see any openhab activities, something went wrong.

## Getting started

With the openHAB up and running, you should now continue with the [Beginner Tutorial]({{base}}/tutorial)
or by working on your own configuration.

## Help

The very active [openHAB Community Forum](https://community.openhab.org) provides many more details and hints.
If you run into any problems, use the search function or open a new thread with your detailed question.

In case you run into a problem that is board hardware related, please use [Armbian Community forums](https://forum.armbian.com/forum/1-bug-tracker/).
