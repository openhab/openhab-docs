---
layout: documentation
title: TILTZWAVE2 - ZWave
---

{% include base.html %}

# TILTZWAVE2 Z-Wave Garage Door Sensor
This describes the Z-Wave device *TILTZWAVE2*, manufactured by *Ecolink* with the thing type UID of ```eco_tiltzwave2_00_000```.

The device is in the category of *Garage Door*, defining Garage Door.

![TILTZWAVE2 product image](https://www.cd-jackson.com/zwave_device_uploads/139/139_default.jpg)


The TILTZWAVE2 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The TILTZWAVE2 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

Sensor which transmits when  a garage door is open or closed. Uses a tilt sensor to detect the angle of a door and transmits open/closed status. Reports tamper condition if cover is removed.

### Inclusion Information

Put controller into inclusion mode, remove the cover, remove the battery for 5 seconds, reinsert the battery, close the cover.

### Exclusion Information

Put controller into exclusion mode, remove the cover, remove the battery for 5 seconds, reinsert the battery, close the cover.

### Wakeup Information

The TILTZWAVE2 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


Remove the cover, close the cover.

## Channels

The following table summarises the channels available for the TILTZWAVE2 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Tamper Alarm | alarm_tamper | alarm_tamper |  | Switch | 
| Door State  [Deprecated]| sensor_door | sensor_door | Door | Contact | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Tamper Alarm
Indicates if the tamper alarm is triggered.

The ```alarm_tamper``` channel is of type ```alarm_tamper``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Door State [Deprecated]
Indicates if the door/window is open or closed.

The ```sensor_door``` channel is of type ```sensor_door``` and supports the ```Contact``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Contact``` item type -:

| Value | Label     |
|-------|-----------|
| OPEN | Open |
| CLOSED | Closed |

**Note:** This channel is marked as deprecated so should not be used.

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The following table provides a summary of the 2 configuration parameters available in the TILTZWAVE2.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Group 2 BASIC SET | Group 2 BASIC SET |
| 2 | Sensor Binary Reports | Sensor Binary Reports |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: Group 2 BASIC SET

Group 2 BASIC SET

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Not sent |
| 255 | Sent |

The manufacturer defined default value is ```0``` (Not sent).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Sensor Binary Reports

Sensor Binary Reports

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Sent |
| 255 | Not sent |

The manufacturer defined default value is ```0``` (Sent).

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

The TILTZWAVE2 supports 2 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 5 nodes.

### Group 2: Group 2


Association group 2 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [English User Manual](https://www.cd-jackson.com/zwave_device_uploads/139/Ecolink-TILTZWAVE2-ECO-manual-rev1.pdf)
* [Updated Manual](https://www.cd-jackson.com/zwave_device_uploads/139/Tilt-ZWave-Plus-Manual-R1-04-021816kgs.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/139).
