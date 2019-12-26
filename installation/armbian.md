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
1. sudo apt-get update
2. sudo apt-get upgrade
3. sudo armbian-config
```

![Armbian config](images/step1.png)
![System and 3rd party software](images/step2.png)
![Softy](images/step3.png)
![Openhab](images/step4.png)

Select Openhab2 with <SPACE> and press <ENTER>
