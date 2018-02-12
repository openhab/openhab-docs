---
layout: documentation
title: FGBS001 - ZWave
---

{% include base.html %}

# FGBS001 Universal Binary Sensor

This describes the Z-Wave device *FGBS001*, manufactured by *Fibargroup* with the thing type UID of ```fibaro_fgbs001_00_000```. 

Universal Binary Sensor


## Channels
The following table summarises the channels available for the FGBS001 Universal Binary Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Scene Number | scene_number | scene_number |  | Number |
| Binary Sensor 1 | sensor_binary1 | sensor_binary | Door | Switch |
| Alarm 1 | alarm_general1 | alarm_general | Door | Switch |
| Binary Sensor 2 | sensor_binary2 | sensor_binary | Door | Switch |
| Alarm 2 | alarm_general2 | alarm_general | Door | Switch |
| Temperature 1 | sensor_temperature3 | sensor_temperature | Temperature | Number |
| Temperature 2 | sensor_temperature4 | sensor_temperature | Temperature | Number |
| Temperature 3 | sensor_temperature5 | sensor_temperature | Temperature | Number |
| Temperature 4 | sensor_temperature6 | sensor_temperature | Temperature | Number |


### Temperature 1

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Temperature 2

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Temperature 3

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Temperature 4

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the FGBS001 Universal Binary Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: IN1 Alarm Cancellation Delay | Input I alarm cancellation delay. |
| 2: IN2 Alarm Cancellation Delay | Input 2 alarm cancellation delay. |
| 3: Type of input no. 1 | Type of input no. 1, what the input 1 will report if no contact is made |
| 4: Type of input no. 2 | Type of input no. 2, what the input 2 will report if no contact is made |
| 5: Type of transmitted control frame for association group 1 | Type of transmitted control frame for association group 1. |
| 6: Type of transmitted control frame for association group 2 | Type of transmitted control frame for association group 2 |
| 7: Forced Level of Dimming group 1 | Value of the parameter specifying the forced levels. |
| 8: Forced Level of Dimming group 2 | Value of the parameter specifying forced levels. |
| 9: Deactivate transmission of frame canceling alarm | Deactivating transmission of the frame cancelling the alarm |
| 10: Interval between successive readings of temperature sensors | Interval between successive readings of temperature |
| 11: Interval betw. forcing to send report concerning the temp. | The forced report is sent immediately after |
| 12: Insensitiveness to temperature changes. | This is the maximum acceptable difference between |
| 13: Transmitting the alarm or control frame broadcast mode | Transmitting the alarm or control frame in 'broadcast' mode |
| 14: Scene activation | Enable/Disable scene functionality. |
| 1: Input 1 |  |
| 2: Input 2 |  |
| 3: Controller Updates | Reports on the condition of the device |


#### 1: IN1 Alarm Cancellation Delay

Input I alarm cancellation delay.  


##### Overview 

Additional delay after an alarm from input IN1 has ceased. The parameter allows you to specify additional time, after which the input no. 1 alarm is cancelled once its violation has ceased.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 0 |


#### 2: IN2 Alarm Cancellation Delay

Input 2 alarm cancellation delay.  


##### Overview 

Additional delay after an alarm from input IN2 has ceased. The parameter allows you to specify additional time, after which the input no. 2 alarm is cancelled once its violation has ceased.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 0 |


#### 3: Type of input no. 1

Type of input no. 1, what the input 1 will report if no contact is made


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | NO (Normal Open) (0) |
|  | NC (Normal Close) (1) |
|  | MONOSTABLE (2) |
|  | BISTABLE (3) |


#### 4: Type of input no. 2

Type of input no. 2, what the input 2 will report if no contact is made


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | NO (Normal Open) (0) |
|  | NC (Normal Close) (1) |
|  | MONOSTABLE (2) |
|  | BISTABLE (3) |


#### 5: Type of transmitted control frame for association group 1

Type of transmitted control frame for association group 1.  


##### Overview 

Activated via input IN1. The parameter allows to specify the type of alarm frame or to force transmission of control commands (BASIC\_SET)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | ALARM GENERIC (0) |
|  | ALARM SMOKE (1) |
|  | ALARM CO (2) |
|  | ALARM CO2 (3) |
|  | ALARM HEAT (4) |
|  | ALARM WATER (5) |
|  | BASIC_SET (255) |


#### 6: Type of transmitted control frame for association group 2

Type of transmitted control frame for association group 2  


##### Overview 

