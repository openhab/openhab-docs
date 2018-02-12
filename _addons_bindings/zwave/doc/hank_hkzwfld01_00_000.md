---
layout: documentation
title: HKZW_FLD01 - ZWave
---

{% include base.html %}

# HKZW_FLD01 Flood Sensor FLD01

This describes the Z-Wave device *HKZW_FLD01*, manufactured by *Hank* with the thing type UID of ```hank_hkzwfld01_00_000```. 

Flood Sensor FLD01


## Channels
The following table summarises the channels available for the HKZW_FLD01 Flood Sensor FLD01.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Alarm (heat) | alarm_heat | alarm_heat |  | Switch |
| Alarm (flood) | alarm_flood | alarm_flood | Door | Switch |
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Sensor (temperature)

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the HKZW_FLD01 Flood Sensor FLD01.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 14: Enable/Disable Basic Set Command | The flood sensor can send BASIC SET command to nodes associated |
| 15: value of the Basic Set | The flood sensor can send BASIC SET command to nodes associated |
| 17: Flooding Alarm | Enable/Disable flooding alarm |
| 18: Shock Alarm | Enable/Disable shock alarm |
| 19: High Temperature Alarm | Enable/Disable high temperature alarm |
| 20: Set the high temperature alarm trigger value | Available setting(US):-67°c to -257°c |
| 21: Low Temperature Alarm | Enable/Disable low temperature alarm |
| 22: Set the low temperature alarm trigger value | Available setting(US):-67°c to -257°c |
| 24: Blinking LED | Enable/Disable blinking LED when alarm being triggerd |
| 32: Level of low battery | This parameter defines a battery level as the "low bettery" |
| 1: Report | report the flooding detection,shock detection and the battert level |
| 2: Send Command | Group 2 is assigned to send BASIC SET command |


#### 14: Enable/Disable Basic Set Command

The flood sensor can send BASIC SET command to nodes associated


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Disable (0) |
|  | Enable (1) |


#### 15: value of the Basic Set

The flood sensor can send BASIC SET command to nodes associated


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_15_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable (0) |
|  | Enable (1) |


#### 17: Flooding Alarm

Enable/Disable flooding alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_17_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Disable (0) |
|  | Enable (1) |


#### 18: Shock Alarm

Enable/Disable shock alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_18_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Disable (0) |
|  | Enable (1) |


#### 19: High Temperature Alarm

Enable/Disable high temperature alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_19_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Disable (0) |
|  | Enable (1) |


#### 20: Set the high temperature alarm trigger value

Available setting(US):-67°c to -257°c


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_20_2 |
| Data Type        | INTEGER |
| Range | -670 to 2570 |
| Default Value | 1040 |


#### 21: Low Temperature Alarm

Enable/Disable low temperature alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_21_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable (0) |
|  | Enable (1) |


#### 22: Set the low temperature alarm trigger value

Available setting(US):-67°c to -257°c


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_22_2 |
| Data Type        | INTEGER |
| Range | -670 to 2570 |
| Default Value | 0 |


#### 24: Blinking LED

Enable/Disable blinking LED when alarm being triggerd


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_24_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Disable (0) |
|  | Enable (1) |


#### 32: Level of low battery

This parameter defines a battery level as the "low bettery"


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_32_1 |
| Data Type        | INTEGER |
| Range | 10 to 50 |
| Default Value | 20 |


#### 1: Report

report the flooding detection,shock detection and the battert level


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Send Command

Group 2 is assigned to send BASIC SET command


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/674).
