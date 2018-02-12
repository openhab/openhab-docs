---
layout: documentation
title: AD146 - ZWave
---

{% include base.html %}

# AD146 In-Wall Dimmer Module

This describes the Z-Wave device *AD146*, manufactured by *Everspring* with the thing type UID of ```everspring_ad146_00_000```. 

In-Wall Dimmer Module


## Channels
The following table summarises the channels available for the AD146 In-Wall Dimmer Module.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |
| Alarm (power) | alarm_power | alarm_power | Door | Switch |


### Dimmer

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the AD146 In-Wall Dimmer Module.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Basic Set Command value | Basic Set Command value. 0-99, 255 |
| 2: Report time delay group 1 | Delaying time to report to group 1. |
| 3: Remember last status | Remember last status after power loss. |
| 4: Switching type | Edge or toogle switch mode. |
| 5: Output mode setting | Dimming or On/Off Switch |
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


#### 5: Output mode setting

Dimming or On/Off Switch


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Dimming (0) |
|  | On/Off (1) |


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
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/24).
