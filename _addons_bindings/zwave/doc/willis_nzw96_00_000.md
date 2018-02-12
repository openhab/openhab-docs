---
layout: documentation
title: NZW96 - ZWave
---

{% include base.html %}

# NZW96 Outdoor Plug-in Module (1-Channel)

This describes the Z-Wave device *NZW96*, manufactured by *Willis Electric Co., Ltd.* with the thing type UID of ```willis_nzw96_00_000```. 

Outdoor Plug-in Module (1-Channel)


## Channels
The following table summarises the channels available for the NZW96 Outdoor Plug-in Module (1-Channel).

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Alarm (heat) | alarm_heat | alarm_heat |  | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the NZW96 Outdoor Plug-in Module (1-Channel).
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: LED Indicator | Change the behavior of the LED Indicator |
| 2: Countdown | Plug Auto Shutoff |
| 1: Lifeline |  |
| 2: Send Baxic Set |  |


#### 1: LED Indicator

Change the behavior of the LED Indicator


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Plug On / LED On (0) |
|  | Plug On / LED Off (1) |
|  | LED Disabled (2) |


#### 2: Countdown

Plug Auto Shutoff


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_2 |
| Data Type        | INTEGER |
| Range | 0 to 36000 |
| Default Value | 0 |


#### 1: Lifeline


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Send Baxic Set


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/757).
