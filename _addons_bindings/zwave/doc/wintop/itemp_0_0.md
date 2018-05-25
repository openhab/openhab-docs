---
layout: documentation
title: ITEMP - ZWave
---

{% include base.html %}

# ITEMP Contact and temperature sensor
This describes the Z-Wave device *ITEMP*, manufactured by *Wintop* with the thing type UID of ```wintop_itemp_00_000```.

The device is in the category of Sensor, defining Device used to measure something.

# Overview


## Channels

The following table summarises the channels available for the ITEMP

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Binary Sensor | sensor_binary | Door | Switch | 
| Sensor (temperature) | sensor_temperature | Temperature | Number | 
| Alarm (CO2) | alarm_co2 | Door | Switch | 

### Binary Sensor

The ```sensor_binary``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Sensor (temperature)

The ```sensor_temperature``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (CO2)

The ```alarm_co2``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 4 configuration parameters available in the ITEMP.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Reset to factory default | Delete configuration but keeps inclusion |
| 2 | Command sent on external dry contact | Configure what te external contact sends when trigger |
| 5 | Operating Mode | Defines if the sensor is in normal wakeup mode or always on (drains battery fast) |
| 6 | Temperature Offset | Can be used to calibrate the temperature sensors function. Calibrated as factory default. |

### Parameter 1: Reset to factory default

Delete configuration but keeps inclusion

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No (default) |
| 1 | Execute reset |

The manufacturer defined default value is 0 (No (default)).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Command sent on external dry contact

Configure what te external contact sends when trigger

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Alarm Resport Type 2 (default) |
| 1 | Basic On or Basic Off |

The manufacturer defined default value is 0 (Alarm Resport Type 2 (default)).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 5: Operating Mode

Defines if the sensor is in normal wakeup mode or always on (drains battery fast)

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Normal Wakeup (default) |
| 3 | Always awake |

The manufacturer defined default value is 1 (Normal Wakeup (default)).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Temperature Offset

Can be used to calibrate the temperature sensors function. Calibrated as factory default.

Values in the range 0 to 15300 may be set.

The manufacturer defined default value is 0.

This parameter has the configuration ID ```config_6_2``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ITEMP supports 2 association groups.

### Group 1: Binary input Group


This group supports 5 nodes.

### Group 2: Alarm Group


This group supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V1| |
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
You can [edit the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/216).
