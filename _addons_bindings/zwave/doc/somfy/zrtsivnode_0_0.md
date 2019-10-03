---
layout: documentation
title: ZRTSI-VNODE - ZWave
---

{% include base.html %}

# ZRTSI-VNODE Z-Wave to RTS Interface Virtual Node
This describes the Z-Wave device *ZRTSI-VNODE*, manufactured by *[Somfy](http://www.somfy.com/)* with the thing type UID of ```somfy_zrtsivnode_00_000```.

The device is in the category of *Blinds*, defining Roller shutters, window blinds, etc..

![ZRTSI-VNODE product image](https://www.cd-jackson.com/zwave_device_uploads/370/370_default.jpg)


## Overview

The Somfy Z-Wave to Radio Technology Somfy Interface (ZRTSI) is a Z-Wave bridge controller that receives Z-Wave transmissions and translates them to motor control commands for Somfy's range of Radio Technology Somfy (RTS) motors. The ZRTSI resides as a bridge controller node within a Z-Wave Network and becomes a repeating node in the mesh network. The ZRTSI also features Network Wide Inclusion (NWI) which allows inclusion and exclusion to take advantage of the mesh topology of Z-Wave networks. Z-wave devices from all manufacturers can be used in the same network togethe

### Inclusion Information

  1. From the ZRTSI's Home Screen, navigate to the Base Node Include screen.
  2. Enable Inclusion Mode on the Primary Z-Wave Controller.
  3. On the ZRTSI, Activate the “Base Node Include” command by pressing the Select Button.
  4. The LCD Screen will display “BASE NODE INCLUDING” then either “BASE INCLUDE SUCCESS!” or “BASE INCLUDE FAIL” and return to the Base Node Sub Menu.  

### Exclusion Information

  1. Enable the Exclusion Mode on the Primary Z-Wave Controller.
  2. From the ZRTSI's Home Screen, navigate to the Base Node Exclude screen
  3. Activate the “Base Node Exclude” command by pressing the Select Button.
  4. The LCD Screen will display “BASE NODE EXCLUDING” and then either “BASE EXCLUDE SUCCESS!” or “BASE EXCLUDE FAIL” and return to the Base Node Sub Menu. 

## Channels

The following table summarises the channels available for the ZRTSI-VNODE -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Blinds control | blinds_control | blinds_control | Blinds | Rollershutter | 
| Scene Number | scene_number | scene_number |  | Number | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Blinds control
Provides start / stop control of blinds.

The ```blinds_control``` channel is of type ```blinds_control``` and supports the ```Rollershutter``` item and is in the ```Blinds``` category.

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
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/370/ZRTSI-Instructions-1811265.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/370).
