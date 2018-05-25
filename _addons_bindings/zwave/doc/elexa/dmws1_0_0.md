---
layout: documentation
title: DMWS1 - ZWave
---

{% include base.html %}

# DMWS1 Dome Leak Sensor
This describes the Z-Wave device *DMWS1*, manufactured by *Elexa Consumer Products Inc.* with the thing type UID of ```elexa_dmws1_00_000```.

# Overview


## Channels

The following table summarises the channels available for the DMWS1

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Binary Sensor | sensor_binary | Door | Switch | 
| Alarm (flood) | alarm_flood | Door | Switch | 
| Alarm (general) | alarm_general | Door | Switch | 

### Binary Sensor

The ```sensor_binary``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Alarm (flood)

The ```alarm_flood``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |

### Alarm (general)

The ```alarm_general``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 7 configuration parameters available in the DMWS1.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Total Alarm Duration | Total time the Leak Sensor will beep and light its LED in the event of a leak |
| 2 | Mute Time | Quiet time between each Reminder Alarm |
| 3 | Initial Alarm | Time the Leak Sensor beeps before it is muted |
| 4 | Reminder Alarm | Length of each beep after the Initial Alarm |
| 5 | Enable/Disable Audible Alarm | Enables or disables the audible alarm (“beeping”) |
| 6 | Enable/Disable Water Detection | If disabled, the device will not respond in any way to detected leaks. |
| 7 | Basic Set Level | The value sent by the BASIC\_SET command to Association Group 2 |

### Parameter 1: Total Alarm Duration

Total time the Leak Sensor will beep and light its LED in the event of a leak
0: Leak Sensor beeps until water is removed

1-255: 1-255 minutes
Values in the range 0 to 255 may be set.

The manufacturer defined default value is 120.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Mute Time

Quiet time between each Reminder Alarm

Values in the range 1 to 255 may be set.

The manufacturer defined default value is 1.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Initial Alarm

Time the Leak Sensor beeps before it is muted

Values in the range 10 to 255 may be set.

The manufacturer defined default value is 60.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Reminder Alarm

Length of each beep after the Initial Alarm

Values in the range 5 to 255 may be set.

The manufacturer defined default value is 5.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Enable/Disable Audible Alarm

Enables or disables the audible alarm (“beeping”)

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Audible Alarm Disabled |
| 1 | Audible Alarm Enabled |

The manufacturer defined default value is 1 (Audible Alarm Enabled).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Enable/Disable Water Detection

If disabled, the device will not respond in any way to detected leaks.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Water Detection Disabled |
| 1 | Water Detection Enabled |

The manufacturer defined default value is 1 (Water Detection Enabled).

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Basic Set Level

The value sent by the BASIC\_SET command to Association Group 2
Determines the value to be sent in the Basic Set command to Association Group 2 when a leak is detected
Values in the range 0 to 255 may be set.

The manufacturer defined default value is 255.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The DMWS1 supports 4 association groups.

### Group 1: Lifeline


This group supports 5 nodes.

### Group 2: Control

Group to receive BASIC\_SET on leak change
This group supports 5 nodes.

### Group 3: Notification


This group supports 5 nodes.

### Group 4: Sensor Binary 


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
You can [edit the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/651).
