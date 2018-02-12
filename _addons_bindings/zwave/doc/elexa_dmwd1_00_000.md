---
layout: documentation
title: DMWD1 - ZWave
---

{% include base.html %}

# DMWD1 Dome door &amp; window sensor

This describes the Z-Wave device *DMWD1*, manufactured by *Elexa Consumer Products Inc.* with the thing type UID of ```elexa_dmwd1_00_000```. 

Dome door & window sensor


## Channels
The following table summarises the channels available for the DMWD1 Dome door &amp; window sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Alarm (access) | alarm_access | alarm_access | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the DMWD1 Dome door &amp; window sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: BASIC_SET Off Delay | The delay time from when the Door/Window Sensor sends the BASIC\_SET command. |
| 2: BASIC_SET Level | Sets the value sent by the BASIC\_SET command to Association Group 2 |
| 1: Group 1 |  |
| 2: Group 2 |  |
| 3: Group 3 |  |
| 4: Group 4 |  |


#### 1: BASIC_SET Off Delay

The delay time from when the Door/Window Sensor sends the BASIC\_SET command.  


##### Overview 

The delay time from when the Door/Window Sensor sends the BASIC\_SET command to Association Group 2 and when the BASIC\_SET(0) is sent. It accepts a value up to 65,535, in seconds.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_2 |
| Data Type        | INTEGER |
| Range | 1 to 65535 |
| Default Value | 30 |


#### 2: BASIC_SET Level

Sets the value sent by the BASIC\_SET command to Association Group 2


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | 0/Turn Off Device (0) |
|  | Turn On Device (255) |


#### 1: Group 1

  


##### Overview 

Group 1 is the “Lifeline” group, which can hold five members, typically including the main Z-Wave controller. The Door/Window Sensor sends this group a Notification Report and a Binary Sensor Report when it is opened or closed. It also sends this group a Battery Report in response to Battery Get commands.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Group 2

  


##### Overview 

The Door/Window Sensor sends a Basic Set command to Association Group 2 (or the Control Group) to directly trigger devices (like a light, chime, etc.) in response to events. Then, after a preset delay, a BASIC\_ SET(00) command is sent to reset the device (e.g. turn off the light.) The value of the Basic Set command (e.g. brightness of the lamp,) and the delay time before the BASIC\_SET(00) is sent is configured using configuration parameters 1 and 2 respectively. 


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Group 3

  


##### Overview 

Group 3 supports up to 5 members and the Door/Window Sensor sends it a NOTIFICATION\_REPORT when the door either opens or closes.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Group 4

  


##### Overview 

Group 4 supports up to 5 members and the Door/Window Sensor sends it a SENSOR\_BINARY\_REPORT when the door either opens or closes


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/608).
