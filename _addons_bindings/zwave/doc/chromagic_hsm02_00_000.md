---
layout: documentation
title: HSM02 - ZWave
---

{% include base.html %}

# HSM02 Door Window Sensor

This describes the Z-Wave device *HSM02*, manufactured by *Chromagic Technologies Corporation* with the thing type UID of ```chromagic_hsm02_00_000```. 

Door Window Sensor


## Channels
The following table summarises the channels available for the HSM02 Door Window Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Alarm | alarm_general | alarm_general | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the HSM02 Door Window Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Basic Set Level | Value to be sent with a BASIC SET command |
| 2: Configuring the OFF Delay | OFF Delay in seconds |
| 1: Target for reports |  |
| 2: Target nodes who receive BASIC_SET command |  |


#### 1: Basic Set Level

Value to be sent with a BASIC SET command


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 99 |
| Default Value | 99 |


#### 2: Configuring the OFF Delay

OFF Delay in seconds


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 0 |


#### 1: Target for reports


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Target nodes who receive BASIC_SET command


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/342).
