---
layout: documentation
title: HEATIT Z-TRM3 - ZWave
---

{% include base.html %}

# HEATIT Z-TRM3 Floor thermostat
This describes the Z-Wave device *HEATIT Z-TRM3*, manufactured by *ThermoFloor* with the thing type UID of ```thermofloor_ztrm3_00_000```.

The device is in the category of *HVAC*, defining Air condition devices, Fans.

![HEATIT Z-TRM3 product image](https://www.cd-jackson.com/zwave_device_uploads/1238/1238_default.png)


The HEATIT Z-TRM3 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

### FEATURES

  * Floor sensor
  * Internal room sensor
  * External room sensor (connected by cable)
  * Temperature limiter
  * SmartStart
  * Weekly program/setback via gateway
  * Temperature read out in gateway
  * Firmware update (OTA)
  * Power metering
  * Relay status LED
  * Single pole switch
  * Lock mode/child lock
  * Calibration
  * 5 associations
  * Supports encryption mode: S0, S2 Authenticated Class, S2 Unauthenticated Class

### Inclusion Information

1. Press Center (confirm) for 10 seconds. The display will show OFF. 2. Press Right (down) 5 times until you see Con on the display.3. Start the add/remove device process in your primary controller.4. Start the add/remove mode in the Heatit Z-TRM3 by pressing Center (confirm) for approximately 2 seconds. Adding/removing mode is indicated on the display by rotating LED segments on the display. This lasts until the timeout occurs after 90 seconds, or until the module has been added/removed in the network. Confirmation will show Inc/EcL on the display. Exit programming mode by choosing ESC in the menu. Your thermostat is now ready for use with default settings

### Exclusion Information

1. Press Center (confirm) for 10 seconds. The display will show OFF. 2. Press Right (down) 5 times until you see Con on the display.3. Start the add/remove device process in your primary controller.4. Start the add/remove mode in the Heatit Z-TRM3 by pressing Center (confirm) for approximately 2 seconds. Adding/removing mode is indicated on the display by rotating LED segments on the display. This lasts until the timeout occurs after 90 seconds, or until the module has been added/removed in the network. Confirmation will show Inc/EcL on the display. Exit programming mode by choosing ESC in the menu. Your thermostat is now ready for use with default settings.NB! When the thermostat is removed from the gateway, the parameters are not reset. To reset the parameters, see Chapter 7: ”Factory reset”. If adding/removing fails, Err (error) will appear. Please perform a ”remove device” process and try again. If Err displays again, please see Chapter 7: “Factory reset”.

## Channels

The following table summarises the channels available for the HEATIT Z-TRM3 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Thermostat mode | thermostat_mode | thermostat_mode | Temperature | Number | 
| Operating State | thermostat_state | thermostat_state | Temperature | Number | 
| Setpoint (heating) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Electric meter (kWh) 1 | meter_kwh1 | meter_kwh | Energy | Number | 
| Electric meter (volts) 1 | meter_voltage1 | meter_voltage | Energy | Number | 
| Electric meter (watts) 1 | meter_watts1 | meter_watts | Energy | Number | 
| Thermostat mode 1 | thermostat_mode1 | thermostat_mode | Temperature | Number | 
| Operating State 1 | thermostat_state1 | thermostat_state | Temperature | Number | 
| Setpoint (heating) 1 | thermostat_setpoint1 | thermostat_setpoint | Heating | Number:Temperature | 
| Sensor (temperature) 2 | sensor_temperature2 | sensor_temperature | Temperature | Number:Temperature | 
| Sensor (temperature) 3 | sensor_temperature3 | sensor_temperature | Temperature | Number:Temperature | 
| Sensor (temperature) 4 | sensor_temperature4 | sensor_temperature | Temperature | Number:Temperature | 

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (volts)
Indicates the instantaneous voltage.

The ```meter_voltage``` channel is of type ```meter_voltage``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Thermostat mode
Sets the thermostat.

The ```thermostat_mode``` channel is of type ```thermostat_mode``` and supports the ```Number``` item and is in the ```Temperature``` category.
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

### Operating State
Sets the thermostat operating state.

The ```thermostat_state``` channel is of type ```thermostat_state``` and supports the ```Number``` item and is in the ```Temperature``` category.
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
Sets the thermostat setpoint.

The ```thermostat_setpoint``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

### Electric meter (kWh) 1
Indicates the energy consumption (kWh).

The ```meter_kwh1``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (volts) 1
Indicates the instantaneous voltage.

The ```meter_voltage1``` channel is of type ```meter_voltage``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts) 1
Indicates the instantaneous power consumption.

