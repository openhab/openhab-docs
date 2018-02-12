---
layout: documentation
title: DMMZ1 - ZWave
---

{% include base.html %}

# DMMZ1 Dome Battery powered Z-Wave Plus enabled mousetrap

This describes the Z-Wave device *DMMZ1*, manufactured by *Elexa Consumer Products Inc.* with the thing type UID of ```elexa_dmmz1_00_000```. 

Dome Battery powered Z-Wave Plus enabled mousetrap


## Channels
The following table summarises the channels available for the DMMZ1 Dome Battery powered Z-Wave Plus enabled mousetrap.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Alarm | alarm_general | alarm_general | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the DMMZ1 Dome Battery powered Z-Wave Plus enabled mousetrap.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: BASIC_SET Level | Sets the value sent by the BASIC\_SET command to Association Group 2 |
| 2: Set Firing Mode | This parameter sets the “firing mode” of the Mouser. |
| 3: High Voltage Duration Time | How long the Mouser will fire continuously before it starts to burst-fire |
| 4: Enable/Disable LED Alarm | Enables or disables the indicator LED alarm when the trap is tripped |
| 5: LED Alarm Duration | Sets the amount of time the LED Indicator blinks after the trap is tripped |
| 1: Group 1 |  |
| 2: Group 2 |  |
| 3: Group 3 |  |
| 4: Group 4 |  |


#### 1: BASIC_SET Level

Sets the value sent by the BASIC\_SET command to Association Group 2  


##### Overview 

This parameter sets the value sent by the BASIC\_SET command to Association Group 2 (for more information, see “Assocation Groups”.)

00 (0/Turn Off Device)

01 ~ 63 (0-99)

FF (255/Turn On Device)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 255 |


#### 2: Set Firing Mode

This parameter sets the “firing mode” of the Mouser.  


##### Overview 

This parameter sets “firing mode” of the Mouser. Two firing modes are available: in the first (Continuous Fire,) electricity is passed continuously for the entire duration, and in the second (Burst Fire,) electricity is passed continuously only for the first minute and it is pulsed at approximately 400 beats per minute for the remainder of the time.

01 (Continuous Fire)

02 (Burst Fire)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | Continuous Fire (1) |
|  | Burst Fire (2) |


#### 3: High Voltage Duration Time

How long the Mouser will fire continuously before it starts to burst-fire  


##### Overview 

This parameter defines how long the Mouser will fire continuously before it starts to burst-fire (see parameter 2.)

00 64 ~ 01 68 (100~360 in Seconds)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_2 |
| Data Type        | INTEGER |
| Range | 64 to 168 |
| Default Value | 64 |


#### 4: Enable/Disable LED Alarm

Enables or disables the indicator LED alarm when the trap is tripped  


##### Overview 

This parameter enables or disables the indicator LED alarm when the trap is tripped.

00 (LED Alarm Disabled)

01 (LED Alarm Enabled)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | LED Alarm Disabled (0) |
|  | LED Alarm Enabled (1) |


#### 5: LED Alarm Duration

Sets the amount of time the LED Indicator blinks after the trap is tripped  


##### Overview 

This parameter sets the amount of time the LED Indicator blinks after the trap is tripped.

00 (LED Alarm Blinks Until Trap is Cleared)

01~FF (1~255 in Hours)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 1: Group 1

  


##### Overview 

Group 1 is the “Lifeline” group, which can hold five members, typically including the main Z-Wave controller. The Door/Window Sensor sends this group a Notification Report and a Binary Sensor Report when it is tripped, reset, armed, and disarmed. It also sends this group a Battery Report in response to Battery Get commands.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Group 2

  


##### Overview 

The Mouser sends a Basic Set command to Association Group 2 (or the Control Group) to directly trigger devices (like a light, chime, etc.) when it is tripped. After the trap is reset, a BASIC\_SET(00) command is sent to reset the device (e.g. turn off the light.) The value of the Basic Set command (e.g. brightness of the lamp) is configured using configuration parameter 1.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Group 3

  


##### Overview 

Group 3 supports up to 5 members and the Mouser sends it a NOTIFICATION\_REPORT when tripped, reset, armed, and disarmed.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Group 4

  


##### Overview 

Group 4 supports up to 5 members and the Mouser sends it a SENSOR\_BINARY\_REPORT when tripped, reset, armed, and disarmed.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/684).
