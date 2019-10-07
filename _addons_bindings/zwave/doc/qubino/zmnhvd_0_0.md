---
layout: documentation
title: ZMNHVD - ZWave
---

{% include base.html %}

# ZMNHVD Flush Dimmer 0-10V
This describes the Z-Wave device *ZMNHVD*, manufactured by *[Goap](http://www.qubino.com/)* with the thing type UID of ```qubino_zmnhvd_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![ZMNHVD product image](https://www.cd-jackson.com/zwave_device_uploads/363/363_default.jpg)


The ZMNHVD supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Universal dimmer module with a standard 0-10V output and a multi-function input, which may be a push button / switch, a potentiometer or 0-10V signal 

### Inclusion Information

  * press service button S for more than 2 second or
  * press push button I1 three times within 3s (3 times change switch state within 3 seconds)

### Exclusion Information

  * press service button S for more than 6 second or
  * press push button I1 five times within 3s ( 5 times change switch state within 3 seconds) in the first 60 seconds after the module is connected to the power supply

## Channels

The following table summarises the channels available for the ZMNHVD -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Temperature Sensor | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Input I1 | sensor_general | sensor_general |  | Number | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Temperature Sensor
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Input I1


The ```sensor_general``` channel is of type ```sensor_general``` and supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.



## Device Configuration

The following table provides a summary of the 24 configuration parameters available in the ZMNHVD.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Input 1 Switch Type | Input 1 Switch Type |
| 11 | Automatic turning off output after set time |  |
| 12 | Automatic turning on output after set time |  |
| 21 | Enable/Disable Double click function |  |
| 30 | Saving the state after a power failure |  |
| 52 | Auto or manual selection |  |
| 53 | PID value inside deadband |  |
| 54 | PID deadband  |  |
| 55 | Integral sampling time  |  |
| 56 | P parameter |  |
| 57 | I parameter  |  |
| 58 | D parameter  | Available config. parameters (data type is2 Byte DEC): |
| 60 | Minimum dimming value  |  |
| 61 | Maximum dimming value  |  |
| 65 |  Dimming time (soft on/off) |  |
| 66 | Dimming time when key pressed |  |
| 67 |  Ignore start level  |  |
| 68 | Dimming duration  |  |
| 110 | Temperature sensor offset settings |  |
| 120 | Digital temperature sensor reporting |  |
| 140 | Input I1 Sensor reporting  |  |
| 141 |  Input I1 0-10V reporting threshold |  |
| 143 | Minimum sensor range value  |  |
| 144 | Maximum sensor range value  |  |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 1: Input 1 Switch Type

Input 1 Switch Type
By this parameter the user can set input based on device type (switch, potentiometer, 0-10V sensor,...)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | mono-stable switch type (push button) |
| 1 | Bi-stable switch type |
| 2 | Potentiometer |
| 3 | Temperature sensor |
| 4 | Illumination sensor |
| 5 | General purpose sensor |

The manufacturer defined default value is ```0``` (mono-stable switch type (push button)).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 11: Automatic turning off output after set time



Values in the range 0 to 32536 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


### Parameter 12: Automatic turning on output after set time



Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 21: Enable/Disable Double click function



Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_21_1``` and is of type ```INTEGER```.


### Parameter 30: Saving the state after a power failure



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Module saves it state |
| 1 | Module turns OFF |

The manufacturer defined default value is ```0``` (Module saves it state).

This parameter has the configuration ID ```config_30_1``` and is of type ```INTEGER```.


### Parameter 52: Auto or manual selection



Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_52_1``` and is of type ```INTEGER```.


### Parameter 53: PID value inside deadband



Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_53_1``` and is of type ```INTEGER```.


### Parameter 54: PID deadband 



Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_54_1``` and is of type ```INTEGER```.


### Parameter 55: Integral sampling time 



Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_55_1``` and is of type ```INTEGER```.


### Parameter 56: P parameter



Values in the range 0 to 1000 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_56_2``` and is of type ```INTEGER```.


### Parameter 57: I parameter 



Values in the range 0 to 1000 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_57_2``` and is of type ```INTEGER```.


### Parameter 58: D parameter 

Available config. parameters (data type is2 Byte DEC):

Values in the range 0 to 1000 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_58_2``` and is of type ```INTEGER```.


### Parameter 60: Minimum dimming value 



Values in the range 1 to 98 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_60_1``` and is of type ```INTEGER```.


### Parameter 61: Maximum dimming value 



Values in the range 2 to 99 may be set.

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_61_1``` and is of type ```INTEGER```.


### Parameter 65:  Dimming time (soft on/off)



Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_65_2``` and is of type ```INTEGER```.


### Parameter 66: Dimming time when key pressed



Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_66_1``` and is of type ```INTEGER```.


### Parameter 67:  Ignore start level 



Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_67_1``` and is of type ```INTEGER```.


### Parameter 68: Dimming duration 



Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_68_1``` and is of type ```INTEGER```.


### Parameter 110: Temperature sensor offset settings



Values in the range 1 to 32536 may be set.

The manufacturer defined default value is ```32536```.

This parameter has the configuration ID ```config_110_2``` and is of type ```INTEGER```.


### Parameter 120: Digital temperature sensor reporting



Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_120_1``` and is of type ```INTEGER```.


### Parameter 140: Input I1 Sensor reporting 



Values in the range 0 to 140 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_140_2``` and is of type ```INTEGER```.


### Parameter 141:  Input I1 0-10V reporting threshold



Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_141_1``` and is of type ```INTEGER```.


### Parameter 143: Minimum sensor range value 



Values in the range 0 to 20000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_143_2``` and is of type ```INTEGER```.


### Parameter 144: Maximum sensor range value 



Values in the range 0 to 20000 may be set.

The manufacturer defined default value is ```1000```.

This parameter has the configuration ID ```config_144_2``` and is of type ```INTEGER```.

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

The ZMNHVD supports 6 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Reserved for communication with the main controller

Association group 1 supports 1 node.

### Group 2:  basic on/off 

triggered at change of the input I1 state and reflecting its state

Association group 2 supports 16 nodes.

### Group 3: start level change/stop level change

triggered at change of the input I1 state and reflecting its state) up to 16 nodes. Working only when the Parameter no. 1 is set to mono stable switch type.

Association group 3 supports 16 nodes.

### Group 4: multilevel set

triggered at changes of state/value of the Flush Dimmer 0-10V

Association group 4 supports 16 nodes.

### Group 5:  multilevel sensor report -  analogue sensor

triggered at change of analogue sensor

Association group 5 supports 16 nodes.

### Group 6:  multilevel sensor report - temperature sensor

triggered at change of temperature sensor

Association group 6 supports 16 nodes.

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
| COMMAND_CLASS_SENSOR_MULTILEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V1| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/363/Qubino-Flush-Dimmer-0-10V-PLUS-user-manual-V1-1-eng-1.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/363).
