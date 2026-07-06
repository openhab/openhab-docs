---
layout: documentation
title: HE-TPS05 - ZWave
---

{% include base.html %}

# HE-TPS05 Touch Panel Switch Quinto
This describes the Z-Wave device *HE-TPS05*, manufactured by *Heltun* with the thing type UID of ```heltun_hetps05_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![HE-TPS05 product image](https://opensmarthouse.org/zwavedatabase/1563/image/)


The HE-TPS05 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

HELTUN HE-TPS05 Advanced Programmable Touch Panel Switch Quinto brings "Impossibly Smart" capabilities to your home lighting, electric outlets, or motorized blinds, door locks, gates, and valves. It replaces an existing in-wall switch and brings over-the-Internet monitoring, control, and advanced programmability. Device is "Impossibly Thin" on the wall yet packed with features to provide the ultimate in control and convenience:  


Controls up to five systems with two different power sources

Connects to Z-Wave lights and dimmers

Controls motorized devices

Measures energy consumption

Has 5 ways to trigger programmed scenarios:

  * 5 buttons
  * Real Time Clock (RTC)
  * Temperature sensor
  * Humidity sensor
  * Ambient light sensor

### Inclusion Information

Start the Inclusion Mode from the gateway/controller.  


To start the inclusion process on the HE-TPS05, simultaneously press the two upper touch buttons and hold them for three seconds.

All buttons will then sequentially blink ‘blue-red’.

If the inclusion has been successful, all buttons will turn blue for three seconds.

If the inclusion was not successful, all buttons will turn red for three seconds. In that case repeat the inclusion process.

### Exclusion Information

Start the Exclusion Mode from the gateway/controller.  


To start the exclusion process on the HE-TPS05, simultaneously press the two upper touch buttons and hold them for three seconds.

All buttons will sequentially blink blue-red.

If the exclusion has been successful, all buttons will turn red for three seconds.

If the exclusion was not successful, all buttons will turn blue for three seconds. In that case repeat the exclusion process.

Note: If the HE-TPS05 has previously been part of a Z-Wave network and not Excluded since, Inclusion is not possible without first performing an Exclusion or Factory Reset procedure.

### General Usage Information



## Channels

The following table summarises the channels available for the HE-TPS05 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Sensor (luminance) | sensor_luminance | sensor_luminance |  | Number | 
| Sensor (relative humidity) | sensor_relhumidity | sensor_relhumidity | Humidity | Number | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Scene Number | scene_number | scene_number |  | Number | 
| Clock Time Offset | time_offset | time_offset | Time | Number | 
| Switch 1 backlight | switch_binary1 | switch_binary | Switch | Switch | 
| Switch 2 backlight | switch_binary2 | switch_binary | Switch | Switch | 
| Switch 3 backlight | switch_binary3 | switch_binary | Switch | Switch | 
| Switch 4 backlight | switch_binary4 | switch_binary | Switch | Switch | 
| Switch 5 backlight | switch_binary5 | switch_binary | Switch | Switch | 
| Switch 1 | switch_binary6 | switch_binary | Switch | Switch | 
| Switch 2 | switch_binary7 | switch_binary | Switch | Switch | 
| Switch 3 | switch_binary8 | switch_binary | Switch | Switch | 
| Switch 4 | switch_binary9 | switch_binary | Switch | Switch | 
| Switch 5 | switch_binary10 | switch_binary | Switch | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Sensor (luminance)
Indicates the current light reading.

The ```sensor_luminance``` channel is of type ```sensor_luminance``` and supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Sensor (relative humidity)
Indicates the current relative humidity.

The ```sensor_relhumidity``` channel is of type ```sensor_relhumidity``` and supports the ```Number``` item and is in the ```Humidity``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.
This channel provides the scene, and the event as a decimal value in the form ```<scene>.<event>```. The scene number is set by the device, and the event is as follows -:

| Event ID | Event Description  |
|----------|--------------------|
| 0        | Single key press   |
| 1        | Key released       |
| 2        | Key held down      |
| 3        | Double keypress    |
| 4        | Tripple keypress   |
| 5        | 4 x keypress       |
| 6        | 5 x keypress       |

### Clock Time Offset
Provides the current time difference for the devices time.

The ```time_offset``` channel is of type ```time_offset``` and supports the ```Number``` item and is in the ```Time``` category.

### Switch 1 backlight
Switch the power on and off.

The ```switch_binary1``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 2 backlight
Switch the power on and off.

The ```switch_binary2``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 3 backlight
Switch the power on and off.

The ```switch_binary3``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 4 backlight
Switch the power on and off.

The ```switch_binary4``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 5 backlight
Switch the power on and off.

The ```switch_binary5``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 1
Switch the power on and off.

The ```switch_binary6``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 2
Switch the power on and off.

The ```switch_binary7``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 3
Switch the power on and off.

The ```switch_binary8``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 4
Switch the power on and off.

The ```switch_binary9``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 5
Switch the power on and off.

The ```switch_binary10``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.



## Device Configuration

The following table provides a summary of the 83 configuration parameters available in the HE-TPS05.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Frequency Region | Frequency Region |
| 3 | Hardware and Software Versions | Hardware and Software Versions |
| 4 | Energy Consumption | Energy Consumption, kW |
| 5 | Backlight brightness control | Backlight brightness control |
| 6 | Touch buttons sensitivity | Touch buttons sensitivity. 1 = Lowest; 10 = Highest |
| 7 | Relay 1 output NO or NC mode | Relay 1 output NO or NC mode |
| 8 | Relay 2 output NO or NC mode | Relay 2 output NO or NC mode |
| 9 | Relay 3 output NO or NC mode | Relay 3 output NO or NC mode |
| 10 | Relay 4 output NO or NC mode | Relay 4 output NO or NC mode |
| 11 | Relay 5 output NO or NC mode | Relay 5 output NO or NC mode |
| 12 | Power of the Relay 1 load | Power of the Relay 1 load in W |
| 13 | Power of the Relay 2 load | Power of the Relay 2 load in W |
| 14 | Power of the Relay 3 load | Power of the Relay 3 load in W |
| 15 | Power of the Relay 4 load | Power of the Relay 4 load in W |
| 16 | Power of the Relay 5 load | Power of the Relay 5 load in W |
| 17 | Air Temperature Calibration | Air Temperature Calibration in °C, value X 10, e.g. 1.0°C=10 |
| 19 | Time correction by controller | Time correction by controller |
| 21 | Week Day | Week Day |
| 22 | Time Manual Adjustment | Time: Hour and Minutes |
| 30 | Buttons Backlight Color | Active state backlight color |
| 31 | Backlight 1 control source | Backlight 1 control source |
| 32 | Backlight 2 control source | Backlight 2 control source |
| 33 | Backlight 3 control source | Backlight 3 control source |
| 34 | Backlight 4 control source | Backlight 4 control source |
| 35 | Backlight 5 control source | Backlight 5 control source |
| 41 | Hold control mode for touch button 1 | Hold control mode for touch button 1 |
| 42 | Hold control mode for touch button 2 | Hold control mode for touch button 2 |
| 43 | Hold control mode for touch button 3 | Hold control mode for touch button 3 |
| 44 | Hold control mode for touch button 4 | Hold control mode for touch button 4 |
| 45 | Hold control mode for touch button 5 | Hold control mode for touch button 5 |
| 51 | Click control mode for touch button 1 | Click control mode for touch button 1 |
| 52 | Click control mode for touch button 2 | Click control mode for touch button 2 |
| 53 | Click control mode for touch button 3 | Click control mode for touch button 3 |
| 54 | Click control mode for touch button 4 | Click control mode for touch button 4 |
| 55 | Click control mode for touch button 5 | Click control mode for touch button 5 |
| 61 | Relay 1 control source | Relay 1 control source |
| 62 | Relay 2 control source | Relay 2 control source |
| 63 | Relay 3 control source | Relay 3 control source |
| 64 | Relay 4 control source | Relay 4 control source |
| 65 | Relay 5 control source | Relay 5 control source |
| 66 | Restore 1st Relay State After Power Failure | Restore 1st Relay State After Power Failure |
| 67 | Restore 2nd Relay State After Power Failure | Restore 2nd Relay State After Power Failure |
| 68 | Restore 3rd Relay State After Power Failure | Restore 3rd Relay State After Power Failure |
| 69 | Restore 4th Relay State After Power Failure | Restore 4th Relay State After Power Failure |
| 70 | Restore 5th Relay State After Power Failure | Restore 5th Relay State After Power Failure |
| 71 | Timer mode duration for button 1 | Timer mode duration for button 1 |
| 72 | Timer mode duration for button 2 | Timer mode duration for button 2 |
| 73 | Timer mode duration for button 3 | Timer mode duration for button 3 |
| 74 | Timer mode duration for button 4 | Timer mode duration for button 4 |
| 75 | Timer mode duration for button 5 | Timer mode duration for button 5 |
| 101 | Group 1 relay inverse mode | Group 1 relay inverse mode |
| 102 | Group 2 relay inverse mode | Group 2 relay inverse mode |
| 111 | Relay control scenario 1 | Relay control scenario 1 |
| 112 | Relay control scenario 2 | Relay control scenario 2 |
| 113 | Relay control scenario 3 | Relay control scenario 3 |
| 114 | Relay control scenario 4 | Relay control scenario 4 |
| 115 | Relay control scenario 5 | Relay control scenario 5 |
| 116 | Relay control scenario 6 | Relay control scenario 6 |
| 117 | Relay control scenario 7 | Relay control scenario 7 |
| 118 | Relay control scenario 8 | Relay control scenario 8 |
| 119 | Relay control scenario 9 | Relay control scenario 9 |
| 120 | Relay control scenario 10 | Relay control scenario 10 |
| 141 | Consumption reporting interval | Consumption meter consecutive reporting interval |
| 142 | Consumption change report to send to controller | Consumption change report to send to controller |
| 143 | Sensors reporting interval | Sensors consecutive reporting interval |
| 144 | Temperature difference to send to controller | Temperature difference to send to controller |
| 145 | Humidity difference to send to controller | Humidity difference to send to controller |
| 146 | Light difference to send to controller | Light sensor values difference to send to controller |
| 171 | Button 1 associations touch control mode | Touch control mode for associations with touch button 1 |
| 172 | Button 2 associations touch control mode | Touch control mode for associations with touch button 2 |
| 173 | Button 3 associations touch control mode | Touch control mode for associations with touch button 3 |
| 174 | Button 4 associations touch control mode | Touch control mode for associations with touch button 4 |
| 175 | Button 5 associations touch control mode | Touch control mode for associations with touch button 5 |
| 181 | Button 1 association dimming level | Dimming Brightness Level for association with touch button 1 |
| 182 | Button 2 association dimming level | Dimming Brightness Level for association with touch button 2 |
| 183 | Button 3 association dimming level | Dimming Brightness Level for association with touch button 3 |
| 184 | Button 4 association dimming level | Dimming Brightness Level for association with touch button 4 |
| 185 | Button 5 association dimming level | Dimming Brightness Level for association with touch button 5 |
| 191 | Button 1 association dimming duration | Dimming Duration for association with touch button 1 |
| 192 | Button 2 association dimming duration | Dimming Duration for association with touch button 2 |
| 193 | Button 3 association dimming duration | Dimming Duration for association with touch button 3 |
| 194 | Button 4 association dimming duration | Dimming Duration for association with touch button 4 |
| 195 | Button 5 association dimming duration | Dimming Duration for association with touch button 5 |

