---
layout: documentation
title: MH-S312 - ZWave
---

{% include base.html %}

# MH-S312 Two Way Switch

This describes the Z-Wave device *MH-S312*, manufactured by *McoHome Technology Co., Ltd* with the thing type UID of ```mcohome_mhs312_00_000```. 

Two Way Switch  


## Overview 

Touch Panel Switch is a wall switch with built-in Z-Wave module. It supports basic command class，multi channel command class and multi channel association command class, which can control all associated devices synchronously. This product can be included and operated in any Z-Wave network with other Z-Wave certified devices from any other manufacturers.

  


### Inclusion Information 

Press and hold any key on the panel for 8 seconds. If inclusion is successful, all INDICATION LEDs on the panel will turn green, and all switches will turn on.

  


### Exclusion Information 

Press and hold any key on the panel for 8 seconds.  If the exclusion is successful, all INDICATION LEDs on the panel will turn orange, and all switches will turn off. The exclusion will delete all association data


## Channels
The following table summarises the channels available for the MH-S312 Two Way Switch.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch |
| Switch 2 | switch_binary2 | switch_binary | Switch | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the MH-S312 Two Way Switch.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Switch Button Group 1 |  |
| 2: Switch Button Group 2 |  |
| 3: All Status Reports |  |


#### 1: Switch Button Group 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Switch Button Group 2


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: All Status Reports


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/434).
