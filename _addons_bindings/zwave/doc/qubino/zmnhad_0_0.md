---
layout: documentation
title: ZMNHAD - ZWave
---

{% include base.html %}

# ZMNHAD Flush 1 relay
This describes the Z-Wave device *ZMNHAD*, manufactured by *[Goap](http://www.qubino.com/)* with the thing type UID of ```qubino_zmnhad_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![ZMNHAD product image](https://www.cd-jackson.com/zwave_device_uploads/206/206_default.png)


The ZMNHAD supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

This Z-Wave module is used for switching on or off the electrical device (e.g. light or fan). The module can be controlled either through Z-wave network or through the wall switch. The module is designed to be mounted inside a “flush mounting box”, hidden behind a traditional wall switch. Module measures power consumption of electrical device and supports connection of digital temperature sensor. It is designed to act as repeater in order to improve range and stability of Z-wave network. Supported switches Module supports mono-stable switches (push button) and bi-stable switches. The module is factory set to operate with bi-stable switches.

### Inclusion Information

**Module Inclusion (Adding to Z-Wave network)**

  * Connect module to power supply (with temperature sensor connected -if purchased)
  * Enable add/remove mode on main controller
  * Auto-inclusion (works forabout 5 seconds after connected to power supply) or
  * Press push button I1 three times within 3s (3 times change switch state within 3 seconds) or
  * Press service button **S** (only applicable for 24 V SELV supply voltage) for more than 2 seconds.

**NOTE1:** For auto-inclusion procedure, first set main controller into inclusion mode and then connect module to power supply.

**NOTE2:** When connecting temperature sensor to module that has already been included, you have to exclude module first. Switch off power supply , connect the sensor and re-include the module.

### Exclusion Information

**Module Exclusion/Reset (Removing from Z-Wavenetwork)**

  * Connect module to power supply
  * Bring module within maximum 1 meter (3 feet) of the main controller,
  * Enable add/remove mode on main controller,
  * Press push button **I1 **five times within 3s (5 times change switch state within 3 seconds) in the first 60 seconds after the module is connected to the power supply or
  * Press service button **S **(only applicable for 24 V SELV supply voltage) for more than 6 seconds.

By this function all parameters of the module are set to default values and own ID is deleted.

If push button I1 is pressed three times within 3s (or service button S is pressed more than 2 and less than 6 seconds) module is excluded, but configuration parameters are not set to default values.

### General Usage Information

Note regarding the temperatur channels:

  * Temperature sensor connected (device becomes multi channel, temperature reports are sent from endpoint2, if multi channel lifeline is enabled)
  * I2 enabled via parameter 100, temperature sensor connected and reinclusion is performed (device becomes multi channel, temperature is sent from endpoint3)
  * I2 and I3 enabled via parameters 100 and 101, temeprature sensor connected and reinclusion is performed (device becomes multi channel, temperature is sent from endpoint4)  
    Source: qubino support

## Channels

The following table summarises the channels available for the ZMNHAD -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Binary Sensor | sensor_binary | sensor_binary |  | Switch | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch | 
| Electric meter (watts) 1 | meter_watts1 | meter_watts | Energy | Number | 
| Electric meter (kWh) 1 | meter_kwh1 | meter_kwh | Energy | Number | 
| Binary Sensor I2 | sensor_binary2 | sensor_binary |  | Switch | 
| Sensor (temperature) | sensor_temperature2 | sensor_temperature | Temperature | Number:Temperature | 
| Alarm (power) 2 | alarm_power2 | alarm_power | Energy | Switch | 
| Binary Sensor I3 | sensor_binary3 | sensor_binary |  | Switch | 
| Sensor (temperature) | sensor_temperature3 | sensor_temperature | Temperature | Number:Temperature | 
| Sensor (temperature) | sensor_temperature4 | sensor_temperature | Temperature | Number:Temperature | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Binary Sensor
Indicates if a sensor has triggered.

The ```sensor_binary``` channel is of type ```sensor_binary``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (power)
Indicates if a power alarm is triggered.

The ```alarm_power``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Switch 1
Switch the power on and off.

The ```switch_binary1``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Electric meter (watts) 1
Indicates the instantaneous power consumption.

The ```meter_watts1``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh) 1
Indicates the energy consumption (kWh).

The ```meter_kwh1``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Binary Sensor I2
Indicates if a sensor has triggered.

The ```sensor_binary2``` channel is of type ```sensor_binary``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature2``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Alarm (power) 2
Indicates if a power alarm is triggered.