### Parameter 1: Frequency Region

Frequency Region
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | EU (868.4 MHz, 869.85 MHz) |
| 1 | US (908.4 MHz, 916.0 MHz) |
| 2 | ANZ (919.8 MHz, 921.4 MHz) |
| 3 | HK (919.8 MHz) |
| 4 | IN (865.2 MHz) |
| 5 | IL (916.0 MHz) |
| 6 | RU (869.0 MHz) |
| 7 | CN (868.4 MHz) |
| 8 | JP (922.5 MHz, 923.9 MHz, 926.3 MHz) |
| 9 | KR (920.9 MHz, 921.7 MHz, 923.1 MHz) |

The manufacturer defined default value is ```0``` (EU (868.4 MHz, 869.85 MHz)).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 3: Hardware and Software Versions

Hardware and Software Versions
This Parameter allows to check the hardware and firmware versions of the device. The Parameter returns value in the format XXYYZZ, where XX is Hardware Version, YY is Firmware Major Version and ZZ is Firmware Minor Version.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_3_4``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 4: Energy Consumption

Energy Consumption, kW
This Parameter allows to check the Cumulative Energy Consumption (in kW) of the connected loads.

HE-TPS05 monitors Real-Time and Cumulative power Energy Consumption of connected loads using advanced software logic which measures the consumption based on loads power value set in Parameters from 12 to 16.

Cumulative Energy Consumption is the total electrical power being used by connected loads since the Parameter 04 value last reset. Power usage is calculated by the software using the values that were manually set when configuring Parameters 12-16, multiplied by the time tracked when the HE-TPS05 corresponding output was in ON state.

Real-Time Consumption and Cumulative Consumption are periodically reported to the Z- Wave controller according to the Parameter 141 and 142 settings.

≡ Note: This Parameter is read-only.

Resetting Cumulative Consumption memory:

The HE-TPS05 enables you to erase stored Consumption Data through the Z-Wave network as follows:

1. Make sure the HE-TPS05 is powered.

2. If not already done so, include the device into Z-Wave Gateway network.

3. Reset memory consumption data using the Reset Command in COMMAND\_CLASS\_METER (see the Gateway owner’s manual).

≡ Note: Turning the device main power off/on will not erase the consumption data as it is stored in nonvolatile memory.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_4_4``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 5: Backlight brightness control

Backlight brightness control
The HE-TPS05 can adjust its buttons backlight brightness automatically depending on the illumination of the ambient environment and also allows to control it manually. Set the Parameter value to 0 to activate the Automatic Brightness Control or set from value 1 (lowest brightness) to 10 (highest brightness) for Manual Control. The factory default value is 0.
Values in the range 0 to 10 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Touch buttons sensitivity

Touch buttons sensitivity. 1 = Lowest; 10 = Highest
This Parameter allows the device Touch Button Sensitivity Threshold to be adjusted from level 1 (low sensitivity) to 10 (high sensitivity). The factory default value is 6.

Note: Setting the sensitivity too high can lead to false touch detection. We recommend not changing this Parameter unless there is a special need to do so.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 1 to 10 may be set.

The manufacturer defined default value is ```6```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Relay 1 output NO or NC mode

Relay 1 output NO or NC mode
This parameter determines the type of load connected to the device relay 1 output. The outputs type can be NO – normal open (no contact/voltage to switch the load OFF) or NC - normal close (output is contacted / there is a voltage to switch the load OFF). Choose the value 0 if NO contact type is required or value 1 if NC type is required.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | NO |
| 1 | NC |

The manufacturer defined default value is ```0``` (NO).

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Relay 2 output NO or NC mode

Relay 2 output NO or NC mode
This parameter determines the type of load connected to the device relay 2 output. The outputs type can be NO – normal open (no contact/voltage to switch the load OFF) or NC - normal close (output is contacted / there is a voltage to switch the load OFF). Choose the value 0 if NO contact type is required or value 1 if NC type is required.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | NO |
| 1 | NC |

The manufacturer defined default value is ```0``` (NO).

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Relay 3 output NO or NC mode

Relay 3 output NO or NC mode
This parameter determines the type of load connected to the device relay 3 output. The outputs type can be NO – normal open (no contact/voltage to switch the load OFF) or NC - normal close (output is contacted / there is a voltage to switch the load OFF). Choose the value 0 if NO contact type is required or value 1 if NC type is required.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | NO |
| 1 | NC |

The manufacturer defined default value is ```0``` (NO).

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: Relay 4 output NO or NC mode

Relay 4 output NO or NC mode
This parameter determines the type of load connected to the device relay 4 output. The outputs type can be NO – normal open (no contact/voltage to switch the load OFF) or NC - normal close (output is contacted / there is a voltage to switch the load OFF). Choose the value 0 if NO contact type is required or value 1 if NC type is required.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | NO |
| 1 | NC |

The manufacturer defined default value is ```0``` (NO).

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: Relay 5 output NO or NC mode

Relay 5 output NO or NC mode
This parameter determines the type of load connected to the device relay 5 output. The outputs type can be NO – normal open (no contact/voltage to switch the load OFF) or NC - normal close (output is contacted / there is a voltage to switch the load OFF). Choose the value 0 if NO contact type is required or value 1 if NC type is required.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | NO |
| 1 | NC |

The manufacturer defined default value is ```0``` (NO).

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Power of the Relay 1 load

Power of the Relay 1 load in W
This parameter is used to specify the load power that is connected to the device output 1. Using your connected device’s power consumption specification (see associated owner’s manual), set the load in Watts. The factory default value is 0.
Values in the range 0 to 1100 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 13: Power of the Relay 2 load

Power of the Relay 2 load in W
This parameter is used to specify the load power that is connected to the device output 2. Using your connected device’s power consumption specification (see associated owner’s manual), set the load in Watts. The factory default value is 0.
Values in the range 0 to 1100 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_13_2``` and is of type ```INTEGER```.


### Parameter 14: Power of the Relay 3 load

Power of the Relay 3 load in W
This parameter is used to specify the load power that is connected to the device output 3. Using your connected device’s power consumption specification (see associated owner’s manual), set the load in Watts. The factory default value is 0.
Values in the range 0 to 1100 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_14_2``` and is of type ```INTEGER```.


### Parameter 15: Power of the Relay 4 load

Power of the Relay 4 load in W
This parameter is used to specify the load power that is connected to the device output 4. Using your connected device’s power consumption specification (see associated owner’s manual), set the load in Watts. The factory default value is 0.
Values in the range 0 to 1100 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_15_2``` and is of type ```INTEGER```.


### Parameter 16: Power of the Relay 5 load

Power of the Relay 5 load in W
This parameter is used to specify the load power that is connected to the device output 5. Using your connected device’s power consumption specification (see associated owner’s manual), set the load in Watts. The factory default value is 0.
Values in the range 0 to 1100 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_16_2``` and is of type ```INTEGER```.


### Parameter 17: Air Temperature Calibration

Air Temperature Calibration in °C, value X 10, e.g. 1.0°C=10
This parameter defines the offset value for room air temperature. If the internal air temperature sensor is not correctly calibrated, then manual calibration can be made by adjusting the values up to ±10°C. This value will be added or subtracted from the internal air temperature sensor reading. The value of this Parameter should be x10, e.g. for 1.5°C set the value 15. The factory default value is 0This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range -100 to 100 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 19: Time correction by controller

Time correction by controller
If this Parameter value = 1 and the HE-TPS05 is connected to a Z-Wave gateway, the HE-TPS05 time and day will be periodically polled and corrected from the gateway. To switch off auto-correction set the Parameter value to 0. The factory default value is 1.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_19_1``` and is of type ```INTEGER```.


### Parameter 21: Week Day

Week Day
This Parameter allows manual adjustment of the day of the week in case the HE-TPS05 is not connected to any Z-Wave gateway or auto-correction is disabled (Parameter 19 value is 0). 1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 = Friday, 6 = Saturday, 7 = Sunday. The factory default value is 1.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured, in addition to values in the range 1 to 7 -:

| Value  | Description |
|--------|-------------|
| 1 | Monday |
| 2 | Tuesday |
| 3 | Wednesday |
| 4 | Thursday |
| 5 | Friday |
| 6 | Saturday |
| 7 | Sunday |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_21_1``` and is of type ```INTEGER```.


### Parameter 22: Time Manual Adjustment

Time: Hour and Minutes
This Parameter allows manual adjustment of Time. The Parameter has the following format: HHMM, where HH is hours and MM is minutes. E.g. for 16:08 set the value 1608 and for 1:00 set the value 100.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 2359 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_22_2``` and is of type ```INTEGER```.


### Parameter 30: Buttons Backlight Color

Active state backlight color
Choose the value “1” if you wish the backlight active state to be blue, and the inactive state to be red (default). Choose the value “0” if you wish the backlight active state to be red, and the inactive state to be blue. The factory default value is 1.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_30_1``` and is of type ```INTEGER```.


### Parameter 31: Backlight 1 control source

Backlight 1 control source
0 – Backlight is disabled (both color LEDs are turned off)

1 – Backlight is controlled by touch button (reflects the button state)

2 – Backlight is controlled by gateway or associated device (the button state is ignored)

Note: If the backlight is disabled (the Parameter value is set to “0”), it is also impossible to control it from the gateway.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_31_1``` and is of type ```INTEGER```.


### Parameter 32: Backlight 2 control source

Backlight 2 control source
0 – Backlight is disabled (both color LEDs are turned off)

1 – Backlight is controlled by touch button (reflects the button state)

2 – Backlight is controlled by gateway or associated device (the button state is ignored)

Note: If the backlight is disabled (the Parameter value is set to “0”), it is also impossible to control it from the gateway.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_32_1``` and is of type ```INTEGER```.


### Parameter 33: Backlight 3 control source

Backlight 3 control source
0 – Backlight is disabled (both color LEDs are turned off)

1 – Backlight is controlled by touch button (reflects the button state)

2 – Backlight is controlled by gateway or associated device (the button state is ignored)

Note: If the backlight is disabled (the Parameter value is set to “0”), it is also impossible to control it from the gateway.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_33_1``` and is of type ```INTEGER```.


### Parameter 34: Backlight 4 control source

Backlight 4 control source
0 – Backlight is disabled (both color LEDs are turned off)

1 – Backlight is controlled by touch button (reflects the button state)

2 – Backlight is controlled by gateway or associated device (the button state is ignored)

Note: If the backlight is disabled (the Parameter value is set to “0”), it is also impossible to control it from the gateway.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_34_1``` and is of type ```INTEGER```.


### Parameter 35: Backlight 5 control source

Backlight 5 control source
0 – Backlight is disabled (both color LEDs are turned off)

1 – Backlight is controlled by touch button (reflects the button state)

2 – Backlight is controlled by gateway or associated device (the button state is ignored)

