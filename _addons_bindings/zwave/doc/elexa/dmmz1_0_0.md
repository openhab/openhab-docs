---
layout: documentation
title: DMMZ1 - ZWave
---

{% include base.html %}

# DMMZ1 Dome Battery powered Z-Wave Plus enabled mousetrap
This describes the Z-Wave device *DMMZ1*, manufactured by *Elexa Consumer Products Inc.* with the thing type UID of ```elexa_dmmz1_00_000```.

The DMMZ1 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The DMMZ1 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour. The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/684) to improve the documentation.

## Channels

The following table summarises the channels available for the DMMZ1 -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Binary Sensor | sensor_binary | Door | Switch | 
| Alarm | alarm_general | Door | Switch | 
| Battery Level | battery-level | Battery | Number |

### Binary Sensor

Indicates if a sensor has triggered.

The ```sensor_binary``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Alarm

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

The following table provides a summary of the 5 configuration parameters available in the DMMZ1.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | BASIC_SET Level | Sets the value sent by the BASIC\_SET command to Association Group 2 |
| 2 | Set Firing Mode | This parameter sets the “firing mode” of the Mouser. |
| 3 | High Voltage Duration Time  | How long the Mouser will fire continuously before it starts to burst-fire |
| 4 | Enable/Disable LED Alarm | Enables or disables the indicator LED alarm when the trap is tripped |
| 5 | LED Alarm Duration | Sets the amount of time the LED Indicator blinks after the trap is tripped |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: BASIC_SET Level

Sets the value sent by the BASIC\_SET command to Association Group 2
This parameter sets the value sent by the BASIC\_SET command to Association Group 2 (for more information, see “Assocation Groups”.)

00 (0/Turn Off Device)

01 ~ 63 (0-99)

FF (255/Turn On Device)
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Set Firing Mode

This parameter sets the “firing mode” of the Mouser.
This parameter sets “firing mode” of the Mouser. Two firing modes are available: in the first (Continuous Fire,) electricity is passed continuously for the entire duration, and in the second (Burst Fire,) electricity is passed continuously only for the first minute and it is pulsed at approximately 400 beats per minute for the remainder of the time.

01 (Continuous Fire)

02 (Burst Fire)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Continuous Fire |
| 2 | Burst Fire |

The manufacturer defined default value is ```2``` (Burst Fire).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: High Voltage Duration Time 

How long the Mouser will fire continuously before it starts to burst-fire
This parameter defines how long the Mouser will fire continuously before it starts to burst-fire (see parameter 2.)

00 64 ~ 01 68 (100~360 in Seconds)
Values in the range 64 to 168 may be set.

The manufacturer defined default value is ```64```.

This parameter has the configuration ID ```config_3_2``` and is of type ```INTEGER```.


### Parameter 4: Enable/Disable LED Alarm

Enables or disables the indicator LED alarm when the trap is tripped
This parameter enables or disables the indicator LED alarm when the trap is tripped.

00 (LED Alarm Disabled)

01 (LED Alarm Enabled)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | LED Alarm Disabled |
| 1 | LED Alarm Enabled |

The manufacturer defined default value is ```1``` (LED Alarm Enabled).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: LED Alarm Duration

Sets the amount of time the LED Indicator blinks after the trap is tripped
This parameter sets the amount of time the LED Indicator blinks after the trap is tripped.

00 (LED Alarm Blinks Until Trap is Cleared)

01~FF (1~255 in Hours)
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.

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

The DMMZ1 supports 4 association groups.

### Group 1: Group 1


This group supports 5 nodes.

### Group 2: Group 2


This group supports 5 nodes.

### Group 3: Group 3


This group supports 5 nodes.

### Group 4: Group 4


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

* [Dome Mouser Advanced Manual](https://www.cd-jackson.com/zwave_device_uploads/684/Dome-Mouser-Advanced-Manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/684).
