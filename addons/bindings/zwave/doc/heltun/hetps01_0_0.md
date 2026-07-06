---
layout: documentation
title: HE-TPS01 - ZWave
---

{% include base.html %}

# HE-TPS01 Touch Panel Switch One Button
This describes the Z-Wave device *HE-TPS01*, manufactured by *Heltun* with the thing type UID of ```heltun_hetps01_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![HE-TPS01 product image](https://opensmarthouse.org/zwavedatabase/1614/image/)


The HE-TPS01 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

HELTUN HE-TPS01 Advanced Programmable Touch Panel Switch brings "Impossibly Smart" capabilities to your home lighting, electric outlets, or motorized blinds, door locks, gates, and valves. It replaces an existing in-wall switch and brings over-the-Internet monitoring, control, and advanced programmability. Device is "Impossibly Thin" on the wall yet packed with features to provide the ultimate in control and convenience.

### Inclusion Information

To add the HE-TPS01 to an existing Z-Wave network (i.e. “inclusion”), do the following:

Start the Inclusion Mode from the gateway/controller.

To start the inclusion process on the HE-TPS01, simultaneously press the two upper hidden touch buttons (see Figure 8) and hold them for three seconds.

All buttons will then sequentially blink ‘blue-red’.

If the inclusion has been successful, all buttons will turn blue for three seconds.

If the inclusion was not successful, all buttons will turn red for three seconds. In that case repeat the inclusion process.

### Exclusion Information

To remove the HE-TPS01 from a Z-Wave network (i.e. “Exclusion”), do the following:

Start the Exclusion Mode from the gateway/controller.

To start the exclusion process on the HE-TPS01, simultaneously press the two upper hidden touch buttons (see Figure 8) and hold them for three seconds.

All buttons will sequentially blink blue-red.

If the exclusion has been successful, all buttons will turn red for three seconds.

If the exclusion was not successful, all buttons will turn blue for three seconds. In that case repeat the exclusion process.

Note: If the HE-TPS01 has previously been part of a Z-Wave network and not Excluded since, Inclusion is not possible without rst performing an Exclusion or Factory Reset procedure.

### General Usage Information



## Channels

The following table summarises the channels available for the HE-TPS01 -:

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
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch | 
| Switch 2 | switch_binary2 | switch_binary | Switch | Switch | 

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

### Switch 1
Switch the power on and off.

The ```switch_binary1``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 2
Switch the power on and off.

