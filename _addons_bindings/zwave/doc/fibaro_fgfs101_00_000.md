---
layout: documentation
title: FGFS101 - ZWave
---

{% include base.html %}

# FGFS101 Flood Sensor

This describes the Z-Wave device *FGFS101*, manufactured by *Fibargroup* with the thing type UID of ```fibaro_fgfs101_00_000```. 

Flood Sensor


## Channels
The following table summarises the channels available for the FGFS101 Flood Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
|  | battery-level | system.battery-level |  |  |
| Alarm (general) | alarm_general | alarm_general | Door | Switch |
| Alarm (water) | sensor_flood | sensor_flood |  | Switch |
| Binary Sensor 1 | sensor_binary1 | sensor_binary | Door | Switch |
| Sensor (temperature) 2 | sensor_temperature2 | sensor_temperature | Temperature | Number |


### Sensor (temperature) 2

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the FGFS101 Flood Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Alarm Cancellation Delay | Time period (in seconds) that an alarm will still be indicated after the alarm condition h... |
| 2: Acoustic and visual signals On / Off in case of flooding | Parameter allows for LED indicator and acoustic alarm deactivation in case of flooding det... |
| 5: Type of alarm frame sent to 1-st association group (FLOOD) | Parameter determines a type of command frame sent by the Sensor in case flooding has been ... |
| 7: Forced Level of Dimming group 1 | Value of the parameter specifying the forced level of dimming / opening sun blinds when co... |
| 9: Alarm cancelling or turning a device off (Basic) command frame deactivation | Set to 0 to disable all-clear basic set & alarm frame generation. After flooding, device w... |
| 10: Interval between successive readings of temperature sensors | Interval between successive readings of temperature in seconds. |
| 12: Insensitiveness to temperature changes. | Determines a minimum temperature change value (insensitivity level; def: 0,5C), resulting ... |
| 13: Alarm BROADCAST | Transmit the alarm or control frame in 'broadcast' mode. Information sent in this mode is ... |
| 50: Low temperature alarm threshold | The parameter stores a temperature value (def. 15C), below which LED indicator blinks with... |
| 51: High temperature alarm threshold | The parameter stores a temperature value (def. 35C), above which LED indicator blinks with... |
| 61: Low temperature alarm indicator colour | Default is blue (0x000000FF). |
| 62: High temperature alarm indicator colour | Default is red (0x00FF0000). 65535 \* Red + 256 \* Green + Blue |
| 63: Managing a LED indicator under standard operation | Parameter determines LED indicator’s operation. Set to 0 turns the indicator off, saving a... |
| 73: Temperature measurement compensation | Parameter stores a temperature value to be added to or deducted from the current temperatu... |
| 74: Alarm frame sent to 2-nd Association Group activation | (MOVEMENT\_TAMPER / BUTTON\_TAMPER) The device is able to turn on alarms resulting from se... |
| 75: Visual and audible alarms duration | Visual and audible alarm duration |
| 76: Alarm frame / basic set frame retransmission time when flooding | Parameter determines time period after which an alarm frame will be retransmitted. Value o... |
| 77: Flood sensor functionality turned off | Allows for turning of the internal flood sensor. Tamper and built in temperature sensor wi... |
| 1: Flood Alarm |  |
| 2: Tilt &amp; Tamper Sensors |  |
| 3: Device Status |  |


#### 1: Alarm Cancellation Delay

Time period (in seconds) that an alarm will still be indicated after the alarm condition has ceased.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_2 |
| Data Type        | INTEGER |
| Range | 0 to 3600 |
| Default Value | 0 |


#### 2: Acoustic and visual signals On / Off in case of flooding

Parameter allows for LED indicator and acoustic alarm deactivation in case of flooding detection


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 3 |
| Options | Acoustic and visual alarms inactive (0) |
|  | Acoustic alarm inactive, visual alarm active (1) |
|  | Acoustic alarm active, visual alarm inactive (2) |
|  | Acoustic and visual alarms active (3) |


#### 5: Type of alarm frame sent to 1-st association group (FLOOD)

Parameter determines a type of command frame sent by the Sensor in case flooding has been detected or cancelled


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | ALARM WATER (0) |
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


#### 9: Alarm cancelling or turning a device off (Basic) command frame deactivation

Set to 0 to disable all-clear basic set & alarm frame generation. After flooding, device will keep reporting flooding even if flooding ceased.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Alarm (flooding) cancellation inactive (0) |
|  | Alarm (flooding) cancellation active (1) |


#### 10: Interval between successive readings of temperature sensors

Interval between successive readings of temperature in seconds.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_2 |
| Data Type        | INTEGER |
| Range | 1 to 32767 |
| Default Value | 300 |


#### 12: Insensitiveness to temperature changes.

Determines a minimum temperature change value (insensitivity level; def: 0,5C), resulting in a temperature report being sent to the main controller, according to the Parameter 10 settings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_2 |
| Data Type        | INTEGER |
| Range | 0 to 1000 |
| Default Value | 50 |


