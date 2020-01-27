---
layout: documentation
title: ZMNHDD - ZWave
---

{% include base.html %}

# ZMNHDD Flush Dimmer Plus
This describes the Z-Wave device *ZMNHDD*, manufactured by *[Goap](http://www.qubino.com/)* with the thing type UID of ```qubino_zmnhdd_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![ZMNHDD product image](https://www.cd-jackson.com/zwave_device_uploads/210/210_default.png)


The ZMNHDD supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

This Z-Wave module is used for dimming the bulb or to manage the speed of a fan. The module can be controlled either through a Z-Wave network or through the wall switch. The module is designed to be mounted inside a "flush mounting box", hidden behind a traditional wall switch. Module measures power consumption of bulb or fan and supports connection of digital temperature sensor. It is designed to act as repeater in order to improve range and stability of Z-wave network.

### Inclusion Information

WARNING: Service button S **must NOT be used** when module is connected to 110-230V power supply.

  * Connect module to power supply (with temperature sensor connected - if purchased),
  * Enable add/remove mode on main controller
  * Auto-inclusion (works for about 2 minutesafter connected to power supply) or
  * **110V-230V power supply: **Press push button I1 three times within 3 seconds (3 times change switch state within 3 seconds)
  * **24V SELV: **Press service button **S** for more than 2 seconds.

**NOTE1:** For auto-inclusion procedure, first set main controller into inclusion mode and then connect module to power supply.

**NOTE2:** When connecting temperature sensor to module that has already been included, you have to exclude module first. Switch off power supply,connect the sensor and re-include the module.

### Exclusion Information

WARNING: Service button S **must NOT be used** when module is connected to 110-230V power supply.

  * Connect module to power supply
  * Bring module within maximum 1 meter (3 feet) of the main controller
  * Enable add/remove mode on main controller
  * **110V-230V power supply:** Press push button **I1** five times within 3 seconds (5 times change switch state within 3 seconds) in the first 60 seconds after the module is connected to the power supply
  * **24V SELV:** Press ervice button **S** for more than 6 seconds.

By this function all parameters of the module are set to default values and own ID is deleted. If push button I1 is pressed three times within 3 seconds (or service button S is pressed more than 2 and less than 6 seconds) module is excluded, but configuration parameters are not set to default values.

NOTE: If the module is included with parameters 100 or 101 with values different to default and module reset is done, wait at least 30s before next inclusion.

## Channels

The following table summarises the channels available for the ZMNHDD -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch  [Deprecated]| switch_binary | switch_binary | Switch | Switch | 
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Binary Sensor | sensor_binary | sensor_binary |  | Switch | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Reset the total power consumption | meter_reset | meter_reset | Energy | Switch | 
| Alarm | alarm_general | alarm_general | Alarm | Switch | 
| Switch 1  [Deprecated]| switch_binary1 | switch_binary | Switch | Switch | 
| Dimmer 1 | switch_dimmer1 | switch_dimmer | DimmableLight | Dimmer | 
| Electric meter (kWh) 1 | meter_kwh1 | meter_kwh | Energy | Number | 
| Electric meter (watts) 1 | meter_watts1 | meter_watts | Energy | Number | 
| Binary Sensor 2 | sensor_binary2 | sensor_binary |  | Switch | 
| Sensor (temperature) 2 | sensor_temperature2 | sensor_temperature | Temperature | Number:Temperature | 
| Alarm 2 | alarm_general2 | alarm_general | Alarm | Switch | 
| Binary Sensor 3 | sensor_binary3 | sensor_binary |  | Switch | 
| Alarm 3 | alarm_general3 | alarm_general | Alarm | Switch | 

### Switch [Deprecated]
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

**Note:** This channel is marked as deprecated so should not be used.

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Binary Sensor
Indicates if a sensor has triggered.

The ```sensor_binary``` channel is of type ```sensor_binary``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Reset the total power consumption
Reset the meter.

The ```meter_reset``` channel is of type ```meter_reset``` and supports the ```Switch``` item and is in the ```Energy``` category.

### Alarm
Indicates if an alarm is triggered.

The ```alarm_general``` channel is of type ```alarm_general``` and supports the ```Switch``` item and is in the ```Alarm``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Switch 1 [Deprecated]
Switch the power on and off.

The ```switch_binary1``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

**Note:** This channel is marked as deprecated so should not be used.

### Dimmer 1
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer1``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Electric meter (kWh) 1
Indicates the energy consumption (kWh).

The ```meter_kwh1``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts) 1
Indicates the instantaneous power consumption.

The ```meter_watts1``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Binary Sensor 2
Indicates if a sensor has triggered.

The ```sensor_binary2``` channel is of type ```sensor_binary``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Sensor (temperature) 2
Indicates the current temperature.

