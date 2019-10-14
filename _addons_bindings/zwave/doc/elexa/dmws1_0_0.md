---
layout: documentation
title: DMWS1 - ZWave
---

{% include base.html %}

# DMWS1 Dome Leak Sensor
This describes the Z-Wave device *DMWS1*, manufactured by *Elexa Consumer Products Inc.* with the thing type UID of ```elexa_dmws1_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![DMWS1 product image](https://www.cd-jackson.com/zwave_device_uploads/651/651_default.jpg)


The DMWS1 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The DMWS1 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

The Dome Leak Sensor is a battery powered Z-Wave Plus device that can detect wetness and send a notification when it does so. The Leak Sensor consists of two parts—the “SENSOR ASSEMBLY,” and the optional “REMOTE SENSOR PROBE.” They both detect water similarly, using three visible “LEAD.” The moment water touches any of the LEAD, the device will beep and send a notification with its moisture status to its Z-Wave controller.

### Inclusion Information

Put controller in inclusion mode.

Remove cover from device, remove tab from battery (if present), and press button 3 times rapidly.

### Exclusion Information

Put controller in exclusion mode.

Remove cover from device and press button 3 times rapidly.

### Wakeup Information

The DMWS1 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


Remove cover from device, then press and hold the button for two seconds. The LED INDICATOR will flash once indicating successful wake up. If this doesn't wake up the device, try triple-clicking the button. This causes the device to emit a NIF frame, which the binding treats as a wake up.

## Channels

The following table summarises the channels available for the DMWS1 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary |  | Switch | 
| Alarm (flood) | alarm_flood | alarm_flood | Water | Switch | 
| Alarm (general) | alarm_general | alarm_general | Alarm | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Binary Sensor
The Leak Sensor also sends a Binary Sensor Report when a leak is detected or removed.  See below for the SENSOR\_BINARY\_REPORT parameters sent:  
Sensor Type: 06 (Water)  
Leak Detected Value: 0xFF  
Leak Removed Value: 0x00

Indicates if a sensor has triggered.

The ```sensor_binary``` channel is of type ```sensor_binary``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Alarm (flood)
Indicates if the flood alarm is triggered.

The ```alarm_flood``` channel is of type ```alarm_flood``` and supports the ```Switch``` item and is in the ```Water``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (general)
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
| 7 | Basic Set Level | The value sent by the BASIC_SET command to Association Group 2 |
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

The value sent by the BASIC_SET command to Association Group 2
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

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Group 1 is the “Lifeline” group, which can hold five members, typically including the main Z-Wave controller.  The Leak Sensor sends this group a Notification Report and a Binary Sensor Report when water is detected or removed.  It also sends this group a Battery Report in reponse to Battery Get commands and a Locally Reset Notification upon local reset.

Association group 1 supports 5 nodes.

### Group 2: Control

Group to receive BASIC_SET on leak change
The Leak Sensor sends a Basic Set command to Association Group 2 (or the Control Group) to directly trigger devices (like a light, chime, etc.) in response to a detected leak. Then, after the leak is no longer detected, a BASIC_SET(0x00) command is sent to reset the device (e.g. turn off the light.) The value of the Basic Set command (e.g. brightness of the lamp) is configured using configuration parameter 7. 

Association group 2 supports 5 nodes.

### Group 3: Notification

Group 3 supports up to 5 members and the Leak Sensor sends it a NOTIFICATION_REPORT when water is detected or removed

Association group 3 supports 5 nodes.

### Group 4: Sensor Binary 

Group 4 supports up to 5 members and the Leak Sensor sends it a SENSOR\_BINARY\_REPORT when water is detected or removed.

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

* [Operating Guide and ZWave command reference](https://www.cd-jackson.com/zwave_device_uploads/651/DMWS1-dome-z-leak-detector-operating-guide.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/651).
