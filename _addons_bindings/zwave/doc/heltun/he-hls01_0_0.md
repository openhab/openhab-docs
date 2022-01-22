---
layout: documentation
title: HE-HLS01 - ZWave
---

{% include base.html %}

# HE-HLS01 High Load Switch
This describes the Z-Wave device *HE-HLS01*, manufactured by *Heltun* with the thing type UID of ```heltun_he-hls01_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![HE-HLS01 product image](https://opensmarthouse.org/zwavedatabase/1374/image/)


The HE-HLS01 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The HE-HLS01 High Load Switch with Thermostat Functions fits easily behind outlets making them ‘Impossibly Smart’ with over-the-Internet control and advanced programmability. In addition, built-in Power Consumption System helps to monitor how much energy was used. With included NTC temperature sensor it provides thermostat functions where a local display and controls are not needed. The High Load Switch also adds safety to your home by protecting against overloads, overheat, overvoltage, spark and surge conditions.

### Inclusion Information

  1. Ensure the HE-HLS01 is Powered On and the LED indicator blinks red slowly (i.e. it is excluded).

  2. Start the Inclusion Mode from the gateway/controller.

  3. To start the inclusion process on the HE-HLS01: 
    
    a) if you want to use the device as a “Binary Switch”, double-press the service button on the device (with no more than a one-second interval between presses).
    
    b) if you want to use the device as a “Thermostat”, press four times the service button on the device (with no more than a one-second interval between presses).

  4. The LED indicator will blink green quickly.
  5. If the inclusion has been successful, the LED indicator will turn green for three seconds then continue slowly blinking green while the HE-HLS01 device type is “Binary Switch” and turn blue for three seconds then continue slowly blinking blue while the device type is “Thermostat”.

  6. If the inclusion was not successful, the LED indicator will turn red for three seconds then continue slowly blinking red continuously while the HE-HLS01 is Powered On. In that case repeat the inclusion process (2-5) above.

### Exclusion Information

  1. Ensure the HE-HLS01 is Powered On and the LED indicator blinks green slowly (i.e. it is included in a Z-Wave network).
  2. Start the Exclusion Mode from the gateway/controller.
  3. To start the exclusion process on the HE-HLS01, double-press the service button on the device (with no more than a one-second interval between presses).
  4. The LED indicator will blink red quickly.
  5. If the exclusion has been successful, LED indicator will turn red for three seconds then continue slowly blinking red continuously while the HE-HLS01 is Powered On.
  6. If the exclusion was not successful, the LED indicator will turn green for three seconds then continue slowly blinking green continuously while the HE-HLS01 is Powered On. In that case repeat the exclusion process (2-5) above.

### General Usage Information



## Channels

The following table summarises the channels available for the HE-HLS01 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 
| Alarm (heat) | alarm_heat | alarm_heat | Fire | Switch | 
| Alarm (system) | alarm_system | alarm_system |  | Switch | 
| Clock Time Offset | time_offset | time_offset | Time | Number | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (volts)
Indicates the instantaneous voltage.

The ```meter_voltage``` channel is of type ```meter_voltage``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (power)
Indicates if a power alarm is triggered.

The ```alarm_power``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (heat)
Indicates if a heat alarm is triggered.

The ```alarm_heat``` channel is of type ```alarm_heat``` and supports the ```Switch``` item and is in the ```Fire``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (system)
Indicates if a system alarm is triggered.

