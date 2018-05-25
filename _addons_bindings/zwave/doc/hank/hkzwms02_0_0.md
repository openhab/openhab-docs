---
layout: documentation
title: HKZW_MS02 - ZWave
---

{% include base.html %}

# HKZW\_MS02 Motion Sensor
This describes the Z-Wave device *HKZW_MS02*, manufactured by *Hank* with the thing type UID of ```hank_hkzwms02_00_000```.

The device is in the category of Sensor, defining Device used to measure something.

# Overview


## Channels

The following table summarises the channels available for the HKZW_MS02

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Alarm (burglar) | alarm_burglar | Door | Switch | 

### Alarm (burglar)

The ```alarm_burglar``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 5 configuration parameters available in the HKZW_MS02.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 12 | Motion Sensor`s Sensitivity | The higher the value,the more sensitive the PIR sensor |
| 14 | Enable/Disable Basic Set Command | The motion Sensor can reverse its value of BASIC SET when motion is triggered |
| 15 | value of basic set command | assigned to send Basic Set Command |
| 17 | enable/disable shock alarm |  |
| 32 | Level of low battery | Define a battery level ad the "low battery" |

### Parameter 12: Motion Sensor`s Sensitivity

The higher the value,the more sensitive the PIR sensor

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | 0 |
| 1 | 1 |
| 2 | 2 |

The manufacturer defined default value is 8.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 14: Enable/Disable Basic Set Command

The motion Sensor can reverse its value of BASIC SET when motion is triggered

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable |
| 1 | enable |

The manufacturer defined default value is 0 (Disable).

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.


### Parameter 15: value of basic set command

assigned to send Basic Set Command

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable |
| 1 | Enable |

The manufacturer defined default value is 0 (Disable).

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 17: enable/disable shock alarm



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable |
| 1 | enable |

The manufacturer defined default value is 0 (Disable).

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 32: Level of low battery

Define a battery level ad the "low battery"

Values in the range 10 to 50 may be set.

The manufacturer defined default value is 20.

This parameter has the configuration ID ```config_32_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The HKZW_MS02 supports 2 association groups.

### Group 1: report the motion detection and battery level


This group supports 5 nodes.

### Group 2: assigned to send BASIC SET command


This group supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V5| Linked to BASIC|
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

---

Did you spot an error in the above definition or want to improve the content?
You can [edit the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/676).
