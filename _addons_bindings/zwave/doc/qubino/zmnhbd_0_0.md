---
layout: documentation
title: ZMNHBD - ZWave
---

{% include base.html %}

# ZMNHBD Flush 2 relays
This describes the Z-Wave device *ZMNHBD*, manufactured by *[Goap](http://www.qubino.com/)* with the thing type UID of ```qubino_zmnhbd_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![ZMNHBD product image](https://www.cd-jackson.com/zwave_device_uploads/215/215_default.jpg)


The ZMNHBD supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

This Z-Wave module is used for switching on or off two electrical devices (e.g. lights or fans,..). The module can be controlled either through Z-Wave network or through the wallswitches. The module is designed to be mounted inside a "flush mountingbox", hidden behind a traditional wall switch. Module measures power consumption of two electrical devices and supports connection of digital temperature sensor. It is designed to act as repeater in order to improve range and stability of Z-wave network.

### Inclusion Information

**Module Inclusion (Adding to Z-Wave network)**

  * Connect module to power supply (with temperature sensor connected -if purchased)
  * Enable add/remove mode on main controller
  * Auto-inclusion (works for about 5 seconds after connected to power supply) or
  * Press push button I1 three times within 3s (3 times change switch state within 3 seconds) or
  * Press service button **S** (only applicable for 24 V SELV supply voltage) for more than 2 seconds.

**NOTE1:** For auto-inclusion procedure, first set main controller into inclusion mode and then connect module to power supply.

**NOTE2:** When connecting temperature sensor to module that has already been included, you have to exclude module first. Switch off power supply , connect the sensor and re-include the module.

### Exclusion Information

**Module Exclusion/Reset (Removing from Z-Wave network)**

  * Connect module to power supply
  * Bring module within maximum 1 meter (3 feet) of the main controller,
  * Enable add/remove mode on main controller,
  * Press push button **I1** five times within 3s (5 times change switch state within 3 seconds) in the first 60 seconds after the module is connected to the power supply or
  * Press service button **S** (only applicable for 24 V SELV supply voltage) for more than 6 seconds.

By this function all parameters of the module are set to default values and own ID is deleted.

If push button I1 is pressed three times within 3s (or service button S is pressed more than 2 and less than 6 seconds) module is excluded, but configuration parameters are not set to default values.

## Channels

The following table summarises the channels available for the ZMNHBD -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch | 
| Electric meter (watts) 1 | meter_watts1 | meter_watts | Energy | Number | 
| Electric meter (kWh) 1 | meter_kwh1 | meter_kwh | Energy | Number | 
| Switch 2 | switch_binary2 | switch_binary | Switch | Switch | 
| Electric meter (watts) 2 | meter_watts2 | meter_watts | Energy | Number | 
| Electric meter (kWh) 2 | meter_kwh2 | meter_kwh | Energy | Number | 
| Sensor (temperature) | sensor_temperature3 | sensor_temperature | Temperature | Number:Temperature | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Switch 1
Switch the power on and off.

The ```switch_binary1``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Electric meter (watts) 1
Indicates the instantaneous power consumption.

The ```meter_watts1``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh) 1
Indicates the energy consumption (kWh).

The ```meter_kwh1``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Switch 2
Switch the power on and off.

The ```switch_binary2``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Electric meter (watts) 2
Indicates the instantaneous power consumption.

The ```meter_watts2``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh) 2
Indicates the energy consumption (kWh).

The ```meter_kwh2``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature3``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.



## Device Configuration