The ```alarm_system``` channel is of type ```alarm_system``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Clock Time Offset
Provides the current time difference for the devices time.

The ```time_offset``` channel is of type ```time_offset``` and supports the ```Number``` item and is in the ```Time``` category.



## Device Configuration

The following table provides a summary of the 46 configuration parameters available in the HE-HLS01.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Frequency Region | Frequency Region |
| 2 | Included Device Type | Included Device Type |
| 3 | Hardware and Software Versions | Hardware and Software Versions |
| 4 | Energy Consumption in kW | Energy Consumption in kW |
| 7 | Relay output mode | Relay output NO or NC mode |
| 10 | Floor Sensor Resistance | External Floor NTC temperature sensor resistance |
| 16 | Temperature Scale Mode | Sets temperature unit (Celsius/Fahrenheit) |
| 17 | Temperature Sensor Calibration | Temperature Sensor Calibration |
| 19 | Time correction by controller | Time correction by controller |
| 21 | Week Day | Week Day |
| 22 | Time: Hour and Minutes | Time: Hour and Minutes |
| 23 | Load Auto On/Off | Load Auto On/Off |
| 24 | Auto Off Timeout | Auto Off Timeout in minutes |
| 25 | Auto On Reconnect Timeout | Auto On Reconnect Timeout |
| 26 | Time Limited Load | Time Limited Load |
| 27 | High Load ON Time Limit | High Load ON Time Limit |
| 41 | External input: Hold Control Mode | External input: Hold Control Mode |
| 46 | External input: Hold Control Mode Duration | External input: Hold Control Mode Duration |
| 51 | External Input: Click Control Mode | External Input: Click Control Mode |
| 66 | Restore Relay State After Power Failure | Restore Relay State After Power Failure |
| 71 | Relay Timer Mode Duration | Relay Timer Mode Duration |
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
| 139 | Temperature sensor consecutive report interval | Temperature sensor consecutive report interval |
| 141 | Energy Consumption Meter Consecutive Report Interval | Energy Consumption Meter Consecutive Report Interval |
| 142 | Energy Consumption Report Threshold | Consumption difference to send to controller, % |
| 143 | Temperature sensor consecutive report interval | Temperature sensor consecutive report interval |
| 144 | Temperature report threshold | Temperature difference to send to controller, value X 10 |
| 151 | System Error Notification | System Error Notification |
| 152 | Temperature Rise Notification | Temperature Rise Notification |
| 153 | Overheat Protection & Notification | Overheat Protection & Notification |
| 154 | Over-Current Notification | Enable/disable over-current notification |
| 155 | Over-Load Protection & Notification | Over-Load Protection & Notification |
| 156 | Over-Voltage Protection & Notification | Over-Voltage Protection & Notification |
| 157 | Voltage Drop Protection & Notification | Voltage Drop Protection & Notification |
| 158 | Spark Protection | Spark Protection |
| 159 | Load On Notification | Load On Notification |
| 160 | Load Off Notification | Load Off Notification |

### Parameter 1: Frequency Region

Frequency Region
The HE-HLS01 has Z-Wave 700 series chip inside which allows to use the device in different Z-Wave frequencies. If there is a need to use the device in the frequency different from the factory default, change the value of this Parameter according to the frequency list below.

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
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | EU |
| 1 | US |
| 2 | ANZ |
| 3 | HK |
| 4 | IN |
| 5 | IL |
| 6 | RU |
| 7 | CN |
| 8 | JP |
| 9 | KR |

The manufacturer defined default value is ```0``` (EU).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 2: Included Device Type

Included Device Type
Included Device Type

1 = Binary Switch

2 = ThermostatThis is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Binary Switch |
| 2 | Thermostat |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 3: Hardware and Software Versions

Hardware and Software Versions
This Parameter allows to check the hardware and firmware versions of the device. The Parameter returns value in the format XXYYZZ, where XX is Hardware Version, YY is Firmware Major Version and ZZ is Firmware Minor Version.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_3_4``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 4: Energy Consumption in kW

Energy Consumption in kW
This Parameter allows you to check the Cumulative Energy Consumption of the connected load. Through the Z-Wave network this Parameter returns Total Cumulative Consumption value in kWh.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_4_4``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 7: Relay output mode

Relay output NO or NC mode
This Parameter determines the type of load connected to the device relay output. The output type can be NO – normal open (no contact/voltage switch the load OFF) or NC - normal close (output is contacted / there is a voltage to switch the load OFF). Choose the value 0 if NO contact type is required or value 1 if NC type is required. The factory default value is 0.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Normally Open |
| 1 | Normally Closed |

The manufacturer defined default value is ```0``` (Normally Open).

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 10: Floor Sensor Resistance

External Floor NTC temperature sensor resistance
If the external floor NTC temperature sensor is used it is necessary to select the correct resistance value in Ohms (Ω) of the sensor. The selection range is 1 to 100 kiloOhms (kΩ). One 10kΩ NTC floor temperature sensor is included in the HE-HLS01 package with a 3-meter connection wire. The factory default value is 10kΩ.
Values in the range 1 to 100 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 16: Temperature Scale Mode

Sets temperature unit (Celsius/Fahrenheit)
This parameter determines in which unit of measurement (degrees Celsius or Fahrenheit) the device will report the temperature, and also determines the scale that will be interpreted by the configuration parameters. Set the value 0 for Celsius and the value 1 for Fahrenheit.Factory default value is 0 (degrees Celsius).
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Celsius |
| 1 | Fahrenheit |

The manufacturer defined default value is ```0``` (Celsius).

This parameter has the configuration ID ```config_16_1``` and is of type ```INTEGER```.


### Parameter 17: Temperature Sensor Calibration

Temperature Sensor Calibration
This Parameter defines the offset value for floor temperature. If the external floor temperature sensor is not calibrated properly, then manual calibration can be made by adjusting the values up to ±10.0°C (±18°F).This value will be added or subtracted from the floor temperature sensor reading. Through the Z-Wave network the value of this Parameter should be x10 (for Celsius only), e.g. for 1.5°C set the value 15. The factory default value is 0.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range -100 to 100 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 19: Time correction by controller

Time correction by controller
If this Parameter value = 1 and the HE-HLS01 is connected to a Z-Wave gateway, the HEHLS01 time and day will be periodically polled and corrected from the gateway. To switch off auto-correction set the Parameter value to 0. The factory default value is 1.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```1``` (Enabled).

This parameter has the configuration ID ```config_19_1``` and is of type ```INTEGER```.


### Parameter 21: Week Day

Week Day
This Parameter allows manual adjustment of the day of the week in case the HE-HLS01 is not connected to any Z-Wave gateway or auto-correction is disabled (Parameter 19 value is 0). 1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 = Friday, 6 = Saturday, 7 = Sunday. The factory default value is 1.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Monday |
| 2 | Tuesday |
| 3 | Wednesday |
| 4 | Thursday |
| 5 | Friday |
| 6 | Saturday |
| 7 | Sunday |

The manufacturer defined default value is ```1``` (Monday).

This parameter has the configuration ID ```config_21_1``` and is of type ```INTEGER```.


### Parameter 22: Time: Hour and Minutes

Time: Hour and Minutes
This Parameter allows manual adjustment of Time. The Parameter has the following format: HHMM, where HH is hours and MM is minutes. E.g. for 16:08 set the value 1608 and for 1:00 set the value 100.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 2359 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_22_2``` and is of type ```INTEGER```.


