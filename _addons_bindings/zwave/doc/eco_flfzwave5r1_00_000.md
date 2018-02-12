---
layout: documentation
title: FLF-ZWAVE5 R1 - ZWave
---

{% include base.html %}

# FLF-ZWAVE5 R1 Z-Wave Wireless Flood/Freeze Sensor

This describes the Z-Wave device *FLF-ZWAVE5 R1*, manufactured by *Ecolink* with the thing type UID of ```eco_flfzwave5r1_00_000```. 

Z-Wave Wireless Flood/Freeze Sensor


## Channels
The following table summarises the channels available for the FLF-ZWAVE5 R1 Z-Wave Wireless Flood/Freeze Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch |
| Alarm (flood) | alarm_flood | alarm_flood | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the FLF-ZWAVE5 R1 Z-Wave Wireless Flood/Freeze Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Lifeline |  |


#### 1: Lifeline

  


##### Overview 

Group one is a lifeline group who will receive unsolicited messages relating to flood/freeze notifications, case tampering notifications, low-battery notifications.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/744).