Activated via input IN2. The parameter allows to specify the type of alarm frame or to force transmission of control commands (BASIC\_SET)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | ALARM GENERIC (0) |
|  | ALARM SMOKE (1) |
|  | ALARM CO (2) |
|  | ALARM CO2 (3) |
|  | ALARM HEAT (4) |
|  | ALARM WATER (5) |
|  | BASIC_SET (255) |


#### 7: Forced Level of Dimming group 1

Value of the parameter specifying the forced levels.  


##### Overview 

Value of the parameter specifying the forced levels of dimming / opening sun blinds when comes 'switch on' / 'open' command to devices from association group no. 1.<BR/>In the case of alarm frames the alarm priority is specified.

Possible parameter settings: (1 – 99) and 255  
Value of 255 makes it possible to activate the device when using  
the Dimmer module it means activating the device and setting it to  
the previous stored condition, e.g. when Dimmer is set to 30%, then  
deactivated, and then reactivated using command 255, it will  
automatically be set to the previous condition, i.e. 30%.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 255 |


#### 8: Forced Level of Dimming group 2

Value of the parameter specifying forced levels.  


##### Overview 

Value of the parameter specifying the forced level of dimming /  
opening sun blinds when comes “switch on” / ”open” command to  
devices from association group no. 2.  
In the case of alarm frames the alarm priority is specified.  
Default value: 255  
Possible parameter settings:  
(1 – 99) and 255  
Value of 255 makes it possible to activate the device; when using of  
the Dimmer module it means activating the device and setting it to  
the previous stored condition, e.g. when Dimmer is set to 30%, then  
deactivated, and then reactivated using command 255, it will  
automatically be set to the previous condition, i.e. 30%.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 255 |


#### 9: Deactivate transmission of frame canceling alarm

Deactivating transmission of the frame cancelling the alarm  


##### Overview 

or the  
control frame deactivating the device (Basic). It allows for disabling  
the deactivation function or the alarm cancellation function for  
devices associated with the appropriate input of the Fibaro Sensor.  
Default value: 0, in the case of association group no. 1 and 2 the  
information is sent  
Possible parameter settings:  
0 – in the case of association group no. 1 and 2 the information is  
sent  
1 – in the case of association group no. 1 the information is sent. In  
the case of association group no. 2 the information is not sent.  
2 – in the case of association group no. 1 the information is not  
sent. In the case of association group no. 2 the information is sent.  
NOTE: Information concerning alarm violation or activation  
commands for devices from association groups are always  
sent.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Groups 1 and 2 sent (0) |
|  | Group 1 sent, Group 2 not sent. (1) |
|  | Group 1 not sent, Group 2 sent. (2) |


#### 10: Interval between successive readings of temperature sensors

Interval between successive readings of temperature  


##### Overview 

 from all sensors connected to the device in seconds. Note: taking temperature readings from the sensor does not result in sending a temperature condition report to the central hub.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 20 |


#### 11: Interval betw. forcing to send report concerning the temp.

The forced report is sent immediately after  


##### Overview 

 the next reading of temperature from the sensor, irrespective of the settings  
of parameter no. 12.  
Default value: 200 s  
Possible parameter settings:  
0 – 255 s  
0 – deactivating the function  
Note: Frequent sending of temperature condition reports is  
reasonable when the sensor is located somewhere where can  
occure rapid changes of ambient temperature. In other cases  
it is recommended to leave the parameter set to the default  
value.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 200 |


#### 12: Insensitiveness to temperature changes.

This is the maximum acceptable difference between  


##### Overview 

 the last reported temperature and the current temperature taken from the sensor. If the temperatures differ by the set value or more, then a report with the current temperature value is sent to the device


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 8 |


#### 13: Transmitting the alarm or control frame broadcast mode

Transmitting the alarm or control frame in 'broadcast' mode  


##### Overview 

 (i.e. to all devices within range), information sent in this mode is not repeated by the mesh network.<BR/><B>NOTE:</B> If the broadcast mode of information transmission is activated for a given channel, then transmission of  
information in “singlecast” mode to devices assigned to the  
association group of this channel is deactivated.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | IN1 and IN2 Broadcast inactive (0) |
|  | IN1 broadcast mode active, Sensor 2 broadcast mode inactive (1) |
|  | IN1 broadcast mode inactive, Sensor 2 broadcast mode active (2) |
|  | INI and IN2 broadcast mode active (3) |


#### 14: Scene activation

Enable/Disable scene functionality.  


##### Overview 

The device offers the possibility of sending commands compatible with Command class scene activation. Information is sent to devices assigned to association group no. 3.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Scenes disabled (0) |
|  | Scenes enabled (1) |


#### 1: Input 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Input 2


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Controller Updates

Reports on the condition of the device


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/126).
