---
layout: documentation
title: DX1CG-Z - ZWave
---

{% include base.html %}

# DX1CG-Z CH4 Gas Sensor
This describes the Z-Wave device *DX1CG-Z*, manufactured by *[Heiman Technology Co. Ltd](http://www.heimantech.com/)* with the thing type UID of ```heiman_dx1cgz_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

The DX1CG-Z supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/682) to improve the documentation.

## Channels

The following table summarises the channels available for the DX1CG-Z -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Alarm | alarm_general | Door | Switch | 

### Alarm

Indicates if an alarm is triggered.

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
| COMMAND_CLASS_ALARM_V1| Linked to BASIC|
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/682).