The ```switch_binary2``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.



## Device Configuration

The following table provides a summary of the 27 configuration parameters available in the HE-TPS01.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Frequency Region | Frequency Region |
| 3 | Hardware and Software Versions | Hardware and Software Versions |
| 4 | Energy Consumption | Energy Consumption |
| 5 | Backlight brightness control | Backlight brightness control |
| 6 | Touch buttons sensitivity | Touch buttons sensitivity |
| 7 | Relay 1 output NO or NC mode | Relay 1 output NO or NC mode |
| 12 | Power of the Relay 1 load | Power of the Relay 1 load |
| 17 | Air Temperature Calibration | Air Temperature Calibration |
| 19 | Time correction by controller | Time correction by controller |
| 21 | Week Day | Week Day |
| 22 | Time manual corrections | Time manual corrections |
| 30 | Active state backlight color | Active state backlight color |
| 31 | Backlight 1 control source | Backlight 1 control source |
| 41 | Hold control mode for touch button 1 | Hold control mode for touch button 1 |
| 51 | Click control mode for touch button 1 | Click control mode for touch button 1 |
| 61 | Relay 1 control source | Relay 1 control source |
| 66 | Restore Relay State after Power Failure | Restore Relay State after Power Failure |
| 71 | Timer mode duration for button 1 | Timer mode duration for button 1 |
| 141 | Consumption meter consecutive reporting interval | Consumption meter consecutive reporting interval |
| 142 | Consumption change report to send to controller | Consumption change report to send to controller |
| 143 | Sensors consecutive reporting interval | Sensors consecutive reporting interval |
| 144 | Temperature difference to send to controller | Temperature difference to send to controller, |
| 145 | Humidity difference to send to controller | Humidity difference to send to controller |
| 146 | Light sensor values difference to send to controller | Light sensor values difference to send to controller |
| 171 | Touch control mode for associations with touch button 1 | Touch control mode for associations with touch button 1 |
| 181 | Dimming Brightness Level for association with touch button 1 | Dimming Brightness Level for association with touch button 1 |
| 191 | Dimming Duration for association with touch button 1 | Dimming Duration for association with touch button 1 |

### Parameter 1: Frequency Region

Frequency Region
The HE-TPS01 has Z-Wave 700 series chip inside which allows to use the device in different Z-Wave frequencies. If there is a need to use the device in the frequency different from the factory default, change the value of this Parameter according to the frequency list below. Modification is possible only while the HE-TPS01 is not included to Z-Wave network.

0: EU (868.4 MHz, 869.85 MHz)

1: US (908.4 MHz, 916.0 MHz)

2: ANZ (919.8 MHz, 921.4 MHz)

3: HK (919.8 MHz)

4: IN (865.2 MHz)

5: IL (916.0 MHz)

6: RU (869.0 MHz)

7: CN (868.4 MHz)

8: JP (922.5 MHz, 923.9 MHz, 926.3 MHz)

9: KR (920.9 MHz, 921.7 MHz, 923.1 MHz)This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 9 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 3: Hardware and Software Versions

Hardware and Software Versions
Parameter 03 – Hardware and Software Versions

This Parameter allows to check the hardware and firmware versions of the device. The Parameter returns value in the format XXYYZZ, where XX is Hardware Version, YY is Firmware Major Version and ZZ is Firmware Minor Version.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_3_4``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 4: Energy Consumption

Energy Consumption
Parameter 04 – Energy Consumption

This Parameter allows to check the Cumulative Energy Consumption (in kW) of the connected load.

HE-TPS01 monitors Real-Time and Cumulative power Energy Consumption of connected load using advanced software logic which measures the consumption based on load power value set in Parameter 12.

Cumulative Energy Consumption is the total electrical power being used by connected load since the Parameter 04 value last reset. Power usage is calculated by the software using the values that were manually set when configuring Parameter 12, multiplied by the time tracked when the HE-TPS01 corresponding output was in ON state.

Real-Time Consumption and Cumulative Consumption are periodically reported to the Z-Wave controller according to the Parameters 141 and 142 settings.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_4_4``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 5: Backlight brightness control

Backlight brightness control
The HE-TPS01 has two brightness levels for its button backlight: 1) Active Level – when the button is touched, its backlight becomes brighter, and 2) Inactive Level – after one second of inactivity, its backlight dims. The actual brightness level may be adjusted manually or automatically.

Parameter 05 – Brightness Control

The HE-TPS01 can adjust its button backlight brightness automatically depending on the illumination of the ambient environment and also allows to control it manually. Set the Parameter value to 0 to activate the Automatic Brightness Control or set from value 1 (lowest brightness) to 10 (highest brightness) for Manual Control. The factory default value is 0.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 10 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Touch buttons sensitivity

Touch buttons sensitivity
Parameter 06 – Touch Sensor Sensitivity Threshold

This Parameter allows the device Touch Button Sensitivity Threshold to be adjusted from level 1 (low sensitivity) to 10 (high sensitivity). The factory default value is 6.

≡ Note: Setting the sensitivity too high can lead to false touch detection. We recommend not changing this Parameter unless there is a special need to do so.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 1 to 10 may be set.

The manufacturer defined default value is ```6```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Relay 1 output NO or NC mode

Relay 1 output NO or NC mode
Parameter 07 – Output NO/NC Mode

This Parameter determines the type of load connected to the device relay output. The output type can be NO – normal open (no contact/voltage to switch the load OFF) or NC - normal close (output is contacted / there is a voltage to switch the load OFF). Choose the value 0 if NO contact type is required or value 1 if NC type is required. The factory default value is 0 (NO mode).This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 12: Power of the Relay 1 load

Power of the Relay 1 load
Parameter 12 – Relay Load Power in watt

This Parameter is used to specify the load power that are connected to the device output. Using your connected device’s power consumption specification (see associated owner’s manual), set the load in Watts. The factory default value is 0.

≡ Note: The range from 0 to 1100 watt can be selected.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 1100 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 17: Air Temperature Calibration

Air Temperature Calibration
Parameter 17 – Air Temperature Calibration

This parameter defines the offset value for room air temperature. If the internal air temperature sensor is not correctly calibrated, then manual calibration can be made by adjusting the values up to ±10°C. This value will be added or subtracted from the internal air temperature sensor reading. The value of this Parameter should be x10, e.g. for 1.5°C set the value 15. The factory default value is 0This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range -100 to 100 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 19: Time correction by controller

Time correction by controller
Parameter 19 – Time Correction by Main Controller

If this Parameter value = 1 and the HE-TPS01 is connected to a Z-Wave gateway, the HE-TPS01 time and day will be periodically polled and corrected from the gateway. To switch off auto-correction set the Parameter value to 0. The factory default value is 1.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_19_1``` and is of type ```INTEGER```.


