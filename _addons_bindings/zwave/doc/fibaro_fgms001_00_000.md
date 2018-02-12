---
layout: documentation
title: FGMS001 - ZWave
---

{% include base.html %}

# FGMS001 Motion Sensor

This describes the Z-Wave device *FGMS001*, manufactured by *Fibargroup* with the thing type UID of ```fibaro_fgms001_00_000```. 

Motion Sensor


## Channels
The following table summarises the channels available for the FGMS001 Motion Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Motion Alarm | alarm_motion | alarm_motion | Door | Switch |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Sensor (luminance) | sensor_luminance | sensor_luminance | Temperature | Number |
|  | battery-level | system.battery-level |  |  |
| Tamper Alarm | alarm_tamper | alarm_tamper |  | Switch |


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
The following table provides a summary of the configuration parameters available in the FGMS001 Motion Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Motion Sensor&#x27;s Sensitivity | The lower the value, the more sensitive the PIR sensor. |
| 2: Motion Sensor&#x27;s Blind Time (Insensitive) | Period of time through which the PIR sensor is “blind”. |
| 3: PIR Sensor’s “PULSE COUNTER” | Sets the number of moves required for the PIR sensor to report motion. |
| 4: PIR Sensor’s “WINDOW TIME” | The higher the value, the more sensitive the PIR sensor. |
| 6: Motion Alarm Cancellation Delay | Period of time after wich Motion alarm will be cancelled. |
| 8: PIR Sensor Operating Mode | The parameter determines the part of day in which the PIR sensor will be active. |
| 9: Night / Day | The parameter defines the difference between night and day. |
| 12: BASIC command class configuration | Determines the command frames sent in 1-st association group. |
| 14: BASIC ON command frame value | The value of 255 allows to turn ON a device. |
| 16: BASIC OFF command frame value | The value of 0 allows to turn OFF a device. |
| 20: Tamper Sensitivity | The parameter determines the changes in forces. |
| 22: Tamper - alarm cancellation delay | Time period after which a tamper alarm will be cancelled. |
| 24: Tamper Operating Modes | The parameter determines the behaviour of tamper and how it reports. |
| 26: Tamper Alarm Broadcast Mode | Alarm frame will or will not be sent in broadcast mode. |
| 40: Illumination Report Threshold | Change in level of light intensity resulting in illumination report. |
| 42: Illumination Reports Interval | Time interval between consecutive illumination reports. |
| 60: Temperature Report Threshold | Change in level of temperature resulting in temperature report. |
| 62: Interval of Temperature Measuring | The parameter determines how often the temperature will be measured. |
| 64: Temperature Reports Interval | How often temperature reports will be sent to the main controller. |
| 66: Temperature Offset | The value to be added to the actual measured temperature. |
| 80: LED Signalling Mode | Way in which LED diode behaves after motion has been detected. |
| 81: LED Brightness | The parameter determines the brightness of LED when indicating motion. |
| 82: Ambient Illumination Level | Below which LED brightness is set to 1% |
| 83: Ambient Illumination Level | Above which LED brightness is set to 100% |
| 86: Min Temperature Resulting in Blue LED Illumination | This parameter is relevant only when parameter 80 has been properly configured. |
| 87: Max Temperature Resulting in Red LED Illumination | This parameter is relevant only when parameter 80 has been properly configured. |
| 89: LED indicating Tamper Alarm | Indicating mode resembles a police car (white, red and blue). |
| 1: Device Status |  |
| 2: Tamper Alarm |  |
| 3: Controller Updates |  |


#### 1: Motion Sensor&#x27;s Sensitivity

The lower the value, the more sensitive the PIR sensor.  


##### Overview 

The lower the value, the more sensitive the PIR sensor. Available settings: 8 - 255.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 8 to 255 |
| Default Value | 10 |


#### 2: Motion Sensor&#x27;s Blind Time (Insensitive)

Period of time through which the PIR sensor is “blind”.  


##### Overview 

Period of time through which the PIR sensor is “blind” (insensitive) to motion. After this time period the PIR sensor will be again able to detect motion. The longer the insensitivity period, the longer the battery life. If the sensor is required to detect motion quickly, the time period may be shortened. The time of insensitivity should be shorter that the time period set in parameter 6.  
Available settings: 0 - 15  
Formula to calculate the time: time \[s\] = 0.5 x (value + 1)  
Default setting: 15 (8 seconds)  
Parameter size: 1 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 0 to 15 |
| Default Value | 15 |


#### 3: PIR Sensor’s “PULSE COUNTER”

