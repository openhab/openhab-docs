---
layout: documentation
title: ASL-03 - ZWave
---

{% include base.html %}

# ASL-03 August Smart Lock Pro 3rd Gen

This describes the Z-Wave device *ASL-03*, manufactured by *August Smart Locks* with the thing type UID of ```august_asl03_00_000```. 

August Smart Lock Pro 3rd Gen


## Channels
The following table summarises the channels available for the ASL-03 August Smart Lock Pro 3rd Gen.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Door Lock | lock_door | lock_door | Door | Switch |
| Alarm (access) | alarm_entry | alarm_entry | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the ASL-03 August Smart Lock Pro 3rd Gen.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: report1 | battery status, door lock operation status, and device reset locally |
| 2: report2 | door lock operation status |


#### 1: report1

battery status, door lock operation status, and device reset locally  


##### Overview 

The Lifeline group on this lock is used to report battery status, door lock operation status, and device reset locally notifications to nodes on the group list.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: report2

door lock operation status  


##### Overview 

The Doorlock Op group on this lock is used to report door lock operation status to nodes on the group list.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/743).
