---
layout: documentation
title: NAS-DS01Z - ZWave
---

{% include base.html %}

# NAS-DS01Z Cyrus Door Window Sensor
This describes the Z-Wave device *NAS-DS01Z*, manufactured by *[Shenzhen Neo Electronics Co., Ltd](http://www.szneo.com/)* with the thing type UID of ```shenzhen_nasds01z_00_000```.

![NAS-DS01Z product image](https://www.cd-jackson.com/zwave_device_uploads/458/458_default.jpg)


The NAS-DS01Z supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The NAS-DS01Z does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour. The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/458) to improve the documentation.

## Channels

The following table summarises the channels available for the NAS-DS01Z -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Binary Sensor | sensor_binary | Door | Switch | 
| Alarm (access) | alarm_access | Door | Switch | 
| Battery Level | battery-level | Battery | Number |

### Binary Sensor

Indicates if a sensor has triggered.

The ```sensor_binary``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

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

The following table provides a summary of the 2 configuration parameters available in the NAS-DS01Z.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | OFF Delay | Adjust the amount of delay before the OFF command is transmitted. |
| 2 | Basic Set Level |  |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: OFF Delay

Adjust the amount of delay before the OFF command is transmitted.
Description This configuration parameter that can be used to adjust the amount of delay before the OFF command is transmitted. This parameter can be configured with the value of 0 through 65535, where 0 means send OFF command immediately and 65535 means 65535 seconds of delay.
Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_1_2``` and is of type ```INTEGER```.


### Parameter 2: Basic Set Level



The following option values may be configured, in addition to values in the range -1 to 99 -:

| Value  | Description |
|--------|-------------|
| -1 | ON (Binary Switch Device) |
| 0 | OFF, Alarm cancelling or turning a device off |

The manufacturer defined default value is ```-1``` (ON (Binary Switch Device)).

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

GROUP 1 is lifeline service that assigned to Sensor (Door/Window detector) status – Open/Close
This group supports 5 nodes.

### Group 2: Group 2

GROUP 2 allows for sending control commands to associated devices such as relay module, lighting, etc. This association group is configured through the advanced parameters no. 1 and 2. This Group Support: BASIC\_SET.
This group supports 5 nodes.

### Group 3: Group 3

GROUP 3 allows for Send Notification to associated devices in this group. This Group Support: NOTIFICATION\_REPORT.
This group supports 5 nodes.

### Group 4: Group 4

GROUP 4 allows for Send Notification to associated devices in this group. This Group Support: SENSOR\_BINARY\_REPORT
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
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [German Manual](https://www.cd-jackson.com/zwave_device_uploads/458/Tuer-Fensterkontakt-Z-Wave-manual-DE.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/458).