The following table provides a summary of the 17 configuration parameters available in the ZMNHBD.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Input 1 switch type | Input 1 switch type |
| 2 | Input 2 switch type | Input 2 switch type |
| 10 | Functions ALL ON/ALL OFF | Activate / deactivate functions ALL ON/ALL OFF |
| 11 | Automatic turning off output Q1 after set time | When relay Q1 is ON it goes automatically OFF after defined time |
| 12 | Automatic turning on output Q1 after set time | When relay Q1 is OFF it goes automatically ON after defined time |
| 13 | Automatic turning off relay Q2 after set time | When relay Q2 is ON it goes automatically OFF after defined time |
| 14 | Automatic turning on output Q2 after set time | When relay Q2 is OFF it goes automatically ON after defined time |
| 15 | Seconds or milliseconds selection | Automatic turning off / on seconds or milliseconds selection |
| 30 | Saving the state after a power failure | Saving the state of the relays Q1 and Q2 after a power failure |
| 40 | Power reporting in Watts for Q1 | Power reporting in Watts on power change for Q1 |
| 41 | Power reporting in Watts for Q2 | Power reporting in Watts on power change for Q2 |
| 42 | Power reporting time interval for Q1 | Power reporting in Watts by time interval for Q1 |
| 43 | Power reporting time interval for Q2 | Power reporting in Watts by time interval for Q2 |
| 63 | Output Q1 Switch selection |  |
| 64 | Output Q2 Switch selection |  |
| 110 | Temperature sensor offset | Temperature sensor offset settings |
| 120 | Digital temperature sensor reporting | Digital temperature sensor reporting |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 1: Input 1 switch type

Input 1 switch type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | mono-stable switch type (push button) |
| 1 | bi-stable switch type |

The manufacturer defined default value is ```1``` (bi-stable switch type).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Input 2 switch type

Input 2 switch type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | mono-stable switch type (push button) |
| 1 | bi-stable switch type |

The manufacturer defined default value is ```1``` (bi-stable switch type).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 10: Functions ALL ON/ALL OFF

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

This parameter has the configuration ID ```config_10_2``` and is of type ```INTEGER```.


### Parameter 11: Automatic turning off output Q1 after set time

When relay Q1 is ON it goes automatically OFF after defined time
Timer is reset to zero each time the module receive ON command regardless from where it comes  (push button, associated module, controller,..).

  * 0 - Auto OFF disabled
  * 1 - 32535 = 1second (0,01s) - 32535 seconds (325,35s) Auto OFF enabled with define time, step is 1s or 10ms according to parameter nr.15.
Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


### Parameter 12: Automatic turning on output Q1 after set time

When relay Q1 is OFF it goes automatically ON after defined time
Timer is reset to zero each time the module receive OFF command regardless from where it comes (push button, associated module, controller,..).

  * 0 - Auto ON disabled
  * 1 - 32535 = 1second (0,01s) - 32536 seconds (325,35s) Auto ON enabled with define time, step is 1s or 10ms according to parameter nr.15.
Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 13: Automatic turning off relay Q2 after set time

When relay Q2 is ON it goes automatically OFF after defined time
Timer is reset to zero each time the module receive ON command regardless from where it comes (push button, associated module, controller,..).

  * 0 -Auto OFF disabled
  * 1 - 32535 = 1second (0,01s) - 32535 seconds (325,35s) Auto OFF enabled with define time, step is 1s or 10ms according to parameter nr.15.
Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_13_2``` and is of type ```INTEGER```.


### Parameter 14: Automatic turning on output Q2 after set time

When relay Q2 is OFF it goes automatically ON after defined time
Timer is reset to zero each time the module receive OFF command regardless from where it comes (push button, associated module, controller,..).

  * 0 -Auto ON disabled
  * 1 - 32535 = 1second (0,01s) - 32536 seconds (325,35s) Auto ON enabled with define time, step is 1s or 10ms according to parameter nr.15.
Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_14_2``` and is of type ```INTEGER```.


### Parameter 15: Seconds or milliseconds selection

Automatic turning off / on seconds or milliseconds selection
Available configuration parameters:

  * 0 – seconds selected
  * 1 – milliseconds selected

**NOTE:** Parameter is valid for both outputs Q1, Q2 and is the same for turning off or on.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 30: Saving the state after a power failure

Saving the state of the relays Q1 and Q2 after a power failure

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Saves its state before power failure |
| 1 | Does not save the state after a power failure |

The manufacturer defined default value is ```0``` (Saves its state before power failure).

This parameter has the configuration ID ```config_30_1``` and is of type ```INTEGER```.


### Parameter 40: Power reporting in Watts for Q1

Power reporting in Watts on power change for Q1
Set value means percentage, set value from 0 –100 = 0% -100%.

Available configuration parameters:

  * 0 - reporting disabled
  * 1 -100 = 1% -100% Reporting enabled. Power report is send (push) only when actual power in Watts in real time changes for more than set percentage comparing to previous actual power in Watts, step is 1%.

