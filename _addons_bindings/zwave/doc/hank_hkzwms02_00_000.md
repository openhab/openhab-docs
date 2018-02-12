---
layout: documentation
title: HKZW_MS02 - ZWave
---

{% include base.html %}

# HKZW_MS02 Motion Sensor

This describes the Z-Wave device *HKZW_MS02*, manufactured by *Hank* with the thing type UID of ```hank_hkzwms02_00_000```. 

Motion Sensor


## Channels
The following table summarises the channels available for the HKZW_MS02 Motion Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the HKZW_MS02 Motion Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 12: Motion Sensor&#x60;s Sensitivity | The higher the value,the more sensitive the PIR sensor |
| 14: Enable/Disable Basic Set Command | The motion Sensor can reverse its value of BASIC SET when motion is triggered |
| 15: value of basic set command | assigned to send Basic Set Command |
| 17: enable/disable shock alarm |  |
| 32: Level of low battery | Define a battery level ad the "low battery" |
| 1: report the motion detection and battery level |  |
| 2: assigned to send BASIC SET command |  |


#### 12: Motion Sensor&#x60;s Sensitivity

The higher the value,the more sensitive the PIR sensor


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_1 |
| Data Type        | INTEGER || Default Value | 8 |
| Options | 0 (0) |
|  | 1 (1) |
|  | 2 (2) |


#### 14: Enable/Disable Basic Set Command

The motion Sensor can reverse its value of BASIC SET when motion is triggered


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable (0) |
|  | enable (1) |


#### 15: value of basic set command

assigned to send Basic Set Command


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_15_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable (0) |
|  | Enable (1) |


#### 17: enable/disable shock alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_17_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable (0) |
|  | enable (1) |


#### 32: Level of low battery

Define a battery level ad the "low battery"


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_32_1 |
| Data Type        | INTEGER |
| Range | 10 to 50 |
| Default Value | 20 |


#### 1: report the motion detection and battery level


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: assigned to send BASIC SET command


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/676).
