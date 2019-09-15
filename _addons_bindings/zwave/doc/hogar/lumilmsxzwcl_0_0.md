---
layout: documentation
title: Lumi LM-SxZW (C-L) - ZWave
---

{% include base.html %}

# Lumi LM-SxZW (C-L) Z-Wave Switch with 4 on/off light switches
This describes the Z-Wave device *Lumi LM-SxZW (C-L)*, manufactured by *[Hogar Controls](http://hogarcontrols.com/)* with the thing type UID of ```hogar_lumilmsxzwcl_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![Lumi LM-SxZW (C-L) product image](https://www.cd-jackson.com/zwave_device_uploads/1112/1112_default.png)


The Lumi LM-SxZW (C-L) supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

With a stunning glass face and an advanced capacitive touch sensor, all you need to do is just use a finger for turning your lights on and off. Tap once on the backlit touch button to switch the device on and tap it again to turn it off, it’s that simple. This 4 Touch Switch ensures an accurate response to every command that is sent through it.  
  
The Hogar 4 Touch Switch can operate either independently or as a part of the Hogar smart home automation system, and even with any other certified Z-Wave home automation system. It is an extremely easy-to-use panel that can be installed in a standard BS 2 gang box. Its operating capabilities include a bi-stable mode, a relay mode or a touch pulse mode for scene control with a maximum load current of 3 amp. It communicates with the Hogar smart home automation system using the Z-Wave wireless communication protocol.

### Inclusion Information

Touch and hold any key on the panel for more than 5 seconds. All indication lights will blink in blue. At this point release the key, the touch panel will start the inclusion process.

### Exclusion Information

ouch and hold any key on the panel for more than 5 seconds. All indication lights will blink blue in color. At this point release the key, the touch panel will start the exclusion process. 

## Channels

The following table summarises the channels available for the Lumi LM-SxZW (C-L) -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch | 
| Switch 2 | switch_binary2 | switch_binary | Switch | Switch | 
| Switch 3 | switch_binary3 | switch_binary | Switch | Switch | 
| Switch 4 | switch_binary4 | switch_binary | Switch | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 1
Switch the power on and off.

The ```switch_binary1``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 2
Switch the power on and off.

The ```switch_binary2``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 3
Switch the power on and off.

The ```switch_binary3``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 4
Switch the power on and off.

The ```switch_binary4``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Lumi LM-SxZW (C-L) supports 9 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 1 node.

### Group 2: HGT-01 Basic Set

Command: Basic Set Send Basic Set command to the other node in this association group when active endpoint 1.

Association group 2 supports 5 nodes.

### Group 3: HGT-01 Switch Binary Set 

Command: Switch Binary Set Send Switch Binary Set command to the other node in this association group when active endpoint 1.

Association group 3 supports 5 nodes.

### Group 4: HGT-02 Basic Set 

Command: Basic Set Send Basic Set command to the other node in this association group when active endpoint 2.

Association group 4 supports 5 nodes.

### Group 5: HGT-02 Switch Binary Set 

Command: Switch Binary Set Send Switch Binary Set command to the other node in this association group when active endpoint 2.

Association group 5 supports 5 nodes.

### Group 6:  HGT-03 Basic Set

Command: Basic Set Send Basic Set command to the other node in this association group when active endpoint 3.

Association group 6 supports 5 nodes.

### Group 7: HGT-03 Switch Binary Set

Command: Switch Binary Set Send Switch Binary Set command to the other node in this association group when active endpoint 3.

Association group 7 supports 5 nodes.

### Group 8: HGT-04 Basic Set

Command: Basic Set Send Basic Set command to the other node in this association group when active endpoint 4.

Association group 8 supports 5 nodes.

### Group 9: HGT-04 Switch Binary Set

Command: Switch Binary Set Send Switch Binary Set command to the other node in this association group when active endpoint 4.

Association group 9 supports 5 nodes.

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
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 3

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 4

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |

### Documentation Links

* [Manual](https://www.cd-jackson.com/zwave_device_uploads/1112/4-Touch-Modular-Switch-compressed.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1112).
