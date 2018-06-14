---
layout: documentation
title: HKZW_MS02 - ZWave
---

{% include base.html %}

# HKZW\_MS02 Motion Sensor
This describes the Z-Wave device *HKZW_MS02*, manufactured by *[Hank](http://www.hank-tech.com/)* with the thing type UID of ```hank_hkzwms02_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

The HKZW_MS02 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/676) to improve the documentation.

## Channels

The following table summarises the channels available for the HKZW_MS02 -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Alarm (burglar) | alarm_burglar | Door | Switch | 
| Battery Level | battery-level | Battery | Number |

### Alarm (burglar)

Indicates if the burglar alarm is triggered.

The ```alarm_burglar``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |

### Battery Level

Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```battery-level``` channel supports the ```Number``` item and is in the ```Battery``` category.



## Device Configuration

The following table provides a summary of the 5 configuration parameters available in the HKZW_MS02.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 12 | Motion Sensor`s Sensitivity | The higher the value,the more sensitive the PIR sensor |
| 14 | Enable/Disable Basic Set Command | The motion Sensor can reverse its value of BASIC SET when motion is triggered |
| 15 | value of basic set command | assigned to send Basic Set Command |
| 17 | enable/disable shock alarm |  |
| 32 | Level of low battery | Define a battery level ad the "low battery" |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 12: Motion Sensor`s Sensitivity

The higher the value,the more sensitive the PIR sensor

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | 0 |
| 1 | 1 |
| 2 | 2 |

The manufacturer defined default value is ```8```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 14: Enable/Disable Basic Set Command

The motion Sensor can reverse its value of BASIC SET when motion is triggered

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable |
| 1 | enable |

The manufacturer defined default value is ```0``` (Disable).

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.


### Parameter 15: value of basic set command

assigned to send Basic Set Command

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable |
| 1 | Enable |

The manufacturer defined default value is ```0``` (Disable).

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 17: enable/disable shock alarm



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable |
| 1 | enable |

The manufacturer defined default value is ```0``` (Disable).

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 32: Level of low battery

Define a battery level ad the "low battery"

Values in the range 10 to 50 may be set.

The manufacturer defined default value is ```20```.

This parameter has the configuration ID ```config_32_1``` and is of type ```INTEGER```.

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

The HKZW_MS02 supports 2 association groups.

### Group 1: report the motion detection and battery level


This group supports 5 nodes.

### Group 2: assigned to send BASIC SET command


This group supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V5| Linked to BASIC|
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/676).