### Parameter 23: Load Auto On/Off

Load Auto On/Off
If this function is enabled the device will switch Off the relay output when there is no consumption and switch On the output again when the load is reconnected. It is possible to set the delay for Auto Off function (in the Parameter 24) and for Auto On function (in the Parameter 25). To enable Auto On/Off function, setthis Parameter value to 1 and use the value 0 if there is a need to disable the function.The factory default value is 0 (the function is disabled).
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```0``` (Disabled).

This parameter has the configuration ID ```config_23_1``` and is of type ```INTEGER```.


### Parameter 24: Auto Off Timeout

Auto Off Timeout in minutes
If Auto On/Off function (the Parameter 23) is enabled, it is possible to delay the Auto Off function. The output will be switched Off when there is no consumption for the interval defined in this parameter in minutes. The value of this parameter can be set from 0 to 120 min. Set the parameter value to 0 if there is a need to switch Off the output immediately when consumption drops to 0W.The factory default value is 5 min
Values in the range 0 to 120 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_24_1``` and is of type ```INTEGER```.


### Parameter 25: Auto On Reconnect Timeout

Auto On Reconnect Timeout
If Auto On/Off function (the Parameter 23) is enabled, it is possible to delay the Auto On function. When the load is reconnected the relay output will be switched On after the time defined in this parameter in minutes. The value of this parameter can be set from 0 to 120 min. Set the parameter value to 0 if there isa need to switch On the output immediately when the load is reconnected.The factory default value is 0 min.
Values in the range 0 to 120 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_25_1``` and is of type ```INTEGER```.


### Parameter 26: Time Limited Load

Time Limited Load
If the HLS01 is used to control an electric socket, you can configure the device so that it automatically switch Off the socket if the potentially dangerous high load is connected longer than allowable time (time to be set in the Parameter 27), for example, if you left the iron switched On for too long. Set in this parameter the threshold value in watts, reaching which the connected load will be considered high. The value of this parameter can be set from 100 to 3500 in watts. Use the value 0 if there is a need to disable this function. The factory default value is 0 (the function is disabled).
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_26_2``` and is of type ```INTEGER```.


### Parameter 27: High Load ON Time Limit

High Load ON Time Limit
If High Load Timeout Protection is activated (the Parameter 26 is set) use this parameter to set the threshold value in minutes. If the load is connected longer than this value, the device will automatically switch Off the socket. The value of this parameter is in minutes and can be set from 1 to 1440. Use the value 0 if there is a need to disable this function. The factory default value is 0 (the function is disabled).
Values in the range 0 to 1440 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_27_2``` and is of type ```INTEGER```.


### Parameter 41: External input: Hold Control Mode

External input: Hold Control Mode
0 – Hold function is disabled

1 – Operate like click (the Parameter 51) 

2 – Momentary Switch: When the button on switch connected to external input is held, (key closed) the relay output state is ON, as soon as the button is released (key opened) the relay output state changes to OFF.

3 – Reversed Momentary Switch: When the button on switch connected to external input is held, the relay output state is OFF, as soon as the button is released the relay output state changes to ON.