The ```meter_watts1``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Thermostat mode 1
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

### Operating State 1
Sets the thermostat operating state.

The ```thermostat_state1``` channel is of type ```thermostat_state``` and supports the ```Number``` item and is in the ```Temperature``` category.
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
Sets the thermostat setpoint.

The ```thermostat_setpoint1``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

### Sensor (temperature) 2
Indicates the current temperature.

The ```sensor_temperature2``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Sensor (temperature) 3
Indicates the current temperature.

The ```sensor_temperature3``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Sensor (temperature) 4
Indicates the current temperature.

The ```sensor_temperature4``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.



## Device Configuration

The following table provides a summary of the 21 configuration parameters available in the HEATIT Z-TRM3.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Operation mode | Operation mode |
| 2 | Sensor Mode | Sensor Mode |
| 3 | Floor Sensor Type | Floor Sensor Type |
| 4 | Temperature Control Hysteresis | Temperature Control Hysteresis |
| 5 | Floor Minimum Temperature Limit | Floor Minimum Temperature Limit |
| 6 | Floor MaximumTemperature Limit | Floor MaximumTemperature Limit |
| 7 | Air Minimum Temp Limit (ALo) | Air Minimum Temp Limit (ALo) |
| 8 | Air Maximum Temp Limit (AHi) | Air Maximum Temp Limit (AHi) |
| 9 | Heating Mode Setpoint | Heating Mode Setpoint |
| 10 | Room Sensor Calibration | Room Sensor Calibration |
| 11 | Floor Sensor Calibration | Floor Sensor Calibration |
| 12 | External Sensor Calibration | External Sensor Calibration |
| 13 | Temperature Display | Temperature Display |
| 14 | Button brighness dimmed state | Button brighness dimmed state |
| 15 | Button brighness active state | Button brighness active state |
| 16 | Display brighness dimmed state | Display brighness dimmed state |
| 17 | Display brighness active state | Display brighness active state |
| 18 | Temperature report interval | Temperature report interval |
| 19 | Temperature report hysteresis | Temperature report hysteresis |
| 20 | Meter report interval | Meter report interval |
| 21 | Meter report delta value | Meter report delta value |

### Parameter 1: Operation mode

Operation mode
Value = 0, Off   
Value = 1, Heating mode, (default)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Off |
| 1 | Heating mode |

The manufacturer defined default value is ```1``` (Heating mode).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Sensor Mode

Sensor Mode

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | F-mode, floor sensor mode |
| 1 | A-mode, internal room sensor mode |
| 2 | AF-mode, internal roomsensor with floor limitation |
| 3 | A2-mode, external room sensor mode |
| 4 | A2F-mode, external sensor with floor limitation |

The manufacturer defined default value is ```1``` (A-mode, internal room sensor mode).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Floor Sensor Type

Floor Sensor Type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | 10K NTC |
| 1 | 12K NTC |
| 2 | 15K NTC |
| 3 | 22K NTC |
| 4 | 33K NTC |
| 5 | 47K NTC |

The manufacturer defined default value is ```0``` (10K NTC).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Temperature Control Hysteresis

Temperature Control Hysteresis
0.3°C to 3.0°C. Default is 5 (0.5°C)
Values in the range 3 to 30 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Floor Minimum Temperature Limit

Floor Minimum Temperature Limit
5.0°C to 40.0°C. Default is 50 (5.0°C)
Values in the range 50 to 400 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_5_2``` and is of type ```INTEGER```.


### Parameter 6: Floor MaximumTemperature Limit

Floor MaximumTemperature Limit
5.0°C to 40.0°C. Default is 400 (40.0°C)
Values in the range 50 to 400 may be set.

The manufacturer defined default value is ```400```.

This parameter has the configuration ID ```config_6_2``` and is of type ```INTEGER```.


### Parameter 7: Air Minimum Temp Limit (ALo)

