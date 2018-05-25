---
layout: documentation
title: Z-Weather - ZWave
---

{% include base.html %}

# Z-Weather Z-Wave weather interface
This describes the Z-Wave device *Z-Weather*, manufactured by *Z-Wave.Me* with the thing type UID of ```zwaveme_zweather_00_000```.

# Overview


## Channels

The following table summarises the channels available for the Z-Weather

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Binary Sensor | sensor_binary | Door | Switch | 
| Sensor (luminance) | sensor_luminance | Temperature | Number | 
| Sensor (velocity) | sensor_velocity |  | Number | 
| Sensor (barometric pressure) | sensor_barpressure | Temperature | Number | 
| Sensor (temperature) | sensor_temperature | Temperature | Number | 
| Sensor (relative humidity) | sensor_relhumidity | Humidity | Number | 
| Sensor (dew point) | sensor_dewpoint | Temperature | Number | 
| Electric meter (pulses) | meter_pulse | Energy | Number | 
| Electric meter (kWh) | meter_kwh | Energy | Number | 

### Binary Sensor

The ```sensor_binary``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Sensor (luminance)

The ```sensor_luminance``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Sensor (velocity)

The ```sensor_velocity``` channel supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Sensor (barometric pressure)

The ```sensor_barpressure``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Sensor (temperature)

The ```sensor_temperature``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Sensor (relative humidity)

The ```sensor_relhumidity``` channel supports the ```Number``` item and is in the ```Humidity``` category. This is a read only channel so will only be updated following state changes from the device.

### Sensor (dew point)

The ```sensor_dewpoint``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (pulses)

The ```meter_pulse``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)

The ```meter_kwh``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.



## Device Configuration

The following table provides a summary of the 2 configuration parameters available in the Z-Weather.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Wind Speed Action Threshold | Available Parameters: 0 - Off 1 - 30 in milliseconds Default = 6 m/s |
| 2 | Twilight Action Threshold | Set from 0 - 100 % Default = 37% (street lighting) |

### Parameter 1: Wind Speed Action Threshold

Available Parameters: 0 - Off 1 - 30 in milliseconds Default = 6 m/s

Values in the range 0 to 30 may be set.

The manufacturer defined default value is 6.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Twilight Action Threshold

Set from 0 - 100 % Default = 37% (street lighting)

Values in the range 0 to 100 may be set.

The manufacturer defined default value is 37.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Z-Weather supports 4 association groups.

### Group 1: Life Line


This group supports 1 nodes.

### Group 2: Wind Speed

Wind speed is higher than 6 m/s (22 Km/h)
This group supports 5 nodes.

### Group 3: End of Dawn

At the end of the dawn if it becomes bright
This group supports 5 nodes.

### Group 4: End of Dusk

At the end of the dusk if it becomes bright
This group supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V0| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V6| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_LANGUAGE_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V0| |
| COMMAND_CLASS_MULTI_CMD_V1| |
| COMMAND_CLASS_ASSOCIATION_COMMAND_CONFIGURATION_V0| |

---

Did you spot an error in the above definition or want to improve the content?
You can [edit the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/258).
