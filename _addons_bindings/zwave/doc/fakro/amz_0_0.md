---
layout: documentation
title: AMZ - ZWave
---

{% include base.html %}

# AMZ Awning Blinds Controller
This describes the Z-Wave device *AMZ*, manufactured by *Fakro* with the thing type UID of ```fakro_amz_00_000```.

The device is in the category of *Blinds*, defining Roller shutters, window blinds, etc..

![AMZ product image](https://www.cd-jackson.com/zwave_device_uploads/616/616_default.png)


The AMZ supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Only for external installation with Fakro roof windows.

### Inclusion Information

  1. Press the "In/Ex" button on the controller.
  2. Press the programming button on the awning blind for 1 second.

### Exclusion Information

  1. Press the "In/Ex" button on the controller.
  2. Press the programming button on the awning blind for 1 second.

## Channels

The following table summarises the channels available for the AMZ -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Blinds control | blinds_control | blinds_control | Blinds | Rollershutter | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Blinds control
Provides start / stop control of blinds.

The ```blinds_control``` channel is of type ```blinds_control``` and supports the ```Rollershutter``` item and is in the ```Blinds``` category.



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
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/616/AMZ-Z-WAVE-FAKRO-EN.pdf)
* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/616/AMZ-Z-WAVE-FAKRO-EN.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/616).