The factory default value is 2.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Hold function is disabled |
| 1 | Operate like click (parameter 51) |
| 2 | Momentary switch |
| 3 | Reversed momentary switch |

The manufacturer defined default value is ```2``` (Momentary switch).

This parameter has the configuration ID ```config_41_1``` and is of type ```INTEGER```.


### Parameter 46: External input: Hold Control Mode Duration

External input: Hold Control Mode Duration
This parameter specifies the time the device needs to recognize a hold mode when the button connected to an external input is held (key closed). The acceptable values are: 200 to 5000 milliseconds. The factory default value is 500 milliseconds.
Values in the range 200 to 5000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_46_1``` and is of type ```INTEGER```.


### Parameter 51: External Input: Click Control Mode

External Input: Click Control Mode
0 – Click function disabled

1 – Toggle switch: relay inverts state (ON to OFF, OFF to ON).

2 – Relay switches to ON state only

3 – Relay switches to OFF state only

4 – Timer: On>Off Mode: Relay output switches to ON state (contacts are closed) then after a specified time switches back to OFF state (contacts are open). The time is specified in the Parameter 71.

5 – Timer: OFF>ON Mode: Relay output switches to OFF state (contacts are open) then after a specified time switches back to ON state (contacts are closed). The time is specified in Parameter 71.

The factory default value is 1.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Click function disabled |
| 1 | Toggle switch |
| 2 | Relay switches to ON state only |
| 3 | Relay switches to OFF state only |
| 4 | Timer On>Off mode |
| 5 | Time Off>On mode |

The manufacturer defined default value is ```1``` (Toggle switch).

This parameter has the configuration ID ```config_51_1``` and is of type ```INTEGER```.


### Parameter 66: Restore Relay State After Power Failure

Restore Relay State After Power Failure
This parameter determines if the last relay state should be restored after power failure or not. Use value 1 if there is a need to restore the last relay state, and value 0 for not restoring the last relay state. The relay state will always be off after power failure if value 0 is selected. The factory default value is 0
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```0``` (Disabled).

This parameter has the configuration ID ```config_66_1``` and is of type ```INTEGER```.


### Parameter 71: Relay Timer Mode Duration

Relay Timer Mode Duration
These parameters specify the duration in seconds for the Timer mode (values 4 or 5 in the Parameter 51). Press the button on the switch connected to external input and the relay output goes to ON/OFF for the specified time then changes back to OFF/ON. The time value can be configured from 0 sec to 43200 sec (12 hours). The factory default value is 0.

If the parameter value is set to “0” the relay output will operate as a short contact (duration is about 0.5 sec).
Values in the range 0 to 43200 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_71_2``` and is of type ```INTEGER```.


### Parameter 111: Relay control scenario 1

Relay control scenario 1
In these parameters, the relay state changes depending on day and time. For these configurations, parameter values are encoded as 7-digit numbers (ABCDEFG).

A: State. 0 = Disabled, 1 = Enabled

B: Day of week

0 = every day

1-7 = corresponding day (1 is Monday, 7 is Sunday)

8 = every weekday (Monday - Friday)

9 = every weekend (Saturday and Sunday)

C: Change state to

0 = Switch OFF

1 = Switch ON

DEFG: Time

DE represents Hour (from 0 to 23),

FG represents Minutes (from 0 to 59).

All other numbers are reserved and will not affect the operation. To disable this option simply set this parameter to 0.

The factory default value is 0.

Example: Parameter value 1210350 means A=1 (the scenario is enabled), B=2 (Tuesday), C=1 (switch the relay On), DEFG=0350 (time 03:50). In this case each Tuesday at 03:50 the HE-HLS01 USER MANUAL 24 relay output will be switched On. To disable the scenario, change the first digit to 0. In this example it will be 0210350.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_111_4``` and is of type ```INTEGER```.


### Parameter 112: Relay control scenario 2

Relay control scenario 2
In these parameters, the relay state changes depending on day and time. For these configurations, parameter values are encoded as 7-digit numbers (ABCDEFG).

A: State. 0 = Disabled, 1 = Enabled

B: Day of week

0 = every day

1-7 = corresponding day (1 is Monday, 7 is Sunday)

8 = every weekday (Monday - Friday)

9 = every weekend (Saturday and Sunday)

C: Change state to

0 = Switch OFF

1 = Switch ON

DEFG: Time

DE represents Hour (from 0 to 23),

FG represents Minutes (from 0 to 59).

All other numbers are reserved and will not affect the operation. To disable this option simply set this parameter to 0.

The factory default value is 0.

Example: Parameter value 1210350 means A=1 (the scenario is enabled), B=2 (Tuesday), C=1 (switch the relay On), DEFG=0350 (time 03:50). In this case each Tuesday at 03:50 the HE-HLS01 USER MANUAL 24 relay output will be switched On. To disable the scenario, change the first digit to 0. In this example it will be 0210350.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_112_4``` and is of type ```INTEGER```.


