---
layout: documentation
title: HRT4-ZW - ZWave
---

{% include base.html %}

# HRT4-ZW Battery Powered Wall Thermostat
This describes the Z-Wave device *HRT4-ZW*, manufactured by *Horstmann Controls Limited* with the thing type UID of ```horstmann_hrt4zw_00_000```.

The device is in the category of HVAC, defining Air condition devices, Fans.

# Overview
**Note**: This device is also sold as Secure SRT321

## Channels
The following table summarises the channels available for the HRT4-ZW

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 
| Sensor (temperature) | sensor_temperature | Temperature | Number | 
| Thermostat mode | thermostat_mode | Temperature | Number | 
| Setpoint (heating) | thermostat_setpoint | Temperature | Number | 

### Switch
The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Sensor (temperature)
The ```sensor_temperature``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Thermostat mode
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
The ```thermostat_setpoint``` channel supports the ```Number``` item and is in the ```Temperature``` category.



## Device Configuration
The following table provides a summary of the 3 configuration parameters available in the HRT4-ZW.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Enable Temperature Sensor | Controls the use of the temperature sensor on the device |
| 2 | Temperature Scale | Controls the temperature sensor scale |
| 3 | Delta T | Defines the temperature steps of the heating control. Steps are 0.1 K |

### Parameter 1: Enable Temperature Sensor
Controls the use of the temperature sensor on the device

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable |
| 255 | Enable |

The manufacturer defined default value is 0 (Disable).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Temperature Scale
Controls the temperature sensor scale

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Celsius |
| 255 | Fahrenheit |

The manufacturer defined default value is 0 (Celsius).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Delta T
Defines the temperature steps of the heating control. Steps are 0.1 K

Values in the range 0 to 255 may be set.

The manufacturer defined default value is 10.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


## Association Groups
Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The HRT4-ZW supports 5 association groups.

### Group 1: Thermostat Mode Set

This group supports 4 nodes.

### Group 2: Binary Switch Set

This group supports 4 nodes.

### Group 3: Unsolicited Battery Level Reports

This group supports 4 nodes.

### Group 4: Thermostat Set Point Reports

This group supports 4 nodes.

### Group 5: Unsolicited Sensor Multilevel Reports

This group supports 4 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V0| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V1| |
| COMMAND_CLASS_THERMOSTAT_MODE_V0| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

---

Did you spot an error in the above definition or want to improve the content?
You can [edit the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/20).
