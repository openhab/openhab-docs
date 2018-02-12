---
layout: documentation
title: FGSS001 - ZWave
---

{% include base.html %}

# FGSS001 Smoke Sensor

This describes the Z-Wave device *FGSS001*, manufactured by *Fibargroup* with the thing type UID of ```fibaro_fgss001_00_000```. 

Smoke Sensor


## Channels
The following table summarises the channels available for the FGSS001 Smoke Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
|  | battery-level | system.battery-level |  |  |
| Clock Time Offset | time_offset | time_offset | Temperature | Number |
| Alarm (smoke) | alarm_smoke | alarm_smoke | Door | Switch |
| Alarm (general) | alarm_general | alarm_general | Door | Switch |
| Alarm (heat) | alarm_heat | alarm_heat |  | Switch |


### Sensor (temperature)

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Clock Time Offset

#### Automatic Update Offset

The number of seconds difference in the time before it is reset  
Setting this will automatically update the devices clock when the time difference between the device, and the computer exceeds this number of seconds.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_offset |
| Data Type        | INTEGER |
| Range | 10 to 600 || Default Value | 60 |
| Options | Disable Auto Update (0) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the FGSS001 Smoke Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Alarm Cancellation Delay | Additional delay after an alarm has ceased. The parameter allows you to specify additional... |
| 2: Acoustic and visual signals On / Off in case of alarm | parameter allows for LED indicator and acoustic alarm deactivation in case of smoke detect... |
| 5: Type of alarm frame sent to 1-st association group (SMOKE) | parameter determines a type of command frame sent by the Sensor in case smoke detection ha... |
| 7: Forced Level of Dimming group 1 | Value of the parameter specifying the forced level of dimming / opening sun blinds when co... |
| 10: Interval between successive readings of temperature sensors | Interval between successive readings of temperature from all sensors connected to the devi... |
| 12: Insensitiveness to temperature changes. |  |
| 13: Transmitting the alarm or control frame broadcast mode | Transmitting the alarm or control frame in 'broadcast' mode (i.e. to all devices within ra... |
| 73: Temperature measurement compensation | Temperature value to be added to or deducted from the current measured temperature |
| 80: Z-Wave range test interval | Time period between the consecutive Z-Wave network range tests. |
| 81: Temperature alarm threshold | 0 -> 0 – temperature alarm inactive |
| 82: Smoke Sensor sensitivity | There are 3 levels of sensitivity to smoke presence. Level 1 means the highest sensitivity... |
| 83: Black Box sensitivity level | Parameter specifies temperature and smoke level after which the Black Box starts recording... |
| 84: Malfunction alarm | Time interval in which malfuntion alarm, if detected, is repeated using visual and acousti... |
| 85: Temperature alarm | Time interval in which temperature alarm, if detected, is repeated using visual and acoust... |
| 86: Lack of the Z-Wave range alarm | Time interval in which lack of the Z-Wave network alarm, if detected, is repeated using vi... |
| 87: Low battery alarm | Time interval in which low battery alarm, if detected, is repeated using visual and acoust... |
| 88: Temperature measurement compensation for report | Consider temperature measurement compensation (parameter 73) when sending temperature repo... |
| 89: Tamper alarm | Activates/inactivates temper switch alarm |
| 1: Fire Status |  |
| 2: TMP Button |  |
| 3: Device Status |  |


#### 1: Alarm Cancellation Delay

Additional delay after an alarm has ceased. The parameter allows you to specify additional time, after which the alarm is cancelled once its violation has ceased.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_2 |
| Data Type        | INTEGER |
| Range | 0 to 3600 |
| Default Value | 0 |


#### 2: Acoustic and visual signals On / Off in case of alarm

parameter allows for LED indicator and acoustic alarm deactivation in case of smoke detection


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 3 |
| Options | acoustic and visual alarms inactive (0) |
|  | acoustic alarm inactive, visual alarm active (1) |
|  | acoustic alarm active, visual alarm inactive (2) |
|  | acoustic and visual alarms active (3) |


#### 5: Type of alarm frame sent to 1-st association group (SMOKE)

parameter determines a type of command frame sent by the Sensor in case smoke detection has been detected or cancelled


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | ALARM SENSOR (SMOKE) (0) |
|  | BASIC_SET (255) |


#### 7: Forced Level of Dimming group 1

Value of the parameter specifying the forced level of dimming / opening sun blinds when comes 'switch on' / 'open' command to devices from association group no. 1.  
In the case of alarm frames the alarm priority is specified. Possible parameter setti


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 255 |


#### 10: Interval between successive readings of temperature sensors

Interval between successive readings of temperature from all sensors connected to the device in seconds. Note: taking temperature readings from the sensor does not result in sending a temperature condition report to the central hub.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_2 |
| Data Type        | INTEGER |
| Range | 1 to 32767 |
| Default Value | 300 |


#### 12: Insensitiveness to temperature changes.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 20 |


#### 13: Transmitting the alarm or control frame broadcast mode

Transmitting the alarm or control frame in 'broadcast' mode (i.e. to all devices within range), information sent in this mode is not repeated by the mesh network.  
**NOTE:** If the broadcast mode of information transmission is activated for a given


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Broadcast inactive (0) |
|  | Smoke broadcast mode active, Tamper broadcast mode inactive (1) |
|  | Smoke broadcast mode inactive, Tamper broadcast mode active (2) |
|  | Smoke and Tamper broadcast mode active (3) |


#### 73: Temperature measurement compensation

Temperature value to be added to or deducted from the current measured temperature  
\-1000 0,1°C - 1000 0,1°C


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_73_2 |
| Data Type        | INTEGER |
| Range | -1000 to 1000 |
| Default Value | 0 |


#### 80: Z-Wave range test interval

Time period between the consecutive Z-Wave network range tests.  
0 10min\[10min-24h\] - 17 10min\[10min-24h\] -> 0 – Z-Wave network range test inactive


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_80_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 1 |


#### 81: Temperature alarm threshold

0 -> 0 – temperature alarm inactive  
2 °C - 100 °C -> Temperature


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_81_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 54 |


#### 82: Smoke Sensor sensitivity

There are 3 levels of sensitivity to smoke presence. Level 1 means the highest sensitivity.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_82_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | High (1) |
|  | Medium (2) |
|  | Low (3) |


#### 83: Black Box sensitivity level

Parameter specifies temperature and smoke level after which the Black Box starts recording them.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_83_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | High (1) |
|  | Medium (2) |
|  | Low (3) |


#### 84: Malfunction alarm

Time interval in which malfuntion alarm, if detected, is repeated using visual and acoustic alarms.  
\-126 100ms\[100ms-25,5s\] - 127 100ms\[100ms-25,5s\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_84_1 |
| Data Type        | INTEGER |
| Range | -126 to 127 |
| Default Value | 10 |


#### 85: Temperature alarm

Time interval in which temperature alarm, if detected, is repeated using visual and acoustic alarms.  
\-126 100ms\[100ms-25,5s\] - 127 100ms\[100ms-25,5s\] -> 5 means 500ms


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_85_1 |
| Data Type        | INTEGER |
| Range | -126 to 127 |
| Default Value | 5 |


#### 86: Lack of the Z-Wave range alarm

Time interval in which lack of the Z-Wave network alarm, if detected, is repeated using visual and acoustic alarms.  
1 5s \[5s-24h\] - 17280 5s \[5s-24h\] -> 360 means 30min


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_86_2 |
| Data Type        | INTEGER |
| Range | 1 to 17280 |
| Default Value | 360 |


#### 87: Low battery alarm

Time interval in which low battery alarm, if detected, is repeated using visual and acoustic alarms.  
1 5s \[5s-24h\] - 17280 5s \[5s-24h\] -> 360 means 30min


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_87_2 |
| Data Type        | INTEGER |
| Range | 1 to 17280 |
| Default Value | 360 |


#### 88: Temperature measurement compensation for report

Consider temperature measurement compensation (parameter 73) when sending temperature report.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_88_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Ignore temperature compensation (0) |
|  | Include temperature compensation (1) |


#### 89: Tamper alarm

Activates/inactivates temper switch alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_89_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Tamper alarm inactive (0) |
|  | Tamper alarm active, with cancellation option available (1) |
|  | Tamper alarm active, without cancellation option (2) |


#### 1: Fire Status


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: TMP Button


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Device Status


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/134).
