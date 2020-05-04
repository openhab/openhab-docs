---
layout: documentation
title: Motion Sensor - ZWave
---

{% include base.html %}

# Motion Sensor Motion Sensor
This describes the Z-Wave device *Motion Sensor*, manufactured by *Wink Inc.* with the thing type UID of ```wink_motionsensor_00_000```.

The device is in the category of *Motion Detector*, defining Motion sensors/detectors.

![Motion Sensor product image](https://www.cd-jackson.com/zwave_device_uploads/1243/1243_default.png)


The Motion Sensor supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The Motion Sensor does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

Magnetically mounted motion sensor

### Inclusion Information

Twist back of unit, then lift off. (Will be difficult due to strong mounting magnet.) Push connect button three times until unit blinks blue five times.

### Exclusion Information

Twist back of unit, then lift off. (Will be difficult due to strong mounting magnet.) Push connect button three times until unit blinks blue five times.

### Wakeup Information

The Motion Sensor does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


Twist back of unit, then lift off. (Will be difficult due to strong mounting magnet.) Push connect button three times and light will blink blue five times.

## Channels

The following table summarises the channels available for the Motion Sensor -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary |  | Switch | 
| Sensor (luminance) | sensor_luminance | sensor_luminance |  | Number | 
| Alarm | alarm_general | alarm_general | Alarm | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Binary Sensor
Indicates if a sensor has triggered.

The ```sensor_binary``` channel is of type ```sensor_binary``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Sensor (luminance)
Indicates the current light reading.

The ```sensor_luminance``` channel is of type ```sensor_luminance``` and supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

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

The following table provides a summary of the 10 configuration parameters available in the Motion Sensor.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Motion Sensitivity | Motion Sensitivity |
| 2 | Motion Cleared Time Delay | Motion Cleared Time Delay |
| 3 | Basic Set Level | Basic Set Level |
| 4 | Enable/Disable Motion Detection | Enable/Disable Motion Detection |
| 5 | Group 2 Ambient Light Threshold | Group 2 Ambient Light Threshold |
| 6 |  Retrigger Interval | Retrigger Interval |
| 7 | Light Sensing Interval | Light Sensing Interval |
| 8 | Enable/Disable Group 2 Ambient Light Threshold | Enable/Disable Group 2 Ambient Light Threshold |
| 9 | Ambient Light Sensitivity Level | Ambient Light Sensitivity Level |
| 10 | LED enable/disable | LED enable/disable |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: Motion Sensitivity

Motion Sensitivity
This parameter sets the sensitivity of the Motion Detector. It is a unitless parameter ranging in values from 8 up to 255, with 8 being the highest sensitivity level and 255 being the lowest.After physical installation, make sure the farthest part of the coverage area is still visible to the Motion Detector by adjusting this parameter
Values in the range 8 to 255 may be set.

The manufacturer defined default value is ```12```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Motion Cleared Time Delay

Motion Cleared Time Delay
This parameters sets (in seconds) the amount of time after a motion event before the Motion Detector reports no activity to the main controller (see Notification and Binary Sensor command classes for more information.) This also sets the amount of time before a BASIC_SET (00) command is sent to Association Group 2 to turn off any activated devices. This value must be higher than the value of Parameter 6, and if this parameter is reset to default settings, Parameter 6 will also be reset.
Values in the range 5 to 600 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 3: Basic Set Level

Basic Set Level
This parameter sets the value sent by the BASIC_SET command to Association Group 2
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Enable/Disable Motion Detection

Enable/Disable Motion Detection
This setting enables or disables motion detection.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Motion Detection Disabled |
| 1 | Motion Detection Enabled |

The manufacturer defined default value is ```1``` (Motion Detection Enabled).

This parameter has the configuration ID ```config_4_1_wo``` and is of type ```INTEGER```.
This is a write only parameter.


### Parameter 5: Group 2 Ambient Light Threshold

Group 2 Ambient Light Threshold
If Parameter 8 is enabled, this setting sets the light level (in lux) below which the Motion Detector will send BASIC_SET commands to Association Group 2 when motion is detected.
Values in the range 5 to 1000 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_5_2``` and is of type ```INTEGER```.


### Parameter 6:  Retrigger Interval

Retrigger Interval
After each motion event, the Motion Detector is disabled for the amount of time (in seconds) set by this parameter before it can send out another Motion Detected Notification Report/Binary Sensor Report.This value must be lower than the value of Parameter 2, and if this parameter is reset to default settings, Parameter 2 will also be reset.

Essentially, when motion is detected the sensor will send a motion event every X seconds to the controller, as controlled by this parameter. (When motion is not detected, it fires off one and is done.)
Values in the range 1 to 8 may be set.

The manufacturer defined default value is ```8```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Light Sensing Interval

Light Sensing Interval
This parameter sets the amount of time (in seconds) between each successive ambient light level reading that is sent. This value must be less than the Wakeup Interval Time (which is 43,200 seconds or 12 hours by default). This defaults to 180.
Values in the range 60 to 3600 may be set.

The manufacturer defined default value is ```180```.

This parameter has the configuration ID ```config_7_2``` and is of type ```INTEGER```.


### Parameter 8: Enable/Disable Group 2 Ambient Light Threshold

Enable/Disable Group 2 Ambient Light Threshold
If this parameter is enabled, the Motion Detector will only send Basic Set commands to Associon Group 2 if the ambient light level is below the value set in Parameter 05. For more information, see Group 2 on page 14.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Group 2 Ambient Light Threshold Disabled |
| 1 | Group 2 Ambient Light Threshold Enabled |

The manufacturer defined default value is ```0``` (Group 2 Ambient Light Threshold Disabled).

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Ambient Light Sensitivity Level

Ambient Light Sensitivity Level
This Parameter sets the minimum change in ambient light level (in lux) the Motion Detector must detect before a Multilevel Sensor Report is sent to the main controller.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: LED enable/disable

LED enable/disable
If this parameter is enabled, the LED INDICATOR will flash everytime there motion is detected.If this is disabled, the LED INDICATOR will not flash to indicate motion events.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | LED disabled |
| 1 | LED enabled |

The manufacturer defined default value is ```1``` (LED enabled).

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.

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

The Motion Sensor supports 4 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Group 1 is the Lifeline group, which can hold five devices.The Motion Detector sends this group a Notification Report and Binary Sensor Report whenever motion is detected and when it stops.It also sends a Multilevel Sensor Report incrementally based on time (see Param 7,) or when a relative change in light level is detected (see Param 9.) Finally, the Motion Detector sends this group Battery Reports and a Device Reset Locally notification to remove itself from the Z-Wave network.

Association group 1 supports 5 nodes.

### Group 2: BASIC_SET

The Motion Detector sends a BASIC_SET command to Association Group 2 to directly trigger devices (like a siren, chime, etc.) when motion is detected and when it stops.Optionally, the Motion Detector can be set to only send this when ambient light levels fall below a predetermined level (see Configuration Parameters 5 and 8.)See Configuration Parameters 2, 3, 5, and 8 for more details regarding Association Group 2.

Association group 2 supports 5 nodes.

### Group 3: Notification report

Group 3 supports up to 5 members and the Motion Detector sends it a NOTIFICATION_REPORT when motion is detected and when it stops

Association group 3 supports 5 nodes.

### Group 4: Sensor binary report

Group 4 supports up to 5 members and the Motion Detector sends it a SENSOR\_BINARY\_REPORT when motion is detected and when it stops.

Association group 4 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V2| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [Manual](https://www.cd-jackson.com/zwave_device_uploads/1243/wink-motion-sensor-manual.pdf)
* [Additional configuration information](https://www.cd-jackson.com/zwave_device_uploads/1243/wink-motion-sensor-european-manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1243).
