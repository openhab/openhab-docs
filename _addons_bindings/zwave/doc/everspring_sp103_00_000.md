---
layout: documentation
title: SP103 - ZWave
---

{% include base.html %}

# SP103 Motion Detector

This describes the Z-Wave device *SP103*, manufactured by *Everspring* with the thing type UID of ```everspring_sp103_00_000```. 

Motion Detector


## Channels
The following table summarises the channels available for the SP103 Motion Detector.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Alarm | alarm_general | alarm_general | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the SP103 Motion Detector.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Phase level on command | Defines which command to send when sensor triggers |
| 2: Enable/Disable Sleeping | Enables/Disables sleeping for debug purposes |
| 1: Triggered Report |  |


#### 1: Phase level on command

Defines which command to send when sensor triggers


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Set OFF (0) |
|  | Set ON (1) |
|  | Set LAST Level (9) |


#### 2: Enable/Disable Sleeping

Enables/Disables sleeping for debug purposes


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Disabled (0) |
|  | Enabled (1) |


#### 1: Triggered Report


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/29).
