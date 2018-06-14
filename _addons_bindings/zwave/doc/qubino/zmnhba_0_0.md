---
layout: documentation
title: ZMNHBA - ZWave
---

{% include base.html %}

# ZMNHBA Flush 2 relays
This describes the Z-Wave device *ZMNHBA*, manufactured by *[Goap](http://www.qubino.com/)* with the thing type UID of ```qubino_zmnhba_00_000```.

The ZMNHBA supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/208) to improve the documentation.

## Channels

The following table summarises the channels available for the ZMNHBA -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 
| Sensor (temperature) | sensor_temperature | Temperature | Number | 
| Electric meter (kWh) | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | Energy | Number | 
| Switch 1 | switch_binary1 | Switch | Switch | 
| Electric meter (kWh) 1 | meter_kwh1 | Energy | Number | 
| Electric meter (watts) 1 | meter_watts1 | Energy | Number | 
| Switch 2 | switch_binary2 | Switch | Switch | 
| Electric meter (kWh) 2 | meter_kwh2 | Energy | Number | 
| Electric meter (watts) 2 | meter_watts2 | Energy | Number | 

### Switch

Switch the power on and off.

The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Sensor (temperature)

Indicates the current temperature.

The ```sensor_temperature``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)

Indicates the energy consumption (kWh).

The ```meter_kwh``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)

Indicates the instantaneous power consumption.

The ```meter_watts``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Switch 1

Switch the power on and off.

The ```switch_binary1``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Electric meter (kWh) 1

Indicates the energy consumption (kWh).

The ```meter_kwh1``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts) 1

Indicates the instantaneous power consumption.

The ```meter_watts1``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Switch 2

Switch the power on and off.

The ```switch_binary2``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Electric meter (kWh) 2

Indicates the energy consumption (kWh).

The ```meter_kwh2``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts) 2

Indicates the instantaneous power consumption.

The ```meter_watts2``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.



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
| 40 | Power reporting in Watts on power change for Q1 | Power report is sent (pushed) only when actual power in Watts in real time changed for more than set percentage comparing to previous actual power in Watts, step is 1%.

- 0 = Reporting Disabled
- 1–100 = 1% - 100% Reporti |
| 41 | Power reporting in Watts on power change for Q2 | Power report is sent (pushed) only when actual power in Watts in real time changed for more than set percentage comparing to previous actual power in Watts, step is 1%.

- 0 = Reporting Disabled
- 1–100 = 1% - 100% Reporti |
| 42 | Power reporting in Watts by time interval for Q1 | default value is 300 (power report in Watts is sent each 300s)

- 0 = Reporting Disabled
- 1–65535 = 1 second – 65535 seconds. Reporting enabled. Power report is sent with time interval set by entered value. |
| 43 | Power reporting in Watts by time interval for Q2 | default value is 300 (power report in Watts is sent each 300s)

- 0 = Reporting Disabled
- 1–65535 = 1 second – 65535 seconds. Reporting enabled. Power report is sent with time interval set by entered value. |
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

- 0 = Auto OFF disabled
- 1–65535 = 0,01 second – 655,35 seconds
Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


### Parameter 12: Automatic turning off relay Q2 after set time

Automatic turning off relay Q2 after set time
Auto OFF enabled with define time, step is 10 mseconds

- 0 = Auto OFF disabled
- 1–65535 = 0,01 second – 655,35 seconds
Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 30: Saving Q1 and Q2 after a power failure

Saving the state of the relays Q1 and Q2 after a power failure

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Flush 2 relays module saves its state before power failure (it returns |
| 1 | Flush 2 relays module does not save the state after a power failure, i |

The manufacturer defined default value is ```0``` (Flush 2 relays module saves its state before power failure (it returns).

This parameter has the configuration ID ```config_30_1``` and is of type ```INTEGER```.


### Parameter 40: Power reporting in Watts on power change for Q1

Power report is sent (pushed) only when actual power in Watts in real time changed for more than set percentage comparing to previous actual power in Watts, step is 1%.

- 0 = Reporting Disabled
- 1–100 = 1% - 100% Reporti

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_40_1``` and is of type ```INTEGER```.


### Parameter 41: Power reporting in Watts on power change for Q2

Power report is sent (pushed) only when actual power in Watts in real time changed for more than set percentage comparing to previous actual power in Watts, step is 1%.

- 0 = Reporting Disabled
- 1–100 = 1% - 100% Reporti

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_41_1``` and is of type ```INTEGER```.


### Parameter 42: Power reporting in Watts by time interval for Q1

default value is 300 (power report in Watts is sent each 300s)

- 0 = Reporting Disabled
- 1–65535 = 1 second – 65535 seconds. Reporting enabled. Power report is sent with time interval set by entered value.

Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```300```.

This parameter has the configuration ID ```config_42_2``` and is of type ```INTEGER```.


### Parameter 43: Power reporting in Watts by time interval for Q2

default value is 300 (power report in Watts is sent each 300s)

- 0 = Reporting Disabled
- 1–65535 = 1 second – 65535 seconds. Reporting enabled. Power report is sent with time interval set by entered value.

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


This group supports 4 nodes.

### Group 2: Basic on/off Q2


This group supports 4 nodes.

### Group 3: Default Reporting Group


This group supports 4 nodes.

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
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_METER_V3| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_METER_V3| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/208/flush-2-relays-ZMNHBA2.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/208).
