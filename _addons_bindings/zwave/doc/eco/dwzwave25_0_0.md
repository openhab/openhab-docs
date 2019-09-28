---
layout: documentation
title: DWZWAVE25 - ZWave
---

{% include base.html %}

# DWZWAVE25 Z-Wave Door/Window Sensor
This describes the Z-Wave device *DWZWAVE25*, manufactured by *Ecolink* with the thing type UID of ```eco_dwzwave25_00_000```.

The device is in the category of *Door*, defining Door sensors.

![DWZWAVE25 product image](https://www.cd-jackson.com/zwave_device_uploads/947/947_default.jpg)


The DWZWAVE25 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The DWZWAVE25 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

Z-Wave+ enabled device which provides open/closed position status

Transmits open/closed status

Reports tamper condition when cover is open

### Inclusion Information

Start by placing the controller into inclusion mode.

Activate inclusion mode for the sensor by removing the plastic pull-tab from the back of the sensor. When the inclusion process in complete, the LED on the sensor will be solid blue, then go out.

Test the sensor. Place the magnet next to the sensor to represent a closed position (see Installation section to see where to position the magnet). If the LED flashes ONE TIME, it is successfully communicating on your Zwave network. If the LED on the sensor flashes slow and steady for 5 seconds, you need to repeat the inclusion process.

Notes:

If you need to repeat the inclusion process, repeat STEP ONE above, then for STEP TWO you will need to simply remove the cover of the sensor, remove the battery for 10 seconds, reinsert the battery, and replace the sensor cover. This will re-enter the sensor in inclusion mode.

This sensor also supports Network Wide Inclusion such that the Sensor can be included into the Z-Wave network over the mesh network and not directly near the main controller. This mode is automatically activated after regular inclusion was not successful.

### Exclusion Information

Exclusion mode on the sensor is initiated following the same exact procedure as inclusion.

### Wakeup Information

The DWZWAVE25 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


The sensor will wake up every so often and when the case is closed to send a Wake-Up Notification to allow the life line master node controller that the sensor is now available for any queued messages that the controller may have for the sensor. The time between Wake-Up Notifications can be configured with the Wake- Up Notification command class to be between 1 hour and 1 week with interval steps of 200 seconds.

To save power, this sensor sleeps most of the time and is therefore not awake to receive messages from a gateway for testing. Removing the top case from the sensor will put in device into a tampered mode in which the sensor will stay awake and able to receive messages. Most of the time an end user would not do this, but if the sensor needs to be configured after inclusion, an end user can follow the instructions below for sending Wake-Up notifications.

## Channels

The following table summarises the channels available for the DWZWAVE25 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary |  | Switch | 
| Alarm (tamper) | alarm_tamper | alarm_tamper |  | Switch | 
| Sensor (Binary) | sensor_door | sensor_door | Door | Contact | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Binary Sensor
Indicates if a sensor has triggered.

The ```sensor_binary``` channel is of type ```sensor_binary``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Alarm (tamper)
Indicates if the tamper alarm is triggered.

The ```alarm_tamper``` channel is of type ```alarm_tamper``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Sensor (Binary)
Indicates if the door/window is open or closed.

The ```sensor_door``` channel is of type ```sensor_door``` and supports the ```Contact``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Contact``` item type -:

| Value | Label     |
|-------|-----------|
| OPEN | Open |
| CLOSED | Closed |

### Alarm (power)
Indicates if a power alarm is triggered.

The ```alarm_power``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

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

The following table provides a summary of the 2 configuration parameters available in the DWZWAVE25.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Send Basic Set | Send Basic Set to Association Group 2 |
| 2 | Send Sensor Binary Report | Send Sensor Binary Report to Association Group 1 |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: Send Basic Set

Send Basic Set to Association Group 2
Configures the sensor to send or not send Basic Set commands of 0x00 to nodes in Association group 2 turning the devices off when the sensor is in a restored state i.e. the door is closed. By default the sensor does NOT send Basic Set commands of 0x00.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Don't Send Basic Set |
| 255 | Send Basic Set |

The manufacturer defined default value is ```0``` (Don't Send Basic Set).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Send Sensor Binary Report

Send Sensor Binary Report to Association Group 1
Configures the sensor to either to send or not to send Sensor Binary Report commands to Association Group 1 when the sensor is faulted and restored. If the controller is fully compatible with the Notification Command Class thereby making the Sensor Binary Reports redundant, the controller can disable the Sensor Binary Report Commands completely.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Send Sensor Binary Report |
| 255 | Don't Send Binary Sensor Report |

The manufacturer defined default value is ```0``` (Send Sensor Binary Report).

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

The DWZWAVE25 supports 2 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Receive unsolicited messages relating to door/window open/close notifications, case tampering notifications, low-battery notifications, and sensor binary reports.

Association group 1 supports 5 nodes.

### Group 2: Control

Group to receive Basic Set
Intended for devices that are to be controlled i.e. turned on or off (on only by default) with a Basic Set.

Association group 2 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V2| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V5| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [Manual](https://www.cd-jackson.com/zwave_device_uploads/947/D-W--Zwave-Manual-R1-04.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/947).