Note: If the backlight is disabled (the Parameter value is set to “0”), it is also impossible to control it from the gateway.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_35_1``` and is of type ```INTEGER```.


### Parameter 41: Hold control mode for touch button 1

Hold control mode for touch button 1
0 – Hold function is disabled

1 – Operate like click

2 – When the button is held the relay output state is ON, as soon as the button is released the relay output state changes to OFF (momentary switch).

3 – When the button is held the relay output state is OFF, as soon as the button is released the relay output state changes to ON (momentary switch).

4 – When the button is held or released the relay output state will toggle its state (ON to OFF or OFF to ON).

The factory default value is 2.  


**Note:** Regardless of this Parameter, the device will send scene notifications about the touch state (pressed, held, released) to the gateway.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 4 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_41_1``` and is of type ```INTEGER```.


### Parameter 42: Hold control mode for touch button 2

Hold control mode for touch button 2
0 – Hold function is disabled

1 – Operate like click

2 – When the button is held the relay output state is ON, as soon as the button is released the relay output state changes to OFF (momentary switch).

3 – When the button is held the relay output state is OFF, as soon as the button is released the relay output state changes to ON (momentary switch).

4 – When the button is held or released the relay output state will toggle its state (ON to OFF or OFF to ON).

The factory default value is 2.

Note: Regardless of this Parameter, the device will send scene notifications about the touch state (pressed, held, released) to the gateway.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 4 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_42_1``` and is of type ```INTEGER```.


### Parameter 43: Hold control mode for touch button 3

Hold control mode for touch button 3
0 – Hold function is disabled

1 – Operate like click

2 – When the button is held the relay output state is ON, as soon as the button is released the relay output state changes to OFF (momentary switch).

3 – When the button is held the relay output state is OFF, as soon as the button is released the relay output state changes to ON (momentary switch).

4 – When the button is held or released the relay output state will toggle its state (ON to OFF or OFF to ON).

The factory default value is 2.

Note: Regardless of this Parameter, the device will send scene notifications about the touch state (pressed, held, released) to the gateway.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 4 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_43_1``` and is of type ```INTEGER```.


### Parameter 44: Hold control mode for touch button 4

Hold control mode for touch button 4
0 – Hold function is disabled

1 – Operate like click

2 – When the button is held the relay output state is ON, as soon as the button is released the relay output state changes to OFF (momentary switch).

3 – When the button is held the relay output state is OFF, as soon as the button is released the relay output state changes to ON (momentary switch).

4 – When the button is held or released the relay output state will toggle its state (ON to OFF or OFF to ON).

The factory default value is 2.

Note: Regardless of this Parameter, the device will send scene notifications about the touch state (pressed, held, released) to the gateway.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 4 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_44_1``` and is of type ```INTEGER```.


### Parameter 45: Hold control mode for touch button 5

Hold control mode for touch button 5
0 – Hold function is disabled

1 – Operate like click

2 – When the button is held the relay output state is ON, as soon as the button is released the relay output state changes to OFF (momentary switch).

3 – When the button is held the relay output state is OFF, as soon as the button is released the relay output state changes to ON (momentary switch).

4 – When the button is held or released the relay output state will toggle its state (ON to OFF or OFF to ON).

The factory default value is 2.

Note: Regardless of this Parameter, the device will send scene notifications about the touch state (pressed, held, released) to the gateway.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 4 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_45_1``` and is of type ```INTEGER```.


### Parameter 51: Click control mode for touch button 1

Click control mode for touch button 1
0 – Press function disabled

1 – Relay inverts state (toggles ON to OFF, OFF to ON) according to the relay state

2 – Relay inverts state (toggles ON to OFF, OFF to ON) according to the button backlight state.

3 – Relay switches to ON state only

4 – Relay switches to OFF state only

5 – Timer: On>Off Mode: Relay output switches to ON state (contacts are closed) then after a specified time switches back to OFF state (contacts are open). The time is specified in Parameters 71-75.

6 – Timer: OFF>ON Mode: Relay output switches to OFF state (contacts are open) then after a specified time switches back to ON state (contacts are closed). The time is specified in Parameters 71-75.

The factory default value is 1This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 6 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_51_1``` and is of type ```INTEGER```.


### Parameter 52: Click control mode for touch button 2

Click control mode for touch button 2
0 – Press function disabled

1 – Relay inverts state (toggles ON to OFF, OFF to ON) according to the relay state

2 – Relay inverts state (toggles ON to OFF, OFF to ON) according to the button backlight state.

3 – Relay switches to ON state only

4 – Relay switches to OFF state only

5 – Timer: On>Off Mode: Relay output switches to ON state (contacts are closed) then after a specified time switches back to OFF state (contacts are open). The time is specified in Parameters 71-75.

6 – Timer: OFF>ON Mode: Relay output switches to OFF state (contacts are open) then after a specified time switches back to ON state (contacts are closed). The time is specified in Parameters 71-75.

The factory default value is 1This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 6 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_52_1``` and is of type ```INTEGER```.


### Parameter 53: Click control mode for touch button 3

Click control mode for touch button 3
0 – Press function disabled

1 – Relay inverts state (toggles ON to OFF, OFF to ON) according to the relay state

2 – Relay inverts state (toggles ON to OFF, OFF to ON) according to the button backlight state.

3 – Relay switches to ON state only

4 – Relay switches to OFF state only

5 – Timer: On>Off Mode: Relay output switches to ON state (contacts are closed) then after a specified time switches back to OFF state (contacts are open). The time is specified in Parameters 71-75.

6 – Timer: OFF>ON Mode: Relay output switches to OFF state (contacts are open) then after a specified time switches back to ON state (contacts are closed). The time is specified in Parameters 71-75.

The factory default value is 1This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 6 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_53_1``` and is of type ```INTEGER```.


### Parameter 54: Click control mode for touch button 4

Click control mode for touch button 4
0 – Press function disabled

1 – Relay inverts state (toggles ON to OFF, OFF to ON) according to the relay state

2 – Relay inverts state (toggles ON to OFF, OFF to ON) according to the button backlight state.

3 – Relay switches to ON state only

4 – Relay switches to OFF state only

5 – Timer: On>Off Mode: Relay output switches to ON state (contacts are closed) then after a specified time switches back to OFF state (contacts are open). The time is specified in Parameters 71-75.

6 – Timer: OFF>ON Mode: Relay output switches to OFF state (contacts are open) then after a specified time switches back to ON state (contacts are closed). The time is specified in Parameters 71-75.

The factory default value is 1This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 6 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_54_1``` and is of type ```INTEGER```.


### Parameter 55: Click control mode for touch button 5

Click control mode for touch button 5
0 – Press function disabled

1 – Relay inverts state (toggles ON to OFF, OFF to ON) according to the relay state

2 – Relay inverts state (toggles ON to OFF, OFF to ON) according to the button backlight state.

3 – Relay switches to ON state only

4 – Relay switches to OFF state only

5 – Timer: On>Off Mode: Relay output switches to ON state (contacts are closed) then after a specified time switches back to OFF state (contacts are open). The time is specified in Parameters 71-75.

6 – Timer: OFF>ON Mode: Relay output switches to OFF state (contacts are open) then after a specified time switches back to ON state (contacts are closed). The time is specified in Parameters 71-75.

The factory default value is 1This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 6 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_55_1``` and is of type ```INTEGER```.


### Parameter 61: Relay 1 control source

Relay 1 control source
0 – Controlled by gateway or associated device 

1 – Controlled by touch button N1 (Top Left)

2 – Controlled by touch button N2 (Top Right)

3 – Controlled by touch button N3 (Bottom Left) 

4 – Controlled by touch button N4 (Bottom Right) 

5 – Controlled by touch button N5 (Center)This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 5 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_61_1``` and is of type ```INTEGER```.


### Parameter 62: Relay 2 control source

Relay 2 control source
0 – Controlled by gateway or associated device 

1 – Controlled by touch button N1 (Top Left)

2 – Controlled by touch button N2 (Top Right)

3 – Controlled by touch button N3 (Bottom Left) 

4 – Controlled by touch button N4 (Bottom Right) 

5 – Controlled by touch button N5 (Center)This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 5 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_62_1``` and is of type ```INTEGER```.


### Parameter 63: Relay 3 control source

Relay 3 control source
0 – Controlled by gateway or associated device 

1 – Controlled by touch button N1 (Top Left)

2 – Controlled by touch button N2 (Top Right)

3 – Controlled by touch button N3 (Bottom Left) 

4 – Controlled by touch button N4 (Bottom Right) 

5 – Controlled by touch button N5 (Center)This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 5 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_63_1``` and is of type ```INTEGER```.


### Parameter 64: Relay 4 control source

Relay 4 control source
0 – Controlled by gateway or associated device 

1 – Controlled by touch button N1 (Top Left)

2 – Controlled by touch button N2 (Top Right)

3 – Controlled by touch button N3 (Bottom Left) 

4 – Controlled by touch button N4 (Bottom Right) 

5 – Controlled by touch button N5 (Center)This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 5 may be set.

The manufacturer defined default value is ```4```.

This parameter has the configuration ID ```config_64_1``` and is of type ```INTEGER```.


### Parameter 65: Relay 5 control source

Relay 5 control source
0 – Controlled by gateway or associated device 

1 – Controlled by touch button N1 (Top Left)

2 – Controlled by touch button N2 (Top Right)

3 – Controlled by touch button N3 (Bottom Left) 

4 – Controlled by touch button N4 (Bottom Right) 

5 – Controlled by touch button N5 (Center)This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 5 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_65_1``` and is of type ```INTEGER```.


### Parameter 66: Restore 1st Relay State After Power Failure

Restore 1st Relay State After Power Failure
This Parameter determines whether the relay last state should be restored after power failure. Set the value 1 if there is a need to restore the relay to the state it was before power failure. The relay state will always be Off after power failure if the value of this Parameter is 0. The factory default value is 0.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_66_1``` and is of type ```INTEGER```.


### Parameter 67: Restore 2nd Relay State After Power Failure

Restore 2nd Relay State After Power Failure
This Parameter determines whether the relay last state should be restored after power failure. Set the value 1 if there is a need to restore the relay to the state it was before power failure. The relay state will always be Off after power failure if the value of this Parameter is 0. The factory default value is 0.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_67_1``` and is of type ```INTEGER```.


### Parameter 68: Restore 3rd Relay State After Power Failure

Restore 3rd Relay State After Power Failure
This Parameter determines whether the relay last state should be restored after power failure. Set the value 1 if there is a need to restore the relay to the state it was before power failure. The relay state will always be Off after power failure if the value of this Parameter is 0. The factory default value is 0.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_68_1``` and is of type ```INTEGER```.


### Parameter 69: Restore 4th Relay State After Power Failure

Restore 4th Relay State After Power Failure
This Parameter determines whether the relay last state should be restored after power failure. Set the value 1 if there is a need to restore the relay to the state it was before power failure. The relay state will always be Off after power failure if the value of this Parameter is 0. The factory default value is 0.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_69_1``` and is of type ```INTEGER```.


### Parameter 70: Restore 5th Relay State After Power Failure

Restore 5th Relay State After Power Failure
This Parameter determines whether the relay last state should be restored after power failure. Set the value 1 if there is a need to restore the relay to the state it was before power failure. The relay state will always be Off after power failure if the value of this Parameter is 0. The factory default value is 0.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_70_1``` and is of type ```INTEGER```.


### Parameter 71: Timer mode duration for button 1