The ```alarm_power2``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Binary Sensor I3
Indicates if a sensor has triggered.

The ```sensor_binary3``` channel is of type ```sensor_binary``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature3``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature4``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.



## Device Configuration

The following table provides a summary of the 15 configuration parameters available in the ZMNHAD.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Input 1 switch type | Input 1 switch type |
| 2 | Input 2 contact type | Input 2 contact type |
| 3 | Input 3 contact type | Input 3 contact type |
| 10 | Activate /deactivate ALL ON/ALL OFF | module responds to commands ALL ON / ALL OFF |
| 11 | Automatic turning off relay after set time | When relay goes automatically OFF after this time |
| 12 | Automatic turning on relay after set time | When relay goes automatically ON after this time |
| 15 | Automatic switching units selection | NOTE: Parameter is the same for turning OFF or ON. |
| 30 | Save the relay state after a power failure | Save the relay state after a power failure |
| 40 | Power reporting in Watts on power change | Power reporting in Watts on power change |
| 42 | Power reporting in Watts by Time interval | Set value means time interval when power report is send |
| 63 | Output Switch selection | Set the type of the device connected to the output. (NO) / (NC) |
| 100 | Endpoints I2 Notification Type and Event | Enable / Disable Endpoints I2 or select Notification Type and Event |
| 101 |  Endpoints I3 Notification Type and Event | Enable / Disable Endpoints I3 or select Notification Type and Event |
| 110 | Temperature sensor offset settings | Temperature sensor offset settings |
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


### Parameter 10: Activate /deactivate ALL ON/ALL OFF

module responds to commands ALL ON / ALL OFF

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

When relay goes automatically OFF after this time
When relay is ON it goes automatically OFF after time defined by this parameter. Timer is reset to zero each time the module receive ON command regardless from where it comes (push button, associated module, controller,..)

  * 0 = disabled
  * 1 - 32535 = time in units determined by parameter 15
Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


### Parameter 12: Automatic turning on relay after set time

