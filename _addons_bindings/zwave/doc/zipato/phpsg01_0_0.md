---
layout: documentation
title: PH-PSG01 - ZWave
---

{% include base.html %}

# PH-PSG01 Smoke Sensor
This describes the Z-Wave device *PH-PSG01*, manufactured by *[Zipato](http://www.zipato.com/)* with the thing type UID of ```zipato_phpsg01_00_000```.

The device is in the category of *Smoke Detector*, defining Smoke detectors.

![PH-PSG01 product image](https://www.cd-jackson.com/zwave_device_uploads/950/950_default.jpg)


The PH-PSG01 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The PH-PSG01 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

Zipato Smoke Sensor (Z-Wave) is designed to give early warning of developing fires by giving off the alarm sounds from its build-in alarm horn, based on Z-Wave technology. Zipato Smoke Sensor is Z-Wave Plus product, it supports security, OTA and all other new features of 500 Series Z-Wave chipset.

### Inclusion Information

  1. Have Z-Wave Controller entered inclusion mode.
  2. Press test button three times within 1.5 seconds to enter the inclusion mode.
  3. After the adding was successful, the device will wake to receive the setting from Z-Wave Controller about 20 seconds. 

### Exclusion Information

  1. Have Z-Wave Controller entered inclusion mode.
  2. Pressing test button three times within 1.5 seconds to enter the exclusion mode. Node ID has been removed. 

### Wakeup Information

The PH-PSG01 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


After device is added to the network, it will wake-up once per day by default.When it wakes-up it will broadcast the “Wake  Up Notification” message to the network, and wake-up 10 seconds to receive the setting commands. The wake-up interval minimum setting is 30 minutes, and maximum setting is 120 hours. Interval step is 30 minutes. If you want to wake-up device immediately, please press the button once. The device will wake-up for 10 seconds. 

### General Usage Information

Factory reset:

Notice: Use this procedure only in the event that the primary controller is lost or otherwise inoperable.

  1. Have Z-Wave Controller entered inclusion mode.
  2. After the red LED flash 9 times, release the test button within 2 seconds.
  3. IDs are removed and all settings will reset to factory default. 

## Channels

The following table summarises the channels available for the PH-PSG01 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| switch | switch_binary | switch_binary | Switch | Switch | 
| Binary Sensor | sensor_binary | sensor_binary |  | Switch | 
| Alarm temperature | alarm_tamper | alarm_tamper |  | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |
| Alarm smoke | alarm_smoke | alarm_smoke | Smoke | Switch | 

### switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Binary Sensor
Indicates if a sensor has triggered.

The ```sensor_binary``` channel is of type ```sensor_binary``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Alarm temperature
Indicates if the tamper alarm is triggered.

The ```alarm_tamper``` channel is of type ```alarm_tamper``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.
### Alarm smoke
Indicates if a smoke is triggered.

The ```alarm_smoke``` channel is of type ```alarm_smoke``` and supports the ```Switch``` item and is in the ```Smoke``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 2 configuration parameters available in the PH-PSG01.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 7 | Customer Function | Customer Function |
| 10 | Auto Report Battery Time | Auto Report Battery Time |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 7: Customer Function

Customer Function
Notification type 0: Using Notification Report 1: Using Sensor Binary Report
Values in the range 0 to 4 may be set.

The manufacturer defined default value is ```4```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 10: Auto Report Battery Time

Auto Report Battery Time
The interval time for auto report the battery level.
Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```127```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.

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

The PH-PSG01 supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 8 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V2| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V2| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V2| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_SECURITY_V1| |
| COMMAND_CLASS_SENSOR_ALARM_V1| |

### Documentation Links

* [PSG01 Manual](https://www.cd-jackson.com/zwave_device_uploads/950/ph-psg01---Zipato-Smoke-Sensor-User-Manual-v1-0.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/950).
