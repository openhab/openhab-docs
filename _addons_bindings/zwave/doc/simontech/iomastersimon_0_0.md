---
layout: documentation
title: 10000306-039 - ZWave
---

{% include base.html %}

# 10000306-039 IO Master Simon 100
This describes the Z-Wave device *10000306-039*, manufactured by *SimonTech S.L.U* with the thing type UID of ```simontech_iomastersimon_00_000```.

The device is in the category of *Blinds*, defining Roller shutters, window blinds, etc..

![10000306-039 product image](https://opensmarthouse.org/zwavedatabase/1494/image/)


The 10000306-039 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Do you need a Master that will allow you to centralize the blinds or the switch-off of the entire installation of light in your home? Of the Simon 100 series comes this Module Master iO. A switch master as it allows you to activate the functionalities to press the mechanism of natural way, in the same way as with any other device. This type of switches are also unify tasks by adding, in the same way, solutions according to the needs of each. Compatible with elements up to 16 Ampere current and 250 Volt voltage. This Simon 100 is the first series to incorporate the iO Simon system, being the switches in operation analog to digital. Thanks to this, it is possible to connect all types of devices, giving the spaces a greater comfort, more functionality and also a better appearance. A simple, comfortable and user-friendly, which saves time to the user. Master compatible with Simon 100 series frames.  


Roller Blind IO is ready to operate with Z-Wave controllers and configured to be managed by Simon100 IO APP using the HUB plug IO for getting a better user experience. Sending the Blind Up/Down or setting a specific position.

### Inclusion Information

When the pushbutton is released after a press of (2<T<10sec) the device will send a NIF to include from Z-Wave network or perform an association with other Z-Wave device.

Central LED will Blink with 0,3 sec period to inform that NIF can be send after release of pushbutton.

This process does not perform a default reset of configurations.

Main LED will Blink with 0,3 sec period to inform that NIF can be send after release of pushbutton.

When the pushbutton is released after a press of (2<T<10sec) the device will send a NIF to include from Z-Wave network or perform an association with other Z-Wave device.

Central LED will Blink with 0,3 sec period to inform that NIF can be send after release of pushbutton.

This process does not perform a default reset of configurations.

Main LED will Blink with 0,3 sec period to inform that NIF can be send after release of pushbutton.

### Exclusion Information

When the pushbutton is released after a press of (2<T<10sec) the device will send a NIF to exclude from Z-Wave network or perform an association with other Z-Wave device.

Main LED will Blink with 0,3 sec period to inform that NIF can be send after release of pushbutton.

This process does not perform a default reset of configurations.

Main LED will Blink with 0,3 sec period to inform that NIF can be send after release of pushbutton.

When the pushbutton is released after a press of (2<T<10sec) the device will send a NIF to include from Z-Wave network or perform an association with other Z-Wave device.

Central LED will Blink with 0,3 sec period to inform that NIF can be send after release of pushbutton.

This process does not perform a default reset of configurations.

Main LED will Blink with 0,3 sec period to inform that NIF can be send after release of pushbutton.

### General Usage Information



## Channels

The following table summarises the channels available for the 10000306-039 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Scene Number | scene_number | scene_number |  | Number | 

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.
This channel provides the scene, and the event as a decimal value in the form ```<scene>.<event>```. The scene number is set by the device, and the event is as follows -:

| Event ID | Event Description  |
|----------|--------------------|
| 0        | Single key press   |
| 1        | Key released       |
| 2        | Key held down      |
| 3        | Double keypress    |
| 4        | Tripple keypress   |
| 5        | 4 x keypress       |
| 6        | 5 x keypress       |



## Device Configuration

The following table provides a summary of the 9 configuration parameters available in the 10000306-039.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Association LED | Activates the Central LED. |
| 4 | Up Time | Up Time |
| 5 | Down Time | Down Time |
| 9 | Calibration | Calibration |
| 12 | Behavior of LED in Repose | Configuration of Main LED as identification at 20%. |
| 13 | Lock Input | Unlock/lock the direct control of load. |
| 21 | Load State | Load State (Read Only) |
| 23 | Calibration Required | Calibration Required (Read Only) |
| 27 | Lock long press | 7 Lock long press |

### Parameter 1: Association LED

Activates the Central LED.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Turns the LED OFF (default) |
| 255 | Turns the LED ON |

The manufacturer defined default value is ```0``` (Turns the LED OFF (default)).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 4: Up Time

Up Time

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Sets the UP time in seconds |
| 60 | Default |

The manufacturer defined default value is ```60``` (Default).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 5: Down Time

Down Time

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Sets the DOWN time in seconds |
| 60 | Default |

The manufacturer defined default value is ```60``` (Default).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 9: Calibration

Calibration
255 - The device will perform a calibration process in order to Set the UP and DOWN times automatically
Values in the range 255 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_9_1_wo``` and is of type ```INTEGER```.
This is a write only parameter.


### Parameter 12: Behavior of LED in Repose

Configuration of Main LED as identification at 20%.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | LED OFF |
| 255 | LED ON at 20% of maximum level |

The manufacturer defined default value is ```0``` (LED OFF).

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: Lock Input

Unlock/lock the direct control of load.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Unlock the direct control of load. |
| 255 | Lock the direct control of load. |

The manufacturer defined default value is ```0``` ( Unlock the direct control of load.).

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 21: Load State

Load State (Read Only)

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Bit 0: Load is OFF |
| 0 | Bit 1: Sunblind position 0% |
| 1 | Bit 0: Load is going UP/DOWN |
| 99 | Bit 1: Sunblind position 99% |

The manufacturer defined default value is ```0``` (Bit 1: Sunblind position 0%).

This parameter has the configuration ID ```config_21_2``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 23: Calibration Required

Calibration Required (Read Only)

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Calibration is not required. |
| 255 | It is necessary to calibrate the device. |

The manufacturer defined default value is ```0``` (Calibration is not required.).

This parameter has the configuration ID ```config_23_1``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 27: Lock long press

7 Lock long press

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Long press works as default. |
| 255 | Long press works as overview. |

The manufacturer defined default value is ```0``` (Long press works as default.).

This parameter has the configuration ID ```config_27_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The 10000306-039 supports 2 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Lifeline
Change on Sunblind position:

  * On -> CC Basic, Basic Report.
  * Value 0x01 - 0x63 Report sunblind position

Calibration requirement change. (If device needs to be calibrated and is Added into a ZWave network, it will report after receive an Association Set of life line).

  * Calibration required -> CC Configuration, Configuration Report, Param 23, Value 0xF
  * Calibration not required -> CC Configuration, Configuration Report, Param 23, Value 0x00

Association group 1 supports 3 nodes.

### Group 2: ctrl

Control
Change on Sunblind position:

  * CC Basic, Basic Report.
  * Value 0x00 - 0x63 Report sunblind position

Association group 2 supports 20 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_CENTRAL_SCENE_V3| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [File](https://opensmarthouse.org/zwavedatabase/1494/reference/10000306-039.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1494).
