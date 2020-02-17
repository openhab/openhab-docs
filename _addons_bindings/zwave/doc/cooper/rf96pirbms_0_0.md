---
layout: documentation
title: RF96PIRBMS - ZWave
---

{% include base.html %}

# RF96PIRBMS Motion Sensor
This describes the Z-Wave device *RF96PIRBMS*, manufactured by *Cooper Wiring Devices* with the thing type UID of ```cooper_rf96pirbms_00_000```.

The device is in the category of *Motion Detector*, defining Motion sensors/detectors.

![RF96PIRBMS product image](https://www.cd-jackson.com/zwave_device_uploads/1210/1210_default.jpg)


The RF96PIRBMS supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The RF96PIRBMS does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

Z-Wave Plus Wireless Motion Sensor, with 120 degree field of view & 1000 sq. ft coverage, detects motion in a space with in-built Passive Infra-red & light sensor.

### Inclusion Information

The sensor supports Auto Inclusion feature where it will automatically enter Inclusion mode when first powered up after a factory reset.

 Manual Inclusion:

  * Put the Z-Wave Controller into Inclusion mode
  * Press the tamper switch 3 times within 1.5 seconds to put the unit into inclusion mode

### Exclusion Information

  * 1. Put the Z-Wave Controller into Exclusion mode
  * 2. Press the tamper switch 3 times within 1.5 seconds to put the unit into exclusion mode

### Wakeup Information

The RF96PIRBMS does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


To save power for the battery, the motion sensor is normally in sleep mode. In order to wake the device up, press the tamper switch once. This will keep the device awake for 30 seconds indicated by the LED blinking every second.

While this is the official wakeup procedure in the device manual, it did not work.  Pressing the tamper switch 5 to 6 times quickly did wake the device up.

## Channels

The following table summarises the channels available for the RF96PIRBMS -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Alarm (power)
Indicates if a power alarm is triggered.

The ```alarm_power``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

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

The following table provides a summary of the 5 configuration parameters available in the RF96PIRBMS.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Basic Set Level | Basic Set Level |
| 3 | Sensitivity Level | Sensitivity Level |
| 4 | Re-trigger Interval Setting | Re-trigger Interval Setting |
| 5 | Lux Level | Lux Level |
| 6 | On-Off Duration | On-Off Duration |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: Basic Set Level

Basic Set Level

Values in the range 1 to 99 may be set.

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 3: Sensitivity Level

Sensitivity Level

Values in the range 1 to 10 may be set.

The manufacturer defined default value is ```6```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Re-trigger Interval Setting

Re-trigger Interval Setting

Values in the range 5 to 3600 may be set.

The manufacturer defined default value is ```180```.

This parameter has the configuration ID ```config_4_2``` and is of type ```INTEGER```.


### Parameter 5: Lux Level

Lux Level

Values in the range 1 to 100 may be set.

The manufacturer defined default value is ```20```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: On-Off Duration

On-Off Duration

Values in the range 5 to 3600 may be set.

The manufacturer defined default value is ```15```.

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

The RF96PIRBMS supports 2 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 1 node.

### Group 2: PIR Control


Association group 2 supports 4 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V4| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [RF96PIRBMS Manual](https://www.cd-jackson.com/zwave_device_uploads/1210/RF96PIRBMS-Manual-.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1210).
