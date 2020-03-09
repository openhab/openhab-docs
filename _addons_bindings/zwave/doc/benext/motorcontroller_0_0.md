---
layout: documentation
title: Forest Shuttle - ZWave
---

{% include base.html %}

# Forest Shuttle Curtain rail motor controller
This describes the Z-Wave device *Forest Shuttle*, manufactured by *[BeNext](http://www.benext.eu/)* with the thing type UID of ```benext_motorcontroller_00_000```.

The device is in the category of *Blinds*, defining Roller shutters, window blinds, etc..

![Forest Shuttle product image](https://www.cd-jackson.com/zwave_device_uploads/1215/1215_default.png)


The Forest Shuttle supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

  * Touch lmpulse Technology, gently pulling the curtain by hand will activate the motor (standard feature);
  * Integrated Emergency Control with automatic de­clutch in case of power failure, to ensure a manual operation of the curtains (standard feature);
  * Modular motor, different modules can be attached for various control options: Radio Frequency, Wall Switch, lnfrared, Domotics, Building/Hotel Automa­tion, Serial Communication, Z-wave, etc.;
  * Ultra Silent motor;
  * Slow start and slow stop;
  * Full automatic setting of the limits;
  * Programming of intermediate positions possible;
  * Touch lmpulse Sensitivity adjustable; high sensitivity, low sensitivity, and off;
  * Stack-back position programmable to every desired setting;
  * FMS tracks and components available in white and black;
  * Clickable off-set carriers for a straight heading of the curtain; rolling carriers and FES Easyfold carriers also available;
  * Kevlar based drive belt;
  * All KS brackets applicable;
  * Motors can also be used on MRS Motorized Rod System;
  * Tandem motor application possible as well.

### Inclusion Information

Set your main Z-Wave controller (see manual controller) into inclusion mode. Press configuration button 3 times. LED3 is ON. Press and hold once more for 4 seconds, LED will start blinking for 10 seconds. The Shuttle S/L Z-Wave motor will be detected and included into the Z-Wave network of your main Z-Wave controller.

### Exclusion Information

Press the configuration button 25 times and confirm by pressing the button once more for 4 seconds until the led blinks 3 times and goes OFF. This way of excluding is less preferred. Please use this procedure only when the network primary controller is missing or otherwise inoperable. 

## Channels

The following table summarises the channels available for the Forest Shuttle -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch Binary | switch_binary | switch_binary | Switch | Switch | 
| Blinds Control | blinds_control | blinds_control | Blinds | Rollershutter | 

### Switch Binary
The Switch Binary command class can be used to turn the Shuttle LZ fully open or fully closed.  
Value:

- 0x00: Close  
- 0xFF: Open

Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Blinds Control
The switch multilevel set command class is used to set the light to a preferred position.  
- Values 0 – 99 (%) are used to set the position 

Provides start / stop control of blinds.

The ```blinds_control``` channel is of type ```blinds_control``` and supports the ```Rollershutter``` item and is in the ```Blinds``` category.



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Forest Shuttle supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V2| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V2| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [Manual from Forest curtain rails including Z-wave details](https://www.cd-jackson.com/zwave_device_uploads/1215/download-287-Installing-the-FOREST-SHUTTLE-S-M-L--Z-wave-V1-6EN.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1215).
