---
layout: documentation
title: FGFS101 - ZWave
---

{% include base.html %}

# FGFS101 Flood Sensor

This describes the Z-Wave device *FGFS101*, manufactured by *Fibargroup* with the thing type UID of ```fibaro_fgfs101_23_023```. 

Flood Sensor


## Channels
The following table summarises the channels available for the FGFS101 Flood Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
|  | battery-level | system.battery-level |  |  |
| Alarm (flood) | alarm_flood | alarm_flood | Door | Switch |
| Binary Sensor (flood) | sensor_binary1 | sensor_binary | Door | Switch |
| Sensor (temperature) | sensor_temperature2 | sensor_temperature | Temperature | Number |
| Alarm (tamper) | alarm_tamper2 | alarm_tamper |  | Switch |


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
The following table provides a summary of the configuration parameters available in the FGFS101 Flood Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Alarm Cancellation Delay | Additional delay after an alarm has ceased |
| 2: Acoustic and visual signals On / Off in case of flooding | LED indicator and acoustic alarm deactivation |
| 5: Type of alarm frame sent to 1-st association group (FLOOD) | Command frame sent by the Sensor in case flooding |
| 7: Forced Level of Dimming group 1 | Value of the parameter specifying linking to association group no. 1 |
| 9: Alarm cancelling or turning a device off | Allows for deactivating device turn off and alarm cancellation functions |
| 10: Interval between successive readings of temperature sensors | Interval between successive readings of temperature in seconds. |
| 12: Insensitiveness to temperature changes. | Determines a minimum temperature change value (insensitivity level; def: 0,5C) |
| 13: Alarm BROADCAST | Transmitting the alarm or control frame in 'broadcast' mode |
| 50: Low temperature alarm threshold | The parameter stores a temperature value, below which LED indicator blinks. |
| 51: High temperature alarm threshold | The parameter stores a temperature value, above which LED indicator blinks. |
| 61: Low temperature alarm indicator colour | Default is blue (0x000000FF). |
| 62: High temperature alarm indicator colour | Default is red (0x00FF0000). |
| 63: Managing a LED indicator under standard operation | Parameter determines LED indicator’s operation |
| 73: Temperature measurement compensation | Parameter stores a offset value from the current temperature |
| 74: Alarm frame sent to 2-nd Association Group activation | sensor’s vibrations alarm |
| 75: Visual and audible alarms duration | Silence the Flood Sensor. |
| 76: Visual and audible alarms duration | Period after which an alarm frame will be retransmitted |
| 77: Flood sensor functionality turned off | Turning of the internal flood sensor. |
| 1: Flood Alarm |  |
| 2: Tilt Sensor |  |
| 3: Device Status |  |


#### 1: Alarm Cancellation Delay

Additional delay after an alarm has ceased  


##### Overview 

Additional delay after an alarm has ceased. The parameter allows you to specify additional time, after which the alarm is cancelled once its violation has ceased


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_2 |
| Data Type        | INTEGER |
| Range | 0 to 3600 |
| Default Value | 0 |


#### 2: Acoustic and visual signals On / Off in case of flooding

LED indicator and acoustic alarm deactivation  


##### Overview 

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

Command frame sent by the Sensor in case flooding  


##### Overview 

Parameter determines a type of command frame sent by the Sensor in case flooding has been detected or cancelled


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | ALARM WATER (0) |
|  | BASIC_SET (255) |


#### 7: Forced Level of Dimming group 1

Value of the parameter specifying linking to association group no. 1  


##### Overview 

Value of the parameter specifying the forced level of dimming / opening sun blinds when comes *switch on* / *open* command to devices from association group no. 1. In the case of alarm frames the alarm priority is specified. Possible parameter settings.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 255 |


#### 9: Alarm cancelling or turning a device off

Allows for deactivating device turn off and alarm cancellation functions  


##### Overview 

Allows for deactivating device turn off and alarm cancellation functions for the devices assigned to 1-st association group


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Alarm (flooding) cancellation inactive (0) |
|  | Alarm (flooding) cancellation active (1) |


#### 10: Interval between successive readings of temperature sensors

Interval between successive readings of temperature in seconds.  


##### Overview 

Interval between successive readings of temperature from all sensors connected to the device in seconds.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_2 |
| Data Type        | INTEGER |
| Range | 1 to 32767 |
| Default Value | 300 |