Timer mode duration for button 1
These Parameters specify the duration in seconds for the Timer mode (values 5 or 6 in Parameters 51-55 respectively). Press the button and the relay output goes to ON/OFF for the specified time then changes back to OFF/ON. This function can be used to open/close garage doors, blinds, curtains, etc. or to turn attached devices like door lock or security OFF for a short time. The time values can be configured from 0 sec to 32400 sec (9 hours). Set the value for Relay 1 (“OUT-1”) in Parameter 71, for Relay 2 (“OUT-2”) in Parameter 72, for Relay 3 (“OUT-3”) in Parameter 73, for Relay 4 (“OUT-4”) in Parameter 74, for Relay 5 (“OUT- 5”) in Parameter 75. The factory default value is 0.

Note: If the parameter value is set to “0” it will operate as a short contact (about 500mSec).

Note: If the parameter value is set to “-1” it will operate as a shorter contact (about 50mSec).This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range -1 to 32400 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_71_2``` and is of type ```INTEGER```.


### Parameter 72: Timer mode duration for button 2

Timer mode duration for button 2
These Parameters specify the duration in seconds for the Timer mode (values 5 or 6 in Parameters 51-55 respectively). Press the button and the relay output goes to ON/OFF for the specified time then changes back to OFF/ON. This function can be used to open/close garage doors, blinds, curtains, etc. or to turn attached devices like door lock or security OFF for a short time. The time values can be configured from 0 sec to 32400 sec (9 hours). Set the value for Relay 1 (“OUT-1”) in Parameter 71, for Relay 2 (“OUT-2”) in Parameter 72, for Relay 3 (“OUT-3”) in Parameter 73, for Relay 4 (“OUT-4”) in Parameter 74, for Relay 5 (“OUT- 5”) in Parameter 75. The factory default value is 0.

Note: If the parameter value is set to “0” it will operate as a short contact (about 500mSec).

Note: If the parameter value is set to “-1” it will operate as a shorter contact (about 50mSec).This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range -1 to 32400 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_72_2``` and is of type ```INTEGER```.


### Parameter 73: Timer mode duration for button 3

Timer mode duration for button 3
These Parameters specify the duration in seconds for the Timer mode (values 5 or 6 in Parameters 51-55 respectively). Press the button and the relay output goes to ON/OFF for the specified time then changes back to OFF/ON. This function can be used to open/close garage doors, blinds, curtains, etc. or to turn attached devices like door lock or security OFF for a short time. The time values can be configured from 0 sec to 32400 sec (9 hours). Set the value for Relay 1 (“OUT-1”) in Parameter 71, for Relay 2 (“OUT-2”) in Parameter 72, for Relay 3 (“OUT-3”) in Parameter 73, for Relay 4 (“OUT-4”) in Parameter 74, for Relay 5 (“OUT- 5”) in Parameter 75. The factory default value is 0.

Note: If the parameter value is set to “0” it will operate as a short contact (about 500mSec).

Note: If the parameter value is set to “-1” it will operate as a shorter contact (about 50mSec).This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range -1 to 32400 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_73_2``` and is of type ```INTEGER```.


### Parameter 74: Timer mode duration for button 4

Timer mode duration for button 4
These Parameters specify the duration in seconds for the Timer mode (values 5 or 6 in Parameters 51-55 respectively). Press the button and the relay output goes to ON/OFF for the specified time then changes back to OFF/ON. This function can be used to open/close garage doors, blinds, curtains, etc. or to turn attached devices like door lock or security OFF for a short time. The time values can be configured from 0 sec to 32400 sec (9 hours). Set the value for Relay 1 (“OUT-1”) in Parameter 71, for Relay 2 (“OUT-2”) in Parameter 72, for Relay 3 (“OUT-3”) in Parameter 73, for Relay 4 (“OUT-4”) in Parameter 74, for Relay 5 (“OUT- 5”) in Parameter 75. The factory default value is 0.

Note: If the parameter value is set to “0” it will operate as a short contact (about 500mSec).

Note: If the parameter value is set to “-1” it will operate as a shorter contact (about 50mSec).This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range -1 to 32400 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_74_2``` and is of type ```INTEGER```.


### Parameter 75: Timer mode duration for button 5

Timer mode duration for button 5
These Parameters specify the duration in seconds for the Timer mode (values 5 or 6 in Parameters 51-55 respectively). Press the button and the relay output goes to ON/OFF for the specified time then changes back to OFF/ON. This function can be used to open/close garage doors, blinds, curtains, etc. or to turn attached devices like door lock or security OFF for a short time. The time values can be configured from 0 sec to 32400 sec (9 hours). Set the value for Relay 1 (“OUT-1”) in Parameter 71, for Relay 2 (“OUT-2”) in Parameter 72, for Relay 3 (“OUT-3”) in Parameter 73, for Relay 4 (“OUT-4”) in Parameter 74, for Relay 5 (“OUT- 5”) in Parameter 75. The factory default value is 0.

Note: If the parameter value is set to “0” it will operate as a short contact (about 500mSec).

Note: If the parameter value is set to “-1” it will operate as a shorter contact (about 50mSec).This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range -1 to 32400 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_75_2``` and is of type ```INTEGER```.


### Parameter 101: Group 1 relay inverse mode

Group 1 relay inverse mode
The values in this Parameter will specify the relay numbers that will operate in inverse mode. For this purpose, the value will be encoded as a 2-digit number “AB” where “A” is the number of the first relay, and “B” is number of the second relay. For example, if the Parameter value is “24” or “42” it means the relays N2 and N4 will operate in inverse mode. Relays can operate in an inverse mode in two different ways:

1. When the first and the second relays are connected to two different buttons. In this case, after pressing a button, the corresponding relay connected to that button will toggle its state (ON to OFF or OFF to ON), and the other relay will be switched OFF.

2. When two relays are connected to the same button. In this case, the relays will operate in roller shutter mode and their behavior will follow these four cycles:

▪ 1st press of button: the first relay will be switched ON, the second relay will be switched OFF

▪ 2nd press of button: both relays will be switched OFF

▪ 3rd press of button: the second relay will be switched ON, the first relay will be switched OFF

▪ 4th press of button: both relays will be switched OFF

≡ Note: In this mode, both relays cannot be switched ON at the same time (i.e. simultaneously).

≡ Note: Switching OFF one relay will always operate before switching ON another relay to prevent both relays from being ON at the same time.

≡ Note: Two groups of inverse relays can be specified, one group in Parameter 101, another group in Parameter 102.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured, in addition to values in the range 0 to 54 -:

| Value  | Description |
|--------|-------------|
| 0 | no relay inverse mode |
| 12 | relay 1 and 2 in inverse mode |
| 13 | relay 1 and 3 in inverse mode |
| 14 | relay 1 and 4 in inverse mode |
| 15 | relay 1 and 5 in inverse mode |
| 21 | relay 1 and 2 in inverse mode |
| 23 | relay 2 and 3 in inverse mode |
| 24 | relay 2 and 4 in inverse mode |
| 25 | relay 2 and 5 in inverse mode |
| 31 | relay 1 and 3 in inverse mode |
| 32 | relay 2 and 3 in inverse mode |
| 34 | relay 3 and 4 in inverse mode |
| 35 | relay 3 and 5 in inverse mode |
| 41 | relay 1 and 4 in inverse mode |
| 42 | relay 2 and 4 in inverse mode |
| 43 | relay 3 and 4 in inverse mode |
| 45 | relay 4 and 5 in inverse mode |
| 51 | relay 1 and 5 in inverse mode |
| 52 | relay 2 and 5 in inverse mode |
| 53 | relay 3 and 5 in inverse mode |
| 54 | relay 4 and 5 in inverse mode |

The manufacturer defined default value is ```0``` (no relay inverse mode).

This parameter has the configuration ID ```config_101_1``` and is of type ```INTEGER```.


### Parameter 102: Group 2 relay inverse mode

Group 2 relay inverse mode
The values in this Parameter will specify the relay numbers that will operate in inverse mode. For this purpose, the value will be encoded as a 2-digit number “AB” where “A” is the number of the first relay, and “B” is number of the second relay. For example, if the Parameter value is “24” or “42” it means the relays N2 and N4 will operate in inverse mode. Relays can operate in an inverse mode in two different ways:

1. When the first and the second relays are connected to two different buttons. In this case, after pressing a button, the corresponding relay connected to that button will toggle its state (ON to OFF or OFF to ON), and the other relay will be switched OFF.

2. When two relays are connected to the same button. In this case, the relays will operate in roller shutter mode and their behavior will follow these four cycles:

▪ 1st press of button: the first relay will be switched ON, the second relay will be switched OFF

▪ 2nd press of button: both relays will be switched OFF

▪ 3rd press of button: the second relay will be switched ON, the first relay will be switched OFF

▪ 4th press of button: both relays will be switched OFF

≡ Note: In this mode, both relays cannot be switched ON at the same time (i.e. simultaneously).

≡ Note: Switching OFF one relay will always operate before switching ON another relay to prevent both relays from being ON at the same time.

≡ Note: Two groups of inverse relays can be specified, one group in Parameter 101, another group in Parameter 102.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured, in addition to values in the range 0 to 54 -:

| Value  | Description |
|--------|-------------|
| 0 | no relay inverse mode |
| 12 | relay 1 and 2 in inverse mode |
| 13 | relay 1 and 3 in inverse mode |
| 14 | relay 1 and 4 in inverse mode |
| 15 | relay 1 and 5 in inverse mode |
| 21 | relay 1 and 2 in inverse mode |
| 23 | relay 2 and 3 in inverse mode |
| 24 | relay 2 and 4 in inverse mode |
| 25 | relay 2 and 5 in inverse mode |
| 31 | relay 1 and 3 in inverse mode |
| 32 | relay 2 and 3 in inverse mode |
| 34 | relay 3 and 4 in inverse mode |
| 35 | relay 3 and 5 in inverse mode |
| 41 | relay 1 and 4 in inverse mode |
| 42 | relay 2 and 4 in inverse mode |
| 43 | relay 3 and 4 in inverse mode |
| 45 | relay 4 and 5 in inverse mode |
| 51 | relay 1 and 5 in inverse mode |
| 52 | relay 2 and 5 in inverse mode |
| 53 | relay 3 and 5 in inverse mode |
| 54 | relay 4 and 5 in inverse mode |

The manufacturer defined default value is ```0``` (no relay inverse mode).

This parameter has the configuration ID ```config_102_1``` and is of type ```INTEGER```.


### Parameter 111: Relay control scenario 1

Relay control scenario 1
Scenarios can be created that allow connected devices to be triggered by a sensor or onboard Real Time Clock (RTC). The HE-TPS05 has built-in temperature, humidity, and ambient temperature sensors and includes a very flexible, user-friendly interface for customizing scenarios. In addition to the physical sensors, time may be used as a control source. The user should configure the output number, state, sensor type, state change condition, and threshold in the Parameters (from 111 - 120) which will trigger the scenes.

Parameters 111-120- Relays Control by Sensors

In these Parameters, the relay state changes depending on sensor threshold value. For these configurations, Parameter values are encoded as 8-digit numbers (ABCDEFGH):

A = Relay number (1 through 5)

B = Control Mode

0-Temperature Sensor, 1-Humidity Sensor, 2-Light Sensor,

3-Time control

C = State change relative to value in EFGH Condition Value fields (see below) 0-Equal or lower than

1-Equal or higher than

D: State Change, 0-Switch OFF

1-Switch ON EFGH: Condition Value

“Sensor Value” for Control modes 0, 1, and 2, or “Time” for Control mode 3.

If Temperature sensor has been chosen as a source in the control mode, the value should be x10, e.g. for 24.5°C use the value 0245.

If Time control has been chosen as a source in the control mode, the device logic will process values EFGH from 0 to 23:59 (in time measure), all other values will be ignored. EF represents Hour (0 through 23), GH represents Minutes (0 through 59).

All other numbers are reserved and will not affect the operation. To disable this option simply set this Parameter to 0.

The factory-default value: “0”

Example: Parameter value 12010050 means A=1 (relay 1 output), B=2 (light sensor), C=0 (value lower than), D=1 (switch relay On), EFGH=0050. In this case if light sensor reading drops below 50 lum, the relay 1 output will be switched On.

≡ Note: The relays still can be controlled manually using touch buttons according to Parameters 41-45 and 51-55 or via gateway.

≡ Note: The logic will implement the operation when the sensor value crosses the value in the Parameter. Meaning, that if the logic switches ON the relay and you manually switch it OFF, the relay will switch ON next time when the value crosses the set Parameter.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 53112359 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_111_4``` and is of type ```INTEGER```.


