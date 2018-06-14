---
layout: documentation
title: ZMNHOD - ZWave
---

{% include base.html %}

# ZMNHOD Flush Shutter DC
This describes the Z-Wave device *ZMNHOD*, manufactured by *[Goap](http://www.qubino.com/)* with the thing type UID of ```qubino_zmnhod_00_000```.

The device is in the category of *Blinds*, defining Roller shutters, window blinds, etc..

![ZMNHOD product image](https://www.cd-jackson.com/zwave_device_uploads/214/214_default.jpg)


The ZMNHOD supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/214) to improve the documentation.

## Channels

The following table summarises the channels available for the ZMNHOD -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 
| Blinds control | blinds_control | Blinds | Rollershutter | 
| Binary Sensor | sensor_binary | Door | Switch | 
| Sensor (temperature) | sensor_temperature | Temperature | Number | 
| Electric meter (watts) | meter_watts | Energy | Number | 
| Electric meter (kWh) | meter_kwh | Energy | Number | 
| Switch 1 | switch_binary1 | Switch | Switch | 
| Blinds control 1 | blinds_control1 | Blinds | Rollershutter | 
| Electric meter (watts) 1 | meter_watts1 | Energy | Number | 
| Electric meter (kWh) 1 | meter_kwh1 | Energy | Number | 
| Sensor (temperature) 2 | sensor_temperature2 | Temperature | Number | 

### Switch

Switch the power on and off.

The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Blinds control

Provides start / stop control of blinds.

The ```blinds_control``` channel supports the ```Rollershutter``` item and is in the ```Blinds``` category.

### Binary Sensor

Indicates if a sensor has triggered.

The ```sensor_binary``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Sensor (temperature)

Indicates the current temperature.

The ```sensor_temperature``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)

Indicates the instantaneous power consumption.

The ```meter_watts``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)

Indicates the energy consumption (kWh).

The ```meter_kwh``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Switch 1

Switch the power on and off.

The ```switch_binary1``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Blinds control 1

Provides start / stop control of blinds.

The ```blinds_control1``` channel supports the ```Rollershutter``` item and is in the ```Blinds``` category.

### Electric meter (watts) 1

Indicates the instantaneous power consumption.

The ```meter_watts1``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh) 1

Indicates the energy consumption (kWh).

The ```meter_kwh1``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Sensor (temperature) 2

Indicates the current temperature.

The ```sensor_temperature2``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.



## Device Configuration

The following table provides a summary of the 14 configuration parameters available in the ZMNHOD.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 10 | Activate/deactivate functions ALL ON / ALL OFF  | Module responds to commands ALL ON / ALL OFF that may be sent by the main controller or by other controller belonging to the system. |
| 40 | Power reporting in Watts on power change for Q1 or Q2 | Set value 0 – 100 as percentage.   
 Available configuration parameters.

- 0 = Reporting Disabled
- 1–100 = 1% - 100% Reporting enabled

 Power report is sent only when actual power (in Watts) in real |
| 42 | Power reporting in Watts by time interval for Q1 or Q2 | Set value determines interval in seconds, when power report is send.   
 Available configuration parameters.

- default value 300 = 300s
- 0 – Reporting Disabled
- 1 – 32767 = 1 second – 32767 seconds |
| 71 | Operating modes | This parameter defines selection between two available operating modes.   
 NOTE: When setting parameter, module needs to be excluded and included again! Please check detailed description in this manual. |
| 72 | Slats tilting full turn time | This parameter defines the time necessary for slats to make full turn (180 degrees)   
 NOTE: If time set is too high, this will result that after full turn, shutter will start move up or down, for time remaining.

- default value 15 |
| 73 | Slats position | This parameter defines slats position after up/down movement through Z-wave or push-buttons. |
| 74 | Motor moving up/down time | This parameter defines shutter motor moving time of complete opening or complete closing.   
 NOTE: If time set is too high, this will result that after full turn, shutter will start move up or down, for time remaining.

