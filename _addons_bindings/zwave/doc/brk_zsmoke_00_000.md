---
layout: documentation
title: ZSMOKE - ZWave
---

{% include base.html %}

# ZSMOKE Smoke Alarm

This describes the Z-Wave device *ZSMOKE*, manufactured by *BRK Brands, Inc.* with the thing type UID of ```brk_zsmoke_00_000```. 

Smoke Alarm


## Channels
The following table summarises the channels available for the ZSMOKE Smoke Alarm.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Alarm | alarm_general | alarm_general | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the ZSMOKE Smoke Alarm.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Send double alarms | Causes the device to send double alarm messages |
| 1: Group 1 |  |


#### 1: Send double alarms

Causes the device to send double alarm messages


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Single Alarm (0) |
|  | Double Alarm (1) |


#### 1: Group 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/239).
