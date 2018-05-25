---
layout: documentation
title: Forest Shuttle S/L, Forest Group NL - ZWave
---

{% include base.html %}

# Forest Shuttle S/L, Forest Group NL Drapery hardware
This describes the Z-Wave device *Forest Shuttle S/L, Forest Group NL*, manufactured by *Forest Group Nederland B.V* with the thing type UID of ```forest_forestshuttlesl_00_000```.

# Overview

Role type: always on slave

Node type: z-wave plus node

## Inclusion Information

Set your main controller into learn mode. Press configuration button 3 times. Led 3 is ON. Press and hold once more for 4 seconds, led will start blinking for 10 seconds. The Shuttle Z-wave motor will be detected and included into the Z-wave network of your controller.

## Exclusion Information

To exclude, set your main controller into exclude mode. Press configuration button 3 times. Led 3 is ON. Press and hold once more for 4 seconds, led will start blinking for 10 seconds. The Shuttle Z-wave motor will be detected and excluded into the Z-wave network of your controller.

You can also reset the device, but only use this if your main controller is not operable. For reset, press the config button 25 times and confirm by pressing the button once more for 4 seconds until the led blinks 3 times and goes off.

## Wakeup Information

Not specified

## Channels

The following table summarises the channels available for the Forest Shuttle S/L, Forest Group NL

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 
| Dimmer | switch_dimmer | DimmableLight | Dimmer | 

### Switch

The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer

The ```switch_dimmer``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.



## Device Configuration

The device has no configuration parameters configugured.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Forest Shuttle S/L, Forest Group NL supports 1 association group.

### Group 1: lifeline


This group supports 1 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

---

Did you spot an error in the above definition or want to improve the content?
You can [edit the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/510).
