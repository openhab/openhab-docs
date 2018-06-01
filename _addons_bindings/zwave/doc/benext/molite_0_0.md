---
layout: documentation
title: Molite - ZWave
---

{% include base.html %}

# Molite Movement sensor with temperature and light sensor
This describes the Z-Wave device *Molite*, manufactured by *[BeNext](http://www.benext.eu/)* with the thing type UID of ```benext_molite_00_000```.

![Molite product image](https://www.cd-jackson.com/zwave_device_uploads/374/374_default.png)


The Molite supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The Molite does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour. The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/374) to improve the documentation.

## Channels

The following table summarises the channels available for the Molite -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Binary Sensor | sensor_binary | Door | Switch | 
| Sensor (luminance) | sensor_luminance | Temperature | Number | 
| Sensor (temperature) | sensor_temperature | Temperature | Number | 
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

### Sensor (luminance)

Indicates the current light reading.

The ```sensor_luminance``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Sensor (temperature)

Indicates the current temperature.

The ```sensor_temperature``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

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

The following table provides a summary of the 16 configuration parameters available in the Molite.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Reset to factory settings | Set all configuration values to default values (factory settings). |
| 2 | Mode timeout | The time used in mode 2 to turn the sensor off. This time will start running as soon as detection is seen. |
| 3 | Switch off time | The switch off time will start running as soon as mode timeout is done. The Motion sensor is turned on and when movement is detected again. The mode timeout (cfg param 1) will start running all over again. When switch off time is done a basic off message |
| 4 | sensitivity | the sensitivity of the motion circuit |
| 5 | The mode | The mode that is entered after detection |
| 6 | The temperature offset | An offset for the temperature. |
| 7 | Light table 100 % | If a LDR resistance measured lower then this value the returned light percentage is 100%. See chapter light table for more information. |
| 8 | Light table 90 % | If a LDR resistance measured lower then this value the returned light percentage is 90%. See chapter light table for more information. |
| 9 | Light table 80 % | If a LDR resistance measured lower then this value the returned light percentage is 80%. See chapter light table for more information. |
| 10 | Light table 70 % | If a LDR resistance measured lower then this value the returned light percentage is 70%. See chapter light table for more information. |
| 11 | Light table 60 % | If a LDR resistance measured lower then this value the returned light percentage is 60%. See chapter light table for more information. |
| 12 | Light table 50 % | If a LDR resistance measured lower then this value the returned light percentage is 50%. See chapter light table for more information. |
| 13 | Light table 40 % | If a LDR resistance measured lower then this value the returned light percentage is 40%. See chapter light table for more information. |
| 14 | Light table 30 % | If a LDR resistance measured lower then this value the returned light percentage is 30%. See chapter light table for more information. |
| 15 | Light table 20 % | If a LDR resistance measured lower then this value the returned light percentage is 20%. See chapter light table for more information. |
| 16 | Light table 10 % | If a LDR resistance measured lower then this value the returned light percentage is 10%. See chapter light table for more information. |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: Reset to factory settings

Set all configuration values to default values (factory settings).

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Mode timeout

The time used in mode 2 to turn the sensor off. This time will start running as soon as detection is seen.

Values in the range 0 to 900 may be set.

The manufacturer defined default value is ```900```.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 3: Switch off time

The switch off time will start running as soon as mode timeout is done. The Motion sensor is turned on and when movement is detected again. The mode timeout (cfg param 1) will start running all over again. When switch off time is done a basic off message

Values in the range 0 to 2700 may be set.

The manufacturer defined default value is ```2700```.

This parameter has the configuration ID ```config_3_2``` and is of type ```INTEGER```.


### Parameter 4: sensitivity

the sensitivity of the motion circuit

Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```80```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: The mode

The mode that is entered after detection

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Mode 1: no detection possible. Battery save mode. |
| 2 | Mode 2: normal operation mode: send on after detection and off after g |
| 3 | Mode 3: Z-Wave chip is always on to request e.g. version or manufactur |

The manufacturer defined default value is ```2``` (Mode 2: normal operation mode: send on after detection and off after g).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: The temperature offset

An offset for the temperature.

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_6_2``` and is of type ```INTEGER```.


### Parameter 7: Light table 100 %

If a LDR resistance measured lower then this value the returned light percentage is 100%. See chapter light table for more information.

Values in the range 0 to 17 may be set.

The manufacturer defined default value is ```17```.

This parameter has the configuration ID ```config_7_2``` and is of type ```INTEGER```.


### Parameter 8: Light table 90 %

If a LDR resistance measured lower then this value the returned light percentage is 90%. See chapter light table for more information.

Values in the range 0 to 38 may be set.

The manufacturer defined default value is ```38```.

This parameter has the configuration ID ```config_8_2``` and is of type ```INTEGER```.


### Parameter 9: Light table 80 %

If a LDR resistance measured lower then this value the returned light percentage is 80%. See chapter light table for more information.

Values in the range 0 to 85 may be set.

The manufacturer defined default value is ```85```.

This parameter has the configuration ID ```config_9_2``` and is of type ```INTEGER```.


### Parameter 10: Light table 70 %

If a LDR resistance measured lower then this value the returned light percentage is 70%. See chapter light table for more information.

Values in the range 0 to 186 may be set.

The manufacturer defined default value is ```186```.

This parameter has the configuration ID ```config_10_2``` and is of type ```INTEGER```.


### Parameter 11: Light table 60 %

If a LDR resistance measured lower then this value the returned light percentage is 60%. See chapter light table for more information.

Values in the range 0 to 407 may be set.

The manufacturer defined default value is ```407```.

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


### Parameter 12: Light table 50 %

If a LDR resistance measured lower then this value the returned light percentage is 50%. See chapter light table for more information.

Values in the range 0 to 891 may be set.

The manufacturer defined default value is ```891```.

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 13: Light table 40 %

If a LDR resistance measured lower then this value the returned light percentage is 40%. See chapter light table for more information.

Values in the range 0 to 1949 may be set.

The manufacturer defined default value is ```1949```.

This parameter has the configuration ID ```config_13_2``` and is of type ```INTEGER```.


### Parameter 14: Light table 30 %

If a LDR resistance measured lower then this value the returned light percentage is 30%. See chapter light table for more information.

Values in the range 0 to 4265 may be set.

The manufacturer defined default value is ```4265```.

This parameter has the configuration ID ```config_14_2``` and is of type ```INTEGER```.


### Parameter 15: Light table 20 %

If a LDR resistance measured lower then this value the returned light percentage is 20%. See chapter light table for more information.

Values in the range 0 to 9332 may be set.

The manufacturer defined default value is ```9332```.

This parameter has the configuration ID ```config_15_2``` and is of type ```INTEGER```.


### Parameter 16: Light table 10 %

If a LDR resistance measured lower then this value the returned light percentage is 10%. See chapter light table for more information.

Values in the range 0 to 20417 may be set.

The manufacturer defined default value is ```20417```.

This parameter has the configuration ID ```config_16_2``` and is of type ```INTEGER```.

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

The Molite supports 1 association group.

### Group 1: Devices to be switched on when motion detected and off after on time


This group supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/374/molitesensor.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/374).
