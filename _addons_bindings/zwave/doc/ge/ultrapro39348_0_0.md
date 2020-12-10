---
layout: documentation
title: UltraPro 39348/ZW4008 - ZWave
---

{% include base.html %}

# UltraPro 39348/ZW4008 UltraPro 39348/ZW4008 In Wall Switch
This describes the Z-Wave device *UltraPro 39348/ZW4008*, manufactured by *Jasco Products* with the thing type UID of ```ge_ultrapro39348_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![UltraPro 39348/ZW4008 product image](https://opensmarthouse.org/zwavedatabase/1322/image/)


The UltraPro 39348/ZW4008 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

UltraPro Z-Wave Plus Smart Light Switch, In-Wall White & Almond Paddles | Built-In Repeater & Range Extender | Model 39348 ZW4008

### Inclusion Information

  1. Follow the instructions for your Z-Wave certified controller to add a device to the Z-Wave network.
  2. Once the controller is ready to add your device, press and release the top or bottom of the wireless smart switch (rocker).

Now you have complete control to turn your fixture ON/OFF according to groups, scenes, schedules and interactive automations programmed by your controller. If your Z-Wave certified controller features remote access, you can control your fixture from your mobile devices.

### Exclusion Information

  1. Follow the instructions for your Z-Wave certified controller to remove a device from the Z-Wave network.
  2. Once the controller is ready to remove your device, press and release the top or bottom of the wireless smart switch (rocker).

### General Usage Information



## Channels

The following table summarises the channels available for the UltraPro 39348/ZW4008 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Scene Number | scene_number | scene_number |  | Number | 
| Scene Number | scene_number | scene_number |  | Number | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.
This channel provides the scene, and the event as a decimal value in the form ```<scene>.<event>```. The scene number is set by the device, and the event is as follows -:

| Event ID | Event Description  |
|----------|--------------------|
| 0        | Single key press   |
| 1        | Key released       |
| 2        | Key held down      |
| 3        | Double keypress    |
| 4        | Tripple keypress   |
| 5        | 4 x keypress       |
| 6        | 5 x keypress       |



## Device Configuration

The following table provides a summary of the 1 configuration parameters available in the UltraPro 39348/ZW4008.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 3 | Blue LED Night Light | Blue LED Night Light |

### Parameter 3: Blue LED Night Light

Blue LED Night Light
This configuration parameter defines the behavior of the blue LED "night light". The default behavior is "ON\_WHEN\_OFF" - the LED is on when the switch is set to off. The other two options are "ON\_WHEN\_ON" - the LED is on when the switch is set to on, and "ALWAYS_OFF" - the LED is always off.
Values in the range 0 to 3 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The UltraPro 39348/ZW4008 supports 3 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Association Group 1 supports Lifeline, Binary Switch Report

Association group 1 supports 5 nodes.

### Group 2: Single Press

Association Group 2 supports Basic Set and is controlled by pressing the ON or OFF button with the local load


Association group 2 supports 5 nodes.

### Group 3: Double Press

Association Group 3 supports Basic Set and is controlled by double pressing the ON or OFF button

Association group 3 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_SCENE_ACTUATOR_CONF_V1| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_CENTRAL_SCENE_V3| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [Scanned manual from box](https://opensmarthouse.org/zwavedatabase/1322/reference/Ultrapro-ZW4008.pdf)
* [Printed manual from Z-Wave Manuals](https://opensmarthouse.org/zwavedatabase/1322/reference/Ultrapro-ZW4008_ZwaveManual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1322).
