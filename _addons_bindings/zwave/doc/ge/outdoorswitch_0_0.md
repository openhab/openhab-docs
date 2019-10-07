---
layout: documentation
title: GE Outdoor Switch - ZWave
---

{% include base.html %}

# GE Outdoor Switch Weather Resistant Outdoor Switch
This describes the Z-Wave device *GE Outdoor Switch*, manufactured by *Jasco Products* with the thing type UID of ```ge_outdoorswitch_00_000```.

The device is in the category of *Power Outlet*, defining Small devices to be plugged into a power socket in a wall which stick there.

![GE Outdoor Switch product image](https://www.cd-jackson.com/zwave_device_uploads/643/643_default.png)


The GE Outdoor Switch supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Maximum load for the Z-Wave controlled outlet: 600W Incandescent; 1800W (15A) Resistive or 1⁄2 HP Motor

  * One Z-Wave controlled grounded outlet for lighting & small appliances
  * Remote ON/OFF control via the Z-Wave controller
  * Manual ON/OFF control with the manual/program button
  * Grounded 3-wire power connection for safety
  * Weather and impact resistant housing. suitable for outdoors in a wet or damp conditions
  * Integrated outlet cover keeps dirt and debris out when the smart switch is not in use

### Inclusion Information

  1. Follow the instructions for your Z-Wave certified controller to add the smart switch to the Z-Wave network.
  2. Once the controller is ready to add your outdoor smart switch, single press and release the manual/program button on the smart switch to add it in the network.
  3. Please reference the controller/gateway’s manual for instructions.  
    Now you have complete control to turn your lamp ON/OFF according to groups, scenes, schedules and interactive automations programmed by your controller. If your Z-Wave certified controller features Remote Access, you can now control your lighting from your mobile devices.

### Exclusion Information

  1. Follow the instructions for your Z-Wave certi ed controller to remove a device from the Z-Wave network.
  2. Once the controller is ready to remove your device, press and release the manual/program button on the smart switch to remove it from the network.

To return your switch to factory defaults

  1. If plugged in, unplug the Switch from the receptacle. 2. Press and hold the button for at least 3 seconds while you plug the switch into a receptacle.

Note: This should only be used in the event your network’s primary controller is missing or otherwise inoperable.

### General Usage Information

This unit is suitable for outdoor use in damp locations. Do not expose to rain or immerse in water. Install at least 3 feet above ground level with the receptacle pointed down. When used outdoors you should plug the unit into a GFCI receptacle with a receptacle cover rated for outdoor use.  
The manual/program button on the outdoor switch allows the user to:  
Turn the connected lamp ON or OFF. If the outdoor switch is OFF, press and release the button once to turn it ON and vice versa to turn OFF.

A. Z-Wave controlled outlets

  * This outlet can remotely turn the connected light or appliance ON/OFF.

B. Manual/Program button

  * Single press — turn ON/OFF
  * Single press — add or remove in Z-Wave network

## Channels

The following table summarises the channels available for the GE Outdoor Switch -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Scene Number | scene_number | scene_number |  | Number | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The GE Outdoor Switch supports 3 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Association Group 1 supports Lifeline, Binary Switch Report

Association group 1 supports 5 nodes.

### Group 2: Group 2

Association Group 2 supports Basic Set and is controlled by pressing the On or Off button with the local load

Association group 2 supports 5 nodes.

### Group 3: Group 3

Association Group 3 supports Basic Set and is controlled by double pressing the On or Off button

Association group 3 supports 5 nodes.

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
| COMMAND_CLASS_SCENE_ACTUATOR_CONF_V1| |
| COMMAND_CLASS_CRC_16_ENCAP_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [Manual](https://www.cd-jackson.com/zwave_device_uploads/643/14284-EnFrSp-QSG-v1.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/643).
