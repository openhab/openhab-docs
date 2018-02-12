---
layout: documentation
title: DL9101V - ZWave
---

{% include base.html %}

# DL9101V Door Lock with Handle

This describes the Z-Wave device *DL9101V*, manufactured by *Shenzhen iSurpass Technology Co. ,Ltd* with the thing type UID of ```isurpass_dl9101v_00_000```. 

Door Lock with Handle


## Channels
The following table summarises the channels available for the DL9101V Door Lock with Handle.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Door Lock | lock_door | lock_door | Door | Switch |
| Alarm | alarm_general | alarm_general | Door | Switch |
|  | battery-level | system.battery-level |  |  |
| Clock Time Offset | time_offset | time_offset | Temperature | Number |


### Clock Time Offset

#### Automatic Update Offset

The number of seconds difference in the time before it is reset  
Setting this will automatically update the devices clock when the time difference between the device, and the computer exceeds this number of seconds.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_offset |
| Data Type        | INTEGER |
| Range | 10 to 600 || Default Value | 60 |
| Options | Disable Auto Update (0) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the DL9101V Door Lock with Handle.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Lifeline |  |


#### 1: Lifeline


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/666).
