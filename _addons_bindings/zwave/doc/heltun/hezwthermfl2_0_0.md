---
layout: documentation
title: HE-ZW-THERM-FL2 - ZWave
---

{% include base.html %}

# HE-ZW-THERM-FL2 Wall Heating Thermostat
This describes the Z-Wave device *HE-ZW-THERM-FL2*, manufactured by *Heltun* with the thing type UID of ```heltun_hezwthermfl2_00_000```.

The device is in the category of *HVAC*, defining Air condition devices, Fans.

![HE-ZW-THERM-FL2 product image](https://www.cd-jackson.com/zwave_device_uploads/1023/1023_default.jpg)


The HE-ZW-THERM-FL2 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The Heltun Heating Thermostat is built control the heating and mesures not only the room temperature with the build in sensor, but also humidity and the floor temperature if a sensor is attached.

### Inclusion Information

**To include the thermostat in the Z-Wave network**

  1. Go to the “SETTINGS” mode by pressing and holding the settings button for 3 seconds
  2. Go to “Parameter 29 – nEt” of the menu by using the heating button for scrolling up and the “MODE” key for scrolling down in parameters.
  3. In the value position will be seen the current state of the network. It should be ECL. If Inc is indicated, anexclusion must be first performed.
  4. Start the inclusion mode from the gateway
  5. Press “+” key to start inclusion process. Lines will be moving in value position.
  6. The “Inc” should appear in the value position if the inclusion has been successful. The “Err” will appear if the inclusion was not completed.

**Note:** In case the device has been part of the Z-Wave network before and not excluded since, inclusion is not possible. In this case, exclusion must be performed before inclusion. If the thermostat is included in the network, in the bottom right corner of the main screen the  
antenna icon will be displayed with connection lines. If not on the network then it will be displayed without lines.

**Security:** S0, S2 unauthorized and S2 authorized inclusion modes are supported. If you use S2 authorized inclusion mode the security key should be used in inclusion process.

**NOTE:** Be sure to save this key. Without the key it is impossible to perform an inclusion in S2 authorized mode.

### Exclusion Information

**To exclude the thermostat from the Z-Wave network**

  1. Go to “SETTINGS” mode by pressing and holding the settings button for 3 seconds
  2. Go to “Parameter 29 – nEt” of the menu
  3. In the value position the current state of network state will be displayed. It should be “Inc”. if the “ECL” is indicated the device is already excluded.
  4. Start the exclusion from the gateway.
  5. Press the “–” key to start the exclusion process. Lines will be moving in the value position.
  6. The “Ecl” should appear with successful deletion. If the “Err” appear then start the exclusion process again.

## Channels

The following table summarises the channels available for the HE-ZW-THERM-FL2 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Sensor (luminance) | sensor_luminance | sensor_luminance |  | Number | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Sensor (relative humidity) | sensor_relhumidity | sensor_relhumidity | Humidity | Number | 
| Sensor (soil temperature) | sensor_soiltemperature | sensor_temperature | Temperature | Number:Temperature | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Thermostat mode | thermostat_mode | thermostat_mode | Temperature | Number | 
| Operating State | thermostat_state | thermostat_state | Temperature | Number | 
| Setpoint (heating) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Clock Time Offset | time_offset | time_offset | Time | Number | 

### Sensor (luminance)
Indicates the current light reading.

The ```sensor_luminance``` channel is of type ```sensor_luminance``` and supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Sensor (relative humidity)
Indicates the current relative humidity.

The ```sensor_relhumidity``` channel is of type ```sensor_relhumidity``` and supports the ```Number``` item and is in the ```Humidity``` category. This is a read only channel so will only be updated following state changes from the device.

### Sensor (soil temperature)
Indicates the current temperature.

The ```sensor_soiltemperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

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

### Clock Time Offset
Provides the current time difference for the devices time.

The ```time_offset``` channel is of type ```time_offset``` and supports the ```Number``` item and is in the ```Time``` category.



## Device Configuration

The following table provides a summary of the 61 configuration parameters available in the HE-ZW-THERM-FL2.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Degree Mode | Degree Mode |
| 2 | External input mode | External input mode |
| 3 | Mode number | Mode number |
| 4 | Source sensor | Source sensor |
| 5 | Power reg on | Power Regulation ON time, min |
| 6 | Power reg off | Power Regulation OFF time, min |
| 7 | Dry time | Dry time |
| 8 | Time by controller | Time correction by controller |
| 9 | Time format | Time format |
| 10 | Week day | Manually set week day |
| 11 | Hour | Manually set time hour |
| 12 | Mins | Manually set time minute |
| 13 | Air temp min | Air Temperature Minimum in degree, value * 10 |
| 14 | Air temp max | Air Temperature Maximum in degree, x10 |
| 15 | Floor temp min | Floor Temperature Minimum in degree, x10 |
| 16 | Floor temp max | Floor Temperature Maximum in degree, x10 |
| 17 | Floor sensor resistance | Floor Sensor Resistance, kohm |
| 18 | Air temp calibration | Air Temperature Calibration in degree x10 |
| 19 | Floor temp calibration | Floor Temperature Calibration in degree x10 |
| 20 | Temp hysteresis | Temperature Hysteresis in degree, x10 |
| 21 | Temp diff to send values | Temperature difference to send to controller, value x10 |
| 22 | Active display brightness | Active display brightness level. |
| 23 | Inactive display brightness | Inactive display brightness level. |
| 24 | Auto LCD brightness | Auto LCD brightness control |
| 25 | Auto bright level 1 | Auto bright level 1 |
| 26 | Auto bright level 2 | Auto bright level 2 |
| 27 | Auto bright level 3 | Auto bright level 3 |
| 28 | Basic set action | Basic set action |
| 51 | Touch sensitivity | Touch buttons sensitivity. |
| 52 | Morning start time | Morning start time |
| 53 | Day start time | Day start time |
| 54 | Evening start time | Evening start time |
| 55 | Night Start time | Night Start time |
| 56 | Monday morning temp | Monday morning temp |
| 57 | Monday day temp | Monday day temp |
| 58 | Monday evening temp | Monday evening temp |
| 59 | Monday night temp | Monday night temp |
| 60 | Tuesday morning temp | Tuesday morning temp |
| 61 | Tuesday day temp | Tuesday day temp |
| 62 | Tuesday evening temp | Tuesday evening temp |
| 63 | Tuesday night temp | Tuesday night temp |
| 64 | Wednesday morning temp | Wednesday morning temp |
| 65 | Wednesday day temp | Wednesday day temp |
| 66 | Wednesday evening temp | Wednesday evening temp |
| 67 | Wednesday night temp | Wednesday night temp |
| 68 | Thursday morning temp | Thursday morning temp |
| 69 | Thursday day temp | Thursday day temp |
| 70 | Thursday evening temp | Thursday evening temp |
| 71 | Thursday night temp | Thursday night temp |
| 72 | Friday morning temp | Friday morning temp |
| 73 | Friday day temp | Friday day temp |
| 74 | Friday evening temp | Friday evening temp |
| 75 | Friday night temp | Friday night temp |
| 76 | Saturday morning temp | Saturday morning temp |
| 77 | Saturday day temp | Saturday day temp |
| 78 | Saturday evening temp | Saturday evening temp |
| 79 | Saturday night temp | Saturday night temp |
| 80 | Sunday morning temp | Sunday morning temp |
| 81 | Sunday day temp | Sunday day temp |
| 82 | Sunday evening temp | Sunday evening temp |
| 83 | Sunday night temp | Sunday night temp |

### Parameter 1: Degree Mode

Degree Mode

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Centigrade |
| 1 | Fahrenheit |

The manufacturer defined default value is ```0``` (Centigrade).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: External input mode

External input mode

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Ignore external input |
| 1 | Trigger on input |
| 2 | Latch on input |

The manufacturer defined default value is ```1``` (Trigger on input).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Mode number

Mode number
Mode number for EXT input action. This parameter allows selecting which operating mode the thermostat should go to if the external input is short-circuited.

1=COM, 2=TIME, 3=DRY, 4=ECO, 5=VAC, 6=MAN.

**Note:** When thermostat goes to MAN mode it will be in IDLE state till HEATING key is not pressed manually.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | COM |
| 2 | TIME |
| 3 | DRY |
| 4 | ECO |
| 5 | VAC |
| 6 | MAN |

The manufacturer defined default value is ```2``` (TIME).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Source sensor

Source sensor
Source Sensor:  
1=A, 2=AF, 3=F, 4=FA, 5=P, 6=PA, 7=PF.  
A=Air sensor, AF - Air sensor + Floor sensor, F - Floor sensor, FA - Floor sensor +Air sensor, P - Power regulator, PA - Power regulator + Air sensor, PF - Power regulator + Floor sensor
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Air sensor |
| 2 | Air and Floor sensors |
| 3 | Floor sensor |
| 4 | Floor and Air sensor |
| 5 | Power regulator |
| 6 | Power regulator and Air sensor |
| 7 | Power regulator and Floor sensor |

The manufacturer defined default value is ```3``` (Floor sensor).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Power reg on

Power Regulation ON time, min

Values in the range 10 to 90 may be set.

The manufacturer defined default value is ```15```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Power reg off

Power Regulation OFF time, min

Values in the range 10 to 90 may be set.

The manufacturer defined default value is ```15```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Dry time

Dry time

Values in the range 5 to 90 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Time by controller

Time correction by controller

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Time format

Time format

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | 24 hour |
| 1 | 12 hour (AM / PM) |

The manufacturer defined default value is ```0``` (24 hour).

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: Week day

Manually set week day
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 1 to 7 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: Hour

Manually set time hour
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 23 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Mins

Manually set time minute
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 59 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: Air temp min

Air Temperature Minimum in degree, value * 10
Centigrade value * 10

e.g. 22.5 = 225
Values in the range 40 to 360 may be set.

The manufacturer defined default value is ```210```.

This parameter has the configuration ID ```config_13_2``` and is of type ```INTEGER```.


### Parameter 14: Air temp max

Air Temperature Maximum in degree, x10
Centigrade value * 10

e.g. 22.5 = 225
Values in the range 50 to 370 may be set.

The manufacturer defined default value is ```270```.

This parameter has the configuration ID ```config_14_2``` and is of type ```INTEGER```.


### Parameter 15: Floor temp min

Floor Temperature Minimum in degree, x10
Centigrade value * 10

e.g. 22.5 = 225
Values in the range 40 to 360 may be set.

The manufacturer defined default value is ```180```.

This parameter has the configuration ID ```config_15_2``` and is of type ```INTEGER```.


### Parameter 16: Floor temp max

Floor Temperature Maximum in degree, x10
Centigrade value * 10

e.g. 22.5 = 225
Values in the range 50 to 370 may be set.

The manufacturer defined default value is ```320```.

This parameter has the configuration ID ```config_16_2``` and is of type ```INTEGER```.


### Parameter 17: Floor sensor resistance

Floor Sensor Resistance, kohm

Values in the range 1 to 100 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 18: Air temp calibration

Air Temperature Calibration in degree x10
Centigrade value * 10

e.g. 22.5 = 225
Values in the range -95 to 95 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_18_1``` and is of type ```INTEGER```.


### Parameter 19: Floor temp calibration

Floor Temperature Calibration in degree x10
Centigrade value * 10

e.g. 22.5 = 225
Values in the range -95 to 95 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_19_1``` and is of type ```INTEGER```.


### Parameter 20: Temp hysteresis

Temperature Hysteresis in degree, x10
Centigrade value * 10

e.g. 22.5 = 225
Values in the range 1 to 95 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_20_1``` and is of type ```INTEGER```.


### Parameter 21: Temp diff to send values

Temperature difference to send to controller, value x10
Centigrade value * 10

e.g. 22.5 = 225
Values in the range 1 to 10 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_21_1``` and is of type ```INTEGER```.


### Parameter 22: Active display brightness

Active display brightness level.
Active display brightness level. Must be greater than or equal param 23
Values in the range 1 to 4 may be set.

The manufacturer defined default value is ```4```.

This parameter has the configuration ID ```config_22_1``` and is of type ```INTEGER```.


### Parameter 23: Inactive display brightness

Inactive display brightness level.
Inactive display brightness level. Must be less than or equal param 22
Values in the range 1 to 4 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_23_1``` and is of type ```INTEGER```.


### Parameter 24: Auto LCD brightness

Auto LCD brightness control

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_24_1``` and is of type ```INTEGER```.


### Parameter 25: Auto bright level 1

Auto bright level 1
Auto brightness level 1 max lumens
Values in the range 0 to 5000 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_25_2``` and is of type ```INTEGER```.


### Parameter 26: Auto bright level 2

Auto bright level 2
Auto brightness level 2 max lumens
Values in the range 0 to 5000 may be set.

The manufacturer defined default value is ```200```.

This parameter has the configuration ID ```config_26_2``` and is of type ```INTEGER```.


### Parameter 27: Auto bright level 3

Auto bright level 3
Auto brightness level 3 max lumens
Values in the range 0 to 5000 may be set.

The manufacturer defined default value is ```3000```.

This parameter has the configuration ID ```config_27_2``` and is of type ```INTEGER```.


### Parameter 28: Basic set action

Basic set action

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | COM |
| 2 | TIME |
| 3 | DRY |
| 4 | ECO |
| 5 | VAC |
| 6 | MAN |

The manufacturer defined default value is ```6``` (MAN).

This parameter has the configuration ID ```config_28_1``` and is of type ```INTEGER```.


### Parameter 51: Touch sensitivity

Touch buttons sensitivity.
Touch buttons sensitivity.

  * 20=Super sensitive.
  * 70=lowest sensitivity.
Values in the range 20 to 70 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_51_1``` and is of type ```INTEGER```.


### Parameter 52: Morning start time

Morning start time
Morning start time.  
Format: HHMM. e.g.08:00 should be sent as 0800
Values in the range 0 to 2359 may be set.

The manufacturer defined default value is ```600```.

This parameter has the configuration ID ```config_52_2``` and is of type ```INTEGER```.


### Parameter 53: Day start time

Day start time
Day start time. Format: HHMM.
Values in the range 0 to 2359 may be set.

The manufacturer defined default value is ```900```.

This parameter has the configuration ID ```config_53_2``` and is of type ```INTEGER```.


### Parameter 54: Evening start time

Evening start time
Evening start time. Format: HHMM.
Values in the range 0 to 2359 may be set.

The manufacturer defined default value is ```1800```.

This parameter has the configuration ID ```config_54_2``` and is of type ```INTEGER```.


### Parameter 55: Night Start time

Night Start time
Night start time. Format: HHMM.
Values in the range 0 to 2359 may be set.

The manufacturer defined default value is ```2300```.

This parameter has the configuration ID ```config_55_2``` and is of type ```INTEGER```.


### Parameter 56: Monday morning temp

Monday morning temp
Centigrade value * 10

e.g. 22.5 = 225
Values in the range 40 to 370 may be set.

The manufacturer defined default value is ```240```.

This parameter has the configuration ID ```config_56_2``` and is of type ```INTEGER```.


### Parameter 57: Monday day temp

Monday day temp
Centigrade value * 10

e.g. 22.5 = 225
Values in the range 40 to 370 may be set.

The manufacturer defined default value is ```200```.

This parameter has the configuration ID ```config_57_2``` and is of type ```INTEGER```.


### Parameter 58: Monday evening temp

Monday evening temp
Centigrade value * 10

e.g. 22.5 = 225
Values in the range 40 to 370 may be set.

The manufacturer defined default value is ```230```.

This parameter has the configuration ID ```config_58_2``` and is of type ```INTEGER```.


### Parameter 59: Monday night temp

Monday night temp
Centigrade value * 10

e.g. 22.5 = 225
Values in the range 40 to 370 may be set.

The manufacturer defined default value is ```180```.

This parameter has the configuration ID ```config_59_2``` and is of type ```INTEGER```.


### Parameter 60: Tuesday morning temp

Tuesday morning temp
Centigrade value * 10

e.g. 22.5 = 225
Values in the range 40 to 370 may be set.

The manufacturer defined default value is ```240```.

This parameter has the configuration ID ```config_60_2``` and is of type ```INTEGER```.


### Parameter 61: Tuesday day temp

Tuesday day temp
Centigrade value * 10

e.g. 22.5 = 225
Values in the range 40 to 370 may be set.

The manufacturer defined default value is ```200```.

This parameter has the configuration ID ```config_61_2``` and is of type ```INTEGER```.


### Parameter 62: Tuesday evening temp

Tuesday evening temp
Centigrade value * 10

e.g. 22.5 = 225
Values in the range 40 to 370 may be set.

The manufacturer defined default value is ```230```.

This parameter has the configuration ID ```config_62_2``` and is of type ```INTEGER```.


### Parameter 63: Tuesday night temp

Tuesday night temp
Centigrade value * 10

e.g. 22.5 = 225
Values in the range 40 to 370 may be set.

The manufacturer defined default value is ```180```.

This parameter has the configuration ID ```config_63_2``` and is of type ```INTEGER```.


### Parameter 64: Wednesday morning temp

Wednesday morning temp
Centigrade value * 10

e.g. 22.5 = 225
Values in the range 40 to 370 may be set.

The manufacturer defined default value is ```240```.

This parameter has the configuration ID ```config_64_2``` and is of type ```INTEGER```.


### Parameter 65: Wednesday day temp

Wednesday day temp
Centigrade value * 10

e.g. 22.5 = 225
Values in the range 40 to 370 may be set.

The manufacturer defined default value is ```200```.

This parameter has the configuration ID ```config_65_2``` and is of type ```INTEGER```.


### Parameter 66: Wednesday evening temp

Wednesday evening temp
Centigrade value * 10

e.g. 22.5 = 225
Values in the range 40 to 370 may be set.

The manufacturer defined default value is ```230```.

This parameter has the configuration ID ```config_66_2``` and is of type ```INTEGER```.


### Parameter 67: Wednesday night temp

Wednesday night temp
Centigrade value * 10

e.g. 22.5 = 225
Values in the range 40 to 370 may be set.

The manufacturer defined default value is ```180```.

This parameter has the configuration ID ```config_67_2``` and is of type ```INTEGER```.


### Parameter 68: Thursday morning temp

Thursday morning temp
Centigrade value * 10

e.g. 22.5 = 225
Values in the range 40 to 370 may be set.

The manufacturer defined default value is ```240```.

This parameter has the configuration ID ```config_68_2``` and is of type ```INTEGER```.


### Parameter 69: Thursday day temp

Thursday day temp
Centigrade value * 10

e.g. 22.5 = 225
Values in the range 40 to 370 may be set.

The manufacturer defined default value is ```200```.

This parameter has the configuration ID ```config_69_2``` and is of type ```INTEGER```.


### Parameter 70: Thursday evening temp

Thursday evening temp
Centigrade value * 10

e.g. 22.5 = 225
Values in the range 40 to 370 may be set.

The manufacturer defined default value is ```230```.

This parameter has the configuration ID ```config_70_2``` and is of type ```INTEGER```.


### Parameter 71: Thursday night temp

Thursday night temp
Centigrade value * 10

e.g. 22.5 = 225
Values in the range 40 to 370 may be set.

The manufacturer defined default value is ```180```.

This parameter has the configuration ID ```config_71_2``` and is of type ```INTEGER```.


### Parameter 72: Friday morning temp

Friday morning temp
Centigrade value * 10

e.g. 22.5 = 225
Values in the range 40 to 370 may be set.

The manufacturer defined default value is ```240```.

This parameter has the configuration ID ```config_72_2``` and is of type ```INTEGER```.


### Parameter 73: Friday day temp

Friday day temp
Centigrade value * 10

e.g. 22.5 = 225
Values in the range 40 to 370 may be set.

The manufacturer defined default value is ```200```.

This parameter has the configuration ID ```config_73_2``` and is of type ```INTEGER```.


### Parameter 74: Friday evening temp

Friday evening temp
Centigrade value * 10

e.g. 22.5 = 225
Values in the range 40 to 370 may be set.

The manufacturer defined default value is ```230```.

This parameter has the configuration ID ```config_74_2``` and is of type ```INTEGER```.


### Parameter 75: Friday night temp

Friday night temp
Centigrade value * 10

e.g. 22.5 = 225
Values in the range 40 to 370 may be set.

The manufacturer defined default value is ```180```.

This parameter has the configuration ID ```config_75_2``` and is of type ```INTEGER```.


### Parameter 76: Saturday morning temp

Saturday morning temp
Centigrade value * 10

e.g. 22.5 = 225
Values in the range 40 to 370 may be set.

The manufacturer defined default value is ```240```.

This parameter has the configuration ID ```config_76_2``` and is of type ```INTEGER```.


### Parameter 77: Saturday day temp

Saturday day temp
Centigrade value * 10

e.g. 22.5 = 225
Values in the range 40 to 370 may be set.

The manufacturer defined default value is ```200```.

This parameter has the configuration ID ```config_77_2``` and is of type ```INTEGER```.


### Parameter 78: Saturday evening temp

Saturday evening temp
Centigrade value * 10

e.g. 22.5 = 225
Values in the range 40 to 370 may be set.

The manufacturer defined default value is ```230```.

This parameter has the configuration ID ```config_78_2``` and is of type ```INTEGER```.


### Parameter 79: Saturday night temp

Saturday night temp
Centigrade value * 10

e.g. 22.5 = 225
Values in the range 40 to 370 may be set.

The manufacturer defined default value is ```180```.

This parameter has the configuration ID ```config_79_2``` and is of type ```INTEGER```.


### Parameter 80: Sunday morning temp

Sunday morning temp
Centigrade value * 10

e.g. 22.5 = 225
Values in the range 40 to 370 may be set.

The manufacturer defined default value is ```240```.

This parameter has the configuration ID ```config_80_2``` and is of type ```INTEGER```.


### Parameter 81: Sunday day temp

Sunday day temp
Centigrade value * 10

e.g. 22.5 = 225
Values in the range 40 to 370 may be set.

The manufacturer defined default value is ```200```.

This parameter has the configuration ID ```config_81_2``` and is of type ```INTEGER```.


### Parameter 82: Sunday evening temp

Sunday evening temp
Centigrade value * 10

e.g. 22.5 = 225
Values in the range 40 to 370 may be set.

The manufacturer defined default value is ```230```.

This parameter has the configuration ID ```config_82_2``` and is of type ```INTEGER```.


### Parameter 83: Sunday night temp

Sunday night temp
Centigrade value * 10

e.g. 22.5 = 225
Values in the range 40 to 370 may be set.

The manufacturer defined default value is ```180```.

This parameter has the configuration ID ```config_83_2``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The HE-ZW-THERM-FL2 supports 2 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Used to connect Z-Wave gateway

Association group 1 supports 10 nodes.

### Group 2: Basic Set command

It sends Basic Set command with value 0 (Off state) when thermostat goes to IDLE mode and sends 255 (ON state) when the thermostat goes to HEATING mode.

Association group 2 supports 10 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V10| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_THERMOSTAT_MODE_V1| |
| COMMAND_CLASS_THERMOSTAT_OPERATING_STATE_V1| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_CLOCK_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Heltun Heating Thermostat Manual](https://www.cd-jackson.com/zwave_device_uploads/1023/HELTUN-Heating-Thermostat-Manual-v1-0.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1023).
