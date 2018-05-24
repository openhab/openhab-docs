---
layout: documentation
title: 32563 - ZWave
---

{% include base.html %}

# 32563 Smart Door Sensor
This describes the Z-Wave device *32563*, manufactured by *Jasco Products* with the thing type UID of ```ge_smartdoorsensor_00_000```.

# Overview

## Inclusion Information
1. Follow the instructions for your Z-Wave certified controller to include the device to the Z-Wave network.
2. Once the controller is ready to include your Hinge Pin Smart Door Sensor press and release the manual/program button on the smart switch to include it in the network.

## Exclusion Information
1. Follow the instructions for your Z-Wave certified controller to exclude a device from the Z-Wave network.
2. Once the controller is ready to exclude your device, press and release the manual/program button on the Hinge Pin Smart Door Sensor to exclude it from the network.

You may wish to reset all of your Hinge Pin Smart Door Sensor's settings to their factory defaults. To do this, press the program button 10 times within 6 seconds. If your Door Sensor has been successfully reset, its LED light will blink for 3 seconds. This should only be used in the event your network’s primary controller is missing or otherwise inoperable.

## Wakeup Information
1. Press and hold the Z-wave Button for 6 seconds. It will be wake up and send “Wake Up Notification CC “ to HUB.
2. It will sleep after timeout for 10 seconds, or sleep right away when received the “Wake Up No More Information CC”.

## Channels
The following table summarises the channels available for the 32563

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
The following table provides a summary of the 1 configuration parameter available in the 32563.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 20 | Report Method | Change Open/Close Report Method |

### Parameter 20: Report Method
Change Open/Close Report Method
1. Notification (Default)
2. Basic Set
3. Basic Report
Values in the range 1 to 3 may be set.

The manufacturer defined default value is 1.

This parameter has the configuration ID ```config_20_1``` and is of type ```INTEGER```.


## Association Groups
Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The 32563 supports 3 association groups.

### Group 1: 1
Z-Wave Plus Lifeline
This group supports 5 nodes.

### Group 2: 2
For Control
This group supports 5 nodes.

### Group 3: 3
For Control
This group supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V2| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V4| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

---

Did you spot an error in the above definition or want to improve the content?
You can [edit the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/504).
