---
layout: documentation
title: Heatit Z Water - ZWave
---

{% include base.html %}

# Heatit Z Water Relay control
This describes the Z-Wave device *Heatit Z Water*, manufactured by *ThermoFloor* with the thing type UID of ```thermofloor_zwater_00_000```.

The device is in the category of *HVAC*, defining Air condition devices, Fans.

![Heatit Z Water product image](https://www.cd-jackson.com/zwave_device_uploads/886/886_default.png)


The Heatit Z Water supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

  * The relay outputs may be used for controlling actuators/valves in a hydronic heating system
  * May be used to control both 24V actuators and 230V actuators
  * Can be used together with a Heatit Z-Temp sensor in each zone
  * DIN rail mounting
  * Works as a Z-Wave repeater
  * Firmware updates (OTA)
  * Available firmware versions (analog/digital inputs)
  * Supports encryption mode: S0, S2 Access Control Class, S2 Authenticated Class, S2 Unauthenticated Class

### Inclusion Information

Place your primary controller in Adding Mode by following the manufacturer’s instructions, then activate the add mode on the device by clicking the small button through the little hole, marked with the text “INCLUSION”, in front of the Heatit Z-Water regulator. The Adding Mode is indicated by Heatit Z-Water status LED is blinking until a timeout occurs after 10 seconds or if the module has been added to the Z-Wave network.

### Exclusion Information

Place your primary controller in Remov Mode by following the manufacturer’s instructions, then activate the remove mode on the device by clicking the small button through the little hole, marked with the text “INCLUSION”, in front of the Heatit Z-Water regulator. The Remove Mode is indicated by Heatit Z-Water status LED is blinking until a timeout occurs after 10 seconds or if the module has been removed from the Z-Wave network.

### General Usage Information

Heatit Z-Water is a DIN-rail regulator for controlling hydronic heating. Heatit Z-Water is a module that clips right onto a DIN rail to add a variety of functions to your wireless Z-Wave network.  
Heatit Z-Water is equipped with 10 relay outputs and it has 4 analog/digital inputs. The module can be power supplied from a 230V AC mains connection, and is able to deliver an output supply of 24V DC or 230V. Heatit Z-Water relay outputs are able to be freely controlled from the Z-Wave network, and can be used for several purposes, e.g. on/off control of light, control of valve actuators for an underfloor heating system, or control of other home automation systems.

Heatit Z-Water analog/digital inputs (different firmware versions) can be configured to work with different functionality and can be connected to potential free contacts, open-collector outputs, and will be able to control other Z-Wave devices; switches, dimmers, etc. Furthermore, the inputs can be used as a Scene Controller and send Central Scene notifications to the Z-Wave gateway.  
It is possible to configure the level and the indication of the status indicator LED in the front of the Heatit Z-Water module.

## Channels

The following table summarises the channels available for the Heatit Z Water -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 
| Dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Binary Sensor | sensor_binary | Door | Switch | 
| Switch 1 | switch_binary1 | Switch | Switch | 
| Switch 2 | switch_binary2 | Switch | Switch | 
| Switch 3 | switch_binary3 | Switch | Switch | 
| Switch 4 | switch_binary4 | Switch | Switch | 
| Switch 5 | switch_binary5 | Switch | Switch | 
| Switch 6 | switch_binary6 | Switch | Switch | 
| Switch 7 | switch_binary7 | Switch | Switch | 
| Switch 8 | switch_binary8 | Switch | Switch | 
| Switch 9 | switch_binary9 | Switch | Switch | 
| Switch 10 | switch_binary10 | Switch | Switch | 
| Sensor (temperature) 11 | sensor_temperature11 | Temperature | Number:Temperature | 
| Sensor (temperature) 12 | sensor_temperature12 | Temperature | Number:Temperature | 
| Sensor (temperature) 13 | sensor_temperature13 | Temperature | Number:Temperature | 
| Sensor (temperature) 14 | sensor_temperature14 | Temperature | Number:Temperature | 

### Switch

Switch the power on and off.

The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Binary Sensor

Indicates if a sensor has triggered.

The ```sensor_binary``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Switch 1

Switch the power on and off.

The ```switch_binary1``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 2

Switch the power on and off.

The ```switch_binary2``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 3

Switch the power on and off.

The ```switch_binary3``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 4

Switch the power on and off.

The ```switch_binary4``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 5

Switch the power on and off.

The ```switch_binary5``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 6

Switch the power on and off.

The ```switch_binary6``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 7

Switch the power on and off.

The ```switch_binary7``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 8

Switch the power on and off.

The ```switch_binary8``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 9

Switch the power on and off.

The ```switch_binary9``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 10

Switch the power on and off.

The ```switch_binary10``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Sensor (temperature) 11

Indicates the current temperature.

The ```sensor_temperature11``` channel supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Sensor (temperature) 12

Indicates the current temperature.

The ```sensor_temperature12``` channel supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Sensor (temperature) 13

Indicates the current temperature.

The ```sensor_temperature13``` channel supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Sensor (temperature) 14

Indicates the current temperature.

The ```sensor_temperature14``` channel supports the ```Number:Temperature``` item and is in the ```Temperature``` category.



## Device Configuration

The following table provides a summary of the 14 configuration parameters available in the Heatit Z Water.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Status LED | Configuration of the status LED |
| 2 | LED brightness | Configure the percentage of light in the status LED, when the LED is turned on |
| 3 | Thermistor type input 1 | This parameter decides which kind of thermistor that is connected to the input.. |
| 4 | Thermistor type input 2 | This parameter decides which kind of thermistor that is connected to the input. |
| 5 | Thermistor type input 3 | This parameter decides which kind of thermistor that is connected to the input. |
| 6 | Thermistor type input 4 | This parameter decides which kind of thermistor that is connected to the input. |
| 7 | Input 1 calibration | Input 1 calibration |
| 8 | Input 2 calibration | Input 1 calibratio2 |
| 9 | Input 3 calibration | Input 3 calibration |
| 10 | Input 4 calibration | Input 4 calibration |
| 11 | Input 1 report interval | Time interval between consecutive temperature reports. |
| 12 | Input 2 report interval | Time interval between consecutive temperature reports. |
| 13 | Input 3 report interval | Time interval between consecutive temperature reports. |
| 14 | Input 4 report interval | Time interval between consecutive temperature reports. |

### Parameter 1: Status LED

Configuration of the status LED
0 LED turned off.

1 LED turned on. (Default)

2 LED flashing at 1 second intervals (½ Hz).

3 LED flashing at ½ second interval (1 Hz).
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | LED turned off. |
| 1 | LED turned on. (Default) |
| 2 | LED flashing at 1 second intervals (½ Hz) |
| 3 | LED flashing at ½ second interval (1 Hz) |

The manufacturer defined default value is ```1``` (LED turned on. (Default)).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: LED brightness

Configure the percentage of light in the status LED, when the LED is turned on
Specifies the brightness level of the LED when it is on. Default is 50.
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Thermistor type input 1

This parameter decides which kind of thermistor that is connected to the input..
0 No thermistor, input is disabled. (Default)

1 10K NTC. (PART NUMBER: TT02-10KC3-93D-3000R-TPH)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No thermistor, input is disabled. (Default) |
| 1 | 10K NTC. (PART NUMBER: TT02-10KC3-93D-3000R-TPH) |

The manufacturer defined default value is ```0``` (No thermistor, input is disabled. (Default)).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Thermistor type input 2

This parameter decides which kind of thermistor that is connected to the input.
0 No thermistor, input is disabled. (Default)

1 10K NTC. (PART NUMBER: TT02-10KC3-93D-3000R-TPH)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No thermistor, input is disabled. (Default) |
| 1 | 10K NTC. (PART NUMBER: TT02-10KC3-93D-3000R-TPH) |

The manufacturer defined default value is ```0``` (No thermistor, input is disabled. (Default)).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Thermistor type input 3

This parameter decides which kind of thermistor that is connected to the input.
0 No thermistor, input is disabled. (Default)

1 10K NTC. (PART NUMBER: TT02-10KC3-93D-3000R-TPH)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No thermistor, input is disabled. (Default) |
| 1 | 10K NTC. (PART NUMBER: TT02-10KC3-93D-3000R-TPH) |

The manufacturer defined default value is ```0``` (No thermistor, input is disabled. (Default)).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Thermistor type input 4

This parameter decides which kind of thermistor that is connected to the input.
0 No thermistor, input is disabled. (Default)

1 10K NTC. (PART NUMBER: TT02-10KC3-93D-3000R-TPH)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No thermistor, input is disabled. (Default) |
| 1 | 10K NTC. (PART NUMBER: TT02-10KC3-93D-3000R-TPH) |

The manufacturer defined default value is ```0``` (No thermistor, input is disabled. (Default)).

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Input 1 calibration

Input 1 calibration
-4.0°C – 4.0°C. Default is 0 (0.0°C).
Values in the range -40 to 40 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Input 2 calibration

Input 1 calibratio2
-4.0°C – 4.0°C. Default is 0 (0.0°C).
Values in the range -40 to 40 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Input 3 calibration

Input 3 calibration
-4.0°C – 4.0°C. Default is 0 (0.0°C).
Values in the range -40 to 40 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: Input 4 calibration

Input 4 calibration
-4.0°C – 4.0°C. Default is 0 (0.0°C).
Values in the range -40 to 40 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: Input 1 report interval

Time interval between consecutive temperature reports.
0 Reporting of temperatures disabled.

1 - 8640 Multiply with 10 seconds, 10 seconds – 24 hours. Default is 6 (60 seconds)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Reporting of temperatures disabled. |
| 1 | Multiply with 10 seconds, 10 seconds – 24 hours. |

The manufacturer defined default value is ```6```.

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


### Parameter 12: Input 2 report interval

Time interval between consecutive temperature reports.
0 Reporting of temperatures disabled.

1 - 8640 Multiply with 10 seconds, 10 seconds – 24 hours. Default is 6 (60 seconds).
Values in the range 0 to 8640 may be set.

The manufacturer defined default value is ```6```.

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 13: Input 3 report interval

Time interval between consecutive temperature reports.
0 Reporting of temperatures disabled.

1 - 8640 Multiply with 10 seconds, 10 seconds – 24 hours. Default is 6 (60 seconds).
Values in the range 0 to 8640 may be set.

The manufacturer defined default value is ```6```.

This parameter has the configuration ID ```config_13_2``` and is of type ```INTEGER```.


### Parameter 14: Input 4 report interval

Time interval between consecutive temperature reports.
0 Reporting of temperatures disabled.

1 - 8640 Multiply with 10 seconds, 10 seconds – 24 hours. Default is 6 (60 seconds).
Values in the range 0 to 8640 may be set.

The manufacturer defined default value is ```6```.

This parameter has the configuration ID ```config_14_2``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Heatit Z Water supports 14 association groups.

### Group 1: Control device 0

Main control device
Lifeline.

Sends Device Reset notifications and Basic Report On / Off when relay output 1 is activated.

Max. nodes in the group: 5

Association group 1 supports 5 nodes.

### Group 2: Control device 0

Main control device
Lifeline.

Sends Basic Report On / Off when relay output 2 is activated.

Max. nodes in the group: 5

Association group 2 supports 5 nodes.

### Group 3: Control device 0

Main control device
Lifeline.

Sends Basic Report On / Off when relay output 3 is activated.

Max. nodes in the group: 5

Association group 3 supports 5 nodes.

### Group 4: Control device 0

Main control device
Lifeline.

Sends Basic Report On / Off when relay output 4 is activated.

Max. nodes in the group: 5

Association group 4 supports 5 nodes.

### Group 5: Control device 0

Main control device
Lifeline.

Sends Basic Report On / Off when relay output 5 is activated.

Max. nodes in the group: 5

Association group 5 supports 5 nodes.

### Group 6: Control device 0

Main control device
Lifeline.

Sends Basic Report On / Off when relay output 6 is activated.

Max. nodes in the group: 5

Association group 6 supports 5 nodes.

### Group 7: Control device 0

Main control device
Lifeline.

Sends Basic Report On / Off when relay output 7 is activated.

Max. nodes in the group: 5

Association group 7 supports 5 nodes.

### Group 8: Control device 0

Main control device
Lifeline.

Sends Basic Report On / Off when relay output 8 is activated.

Max. nodes in the group: 5

Association group 8 supports 5 nodes.

### Group 9: Control device 0

Main control device
Lifeline.

Sends Basic Report On / Off when relay output 9 is activated.

Max. nodes in the group: 5

Association group 9 supports 5 nodes.

### Group 10: Control device 0

Main control device
Lifeline.

Sends Basic Report On / Off when relay output 10 is activated.

Max. nodes in the group: 5

Association group 10 supports 5 nodes.

### Group 11: Control device 0

Main control device
Sends Multilevel Sensor Reports for input 1. Max. nodes in the group: 5

Association group 11 supports 5 nodes.

### Group 12: Control device 0

Main control device
Sends Multilevel Sensor Reports for input 2. Max. nodes in the group: 5

Association group 12 supports 5 nodes.

### Group 13: Control device 0

Main control device
Sends Multilevel Sensor Reports for input 3. Max. nodes in the group: 5

Association group 13 supports 5 nodes.

### Group 14: Control device 0

Main control device
Sends Multilevel Sensor Reports for input 4. Max. nodes in the group: 5

Association group 14 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 3

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 4

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 5

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 6

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 7

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 8

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 9

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 10

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 11

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V1| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 12

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V1| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 13

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V1| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 14

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V1| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |

### Documentation Links

* [User manual](https://www.cd-jackson.com/zwave_device_uploads/886/Manual-Heatit-Z-Water-analog-inputs-FW-1-0.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/886).
