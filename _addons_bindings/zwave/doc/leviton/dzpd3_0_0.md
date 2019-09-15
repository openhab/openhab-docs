---
layout: documentation
title: DZPD3 - ZWave
---

{% include base.html %}

# DZPD3 Lamp Module
This describes the Z-Wave device *DZPD3*, manufactured by *Leviton* with the thing type UID of ```leviton_dzpd3_00_000```.

The device is in the category of *Power Outlet*, defining Small devices to be plugged into a power socket in a wall which stick there.

![DZPD3 product image](https://www.cd-jackson.com/zwave_device_uploads/322/322_default.jpg)


The DZPD3 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

300 Watt Scene Capable Plug-In Lamp Dimming Module with Z-Wave Technology for CFL/LED/Incandescent. Turn any standard receptacle into the essence of ‘smart’ lighting with the scene capable plug in lamp dimming module. The low-power radio waves travel easily throughout the walls and floors of your home. Features: On/Off/Dim/Bright incandescent load scene and zone control switching capabilities. 

### Inclusion Information

Leviton Decora SmartTM Z-Wave® devices support two methods of inclusion. When using a Z-Wave PlusTM certified controller choose Network Wide Inclusion.  
  
_Network Wide Inclusion_:  
Network Wide Inclusion allows your device to be added to the network using devices already in the network to assist with communication. Work your way from the closest devices to the controller outward.

  * Enter Programming Mode by holding the control button for 7 seconds, the Locator LED will blink amber.
  * Tap the control button one time. The Locator LED will quickly flash green.
  * The Decora SmartTM Z-Wave® device is ready to learn into the Z-Wave® network.
  * Follow directions in the Z-Wave® controller to complete the adding process.
  * Upon successful addition to network the LED will turn off and then blink green 3 times.
  * If the adding process is not successful the LED will flash red 3 times.

_Traditional Inclusion:_  
For older controllers Traditional Inclusion is supported. Depending on the age of the controller the controller will need to be 3 to 35 feet from the device when including.

  * Enter Programming Mode by holding the control button for 7 seconds, the Locator LED will blink amber.
  * The Decora SmartTM Z-Wave® device is ready to add to the Z-Wave® network.
  * Follow directions in the Z-Wave® controller to enter learn mode.
  * Tap the control button one time. The Locator LED will quickly flash green. The Z-Wave® controller will begin to pair with the Decora SmartTM device.
  * Upon successful addition to the network the LED will turn off and then blink green 3 times.
  * If the adding process is not successful the LED will flash red 3 times.

### Exclusion Information

When removing a device from a Z-Wave® network best practice is to use the exclusion command found in the Z-Wave® controller.

  * Enter Programming Mode by holding the control button for 7 seconds, the Locator LED will turn amber.
  * Follow directions in the Z-Wave® controller to enter exclusion mode.
  * Tap the control button one time. The Locator LED will quickly flash green. The Z-Wave® controller will exclude the Decora SmartTM device.
  * The Z-Wave® controller will confirm successful exclusion from the network.

  
_Factory Reset_  
  
When removing a device from a network it is best practice to use the Exclusion process. In situations where a device needs to be returned to factory default follow the following steps.

  * A reset should only be used when a controller is inoperable or missing:
  * Holding the control button for a total of 14 seconds.
  * After the first 7 seconds the LED turns amber.
  * The Locator LED will quickly flash red/amber after 14 seconds.
  * Release the control button and the device will reset.

## Channels

The following table summarises the channels available for the DZPD3 -:

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

The following table provides a summary of the 6 configuration parameters available in the DZPD3.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Fade On Time | Time it takes to fade on |
| 2 | Fade off time | Time it takes to fade off |
| 3 | Minimum Light Level |  |
| 4 | Maximum Light Level |  |
| 7 | Locator LED Status | LED Off or Status Mode 255 or Locator Mode |
| 8 | Load Type | Type of lamp |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 1: Fade On Time

Time it takes to fade on
0 is instant on 1-127 is in seconds 128-253 is in minutes
Values in the range 0 to 253 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Fade off time

Time it takes to fade off
0 is instant on 1-127 is in seconds 128-253 is in minutes
Values in the range 0 to 253 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Minimum Light Level



Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Maximum Light Level



Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 7: Locator LED Status

LED Off or Status Mode 255 or Locator Mode

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | LED Off |
| 254 | Status Mode |
| 255 | Locator Mode |

The manufacturer defined default value is ```255``` (Locator Mode).

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Load Type

Type of lamp

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Incandescent |
| 1 | LED |
| 2 | CFL |

The manufacturer defined default value is ```0``` (Incandescent).

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.

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

The DZPD3 supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Z-Wave Plus Lifeline: A NOTIFICATION frame is sent to the nodes

Association group 1 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_SCENE_ACTUATOR_CONF_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V3| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_NODE_NAMING_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_MANUFACTURER_PROPRIETARY_V1| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/322/DI-000-DZPD3-02B-W.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/322).
