---
layout: documentation
title: ITEMP - ZWave
---

{% include base.html %}

# ITEMP Contact and temperature sensor
This describes the Z-Wave device *ITEMP*, manufactured by *Wintop* with the thing type UID of ```wintop_itemp_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![ITEMP product image](https://www.cd-jackson.com/zwave_device_uploads/216/216_default.png)


The ITEMP supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The ITEMP does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

Binary & Temperature sensor

### Inclusion Information

Remove the cover and press the tamper switch for 3 seconds until the red LED blinks.

### Exclusion Information

Remove the cover and press the tamper switch for 3 seconds until the red LED blinks.

### Wakeup Information

The ITEMP does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


Remove the cover and press the tamper switch for 3 seconds until the red LED blinks.

## Channels

The following table summarises the channels available for the ITEMP -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary |  | Switch | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Alarm (CO2) | alarm_co2 | alarm_co2 | CarbonDioxide | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Binary Sensor
Indicates if a sensor has triggered.

The ```sensor_binary``` channel is of type ```sensor_binary``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Alarm (CO2)
Indicates if the carbon dioxide alarm is triggered.

The ```alarm_co2``` channel is of type ```alarm_co2``` and supports the ```Switch``` item and is in the ```CarbonDioxide``` category. This is a read only channel so will only be updated following state changes from the device.

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

The following table provides a summary of the 4 configuration parameters available in the ITEMP.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Reset to factory default | Delete configuration but keeps inclusion |
| 2 | Command sent on external dry contact | Configure what te external contact sends when trigger |
| 5 | Operating Mode | Operating Mode |
| 6 | Temperature Offset | Temperature Offset |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: Reset to factory default

Delete configuration but keeps inclusion

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No (default) |
| 1 | Execute reset |

The manufacturer defined default value is ```0``` (No (default)).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Command sent on external dry contact

Configure what te external contact sends when trigger

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Alarm Resport Type 2 (default) |
| 1 | Basic On or Basic Off |

The manufacturer defined default value is ```0``` (Alarm Resport Type 2 (default)).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 5: Operating Mode

Operating Mode
Defines if the sensor is in normal wakeup mode or always on (drains battery fast)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Normal Wakeup (default) |
| 3 | Always awake |

The manufacturer defined default value is ```1``` (Normal Wakeup (default)).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Temperature Offset

Temperature Offset
Can be used to calibrate the temperature sensors function. Calibrated as factory default.
Values in the range 0 to 15300 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_6_2``` and is of type ```INTEGER```.

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

The ITEMP supports 2 association groups.

### Group 1: Binary input Group


Association group 1 supports 5 nodes.

### Group 2: Alarm Group


Association group 2 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/216/Wintop-Itemp.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/216).
