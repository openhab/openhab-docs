---
layout: documentation
title: ZMNHLD - ZWave
---

{% include base.html %}

# ZMNHLD Flush PWM Thermostat
This describes the Z-Wave device *ZMNHLD*, manufactured by *[Goap](http://www.qubino.com/)* with the thing type UID of ```qubino_zmnhld_00_000```.

The device is in the category of *HVAC*, defining Air condition devices, Fans.

![ZMNHLD product image](https://www.cd-jackson.com/zwave_device_uploads/498/498_default.png)


The ZMNHLD supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

This Z-Wave module is used to regulate temperature. Regulation is done using full wave PWM technology. The module can be controlled either through Z-wave network or through the wall switch. The module is designed to be mounted inside a “flush mounting box” and is hidden behind a traditional wall switch. Module measures power consumption of connected device. It is designed to act as repeater in order to improve range and stability of Z-wave network.

### Inclusion Information

WARNING: Service button S **must NOT be used** when module is connected to 110-230V power supply.

  * Connect module to power supply (with temperature sensor connected - if purchased),
  * Enable add/remove mode on main controller
  * Auto-inclusion (works for about 5 seconds after connected to power supply) or
  * **110V-230V power supply: **Press push button I1 three times within 3 seconds (3 times change switch state within 3 seconds)
  * **24V SELV: **Press service button **S** for more than 2 seconds.

**NOTE1:** For auto-inclusion procedure, first set main controller into inclusion mode and then connect module to power supply.

**NOTE2:** When connecting temperature sensor to module that has already been included, you have to exclude module first. Switch off power supply,connect the sensor and re-include the module.

### Exclusion Information

WARNING: Service button S **must NOT be used** when module is connected to 110-230V power supply.

  * Connect module to power supply
  * Bring module within maximum 1 meter (3 feet) of the main controller
  * Enable add/remove mode on main controller
  * **110V-230V power supply:** Press push button **I1** five times within 3 seconds (5 times change switch state within 3 seconds) in the first 60 seconds after the module is connected to the power supply
  * **24V SELV:** Press ervice button **S** for more than 6 seconds.

By this function all parameters of the module are set to default values and own ID is deleted. If push button I1 is pressed three times within 3 seconds (or service button S is pressed more than 2 and less than 6 seconds) module is excluded, but configuration parameters are not set to default values.

NOTE: If the module is included with parameters 100 or 101 with values different to default and module reset is done, wait at least 30s before next inclusion.

## Channels

The following table summarises the channels available for the ZMNHLD -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Thermostat mode | thermostat_mode | thermostat_mode | Temperature | Number | 
| Thermostat setpoint | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Temperature Sensor | sensor_temperature1 | sensor_temperature | Temperature | Number:Temperature | 
| Thermostat mode | thermostat_mode1 | thermostat_mode | Temperature | Number | 

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

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

### Thermostat setpoint
Sets the thermostat setpoint.

The ```thermostat_setpoint``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

### Temperature Sensor
Indicates the current temperature.

The ```sensor_temperature1``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

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



## Device Configuration

The following table provides a summary of the 42 configuration parameters available in the ZMNHLD.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Input I1 switch type | Input I1 switch type |
| 2 | Input I2 switch type | Input I2 switch type |
| 3 | Input I3 switch type | Input I3 switch type |
| 4 | Input 1 contact type | Input 1 contact type |
| 5 | Input 2 contact type | Input 2 contact type |
| 6 | Input 3 contact type | Input 3 contact type |
| 10 | Activate / deactivate ALL ON/ALL OFF | Activate / deactivate ALL ON/ALL OFF |
| 11 | I1 Functionality selection | I1 Functionality selection |
| 12 | I2 Functionality selection | I2 Functionality selection |
| 13 | I3 Functionality selection | I3 Functionality selection |
| 40 | Power reporting in Watts on power change | Power reporting in Watts on power change |
| 42 | Power reporting in Watts by time interval | Power reporting in Watts by time interval |
| 45 | Antifreeze | Antifreeze |
| 50 | PWM maximum value | PWM maximum value |
| 51 | PWM minimum value | PWM minimum value |
| 52 | PWM cycle duration | PWM cycle duration |
| 53 | PID value inside deadband | PID value inside deadband |
| 54 | PID deadband | PID deadband |
| 55 | Integral sampling time | Integral sampling time |
| 56 | P parameter | P parameter |
| 57 | I parameter | I parameter |
| 58 | D parameter | D parameter |
| 59 | Thermostat mode | Thermostat mode |
| 60 | Too low temperature limit | Too low temperature limit |
| 61 | Too high temperature limit | Too high temperature limit |
| 63 | Output Switch selection | Output Switch selection |
| 70 | Input I1 status on delay | Input I1 status on delay |
| 71 | Input I1 status off delay | Input I1 status off delay |
| 72 | Input I2 status on delay | Input I2 status on delay |
| 73 | Input I2 status off delay | Input I2 status off delay |
| 74 | Input 3 status ON delay | Input 3 status ON delay |
| 75 | Input I3 status off delay | Input I3 status off delay |
| 76 | Reporting on time interval | Reporting on time interval |
| 77 | Group 10 - delay before sending Basic Set ON | Group 10 - delay before sending Basic Set ON |
| 78 | Scale Selection | Scale Selection |
| 100 | Enable/Disable I1 or select Type and Event | Enable/Disable I1 or select Type and Event |
| 101 | Enable/Disable Endpoint I2 or select type | Enable/Disable Endpoint I2 or select type |
| 102 | Enable/Disable Endpoint I3 or select type | Enable/Disable Endpoint I3 or select type |
| 110 | Temperature sensor offset settings | Temperature sensor offset settings |
| 120 | Digital temperature sensor reporting | Digital temperature sensor reporting |
| 121 | Digital temperature sensor / setpoint selector | Digital temperature sensor / setpoint selector |
| 122 | Node Id of external battery powered sensor | Node Id of external battery powered sensor |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 1: Input I1 switch type

Input I1 switch type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | mono-stable switch type |
| 1 | bi-stable switch type |

The manufacturer defined default value is ```1``` (bi-stable switch type).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Input I2 switch type

Input I2 switch type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | mono-stable switch type |
| 1 | bi-stable switch type |

The manufacturer defined default value is ```1``` (bi-stable switch type).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Input I3 switch type

Input I3 switch type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | mono-stable switch type (push button) |
| 1 | bi-stable switch type |

The manufacturer defined default value is ```1``` (bi-stable switch type).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Input 1 contact type

Input 1 contact type
This parameter determines how the sensor is connected (for example: door/window sensor) Set this parameter according to the type of sensor you use. This parameter has influence only when parameter no. 11 is set to the value “2”. After setting this parameter, switch the window sensor once, so that the device can determine the input state.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | normally open |
| 1 | normally closed |

The manufacturer defined default value is ```0``` (normally open).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Input 2 contact type

Input 2 contact type
This parameter determines how the sensor is connected (for example: door/window sensor). Set this parameter according to the type of sensor you use. 

This parameter has influence only when parameter no. 12 is set to value "2000"  
After setting the parameter switch the sensor once, so tha the module could determine the input state
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | normally open |
| 1 | normally closed |

The manufacturer defined default value is ```0``` (normally open).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Input 3 contact type

Input 3 contact type
Available config. parameters (data type is 1 Byte DEC):  
 default value 0  
 0 - NO (normally open) input type  
 1 - NC (normally close) input type  
NOTE: This parameter has influence only when parameter no. 13 is set to the value “2”. After setting this parameter, switch the flood sensor once, so that the module could determine the input state.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | normally open |
| 1 | normally closed |

The manufacturer defined default value is ```0``` (normally open).

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 10: Activate / deactivate ALL ON/ALL OFF

Activate / deactivate ALL ON/ALL OFF
Flush Heat & Cool Thermostat device responds to commands ALL ON / ALL OFF that may be sent by the primary or secondary gateway (hub) within the Z-Wave network.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | ALL ON is not active / ALL OFF is not active |
| 1 | ALL ON is not active / ALL OFF is active |
| 2 | ALL ON is active / ALL OFF is not active |
| 255 | ALL ON is active / ALL OFF is active |

The manufacturer defined default value is ```255``` (ALL ON is active / ALL OFF is active).

This parameter has the configuration ID ```config_10_2``` and is of type ```INTEGER```.


### Parameter 11: I1 Functionality selection

I1 Functionality selection
If "Window Sensor" selected (value set to "2"), parameter 100 (enable/disable endpoint) must be set to non-zero value and module re-included!
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Input I1 changes between Off and Heat/Cool |
| 2 | Input I1 influences the heating/cooling valves |
| 32767 | No influence on the Heat/Cool process |

The manufacturer defined default value is ```1``` (Input I1 changes between Off and Heat/Cool ).

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


### Parameter 12: I2 Functionality selection

I2 Functionality selection
0-990 - Temperature setpoint from 0,0 to 99,0 °C  
1001-1150 - Temperature setpoint -0.1 to -15°C  
2000 - Input I2 influences on the cooling value according to the status of condense sensor.  
32767 - input I2 does not influence on the Heat/Cool process  If "Condense Sensor" selected (value set to "2000"), parameter 101 (enable/disable endpoint) must be set to non-zero value and device re-included!
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 2000 | Input I2 influences the cooling value |
| 32767 | Input I2 doesnt influence on the Heat/Cool process |

The manufacturer defined default value is ```32767``` (Input I2 doesnt influence on the Heat/Cool process).

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 13: I3 Functionality selection

I3 Functionality selection
default value 32767  
32767 - input I3 does not influence on the heat/cool process  
1 - input I3 changes the mode of the thermostat between Heat and Cool and override parameter 59. In this case function on flood sensor is disabled NOTE: After parameter change, first exclude module (without setting parameters to default value) and then re include the module!  
2 - input I3 influences on heating/cooling valves according to status of flood sensor. In this case function of Heat/Cool selection by I3 is disabled  
NOTE1: If this parameter is changed, it is necessary to reinclude the module.  
NOTE2: If "Flood Sensor" selected (value set to "2"), parameter 102 (enable/disable endpoint) must be set to non zero value and module re-included!
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | input I3 changes the mode of the thermostat |
| 2 | input I3 influences on heating/cooling valves |
| 32767 | Does not influence on the heat/cool process |

The manufacturer defined default value is ```32767``` (Does not influence on the heat/cool process).

This parameter has the configuration ID ```config_13_2``` and is of type ```INTEGER```.


### Parameter 40: Power reporting in Watts on power change

Power reporting in Watts on power change
Choose by how much power consumption needs to increase or decrease to be reported. Values correspond to percentages so if 10 is set, for example, the device will report any power consumption changes of 10% or more compared to the last reading. Power consumption needs to increase or decrease by at least 1 Watt to be reported, REGARDLESS of percentage set in this parameter.  
0 - Power consumption reporting disabled  
1 - 100 = 1% - 100% Power consumption reporting enabled. New value is reported only when Wattage in real time changes by more than the percentage value set in this parameter compared to the previous Wattage reading, starting at 1% (the lowest value possible).
The following option values may be configured, in addition to values in the range 0 to 100 -:

| Value  | Description |
|--------|-------------|
| 0 | Power consumption reporting disabled |

The manufacturer defined default value is ```0``` (Power consumption reporting disabled).

This parameter has the configuration ID ```config_40_1``` and is of type ```INTEGER```.


### Parameter 42: Power reporting in Watts by time interval

Power reporting in Watts by time interval
Set value refers to the time interval with which power consumption in Watts is reported (0 – 32767 seconds). If for example 300 is entered, energy consumption reports will be sent to the gateway (hub) every 300 seconds (or 5 minutes).  


0 - report disabled  
1-32767 = 1 second - 32767 seconds interval. Reporting enabled with time interval
Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_42_2``` and is of type ```INTEGER```.


### Parameter 45: Antifreeze

Antifreeze
Set value means at which temperature the device will be turned on even if the thermostat was manually set to off. Available config. parameters (data type is 2 Byte DEC):  
 default value 50 (5,0 °C)  
 0 - 127 = 0,0°C … 12,7 °C  
 1001 - 1127 = -0,1°C … - 12,6 °C  
 255 - Antifreeze functionality disabled  
NOTE: Antifreeze is activated only in heating mode.
Values in the range 0 to 1127 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_45_2``` and is of type ```INTEGER```.


### Parameter 50: PWM maximum value

PWM maximum value
2..100 = 2..100% Maximum PWM is set by entered value
Values in the range 2 to 100 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_50_1``` and is of type ```INTEGER```.


### Parameter 51: PWM minimum value

PWM minimum value
0..99 = 0..99% Minimum PWM is set by entered value
Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_51_1``` and is of type ```INTEGER```.


### Parameter 52: PWM cycle duration

PWM cycle duration
5..127 = 5-125 seconds. PWM cycle duration is set by entered value
Values in the range 5 to 127 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_52_1``` and is of type ```INTEGER```.


### Parameter 53: PID value inside deadband

PID value inside deadband
0 - PID value equals PWM minimum cycle  
1 - PID value set to LAST VALUE
Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_53_1``` and is of type ```INTEGER```.


### Parameter 54: PID deadband

PID deadband
0..127 = 0..12.7 °C  
This parameter defines the zone where PID is not active.
Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_54_1``` and is of type ```INTEGER```.


### Parameter 55: Integral sampling time

Integral sampling time
0..127 = 0..127 seconds.  
Parameter defines the time between samples.
Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_55_1``` and is of type ```INTEGER```.


### Parameter 56: P parameter

P parameter

Values in the range 0 to 1000 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_56_2``` and is of type ```INTEGER```.


### Parameter 57: I parameter

I parameter

Values in the range 0 to 1000 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_57_2``` and is of type ```INTEGER```.


### Parameter 58: D parameter

D parameter

Values in the range 0 to 1000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_58_2``` and is of type ```INTEGER```.


### Parameter 59: Thermostat mode

Thermostat mode
Available config. parameters (data type is 1 Byte DEC):  
 default value 0  
 0 - Heat mode  
 1 - Cool mode  
If parameter changed it is necessary to re-include module.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Heat mode |
| 1 | Cool mode |

The manufacturer defined default value is ```0``` (Heat mode).

This parameter has the configuration ID ```config_59_1``` and is of type ```INTEGER```.


### Parameter 60: Too low temperature limit

Too low temperature limit
This parameter determines the temperature at which the device sends a command to the associated device - to turn ON device or to turn OFF device.  
Too low temperature limit is used with Association Group 4.  
• Default value 50 (Too low temperature limit is 5.0 °C)  
• 1 - 1000 = 0.1 °C to 100.0 °C, step is 0.1 °C.  
• 1001 - 1150: - 0.1 °C to – 15.0 °C
Values in the range 1 to 1150 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_60_2``` and is of type ```INTEGER```.


### Parameter 61: Too high temperature limit

Too high temperature limit
This parameter determines the temperature at which the device sends a command to the associated device, to turn ON device or to turn OFF device.  
• default value 700 (too high temperature limit is 70.0 °C)  
• 1 - 1000 = 0.1 °C - 100.0 °C, step is 0.1 °C. Too high temperature limit is used with Association Group 4.
Values in the range 1 to 1000 may be set.

The manufacturer defined default value is ```700```.

This parameter has the configuration ID ```config_61_2``` and is of type ```INTEGER```.


### Parameter 63: Output Switch selection

Output Switch selection
Set value means the type of the device that is connected to the PWM output. The device type can be normally open (NO) or normally close (NC).  
Available config. parameters (data type is 1 Byte DEC):  
 default value 0  
 0 - When system is turned off the output is 0 V.  
 1 - When system is turned off the output is 230 V.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | When system is turned off the output is 0V(NC). |
| 1 | System OFF the output is 230V or 24V(NO). |

The manufacturer defined default value is ```0``` (When system is turned off the output is 0V(NC).).

This parameter has the configuration ID ```config_63_1``` and is of type ```INTEGER```.


### Parameter 70: Input I1 status on delay

Input I1 status on delay
This parameter specifies the delay before the device executes command, after input I1 is activated. For example, if you set the parameter to 30 seconds and close the window, heater will turn ON after 30 seconds.  
If the value of parameter is different to 0, means that the Influence of this input to heating or cooling will react after inserted time. This parameter has influence only when the window sensor functionality is selected by the parameter no. 11.  
Device status on UI change immediately, but the command will be sent after time set.
Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_70_2``` and is of type ```INTEGER```.


### Parameter 71: Input I1 status off delay

Input I1 status off delay
This parameter specifies the delay before the device executes command after input I1 is deactivated. For example, if you set the parameter to 30 seconds and close the window, heater will turn OFF after 30 seconds.  
If the value of parameter is different to 0, means that the Influence of this input to heating or cooling will react after inserted time. This parameter has influence only when the window sensor functionality is selected by the parameter no. 11.Device status on UI change immediately but the command will be send after the set time.
Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_71_2``` and is of type ```INTEGER```.


### Parameter 72: Input I2 status on delay

Input I2 status on delay
This parameter specifies the delay before the device execute command after input I2 is activated.  
This parameter has influence only when the condense sensor functionality is selected by the parameter no. 12.
Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_72_2``` and is of type ```INTEGER```.


### Parameter 73: Input I2 status off delay

Input I2 status off delay
This parameter specifies the delay before the device execute command after input I2 is deactivated.  
This parameter has influence only when the condense sensor functionality is selected by the parameter no. 12.
Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_73_2``` and is of type ```INTEGER```.


### Parameter 74: Input 3 status ON delay

Input 3 status ON delay
This parameter specifies the delay before the device execute command after input I3 is activated.  
This parameter has influence only when the flood sensor functionality is selected by the parameter no. 13.
Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_74_2``` and is of type ```INTEGER```.


### Parameter 75: Input I3 status off delay

Input I3 status off delay
If the value of the parameter is different to 0 means that the influence of this input to heating or cooling will react after inserted time.
Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_75_2``` and is of type ```INTEGER```.


### Parameter 76: Reporting on time interval

Reporting on time interval
Association group 2, 10 - reporting on time interval

Determinates the time interval of sending device status ON/OFF to the associated device.  
If the Association groups 2 or 10 are set, the device is reporting its state (Basic Set ON/ OFF) on change and on time interval (if this parameter is set).  
• Default value 30 = 30 minutes  
• 0 = Reporting disabled  
• 1-127 = 1 minute – 127 minutes, reporting enabled
Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_76_1``` and is of type ```INTEGER```.


### Parameter 77: Group 10 - delay before sending Basic Set ON

Group 10 - delay before sending Basic Set ON
Association group 10 - delay before sending Basic Set ON

Set a time delay before sent Basic set ON to the associated device. The same time frame also applies for the Basic set OFF.  
If this parameter is set, Basic Set ON/OFF Report is delayed for the time defined in this parameter.  
• Default value 180 = 3 minutes  
• 0 = Reports with no delay  
• 1-32767 = 1 second– 32767 seconds, reporting enabled
Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```180```.

This parameter has the configuration ID ```config_77_2``` and is of type ```INTEGER```.


### Parameter 78: Scale Selection

Scale Selection
This parameter determines in which measurement unit the device will report temperature - Fahrenheit or Celsius.  
This scale has influence on Temperature reporting and scale reporting. The device is capable of receiving a Set point in all supported scales
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | degrees Celsius |
| 1 | degrees Fahrenheit |

The manufacturer defined default value is ```0``` (degrees Celsius).

This parameter has the configuration ID ```config_78_1``` and is of type ```INTEGER```.


### Parameter 100: Enable/Disable I1 or select Type and Event

Enable/Disable I1 or select Type and Event
Choose whether the Endpoint I1 is disabled (and not shown on the UI) or enabled (and displayed on the UI). By enabling this endpoint (setting it to be either a notification sensor or a binary sensor), the user also selects a Notification Type and a Notification Event for which notification reports will be sent (in case the endpoint is configured as a notification sensor).  
After changing the values of the parameter, first exclude the device (without setting the parameters to their default values), then wait at least 30s and then re-include the device!  
When the parameter is set to the value 9 the notifications are sent for the Home Security notification type.  
If "endpoint enabled" (value is set to 1-9), parameter 11 must be set to "2" as "Window Sensor" to determine how device input I1 will operate
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Home security, motion detection |
| 2 | CO - Carbon monoxid detected |
| 3 | CO2 - Carbon dioxid detected |
| 4 | Water alarm |
| 5 | Heat alarm |
| 6 | Smoke alarm |
| 9 | Sensor binary |

The manufacturer defined default value is ```0``` (disabled).

This parameter has the configuration ID ```config_100_1``` and is of type ```INTEGER```.


### Parameter 101: Enable/Disable Endpoint I2 or select type

Enable/Disable Endpoint I2 or select type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Home security, motion detection |
| 2 | CO - Carbon monoxid detected |
| 3 | CO2 - Carbon dioxid detected |
| 4 | Water alarm |
| 5 | Heat alarm |
| 6 | Smoke alarm |
| 9 | Sensor binary |

The manufacturer defined default value is ```0``` (disabled).

This parameter has the configuration ID ```config_101_1``` and is of type ```INTEGER```.


### Parameter 102: Enable/Disable Endpoint I3 or select type

Enable/Disable Endpoint I3 or select type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Home security, motion detection |
| 2 | CO - Carbon monoxid detected |
| 3 | CO2 - Carbon dioxid detected |
| 4 | Water alarm |
| 5 | Heat alarm |
| 6 | Smoke alarm |
| 9 | Sensor binary |

The manufacturer defined default value is ```0``` (disabled).

This parameter has the configuration ID ```config_102_1``` and is of type ```INTEGER```.


### Parameter 110: Temperature sensor offset settings

Temperature sensor offset settings
32536 = offset is 0.0°C  
1..100 = offset is 0.1..10.0°C added to actual measuring value  
1001..1100 = offset is -0.1..-10.0°C subtracted to actual measuring value
Values in the range 0 to 32536 may be set.

The manufacturer defined default value is ```32536```.

This parameter has the configuration ID ```config_110_2``` and is of type ```INTEGER```.


### Parameter 120: Digital temperature sensor reporting

Digital temperature sensor reporting
If digital teperature sensor is connected, module reports measured temperature on temperture change defined by this parameter
Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_120_1``` and is of type ```INTEGER```.


### Parameter 121: Digital temperature sensor / setpoint selector

Digital temperature sensor / setpoint selector

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | internal sensor is mounted |
| 1 | temperature is grabbed by sensor with assoc 3 |
| 2 | temperature is grabbed from ext battery sensor |
| 4 | setpoint is grabbed by sensor with assoc 5 |
| 8 | setpoint is grabbed from ext battery sensor |
| 10 | temperature & setpoint from ext batt sensor |

The manufacturer defined default value is ```0``` (internal sensor is mounted).

This parameter has the configuration ID ```config_121_1``` and is of type ```INTEGER```.


### Parameter 122: Node Id of external battery powered sensor

Node Id of external battery powered sensor
0 - disabled

1..254 = NodeId of external battery powered room sensor
Values in the range 0 to 254 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_122_1``` and is of type ```INTEGER```.

### Switch All Mode

Set the mode for the switch when receiving SWITCH ALL commands.

The following option values may be configured -:
| Value  | Description |
|--------|-------------|
| 0 | Exclude from All On and All Off groups |
| 1 | Include in All On group |
| 2 | Include in All Off group |
| 255 | Include in All On and All Off groups |

This parameter has the configuration ID ```switchall_mode``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZMNHLD supports 9 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
reserved for communication with the main controller

Association group 1 supports 1 node.

### Group 2: basic on/off (output)

Triggered at change of the output

Association group 2 supports 16 nodes.

### Group 3: Sensor_multilevel_get


Association group 3 supports 16 nodes.

### Group 4: basic on/off (temp limit)

triggered by Too high temperature limit

Association group 4 supports 16 nodes.

### Group 5: Thermostat setpoint get


Association group 5 supports 16 nodes.

### Group 6: basic on/off (window)

triggered by change of I1

Association group 6 supports 16 nodes.

### Group 7: basic on/off (condense sensor)

triggered by change of I2

Association group 7 supports 16 nodes.

### Group 8: basic on/off (flood sensor)

triggered by change of I3

Association group 8 supports 16 nodes.

### Group 9: sensor multilevel report

Triggered at change of temperature

Association group 9 supports 16 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V7| |
| COMMAND_CLASS_METER_V4| |
| COMMAND_CLASS_THERMOSTAT_MODE_V2| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V2| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V2| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V2| |
| COMMAND_CLASS_CONFIGURATION_V2| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V2| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MARK_V1| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V7| |
| COMMAND_CLASS_METER_V4| |
| COMMAND_CLASS_THERMOSTAT_MODE_V2| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V2| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SENSOR_BINARY_V1| |
| COMMAND_CLASS_METER_V4| |
| COMMAND_CLASS_THERMOSTAT_MODE_V1| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V2| |
#### Endpoint 3

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SENSOR_BINARY_V1| |
#### Endpoint 4

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SENSOR_BINARY_V1| |
#### Endpoint 5

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SENSOR_MULTILEVEL_V7| |

### Documentation Links

* [Page 1](https://www.cd-jackson.com/zwave_device_uploads/498/qubino-zmnhld-0001.pdf)
* [Page 2](https://www.cd-jackson.com/zwave_device_uploads/498/qubino-zmnhld-0002.pdf)
* [ZMNHKD Quick Manual](https://www.cd-jackson.com/zwave_device_uploads/498/Qubino-Flush-Heat-Cool-Thermostat-PLUS-user-manual-V1-5-eng.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/498).
