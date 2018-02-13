---
layout: documentation
title: ZWN-BPC - ZWave
---

{% include base.html %}

# ZWN-BPC PIR Sensor

This describes the Z-Wave device *ZWN-BPC*, manufactured by *Wenzhou MTLC Electric Appliances Co.,Ltd.* with the thing type UID of ```enerwave_zwnbpc_05_010```. 

PIR Sensor


## Channels
The following table summarises the channels available for the ZWN-BPC PIR Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the ZWN-BPC PIR Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Motion timeout | Multiplier to wakeup timer interval |
| 1: Lifeline |  |
| 2: Basic Report |  |
| 3: Notification Report |  |
| 4: Basic Set |  |


#### 1: Motion timeout

Multiplier to wakeup timer interval  


##### Overview 

It is minimum time when the associated nodes keep turn on

n:1-7 (n\*WAKE\_UP\_INTERVAL)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 1 to 7 |
| Default Value | 1 |


#### 1: Lifeline

  


##### Overview 

1. Battery Report

2. Notification Report

3. Device Reset Locally


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Basic Report


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Notification Report


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Basic Set


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/795).
