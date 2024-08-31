---
layout: documentation
title: ZW4SF - ZWave
---

{% include base.html %}

# ZW4SF Fan Speed Controller
This describes the Z-Wave device *ZW4SF*, manufactured by *Leviton* with the thing type UID of ```leviton_zw4sf_01_008```.
This version of the device is limited to firmware versions 1.8 to 1.255

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![ZW4SF product image](https://opensmarthouse.org/zwavedatabase/1418/image/)


The ZW4SF supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The Decora Smart branded Z-Wave enabled Fan Speed Controller is designed for use with modern Z-Wave hubs.

This product can be operated in any Z-Wave network with other Z-Wave certified devices from other manufacturers. Your fan controller will act as a repeater in the network to increase the reliability of the network.

The Decora Smart Z-Wave fan controller allows you to select one of 4 fan speeds or turn your fan off from a smartphone or tablet or by voice when used with a z-wave hub.

The Decora Smart fan controller looks at home with your other Decora branded products. It has convenient manual on/off control, and an integrated bar to provide easy speed adjustment and hidden indicator lights.

### Inclusion Information

**Network-wide Inclusion:**

1. To enter programming mode, hold the top panel for 7 seconds. The status light will turn amber. Release and the status light will blink.

2. Tap the top of the paddle 1 time. The status light will quickly flash green.

3. The fan controller is now ready to learn into the Z-Wave network. Follow directions for the Z-Wave controller to complete the process.

4. Upon successful addition to the network the status light will turn off and then flash green 4 times. If it was not successfully added to the network, the status light will flash red 4 times.

**Classic Inclusion:**

  1. To enter programming mode, hold the top panel for 7 seconds. The status light will turn amber. Release and the status light will blink.
  2. Follow the Z-Wave controller instructions to enter inclusion mode.
  3. Tap the top of the paddle 1 time. The status light will quickly flash green.
  4. The Z-Wave controller will confirm successful inclusion to the network.

### Exclusion Information

To Exclude the device:

  1. Hold the top paddle for 7 seconds. The status light will turn amber. Release and the status light will blink.
  2. Follow Z-Wave controller instructions to enter exclusion mode.
  3. Tap the top of the paddle 1 time. The status light will quickly flash green.
  4. The Z-Wave controller will remove the device from the network.

### General Usage Information



## Channels

The following table summarises the channels available for the ZW4SF -:

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

The following table provides a summary of the 5 configuration parameters available in the ZW4SF.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 3 | Minimum Fan Speed | Controls the minimum fan speed. |
| 4 | Maximum Fan Speed | Controls the maximum fan speed |
| 5 | Preset Fan Speed Level | Controls the initial fan speed level when turned on |
| 6 | LED Level Indicator Timeout | Controls timeout for LED speed indicator, in seconds |
| 7 | Status LED Behavior | Controls behavior of the status LED |

### Parameter 3: Minimum Fan Speed

Controls the minimum fan speed.

Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Maximum Fan Speed

Controls the maximum fan speed

Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Preset Fan Speed Level

Controls the initial fan speed level when turned on
This setting controls the speed the fan is set to when it turns on. When '0', the fan will use the last known speed setting. Otherwise, 1-99 control the initial fan speed, with 99 being the fastest.
Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: LED Level Indicator Timeout

Controls timeout for LED speed indicator, in seconds
0=Level indicator is always off. 255=Level indicator is always on. Anything in between is the number of seconds the level indicator LED will stay on for, after the fan speed has been adjusted.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Status LED Behavior

Controls behavior of the status LED
0=Off, 254=Status Mode, 255=Locator Mode
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | LED Off |
| 254 | Status Mode |
| 255 | Locator Mode |

The manufacturer defined default value is ```254``` (Status Mode).

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZW4SF supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Lifeline


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
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_INDICATOR_V3| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [zw4sf_manual.pdf](https://opensmarthouse.org/zwavedatabase/1418/reference/DG-000-ZW4SF-02A-W.pdf)
* [zw4sf_manual.pdf](https://opensmarthouse.org/zwavedatabase/1418/reference/DG-000-ZW4SF-02A-W_1.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1418).
