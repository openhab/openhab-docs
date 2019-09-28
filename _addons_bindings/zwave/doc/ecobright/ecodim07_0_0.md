---
layout: documentation
title: EcoDim07 - ZWave
---

{% include base.html %}

# EcoDim07 Smart Dimmer Switch 200W LED
This describes the Z-Wave device *EcoDim07*, manufactured by *EcoBright* with the thing type UID of ```ecobright_ecodim07_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![EcoDim07 product image](https://www.cd-jackson.com/zwave_device_uploads/1114/1114_default.jpg)


The EcoDim07 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Remotely controlled multi level push / turn dimmer that can be controlled through Z-Wave and Zigbee (by setting a hardware switch). The dimmer is suitable for 0-200W LED lights where the MIN and MAX values can be set with hardware dials. The dimmer can be installed in a 2 wire setup (no N-wire required) and has a soft start system.

### Inclusion Information

Make sure the right switch is set to Z-Wave. Power on the dimmer, press and hold the reset button for over 4 seconds.

### Exclusion Information

There are two exclusion methods:

1. Exclusion from the primary controller / gateway:

Twice press the reset button, the dimmer will be set to exclusion mode, waiting to be excluded.

2. Factory reset the dimmer (forcing it to be excluded from a network):

Press and hold down the reset button for over 4 seconds, the dimmer will be reset to factory defaults after the BLUE LED indicator blinks.

### General Usage Information

To make the dimmer work optimally you can adjust the lamps optimally to the dimmer with the MIN MAX adjustment.

**Set MIN**

Switch on the lights with the push / turn button. When the lights are on, put a screwdriver in the MIN and turn to the left. When the light becomes unstable turn a little further to the right so that the light remains stable.

**Set MAX**

Switch on the lights with the push / turn button. When the lights are on put a screwdriver in the MAX and turn to the right. When the light becomes unstable turn a little further to the left so that the light remains stable.

## Channels

The following table summarises the channels available for the EcoDim07 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.



## Device Configuration

The following table provides a summary of the 2 configuration parameters available in the EcoDim07.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | State after power restored | Switch state after power failure |
| 2 | Notify load status change | Send notification to associated device when status is changed. |

### Parameter 1: State after power restored

Switch state after power failure
State after power restored. The state the switch should return to once power is restored after power failure.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Off |
| 1 | On |
| 2 | Return to state after power outage |

The manufacturer defined default value is ```1``` (ON).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Notify load status change

Send notification to associated device when status is changed.
Notification when load status changes. The dimmer will send notification to associated device (group lifeline) when the status of the dimmer load is changed.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | The function is disabled |
| 1 | Send switch multilevel report |
| 2 | When load status has not changed |

The manufacturer defined default value is ```1``` (Send switch multilevel report).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The EcoDim07 supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V2| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Smart Dimmer Switch 200W LED Manual](https://www.cd-jackson.com/zwave_device_uploads/1114/EcoDim.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1114).
