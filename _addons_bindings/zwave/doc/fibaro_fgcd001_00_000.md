---
layout: documentation
title: FGCD001 - ZWave
---

{% include base.html %}

# FGCD001 Carbon Monoxide Sensor

This describes the Z-Wave device *FGCD001*, manufactured by *Fibargroup* with the thing type UID of ```fibaro_fgcd001_00_000```. 

Carbon Monoxide Sensor


## Channels
The following table summarises the channels available for the FGCD001 Carbon Monoxide Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Carbon Monoxide Sensor | sensor_co | sensor_co |  | Number |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Alarm (CO) | alarm_co | alarm_co | Door | Switch |
| Alarm (heat) | alarm_heat | alarm_heat |  | Switch |
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch |
| Alarm (system) | alarm_system | alarm_system |  | Switch |
| Alarm (power) | alarm_power | alarm_power | Door | Switch |
|  | battery-level | system.battery-level |  |  |
| Alarm (heat) | alarm_heat | alarm_heat |  | Switch |
| Alarm (CO) | alarm_co | alarm_co | Door | Switch |
| Alarm (general) | alarm_general | alarm_general | Door | Switch |


### Sensor (temperature)

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the FGCD001 Carbon Monoxide Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 2: Z-Wave notifications | This parameter allows to set the actions which result in sending notifications to the Z-Wa... |
| 3: LED diode indications | This parameter allows to set the actions which result in LED diode indications. This param... |
| 4: Acoustic signals |  |
| 7: Associations in Z-Wave network security mode |  |
| 10: Commands sent to 2nd association group (CO Alarm) |  |
| 11: Value of BASIC ON command sent to 2nd association group |  |
| 12: Value of BASIC OFF command sent to 2nd association group |  |
| 13: Commands sent to 4th association group (CO Level) |  |
| 14: CO level required for sending BASIC ON command to 4th association group |  |
| 15: Time required for sending BASIC ON command to 4th association group |  |
| 16: Value of BASIC ON command sent to 4th association group |  |
| 17: CO Level required for sending BASIC OFF command to 4th association group |  |
| 19: Value of BASIC OFF command sent to 4th association group |  |
| 20: Temperature reporting time interval |  |
| 21: Temperature reporting hysteresis |  |
| 22: Threshold of exceeding the temperature |  |
| 23: CO meter activation |  |
| 25: CO level reporting hysteresis |  |
| 26: Threshold of CO meter activation |  |
| 1: Lifeline | “Lifeline” reports the device status and allows for assigning single device only (main con... |
| 2: CO Alarm | Devices in this group will be switched on/off when CO Alarm status changes. |
| 3: CO Alarm | Devices in this group will receive notification when CO Alarm status changes. |
| 4: CO Level | Devices in this group will be switched on/off after exceeding the level of CO concentratio... |
| 5: Tamper Alarm | Sends tamper alarm and cancellation frames to the associated devices. |
| 6: CO Alarm BC | Devices in this group will receive sensor alarm frames when CO Alarm status changes. |
| 7: Tamper Alarm BC | Sends tamper alarm and alarm cancellation frames to the associated devices. |


#### 2: Z-Wave notifications

This parameter allows to set the actions which result in sending notifications to the Z-Wave network controller.  


##### Overview 

This parameter allows to set the actions which result in sending notifications to the Z-Wave network controller.

Default setting: 0

Parameter size: 1 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Both actions disabled (0) |
|  | Tampering (opened casing) (1) |
|  | Exceeding the temperature (2) |
|  | Both actions enabled (3) |


#### 3: LED diode indications

This parameter allows to set the actions which result in LED diode indications. This parameter does not apply to the most important actions, such as CO Alarm, Malfunction Alarm and Low Battery Alarm.  


##### Overview 

This parameter allows to set the actions which result in LED diode indications.

This parameter does not apply to the most important actions, such as CO Alarm, Malfunction Alarm and Low Battery Alarm.

The CO Sensor allows to customize its operation to user’s needs.

Default setting: 0

Parameter size: 1 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | All actions disabled (0) |
|  | Tampering (opened casing) (1) |
|  | Exceeding the temperature (2) |
|  | Tampering (opened casing) AND Exceeding the temperature (3) |
|  | Lack of Z-Wave range (4) |
|  | Tampering (opened casing) AND Lack of Z-Wave range (5) |
|  | Exceeding the temperature AND Lack of Z-Wave range (6) |
|  | Tampering AND Exceeding the temperature AND Lack of Z-Wave range (7) |


#### 4: Acoustic signals

  


##### Overview 

This parameter allows to set the actions which result in acoustic signals.

This parameter does not apply to the most important actions, such as CO Alarm, Malfunction Alarm and Low Battery Alarm.

Default setting: 0

Parameter size: 1 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | All actions disabled (0) |
|  | Tampering (opened casing) (1) |
|  | Exceeding the temperature (2) |
|  | Tampering (opened casing) AND Exceeding the temperature (3) |
|  | Lack of Z-Wave range (4) |
|  | Tampering (opened casing) AND Lack of Z-Wave range (5) |
|  | Exceeding the temperature AND Lack of Z-Wave range (6) |
|  | Tampering AND Exceeding the temperature AND Lack of Z-Wave range (7) |


#### 7: Associations in Z-Wave network security mode

  


##### Overview 

Parameter defines how commands are sent in specified association groups: as secure or non-secure.

Parameter is active only in Z-Wave network security mode.

It does not apply to 1st “Lifeline” association group.

Available settings:

1 - 2nd group sent as secure

2 - 3rd group sent as secure

4 - 4th group sent as secure

8 - 5th group sent as secure

16 - 6th group sent as secure

32 - 7th group sent as secure

Parameter values may be combined, e.g. 1+2=3 means that 2nd & 3rd group are sent as secure.

Default setting: 63

Parameter size: 1 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER |
| Range | 0 to 63 |
| Default Value | 63 |


#### 10: Commands sent to 2nd association group (CO Alarm)

  


##### Overview 

This parameter defines commands sent to devices associated in 2nd association group (CO Alarm).

Values of specified commands may be set in parameters 11 and 12.

Default setting: 3 (ON & OFF)

Parameter size: 1 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER || Default Value | 3 |
| Options | BASIC ON (1) |
|  | BASIC OFF (2) |
|  | BASIC ON &amp; BASIC OFF (3) |


#### 11: Value of BASIC ON command sent to 2nd association group

  


##### Overview 

This parameter defines the value of BASIC ON command sent to devices in 2nd association group after the CO Alarm activation.

Default setting: 255 (turn on)

Parameter size: 2 \[bytes\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_2 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | Turning associated devices off (0) |
|  | Forcing level of associated devices (1) |
|  | Setting associated devices to the last remembered state or turning the (255) |


#### 12: Value of BASIC OFF command sent to 2nd association group

  


##### Overview 

This parameter defines the value of BASIC OFF command sent to devices in 2nd association group after the CO Alarm cancellation.

Available settings:

0-99 or 255

Setting parameter to appropriate value will result in:

0 - turning associated devices off

1-99 - forcing level of associated devices

255 - setting associated devices to the last remembered state or turning them on

Default setting: 0 (turn off)

Parameter size: 2 \[bytes\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 13: Commands sent to 4th association group (CO Level)

  


##### Overview 

This parameter defines commands sent to devices associated in 4th association group (CO Level).

Values of specified commands may be set in parameters 16 and 19.

Available settings:

1 - BASIC ON

2 - BASIC OFF

3 - BASIC ON & BASIC OFF

Default setting: 3 (ON & OFF)

Parameter size: 1 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_1 |
| Data Type        | INTEGER |
| Range | 1 to 3 |
| Default Value | 3 |


#### 14: CO level required for sending BASIC ON command to 4th association group

  


##### Overview 

This parameter defines the minimum level of CO concentration which exceeding will result in starting the timer set in parameter 15.

Available settings: 25-400 - CO concentration level in ppm

Parameter value must be at least 4 ppm higher than parameter 17 value.

Default setting: 40 (40 ppm)

Parameter size: 2 \[bytes\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_2 |
| Data Type        | INTEGER |
| Range | 25 to 400 |
| Default Value | 40 |


#### 15: Time required for sending BASIC ON command to 4th association group

  


##### Overview 

This parameter defines the time during which the level of CO concentration should remain above the value set in parameter 14 to send the BASIC ON command to 4th association group.

Available settings:

0 - immediate sending of BASIC ON command

1-2880 (30s - 24h, in 30s steps)

Default setting: 0

Parameter size: 2 \[bytes\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_15_2 |
| Data Type        | INTEGER |
| Range | 0 to 2880 |
| Default Value | 0 |


#### 16: Value of BASIC ON command sent to 4th association group

  


##### Overview 

This parameter defines the value of BASIC ON command sent to devices in 4th association group after exceeding the CO level set in parameter 14 through the time set in parameter 15.

Available settings: 0-99 or 255

Setting parameter to appropriate value will result in:

0 - turning associated devices off

1-99 - forcing level of associated devices

255 - setting associated devices to the last remembered state or turning them on.

Default setting: 255 (turn on)

Parameter size: 2 \[bytes\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_16_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 255 |


#### 17: CO Level required for sending BASIC OFF command to 4th association group

  


##### Overview 

This parameter defines the level of CO concentration below which falling will result in sending the BASIC OFF command to 4th association group. Available settings: 10-400 - CO concentration level in ppm

Default setting: 25 (25 ppm)

Parameter value must be at least 4 ppm lower than parameter 14 value.

Parameter size: 2 \[bytes\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_17_2 |
| Data Type        | INTEGER |
| Range | 10 to 400 |
| Default Value | 25 |


#### 19: Value of BASIC OFF command sent to 4th association group

  


##### Overview 

This parameter defines the value of BASIC OFF command sent to devices in 4th association group after falling below the CO level set in parameter 17.

Available settings:

0-99 or 255

Setting parameter to appropriate value will result in:

0 - turning associated devices off

1-99 - forcing level of associated devices

255 - setting associated devices to the last remembered state or turning them on.

Default setting: 0 (turn off)

Parameter size: 2 \[bytes\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_19_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 20: Temperature reporting time interval

  


##### Overview 

Time interval (in seconds) between consecutive reports of temperature (done by built-in temperature sensor).

Short time interval means more frequent communication, which results in shortened battery life.

Available settings:

0 - no periodical reports

10-1440 (5min - 12h, in 30s steps)

Default setting: 0

Parameter size: 2 \[bytes\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_20_2 |
| Data Type        | INTEGER |
| Range | 0 to 1440 |
| Default Value | 0 |


#### 21: Temperature reporting hysteresis

  


##### Overview 

This parameter defines a minimum change in temperature resulting in a report being sent to the main Z-Wave controller.

Available settings: 1-20 (0.5°C - 10°C, each 0.5°C)

Default setting: 2 (1°C)

Parameter size: 1 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_21_1 |
| Data Type        | INTEGER |
| Range | 1 to 20 |
| Default Value | 2 |


#### 22: Threshold of exceeding the temperature

  


##### Overview 

This parameter defines the temperature level, which exceeding will result in sending actions set in parameters 2, 3 and 4.

Available settings: 1-85 (1°C - 85°C, each 1°C)

Default setting: 55 (55°C)

Parameter size: 1 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_22_1 |
| Data Type        | INTEGER |
| Range | 1 to 85 |
| Default Value | 55 |


#### 23: CO meter activation

  


##### Overview 

This parameter activates reporting the value of CO concentration level to the main Z-Wave controller.

Available settings:

0 - disabled

1 - enabled

Default setting: 1 (enabled)

Parameter size: 1 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_23_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 1 |


#### 25: CO level reporting hysteresis

  


##### Overview 

This parameter defines a minimum change in CO concentration level which results in sending a new value to the main Z-Wave controller. Available settings:2-6 (10 ppm - 30 ppm, each 5 ppm)

Default setting: 2 (10 ppm)

Parameter size: 1 \[byte\]

Parameter is closely related to parameter 26.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_25_1 |
| Data Type        | INTEGER |
| Range | 2 to 6 |
| Default Value | 2 |


#### 26: Threshold of CO meter activation

  


##### Overview 

This parameter defines the CO concentration level, which exceeding will result in sending a new value to the main Z-Wave controller, according to parameter 25 settings.

Adjusting the value allows to get the accurate data in case of danger and helps to save the battery in normal conditions.

Available settings: 10-255 (ppm)

Default setting: 30 (30 ppm)

Parameter size: 2 \[bytes\]

Parameter is closely related to parameter 25.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_26_2 |
| Data Type        | INTEGER |
| Range | 10 to 255 |
| Default Value | 30 |


#### 1: Lifeline

“Lifeline” reports the device status and allows for assigning single device only (main controller by default).  


##### Overview 

The device provides the association of six groups: 1st association group – “Lifeline” reports the device status and allows for assigning single device only (main controller by default).

“LifeLine” group is reserved solely for the controller and hence only 1 node can be assigned. It is not recommended to associate more than 10 devices in general, as the response time to control commands depends on the number of associated devices. In extreme cases, system response may be delayed.

Notification report: The device uses Notification Command Class to report different events to 1st association group (Lifeline).

Notification Type Triggering Event CO Alarm

1. Carbon monoxide detected, unknown location   
2. Carbon monoxide test  
3. Replacement required 

Heat Alarm Overheat detected, unknown location Home Security Tampering, product covering removed Power Management Replace battery soon  System System hardware failure


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: CO Alarm

Devices in this group will be switched on/off when CO Alarm status changes.  


##### Overview 

2nd association group – “CO Alarm” is assigned to the device status - devices in this group will be switched on/off when CO Alarm status changes.

The CO Sensor in 2nd to 7th group allows to control 5 regular or multichannel devices per an association group.

It is not recommended to associate more than 10 devices in general, as the response time to control commands depends on the number of associated devices. In extreme cases, system response may be delayed.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: CO Alarm

Devices in this group will receive notification when CO Alarm status changes.  


##### Overview 

3rd association group – “CO Alarm” is assigned to the device status - devices in this group will receive notification when CO Alarm status changes. Useful for devices that can trigger alarms.

The CO Sensor in 2nd to 7th group allows to control 5 regular or multichannel devices per an association group. 

It is not recommended to associate more than 10 devices in general, as the response time to control commands depends on the number of associated devices. In extreme cases, system response may be delayed.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: CO Level

Devices in this group will be switched on/off after exceeding the level of CO concentration specified in parameter 14.  


##### Overview 

4th association group – “CO Level” is assigned to measured CO level - devices in this group will be switched on/off after exceeding the level of CO concentration specified in parameter 14.

The CO Sensor in 2nd to 7th group allows to control 5 regular or multichannel devices per an association group. 

It is not recommended to associate more than 10 devices in general, as the response time to control commands depends on the number of associated devices. In extreme cases, system response may be delayed.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


#### 5: Tamper Alarm

Sends tamper alarm and cancellation frames to the associated devices.  


##### Overview 

5th association group – “Tamper Alarm” is assigned to the tamper - sends tamper alarm and cancellation frames to the associated devices.

The CO Sensor in 2nd to 7th group allows to control 5 regular or multichannel devices per an association group. 

It is not recommended to associate more than 10 devices in general, as the response time to control commands depends on the number of associated devices. In extreme cases, system response may be delayed. 


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_5 |
| Data Type        | TEXT |
| Range |  to  |


#### 6: CO Alarm BC

Devices in this group will receive sensor alarm frames when CO Alarm status changes.  


##### Overview 

6th association group – “CO Alarm BC” is assigned to the device status - devices in this group will receive sensor alarm frames when CO Alarm status changes. Provides backward compatibility with controllers not supporting Z-Wave+ protocol.

The CO Sensor in 2nd to 7th group allows to control 5 regular or multichannel devices per an association group. 

It is not recommended to associate more than 10 devices in general, as the response time to control commands depends on the number of associated devices. In extreme cases, system response may be delayed.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_6 |
| Data Type        | TEXT |
| Range |  to  |


#### 7: Tamper Alarm BC

Sends tamper alarm and alarm cancellation frames to the associated devices.  


##### Overview 

7th association group – “Tamper Alarm BC” is assigned to the tamper - sends tamper alarm and alarm cancellation frames to the associated devices. Provides backward compatibility with controllers not supporting Z-Wave+ protocol.

The CO Sensor in 2nd to 7th group allows to control 5 regular or multichannel devices per an association group. 

It is not recommended to associate more than 10 devices in general, as the response time to control commands depends on the number of associated devices. In extreme cases, system response may be delayed.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_7 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/711).
