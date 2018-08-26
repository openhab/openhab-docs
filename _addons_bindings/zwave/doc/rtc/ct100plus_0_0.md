---
layout: documentation
title: CT100 Plus - ZWave
---

{% include base.html %}

# CT100 Plus Z-Wave Thermostat
This describes the Z-Wave device *CT100 Plus*, manufactured by *Radio Thermostat Company of America (RTC)* with the thing type UID of ```rtc_ct100plus_00_000```.

The device is in the category of *HVAC*, defining Air condition devices, Fans.

![CT100 Plus product image](https://www.cd-jackson.com/zwave_device_uploads/641/641_default.png)


The CT100 Plus supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/641) to improve the documentation.

## Channels

The following table summarises the channels available for the CT100 Plus -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Binary Sensor | sensor_binary | Door | Switch | 
| Sensor (relative humidity) | sensor_relhumidity | Humidity | Number | 
| Sensor (temperature) | sensor_temperature | Temperature | Number | 
| Thermostat mode | thermostat_mode | Temperature | Number | 
| Operating State | thermostat_state | Temperature | Number | 
| Setpoint (heating) | thermostat_setpoint | Temperature | Number | 
| Setpoint (cooling) | thermostat_setpoint | Temperature | Number | 
| Setpoint (dry air) | thermostat_setpoint | Temperature | Number | 
| Setpoint (furnace) | thermostat_setpoint | Temperature | Number | 
| Thermostat fan mode | thermostat_fanmode |  |  | 
| Thermostat fan state | thermostat_fanstate |  |  | 
| Battery Level | battery-level | Battery | Number |
| Clock Time Offset | time_offset | Temperature | Number | 
| Sensor (relative humidity) 1 | sensor_relhumidity1 | Humidity | Number | 
| Sensor (temperature) 1 | sensor_temperature1 | Temperature | Number | 
| Thermostat mode 1 | thermostat_mode1 | Temperature | Number | 
| Operating State 1 | thermostat_state1 | Temperature | Number | 
| Setpoint (heating) 1 | thermostat_setpoint1 | Temperature | Number | 
| Setpoint (cooling) 1 | thermostat_setpoint1 | Temperature | Number | 
| Setpoint (dry air) 1 | thermostat_setpoint1 | Temperature | Number | 
| Setpoint (furnace) 1 | thermostat_setpoint1 | Temperature | Number | 
| Thermostat fan mode 1 | thermostat_fanmode1 |  |  | 
| Thermostat fan state 1 | thermostat_fanstate1 |  |  | 
| Clock Time Offset 1 | time_offset1 | Temperature | Number | 
| Sensor (relative humidity) 2 | sensor_relhumidity2 | Humidity | Number | 
| Sensor (temperature) 2 | sensor_temperature2 | Temperature | Number | 

### Binary Sensor

Indicates if a sensor has triggered.

The ```sensor_binary``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Sensor (relative humidity)

Indicates the current relative humidity.

The ```sensor_relhumidity``` channel supports the ```Number``` item and is in the ```Humidity``` category. This is a read only channel so will only be updated following state changes from the device.

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

### Operating State

Sets the thermostat operating state.

The ```thermostat_state``` channel supports the ```Number``` item and is in the ```Temperature``` category.
The following state translation is provided for this channel to the ```Number``` item type -:

| Value | Label     |
|-------|-----------|
| 0 | Idle |
| 1 | Heating |
| 2 | Cooling |
| 3 | Fan Only |
| 4 | Pending Heat |
| 5 | Pending Cool |
| 6 | Vent / Economiser |

### Setpoint (heating)

Sets the thermostate setpoint.

The ```thermostat_setpoint``` channel supports the ```Number``` item and is in the ```Temperature``` category.

### Setpoint (cooling)

Sets the thermostate setpoint.

The ```thermostat_setpoint``` channel supports the ```Number``` item and is in the ```Temperature``` category.

### Setpoint (dry air)

Sets the thermostate setpoint.

The ```thermostat_setpoint``` channel supports the ```Number``` item and is in the ```Temperature``` category.

### Setpoint (furnace)

Sets the thermostate setpoint.

The ```thermostat_setpoint``` channel supports the ```Number``` item and is in the ```Temperature``` category.

### Thermostat fan mode

Channel type information on this channel is not found.

### Thermostat fan state

Channel type information on this channel is not found.

### Battery Level

Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```battery-level``` channel supports the ```Number``` item and is in the ```Battery``` category.

### Clock Time Offset

Provides the current time difference for the devices time.

The ```time_offset``` channel supports the ```Number``` item and is in the ```Temperature``` category.

### Sensor (relative humidity) 1

Indicates the current relative humidity.

The ```sensor_relhumidity1``` channel supports the ```Number``` item and is in the ```Humidity``` category. This is a read only channel so will only be updated following state changes from the device.

### Sensor (temperature) 1

Indicates the current temperature.

The ```sensor_temperature1``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Thermostat mode 1

Sets the thermostat.