### Parameter 112: Relay control scenario 2

Relay control scenario 2
Scenarios can be created that allow connected devices to be triggered by a sensor or onboard Real Time Clock (RTC). The HE-TPS05 has built-in temperature, humidity, and ambient temperature sensors and includes a very flexible, user-friendly interface for customizing scenarios. In addition to the physical sensors, time may be used as a control source. The user should configure the output number, state, sensor type, state change condition, and threshold in the Parameters (from 111 - 120) which will trigger the scenes.

Parameters 111-120- Relays Control by Sensors

In these Parameters, the relay state changes depending on sensor threshold value. For these configurations, Parameter values are encoded as 8-digit numbers (ABCDEFGH):

A = Relay number (1 through 5)

B = Control Mode

0-Temperature Sensor, 1-Humidity Sensor, 2-Light Sensor,

3-Time control

C = State change relative to value in EFGH Condition Value fields (see below) 0-Equal or lower than

1-Equal or higher than

D: State Change, 0-Switch OFF

1-Switch ON EFGH: Condition Value

“Sensor Value” for Control modes 0, 1, and 2, or “Time” for Control mode 3.

If Temperature sensor has been chosen as a source in the control mode, the value should be x10, e.g. for 24.5°C use the value 0245.

If Time control has been chosen as a source in the control mode, the device logic will process values EFGH from 0 to 23:59 (in time measure), all other values will be ignored. EF represents Hour (0 through 23), GH represents Minutes (0 through 59).

All other numbers are reserved and will not affect the operation. To disable this option simply set this Parameter to 0.

The factory-default value: “0”

Example: Parameter value 12010050 means A=1 (relay 1 output), B=2 (light sensor), C=0 (value lower than), D=1 (switch relay On), EFGH=0050. In this case if light sensor reading drops below 50 lum, the relay 1 output will be switched On.

≡ Note: The relays still can be controlled manually using touch buttons according to Parameters 41-45 and 51-55 or via gateway.

≡ Note: The logic will implement the operation when the sensor value crosses the value in the Parameter. Meaning, that if the logic switches ON the relay and you manually switch it OFF, the relay will switch ON next time when the value crosses the set Parameter.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 53112359 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_112_4``` and is of type ```INTEGER```.


### Parameter 113: Relay control scenario 3

Relay control scenario 3
Scenarios can be created that allow connected devices to be triggered by a sensor or onboard Real Time Clock (RTC). The HE-TPS05 has built-in temperature, humidity, and ambient temperature sensors and includes a very flexible, user-friendly interface for customizing scenarios. In addition to the physical sensors, time may be used as a control source. The user should configure the output number, state, sensor type, state change condition, and threshold in the Parameters (from 111 - 120) which will trigger the scenes.

Parameters 111-120- Relays Control by Sensors

In these Parameters, the relay state changes depending on sensor threshold value. For these configurations, Parameter values are encoded as 8-digit numbers (ABCDEFGH):

A = Relay number (1 through 5)

B = Control Mode

0-Temperature Sensor, 1-Humidity Sensor, 2-Light Sensor,

3-Time control

C = State change relative to value in EFGH Condition Value fields (see below) 0-Equal or lower than

1-Equal or higher than

D: State Change, 0-Switch OFF

1-Switch ON EFGH: Condition Value

“Sensor Value” for Control modes 0, 1, and 2, or “Time” for Control mode 3.

If Temperature sensor has been chosen as a source in the control mode, the value should be x10, e.g. for 24.5°C use the value 0245.

If Time control has been chosen as a source in the control mode, the device logic will process values EFGH from 0 to 23:59 (in time measure), all other values will be ignored. EF represents Hour (0 through 23), GH represents Minutes (0 through 59).

All other numbers are reserved and will not affect the operation. To disable this option simply set this Parameter to 0.

The factory-default value: “0”

Example: Parameter value 12010050 means A=1 (relay 1 output), B=2 (light sensor), C=0 (value lower than), D=1 (switch relay On), EFGH=0050. In this case if light sensor reading drops below 50 lum, the relay 1 output will be switched On.

≡ Note: The relays still can be controlled manually using touch buttons according to Parameters 41-45 and 51-55 or via gateway.

≡ Note: The logic will implement the operation when the sensor value crosses the value in the Parameter. Meaning, that if the logic switches ON the relay and you manually switch it OFF, the relay will switch ON next time when the value crosses the set Parameter.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 53112359 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_113_4``` and is of type ```INTEGER```.


### Parameter 114: Relay control scenario 4

Relay control scenario 4
Scenarios can be created that allow connected devices to be triggered by a sensor or onboard Real Time Clock (RTC). The HE-TPS05 has built-in temperature, humidity, and ambient temperature sensors and includes a very flexible, user-friendly interface for customizing scenarios. In addition to the physical sensors, time may be used as a control source. The user should configure the output number, state, sensor type, state change condition, and threshold in the Parameters (from 111 - 120) which will trigger the scenes.

Parameters 111-120- Relays Control by Sensors

In these Parameters, the relay state changes depending on sensor threshold value. For these configurations, Parameter values are encoded as 8-digit numbers (ABCDEFGH):

A = Relay number (1 through 5)

B = Control Mode

0-Temperature Sensor, 1-Humidity Sensor, 2-Light Sensor,

3-Time control

C = State change relative to value in EFGH Condition Value fields (see below) 0-Equal or lower than

1-Equal or higher than

D: State Change, 0-Switch OFF

1-Switch ON EFGH: Condition Value

“Sensor Value” for Control modes 0, 1, and 2, or “Time” for Control mode 3.

If Temperature sensor has been chosen as a source in the control mode, the value should be x10, e.g. for 24.5°C use the value 0245.

If Time control has been chosen as a source in the control mode, the device logic will process values EFGH from 0 to 23:59 (in time measure), all other values will be ignored. EF represents Hour (0 through 23), GH represents Minutes (0 through 59).

All other numbers are reserved and will not affect the operation. To disable this option simply set this Parameter to 0.

The factory-default value: “0”

Example: Parameter value 12010050 means A=1 (relay 1 output), B=2 (light sensor), C=0 (value lower than), D=1 (switch relay On), EFGH=0050. In this case if light sensor reading drops below 50 lum, the relay 1 output will be switched On.

≡ Note: The relays still can be controlled manually using touch buttons according to Parameters 41-45 and 51-55 or via gateway.

≡ Note: The logic will implement the operation when the sensor value crosses the value in the Parameter. Meaning, that if the logic switches ON the relay and you manually switch it OFF, the relay will switch ON next time when the value crosses the set Parameter.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 53112359 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_114_4``` and is of type ```INTEGER```.


### Parameter 115: Relay control scenario 5

Relay control scenario 5
Scenarios can be created that allow connected devices to be triggered by a sensor or onboard Real Time Clock (RTC). The HE-TPS05 has built-in temperature, humidity, and ambient temperature sensors and includes a very flexible, user-friendly interface for customizing scenarios. In addition to the physical sensors, time may be used as a control source. The user should configure the output number, state, sensor type, state change condition, and threshold in the Parameters (from 111 - 120) which will trigger the scenes.

Parameters 111-120- Relays Control by Sensors

In these Parameters, the relay state changes depending on sensor threshold value. For these configurations, Parameter values are encoded as 8-digit numbers (ABCDEFGH):

A = Relay number (1 through 5)

B = Control Mode

0-Temperature Sensor, 1-Humidity Sensor, 2-Light Sensor,

3-Time control

C = State change relative to value in EFGH Condition Value fields (see below) 0-Equal or lower than

1-Equal or higher than

D: State Change, 0-Switch OFF

1-Switch ON EFGH: Condition Value

“Sensor Value” for Control modes 0, 1, and 2, or “Time” for Control mode 3.

If Temperature sensor has been chosen as a source in the control mode, the value should be x10, e.g. for 24.5°C use the value 0245.

If Time control has been chosen as a source in the control mode, the device logic will process values EFGH from 0 to 23:59 (in time measure), all other values will be ignored. EF represents Hour (0 through 23), GH represents Minutes (0 through 59).

All other numbers are reserved and will not affect the operation. To disable this option simply set this Parameter to 0.

The factory-default value: “0”

Example: Parameter value 12010050 means A=1 (relay 1 output), B=2 (light sensor), C=0 (value lower than), D=1 (switch relay On), EFGH=0050. In this case if light sensor reading drops below 50 lum, the relay 1 output will be switched On.

≡ Note: The relays still can be controlled manually using touch buttons according to Parameters 41-45 and 51-55 or via gateway.

≡ Note: The logic will implement the operation when the sensor value crosses the value in the Parameter. Meaning, that if the logic switches ON the relay and you manually switch it OFF, the relay will switch ON next time when the value crosses the set Parameter.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 53112359 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_115_4``` and is of type ```INTEGER```.


### Parameter 116: Relay control scenario 6

Relay control scenario 6
Scenarios can be created that allow connected devices to be triggered by a sensor or onboard Real Time Clock (RTC). The HE-TPS05 has built-in temperature, humidity, and ambient temperature sensors and includes a very flexible, user-friendly interface for customizing scenarios. In addition to the physical sensors, time may be used as a control source. The user should configure the output number, state, sensor type, state change condition, and threshold in the Parameters (from 111 - 120) which will trigger the scenes.

Parameters 111-120- Relays Control by Sensors

In these Parameters, the relay state changes depending on sensor threshold value. For these configurations, Parameter values are encoded as 8-digit numbers (ABCDEFGH):

A = Relay number (1 through 5)

B = Control Mode

0-Temperature Sensor, 1-Humidity Sensor, 2-Light Sensor,

3-Time control

C = State change relative to value in EFGH Condition Value fields (see below) 0-Equal or lower than

1-Equal or higher than

D: State Change, 0-Switch OFF

1-Switch ON EFGH: Condition Value

“Sensor Value” for Control modes 0, 1, and 2, or “Time” for Control mode 3.

If Temperature sensor has been chosen as a source in the control mode, the value should be x10, e.g. for 24.5°C use the value 0245.