Air Minimum Temp Limit (ALo)
5.0°C to 40.0°C. Default is 50 (5.0°C)
Values in the range 50 to 400 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_7_2``` and is of type ```INTEGER```.


### Parameter 8: Air Maximum Temp Limit (AHi)

Air Maximum Temp Limit (AHi)
5.0°C to 40.0°C. Default is 400 (40.0°C)
Values in the range 50 to 400 may be set.

The manufacturer defined default value is ```400```.

This parameter has the configuration ID ```config_8_2``` and is of type ```INTEGER```.


### Parameter 9: Heating Mode Setpoint

Heating Mode Setpoint
5.0°C to 40.0°C. Default is 210 (21.0°C)
Values in the range 50 to 400 may be set.

The manufacturer defined default value is ```210```.

This parameter has the configuration ID ```config_9_2``` and is of type ```INTEGER```.


### Parameter 10: Room Sensor Calibration

Room Sensor Calibration
-6.0°C to 6.0°C. Default is 0 (0.0°C)
Values in the range -60 to 60 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: Floor Sensor Calibration

Floor Sensor Calibration
-6.0°C to 6.0°C. Default is 0 (0.0°C)
Values in the range -60 to 60 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: External Sensor Calibration

External Sensor Calibration
-6.0°C to 6.0°C. Default is 0 (0.0°C)
Values in the range -60 to 60 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: Temperature Display

Temperature Display
Selects which temperature is shown on the display. Refer to Chapter 11 ”Standby and main screen”.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Display setpoint temperature (Default) |
| 1 | Display measured temperature |

The manufacturer defined default value is ```0``` (Display setpoint temperature (Default)).

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: Button brighness dimmed state

Button brighness dimmed state
Configure the brightness of the buttons in dimmed state.

0 to 100% (Default 50%)
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.


### Parameter 15: Button brighness active state

Button brighness active state
Configure the brightness of the buttons in active state.

0 to 100% (Default 100%)
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 16: Display brighness dimmed state

Display brighness dimmed state
Configure the brightness of the display in dimmed state.

0 to 100% (Default 100%)  
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_16_1``` and is of type ```INTEGER```.


### Parameter 17: Display brighness active state

Display brighness active state
Configure the brightness of the display, in active state.

0 to 100% (Default 100%)  
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 18: Temperature report interval

Temperature report interval
Time interval between consecutive temperature reports.

Temperature reports can also be sent as a result of polling.

30 seconds to 32767 seconds. Default is 60 seconds  
Values in the range 30 to 32767 may be set.

The manufacturer defined default value is ```60```.

This parameter has the configuration ID ```config_18_2``` and is of type ```INTEGER```.


### Parameter 19: Temperature report hysteresis

Temperature report hysteresis
The temperature report will be sent if there is a difference in temperature value from the previous value reported, defined in this parameter (hysteresis). Temperature reports can also be sent as a result of polling.

0.1°C to 10.0°C. Default is 10 (1.0°C)  
Values in the range 1 to 100 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_19_1``` and is of type ```INTEGER```.


### Parameter 20: Meter report interval

Meter report interval
Time interval between consecutive meter reports.

Meter reports can also be sent as a result of polling.

30 seconds to 32767 seconds. Default is 90 seconds  
Values in the range 30 to 32767 may be set.

The manufacturer defined default value is ```90```.

This parameter has the configuration ID ```config_20_2``` and is of type ```INTEGER```.


### Parameter 21: Meter report delta value

Meter report delta value
Delta value in kWh between consecutive meter reports. Meter reports can also be sent as a result of polling.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Reporting meter based on change is disabled |
| 10 | A delta value of 0 to 25.5 kWh |

The manufacturer defined default value is ```10``` (A delta value of 0 to 25.5 kWh ).

This parameter has the configuration ID ```config_21_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The HEATIT Z-TRM3 supports 5 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 5 nodes.

### Group 2: Relay State ON/OFF


Association group 2 supports 5 nodes.

### Group 3: Internal Sensor


Association group 3 supports 5 nodes.

### Group 4: External Sensor


Association group 4 supports 5 nodes.

### Group 5: Floor Senosr


Association group 5 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_THERMOSTAT_MODE_V1| |
| COMMAND_CLASS_THERMOSTAT_OPERATING_STATE_V1| |
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
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_THERMOSTAT_MODE_V1| |
| COMMAND_CLASS_THERMOSTAT_OPERATING_STATE_V1| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V1| |
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
| COMMAND_CLASS_SENSOR_MULTILEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |

### Documentation Links

* [Manual](https://www.cd-jackson.com/zwave_device_uploads/1238/manual-heatit-z-trm3-fw-4-0-ver2020-b-eng.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1238).
