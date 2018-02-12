---
layout: documentation
title: TPS412 - ZWave
---

{% include base.html %}

# TPS412 Touch Panel Switch 2 Channel

This describes the Z-Wave device *TPS412*, manufactured by *McoHome Technology Co., Ltd* with the thing type UID of ```mcohome_tps412_00_000```. 

Touch Panel Switch 2 Channel


## Channels
The following table summarises the channels available for the TPS412 Touch Panel Switch 2 Channel.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch |
| Switch 2 | switch_binary2 | switch_binary | Switch | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the TPS412 Touch Panel Switch 2 Channel.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Saving state before power failure | Switch state saved or not when power down |
| 1: Switch Button Group 1 |  |
| 2: Switch Button Group 2 |  |
| 3: All Status Reports |  |


#### 1: Saving state before power failure

Switch state saved or not when power down


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Disabled (0) |
|  | Enabled (1) |


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
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/429).
