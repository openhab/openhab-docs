---
layout: documentation
title: ZMNHUD - ZWave
---

{% include base.html %}

# ZMNHUD Flush pilot (DIN version)
This describes the Z-Wave device *ZMNHUD*, manufactured by *[Goap](http://www.qubino.com/)* with the thing type UID of ```qubino_zmnhud_00_000```.

The ZMNHUD supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/715) to improve the documentation.

## Channels

The following table summarises the channels available for the ZMNHUD -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 
| Dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Binary Sensor | sensor_binary | Door | Switch | 

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



## Device Configuration

The following table provides a summary of the 10 configuration parameters available in the ZMNHUD.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Input 1 switch type |  |
| 2 | Input 2 switch type |  |
| 3 | Input 3 switch type |  |
| 4 | Input 1 contact type |  |
| 5 | Input 2 contact type |  |
| 6 | Input 3 contact type |  |
| 11 | Input 1 operation mode selection |  |
| 12 | Input 2 operation mode selection |  |
| 13 | Input 3 operation mode selection |  |
| 30 | Saving the state of the device after a power failure |  |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 1: Input 1 switch type



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | mono-stable switch type (push button) |
| 1 | bi-stable switch type |

The manufacturer defined default value is ```1``` (bi-stable switch type).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Input 2 switch type



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | mono-stable switch type (push button) |
| 1 | bi-stable switch type |

The manufacturer defined default value is ```1``` (bi-stable switch type).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Input 3 switch type



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | mono-stable switch type (push button) |
| 1 | bi-stable switch type |

The manufacturer defined default value is ```1``` (bi-stable switch type).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Input 1 contact type



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | NO (normally open) input type |
| 1 | NC (normally close) input type |

The manufacturer defined default value is ```0``` (NO (normally open) input type).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Input 2 contact type



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | NO (normally open) input type |
| 1 | NC (normally close) input type |

The manufacturer defined default value is ```0``` (NO (normally open) input type).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Input 3 contact type



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | NO (normally open) input type |
| 1 | NC (normally close) input type |

The manufacturer defined default value is ```0``` (NO (normally open) input type).

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 11: Input 1 operation mode selection



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Button does not influence on selected mode |
| 1 | Comfort |
| 2 | Comfort-1°C |
| 3 | Comfort-2°C |
| 4 | Eco Mode |
| 5 | Frost Protection |
| 6 | Stop |

The manufacturer defined default value is ```1``` (Comfort).

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Input 2 operation mode selection



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Button does not influence on selected mode |
| 1 | Comfort |
| 2 | Comfort-1°C |
| 3 | Comfort-2°C |
| 4 | Eco Mode |
| 5 | Frost Protection |
| 6 | Stop |

The manufacturer defined default value is ```4``` (Eco Mode).

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: Input 3 operation mode selection



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Button does not influence on selected mode |
| 1 | Comfort |
| 2 | Comfort-1°C |
| 3 | Comfort-2°C |
| 4 | Eco Mode |
| 5 | Frost Protection |
| 6 | Stop |

The manufacturer defined default value is ```5``` (Frost Protection).

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 30: Saving the state of the device after a power failure



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | The module saves its state before power failure |
| 1 | The module does not save the state |

The manufacturer defined default value is ```0``` (The module saves its state before power failure).

This parameter has the configuration ID ```config_30_1``` and is of type ```INTEGER```.

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

The ZMNHUD supports 5 association groups.

### Group 1: Lifeline group

Reserved for communication with the main controller
This group supports 1 nodes.

### Group 2: Multilevel

Triggered at changes of state/value of the Flush pilot wire
This group supports 99 nodes.

### Group 3: Basic on/off 

Triggered at change of the input I1 state and reflecting its state
This group supports 99 nodes.

### Group 4: Basic on/off

Triggered at change of the input I2 state and reflecting its state
This group supports 99 nodes.

### Group 5: Basic on/off

Triggered at change of the input I3 state and reflecting its state
This group supports 99 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/715).
