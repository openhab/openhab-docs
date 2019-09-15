---
layout: documentation
title: ZMNHLA - ZWave
---

{% include base.html %}

# ZMNHLA Flush PWM thermostat
This describes the Z-Wave device *ZMNHLA*, manufactured by *[Goap](http://www.qubino.com/)* with the thing type UID of ```qubino_zmnhla_00_000```.

The device is in the category of *HVAC*, defining Air condition devices, Fans.

![ZMNHLA product image](https://www.cd-jackson.com/zwave_device_uploads/212/212_default.png)


The ZMNHLA supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

This Z-Wave module is used to regulate temperature. Regulation is done using full wave PWM technology. The module can be controlled either through Z-wave network or through the wall switch. 

### Inclusion Information

  * press service button S for more than 2 seconds or
  * press push button I1 three times within 3s (3 times change switch state within 3 seconds

### Exclusion Information

  * press service button S for more than 6 seconds or
  * press push button I1 five times within 3s (5 times change switch state within 3 seconds) in the first 60 seconds after the module is connected to the power supply.

## Channels

The following table summarises the channels available for the ZMNHLA -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Thermostat mode | thermostat_mode | thermostat_mode | Temperature | Number | 
| Setpoint (heating) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

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

### Setpoint (heating)
Sets the thermostat setpoint.

The ```thermostat_setpoint``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.



## Device Configuration

The following table provides a summary of the 32 configuration parameters available in the ZMNHLA.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Input 1 switch type | Input 1 switch type |
| 2 | Input 2 switch type | Input 2 switch type |
| 3 | Input 3 switch type | Input 3 switch type |
| 4 | Input 1 contact type | Input 1 contact type |
| 5 | Input 2 contact type | Input 2 contact type |
| 6 | Input 3 contact type | Input 3 contact type |
| 10 | Activate / deactivate functions ALL ON/ALL OFF			 | Respond to ALL ON/ALL OFF |
| 11 | I1 Functionality Selection | I1 Functionality Selection |
| 12 | I2 Functionality Selection | I2 Functionality Selection |
| 13 | I3 Functionality Selection | I3 Functionality Selection |
| 40 | Power reporting in Watts on power change | Power reporting in Watts on power change |
| 42 | Power reporting in Watts by timer interval | Power reporting in Watts by timer interval |
| 45 | Antifreeze | Antifreeze |
| 50 | PWM Maximum Value | PWM Maximum Value |
| 51 | PWM Minimum Value | PWM Minimum Value |
| 52 | PWM Cycle Duration | PWM Cycle Duration |
| 53 | PID Value Inside Deadband | PID Value Inside Deadband |
| 54 | PID Deadband | PID Deadband |
| 55 | Integral Sampling Time | Integral Sampling Time |
| 56 | P Parameter | 0 - 1000 P value step is 1. Default = 100 |
| 57 | I Parameter | 0 - 1000 - 0s I value step is 1. Default = 1 |
| 58 | D Parameter | 0 - 1000 - 0s D value step is 1. Default = 1 |
| 59 | Thermostat Mode |  |
| 60 | Too low temperature limit | Too low temperature limit |
| 61 | Too high temperature limit | Too high temperature limit |
| 63 | Output Switch Selection |  |
| 70 | Input 1 Status on delay | Input 1 Status on delay |
| 71 | Input 1 Status off delay | Input 1 Status off delay |
| 72 | Input 2 Status on delay | Input 2 Status on delay |
| 73 | Input 2 Status off delay | Input 2 Status off delay |
| 74 | Input 3 Status on delay | Input 3 Status on delay |
| 75 | Input 3 Status off delay | Input 3 Status off delay |

### Parameter 1: Input 1 switch type

Input 1 switch type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | mono-stable switch type (push button) |
| 1 | bi-stable switch type |

The manufacturer defined default value is ```1``` (bi-stable switch type).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Input 2 switch type

Input 2 switch type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | mono-stable switch type (push button) |
| 1 | bi-stable switch type |

The manufacturer defined default value is ```1``` (bi-stable switch type).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Input 3 switch type

Input 3 switch type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | mono-stable switch type (push button) |
| 1 | bi-stable switch type |

The manufacturer defined default value is ```1``` (bi-stable switch type).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Input 1 contact type

Input 1 contact type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | NO (normally open) input type |
| 1 | NC (normally close) input type |

The manufacturer defined default value is ```0``` (NO (normally open) input type).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Input 2 contact type

Input 2 contact type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | NO (normally open) input type |
| 1 | NC (normally close) input type |

The manufacturer defined default value is ```0``` (NO (normally open) input type).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Input 3 contact type

Input 3 contact type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | NO (normally open) input type |
| 1 | NC (normally close) input type |

The manufacturer defined default value is ```0``` (NO (normally open) input type).

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 10: Activate / deactivate functions ALL ON/ALL OFF			

Respond to ALL ON/ALL OFF
Flush PWM thermostat module responds to commands ALL ON / ALL OFF that may be sent by the main controller or by other controller belonging to the system.           
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | ALL ON is not active ALL OFF is not active |
| 1 | ALL ON is not active ALL OFF active |
| 2 | ALL ON active ALL OFF is not active |
| 255 | ALL ON active, ALL OFF active |

The manufacturer defined default value is ```255``` (ALL ON active, ALL OFF active).

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: I1 Functionality Selection

I1 Functionality Selection
Default Value = 1.

  * 65535 – Input I1 does not influence on the heat/cool process.
  * 1 - Input I1 changes the mode ofthe thermostat between OFF and AUTO. In this case function on flood sensor (if connected) is disabled.
  * 2 – input I1 influences on cooling and heating valves according to status of flood sensor. In this case function of Off and Auto selection by I1 is disabled
Values in the range 1 to 65535 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


### Parameter 12: I2 Functionality Selection

I2 Functionality Selection
  * default value 65535
  * 65535 – input I2 does not influence on the heat/ cool process
  * From 0 to 990 – Temperature set point from 0.0 °C to 99.0 °C. When I2 is pressed, temperature set point is automatically set to value defined here. In this case function of condense sensor is disabled.
  * From 1001 to 1150 – Temperature set point from -0.1 °C to -15.0 °C. When I2 is pressed, temperature setpoint is automatically set to value defined here. In this case function of condense sensor is disabled.
  * 2000 – Input I2 influences on the cooling valve according to status of condense sensor, In this case function of setpoint selection with I2 is disabled.
Values in the range 1 to 65535 may be set.

The manufacturer defined default value is ```65535```.

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 13: I3 Functionality Selection

I3 Functionality Selection
  * default value 65535
  * 65535 – input I3 does not influence on the heat/ cool process
  * 1 – input I3 changes the mode of the thermostat between Heat and Cool. In this case function on window sensor is disabled.
  * 2 – input I3 influences on cooling and heating valves according to status of window sensor. In this case function of Heat and Cool selection by I3 is disabled. 
Values in the range 1 to 65535 may be set.

The manufacturer defined default value is ```65535```.

This parameter has the configuration ID ```config_13_2``` and is of type ```INTEGER```.


### Parameter 40: Power reporting in Watts on power change

Power reporting in Watts on power change
  *  default value 0
  * 0 – Reporting Disabled
  * 1–100 = 1%-100% Reporting enabled. Power report is send (push) only when actual power in Watts in real time changes for more than set percentage comparing to previous actual power in Watts, step is 1%.

**NOTE**: If power changed is less than 1W, the report is not send (pushed), independent of percentage set
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_40_1``` and is of type ```INTEGER```.


### Parameter 42: Power reporting in Watts by timer interval

Power reporting in Watts by timer interval
  * default value 300 (power report in Watts is send each 300s)
  * 0 – Reporting Disabled
  *  1 – 32767 = 1 second – 32767 seconds. Reporting enabled. Power report is send with time interval set by entered value.  
Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```300```.

This parameter has the configuration ID ```config_42_2``` and is of type ```INTEGER```.


### Parameter 45: Antifreeze

Antifreeze
Set value means at which temperature the device will be turned on even if the thermostat was manually set to off. Parameter can be set from 0 to 255 where 0 to 127 means from 0.0 °C to 12.7 °C and from 128 to 254 means from - 0.1 °C to -12.6 °C.

Available configuration parameters 

  * default value 50 (5,0 °C)
  * 255 – Antifreeze functionality disabled

**NOTE:** Antifreeze is activated only in heating mode
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_45_1``` and is of type ```INTEGER```.


### Parameter 50: PWM Maximum Value

PWM Maximum Value
  * default value 100 (Maximum PWM value)
  * 2–100 = 2%-100%, step is 1%. Max. PWM set by entered value.

**NOTE**: The maximum level may not be lower than the minimum level! 
Values in the range 2 to 100 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_50_1``` and is of type ```INTEGER```.


### Parameter 51: PWM Minimum Value

PWM Minimum Value
  * Default value 0 (Minimum PWM value is 0%)
  * 1- 99 = 1% – 99%, step is 1%. Minimum PWM set by entered value.

**NOTE:** The minimum level may not exceed maximum level! 
Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_51_1``` and is of type ```INTEGER```.


### Parameter 52: PWM Cycle Duration

PWM Cycle Duration
  * Default value 10 (Cycle duration set to 10s)
  *  1-127 = 1–127s, step is 1s. PWM cycle duration set by entered value.

**NOTE:** PWM cycle duration define the summary of all ON plus OFF time periods. For example if Output is set to 70% with PWM cycle duration of 20s, output will be ON for 14s then OFF 6s, again 14s ON, etc… 
Values in the range 1 to 127 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_52_1``` and is of type ```INTEGER```.


### Parameter 53: PID Value Inside Deadband

PID Value Inside Deadband
  * Default value 0 (PID value equal ZERO)
  * 1 = PID value set to LAST VALUE

**NOTE**: When value is set to ZERO PID inside deadband is forced to zero. LASTVALUE means that PID remains on same level as was before entering into deadband 
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | PID value equals ZERO |
| 1 | PID value set to LAST VALUE |

The manufacturer defined default value is ```0``` (PID value equals ZERO).

This parameter has the configuration ID ```config_53_1``` and is of type ```INTEGER```.


### Parameter 54: PID Deadband

PID Deadband
  * default value 5 (0,5 °C)
  * 0-127 – 0.0 °C to 12.7 °C, step is 0,1°C

**NOTE**: This parameter defines the zone where PID is not active. If the temperature difference between actual and setpoint is bigger than PID deadband, then the PID will start to regulate the system, otherwise the PID is zero or fixed.
Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_54_1``` and is of type ```INTEGER```.


### Parameter 55: Integral Sampling Time

Integral Sampling Time
  * default value 5 (5s)
  * 0-127 – 0s to 127s, step is 1s

Parameter defines the time between samples. On each sample the controller capture difference between SP-act.
Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_55_1``` and is of type ```INTEGER```.


### Parameter 56: P Parameter

0 - 1000 P value step is 1. Default = 100

Values in the range 0 to 1000 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_56_2``` and is of type ```INTEGER```.


### Parameter 57: I Parameter

0 - 1000 - 0s I value step is 1. Default = 1

Values in the range 0 to 1000 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_57_2``` and is of type ```INTEGER```.


### Parameter 58: D Parameter

0 - 1000 - 0s D value step is 1. Default = 1

Values in the range 0 to 1000 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_58_2``` and is of type ```INTEGER```.


### Parameter 59: Thermostat Mode



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Heat Mode |
| 1 | Cool Mode |

The manufacturer defined default value is ```0``` (Heat Mode).

This parameter has the configuration ID ```config_59_1``` and is of type ```INTEGER```.


### Parameter 60: Too low temperature limit

Too low temperature limit
  * Default value 50 (Too low temperature limit is 5.0°C)
  * 1 - 1000 = 0.1°C – 100.0°C, step is 0.1°C.

Too low temperature limit is set by entered value. In case measured temperature is below set value, module sends BasicSet value. Look chapter associations.
Values in the range 1 to 1000 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_60_2``` and is of type ```INTEGER```.


### Parameter 61: Too high temperature limit

Too high temperature limit
  * Default value 700 (too high temperature limit is 70.0°C)
  * 1 - 1000 = 0.1°C – 100.0°C, step is 0.1°C.

Too high temperature limit is set by entered value. In case measured temperature is higher than set value, module sends BasicSet value. Look chapter associations
Values in the range 1 to 1000 may be set.

The manufacturer defined default value is ```700```.

This parameter has the configuration ID ```config_61_2``` and is of type ```INTEGER```.


### Parameter 63: Output Switch Selection



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | System OFF the output is 0V (NC) |
| 1 | System OFF the output is 230V (NO) |

The manufacturer defined default value is ```0``` (System OFF the output is 0V (NC)				).

This parameter has the configuration ID ```config_63_1``` and is of type ```INTEGER```.


### Parameter 70: Input 1 Status on delay

Input 1 Status on delay
  * default value 0
  * 1 – 32000 seconds

If the value of parameter is different to 0, means that the Influence of this input to heating or cooling will react after inserted time. Parameter 11 must be set to 2!
Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_70_2``` and is of type ```INTEGER```.


### Parameter 71: Input 1 Status off delay

Input 1 Status off delay
  * default value 0
  * 1 – 32000 seconds

If the value of parameter is different to 0, means that the Influence of this input to heating or cooling will react after inserted time. Parameter 11 must be set to 2!
Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_71_2``` and is of type ```INTEGER```.


### Parameter 72: Input 2 Status on delay

Input 2 Status on delay
  * default value 0
  * 1 – 32000 seconds

If the value of parameter is different to 0, means that the Influence of this input to heating or cooling will react after inserted time. Parameter 12 must be set to 2000!
Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_72_2``` and is of type ```INTEGER```.


### Parameter 73: Input 2 Status off delay

Input 2 Status off delay
  * default value 0
  * 1 – 32000 seconds

If the value of parameter is different to 0, means that the Influence of this input to heating or cooling will react after inserted time. Parameter 12 must be set to 2000! 
Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_73_2``` and is of type ```INTEGER```.


### Parameter 74: Input 3 Status on delay

Input 3 Status on delay
  * default value 0
  * 1 – 32000 seconds

If the value of parameter is different to 0, means that the Influence of this input to heating or cooling will react after inserted time. Parameter 13 must be set to 2!
Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_74_2``` and is of type ```INTEGER```.


### Parameter 75: Input 3 Status off delay

Input 3 Status off delay
  * default value 0
  * 1 – 32000 seconds

If the value of parameter is different to 0, means that the Influence of this input to heating or cooling will react after inserted time. Parameter 13 must be set to 2! 
Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_75_2``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZMNHLA supports 6 association groups.

### Group 1: On/Off Triggered by Q State


Association group 1 supports 16 nodes.

### Group 2: On/Off Triggered by I2


Association group 2 supports 16 nodes.

### Group 3: On/Off Triggered by I3


Association group 3 supports 16 nodes.

### Group 4: On/Off Triggerd by High Temp


Association group 4 supports 16 nodes.

### Group 5: On/Off Trigger by Low Temp


Association group 5 supports 16 nodes.

### Group 6: Controller Updates


Association group 6 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V3| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_THERMOSTAT_MODE_V2| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/212/z-wave-qubino-flush-pwm-thermostat-user-manual-v1-0.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/212).
