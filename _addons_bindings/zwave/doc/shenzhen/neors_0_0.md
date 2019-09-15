---
layout: documentation
title: NEO Coolcam Roller Shutter - ZWave
---

{% include base.html %}

# NEO Coolcam Roller Shutter NEO Coolcam Roller Shutter - Curtain Switch - NAS-SC03ZE-2-T-V3
This describes the Z-Wave device *NEO Coolcam Roller Shutter*, manufactured by *[Shenzhen Neo Electronics Co., Ltd](http://www.szneo.com/)* with the thing type UID of ```shenzhen_neors_00_000```.

The device is in the category of *Blinds*, defining Roller shutters, window blinds, etc..

![NEO Coolcam Roller Shutter product image](https://www.cd-jackson.com/zwave_device_uploads/1108/1108_default.jpg)


The NEO Coolcam Roller Shutter supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

  * Brand Name: Coolcam
  * Model Number: ZWAVE Curtain Switch
  * ZWAVE Plus frequency: 868.4MHZ
  * Current output: 10A
  * Power consumption: 1.2W
  * operation mode: touch-sensitive
  * power: 80-250V AC,50-60Hz
  * hub: need hub to operate,such as Fibaro,Vera ect
  * size: 86\*86\*34mm

### Inclusion Information

  1. Set Zwave controller intro inclusion mode
  2. power on the device
  3. touch the middle button 3 times within 1s
  4.  the device will be entered into inclusion mode automatically

(All Led lights will be bliked with 1s interval until inclusion successfull)

### Exclusion Information

  1. Set Z-WaveControll into exclusion mode
  2. Pwer on the device
  3. Touch the middle button 3 times within 1s
  4. the device will be entered into exclusion mode

## Channels

The following table summarises the channels available for the NEO Coolcam Roller Shutter -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Blinds Control | blinds_control | blinds_control | Blinds | Rollershutter | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Blinds Control
Provides start / stop control of blinds.

The ```blinds_control``` channel is of type ```blinds_control``` and supports the ```Rollershutter``` item and is in the ```Blinds``` category.



## Device Configuration

The following table provides a summary of the 5 configuration parameters available in the NEO Coolcam Roller Shutter.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Up/Down Button Swap Enable | Up/Down Button Swap Enable |
| 2 | Motor Rotation Direction Swap Enable | Motor Rotation Direction Swap Enable |
| 3 | Backlight Enable | Backlight Enable |
| 4 | Curtain Moving Indicate Enable | Curtain Moving Indicate Enable |
| 5 | Button Switch | Button Switch |

### Parameter 1: Up/Down Button Swap Enable

Up/Down Button Swap Enable

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```1``` (Enabled).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Motor Rotation Direction Swap Enable

Motor Rotation Direction Swap Enable

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```0``` (Disabled).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Backlight Enable

Backlight Enable

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | LED Disabled |
| 1 | LED ON when Switch is ON |

The manufacturer defined default value is ```1``` (LED ON when Switch is ON).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Curtain Moving Indicate Enable

Curtain Moving Indicate Enable

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | LED Disabled |
| 1 | LED Enabled |

The manufacturer defined default value is ```1``` (LED Enabled).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Button Switch

Button Switch

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Button Switch Disabled |
| 1 | Button Switch Enabled |

The manufacturer defined default value is ```1``` (Button Switch Enabled).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The NEO Coolcam Roller Shutter supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V1| |

### Documentation Links

* [Manual](https://www.cd-jackson.com/zwave_device_uploads/1108/NeoRollerS.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1108).
