---
layout: documentation
title: NAS-DS01Z - ZWave
---

{% include base.html %}

# NAS-DS01Z Door/Window Sensor
This describes the Z-Wave device *NAS-DS01Z*, manufactured by *[Shenzhen Neo Electronics Co., Ltd](http://www.szneo.com/)* with the thing type UID of ```shenzhen_nasds01z_00_000```.

The device is in the category of *Door*, defining Door sensors.

![NAS-DS01Z product image](https://www.cd-jackson.com/zwave_device_uploads/400/400_default.jpg)


The NAS-DS01Z supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The NAS-DS01Z does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

The NEO Coolcam Door/Window Sensor provides information whether a door or window is opened or closed.  
The battery operated sensor consits of the main unit and a magnetic element. The main unit should be installed on the frame and the magnetic element is placed on the door or window.

Technical parameters:

  * Power: CR14250 x1
  * Standby current: 1uA
  * Battery life: 10 years
  * Radio Protocol: Z-wave
  * Radio Frequency: 868.4MHz EU; 908.4MHz US; 921.4MHz ANZ; 869.2MHz RU
  * Wireless distance：50m
  * Operation temperature: 0-40℃
  * Storage temperature: 0-60℃
  * Size: Contact sensor main body (L x W x H): 70mmx20mmx20mm Contact sensor deputy body (L x W x H): 40mmx11mmx11mm

### Inclusion Information

  1. Remove the sensor cover.
  2. Make sure the sensor is powered.
  3. Set Z‐Wave controller or Z‐Wave gateway into inclusion mode (Refer to the controller or gateway operating manual)
  4. Press the button three times within 1.5 second, the device will enter inclusion mode. And the LED will flash on and off alternately five times.

### Exclusion Information

  1. Remove the device cover.
  2. Make sure the sensor is powered.
  3. Set Z‐Wave controller or Z‐Wave gateway into exclusion mode (Refer to the controller or gateway operating manual)
  4. Press the button three times within 1.5 second, the device will enter exclusion mode.

### Wakeup Information

The NAS-DS01Z does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


Press the button three times within 1.5 second to wake the device. If pressed successfully, the LED will blink one time.

  * The minimum wakeup interval is 300s (5 minutes)
  * The maximum wakeup interval is 16,777,200s (about 194 days)
  * Allowable min step among each wakeup interval is 60 seconds, such as 360s, 420s, 480s…
  * Note: The default value is 12 hours. This value is longer, the battery life is greater.

## Channels

The following table summarises the channels available for the NAS-DS01Z -:

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

The following table provides a summary of the 2 configuration parameters available in the NAS-DS01Z.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | ON/OFF Delay | Delay before the OFF command is transmitted |
| 2 | Basic Set Level | Basic Set Command sent when door/window is opened or closed |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: ON/OFF Delay

Delay before the OFF command is transmitted
Adjust the delay before the OFF command is transmitted. 0 means send OFF command immediately.
Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_1_2``` and is of type ```INTEGER```.


### Parameter 2: Basic Set Level

Basic Set Command sent when door/window is opened or closed
Basic Set Command will be sent when the door/window is opened or closed, the receiver will take it for consideration; for instance, if a lamp module received the BSC of which value is decisive as to how bright of dim level of lamp module shall be.

Available Settings:

  * 0 - Off, Alarm cancelling or turning a device OFF
  * 1 - 99 or 255 – ON (Binary Switch Device)
  * Dim Level (Multilevel Switch Device)
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

The NAS-DS01Z supports 4 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Is assigned to the device status - OPEN/CLOSED.
It enables the sensor to send reports and readings to Z-Wave Controller or Z-Wave Gateway whenever the sensor is triggered.

  * NOTIFICATION_REPORT
  * BATTERY_REPORT
  * SENSOR\_BINARY\_REPORT
  * DEVICE\_RESET\_LOCALLY_NOTIFICATION

Association group 1 supports 5 nodes.

### Group 2: Group 2

Sending control commands to associated devices. This association group is configured through the advanced parameters no. 1 and 2.
BASIC_SET

Association group 2 supports 5 nodes.

### Group 3: Group 3

Send Notification to associated devices.
NOTIFICATION_REPORT

Association group 3 supports 5 nodes.

### Group 4: Group 4

Send Notification to associated devices.
SENSOR\_BINARY\_REPORT

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