Sets the number of moves required for the PIR sensor to report motion.  


##### Overview 

Sets the number of moves required for the PIR sensor to report motion. The lower the value, the less sensitive the PIR sensor. It’s not recommended to modify this parameter settings.  
Available settings: 0 - 3  
Formula to calculate the number of pulses: pulses = (value + 1) Default setting: 1 (2 pulses)  
Parameter size: 1 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 0 to 3 |
| Default Value | 1 |


#### 4: PIR Sensor’s “WINDOW TIME”

The higher the value, the more sensitive the PIR sensor.  


##### Overview 

Period of time during which the number of moves set in parameter 3 must be detected in order for the PIR sensor to report motion. The higher the value, the more sensitive the PIR sensor. It’s not recommended to modify this parameter setting.  
Available settings: 0 - 3  
Formula to calculate the time: time \[s\] = 4 x (value + 1)  
Default setting: 2 (12 seconds)  
Parameter size: 1 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 0 to 3 |
| Default Value | 2 |


#### 6: Motion Alarm Cancellation Delay

Period of time after wich Motion alarm will be cancelled.  


##### Overview 

Motion alarm will be cancelled in the main controller and the associated devices after the period of time set in this parameter. Any motion detected during the cancellation delay time countdown will result in the countdown being restarted. In case of small values, below 10 seconds, the value of parameter 2 must be modified (PIR sensor’s “Blind Time”).  
Available settings: 1 - 65535  
Default setting: 30 (30 seconds)  
Parameter size: 2 \[bytes\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_2 |
| Data Type        | INTEGER |
| Range | 1 to 65535 |
| Default Value | 30 |


#### 8: PIR Sensor Operating Mode

The parameter determines the part of day in which the PIR sensor will be active.  


##### Overview 

The parameter determines the part of day in which the PIR sensor will be active. This parameter influences only the motion reports and associations. Tamper, light intensity and temperature measurements will be still active, regardless of this parameter settings. 0 - PIR sensor always active 1 - PIR sensor active during the day only 2 - PIR sensor active during the night only. Default setting: 0 Parameter size: 1 \[byte\] 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | PIR sensor always active (0) |
|  | PIR sensor active during the day only (1) |
|  | PIR sensor active during the night only (2) |


#### 9: Night / Day

The parameter defines the difference between night and day.  


##### Overview 

The parameter defines the difference between night and day, in terms of light intensity, used in parameter 8. Available settings: 1 - 65535 Default setting: 200 (200 lux) Parameter size: 2 \[bytes\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_2 |
| Data Type        | INTEGER |
| Range | 1 to 65535 |
| Default Value | 200 |


#### 12: BASIC command class configuration

Determines the command frames sent in 1-st association group.  


##### Overview 

The parameter determines the command frames sent in 1-st association group, assigned to PIR sensor.  
0 - BASIC ON and BASIC OFF command frames sent in Basic Command Class.  
1 - only the BASIC ON command frame sent in Basic Command Class.  
2 - only the BASIC OFF command frame sent in Basic CommandClass.  
Values of BASIC ON and BASIC OFF command frames may be modified by dedicated parameters.  
Default setting: 0 Parameter size: 1 \[byte\] 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | BASIC ON and BASIC OFF (0) |
|  | Only the BASIC ON (1) |
|  | Only the BASIC OFF (2) |


#### 14: BASIC ON command frame value

The value of 255 allows to turn ON a device.  


##### Overview 

The value of 255 allows to turn ON a device. In case of the Dimmer, the value of 255 means turning ON at the last memorized state, e.g. the Dimmer turned ON at 30% and turned OFF using the value of 255, and then turned OFF, will be turned ON at 30%, i.e. the last memorized state.  
Available settings: 0 - 255  
Default setting: 255  
Parameter size: 1 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 255 |


#### 16: BASIC OFF command frame value

The value of 0 allows to turn OFF a device.  


##### Overview 

The command frame sent at the moment of motion alarm cancellation, after the cancellation delay time, specified in parameter 6, has passed. The value of 0 allows to turn a device OFF while the value of 255 allows to turn ON a device. In case of the Dimmer, the value of 255 means turning ON at the last memorized state, e.g. the Dimmer turned ON at 30% and turned OFF using the value of 255, and then turned OFF, will be turned ON at 30%, i.e. the last memorized state.  
Available settings: 0 - 255  
Default setting: 0  
Parameter size: 1 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_16_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 20: Tamper Sensitivity

The parameter determines the changes in forces.  


##### Overview 

The parameter determines the chages in forces acting on the Fibaro Motion Sensor resulting in tamper alarm being reported - g-force acceleration.  
Available settigs: 0 - 122 (0.08 - 2g; multiply by 0.016g; 0 = tamper inactive)  
Default setting: 15 (0.224g)  
Parameter size: 1 \[byte\] 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_20_1 |
| Data Type        | INTEGER |
| Range | 0 to 122 |
| Default Value | 15 |


#### 22: Tamper - alarm cancellation delay

Time period after which a tamper alarm will be cancelled.  


##### Overview 

Time period after which a tamper alarm will be cancelled. Another tampering detected durig the countdown to cancellation will not extend the delay.  
Available settings: 1 - 65535  
Default setting: 30 (seconds)  
Parameter size: 2 \[bytes\] 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_22_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 30 |


#### 24: Tamper Operating Modes

The parameter determines the behaviour of tamper and how it reports.  


##### Overview 

The parameter determines the behaviour of tamper and how it reports. 

0 – Tamper alarm is reported in Sensor Alarm command class / Cancellation is not reported.

1 – Tamper alarm is reported in Sensor Alarm command class / Cancellation is reported in Sensor Alarm commad class after the time period set in parameter 22 (Tamper Alarm Cancellation Delay) 2 - Tamper alarm is reported in Sensor Alarm command class / Cancellation is not reported. Sensor’s orientation in space is reported in Fibar Commad Class after the time period set in paramer 22.

3 - Tamper alarm is reported in Sensor Alarm command class / Cancellation is reported in Sensor Alarm commad class after the time period set in parameter 22. Sensor’s orientation in space is reported in Fibar Commad Class after the time period set in paramer 22.   4 - The maximum level of vibrations recorded in the time period set in parameter 22 is reported. Reports stop being sent when the vibrations cease. The reports are sent in Sensor Alarm command class. Value displayed in the “value” field (0 - 100) depends on the vibrations force. Reports to the association groups are sent using Sensor Alarm command class.   Available settings: 0 or 255 Default setting: 0 Parameter size: 1 \[byte\] 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_24_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Tamper alarm is reported / Cancellation is not reported. (0) |
|  | Tamper alarm is reported / Cancellation is reported. (1) |
|  | Same as Value 0 / with unsupported Fibar Command Class. (2) |
|  | Same as Value 1 / with unsupported Fibar Command Class. (3) |
|  | The maximum level of vibrations recorded in the time period. (4) |


#### 26: Tamper Alarm Broadcast Mode

Alarm frame will or will not be sent in broadcast mode.  


##### Overview 

The parameter determines whether the tamper alarm frame will or will not be sent in broadcast mode. Alarm frames sent in broadcast mode may be received by all of the devices within communication range (if they accept such frames).

0 - Tamper alarm is not sent in broadcast mode.

1 - Tamper alarm sent in broadcast mode.

Default setting: 0  
Parameter size: 1 \[byte\] 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_26_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Tamper alarm is not sent in broadcast mode. (0) |
|  | Tamper alarm sent in broadcast mode. (1) |


#### 40: Illumination Report Threshold

Change in level of light intensity resulting in illumination report.  


##### Overview 

The parameter determines the change in light intensity level resulting in illumination report being sent to the main controller.

Available settings: 0 - 65535 (1 - 65535 lux; 0 = reports are not sent)

Default setting: 200 (200 lux) Parameter size: 2 \[byte\] 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_40_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 200 |


#### 42: Illumination Reports Interval

Time interval between consecutive illumination reports.  


##### Overview 

Time interval between consecutive illumination reports. The reports are sent even if there are no changes in the light intensity.

Available settings: 0 - 65535 (1 - 65535 seconds; 0 = reports are not sent)

Default setting: 0 (no reports) Parameter size: 2 \[bytes\] 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_42_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 0 |


#### 60: Temperature Report Threshold

Change in level of temperature resulting in temperature report.  


##### Overview 

The parameter determines the change in level of temperature resulting in temperature report being sent to the main controller.  
Available settings: 0 - 255 (0.1 - 25.5oC; 0 = reports are not sent)  
Default setting: 10 (1oC) Parameter size: 1 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_60_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 10 |


#### 62: Interval of Temperature Measuring

The parameter determines how often the temperature will be measured.  


##### Overview 

The parameter determines how often the temperature will be measured. The shorter the time, the more frequently the temperature will be measured, but the battery life will shorten.  
Available settings: 0 - 65535 (1 - 65535 seconds; 0 = temperature will not be measured)  
Default setting: 900 (900 seconds)  
Parameter size: 2 \[bytes\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_62_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 900 |


#### 64: Temperature Reports Interval

How often temperature reports will be sent to the main controller.  


##### Overview 

The parameter determines how often the temperature reports will be sent to the main controller.  
Available settings: 0 - 65535 (1 - 65535 seconds; 0 = reports are not sent)  
Default setting: 0 Parameter size: 2 \[byte\] 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_64_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 0 |


#### 66: Temperature Offset

The value to be added to the actual measured temperature.  


##### Overview 

The value to be added to the actual temperature, measured by the sensor (temperature compensation).  
Available settings: -100 to 100 degrees Celsius  
Default setting: 0 Parameter size: 2 \[bytes\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_66_2 |
| Data Type        | INTEGER |
| Range | -100 to 100 |
| Default Value | 0 |


#### 80: LED Signalling Mode

Way in which LED diode behaves after motion has been detected.  


##### Overview 

The parameter determines the way in which LED diode behaves after motion has been detected.  
Values from 1 to 9 = single long blink at the moment of reporting motion. No other motion will be indicated until alarm is cancelled.  
Values from 10 to 18 = single long blink at the moment of reporting motion and one short blink each time the motion is detected again.  
Values from 19 to 26 = single long blink at the moment of reporting motion and two short blinks each time the motion is detected again.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_80_1 |
| Data Type        | INTEGER || Default Value | 10 |
| Options | LED inactive. (0) |
|  | LED colour depends on the temperature (1) |
|  | Flashlight mode - LED glows in white for 10 seconds. (2) |
|  | White. (3) |
|  | Red. (4) |
|  | Green. (5) |
|  | Blue. (6) |
|  | Yellow. (7) |
|  | Cyan. (8) |
|  | Magenta. (9) |
|  | LED colour depends on the temperature (10) |
|  | Flashlight mode (11) |
|  | White. (12) |
|  | Red. (13) |
|  | Green. (14) |
|  | Blue. (15) |
|  | Yellow. (16) |
|  | Cyan. (17) |
|  | Magenta. (18) |
|  | LED colour depends on the temperature (19) |
|  | White. (20) |
|  | Red. (21) |
|  | Green. (22) |
|  | Blue. (23) |
|  | Yellow. (24) |
|  | Cyan. (25) |
|  | Magenta. (26) |


#### 81: LED Brightness

The parameter determines the brightness of LED when indicating motion.  


##### Overview 

The parameter determines the brightness of LED when indicating motion.  
Available settings: 0 - 100 (1 - 100%; 0 = brightness determined by the ambient lighting - see parameters 82 and 83)  
Default setting: 50 Parameter size: 1 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_81_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 50 |


#### 82: Ambient Illumination Level

Below which LED brightness is set to 1%  


##### Overview 

The parameter is relevant only when the parameter 81 is set to 0.

Available settings: 0 to parameter 83 value  
Default setting: 100 (100 lux)  
Parameter size: 2 \[bytes\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_82_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 100 |


#### 83: Ambient Illumination Level

Above which LED brightness is set to 100%  


##### Overview 

The parameter is relevant only when the parameter 81 is set to 0.

Available settings: parameter 82 value to 65535  
Default setting: 1 000 (1 000 lux)  
Parameter size: 2 \[bytes\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_83_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 1000 |


#### 86: Min Temperature Resulting in Blue LED Illumination

This parameter is relevant only when parameter 80 has been properly configured.  


##### Overview 

This parameter is relevant only when parameter 80 has been properly configured.  
Available settings: 0 to parameter 87 value (degrees celsius)  
Default setting: 18 (18oC)  
Parameter size: 1 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_86_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 18 |


#### 87: Max Temperature Resulting in Red LED Illumination

This parameter is relevant only when parameter 80 has been properly configured.  


##### Overview 

This parameter is relevant only when parameter 80 has been properly configured.  
Available settings: parameter 86 value to 255 (degrees celsius)  
Default setting: 28 (28oC)  
Parameter size: 1 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_87_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 28 |


#### 89: LED indicating Tamper Alarm

Indicating mode resembles a police car (white, red and blue).  


##### Overview 

Indicating mode resembles a police car (white, red and blue).

0 - LED does not indicate tamper alarm.

1 - LED indicates tamper alarm.

Default setting: 1 Parameter size: 1 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_89_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | LED does not indicate tamper alarm. (0) |
|  | LED indicates tamper alarm. (1) |


#### 1: Device Status


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Tamper Alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Controller Updates


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/115).
