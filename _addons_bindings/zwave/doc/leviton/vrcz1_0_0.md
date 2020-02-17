---
layout: documentation
title: VRCZ1 - ZWave
---

{% include base.html %}

# VRCZ1 1-Zone Dimming Controller/ Virtual Matching Dimmer Remote
This describes the Z-Wave device *VRCZ1*, manufactured by *Leviton* with the thing type UID of ```leviton_vrcz1_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![VRCZ1 product image](https://www.cd-jackson.com/zwave_device_uploads/1208/1208_default.png)


The VRCZ1 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

  * Leviton Vizia+ 1 Zone dimming controller/Virtual matching dimmer remote
  * Controls dimming of remote load

### Inclusion Information

  * To access Program mode, engage the air-gap switch by gently pressing the top of the push pad until the bottom lifts completely out of the frame and a click is heard.
  * Wait 5 seconds and then press the push pad back into the frame and hold push pad until the LED turns Amber.
  * Release the push pad and the LED should blink Amber. You are now in Programming mode.
  * If the LED on the 1-zone controller turns solid Red while including, there has been a communication error.

### Exclusion Information

  * To access Program mode, engage the air-gap switch by gently pressing the top of the push pad until the bottom lifts completely out of the frame and a click is heard.
  * Wait 5 seconds and then press the push pad back into the frame and hold push pad until the LED turns Amber.
  * Release the push pad and the LED should blink Amber. You are now in Programming mode.
  * If the LED on the 1-zone controller turns solid Red while including, there has been a communication error.

### General Usage Information

DIM/BRIGHT Bar  
  
BRIGHTEN:  
Press the right half of the DIM/BRIGHT Bar – Lights brighten to desired level.  
  
DIM:  
Press the left half of the DIM/BRIGHT Bar – Lights dim to desired level.  
If there is a power outage, when the power is restored, the lights will return to the last setting before the power interruption.  
  
Virtual Matching Remote Application:  
Push Pad (Default settings)

Turn ON from OFF position:  
Tap – Lights turn ON, LED turns OFF.

Turn OFF from ON position:  
Tap – Lights turn OFF, LED turns ON.

## Channels

The following table summarises the channels available for the VRCZ1 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Brightness | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 

### Brightness
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The VRCZ1 supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
The VRCZ1 can be associated with a single device.

Association group 1 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_NODE_NAMING_V1| |
| COMMAND_CLASS_HAIL_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [Product Specification](https://www.cd-jackson.com/zwave_device_uploads/1208/Spec-VRCZ4-VRCS4-VRCZ1-VRCS1-VRMR1.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1208).
