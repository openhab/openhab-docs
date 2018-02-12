---
layout: documentation
title: DMWS1 - ZWave
---

{% include base.html %}

# DMWS1 Dome Leak Sensor

This describes the Z-Wave device *DMWS1*, manufactured by *Elexa Consumer Products Inc.* with the thing type UID of ```elexa_dmws1_00_000```. 

Dome Leak Sensor


## Channels
The following table summarises the channels available for the DMWS1 Dome Leak Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Alarm (flood) | alarm_flood | alarm_flood | Door | Switch |
| Alarm (general) | alarm_general | alarm_general | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the DMWS1 Dome Leak Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Total Alarm Duration | Total time the Leak Sensor will beep and light its LED in the event of a leak |
| 2: Mute Time | Quiet time between each Reminder Alarm |
| 3: Initial Alarm | Time the Leak Sensor beeps before it is muted |
| 4: Reminder Alarm | Length of each beep after the Initial Alarm |
| 5: Enable/Disable Audible Alarm | Enables or disables the audible alarm (“beeping”) |
| 6: Enable/Disable Water Detection | If disabled, the device will not respond in any way to detected leaks. |
| 7: Basic Set Level | The value sent by the BASIC\_SET command to Association Group 2 |
| 1: Lifeline |  |
| 2: Control | Group to receive BASIC\_SET on leak change |
| 3: Notification |  |
| 4: Sensor Binary |  |


#### 1: Total Alarm Duration

Total time the Leak Sensor will beep and light its LED in the event of a leak  


##### Overview 

0: Leak Sensor beeps until water is removed

1-255: 1-255 minutes


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 120 |


#### 2: Mute Time

Quiet time between each Reminder Alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 1 |


#### 3: Initial Alarm

Time the Leak Sensor beeps before it is muted


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 10 to 255 |
| Default Value | 60 |


#### 4: Reminder Alarm

Length of each beep after the Initial Alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 5 to 255 |
| Default Value | 5 |


#### 5: Enable/Disable Audible Alarm

Enables or disables the audible alarm (“beeping”)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Audible Alarm Disabled (0) |
|  | Audible Alarm Enabled (1) |


#### 6: Enable/Disable Water Detection

If disabled, the device will not respond in any way to detected leaks.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Water Detection Disabled (0) |
|  | Water Detection Enabled (1) |


#### 7: Basic Set Level

The value sent by the BASIC\_SET command to Association Group 2  


##### Overview 

Determines the value to be sent in the Basic Set command to Association Group 2 when a leak is detected


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 255 |


#### 1: Lifeline

  


##### Overview 

Group 1 is the “Lifeline” group, which can hold five members, typically including the main Z-Wave controller.  The Leak Sensor sends this group a Notification Report and a Binary Sensor Report when water is detected or removed.  It also sends this group a Battery Report in reponse to Battery Get commands and a Locally Reset Notification upon local reset.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Control

Group to receive BASIC\_SET on leak change  


##### Overview 

The Leak Sensor sends a Basic Set command to Association Group 2 (or the Control Group) to directly trigger devices (like a light, chime, etc.) in response to a detected leak. Then, after the leak is no longer detected, a BASIC\_SET(0x00) command is sent to reset the device (e.g. turn off the light.) The value of the Basic Set command (e.g. brightness of the lamp) is configured using configuration parameter 7. 


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Notification

  


##### Overview 

Group 3 supports up to 5 members and the Leak Sensor sends it a NOTIFICATION\_REPORT when water is detected or removed


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Sensor Binary

  


##### Overview 

Group 4 supports up to 5 members and the Leak Sensor sends it a SENSOR\_BINARY\_REPORT when water is detected or removed.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/651).
