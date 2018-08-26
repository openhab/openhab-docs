---
layout: documentation
title: ZMNHKD - ZWave
---

{% include base.html %}

# ZMNHKD Flush Heat & Cool Thermostat
This describes the Z-Wave device *ZMNHKD*, manufactured by *[Goap](http://www.qubino.com/)* with the thing type UID of ```qubino_zmnhkd_00_000```.

The device is in the category of *HVAC*, defining Air condition devices, Fans.

![ZMNHKD product image](https://www.cd-jackson.com/zwave_device_uploads/829/829_default.jpg)


The ZMNHKD supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

This Z-Wave module is used to regulate temperature in heating and cooling mode. Module can be controlled either through Z-Wave network or through the wall switch. The module is designed to be mounted inside a “flush mounting box” and is hidden behind a traditional wall switch. Module measures power consumption of connected device. It is designed to act as repeater in order to improve range and stability of Z-wave network.

### Inclusion Information

WARNING: Service button S **must NOT be used** when module is connected to 110-230V power supply.

- Connect module to power supply (with temperature sensor connected - if purchased),
- Enable add/remove mode on main controller
- Auto-inclusion (works for about 5 seconds after connected to power supply) or
- **110V-230V power supply:** Press push button I1 three times within 3 seconds (3 times change switch state within 3 seconds)
- **24V SELV:** Press service button **S** for more than 2 seconds.

**NOTE1:** For auto-inclusion procedure, first set main controller into inclusion mode and then connect module to power supply.

**NOTE2:** When connecting temperature sensor to module that has already been included, you have to exclude module first. Switch off power supply,connect the sensor and re-include the module.

### Exclusion Information

WARNING: Service button S **must NOT be used** when module is connected to 110-230V power supply.

- Connect module to power supply
- Bring module within maximum 1 meter (3 feet) of the main controller
- Enable add/remove mode on main controller
- **110V-230V power supply:** Press push button **I1** five times within 3 seconds (5 times change switch state within 3 seconds) in the first 60 seconds after the module is connected to the power supply
- **24V SELV:** Press ervice button **S** for more than 6 seconds.

By this function all parameters of the module are set to default values and own ID is deleted. If push button I1 is pressed three times within 3 seconds (or service button S is pressed more than 2 and less than 6 seconds) module is excluded, but configuration parameters are not set to default values.

NOTE: If the module is included with parameters 100 or 101 with values different to default and module reset is done, wait at least 30s before next inclusion.

## Channels

The following table summarises the channels available for the ZMNHKD -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | Temperature | Number | 
| Electric meter (watts) | meter_watts | Energy | Number | 
| Electric meter (kWh) | meter_kwh | Energy | Number | 
| Thermostat mode | thermostat_mode | Temperature | Number | 
| Setpoint (heating) | thermostat_setpoint | Temperature | Number | 
| Setpoint (cooling) | thermostat_setpoint | Temperature | Number | 

### Sensor (temperature)

Indicates the current temperature.

The ```sensor_temperature``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)

Indicates the instantaneous power consumption.

The ```meter_watts``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)

Indicates the energy consumption (kWh).

The ```meter_kwh``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

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

### Setpoint (cooling)

Sets the thermostate setpoint.

The ```thermostat_setpoint``` channel supports the ```Number``` item and is in the ```Temperature``` category.



## Device Configuration

The following table provides a summary of the 31 configuration parameters available in the ZMNHKD.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Input I1 switch type | Input I1 switch type |
| 2 | Input I2 switch type | Input I2 switch type |
| 4 | Input 1 contact type | Input 1 contact type |
| 5 | Input 2 contact type | Input 2 contact type |
| 10 | Activate / deactivate ALL ON/ALL OFF | Activate / deactivate ALL ON/ALL OFF |
| 11 | I1 Functionality selection | I1 Functionality selection |
| 12 | I2 Functionality selection | I2 Functionality selection |
| 40 | Watt Power Consumption Reporting Threshold for Q⬆ Load | Watt Power Consumption Reporting Threshold for Q⬆ Load |
| 42 | Watt Power Consumption Reporting Time Threshold for Q⬆ | Watt Power Consumption Reporting Time Threshold for Q⬆ |
| 43 | Hysteresis heating On | Hysteresis heating On |
| 44 | Hysteresis Heating Off | Hysteresis Heating Off |
| 45 | Hysteresis Cooling On | Hysteresis Cooling On |
| 46 | Hysteresis Cooling Off | Hysteresis Cooling Off |
| 47 | Antifreeze | Antifreeze |
| 60 | Too low temperature limit | Too low temperature limit |
| 61 | Too high temperature limit | Too high temperature limit |
| 64 | Output Switch selection Q1 | Output Switch selection Q1 |
| 65 | Output Switch selection Q2 | Output Switch selection Q2 |
| 70 | Input I1 status on delay | Input I1 status on delay |
| 71 | Input I1 status off delay | Input I1 status off delay |
| 72 | Input I2 status on delay | Input I2 status on delay |
| 73 | Input I2 status off delay | Input I2 status off delay |
| 76 | Association group 2, 10 - reporting on time interval | Association group 2, 10 - reporting on time interval |
| 77 | Association group 10 - delay before sending Basic Set ON | Association group 10 - delay before sending Basic Set ON |
| 78 | Scale Selection | Scale Selection |
| 100 | Enable/Disable Endpoint I1 or select the Type and Event | Enable/Disable Endpoint I1 or select the Notification Type and Event |
| 101 | Enable/Disable Endpoint I2 or select type | Enable/Disable Endpoint I2 or select type |
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
| 1 | Input I1 changes the mode between Off and Heat/Cool |
| 2 | Input I1 influences the heating/cooling valves |
| 32767 | Input I1 doesnt influence on the Heat/Cool process |

The manufacturer defined default value is ```1``` (Input I1 changes the mode between Off and Heat/Cool ).

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


### Parameter 12: I2 Functionality selection

I2 Functionality selection
0-990 - Temperature setpoint from 0,0 to 99,0 °C  
1001-1150 - Temperature setpoint -0.1 to -15°C  
2000 - Input I2 influences on the cooling value according to the status of condense sensor.   
32767 - input I2 does not influence on the Heat/Cool process

 If "Condense Sensor" selected (value set to "2000"), parameter 101 (enable/disable endpoint) must be set to non-zero value and device re-included!
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 2000 | Input I2 influences the cooling value with condense sensor |
| 32767 | Input I2 doesnt influence on the Heat/Cool process |

The manufacturer defined default value is ```32767``` (Input I2 doesnt influence on the Heat/Cool process).

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 40: Watt Power Consumption Reporting Threshold for Q⬆ Load

Watt Power Consumption Reporting Threshold for Q⬆ Load
Choose by how much power consumption needs to increase or decrease to be reported. Values correspond to percentages so if 10 is set, for example, the device will report any power consumption changes of 10% or more compared to the last reading. Power consumption needs to increase or decrease by at least 1 Watt to be reported, REGARDLESS of percentage set in this parameter.   
 0 - Power consumption reporting disabled  
 1 - 100 = 1% - 100% Power consumption reporting enabled. New value is reported only when Wattage in real time changes by more than the percentage value set in this parameter compared to the previous Wattage reading, starting at 1% (the lowest value possible).
The following option values may be configured, in addition to values in the range 0 to 100 -:

| Value  | Description |
|--------|-------------|
| 0 | Power consumption reporting disabled |

The manufacturer defined default value is ```0``` (Power consumption reporting disabled).

This parameter has the configuration ID ```config_40_1``` and is of type ```INTEGER```.


### Parameter 42: Watt Power Consumption Reporting Time Threshold for Q⬆

Watt Power Consumption Reporting Time Threshold for Q⬆
Set value refers to the time interval with which power consumption in Watts is reported (0 – 32767 seconds). If for example 300 is entered, energy consumption reports will be sent to the gateway (hub) every 300 seconds (or 5 minutes).

0 - report disabled  
1-32767 = 1 second - 32767 seconds interval. Reporting enabled with time interval
Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_42_2``` and is of type ```INTEGER```.


### Parameter 43: Hysteresis heating On

Hysteresis heating On
This parameter defines temperature difference between measured temperature and set-point temperature to turn heating on.   
 default value 1010 (-1.0 °C)   
 0 - 255 = 0,0°C to 25,5 °C   
 1001 - 1255 = - 0,1°C to - 25,5 °C
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | mono-stable switch type |
| 1 | bi-stable switch type |

The manufacturer defined default value is ```1010```.

This parameter has the configuration ID ```config_43_2``` and is of type ```INTEGER```.


### Parameter 44: Hysteresis Heating Off

Hysteresis Heating Off
This parameter defines temperature difference between measured temperature and set-point temperature to turn heating off.  
 • default value 2 (+0.2 °C)  
 • 0 - 255 = 0,0°C to 25,5 °C  
 • 1001 - 1255 = - 0,1°C to - 25,5 °C
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | normally open |
| 1 | normally closed |

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_44_2``` and is of type ```INTEGER```.


### Parameter 45: Hysteresis Cooling On

Hysteresis Cooling On
This parameter defines temperature difference between measured temperature and set-point temperature to turn cooling on.  
 • default value 5 (+0.5 °C)  
 • 0 - 255 = 0,0°C to 25,5 °C  
 • 1001 - 1255 = - 0,1°C to - 25,5 °C
Values in the range 0 to 1255 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_45_2``` and is of type ```INTEGER```.


### Parameter 46: Hysteresis Cooling Off

Hysteresis Cooling Off
This parameter defines temperature difference between measured temperature and set-point temperature to turn cooling off.  
 • default value 1002 (-0.2 °C)  
 • 0 - 255 = 0,0°C to 25,5 °C  
 • 1001 - 1255 = - 0,1°C to - 25,5 °C
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Input I3 changes the mode between Heat and Cool |
| 2 | Input I3 influences the heating/cooling valves |
| 32767 | Input I3 doesnt influence on the Heat/Cool process |

The manufacturer defined default value is ```1002```.

This parameter has the configuration ID ```config_46_2``` and is of type ```INTEGER```.


### Parameter 47: Antifreeze

Antifreeze
Set value means at which temperature the device will be turned on even if the thermostat was manually set to off. Antifreeze is activated only in heating mode. It uses a hysteresis determined in parameters no. 43 and 44.  
 • default value 50 (5,0 °C)  
 • 0 - 127 = 0,0°C to 12,7 °C  
 • 1001 - 1127 = - 0,1°C to - 12,7 °C  
 • 255 - Antifreeze functionality disabled
Values in the range 0 to 1127 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_47_2``` and is of type ```INTEGER```.


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


### Parameter 64: Output Switch selection Q1

Output Switch selection Q1
Set value means the type of the device that is connected to the Q1 output. The device type can be normally open (NO) or normally close (NC).
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | When the device is turned off the output is 0V |
| 1 | When the system is turned off the output is 230V |

The manufacturer defined default value is ```0``` (When the device is turned off the output is 0V).

This parameter has the configuration ID ```config_64_1``` and is of type ```INTEGER```.


### Parameter 65: Output Switch selection Q2

Output Switch selection Q2
Set value means the type of the device that is connected to the Q2 output. The device type can be normally open (NO) or normally close (NC).
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | When system is turned off the output is 0V(NC). |
| 1 | When system is turned off the output is 230V or 24V(NO). |

The manufacturer defined default value is ```0``` (When system is turned off the output is 0V(NC).).

This parameter has the configuration ID ```config_65_1``` and is of type ```INTEGER```.


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


### Parameter 76: Association group 2, 10 - reporting on time interval

Association group 2, 10 - reporting on time interval
Determinates the time interval of sending device status ON/OFF to the associated device.  
 If the Association groups 2 or 10 are set, the device is reporting its state (Basic Set ON/ OFF) on change and on time interval (if this parameter is set).  
 • Default value 30 = 30 minutes  
 • 0 = Reporting disabled  
 • 1-127 = 1 minute – 127 minutes, reporting enabled
Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_76_1``` and is of type ```INTEGER```.


### Parameter 77: Association group 10 - delay before sending Basic Set ON

Association group 10 - delay before sending Basic Set ON
Set a time delay before sent Basic set ON to the associated device. The same time frame also applies for the Basic set OFF.  
 If this parameter is set, Basic Set ON/OFF Report is delayed for the time defined in this parameter.  
 • Default value 180 = 3 minutes  
 • 0 = Reports with no delay  
 • 1-32767 = 1 second– 32767 seconds, reporting enabled
Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```3```.

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


### Parameter 100: Enable/Disable Endpoint I1 or select the Type and Event

Enable/Disable Endpoint I1 or select the Notification Type and Event
Choose whether the Endpoint I1 is disabled (and not shown on the UI) or enabled (and displayed on the UI). By enabling this endpoint (setting it to be either a notification sensor or a binary sensor), the user also selects a Notification Type and a Notification Event for which notification reports will be sent (in case the endpoint is configured as a notification sensor).  
 After changing the values of the parameter, first exclude the device (without setting the parameters to their default values), then wait at least 30s and then re-include the device!  
 When the parameter is set to the value 9 the notifications are sent for the Home Security notification type.  
 If "endpoint enabled" (value is set to 1-9), parameter 11 must be set to "2" as "Window Sensor" to determine how device input I1 will operate
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | disabled |
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
| 0 | disabled |
| 1 | Home security, motion detection |
| 2 | CO - Carbon monoxid detected |
| 3 | CO2 - Carbon dioxid detected |
| 4 | Water alarm |
| 5 | Heat alarm |
| 6 | Smoke alarm |
| 9 | Sensor binary |

The manufacturer defined default value is ```0``` (disabled).

This parameter has the configuration ID ```config_101_1``` and is of type ```INTEGER```.


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
| 10 | temperature an setpoint are grabbed from ext batt sensor |

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

The ZMNHKD supports 9 association groups.

### Group 1: Lifeline

reserved for communication with the main controller
This group supports 1 nodes.

### Group 2: basic on/off (output)

Triggered at change of the output
This group supports 16 nodes.

### Group 3: Sensor_multilevel_get


This group supports 16 nodes.

### Group 4: basic on/off (temp limit)

triggered by Too high temperature limit
This group supports 16 nodes.

### Group 5: Thermostat setpoint get


This group supports 16 nodes.

### Group 6: basic on/off (window)

triggered by change of I1
This group supports 16 nodes.

### Group 7: basic on/off (condense sensor)

triggered by change of I2
This group supports 16 nodes.

### Group 8: basic on/off (flood sensor)

triggered by change of I3
This group supports 16 nodes.

### Group 9: sensor multilevel report

Triggered at change of temperature
This group supports 16 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SWITCH_ALL_V0| |
| COMMAND_CLASS_SENSOR_BINARY_V0| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V7| |
| COMMAND_CLASS_METER_V4| |
| COMMAND_CLASS_THERMOSTAT_MODE_V2| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V2| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V2| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V0| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_V4| |
| COMMAND_CLASS_CONFIGURATION_V2| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V2| |
| COMMAND_CLASS_POWERLEVEL_V0| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_MARK_V0| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V2| |
| COMMAND_CLASS_SWITCH_ALL_V0| |
| COMMAND_CLASS_METER_V4| |
| COMMAND_CLASS_THERMOSTAT_MODE_V2| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V2| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V0| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_MARK_V0| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V2| |
| COMMAND_CLASS_SWITCH_ALL_V0| |
| COMMAND_CLASS_METER_V4| |
| COMMAND_CLASS_THERMOSTAT_MODE_V2| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V2| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V0| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_MARK_V0| |
#### Endpoint 3

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V2| |
| COMMAND_CLASS_SENSOR_BINARY_V0| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V0| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_MARK_V0| |
#### Endpoint 5

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V7| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V0| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |

### Documentation Links

* [Quick User Manual](https://www.cd-jackson.com/zwave_device_uploads/829/Qubino-Flush-Heat-Cool-Thermostat-PLUS-user-manual-V1-5-eng.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/829).
