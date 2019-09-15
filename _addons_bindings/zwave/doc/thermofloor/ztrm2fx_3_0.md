---
layout: documentation
title: Z-TRM2fx - ZWave
---

{% include base.html %}

# Z-TRM2fx Floor thermostat
This describes the Z-Wave device *Z-TRM2fx*, manufactured by *ThermoFloor* with the thing type UID of ```thermofloor_ztrm2fx_03_000```.
This version of the device is limited to firmware versions above 3.0

The device is in the category of *HVAC*, defining Air condition devices, Fans.

![Z-TRM2fx product image](https://www.cd-jackson.com/zwave_device_uploads/980/980_default.png)


The Z-TRM2fx supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

FEATURES

  * Floor sensor
  * External room sensor
  * Temperature limiter
  * Weekly program/setback via gateway or pilot wire
  * Multilevel sensor command class
  * Firmware updates (OTA)
  * Power metering
  * LED-diode
  * May be used in connection with different NTC-sensors
  * Lock mode/child lock
  * Calibration
  * 5 associations
  * Supports encryption mode: S0, S2 Authenticated Class, S2 Unauthenticated Class

### Inclusion Information

To add the thermostat to your home automation gateway, press Center (confirm) for 10 seconds.The display will show OFF.

Press Right (down) 4 times till you see Con in the display.

Now start add device in your home automation software.

Start adding mode by pressing Center (confirm) for approximately 2 seconds.

Adding Mode is indicated in the display by some “circling” LED segments in the display until the timeout occurs after 20 seconds or the module has been added in the network.

Confirmation will show Inc in the display. If adding fails, Err (error) will appear.

Leave programming mode by choosing ESC in menu. Your thermostat is ready for use with default settings.

### Exclusion Information

To remove the thermostat from your home automation gateway, press Center (confirm) for 10 seconds. The display will show OFF.

Press Right (down) 4 times till you see Con in the display.

Now start remove device in your home automation software.

Start removing mode by pressing Center (confirm) for approximately 2 seconds.

Removing Mode is indicated in the display by some “circling” LED segments in the display until the timeout occurs after 20 seconds or the module has been removed from the network.

Confirmation will show Inc/EcL in the display. If removing fails, Err (error) will appear.

Leave programming mode by choosing ESC in menu.

## Channels

The following table summarises the channels available for the Z-TRM2fx -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Clear Accumulated Energy | meter_reset | meter_reset | Energy | Switch | 
| Energy Saving Mode Setpoint (ECO) | config_decimal | config_decimal |  | Number | 
| Heating mode setpoint (Comfort) | config_decimal | config_decimal |  | Number | 
| Display brightness - dimmed | config_decimal | config_decimal |  | Number | 
| Button brightness - dimmed | config_decimal | config_decimal |  | Number | 
| Thermostat mode | thermostat_mode1 | thermostat_mode | Temperature | Number | 
| Setpoint (cooling) | thermostat_setpoint1 | thermostat_setpoint | Heating | Number:Temperature | 
| Setpoint (heating) | thermostat_setpoint1 | thermostat_setpoint | Heating | Number:Temperature | 
| Setpoint (Furnace) | thermostat_setpoint1 | thermostat_setpoint | Heating | Number:Temperature | 
| External sensor | sensor_temperature2 | sensor_temperature | Temperature | Number:Temperature | 
| Floor sensor | sensor_temperature3 | sensor_temperature | Temperature | Number:Temperature | 
| Switch binary | switch_binary4 | switch_binary | Switch | Switch | 
| Electric meter (volts) 4 | meter_voltage4 | meter_voltage | Energy | Number | 
| Electric meter (kWh) 4 | meter_kwh4 | meter_kwh | Energy | Number | 
| Electric meter (watts) 4 | meter_watts4 | meter_watts | Energy | Number | 
| Resets Device Usage 4  [Deprecated]| meter_reset4 | meter_reset | Energy | Switch | 

### Electric meter (volts)
Indicates the instantaneous voltage.

The ```meter_voltage``` channel is of type ```meter_voltage``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Clear Accumulated Energy
Reset the meter.

The ```meter_reset``` channel is of type ```meter_reset``` and supports the ```Switch``` item and is in the ```Energy``` category.

### Energy Saving Mode Setpoint (ECO)
Generic class for configuration parameter.

The ```config_decimal``` channel is of type ```config_decimal``` and supports the ```Number``` item.

### Heating mode setpoint (Comfort)
Generic class for configuration parameter.

The ```config_decimal``` channel is of type ```config_decimal``` and supports the ```Number``` item.

### Display brightness - dimmed
Generic class for configuration parameter.

The ```config_decimal``` channel is of type ```config_decimal``` and supports the ```Number``` item.

### Button brightness - dimmed
Generic class for configuration parameter.

The ```config_decimal``` channel is of type ```config_decimal``` and supports the ```Number``` item.

### Thermostat mode
Sets the thermostat.

The ```thermostat_mode1``` channel is of type ```thermostat_mode``` and supports the ```Number``` item and is in the ```Temperature``` category.
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

### Setpoint (cooling)
Sets the thermostat setpoint.

The ```thermostat_setpoint1``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

### Setpoint (heating)
The heating setpoint, for currently selected heating mode (Comfort or ECO).

Sets the thermostat setpoint.

The ```thermostat_setpoint1``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

### Setpoint (Furnace)
Sets the thermostat setpoint.

The ```thermostat_setpoint1``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

### External sensor
Indicates the current temperature.

The ```sensor_temperature2``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Floor sensor
Indicates the current temperature.

The ```sensor_temperature3``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Switch binary
Switch the power on and off.

The ```switch_binary4``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Electric meter (volts) 4
Indicates the instantaneous voltage.

The ```meter_voltage4``` channel is of type ```meter_voltage``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh) 4
Indicates the energy consumption (kWh).