If Time control has been chosen as a source in the control mode, the device logic will process values EFGH from 0 to 23:59 (in time measure), all other values will be ignored. EF represents Hour (0 through 23), GH represents Minutes (0 through 59).

All other numbers are reserved and will not affect the operation. To disable this option simply set this Parameter to 0.

The factory-default value: “0”

Example: Parameter value 12010050 means A=1 (relay 1 output), B=2 (light sensor), C=0 (value lower than), D=1 (switch relay On), EFGH=0050. In this case if light sensor reading drops below 50 lum, the relay 1 output will be switched On.

≡ Note: The relays still can be controlled manually using touch buttons according to Parameters 41-45 and 51-55 or via gateway.

≡ Note: The logic will implement the operation when the sensor value crosses the value in the Parameter. Meaning, that if the logic switches ON the relay and you manually switch it OFF, the relay will switch ON next time when the value crosses the set Parameter.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 53112359 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_116_4``` and is of type ```INTEGER```.


### Parameter 117: Relay control scenario 7

Relay control scenario 7
Scenarios can be created that allow connected devices to be triggered by a sensor or onboard Real Time Clock (RTC). The HE-TPS05 has built-in temperature, humidity, and ambient temperature sensors and includes a very flexible, user-friendly interface for customizing scenarios. In addition to the physical sensors, time may be used as a control source. The user should configure the output number, state, sensor type, state change condition, and threshold in the Parameters (from 111 - 120) which will trigger the scenes.

Parameters 111-120- Relays Control by Sensors

In these Parameters, the relay state changes depending on sensor threshold value. For these configurations, Parameter values are encoded as 8-digit numbers (ABCDEFGH):

A = Relay number (1 through 5)

B = Control Mode

0-Temperature Sensor, 1-Humidity Sensor, 2-Light Sensor,

3-Time control

C = State change relative to value in EFGH Condition Value fields (see below) 0-Equal or lower than

1-Equal or higher than

D: State Change, 0-Switch OFF

1-Switch ON EFGH: Condition Value

“Sensor Value” for Control modes 0, 1, and 2, or “Time” for Control mode 3.

If Temperature sensor has been chosen as a source in the control mode, the value should be x10, e.g. for 24.5°C use the value 0245.

If Time control has been chosen as a source in the control mode, the device logic will process values EFGH from 0 to 23:59 (in time measure), all other values will be ignored. EF represents Hour (0 through 23), GH represents Minutes (0 through 59).

All other numbers are reserved and will not affect the operation. To disable this option simply set this Parameter to 0.

The factory-default value: “0”

Example: Parameter value 12010050 means A=1 (relay 1 output), B=2 (light sensor), C=0 (value lower than), D=1 (switch relay On), EFGH=0050. In this case if light sensor reading drops below 50 lum, the relay 1 output will be switched On.

≡ Note: The relays still can be controlled manually using touch buttons according to Parameters 41-45 and 51-55 or via gateway.

≡ Note: The logic will implement the operation when the sensor value crosses the value in the Parameter. Meaning, that if the logic switches ON the relay and you manually switch it OFF, the relay will switch ON next time when the value crosses the set Parameter.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 53112359 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_117_4``` and is of type ```INTEGER```.


### Parameter 118: Relay control scenario 8

Relay control scenario 8
Scenarios can be created that allow connected devices to be triggered by a sensor or onboard Real Time Clock (RTC). The HE-TPS05 has built-in temperature, humidity, and ambient temperature sensors and includes a very flexible, user-friendly interface for customizing scenarios. In addition to the physical sensors, time may be used as a control source. The user should configure the output number, state, sensor type, state change condition, and threshold in the Parameters (from 111 - 120) which will trigger the scenes.

Parameters 111-120- Relays Control by Sensors

In these Parameters, the relay state changes depending on sensor threshold value. For these configurations, Parameter values are encoded as 8-digit numbers (ABCDEFGH):

A = Relay number (1 through 5)

B = Control Mode

0-Temperature Sensor, 1-Humidity Sensor, 2-Light Sensor,

3-Time control

C = State change relative to value in EFGH Condition Value fields (see below) 0-Equal or lower than

1-Equal or higher than

D: State Change, 0-Switch OFF

1-Switch ON EFGH: Condition Value

“Sensor Value” for Control modes 0, 1, and 2, or “Time” for Control mode 3.

If Temperature sensor has been chosen as a source in the control mode, the value should be x10, e.g. for 24.5°C use the value 0245.

If Time control has been chosen as a source in the control mode, the device logic will process values EFGH from 0 to 23:59 (in time measure), all other values will be ignored. EF represents Hour (0 through 23), GH represents Minutes (0 through 59).

All other numbers are reserved and will not affect the operation. To disable this option simply set this Parameter to 0.

The factory-default value: “0”

Example: Parameter value 12010050 means A=1 (relay 1 output), B=2 (light sensor), C=0 (value lower than), D=1 (switch relay On), EFGH=0050. In this case if light sensor reading drops below 50 lum, the relay 1 output will be switched On.

≡ Note: The relays still can be controlled manually using touch buttons according to Parameters 41-45 and 51-55 or via gateway.

≡ Note: The logic will implement the operation when the sensor value crosses the value in the Parameter. Meaning, that if the logic switches ON the relay and you manually switch it OFF, the relay will switch ON next time when the value crosses the set Parameter.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 53112359 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_118_4``` and is of type ```INTEGER```.


### Parameter 119: Relay control scenario 9

Relay control scenario 9
Scenarios can be created that allow connected devices to be triggered by a sensor or onboard Real Time Clock (RTC). The HE-TPS05 has built-in temperature, humidity, and ambient temperature sensors and includes a very flexible, user-friendly interface for customizing scenarios. In addition to the physical sensors, time may be used as a control source. The user should configure the output number, state, sensor type, state change condition, and threshold in the Parameters (from 111 - 120) which will trigger the scenes.

Parameters 111-120- Relays Control by Sensors

In these Parameters, the relay state changes depending on sensor threshold value. For these configurations, Parameter values are encoded as 8-digit numbers (ABCDEFGH):

A = Relay number (1 through 5)

B = Control Mode

0-Temperature Sensor, 1-Humidity Sensor, 2-Light Sensor,

3-Time control

C = State change relative to value in EFGH Condition Value fields (see below) 0-Equal or lower than

1-Equal or higher than

D: State Change, 0-Switch OFF

1-Switch ON EFGH: Condition Value

“Sensor Value” for Control modes 0, 1, and 2, or “Time” for Control mode 3.

If Temperature sensor has been chosen as a source in the control mode, the value should be x10, e.g. for 24.5°C use the value 0245.

If Time control has been chosen as a source in the control mode, the device logic will process values EFGH from 0 to 23:59 (in time measure), all other values will be ignored. EF represents Hour (0 through 23), GH represents Minutes (0 through 59).

All other numbers are reserved and will not affect the operation. To disable this option simply set this Parameter to 0.

The factory-default value: “0”

Example: Parameter value 12010050 means A=1 (relay 1 output), B=2 (light sensor), C=0 (value lower than), D=1 (switch relay On), EFGH=0050. In this case if light sensor reading drops below 50 lum, the relay 1 output will be switched On.

≡ Note: The relays still can be controlled manually using touch buttons according to Parameters 41-45 and 51-55 or via gateway.

≡ Note: The logic will implement the operation when the sensor value crosses the value in the Parameter. Meaning, that if the logic switches ON the relay and you manually switch it OFF, the relay will switch ON next time when the value crosses the set Parameter.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 53112359 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_119_4``` and is of type ```INTEGER```.


### Parameter 120: Relay control scenario 10

Relay control scenario 10
Scenarios can be created that allow connected devices to be triggered by a sensor or onboard Real Time Clock (RTC). The HE-TPS05 has built-in temperature, humidity, and ambient temperature sensors and includes a very flexible, user-friendly interface for customizing scenarios. In addition to the physical sensors, time may be used as a control source. The user should configure the output number, state, sensor type, state change condition, and threshold in the Parameters (from 111 - 120) which will trigger the scenes.

Parameters 111-120- Relays Control by Sensors

In these Parameters, the relay state changes depending on sensor threshold value. For these configurations, Parameter values are encoded as 8-digit numbers (ABCDEFGH):

A = Relay number (1 through 5)

B = Control Mode

0-Temperature Sensor, 1-Humidity Sensor, 2-Light Sensor,

3-Time control

C = State change relative to value in EFGH Condition Value fields (see below) 0-Equal or lower than

1-Equal or higher than

D: State Change, 0-Switch OFF

1-Switch ON EFGH: Condition Value

“Sensor Value” for Control modes 0, 1, and 2, or “Time” for Control mode 3.

If Temperature sensor has been chosen as a source in the control mode, the value should be x10, e.g. for 24.5°C use the value 0245.

If Time control has been chosen as a source in the control mode, the device logic will process values EFGH from 0 to 23:59 (in time measure), all other values will be ignored. EF represents Hour (0 through 23), GH represents Minutes (0 through 59).

All other numbers are reserved and will not affect the operation. To disable this option simply set this Parameter to 0.

The factory-default value: “0”

Example: Parameter value 12010050 means A=1 (relay 1 output), B=2 (light sensor), C=0 (value lower than), D=1 (switch relay On), EFGH=0050. In this case if light sensor reading drops below 50 lum, the relay 1 output will be switched On.

≡ Note: The relays still can be controlled manually using touch buttons according to Parameters 41-45 and 51-55 or via gateway.

≡ Note: The logic will implement the operation when the sensor value crosses the value in the Parameter. Meaning, that if the logic switches ON the relay and you manually switch it OFF, the relay will switch ON next time when the value crosses the set Parameter.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 53112359 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_120_4``` and is of type ```INTEGER```.


### Parameter 141: Consumption reporting interval

Consumption meter consecutive reporting interval
When the device is connected to the Z-Wave gateway (controller), it periodically sends to the gateway reports from its energy consumption meter even if there is no change in the value. This Parameter defines the interval between consecutive reports of real time and cumulative energy consumption data to the gateway. The value can be adjusted from 1 min to 120 min. The factory default value is 10 min.

≡ Note: If the consumption changes, the device will send the report to the gateway regardless of this Parameter value (the report will be sent according to value in Parameter 142).

≡ Note: It is not recommended to reduce the value of this Parameter in order not to increase the traffic on your network. We recommend to reduce the value of this Parameter only in case of poor connection, when reports from the device does not always reach the gateway.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 1 to 120 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_141_1``` and is of type ```INTEGER```.


### Parameter 142: Consumption change report to send to controller

Consumption change report to send to controller
This Parameter determines if the consumption change will resulting in the consumption report being sent to the gateway. Use the value 0 if there is a need to stop sending the reports and value 1 to activate reports. The factory default value is 1.

≡ Note: When the device is turning ON, the consumption data will be sent to the gateway once, even if the value of this Parameter is 0.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_142_1``` and is of type ```INTEGER```.


### Parameter 143: Sensors reporting interval

Sensors consecutive reporting interval
When the device is connected to the Z-Wave gateway (controller), it periodically sends to the gateway reports from its room temperature, humidity and light sensors even if there are not changes in the values. This Parameter defines the interval between consecutive reports. The value can be adjusted from 1 min to 120 min. The factory default value is 10 min.

≡ Note: If the sensor readings change, the device will send the report to the gateway regardless of this Parameter value (the report will be sent according to values in Parameters 144, 145 and 146).

≡ Note: It is not recommended to reduce the value of this Parameter in order not to increase the traffic on your network. We recommend to reduce the value of this Parameter only in case of poor connection, when reports from the device does not always reach the gateway.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 1 to 120 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_143_1``` and is of type ```INTEGER```.


