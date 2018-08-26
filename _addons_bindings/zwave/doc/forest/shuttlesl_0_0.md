---
layout: documentation
title: Shuttle S/L - ZWave
---

{% include base.html %}

# Shuttle S/L Drapery hardware
This describes the Z-Wave device *Shuttle S/L*, manufactured by *Forest Group Nederland B.V* with the thing type UID of ```forest_shuttlesl_00_000```.

The device is in the category of *Blinds*, defining Roller shutters, window blinds, etc..

![Shuttle S/L product image](https://www.cd-jackson.com/zwave_device_uploads/510/510_default.png)


The Shuttle S/L supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

Role type: always on slave

Node type: z-wave plus node

### Inclusion Information

Set your main controller into learn mode. Press configuration button 3 times. Led 3 is ON. Press and hold once more for 4 seconds, led will start blinking for 10 seconds. The Shuttle Z-wave motor will be detected and included into the Z-wave network of your controller.

### Exclusion Information

To exclude, set your main controller into exclude mode. Press configuration button 3 times. Led 3 is ON. Press and hold once more for 4 seconds, led will start blinking for 10 seconds. The Shuttle Z-wave motor will be detected and excluded into the Z-wave network of your controller.

You can also reset the device, but only use this if your main controller is not operable. For reset, press the config button 25 times and confirm by pressing the button once more for 4 seconds until the led blinks 3 times and goes off.

## Channels

The following table summarises the channels available for the Shuttle S/L -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 
| Dimmer | switch_dimmer | DimmableLight | Dimmer | 

### Switch

Switch binary command can be used to turn the Shuttle LZ fully open or fully closed.

Value:

-0x00: Close

-0xFF: Open

Switch the power on and off.

The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer

Values 0-99 (%) are used to set the rail to the preferred position.

Value 255 is used to set the curtain fully open.

The level change is stopped when:

\- stop multilevel start level command is received

\- the curtain reached an end position (fully open or full closed)

Because of version 3 of this command class, the shuttle LZ responds with the following types:

Primary switch type: 0x03

\- 0xFF is Open

\- 0x00 is Closed

Secondary switch type: 0x00 (NOT SUPPORTED)

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.



## Device Configuration

The device has no configuration parameters configured.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Shuttle S/L supports 1 association group.

### Group 1: Lifeline


This group supports 1 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/510/Shuttle-S-L-Z-Wave-EN.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/510).
