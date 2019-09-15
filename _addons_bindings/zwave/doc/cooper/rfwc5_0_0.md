---
layout: documentation
title: RFWC5 - ZWave
---

{% include base.html %}

# RFWC5 5-Scene Keypad
This describes the Z-Wave device *RFWC5*, manufactured by *Cooper Wiring Devices* with the thing type UID of ```cooper_rfwc5_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![RFWC5 product image](https://www.cd-jackson.com/zwave_device_uploads/15/15_default.jpg)


## Overview

The Z-Wave wall mount 5-scene keypad (RFWC5 & RFWC5D) serves as a flush mounted device for activating up to 5 scenes by manually pushing one of the five buttons on the face of the device. The scene keypad has 5 buttons, with LEDs, for turning individual scenes both ON and OFF. Each individual scene can be brightened or dimmed by pressing and holding any active (ON) scene’s corresponding button. The button located on the side of the device transmits an All-OFF command to only the devices associated with that scene controller. Scenes are a group of devices set to customized levels or states. The 5-scene keypad utilizes existing 120V/AC, 60Hz standard house wiring and fits in standard-sized wallboxes.

**Design features for 5-scene keypad**

  * All OFF button provides easy access for turning off all devices associated with scene keypad
  * Aesthetic form factor matches our Z-Wave smart dimmers and switches, providing unified look across wall devices
  * Fits standard-sized wallbox and utilizes existing 120V/AC, 60Hz (neutral wire required)
  * Activates scenes associated with Z-Wave devices and other Z-Wave® compliant devices
  * Provides individual scene DIM/BRIGHT function by pressing and holding any active (ON) scene’s button
  * Stores up to 5 scenes for activation (ON/OFF)
  * Blue LED provided on each button for scene status notification
  * Blue LEDs provides night light feature by dimming when scene has been deactivated
  * Single button programming
  * Transfer function on Eaton’s primary controllers allows user to easily copy scene information from controller to each button on scene keypad
  * Patented indicator system alerts if scene keypad is not set up in the network
  * Keypad button kits available by special order

### Inclusion Information

Press the All Off (Inclusion) button one time

### Exclusion Information

Press the All Off (Inclusion) button one time

## Channels

The following table summarises the channels available for the RFWC5 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch Button 1 | switch_binary | switch_binary | Switch | Switch | 
| Scene Number 1 | scene_number | scene_number |  | Number | 
| Indicator Light Control 1 | indicator_level | indicator_level |  | Dimmer | 
| Switch Button 2 | switch_binary1 | switch_binary | Switch | Switch | 
| Scene Number 2 | scene_number1 | scene_number |  | Number | 
| Indicator Light Control 2 | indicator_level1 | indicator_level |  | Dimmer | 

### Switch Button 1
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Scene Number 1
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.

### Indicator Light Control 1
Sets the indicator brightness.

The ```indicator_level``` channel is of type ```indicator_level``` and supports the ```Dimmer``` item.

### Switch Button 2
Switch the power on and off.

The ```switch_binary1``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Scene Number 2
Triggers when a scene button is pressed.

The ```scene_number1``` channel is of type ```scene_number``` and supports the ```Number``` item.

### Indicator Light Control 2
Sets the indicator brightness.

The ```indicator_level1``` channel is of type ```indicator_level``` and supports the ```Dimmer``` item.



## Device Configuration

The following table provides a summary of the 5 configuration parameters available in the RFWC5.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Group 1 Level | Group 1 Level |
| 2 | Group 2 Level | Group 2 Level |
| 3 | Group 3 Level | Group 3 Level |
| 4 | Group 4 Level | Group 4 Level |
| 5 | Group 5 Level | Group 5 Level |

### Parameter 1: Group 1 Level

Group 1 Level
Value 0x00-0x63 or 0xFF is the level for all nodes listed in the Group 1
Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Group 2 Level

Group 2 Level
Value 0x00-0x63 or 0xFF is the level for all nodes listed in the Group 2
Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```20```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Group 3 Level

Group 3 Level
Value 0x00-0x63 or 0xFF is the level for all nodes listed in the Group 3
Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Group 4 Level

Group 4 Level
Value 0x00-0x63 or 0xFF is the level for all nodes listed in the Group 4
Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```40```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Group 5 Level

Group 5 Level
Value 0x00-0x63 or 0xFF is the level for all nodes listed in the Group 5
Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The RFWC5 supports 6 association groups.

### Group 1: Group 1


Association group 1 supports 232 nodes.

### Group 2: Group 2


Association group 2 supports 232 nodes.

### Group 3: Group 3


Association group 3 supports 232 nodes.

### Group 4: Group 4


Association group 4 supports 232 nodes.

### Group 5: Group 5


Association group 5 supports 232 nodes.

### Group 255: Group 255


Association group 255 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_CONTROLLER_REPLICATION_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_SCENE_CONTROLLER_CONF_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_NODE_NAMING_V1| |
| COMMAND_CLASS_HAIL_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_INDICATOR_V1| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_CONTROLLER_REPLICATION_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_SCENE_CONTROLLER_CONF_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_NODE_NAMING_V1| |
| COMMAND_CLASS_HAIL_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_INDICATOR_V1| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/15/WallMount5-SceneKeypadSpecSheet.pdf)
* [Detailed Manual](https://www.cd-jackson.com/zwave_device_uploads/15/21895AW.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/15).
