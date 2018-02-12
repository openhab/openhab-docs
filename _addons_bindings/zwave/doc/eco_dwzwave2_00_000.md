---
layout: documentation
title: DWZWAVE2 - ZWave
---

{% include base.html %}

# DWZWAVE2 Z-Wave Door/Window Sensor

This describes the Z-Wave device *DWZWAVE2*, manufactured by *Ecolink* with the thing type UID of ```eco_dwzwave2_00_000```. 

Z-Wave Door/Window Sensor


## Channels
The following table summarises the channels available for the DWZWAVE2 Z-Wave Door/Window Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_door | sensor_door | Door | Contact |
| Alarm | alarm_general | alarm_general | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the DWZWAVE2 Z-Wave Door/Window Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Group 1 | Association Group 1 |
| 2: Group 2 | Association Group 2 |


#### 1: Group 1

Association Group 1  


##### Overview 

Association group one is intended for but not limited to controllers. All nodes whose Node ID that have been set in Association group one will receive all unsolicited Alarm Report frames, and Basic Report frames of 0x00 and 0xFF.  When a sensor such as a door or window sensor is opened/faulted, the sensor will send a Basic Report to nodes in Association group one and a Basic Set of 0xFF to Association group two. When the door or window is closed the sensor will send a Basic Report of 0x00 to only group one.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Group 2

Association Group 2  


##### Overview 

Association group two is intended for any device Ecolink Z-Wave Command Class Specification 2 that is controllable with a Basic Set of 0xFF such as lights, sirens, or chimes. When a sensor such as a door or window sensor is opened/faulted, the sensor will send a Basic Report to nodes in Association group one and a Basic Set of 0xFF to Association group two. When the door or window is closed the sensor will send a Basic Report of 0x00 to only group one. The Configuration command class can configure the sensor to send Basic Sets of 0x00 to nodes in group two (turning devices off).


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/138).
