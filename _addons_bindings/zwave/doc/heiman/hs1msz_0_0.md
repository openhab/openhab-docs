---
layout: documentation
title: HS1MS-Z - ZWave
---

{% include base.html %}

# HS1MS-Z Smart Motion Sensor
This describes the Z-Wave device *HS1MS-Z*, manufactured by *[Heiman Technology Co. Ltd](http://www.heimantech.com/)* with the thing type UID of ```heiman_hs1msz_00_000```.

The device is in the category of Motion Detector, defining Motion sensors/detectors.

# Overview

The smart motion sensor is designed to detect motion indoors. When the smart motion sensor detects people or animals moving, it will report the information thru Z-Wave protocol.

## Inclusion Information

- Press button on the back 3 times, Green LED is Blinking 3 times within 1 second.
- If Inclusion Process is successful, Green LED will turn off.

## Exclusion Information

- Press back button 3 times quickly.
- If Exclusion Process is successful, Green LED is Blinking 6 times, then remove battery from HS1MS-Z.

## Wakeup Information

- Wake up Notification is transmitted every 24 hours by default.
- Wake up Notification is transmitted after Notification Report is Transmitted.

## Channels

The following table summarises the channels available for the HS1MS-Z

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Binary Sensor | sensor_binary | Door | Switch | 
| Alarm (burglar) | alarm_burglar | Door | Switch | 

### Binary Sensor

Indicates if a sensor has triggered
        

The ```sensor_binary``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Alarm (burglar)

Indicates if the burglar alarm is triggered
        

The ```alarm_burglar``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |



## Device Configuration

The device has no configuration parameters configured.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The HS1MS-Z supports 1 association group.

### Group 1: Lifeline


This group supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V2| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ALARM_V4| Linked to BASIC|
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

---

Did you spot an error in the above definition or want to improve the content?
You can [edit the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/736).
