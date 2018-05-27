---
layout: documentation
title: ZMNHAA - ZWave
---

{% include base.html %}

# ZMNHAA Flush 1 relay
This describes the Z-Wave device *ZMNHAA*, manufactured by *[Goap](http://www.qubino.com/)* with the thing type UID of ```qubino_zmnhaa_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

The ZMNHAA does not permanently listening for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour. The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/205) to improve the documentation.

## Channels

The following table summarises the channels available for the ZMNHAA

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 
| Sensor (temperature) | sensor_temperature | Temperature | Number | 
| Electric meter (kWh) | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | Energy | Number | 
| Binary Sensor 1 | sensor_binary1 | Door | Switch | 
| Binary Sensor 2 | sensor_binary2 | Door | Switch | 

### Switch

Switch the power on and off

The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Sensor (temperature)

Indicates the current temperature

The ```sensor_temperature``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)

Indicates the energy consumption (kWh)

The ```meter_kwh``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)

Indicates the instantaneous power consumption

The ```meter_watts``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Binary Sensor 1

Indicates if a sensor has triggered
        

The ```sensor_binary1``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Binary Sensor 2

Indicates if a sensor has triggered
        

The ```sensor_binary2``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |



## Device Configuration

The following table provides a summary of the 8 configuration parameters available in the ZMNHAA.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Input 1 switch type | Input 1 switch type |
| 2 | Input 2 contact type | Input 2 contact type |
| 3 | Input 3 contact type | Input 3 contact type |
| 10 | Activate / deactivate functions ALL ON/ALL OFF | Flush 1 relay module responds to commands ALL ON / ALL OFF that may be sent by the main controller or by other controller belonging to the system. |
| 11 | Automatic turning off relay after set time | 0 - Auto OFF disabled 1 – 65535 = 0,01second – 655,35 seconds Auto OFF enabled with define time, step is 10mseconds |
| 30 | Saving the state of the relay after a power failure | Saving the state of the relay after a power failure |
| 40 | Power reporting in Watts on power change | 0 – Reporting Disabled 1 – 100 = 1% - 100% Reporting enabled Power report is send (push) only when actual power in Watts in real time change for more than set percentage comparing to previous actual power in Watts, step is 1%. NOTE: if power chan |
| 42 | Power reporting in Watts on power change | default value 300 (power report in Watts is send each 300s) 0 – Reporting Disabled 1 – 65535 = 1second – 65535 seconds. Reporting enabled. Power report is send with time interval set by entered value. |

### Parameter 1: Input 1 switch type

Input 1 switch type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | mono-stable switch type (push button) |
| 1 | bi-stable switch type |

The manufacturer defined default value is ```1``` (bi-stable switch type).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Input 2 contact type

Input 2 contact type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | NO (normaly open) input type |
| 1 | NC (normaly close) input type |

The manufacturer defined default value is ```0``` (NO (normaly open) input type).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Input 3 contact type

Input 3 contact type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | NO (normaly open) input type |
| 1 | NC (normaly close) input type |

The manufacturer defined default value is ```0``` (NO (normaly open) input type).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 10: Activate / deactivate functions ALL ON/ALL OFF

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


### Parameter 11: Automatic turning off relay after set time

0 - Auto OFF disabled 1 – 65535 = 0,01second – 655,35 seconds Auto OFF enabled with define time, step is 10mseconds

Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


### Parameter 30: Saving the state of the relay after a power failure

Saving the state of the relay after a power failure

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Flush 1relay module saves its state before power failure (it returns t |
| 1 | Flush 1relay module does not save the state after a power failure, it |

The manufacturer defined default value is ```0``` (Flush 1relay module saves its state before power failure (it returns t).

This parameter has the configuration ID ```config_30_1``` and is of type ```INTEGER```.


### Parameter 40: Power reporting in Watts on power change

0 – Reporting Disabled 1 – 100 = 1% - 100% Reporting enabled Power report is send (push) only when actual power in Watts in real time change for more than set percentage comparing to previous actual power in Watts, step is 1%. NOTE: if power chan

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_40_1``` and is of type ```INTEGER```.


### Parameter 42: Power reporting in Watts on power change

default value 300 (power report in Watts is send each 300s) 0 – Reporting Disabled 1 – 65535 = 1second – 65535 seconds. Reporting enabled. Power report is send with time interval set by entered value.

Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```300```.

This parameter has the configuration ID ```config_42_2``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZMNHAA supports 4 association groups.

### Group 1: basic on/off (triggered at change of the output 
Q state and reflecti


This group supports 4 nodes.

### Group 2:  basic on/off (triggered at change of the input I2 
state and reflect


This group supports 4 nodes.

### Group 3:  basic on/off (triggered at change of the input I3 
state and reflect


This group supports 4 nodes.

### Group 4: Controller Updates


This group supports 1 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V3| |
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
| COMMAND_CLASS_SENSOR_BINARY_V0| Linked to BASIC|
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SENSOR_BINARY_V0| Linked to BASIC|

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/205/flush-1-relay-ZMNHAA2.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/205).