### Parameter 113: Relay control scenario 3

Relay control scenario 3
In these parameters, the relay state changes depending on day and time. For these configurations, parameter values are encoded as 7-digit numbers (ABCDEFG).

A: State. 0 = Disabled, 1 = Enabled

B: Day of week

0 = every day

1-7 = corresponding day (1 is Monday, 7 is Sunday)

8 = every weekday (Monday - Friday)

9 = every weekend (Saturday and Sunday)

C: Change state to

0 = Switch OFF

1 = Switch ON

DEFG: Time

DE represents Hour (from 0 to 23),

FG represents Minutes (from 0 to 59).

All other numbers are reserved and will not affect the operation. To disable this option simply set this parameter to 0.

The factory default value is 0.

Example: Parameter value 1210350 means A=1 (the scenario is enabled), B=2 (Tuesday), C=1 (switch the relay On), DEFG=0350 (time 03:50). In this case each Tuesday at 03:50 the HE-HLS01 USER MANUAL 24 relay output will be switched On. To disable the scenario, change the first digit to 0. In this example it will be 0210350.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_113_4``` and is of type ```INTEGER```.


### Parameter 114: Relay control scenario 4

Relay control scenario 4
In these parameters, the relay state changes depending on day and time. For these configurations, parameter values are encoded as 7-digit numbers (ABCDEFG).

A: State. 0 = Disabled, 1 = Enabled

B: Day of week

0 = every day

1-7 = corresponding day (1 is Monday, 7 is Sunday)

8 = every weekday (Monday - Friday)

9 = every weekend (Saturday and Sunday)

C: Change state to

0 = Switch OFF

1 = Switch ON

DEFG: Time

DE represents Hour (from 0 to 23),

FG represents Minutes (from 0 to 59).

All other numbers are reserved and will not affect the operation. To disable this option simply set this parameter to 0.

The factory default value is 0.

Example: Parameter value 1210350 means A=1 (the scenario is enabled), B=2 (Tuesday), C=1 (switch the relay On), DEFG=0350 (time 03:50). In this case each Tuesday at 03:50 the HE-HLS01 USER MANUAL 24 relay output will be switched On. To disable the scenario, change the first digit to 0. In this example it will be 0210350.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_114_4``` and is of type ```INTEGER```.


### Parameter 115: Relay control scenario 5

Relay control scenario 5
In these parameters, the relay state changes depending on day and time. For these configurations, parameter values are encoded as 7-digit numbers (ABCDEFG).

A: State. 0 = Disabled, 1 = Enabled

B: Day of week

0 = every day

1-7 = corresponding day (1 is Monday, 7 is Sunday)

8 = every weekday (Monday - Friday)

9 = every weekend (Saturday and Sunday)

C: Change state to

0 = Switch OFF

1 = Switch ON

DEFG: Time

DE represents Hour (from 0 to 23),

FG represents Minutes (from 0 to 59).

All other numbers are reserved and will not affect the operation. To disable this option simply set this parameter to 0.

The factory default value is 0.

Example: Parameter value 1210350 means A=1 (the scenario is enabled), B=2 (Tuesday), C=1 (switch the relay On), DEFG=0350 (time 03:50). In this case each Tuesday at 03:50 the HE-HLS01 USER MANUAL 24 relay output will be switched On. To disable the scenario, change the first digit to 0. In this example it will be 0210350.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_115_4``` and is of type ```INTEGER```.


### Parameter 116: Relay control scenario 6

Relay control scenario 6
In these parameters, the relay state changes depending on day and time. For these configurations, parameter values are encoded as 7-digit numbers (ABCDEFG).

A: State. 0 = Disabled, 1 = Enabled

B: Day of week

0 = every day

1-7 = corresponding day (1 is Monday, 7 is Sunday)

8 = every weekday (Monday - Friday)

9 = every weekend (Saturday and Sunday)

C: Change state to

0 = Switch OFF

1 = Switch ON

DEFG: Time

DE represents Hour (from 0 to 23),

FG represents Minutes (from 0 to 59).

All other numbers are reserved and will not affect the operation. To disable this option simply set this parameter to 0.

The factory default value is 0.

Example: Parameter value 1210350 means A=1 (the scenario is enabled), B=2 (Tuesday), C=1 (switch the relay On), DEFG=0350 (time 03:50). In this case each Tuesday at 03:50 the HE-HLS01 USER MANUAL 24 relay output will be switched On. To disable the scenario, change the first digit to 0. In this example it will be 0210350.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_116_4``` and is of type ```INTEGER```.


