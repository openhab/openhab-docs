---
layout: documentation
title: ADC-S2000-T-RA - ZWave
---

{% include base.html %}

# ADC-S2000-T-RA Temperature Sensor
This describes the Z-Wave device *ADC-S2000-T-RA*, manufactured by *Building 36 Technologies* with the thing type UID of ```building36_adcs2000tra_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![ADC-S2000-T-RA product image](https://www.cd-jackson.com/zwave_device_uploads/931/931_default.jpg)


The ADC-S2000-T-RA supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The ADC-S2000-T-RA does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

Provides temperature reading from another location so Smart Thermostat can take smarter actions to maximize comfort and energy saving.

### Inclusion Information

Press the Pairing button on the Temperature Sensor to add it to the Z-Wave network.You will see the light on the Temperature Sensor turn solid white when it has been successfully added.

### Exclusion Information

Press the Pairing button on the Temperature Sensor to delete it from the Z-Wave network. The light on the Temperature Sensor will start flashing to indicate it has been successfully deleted.

### Wakeup Information

The ADC-S2000-T-RA does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


Every 4 hours.

## Channels

The following table summarises the channels available for the ADC-S2000-T-RA -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary |  | Switch | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
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

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The following table provides a summary of the 8 configuration parameters available in the ADC-S2000-T-RA.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Wake Up Period | Seconds to stay awake following button press |
| 2 | Low Battery Level | Battery level |
| 3 | Temperature Reporting Threshold | Tenths of a degree Fahrenheit. A value of 10 would be 1.0F. |
| 4 | Configuration Bitmask | Configuration Bitmask |
| 5 | Battery Reporting Interval | Battery Reporting Interval |
| 7 | Temperature Reporting Interval | Temperature Reporting Interval |
| 8 | Temperature Calibration Offset | Temperature Calibration Offset |
| 9 | Mandatory Temperature Reporting Interval | Mandatory Temperature Reporting Interval |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: Wake Up Period

Seconds to stay awake following button press

Values in the range 10 to 32768 may be set.

The manufacturer defined default value is ```32768```.

This parameter has the configuration ID ```config_1_2``` and is of type ```INTEGER```.


### Parameter 2: Low Battery Level

Battery level

Values in the range 1000 to 2500 may be set.

The manufacturer defined default value is ```2500```.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 3: Temperature Reporting Threshold

Tenths of a degree Fahrenheit. A value of 10 would be 1.0F.

Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_3_2``` and is of type ```INTEGER```.


### Parameter 4: Configuration Bitmask

Configuration Bitmask

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Will not send temperature reports |
| 2 | Send reports when the temperature changes. |

The manufacturer defined default value is ```2``` (Send reports when the temperature changes.).

This parameter has the configuration ID ```config_4_2``` and is of type ```INTEGER```.


### Parameter 5: Battery Reporting Interval

Battery Reporting Interval
Number of wake up intervals between autonomous battery reports. The wake up interval is set in the Wake Up Command Class.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_5_2``` and is of type ```INTEGER```.


### Parameter 7: Temperature Reporting Interval

Temperature Reporting Interval
The number of wake up intervals between autonomous temperature reports. 

If this value is zero, autonomous temperature reporting based on wake up interval is disabled.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_7_2``` and is of type ```INTEGER```.


### Parameter 8: Temperature Calibration Offset

Temperature Calibration Offset
Tenths of a degree Fahrenheit. A value of 10 would be 1.0F.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range -100 to 100 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_8_2``` and is of type ```INTEGER```.


### Parameter 9: Mandatory Temperature Reporting Interval

Mandatory Temperature Reporting Interval
The number of seconds between temperature reports.
Values in the range 60 to 64800 may be set.

The manufacturer defined default value is ```64800```.

This parameter has the configuration ID ```config_9_2``` and is of type ```INTEGER```.

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

The ADC-S2000-T-RA supports 2 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 5 nodes.

### Group 2: Sensor Multilevel Temperature Report.


Association group 2 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V4| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [User Guide](https://www.cd-jackson.com/zwave_device_uploads/931/Alarm-com-Temperature-Sensor-ADC-S2000-T-RA-User-Guide.pdf)
* [Installation Guide](https://www.cd-jackson.com/zwave_device_uploads/931/Alarm-com-Temperature-Sensor-ADC-S2000-T-RA-Installation-Guide.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/931).