### Parameter 21: Week Day

Week Day
Parameter 21 – Day of the Week Manual Adjustment

This Parameter allows manual adjustment of the day of the week in case the HE-TPS01 is not connected to any Z-Wave gateway or auto-correction is disabled (Parameter 19 value is 0). 1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 = Friday, 6 = Saturday, 7 = Sunday. The factory default value is 1.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 1 to 7 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_21_1``` and is of type ```INTEGER```.


### Parameter 22: Time manual corrections

Time manual corrections
Parameter 22 – Time Manual Adjustment

This Parameter allows manual adjustment of Time. The Parameter has the following format: HHMM, where HH is hours and MM is minutes. E.g. for 16:08 set the value 1608 and for 1:00 set the value 100.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 2359 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_22_2``` and is of type ```INTEGER```.


### Parameter 30: Active state backlight color

Active state backlight color
Parameter 30 – Button Backlight Color

Choose the value “1” if you wish the backlight active state to be blue, and the inactive state to be red (default). Choose the value “0” if you wish the backlight active state to be red, and the inactive state to be blue. The factory default value is 1.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_30_1``` and is of type ```INTEGER```.


### Parameter 31: Backlight 1 control source

Backlight 1 control source
Parameter 31– Button Backlight Control Source

0 – Backlight is disabled (both color LEDs are turned off)

1 – Backlight is controlled by touch button (reflects the button state)

2 – Backlight is controlled by gateway or associated device (the button state is ignored)

The factory default value is 1.

≡ Note: If the backlight is disabled (the Parameter value is set to “0”), it is also impossible to control it from the gatewayThis is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_31_1``` and is of type ```INTEGER```.


### Parameter 41: Hold control mode for touch button 1

Hold control mode for touch button 1
Parameter 41 – Button Hold (Long Press) Control Mode.

0 – Hold function is disabled

1 – Operate like click

2 – When the button is held the relay output state is ON, as soon as the button is released the relay output state changes to OFF (momentary switch).

3 – When the button is held the relay output state is OFF, as soon as the button is released the relay output state changes to ON (momentary switch).

4 – When the button is held or released the relay output state will toggle its state (ON to OFF or OFF to ON).

The factory default value is 2.

≡ Note: Regardless of this Parameter, the device will send scene notifications about the touch state (pressed, held, released) to the gateway.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 4 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_41_1``` and is of type ```INTEGER```.


### Parameter 51: Click control mode for touch button 1

Click control mode for touch button 1
Parameter 51 – Button Click (Short Press) Control Mode

0 – Press function disabled

1 – Relay inverts state (toggles ON to OFF, OFF to ON) according to the relay state

2 – Relay inverts state (toggles ON to OFF, OFF to ON) according to the button backlight state.

3 – Relay switches to ON state only

4 – Relay switches to OFF state only

5 – Timer: On>Off Mode: Relay output switches to ON state (contacts are closed) then after a specified time switches back to OFF state (contacts are open). The time is specified in Parameter 71.

6 – Timer: OFF>ON Mode: Relay output switches to OFF state (contacts are open) then after a specified time switches back to ON state (contacts are closed). The time is specified in Parameter 71.

The factory default value is 1.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 6 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_51_1``` and is of type ```INTEGER```.


### Parameter 61: Relay 1 control source

Relay 1 control source
Parameter 61 – Button Number for Relays Output Control

0 – Controlled by gateway or associated device

1 – Controlled by touch button

Factory default value: 1.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_61_1``` and is of type ```INTEGER```.


### Parameter 66: Restore Relay State after Power Failure

Restore Relay State after Power Failure
Parameter 66 – Retore Relay State

This Parameter determine whether the relay last state should be restored after power failure. Set the value 1 if there is a need to restore the relay to the state it was before power failure. The relay state will always be Off after power failure if the value of this Parameter is 0. The factory default value is 0
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_66_1``` and is of type ```INTEGER```.


### Parameter 71: Timer mode duration for button 1

