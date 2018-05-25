---
layout: documentation
title: Multisensor - ZWave
---

{% include base.html %}

# Multisensor Multi-sensor
This describes the Z-Wave device *Multisensor*, manufactured by *Wintop* with the thing type UID of ```wintop_multisensor_00_000```.

# Overview


## Channels

The following table summarises the channels available for the Multisensor

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Binary Sensor | sensor_binary | Door | Switch | 
| Sensor (temperature) | sensor_temperature | Temperature | Number | 
| Alarm | alarm_general | Door | Switch | 
| Sensor (temperature) 1 | sensor_temperature1 | Temperature | Number | 
| Sensor (luminance) 2 | sensor_luminance2 | Temperature | Number | 

### Binary Sensor

The ```sensor_binary``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Sensor (temperature)

The ```sensor_temperature``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm

The ```alarm_general``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |

### Sensor (temperature) 1

The ```sensor_temperature1``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Sensor (luminance) 2

The ```sensor_luminance2``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.



## Device Configuration

The following table provides a summary of the 6 configuration parameters available in the Multisensor.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Set to default | Set all config values to default values (factory settings). |
| 2 | Mode Timeout | The time used in mode 2 to turn the sensor off . |
| 3 | Switch off time | Switch off time starts after timeout. |
| 4 | Sensitivity | The sensitivity of the motion circuit |
| 5 | Mode | The mode that is entered after detection |
| 6 | The temperature offset | An offset for the temperature. |

### Parameter 1: Set to default

Set all config values to default values (factory settings).

Values in the range 0 to 0 may be set.

The manufacturer defined default value is 0.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Mode Timeout

The time used in mode 2 to turn the sensor off .
The time used in mode 2 to turn the sensor off .

This Time will start running as soon as detection is seen.
Values in the range 0 to 3600 may be set.

The manufacturer defined default value is 900.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 3: Switch off time

Switch off time starts after timeout.
The switch off time will start running as soon as mode timeout is done. Motion sensor is turned on and when movement is de tected again the mode timeout (cfg param 1) will start running all over again. When switch off time is done a basic off message is s
Values in the range 0 to 7200 may be set.

The manufacturer defined default value is 2700.

This parameter has the configuration ID ```config_3_2``` and is of type ```INTEGER```.


### Parameter 4: Sensitivity

The sensitivity of the motion circuit

Values in the range 0 to 127 may be set.

The manufacturer defined default value is 80.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Mode

The mode that is entered after detection
Normal operation mode is default.
Values in the range 1 to 3 may be set.

The manufacturer defined default value is 2.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: The temperature offset

An offset for the temperature.
Param1,2: A signed integer to determine the offset off the temperature.
Values in the range -10 to 10 may be set.

The manufacturer defined default value is 0.

This parameter has the configuration ID ```config_6_2``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Multisensor supports 1 association group.

### Group 1: Group 1


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
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V1| Linked to BASIC|
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V1| Linked to BASIC|

---

Did you spot an error in the above definition or want to improve the content?
You can [edit the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/326).
