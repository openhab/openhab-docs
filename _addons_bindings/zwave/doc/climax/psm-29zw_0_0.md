---
layout: documentation
title: PSM-29ZW - ZWave
---

{% include base.html %}

# PSM-29ZW Power Switch with Meter
This describes the Z-Wave device *PSM-29ZW*, manufactured by *Climax Technology, Ltd.* with the thing type UID of ```climax_psm-29zw_00_000```.

The device is in the category of *Power Outlet*, defining Small devices to be plugged into a power socket in a wall which stick there.

![PSM-29ZW product image](https://opensmarthouse.org/zwavedatabase/1463/image/)


The PSM-29ZW supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The Power Switch with Meter function (PSM-29ZW) has the extra feature of keeping tracks of energy consumption with built-in power meter and transmitting the data to coordinator regularly.

### Inclusion Information

1. Plug the Power Switch into a power outlet.

2. Put the Z-Wave Gateway or Control Panel into Inclusion mode (please refer to the Z-Wave Gateway or Control Panel manual).

3. Within 1.5 seconds, press the Function Button 3 times.

4. Refer to the operation manual of the Z-Wave Gateway or Control Panel to complete the adding process.

5. If the device has already been added (included) into another Z-Wave Gateway/Control Panel, or if the device is unable to be added into the current Z-Wave Gateway/Control Panel, please exclude it first (see Removing Device) before attempting to include it into the current Z-Wave Gateway/Control Panel.

### Exclusion Information

1. Put the Z-Wave Gateway or Control Panel into Exclusion mode (please refer to the Z-Wave Gateway or Control Panel manual).

2. Within 1.5 seconds, press the Function Button 3 times and the device will be removed from the Z-Wave network.

### General Usage Information

Press and hold the Function Button of the device for 10 seconds to factory reset.

## Channels

The following table summarises the channels available for the PSM-29ZW -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The PSM-29ZW supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
When toggling between On/Off, it will send Binary Switch Report to the nodes of Grouping 1.

Association group 1 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_METER_V2| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_CRC_16_ENCAP_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [PSM-29ZW-P5-P6 -(OTA)_20200909](https://opensmarthouse.org/zwavedatabase/1463/reference/PSM-29ZW-P5-P6_-OTA_20200909.pdf)
* [PSM-29ZW-P5-P6 -(OTA)_20200909](https://opensmarthouse.org/zwavedatabase/1463/reference/PSM-29ZW-P5-P6_-OTA_1.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1463).
