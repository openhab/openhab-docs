---
layout: documentation
title: 32563 - ZWave
---

{% include base.html %}

# 32563 Smart Door Sensor
This describes the Z-Wave device *32563*, manufactured by *Jasco Products* with the thing type UID of ```ge_smartdoorsensor_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![32563 product image](https://www.cd-jackson.com/zwave_device_uploads/504/504_default.png)


The 32563 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The 32563 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

#### Description

Whether you’re coming or going, your home is ready when you are with the Z-Wave Smart Door Sensor. Not only does the Smart Door Sensor efficiently eliminate household tasks as you go about your day, but remote monitoring allows you to feel secure once you’ve left home. By simply opening or closing your door, the sensor uses Z-Wave technology to wirelessly trigger scenes throughout your home. From your mobile device, you’re able to schedule lights to turn on as soon as you walk in and be notified of activity while you’re away. Simple installation uses your door’s existing hinge and pin, making setup a breeze. The sensor is discreetly designed to blend subtly into the frame of the door, adding the convenience of the Smart Door Sensor to your home without distracting from your household decor. Color-matching kits are also available, with options including white, dark brown and a paintable finish.

#### Features

  * Works on all standard doors using your existing hinge
  * Reversible for right and left door openings
  * Adjusts to fit door trim
  * Compatible with hinge pins up to 5/16" in diameter
  * CR2 battery included (battery lasts up to 2 years)
  * Color matching kits available

### Inclusion Information

  1. Follow the instructions for your Z-Wave certified controller to include the device to the Z-Wave network.
  2. Once the controller is ready to include your Hinge Pin Smart Door Sensor press and release the manual/program button on the smart switch to include it in the network.

### Exclusion Information

  1. Follow the instructions for your Z-Wave certified controller to exclude a device from the Z-Wave network. 
  2. Once the controller is ready to exclude your device, press and release the manual/program button on the Hinge Pin Smart Door Sensor to exclude it from the network.

You may wish to reset all of your Hinge Pin Smart Door Sensor's settings to their factory defaults. To do this, press the program button 10 times within 6 seconds. If your Door Sensor has been successfully reset, its LED light will blink for 3 seconds. This should only be used in the event your network’s primary controller is missing or otherwise inoperable.

### Wakeup Information

The 32563 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


  1. Press and hold the Z-wave Button for 6 seconds. It will be wake up and send “Wake Up Notification CC “ to HUB. 
  2. It will sleep after timeout for 10 seconds, or sleep right away when received the “Wake Up No More Information CC”. 

## Channels

The following table summarises the channels available for the 32563 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary |  | Switch | 
| Alarm (access) | alarm_access | alarm_access | Door | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Binary Sensor
Indicates if a sensor has triggered.

The ```sensor_binary``` channel is of type ```sensor_binary``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Alarm (access)
Indicates if the access control alarm is triggered.

The ```alarm_access``` channel is of type ```alarm_access``` and supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

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

The following table provides a summary of the 1 configuration parameters available in the 32563.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 20 | Report Method | Change Open/Close Report Method |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 20: Report Method

Change Open/Close Report Method
  1. Notification (Default)
  2. Basic Set
  3. Basic Report
Values in the range 1 to 3 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_20_1``` and is of type ```INTEGER```.

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

The 32563 supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Lifeline

Association group 1 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V2| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V4| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [Manual](https://www.cd-jackson.com/zwave_device_uploads/504/03d7fa20-e284-4093-b78a-d2ec8d255816-1-.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/504).
