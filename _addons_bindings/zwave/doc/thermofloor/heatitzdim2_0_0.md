---
layout: documentation
title: HEATIT Z-DIM2 250W - ZWave
---

{% include base.html %}

# HEATIT Z-DIM2 250W Heatit Z-Dim2 is a Z-Wave rotary dimmer for many different types of light fixtures.
This describes the Z-Wave device *HEATIT Z-DIM2 250W*, manufactured by *ThermoFloor* with the thing type UID of ```thermofloor_heatitzdim2_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![HEATIT Z-DIM2 250W product image](https://opensmarthouse.org/zwavedatabase/1626/image/)


The HEATIT Z-DIM2 250W supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Heatit Z-Dim2 is a Z-Wave™ rotary dimmer for many different types of light fixtures. The Heatit Z-Dim2 works on most low loads without causing flickering.

The dimmer is equipped with an external switch option. This allows you to dim and turn on/off the load from an external switch.

Heatit Z-Dim2 is very well suited for LED, and fits into System 55 frames. 

When connecting low loads it is recommended to use a bypass.

### Inclusion Information

Press the Reset button, or the external switch connected to P, 3 times in rapid succession. 

### Exclusion Information

Press the Reset button, or the external switch connected to P, 3 times in rapid succession. 

### General Usage Information



## Channels

The following table summarises the channels available for the HEATIT Z-DIM2 250W -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Scene Number | scene_number | scene_number |  | Number | 

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

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.
This channel provides the scene, and the event as a decimal value in the form ```<scene>.<event>```. The scene number is set by the device, and the event is as follows -:

| Event ID | Event Description  |
|----------|--------------------|
| 0        | Single key press   |
| 1        | Key released       |
| 2        | Key held down      |
| 3        | Double keypress    |
| 4        | Tripple keypress   |
| 5        | 4 x keypress       |
| 6        | 5 x keypress       |



## Device Configuration

The following table provides a summary of the 13 configuration parameters available in the HEATIT Z-DIM2 250W.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Power restore level | The state the dimmer should return to once power is restored after a power failure. |
| 2 | Switch ON level | Defines the dimming level when restored from the OFF state. |
| 3 | Automatic turn OFF | Time for the dimmer to turn off automatically after turning it on. |
| 4 | Automatic turn ON | Time for the dimmer to turn on automatically after turning it off. |
| 5 | Turn off delay time | The time it takes before the dimmer turns off after turning it off. |
| 6 | Rotary wheel press functionality | Decide the rotary wheel press function. |
| 7 | External switch functionality | Decide how external switch function. |
| 8 | Dimming duration | Define how long it takes to dim when using the external switch. |
| 9 | Choose the dimmer curve | Choose if the dimmer uses Linear or Logarythmic dimming. |
| 10 | Load dimming mode | Choose the dimming type. |
| 11 | Maximum dim level | Highest dim level of the dimmer. |
| 12 | Meter report threshold | Threshold for device to send meter report in W. |
| 13 | Meter report interval | Time interval between consecutive meter reports in seconds. |

### Parameter 1: Power restore level

The state the dimmer should return to once power is restored after a power failure.

Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Switch ON level

Defines the dimming level when restored from the OFF state.

Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Automatic turn OFF

Time for the dimmer to turn off automatically after turning it on.

Values in the range 0 to 86400 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_3_4``` and is of type ```INTEGER```.


### Parameter 4: Automatic turn ON

Time for the dimmer to turn on automatically after turning it off.

Values in the range 0 to 86400 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_4_4``` and is of type ```INTEGER```.


### Parameter 5: Turn off delay time

The time it takes before the dimmer turns off after turning it off.

Values in the range 0 to 60 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Rotary wheel press functionality

Decide the rotary wheel press function.

Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: External switch functionality

Decide how external switch function.

Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Dimming duration

Define how long it takes to dim when using the external switch.

Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Choose the dimmer curve

Choose if the dimmer uses Linear or Logarythmic dimming.

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: Load dimming mode

Choose the dimming type.

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: Maximum dim level

Highest dim level of the dimmer.

Values in the range 2 to 99 may be set.

The manufacturer defined default value is ```90```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Meter report threshold

Threshold for device to send meter report in W.

Values in the range 0 to 250 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_12_0``` and is of type ```INTEGER```.


### Parameter 13: Meter report interval

Time interval between consecutive meter reports in seconds.

Values in the range 30 to 65535 may be set.

The manufacturer defined default value is ```780```.

This parameter has the configuration ID ```config_13_2``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The HEATIT Z-DIM2 250W supports 3 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Lifeline. (Normally used by the Z-Wave Controller) Sends:

- Switch Multilevel Report 

- Device Reset Notification

- Indicator Report

- Meter Report

- Central Scene Notification

- Configuration Report

Association group 1 supports 5 nodes.

### Group 2: Basic Set

-Basic Set.

Send Basic Set commands representing the status of the dimmer when changed from

S1 or S2.

OFF/ON (0x00, 0xFF)

1-99% (0x01, 0x63)

Association group 2 supports 5 nodes.

### Group 3: Switch Multilevel

-Switch Multilevel

When S1 or S2 is pressed/held

Press: OFF/ON (0x00, 0xFF)

Held: Multilevel Switch Start Level Change/Stop Level Change Command

Level Increase Start / Level Increase Stop

Level Decrease Start / Level Decrease Stop

Association group 3 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_CENTRAL_SCENE_V3| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_INDICATOR_V3| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [Manual](https://opensmarthouse.org/zwavedatabase/1626/reference/2258.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1626).
