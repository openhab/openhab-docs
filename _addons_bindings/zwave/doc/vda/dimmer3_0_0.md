---
layout: documentation
title: Vitrum III EU Dimmer - ZWave
---

{% include base.html %}

# Vitrum III EU Dimmer
This describes the Z-Wave device *Vitrum III EU Dimmer*, manufactured by *VDA* with the thing type UID of ```vda_dimmer3_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![Vitrum III EU Dimmer product image](https://www.cd-jackson.com/zwave_device_uploads/475/475_default.jpg)


The Vitrum III EU Dimmer supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

When the device is in the stand-alone mode and is not included in a Z-Wave network the illuminated ring around the touch keys will light red for a moment when passing from one mode to another.

### Inclusion Information

With the controller in the inclusion mode, press any of the touch keys on the device.

### Exclusion Information

Press and hold the leftmost touch key for at least 8 seconds. The device will flash red three times and sound an acoustic signal to indicate that the original factory setting has been restored.

## Channels

The following table summarises the channels available for the Vitrum III EU Dimmer -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Dimmer 1 | switch_dimmer1 | switch_dimmer | DimmableLight | Dimmer | 
| Dimmer 2 | switch_dimmer2 | switch_dimmer | DimmableLight | Dimmer | 
| Dimmer 3 | switch_dimmer3 | switch_dimmer | DimmableLight | Dimmer | 

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Dimmer 1
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer1``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Dimmer 2
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer2``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Dimmer 3
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer3``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Vitrum III EU Dimmer supports 3 association groups.

### Group 1: Switch channel 1


Association group 1 supports 5 nodes.

### Group 2: Dimmer Channel 2


Association group 2 supports 5 nodes.

### Group 3: Dimmer Channel 3


Association group 3 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_NODE_NAMING_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_INDICATOR_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V1| |
| COMMAND_CLASS_MANUFACTURER_PROPRIETARY_V1| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| Linked to BASIC|
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| Linked to BASIC|
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 3

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| Linked to BASIC|
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [Datasheet](https://www.cd-jackson.com/zwave_device_uploads/475/Vitrum-III-EU-Dimmer-Wireless1-datasheet.pdf)
* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/475/a28c244860f3d1fa1f8637c47351c45d85d3c9e4.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/475).
