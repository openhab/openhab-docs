---
layout: documentation
title: Keypad - ZWave
---

{% include base.html %}

# Keypad Alarm Keypad
This describes the Z-Wave device *Keypad*, manufactured by *Ring* with the thing type UID of ```ring_rkeu_00_000```.

The device is in the category of *Remote Control*, defining Any portable or hand-held device that controls the status of something, e.g. remote control, keyfob etc..

![Keypad product image](https://opensmarthouse.org/zwavedatabase/1353/image/)


The Keypad supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

Ring Alarm features a Z-Wave keypad, will act as an arming station for the Ring Alarm system. In addition to smartphone and web apps, the keypad provides users with an alternative interface for their alarm system. The keypad allows the user to arm and disarm their system, view system status and receive visual and audio feedback regarding system status and events. Designed for convenience, the keypad can be mounted on the wall or left on a tabletop. Additionally, a rechargeable battery and AC power option provide users with the flexibility to use the keypad in ways which work best for each individual. This keypad gives users a home arming station without having to worry about wiring, picking the right location, complicated hardware installation or making modifications to their homes.

The keypad will include an interactive button interface, an informational display, a speaker, various LED lights, wall mount option, battery power, AC power option, and additional features to extend control of the Ring Protect system beyond the user’s mobile device and web applications. The keypad is intended to be used as a “dumb” terminal and will be non-programmable for end users.

### Inclusion Information

  1. Activate inclusion mode on controller
  2. Hold button 1 on keypad for 3 seconds to enter inclusion mode
  3. Device should appear in inbox

### Exclusion Information

  1. Initiate exclusion mode on controller
  2. Hold button 1 on kepad for 3 seconds.
  3. Buttons on keypad should no longer beep when pressed

### General Usage Information



## Channels

The following table summarises the channels available for the Keypad -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Alarm Access | alarm_access | alarm_access | Door | Switch | 
| Alarm (heat) | alarm_heat | alarm_heat | Fire | Switch | 
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 
| Alarm (system) | alarm_system | alarm_system |  | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Alarm Access
Indicates if the access control alarm is triggered.

The ```alarm_access``` channel is of type ```alarm_access``` and supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (heat)
Indicates if a heat alarm is triggered.

The ```alarm_heat``` channel is of type ```alarm_heat``` and supports the ```Switch``` item and is in the ```Fire``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (burglar)
Indicates if the burglar alarm is triggered.

The ```alarm_burglar``` channel is of type ```alarm_burglar``` and supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (power)
Indicates if a power alarm is triggered.

The ```alarm_power``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (system)
Indicates if a system alarm is triggered.

The ```alarm_system``` channel is of type ```alarm_system``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

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

The following table provides a summary of the 24 configuration parameters available in the Keypad.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Parameter 1 | Battery Report Interval |
| 2 | Parameter 2 | Z-Wave Sleep Timeout |
| 3 | Parameter 3 | Co-Proc Is Alive |
| 4 | Parameter 4 | Proximity Timeout |
| 5 | Parameter 5 | Button Press Timeout |
| 6 | Parameter 6 | Status Change Timeout |
| 7 | Parameter 7 | Power Mode |
| 8 | Parameter 8 | Key Backlight Timeout |
| 9 | Parameter 9 | Key Backlight Brightness |
| 10 | Parameter 10 | Key Tone Volume |
| 11 | Parameter 11 | Ambient Light Sensor Level |
| 12 | Parameter 12 | Siren Volume |
| 13 | Parameter 13 | Proximity On/OFF |
| 14 | Parameter 14 | Proximity Distance |
| 15 | Parameter 15 | Extended Battery Life LED Brightness Adjustment |
| 16 | Parameter 16 | Reduced Battery Life LED Brightness Adjustment |
| 17 | Parameter 17 | Fast Blink Rate |
| 18 | Parameter 18 | Slow Blink Rate |
| 19 | Parameter 19 | Supervision Report Timeout. settings |
| 20 | Parameter 20 | Number of Re-transmissions Attempts. settings |
| 21 | Parameter 21 | Wait Period Between Re-transmissions Attempts. settings |
| 22 | Parameter 22 | Language Used |
| 23 | Parameter 23 | Bit mask data for supported languages |
| 24 | Parameter 24 | Audio File Version |

### Parameter 1: Parameter 1

Battery Report Interval

Values in the range 70 to 1440 may be set.

The manufacturer defined default value is ```1440```.

This parameter has the configuration ID ```config_1_2``` and is of type ```INTEGER```.


### Parameter 2: Parameter 2

Z-Wave Sleep Timeout
Time to wait after receiving ZW for more OTA messages. 
The following option values may be configured, in addition to values in the range 1 to 5 -:

| Value  | Description |
|--------|-------------|
| 1 | 1 second |
| 2 | 2 seconds |
| 3 | 3 seconds |
| 4 | 4 seconds |
| 5 | 5 seconds |

The manufacturer defined default value is ```1``` (1 second).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Parameter 3

Co-Proc Is Alive

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Parameter 4

Proximity Timeout

Values in the range 0 to 30 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Parameter 5

Button Press Timeout

Values in the range 0 to 30 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Parameter 6

Status Change Timeout

Values in the range 10 to 60 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Parameter 7

Power Mode

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Parameter 8

Key Backlight Timeout

Values in the range 1 to 15 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Parameter 9

Key Backlight Brightness

Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: Parameter 10

Key Tone Volume

Values in the range 1 to 8 may be set.

The manufacturer defined default value is ```4```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: Parameter 11

Ambient Light Sensor Level

Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Parameter 12

Siren Volume

Values in the range 0 to 10 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: Parameter 13

Proximity On/OFF

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: Parameter 14

Proximity Distance

Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.


### Parameter 15: Parameter 15

Extended Battery Life LED Brightness Adjustment

Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 16: Parameter 16

Reduced Battery Life LED Brightness Adjustment

Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_16_1``` and is of type ```INTEGER```.


### Parameter 17: Parameter 17

Fast Blink Rate

Values in the range 1 to 100 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 18: Parameter 18

Slow Blink Rate

Values in the range 1 to 100 may be set.

The manufacturer defined default value is ```25```.

This parameter has the configuration ID ```config_18_1``` and is of type ```INTEGER```.


### Parameter 19: Parameter 19

Supervision Report Timeout. settings

Values in the range 500 to 5000 may be set.

The manufacturer defined default value is ```500```.

This parameter has the configuration ID ```config_19_2``` and is of type ```INTEGER```.


### Parameter 20: Parameter 20

Number of Re-transmissions Attempts. settings

Values in the range 0 to 5 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_20_1``` and is of type ```INTEGER```.


### Parameter 21: Parameter 21

Wait Period Between Re-transmissions Attempts. settings

Values in the range 1 to 60 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_21_1``` and is of type ```INTEGER```.


### Parameter 22: Parameter 22

Language Used

Values in the range 0 to 31 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_22_1``` and is of type ```INTEGER```.


### Parameter 23: Parameter 23

Bit mask data for supported languages

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_23_4``` and is of type ```INTEGER```.


### Parameter 24: Parameter 24

Audio File Version

Values in the range 0 to 1000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_24_4``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Keypad supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Controller Updates
1. Notification Report. Keypad will send Notification Report to the associated nodes when AC power / PIR sensor is triggered /system software failure.  
2. Entry Control Notification. Keypad will send Entry Control Notification to the associated nodes when the mode button is triggered.  
3. Battery Report. Keypad will send Battery Report when the battery level is low and the battery report’s value is 0xFF or Hearbeat.  
4. Device Reset Locally Notification

Association group 1 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_ENTRY_CONTROL_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_INDICATOR_V1| |
| COMMAND_CLASS_SECURITY_V1| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [devicemanual](https://opensmarthouse.org/zwavedatabase/1353/reference/Ring_Keypad_EU_Z-wave_Manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1353).
