---
layout: documentation
title: RGBWE2 - ZWave
---

{% include base.html %}

# RGBWE2 RGBW Bulb V2
This describes the Z-Wave device *RGBWE2*, manufactured by *[Zipato](http://www.zipato.com/)* with the thing type UID of ```zipato_bulb2rgbw_00_000```.

The device is in the category of *Light Bulb*, defining Devices that illuminate something, such as bulbs, etc..

![RGBWE2 product image](https://www.cd-jackson.com/zwave_device_uploads/619/619_default.jpg)


The RGBWE2 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/619) to improve the documentation.

## Channels

The following table summarises the channels available for the RGBWE2 -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Color Control | color_color |  | Color | 
| Color Temperature | color_temperature | ColorLight | Dimmer | 

### Dimmer

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Color Control

The color channel allows to control the color of a light.
            It is also possible to dim values and switch the light on and off.

The ```color_color``` channel supports the ```Color``` item.

### Color Temperature

The color temperature channel allows to set the color
            temperature of a light from 0 (cold) to 100 (warm).

The ```color_temperature``` channel supports the ```Dimmer``` item and is in the ```ColorLight``` category.



## Device Configuration

The following table provides a summary of the 1 configuration parameters available in the RGBWE2.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Internal bulb temperature |  |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 1: Internal bulb temperature



Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.
This is a read only parameter.

### Switch All Mode

Set the mode for the switch when receiving SWITCH ALL commands.

The following option values may be configured -:
| Value  | Description |
|--------|-------------|
| 0 | Exclude from All On and All Off groups |
| 1 | Include in All On group |
| 2 | Include in All Off group |
| 255 | Include in All On and All Off groups |

This parameter has the configuration ID ```switchall_mode``` and is of type ```INTEGER```.


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
| COMMAND_CLASS_SWITCH_MULTILEVEL_V2| |
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_SWITCH_COLOR_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/619/rgbw2-Zipato-RGBW-gen2-Bulb-User-Manual-Z-Wave-v1-2.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/619).
