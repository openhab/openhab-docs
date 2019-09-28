---
layout: documentation
title: DMWV1 - ZWave
---

{% include base.html %}

# DMWV1 Dome Water Main Shut Off
This describes the Z-Wave device *DMWV1*, manufactured by *Elexa Consumer Products Inc.* with the thing type UID of ```elexa_dmwv1_00_000```.

The device is in the category of *Valve*, defining Valves used to control water or gas. e.g. a flow stop valve..

![DMWV1 product image](https://www.cd-jackson.com/zwave_device_uploads/650/650_default.jpg)


The DMWV1 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The Dome Water Main Shut-Off is a Z-Wave Plus Certified device that installs over any standard 1/2” to 1-1/2” ball valve, and opens or closes the valve when given a signal. The Water Main Shut-Off consists of three main parts - the “MOTOR ASSEMBLY,” the “MOUNTING BRACKET,” and the “CONTROL ARM.” The MOUNTING BRACKET is clamped onto the pipe with HOSE CLAMPS and the CONTROL ARM secures around the VALVE HANDLE to control the valve, while the MOTOR ASSEMBLY connects to your home automation system and ties everything together.

### Inclusion Information

Follow the instructions for your Z-Wave controller to enter inclusion mode. When prompted by the controller:

  1. Plug the Water Main Shut-Off into an outlet 10’ from your controller. You can bring it to your desired location after the inclusion process. If successfully powered up, the LED INDICATOR will keep blinking until the device is included in a system.
  2. Press the OPEN/CLOSE BUTTON quickly 3 times in a row.
  3. The LED INDICATOR will stop blinking and stay on continuously after inclusion.

### Exclusion Information

Follow the instructions for your Z-Wave controller to enter exclusion mode. When prompted by the controller:

  1. Press the OPEN/CLOSE BUTTON quickly 3 times in a row.
  2. The LED INDICATOR will start blinking after successful exclusion.

## Channels

The following table summarises the channels available for the DMWV1 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 

### Switch
Binary Switch commands will open and close the Water Main Shut-Off.  Binary Switch Report commands are also used to communicate changes in device status (e.g. the Valve opening/closing) to the controller.  See below for Binary Switch status values and their corresponding meaning within the Shut-Off:  
Valve Open: FF  
Valve Closed: 00

Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The DMWV1 supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Group 1 is the “Lifeline” group, which can hold five devices.  The Water Main Shut-Off sends this group a Binary Switch Report whenever it is turned on or off.  The Water Main Shut-Off also sends this group a Device Reset Locally notification to remove itself from the Z-Wave network. 

Association group 1 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| |
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [Operating Guide and ZWave command reference](https://www.cd-jackson.com/zwave_device_uploads/650/DMWV1-dome-z-wave-water-valve-controller-operating-guide.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/650).
