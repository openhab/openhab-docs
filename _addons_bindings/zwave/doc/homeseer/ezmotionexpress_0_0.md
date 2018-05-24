---
layout: documentation
title: EZMotion Express - ZWave
---

{% include base.html %}

# EZMotion Express Wireless 3-in-1 Sensor
This describes the Z-Wave device *EZMotion Express*, manufactured by *Express Controls* with the thing type UID of ```homeseer_ezmotionexpress_00_000```.

# Overview

## Channels
The following table summarises the channels available for the EZMotion Express

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Motion Sensor | alarm_motion | Door | Switch | 
| Illumination Sensor | sensor_luminance2 | Temperature | Number | 
| Temperature Sensor | sensor_temperature3 | Temperature | Number | 

### Motion Sensor
The ```alarm_motion``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |

### Illumination Sensor
The ```sensor_luminance2``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Temperature Sensor
The ```sensor_temperature3``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.



## Device Configuration
The following table provides a summary of the 6 configuration parameters available in the EZMotion Express.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Sensitivity | Sensitivity sets the amount of motion required for EZMotion to detect motion. |
| 2 | On Time | Sets the number of minutes the lights stay on when motion has not been detected. |
| 3 | LED On/Off | LED ON/OFF turns the LED on or off. |
| 4 | Light Threshold | Light Threshold is the % of light above which the lights will not be turned on. |
| 5 | Stay Awake | Setting Stay Awake value |
| 6 | On Value | The value sent by the Z-Wave BASIC\_SET command when motion is detected. |

### Parameter 1: Sensitivity
Sensitivity sets the amount of motion required for EZMotion to detect motion.
Sensitivity sets the amount of motion required for EZMotion to detect motion. A higher value makes it more sensitive and a lower value makes it less sensitive. Note that values above 200 are not recommended when EZMotion is battery operated.

Recommended values:

10 = Pet Immune  
 100 = Medium sensitivity for hallways  
 200 = Highly sensitive for rooms where people are sitting still
Values in the range 0 to 255 may be set.

The manufacturer defined default value is 200.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: On Time
Sets the number of minutes the lights stay on when motion has not been detected.
On Time sets the number of minutes that the lights stay on when motion has not been detected.  
 A value of 0 On Time is a special mode where the lights are constantly sent a command to turn them on whenever motion is detected. EZMotion will NOT turn the lights off in this mode. Note that this mode will significantly shorten battery life.

Recommended values:

5 min for hallways  
 20 min for an office environment  
 60 min for a library or other room where someone may be sitting still for a long time
Values in the range 0 to 255 may be set.

The manufacturer defined default value is 20.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: LED On/Off
LED ON/OFF turns the LED on or off.
LED ON/OFF turns the LED on or off. A slight improvement in battery life is obtained by turning the LED off. Setting LED ON/OFF to zero will turn the LED off and 255 turns it on.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Off |
| 255 | On |

The manufacturer defined default value is 255 (On).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Light Threshold
Light Threshold is the % of light above which the lights will not be turned on.
Light Threshold is the percentage of light in the room above which the lights will not be turned on. Light Threshold is often used in room with a lot of natural daylight. Setting Light Threshold to a value of 50% will cause EZMotion to not turn the lights on when the natural light in the room is already at the 50% value. This feature only prevents the lights from coming on when motion is first detected and the light level in the room is already above Light Threshold. It will not turn the lights off when the amount of natural light in the room increases. It will automatically turn on the lights in a room that has motion in it and that the amount of natural light has dropped below Light Threshold.

A value of 100% turns off this feature.

Recommended values:

Usually a value between 40% and 60% will prevent the lights from coming on in a reasonably well light room and will turn them on as it is getting dark. Some experimentation is required with each room to determine the proper setting.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is 100.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Stay Awake
Setting Stay Awake value
Setting Stay Awake to a non-zero value will cause EZMotion to always be awake. NOTE: this mode should NOT be used when EZMotion is battery powered! Batteries will only last a few days in this mode.

Stay Awake is NOT set to the factory default (0) when EZMotion is Excluded (reset) from the Z-Wave network.  
 Setting Stay Awake to a non-zero value will cause the Z-Wave Listening Bit to be set. EZMotion will become a routing node in the Z-Wave Mesh-Network when the Listening Bit is set.

To properly have EZMotion included in the routing tables, set Stay Awake to a non-zero value, then reset EZMotion (Exclude from the network), then add it back to the network. The new routing information will be used now that the listening bit is set.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is 0.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: On Value
The value sent by the Z-Wave BASIC\_SET command when motion is detected.
On Value is the value sent by the Z-Wave BASIC\_SET command when motion is detected.  
 A value of 0 will turn the lights off (not recommended).  
 A value between 1 and 100 will set the dim level to between 1% and 100%.

A value of 255 will turn the light on.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is 255.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


## Association Groups
Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The EZMotion Express supports 1 association group.

### Group 1: Association Group

This group supports 4 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| Linked to BASIC|
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_MULTI_CHANNEL_V0| |
| COMMAND_CLASS_CONFIGURATION_V0| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V0| |
| COMMAND_CLASS_NODE_NAMING_V0| |
| COMMAND_CLASS_BATTERY_V0| |
| COMMAND_CLASS_WAKE_UP_V0| |
| COMMAND_CLASS_ASSOCIATION_V0| |
| COMMAND_CLASS_VERSION_V0| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SENSOR_MULTILEVEL_V0| |
| COMMAND_CLASS_MULTI_CHANNEL_V0| |
| COMMAND_CLASS_CONFIGURATION_V0| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V0| |
| COMMAND_CLASS_NODE_NAMING_V0| |
| COMMAND_CLASS_BATTERY_V0| |
| COMMAND_CLASS_WAKE_UP_V0| |
| COMMAND_CLASS_ASSOCIATION_V0| |
| COMMAND_CLASS_VERSION_V0| |
#### Endpoint 3

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SENSOR_MULTILEVEL_V0| |
| COMMAND_CLASS_MULTI_CHANNEL_V0| |
| COMMAND_CLASS_CONFIGURATION_V0| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V0| |
| COMMAND_CLASS_NODE_NAMING_V0| |
| COMMAND_CLASS_BATTERY_V0| |
| COMMAND_CLASS_WAKE_UP_V0| |
| COMMAND_CLASS_ASSOCIATION_V0| |
| COMMAND_CLASS_VERSION_V0| |

---

Did you spot an error in the above definition or want to improve the content?
You can [edit the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/140).
