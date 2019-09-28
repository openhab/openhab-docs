---
layout: documentation
title: DMWD1 - ZWave
---

{% include base.html %}

# DMWD1 Dome door & window sensor
This describes the Z-Wave device *DMWD1*, manufactured by *Elexa Consumer Products Inc.* with the thing type UID of ```elexa_dmwd1_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![DMWD1 product image](https://www.cd-jackson.com/zwave_device_uploads/608/608_default.jpg)


The DMWD1 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The DMWD1 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

The Dome Door/Window Sensor is a battery powered Z-Wave Plus magnetic reed switch that can monitor the status of doors, windows, and anything else that opens and closes.

The Door/Window Sensor consists of two parts - the “sensor,” and the “magnet.” The sensor has a “reed switch” inside, which is sensitive to the magnet’s presence when aligned properly and within the defined distance. When the sensor and magnet are brought together or pulled apart, the sensor will report its open/close status to its Z-Wave controller.

### Inclusion Information

The Door/Window Sensor should be within 10’ of your Z-Wave controller for the inclusion process. After successful pairing, the device can be brought to the desired location.

  * Remove the SENSOR COVER.
  * Remove the BATTERY TAB.
  * Press the BUTTON quickly 3 times in a row.

A red LED will flash five times indicating inclusion

### Exclusion Information

Follow the instructions for your Z-Wave Certified Controller enter exclusion mode. When prompted by the controller:

  * Remove the SENSOR COVER.
  * Press the BUTTON button quickly 3 times in a row.

A red LED will flash five times indicating exclusion/disconnection.

### Wakeup Information

The DMWD1 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


Press and hold the BUTTON for two seconds. The LED INDICATOR will flash once indicating successful wake up.

## Channels

The following table summarises the channels available for the DMWD1 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary |  | Switch | 
| Alarm (access) | alarm_access | alarm_access | Door | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Binary Sensor
Indicates if a sensor has triggered.

The ```sensor_binary``` channel is of type ```sensor_binary``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

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

The following table provides a summary of the 2 configuration parameters available in the DMWD1.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | BASIC_SET Off Delay | The delay time from when the Door/Window Sensor sends the BASIC_SET command. |
| 2 | BASIC_SET Level | Sets the value sent by the BASIC_SET command to Association Group 2 |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: BASIC_SET Off Delay

The delay time from when the Door/Window Sensor sends the BASIC_SET command.
The delay time from when the Door/Window Sensor sends the BASIC\_SET command to Association Group 2 and when the BASIC\_SET(0) is sent. It accepts a value up to 65,535, in seconds.
Values in the range 1 to 65535 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_1_2``` and is of type ```INTEGER```.


### Parameter 2: BASIC_SET Level

Sets the value sent by the BASIC_SET command to Association Group 2

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | 0/Turn Off Device |
| 255 | Turn On Device |

The manufacturer defined default value is ```255``` (Turn On Device).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.

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

The DMWD1 supports 4 association groups.

### Group 1: Group 1

Group 1 is the “Lifeline” group, which can hold five members, typically including the main Z-Wave controller. The Door/Window Sensor sends this group a Notification Report and a Binary Sensor Report when it is opened or closed. It also sends this group a Battery Report in response to Battery Get commands.

Association group 1 supports 5 nodes.

### Group 2: Group 2 

The Door/Window Sensor sends a Basic Set command to Association Group 2 (or the Control Group) to directly trigger devices (like a light, chime, etc.) in response to events. Then, after a preset delay, a BASIC_ SET(00) command is sent to reset the device (e.g. turn off the light.) The value of the Basic Set command (e.g. brightness of the lamp,) and the delay time before the BASIC_SET(00) is sent is configured using configuration parameters 1 and 2 respectively. 

Association group 2 supports 5 nodes.

### Group 3: Group 3

Group 3 supports up to 5 members and the Door/Window Sensor sends it a NOTIFICATION_REPORT when the door either opens or closes.

Association group 3 supports 5 nodes.

### Group 4: Group 4

Group 4 supports up to 5 members and the Door/Window Sensor sends it a SENSOR\_BINARY\_REPORT when the door either opens or closes

Association group 4 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V2| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [Advanced Manual](https://www.cd-jackson.com/zwave_device_uploads/608/dome-z-wave-plus-door-window-sensor-dmwd1-advanced-manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/608).
