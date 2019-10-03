---
layout: documentation
title: RGBWE2 - ZWave
---

{% include base.html %}

# RGBWE2 RGBW Bulb V2
This describes the Z-Wave device *RGBWE2*, manufactured by *[Zipato](http://www.zipato.com/)* with the thing type UID of ```zipato_bulb2rgbw_00_000```.

The device is in the category of *Light Bulb*, defining Devices that illuminate something, such as bulbs, etc..

![RGBWE2 product image](https://www.cd-jackson.com/zwave_device_uploads/619/619_default.jpg)


The RGBWE2 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Zipato Bulb 2 has 5 color channels available for you to adjust: RED, GREEN, BLUE, WARM WHITE and COLD WHITE. Zipato Bulb 2 can be used to add color to your home or just to lighten it up in any white color tone you desire. By using Zipatile or Zipabox (or other Z-Wave) home controller, you can control the bulb from anywhere in the world, by using any smartphone (iOS or Android). Also, you can automatically set colors of your Zipato Bulb 2 to indicate events using the Zipato rule creator.

### Inclusion Information

  1. Screw the Zipato Bulb 2 into the socket.
  2. Turn on the bulb with your wall switch to apply power to the bulb.- If you’re not using a wall switch, then use your alternate method to apply power to the bulb.
  3. Activate inclusion mode on your Z-wave controller- This may also be done through your associated application,if your ecosystem has that capability.
  4. Toggle the wall-switch, from OFF, then to ON.- Or use your alternate method to toggle power to the bulb from OFF, then to ON.
  5. The bulb will flash once if it has been successfully included into your Z-Wave network.

### Exclusion Information

  1. Screw the Zipato Bulb 2 into the socket.
  2. Turn on the bulb with your wall switch to apply power to the bulb.- If you’re not using a wall switch, then use your alternate method to apply power to the bulb.
  3. Activate exclusion mode on your Z-wave controller- This may also be done through your associated application,if your ecosystem has that capability.
  4. Toggle the wall-switch, from OFF, then to ON.- Or use your alternate method to toggle power to the bulb from OFF, then to ON.
  5. The bulb will flash once if it has been successfully excluded from your Z-Wave network.

## Channels

The following table summarises the channels available for the RGBWE2 -:

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

The following table provides a summary of the 5 configuration parameters available in the RGBWE2.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Internal bulb temperature |  |
| 2 | Strobe light interval | Strobe light interval |
| 3 | Strobe light pulse count | Strobe light pulse count |
| 4 | Random strobe pulse colors | Random strobe pulse colors |
| 255 | Reset bulb to factory settings | Reset bulb to factory settings |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 1: Internal bulb temperature



Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 2: Strobe light interval

Strobe light interval
Values range from 0 to 25 in intervals of 100 ms
Values in the range 0 to 25 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Strobe light pulse count

Strobe light pulse count
Values range from 0 to 120 and 

a special value 127 (0x7F) which sets infinite flashing
The following option values may be configured, in addition to values in the range 0 to 127 -:

| Value  | Description |
|--------|-------------|
| 127 | Infinite flashing |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Random strobe pulse colors

Random strobe pulse colors
Values range are 0(turn off) or 1(turn on).
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Random strobe pulse colors OFF |
| 1 | Random strobe pulse colors ON |

The manufacturer defined default value is ```0``` (Random strobe pulse colors OFF).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 255: Reset bulb to factory settings

Reset bulb to factory settings

The following option values may be configured, in addition to values in the range 1 to 255 -:

| Value  | Description |
|--------|-------------|
| 255 | Reset bulb to factory settings |

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_255_4_wo``` and is of type ```INTEGER```.
This is a write only parameter.

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
* [Manual v1.3](https://www.cd-jackson.com/zwave_device_uploads/619/rgbw2-Zipato-RGBW-gen2-Bulb-User-Manual-Z-Wave-v1-3.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/619).
