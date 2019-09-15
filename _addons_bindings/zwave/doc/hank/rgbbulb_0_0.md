---
layout: documentation
title: RGB bulb - ZWave
---

{% include base.html %}

# RGB bulb HKZW-RGB01-V1.0
This describes the Z-Wave device *RGB bulb*, manufactured by *[Hank](http://www.hank-tech.com/)* with the thing type UID of ```hank_rgbbulb_00_000```.

The device is in the category of *Light Bulb*, defining Devices that illuminate something, such as bulbs, etc..

![RGB bulb product image](https://www.cd-jackson.com/zwave_device_uploads/598/598_default.png)


The RGB bulb supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

A smart bulb with over 16 million colors

### Inclusion Information

Toggle the wall switch off and on 3 times quickly (within 3 seconds) ending with On

### Exclusion Information

Toggle the wall switch off and on 3 times quickly (within 3 seconds) ending with On

## Channels

The following table summarises the channels available for the RGB bulb -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Scene Number | scene_number | scene_number |  | Number | 
| Color Control | color_color | color_color | ColorLight | Color | 
| Color Temperature | color_temperature | color_temperature | ColorLight | Dimmer | 

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.

### Color Control
The color channel allows to control the color of a light.
            It is also possible to dim values and switch the light on and off.

The ```color_color``` channel is of type ```color_color``` and supports the ```Color``` item and is in the ```ColorLight``` category.

### Color Temperature
The color temperature channel allows to set the color
            temperature of a light from 0 (cold) to 100 (warm).

The ```color_temperature``` channel is of type ```color_temperature``` and supports the ```Dimmer``` item and is in the ```ColorLight``` category.



## Device Configuration

The following table provides a summary of the 5 configuration parameters available in the RGB bulb.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 21 | Status after power failure | Define how the RGB BULB will react after the power supply is back on. |
| 24 | Notification when Load status change | RGB BULB can send notifications to associated device |
| 51 | Enable/disable the function of using wall switch | Enable/disable the function of using wall switch to turn on/off RGB BULB |
| 61 | Advance mode | RGB BULB can blink or cyclic/random change color automatically at set intervals. |
| 255 | Resetting to factory default | RGB BULB will exclude from the Z-Wave network with this particular command |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 21: Status after power failure

Define how the RGB BULB will react after the power supply is back on.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Memorizes its state |
| 1 | On |
| 2 | Off |

The manufacturer defined default value is ```0``` (Memorizes its state ).

This parameter has the configuration ID ```config_21_1``` and is of type ```INTEGER```.


### Parameter 24: Notification when Load status change

RGB BULB can send notifications to associated device
RGB BULB can send notifications to associated device (Group Lifeline) when the status of the RGB BULB is changed.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Notifications Disabled |
| 1 | Send BASIC REPORT |
| 2 | Send BASIC REPORT only without status change |

The manufacturer defined default value is ```1``` (Send BASIC REPORT).

This parameter has the configuration ID ```config_24_1``` and is of type ```INTEGER```.


### Parameter 51: Enable/disable the function of using wall switch

Enable/disable the function of using wall switch to turn on/off RGB BULB

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable |
| 1 | Enable |

The manufacturer defined default value is ```0``` (Disable).

This parameter has the configuration ID ```config_51_1``` and is of type ```INTEGER```.


### Parameter 61: Advance mode

RGB BULB can blink or cyclic/random change color automatically at set intervals.
RGB BULB can blink or cyclic/random change color automatically at set intervals. It will stop blink or change color when receiving any control command like Basic SetThis is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 3072 | Stop changing |
| 16826368 | Color gradual change randomly |
| 33603584 | Color change randomly with a breathing blink |
| 50380800 | Blink with random color |
| 67158016 | Color change randomly |
| 285261824 | Color gradual change |
| 302039040 | Breathing blink with a specific color |
| 318816256 | Blink with a specific color |

The manufacturer defined default value is ```3072``` (Stop changing).

This parameter has the configuration ID ```config_61_4``` and is of type ```INTEGER```.


### Parameter 255: Resetting to factory default

RGB BULB will exclude from the Z-Wave network with this particular command

The following option values may be configured, in addition to values in the range 1 to 1431655765 -:

| Value  | Description |
|--------|-------------|
| 1431655765 | Resetting to the factory default |

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_255_4``` and is of type ```INTEGER```.

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

The RGB bulb supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V2| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_SCENE_ACTUATOR_CONF_V1| |
| COMMAND_CLASS_SWITCH_COLOR_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/598/HKZW-RGB01-Manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/598).
