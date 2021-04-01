---
layout: documentation
title: Door/Window Sensor - ZWave
---

{% include base.html %}

# Door/Window Sensor Wink D/W Sensor
This describes the Z-Wave device *Door/Window Sensor*, manufactured by *Wink Inc.* with the thing type UID of ```wink_doorwinsensor_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![Door/Window Sensor product image](https://opensmarthouse.org/zwavedatabase/1294/image/)


The Door/Window Sensor supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The Door/Window Sensor does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

Reed Switch Type Door/Window Sensor. Unobtrusive styling. White.

### Inclusion Information

Including/Connecting to a Z-Wave Network 

Follow the instructions for your Z-Wave certifed Controller to enter inclusion mode. When prompted by the Controller:

  1. Bring the door/window sensor to within 10 feet of your controller. After inclusion, the device can be moved to any desired location.
  2. If connecting a new sensor, remove the battery tab. Press the sensor cover release tab to remove the sensor body cover, and make sure the battery is installed correctly.
  3. Press the Connect Button quickly 3 times in a row.
  4. The LED indicator will flash five times to indicate inclusion

### Exclusion Information

Excluding/Disconnecting from the Z-Wave Network:

Follow the instructions for your Z-Wave certified Controller to enter exclusion mode. 

When prompted by the Controller:

  1. Press the sensor cover release button to remove the top cover, and be sure it is powered on.
  2. Press the Connect Button next to the battery quickly 3 times in a row.

The LED indicator will flash five times indicating exclusion/disconnection

### Wakeup Information

The Door/Window Sensor does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


Press the Connect Button next to the battery quickly 3 times in a row.

### General Usage Information

Resetting the Door/Window Sensor to Factory Default

Settings: 

To disconnect from the Z-Wave Network and restore factory default settings:

  1. Press the sensor cover release button to remove the top cover, and be sure it is powered on.
  2. Hold the Connect Button next to the battery for 10 seconds until the LED indicator blinks once, then release the button

## Channels

The following table summarises the channels available for the Door/Window Sensor -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary |  | Switch | 
| Door Sensor | sensor_door | sensor_door | Door | Contact | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Binary Sensor
Indicates if a sensor has triggered.

The ```sensor_binary``` channel is of type ```sensor_binary``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Door Sensor
Indicates if the door/window is open or closed.

The ```sensor_door``` channel is of type ```sensor_door``` and supports the ```Contact``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Contact``` item type -:

| Value | Label     |
|-------|-----------|
| OPEN | Open |
| CLOSED | Closed |

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The following table provides a summary of the 2 configuration parameters available in the Door/Window Sensor.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Lamp Brightness | Brightness lamp should be set to when triggered |
| 2 | Lamp Delay | Delay before reseting triggered device |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: Lamp Brightness

Brightness lamp should be set to when triggered
BASIC_SET(0x00) command is sent to reset the device (e.g. turn off the light.) 

The value of the Basic Set command (e.g. brightness of the lamp,) and the delay time before the BASIC_SET(0x00) is sent is configured using configuration parameters 1 and 2 respectively.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Lamp Delay

Delay before reseting triggered device
The Door/Window Sensor sends a Basic Set command to association Group 2 (or the Control Group) to directly trigger devices (like a light, chime, etc.) in response to events. 

Then, after a preset delay, a BASIC_SET(0x00) command is sent to reset the device (e.g. turn off the light.) 

The value of the Basic Set command (e.g. brightness of the lamp,) and the delay time before the BASIC_SET(0x00) is sent is configured

using configuration parameters 1 and 2 respectively.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```60```.

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

The Door/Window Sensor supports 4 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Lifeline


Association group 1 supports 5 nodes.

### Group 2: Control

Directly triggers devices in response to events
The Door/Window Sensor sends a Basic Set command to association Group 2 (or the Control Group) to directly trigger devices (like a light, chime, etc.) in response to events. 

Then, after a preset delay, a BASIC\_SET(0x00) command is sent to reset the device (e.g. turn off the light.) The value of the Basic Set command (e.g. brightness of the lamp,) and the delay time before the BASIC\_SET(0x00) is sent is configured using configuration parameters 1 and 2 respectively.

Association group 2 supports 5 nodes.

### Group 3: Notification

Reports when door open/closes
Group 3 supports up to 5 members and the Door/Window Sensor sends it a NOTIFICATION_REPORT when

the door either opens or closes

Association group 3 supports 5 nodes.

### Group 4: Binary Sensor

Reports binary sensor when door opens
Group 4 supports up to 5 members and the Door/Window Sensor sends it a SENSOR\_BINARY\_REPORT when the door either opens or closes.

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

* [User Manual](https://opensmarthouse.org/zwavedatabase/1294/reference/Wink-Door-Sensor-Manual.pdf)
* [Z-Wave Protocol Implementation Conformance Statement](https://opensmarthouse.org/zwavedatabase/1294/reference/ZC10-17075685.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1294).
