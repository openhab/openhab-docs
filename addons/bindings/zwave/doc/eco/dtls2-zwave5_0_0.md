---
layout: documentation
title: DTLS2-ZWAVE5 - ZWave
---

{% include base.html %}

# DTLS2-ZWAVE5 Z-Wave Plus Smart Switch Dual Toggle
This describes the Z-Wave device *DTLS2-ZWAVE5*, manufactured by *Ecolink* with the thing type UID of ```eco_dtls2-zwave5_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![DTLS2-ZWAVE5 product image](https://opensmarthouse.org/zwavedatabase/1443/image/)


The DTLS2-ZWAVE5 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

Automates wall switch without replacing existing switches. Battery-powered

### Inclusion Information

The Z-Wave Plus Toggle Light Switch must be added to a Z-Wave Plus network prior to use. To include the device in a network both the device and the network controller must be in inclusion mode at the same time. Refer to the instructions provided by the manufacturer of your specific controller for details on initiating the controller’s inclusion mode.  


Verify that the Z-Wave Plus controller you are using is compatible with the Z-Wave Plus Toggle Light Switch.

Locate the light switch desired to be used with the Z-Wave Plus Toggle Light Switch.

Put your Z-Wave Plus Controller into add (inclusion) mode.

Press the inclusion / exclusion button on the Z-Wave Plus Toggle Light Switch. (Figure 1)

The LED on the front of the unit will turn off if successful included into a network.

### Exclusion Information

Any Z-Wave Plus Device can be removed from any Z-Wave Plus controller. Follow the directions to put your Z-Wave Plus Controller into exclusion mode.  


Press the inclusion / exclusion button on the Z-Wave Plus Toggle Light Switch.

### General Usage Information



## Channels

The following table summarises the channels available for the DTLS2-ZWAVE5 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The DTLS2-ZWAVE5 supports 2 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 1 node.

### Group 2: Basic Reports


Association group 2 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [Product Manual](https://opensmarthouse.org/zwavedatabase/1443/reference/DTLS2-ZWAVE5_Prod_Rev06.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1443).
