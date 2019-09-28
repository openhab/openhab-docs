---
layout: documentation
title: BrightSwitch - ZWave
---

{% include base.html %}

# BrightSwitch Touch screen wall switch
This describes the Z-Wave device *BrightSwitch*, manufactured by *Bellatrix Systems, Inc.* with the thing type UID of ```bellatrix_brightswitch_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![BrightSwitch product image](https://www.cd-jackson.com/zwave_device_uploads/953/953_default.png)


The BrightSwitch supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Brightswitch replaces your light switches with smart networked touch-screen displays providing Z-Wave, intercom, security, and popular smart home and music apps.

### Inclusion Information

  1. From the main screen select Gear, then Connections, then Z-Wave. Then  select the "Edit Network" button, then "Add a Device".(See Z-Wave chapter) (This will add it to the list but not a slot)
  2. From the main screen select Gear, then Switches, then select an empty slot, then Tap here for list, then "Add New Z-Wave Device"
  3. From the main screen select an empty slot, (using gray "+" or "Tap Here to Setup"), then "Tap here for list", then "Add New Z-Wave Device"

Alternatively, to add a Brightswitch on the same Z-wave network, from the Z-Wave page press the "+" shortcut next to the Brightswitch.

After starting this process on Brightswitch, go to the device to be added and follow its instructions for adding it to a new network. This may be pressing a button, installing a battery or following the instructions in the device manual. Once Brightswitch finds the device it will return to the Z-Wave screen and display the device.

### Exclusion Information

  1. From the main screen select Gear, then Connections, then Z-Wave. (See Z-Wave chapter). Then select the "Edit Network" button, then "Remove a Device".
  2. From the main screen select Gear, then Switches, then select an empty slot, then Tap here for list, select the device, then "Clear this Bright" or "Delete Switch"
  3. From the main screen select an empty slot (using gray "+" or "Tap Here to Setup"), then "Tap here for list", select a device, then "Clear this Bright" or "Delete Switch"

Alternatively, to remove a Brightswitch or device on the same Z-Wave network, from the Z-Wave page press, the "-" shortcut next to the Brightswitch or device.

After starting this process on Brightswitch, go to the device to be removed and follow its instructions for removing it from a network. This may be pressing a button, installing a battery or following the instructions in the device manual. Once Brightswitch removes the device it will return to the Z-Wave screen.

## Channels

The following table summarises the channels available for the BrightSwitch -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Dimmer 1 | switch_dimmer1 | switch_dimmer | DimmableLight | Dimmer | 

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Dimmer 1
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer1``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The BrightSwitch supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Device Reset Locally, Switch Multilevel Report

Association group 1 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_CRC_16_ENCAP_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |

### Documentation Links

* [BrightSwitch User Guide](https://www.cd-jackson.com/zwave_device_uploads/953/User-Manual-3586475.pdf)
* [Z-Wave Protocol Implementation Conformance Statement](https://www.cd-jackson.com/zwave_device_uploads/953/ZC10-17065668.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/953).
