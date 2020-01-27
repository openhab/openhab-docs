---
layout: documentation
title: ZMNHND - ZWave
---

{% include base.html %}

# ZMNHND Flush 1D relay
This describes the Z-Wave device *ZMNHND*, manufactured by *[Goap](http://www.qubino.com/)* with the thing type UID of ```qubino_zmnhnd_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![ZMNHND product image](https://www.cd-jackson.com/zwave_device_uploads/207/207_default.png)


The ZMNHND supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

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

## Channels

The following table summarises the channels available for the ZMNHND -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Binary Sensor | sensor_binary | sensor_binary |  | Switch | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch | 
| Sensor (temperature) 1 | sensor_temperature1 | sensor_temperature | Temperature | Number:Temperature | 
| Sensor Binary | sensor_binary2 | sensor_binary |  | Switch | 
| Sensor (temperature) 2 | sensor_temperature2 | sensor_temperature | Temperature | Number:Temperature | 
| Burglar | alarm_burglar2 | alarm_burglar | Door | Switch | 

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

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Switch 1
Switch the power on and off.

The ```switch_binary1``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Sensor (temperature) 1
Indicates the current temperature.

The ```sensor_temperature1``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Sensor Binary
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

### Burglar
Indicates if the burglar alarm is triggered.

The ```alarm_burglar2``` channel is of type ```alarm_burglar``` and supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 11 configuration parameters available in the ZMNHND.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Input 1 switch type | Input 1 switch type |
| 2 | Input 2 contact type | Input 2 contact type |
| 10 | Activate / deactivate functions ALL ON/ALL OFF | Activate / deactivate functions ALL ON/ALL OFF |
| 11 | Automatic turning off relay after set time | Automatic turning off relay after set time |
| 12 | Automatic turning on relay after set time | Automatic turning on relay after set time |
| 15 | Auto turn off / on seconds or milliseconds | Auto turn off / on seconds or milliseconds |
| 30 | Save state after power failure | Save state after power failure |
| 63 | Output Switch selection | Output Switch selection |
| 100 | Endpoint I2 Notification and Event | Endpoint I2 Notification and Event |
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


### Parameter 10: Activate / deactivate functions ALL ON/ALL OFF

Activate / deactivate functions ALL ON/ALL OFF
Flush 1D relay module responds to commands ALL ON / ALL OFF that may be sent by the main controller or by other controller belonging to the system.
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

Automatic turning off relay after set time
When relay is ON it goes automatically OFF after time defined by this parameter. Timer is reset to zero each time the module receive ON command regardless from where it comes (push button, associated module, controller,..).
The following option values may be configured, in addition to values in the range 0 to 65535 -:

| Value  | Description |
|--------|-------------|
| 0 | Auto OFF disabled |

The manufacturer defined default value is ```0``` (Auto OFF disabled).

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


### Parameter 12: Automatic turning on relay after set time

Automatic turning on relay after set time
When relay is OFF it goes automatically ON after time defined by this parameter. Timer is reset to zero each time the module receive OFF command regardless from where it comes (push button, associated module, controller,..).
The following option values may be configured, in addition to values in the range 0 to 65535 -:

| Value  | Description |
|--------|-------------|
| 0 | Auto ON disabled |

The manufacturer defined default value is ```0``` (Auto ON disabled).

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 15: Auto turn off / on seconds or milliseconds

Auto turn off / on seconds or milliseconds
Automatic turning off / on seconds or milliseconds selection.

NOTE: Parameter is the same for turning OFF or ON.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Seconds selected |
| 1 | Milliseconds selected |

The manufacturer defined default value is ```0``` (Seconds selected).

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 30: Save state after power failure

Save state after power failure
Saving the state of the relay after a power failure
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Saves state before power failure |
| 1 | Do not save state after power failure |

The manufacturer defined default value is ```0``` (Saves state before power failure).

This parameter has the configuration ID ```config_30_1``` and is of type ```INTEGER```.


### Parameter 63: Output Switch selection

Output Switch selection
Set value means the type of the device that is connected to the output. The device type can be normally open (NO) or normally close (NC).
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Output 0V when system turned off |
| 1 | Output 230V or 24V when system turned off |

The manufacturer defined default value is ```0``` (Output 0V when system turned off).

This parameter has the configuration ID ```config_63_1``` and is of type ```INTEGER```.


### Parameter 100: Endpoint I2 Notification and Event

Endpoint I2 Notification and Event
Enabling I2 means that Endpoint (I2) will be present on UI. Disabling it will result in hiding the endpoint according to the parameter set value. Additionally, a Notification Type and Event can be selected for the endpoint.

**NOTE 1**: After parameter change, first exclude module (without setting parameters to default value) then wait at least 30s and then re-include the module!

**NOTE 2**: When the parameter is set to value 9 the notifications are sent for Home Security.
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
| 9 | Sensor Binary |

The manufacturer defined default value is ```1``` (Home Security).

This parameter has the configuration ID ```config_100_1``` and is of type ```INTEGER```.


### Parameter 110: Temperature sensor offset settings

Temperature sensor offset settings
Set value is added to or subtracted from actual measured value by sensor. 

Available configuration parameters:

  * 32536: offset is 0.0 °C
  * 1 to 100: value from 0.1 °C to 10.0 °C is added to actual measured temperature
  * 1001 to 1100: value from -0.1 °C to -10.0 °C is subtracted to actual measured temperature
Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```32536```.

This parameter has the configuration ID ```config_110_2``` and is of type ```INTEGER```.


### Parameter 120: Digital temperature sensor reporting

Digital temperature sensor reporting
If digital temperature sensor is connected, module reports measured temperature on temperature change defined by this parameter.

  * 0: Reporting disabled
  * 1- 127: 0,1°C - 12,7°C, step is 0,1°C
Values in the range 0 to 255 may be set.

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

The ZMNHND supports 6 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Lifeline to Controller
Lifeline group (reserved for communication with the main controller), 1 node allowed.

Association group 1 supports 1 node.

### Group 2: Basic ON/OFF

Basic ON/OFF
Basic ON/OFF (triggered at change of the output state and reflecting its state) up to 16 nodes.

Association group 2 supports 16 nodes.

### Group 3: Basic ON/OFF (I2)

Basic ON/OFF (I2)
Basic ON/OFF (triggered at change of the input I2 state and reflecting its state) up to 16 nodes.

Association group 3 supports 16 nodes.

### Group 4: Binary Sensor Report

Binary Sensor Report
Binary Sensor Report (triggered at change of the input I2 state and reflecting its state) up to 16 nodes.

Association group 4 supports 16 nodes.

### Group 5: Notification Report

Notification Report
Triggered at change of the input I2 state and reflecting its state) up to 16 nodes.

