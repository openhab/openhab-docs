---
layout: documentation
title: SmoothRemote - ZWave
---

{% include base.html %}

# SmoothRemote SmoothRemote
This describes the Z-Wave device *SmoothRemote*, manufactured by *INNOVUS* with the thing type UID of ```innovus_smoothremote_00_000```.

The SmoothRemote does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour. The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/440) to improve the documentation.

## Channels

The following table summarises the channels available for the SmoothRemote -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Battery Level | battery-level | Battery | Number |

### Battery Level

Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```battery-level``` channel supports the ```Number``` item and is in the ```Battery``` category.



## Device Configuration

The following table provides a summary of the 4 configuration parameters available in the SmoothRemote.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 0 | Button Press Time | Button Press Time, time for presses on a single button to register as seperate and not part of a sequence, measured in 0.01s. 0 is interpreted as a 1. |
| 1 | Button Multiple Press Time | Button Multiple Press Time, time for presses on multiple buttons to register as seperate and not part of a sequence, measured in 0.01 s. 0 is interpreted as a 1. |
| 2 | Button Hold Time | Button Hold Time, time for presses to register as being held down in 0.01s. 0 is interpreted as a 1. |
| 3 | Network Update Interval | Network Update Interval, time between network updates in 256 seconds. Disabled if 0. |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 0: Button Press Time

Button Press Time, time for presses on a single button to register as seperate and not part of a sequence, measured in 0.01s. 0 is interpreted as a 1.
Warning: All Configuration values have serious effects on the functioning of the device and as such shouldn't be changed unless one is certain of the consequences.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_0_1``` and is of type ```INTEGER```.


### Parameter 1: Button Multiple Press Time

Button Multiple Press Time, time for presses on multiple buttons to register as seperate and not part of a sequence, measured in 0.01 s. 0 is interpreted as a 1.
Warning: All Configuration values have serious effects on the functioning of the device and as such shouldn't be changed unless one is certain of the consequences.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Button Hold Time

Button Hold Time, time for presses to register as being held down in 0.01s. 0 is interpreted as a 1.
Warning: All Configuration values have serious effects on the functioning of the device and as such shouldn't be changed unless one is certain of the consequences.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```40```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Network Update Interval

Network Update Interval, time between network updates in 256 seconds. Disabled if 0.
Warning: All Configuration values have serious effects on the functioning of the device and as such shouldn't be changed unless one is certain of the consequences.
Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```168```.

This parameter has the configuration ID ```config_3_2``` and is of type ```INTEGER```.

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

The device does not support associations.
## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [Technical manual](https://www.cd-jackson.com/zwave_device_uploads/440/smoothremote-00120001-tech.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/440).
