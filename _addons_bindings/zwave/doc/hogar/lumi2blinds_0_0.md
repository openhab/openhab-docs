---
layout: documentation
title: Lumi 2 Blinds ZWave Switch - ZWave
---

{% include base.html %}

# Lumi 2 Blinds ZWave Switch Lumi 2 blinds ZWave Controller with 4*Up/Down buttons
This describes the Z-Wave device *Lumi 2 Blinds ZWave Switch*, manufactured by *[Hogar Controls](http://hogarcontrols.com/)* with the thing type UID of ```hogar_lumi2blinds_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![Lumi 2 Blinds ZWave Switch product image](https://www.cd-jackson.com/zwave_device_uploads/1179/1179_default.png)


The Lumi 2 Blinds ZWave Switch supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

With a stunning glass face and an advanced capacitive touch sensor, all you need to do is just use a finger for turning your lights on and off. Tap once on the backlit touch button to switch the device on and tap it again to turn it off, it’s that simple. This 4 Touch Switch ensures an accurate response to every command that is sent through it.  
  
The Hogar 4 Touch Switch can operate either independently or as a part of the Hogar smart home automation system, and even with any other certified Z-Wave home automation system. It is an extremely easy-to-use panel that can be installed in a standard BS 3 gang box. Its operating capabilities include a bi-stable mode, a relay mode or a touch pulse mode for scene control with a maximum load current of 3 amp. It communicates with the Hogar smart home automation system using the Z-Wave wireless communication protocol.

### Inclusion Information

Touch and hold any key on the panel for more than 5 seconds. All indication lights will blink in blue. At this point release the key, the touch panel will start the inclusion process.

### Exclusion Information

Touch and hold any key on the panel for more than 5 seconds. All indication lights will blink in blue. At this point release the key, the touch panel will start the exclusion process.

## Channels

The following table summarises the channels available for the Lumi 2 Blinds ZWave Switch -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer 1 | switch_dimmer1 | switch_dimmer | DimmableLight | Dimmer | 
| Dimmer 2 | switch_dimmer2 | switch_dimmer | DimmableLight | Dimmer | 

### Dimmer 1
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer1``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Dimmer 2
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer2``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.



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
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |

### Documentation Links

* [Lumi_Manual_English](https://www.cd-jackson.com/zwave_device_uploads/1179/User-Manual-Switch4-V1-0.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1179).
