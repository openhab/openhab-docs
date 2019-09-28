---
layout: documentation
title: HKZW_FLD01 - ZWave
---

{% include base.html %}

# HKZW_FLD01 Flood Sensor FLD01
This describes the Z-Wave device *HKZW_FLD01*, manufactured by *[Hank](http://www.hank-tech.com/)* with the thing type UID of ```hank_hkzwfld01_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![HKZW_FLD01 product image](https://www.cd-jackson.com/zwave_device_uploads/674/674_default.jpg)


The HKZW_FLD01 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The HKZW_FLD01 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

HANK Flood Sensor is a device that is capable od both detecting leaks and floods when the level of water gest too low in a pool or a tank. Flood Sensor can work with your Z-Wave network to prevent emergencies such as burst water boiler to leakingar conditioners.

It includes:

-Lastest Z-Wave protocol.

-Security 0 and secutiry 2 framework implemented with AES-128 encryption.

-Two installation ways optional.

-Temperature sensor.

-Vibration sensor.

-Up to 1 year battery live.

-Low battery alert.

-Firmware OTA upgrade supported.

### Inclusion Information

Add Flood Sensor into Z-Wave Network:

1- Open the cover.

2- Place the device within the direct range of your Z-Wave controller.

3- Set the main controller's adding mode (see the controller's manual).

4- Click the Z-button once or triple click the Z-button quickly, the LED indicator should blink fast in blue.

5- Wait for the adding process to end.

6- Successful adding will be confirmed by the Z-Wave controller's message.

### Exclusion Information

Remove Flood Sensor into Z-Wave Network:

1- Open the cover.

2- Place the device within the direct range of your Z-Wave controller.

3- Set the main controller's remove mode (see the controller's manual).

4- Click the Z-button once or triple click the Z-button quickly, the LED indicator should blink fast in orange.

5- Wait for the removing process to end.

6- Successful removing will be confirmed by the Z-Wave controller's message.

### Wakeup Information

The HKZW_FLD01 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


Defining a time period by which the flood Sensor sends a wake up notification command frame to communicate with the assigned device, update parameters, update software detecs battery level. 

Wake up interval set to 0 disables the sending wake up notification command, in such configuration it is needed manually wake the device up by press the Z-button.

Avaliable settings: 0-2678400

Default setting: 0

## Channels

The following table summarises the channels available for the HKZW_FLD01 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Alarm (heat) | alarm_heat | alarm_heat | Fire | Switch | 
| Alarm (flood) | alarm_flood | alarm_flood | Water | Switch | 
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Alarm (heat)
Indicates if a heat alarm is triggered.

The ```alarm_heat``` channel is of type ```alarm_heat``` and supports the ```Switch``` item and is in the ```Fire``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (flood)
Indicates if the flood alarm is triggered.

The ```alarm_flood``` channel is of type ```alarm_flood``` and supports the ```Switch``` item and is in the ```Water``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

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

The following table provides a summary of the 10 configuration parameters available in the HKZW_FLD01.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 14 | Enable/Disable Basic Set Command | The flood sensor can send BASIC SET command to nodes associated |
| 15 | value of the Basic Set | The flood sensor can send BASIC SET command to nodes associated |
| 17 | Flooding Alarm | Enable/Disable flooding alarm |
| 18 | Shock Alarm | Enable/Disable shock alarm |
| 19 | High Temperature Alarm | Enable/Disable high temperature alarm |
| 20 | Set the high temperature alarm trigger value | Available setting(US):-67°c to -257°c |
| 21 | Low Temperature Alarm | Enable/Disable low temperature alarm |
| 22 | Set the low temperature alarm trigger value | Available setting(US):-67°c to -257°c |
| 24 | Blinking LED | Enable/Disable blinking LED when alarm being triggerd |
| 32 | Level of low battery | This parameter defines a battery level as the "low bettery" |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 14: Enable/Disable Basic Set Command

The flood sensor can send BASIC SET command to nodes associated

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable |
| 1 | Enable |

The manufacturer defined default value is ```1``` (Enable).

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.


### Parameter 15: value of the Basic Set

The flood sensor can send BASIC SET command to nodes associated

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable |
| 1 | Enable |

The manufacturer defined default value is ```0``` (Disable).

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 17: Flooding Alarm

Enable/Disable flooding alarm

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable |
| 1 | Enable |

The manufacturer defined default value is ```1``` (Enable).

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 18: Shock Alarm

Enable/Disable shock alarm

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable |
| 1 | Enable |

The manufacturer defined default value is ```1``` (Enable).

This parameter has the configuration ID ```config_18_1``` and is of type ```INTEGER```.


### Parameter 19: High Temperature Alarm

Enable/Disable high temperature alarm

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable |
| 1 | Enable |

The manufacturer defined default value is ```1``` (Enable).

This parameter has the configuration ID ```config_19_1``` and is of type ```INTEGER```.


### Parameter 20: Set the high temperature alarm trigger value

Available setting(US):-67°c to -257°c

Values in the range -670 to 2570 may be set.

The manufacturer defined default value is ```1040```.

This parameter has the configuration ID ```config_20_2``` and is of type ```INTEGER```.


### Parameter 21: Low Temperature Alarm

Enable/Disable low temperature alarm

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable |
| 1 | Enable |

The manufacturer defined default value is ```0``` (Disable).

This parameter has the configuration ID ```config_21_1``` and is of type ```INTEGER```.


### Parameter 22: Set the low temperature alarm trigger value

Available setting(US):-67°c to -257°c

Values in the range -670 to 2570 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_22_2``` and is of type ```INTEGER```.


### Parameter 24: Blinking LED

Enable/Disable blinking LED when alarm being triggerd

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable |
| 1 | Enable |

The manufacturer defined default value is ```1``` (Enable).

This parameter has the configuration ID ```config_24_1``` and is of type ```INTEGER```.


### Parameter 32: Level of low battery

This parameter defines a battery level as the "low bettery"

Values in the range 10 to 50 may be set.

The manufacturer defined default value is ```20```.

This parameter has the configuration ID ```config_32_1``` and is of type ```INTEGER```.

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

The HKZW_FLD01 supports 2 association groups.

### Group 1: Report

report the flooding detection,shock detection and the battert level

Association group 1 supports 5 nodes.

### Group 2: Send Command

Group 2 is assigned to send BASIC SET command

Association group 2 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V5| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [User manual](https://www.cd-jackson.com/zwave_device_uploads/674/Hank-Flood-Sensor-User-Manual.pdf)
* [Test report](https://www.cd-jackson.com/zwave_device_uploads/674/Hank-Flood-Sensor-Test-Report.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/674).