The ```thermostat_mode1``` channel supports the ```Number``` item and is in the ```Temperature``` category.
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

### Operating State 1

Sets the thermostat operating state.

The ```thermostat_state1``` channel supports the ```Number``` item and is in the ```Temperature``` category.
The following state translation is provided for this channel to the ```Number``` item type -:

| Value | Label     |
|-------|-----------|
| 0 | Idle |
| 1 | Heating |
| 2 | Cooling |
| 3 | Fan Only |
| 4 | Pending Heat |
| 5 | Pending Cool |
| 6 | Vent / Economiser |

### Setpoint (heating) 1

Sets the thermostate setpoint.

The ```thermostat_setpoint1``` channel supports the ```Number``` item and is in the ```Temperature``` category.

### Setpoint (cooling) 1

Sets the thermostate setpoint.

The ```thermostat_setpoint1``` channel supports the ```Number``` item and is in the ```Temperature``` category.

### Setpoint (dry air) 1

Sets the thermostate setpoint.

The ```thermostat_setpoint1``` channel supports the ```Number``` item and is in the ```Temperature``` category.

### Setpoint (furnace) 1

Sets the thermostate setpoint.

The ```thermostat_setpoint1``` channel supports the ```Number``` item and is in the ```Temperature``` category.

### Thermostat fan mode 1

Channel type information on this channel is not found.

### Thermostat fan state 1

Channel type information on this channel is not found.

### Clock Time Offset 1

Provides the current time difference for the devices time.

The ```time_offset1``` channel supports the ```Number``` item and is in the ```Temperature``` category.

### Sensor (relative humidity) 2

Indicates the current relative humidity.

The ```sensor_relhumidity2``` channel supports the ```Number``` item and is in the ```Humidity``` category. This is a read only channel so will only be updated following state changes from the device.

### Sensor (temperature) 2

Indicates the current temperature.

The ```sensor_temperature2``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.



## Device Configuration

The following table provides a summary of the 15 configuration parameters available in the CT100 Plus.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Temperature Reporting Threshold | Reporting threshold for changes in the ambient temperature |
| 2 | HVAC Settings | Configured HVAC settings |
| 3 | Utility Lock Enable/Disable | Prevents setpoint changes at thermostat |
| 4 | Power Status | C-Wire / Battery Status |
| 5 | Humidity Reporting Threshold | Reporting threshold for changes in the relative humidity |
| 6 | Auxiliary/Emergency | Enables or disables auxiliary / emergency heating |
| 7 | Thermostat Swing Temperature | Variance allowed from setpoint to engage HVAC |
| 8 | Thermostat Diff Temperature | Configures additional stages |
| 9 | Thermostat Recovery Mode | Fast or Economy recovery mode |
| 10 | Temperature Filter Upper Bound | Upper/Lower bounds for thermostat temperature reporting |
| 10 | Temperature Filter Lower Bound Unit | Upper/Lower bounds for thermostat temperature reporting |
| 10 | Temperature Filter Upper Bound Unit | Upper/Lower bounds for thermostat temperature reporting |
| 10 | Temperature Filter Lower Bound | Upper/Lower bounds for thermostat temperature reporting |
| 11 | Simple UI Mode | Simple mode enable/disable |
| 12 | Multicast | Enable or disables Multicast |

### Parameter 1: Temperature Reporting Threshold

Reporting threshold for changes in the ambient temperature
This value determines the reporting threshold when association reporting is enabled. Unsupported values will be ignored.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | 0.5° F |
| 2 | 1.0° F |
| 3 | 1.5° F |
| 4 | 2.0° F |

The manufacturer defined default value is ```2``` (1.0° F).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: HVAC Settings

Configured HVAC settings
Byte 1 = HVAC Setup: Normal (0x01) or Heat Pump (0x02)  
Byte 2 = Aux Setup (Gas (0x01) or Electric (0x02)) & Number of Auxiliary Stages (Heat Pump)/Number of Heat Stages (Normal)  
Byte 3 = Number of Heat Pump Stages  
Byte 4 = Number of Cool Stages
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_2_4``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 3: Utility Lock Enable/Disable

Prevents setpoint changes at thermostat
If set to 0, the utility lock is disabled, all other values, 1-255, will enable the utility lock. This will prevent changes to the setpoint at the thermostat screen.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Utility lock disabled |
| 1 | Utility lock enabled |

The manufacturer defined default value is ```0``` (Utility lock disabled).

This parameter has the configuration ID ```config_3_1_wo``` and is of type ```INTEGER```.
This is a write only parameter.


### Parameter 4: Power Status

C-Wire / Battery Status
If 0x01, the thermostat is powered by a C-wire. If 0x02, the thermostat is powered by batteries.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 5: Humidity Reporting Threshold

Reporting threshold for changes in the relative humidity
This value determines the reporting threshold when association reporting is enabled. Unsupported values will be ignored.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | 3% RH |
| 2 | 5% RH |
| 3 | 10% RH |

The manufacturer defined default value is ```0``` (Disabled).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Auxiliary/Emergency

Enables or disables auxiliary / emergency heating
If set to 0, auxiliary / emergency heat is disabled, all other values, 1-255, will enable the auxiliary / emergency heat. This can only be enabled when the thermostat is set to Heat Pump mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Auxiliary/Emergency heat disabled |
| 1 | Auxiliary/Emergency heat enabled |

The manufacturer defined default value is ```0``` (Auxiliary/Emergency heat disabled).

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Thermostat Swing Temperature

Variance allowed from setpoint to engage HVAC
The thermostat swing temperature is in units of 0.5 degrees Fahrenheit.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | 0.5° F |
| 2 | 1.0° F |
| 3 | 1.5° F |
| 4 | 2.0° F |
| 5 | 2.5° F |
| 6 | 3.0° F |
| 7 | 3.5° F |
| 8 | 4.0° F |

The manufacturer defined default value is ```2``` (1.0° F).

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Thermostat Diff Temperature

Configures additional stages
Sets the differential temperature for multi-stage HVAC systems. The differential temperature delta defines when the thermostat will turn on additional stages. This command configures both the heat and cool differential temperatures.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 4 | 2.0° F |
| 8 | 4.0° F |
| 12 | 6.0° F |

The manufacturer defined default value is ```4``` (2.0° F).

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Thermostat Recovery Mode

Fast or Economy recovery mode
The Thermostat Recovery Mode can be either fast (1) or economy (2).
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Fast recovery mode |
| 2 | Economy recovery mode |

The manufacturer defined default value is ```2``` (Economy recovery mode).

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: Temperature Filter Upper Bound

Upper/Lower bounds for thermostat temperature reporting
The thermostat will report ambient temperature changes for temperature values greater than the upper bound. This field must be between 0F and 124F. By default, this value is 0F (report all temperature changes).
Values in the range 0 to 124 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_10_4_000000FF``` and is of type ```INTEGER```.


