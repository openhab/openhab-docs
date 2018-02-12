---
layout: documentation
title: GB00Z - ZWave
---

{% include base.html %}

# GB00Z Glass Break Detector

This describes the Z-Wave device *GB00Z*, manufactured by *Linear Corp* with the thing type UID of ```linear_gb00z_00_000```. 

Glass Break Detector


## Channels
The following table summarises the channels available for the GB00Z Glass Break Detector.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
|  | battery-level | system.battery-level |  |  |
| Alarm (general) | alarm_general | alarm_general | Door | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the GB00Z Glass Break Detector.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Group 1 | Alarms are reported to this group |


#### 1: Group 1

Alarms are reported to this group  


##### Overview 

Group 1 must be assigned the Node ID of the controller to which unsolicited notifications from the GB00Z-1 will be sent.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/565).
