---
layout: documentation
title: HS1SA-Z - ZWave
---

{% include base.html %}

# HS1SA-Z Smart Smoke Detector
This describes the Z-Wave device *HS1SA-Z*, manufactured by *[Heiman Technology Co. Ltd](http://www.heimantech.com/)* with the thing type UID of ```heiman_hs1sa_00_000```.

The device is in the category of *Smoke Detector*, defining Smoke detectors.

![HS1SA-Z product image](https://www.cd-jackson.com/zwave_device_uploads/530/530_default.jpg)


The HS1SA-Z supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The HS1SA-Z does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour. The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.

## Overview

The smart smoke sensor detects smoke, and sends an alarm signals to alert of danger. When the smart smoke sensor detects smoke, it will send an alarm notification to your controller through wireless Z-Wave communication protocol.

### Inclusion Information

- Press the pin 3 times within 1.5s, Green LED is Blinking 3 times within 1 second.
- If Inclusion Process is successful, Green led will turn off.

### Exclusion Information

- Press the pin 3 times within 1.5s.
- If Exclusion Process is successful, Green led is Blinking 6 times, then turn off.

### Wakeup Information

- Wake up Notification is transmitted every 24 hours by default.
- Wake up Notification is transmitted after Notification Report is Transmitted.

## Channels

The following table summarises the channels available for the HS1SA-Z -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Binary Sensor | sensor_binary | Door | Switch | 
| Alarm (smoke) | alarm_smoke | Door | Switch | 
| Battery Level | battery-level | Battery | Number |

### Binary Sensor

Indicates if a sensor has triggered.

The ```sensor_binary``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Alarm (smoke)

Indicates if a smoke is triggered.

The ```alarm_smoke``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |

### Battery Level

Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```battery-level``` channel supports the ```Number``` item and is in the ```Battery``` category.



## Device Configuration

The device has no configuration parameters configured.

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

### Documentation Links

* [HS1SA-Z](https://www.cd-jackson.com/zwave_device_uploads/530/HS1SAZ-3381756.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/530).
