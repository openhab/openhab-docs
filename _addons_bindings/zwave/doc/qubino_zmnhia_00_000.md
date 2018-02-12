---
layout: documentation
title: ZMNHIA - ZWave
---

{% include base.html %}

# ZMNHIA Flush on/off thermostat

This describes the Z-Wave device *ZMNHIA*, manufactured by *Goap* with the thing type UID of ```qubino_zmnhia_00_000```. 

Flush on/off thermostat


## Channels
The following table summarises the channels available for the ZMNHIA Flush on/off thermostat.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Thermostat mode | thermostat_mode | qubino_zmnhia_00_000_thermostat_mode | Temperature | Number |
| Setpoint (heating) | thermostat_setpoint_heating | thermostat_setpoint | Temperature | Number |
| Binary Sensor 1 | sensor_binary1 | sensor_binary | Door | Switch |
| Binary Sensor 2 | sensor_binary2 | sensor_binary | Door | Switch |


### Sensor (temperature)

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Setpoint (heating)

#### Scale

Select the scale to use for setpoints.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the ZMNHIA Flush on/off thermostat.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Input 1 switch type | Input 1 switch type |
| 2: Input 2 switch type | Input 2 switch type |
| 3: Input 3 switch type | Input 3 switch type |
| 4: Input 2 contact type |  |
| 5: Input 3 contact type |  |
| 10: Activate / deactivate functions ALL ON/ALL OFF | Module responds to commands ALL ON / ALL OFF |
| 11: Set point set by I2 | Set point set by I2 |
| 12: Set point set by I3 | Set point set by I3 |
| 30: Saving the state of the relay after a power failure | Saving the state of the relay after a power failure |
| 40: Power reporting in Watts on power change for Q1 | Power reporting in Watts on power change |
| 42: Power reporting in Watts by time interval for Q1 | Power reporting in Watts by time interval |
| 43: Hysteresis On | Hysteresis On |
| 44: Hysteresis Off | Hysteresis Off |
| 45: Antifreeze | Antifreeze function Temperature |
| 60: Too low temperature limit | Too low temperature limit |
| 61: Too high temperature limit | Too high temperature limit |
| 63: Switch selection | Connected device type can be (NO) or (NC) |
| 1: Basic on/off Q1 |  |
| 2: Basic on/off I2 |  |
| 3: Basic on/off I3 |  |
| 4: High Temperature |  |
| 5: Low Temperature |  |
| 6: Default Reporting Group |  |


#### 1: Input 1 switch type

Input 1 switch type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | mono-stable switch type (push button) (0) |
|  | bi-stable switch type (1) |


#### 2: Input 2 switch type

Input 2 switch type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | mono-stable switch type (push button) (0) |
|  | bi-stable switch type (1) |


#### 3: Input 3 switch type

Input 3 switch type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | mono-stable switch type (push button) (0) |
|  | bi-stable switch type (1) |


#### 4: Input 2 contact type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | NO (normally open) input type (0) |
|  | NC (normally close) input type (1) |


#### 5: Input 3 contact type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | NO (normally open) input type (0) |
|  | NC (normally close) input type (1) |


#### 10: Activate / deactivate functions ALL ON/ALL OFF

Module responds to commands ALL ON / ALL OFF  


##### Overview 

Module responds to commands ALL ON / ALL OFF that may be sent by the main controller or by other controller belonging to the system.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | ALL ON is not active ALL OFF is not active (0) |
|  | ALL ON is not active ALL OFF active (1) |
|  | ALL ON active ALL OFF is not active (2) |
|  | ALL ON active, ALL OFF active (255) |


#### 11: Set point set by I2

Set point set by I2  


##### Overview 

When I2 is pressed set point will be set according to the value of this parameter. Available config. parameters:

default value 65535

65535 – input I2 does not influence on the set point

From 0 to 990 – set point from 0.0 °C to 99.0 °C

From 1001 to 1150 – set point from -0.1 °C to -15.0 °C


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 0 |


#### 12: Set point set by I3

Set point set by I3  