### Parameter 117: Relay control scenario 7

Relay control scenario 7
In these parameters, the relay state changes depending on day and time. For these configurations, parameter values are encoded as 7-digit numbers (ABCDEFG).

A: State. 0 = Disabled, 1 = Enabled

B: Day of week

0 = every day

1-7 = corresponding day (1 is Monday, 7 is Sunday)

8 = every weekday (Monday - Friday)

9 = every weekend (Saturday and Sunday)

C: Change state to

0 = Switch OFF

1 = Switch ON

DEFG: Time

DE represents Hour (from 0 to 23),

FG represents Minutes (from 0 to 59).

All other numbers are reserved and will not affect the operation. To disable this option simply set this parameter to 0.

The factory default value is 0.

Example: Parameter value 1210350 means A=1 (the scenario is enabled), B=2 (Tuesday), C=1 (switch the relay On), DEFG=0350 (time 03:50). In this case each Tuesday at 03:50 the HE-HLS01 USER MANUAL 24 relay output will be switched On. To disable the scenario, change the first digit to 0. In this example it will be 0210350.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_117_4``` and is of type ```INTEGER```.


### Parameter 118: Relay control scenario 8

Relay control scenario 8
In these parameters, the relay state changes depending on day and time. For these configurations, parameter values are encoded as 7-digit numbers (ABCDEFG).

A: State. 0 = Disabled, 1 = Enabled

B: Day of week

0 = every day

1-7 = corresponding day (1 is Monday, 7 is Sunday)

8 = every weekday (Monday - Friday)

9 = every weekend (Saturday and Sunday)

C: Change state to

0 = Switch OFF

1 = Switch ON

DEFG: Time

DE represents Hour (from 0 to 23),

FG represents Minutes (from 0 to 59).

All other numbers are reserved and will not affect the operation. To disable this option simply set this parameter to 0.

The factory default value is 0.

Example: Parameter value 1210350 means A=1 (the scenario is enabled), B=2 (Tuesday), C=1 (switch the relay On), DEFG=0350 (time 03:50). In this case each Tuesday at 03:50 the HE-HLS01 USER MANUAL 24 relay output will be switched On. To disable the scenario, change the first digit to 0. In this example it will be 0210350.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_118_4``` and is of type ```INTEGER```.


### Parameter 119: Relay control scenario 9

Relay control scenario 9
In these parameters, the relay state changes depending on day and time. For these configurations, parameter values are encoded as 7-digit numbers (ABCDEFG).

A: State. 0 = Disabled, 1 = Enabled

B: Day of week

0 = every day

1-7 = corresponding day (1 is Monday, 7 is Sunday)

8 = every weekday (Monday - Friday)

9 = every weekend (Saturday and Sunday)

C: Change state to

0 = Switch OFF

1 = Switch ON

DEFG: Time

DE represents Hour (from 0 to 23),

FG represents Minutes (from 0 to 59).

All other numbers are reserved and will not affect the operation. To disable this option simply set this parameter to 0.

The factory default value is 0.

Example: Parameter value 1210350 means A=1 (the scenario is enabled), B=2 (Tuesday), C=1 (switch the relay On), DEFG=0350 (time 03:50). In this case each Tuesday at 03:50 the HE-HLS01 USER MANUAL 24 relay output will be switched On. To disable the scenario, change the first digit to 0. In this example it will be 0210350.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_119_4``` and is of type ```INTEGER```.


### Parameter 120: Relay control scenario 10

Relay control scenario 10
In these parameters, the relay state changes depending on day and time. For these configurations, parameter values are encoded as 7-digit numbers (ABCDEFG).

A: State. 0 = Disabled, 1 = Enabled

B: Day of week

0 = every day

1-7 = corresponding day (1 is Monday, 7 is Sunday)

8 = every weekday (Monday - Friday)

9 = every weekend (Saturday and Sunday)

C: Change state to

0 = Switch OFF

1 = Switch ON

DEFG: Time

DE represents Hour (from 0 to 23),

FG represents Minutes (from 0 to 59).

All other numbers are reserved and will not affect the operation. To disable this option simply set this parameter to 0.

The factory default value is 0.

Example: Parameter value 1210350 means A=1 (the scenario is enabled), B=2 (Tuesday), C=1 (switch the relay On), DEFG=0350 (time 03:50). In this case each Tuesday at 03:50 the HE-HLS01 USER MANUAL 24 relay output will be switched On. To disable the scenario, change the first digit to 0. In this example it will be 0210350.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_120_4``` and is of type ```INTEGER```.