The ```sensor_temperature2``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Alarm 2
Indicates if an alarm is triggered.

The ```alarm_general2``` channel is of type ```alarm_general``` and supports the ```Switch``` item and is in the ```Alarm``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Binary Sensor 3
Indicates if a sensor has triggered.

The ```sensor_binary3``` channel is of type ```sensor_binary``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Alarm 3
Indicates if an alarm is triggered.

The ```alarm_general3``` channel is of type ```alarm_general``` and supports the ```Switch``` item and is in the ```Alarm``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 23 configuration parameters available in the ZMNHDD.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Input 1 switch type |  |
| 2 | Input 2 switch type |  |
| 3 | Input 2 contact type |  |
| 4 | Input 3 contact type |  |
| 10 | Activate / deactivate functions ALL ON / ALL OFF | Flush dimmer module responds to commands ALL ON / ALL OFF |
| 11 | Automatic turning off output after set time | Auto OFF enabled with defined time, step is 1 second. |
| 12 | Automatic turning on output after set time | Auto ON enabled with defined time, step is 1 second. |
| 20 | Enable / Disable 3-way switch | Dimming is done by push button or switch connected to I1. |
| 21 | Enable / Disable Double click function | A fast double click on the push button will set dimming power at maximum. |
| 30 | Saving the state after a power failure | Saving the state after a power failure |
| 40 | Power reporting in watts on power change | Set value is percentage, set value from 0 - 100 = 0% - 100%. |
| 42 | Power reporting in Watts by time interval | Set value means time interval (0 – 32767) in seconds. |
| 60 | Minimum dimming value | Minimum dimming value is set by entered value. |
| 61 | Maximum dimming value | Maximum dimming value is set by entered value. |
| 65 | Dimming time (soft on/off) | Set value means time of moving the Dimmer between min. and max. dimming values |
| 66 | Dimming time when key pressed | Time of moving the Dimmer between min. and max dimming values |
| 67 | Ignore start level | This parameter is used with association group 3 |
| 68 | Dimming duration | This parameter is used with association group 3 |
| 100 | Enable / Disable Endpoints I2 | Enabling I2 means that Endpoint (I2) will be present on UI. |
| 101 | Enable / Disable Endpoints I3 | Enabling I3 means that Endpoint (I3) will be present on UI. |
| 110 | Temperature sensor offset settings | Offset to actual measured value |
| 120 | Digital temperature sensor reporting | Module reports measured temperature on defined temperature change |
| 250 | Unsecure / Secure Inclusion | Unsecure / Secure Inclusion |

### Parameter 1: Input 1 switch type



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Mono-stable switch type (push button) |
| 1 | Bi-stable switch type |

The manufacturer defined default value is ```0``` (Mono-stable switch type (push button)).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Input 2 switch type



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Mono-stable switch type (push button) |
| 1 | Bi-stable switch type |

The manufacturer defined default value is ```0``` (Mono-stable switch type (push button)).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Input 2 contact type



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | NO (normally open) input type |
| 1 | NC (normally closed) input type |

The manufacturer defined default value is ```0``` (NO (normally open) input type).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Input 3 contact type



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | NO (normally open) input type |
| 1 | NC (normally closed) input type |

The manufacturer defined default value is ```0``` (NO (normally open) input type).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 10: Activate / deactivate functions ALL ON / ALL OFF

Flush dimmer module responds to commands ALL ON / ALL OFF
Flush dimmer module responds to commands ALL ON / ALL OFF that may be sent by the main controller or by other controller belonging to the system.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | ALL ON is not active, ALL OFF is not active |
| 1 | ALL ON is not active, ALL OFF active |
| 2 | ALL ON active, ALL OFF is not active |
| 255 | ALL ON active, ALL OFF active |

The manufacturer defined default value is ```255``` (ALL ON active, ALL OFF active).

This parameter has the configuration ID ```config_10_2``` and is of type ```INTEGER```.


### Parameter 11: Automatic turning off output after set time

Auto OFF enabled with defined time, step is 1 second.
  * 0 - Auto OFF disabled
  * 1 – 32536 = 1 second – 32536 seconds
Values in the range 0 to 32536 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


### Parameter 12: Automatic turning on output after set time

Auto ON enabled with defined time, step is 1 second.
  * 0 - Auto ON disabled
  * 1 – 32536 = 1 second – 32536 seconds
Values in the range 0 to 32536 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 20: Enable / Disable 3-way switch

Dimming is done by push button or switch connected to I1.
Dimming is done by push button or switch connected to I1 (by default).

Enabling 3way switch, dimming can be controlled by push button or switch connected to I1 and I2.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | single push button (connected to I1) |
| 1 | 3-way switch (connected to I1 and I2) |
| 2 | Additional switch connected to I2 |

