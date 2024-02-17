---
layout: documentation
title: Heatit_ZM_dimmer_250W - ZWave
---

{% include base.html %}

# Heatit\_ZM\_dimmer\_250W Heatit\_ZM\_dimmer\_250W
This describes the Z-Wave device *Heatit_ZM_dimmer_250W*, manufactured by *ThermoFloor* with the thing type UID of ```thermofloor_zmdimInwall_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![Heatit_ZM_dimmer_250W product image](https://opensmarthouse.org/zwavedatabase/1598/image/)


The Heatit_ZM_dimmer_250W supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Inwall dimmer for 230VAC

### Inclusion Information

Add/remove mode is indicated on the device by a blinking green LED. It indicates this for 90 seconds until a timeout occurs, or until the module has been added to/removed from the network. Configuration mode can also be cancelled by performing the same procedure used for starting Configuration mode.

To start the configuration process, press the reset button 3 times in rapid succession. The LED will light up in solid green for 3 seconds if add/remove is successful. The device is now ready for use with default settings.

### Exclusion Information

Add/remove mode is indicated on the device by a blinking green LED. It indicates this for 90 seconds until a timeout occurs, or until the module has been added to/removed from the network. Configuration mode can also be cancelled by performing the same procedure used for starting Configuration mode.

To start the configuration process, press the reset button 3 times in rapid succession. The LED will light up in solid green for 3 seconds if add/remove is successful. The device is now ready for use with default settings.

### General Usage Information



## Channels

The following table summarises the channels available for the Heatit_ZM_dimmer_250W -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Scene Number | scene_number | scene_number |  | Number | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 

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

### Alarm (power)
Indicates if a power alarm is triggered.

The ```alarm_power``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 15 configuration parameters available in the Heatit_ZM_dimmer_250W.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Power restore level | The state the dimmer should return to once power is restored after a power failure. |
| 2 | Switch ON level | Defines the dimming level when restored from the OFF state. |
| 3 | Automatic turn OFF | Time for the dimmer to turn off automatically after turning it on |
| 4 | Automatic turn ON | Time for the dimmer to turn on automatically after turning it off. |
| 5 | Turn off delay time | The time it takes before the dimmer turns off after turning it off. |
| 6 | S1 functionality | Decide the S1 switch functionality. |
| 7 | S2 functionality | Decide the S2 switch functionality. |
| 8 | Dimming duration | Define how long it takes to dim when using the external switch.. |
| 9 | Choose the dimmer curve | Choose if the dimmer uses Linear or Logarythmic dimming. |
| 10 | Load dimming mode | Choose the dimming type. |
| 11 | Maximum dim level | Highest dim level of the dimmer |
| 12 | Minimum dim level | Lowest dim level of the dimmer. |
| 13 | Meter report threshold | Threshold for device to send meter report in W. |
| 14 | Meter report interval | Time interval between consecutive meter reports in seconds. |
| 15 | ON/OFF Functionality | Decide if the connected load should only turn ON/ OFF and not dim |

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

Time for the dimmer to turn off automatically after turning it on

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


### Parameter 6: S1 functionality

Decide the S1 switch functionality.

Values in the range 0 to 3 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: S2 functionality

Decide the S2 switch functionality.

Values in the range 0 to 3 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Dimming duration

Define how long it takes to dim when using the external switch..

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

Highest dim level of the dimmer

Values in the range 2 to 99 may be set.

The manufacturer defined default value is ```90```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Minimum dim level

Lowest dim level of the dimmer.

Values in the range 1 to 98 may be set.

The manufacturer defined default value is ```15```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: Meter report threshold

Threshold for device to send meter report in W.

Values in the range 0 to 250 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: Meter report interval

Time interval between consecutive meter reports in seconds.

Values in the range 30 to 65535 may be set.

The manufacturer defined default value is ```810```.

This parameter has the configuration ID ```config_14_2``` and is of type ```INTEGER```.


### Parameter 15: ON/OFF Functionality

Decide if the connected load should only turn ON/ OFF and not dim

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Heatit_ZM_dimmer_250W supports 3 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 1 node.

### Group 2: Basic set


Association group 2 supports 5 nodes.

### Group 3: Switch Multilevel


Association group 3 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_CENTRAL_SCENE_V3| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
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

* [Manual](https://opensmarthouse.org/zwavedatabase/1598/reference/Heatit_ZM_dimmer_250W_manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1598).
