---
layout: documentation
title: PRL-1ZW - ZWave
---

{% include base.html %}

# PRL-1ZW Z-Wave Relay (PRL-1ZW)
This describes the Z-Wave device *PRL-1ZW*, manufactured by *Climax Technology, Ltd.* with the thing type UID of ```climax_PRL-1ZW_01_003```.
This version of the device is limited to firmware versions above 1.3

The device is in the category of *Power Outlet*, defining Small devices to be plugged into a power socket in a wall which stick there.

![PRL-1ZW product image](https://opensmarthouse.org/zwavedatabase/1453/image/)


The PRL-1ZW supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The PRL-1ZW is a Z-Wave enabled device and is fully compatible with any Z-Wave enabled network. The Relay can be connected to wired device and set to either Normal Open (N.O.) or Normal Close (N.C.) status. After joining Z-wave network, the Relay can be controlled via Z-wave network to activate connected devices.

### Inclusion Information

  1. Put the Z-wave gateway or control panel into Inclusion mode (please refer to the Z-wave gateway or control panel manual).
  2. Within 1.5 seconds, press the Function Button 3 times.
  3. Refer to the operation manual of the Z-wave gateway or control panel to complete the adding process.
  4. If the device has already been added (included) into another Z-wave Gateway/Control Panel, or if the device is unable to be added into the current Z-wave Gateway/Control Panel, try removing it first (see Removing Device).

### Exclusion Information

  1. Put the Z-wave gateway or control panel into Exclusion mode (please refer to the Z-wave gateway or control panel manual).
  2. Within 1.5 seconds, press the Function Button 3 times and the device will be removed from the Z-wave network.

### General Usage Information

Factory Reset

  1. Factory resetting the device will restore it to factory default settings (i.e. not included into any Z-wave network). Please only use this procedure if the Z-Wave gateway or control panel is lost or otherwise inoperable.
  2. Press and hold the Function Button of the device for 10 seconds to factory reset.

## Channels

The following table summarises the channels available for the PRL-1ZW -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The PRL-1ZW supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
When the load state of Z-Wave Relay (turn on/off the load) is changed, the Switch Binary report can be sent to the associated nodes in this group.

Association group 1 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [PRL-1-ZW-5V 20210802](https://opensmarthouse.org/zwavedatabase/1453/reference/PRL-1-ZW-5V_20210802.pdf)
* [PRL-1-ZW-5V 20210802](https://opensmarthouse.org/zwavedatabase/1453/reference/PRL-1-ZW-5V_1.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1453).
