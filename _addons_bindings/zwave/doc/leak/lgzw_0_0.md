---
layout: documentation
title: LGZW - ZWave
---

{% include base.html %}

# LGZW Water Valve Control
This describes the Z-Wave device *LGZW*, manufactured by *Leak Intelligence, LLC* with the thing type UID of ```leak_lgzw_00_000```.

The device is in the category of *Valve*, defining Valves used to control water or gas. e.g. a flow stop valve..

![LGZW product image](https://www.cd-jackson.com/zwave_device_uploads/1063/1063_default.jpg)


The LGZW supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The Leak Gopher Z-Wave Valve Controller is a professionall grade Z-Wave Device that allows the water to your home or business to be automatically turned off when water is detected by water sensors connected to any Z-Wave capable controller. The Leak Gopher Z-Wave Valve Controller is Z-Wave Plus compliant allowing you to use all of the functionality and programmability built into the new, Z-Wave Plus Controllers. It comes with a Stainless Steel Electronic Ball Valve.

Design and Operation of 

The Leak Gopher Valve Controller

Simply install the stainless steel Electronic Ball Valve on the ½” or ¾” water line where water enters your home or business, attach it to the Leak Gopher by plugging in the RJ-11 telephone jack, and tell your Z-Wave controller about the Leak Gopher and your home or business is protected. 

Standard telephone wires and connectors can be used to extend the Ball Valve’s wire so it is easy to locate the Electronic Ball Valve where you need it to be, and still have easy access to the Leak Gopher Z-Wave Valve Controller. 

When any of your water sensors get wet, your Z-Wave Controller will tell the Leak Gopher to turn the water off and Voilà! No Flood!

A fully capable Z-Wave device, you can also program scenes that allow your Leak Gopher to turn the water off when you leave home and arm your security system and back on when you get home. No more worries about your house flooding while you are away.

Also, for your convenience and piece of mind, there are two buttons on the Leak Gopher that allow you to instantly turn your water off and on. No more looking for that water key and digging in the yard looking for your water meter!

### Inclusion Information

How to Add the Leak Gopher Z-Wave Valve Control to your Z-Wave Controller

  * Plug the wall cube power adapter (included) into the receptacle on the bottom of the Leak Gopher Z-Wave Valve Control marked “3.6 VDC”. Plug the wall cube into a 110 VAC outlet. This provides power to the Leak Gopher Z-Wave Valve Control.
  * Configure the Z-Wave Controller to Add a device. 
  * When the Z-Wave Controller is ready to add a device, it will display a message like “waiting to add device. Press Add button on the device”
  * The Add/Remove button is located on the side of the Leak Gopher Z-Wave Valve Control. Press the Add/Remove button.
  * The Z-Wave Controller will acknowledge that the Leak Gopher Z-Wave Valve Control had been added to the Z-Wave network.
  * Your Leak Gopher Z-Wave Valve Control is ready to use.

### Exclusion Information

How to Remove the Leak Gopher Z-Wave Valve Control to your Z-Wave Controller

  * Plug the wall cube power adapter (included) into the receptacle on the bottom of the Leak Gopher Z-Wave Valve Control marked “3.6 VDC”. Plug the wall cube into a 110 VAC outlet. This provides power to the Leak Gopher Z-Wave Valve Control.
  * Configure the Z-Wave Controller to Remove a device. 
  * When the Z-Wave Controller is ready to Remove a device, it will display a message like “waiting to remove device. Press remove button on the device”
  * The Add/Remove button is located on the side of the Leak Gopher Z-Wave Valve Control. Press the Add/Remove button. 
  * The Z-Wave Controller will acknowledge that the Leak Gopher Z-Wave Valve Control had been removed from the Z-Wave network.
  * Your Leak Gopher Z-Wave Valve Control is removed form this controller.

## Channels

The following table summarises the channels available for the LGZW -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Alarm (system) | alarm_system | alarm_system |  | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Alarm (system)
Indicates if a system alarm is triggered.

The ```alarm_system``` channel is of type ```alarm_system``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The LGZW supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 4 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ALARM_V4| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [Water Valve](https://www.cd-jackson.com/zwave_device_uploads/1063/50020-LGZW-2-Leak-Gopher-Z-Wave-Plus-Instructions-5VDC.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1063).