The ```meter_kwh4``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts) 4
Indicates the instantaneous power consumption.

The ```meter_watts4``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Resets Device Usage 4 [Deprecated]
Reset the meter.

The ```meter_reset4``` channel is of type ```meter_reset``` and supports the ```Switch``` item and is in the ```Energy``` category.

**Note:** This channel is marked as deprecated so should not be used.



## Device Configuration

The following table provides a summary of the 22 configuration parameters available in the Z-TRM2fx.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Operation mode | Operation mode |
| 2 | Sensor mode | Sensor mode |
| 3 | Floor sensor type | Floor sensor type |
| 4 | Temperature control hysteresis (DIFF I) | Temperature control hysteresis (DIFF I) |
| 5 | Floor minimum temperature limit (FLo) | Floor minimum temperature limit (FLo) |
| 6 | Floor maximum temperature (FHi) | Floor maximum temperature (FHi) |
| 7 | Air (A2) minimum temperature limit (ALo) | Air (A2) minimum temperature limit (ALo) |
| 8 | Air (A2) maximum temperature limit (AHi) | Air (A2) maximum temperature limit (AHi) |
| 9 | Heating mode setpoint (CO) | Heating mode setpoint (CO) |
| 10 | Energy saving mode setpoint (ECO) | Energy saving mode setpoint (ECO) |
| 11 | Cooling setpoint (COOL) | Cooling setpoint (COOL) |
| 12 | Floor sensor calibration | Floor sensor calibration |
| 13 | External sensor calibration | External sensor calibration |
| 14 | Temperature display | Temperature display |
| 15 | Button brightness - dimmed state | Button brightness - dimmed state |
| 16 | Button brightness - active state | Button brightness - active state |
| 17 | Display brightness - dimmed state | Display brightness - dimmed state |
| 18 | Display brightness - active state | Display brightness - active state |
| 19 | Temperature report interval | Temperature report interval |
| 20 | Temperature report hysteresis | Temperature report hysteresis |
| 21 | Meter report interval | Meter report interval |
| 22 | Meter report delta value | Meter report delta value |