The manufacturer defined default value is ```0``` (single push button (connected to I1)).

This parameter has the configuration ID ```config_20_1``` and is of type ```INTEGER```.


### Parameter 21: Enable / Disable Double click function

A fast double click on the push button will set dimming power at maximum.
If Double click function is enabled, a fast double click on the push button will set dimming power at maximum dimming value.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | double click disabled |
| 1 | double click enabled |

The manufacturer defined default value is ```0``` (double click disabled).

This parameter has the configuration ID ```config_21_1``` and is of type ```INTEGER```.


### Parameter 30: Saving the state after a power failure

Saving the state after a power failure
If state saving is enabled, flush dimmer module saves its state before power failure (it returns to the last position saved before a power failure).

If state saving is disabled, flush dimmer module does not save the state after a power failure.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Save state enabled |
| 1 | Save state disabled |

The manufacturer defined default value is ```0``` (Save state enabled).

This parameter has the configuration ID ```config_30_1``` and is of type ```INTEGER```.


### Parameter 40: Power reporting in watts on power change

Set value is percentage, set value from 0 - 100 = 0% - 100%.
Set value means percentage, set value from 0 - 100 = 0% - 100%. Default value is 5.

  * 0 – Reporting Disabled
  * 1 – 100 = 1% - 100% Reporting enabled.

Power report is send (push) only when actual power in Watts in real time changes for more than set percentage comparing to previous actual power in Watts, step is 1%.

NOTE: if power changed is less than 1W, the report is not send (pushed), independent of percentage set.
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_40_1``` and is of type ```INTEGER```.


### Parameter 42: Power reporting in Watts by time interval

Set value means time interval (0 – 32767) in seconds.
Set value means time interval (0 – 32767) in seconds, when power report is sent.

  * 0 – reporting disabled
  * 1 – 32767 = 1 second – 32767 seconds. Reporting enabled.

Power report is send with time interval set by entered value.
Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```300```.

This parameter has the configuration ID ```config_42_2``` and is of type ```INTEGER```.


### Parameter 60: Minimum dimming value

Minimum dimming value is set by entered value.
  * 1-98 = 1% – 98%, step is 1%. Minimum dimming value is set by entered value.

NOTE: The minimum level may not be higher than the maximum level! 1% min. dimming value is defined by Z- Wave multilevel device class.
Values in the range 1 to 98 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_60_1``` and is of type ```INTEGER```.


### Parameter 61: Maximum dimming value

Maximum dimming value is set by entered value.
  * 2-99 = 2% – 99%, step is 1%. Maximum dimming value is set by entered value.

NOTE: The maximum level may not be lower than the minimum level! 99% max. dimming value is defined by Z- Wave multilevel device class.
Values in the range 2 to 99 may be set.

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_61_1``` and is of type ```INTEGER```.


### Parameter 65: Dimming time (soft on/off)

Set value means time of moving the Dimmer between min. and max. dimming values
Set value means time of moving the Dimmer between min. and max. dimming values by short press of push button I1 or controlled through UI (BasicSet).

  * default value 100 = 1s
  * 1 - 255 = 100 mseconds – 25500 mseconds, step is 10 mseconds
Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_65_2``` and is of type ```INTEGER```.


### Parameter 66: Dimming time when key pressed

Time of moving the Dimmer between min. and max dimming values
Time of moving the Dimmer between min. and max dimming values by continuous hold of push button I1 or associated device.

  * default value 3 = 3s
  * 1- 255 = 1 second – 255 seconds.
Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_66_2``` and is of type ```INTEGER```.


### Parameter 67: Ignore start level

This parameter is used with association group 3
This parameter is used with association group 3. A receiving device SHOULD respect the start level if the Ignore Start Level bit is 0. A receiving device MUST ignore the start level if the Ignore Start Level bit is 1.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | respect start level |
| 1 | ignore start level |

The manufacturer defined default value is ```0``` (respect start level).

This parameter has the configuration ID ```config_67_1``` and is of type ```INTEGER```.


### Parameter 68: Dimming duration

This parameter is used with association group 3
This parameter is used with association group 3. The Duration field MUST specify the time that the transition should take from the current value to the new target value. A supporting device SHOULD respect the specified Duration value.
Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_68_1``` and is of type ```INTEGER```.


### Parameter 100: Enable / Disable Endpoints I2

Enabling I2 means that Endpoint (I2) will be present on UI.
Enabling I2 means that Endpoint (I2) will be present on UI. Disabling it will result in hiding the endpoint according to the parameter set value. Additionally, a Notification Type and Event can be selected for the endpoint.

NOTE1: After parameter change, first exclude module (without setting parameters to default value) then wait at least 30s and then re include the module!