Timer mode duration for button 1
Parameter 71 – Relay Timer mode duration This Parameter specifies the duration in seconds for the Timer mode (values 5 or 6 in Parameter 51 respectively). Press the button and the relay output goes to ON/OFF for the specified time then changes back to OFF/ON. This function can be used to turn attached devices like door lock or security OFF for a short time. The time values can be configured from 0 sec to 32400 sec (9 hours). The factory default value is 0.

≡ Note: If the parameter value is set to “0” it will operate as a short contact (about 500mSec).

≡ Note: If the parameter value is set to “-1” it will operate as a shorter contact (about 50mSec).This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range -1 to 32400 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_71_2``` and is of type ```INTEGER```.


### Parameter 141: Consumption meter consecutive reporting interval

Consumption meter consecutive reporting interval
Parameter 141 – Energy Consumption Meter Consecutive Report Interval

When the device is connected to the Z-Wave gateway (controller), it periodically sends to the gateway reports from its energy consumption meter even if there is no change in the value. This Parameter defines the interval between consecutive reports of real time and cumulative energy consumption data to the gateway. The value can be adjusted from 1 min to 120 min. The factory default value is 10 min.

≡ Note: If the consumption changes, the device will send the report to the gateway regardless of this Parameter value (the report will be sent according to value in Parameter 142).

≡ Note: It is not recommended to reduce the value of this Parameter in order not to increase the traffic on your network. We recommend to reduce the value of this Parameter only in case of poor connection, when reports from the device does not always reach the gateway.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 1 to 120 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_141_1``` and is of type ```INTEGER```.


### Parameter 142: Consumption change report to send to controller

Consumption change report to send to controller
Parameter 142 – Control Energy Consumption Report

This Parameter determines if the consumption change will resulting in the consumption report being sent to the gateway. Use the value 0 if there is a need to stop sending the reports and value 1 to activate reports. The factory default value is 1.

≡ Note: When the device is turning ON, the consumption data will be sent to the gateway once, even if the value of this Parameter is 0.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_142_1``` and is of type ```INTEGER```.


### Parameter 143: Sensors consecutive reporting interval

Sensors consecutive reporting interval
Parameter 143 – Sensors Consecutive Report Interval

When the device is connected to the Z-Wave gateway (controller), it periodically sends to the gateway reports from its room & floor temperature, humidity and light sensors even if there are not changes in the values. This Parameter defines the interval between consecutive reports. The value can be adjusted from 1 min to 120 min. The factory default value is 10 min.

≡ Note: If the sensor readings change, the device will send the report to the gateway regardless of this Parameter value (the report will be sent according to values in Parameters 144, 145 and 146).

≡ Note: It is not recommended to reduce the value of this Parameter in order not to increase the traffic on your network. We recommend to reduce the value of this Parameter only in case of poor connection, when reports from the device does not always reach the gateway.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 1 to 120 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_143_1``` and is of type ```INTEGER```.


### Parameter 144: Temperature difference to send to controller

Temperature difference to send to controller,
Parameter 144 – Air Temperature Sensors Report Threshold

This Parameter determines the change in temperature level (in °C) resulting in temperature sensor report being sent to the gateway. The value of this Parameter should be x10, e.g. for 0.4°C use value 4. From 0.1°C (value 1) to 10°C (value 100) can be selected. Use the value 0 if there is a need to stop sending the reports. The factory default value is 2 (0.2°C).

≡ Note: When the device is turning ON, the sensor data will be sent to the gateway once, even if the value of this Parameter is 0.

≡ Note: It is not recommended to decrease the value of this Parameter, in order not to increase the load on your Z-Wave network traffic.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_144_1``` and is of type ```INTEGER```.


### Parameter 145: Humidity difference to send to controller

Humidity difference to send to controller
Parameter 145 – Humidity Sensor Report Threshold

This Parameter determines the change in humidity level in % resulting in humidity sensors report being sent to the gateway. From 1% to 25% can be selected. Use the value 0 if there is a need to stop sending the reports. The factory default value is 2.

≡ Note: When the device is turning ON, the sensor data will be sent to the gateway once, even if the value of this Parameter is 0.

≡ Note: It is not recommended to decrease the value of this Parameter, in order not to increase the load on your Z-Wave network traffic.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 25 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_145_1``` and is of type ```INTEGER```.


### Parameter 146: Light sensor values difference to send to controller

Light sensor values difference to send to controller
Parameter 146 – Light Sensor Report Threshold

This Parameter determines the change in the ambient environment illuminance level resulting in a light sensors report being sent to the gateway. From 10% to 99% can be selected. Use the value 0 if there is a need to stop sending the reports. The factory default value is 50.