##### Overview 

When I3 is pressed set point will be set according to the value of this parameter. Available config. parameters

default value 65535

65535 – input I3 does not influence on the set point

From 0 to 990 – set point from 0.0 °C to 99.0 °C

From 1001 to 1150 – set point from -0.1 °C to -15.0 °C


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 0 |


#### 30: Saving the state of the relay after a power failure

Saving the state of the relay after a power failure


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_30_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Module saves its state (0) |
|  | Module does not save state (1) |


#### 40: Power reporting in Watts on power change for Q1

Power reporting in Watts on power change  


##### Overview 

Set value means percentage, set value from 0 - 100=0% - 100%. Available configuration parameters

default value 3

0 – Reporting Disabled

1–100 = 1%-100% Reporting enabled. Power report is sent (push) only when actual power in Watts in real time changes for more than set percentage comparing to previous actual power in Watts, step is 1%.

NOTE: If power changed is less than 1W, the report is not sent (pushed), independent of percentage set.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_40_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 1 |


#### 42: Power reporting in Watts by time interval for Q1

Power reporting in Watts by time interval  


##### Overview 

Set value means time interval (0 – 65535) in seconds, when power report is send. Available config. parameters

default value 300 (power report in Watts is send each 300s)

0 – Reporting Disabled

1 – 65535 = 1second – 65535 seconds. Reporting enabled. Power report is send with time interval set by entered value.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_42_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 300 |


#### 43: Hysteresis On

Hysteresis On  


##### Overview 

This parameter defines temperature min difference between real measured temperature and set-point temperature to turn device on. Parameter can be set from 0 to 255 where 0 to 127 means from 0.0 °C to 12.7 °C and from 128 to 255 means from - 0.1 °C to -12.7 °C.

Available configuration parameters

default value 132 (-0.5 °C)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_43_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 132 |


#### 44: Hysteresis Off

Hysteresis Off  


##### Overview 

This parameter defines temperature min difference between real measured temperature and set-point temperature to turn device off. Parameter can be set from 0 to 255 where 0 to 127 means from 0.0 °C to 12.7 °C and from 128 to 255 means from - 0.1 °C to -12.7 °C.

Available configuration parameters

default value 5 (+0.5 °C)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_44_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 5 |


#### 45: Antifreeze

Antifreeze function Temperature  


##### Overview 

Set value means at which temperature the device will be turned on even if the thermostat was manually set to off. Parameter can be set from 0 to 255 where 0 to 127 means from 0.0 °C to 12.7 °C and from 128 to 254 means from - 0.1 °C to -12.6 °C.

Available configuration parameters

default value 50 (5,0 °C)

255 – Antifreeze functionality disabled


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_45_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 5 |


#### 60: Too low temperature limit

Too low temperature limit  


##### Overview 

Available configuration parameters

Default value 50 (Too low temperature limit is 5.0°C)

1 - 1000 = 0.1°C – 100.0°C, step is 0.1°C. Too low temperature limit is set by entered value. In case is set value out of this range, module is changing set value automatically to default value.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_60_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 50 |


#### 61: Too high temperature limit

Too high temperature limit  


##### Overview 

Available configuration parameters:

Default value 50 (Too low temperature limit is 5.0°C)

1 - 1000 = 0.1°C – 100.0°C, step is 0.1°C. Too low temperature limit is set by entered value. In case is set value out of this range, module is changing set value automatically to default value.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_61_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 700 |


#### 63: Switch selection

Connected device type can be (NO) or (NC)  


##### Overview 

Set value means the type of the device that is connected to the relay output. The device type can be normally open (NO) or normally close (NC). Available configuration parameters

default value 0

0 - When system is turned off the output is 0 V.

1 - When system is turned off the output is 230 V.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_63_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 0 |


#### 1: Basic on/off Q1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Basic on/off I2


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Basic on/off I3


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: High Temperature


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


#### 5: Low Temperature


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_5 |
| Data Type        | TEXT |
| Range |  to  |


#### 6: Default Reporting Group


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_6 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/211).
