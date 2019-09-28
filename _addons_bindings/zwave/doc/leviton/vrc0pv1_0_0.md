---
layout: documentation
title: VRC0P (v1) - ZWave
---

{% include base.html %}

# VRC0P (v1) RS-232 Serial Interface
This describes the Z-Wave device *VRC0P (v1)*, manufactured by *Leviton* with the thing type UID of ```leviton_vrc0pv1_00_000```.

The device is in the category of *Remote Control*, defining Any portable or hand-held device that controls the status of something, e.g. remote control, keyfob etc..

![VRC0P (v1) product image](https://www.cd-jackson.com/zwave_device_uploads/883/883_default.png)


The VRC0P (v1) supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Serial interface to z-wave over RS-232. Frequently used for integration with older automation systems and alarm panels.

### Inclusion Information

  1. Plug in VRC0P
  2. Press and hold the button on the front of the VRC0P until it flashes amber
  3. Place your controller in inclusion mode

### Exclusion Information

  1. Press and hold the button on the front of the VRC0P until it flashes amber
  2. Place your controller in exclusion mode

## Channels

The following table summarises the channels available for the VRC0P (v1) -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Scene Number | scene_number | scene_number |  | Number | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.



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
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_NODE_NAMING_V1| |
| COMMAND_CLASS_HAIL_V1| |

### Documentation Links

* [Leviton VRC0P ASCII programming API](https://www.cd-jackson.com/zwave_device_uploads/883/VRC0P-ASCII-Programming-Application-Note.pdf)
* [Leviton VRC0P Instruction Sheet](https://www.cd-jackson.com/zwave_device_uploads/883/Instruction-Sheet-VRC0P.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/883).
