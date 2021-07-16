---
layout: documentation
title: Keypad 2nd Gen - ZWave
---

{% include base.html %}

# Keypad 2nd Gen Alarm Keypad 2nd Gen
This describes the Z-Wave device *Keypad 2nd Gen*, manufactured by *Ring* with the thing type UID of ```ring_keypad_00_000```.

The device is in the category of *Battery*, defining Batteries, Energy Storages.

![Keypad 2nd Gen product image](https://opensmarthouse.org/zwavedatabase/1398/image/)


The Keypad 2nd Gen supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

Ring Alarm features a Z-Wave keypad, will act as an arming station for the Ring Alarm system. In addition to smartphone and web apps, the keypad provides users with an alternative interface for their alarm system. The keypad allows the user to arm and disarm their system, view system status and receive visual and audio feedback regarding system status and events. Designed for convenience, the keypad can be mounted on the wall or left on a tabletop. Additionally, a rechargeable battery and AC power option provide users with the flexibility to use the keypad in ways which work best for each individual. This keypad gives users a home arming station without having to worry about wiring, picking the right location, complicated hardware installation or making modifications to their homes.

The keypad will include an interactive button interface, an informational display, a speaker, various LED lights, wall mount option, battery power, AC power option, and additional features to extend control of the Ring Protect system beyond the user’s mobile device and web applications. The keypad is intended to be used as a “dumb” terminal and will be non-programmable for end users.

see https://ring.com/products/alarm-keypad-v2 for further information.

### Inclusion Information

  1. Activate inclusion mode on controller
  2. hold button 1 on keypad for 3 seconds to enter inclusion mode
  3. Device should appear in inbox

### Exclusion Information

  1. Initiate exclusion mode on controller
  2. hold button 1 on kepad for 3 seconds.
  3. buttons on keypad should no longer beep when pressed

### General Usage Information



## Channels

The following table summarises the channels available for the Keypad 2nd Gen -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 
| Alarm (system) | alarm_system | alarm_system |  | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

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

The following table provides a summary of the 22 configuration parameters available in the Keypad 2nd Gen.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Heartbeats | This parameter is the number minutes between heartbeats. Heartbeats are automatic battery reports on a timer after the last event. |
| 2 | Application Level Retries | Number of application level retries attempted for messages either not ACKed or messages encapsulated via supervision get that did not receive a report. |
| 3 | Application Level Retry Base Wait Time Period | The number base seconds used in the calculation for sleeping between retry messages. |
| 4 | Announcement Audio Volume | Announcement Audio Volume (for audio files - should this be lumped into one of the other volume settings?) |
| 5 | Key Tone Volume | Key Tone Volume |
| 6 | Siren Volume | Siren Volume |
| 7 | Long press emergency duration | Long press emergency duration (seconds) This parameter allows a user to configure the duration in seconds for the hold time required to capture a long press . This includes Emergency Buttons + Mode Buttons (Police, Fire, Medical, Disarmed, Home, Away) |
| 8 | Long press number pad duration | Long press number pad duration (seconds) This parameter allows a user to configure the duration in seconds for the hold time required to capture a long press . This includes Number Pad + Check & X (0-9, Check, X) |
| 9 | Proximity Display Timeout | Proximity Display Timeout : Timeout in seconds when proximity is detected and no input is received |
| 10 | Button Press Display Timeout | Button Press Display Timeout : Timeout in seconds when any button is pressed, but a sequence is not completed and buttons are no longer being pressed |
| 11 | Status Change Display Timeout | Status Change Display Timeout: Timeout in seconds when indicator command is received from the hub to change status |
| 12 | Security Mode Brightness | Security Mode Brightness: Adjusts the brightness of the security mode buttons |
| 13 | Key Backlight Brightness | Key Backlight Brightness: Adjusts the brightness of the keypad backlight. Used for Key Backlight LEDs only Available settings: 0-100% |
| 14 | Ambient Light Sensor Level | Ambient Light Sensor Level: Light threshold where keypad will stop backlighting if higher than |
| 15 | Proximity On/OFF | Proximity On/OFF: Turn On and Off the Proximity Detection. |
| 16 | Ramp Time Config | Ramp Time Config: Ramp time in milliseconds to turn the LEDs on/off. Applies to all LEDs on the keypad |
| 17 | Low Battery Threshold | Low Battery Threshold - The percentage level at which the display would turn on the yellow battery indicator (whenever the display is on). |
| 18 | Languages Set | Languages Set: bit number in the languages supported bitmask to set |
| 19 | Warn Battery Threshold | Warn Battery Threshold - The percentage level at which the display would turn on the red battery indicator (whenever the display is on) |
| 20 | Supervisory Report response time | The number of milliseconds waiting for a Supervisory Report response to a Supervisory Get encapsulated command from the device before attempting a retry |
| 21 | System Security Mode Display | System Security Mode Display: (Always, Sometimes, Never). 601 = Always On , 1 - 600 = periodic interval, 0 = Always |
| 22 | Languages Supported (Get) | Languages Supported (Get): returns bitmask of languages supported. Bits set to 1 indicate that the language is supported |

### Parameter 1: Heartbeats

This parameter is the number minutes between heartbeats. Heartbeats are automatic battery reports on a timer after the last event.

Values in the range 0 to 70 may be set.

The manufacturer defined default value is ```70```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Application Level Retries

Number of application level retries attempted for messages either not ACKed or messages encapsulated via supervision get that did not receive a report.

Values in the range 0 to 5 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Application Level Retry Base Wait Time Period

The number base seconds used in the calculation for sleeping between retry messages.

Values in the range 1 to 60 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_3_0``` and is of type ```INTEGER```.


### Parameter 4: Announcement Audio Volume

Announcement Audio Volume (for audio files - should this be lumped into one of the other volume settings?)

Values in the range 0 to 210 may be set.

The manufacturer defined default value is ```7```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Key Tone Volume

Key Tone Volume

Values in the range 0 to 10 may be set.

The manufacturer defined default value is ```6```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Siren Volume

Siren Volume

Values in the range 0 to 10 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Long press emergency duration

Long press emergency duration (seconds) This parameter allows a user to configure the duration in seconds for the hold time required to capture a long press . This includes Emergency Buttons + Mode Buttons (Police, Fire, Medical, Disarmed, Home, Away)

Values in the range 2 to 5 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Long press number pad duration

Long press number pad duration (seconds) This parameter allows a user to configure the duration in seconds for the hold time required to capture a long press . This includes Number Pad + Check & X (0-9, Check, X)

Values in the range 2 to 5 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Proximity Display Timeout

Proximity Display Timeout : Timeout in seconds when proximity is detected and no input is received

Values in the range 0 to 30 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: Button Press Display Timeout

Button Press Display Timeout : Timeout in seconds when any button is pressed, but a sequence is not completed and buttons are no longer being pressed

Values in the range 0 to 30 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: Status Change Display Timeout

Status Change Display Timeout: Timeout in seconds when indicator command is received from the hub to change status

Values in the range 0 to 30 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Security Mode Brightness

Security Mode Brightness: Adjusts the brightness of the security mode buttons

Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: Key Backlight Brightness

Key Backlight Brightness: Adjusts the brightness of the keypad backlight. Used for Key Backlight LEDs only Available settings: 0-100%

Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: Ambient Light Sensor Level

Ambient Light Sensor Level: Light threshold where keypad will stop backlighting if higher than

Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.


### Parameter 15: Proximity On/OFF

Proximity On/OFF: Turn On and Off the Proximity Detection.

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 16: Ramp Time Config

Ramp Time Config: Ramp time in milliseconds to turn the LEDs on/off. Applies to all LEDs on the keypad

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_16_1``` and is of type ```INTEGER```.


### Parameter 17: Low Battery Threshold

Low Battery Threshold - The percentage level at which the display would turn on the yellow battery indicator (whenever the display is on).

Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```15```.

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 18: Languages Set

Languages Set: bit number in the languages supported bitmask to set

Values in the range 0 to 31 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_18_0``` and is of type ```INTEGER```.


### Parameter 19: Warn Battery Threshold

Warn Battery Threshold - The percentage level at which the display would turn on the red battery indicator (whenever the display is on)

Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_19_1``` and is of type ```INTEGER```.


### Parameter 20: Supervisory Report response time

The number of milliseconds waiting for a Supervisory Report response to a Supervisory Get encapsulated command from the device before attempting a retry

Values in the range 500 to 5000 may be set.

The manufacturer defined default value is ```1500```.

This parameter has the configuration ID ```config_20_2``` and is of type ```INTEGER```.


### Parameter 21: System Security Mode Display

System Security Mode Display: (Always, Sometimes, Never). 601 = Always On , 1 - 600 = periodic interval, 0 = Always

Values in the range 0 to 601 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_21_2``` and is of type ```INTEGER```.


### Parameter 22: Languages Supported (Get)

Languages Supported (Get): returns bitmask of languages supported. Bits set to 1 indicate that the language is supported

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_22_4``` and is of type ```INTEGER```.
This is a read only parameter.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Keypad 2nd Gen supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Controller Updates
1. Notification Report  
   a. See notification CC section for notifications that are sent

2. Entry Control Notification

3. Battery Report

4. Device Reset Locally Notification

Association group 1 supports 5 nodes.

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
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_INDICATOR_V3| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [devicemanual](https://opensmarthouse.org/zwavedatabase/1398/reference/Ring_Alarm_Keypad_Zwave_2nd_Gen.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1398).
