---
layout: documentation
title: Tag Reader 500 - ZWave
---

{% include base.html %}

# Tag Reader 500 WTRFID Mini Keypad
This describes the Z-Wave device *Tag Reader 500*, manufactured by *[BeNext](http://www.benext.eu/)* with the thing type UID of ```benext_tagreader500_00_000```.

The device is in the category of *Remote Control*, defining Any portable or hand-held device that controls the status of something, e.g. remote control, keyfob etc..

![Tag Reader 500 product image](https://www.cd-jackson.com/zwave_device_uploads/1122/1122_default.png)


The Tag Reader 500 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The Tag Reader 500 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

A Z-Wave security enabled entry control device. You can arm/disarm your house to home or away with the Tag Reader 500. With the use of a RFID tag or a numerical code the device can send an entry control message which can be handled by a supported gateway. In addition the Tag Reader supports the activation of scenes.

### Inclusion Information

  1. To include the Tag Reader 500 US press and hold the enter button for two seconds (indication LED blinks shortly). 
  2. Release the enter button now to start the inclusion (during the inclusion routine the indication LED willblink twice per second).

### Exclusion Information

  1. To exclude the Tag Reader 500 US press and hold the enter button for two seconds (indication LED blinks shortly). 
  2. Release the enter button now to start the exclusion (during the exclusion routine the indication LED willblink twice three times per 1,5 second).

### Wakeup Information

The Tag Reader 500 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


Press and hold the button for 7 seconds, the indication LED will go on for 1 full second.

## Channels

The following table summarises the channels available for the Tag Reader 500 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Alarm (access) | alarm_access | alarm_access | Door | Switch | 
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

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The following table provides a summary of the 7 configuration parameters available in the Tag Reader 500.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Set to Default | Set all configuration values to default values (factory settings) |
| 2 | Feedback time | the time the beep goes to off |
| 3 | Feedback time-out | waiting for the wake-up-no-more command |
| 4 | feedback beeps per second | Amount of beeps a second |
| 5 | Always awake mode | Always awake mode |
| 7 | Operation mode | Operation mode |
| 8 | Gateway confirmation | Gateway confirmation |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: Set to Default

Set all configuration values to default values (factory settings)
If the Value is set to 0xFF (255) this device will return to factory settings.
The following option values may be configured, in addition to values in the range 0 to 255 -:

| Value  | Description |
|--------|-------------|
| 255 | Reset to factory defaults |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Feedback time

the time the beep goes to off
0x00 = Off, 0xFF = endless
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```15```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Feedback time-out

waiting for the wake-up-no-more command
Too configure the time-out, waiting on the wakeup\_no\_more_information command before the error sound starts automatically. The error sound is set to 8 short beeps.

0x00 = off

0x01 – 0xFF: Value in seconds
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: feedback beeps per second

Amount of beeps a second
To set the amount of beeps per second, every beep is around 10ms.
Values in the range 0 to 5 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Always awake mode

Always awake mode
Mode 1 =  normal working mode

Mode 3 = z-wave chip is always on to be asked for information, for example version or manufacturer ID.

Any other value will be reported after a GET, but will be seen as a mode 1.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | normal operating mode. |
| 3 | Always awake mode |

The manufacturer defined default value is ```1``` (normal operating mode. ).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 7: Operation mode

Operation mode
  * 0x00: the RFID and Numeric codes are reported in gateway mode
  * 0x01 – 0xFF: the RFID and Numeric codes are reported in local mode
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Gateway mode |
| 1 | Local mode |

The manufacturer defined default value is ```0``` (Gateway mode).

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Gateway confirmation

Gateway confirmation
  * In gateway mode it is possible to let the gateway decide if the Tag Reader 500 can arm to home or away.
  * If gateway indication is disabled the Tag Reader 500 automatically assumes that it can arm and will wait for a user input of RFID TAG or numeric code. 
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Confirmation Disabled |
| 1 | Confirmation Enabled |

The manufacturer defined default value is ```0``` (Confirmation Disabled).

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.

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

The Tag Reader 500 supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_USER_CODE_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V2| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_INDICATOR_V2| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Manual](https://www.cd-jackson.com/zwave_device_uploads/1122/tagreader500.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1122).
