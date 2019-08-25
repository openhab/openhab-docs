---
layout: documentation
title: ZMNHDA - ZWave
---

{% include base.html %}

# ZMNHDA Flush dimmer
This describes the Z-Wave device *ZMNHDA*, manufactured by *[Goap](http://www.qubino.com/)* with the thing type UID of ```qubino_zmnhda_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![ZMNHDA product image](https://www.cd-jackson.com/zwave_device_uploads/209/209_default.png)


The ZMNHDA supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

This Z-Wave module is used for dimming the bulb or to manage the speed of a fan. The module can be controlled either through a Z-Wave network or through the wall switch.   
   
The module is designed to be mounted inside a “flush mounting box” and is hidden behind a traditional wall switch.  
   
Module measures power consumption of bulb or fan and supports connection of digital temperature sensor.

### Inclusion Information

  * Connect module to power supply,
  * bring module within maximum 1 meter (3 feet) of the main controller,
  * enable add/remove mode on main controller,
  * auto-inclusion (30 minutes after connected to power supply) or
  * press service button S for more than 2 seconds or
  * press push button I1 three times within 3s (3 times change switch state within 3 seconds).

### Exclusion Information

  * Connect module to power supply,
  * bring module within maximum 1 meter (3 feet) of the main controller,
  * enable add/remove mode on main controller,
  * press service button S for more than 6 seconds or 
  * press push button I1 five times within 3s (5 times change switch state within 3 seconds)

By this function all parameters of the module are set to default values and own ID is deleted.

If service button S is pressed more than 2 and less than 6 second module is excluded, but configuration parameters are not set to default values. 

## Channels

The following table summarises the channels available for the ZMNHDA -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch  [Deprecated]| switch_binary | switch_binary | Switch | Switch | 
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Binary Sensor 1 | sensor_binary1 | sensor_binary |  | Switch | 
| Binary Sensor 2 | sensor_binary2 | sensor_binary |  | Switch | 

### Switch [Deprecated]
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

**Note:** This channel is marked as deprecated so should not be used.

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Binary Sensor 1
Indicates if a sensor has triggered.

The ```sensor_binary1``` channel is of type ```sensor_binary``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Binary Sensor 2
Indicates if a sensor has triggered.

The ```sensor_binary2``` channel is of type ```sensor_binary``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |



## Device Configuration

The following table provides a summary of the 11 configuration parameters available in the ZMNHDA.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Input 1 switch type | Switch type (input I1) |
| 2 | Input 2 contact type | Input 2 contact type |
| 3 | Input 3 contact type | Input 3 contact type |
| 10 | Activate / deactivate functions ALL ON/ALL OFF | Activate / deactivate functions ALL ON/ALL OFF |
| 30 | State of the device after a power failure | State of the device after a power failure |
| 40 | Power reporting in Watts on power change | Set value means percentage |
| 42 | Power reporting in Watts by time interval | Power reporting in Watts by time interval |
| 60 | Minimum dimming value | Minimum dimming value |
| 61 | Maximum dimming value | Maximum dimming value |
| 65 | Dimming time (soft on/off) | Dimming time (soft on/off) |
| 66 | Dimming time when key pressed | Dimming time when key pressed |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 1: Input 1 switch type

Switch type (input I1)

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | mono-stable switch (push button) |
| 1 | bi-stable (toggle) switch |

The manufacturer defined default value is ```0``` (mono-stable switch (push button)).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Input 2 contact type

Input 2 contact type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | NO (normally open) input type |
| 1 | NC (normally close) input type |

The manufacturer defined default value is ```0``` (NO (normally open) input type).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Input 3 contact type

Input 3 contact type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | NO (normally open) input type |
| 1 | NC (normally close) input type |

The manufacturer defined default value is ```0``` (NO (normally open) input type).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 10: Activate / deactivate functions ALL ON/ALL OFF

Activate / deactivate functions ALL ON/ALL OFF
Flush 1 relay module responds to commands ALL ON / ALL OFF that may be sent by the main controller or by other controller belonging to the system.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | ALL ON is not active ALL OFF is not active |
| 1 | ALL ON is not active ALL OFF active |
| 2 | ALL ON active ALL OFF is not active |
| 255 | ALL ON active, ALL OFF active |

The manufacturer defined default value is ```255``` (ALL ON active, ALL OFF active).

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 30: State of the device after a power failure

State of the device after a power failure

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Saves its state before power failure |
| 1 | Off |

The manufacturer defined default value is ```0``` (Saves its state before power failure).

This parameter has the configuration ID ```config_30_1``` and is of type ```INTEGER```.


### Parameter 40: Power reporting in Watts on power change

Set value means percentage
  * 0 – Reporting Disabled
  * 1 – 100 = 1% - 100% Reporting enabled.

Power report is send (push) only when actual power in Watts in real time change for more than set percentage comparing to previous actual power in Watts, step is 1%. 
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_40_1``` and is of type ```INTEGER```.


### Parameter 42: Power reporting in Watts by time interval

Power reporting in Watts by time interval
Set value means time interval (0 – 65535) in seconds, when power report is send.

  * default value 300 (power report in Watts is send each 300s)
  * 0 – Reporting Disabled
  * 1 – 65535 = 1 second – 65535 seconds. Reporting enabled.

Power report is send with time interval set by entered value. 
Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```300```.

This parameter has the configuration ID ```config_42_2``` and is of type ```INTEGER```.


### Parameter 60: Minimum dimming value

Minimum dimming value
  *  Default value 1 (Minimum dimming value is 1%)
  * 1- 98 = 1% – 98%, step is 1%. Minimum dimming values is set by entered value.

**NOTE**: The maximum level may not be lower than the minimum level! 1% min. dimming value is defined by Z-Wave multilevel device class
Values in the range 0 to 98 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_60_1``` and is of type ```INTEGER```.


### Parameter 61: Maximum dimming value

Maximum dimming value
  * Default value 99 (Maximum dimming value is 99 %)
  * 2- 99 = 2% – 99%, step is 1%. Maximum dimming values is set by entered value.

**NOTE:** The maximum level may not be lower than the minimum level! 99% max. dimming value is defined by Z-Wave multilevel device class
Values in the range 2 to 99 may be set.

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_61_1``` and is of type ```INTEGER```.


### Parameter 65: Dimming time (soft on/off)

Dimming time (soft on/off)
Set value means time of moving the Dimmer between min. and max. dimming values by short press of push button I1 or controlled through UI.

  * Default value 100 (Dimming time between min. and max. dimming values is 1s)
  * 1- 255 = 10mseconds – 2550mseconds (2,55s), step is 10mseconds 
Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_65_1``` and is of type ```INTEGER```.


### Parameter 66: Dimming time when key pressed

Dimming time when key pressed
Time of moving the Dimmer between min. and max dimming values by continues hold of push button I1.

Default value 3 (Dimming time between min. and max. dimming values is 3s)

 1- 255 = 1 second – 255 seconds
Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_66_1``` and is of type ```INTEGER```.

### Switch All Mode

Set the mode for the switch when receiving SWITCH ALL commands.

The following option values may be configured -:
| Value  | Description |
|--------|-------------|
| 0 | Exclude from All On and All Off groups |
| 1 | Include in All On group |
| 2 | Include in All Off group |
| 255 | Include in All On and All Off groups |

This parameter has the configuration ID ```switchall_mode``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZMNHDA supports 4 association groups.

### Group 1: multilevel

 (triggered at changes of state/value of the Flush dimmer)

Association group 1 supports 4 nodes.

### Group 2: basic on/off triggered by the input I2 state


Association group 2 supports 4 nodes.

### Group 3: basic on/off triggered by the input I3 state


Association group 3 supports 4 nodes.

### Group 4: Controller updates


Association group 4 supports 4 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V3| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V1| Linked to BASIC|
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V1| Linked to BASIC|

### Documentation Links

* [User manual v6](https://www.cd-jackson.com/zwave_device_uploads/209/Qubino-Flush-dimmer-user-manual-V6-eng.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/209).
