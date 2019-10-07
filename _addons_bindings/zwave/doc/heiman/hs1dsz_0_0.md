---
layout: documentation
title: HS1DS-Z - ZWave
---

{% include base.html %}

# HS1DS-Z Smart Door Sensor
This describes the Z-Wave device *HS1DS-Z*, manufactured by *[Heiman Technology Co. Ltd](http://www.heimantech.com/)* with the thing type UID of ```heiman_hs1dsz_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![HS1DS-Z product image](https://www.cd-jackson.com/zwave_device_uploads/551/551_default.png)


The HS1DS-Z supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The HS1DS-Z does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

Door/Window Contact.

Same hardware as DOMUX DX1DS-Z.

### Inclusion Information

  * Press a Func_Button 3 time in HS1DS-Z (Door Sensor), Green LED is Blinking 3 times within 1 second.
  * If Inclusion Process is successful, Green led will turn off. 

### Exclusion Information

  * Press a Func_Button 3 times quickly on HS1DS-Z.
  * If Exclusion Process is successful, Green led is Blinking 6 times, then turn off the HS1DS-Z.

### Wakeup Information

The HS1DS-Z does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


  * Wake up Notification is transmitted every 24 hours by default.
  * Wake up Notification is transmitted after Notification Report is Transmitted.

## Channels

The following table summarises the channels available for the HS1DS-Z -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Binary Sensor  [Deprecated]| sensor_binary | sensor_binary |  | Switch | 
| Tamper Alarm | alarm_tamper | alarm_tamper |  | Switch | 
| Door Sensor | sensor_door | sensor_door | Door | Contact | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Binary Sensor [Deprecated]
Indicates if a sensor has triggered.

The ```sensor_binary``` channel is of type ```sensor_binary``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

**Note:** This channel is marked as deprecated so should not be used.

### Tamper Alarm
Indicates if the tamper alarm is triggered.

The ```alarm_tamper``` channel is of type ```alarm_tamper``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

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

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The HS1DS-Z supports 5 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 5 nodes.

### Group 2: Binary Door status change

Description: Binary Sensor Command Classes:Compatible with 300 series  
1-Binary Sensor reports status of open or close door via Lifeline.  
2-When the sensor detects status change between close door and open door, the device will be triggered.

Association group 2 supports 5 nodes.

### Group 3: Binary Tamper

Description: Binary Sensor Command Classes:Compatible with 300 series  
1-Binary Sensor reports the removed status of door sensor.  
2-When the sensor detects status change of tamper, the device will be triggered.

Association group 3 supports 5 nodes.

### Group 4: Notification Door status change

1-Notification report open door or close status via Lifeline.  
2- When the sensor detects status change between close door and open door, the device will be triggered

Association group 4 supports 5 nodes.

### Group 5: Notification Tamper

1-Binary Sensor reports the removed status of door sensor.  
2- When the sensor detects status change of tamper, the device will be triggered

Association group 5 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V2| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ALARM_V4| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [Device manual](https://www.cd-jackson.com/zwave_device_uploads/551/HSIDS-Z.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/551).
