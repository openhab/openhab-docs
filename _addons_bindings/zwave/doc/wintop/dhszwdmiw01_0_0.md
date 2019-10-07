---
layout: documentation
title: DHSZWDMIW01 - ZWave
---

{% include base.html %}

# DHSZWDMIW01 DHS Z-Wave Micro Dimmer
This describes the Z-Wave device *DHSZWDMIW01*, manufactured by *Wintop* with the thing type UID of ```wintop_dhszwdmiw01_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![DHSZWDMIW01 product image](https://www.cd-jackson.com/zwave_device_uploads/398/398_default.png)


The DHSZWDMIW01 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The DHS In-Wall Dimmer DHS-ZW-DMIW-01 is eff ective Z-Wave dimming device specifi cally designed for use in smart homes and offi ces. The product allows to dim and switch on/off attached lighting wirelessly using a Z-wave enabled (AUS/NZ version 921.42 MHz) controllers (compatible universal remote controllers, control panels, gateways, PC with Z-Wave USB dongle) or manually via connected manual switch.

The dimmer can act as a wireless repeater to ensure that commands intended for another device in the network are received. This is useful to eliminate “RF deadspots” when the radio range of the Z-Wave network is infl uenced. This function is part of the Z-Wave network functionality and is set up via Z-Wave controller.

### Inclusion Information

press and release the round button on the product’s enclosure

### Exclusion Information

press and release the round button on the product’s enclosure

## Channels

The following table summarises the channels available for the DHSZWDMIW01 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Scene Number | scene_number | scene_number |  | Number | 

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
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| |
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [Z-Wave InWall Dimmer User Guide](https://www.cd-jackson.com/zwave_device_uploads/398/Z-Wave-InWall-Dimmer-User-Manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/398).
