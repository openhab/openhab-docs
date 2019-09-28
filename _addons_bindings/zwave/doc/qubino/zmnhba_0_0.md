---
layout: documentation
title: ZMNHBA - ZWave
---

{% include base.html %}

# ZMNHBA Flush 2 relays
This describes the Z-Wave device *ZMNHBA*, manufactured by *[Goap](http://www.qubino.com/)* with the thing type UID of ```qubino_zmnhba_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![ZMNHBA product image](https://www.cd-jackson.com/zwave_device_uploads/208/208_default.png)


The ZMNHBA supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

This Z-Wave module is used for switching on or off two electrical devices (e.g. lights, fans, etc ...).  
The module can be controlled either through Z-Wave network or through the wall switches.  
The module is designed to be mounted inside a “flush mounting box”, hidden behind a traditional wall switch.  
Module measures power consumption of two electrical devices and supports connection of digital temperature sensor.

### Inclusion Information

  * Connect module to power supply,
  * bring module within maximum 1 meter (3 feet) of the main controller,
  * enable add/remove mode on main controller,
  * auto-inclusion (30 minutes after connected to power supply) or
  * press service button S for more than 2 second or
  * press push button I1 three times within 3s (3 times change switch state within 3  
    seconds).

### Exclusion Information

  * Connect module to power supply
  * bring module within maximum 1 meter (3 feet) of the main controller,
  * enable add/remove mode on main controller,
  * press service button S for more than 6 second or
  * press push button I1 five times within 3s (5 times change switch state within 3 seconds).

By this function all parameters of the module are set to default values and own ID is deleted.  
If service button S is pressed more than 2 and less than 6second module is excluded, but configuration parameters are not set to default values

## Channels

The following table summarises the channels available for the ZMNHBA -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch | 
| Electric meter (kWh) 1 | meter_kwh1 | meter_kwh | Energy | Number | 
| Electric meter (watts) 1 | meter_watts1 | meter_watts | Energy | Number | 
| Switch 2 | switch_binary2 | switch_binary | Switch | Switch | 
| Electric meter (kWh) 2 | meter_kwh2 | meter_kwh | Energy | Number | 
| Electric meter (watts) 2 | meter_watts2 | meter_watts | Energy | Number | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Switch 1
Switch the power on and off.

The ```switch_binary1``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Electric meter (kWh) 1
Indicates the energy consumption (kWh).

The ```meter_kwh1``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts) 1
Indicates the instantaneous power consumption.

The ```meter_watts1``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Switch 2
Switch the power on and off.

The ```switch_binary2``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Electric meter (kWh) 2
Indicates the energy consumption (kWh).

The ```meter_kwh2``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts) 2
Indicates the instantaneous power consumption.

The ```meter_watts2``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.



## Device Configuration

The following table provides a summary of the 10 configuration parameters available in the ZMNHBA.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Input 1 switch type | Input 1 switch type |
| 2 | Input 2 switch type | Input 2 switch type |
| 10 | Activate / deactivate functions ALL ON/ALL OFF | Activate / deactivate functions ALL ON/ALL OFF |
| 11 | Automatic turning off relay Q1 after set time | Automatic turning off relay Q1 after set time |
| 12 | Automatic turning off relay Q2 after set time | Automatic turning off relay Q2 after set time |
| 30 | Saving Q1 and Q2 after a power failure | Saving the state of the relays Q1 and Q2 after a power failure |
| 40 | Power reporting in Watts on power change for Q1 | Power reporting in Watts on power change for Q1 |
| 41 | Power reporting in Watts on power change for Q2 | Power reporting in Watts on power change for Q2 |
| 42 | Power reporting in Watts by time interval for Q1 | Power reporting in Watts by time interval for Q1 |
| 43 | Power reporting in Watts by time interval for Q2 | Power reporting in Watts by time interval for Q2 |
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


### Parameter 11: Automatic turning off relay Q1 after set time

Automatic turning off relay Q1 after set time
Auto OFF enabled with define time, step is 10 mseconds

  * 0 = Auto OFF disabled
  * 1–65535 = 0,01 second – 655,35 seconds
Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


### Parameter 12: Automatic turning off relay Q2 after set time

Automatic turning off relay Q2 after set time
Auto OFF enabled with define time, step is 10 mseconds

  * 0 = Auto OFF disabled
  * 1–65535 = 0,01 second – 655,35 seconds
Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 30: Saving Q1 and Q2 after a power failure

Saving the state of the relays Q1 and Q2 after a power failure

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Saves state before power failure |
| 1 | Do not save state after a power failure |

The manufacturer defined default value is ```0``` (Saves state before power failure ).

This parameter has the configuration ID ```config_30_1``` and is of type ```INTEGER```.


### Parameter 40: Power reporting in Watts on power change for Q1

Power reporting in Watts on power change for Q1
Power report is sent (pushed) only when actual power in Watts in real time changed for more than set percentage comparing to previous actual power in Watts, step is 1%.

  * 0 = Reporting Disabled
  * 1–100 = 1% - 100% Reporting enabled
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_40_1``` and is of type ```INTEGER```.


### Parameter 41: Power reporting in Watts on power change for Q2

Power reporting in Watts on power change for Q2
Power report is sent (pushed) only when actual power in Watts in real time changed for more than set percentage comparing to previous actual power in Watts, step is 1%.

  * 0 = Reporting Disabled
  * 1–100 = 1% - 100% Reporti
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_41_1``` and is of type ```INTEGER```.


### Parameter 42: Power reporting in Watts by time interval for Q1

Power reporting in Watts by time interval for Q1
Default value is 300 (power report in Watts is sent each 300s)

  * 0 = Reporting Disabled
  * 1–65535 = 1 second – 65535 seconds. Reporting enabled.

Power report is sent with time interval set by entered value.
Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```300```.

This parameter has the configuration ID ```config_42_2``` and is of type ```INTEGER```.


### Parameter 43: Power reporting in Watts by time interval for Q2

Power reporting in Watts by time interval for Q2
Default value is 300 (power report in Watts is sent each 300s)

  * 0 = Reporting Disabled
  * 1–65535 = 1 second – 65535 seconds. Reporting enabled.  

Power report is sent with time interval set by entered value.
Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```300```.

This parameter has the configuration ID ```config_43_2``` and is of type ```INTEGER```.

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

The ZMNHBA supports 3 association groups.

### Group 1: Basic on/off Q1


Association group 1 supports 4 nodes.

### Group 2: Basic on/off Q2


Association group 2 supports 4 nodes.

### Group 3: Default Reporting Group


Association group 3 supports 4 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| |
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
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_METER_V3| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/208/flush-2-relays-ZMNHBA2.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/208).
