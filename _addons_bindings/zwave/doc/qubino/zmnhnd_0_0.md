---
layout: documentation
title: ZMNHND - ZWave
---

{% include base.html %}

# ZMNHND Flush 1D relay
This describes the Z-Wave device *ZMNHND*, manufactured by *Goap* with the thing type UID of ```qubino_zmnhnd_00_000```.

The device is in the category of Wall Switch, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

# Overview

## Channels
The following table summarises the channels available for the ZMNHND

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 
| Binary Sensor | sensor_binary | Door | Switch | 
| Sensor (temperature) | sensor_temperature | Temperature | Number | 
| Switch 1 | switch_binary1 | Switch | Switch | 
| Sensor Binary | sensor_binary2 | Door | Switch | 
| Sensor (temperature) 2 | sensor_temperature2 | Temperature | Number | 
| Burglar | alarm_burglar2 | Door | Switch | 

### Switch
The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Binary Sensor
The ```sensor_binary``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Sensor (temperature)
The ```sensor_temperature``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Switch 1
The ```switch_binary1``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Sensor Binary
The ```sensor_binary2``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Sensor (temperature) 2
The ```sensor_temperature2``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Burglar
The ```alarm_burglar2``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |



## Device Configuration
The following table provides a summary of the 11 configuration parameters available in the ZMNHND.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Input 1 switch type | Input 1 switch type |
| 2 | Input 2 contact type | Input 2 contact type |
| 10 | Activate / deactivate functions ALL ON/ALL OFF | Flush 1D relay module responds to commands ALL ON / ALL OFF that may be sent by the main controller or by other controller belonging to the system. |
| 11 | Automatic turning off relay after set time | When relay is ON it goes automatically OFF after time defined by this parameter. Timer is reset to zero each time the module receive ON command regardless from where it comes (push button, associated module, controller,..). 0 - Auto OFF disabled. 1 |
| 12 | Automatic turning on relay after set time | When relay is OFF it goes automatically ON after time defined by this parameter. Timer is reset to zero each time the module receive OFF command regardless from where it comes (push button, associated module, controller,..). 0 - Auto ON disabled. 1 – |
| 15 | Automatic turning off / on seconds or milliseconds selection | NOTE: Parameter is the same for turning OFF or ON. |
| 30 | Saving the state of the relay after a power failure | Saving the state of the relay after a power failure |
| 63 | Output Switch selection | Set value means the type of the device that is connected to the output. The device type can be normally open (NO) or normally close (NC). |
| 100 | Enable / Disable Endpoints I2 or select Notification Type and Event | Enabling I2 means that Endpoint (I2) will be present on UI. Disabling it will result in hiding the endpoint according to the parameter set value. Additionally, a Notification Type and Event can be selected for the endpoint. Endpoint device type selec |
| 110 | Temperature sensor offset settings | Set value is added or subtracted to actual measured value by sensor. 32536 – offset is 0.0C From 1 to 100–value from 0.1°C to 10.0°C is added to actual measured temperature. From 1001 to 1100 – value from -0.1 °C to -10.0 °C is subtracted to actual mea |
| 120 | Digital temperature sensor reporting | If digital temperature sensor is connected, module reports measured temperature on temperature change defined by this parameter. 0 – Reporting disabled 1- 127 = 0,1°C – 12,7°C, step is 0,1°C |

### Parameter 1: Input 1 switch type
Input 1 switch type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | mono-stable switch type (push button) |
| 1 | bi-stable switch type |

The manufacturer defined default value is 1 (bi-stable switch type).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Input 2 contact type
Input 2 contact type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | NO (normaly open) input type |
| 1 | NC (normaly close) input type |

The manufacturer defined default value is 0 (NO (normaly open) input type).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 10: Activate / deactivate functions ALL ON/ALL OFF
Flush 1D relay module responds to commands ALL ON / ALL OFF that may be sent by the main controller or by other controller belonging to the system.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | ALL ON is not active ALL OFF is not active |
| 1 | ALL ON is not active ALL OFF active |
| 2 | ALL ON active ALL OFF is not active |
| 255 | ALL ON active, ALL OFF active |

The manufacturer defined default value is 255 (ALL ON active, ALL OFF active).

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: Automatic turning off relay after set time
When relay is ON it goes automatically OFF after time defined by this parameter. Timer is reset to zero each time the module receive ON command regardless from where it comes (push button, associated module, controller,..). 0 - Auto OFF disabled. 1