### Parameter 10: Temperature Filter Lower Bound Unit

Upper/Lower bounds for thermostat temperature reporting
Specifies unit for lower bound parameter. If set to 1, lower bound is Celsius. If set to 9, lower bound is Fahrenheit.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Celsius |
| 9 | Fahreheit |

The manufacturer defined default value is ```9``` (Fahreheit).

This parameter has the configuration ID ```config_10_4_0000F000``` and is of type ```INTEGER```.


### Parameter 10: Temperature Filter Upper Bound Unit

Upper/Lower bounds for thermostat temperature reporting
Specifies unit for upper bound parameter. If set to 1, upper bound is Celsius. If set to 9, upper bound is Fahrenheit.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Celsius |
| 9 | Fahrenheit |

The manufacturer defined default value is ```9``` (Fahrenheit).

This parameter has the configuration ID ```config_10_4_0000FF00``` and is of type ```INTEGER```.


### Parameter 10: Temperature Filter Lower Bound

Upper/Lower bounds for thermostat temperature reporting
The thermostat will report ambient temperature changes for temperature values less than the lower bound. This field must be between 0F and 124F. By default, this value is 124F (report all temperature changes).
Values in the range 0 to 124 may be set.

The manufacturer defined default value is ```124```.

This parameter has the configuration ID ```config_10_4_00FF0000``` and is of type ```INTEGER```.


### Parameter 11: Simple UI Mode

Simple mode enable/disable
If the value is set to 0 then Normal Mode is enabled. If the value is set to 1 then Simple Mode is enabled.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Normal mode enabled |
| 1 | Simple mode enabled |

The manufacturer defined default value is ```1``` (Simple mode enabled).

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Multicast

Enable or disables Multicast
If set to 0, Multicast is disabled. If set to 1, Multicast is enabled.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Multicast disabled |
| 1 | Multicast enabled |

The manufacturer defined default value is ```0``` (Multicast disabled).

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The CT100 Plus supports 1 association group.

### Group 1: Group 1

Send report about Thermostat Mode, Thermostat Operating State, Fan Mode, Fan State, Setpoint, Sensor Multilevel
This group supports 2 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V0| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| |
| COMMAND_CLASS_THERMOSTAT_MODE_V1| |
| COMMAND_CLASS_THERMOSTAT_OPERATING_STATE_V1| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V1| |
| COMMAND_CLASS_THERMOSTAT_FAN_MODE_V1| |
| COMMAND_CLASS_THERMOSTAT_FAN_STATE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_CLOCK_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_INDICATOR_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| |
| COMMAND_CLASS_THERMOSTAT_MODE_V1| |
| COMMAND_CLASS_THERMOSTAT_OPERATING_STATE_V1| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V1| |
| COMMAND_CLASS_THERMOSTAT_FAN_MODE_V1| |
| COMMAND_CLASS_THERMOSTAT_FAN_STATE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_CLOCK_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_INDICATOR_V1| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |

### Documentation Links

* [CT100 Plus User Guide](https://www.cd-jackson.com/zwave_device_uploads/641/CT100-Plus-UserGuide.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/641).
