---
layout: documentation
title: VRCS1 - ZWave
---

{% include base.html %}

# VRCS1 1-Scene Controller
This describes the Z-Wave device *VRCS1*, manufactured by *Leviton* with the thing type UID of ```leviton_vrcs1_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![VRCS1 product image](https://www.cd-jackson.com/zwave_device_uploads/1092/1092_default.jpg)


The VRCS1 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Leviton VRCS1 Vizia RF+ 1-Button Scene Controller Switch for Multi-Location Scene Control - no local load control

### Inclusion Information

  1. To access Program mode, engage the air-gap switch by gently pressing the top of the push pad until the bottom lifts completely out of the frame and a click is heard (refer to figure). Wait 5 seconds and then press the push pad back into the frame and hold push pad until the LED turns Amber. Release the push pad and the LED should blink Amber. You are now in Programming mode. **NOTE:** If the LED on the 1-scene controller turns solid Red while including, there has been a communication error.
  2. While standing close to the 1-scene controller (approximately 2-5 ft.), press the center button on the Programmer/Remote to device in the network. NOTE: Only one device may be included at any time

### Exclusion Information

  1. To access Program mode, engage the air-gap switch by gently pressing the top of the push pad until the bottom lifts completely out of the frame and a click is heard (refer to figure). Wait 5 seconds and then press the push pad back into the frame and hold push pad until the LED turns Amber. Release the push pad and the LED should blink Amber. You are now in Programming mode. **NOTE:** If the LED on the 1-scene controller turns solid Red while excluding, there has been a communication error.
  2. While standing close to the 1-scene controller (approximately 2-5 ft.), press the center button to device from the network.

## Channels

The following table summarises the channels available for the VRCS1 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Scene Number  [Deprecated]| scene_number | scene_number |  | Number | 

### Scene Number [Deprecated]
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.

**Note:** This channel is marked as deprecated so should not be used.



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The VRCS1 supports 1 association group.

### Group 1: Group1


Association group 1 supports 32 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SCENE_ACTIVATION_V1| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_V1| |

### Documentation Links

* [Product Specifications](https://www.cd-jackson.com/zwave_device_uploads/1092/Vizia-RF---Controllers-Spec-Sheet.pdf)
* [Instruction Sheet VRCS1](https://www.cd-jackson.com/zwave_device_uploads/1092/Instruction-Sheet-VRCS1.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1092).
