---
layout: documentation
title: SM103 - ZWave
---

{% include base.html %}

# SM103 Door/Window Contact

This describes the Z-Wave device *SM103*, manufactured by *Chromagic Technologies Corporation* with the thing type UID of ```chromagic_sm103_00_000```. 

Door/Window Contact


## Channels
The following table summarises the channels available for the SM103 Door/Window Contact.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Alarm | alarm_general | alarm_general | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the SM103 Door/Window Contact.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Basic Set Level | Value to be sent with a BASIC SET command |
| 2: Configuring the OFF Delay | OFF Delay in seconds |
| 1: Tamper Event Report (Alarm Report) |  |
| 2: Control other Z-Wave Devices |  |


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
| Default Value | 1 |


#### 1: Tamper Event Report (Alarm Report)


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Control other Z-Wave Devices


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/428).
