---
layout: documentation
title: Door/Window Sensor - ZWave
---

{% include base.html %}

# Door/Window Sensor Door/Window Sensor
This describes the Z-Wave device *Door/Window Sensor*, manufactured by *[Shenzhen Neo Electronics Co., Ltd](http://www.szneo.com/)* with the thing type UID of ```shenzhen_doorwindowsensor_00_000```.

The device is in the category of *Door*, defining Door sensors.

![Door/Window Sensor product image](https://www.cd-jackson.com/zwave_device_uploads/400/400_default.jpg)


The Door/Window Sensor supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The Door/Window Sensor does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour. The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.

## Overview

### Inclusion Information

1\. Remove the sensor cover.

2\. Make sure the sensor is powered.

3\. Set Z‐Wave controller or Z‐Wave gateway into inclusion mode (Refer to the controller or

gateway operating manual)

4\. Press the button three times within 1.5 second, the device will enter inclusion mode. And the

LED will flash on and off alternately five times.sor.

### Exclusion Information

1\. Remove the device cover.

2\. Make sure the sensor is powered.

3\. Set Z‐Wave controller or Z‐Wave gateway into exclusion mode (Refer to the controller or

gateway operating manual)

4\. Press the button three times within 1.5 second, the device will enter exclusion mode.

### Wakeup Information

You can press the button once to wake up the device and send wakeup notification to controller. If press successfully, the LED will blink one time.

The minimum wakeup interval is 300s (5 minutes)

The maximum wakeup interval is 16,777,200s (about 194 days)

Allowable min step among each wakeup interval is 60 seconds, such as 360s, 420s, 480s…

Note: The default value is 12 hours. This value is longer, the battery life is greater.

## Channels

The following table summarises the channels available for the Door/Window Sensor -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Door/Window Sensor | sensor_door | Door | Contact | 
| Alarm (access) | alarm_access | Door | Switch | 
| Battery Level | battery-level | Battery | Number |

### Door/Window Sensor

Indicates if the door/window is open or closed.

The ```sensor_door``` channel supports the ```Contact``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Contact``` item type -:

| Value | Label     |
|-------|-----------|
| OPEN | Open |
| CLOSED | Closed |

### Alarm (access)

Indicates if the access control alarm is triggered.

The ```alarm_access``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |

### Battery Level

Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```battery-level``` channel supports the ```Number``` item and is in the ```Battery``` category.



## Device Configuration

The following table provides a summary of the 2 configuration parameters available in the Door/Window Sensor.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | ON/OFF Delay | Adjust the delay before the OFF command is transmitted. 0 means send OFF command immediately. |
| 2 | Basic Set Level | Basic Set Command will be sent when the door/window is opened or closed, the receiver will take it for consideration; for instance, if a lamp module received the BSC of which value is decisive as to how bright of dim level of lamp module shall be. |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: ON/OFF Delay

Adjust the delay before the OFF command is transmitted. 0 means send OFF command immediately.

Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_1_2``` and is of type ```INTEGER```.


### Parameter 2: Basic Set Level

Basic Set Command will be sent when the door/window is opened or closed, the receiver will take it for consideration; for instance, if a lamp module received the BSC of which value is decisive as to how bright of dim level of lamp module shall be.
Available Settings:

 0 - Off, Alarm cancelling or turning a device OFF

1 - 99 or 255 – ON (Binary Switch Device)

 Dim Level (Multilevel Switch Device)
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

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

### Group 1: Group 1

Is assigned to the device status - OPEN/CLOSED.
This group supports 1 nodes.

### Group 2: Group 2

Sending control commands to associated devices. This association group is configured through the advanced parameters no. 1 and 2.
This group supports 5 nodes.

### Group 3: Group 3

Send Notification to associated devices.
This group supports 5 nodes.

### Group 4: Group 4

Send Notification to associated devices.
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
| COMMAND_CLASS_ALARM_V3| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [ Instruction Manual Door/Window Sensor](https://www.cd-jackson.com/zwave_device_uploads/400/Manual-for-Door-sensor-Z-wave-Neo.pdf)
* [Door/Window User Guide](https://www.cd-jackson.com/zwave_device_uploads/400/Door-Window-User-Guide.pdf)
* [Door/Window User Guide - Version from 23.09.2016](https://www.cd-jackson.com/zwave_device_uploads/400/Door-Window-User-Guide.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/400).
