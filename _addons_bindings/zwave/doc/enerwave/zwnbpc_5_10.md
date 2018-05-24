---
layout: documentation
title: ZWN-BPC-PLUS - ZWave
---

{% include base.html %}

# ZWN-BPC-PLUS PIR Sensor
This describes the Z-Wave device *ZWN-BPC-PLUS*, manufactured by *Wenzhou MTLC Electric Appliances Co.,Ltd.* with the thing type UID of ```enerwave_zwnbpc_05_010```.
This version of the device is limited to firmware versions above 5.10

The device is in the category of Motion Detector, defining Motion sensors/detectors.

# Overview

## Channels
The following table summarises the channels available for the ZWN-BPC-PLUS

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Binary Sensor | sensor_binary | Door | Switch | 
| Alarm (burglar) | alarm_burglar | Door | Switch | 

### Binary Sensor
The ```sensor_binary``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Alarm (burglar)
The ```alarm_burglar``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |



## Device Configuration
The following table provides a summary of the 1 configuration parameter available in the ZWN-BPC-PLUS.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Motion timeout | Multiplier to wakeup timer interval |

### Parameter 1: Motion timeout
Multiplier to wakeup timer interval
It is minimum time when the associated nodes keep turn on

n:1-7 (n\*WAKE\_UP\_INTERVAL)
Values in the range 1 to 7 may be set.

The manufacturer defined default value is 1.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


## Association Groups
Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZWN-BPC-PLUS supports 4 association groups.

### Group 1: Lifeline

This group supports 1 nodes.

### Group 2: Basic Report

This group supports 5 nodes.

### Group 3: Notification Report

This group supports 5 nodes.

### Group 4: Basic Set

This group supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V0| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V4| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

---

Did you spot an error in the above definition or want to improve the content?
You can [edit the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/795).
