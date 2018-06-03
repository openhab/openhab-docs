---
layout: documentation
title: ZV9102FA-CCT - ZWave
---

{% include base.html %}

# ZV9102FA-CCT Z-wave CCT LED controller
This describes the Z-Wave device *ZV9102FA-CCT*, manufactured by *[Sunricher](www.sunricher.com)* with the thing type UID of ```sunricher_zv9102facct_00_000```.

The device is in the category of *Light Bulb*, defining Devices that illuminate something, such as bulbs, etc..

![ZV9102FA-CCT product image](https://www.cd-jackson.com/zwave_device_uploads/793/793_default.png)


The ZV9102FA-CCT supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

The SR-ZV9102FA-CCT is a dual color zwave lighting device and z wave slave that adopts z-wave RF Plus and z-wave mesh network technology with 4 channel, 5A per channel output for dual color LED lights. As a z-wave slave, the device can be added to z-wave network or removed from z-wave network by z-wave primary (master) controllers or gateway. The z wave devices are transceivers that enable to receive and transmit RF signal from the z wave remote while both of them are added to the network. The transceiver is a universal z wave slave which is compatible with universal z wave primary (master) controllers/gateway.

### Inclusion Information

Power on the receiver. By factory default setting, the connected LED lights will be under a slow rhythm breath status which means the receiver is waiting to be searched by the master (primary) controller or z-wave gateway -> set the z-wave master (primary) controller or gateway into network inclusion mode (please refer to the user manual to learn how)

There shall be an indication on the master (primary) controller or gateway -> LED light connected with the receiver flashes 5 times quickly to indicate successful and automatic adding to z-wave network

### Exclusion Information

When the receiver has already been added to z-wave network and connected LED light is switched on, set the z-wave master (primary) controller or gateway into network exclusion mode (please refer to the user manual to learn how).

Click the “prog” key on the receiver -> there shall be an indication on the master (primary) controller -> the connected LED light with the receiver flashes twice to indicate successful removal from z-wave network

## Channels

The following table summarises the channels available for the ZV9102FA-CCT -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Scene Number | scene_number |  | Number | 
| Color Control | color_color |  | Color | 
| Color Temperature | color_temperature | ColorLight | Dimmer | 
| Alarm (system) | alarm_system |  | Switch | 

### Dimmer

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Scene Number

Triggers when a scene button is pressed.

The ```scene_number``` channel supports the ```Number``` item.

### Color Control

The color channel allows to control the color of a light.
            It is also possible to dim values and switch the light on and off.

The ```color_color``` channel supports the ```Color``` item.

### Color Temperature

The color temperature channel allows to set the color
            temperature of a light from 0 (cold) to 100 (warm).

The ```color_temperature``` channel supports the ```Dimmer``` item and is in the ```ColorLight``` category.

### Alarm (system)

Indicates if a system alarm is triggered.

The ```alarm_system``` channel supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 8 configuration parameters available in the ZV9102FA-CCT.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 2 | Save state on power failure | Shut off load (default), turn on load or restore saved state after power failure |
| 3 | Enable/disable BASIC report | Enable/disable sending of BASIC reports |
| 4 | Colour channels | Set number of channels of LED load - single colour, CCT or RGBW |
| 5 | Stage mode | Set stage mode for lighting changes |
| 6 | Stage mode speed | Set speed of changes in stage mode |
| 7 | Stage mode execution time | Set execution time for stage mode |
| 8 | Stage mode hue | Set stage mode hue 0-255 |
| 9 | Set external switch function | Enable / disable external switch for inclusion / exclusion |

### Parameter 2: Save state on power failure

Shut off load (default), turn on load or restore saved state after power failure
Load state after power failure

0 - (default) shut off load

1 - turn on load

2 - restore saved state after power failure
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Enable/disable BASIC report

Enable/disable sending of BASIC reports
Enable or disable sending of BASIC reports

0 - Disable sending of BASIC reports

1 - (default) Enable sending of BASIC reports
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Colour channels

Set number of channels of LED load - single colour, CCT or RGBW
Set number of channels of LED load

0 - single colour - 4 channel PWM output to drive 4 channels of single colour LEDs

1 - CCT - 2 channel PWM output to drive CCT LEDs R/B control warm white, G/W control cool white

2 - (default) RGBW - single channel PWM output to control RGBW LEDs
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Stage mode

Set stage mode for lighting changes
Set lighting stage mode

0 - (Default) - no stage mode

1 - flash mode, colors set by parameter 8

2 - rainbow mode, system fixed changing effect

4 - fade in and fade out mode, color changes randomly

5 - flash mode, color changes randomly

6 - rainbow mode, color changes randomly

7 - random mode, the colors switch randomly
Values in the range 0 to 7 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Stage mode speed

Set speed of changes in stage mode
Set speed of stage mode 0-255

0 is slowest 255 is fastest
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Stage mode execution time

Set execution time for stage mode
Set execution time for stage mode

0 (default) - unlimited time

1 - 255 set execution time
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Stage mode hue

Set stage mode hue 0-255
Set hue for stage mode

0 - 255 (default)

Only valid for fade in, fade out and flash mode.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Set external switch function

Enable / disable external switch for inclusion / exclusion
Enable / disable external switch for inclusion / excluison of the device to / from the network

0 - (default) disable switch

1 - enable switch
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZV9102FA-CCT supports 1 association group.

### Group 1: Lifeline


This group supports 1 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| Linked to BASIC|
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_SCENE_ACTUATOR_CONF_V1| |
| COMMAND_CLASS_SWITCH_COLOR_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [User manual](https://www.cd-jackson.com/zwave_device_uploads/793/sr-zv9102fa-cct-user-manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/793).