Association group 5 supports 16 nodes.

### Group 6: Multilevel Sensor Report

Multilevel Sensor Report
Triggered at change of temperature sensor up to 16 nodes.

Association group 6 supports 16 nodes.

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
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V7| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ALARM_V5| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/207/Qubino-Flush-1D-relay-PLUS-user-manual-V1-4.pdf)
* [Qubino Flush 1D relay PLUS User Manual V1.5](https://www.cd-jackson.com/zwave_device_uploads/207/Qubino-Flush-1D-relay-PLUS-user-manual-V1-5-1.pdf)
* [Qubino Flush 1D Relay PLUS Extended Manual Eng 2.2](https://www.cd-jackson.com/zwave_device_uploads/207/Qubino-Flush-1D-Relay-PLUS-extended-manual-eng-2-2-2.pdf)
* [Declaration of Conformity Flush 1D Relay 09062017](https://www.cd-jackson.com/zwave_device_uploads/207/Declaration-of-conformity-FLUSH-1D-RELAY--09062017.pdf)
* [Qubino Relays CB Test Certificate SI-5074-B1](https://www.cd-jackson.com/zwave_device_uploads/207/Qubino-Relays-CB-TEST-CERTIFICATE-SI-5074-B1-1.pdf)
* [Qubino Relays Certificate of Conformity C251-0007 16](https://www.cd-jackson.com/zwave_device_uploads/207/Qubino-Relays-Certificate-of-Conformity-C251-0007-16-2.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/207).
