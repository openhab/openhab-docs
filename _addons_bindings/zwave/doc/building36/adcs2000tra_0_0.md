---
layout: documentation
title: ADC-S2000-T-RA - ZWave
---

{% include base.html %}

# ADC-S2000-T-RA Temperature Sensor
This describes the Z-Wave device *ADC-S2000-T-RA*, manufactured by *Building 36 Technologies* with the thing type UID of ```building36_adcs2000tra_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![ADC-S2000-T-RA product image](https://www.cd-jackson.com/zwave_device_uploads/931/931_default.jpg)


The ADC-S2000-T-RA supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The ADC-S2000-T-RA does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

Provides temperature reading from another location so Smart Thermostat can take smarter actions to maximize comfort and energy saving.

### Inclusion Information

Press the Pairing button on the Temperature Sensor to add it to the Z-Wave network.You will see the light on the Temperature Sensor turn solid white when it has been successfully added.

### Exclusion Information

Press the Pairing button on the Temperature Sensor to delete it from the Z-Wave network. The light on the Temperature Sensor will start flashing to indicate it has been successfully deleted.

### Wakeup Information

The ADC-S2000-T-RA does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


Every 4 hours.

## Channels

The following table summarises the channels available for the ADC-S2000-T-RA -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary |  | Switch | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Binary Sensor
Indicates if a sensor has triggered.

The ```sensor_binary``` channel is of type ```sensor_binary``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The device has no configuration parameters defined.

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
| COMMAND_CLASS_SENSOR_MULTILEVEL_V4| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [User Guide](https://www.cd-jackson.com/zwave_device_uploads/931/Alarm-com-Temperature-Sensor-ADC-S2000-T-RA-User-Guide.pdf)
* [Installation Guide](https://www.cd-jackson.com/zwave_device_uploads/931/Alarm-com-Temperature-Sensor-ADC-S2000-T-RA-Installation-Guide.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/931).