### Parameter 1: Operation mode

Operation mode
Value = 0, Off (default)  
Value = 1, Heating mode  
Value = 2, Cooling mode (not implemented)  
Value = 11, Energy saving mode
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Off. (default) |
| 1 | Heating mode |
| 2 | Cooling mode (not implemented) |
| 11 | Energy saving heating mode |

The manufacturer defined default value is ```0``` (Off. (default)).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Sensor mode

Sensor mode
Value = 0, F-mode, floor sensor mode (default)  
Value = 3, A2-mode, external room sensor mode  
Value = 4, A2F-mode, external sensor with floor limitation
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | F-mode, floor sensor mode |
| 3 | A2-mode, external room sensor mode |
| 4 | A2F-mode, external sensor with floor limitation |

The manufacturer defined default value is ```0``` (F-mode, floor sensor mode).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Floor sensor type

Floor sensor type
1. Value = 0, 10K-NTC (default)  
2. Value = 1, 12K-NTC  
3. Value = 2, 15K-NTC  
4. Value = 3, 22K-NTC  
5. Value = 4, 33K-NTC  
6. Value = 5, 47K-NTC
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | 10K-NTC (default) |
| 1 | 12K-NTC |
| 2 | 15K-NTC |
| 3 | 22K-NTC |
| 4 | 33K-NTC |
| 5 | 47K-NTC |

The manufacturer defined default value is ```0``` (10K-NTC (default)).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Temperature control hysteresis (DIFF I)

Temperature control hysteresis (DIFF I)
1. Value = 3 - 30, 0.3C - 3.0C (default is 0.5C)
Values in the range 3 to 30 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Floor minimum temperature limit (FLo)

Floor minimum temperature limit (FLo)
1. Value = 50 - 400, 5.0C - 40.0C, default = 5.0C
Values in the range 50 to 400 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_5_2``` and is of type ```INTEGER```.


### Parameter 6: Floor maximum temperature (FHi)

Floor maximum temperature (FHi)
1. Value = 50 - 400, 5.0C - 40.0C, default = 40.0C)
Values in the range 50 to 400 may be set.

The manufacturer defined default value is ```400```.

This parameter has the configuration ID ```config_6_2``` and is of type ```INTEGER```.


### Parameter 7: Air (A2) minimum temperature limit (ALo)

Air (A2) minimum temperature limit (ALo)
1. Value = 50 - 400, 5.0C - 40.0C, default = 5.0C
Values in the range 50 to 400 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_7_2``` and is of type ```INTEGER```.


### Parameter 8: Air (A2) maximum temperature limit (AHi)

Air (A2) maximum temperature limit (AHi)
1. Value = 50 - 400, 5.0C - 40.0C, default = 40.0C)
Values in the range 50 to 400 may be set.

The manufacturer defined default value is ```400```.

This parameter has the configuration ID ```config_8_2``` and is of type ```INTEGER```.


### Parameter 9: Heating mode setpoint (CO)

Heating mode setpoint (CO)
1. Value = 50 - 400, 5.0C - 40.0C, default = 21.0C
Values in the range 50 to 400 may be set.

The manufacturer defined default value is ```210```.

This parameter has the configuration ID ```config_9_2``` and is of type ```INTEGER```.


### Parameter 10: Energy saving mode setpoint (ECO)

Energy saving mode setpoint (ECO)
1. Value = 50 - 400, 5.0C - 40.0C, default = 18.0C
Values in the range 50 to 400 may be set.

The manufacturer defined default value is ```180```.

This parameter has the configuration ID ```config_10_2``` and is of type ```INTEGER```.


### Parameter 11: Cooling setpoint (COOL)

Cooling setpoint (COOL)
1. Value = 50 - 400, 5.0C - 40.0C, default = 21.0C
Values in the range 50 to 400 may be set.

The manufacturer defined default value is ```210```.

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


### Parameter 12: Floor sensor calibration