- defau |
| 76 | Motor operation detection | Power threshold to be interpreted when motor reaches the limit switch.

- default value 6 = 0,6W
- 5 - 100 (0,5W - 10W), step is 0,1W.
- The value 0 means reaching a limit switch will not be detected |
| 78 | Forced Shutter DC calibration | Setting value 0 or 1 a Shutter DC module enters the calibration mode.  
 When calibration process is finished, completing full cycle - up, down and up, set parameter 78 back to default of 0. |
| 85 | Power consumption max delay time | This parameter defines the max time before motor power consumption is read after one of the relays is switched ON.   
 If there is no power consumption during this max time (motor not connected, damaged or requires higher time to start, mo |
| 86 | Power consumption at limit switch delay time | This parameter defines the max time at limit switch, when power consumption is below power threshold.   
 If the power consumption during this time is below power threshold (par. 76), the active output will switch off, means that limit sw |
| 90 | Time delay for next motor movement | This parameter defines the minimum time delay between next motor movemen.  
 (minimum time between switching motor off and on again)

- default value 5 = 500ms
- 1 – 30 = 0,1seconds – 3seconds (100ms resolution) |
| 110 | Temperature sensor offset settings | Set value is added or subtracted to actual measured value by sensor. default value 32536 32536 – offset is 0.0C From 1 to 100 – value from 0.1 °C to 10.0 °C is added to actual measured temperature. |
| 120 | Digital temperature sensor reporting | If digital temperature sensor is connected, module reports measured temperature on temperature change defined by this parameter.

- Default value 5 = 0,5°C
- 32536 – offset is 0.0C
- 0 – Reporting disabled |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 10: Activate/deactivate functions ALL ON / ALL OFF 

Module responds to commands ALL ON / ALL OFF that may be sent by the main controller or by other controller belonging to the system.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | ALL ON is not active, ALL OFF is not active |
| 1 | ALL ON is not active ALL OFF active |
| 2 | ALL ON is not active ALL OFF is not active |
| 255 | ALL ON active, ALL OFF active |

The manufacturer defined default value is ```255``` (ALL ON active, ALL OFF active).

This parameter has the configuration ID ```config_10_2``` and is of type ```INTEGER```.


### Parameter 40: Power reporting in Watts on power change for Q1 or Q2

Set value 0 – 100 as percentage.   
 Available configuration parameters.

- 0 = Reporting Disabled
- 1–100 = 1% - 100% Reporting enabled

 Power report is sent only when actual power (in Watts) in real

Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_40_1``` and is of type ```INTEGER```.


### Parameter 42: Power reporting in Watts by time interval for Q1 or Q2

Set value determines interval in seconds, when power report is send.   
 Available configuration parameters.

- default value 300 = 300s
- 0 – Reporting Disabled
- 1 – 32767 = 1 second – 32767 seconds

Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```300```.

This parameter has the configuration ID ```config_42_2``` and is of type ```INTEGER```.


### Parameter 71: Operating modes

This parameter defines selection between two available operating modes.   
 NOTE: When setting parameter, module needs to be excluded and included again! Please check detailed description in this manual.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Shutter mode. |
| 1 | Venetian mode (up/down and slate rotation) |

The manufacturer defined default value is ```0``` (Shutter mode.).

This parameter has the configuration ID ```config_71_1``` and is of type ```INTEGER```.


### Parameter 72: Slats tilting full turn time

This parameter defines the time necessary for slats to make full turn (180 degrees)   
 NOTE: If time set is too high, this will result that after full turn, shutter will start move up or down, for time remaining.

- default value 15

Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```150```.

This parameter has the configuration ID ```config_72_2``` and is of type ```INTEGER```.


### Parameter 73: Slats position

This parameter defines slats position after up/down movement through Z-wave or push-buttons.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Slats return to previously set position only in case of Z-wave control |
| 1 | Slats return to previously set position in case of Z-wave control, pus |

The manufacturer defined default value is ```1``` (Slats return to previously set position in case of Z-wave control,	pus).

This parameter has the configuration ID ```config_73_1``` and is of type ```INTEGER```.


### Parameter 74: Motor moving up/down time

This parameter defines shutter motor moving time of complete opening or complete closing.   
 NOTE: If time set is too high, this will result that after full turn, shutter will start move up or down, for time remaining.

- defau

Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_74_2``` and is of type ```INTEGER```.


### Parameter 76: Motor operation detection

Power threshold to be interpreted when motor reaches the limit switch.

- default value 6 = 0,6W
- 5 - 100 (0,5W - 10W), step is 0,1W.
- The value 0 means reaching a limit switch will not be detected

Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```6```.

This parameter has the configuration ID ```config_76_1``` and is of type ```INTEGER```.


### Parameter 78: Forced Shutter DC calibration

Setting value 0 or 1 a Shutter DC module enters the calibration mode.  
 When calibration process is finished, completing full cycle - up, down and up, set parameter 78 back to default of 0.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Default |
| 1 | Start calibration process. |

The manufacturer defined default value is ```0``` (Default).

This parameter has the configuration ID ```config_78_1``` and is of type ```INTEGER```.


### Parameter 85: Power consumption max delay time

This parameter defines the max time before motor power consumption is read after one of the relays is switched ON.   
 If there is no power consumption during this max time (motor not connected, damaged or requires higher time to start, mo

Values in the range 3 to 50 may be set.

The manufacturer defined default value is ```8```.

This parameter has the configuration ID ```config_85_1``` and is of type ```INTEGER```.


### Parameter 86: Power consumption at limit switch delay time

This parameter defines the max time at limit switch, when power consumption is below power threshold.   
 If the power consumption during this time is below power threshold (par. 76), the active output will switch off, means that limit sw

Values in the range 3 to 50 may be set.

The manufacturer defined default value is ```8```.

This parameter has the configuration ID ```config_86_1``` and is of type ```INTEGER```.


### Parameter 90: Time delay for next motor movement

This parameter defines the minimum time delay between next motor movemen.  
 (minimum time between switching motor off and on again)

- default value 5 = 500ms
- 1 – 30 = 0,1seconds – 3seconds (100ms resolution)

Values in the range 1 to 30 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_90_1``` and is of type ```INTEGER```.


### Parameter 110: Temperature sensor offset settings

Set value is added or subtracted to actual measured value by sensor. default value 32536 32536 – offset is 0.0C From 1 to 100 – value from 0.1 °C to 10.0 °C is added to actual measured temperature.

Values in the range 1 to 32536 may be set.

The manufacturer defined default value is ```32536```.

This parameter has the configuration ID ```config_110_2``` and is of type ```INTEGER```.


### Parameter 120: Digital temperature sensor reporting

If digital temperature sensor is connected, module reports measured temperature on temperature change defined by this parameter.

- Default value 5 = 0,5°C
- 32536 – offset is 0.0C
- 0 – Reporting disabled

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

The ZMNHOD supports 9 association groups.

### Group 1: Default reporting group


This group supports 1 nodes.

### Group 2: Basic on/off 

Triggered at change of the input I1 state and reflecting its state
This group supports 16 nodes.

### Group 3: Basic on/off

Triggered at change of the input I2 state and reflecting its state
This group supports 16 nodes.

### Group 4: Basic on/off

Triggered at sensing moving direction of roller
This group supports 16 nodes.

### Group 5: Basic on/off

Triggered at reaching roller position
This group supports 16 nodes.

### Group 6: Basic on/off

Triggered at reaching roller position
This group supports 16 nodes.

### Group 7:  Multilevel set

triggered at changes of value of the Flush Shutter DC position
This group supports 16 nodes.

### Group 8: Multilevel set

Triggered at changes of value of slats tilting position
This group supports 16 nodes.

### Group 9: Multilevel sensor report

Triggered at change of temperature sensor
This group supports 16 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V0| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V7| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V0| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V7| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/214/Qubino-Flush-Shutter-DC-PLUS-user-manual-V1-4-eng.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/214).
