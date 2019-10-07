---
layout: documentation
title: Lumi LM-S4ZW (C-L) - ZWave
---

{% include base.html %}

# Lumi LM-S4ZW (C-L) Z-Wave Switch with 2 on/off light switches and 2 up/down blinds switches
This describes the Z-Wave device *Lumi LM-S4ZW (C-L)*, manufactured by *[Hogar Controls](http://hogarcontrols.com/)* with the thing type UID of ```hogar_lmsxzwcl_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![Lumi LM-S4ZW (C-L) product image](https://www.cd-jackson.com/zwave_device_uploads/1111/1111_default.png)


The Lumi LM-S4ZW (C-L) supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

4 Button Z-Wave Switch: 2 lights and 2 buttons for up/down blinds control.

  * Operating Voltage: 100 - 240V/50Hz
  * Operating Temperature: 0 - 50ºC
  * Power: 700w/button
  * Dimension: 125 x 95 x 34,1 mm (rectangular)

### Inclusion Information

Touch and hold any key on the panel for more than 5 seconds. All indication lights will blinks in blue. At this point release the key, the touch panel will start inclusion process.

### Exclusion Information

Touch and hold any key on the panel for more than 5 seconds. All indication lights will blinks blue in color. At this point release the key, the touch panel will start exclusion process.

## Channels

The following table summarises the channels available for the Lumi LM-S4ZW (C-L) -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch | 
| Dimmer 1 | switch_dimmer1 | switch_dimmer | DimmableLight | Dimmer | 
| Switch 2 | switch_binary2 | switch_binary | Switch | Switch | 
| Dimmer 2 | switch_dimmer2 | switch_dimmer | DimmableLight | Dimmer | 
| Switch 3 | switch_binary3 | switch_binary | Switch | Switch | 
| Dimmer 3 | switch_dimmer3 | switch_dimmer | DimmableLight | Dimmer | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Switch 1
Switch the power on and off.

The ```switch_binary1``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer 1
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer1``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Switch 2
Switch the power on and off.

The ```switch_binary2``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer 2
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer2``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Switch 3
Switch the power on and off.

The ```switch_binary3``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer 3
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer3``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Lumi LM-S4ZW (C-L) supports 9 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 5 nodes.

### Group 2: HGT-01 Basic Set

Basic Set

Association group 2 supports 5 nodes.

### Group 3: HGT-01 Switch Binary Set

Switch Binary Set

Association group 3 supports 5 nodes.

### Group 4: HGT-02 Basic Set

Basic Set

Association group 4 supports 5 nodes.

### Group 5: HGT-02 Switch Binary Set

Switch Binary Set

Association group 5 supports 5 nodes.

### Group 6: HGT-03 Basic Set

Basic Set

Association group 6 supports 5 nodes.

### Group 7: HGT-03 Switch Binary Set

Switch Binary Set

Association group 7 supports 5 nodes.

### Group 8: HGT-04 Basic Set

Basic Set

Association group 8 supports 5 nodes.

### Group 9: HGT-04 Switch Binary Set

Switch Binary Set

Association group 9 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| |
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
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
#### Endpoint 3

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |

### Documentation Links

* [Lumi LM-SxZW Manual](https://www.cd-jackson.com/zwave_device_uploads/1111/Lumi-LM-SxZW-Manual.pdf)
* [[Official] Lumi Switch Manual in English](https://www.cd-jackson.com/zwave_device_uploads/1111/User-Manual-Switch4-V1-0.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1111).
