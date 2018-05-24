---
layout: documentation
title: doorSensor - ZWave
---

{% include base.html %}

# doorSensor Door Sensor
This describes the Z-Wave device *doorSensor*, manufactured by *BeNext* with the thing type UID of ```benext_doorsensor_00_000```.

# Overview

## Channels
The following table summarises the channels available for the doorSensor

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Door Sensor | sensor_door | Door | Contact | 
| Sensor (temperature) | sensor_temperature | Temperature | Number | 
| Alarm (CO) | alarm_co | Door | Switch | 

### Door Sensor
The ```sensor_door``` channel supports the ```Contact``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Contact``` item type -:

| Value | Label     |
|-------|-----------|
| OPEN | Open |
| CLOSED | Closed |

### Sensor (temperature)
The ```sensor_temperature``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (CO)
The ```alarm_co``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |



## Device Configuration
The following table provides a summary of the 4 configuration parameters available in the doorSensor.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Reset to factory settings | Set all configuration values to default values (factory settings). |
| 2 | External contact behavior | Configure what the external contact sends when triggered. |
| 5 | Operating mode. | The main operating mode for the device. |
| 6 | Temperature offset | An offset for the temperature. |

### Parameter 1: Reset to factory settings
Set all configuration values to default values (factory settings).

Values in the range 0 to 255 may be set.

The manufacturer defined default value is 0.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: External contact behavior
Configure what the external contact sends when triggered.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Send alarm |
| 1 | Send basic frame |

The manufacturer defined default value is 0 (Send alarm).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 5: Operating mode.
The main operating mode for the device.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Normal |
| 2 | Mode 1 report |
| 3 | Always-on |

The manufacturer defined default value is 1 (Normal).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Temperature offset
An offset for the temperature.

Values in the range -32768 to 32767 may be set.

The manufacturer defined default value is 0.

This parameter has the configuration ID ```config_6_2``` and is of type ```INTEGER```.


## Association Groups
Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The doorSensor supports 2 association groups.

### Group 1: Send frame to every node in this group (internal contact)

This group supports 5 nodes.

### Group 2: Send frame to every node in this group (external contact)

This group supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SENSOR_MULTILEVEL_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

---

Did you spot an error in the above definition or want to improve the content?
You can [edit the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/223).
