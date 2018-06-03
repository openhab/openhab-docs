---
layout: documentation
title: TP-802ZD - ZWave
---

{% include base.html %}

# TP-802ZD Door/Window Sensor
This describes the Z-Wave device *TP-802ZD*, manufactured by *Kaipule Technology Co., Ltd.* with the thing type UID of ```kaipule_doorwindowsensor_00_000```.

The TP-802ZD supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The TP-802ZD does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour. The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.

## Overview

The sensor must be added to the Zwave network prior to use.

\- This sensor can not work alone, need connect to Z-wave gateway - First time connect, the distance between sensor and gateway better less than 1.0 meter, after connected, then install the sensor where you need - When connect to gateway, choose add device in your gateway software, then quickly click the sensor's z-wave trigger 3 times to send signal to gateway, delet device similar operation - When install, the door sensor main part and magnetic stripe gap must less than 5mm - The work distance to gateway is 10 to 20 meters indoor, more wall or barrier will influence the distance

Factory Setting  
Press the tamper switch 6 times in 2s, it will recover to factory setting after a period of time  
(Please use the reset procedure only when the primary controller is missing or inoperable)

### Inclusion Information

To include the sensor in a networks start by placing the controller in inclusion mode. Then activate the inclusion mode at the sensor by pressing the tamper switch 3 times within 1.5s.

### Exclusion Information

To exclude the sensor in a networks start by placing the controller in exclusion mode. Then activate the exclusion mode at the sensor by pressing the tamper switch 3 times within 1.5s.

### Wakeup Information

a) Manual Wake-up  
Quickly press tamper switch once, the door sensor will automatically send wake-up  
information, and there will be 10s after wake-up to receive gateway setting information.  
b) Automatic Wake-up  
Default time of automatic wake-up is 24 hours, and there will be 10s after wake-up to receive  
gateway setting information, the max automatic report time = 24 hours, minimum=30min

## Channels

The following table summarises the channels available for the TP-802ZD -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Binary Sensor | sensor_binary | Door | Switch | 
| Alarm (burglar) | alarm_burglar | Door | Switch | 
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

### Alarm (burglar)

Indicates if the burglar alarm is triggered.

The ```alarm_burglar``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |

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

The following table provides a summary of the 3 configuration parameters available in the TP-802ZD.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Basic Set Level | Basic Set Command will be sent when the door/window is opened or closed |
| 2 | Turn Off Light Time Configuration | Turn Off Light Time |
| 3 | Door Sensor Status Report | Auto report Door/Window status time |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: Basic Set Level

Basic Set Command will be sent when the door/window is opened or closed
If there is any device under Association Group2, the door sensor will send “Basic Set = value”  
command to control that device when the door sensor is opened.

“Value” configuration rule is as below:

Available settings:

1 to 100 Dimmer Level

255 (Default) For ON/OFF Light Only
Values in the range 1 to 100 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Turn Off Light Time Configuration

Turn Off Light Time
If there is any device under Association Group2, the door sensor will send “Basic Set = value”  
command to Group2, and send “Basic Set = 0x00” command to turn-off light after “t” seconds,  
Set value = “t”, means to send Basic Set command after “t” seconds.
Values in the range 1 to 120 may be set.

The manufacturer defined default value is ```20```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Door Sensor Status Report

Auto report Door/Window status time
Under normal working status (without trigger), the door sensor will automatically send report  
to the Gateway about its current tamper & open/close status. Set value = t, means “t” hours,  
(“t”=0, means no status report)
Values in the range 0 to 24 may be set.

The manufacturer defined default value is ```12```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.

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

The TP-802ZD supports 2 association groups.

### Group 1: Group 1

Is assigned to the device status - OPEN/CLOSED.
This group supports 1 nodes.

### Group 2: Group 2

Sending control commands to associated devices
This group supports 2 nodes.

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
| COMMAND_CLASS_ALARM_V4| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/633).
