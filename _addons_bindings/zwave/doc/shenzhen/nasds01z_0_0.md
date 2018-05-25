---
layout: documentation
title: NAS-DS01Z - ZWave
---

{% include base.html %}

# NAS-DS01Z Cyrus Door Window Sensor
This describes the Z-Wave device *NAS-DS01Z*, manufactured by *Shenzhen Neo Electronics Co., Ltd* with the thing type UID of ```shenzhen_nasds01z_00_000```.

# Overview


## Channels

The following table summarises the channels available for the NAS-DS01Z

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

The following table provides a summary of the 2 configuration parameters available in the NAS-DS01Z.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | OFF Delay | Adjust the amount of delay before the OFF command is transmitted. |
| 2 | Basic Set Level |  |

### Parameter 1: OFF Delay

Adjust the amount of delay before the OFF command is transmitted.
Description This configuration parameter that can be used to adjust the amount of delay before the OFF command is transmitted. This parameter can be configured with the value of 0 through 65535, where 0 means send OFF command immediately and 65535 means 65535 seconds of delay.
Values in the range 0 to 65535 may be set.

The manufacturer defined default value is 0.

This parameter has the configuration ID ```config_1_2``` and is of type ```INTEGER```.


### Parameter 2: Basic Set Level



The following option values may be configured, in addition to values in the range -1 to 99 -:

| Value  | Description |
|--------|-------------|
| -1 | ON (Binary Switch Device) |
| 0 | OFF, Alarm cancelling or turning a device off |

The manufacturer defined default value is -1 (ON (Binary Switch Device)).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The NAS-DS01Z supports 4 association groups.

### Group 1: Lifeline

GROUP 1 is lifeline service that assigned to Sensor (Door/Window detector) status – Open/Close
This group supports 5 nodes.

### Group 2: Group 2

GROUP 2 allows for sending control commands to associated devices such as relay module, lighting, etc. This association group is configured through the advanced parameters no. 1 and 2. This Group Support: BASIC\_SET.
This group supports 5 nodes.

### Group 3: Group 3

GROUP 3 allows for Send Notification to associated devices in this group. This Group Support: NOTIFICATION\_REPORT.
This group supports 5 nodes.

### Group 4: Group 4

GROUP 4 allows for Send Notification to associated devices in this group. This Group Support: SENSOR\_BINARY\_REPORT
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
| COMMAND_CLASS_ALARM_V3| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V2| |

---

Did you spot an error in the above definition or want to improve the content?
You can [edit the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/458).