### Parameter 144: Temperature difference to send to controller

Temperature difference to send to controller
This Parameter determines the change in temperature level (in °C) resulting in temperature sensor report being sent to the gateway. The value of this Parameter should be x10, e.g. for 0.4°C use value 4. From 0.1°C (value 1) to 10°C (value 100) can be selected. Use the value 0 if there is a need to stop sending the reports. The factory default value is 2 (0.2°C).  


≡ Note: When the device is turning ON, the sensor data will be sent to the gateway once, even if the value of this Parameter is 0.

≡ Note: It is not recommended to decrease the value of this Parameter, in order not to increase the load on your Z-Wave network traffic.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_144_1``` and is of type ```INTEGER```.


### Parameter 145: Humidity difference to send to controller

Humidity difference to send to controller
This Parameter determines the change in humidity level in % resulting in humidity sensors report being sent to the gateway. From 1% to 25% can be selected. Use the value 0 if there is a need to stop sending the reports. The factory default value is 2.

≡ Note: When the device is turning ON, the sensor data will be sent to the gateway once, even if the value of this Parameter is 0.

≡ Note: It is not recommended to decrease the value of this Parameter, in order not to increase the load on your Z-Wave network traffic.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 25 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_145_1``` and is of type ```INTEGER```.


### Parameter 146: Light difference to send to controller

Light sensor values difference to send to controller
This Parameter determines the change in the ambient environment illuminance level resulting in a light sensors report being sent to the gateway. From 10% to 99% can be selected. Use the value 0 if there is a need to stop sending the reports. The factory default value is 50.

≡ Note: When the device is turning On, the sensor data will be sent to the gateway once, even if the value of this Parameter is 0.

≡ Note: It is not recommended to decrease the value of this Parameter, in order not to increase the load on your Z-Wave network traffic.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_146_1``` and is of type ```INTEGER```.


### Parameter 171: Button 1 associations touch control mode

Touch control mode for associations with touch button 1
These Parameters are intended for use when Multilevel Switch Group Associations (Groups 3, 5, 7, 9, & 11) have been activated. They define the logic of values changing if one of the touch buttons has been held for more than one second. They are useful options for controlling dimmers or roller shutter devices in the following three ways:

“0” – On each hold event, “UP (brighten)” and “DOWN (dim)” command will be alternately sent to associated devices.

“1” – On each hold event, the “UP (brighten)” command will be sent to associated devices. 

“2” – On each hold event, the “DOWN (dim)” command will be sent to associated devices. 

Set the value for Group 3 (Touch 1 association) in Parameter 171, for Group 5 (Touch 2 association) in Parameter 172, for Group 7 (Touch 3 association) in Parameter 173, for Group 9 (Touch 4 association) in Parameter 174, for Group 11 (Touch 5 association) in Parameter 175. 

The factory-default value: 0.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_171_1``` and is of type ```INTEGER```.


### Parameter 172: Button 2 associations touch control mode

Touch control mode for associations with touch button 2
These Parameters are intended for use when Multilevel Switch Group Associations (Groups 3, 5, 7, 9, & 11) have been activated. They define the logic of values changing if one of the touch buttons has been held for more than one second. They are useful options for controlling dimmers or roller shutter devices in the following three ways:

“0” – On each hold event, “UP (brighten)” and “DOWN (dim)” command will be alternately sent to associated devices.

“1” – On each hold event, the “UP (brighten)” command will be sent to associated devices. 

“2” – On each hold event, the “DOWN (dim)” command will be sent to associated devices. 

Set the value for Group 3 (Touch 1 association) in Parameter 171, for Group 5 (Touch 2 association) in Parameter 172, for Group 7 (Touch 3 association) in Parameter 173, for Group 9 (Touch 4 association) in Parameter 174, for Group 11 (Touch 5 association) in Parameter 175. 

The factory-default value: 0.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_172_1``` and is of type ```INTEGER```.


### Parameter 173: Button 3 associations touch control mode

Touch control mode for associations with touch button 3
These Parameters are intended for use when Multilevel Switch Group Associations (Groups 3, 5, 7, 9, & 11) have been activated. They define the logic of values changing if one of the touch buttons has been held for more than one second. They are useful options for controlling dimmers or roller shutter devices in the following three ways:

“0” – On each hold event, “UP (brighten)” and “DOWN (dim)” command will be alternately sent to associated devices.

“1” – On each hold event, the “UP (brighten)” command will be sent to associated devices. 

“2” – On each hold event, the “DOWN (dim)” command will be sent to associated devices. 

Set the value for Group 3 (Touch 1 association) in Parameter 171, for Group 5 (Touch 2 association) in Parameter 172, for Group 7 (Touch 3 association) in Parameter 173, for Group 9 (Touch 4 association) in Parameter 174, for Group 11 (Touch 5 association) in Parameter 175. 

The factory-default value: 0.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_173_1``` and is of type ```INTEGER```.


### Parameter 174: Button 4 associations touch control mode

Touch control mode for associations with touch button 4
These Parameters are intended for use when Multilevel Switch Group Associations (Groups 3, 5, 7, 9, & 11) have been activated. They define the logic of values changing if one of the touch buttons has been held for more than one second. They are useful options for controlling dimmers or roller shutter devices in the following three ways:

“0” – On each hold event, “UP (brighten)” and “DOWN (dim)” command will be alternately sent to associated devices.

“1” – On each hold event, the “UP (brighten)” command will be sent to associated devices. 

“2” – On each hold event, the “DOWN (dim)” command will be sent to associated devices. 

Set the value for Group 3 (Touch 1 association) in Parameter 171, for Group 5 (Touch 2 association) in Parameter 172, for Group 7 (Touch 3 association) in Parameter 173, for Group 9 (Touch 4 association) in Parameter 174, for Group 11 (Touch 5 association) in Parameter 175. 

The factory-default value: 0.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_174_1``` and is of type ```INTEGER```.


### Parameter 175: Button 5 associations touch control mode

Touch control mode for associations with touch button 5
These Parameters are intended for use when Multilevel Switch Group Associations (Groups 3, 5, 7, 9, & 11) have been activated. They define the logic of values changing if one of the touch buttons has been held for more than one second. They are useful options for controlling dimmers or roller shutter devices in the following three ways:

“0” – On each hold event, “UP (brighten)” and “DOWN (dim)” command will be alternately sent to associated devices.

“1” – On each hold event, the “UP (brighten)” command will be sent to associated devices. 

“2” – On each hold event, the “DOWN (dim)” command will be sent to associated devices. 

Set the value for Group 3 (Touch 1 association) in Parameter 171, for Group 5 (Touch 2 association) in Parameter 172, for Group 7 (Touch 3 association) in Parameter 173, for Group 9 (Touch 4 association) in Parameter 174, for Group 11 (Touch 5 association) in Parameter 175. 

The factory-default value: 0.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_175_1``` and is of type ```INTEGER```.


### Parameter 181: Button 1 association dimming level

Dimming Brightness Level for association with touch button 1
This parameter specifies the brightness level that will be sent to associated dimmer devices when the touch button was clicked (when sending Set On command). Use values 1 to 99, to set a specific brightness level (the brightness level corresponds to the percentage of the set value), or use value 0 to restore the most recent (non-zero) brightness level on the dimmer. Set the value for Button 1 in Parameter 181, for Button 2 in Parameter 182, for Button 3 in Parameter 183, for Button 4 in Parameter 184, for Button 5 in Parameter 185. The factory default value is 0.

≡ Note: Note: Dimmer devices should be associated with the touch button as a multi- channel association.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_181_1``` and is of type ```INTEGER```.


### Parameter 182: Button 2 association dimming level

Dimming Brightness Level for association with touch button 2
This parameter specifies the brightness level that will be sent to associated dimmer devices when the touch button was clicked (when sending Set On command). Use values 1 to 99, to set a specific brightness level (the brightness level corresponds to the percentage of the set value), or use value 0 to restore the most recent (non-zero) brightness level on the dimmer. Set the value for Button 1 in Parameter 181, for Button 2 in Parameter 182, for Button 3 in Parameter 183, for Button 4 in Parameter 184, for Button 5 in Parameter 185. The factory default value is 0.

≡ Note: Note: Dimmer devices should be associated with the touch button as a multi- channel association.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_182_1``` and is of type ```INTEGER```.


### Parameter 183: Button 3 association dimming level

Dimming Brightness Level for association with touch button 3
This parameter specifies the brightness level that will be sent to associated dimmer devices when the touch button was clicked (when sending Set On command). Use values 1 to 99, to set a specific brightness level (the brightness level corresponds to the percentage of the set value), or use value 0 to restore the most recent (non-zero) brightness level on the dimmer. Set the value for Button 1 in Parameter 181, for Button 2 in Parameter 182, for Button 3 in Parameter 183, for Button 4 in Parameter 184, for Button 5 in Parameter 185. The factory default value is 0.

≡ Note: Note: Dimmer devices should be associated with the touch button as a multi- channel association.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_183_1``` and is of type ```INTEGER```.


### Parameter 184: Button 4 association dimming level

Dimming Brightness Level for association with touch button 4
This parameter specifies the brightness level that will be sent to associated dimmer devices when the touch button was clicked (when sending Set On command). Use values 1 to 99, to set a specific brightness level (the brightness level corresponds to the percentage of the set value), or use value 0 to restore the most recent (non-zero) brightness level on the dimmer. Set the value for Button 1 in Parameter 181, for Button 2 in Parameter 182, for Button 3 in Parameter 183, for Button 4 in Parameter 184, for Button 5 in Parameter 185. The factory default value is 0.

≡ Note: Note: Dimmer devices should be associated with the touch button as a multi- channel association.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_184_1``` and is of type ```INTEGER```.


### Parameter 185: Button 5 association dimming level

Dimming Brightness Level for association with touch button 5
This parameter specifies the brightness level that will be sent to associated dimmer devices when the touch button was clicked (when sending Set On command). Use values 1 to 99, to set a specific brightness level (the brightness level corresponds to the percentage of the set value), or use value 0 to restore the most recent (non-zero) brightness level on the dimmer. Set the value for Button 1 in Parameter 181, for Button 2 in Parameter 182, for Button 3 in Parameter 183, for Button 4 in Parameter 184, for Button 5 in Parameter 185. The factory default value is 0.

≡ Note: Note: Dimmer devices should be associated with the touch button as a multi- channel association.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_185_1``` and is of type ```INTEGER```.


### Parameter 191: Button 1 association dimming duration

Dimming Duration for association with touch button 1
This parameter specifies the duration when the dimmer goes from lowest (~0%) level to the highest (~99%) level and vice versa, when "Dimming up/Dimming Down" commands are received through association. Use values 1 to 120 seconds to specify the duration or use value 0 to use dimmer’s factory default duration. Set the value for Button 1 in Parameter 191, for Button 2 in Parameter 192, for Button 3 in Parameter 193, for Button 4 in Parameter 194, for Button 5 in Parameter 195. The factory default value is 0.

≡ Note: Dimmer devices should be associated with the touch button as a multi-channel association

≡ Note: Different dimmers may interpret this parameter differently, in such cases the parameter values should be determined experimentally for a specific dimmer model.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 120 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_191_1``` and is of type ```INTEGER```.


