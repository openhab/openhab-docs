---
layout: documentation
title: RGBWE27ZW - ZWave
---

{% include base.html %}

# RGBWE27ZW RGBW bulb
This describes the Z-Wave device *RGBWE27ZW*, manufactured by *[Zipato](http://www.zipato.com/)* with the thing type UID of ```zipato_rgbwe27zw_00_000```.

The device is in the category of *Light Bulb*, defining Devices that illuminate something, such as bulbs, etc..

![RGBWE27ZW product image](https://www.cd-jackson.com/zwave_device_uploads/237/237_default.png)


The RGBWE27ZW supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/237) to improve the documentation.

## Channels

The following table summarises the channels available for the RGBWE27ZW -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Color Control | color_color | color_color | ColorLight | Color | 
| Color Temperature | color_temperature | color_temperature | ColorLight | Dimmer | 

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Color Control
The color channel allows to control the color of a light.
            It is also possible to dim values and switch the light on and off.

The ```color_color``` channel is of type ```color_color``` and supports the ```Color``` item and is in the ```ColorLight``` category.

### Color Temperature
The color temperature channel allows to set the color
            temperature of a light from 0 (cold) to 100 (warm).

The ```color_temperature``` channel is of type ```color_temperature``` and supports the ```Dimmer``` item and is in the ```ColorLight``` category.



## Device Configuration

The following table provides a summary of the 5 configuration parameters available in the RGBWE27ZW.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Color temperature | Values range from 0 to 100 where 0 is cold white and 100 is warm white. |
| 2 | Shock sensor sensitivity | Range from 0 to 31 where 0 is minimum sensitivity and 31 is maximum sensitivity. |
| 3 | Strobe Light Interval | Values range from 0 to 25 in intervals of 100 milliseconds. |
| 4 | Strobe Light Pulse Count | Values range from 0 to 250 and a special value 255 which sets infinite flashing. |
| 5 | Enable or Disable Random Strobe Pulse Colors | Values range are 0 (turn on) or 1 (turn off). |

### Parameter 1: Color temperature

Values range from 0 to 100 where 0 is cold white and 100 is warm white.

Values in the range 1 to 100 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Shock sensor sensitivity

Range from 0 to 31 where 0 is minimum sensitivity and 31 is maximum sensitivity.

Values in the range 0 to 31 may be set.

The manufacturer defined default value is ```16```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Strobe Light Interval

Values range from 0 to 25 in intervals of 100 milliseconds.

Values in the range 0 to 25 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Strobe Light Pulse Count

Values range from 0 to 250 and a special value 255 which sets infinite flashing.

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Enable or Disable Random Strobe Pulse Colors

Values range are 0 (turn on) or 1 (turn off).

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | turn off |
| 1 | turn on |

The manufacturer defined default value is ```0``` (turn off).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The RGBWE27ZW supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 7 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V2| Linked to BASIC|
| COMMAND_CLASS_SWITCH_COLOR_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [English User Manual V1.0](https://www.cd-jackson.com/zwave_device_uploads/237/zipabox-rgbw-bulb-manual.pdf)
* [English Manual V1.1](https://www.cd-jackson.com/zwave_device_uploads/237/rgbwe27zw-Zipato-RGBW-Bulb-User-Manual-v1-1.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/237).