### Parameter 139: Temperature sensor consecutive report interval

Temperature sensor consecutive report interval
When the device is connected to the Z-Wave gateway (controller), it periodically sends to the gateway reports from its floor temperature, sensor even if there are not changes in the values. This Parameter defines the interval between consecutive reports. The value can be adjusted from 1 min to 120 min. The factory default value is 10 min.
Values in the range 1 to 120 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_139_1``` and is of type ```INTEGER```.


### Parameter 141: Energy Consumption Meter Consecutive Report Interval

Energy Consumption Meter Consecutive Report Interval
When the device is connected to the Z-Wave gateway (controller), it periodically sends to the gateway reports from its energy consumption sensor even if there is no change in the value. This Parameter defines the interval between consecutive reports of real time and cumulative energy consumption data to the gateway. The value can be adjusted from 1 min to 120 min. The factory default value is 10 min.
Values in the range 1 to 120 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_141_1``` and is of type ```INTEGER```.


### Parameter 142: Energy Consumption Report Threshold

Consumption difference to send to controller, %
This Parameter determines the change in the load power resulting in the consumption report being sent to the gateway. From 1% to 50% can be selected. Use the value 0 if there is a need to stop sending the reports. The factory default value is 25
Values in the range 0 to 50 may be set.

The manufacturer defined default value is ```25```.

This parameter has the configuration ID ```config_142_1``` and is of type ```INTEGER```.


### Parameter 143: Temperature sensor consecutive report interval

Temperature sensor consecutive report interval
When the device is connected to the Z-Wave gateway (controller), it periodically sends to the gateway reports from its floor temperature, sensor even if there are not changes in the values. This Parameter defines the interval between consecutive reports. The value can be adjusted from 1 min to 120 min. The factory default value is 10 min.
Values in the range 1 to 120 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_143_1``` and is of type ```INTEGER```.


### Parameter 144: Temperature report threshold

Temperature difference to send to controller, value X 10
This Parameter determines the change in temperature level (in °C or °F) resulting in temperature sensors report being sent to the gateway. The value of this Parameter should be x10 (for °C only), e.g. for 0.4°C use value 4.From 0.1°C (value 1) to 10°C (value 100) and for °F from 1°F -18°F can be selected. Use the value 0 if there is a need to stop sending the reports. The factory default value is 2 (0.2°C).
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_144_1``` and is of type ```INTEGER```.


### Parameter 151: System Error Notification

System Error Notification
If the HLS01 does not work properly it sends “System Failure” notification to the gateway with the error code. Set the value 1 to enable “System Failure” notification or the value 0 to disable. The factory default value is 1 (the notification is enabled).

Errors code list (sent with the notification):

0 – No Error (no issue is detected)

1 – Relay Off Error (when unable to switch Off the relay output).

2 – Relay On Error (when unable to switch On the relay output).

3 – Relay On & Off Error (when unable to switch On and Off the relay output).

4 – NTC Error (when no NTC sensor is detected or when it is damaged).

5 – NTC and Relay Off Error (when no NTC sensor is detected or when it is damaged and unable to switch Off the relay output).

6 – NTC and Relay On Error (when no NTC sensor is detected or when it is damaged and unable to switch On the relay output).

7 – NTC and Relay On & Off Error (when no NTC sensor is detected or when it is damaged and unable to switch On and Off the relay output)This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```1``` (Enabled).

This parameter has the configuration ID ```config_151_1``` and is of type ```INTEGER```.


### Parameter 152: Temperature Rise Notification

Temperature Rise Notification
Use this parameter if you want to know about temperature rise before it reaches the critical value, defined in the “Overheat Protection” parameter. The device will send “Rapid Temperature Rise” notification to the gateway if the temperature sensor reading reaches the value defined in this parameter. The value can be set from 1 to 120 in °C scale mode. To disable the notification, set the value of this parameter to 0. The factory default value is 50 in °C scale.

