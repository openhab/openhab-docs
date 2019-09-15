---
layout: documentation
title: DZPA1 - ZWave
---

{% include base.html %}

# DZPA1 Plug-in Appliance Module
This describes the Z-Wave device *DZPA1*, manufactured by *Leviton* with the thing type UID of ```leviton_dzpa1_00_000```.

The device is in the category of *Power Outlet*, defining Small devices to be plugged into a power socket in a wall which stick there.

![DZPA1 product image](https://www.cd-jackson.com/zwave_device_uploads/305/305_default.jpg)


The DZPA1 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

On/Off (binary) plug in module for lamps or small appliances.

Rated:

  * 600W LED and CFL
  * 1800W resistive
  * 1800W Incandescent/Halogen
  * 1800VA Flourescent
  * 1800VA Inductive
  * 1/2 HP 9.8A Motor
  * 120VAC, 60 Hz

### Inclusion Information

Leviton Decora SmartTM Z-Wave® devices support two methods of inclusion.

When using a Z-Wave PlusTM certified controller choose Network Wide Inclusion.

_Network Wide Inclusion:_

Network Wide Inclusion allows your device to be added to the network using devices already in the network to assist with communication. Work your way from the closest devices to the controller outward.

  * Enter Programming Mode by holding the control button for 7 seconds, the Locator LED will blink amber.
  * Tap the control button one time. The Locator LED will quickly flash green.
  * The Decora SmartTM Z-Wave® device is ready to learn into the Z-Wave® network.
  * Follow directions in the Z-Wave® controller to complete the adding process.
  * Upon successful addition to network the LED will turn off and then blink green 3 times.
  * If the adding process is not successful the LED will flash red 3 times.

_Traditional Inclusion:_

For older controllers Traditional Inclusion is supported. Depending on the age of the controller the controller will need to be 3 to 35 feet from the device when including.

  * Enter Programming Mode by holding the control button for 7 seconds, the Locator LED
  * will blink amber.
  * The Decora SmartTM Z-Wave® device is ready to add to the Z-Wave® network.
  * Follow directions in the Z-Wave® controller to enter learn mode.
  * Tap the control button one time. The Locator LED will quickly flash green.
  * The Z-Wave® controller will begin to pair with the Decora SmartTM device.
  * Upon successful addition to the network the LED will turn off and then blink green 3 times.
  * If the adding process is not successful the LED will flash red 3 times.

### Exclusion Information

When removing a device from a Z-Wave® network best practice is to use the exclusion command found in the Z-Wave® controller.

  * Enter Programming Mode by holding the control button for 7 seconds, the Locator LED will turn amber.
  * Follow directions in the Z-Wave® controller to enter exclusion mode.
  * Tap the control button one time. The Locator LED will quickly flash green.
  * The Z-Wave® controller will exclude the Decora SmartTM device.
  * The Z-Wave® controller will confirm successful exclusion from the network.

## Channels

The following table summarises the channels available for the DZPA1 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.



## Device Configuration

The following table provides a summary of the 1 configuration parameters available in the DZPA1.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 7 | Locator LED Status | Controls state of on-device LED |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 7: Locator LED Status

Controls state of on-device LED
Defines the behavior of the green LED.

Default is Night Light mode where LED is on when switch is off.

Valid values: 0 to 255

  * 0 = LED off
  * 254 (0xFE) = Status mode
  * 255 (0xFF) = Locator mode
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | LED always off |
| 254 | LED on when switch is ON |
| 255 | LED on when switch is OFF |

The manufacturer defined default value is ```255``` (LED on when switch is OFF).

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.

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

The DZPA1 supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Lifeline
Notification frame is sent

Association group 1 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_NODE_NAMING_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [Product Data sheet](https://www.cd-jackson.com/zwave_device_uploads/305/DZP-plugin-modules-Tsht-BW-v1p1--1-.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/305).
