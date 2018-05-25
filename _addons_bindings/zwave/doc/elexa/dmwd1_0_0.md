---
layout: documentation
title: DMWD1 - ZWave
---

{% include base.html %}

# DMWD1 Dome door & window sensor
This describes the Z-Wave device *DMWD1*, manufactured by *Elexa Consumer Products Inc.* with the thing type UID of ```elexa_dmwd1_00_000```.

The device is in the category of Sensor, defining Device used to measure something.

# Overview


## Channels

The following table summarises the channels available for the DMWD1

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Binary Sensor | sensor_binary | Door | Switch | 
| Alarm (access) | alarm_access | Door | Switch | 

### Binary Sensor

The ```sensor_binary``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Alarm (access)

The ```alarm_access``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 2 configuration parameters available in the DMWD1.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | BASIC_SET Off Delay | The delay time from when the Door/Window Sensor sends the BASIC\_SET command. |
| 2 | BASIC_SET Level | Sets the value sent by the BASIC\_SET command to Association Group 2 |

### Parameter 1: BASIC_SET Off Delay

The delay time from when the Door/Window Sensor sends the BASIC\_SET command.
The delay time from when the Door/Window Sensor sends the BASIC\_SET command to Association Group 2 and when the BASIC\_SET(0) is sent. It accepts a value up to 65,535, in seconds.
Values in the range 1 to 65535 may be set.

The manufacturer defined default value is 30.

This parameter has the configuration ID ```config_1_2``` and is of type ```INTEGER```.


### Parameter 2: BASIC_SET Level

Sets the value sent by the BASIC\_SET command to Association Group 2

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | 0/Turn Off Device |
| 255 | Turn On Device |

The manufacturer defined default value is 255 (Turn On Device).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The DMWD1 supports 4 association groups.

### Group 1: Group 1


This group supports 5 nodes.

### Group 2: Group 2 


This group supports 5 nodes.

### Group 3: Group 3


This group supports 5 nodes.

### Group 4: Group 4


This group supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V2| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

---

Did you spot an error in the above definition or want to improve the content?
You can [edit the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/608).
