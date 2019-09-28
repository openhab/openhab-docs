---
layout: documentation
title: ARF - ZWave
---

{% include base.html %}

# ARF Roller blind module
This describes the Z-Wave device *ARF*, manufactured by *Fakro* with the thing type UID of ```fakro_arf_00_000```.

The device is in the category of *Blinds*, defining Roller shutters, window blinds, etc..

![ARF product image](https://www.cd-jackson.com/zwave_device_uploads/848/848_default.png)


The ARF supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The ARF blackout blind is a stylish, decorative blind with runners at the sides to allow the blind to be posi tioned anywhere on the window. It also prevents daylight entering at the sides, thus providing a complete blackout. 

The ARF Z-Wave blackout blind has a built in 12V electric drive which enables operation at 12V blinds by remote control or wall switch. The standard version of the action blinds ARF Z-Wave is only possible with the window closed. 

### Inclusion Information

Start INCLUDE procedure with the controller of existing network and then press programming button P on the roller shutter being added to the network.

### Exclusion Information

Start EXCLUDE procedure with the controller of existing network and then press programming button P on the roller shutter being added to the network.

## Channels

The following table summarises the channels available for the ARF -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Blinds control | blinds_control | blinds_control | Blinds | Rollershutter | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Blinds control
Provides start / stop control of blinds.

The ```blinds_control``` channel is of type ```blinds_control``` and supports the ```Rollershutter``` item and is in the ```Blinds``` category.

### Alarm (power)
Indicates if a power alarm is triggered.

The ```alarm_power``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The device does not support associations.
## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V3| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_NODE_NAMING_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [User Manual (EN)](https://www.cd-jackson.com/zwave_device_uploads/848/ARF-ARP-Z-WAVE-EN.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/848).