≡ Note: When the device is turning On, the sensor data will be sent to the gateway once, even if the value of this Parameter is 0.

≡ Note: It is not recommended to decrease the value of this Parameter, in order not to increase the load on your Z-Wave network traffic.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_146_1``` and is of type ```INTEGER```.


### Parameter 171: Touch control mode for associations with touch button 1

Touch control mode for associations with touch button 1
Parameter 171 – Association Mode

This Parameter is intended for use when Multilevel Switch Group Association (Groups 3) have been activated. It defines the logic of values changing if the touch button has been held for more than one second. This is useful option for controlling dimmers or roller shutter devices in the following three ways:

“0” – On each hold event, “UP (brighten)” and “DOWN (dim)” command will be alternately sent to associated devices.

“1” – On each hold event, the “UP (brighten)” command will be sent to associated devices.

“2” – On each hold event, the “DOWN (dim)” command will be sent to associated devices.

The factory-default value: 0.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_171_1``` and is of type ```INTEGER```.


### Parameter 181: Dimming Brightness Level for association with touch button 1

Dimming Brightness Level for association with touch button 1
Parameters 181 – Dimming Set On Brightness Level

This parameter specifies the brightness level that will be sent to associated dimmer devices when the touch button was clicked (when sending Set On command). Use values 1 to 99, to set a specific brightness level (the brightness level corresponds to the percentage of the set value), or use value 0 to restore the most recent (non-zero) brightness level on the dimmer. The factory default value is 0.

≡ Note: Note: Dimmer devices should be associated with the touch button as a multi-channel association.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_181_1``` and is of type ```INTEGER```.


### Parameter 191: Dimming Duration for association with touch button 1

Dimming Duration for association with touch button 1
Parameters 191 – Dimming Duration

This parameter specifies the duration when the dimmer goes from lowest (~0%) level to the highest (~99%) level and vice versa, when "Dimming up/Dimming Down" commands are received through association. Use values 1 to 120 seconds to specify the duration or use value 0 to use dimmer’s factory default duration. The factory default value is 0.

≡ Note: Dimmer devices should be associated with the touch button as a multi-channel association

≡ Note: Different dimmers may interpret this parameter differently, in such cases the parameter values should be determined experimentally for a specific dimmer model.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 120 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_191_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The HE-TPS01 supports 5 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Lifeline reports full state of the device and is used to communicate with the Z-Wave gateway
Group 1 – “Lifeline”: reports full state of the device and is used to communicate with the Z-Wave gateway. The group supports one Node.

≡ Note: It is not recommended to modify this group.

≡ Note: For correct operating in Fibaro gateways, the Single Channel Association should be removed from the device LifeLine (EndPoint 0 Group 1).

Association group 1 supports 1 node.

### Group 2: Touch Basic Set

Group2-Touch Basic Set
Group 2 – “Touch Basic Set”: is assigned to touch N1. Is used to send Basic Set ON (value 255) and Basic Set OFF (value 0) commands to the associated devices. Max supported nodes: 1.

Association group 2 supports 1 node.

### Group 3: Touch Multilevel Set

Group3-Touch Multilevel Set
Group 3 – “Touch Multilevel Set”: is assigned to touch N1. It sends MULTILEVEL SWITCH command class frame when touch N1 was held. Is used to send UP/DOWN command to the associated devices. Max supported nodes: 1.

Association group 3 supports 1 node.

### Group 4: LED Basic Set

Group4-LED Basic Set
Group 4 – “LED Basic Set”: is assigned to LED N1. Is used to send Basic Set ON (value 255) and Basic Set OFF (value 0) commands to the associated devices. Max supported nodes: 1.

Association group 4 supports 1 node.

### Group 5: Relay Basic Set

Group5-Relay Basic Set
Group 5 – “Relay Basic Set”: is assigned to relay N1. Is used to send Basic Set ON (value 255) and Basic Set OFF (value 0) commands to the associated devices. Max supported nodes: 1.

Association group 5 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V2| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V2| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V11| |
| COMMAND_CLASS_METER_V5| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V2| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V3| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_CENTRAL_SCENE_V3| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V5| |
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

### Documentation Links

* [Manual Full (English)](https://opensmarthouse.org/zwavedatabase/1614/reference/Manual_Full_English_HE-TPS01_v1.1.pdf)
* [Manual Full (English)](https://opensmarthouse.org/zwavedatabase/1614/reference/Manual_Full_English_HE-TPS01_v1.1_1.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1614).
