---
layout: documentation
title: Zerodim 2 phase - ZWave
---

{% include base.html %}

# Zerodim 2 phase Q-light / Q-Light Zerodim 2phase
This describes the Z-Wave device *Zerodim 2 phase*, manufactured by *AcTEC (Fuzhou) Electronics Co., Ltd.* with the thing type UID of ```actec_zerodim2pol_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![Zerodim 2 phase product image](https://opensmarthouse.org/zwavedatabase/1546/image/)


The Zerodim 2 phase supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Zerodim Z-Wave 2 pole is a universal LED dimmer based on the Z-Wave protocol. 

Features:  


  * 0-99% dimming range
  * 2-180W LED load
  * Compatible with any Z-Wave or Z-Wave Plus Controller
  * There is memorized function at power off
  * OverLoad protection
  * Soft start function
  * SmartStart

This device is a security enable Z-Wave Plus product that is able to use encrypted Z-Wave Plus messages to communicate to other security enable Z-Wave Plus products.

### Inclusion Information

Quickly, three times press the rotary button to enter inclusion mode

### Exclusion Information

Quickly, three times press the rotary button to enter exclusion mode

### General Usage Information



## Channels

The following table summarises the channels available for the Zerodim 2 phase -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Scene Number | scene_number | scene_number |  | Number | 
| Alarm (heat) | alarm_heat | alarm_heat | temperature_hot | Switch | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 
| Dimmer1 | switch_dimmer1 | switch_dimmer | DimmableLight | Dimmer | 

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.

### Alarm (heat)
Indicates if a heat alarm is triggered.

The ```alarm_heat``` channel is of type ```alarm_heat``` and supports the ```Switch``` item and is in the ```temperature_hot``` category. This is a read only channel so will only be updated following state changes from the device.

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

### Dimmer1
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer1``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.



## Device Configuration

The following table provides a summary of the 9 configuration parameters available in the Zerodim 2 phase.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Minimum brightness level | Set the desired value from 1 to 98% for the minimum dim level that the dimmer is restricted to; the dimmer will not go lower than the value set here. |
| 2 | Maximum brightness level | Set the desired value from 2 to 99% for the maximum dim level that the dimmer is restricted to; the dimmer will not go higher than the value set here. |
| 3 | Automatic control - dimming step size | This parameter defines the percentage value of dimming step during the automatic control. |
| 4 | Automatic control - time of a dimming step | This parameter defines the time of single dimming step set in parameter 3 during the automatic control. |
| 5 | Manual control - dimming step size | This parameter defines the percentage value of dimming step during the manual control. |
| 6 | Manual control - time of a dimming step | This parameter defines the time of single dimming step setting parameter 5 during the manual control. |
| 7 | State after power failure | Restore state after power failure |
| 8 | Scene ID set | Scene ID is set by this configuration. Note: The actual action of each SCENE ID are set by SCENE\_ACTUATOR\_CONF(0x26) command. |
| 9 | Auto-off timer | Auto-off timer in seconds (1s-9.1h). 0 = disabled. |

### Parameter 1: Minimum brightness level

Set the desired value from 1 to 98% for the minimum dim level that the dimmer is restricted to; the dimmer will not go lower than the value set here.

Values in the range 2 to 99 may be set.

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

Restore state after power failure
0=no restore of state

1=restore stateThis is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Scene ID set

Scene ID is set by this configuration. Note: The actual action of each SCENE ID are set by SCENE\_ACTUATOR\_CONF(0x26) command.
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_8_2``` and is of type ```INTEGER```.


### Parameter 9: Auto-off timer

Auto-off timer in seconds (1s-9.1h). 0 = disabled.

Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_9_2``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The device does not support associations.
## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| Linked to BASIC|
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
| COMMAND_CLASS_BASIC_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Manual - Scanned from box](https://opensmarthouse.org/zwavedatabase/1546/reference/Manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1546).
