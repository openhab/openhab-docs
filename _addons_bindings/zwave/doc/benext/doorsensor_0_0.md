---
layout: documentation
title: doorSensor - ZWave
---

{% include base.html %}

# doorSensor Door Sensor
This describes the Z-Wave device *doorSensor*, manufactured by *[BeNext](http://www.benext.eu/)* with the thing type UID of ```benext_doorsensor_00_000```.

The device is in the category of *Door*, defining Door sensors.

![doorSensor product image](https://www.cd-jackson.com/zwave_device_uploads/223/223_default.png)


The doorSensor supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The doorSensor does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

Basic operations

  * The Door Sensor can be placed on any door or window.
  * The Door Sensor can report the status of the door (OPEN/CLOSED).
  * The Door Sensor can measure the temperature.
  * The Door Sensor also has a screw connector for an external (dry) contact.
  * Indoor use only.

How it operates

After a successful inclusion the Door Sensor can be mounted on the wall or door/window. When opening the door the indicator light will blink shortly, this indicates that a z-wave message has been send successfully.

With a controller you can request the temperature and battery level.

### Inclusion Information

Press and hold the tamper switch for two seconds and release to start the inclusion or exclude process. 

### Exclusion Information

Press and hold the tamper switch for two seconds and release to start the inclusion or exclude process. 

### Wakeup Information

The doorSensor does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


It is possible to send a wake up notification on user interaction. To do this press and hold the tamper switch for 4 seconds.

## Channels

The following table summarises the channels available for the doorSensor -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Door Sensor | sensor_door | sensor_door | Door | Contact | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Alarm (CO) | alarm_co | alarm_co |  | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Door Sensor
Indicates if the door/window is open or closed.

The ```sensor_door``` channel is of type ```sensor_door``` and supports the ```Contact``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Contact``` item type -:

| Value | Label     |
|-------|-----------|
| OPEN | Open |
| CLOSED | Closed |

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Alarm (CO)
Indicates if the carbon monoxide alarm is triggered.

The ```alarm_co``` channel is of type ```alarm_co``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

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

The following table provides a summary of the 4 configuration parameters available in the doorSensor.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Reset to factory settings | Set all configuration values to default values (factory settings). |
| 2 | External contact behavior | Configure what the external contact sends when triggered. |
| 5 | Operating mode. | The main operating mode for the device. |
| 6 | Temperature offset | An offset for the temperature. |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: Reset to factory settings

Set all configuration values to default values (factory settings).

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: External contact behavior

Configure what the external contact sends when triggered.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Send alarm |
| 1 | Send basic frame |

The manufacturer defined default value is ```0``` (Send alarm).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 5: Operating mode.

The main operating mode for the device.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Normal |
| 2 | Mode 1 report |
| 3 | Always-on |

The manufacturer defined default value is ```1``` (Normal).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Temperature offset

An offset for the temperature.

Values in the range -32768 to 32767 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_6_2``` and is of type ```INTEGER```.

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

The doorSensor supports 2 association groups.

### Group 1: Send frame to (internal contact) nodes

Send frame to every node in this group (internal contact)

Association group 1 supports 5 nodes.

### Group 2: Send frame to external contact nodes

Send frame to every node in this group (external contact)

Association group 2 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SENSOR_MULTILEVEL_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/223/doorsensor.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/223).
