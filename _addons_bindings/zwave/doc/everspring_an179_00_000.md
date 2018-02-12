---
layout: documentation
title: AN179 - ZWave
---

{% include base.html %}

# AN179 In-Wall Switch Module

This describes the Z-Wave device *AN179*, manufactured by *Everspring* with the thing type UID of ```everspring_an179_00_000```. 

In-Wall Switch Module


## Channels
The following table summarises the channels available for the AN179 In-Wall Switch Module.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Alarm (power) | alarm_power | alarm_power | Door | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the AN179 In-Wall Switch Module.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Basic Set Command value | Basic Set Command value. 0-99, 255 |
| 2: Report time delay group 1 | Delaying time to report to group 1. |
| 3: Remember last status | Remember last status after power loss. |
| 4: Switching type | Edge or toogle switch mode. |
| 1: Reports |  |
| 2: Control |  |


#### 1: Basic Set Command value

Basic Set Command value. 0-99, 255


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 255 |


#### 2: Report time delay group 1

Delaying time to report to group 1.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 3 to 25 |
| Default Value | 3 |


#### 3: Remember last status

Remember last status after power loss.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Do not remember (0) |
|  | Remember (1) |


#### 4: Switching type

Edge or toogle switch mode.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Edge Mode (0) |
|  | Toogle Mode (1) |


#### 1: Reports


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Control


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/28).
