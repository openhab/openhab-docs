---
layout: documentation
title: VRCS2-MRZ - ZWave
---

{% include base.html %}

# VRCS2-MRZ Vizia RF + 2-Button Scene Controller with Switches
This describes the Z-Wave device *VRCS2-MRZ*, manufactured by *Leviton* with the thing type UID of ```leviton_vrcs2mrz_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![VRCS2-MRZ product image](https://www.cd-jackson.com/zwave_device_uploads/1039/1039_default.jpg)


## Overview

Leviton VRCS2-MRZ Vizia RF + 2-Button Scene Controller with Switches for Multi-Location Scene Control

### Inclusion Information

There are three different inclusions to be completed with this device. Include the complete switch on the network (Press both buttons simultaneously until both sets of leds start blinking) Include the top button (Press the top button until led starts flashing) Include the bottom (Press the bottom button until the led starts flashing)

### Exclusion Information

Press both buttons simultaneously until both sets of leds start blinking. Exclude device

## Channels

The following table summarises the channels available for the VRCS2-MRZ -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Scene Number | scene_number | scene_number |  | Number | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel and is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel and is of type ```scene_number``` and supports the ```Number``` item.



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The device does not support associations.
## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_SCENE_ACTUATOR_CONF_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_NODE_NAMING_V1| |
| COMMAND_CLASS_HAIL_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [Device Manual](https://www.cd-jackson.com/zwave_device_uploads/1039/450171.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1039).