#### 12: Insensitiveness to temperature changes.

Determines a minimum temperature change value (insensitivity level; def: 0,5C)  


##### Overview 

Determines a minimum temperature change value (insensitivity level; def: 0,5C), resulting in a temperature report being sent to the main controller, according to the Parameter 10 settings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_2 |
| Data Type        | INTEGER |
| Range | 0 to 1000 |
| Default Value | 50 |


#### 13: Alarm BROADCAST

Transmitting the alarm or control frame in 'broadcast' mode  


##### Overview 

Transmitting the alarm or control frame in 'broadcast' mode (i.e. to all devices within range), information sent in this mode is not repeated by the mesh network. NOTE: If the broadcast mode of information transmission is activated for a given 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Broadcast inactive (0) |
|  | Flood broadcast mode active, Tamper broadcast mode inactive (1) |
|  | Tamper broadcast mode inactive, Tamper broadcast mode active (2) |
|  | Flood and Tamper broadcast mode active (3) |


#### 50: Low temperature alarm threshold

The parameter stores a temperature value, below which LED indicator blinks.  


##### Overview 

The parameter stores a temperature value (def. 15C), below which LED indicator blinks with a colour determined by a Parameter 61 settings. By default the LED indicator blinks blue. NOTE: The main controller does not interpret negative numbers 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_50_2 |
| Data Type        | INTEGER |
| Range | -10000 to 10000 |
| Default Value | 1500 |


#### 51: High temperature alarm threshold

The parameter stores a temperature value, above which LED indicator blinks.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_51_2 |
| Data Type        | INTEGER |
| Range | -10000 to 10000 |
| Default Value | 3500 |


#### 61: Low temperature alarm indicator colour

Default is blue (0x000000FF).  


##### Overview 

Default is blue (0x000000FF). NOTE: A main controller interprets colours as a sum of it component colours value. Each colours value is a number from 0 to 255. Eg: Indicated colour = 65536 \* RED value + 256 \* GREEN value + BLUE value


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_61_4 |
| Data Type        | INTEGER |
| Range | 0 to 16777215 |
| Default Value | 255 |


#### 62: High temperature alarm indicator colour

Default is red (0x00FF0000).  


##### Overview 

Default is red (0x00FF0000). NOTE: A main controller interprets colours as a sum of it component colours value. Each colours value is a number from 0 to 255. Eg: Indicated colour = 65536 \* RED value + 256 \* GREEN value + BLUE value


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_62_4 |
| Data Type        | INTEGER |
| Range | 0 to 16777215 |
| Default Value | 16711680 |


#### 63: Managing a LED indicator under standard operation

Parameter determines LED indicator’s operation  


##### Overview 

Parameter determines LED indicator’s operation. Set to 0 turns the indicator off, saving a battery life


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_63_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | LED indicator doesn’t indicate the temperature (0) |
|  | LED indicator indicates the temperature (blink) (1) |
|  | LED indicator indicates the temperature continuously (2) |


#### 73: Temperature measurement compensation

Parameter stores a offset value from the current temperature  


##### Overview 

Parameter stores a temperature value to be added to or deducted from the current temperature measured by internal temperature sensor in order to compensate the difference between air temperature and temperature at the floor level


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_73_2 |
| Data Type        | INTEGER |
| Range | -10000 to 10000 |
| Default Value | 0 |


#### 74: Alarm frame sent to 2-nd Association Group activation

sensor’s vibrations alarm  


##### Overview 

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

Silence the Flood Sensor.  


##### Overview 

The user can silence the Flood Sensor. Because the Sensor’s alarm may last for a long time, it’s possible to turn off visual and audible alarm signaling to save battery. The parameter determines a time period after which alarm will become “quiet” - still 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_75_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 0 |


#### 76: Visual and audible alarms duration

Period after which an alarm frame will be retransmitted  


##### Overview 

Parameter determines a time period after which an alarm frame will be retransmitted. The value of 0 cancels an alarm frame retransmission. The value of 65535 means 'each 1 second'. NOTE: In case a time period set in this parameter is shorter th


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_76_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 0 |


#### 77: Flood sensor functionality turned off

Turning of the internal flood sensor.  


##### Overview 

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


#### 2: Tilt Sensor


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
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/408).
