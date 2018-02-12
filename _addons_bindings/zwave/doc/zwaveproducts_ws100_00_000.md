---
layout: documentation
title: WS-100 - ZWave
---

{% include base.html %}

# WS-100 Switch

This describes the Z-Wave device *WS-100*, manufactured by *Z Wave Products Inc.* with the thing type UID of ```zwaveproducts_ws100_00_000```. 

Switch


## Channels
The following table summarises the channels available for the WS-100 Switch.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Scene Number | scene_number | scene_number |  | Number |


### Device Configuration
The following table provides a summary of the configuration parameters available in the WS-100 Switch.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 3: LED Indicator | Controls LED behavior when switch state is on/off |
| 4: Orientation | Controls the on/off orientation of the rocker switch |
| 1: Group 1 |  |


#### 3: LED Indicator

Controls LED behavior when switch state is on/off


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | off/on (0) |
|  | on/off (1) |
|  | off (2) |


#### 4: Orientation

Controls the on/off orientation of the rocker switch


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Normal (0) |
|  | Inverted (1) |


#### 1: Group 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/592).
