---
layout: documentation
title: ZCOMBO - ZWave
---

{% include base.html %}

# ZCOMBO Smoke and Carbon Monoxide Alarm
This describes the Z-Wave device *ZCOMBO*, manufactured by *BRK Brands, Inc.* with the thing type UID of ```brk_zcombo_00_000```.

# Overview

## Channels
The following table summarises the channels available for the ZCOMBO

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Heartbeat | alarm_general | Door | Switch | 
| Smoke | alarm_smoke | Door | Switch | 

### Heartbeat
The ```alarm_general``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |

### Smoke
The ```alarm_smoke``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |



## Device Configuration
The following table provides a summary of the 1 configuration parameter available in the ZCOMBO.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Send double alarms | Causes the device to send double alarm messages |

### Parameter 1: Send double alarms
Causes the device to send double alarm messages

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Single Alarm |
| 1 | Double Alarm |

The manufacturer defined default value is 0 (Single Alarm).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


## Association Groups
Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZCOMBO supports 1 association group.

### Group 1: Group 1

This group supports 1 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V1| Linked to BASIC|
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

---

Did you spot an error in the above definition or want to improve the content?
You can [edit the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/238).