#### 13: Alarm BROADCAST

Transmit the alarm or control frame in 'broadcast' mode. Information sent in this mode is not repeated by the mesh network.  


##### Overview 

**NOTE:** If the broadcast mode of information transmission is activated for a given alarm, then the information **is not** relayed through the mesh network.  It is only heard by directly reachable devices.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Broadcast inactive (0) |
|  | Flood broadcast mode active, Tamper broadcast mode inactive (1) |
|  | Flood broadcast mode inactive, Tamper broadcast mode active (2) |
|  | Flood and Tamper broadcast mode active (3) |


#### 50: Low temperature alarm threshold

The parameter stores a temperature value (def. 15C), below which LED indicator blinks with a colour determined by a Parameter 61 settings. By default the LED indicator blinks blue.  


##### Overview 

Negative numbers are encoded in U2 (two's compliment) standard.

\-1 actual temperature = 65535 reported

\-10000 = 55536

\-32768 = 32768

32767 = 32767


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_50_2 |
| Data Type        | INTEGER |
| Range | -10000 to 10000 |
| Default Value | 1500 |


#### 51: High temperature alarm threshold

The parameter stores a temperature value (def. 35C), above which LED indicator blinks with a colour determined by the Parameter 62 settings. By default the LED indicator blinks red


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_51_2 |
| Data Type        | INTEGER |
| Range | -10000 to 10000 |
| Default Value | 3500 |


#### 61: Low temperature alarm indicator colour

Default is blue (0x000000FF).  


##### Overview 

**NOTE:** A main controller interprets colours as a sum of it component colours value. Each colours value is a number from 0 to 255. Eg: Indicated colour = 65536 \* RED value + 256 \* GREEN value + BLUE value


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_61_4 |
| Data Type        | INTEGER |
| Range | 0 to 16777215 |
| Default Value | 255 |


#### 62: High temperature alarm indicator colour

Default is red (0x00FF0000). 65535 \* Red + 256 \* Green + Blue  


##### Overview 

**NOTE:** A main controller interprets colours as a sum of it component colours value. Each colours value is a number from 0 to 255. Eg: Indicated colour = 65536 \* RED value + 256 \* GREEN value + BLUE value


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_62_4 |
| Data Type        | INTEGER |
| Range | 0 to 16777215 |
| Default Value | 16711680 |


#### 63: Managing a LED indicator under standard operation

Parameter determines LED indicator’s operation. Set to 0 turns the indicator off, saving a battery life


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_63_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | LED indicator doesn’t indicate the temperature (0) |
|  | LED indicator blinks temperature every measurement (1) |
|  | LED indicator indicates the temperature continuously (2) |


#### 73: Temperature measurement compensation

Parameter stores a temperature value to be added to or deducted from the current temperature measured by internal temperature sensor in order to compensate the difference between air temperature and temperature at the floor level


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_73_2 |
| Data Type        | INTEGER |
| Range | -10000 to 10000 |
| Default Value | 0 |


#### 74: Alarm frame sent to 2-nd Association Group activation

(MOVEMENT\_TAMPER / BUTTON\_TAMPER) The device is able to turn on alarms resulting from sensor’s vibrations e.g. when the sensor is moved, or the TMP button released. 2-nd Association Group alarms are not cancelled.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_74_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | Tamper alarms inactive (0) |
|  | Button tamper alarm active (1) |
|  | Movement tamper alarm active (2) |
|  | Button and movement tampers alarm active (3) |


#### 75: Visual and audible alarms duration

Visual and audible alarm duration  


##### Overview 

User can silence the Flood Sensor. Because the Sensor’s alarm may last for a long time, it’s possible to turn off visual and audible alarm signaling to save battery. The parameter determines a time period after which alarm will become “quiet” - still active but the device will go into battery saving mode.  Visual or acoustic alarm will be reactivated after time period specified in parameter 76.  When alarm status ceases, alarm will be turned off immediately.

Value of 0 means visual and accoustic alarms are active indefinitely.  In battery power mode sensor will never go to sleep which may shorten battery life significantly.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_75_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 0 |


#### 76: Alarm frame / basic set frame retransmission time when flooding

Parameter determines time period after which an alarm frame will be retransmitted. Value of 0 disables alarm frame retransmission.  


##### Overview 

**NOTE:** In case the time period set in this parameter is shorter than the one specified in parameter 75, the device will not quiet the alarm; it will remain active.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_76_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 0 |


#### 77: Flood sensor functionality turned off

Allows for turning of the internal flood sensor. Tamper and built in temperature sensor will remain active


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_77_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Default flood sensor operation (flood detection, reactions) (0) |
|  | Built in flood sensor TURNED OFF (1) |


#### 1: Flood Alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Tilt &amp; Tamper Sensors


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
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/127).