We recommend setting the value of this Parameter lower than value of Parameter 153 (Overheat Protection).This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 120 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_152_0``` and is of type ```INTEGER```.


### Parameter 153: Overheat Protection & Notification

Overheat Protection & Notification
You can define the maximum limit of temperature, reaching which the device will automatically switch Off the load and send “Overheat Detected” notification to the gateway. The value of this parameter can be set from 1 to 120 in °C scale mode or from 34 to 248 in °F scale mode. Usethe value 0 if there is a need to disable this function.The factory default value is 60 in °C scale and 140 in °F scale.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 120 may be set.

The manufacturer defined default value is ```60```.

This parameter has the configuration ID ```config_153_2``` and is of type ```INTEGER```.


### Parameter 154: Over-Current Notification

Enable/disable over-current notification
The maximum load for the device is 16A. If the connected load current exceeds16A the device will automatically switch Off the output and send the “Over-Current Detected” notification to the gateway. To disable sending the notification, set the value of this Parameter to 0. The factory default value is 1 (the notification is enabled).This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```1``` (Enabled).

This parameter has the configuration ID ```config_154_1``` and is of type ```INTEGER```.


### Parameter 155: Over-Load Protection & Notification

Over-Load Protection & Notification
You can define the maximum power in Watt for connected load. The device will automatically switchoff the output and send “Over-Load Detected” notification to the gateway if power consumed by the connected load exceeds this limit. The value of this parameter can be set from 100 to4000 in watts. Use the value 0 if there is a need to disable this function.The factory default value is 3500W.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |

The manufacturer defined default value is ```3500```.

This parameter has the configuration ID ```config_155_2``` and is of type ```INTEGER```.


### Parameter 156: Over-Voltage Protection & Notification

Over-Voltage Protection & Notification
The device constantly monitors the voltage of your electricity network. You can define the maximum voltage of network exceeding which the device will automatically switch off the output and send “Over-Voltage Detected” notification to the gateway. The value of this parameter can be set from 120 to 280 in volts. Use the value 0 if there is a needto disable this function.The factory default value is 240V.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |

The manufacturer defined default value is ```240```.

This parameter has the configuration ID ```config_156_2``` and is of type ```INTEGER```.


### Parameter 157: Voltage Drop Protection & Notification

Voltage Drop Protection & Notification
You can define the minimum voltage of your electricity network. If the voltage of the network drops determined level the device will automatically switch off the output and send “Voltage Drop Detected” notification to the gateway. The value of this parameter can be set from 80 to 240 in volts. Use the value 0 if there is a need to disable this function.The factory default value is 200V.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |

The manufacturer defined default value is ```200```.

This parameter has the configuration ID ```config_157_2``` and is of type ```INTEGER```.


### Parameter 158: Spark Protection

Spark Protection
If connected load fails it can create sparks that may cause a fire. The device constantly monitors the power consumption of connected load and can detect even a small surge in consumption and automatically switch off the output and send “Surge Detected” notification to the gateway. Set the value 1 to enable this function or the value 0 to disable. The factory default value is 1 (the protection is enabled).This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```1``` (Enabled).

This parameter has the configuration ID ```config_158_1``` and is of type ```INTEGER```.


### Parameter 159: Load On Notification

Load On Notification
Use this parameter if you want to get a “Power reconnected” notification every time the relay turns on. If you want to enable the notification set the parameter value to 1. The factory default value is 0 (Notification is disabled).This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```0``` (Disabled).

This parameter has the configuration ID ```config_159_1``` and is of type ```INTEGER```.


### Parameter 160: Load Off Notification

Load Off Notification
Use this parameter if you want to get a “AC mains disconnected” notification every time the relay turns off. If you want to enable the notification set the parameter value to 1. The factory default value is 0 (Notification is disabled).This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```0``` (Disabled).

This parameter has the configuration ID ```config_160_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The HE-HLS01 supports 4 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Used to connect Z-Wave gateway


Association group 1 supports 1 node.

### Group 2: Relay Basic Set

Sends relay state (On/Off)
Group 2 –“Relay Basic Set”:is assigned to the HE-HLS01 relay state. It sends a Basic Set command with value 255 (On) when relay goes to On state and sends 0 (Off) when relay goes to Off state. The group supports five Nodes.

Association group 2 supports 5 nodes.

### Group 3: S1 Basic Set

Sends external input state (On/Off)
Group 3 –“S1 Basic Set”:is assigned to the HE-HLS01 external input state. It sends a Basic Set command with value 255 (On) when external input is shorted and sends 0 (Off) when input is open. The group supports five Nodes.

Association group 3 supports 5 nodes.

### Group 4: Temperature Sensor

Sends external temperature values
Group 4 –“Temperature Sensor”:is assigned to the HE-HLS01 external temperature sensor and sends the sensor value when it changes. The group supports five nodes.

Association group 4 supports 5 nodes.

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
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
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

### Documentation Links

* [Manual](https://opensmarthouse.org/zwavedatabase/1374/reference/Manual_Full_English_HE-HLS01_v1.0.0pdf.pdf)
* [Manual FW 1.5](https://opensmarthouse.org/zwavedatabase/1374/reference/Manual_Full_English_HE-HLS01_v1.1.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1374).
