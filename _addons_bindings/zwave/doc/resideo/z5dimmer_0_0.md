---
layout: documentation
title: Z5DIMMER - ZWave
---

{% include base.html %}

# Z5DIMMER Z-WAVE IN-WALL SMART DIMMER
This describes the Z-Wave device *Z5DIMMER*, manufactured by *Resideo* with the thing type UID of ```resideo_z5dimmer_00_000```.

The device is in the category of *Battery*, defining Batteries, Energy Storages.

![Z5DIMMER product image](https://opensmarthouse.org/zwavedatabase/1659/image/)


The Z5DIMMER supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Resideo Technologies (Honeywell) In-Wall Z-Wave Plus Smart Dimmer. Compatible with all incandescent and most CFL/LED bulbs. May be used in single-pole installation or with up to two Resideo Add-on Switches in 3-way or 4-way wiring configurations. Includes white and light almond paddle. Model: ZW3010/39458-5, Ver 5.4, 2020

### Inclusion Information

Follow the instructions for your Z-Wave certified controller to add a device to the Z-Wave network.

Once the controller is ready to add your device, press and release the top or bottom of the smart dimmer (rocker). If prompted by the controller to enter the S2 security code, refer to the QR code/security number on the back of the box, or the QR code label on the product.

### Exclusion Information

Follow the instructions for your Z-Wave certified controller to remove a device from the Z-Wave network.

Once the controller is ready to remove your device, press and release the top or bottom of the smart dimmer (rocker). 

### General Usage Information

RETURNING SWITCH TO FACTORY DEFAULTS

Quickly press ON (Top) button three (3) times then immediately press the OFF (Bottom) button three (3) times. The LED will flash ON/OFF 5 times when completed successfully.

Note: This should only be used in the event your network’s primary controller is missing or otherwise inoperable.

## Channels

The following table summarises the channels available for the Z5DIMMER -:

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

The following table provides a summary of the 7 configuration parameters available in the Z5DIMMER.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 3 | LED indication configuration |  |
| 6 | Dim up/down rate |  |
| 16 | Enable/Disable Switch Mode |  |
| 19 | Alternate Exclusion |  |
| 30 | Minimum Dim Threshold |  |
| 31 | Maximum Brightness Threshold |  |
| 32 | Default Brightness Level |  |

### Parameter 3: LED indication configuration


LED indication configuration
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 6: Dim up/down rate


Dim up/down rate
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Default - Dim up/down the light to the specified level quickly by comm |
| 1 | Dim up/down the light to the specified level slowly by command except |

The manufacturer defined default value is ```0``` (Default - Dim up/down the light to the specified level quickly by comm).

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 16: Enable/Disable Switch Mode


Enable/Disable Switch Mode
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Default - Disable |

The manufacturer defined default value is ```0``` (Default - Disable).

This parameter has the configuration ID ```config_16_1``` and is of type ```INTEGER```.


### Parameter 19: Alternate Exclusion


Alternate Exclusion
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Default - Press any button on the switch |
| 1 | Press ON two times and OFF two times, the LED will flash 5 times if ex |

The manufacturer defined default value is ```0``` (Default - Press any button on the switch).

This parameter has the configuration ID ```config_19_1``` and is of type ```INTEGER```.


### Parameter 30: Minimum Dim Threshold


Set the minimum dimmer threshold when manually or remotely controlled. 1%-99%
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Default - 1% |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_30_1``` and is of type ```INTEGER```.


### Parameter 31: Maximum Brightness Threshold


Set the maximum brightness threshold when manually or remotely controlled
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_31_1``` and is of type ```INTEGER```.


### Parameter 32: Default Brightness Level


Set the default brightness level that the dimmer will turn on when being turned on manually. Last state, 0%-99%
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Default - Last State |

The manufacturer defined default value is ```0``` (Default - Last State).

This parameter has the configuration ID ```config_32_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Z5DIMMER supports 1 association group.

### Group 1: Group 1

Group 1

Association group 1 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_CENTRAL_SCENE_V3| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [Z5DIMMER Install Guide](https://opensmarthouse.org/zwavedatabase/1659/reference/resideo-z5dimmer-z-wave-plus-in-wall-smart-dimmer-install-guide.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1659).
