---
layout: documentation
title: DMWV1 - ZWave
---

{% include base.html %}

# DMWV1 Dome Water Main Shut Off
This describes the Z-Wave device *DMWV1*, manufactured by *Elexa Consumer Products Inc.* with the thing type UID of ```elexa_dmwv1_00_000```.

![DMWV1 product image](https://www.cd-jackson.com/zwave_device_uploads/650/650_default.jpg)


The DMWV1 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/650) to improve the documentation.

## Channels

The following table summarises the channels available for the DMWV1 -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 
| Dimmer | switch_dimmer | DimmableLight | Dimmer | 

### Switch

Binary Switch commands will open and close the Water Main Shut-Off. Binary Switch Report commands are also used to communicate changes in device status (e.g. the Valve opening/closing) to the controller. See below for Binary Switch status values and their corresponding meaning within the Shut-Off:  
Valve Open: FF  
Valve Closed: 00

Switch the power on and off.

The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.



## Device Configuration

The device has no configuration parameters configured.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The DMWV1 supports 1 association group.

### Group 1: Lifeline


This group supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V0| |
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
