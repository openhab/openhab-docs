---
layout: documentation
title: DCH-Z510 - ZWave
---

{% include base.html %}

# DCH-Z510 Siren

This describes the Z-Wave device *DCH-Z510*, manufactured by *D-Link* with the thing type UID of ```dlink_dchz510_00_000```. 

Siren  


### Inclusion Information 

1.  Have Z-Wave Controller enter inclusion mode.
2.  Pressing tamper key three times within 1.5 seconds to enter the inclusion mode.
3.  After add successful, the LED will light ON 1 second 

  


### Exclusion Information 

1.  Have Z-Wave Controller enter exclusion mode.
2.  Pressing tamper key three times within 1.5 seconds to enter the exclusion mode.
3.  Node ID has been excluded. 


## Channels
The following table summarises the channels available for the DCH-Z510 Siren.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Start sound | notification_send | notification_send |  | Number |


### Device Configuration
The following table provides a summary of the configuration parameters available in the DCH-Z510 Siren.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 7: Customer Function |  |
| 29: Disable Alarm |  |
| 31: Alarm Duration | Play alarm sound duration, 1 tick is 30 seconds. 0 means never auto stop. |
| 1: Report Messages | The group 1 is for receiving the report message, like tamper event. This is the device's L... |


#### 7: Customer Function


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1_00000010 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Using Notification Report (0) |
|  | Using Sensor Binary Report (16) |


#### 29: Disable Alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_29_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Enable Alarm (0) |
|  | Disable Alarm (1) |


#### 31: Alarm Duration

Play alarm sound duration, 1 tick is 30 seconds. 0 means never auto stop.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_31_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 0 |


#### 1: Report Messages

The group 1 is for receiving the report message, like tamper event. This is the device's Lifeline group. The group supports 8 nodes maximum.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/330).