When relay goes automatically ON after this time
When relay is OFF it goes automatically ON after time defined by this parameter.Timer is reset to zero each time the module receive OFF command regardless from where it comes(push button, associated module, controller,..

  * 0 - Auto ON disabled
  * 1 - 32535 time in units determined by parameter 15
Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 15: Automatic switching units selection

NOTE: Parameter is the same for turning OFF or ON.
Automatic turning off / on seconds or milliseconds selection
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Seconds selected |
| 1 | Milliseconds selected |

The manufacturer defined default value is ```0``` (Seconds selected).

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 30: Save the relay state after a power failure

Save the relay state after a power failure

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Module saves its state before power failure |
| 1 | Module stays OFF after a power failure |

The manufacturer defined default value is ```0``` (Module saves its state before power failure).

This parameter has the configuration ID ```config_30_1``` and is of type ```INTEGER```.


### Parameter 40: Power reporting in Watts on power change

Power reporting in Watts on power change
  * 0 – Reporting Disabled
  * 1 – 100 = 1% - 100% Reporting enabled

Power report is send (push) only when actual power in Watts in real time change for more than set percentage comparing to previous actual power in Watts, step is 1%.

**NOTE:** if power changed is less than 1W, the report is not send (pushed), independent of percentage set
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_40_1``` and is of type ```INTEGER```.


### Parameter 42: Power reporting in Watts by Time interval

Set value means time interval when power report is send
Set value means time interval (0 – 32535) in seconds, when power report is send.

  * Default value 300 (power report in Watts is send each 300s)
  * 0 – Reporting Disabled
  * 1 – 32535 = 1second – 32535 seconds.
  * Reporting enabled. Power report is send with time 
Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```300```.

This parameter has the configuration ID ```config_42_2``` and is of type ```INTEGER```.


### Parameter 63: Output Switch selection

Set the type of the device connected to the output. (NO) / (NC)
Controls the active state of the output switch.

  * Normally Open (NO), load is not connected to power when inactive (“off”). 
  * Normally Closed (NC), load is connected to power when inactive (“off”), the inverse of usual operation.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Normal -NO when inactive (“off") |
| 1 | Inverse -NC when inactive (“on”) |

The manufacturer defined default value is ```0``` (Normal -NO when inactive (“off")).

This parameter has the configuration ID ```config_63_1``` and is of type ```INTEGER```.


### Parameter 100: Endpoints I2 Notification Type and Event

Enable / Disable Endpoints I2 or select Notification Type and Event
Enabling I2 means that Endpoint (I2) will be present on UI.

Disabling it will result in hiding the endpoint according to the parameter set value.

Additionally, a Notification Type and Event can be selected for the endpoint. 

# **NOTE**:

**After parameter change, module has to be re included into the network in order setting to take effect! **
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Endpoint, I2 disabled |
| 1 | Home Security |
| 2 | Carbon Monoxide |
| 3 | Carbon Dioxide |
| 4 | Water Alarm |
| 5 | Heat Alarm |
| 6 | Smoke Alarm |
| 9 | Sensor binary. |

The manufacturer defined default value is ```1``` (Home Security).

This parameter has the configuration ID ```config_100_1``` and is of type ```INTEGER```.


### Parameter 101:  Endpoints I3 Notification Type and Event

Enable / Disable Endpoints I3 or select Notification Type and Event
Enabling I3 means that Endpoint (I3) will be present on UI.

Disabling it will result in hiding the endpoint according to the parameter set value.

Additionally, a Notification Type and Event can be selected for the endpoint

# NOTE:

**After parameter change, module has to be re included into the network in order setting to take effect!**
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Endpoint, I3 disabled |
| 1 | Home Security |
| 2 | Carbon Monoxide |
| 3 | Carbon Dioxide |
| 4 | Water Alarm |
| 5 | Heat Alarm |
| 6 | Smoke Alarm |
| 9 | Sensor binary. |

The manufacturer defined default value is ```1``` (Home Security).

This parameter has the configuration ID ```config_101_1``` and is of type ```INTEGER```.


### Parameter 110: Temperature sensor offset settings

Temperature sensor offset settings
Set value is added or subtracted to actual measured value by sensor.

  *  default value 32536
  * 32536 – offset is 0.0C - From 1 to 100–value from 0.1°C to 10.0°C is added to actual measured temperature.
  * From 1001 to 1100 – value from -0.1 °C to -10.0 °C is subtracted to actual measured temperature
Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```32536```.

This parameter has the configuration ID ```config_110_2``` and is of type ```INTEGER```.


### Parameter 120: Digital temperature sensor reporting

Digital temperature sensor reporting
If digital temperature sensor is connected, module reports measured temperature on temperature change defined by this parameter

  * default value 5 = 0,5°C
  * 0 – Reporting disabled
  * 1- 127 = 0,1°C – 12,7°C, step is 0,1°C
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

The ZMNHAD supports 9 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Lifeline group (reserved for communication with the main controller)

Association group 1 supports 1 node.

### Group 2: Basic on/off (triggered input Q state)

basic on/off (triggered at change of the output Q state and reflecting its state) up to 16 nodes.

Association group 2 supports 16 nodes.

### Group 3: Basic on/off (triggered input I2 state)

 basic on/off (triggered at change of the input I2 state and reflecting its state) up to 16 nodes.

Association group 3 supports 16 nodes.

### Group 4: Notification report (triggered  input I2 state)

Notification report (triggered at change of the input I2 state and reflecting its state) up to 16 nodes.

Association group 4 supports 16 nodes.

### Group 5: Binary Sensor (triggered  input I2 state)

 Binary sensor (triggered at change of the input I2 state and reflecting its state) up to 16 nodes.

Association group 5 supports 16 nodes.

### Group 6: Basic on/off (triggered input I3 state)

 basic on/off (triggered at change of the input I3 state and reflecting its state) up to 16 nodes

Association group 6 supports 16 nodes.

### Group 7: Notification report (triggered input I3 state)

notification report (triggered at change of the input I3 state and reflecting its state) up to 16 nodes.

Association group 7 supports 16 nodes.

### Group 8: Binary Sensor report (triggered  input I3 state)

 binary sensor report (triggered at change of the input I3 state and reflecting its state) up to 16 nodes

Association group 8 supports 16 nodes.

### Group 9: Multilevel Sensor report (triggered temperature)

 multilevel sensor report (triggered at change of temperature sensor) up to 16 nodes

Association group 9 supports 16 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V1| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V3| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V1| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SENSOR_MULTILEVEL_V7| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V2| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V2| |
| COMMAND_CLASS_ALARM_V3| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 3

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SENSOR_MULTILEVEL_V7| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V2| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V2| |
| COMMAND_CLASS_ALARM_V3| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 4

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SENSOR_MULTILEVEL_V7| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V2| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |

### Documentation Links

* [User Manual v1.1](https://www.cd-jackson.com/zwave_device_uploads/206/Qubino-Flush-1-relay-PLUS-user-manual-V1-1.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/206).
