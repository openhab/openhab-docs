---
layout: documentation
title: ZM Relay - ZWave
---

{% include base.html %}

# ZM Relay Heati Single Relay 16A
This describes the Z-Wave device *ZM Relay*, manufactured by *ThermoFloor* with the thing type UID of ```thermofloor_zmrelay_00_000```.

The device is in the category of *Battery*, defining Batteries, Energy Storages.

![ZM Relay product image](https://opensmarthouse.org/zwavedatabase/1440/image/)


The ZM Relay supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Heatit ZM Single Relay is a high power relay for in-wall installations. The relay allows you to control connected devices either through your Z-Wave network or via a wired switch. The module is equipped with a 16A relay and has a scene controller functionality.

The Heatit ZM Single Relay has a power metering feature that allows you to monitor the power consumption of your connected devices.

Supports encryption modes S0, S2 Authenticated Class, S2 Unauthenticated Class

### Inclusion Information

  1. Set the primary controller to add mode (secure/non-secure).
  2. Press the configuration button or switch connected to S1 x 3 times in rapid succession. 
  3. The device LED will blink in green when adding procedure has been successfully initiated.

When the device has been included in the home automation system, the LED will stay green for 3 seconds. The device is now ready for use with default settings.

### Exclusion Information

  1. Set the primary controller to add mode (secure/non-secure).
  2. Press the configuration button or switch connected to S1 x 3 times in rapid succession. 
  3. The device LED will blink in green when adding procedure has been successfully initiated.

When the device has been included in the home automation system, the LED will stay green for 3 seconds. The device is now ready for use with default settings.

### General Usage Information



## Channels

The following table summarises the channels available for the ZM Relay -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Scene Number | scene_number | scene_number |  | Number | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 
| Alarm (heat) | alarm_heat | alarm_heat | Fire | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

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

### Alarm (heat)
Indicates if a heat alarm is triggered.

The ```alarm_heat``` channel is of type ```alarm_heat``` and supports the ```Switch``` item and is in the ```Fire``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 11 configuration parameters available in the ZM Relay.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Load Limit | Ensures that the device does not draw more current than rated. Immunity for power consumption peaks. |
| 2 | Power shutdown actions | Decide how the device should react when the overload/overheating features has turned relay OFF. |
| 3 | Switch Type | Decides what type of switch is connected. |
| 4 | S1/Button operation | S1/Button actions |
| 5 | Scene notifications | Decides if/what scene controller notifications the device sends to gateway. |
| 6 | Restore Power Level | Relay power level after power is restored from power-outage.When device is from factory/factory reset the first state of the device should be OFF. |
| 7 | Automatic turn OFF | Time to turn relay OFF after having been turned ON. |
| 8 | Automatic turn ON | Time to turn relay ON after having been turned OFF. |
| 9 | Inverted Output | Decides if the relay output should be inverted |
| 10 | Meter report interval | Time interval between consecutive meter reports. Meter reports can also be sent as a result of polling. |
| 11 | Meter report delta value | Decides the delta for meter in Watt for the device issue meter report. This parameter will issue W. |

### Parameter 1: Load Limit

Ensures that the device does not draw more current than rated. Immunity for power consumption peaks.
1-16 ampere. Default is 16 (16 ampere).
Values in the range 1 to 16 may be set.

The manufacturer defined default value is ```16```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Power shutdown actions

Decide how the device should react when the overload/overheating features has turned relay OFF.
0 - Disabled and will not retry. User needs to manually turn on afterwards. If temperature overload is on, device will not turn on until device has cooled down.

32767 - After power shut down (param 1) device will try to turn back ON after delay specified here (time in minutes).
Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 3: Switch Type

Decides what type of switch is connected.
0 - Momentary switch.

1 - Toggle switch.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: S1/Button operation

S1/Button actions
0 - Button turns load on/off and sends Meter report + Relay status.

1 - Button sends Meter report + Relay status, load can be only controlled wirelessly.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Scene notifications

Decides if/what scene controller notifications the device sends to gateway.
0 - Sends scene controller for S2. S1 disabled.

1 - Sends scene controller for S1. S2 disabled.

2 - Sends scene controller for S1 and S2.

3 - Scene controller deactivated.
Values in the range 0 to 3 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Restore Power Level

Relay power level after power is restored from power-outage.When device is from factory/factory reset the first state of the device should be OFF.
0 - Always OFF on restored power.

1 - Always ON on restored power.

2 - Restore last state on restored power).
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Automatic turn OFF

Time to turn relay OFF after having been turned ON.
0 - Auto OFF disabled.

1 - 86400 - Auto Off timeout in seconds.
Values in the range 0 to 86400 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_7_4``` and is of type ```INTEGER```.


### Parameter 8: Automatic turn ON

Time to turn relay ON after having been turned OFF.
0 - Auto ON disabled.

1 - 86400 - Auto ON timeout in seconds.
Values in the range 0 to 86400 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_8_4``` and is of type ```INTEGER```.


### Parameter 9: Inverted Output

Decides if the relay output should be inverted
0 - Standard operation.

1 - Inverted Output.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: Meter report interval

Time interval between consecutive meter reports. Meter reports can also be sent as a result of polling.
30 seconds – 32767 seconds.
Values in the range 30 to 32767 may be set.

The manufacturer defined default value is ```900```.

This parameter has the configuration ID ```config_10_2``` and is of type ```INTEGER```.


### Parameter 11: Meter report delta value

Decides the delta for meter in Watt for the device issue meter report. This parameter will issue W.
5-3600W.
Values in the range 5 to 3600 may be set.

The manufacturer defined default value is ```75```.

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


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
| COMMAND_CLASS_SWITCH_BINARY_V1| |
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

* [Product Sheet](https://opensmarthouse.org/zwavedatabase/1440/reference/Product_Sheet.pdf)
* [Quick Guide](https://opensmarthouse.org/zwavedatabase/1440/reference/Quick_Guide.pdf)
* [User Manual](https://opensmarthouse.org/zwavedatabase/1440/reference/User_Manual_V2020A.pdf)
* [Dimensions](https://opensmarthouse.org/zwavedatabase/1440/reference/Dimensions.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1440).
