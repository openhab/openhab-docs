---
layout: documentation
title: TILTZWAVE5 - ZWave
---

{% include base.html %}

# TILTZWAVE5 Z-Wave Plus Garage Door Tilt Sensor
This describes the Z-Wave device *TILTZWAVE5*, manufactured by *Ecolink* with the thing type UID of ```eco_tiltzwave5_00_000```.

The device is in the category of *Garage Door*, defining Garage Door.

![TILTZWAVE5 product image](https://opensmarthouse.org/zwavedatabase/1454/image/)


The TILTZWAVE5 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The TILTZWAVE5 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

The accelerometer based tilt sensor remotely monitors garages, hatches, roll-up doors, or any other tilt surface. Verify doors are closed when you leave, and automate lights to turn on inside your home when you arrive, all from your computer, tablet or smart phone.

### Inclusion Information

To include the device in a network both the device and the network controller must be in inclusion mode at the same time. Refer to the instructions provided by the manufacturer of your specific controller for details on initiating the controller’s inclusion mode.

  1. Verify that the Z-Wave Plus controller you are using is compatible with the Z-Wave Plus Tilt Sensor.
  2. Put your Z-Wave Plus Controller into add (inclusion) mode.
  3. Insert the battery and press the learn button on the tilt sensor.
  4. The LED on the front of the unit will turn off if network inclusion is successful.

### Exclusion Information

  1. Any Z-Wave Plus Device can be removed from any Z-Wave Plus controller. Follow the directions to put your Z-Wave Plus Controller into exclusion mode.
  2. Press the inclusion / exclusion button on the Z-Wave Plus Tilt Sensor.
  3. The LED in front of the unit will blink steadily if the network exclusion is successful.

### Wakeup Information

The TILTZWAVE5 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.




### General Usage Information

The Z-Wave Plus Tilt Sensor can be factory defaulted by pressing and holding the factory reset button for 5 seconds.

## Channels

The following table summarises the channels available for the TILTZWAVE5 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

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

The following table provides a summary of the 4 configuration parameters available in the TILTZWAVE5.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Number of application level retries | Number of attempts the device should attempt application level retries. |
| 2 | milliseconds between application levels retries | Number of milliseconds between application levels retries. |
| 3 | Tilt angle at which the garage door is considered closed | The tilt angle at which the garage door is considered closed. |
| 4 | Tilt angle at which the garage door is considered opened | The tilt angle at which the garage door is considered opened. |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: Number of application level retries

Number of attempts the device should attempt application level retries.
Number of attempts the device should attempt application level retries.
Values in the range 0 to 10 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: milliseconds between application levels retries

Number of milliseconds between application levels retries.
Number of milliseconds between application levels retries.
Values in the range 10 to 5000 may be set.

The manufacturer defined default value is ```500```.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 3: Tilt angle at which the garage door is considered closed

The tilt angle at which the garage door is considered closed.
The tilt angle at which the garage door is considered closed.

Byte value 0: 10 degrees

Byte value 1: 30 degrees

Byte value 2: 50 degrees
The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | 10 degrees |
| 1 | 30 degrees |
| 2 | 50 degrees |

The manufacturer defined default value is ```0``` (10 degrees).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Tilt angle at which the garage door is considered opened

The tilt angle at which the garage door is considered opened.
The tilt angle at which the garage door is considered opened.

Byte value 0: 30 degrees

Byte value 1: 50 degrees

Byte value 2: 70 degrees
The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | 30 degrees |
| 1 | 50 degrees |
| 2 | 70 degrees |

The manufacturer defined default value is ```0``` (30 degrees).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.

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

The TILTZWAVE5 supports 2 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Lifeline
Basic Reports with value 0x00 (door is closed) and 0xFF (door is opened)

Association group 1 supports 5 nodes.

### Group 2: Unknown

Unknown
Unknown

Association group 2 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_SECURITY_V1| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [Manual](https://opensmarthouse.org/zwavedatabase/1454/reference/tiltzwave5.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1454).
