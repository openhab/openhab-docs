---
layout: documentation
title: Zerodim - ZWave
---

{% include base.html %}

# Zerodim Q-light / Q-Light Zerodim
This describes the Z-Wave device *Zerodim*, manufactured by *AcTEC (Fuzhou) Electronics Co., Ltd.* with the thing type UID of ```actec_zerodim_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![Zerodim product image](https://opensmarthouse.org/zwavedatabase/1491/image/)


The Zerodim supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Zerodim Z-Wave by Q-light is a wireless smart home device.

Features:  


  * 0-99% dimming range
  * 2-180W LED load
  * Compatible with any Z-Wave or Z-Wave Plus Controller
  * There is memorized function at power off
  * OverLoad protection
  * Soft start function
  * SmartStart
  * This device is a security enable Z-Wave Plus product that is able to use encrypted Z-Wave Plus messages to communicate to other security enable Z-Wave Plus products.

### Inclusion Information

When the primary controller is set to inclusion mode press the main button on the dimmer 3 times in a rapid sequence.   
Lights will start flickering.  
Steady light when finished

### Exclusion Information

When the primary controller is set to exclusion mode press the main button on the dimmer 3 times in a rapid sequence.   
Lights will start flickering.   
Steady light when finished.

### General Usage Information



## Channels

The following table summarises the channels available for the Zerodim -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Scene Number | scene_number | scene_number |  | Number | 
| Alarm (heat) | alarm_heat | alarm_heat | Fire | Switch | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 
| Dimmer 1 | switch_dimmer1 | switch_dimmer | DimmableLight | Dimmer | 

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.

### Alarm (heat)
Indicates if a heat alarm is triggered.

The ```alarm_heat``` channel is of type ```alarm_heat``` and supports the ```Switch``` item and is in the ```Fire``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (power)
Indicates if a power alarm is triggered.

The ```alarm_power``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Dimmer 1
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer1``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.



## Device Configuration

The following table provides a summary of the 9 configuration parameters available in the Zerodim.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Minimum brightness level | Set the desired value from 1 to 98% for the minimum dim level that the dimmer is restricted to; the dimmer will not go lower than the value set here. |
| 2 | Maximum brightness level | Set the desired value from 2 to 99% for the maximum dim level that the dimmer is restricted to; the dimmer will not go higher than the value set here. |
| 3 | Automatic control - dimming step size | This parameter defines the percentage value of dimming step during the automatic control. |
| 4 | Automatic control - time of a dimming step | This parameter defines the time of single dimming step set in parameter 3 during the automatic control. |
| 5 | Manual control - dimming step size | This parameter defines the percentage value of dimming step during the manual control. |
| 6 | Manual control - time of a dimming step | This parameter defines the time of single dimming step setting parameter 5 during the manual control. |
| 7 | State after power failure |  |
| 8 | Scene ID set | Scene ID is set by this configuration. Note: The actual action of each SCENE ID are set by SCENE\_ACTUATOR\_CONF(0x26) command. |
| 9 | Auto-off timer | Auto-off timer in seconds (1s-9.1s). 0 = disabled. |

### Parameter 1: Minimum brightness level

Set the desired value from 1 to 98% for the minimum dim level that the dimmer is restricted to; the dimmer will not go lower than the value set here.

Values in the range 2 to 98 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Maximum brightness level

Set the desired value from 2 to 99% for the maximum dim level that the dimmer is restricted to; the dimmer will not go higher than the value set here.

Values in the range 2 to 99 may be set.

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Automatic control - dimming step size

This parameter defines the percentage value of dimming step during the automatic control.
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 1 to 99 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Automatic control - time of a dimming step

This parameter defines the time of single dimming step set in parameter 3 during the automatic control.
1 - 255 (0.1 - 2.55 s) in 10ms stepsThis is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_4_2``` and is of type ```INTEGER```.


### Parameter 5: Manual control - dimming step size

This parameter defines the percentage value of dimming step during the manual control.
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 1 to 99 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Manual control - time of a dimming step

This parameter defines the time of single dimming step setting parameter 5 during the manual control.
1 - 255 (0.1 - 2.55 s) in 10ms stepsThis is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_6_2``` and is of type ```INTEGER```.


### Parameter 7: State after power failure



Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Scene ID set

Scene ID is set by this configuration. Note: The actual action of each SCENE ID are set by SCENE\_ACTUATOR\_CONF(0x26) command.
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_8_2``` and is of type ```INTEGER```.


### Parameter 9: Auto-off timer

Auto-off timer in seconds (1s-9.1s). 0 = disabled.

Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_9_2``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Zerodim supports 3 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Lifeline
Supports the following command classes:   
- Device Reset Locally: triggered upon reset.    
- Switch Multilevel Report: triggered by local light level change.   
- Notification Report: triggered by Notification.

Association group 1 supports 1 node.

### Group 2: On/Off(rotary knob)

Mirroring of endpoint 1, group2

Association group 2 supports 5 nodes.

### Group 3: Dimmer(rotary knob)

Mirroring of endpoint 1, group3

Association group 3 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_SCENE_ACTUATOR_CONF_V1| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
| COMMAND_CLASS_SECURITY_2_V1| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Instructions Zerodim Zwave norsk a4 web](https://opensmarthouse.org/zwavedatabase/1491/reference/instructions_zerodimzwave_norsk_a4_web.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1491).
