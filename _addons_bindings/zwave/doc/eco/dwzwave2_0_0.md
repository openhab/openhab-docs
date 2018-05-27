---
layout: documentation
title: DWZWAVE2 - ZWave
---

{% include base.html %}

# DWZWAVE2 Z-Wave Door/Window Sensor
This describes the Z-Wave device *DWZWAVE2*, manufactured by *Ecolink* with the thing type UID of ```eco_dwzwave2_00_000```.

![DWZWAVE2 product image](https://www.cd-jackson.com/zwave_device_uploads/138/138_default.jpg)


## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/138) to improve the documentation.

## Channels

The following table summarises the channels available for the DWZWAVE2

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Binary Sensor | sensor_door | Door | Contact | 
| Alarm | alarm_general | Door | Switch | 
| battery-level | system.battery-level | Battery | Number |

### Binary Sensor

Indicates if the door/window is open or closed
        

The ```sensor_door``` channel supports the ```Contact``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Contact``` item type -:

| Value | Label     |
|-------|-----------|
| OPEN | Open |
| CLOSED | Closed |

### Alarm

Indicates if an alarm is triggered
        

The ```alarm_general``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |

### Battery Level

Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel supports the ```Number``` item and is in the ```Battery``` category.



## Device Configuration

The device has no configuration parameters configured.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The DWZWAVE2 supports 2 association groups.

### Group 1: Group 1

Association Group 1
This group supports 5 nodes.

### Group 2: Group 2

Association Group 2
This group supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V2| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V2| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/138/Ecolink-DWZWAVE2-ECO-manual-rev1.pdf)
* [Ecolink Z-Wave Sensor Z-Wave Command Class Specification](https://www.cd-jackson.com/zwave_device_uploads/138/Advanced-Zwave-Configuration-v2.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/138).
