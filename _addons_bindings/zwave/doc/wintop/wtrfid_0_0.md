---
layout: documentation
title: WTRFID - ZWave
---

{% include base.html %}

# WTRFID Mini Keypad RFID/Z-Wave
This describes the Z-Wave device *WTRFID*, manufactured by *Wintop* with the thing type UID of ```wintop_wtrfid_00_000```.

![WTRFID product image](https://www.cd-jackson.com/zwave_device_uploads/217/217_default.jpg)


The WTRFID supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The WTRFID does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

### Wakeup Information

The WTRFID does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.
## Channels

The following table summarises the channels available for the WTRFID -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 
| Alarm (burglar) | alarm_burglar | Door | Switch | 
| Alarm (access) | notification_access_control |  | Number | 
| Battery Level | battery-level | Battery | Number |

### Switch

Switch the power on and off.

The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Alarm (burglar)

Indicates if the burglar alarm is triggered.

The ```alarm_burglar``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |

### Alarm (access)

Event ID 5 = Away

Event ID 6 = Home

Access Control.

The ```notification_access_control``` channel supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Number``` item type -:

| Value | Label     |
|-------|-----------|
| 0 | Previous Events cleared |
| 1 | Manual Lock Operation |
| 2 | Manual Unlock Operation |
| 3 | RF Lock Operation |
| 4 | RF Unlock Operation |
| 5 | Keypad Lock Operation |
| 6 | Keypad Unlock Operation |
| 7 | Manual Not Fully Locked Operation |
| 8 | RF Not Fully Locked Operation |
| 9 | Auto Lock Locked Operation |
| 10 | Auto Lock Not Fully Operation |
| 11 | LockJammed |
| 12 | All user codes deleted |
| 13 | Single user code deleted |
| 14 | New user code added |
| 15 | New user code not added due to duplicate code |
| 16 | Keypad temporary disabled |
| 17 | Keypad busy |
| 18 | New Program code Entered- Unique code for lock configuration |
| 19 | Manually Enter user Access code exceeds code limit |
| 20 | Unlock by RF with invalid user code |
| 21 | Locked by RF with invalid user code |
| 22 | Window/Door is open |
| 23 | Window/Door is closed |
| 64 | Barrier performing initialization process |
| 65 | Barrier operation (Open / Close) force has been exceeded |
| 66 | Barrier motor has exceeded manufacturer's operational time limit |
| 67 | Barrier operation has exceeded physical mechanical limits |
| 68 | Barrier unable to perform requested operation due to UL requirements |
| 69 | Barrier Unattended operation has been disabled per UL requirements |
| 70 | Barrier failed to perform Requested operation, device malfunction |
| 71 | Barrier Vacation Mode |
| 72 | Barrier Safety Beam Obstacle |
| 73 | Barrier Sensor Not Detected / Supervisory Error |
| 74 | Barrier Sensor Low Battery Warning |
| 75 | Barrier detected short in WallStation wires |
| 76 | Barrier associated with non-Z-wave remote control |

### Battery Level

Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```battery-level``` channel supports the ```Number``` item and is in the ```Battery``` category.



## Device Configuration

The following table provides a summary of the 5 configuration parameters available in the WTRFID.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Set to Default | Set all configuration values to default values (factory settings). |
| 2 | Audible feedback config | To configure the time the beep is automatically turned off in seconds. |
| 3 | Feedback timeout | Feedback timeout |
| 4 | Feedback beeps per Second | To configure the number of beeps per second. Every beep is fixed about 10ms. |
| 5 | Mode | Configure the operating mode |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: Set to Default

Set all configuration values to default values (factory settings).

Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Audible feedback config

To configure the time the beep is automatically turned off in seconds.
The Mini Keypad RFiD/Z-Wave supports 3 types of notification sound configurations:

1 | Notification sound disabled (configuration parameter 2 set to zero)

2 | Notification sound enabled (default, configuration parameter 2 set to auto-stop time).
Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```15```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Feedback timeout

Feedback timeout
To configure the timeout to wait for a WAKEUP\_NO\_MORE\_INFORMATION before the error beep is automatically sound. The error beeps are fixed 8 beeps shortly after each other.

0 -> disabled
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Feedback beeps per Second

To configure the number of beeps per second. Every beep is fixed about 10ms.

Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Mode

Configure the operating mode
To configure the operating mode. If any mode other then 3, that value will be reported after a get but will be handled in SW as mode 1.

5 | The mode DESCRIPTION: To configure the operating mode. DEFAULT: 0x01 SIZE: 1 byte\* PARAM1: MODE 1: Normal operating mode. MODE 3: Z-Wave chip is always on to request e.g. version or manufacturer id. If any mode other then 3, that value will be reported after a get but will be handled in SW as mode 1. PARAM2,3: not used.
Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.

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

The WTRFID supports 1 association group.

### Group 1: Group1


This group supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_USER_CODE_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V2| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_LOCK_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [Installation Instructions](https://www.cd-jackson.com/zwave_device_uploads/217/Zipato-Zwave-RFID-Tag-Reader-Installation.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/217).
