---
layout: documentation
title: Ecolink PIR v2.5 - ZWave
---

{% include base.html %}

# Ecolink PIR v2.5 Z-Wave PIR Motion Sensor v2.5
This describes the Z-Wave device *Ecolink PIR v2.5*, manufactured by *Ecolink* with the thing type UID of ```eco_ecolinkpirv25_00_000```.

The Ecolink PIR v2.5 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The Ecolink PIR v2.5 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour. The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.

## Overview

**Overview:**

This is a hardware revision update to EcoLink's prior PIR sensor. It provides the same general capabilities as the prior detector--motion detection, battery state messages, and "burgler" alarm for the case being opened. On motion detection a green LED will flash and the notification will be sent to Group 1.

**Association Groups:**

The device has two association groups of up to 5 nodes each.

**Configuration Parameters:**

The device has two configuration parameters. Parameter 1 configures the sensor to send or not send Basic Set commands of 0x00 to nodes in Association group 2 turning the devices off when the sensor is in a restored state (i.e. motion not detected). By default the sensor does NOT send Basic Set commands of 0x00. Paremter 2 configures the sensor to either send or not to send Sensor Binary Report commands to Association Group 1 when the sensor is faulted and restored. If the controller is fully compatible with the Notification Command Class thereby making the Sensor Binary Reports redundant, the controller can disable the Sensor Binary Report Commands completely.

### Inclusion Information

Initial device inclusion is started by removing the pull tab from the back of the unit. This connects the battery and the device will immediately be eligible for inclusion. Place your controller in inclusion mode prior to pulling the tab from the back.

The manual indicates network-wide inclusion is supported, but also indicates that the device should be within 15 feet of the controller during the inclusion process.

## Channels

The following table summarises the channels available for the Ecolink PIR v2.5 -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Binary Sensor | sensor_binary | Door | Switch | 
| Alarm (power) | alarm_power | Door | Switch | 
| Alarm (burglar) | alarm_burglar | Door | Switch | 
| Battery Level | battery-level | Battery | Number |

### Binary Sensor

Indicates if a sensor has triggered.

The ```sensor_binary``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Alarm (power)

Indicates if a power alarm is triggered.

The ```alarm_power``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |

### Alarm (burglar)

Indicates if the burglar alarm is triggered.

The ```alarm_burglar``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |

### Battery Level

Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```battery-level``` channel supports the ```Number``` item and is in the ```Battery``` category.



## Device Configuration

The following table provides a summary of the 2 configuration parameters available in the Ecolink PIR v2.5.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Send Basic Sets | Send or do not send Basic Set commands to AG2 |
| 2 | Send Binary Reports | Send Sensor Binary Reports for backward compatibility |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: Send Basic Sets

Send or do not send Basic Set commands to AG2
Parameter 1 configures the sensor to send or not send Basic Set commands of 0x00 to nodes in Association group 2 turning the devices off when the sensor is in a restored state (i.e. motion not detected). By default the sensor does NOT send Basic Set commands of 0x00.

Configuration Value: 0x00:

(Default) Sensor does NOT send Basic Sets to Node IDs in Association Group 2 when the sensor is restored (i.e. Motion Not Detected)

Configuration Value: 0xFF:

Sensor sends Basic Sets of 0x00 to nodes in Association Group2 when sensor is restored
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Do not send |
| 255 | Send Basic Sets |

The manufacturer defined default value is ```0``` (Do not send).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Send Binary Reports

Send Sensor Binary Reports for backward compatibility
Paremter 2 configures the sensor to either send or not to send Sensor Binary Report commands to Association Group 1 when the sensor is faulted and restored. If the controller is fully compatible with the Notification Command Class thereby making the Sensor Binary Reports redundant, the controller can disable the Sensor Binary Report Commands completely.

Configuration Value: 0x00:

(Default) Sensor sends Sensor Binary Reports when sensor is faulted and restored for backwards compatibility in addition to Notification Reports.

Configuration Value: 0xFF:

Sensor will send only Notification Reports and NOT Sensor Binary Reports when the sensor is faulted and restored.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Send Sensor Binary Reports |
| 255 | Send only Notification Reports |

The manufacturer defined default value is ```0``` (Send Sensor Binary Reports).

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

The Ecolink PIR v2.5 supports 2 association groups.

### Group 1: Group 1


This group supports 5 nodes.

### Group 2: Group 2


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
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V0| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V5| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/525).
