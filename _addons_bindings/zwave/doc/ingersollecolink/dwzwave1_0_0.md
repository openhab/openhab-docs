---
layout: documentation
title: DWZWAVE1 - ZWave
---

{% include base.html %}

# DWZWAVE1 Z-Wave Door/Window Sensor
This describes the Z-Wave device *DWZWAVE1*, manufactured by *Ingersoll Rand (was Ecolink)* with the thing type UID of ```ingersollecolink_dwzwave1_00_000```.

The device is in the category of *Door*, defining Door sensors.

![DWZWAVE1 product image](https://www.cd-jackson.com/zwave_device_uploads/135/135_default.png)


The DWZWAVE1 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The DWZWAVE1 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

Monitor activities at your home with this Z-Wave Door and Window Sensor.  Choose to receive mobile or email alerts when a door or window is opened.  Use the Door/Window sensor to trigger video recording or turn on the lights.  View the status of the sensor from your smartphone, tablet, or computer.

### Inclusion Information

Remove the battery for 10 seconds and replace the battery to restart enrollment mode.

### Exclusion Information

  1. Remove the battery from the Sensor.
  2. Leave the battery out for at least ten (10) seconds.
  3. Reinstall the battery into the Sensor.

### Wakeup Information

The DWZWAVE1 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


Press the "+" button once.

## Channels

The following table summarises the channels available for the DWZWAVE1 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary |  | Switch | 
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Binary Sensor
Indicates if a sensor has triggered.

The ```sensor_binary``` channel is of type ```sensor_binary``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Alarm (burglar)
Indicates if the burglar alarm is triggered.

The ```alarm_burglar``` channel is of type ```alarm_burglar``` and supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

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

The following table provides a summary of the 1 configuration parameters available in the DWZWAVE1.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 99 | Fault Restore Report | Fault Restore Report |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 99: Fault Restore Report

Fault Restore Report
Enable or disable Basic Sets of 0x00 on a fault restore to nodes in Group 2. Default = Enabled.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 255 | Enabled |

The manufacturer defined default value is ```255``` (Enabled).

This parameter has the configuration ID ```config_99_1``` and is of type ```INTEGER```.

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

The DWZWAVE1 supports 2 association groups.

### Group 1: Group 1


Association group 1 supports 5 nodes.

### Group 2: Group 2


Association group 2 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V2| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [Installation Instructions](https://www.cd-jackson.com/zwave_device_uploads/135/D-W-Sensor-Installation-Instructions.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/135).
