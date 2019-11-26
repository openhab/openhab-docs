---
layout: documentation
title: ZW4001 - ZWave
---

{% include base.html %}

# ZW4001 In-Wall Dimmer
This describes the Z-Wave device *ZW4001*, manufactured by *[Sunricher](www.sunricher.com)* with the thing type UID of ```sunricher_rgbgeniezw4001_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![ZW4001 product image](https://www.cd-jackson.com/zwave_device_uploads/1152/1152_default.png)


The ZW4001 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

In Wall Dimmer switch module.  Requires momentary switch input to change states.

### Inclusion Information

  1. Set primary controller/gateway into inclusion mode
  2. Power on the in-wall dimmer, and set it into inclusion mode. 

There are two methods to set inclusion mode:

  1. Repower the dimmer, it will be set into nclusion mode automatically, and waiting to be included
  2. Triple press theaction button on the dimmer, it will set the dimmer into inclusion mode

The connected light will stay solid on for 3 seconds to indicate successful inclusion

### Exclusion Information

  1. Triple press the action button, the dimmer will be set to inclusion/exclusion mode, then send out Node Information Frame
  2. When the dimmer is under inclusion mode.

there are 2 kinds of operation:

  1. Triple press inclusion/exclusion button, the dimmer will be set to inclusion mode again, and send out Node Information Frame
  2. Power off and power on the dimmer, it will be set to inclusion mode automatically, and send out Node Information Frame

### General Usage Information

Minimum Brightness Setting Button:

  1. Press and hold down the button for at least 3 second:  current brightness will be set as minimum brightness if it is lower than 50%.  Min brightness will be reset to 1% if current brightness is higher than 50%
  2. Short press the button twice:  load's brightness will be set to 99%

## Channels

The following table summarises the channels available for the ZW4001 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Scene Number | scene_number | scene_number |  | Number | 
| Alarm (system) | alarm_system | alarm_system |  | Switch | 

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.

### Alarm (system)
Indicates if a system alarm is triggered.

The ```alarm_system``` channel is of type ```alarm_system``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 6 configuration parameters available in the ZW4001.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 2 | LoadStatePowerLoss | Saving load state before power failure |
| 3 | EnableDisableBasicReport | Enable/Disable Send basic report on load change |
| 4 | DefaultFadeTime | Time to fade to new value (Units depend on value) |
| 5 | MinBrightness | Minimum Brightness Value |
| 6 | MOSFETDriveType | Choose MOSFET driving type |
| 7 | EnableInclExcl | Enable Inclusion and Exclusion |

### Parameter 2: LoadStatePowerLoss

Saving load state before power failure

Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: EnableDisableBasicReport

Enable/Disable Send basic report on load change
0 -- Disable to send Basic report

1 -- Enable to sent Basic report
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: DefaultFadeTime

Time to fade to new value (Units depend on value)
0x00 -- Instantaneous Change

0x01 .. 0x7F -- 1 second (0x01) to 127 seconds (0x7F) in 1 second resolution

0x80 .. 0xFE -- 1 minute (0x80) to 127 minutes (0xFE) in 1 minute resolution

0xFF -- Factory Default duration (1 second)
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 5: MinBrightness

Minimum Brightness Value
Valid Value: 0-50, the bigger the value is, the higher the load's minimum brightness is

Note: when configuring this value, the value of Multilevel will be configured as 1 automatically so that users can preview the corresponding effect of minimum brightness value.
Values in the range 0 to 50 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: MOSFETDriveType

Choose MOSFET driving type
0 -- trailing edge

1 -- leading edge
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: EnableInclExcl

Enable Inclusion and Exclusion
0 -- disable

1 -- enable
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZW4001 supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_SCENE_ACTUATOR_CONF_V1| |
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
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [RGBGenie ZW-4001 Manual All Pages](https://www.cd-jackson.com/zwave_device_uploads/1152/RGBGenie-ZW-4001-Manual-All-Pages.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1152).