**NOTE:** If power changed is less than 1W, the report is not send (pushed), independent of percentage set.
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_40_1``` and is of type ```INTEGER```.


### Parameter 41: Power reporting in Watts for Q2

Power reporting in Watts on power change for Q2
Set value means percentage, set value from 0 –100 = 0% -100%. Available configuration parameters:

  * 0 - reporting disabled
  * 1 - 100 = 1% - 100% Reporting enabled. Power report is send (push) only when actual power in Watts in real time changes for more than set percentage comparing to previous actual power in Watts, step is 1%.

**NOTE:** If power changed is less than 1W, the report is not send (pushed), independent of percentage set.
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_41_1``` and is of type ```INTEGER```.


### Parameter 42: Power reporting time interval for Q1

Power reporting in Watts by time interval for Q1
Set value means time interval (0 – 32535) in seconds, when power report is send. Available configuration parameters:

  * Default value 300 (power report in Watts is send each 300s)
  * 0 - reporting disabled
  * 1 - 32535 = 1 second - 32535 seconds. Reporting enabled, Power report is send with time interval set by entered value.
Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```300```.

This parameter has the configuration ID ```config_42_2``` and is of type ```INTEGER```.


### Parameter 43: Power reporting time interval for Q2

Power reporting in Watts by time interval for Q2
Set value means time interval (0 –32535) in seconds, when power report is send. Available configuration parameters:

  * Default value 300 (power report in Watts is send each 300s)
  * 0 - reporting disabled
  * 1 - 32535 = 1 second - 32535 seconds. Reporting enabled, Power report is send with time interval set by entered value.
Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```300```.

This parameter has the configuration ID ```config_43_2``` and is of type ```INTEGER```.


### Parameter 63: Output Q1 Switch selection



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | System turned off, output 0V (NC) |
| 1 | System turned off, output is 230V or 24V (NO) |

The manufacturer defined default value is ```0``` (System turned off, output 0V (NC)).

This parameter has the configuration ID ```config_63_1``` and is of type ```INTEGER```.


### Parameter 64: Output Q2 Switch selection



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | System is turned off, output is 0V (NC) |
| 1 | System turned off, output is 230V or 24V (NO) |

The manufacturer defined default value is ```0``` (System is turned off, output is 0V (NC)).

This parameter has the configuration ID ```config_64_1``` and is of type ```INTEGER```.


### Parameter 110: Temperature sensor offset

Temperature sensor offset settings
Set value is added or subtracted to actual measured value by sensor. Available configuration parameters:

  * Default value 32536
  * 32536 - offset is 0.0C
  * From 1 to 100 - value from 0.1 °C to 10.0 °C is added to actual measured temperature.
  * From 1001 to 1100 -value from -0.1 °C to -10.0 °C is subtracted to actual measured temperature.
Values in the range 0 to 32536 may be set.

The manufacturer defined default value is ```32536```.

This parameter has the configuration ID ```config_110_2``` and is of type ```INTEGER```.


### Parameter 120: Digital temperature sensor reporting

Digital temperature sensor reporting
If digital temperature sensor is connected, module reports measured temperature on temperature change defined by this parameter. Available configuration parameters:

  * Default value 5 = 0,5°C
  * 0 – Reporting disabled
  * 1 - 127 = 0,1°C – 12,7°C, step is 0,1°C
Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_120_1``` and is of type ```INTEGER```.

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

The ZMNHBD supports 8 association groups.

### Group 1: Default Reporting Group


Association group 1 supports 1 node.

### Group 2: Q1 basic on/off


Association group 2 supports 16 nodes.

### Group 3: Q1 switch binary


Association group 3 supports 16 nodes.

### Group 4: Q1 power meter


Association group 4 supports 16 nodes.

### Group 5: Q2 basic on/off


Association group 5 supports 16 nodes.

### Group 6: Q2 switch binary


Association group 6 supports 16 nodes.

### Group 7: Q2 power meter


Association group 7 supports 16 nodes.

### Group 8: Multilevel sensor


Association group 8 supports 16 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V7| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 3

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V7| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V2| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/215/Qubino-Flush-2-Relays-PLUS-user-manual-eng-V1-4.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/215).