NOTE 2: When the parameter is set to value 9 the notifications are send for Home Security.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Home Security |
| 2 | Carbon Monoxide |
| 3 | Carbon Dioxide |
| 4 | Water Alarm |
| 5 | Heat Alarm |
| 6 | Smoke Alarm |
| 9 | Sensor binary |

The manufacturer defined default value is ```0``` (Disabled).

This parameter has the configuration ID ```config_100_1``` and is of type ```INTEGER```.


### Parameter 101: Enable / Disable Endpoints I3

Enabling I3 means that Endpoint (I3) will be present on UI.
Enabling I3 means that Endpoint (I3) will be present on UI. Disabling it will result in hiding the endpoint according to the parameter set value. Additionally, a Notification Type and Event can be selected for the endpoint.

NOTE1: After parameter change, first exclude module (without setting parameters to default value) then wait at least 30s and then re include the module!

NOTE 2: When the parameter is set to value 9 the notifications are send for Home Security.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Home Security |
| 2 | Carbon Monoxide |
| 3 | Carbon Dioxide |
| 4 | Water Alarm |
| 5 | Heat Alarm |
| 6 | Smoke Alarm |
| 9 | Sensor binary |

The manufacturer defined default value is ```0``` (Disabled).

This parameter has the configuration ID ```config_101_1``` and is of type ```INTEGER```.


### Parameter 110: Temperature sensor offset settings

Offset to actual measured value
Set value is added or subtracted to actual measured value by sensor. Available configuration parameters:

  * default value 32536
  * 32536 – offset is 0.0C
  * From 1 to 100 – value from 0.1 °C to 10.0 °C is added to actual measured temperature.
  * From 1001 to 1100 -value from -0.1 °C to -10.0 °C is subtracted to actual measured temperature.
Values in the range 1 to 32536 may be set.

The manufacturer defined default value is ```32536```.

This parameter has the configuration ID ```config_110_2``` and is of type ```INTEGER```.


### Parameter 120: Digital temperature sensor reporting

Module reports measured temperature on defined temperature change
If digital temperature sensor is connected, module reports measured temperature on temperature change defined by this parameter. Available configuration parameters:

  * default value 5 = 0.5°C
  * 0 – Reporting disabled
Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_120_1``` and is of type ```INTEGER```.


### Parameter 250: Unsecure / Secure Inclusion

Unsecure / Secure Inclusion
The Flush dimmer supports both, the secure and unsecure inclusion. Even if the controller does not support security command classes, a dimmer could be included as unsecure and keep all the functionalityThis is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Unsecure Inclusion |
| 1 | Secure Inclusion |

The manufacturer defined default value is ```0``` (Unsecure Inclusion).

This parameter has the configuration ID ```config_250_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZMNHDD supports 11 association groups.

### Group 1: Controller Updates

Lifeline group

Association group 1 supports 1 node.

### Group 2: I1 basic on/off

Triggered at change of the input I1 state and reflecting its state

Association group 2 supports 16 nodes.

### Group 3: I1 start/stop level change

Triggered at change of the input I1 state and reflecting its state

Association group 3 supports 16 nodes.

### Group 4: Multilevel

Triggered at changes of state/value of the Flush Dimmer

Association group 4 supports 16 nodes.

### Group 5: I2 basic on/off

Triggered at change of the input I2 state and reflecting its state

Association group 5 supports 16 nodes.

### Group 6: I2 notification report

Triggered at change of the input I2 state and reflecting its state

Association group 6 supports 16 nodes.

### Group 7: I2 binary sensor

Triggered at change of the input I2 state and reflecting its state

Association group 7 supports 16 nodes.

### Group 8: I3 basic on/off

Triggered at change of the input I3 state and reflecting its state

Association group 8 supports 16 nodes.

### Group 9: I3 notification report

Triggered at change of the input I3 state and reflecting its state

Association group 9 supports 16 nodes.

### Group 10: I3 binary sensor

Triggered at change of the input I3 state and reflecting its state

Association group 10 supports 16 nodes.

### Group 11: Multilevel sensor

Triggered at change of temperature sensor

Association group 11 supports 16 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| Linked to BASIC|
| COMMAND_CLASS_SENSOR_BINARY_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| Linked to BASIC|
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SENSOR_MULTILEVEL_V7| |
| COMMAND_CLASS_ALARM_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 3

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_ALARM_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [User Manual V1.6-2](https://www.cd-jackson.com/zwave_device_uploads/210/Qubino-Flush-Dimmer-PLUS-user-manual-V1-6-2.pdf)
* [Qubino_Flush-Dimmer-PLUS-user-manual_V1.9_eng-1.pdf](https://www.cd-jackson.com/zwave_device_uploads/210/Qubino-Flush-Dimmer-PLUS-user-manual-V1-9-eng-1.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/210).
