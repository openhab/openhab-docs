---
layout: documentation
title: Flood sensor - ZWave
---

{% include base.html %}

# Flood sensor Flood/water sensor
This describes the Z-Wave device *Flood sensor*, manufactured by *[Shenzhen Neo Electronics Co., Ltd](http://www.szneo.com/)* with the thing type UID of ```shenzhen_floodsensor_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![Flood sensor product image](https://www.cd-jackson.com/zwave_device_uploads/493/493_default.jpg)


The Flood sensor supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The Flood sensor does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour. The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.

## Overview

Flood/Water detection

### Inclusion Information

1\. Remove the sensor cover.

2\. Make sure the sensor is powered.

3\. Set Z‐Wave controller or Z‐Wave gateway into inclusion mode (Refer to the controller or gateway operating manual)

4\. Press the button three times within 1.5 second, the device will enter inclusion mode. And the LED will flash on and off alternately five times..

### Exclusion Information

1\. Remove the device cover.

2\. Make sure the sensor is powered.

3\. Set Z‐Wave controller or Z‐Wave gateway into exclusion mode (Refer to the controller or gateway operating manual)

4\. Press the button three times within 1.5 second, the device will enter exclusion mode.

### Wakeup Information

You can press the button once to wake up the device and send wakeup notification to controller.

If press successfully, the LED will blink one time.

The minimum wakeup interval is 300s

The maximum wakeup interval is 16,777,200s (about 194 days)

Allowable interval among each wakeup interval is 60 second, such as 360, 420, 480…

Note: The default value is 12 hours. This value is longer, the battery life is greater.

## Channels

The following table summarises the channels available for the Flood sensor -:

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

The following table provides a summary of the 2 configuration parameters available in the Flood sensor.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Basic setting command | Basic setting command to be transmitted |
| 2 | OFF delay | The amount of delay before the OFF command is transmitted |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: Basic setting command

Basic setting command to be transmitted
When the water sensor trigger alarm, it will send basic setting with these parameters. The receiver will execute this parameters. For example when the lamp receive the basic setting command, the parameters decide the brightness of the lamp.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | OFF |
| 1 | Dim level (lower bound) (multilevel switch) |
| 99 | Dim level (upper bound) (multilevel switch) |
| 255 | ON (Binary switch) |

The manufacturer defined default value is ```99``` (Dim level (upper bound) (multilevel switch)).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: OFF delay

The amount of delay before the OFF command is transmitted
Adjust the amount of delay before the OFF command is transmitted
Values in the range 1 to 65535 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.

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

The Flood sensor supports 4 association groups.

### Group 1: Device status

Sends the BASIC SET control frame when the probe detects water
This group supports 5 nodes.

### Group 2: Controller updates


This group supports 1 nodes.

### Group 3: Send Notification Report

Allows sending notification reports
This group supports 5 nodes.

### Group 4: Send Basic Report

Allows sending basic reports
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
| COMMAND_CLASS_ZWAVEPLUS_INFO_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V2| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [Shenzhen Watersensor Manual](https://www.cd-jackson.com/zwave_device_uploads/493/Shenzhen-NEO-watersensor-Z-wave.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/493).
