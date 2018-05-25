---
layout: documentation
title: HS1SA-Z - ZWave
---

{% include base.html %}

# HS1SA-Z Smart Smoke Detector
This describes the Z-Wave device *HS1SA-Z*, manufactured by *Heiman Technology Co. Ltd* with the thing type UID of ```heiman_hs1sa_00_000```.

The device is in the category of Smoke Detector, defining Smoke detectors.

# Overview

The smart smoke sensor detects smoke, and sends an alarm signals to alert of danger. When the smart smoke sensor detects smoke, it will send an alarm notification to your controller through wireless Z-Wave communication protocol.

## Inclusion Information

- Press the pin 3 times within 1.5s, Green LED is Blinking 3 times within 1 second.
- If Inclusion Process is successful, Green led will turn off.

## Exclusion Information

- Press the pin 3 times within 1.5s.
- If Exclusion Process is successful, Green led is Blinking 6 times, then turn off.

## Wakeup Information

- Wake up Notification is transmitted every 24 hours by default.
- Wake up Notification is transmitted after Notification Report is Transmitted.

## Channels

The following table summarises the channels available for the HS1SA-Z

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Binary Sensor | sensor_binary | Door | Switch | 
| Alarm (smoke) | alarm_smoke | Door | Switch | 

### Binary Sensor

The ```sensor_binary``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Alarm (smoke)

The ```alarm_smoke``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |



## Device Configuration

The device has no configuration parameters configugured.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The HS1SA-Z supports 3 association groups.

### Group 1: Lifeline

Battery, Notification, Reset locally Notification, Binary report
This group supports 1 nodes.

### Group 2: Root device Group (binary sensor)

Binary smoke sensor via lifeline and on status Chance of smoke detection
This group supports 5 nodes.

### Group 3: Root device Group (notification)

smoke status as notification report and on status change of smoke detection
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
You can [edit the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/530).
