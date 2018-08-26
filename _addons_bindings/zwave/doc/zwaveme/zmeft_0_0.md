---
layout: documentation
title: ZME_FT - ZWave
---

{% include base.html %}

# ZME\_FT Floor Thermostat
This describes the Z-Wave device *ZME_FT*, manufactured by *Z-Wave.Me* with the thing type UID of ```zwaveme_zmeft_00_000```.

![ZME_FT product image](https://www.cd-jackson.com/zwave_device_uploads/151/151_default.png)


The ZME_FT supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/151) to improve the documentation.

## Channels

The following table summarises the channels available for the ZME_FT -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | Temperature | Number | 
| Thermostat mode | thermostat_mode | Temperature | Number | 
| Setpoint (heating) | thermostat_setpoint | Temperature | Number | 
| Setpoint (furnace) | thermostat_setpoint | Temperature | Number | 

### Sensor (temperature)

Indicates the current temperature.

The ```sensor_temperature``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Thermostat mode

Sets the thermostat.

The ```thermostat_mode``` channel supports the ```Number``` item and is in the ```Temperature``` category.
The following state translation is provided for this channel to the ```Number``` item type -:

| Value | Label     |
|-------|-----------|
| 0 | Off |
| 1 | Heat |
| 2 | Cool |
| 3 | Auto |
| 4 | Aux Heat |
| 5 | Resume |
| 6 | Fan Only |
| 7 | Furnace |
| 8 | Dry Air |
| 9 | Moist Air |
| 10 | Auto Changeover |
| 11 | Heat Economy |
| 12 | Cool Economy |
| 13 | Away |
| 15 | Full Power |
| 31 | Manufacturer Specific |

### Setpoint (heating)

Sets the thermostate setpoint.

The ```thermostat_setpoint``` channel supports the ```Number``` item and is in the ```Temperature``` category.

### Setpoint (furnace)

Sets the thermostate setpoint.

The ```thermostat_setpoint``` channel supports the ```Number``` item and is in the ```Temperature``` category.



## Device Configuration

The following table provides a summary of the 7 configuration parameters available in the ZME_FT.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Boost Dry mode duration |  |
| 2 | Button mode |  |
| 3 | Basic mode |  |
| 4 | Temperature control interval |  |
| 5 | Maximum allowed temperature deviation |  |
| 6 | Maximal allowed temperature | In all modes the thermostat will switch off heating until temperature drops below this limit. For wooden and laminate floor maximal allowed temperature is 27 degree. For tile and concrete floor maximal allowed temperature value is 45 degree. |
| 10 | Typical click timeout | Typical time used to differenciate click from hold |

### Parameter 1: Boost Dry mode duration



Values in the range 0 to 1800 may be set.

The manufacturer defined default value is ```1800```.

This parameter has the configuration ID ```config_1_2``` and is of type ```INTEGER```.


### Parameter 2: Button mode



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Toggle Normal Heating / Off |
| 1 | Toggle Normal Heating / Energy Save |
| 2 | Toggle Boost Dry |

The manufacturer defined default value is ```0``` (Toggle Normal Heating / Off).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Basic mode



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Toggle Normal Heating / Off |
| 1 | Toggle Normal Heating / Energy Save |
| 2 | Toggle Boost Dry |
| 3 | Set Normal Heating set point temperature (in 0.1 C units) |
| 4 | Switch on/off relay directly (only if Thermostat Mode is in Off state) |

The manufacturer defined default value is ```0``` (Toggle Normal Heating / Off).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Temperature control interval



Values in the range 1 to 60 may be set.

The manufacturer defined default value is ```18```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Maximum allowed temperature deviation



Values in the range 1 to 60 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Maximal allowed temperature

In all modes the thermostat will switch off heating until temperature drops below this limit. For wooden and laminate floor maximal allowed temperature is 27 degree. For tile and concrete floor maximal allowed temperature value is 45 degree.

Values in the range 20 to 55 may be set.

The manufacturer defined default value is ```27```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 10: Typical click timeout

Typical time used to differenciate click from hold

Values in the range 1 to 100 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZME_FT supports 1 association group.

### Group 1: Group 1

Unsolicited notifications about thermostat mode and setpoint temperature changes
This group supports 10 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V4| |
| COMMAND_CLASS_THERMOSTAT_MODE_V1| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_PROTECTION_V1| |
| COMMAND_CLASS_NODE_NAMING_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V1| |

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/151).
