---
layout: documentation
title: ARZ - ZWave
---

{% include base.html %}

# ARZ Roller Shutter Module
This describes the Z-Wave device *ARZ*, manufactured by *Fakro* with the thing type UID of ```fakro_arz_00_000```.

The device is in the category of Blinds, defining Roller shutters, window blinds, etc..

# Overview

## Channels
The following table summarises the channels available for the ARZ

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 
| Blinds control | blinds_control | Blinds | Rollershutter | 

### Switch
The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Blinds control
The ```blinds_control``` channel supports the ```Rollershutter``` item and is in the ```Blinds``` category.



## Device Configuration
The following table provides a summary of the 0 configuration parameter available in the ARZ.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|

## Association Groups
Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ARZ supports 0 association group.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_VERSION_V1| |

---

Did you spot an error in the above definition or want to improve the content?
You can [edit the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/248).
