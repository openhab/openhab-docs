---
layout: documentation
title: DWZWAVE2 - ZWave
---

{% include base.html %}

# DWZWAVE2 Z-Wave Door/Window Sensor
This describes the Z-Wave device *DWZWAVE2*, manufactured by *Ecolink* with the thing type UID of ```eco_dwzwave2_00_000```.

The device is in the category of *Door*, defining Door sensors.

![DWZWAVE2 product image](https://www.cd-jackson.com/zwave_device_uploads/138/138_default.jpg)


The DWZWAVE2 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The DWZWAVE2 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

  * Z-Wave enabled device which provides open/closed status
  * Transmits open/closed status
  * Reports tamper condition when cover is open

### Inclusion Information

  1. Remove the battery for at least 5 seconds,
  2. Reinstall the battery
  3. Replace the sensor cover

### Exclusion Information

Not provided

### Wakeup Information

The DWZWAVE2 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


Not provided

## Channels

The following table summarises the channels available for the DWZWAVE2 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Binary Sensor | sensor_door | sensor_door | Door | Contact | 
| Alarm | alarm_general | alarm_general | Alarm | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Binary Sensor
Indicates if the door/window is open or closed.

The ```sensor_door``` channel is of type ```sensor_door``` and supports the ```Contact``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Contact``` item type -:

| Value | Label     |
|-------|-----------|
| OPEN | Open |
| CLOSED | Closed |

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

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The DWZWAVE2 supports 2 association groups.

### Group 1: Group 1

Association Group 1
Association group one is intended for but not limited to controllers. All nodes whose Node ID that have been set in Association group one will receive all unsolicited Alarm Report frames, and Basic Report frames of 0x00 and 0xFF.  When a sensor such as a door or window sensor is opened/faulted, the sensor will send a Basic Report to nodes in Association group one and a Basic Set of 0xFF to Association group two. When the door or window is closed the sensor will send a Basic Report of 0x00 to only group one.

Association group 1 supports 5 nodes.

### Group 2: Group 2

Association Group 2
Association group two is intended for any device Ecolink Z-Wave Command Class Specification 2 that is controllable with a Basic Set of 0xFF such as lights, sirens, or chimes. When a sensor such as a door or window sensor is opened/faulted, the sensor will send a Basic Report to nodes in Association group one and a Basic Set of 0xFF to Association group two. When the door or window is closed the sensor will send a Basic Report of 0x00 to only group one. The Configuration command class can configure the sensor to send Basic Sets of 0x00 to nodes in group two (turning devices off).

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
| COMMAND_CLASS_ALARM_V2| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V2| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/138/Ecolink-DWZWAVE2-ECO-manual-rev1.pdf)
* [Technical Manual](https://www.cd-jackson.com/zwave_device_uploads/138/Advanced-Zwave-Configuration-v2.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/138).
