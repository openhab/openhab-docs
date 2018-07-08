---
layout: documentation
title: Motion Dimmer Switch - ZWave
---

{% include base.html %}

# Motion Dimmer Switch Motion Dimmer Switch
This describes the Z-Wave device *Motion Dimmer Switch*, manufactured by *Jasco Products* with the thing type UID of ```ge_motiondimmerswitch_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![Motion Dimmer Switch product image](https://www.cd-jackson.com/zwave_device_uploads/840/840_default.png)


The Motion Dimmer Switch supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

#### Description

Set your life in motion with the Z-Wave Plus In-Wall Smart Motion Switch. This energy-efficient sensor works with your home’s gateway to wirelessly trigger scenes and send alerts to your smartphone or tablet whenever motion is has turned lights on or off.

Three different modes offer the best lighting option for you: occupancy, vacancy and manual. In occupancy mode, the lights will automatically turn on when you enter the room and automatically turn off once you’ve left (customizable between 5 seconds and 30 minutes).

In vacancy mode, the lights are turned on manually and will turn off automatically after a preset amount of time. In manual mode, the lights will function as a normal light switch and manually turn on and off. Along with conveniently saving you time and energy costs, the smart motion dimmer can replace any existing light switch in your home, and can be used in 3- and 4-way applications.

You may also coordinate the switch with your household decor with the included white and light almond buttons. Experience the comfort of automation in your life when you come home to the Z-Wave Plus In Wall Smart Motion Switch.

#### Features

- Wirelessly trigger scenes and send alerts when motion detection has turned lights on or off
- Remotely monitor with any mobile device (Requires Z-Wave gateway or controller)
- Compatible with all certified Z-Wave devices
- Requires in-wall installation with hard-wired connections - neutral wire required
- Can be used in 3- and 4-way applications
- Works with all dimmable LED, CFL, halogen and incandescent bulbs
- Multiple operation modes: Occupancy - auto ON/auto OFF, Vacancy - manual ON/auto OFF, Manual - manual ON/OFF
- Built-in timer lets you set length of time light stays on after motion ceases - from 5 seconds to 30 minutes
- 3 sensitivity levels - low, medium, high
- Includes white and light almond paddles
- Indoor use only

#### Technical Specifications

- Specification Value Max Load 600W Incandescent
- 150W Dimmable Power 120VAC, 60Hz
- Operating Temp. Rge 32-104°F (0-40°C)
- Signal Frequency 908.4/916MHz
- Wireless Range Up to 150 feet

### Inclusion Information

Adding your device to a Z-Wave network

1. Follow the instructions for your Z-Wave certified controller to add the smart dimmer to the Z-Wave network.
2. Once the controller is ready to add your smart dimmer, press and release the top or bottom button on the smart dimmer to include it in the network.

To return to factory defaults

Press and release the top button ten times within 5 seconds. The LED will flash 3 times quickly confirming change.

### Exclusion Information

To remove and reset the device

1. Follow the instructions for your Z-Wave certified controller to remove a device from the Z-Wave network.
2. Once the controller is ready to remove your device, press and release the top button on the smart dimmer to remove it from the network.

To return to factory defaults

Press and release the top button ten times within 5 seconds. The LED will flash 3 times quickly confirming change.

## Channels

The following table summarises the channels available for the Motion Dimmer Switch -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Scene Number | scene_number |  | Number | 
| Alarm (burglar) | alarm_burglar | Door | Switch | 
| Dimmer 1 | switch_dimmer1 | DimmableLight | Dimmer | 
| Alarm (burglar) 2 | alarm_burglar2 | Door | Switch | 

### Dimmer

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Scene Number

Triggers when a scene button is pressed.

The ```scene_number``` channel supports the ```Number``` item.

### Alarm (burglar)

Indicates if the burglar alarm is triggered.

The ```alarm_burglar``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |

### Dimmer 1

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer1``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Alarm (burglar) 2

Indicates if the burglar alarm is triggered.

The ```alarm_burglar2``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |



## Device Configuration

The device has no configuration parameters configured.

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
| COMMAND_CLASS_SWITCH_MULTILEVEL_V2| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_SCENE_ACTUATOR_CONF_V1| |
| COMMAND_CLASS_CRC_16_ENCAP_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V4| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V2| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ALARM_V4| |

### Documentation Links

* [Manual](https://www.cd-jackson.com/zwave_device_uploads/840/GE-Jasco-26933-EnFrSp-v1-3.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/840).
