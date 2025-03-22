---
layout: documentation
title: ECO-DIM.07 - ZWave
---

{% include base.html %}

# ECO-DIM.07 LED Smart Dimmer
This describes the Z-Wave device *ECO-DIM.07*, manufactured by *EcoBright* with the thing type UID of ```ecobright_ecodim07a_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![ECO-DIM.07 product image](https://opensmarthouse.org/zwavedatabase/1602/image/)


The ECO-DIM.07 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Two wire dimmer that uses z-wave as the protocol. Has options for leading and trailing and supports up to 250W RC LED and up to 150W RL LED.  
For halogen bulbs and regular light bulbs it supports 10 - 300W.  
Minimum on level can be modified physically by turning a screw.

### Inclusion Information

Remove the device from previous z-wave networks if it was already added. Else the inclusion will fail.  
Press the reset button twice. The indication light will blink blue and stays on for 10 seconds when the inclusion process succeeded. Time out is 15 minutes.

### Exclusion Information

Method1:  
Use the z-wave hub interface to remove the device or reconfigure the device according the documentation.

Method 2:  
Press the reset button 3 times  
The indication light blinks purple and stays on for 10 seconds without blinking when succeeded. Time out is 3 minutes.

### General Usage Information



## Channels

The following table summarises the channels available for the ECO-DIM.07 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number | 
| Electric meter (amps) | meter_current | meter_current | Energy | Number | 

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (volts)
Indicates the instantaneous voltage.

The ```meter_voltage``` channel is of type ```meter_voltage``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (amps)
Indicates the instantaneous current consumption.

The ```meter_current``` channel is of type ```meter_current``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.



## Device Configuration

The following table provides a summary of the 8 configuration parameters available in the ECO-DIM.07.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Power restore level | Status of dimmer after power on |
| 2 | Notification when load status change | Dimmer will send notification to associated devices when the status of dimmer load changes. |
| 3 | External switch dimming speed | Dimming speed of the external switch, unit is second. |
| 4 | Mosfet Driving Type | Choose the dimming type |
| 5 | External switch pairing network | Decide if the external switch can perform inclusion |
| 6 | Dimming Way | Decide if the dimmer uses linear or logarithmic dimming |
| 7 | Switch on level | Setting switch on level from off status, IF set the value to 0, will automatically run 7 |
| 8 | Turn off delay | Setting turn off delay time, unit is second |

### Parameter 1: Power restore level

Status of dimmer after power on
Set the power restore level.
The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | Off |
| 1 | On |
| 2 | Memory |

The manufacturer defined default value is ```0``` (off).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Notification when load status change

Dimmer will send notification to associated devices when the status of dimmer load changes.

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Disable |
| 1 | Enable |

The manufacturer defined default value is ```1``` (Enable).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: External switch dimming speed

Dimming speed of the external switch, unit is second.

Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Mosfet Driving Type

Choose the dimming type

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Trailing Edge |
| 1 | Leading Edge |

The manufacturer defined default value is ```0``` (Trailing Edge).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: External switch pairing network

Decide if the external switch can perform inclusion

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Disable |
| 1 | Enable |

The manufacturer defined default value is ```0``` (Disable).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Dimming Way

Decide if the dimmer uses linear or logarithmic dimming

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | linear |

The manufacturer defined default value is ```0``` (linear).

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Switch on level

Setting switch on level from off status, IF set the value to 0, will automatically run 7
0 = restore last dim level  
1 - 99 = brightness level
Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Turn off delay

Setting turn off delay time, unit is second

Values in the range 0 to 60 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_8_0``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ECO-DIM.07 supports 4 association groups.

### Group 1: Group 1

Lifeline
- Device reset locally noticationcal CC  
- Switch multilevel report CC  
- Meter report

Association group 1 supports 1 node.

### Group 2: Group 2

Basic Set
- OFF/ON (0x00 / 0xFF)  
- 1-99% (0x01, 0x63)

Association group 2 supports 1 node.

### Group 3: Group 3

Know switch multilevel set, when the knob is rotated/pressed
Press: OFF/ON (0x00 / 0xFF)  
rotate: multilevel switch start/stop level change command  
Level increase Start / stop  
Level decrease start / stop

Association group 3 supports 1 node.

### Group 4: Group 4

External button switch multilevel set. When the external button is pressed / held
Press: OFF/ON (0x00 / 0xFF)  
Held: multilevel switch start/stop level change command  
Level increase Start / stop  
Level decrease start / stop

Association group 4 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V2| Linked to BASIC|
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_SECURITY_V1| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [EcoDim.07 z-wave led smart dimmer Manual](https://opensmarthouse.org/zwavedatabase/1602/reference/EcoDim.07_z-wave_led_smart_dimmer_Manual.pdf)
* [Eco-dim.07 ZWave manual (250W)](https://opensmarthouse.org/zwavedatabase/1602/reference/ECO-DIM.07_Z-Wave_Handleiding_NL_DE_EN_WEB.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1602).