Values in the range 0 to 65535 may be set.

The manufacturer defined default value is 0.

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


### Parameter 12: Automatic turning on relay after set time
When relay is OFF it goes automatically ON after time defined by this parameter. Timer is reset to zero each time the module receive OFF command regardless from where it comes (push button, associated module, controller,..). 0 - Auto ON disabled. 1 –

Values in the range 0 to 65535 may be set.

The manufacturer defined default value is 0.

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 15: Automatic turning off / on seconds or milliseconds selection
NOTE: Parameter is the same for turning OFF or ON.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Seconds selected |
| 1 | Milliseconds selected |

The manufacturer defined default value is 0 (Seconds selected).

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 30: Saving the state of the relay after a power failure
Saving the state of the relay after a power failure

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Flush 1D relay module saves its state before power failure (it returns |
| 1 | Flush 1D relay module does not save the state after a power failure, i |

The manufacturer defined default value is 0 (Flush 1D relay module saves its state before power failure (it returns).

This parameter has the configuration ID ```config_30_1``` and is of type ```INTEGER```.


### Parameter 63: Output Switch selection
Set value means the type of the device that is connected to the output. The device type can be normally open (NO) or normally close (NC).

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | When system is turned off the output is 0V (NC). |
| 1 | When system is turned off the output is 230V or 24V (NO). |

The manufacturer defined default value is 0 (When system is turned off the output is 0V (NC).).

This parameter has the configuration ID ```config_63_1``` and is of type ```INTEGER```.


### Parameter 100: Enable / Disable Endpoints I2 or select Notification Type and Event
Enabling I2 means that Endpoint (I2) will be present on UI. Disabling it will result in hiding the endpoint according to the parameter set value. Additionally, a Notification Type and Event can be selected for the endpoint. Endpoint device type selec

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Endpoint, I2 disabled |
| 1 | Home Security; Motion Detection, unknown loc. |
| 2 | Carbon Monoxide; Carbon Monoxide detected, unknown location. |
| 3 | Carbon Dioxide; Carbon Dioxide detected, unknown location. |
| 4 | Water Alarm; Water Leak detected, unknown lo.. |
| 5 | Heat Alarm; Overheat detected, unknown loc. |
| 6 | Smoke Alarm; Smoke detected, unknown loc. |
| 9 | Sensor binary. |

The manufacturer defined default value is 1 (Home Security; Motion Detection, unknown loc.).

This parameter has the configuration ID ```config_100_1``` and is of type ```INTEGER```.


### Parameter 110: Temperature sensor offset settings
Set value is added or subtracted to actual measured value by sensor. 32536 – offset is 0.0C From 1 to 100–value from 0.1°C to 10.0°C is added to actual measured temperature. From 1001 to 1100 – value from -0.1 °C to -10.0 °C is subtracted to actual mea

Values in the range 0 to 65535 may be set.

The manufacturer defined default value is 32536.

This parameter has the configuration ID ```config_110_2``` and is of type ```INTEGER```.


### Parameter 120: Digital temperature sensor reporting
If digital temperature sensor is connected, module reports measured temperature on temperature change defined by this parameter. 0 – Reporting disabled 1- 127 = 0,1°C – 12,7°C, step is 0,1°C

Values in the range 0 to 255 may be set.

The manufacturer defined default value is 5.

This parameter has the configuration ID ```config_120_1``` and is of type ```INTEGER```.


## Association Groups
Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZMNHND supports 6 association groups.

### Group 1: Lifeline to Controller (reserved for communication with the main contr

This group supports 1 nodes.

### Group 2: Basic on/off (triggered at change of the input Q 
state and reflectin

This group supports 16 nodes.

### Group 3: Basic on/off (triggered at change of the input I2 
state and reflecti

This group supports 16 nodes.

### Group 4: Notification report (triggered at change of the input I2 
state and r

This group supports 16 nodes.

### Group 5: Binary Sensor (triggered at change of the input I2 
state and reflect

This group supports 16 nodes.

### Group 9: Multilevel Sensor report (triggered at change of temperature sensor)

This group supports 16 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V0| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V7| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SENSOR_BINARY_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V7| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ALARM_V5| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |

---

Did you spot an error in the above definition or want to improve the content?
You can [edit the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/207).