Floor sensor calibration
1. Value = -40 - 40, -4.0C - 4.0C, default = 0.0C
Values in the range -40 to 40 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: External sensor calibration

External sensor calibration
1. Value = -40 - 40, -4.0V - 4.0C, default = 0.0C
Values in the range -40 to 40 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: Temperature display

Temperature display
1. Value = 0, Display setpoint temperature (default)  
2. Value = 1, Display measured temperature
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Display setpoint temperature (default) |
| 1 | Display measured temperature |

The manufacturer defined default value is ```0``` (Display setpoint temperature (default)).

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.


### Parameter 15: Button brightness - dimmed state

Button brightness - dimmed state
1. Value = 0 - 100, 0% - 100%, default = 50%
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 16: Button brightness - active state

Button brightness - active state
1. Value = 0 - 100, 0% - 100%, default = 100%
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_16_1``` and is of type ```INTEGER```.


### Parameter 17: Display brightness - dimmed state

Display brightness - dimmed state
1. Value = 0 - 100, 0% - 100%, default = 50%
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 18: Display brightness - active state

Display brightness - active state
1. Value = 0 - 100, 0% - 100%, default = 100%
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_18_1``` and is of type ```INTEGER```.


### Parameter 19: Temperature report interval

Temperature report interval
1. Value = 0, Reporting of temperature disabled  
2. Value = 30 - 32767, 30s - 32767s, default = 60s

Time interval between consecutive temperature reports.  
Temperature reports can also be sent as a result of polling.
Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```60```.

This parameter has the configuration ID ```config_19_2``` and is of type ```INTEGER```.


### Parameter 20: Temperature report hysteresis

Temperature report hysteresis
1. Value = 1 - 100, 0.1C - 10.0C, default = 1.0C

The temperature report will be sent if there is a difference in temperature from the previous value reported,  
defined in this parameter (hysteresis).  
Temperature reports can also be sent as a result of polling.
Values in the range 1 to 100 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_20_1``` and is of type ```INTEGER```.


### Parameter 21: Meter report interval

Meter report interval
1. Value = 0, Reporting of metering values is disabled  
2. Value = 30 - 32767, 30s - 32767s, default = 60s

Time interval between consecutive meter reports.  
Meter reports can also be sent as a result of polling.
Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```60```.

This parameter has the configuration ID ```config_21_2``` and is of type ```INTEGER```.


### Parameter 22: Meter report delta value

Meter report delta value
1. Value = 0 - 127, 0kWh - 12.7kWh, default = 1.0kWh

Delta value in kWh between consecutive meter reports.  
Meter reports can also be sent as a result of polling.
Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_22_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Z-TRM2fx supports 4 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
The main thermostat device
Lifeline. (Normally used by the Z-Wave Controller) Sends:

  * Device Reset Notifications.
  * Thermostat Setpoint Reports
  * Thermostat Mode Reports
  * Basic Reports
  * Meter Reports

Association group 1 supports 5 nodes.

### Group 2: External temperature

Send Multilevel Sensor Reports for external temperature sensor.

Association group 2 supports 5 nodes.

### Group 3: Floor temperature

Send Multilevel Sensor Reports for floor temperature sensor.

Association group 3 supports 5 nodes.

### Group 4: Internal relay status

Send Binary Switch Set commands representing the status of the internal relay.

Association group 4 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_THERMOSTAT_MODE_V1| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 3

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 4

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |

### Documentation Links

* [Manual FW 3.4 Ver. 2018-A](https://www.cd-jackson.com/zwave_device_uploads/980/A4-Manual-Heatit-Z-TRM2fx-FW-3-4-Ver2018-A-ENG.pdf)
* [A4_Manual_Heatit_Z-TRM2fx_FW-3.6_Ver2019-A_ENG](https://www.cd-jackson.com/zwave_device_uploads/980/A4-Manual-Heatit-Z-TRM2fx-FW-3-6-Ver2019-A-ENG.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/980).
