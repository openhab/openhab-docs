---
layout: documentation
title: ZWN-BDS - ZWave
---

{% include base.html %}

# ZWN-BDS Magnetic Door/Window Sensor
This describes the Z-Wave device *ZWN-BDS*, manufactured by *Wenzhou MTLC Electric Appliances Co.,Ltd.* with the thing type UID of ```enerwave_zwnbds_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![ZWN-BDS product image](https://www.cd-jackson.com/zwave_device_uploads/834/834_default.png)


The ZWN-BDS supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The ZWN-BDS does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

The ZWN-BDS is a battery-powered, magnetic contact sensor that wirelessly controls lights and appliances throughout your house. When the magnetic contact is broken, such as happens when a door or window is opened, the ZWN-BDS transmits Open/Close status to the gateway.

### Inclusion Information

_At the back of the door/window sensor, there is a program button which is used to do adding/deleting and association. Also it can be userd as a tamper alarm button, and wake up the door/window sensor manually._

**Inclusion**

  1. Set a Z-Wave controller into inclusion mode
  2. Press and release the program button located at the back of the door/window sensor to add it into your Z-Wave network and send a Node Information Frame.
  3. The status LED will stay solid for 10 seconds and turn off once inclusion is successful.
  4. If the LED never turns on and the inclusion mode times out, then repeat the inclusion process again, and exclude if necessary.

### Exclusion Information

_At the back of the door/window sensor, there is a program button which is used to do adding/deleting and association. Also it can be userd as a tamper alarm button, and wake up the door/window sensor manually._

**Exclusion**

  1. Set the Z-Wave controller into exclusion mode.
  2. Press and release the program button located at the back of the door/window sensor to exclude it from your Z-Wave network and remove the Node Information Frame.
  3. The status LED will blink 3 times after releasing the program button, which means it's no longer associated with any Z-Wave network.

### Wakeup Information

The ZWN-BDS does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


To complete Z-Wave association, please refer to your controller's manual. Each controller has its own association method. **If your controller needs the sensor to wake up, press and hold the program button for 2 seconds, release the button when the status LED turns off, and the ZWN-BDS will wake up manually.**

## Channels

The following table summarises the channels available for the ZWN-BDS -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary |  | Switch | 
| Alarm (general) | alarm_general | alarm_general | Alarm | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Binary Sensor
Indicates if a sensor has triggered.

The ```sensor_binary``` channel is of type ```sensor_binary``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Alarm (general)
Indicates if an alarm is triggered.

The ```alarm_general``` channel is of type ```alarm_general``` and supports the ```Switch``` item and is in the ```Alarm``` category. This is a read only channel so will only be updated following state changes from the device.

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

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZWN-BDS supports 1 association group.

### Group 1: Group 1


Association group 1 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V1| |
| COMMAND_CLASS_ALARM_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_SENSOR_ALARM_V1| |

### Documentation Links

* [ZWN-BDS Instruction Manual](https://www.cd-jackson.com/zwave_device_uploads/834/ZWN-BDS-Insturction-Manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/834).
