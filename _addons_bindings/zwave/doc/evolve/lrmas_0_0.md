---
layout: documentation
title: LRM-AS - ZWave
---

{% include base.html %}

# LRM-AS Wall Mounted Dimmer
This describes the Z-Wave device *LRM-AS*, manufactured by *Evolve* with the thing type UID of ```evolve_lrmas_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![LRM-AS product image](https://www.cd-jackson.com/zwave_device_uploads/39/39_default.png)


The LRM-AS supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Scene Capable Wall Switch DimmerThe LRM-AS Wall Mounted Dimmer is a component of the Evolve lighting control system. Inclusion of the LRM-AS Wall Mounted Dimmer allows remote ON/ OFF control and dimming of lights connected. 

### Inclusion Information

Tap the button.

### Exclusion Information

Tap the button 3 times, then press and hold (Ex. tap, tap, tap, hold)

## Channels

The following table summarises the channels available for the LRM-AS -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch  [Deprecated]| switch_binary | switch_binary | Switch | Switch | 
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Binary Sensor | sensor_binary | sensor_binary |  | Switch | 
| Alarm | alarm_general | alarm_general | Alarm | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Switch [Deprecated]
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

**Note:** This channel is marked as deprecated so should not be used.

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Binary Sensor
Indicates if a sensor has triggered.

The ```sensor_binary``` channel is of type ```sensor_binary``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Alarm
Indicates if an alarm is triggered.

The ```alarm_general``` channel is of type ```alarm_general``` and supports the ```Switch``` item and is in the ```Alarm``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The following table provides a summary of the 3 configuration parameters available in the LRM-AS.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 3 | Night Light | In night-light mode the LED will turn ON when the switch is turned OFF. |
| 4 | Invert Switch | Change the top of the switch to OFF and the bottom of the switch to ON. |
| 29 | Load Sense |  |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 3: Night Light

In night-light mode the LED will turn ON when the switch is turned OFF.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No |
| 1 | Yes |

The manufacturer defined default value is ```1``` (Yes).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Invert Switch

Change the top of the switch to OFF and the bottom of the switch to ON.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No |
| 1 | Yes |

The manufacturer defined default value is ```0``` (No).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 29: Load Sense



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable |
| 1 | Enable |

The manufacturer defined default value is ```0``` (Disable).

This parameter has the configuration ID ```config_29_1``` and is of type ```INTEGER```.

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

The LRM-AS supports 1 association group.

### Group 1: Group 1


Association group 1 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| |
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V1| |
| COMMAND_CLASS_METER_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/39/EVLRMAS-Manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/39).
