---
layout: documentation
title: VRPD3 - ZWave
---

{% include base.html %}

# VRPD3 Scene Capable Plug-in Dimmer
This describes the Z-Wave device *VRPD3*, manufactured by *Leviton* with the thing type UID of ```leviton_vrpd3_00_000```.

# Overview

## Channels
The following table summarises the channels available for the VRPD3

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Dimmer | switch_dimmer | DimmableLight | Dimmer | 

### Dimmer
The ```switch_dimmer``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.



## Device Configuration
The following table provides a summary of the 0 configuration parameter available in the VRPD3.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|

## Association Groups
Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The VRPD3 supports 1 association group.

### Group 1: Group 1

This group supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V0| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V0| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_METER_V0| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

---

Did you spot an error in the above definition or want to improve the content?
You can [edit the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/199).
