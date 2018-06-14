---
layout: documentation
title: DMWS1 - ZWave
---

{% include base.html %}

# DMWS1 Dome Leak Sensor
This describes the Z-Wave device *DMWS1*, manufactured by *Elexa Consumer Products Inc.* with the thing type UID of ```elexa_dmws1_00_000```.

![DMWS1 product image](https://www.cd-jackson.com/zwave_device_uploads/651/651_default.jpg)


The DMWS1 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The DMWS1 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour. The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/651) to improve the documentation.

## Channels

The following table summarises the channels available for the DMWS1 -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Binary Sensor | sensor_binary | Door | Switch | 
| Alarm (flood) | alarm_flood | Door | Switch | 
| Alarm (general) | alarm_general | Door | Switch | 
| Battery Level | battery-level | Battery | Number |

### Binary Sensor

The Leak Sensor also sends a Binary Sensor Report when a leak is detected or removed. See below for the SENSOR\_BINARY\_REPORT parameters sent:  
Sensor Type: 06 (Water)  
Leak Detected Value: 0xFF  
Leak Removed Value: 0x00

Indicates if a sensor has triggered.

The ```sensor_binary``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Alarm (flood)

Indicates if the flood alarm is triggered.

The ```alarm_flood``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |

### Alarm (general)

Indicates if an alarm is triggered.

The ```alarm_general``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |

### Battery Level

Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```battery-level``` channel supports the ```Number``` item and is in the ```Battery``` category.



## Device Configuration

The following table provides a summary of the 7 configuration parameters available in the DMWS1.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Total Alarm Duration | Total time the Leak Sensor will beep and light its LED in the event of a leak |
| 2 | Mute Time | Quiet time between each Reminder Alarm |
| 3 | Initial Alarm | Time the Leak Sensor beeps before it is muted |
| 4 | Reminder Alarm | Length of each beep after the Initial Alarm |
| 5 | Enable/Disable Audible Alarm | Enables or disables the audible alarm (“beeping”) |
| 6 | Enable/Disable Water Detection | If disabled, the device will not respond in any way to detected leaks. |
| 7 | Basic Set Level | The value sent by the BASIC\_SET command to Association Group 2 |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: Total Alarm Duration

Total time the Leak Sensor will beep and light its LED in the event of a leak
0: Leak Sensor beeps until water is removed

1-255: 1-255 minutes
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```120```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Mute Time

Quiet time between each Reminder Alarm

Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Initial Alarm

Time the Leak Sensor beeps before it is muted

Values in the range 10 to 255 may be set.

The manufacturer defined default value is ```60```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Reminder Alarm

Length of each beep after the Initial Alarm

Values in the range 5 to 255 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Enable/Disable Audible Alarm

Enables or disables the audible alarm (“beeping”)

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Audible Alarm Disabled |
| 1 | Audible Alarm Enabled |

The manufacturer defined default value is ```1``` (Audible Alarm Enabled).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Enable/Disable Water Detection

If disabled, the device will not respond in any way to detected leaks.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Water Detection Disabled |
| 1 | Water Detection Enabled |

The manufacturer defined default value is ```1``` (Water Detection Enabled).

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Basic Set Level

The value sent by the BASIC\_SET command to Association Group 2
Determines the value to be sent in the Basic Set command to Association Group 2 when a leak is detected
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.

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

The DMWS1 supports 4 association groups.

### Group 1: Lifeline


This group supports 5 nodes.

### Group 2: Control

Group to receive BASIC\_SET on leak change
This group supports 5 nodes.

### Group 3: Notification


This group supports 5 nodes.

### Group 4: Sensor Binary 


This group supports 5 nodes.

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

* [Operating Guide and ZWave command reference](https://www.cd-jackson.com/zwave_device_uploads/651/DMWS1-dome-z-leak-detector-operating-guide.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/651).
