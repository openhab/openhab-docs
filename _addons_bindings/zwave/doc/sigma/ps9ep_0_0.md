---
layout: documentation
title: PS9EP - ZWave
---

{% include base.html %}

# PS9EP Z-wave 9 channel_module
This describes the Z-Wave device *PS9EP*, manufactured by *Sigma Designs (Former Zensys)* with the thing type UID of ```sigma_ps9ep_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![PS9EP product image](https://www.cd-jackson.com/zwave_device_uploads/993/993_default.jpg)


The PS9EP supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

There is 9 endpoint 3 binary and 6 multi channel with energy metering   

### Inclusion Information

Press the button 3 times for inclusion 

### Exclusion Information

Press the button 3 times for exclusion 

## Channels

The following table summarises the channels available for the PS9EP -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Brightness  [Deprecated]| switch_dimmer1 | switch_dimmer | DimmableLight | Dimmer | 
| Brightness | switch_dimmer2 | switch_dimmer | DimmableLight | Dimmer | 
| Switch  [Deprecated]| switch_binary3 | switch_binary | Switch | Switch | 
| Brightness  [Deprecated]| switch_dimmer4 | switch_dimmer | DimmableLight | Dimmer | 
| Brightness  [Deprecated]| switch_dimmer5 | switch_dimmer | DimmableLight | Dimmer | 
| Switch  [Deprecated]| switch_binary6 | switch_binary | Switch | Switch | 
| Brightness  [Deprecated]| switch_dimmer7 | switch_dimmer | DimmableLight | Dimmer | 
| Brightness  [Deprecated]| switch_dimmer8 | switch_dimmer | DimmableLight | Dimmer | 

### Switch
<table>
  <tr>
    <td>
       
    </td>
    
    <td>
       
    </td>
    
    <td>
       
    </td>
  </tr>
</table>

Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Brightness [Deprecated]
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer1``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

**Note:** This channel is marked as deprecated so should not be used.

### Brightness
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer2``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Switch [Deprecated]
Switch the power on and off.

The ```switch_binary3``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

**Note:** This channel is marked as deprecated so should not be used.

### Brightness [Deprecated]
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer4``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

**Note:** This channel is marked as deprecated so should not be used.

### Brightness [Deprecated]
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer5``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

**Note:** This channel is marked as deprecated so should not be used.

### Switch [Deprecated]
Switch the power on and off.

The ```switch_binary6``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

**Note:** This channel is marked as deprecated so should not be used.

### Brightness [Deprecated]
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer7``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

**Note:** This channel is marked as deprecated so should not be used.

### Brightness [Deprecated]
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer8``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

**Note:** This channel is marked as deprecated so should not be used.



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The PS9EP supports 1 association group.

### Group 1: Group 1


Association group 1 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_V2| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
#### Endpoint 3

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
#### Endpoint 4

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| |
#### Endpoint 5

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| |
#### Endpoint 6

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
#### Endpoint 7

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| |
#### Endpoint 8

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| |

### Documentation Links

* [pdf](https://www.cd-jackson.com/zwave_device_uploads/993/Home-Automation.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/993).
