---
layout: documentation
title: ZRTSI-VNODE - ZWave
---

{% include base.html %}

# ZRTSI-VNODE Z-Wave to RTS Interface Virtual Node
This describes the Z-Wave device *ZRTSI-VNODE*, manufactured by *[Somfy](http://www.somfy.com/)* with the thing type UID of ```somfy_zrtsivnode_00_000```.

![ZRTSI-VNODE product image](https://www.cd-jackson.com/zwave_device_uploads/370/370_default.jpg)


## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/370) to improve the documentation.

## Channels

The following table summarises the channels available for the ZRTSI-VNODE -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 
| Blinds control | blinds_control | Blinds | Rollershutter | 
| Scene Number | scene_number |  | Number | 

### Switch

Switch the power on and off.

The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Blinds control

Provides start / stop control of blinds.

The ```blinds_control``` channel supports the ```Rollershutter``` item and is in the ```Blinds``` category.

### Scene Number

Triggers when a scene button is pressed.

The ```scene_number``` channel supports the ```Number``` item.



## Device Configuration

The device has no configuration parameters configured.

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
