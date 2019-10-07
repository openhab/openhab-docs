---
layout: documentation
title: MINI KEYPAD RFID - ZWave
---

{% include base.html %}

# MINI KEYPAD RFID Keypad with alarm activation rfid tag
This describes the Z-Wave device *MINI KEYPAD RFID*, manufactured by *[Zipato](http://www.zipato.com/)* with the thing type UID of ```zipato_keypad_00_000```.

The device is in the category of *Remote Control*, defining Any portable or hand-held device that controls the status of something, e.g. remote control, keyfob etc..

![MINI KEYPAD RFID product image](https://www.cd-jackson.com/zwave_device_uploads/410/410_default.png)


The MINI KEYPAD RFID supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The MINI KEYPAD RFID does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

Place the Tag Reader close to the main exit of your office or home to enjoy it’s full potential.

With the Tag Reader you can activate or de-activate your security by simply passing the RFID Tag in front of the reader. It is called a Tag Reader because it uses RFID Tags to identify people and their personal preferences around leaving the house or coming home.

Separately from working with RFID Tags, the Tag Reader also has a numerical keypad. Within the free of charge online manager you can configure a numerical code. This way you prevent being locked out of the system in case you may have lost the RFID Tag.

By using the Tag Reader intelligently you can secure your house and save money on your energy bill at the same time. You can actually let your house ‘fall asleep’ when enabling the ‘Away Scene’. This is especially noted when u are using energy saving products of BeNext such as Radiator Control and of course a Energy Switch.

### Inclusion Information

Press and hold the tamper for 1 seconds and release to start the inclusion/exclusion process.

### Exclusion Information

Press and hold the tamper for 1 seconds and release to start the inclusion/exclusion process.

### Wakeup Information

The MINI KEYPAD RFID does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


Tap a button. The always awake mode can be activated by: CONFIGURATION_SET / Parameter: 0x05 / Size: 0x01 (can’t be different from 1) / Value: 0x03 (mode 3)

### General Usage Information

Some link

http://www.openzwave.com/device-database/0097%3A4501%3A6131

http://www.fhemwiki.de/wiki/Z-Wave-ZIP\_WT-RFID\_Keypad

HASH DEVICE 0097:4501:6131

## Channels

The following table summarises the channels available for the MINI KEYPAD RFID -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Alarm (access) | alarm_access | alarm_access | Door | Switch | 
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Alarm (access)
Indicates if the access control alarm is triggered.

The ```alarm_access``` channel is of type ```alarm_access``` and supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

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

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The following table provides a summary of the 5 configuration parameters available in the MINI KEYPAD RFID.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Set to default | Set all configuration to factory settings |
| 2 | Feedback time | To configure the time the beep is automatically turned off in seconds. |
| 3 | Feedback timeout | Timeout beep |
| 4 | Feedback beeps per second | To configure the number of beeps per second. Every beep is fixed about 10ms. |
| 5 | The mode | Operating mode |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: Set to default

Set all configuration to factory settings

The following option values may be configured, in addition to values in the range -128 to 127 -:

| Value  | Description |
|--------|-------------|
| -1 | Reset to default factory |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Feedback time

To configure the time the beep is automatically turned off in seconds.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| -1 | Endless |
| 0 | Disabled |

The manufacturer defined default value is ```15```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Feedback timeout

Timeout beep
To configure the timeout to wait for a WAKEUP\_NO\_MORE_INFORMATION before the error beep is automatically sound. The error beep are fixed 8 beeps shortly after each other.
Values in the range -128 to 127 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Feedback beeps per second

To configure the number of beeps per second. Every beep is fixed about 10ms.

Values in the range -128 to 127 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: The mode

Operating mode
1   ->   Normal operating mode 3   ->   Z‐Wave chip is always on to request e.g. version or manufacturer id. 2   ->   If any mode other then 3, that value will be reported after a get but will be handled in SW as mode 1. 4 - 127   ->   If any mode other then 3, that value will be reported after a get but will be handled in SW as mode 1.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Normal operating mode |
| 2 | Normal operating mode (like 1) |
| 3 | Z‐Wave chip is always on to request |

The manufacturer defined default value is ```1``` (Normal operating mode).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.

### Wakeup Interval

The wakeup interval sets the period at which the device will listen for messages from the controller. This is required for battery devices that sleep most of the time in order to conserve battery life. The device will wake up at this interval and send a message to the controller to tell it that it can accept messages - after a few seconds, it will go back to sleep if there is no further communications. 

This setting is defined in *seconds*. It is advisable not to set this interval too short or it could impact battery life. A period of 1 hour (3600 seconds) is suitable in most instances.

Note that this setting does not affect the devices ability to send sensor data, or notification events.

This parameter has the configuration ID ```wakeup_interval``` and is of type ```INTEGER```.

### Wakeup Node

When sleeping devices wake up, they send a notification to a listening device. Normally, this device is the network controller, and normally the controller will set this automatically to its own address.
In the event that the network contains multiple controllers, it may be necessary to configure this to a node that is not the main controller. This is an advanced setting and should not be changed without a full understanding of the impact.

This parameter has the configuration ID ```wakeup_node``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The MINI KEYPAD RFID supports 1 association group.

### Group 1: Association

The Association Command Class is used to associate the TagReader to other devices. When a tag or code is read, the TagReader will send a notification to the Z‐Wave devices in its association group. It will also report the state of the tamper alarm to the

Association group 1 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_USER_CODE_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V2| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/410/wt-rfid-Zipato-Mini-Keypad-RFiD-Z-Wave-User-Manual-v1-4.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/410).
