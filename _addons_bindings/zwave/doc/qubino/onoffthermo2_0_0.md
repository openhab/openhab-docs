---
layout: documentation
title: ZMNKID - ZWave
---

{% include base.html %}

# ZMNKID Flush OnOff Thermostat 2
This describes the Z-Wave device *ZMNKID*, manufactured by *[Goap](http://www.qubino.com/)* with the thing type UID of ```qubino_onoffthermo2_00_000```.

The device is in the category of *HVAC*, defining Air condition devices, Fans.

![ZMNKID product image](https://www.cd-jackson.com/zwave_device_uploads/1101/1101_default.png)


The ZMNKID supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The Qubino Flush On/Off Thermostat 2 is ideal for remotely controlling electric or water-based underfloor heating systems, electric water heaters, hot water pumps, electric radiators and similar.

### Inclusion Information

Classic Inclusion

AUTOMATICALLY ADDING THE DEVICE TO A Z-WAVE NETWORK (SMARTSTART INCLUSION)

  1. Scan QR code on device label and add S2 DSK to Provisioning List in gateway (hub)
  2. Connect the device to the power supply (with the temperature sensor already connected).
  3. Inclusion will be initiated automatically within few seconds of connection to the power supply and the device will automatically enrol in your network (when the device is excluded and connected to the power supply it automatically enters the LEARN MODE state).

**NOTE: LEARN MODE state allows the device to receive network information from the controller.**

ⓘ SmartStart inclusion is a part of S2 security level, so if you want to use SmartStart, you need to include it as S2 Authenticated. 

MANUALLY ADDING THE DEVICE TO A Z-WAVE NETWORK (MANUAL INCLUSION)

  1. Enable add/remove mode on your Z-Wave gateway (hub) 
  2. Connect the device to the power supply (with the temperature sensor already connected*) 
  3. Toggle the switch connected to the I1 terminal 3 times within 3 seconds (The device has to get On/Off signal 3 times, meaning 3 times click on the push button or with the normal button 3 times On/Off.) (this procedure puts the device in LEARN MODE) in the first minute after power cycle.

OR

If the device is powered by 24 V SELV supply, press and hold the S (Service) button between 3 and 6 seconds (this procedure puts the device in LEARN MODE)

  1. A new device will appear on your dashboard
  2. Inclusion with the switch connected to I1 terminal is not limited by time

*If connecting the temperature sensor, switch off the power supply.

**NOTE1: LEARN MODE state allows the device to receive network information from the controller.**

### Exclusion Information

Classic Exclusion

REMOVAL FROM A ZWAVE NETWORK (Z-WAVE EXCLUSION)

  1. Connect the device to the power supply
  2. Make sure the device is within direct range of your Z-Wave gateway (hub) or use a hand-held Z-Wave remote to perform exclusion 
  3. Enable add/remove mode on your Z-Wave gateway (hub)
  4. Toggle the switch connected to the I1 terminal 3 times within 3 seconds in the first minute after power cycle (The device has to get On/Off signal 3 times, meaning 3 times click on the push button or with the normal button 3 times On/Off). 

OR

If the device is powered by 24 V SELV supply, press and hold the S (Service) button between 3 and 6 seconds

  1. Exclusion with the switch connected to I1 terminal is not limited by time 
  2. The device will be removed from your network, but any custom configuration parameters will not be erased

**NOTE1: LEARN MODE state allows the device to receive network information from the controller.**

**NOTE2: After device is excluded you should wait 30 seconds before performing re-inclusion.**

## Channels

The following table summarises the channels available for the ZMNKID -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Thermostat mode | thermostat_mode | thermostat_mode | Temperature | Number | 
| Operating State | thermostat_state | thermostat_state | Temperature | Number | 
| Setpoint (heating) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

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

### Alarm (power)
Indicates if a power alarm is triggered.

The ```alarm_power``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 14 configuration parameters available in the ZMNKID.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Input I1 switch type | Input I1 switch type |
| 4 | Input 1 contact type | Input 1 contact type |
| 40 | Power Consumption Reporting Threshold | Power Consumption Reporting Threshold |
| 42 | Power Consumption Reporting(Time) | Power Consumption Reporting(Time) |
| 43 | Hysteresis Upper temperature offset | Hysteresis Upper temperature offset |
| 44 | Hysteresis Lower temperature offset | Hysteresis Lower temperature offset |
| 45 |  Antifreeze | Antifreeze |
| 59 | Thermostat mode | Thermostat mode |
| 60 | Too low temperature limit | Too low temperature limit |
| 61 | Too high temperature limit | Too high temperature limit |
| 63 | Output switch selection | Output switch selection |
| 78 | Scale Selection | Scale Selection |
| 110 | Temperature Sensor Offset Settings | Temperature Sensor Offset Settings |
| 120 | Temperature Sensor Reporting Threshold | Temperature Sensor Reporting Threshold |

### Parameter 1: Input I1 switch type

Input I1 switch type
With this parameter, you can select between push-button (momentary) and on/off toggle switch types.

  
Values:  
• default value 1  
• 0 - push-button (momentary)  
• 1 - on/off toggle switch
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | push-button (momentary) |
| 1 | on/off toggle switch |

The manufacturer defined default value is ```1``` (on/off toggle switch).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 4: Input 1 contact type

Input 1 contact type
This parameter determines how the switch or push-button is connected.

  
Values:  
• default value 0  
• 0 - NO (normally open) input type  
• 1 - NC (normally close) input type
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | NO (normally open) input type |
| 1 | NC (normally close) input type |

The manufacturer defined default value is ```0``` (NO (normally open) input type).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 40: Power Consumption Reporting Threshold

Power Consumption Reporting Threshold
Choose by how much power consumption needs to increase or decrease to be reported. Values correspond to percentages so if 10 is set, for example, the device will report any power consumption changes of 10% or more compared to the last reading.

  
Values:  
• default value 10  
• 0 - Power consumption reporting  
disabled  
• 1 - 100 = 1% - 100% 

Power consumption reporting enabled. New value is reported only when Wattage in real time changes by more than the percentage value set in this parameter compared to the previous Wattage reading, starting at 1% (the lowest value possible).  


**NOTE: Power consumption needs to increase or decrease by at least 1 Watt to be reported, REGARDLESS of percentage set in this parameter.**
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_40_1``` and is of type ```INTEGER```.


### Parameter 42: Power Consumption Reporting(Time)

Power Consumption Reporting(Time)
Set value refers to the time interval with which power consumption in Watts is reported (30 – 32767 seconds) starting from time of last Watts reported. If for example 300 is entered, energy consumption reports will be sent to the gateway (hub) every 300 seconds (or 5 minutes).  


Values:  
• default value 600 (600 seconds = 10 minutes)  
• 0 - Power consumption reporting disabled  
• 30 - 32767 = 30 - 32767 seconds.

Power consumption reporting enabled. Report is sent according to time interval (value) set here. EXAMPLE: If we set value to 30 seconds and the device reports Watts because of percent change of power (parameter 40 - Watt Power Consumption Reporting Threshold) at time = 5 seconds,  
then the device will send next meter report at time = 35 seconds (assuming the device has not sent report within interval 5 to 35 seconds).
Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```600```.

This parameter has the configuration ID ```config_42_2``` and is of type ```INTEGER```.


### Parameter 43: Hysteresis Upper temperature offset

Hysteresis Upper temperature offset
This parameter defines minimum temperature difference between real measured temperature and set-point temperature to turn device on in heat mode or turn device off in cool mode. 

Values:  
• default value 5 (0.5 °C)  
• 0 – 450

**  
NOTE1: If configuration parameter 78 (Scale selection) is set to Celsius, then valid interval is 0 – 250 (0.0 °C – 25.0 °C, resolution 0.1 °C)  
** 

**NOTE2: If configuration parameter 78 (Scale selection) is set to Fahrenheit, then valid interval is 0 – 450 (0.0 °F – 45.0 °F, resolution 0.1 °F)  
** 

**NOTE3: If configuration parameter 78 (Scale selection) is set to Fahrenheit, note that Fahrenheit values will be converted to Celsius degrees. Due to conversion algorithm please be advised that configuration value could drift when converting values back and forth.**
Values in the range 0 to 450 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_43_2``` and is of type ```INTEGER```.


### Parameter 44: Hysteresis Lower temperature offset

Hysteresis Lower temperature offset
This parameter defines minimum temperature difference between real measured temperature and set-point temperature to turn device off in heat mode or turn device on in cool mode. 

Values:  
• default value 5 (0.5 °C)  
• 0 - 450

**  
NOTE1: If configuration parameter 78 (Scale selection) is set to Celsius, then valid interval is 0 – 250 (0.0 °C – 25.0 °C, resolution 0.1 °C)  
NOTE2: If configuration parameter 78 (Scale selection) is set to Fahrenheit, then valid interval is 0 – 450 (0.0 °F – 45.0 °F, resolution 0.1 °F)  
NOTE3: If configuration parameter 78 (Scale selection) is set to Fahrenheit, note that Fahrenheit values will be converted to Celsius degrees. Due to conversion algorithm please be advised that configuration value could drift when converting values back and forth.**
Values in the range 0 to 450 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_44_2``` and is of type ```INTEGER```.


### Parameter 45:  Antifreeze

Antifreeze
Set value determines at which temperature the device will be turned on even (if the thermostat was manually set to off).  


Values:  
• default value 50 (5.0 °C)  
• -125 - 545  
• 1000 - Antifreeze functionality disabled

**NOTE1: Antifreeze is activated only in heating mode and it uses hysteresis of ±0.5°C.  
NOTE2: If configuration parameter 78 (Scale selection) is set to Celsius, then valid interval is -125 – 125 (-12.5 °C – 12.5 °C, resolution 0.1 °C)  
NOTE3: If configuration parameter 78 (Scale selection) is set to Fahrenheit, then valid interval is 95 – 545 (9.5 °F – 54.5 °F, resolution 0.1 °F)  
NOTE4: If configuration parameter 78 (Scale selection) is set to Fahrenheit, note that Fahrenheit values will be converted to Celsius degrees. Due to conversion algorithm please be advised that configuration value could drift when converting values back and forth.**
Values in the range -125 to 1000 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_45_2``` and is of type ```INTEGER```.


### Parameter 59: Thermostat mode

Thermostat mode
This parameter determines how the device will operate if it will operate in the heating mode or in the cooling mode. The range of the hysteresis will remain the same, only operation will change from heating to cooling and vice versa  


Values:  
• default value 0  
• 0 - Heat mode  
• 1 - Cool mode

  
**NOTE1: After parameter change, first exclude device (without setting parameters to default value) and then re include the device!**
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Heat mode |
| 1 | Cool mode |

The manufacturer defined default value is ```0``` (Heat mode).

This parameter has the configuration ID ```config_59_1``` and is of type ```INTEGER```.


### Parameter 60: Too low temperature limit

Too low temperature limit
This parameter determines the temperature at which the device sends a command to the associated device - to turn ON device or to turn OFF device.

Values:  
• Default value 50 (Too low temperature limit is 5.0 °C)  
• -150 - 2120

  
**NOTE1: Too low temperature limit is used with Association Group 3.**  
**NOTE2: If configuration parameter 78 (Scale selection) is set to Celsius, then valid interval is -150 – 1000 (-15.0 °C – 100.0 °C, resolution 0.1 °C)**  
**NOTE3: If configuration parameter 78 (Scale selection) is set to Fahrenheit, then valid interval is 50 – 2120 (5.0 °F – 212.0 °F, resolution 0.1 °F)**  
**NOTE4: If configuration parameter 78 (Scale selection) is set to Fahrenheit, note that Fahrenheit values will be converted to Celsius degrees. Due to conversion algorithm please be advised that configuration value could drift when converting values back and forth.**
Values in the range -150 to 2120 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_60_2``` and is of type ```INTEGER```.


### Parameter 61: Too high temperature limit

Too high temperature limit
This parameter determines the temperature at which the device sends a command to the associated device, to turn ON device or to turn OFF device. 

Values:  
• default value 700 (too high temperature limit is 70.0 °C)  
• 1 - 2120

  
**NOTE1: Too high temperature limit is used with Association Group 3.**  
**NOTE2: If configuration parameter 78 (Scale selection) is set to Celsius, then valid interval is 1 – 1000 (0.1 °C – 100.0 °C, resolution 0.1 °C)**  
**NOTE3: If configuration parameter 78 (Scale selection) is set to Fahrenheit, then valid interval is 322 – 2120 (32.2 °F – 212.0 °F, resolution 0.1 °F)**  
**NOTE4: If configuration parameter 78 (Scale selection) is set to Fahrenheit, note that Fahrenheit values will be converted to Celsius degrees. Due to conversion algorithm please be advised that configuration value could drift when converting values back and forth.**
Values in the range 1 to 2120 may be set.

The manufacturer defined default value is ```700```.

This parameter has the configuration ID ```config_61_2``` and is of type ```INTEGER```.


### Parameter 63: Output switch selection

Output switch selection
Set value determines the type of the device connected to the on/off output. The output type can be normally open (NO) or normally closed (NC).  


Value:  
• default value 0  
• 0 - When switch/device is off the output is 0V (NC).  
• 1 - When switch/device is off the output is 240V or 24V (NO)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | NC |
| 1 | NO |

The manufacturer defined default value is ```0``` (NC).

This parameter has the configuration ID ```config_63_1``` and is of type ```INTEGER```.


### Parameter 78: Scale Selection

Scale Selection
This parameter determines in which measurement unit the device will report temperature (Fahrenheit or Celsius) and determines the scale the configuration parameters (43, 44, 44, 45, 60, 61, 110, 120) are interpreted as.  


Values:  
• Default value 0 = degrees Celsius  
• 0 = degrees Celsius  
• 1 = degrees Fahrenheit

  
**NOTE1: This scale has influence on Temperature reporting. The device is capable of receiving a Setpoint in all supported scales.**  
**NOTE2: This configuration parameter has impact on configuration parameters 43, 44, 44, 45, 60, 61, 110, 120. If scale is set to degrees Fahrenheit configuration values at parameters 43, 44, 44, 45, 60, 61, 110, 120 will be converted to degrees Celsius. Please note that converted values could drift when converting values back and forth.**
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | degrees Celsius |
| 1 | degrees Fahrenheit |

The manufacturer defined default value is ```0``` (degrees Celsius).

This parameter has the configuration ID ```config_78_1``` and is of type ```INTEGER```.


### Parameter 110: Temperature Sensor Offset Settings

Temperature Sensor Offset Settings
Set value is added to or subtracted from the actually measured value to adjust the temperature report sent by an external sensor.  


Values: 

• default value 0  
• -270 - 270

  
**NOTE1: If configuration parameter 78 (Scale selection) is set to Celsius, then valid interval is -150 – 150 (-15.0 °C – 15.0 °C, resolution 0.1 °C)**  
**NOTE2: If configuration parameter 78 (Scale selection) is set to Fahrenheit, then valid interval is -270 - 270 (-27.0 °F – 27.0 °F, resolution 0.1 °F)**  
**NOTE3: If configuration parameter 78 (Scale selection) is set to Fahrenheit, note that Fahrenheit values will be converted to Celsius degrees. Due to conversion algorithm please be advised that configuration value could drift when converting values back and forth**
Values in the range -270 to 270 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_110_2``` and is of type ```INTEGER```.


### Parameter 120: Temperature Sensor Reporting Threshold

Temperature Sensor Reporting Threshold
This configuration parameters sets reporting threshold between reported temperature and actual temperature for reporting temperature at association group 4. 

Values:  
• Default value 5 = 0.5°C  
• 0 – Reporting disabled  
• 0 - 270

**  
NOTE1: If configuration parameter 78 (Scale selection) is set to Celsius, then valid interval is 0 – 150 (0 °C – 15.0 °C, resolution 0.1 °C)  
NOTE2: If configuration parameter 78 (Scale selection) is set to Fahrenheit, then valid interval is 0 - 270 (0 °F – 27.0 °F, resolution 0.1 °F)  
NOTE3: If configuration parameter 78 (Scale selection) is set to Fahrenheit, note that Fahrenheit values will be converted to Celsius degrees. Due to conversion algorithm please be advised that configuration value could drift when converting values back and forth**
Values in the range 0 to 270 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_120_2``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZMNKID supports 4 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Supports the following commands:

• Device Reset Locally: triggered upon request,

• Sensor multilevel report: triggered upon temperature change,

• Meter report: triggered upon energy consumption change according to configuration parameters 40, 42,

• Notification report: triggered upon current overload detection,

• Thermostat mode: triggered upon thermostat mode change

• Thermostat operating state: triggered upon thermostat operating state (Idle, Heating, Cooling)

Association group 1 supports 5 nodes.

### Group 2: Change of output Q

Supports the following command:

• Basic set: triggered by change of output Q

Association group 2 supports 5 nodes.

### Group 3: Basic on/off too high too low T

Supports the following command:

• Basic set: triggered when actual temperature reaches Too High or Too Low temperature limit;

Heat mode: when temperature reaches Too High Temperature Limit reports OFF (0x00), when temperature reaches Too Low Temperature Limit reports ON (0xFF).

Cool mode: when temperature reaches Too High Temperature Limit reports ON (0xFF), when temperature reaches Too Low Temperature Limit reports OFF (0x00).

Thermostat off mode reports OFF (0x00) on both limits reached.

Hysteresis is 1°C.

Association group 3 supports 5 nodes.

### Group 4: Sensor multilevel report

Supports the following command:

• Sensor multilevel report: triggered by change of temperature for threshold defined in configuration parameter 120

Association group 4 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V7| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_THERMOSTAT_MODE_V1| Linked to BASIC|
| COMMAND_CLASS_THERMOSTAT_OPERATING_STATE_V1| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [official product manual](https://www.cd-jackson.com/zwave_device_uploads/1101/Qubino-Flush-On-Off-Thermostat-2-PLUS-extended-manual-eng-1-0-certification.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1101).
