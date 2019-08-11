---
layout: documentation
title: heatapp! floor - ZWave
---

{% include base.html %}

# heatapp! floor heatapp! floor is a controller for thermal actuators in underfloor heating installations and is part of the heatapp! system, providing individual circ
This describes the Z-Wave device *heatapp! floor*, manufactured by *EbV* with the thing type UID of ```ebv_heatappfloor_00_000```.

The device is in the category of *Radiator Control*, defining Controls on radiators used to heat up rooms.

![heatapp! floor product image](https://www.cd-jackson.com/zwave_device_uploads/811/811_default.jpg)


The heatapp! floor supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Information at the z-wave alliance product cataloge: https://products.z-wavealliance.org/products/1249

### Inclusion Information

Press the learn key (10) for 2 seconds that will start the inclusion process on the device.

### Exclusion Information

Press the learn key (10) for 2 seconds that will start the exclusion process on the device.

## Channels

The following table summarises the channels available for the heatapp! floor -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch | 
| Switch 2 | switch_binary2 | switch_binary | Switch | Switch | 
| Switch 3 | switch_binary3 | switch_binary | Switch | Switch | 
| Switch 4 | switch_binary4 | switch_binary | Switch | Switch | 
| Switch 5 | switch_binary5 | switch_binary | Switch | Switch | 
| Switch 6 | switch_binary6 | switch_binary | Switch | Switch | 
| Switch 7 | switch_binary7 | switch_binary | Switch | Switch | 
| Switch 8 | switch_binary8 | switch_binary | Switch | Switch | 

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

### Switch 5
Switch the power on and off.

The ```switch_binary5``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 6
Switch the power on and off.

The ```switch_binary6``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 7
Switch the power on and off.

The ```switch_binary7``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 8
Switch the power on and off.

The ```switch_binary8``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.



## Device Configuration

The following table provides a summary of the 2 configuration parameters available in the heatapp! floor.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 |  Missing Radio Link time | Missing Radio Link time |
| 2 | Relay type | 0 normal open, 1 normal close, 2 switching |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 1:  Missing Radio Link time

Missing Radio Link time
Maximum time device will wait for reconnection before it going ot emergency mode (All switches ON). 

It is possible to set in the range of 10 min to 4 hours. Default value is 30 min, only 1 Byte
Values in the range 10 to 240 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Relay type

0 normal open, 1 normal close, 2 switching
Configuaration parameter2 relay type. Default relay type is normal open, only 1 Byte. 0 normal open, 1 normal close, 2 switching
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Normal open |
| 1 | Normal close |
| 2 | Switching |

The manufacturer defined default value is ```0``` (Normal open).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.

### Switch All Mode

Set the mode for the switch when receiving SWITCH ALL commands.

The following option values may be configured -:
| Value  | Description |
|--------|-------------|
| 0 | Exclude from All On and All Off groups |
| 1 | Include in All On group |
| 2 | Include in All Off group |
| 255 | Include in All On and All Off groups |

This parameter has the configuration ID ```switchall_mode``` and is of type ```INTEGER```.


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
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_VERSION_V2| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
#### Endpoint 3

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
#### Endpoint 4

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
#### Endpoint 5

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
#### Endpoint 6

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
#### Endpoint 7

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
#### Endpoint 8

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|

### Documentation Links

* [Installationsanleitung heatapp! floor DE/EN ](https://www.cd-jackson.com/zwave_device_uploads/811/heatapp-floor-210x420-EbV-DE-EN-Druck.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/811).
