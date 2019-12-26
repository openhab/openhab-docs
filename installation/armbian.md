---
layout: documentation
title: Armbian
---

{% include base.html %}

# Armbian

## Recommended hardware

Due to superb optimisations OpenHab will run on any [supported hardware](https://www.armbian.com/download/?device_support=Supported) but we recommend those minimal specifications:
- 512Mb of memory
- 4 core 
- wired networking

## Setup

**First Steps:**
Prepare Armbian as usual:
https://docs.armbian.com/User-Guide_Getting-Started/

```shell
sudo apt-get update
sudo apt-get upgrade
sudo armbian-config
```

![Armbian config](images/step1.png)
![System and 3rd party software](images/step2.png)
![Softy](images/step3.png)

Select Openhab2 with <SPACE> and press <ENTER>

![Openhab](images/step4.png)

Wait 5-15 minutes depending on your hardware. During this time you can check if installation was succesfull by checking if openhab is doing something:

```shell
sudo htop -u openhab
```

![Observe activities with htop](images/step5.png)

If you don't see any openhab activities, something went wrong.