### Parameter 192: Button 2 association dimming duration

Dimming Duration for association with touch button 2
This parameter specifies the duration when the dimmer goes from lowest (~0%) level to the highest (~99%) level and vice versa, when "Dimming up/Dimming Down" commands are received through association. Use values 1 to 120 seconds to specify the duration or use value 0 to use dimmer’s factory default duration. Set the value for Button 1 in Parameter 191, for Button 2 in Parameter 192, for Button 3 in Parameter 193, for Button 4 in Parameter 194, for Button 5 in Parameter 195. The factory default value is 0.

≡ Note: Dimmer devices should be associated with the touch button as a multi-channel association

≡ Note: Different dimmers may interpret this parameter differently, in such cases the parameter values should be determined experimentally for a specific dimmer model.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 120 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_192_1``` and is of type ```INTEGER```.


### Parameter 193: Button 3 association dimming duration

Dimming Duration for association with touch button 3
This parameter specifies the duration when the dimmer goes from lowest (~0%) level to the highest (~99%) level and vice versa, when "Dimming up/Dimming Down" commands are received through association. Use values 1 to 120 seconds to specify the duration or use value 0 to use dimmer’s factory default duration. Set the value for Button 1 in Parameter 191, for Button 2 in Parameter 192, for Button 3 in Parameter 193, for Button 4 in Parameter 194, for Button 5 in Parameter 195. The factory default value is 0.

≡ Note: Dimmer devices should be associated with the touch button as a multi-channel association

≡ Note: Different dimmers may interpret this parameter differently, in such cases the parameter values should be determined experimentally for a specific dimmer model.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 120 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_193_1``` and is of type ```INTEGER```.


### Parameter 194: Button 4 association dimming duration

Dimming Duration for association with touch button 4
This parameter specifies the duration when the dimmer goes from lowest (~0%) level to the highest (~99%) level and vice versa, when "Dimming up/Dimming Down" commands are received through association. Use values 1 to 120 seconds to specify the duration or use value 0 to use dimmer’s factory default duration. Set the value for Button 1 in Parameter 191, for Button 2 in Parameter 192, for Button 3 in Parameter 193, for Button 4 in Parameter 194, for Button 5 in Parameter 195. The factory default value is 0.

≡ Note: Dimmer devices should be associated with the touch button as a multi-channel association

≡ Note: Different dimmers may interpret this parameter differently, in such cases the parameter values should be determined experimentally for a specific dimmer model.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 120 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_194_1``` and is of type ```INTEGER```.


### Parameter 195: Button 5 association dimming duration

Dimming Duration for association with touch button 5
This parameter specifies the duration when the dimmer goes from lowest (~0%) level to the highest (~99%) level and vice versa, when "Dimming up/Dimming Down" commands are received through association. Use values 1 to 120 seconds to specify the duration or use value 0 to use dimmer’s factory default duration. Set the value for Button 1 in Parameter 191, for Button 2 in Parameter 192, for Button 3 in Parameter 193, for Button 4 in Parameter 194, for Button 5 in Parameter 195. The factory default value is 0.

≡ Note: Dimmer devices should be associated with the touch button as a multi-channel association

≡ Note: Different dimmers may interpret this parameter differently, in such cases the parameter values should be determined experimentally for a specific dimmer model.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 120 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_195_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The HE-TPS05 supports 21 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
reports full state of the device and is used to communicate with the Z- Wave gateway
reports full state of the device and is used to communicate with the Z- Wave gateway. The group supports one Node.

≡ Note: It is not recommended to modify this group.

≡ Note: For correct operating in Fibaro gateways, the Single Channel Association should be removed from the device LifeLine (EndPoint 0 Group 1).

Association group 1 supports 1 node.

### Group 2: Touch 1 Basic Set

is assigned to touch N1. Is used to send Basic Set ON (value 255) and Basic Set OFF (value 0) commands to the associated devices.
is assigned to touch N1. Is used to send Basic Set ON (value 255) and Basic Set OFF (value 0) commands to the associated devices.

Association group 2 supports 1 node.

### Group 3: Touch 1 Multilevel Set

It sends MULTILEVEL SWITCH command class frame when touch N1 was held. Is used to send UP/DOWN command to the associated devices.
is assigned to touch N1. It sends MULTILEVEL SWITCH command class frame when touch N1 was held. Is used to send UP/DOWN command to the associated devices.

Association group 3 supports 1 node.

### Group 4: Touch 2 Basic Set

is assigned to touch N2. Is used to send Basic Set ON (value 255) and Basic Set OFF (value 0) commands to the associated devices.
is assigned to touch N2. Is used to send Basic Set ON (value 255) and Basic Set OFF (value 0) commands to the associated devices.

Association group 4 supports 1 node.

### Group 5: Touch 2 Multilevel Set

It sends MULTILEVEL SWITCH command class frame when touch N2 was held. Is used to send UP/DOWN command to the associated devices.
is assigned to touch N2. It sends MULTILEVEL SWITCH command class frame when touch N2 was held. Is used to send UP/DOWN command to the associated devices.

Association group 5 supports 1 node.

### Group 6: Touch 3 Basic Set

is assigned to touch N3. Is used to send Basic Set ON (value 255) and Basic Set OFF (value 0) commands to the associated devices.
is assigned to touch N3. Is used to send Basic Set ON (value 255) and Basic Set OFF (value 0) commands to the associated devices.

Association group 6 supports 1 node.

### Group 7: Touch 3 Multilevel Set

It sends MULTILEVEL SWITCH command class frame when touch N3 was held. Is used to send UP/DOWN command to the associated devices.
is assigned to touch N3. It sends MULTILEVEL SWITCH command class frame when touch N3 was held. Is used to send UP/DOWN command to the associated devices.

Association group 7 supports 1 node.

### Group 8: Touch 4 Basic Set

is assigned to touch N4. Is used to send Basic Set ON (value 255) and Basic Set OFF (value 0) commands to the associated devices.
is assigned to touch N4. Is used to send Basic Set ON (value 255) and Basic Set OFF (value 0) commands to the associated devices.

Association group 8 supports 1 node.

### Group 9: Touch 4 Multilevel Set

It sends MULTILEVEL SWITCH command class frame when touch N4 was held. Is used to send UP/DOWN command to the associated devices.
is assigned to touch N4. It sends MULTILEVEL SWITCH command class frame when touch N4 was held. Is used to send UP/DOWN command to the associated devices.

Association group 9 supports 1 node.

### Group 10: Touch 5 Basic Set

is assigned to touch N5. Is used to send Basic Set ON (value 255) and Basic Set OFF (value 0) commands to the associated devices.
is assigned to touch N5. Is used to send Basic Set ON (value 255) and Basic Set OFF (value 0) commands to the associated devices.

Association group 10 supports 1 node.

### Group 11: Touch 5 Multilevel Set

is assigned to touch N5. It sends MULTILEVEL SWITCH command class frame when touch N5 was held. Is used to send UP/DOWN command to the associated devices.
is assigned to touch N5. It sends MULTILEVEL SWITCH command class frame when touch N5 was held. Is used to send UP/DOWN command to the associated devices.

Association group 11 supports 1 node.

### Group 12: LED 1 Basic Set

is assigned to LED N1. Is used to send Basic Set ON (value 255) and Basic Set OFF (value 0) commands to the associated devices.
is assigned to LED N1. Is used to send Basic Set ON (value 255) and Basic Set OFF (value 0) commands to the associated devices.

Association group 12 supports 1 node.

### Group 13: LED 2 Basic Set

is assigned to LED N2. Is used to send Basic Set ON (value 255) and Basic Set OFF (value 0) commands to the associated devices.
is assigned to LED N2. Is used to send Basic Set ON (value 255) and Basic Set OFF (value 0) commands to the associated devices.

Association group 13 supports 1 node.

### Group 14: LED 3 Basic Set

is assigned to LED N3. Is used to send Basic Set ON (value 255) and Basic Set OFF (value 0) commands to the associated devices.
is assigned to LED N3. Is used to send Basic Set ON (value 255) and Basic Set OFF (value 0) commands to the associated devices.

Association group 14 supports 1 node.

### Group 15: LED 4 Basic Set

is assigned to LED N4. Is used to send Basic Set ON (value 255) and Basic Set OFF (value 0) commands to the associated devices.
is assigned to LED N4. Is used to send Basic Set ON (value 255) and Basic Set OFF (value 0) commands to the associated devices.

Association group 15 supports 1 node.

### Group 16: LED 5 Basic Set

is assigned to LED N5. Is used to send Basic Set ON (value 255) and Basic Set OFF (value 0) commands to the associated devices.
is assigned to LED N5. Is used to send Basic Set ON (value 255) and Basic Set OFF (value 0) commands to the associated devices.

Association group 16 supports 1 node.

### Group 17: Relay 1 Basic Set

is assigned to relay N1. Is used to send Basic Set ON (value 255) and Basic Set OFF (value 0) commands to the associated devices.
is assigned to relay N1. Is used to send Basic Set ON (value 255) and Basic Set OFF (value 0) commands to the associated devices.

Association group 17 supports 1 node.

### Group 18: Relay 2 Basic Set

is assigned to relay N2. Is used to send Basic Set ON (value 255) and Basic Set OFF (value 0) commands to the associated devices.
is assigned to relay N2. Is used to send Basic Set ON (value 255) and Basic Set OFF (value 0) commands to the associated devices.

Association group 18 supports 1 node.

### Group 19: Relay 3 Basic Set

is assigned to relay N3. Is used to send Basic Set ON (value 255) and Basic Set OFF (value 0) commands to the associated devices.
is assigned to relay N3. Is used to send Basic Set ON (value 255) and Basic Set OFF (value 0) commands to the associated devices.

Association group 19 supports 1 node.

### Group 20: Relay 4 Basic Set

is assigned to relay N4. Is used to send Basic Set ON (value 255) and Basic Set OFF (value 0) commands to the associated devices.
is assigned to relay N4. Is used to send Basic Set ON (value 255) and Basic Set OFF (value 0) commands to the associated devices.

Association group 20 supports 1 node.

### Group 21: Relay 5 Basic Set

is assigned to relay N5. Is used to send Basic Set ON (value 255) and Basic Set OFF (value 0) commands to the associated devices.
is assigned to relay N5. Is used to send Basic Set ON (value 255) and Basic Set OFF (value 0) commands to the associated devices.

Association group 21 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V10| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_CENTRAL_SCENE_V3| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_CLOCK_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_INDICATOR_V3| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
| COMMAND_CLASS_SECURITY_2_V1| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
#### Endpoint 3

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
#### Endpoint 4

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
#### Endpoint 5

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
#### Endpoint 6

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
#### Endpoint 7

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
#### Endpoint 8

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
#### Endpoint 9

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
#### Endpoint 10

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [device manual](https://opensmarthouse.org/zwavedatabase/1563/reference/Manual_Full_English_HE-TPS05_v1.1.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1563).
