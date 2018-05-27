---
layout: documentation
title: ZWN-BDS - ZWave
---

{% include base.html %}

# ZWN-BDS Magnetic Door/Window Sensor
This describes the Z-Wave device *ZWN-BDS*, manufactured by *Wenzhou MTLC Electric Appliances Co.,Ltd.* with the thing type UID of ```enerwave_zwnbds_00_000```.

The device is in the category of Sensor, defining Device used to measure something.

# Overview

The ZWN-BDS is a battery-powered, magnetic contact sensor that wirelessly controls lights and appliances throughout your house. When the magnetic contact is broken, such as happens when a door or window is opened, the ZWN-BDS transmits Open/Close status to the gateway.

## Inclusion Information

_At the back of the door/window sensor, there is a program button which is used to do adding/deleting and association. Also it can be userd as a tamper alarm button, and wake up the door/window sensor manually._

**Inclusion**

1. Set a Z-Wave controller into inclusion mode
2. Press and release the program button located at the back of the door/window sensor to add it into your Z-Wave network and send a Node Information Frame.
3. The status LED will stay solid for 10 seconds and turn off once inclusion is successful.
4. If the LED never turns on and the inclusion mode times out, then repeat the inclusion process again, and exclude if necessary.

## Exclusion Information

_At the back of the door/window sensor, there is a program button which is used to do adding/deleting and association. Also it can be userd as a tamper alarm button, and wake up the door/window sensor manually._

**Exclusion**

1. Set the Z-Wave controller into exclusion mode.
2. Press and release the program button located at the back of the door/window sensor to exclude it from your Z-Wave network and remove the Node Information Frame.
3. The status LED will blink 3 times after releasing the program button, which means it's no longer associated with any Z-Wave network.

## Wakeup Information

To complete Z-Wave association, please refer to your controller's manual. Each controller has its own association method. **If your controller needs the sensor to wake up, press and hold the program button for 2 seconds, release the button when the status LED turns off, and the ZWN-BDS will wake up manually.**

## Channels

The following table summarises the channels available for the ZWN-BDS

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Binary Sensor | sensor_binary | Door | Switch | 
| Alarm (general) | alarm_general | Door | Switch | 
| Alarm (general) | alarm_general | Door | Switch | 

### Binary Sensor

Indicates if a sensor has triggered
        

The ```sensor_binary``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Alarm (general)

Indicates if an alarm is triggered
        

The ```alarm_general``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |

### Alarm (general)

Indicates if an alarm is triggered
        

The ```alarm_general``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |



## Device Configuration

The device has no configuration parameters configured.

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
| COMMAND_CLASS_SENSOR_BINARY_V1| |
| COMMAND_CLASS_ALARM_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_SENSOR_ALARM_V1| |

---

Did you spot an error in the above definition or want to improve the content?
You can [edit the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/834).
