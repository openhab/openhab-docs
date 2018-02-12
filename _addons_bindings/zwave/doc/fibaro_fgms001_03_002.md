---
layout: documentation
title: FGMS001 - ZWave
---

{% include base.html %}

# FGMS001 Motion Sensor

This describes the Z-Wave device *FGMS001*, manufactured by *Fibargroup* with the thing type UID of ```fibaro_fgms001_03_002```. 

Motion Sensor


## Channels
The following table summarises the channels available for the FGMS001 Motion Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Sensor (seismic intensity) | sensor_seismicintensity | sensor_seismicintensity | Humidity | Number |
| Sensor (luminance) | sensor_luminance | sensor_luminance | Temperature | Number |
| Motion Alarm | alarm_motion | alarm_motion | Door | Switch |
| Tamper Alarm | alarm_tamper | alarm_tamper |  | Switch |
|  | battery-level | system.battery-level |  |  |
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
The following table provides a summary of the configuration parameters available in the FGMS001 Motion Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Motion detection - sensitivity | The lower the value, the more sensitive the PIR sensor. |
| 2: Motion detection - blind time | Period of time through which the PIR sensor is “blind”. |
| 3: Motion detection - pulse counter | Sets the number of moves required for the PIR sensor to report motion. |
| 4: Motion detection - window time | The higher the value, the more sensitive the PIR sensor. |
| 6: Motion detection - alarm cancellation delay | Period of time after wich Motion alarm will be cancelled. |
| 8: Motion detection - operating mode | The parameter determines the part of day in which the PIR sensor will be active. |
| 9: Motion detection - night/day | The parameter defines the difference between night and day. |
| 12: BASIC command class configuration | Determines the command frames sent in 1-st association group. |
| 14: BASIC ON command frame value | The value of 255 allows to turn ON a device. |
| 16: BASIC OFF command frame value | The value of 0 allows to turn OFF a device. |
| 18: Associations in Z-Wave network Security Mode | This parameter defines how commands are sent in specified association groups |
| 20: Tamper - sensitivity | Change in force that will result in tamper alarm |
| 22: Tamper - alarm cancellation delay | Time period after which a tamper alarm will be cancelled. |
| 24: Tamper - operating modes | This parameter determines function of the tamper and sent reports |
| 25: Tamper - alarm cancellation | This parameter allows to disable cancellation of the tamper alarm. |
| 28: Tamper - broadcast mode | Determines whether the tamper alarm frame will be sent in broadcast mode |
| 29: Tamper - backward compatible broadcast mode | Determines whether the tamper alarm frame will be sent in broadcast mode |
| 40: Illuminance report - threshold | Change in light intensity level resulting in illumination report |
| 42: Illuminance report - interval | Time interval between consecutive illumination reports |
| 60: Temperature report - threshold | The change in temperature resulting in temperature report |
| 62: Temperature measuring - interval | How often the temperature will be measured |
| 64: Temperature report - interval | How often the temperature reports will be sent |
| 66: Temperature offset | Value added to the actual temperature |
| 80: LED - signalling mode | LED signalling mode |
| 81: LED - brightness | LED brightness |
| 82: LED - illuminance for low indicator brightness | Light intensity level below which brightness of visual indicator is set to 1%. |
| 83: LED - illuminance for high indicator brightness | Light intensity level above which brightness of visual indicator is set to 100%. |
| 86: LED - temperature for blue colour | Minimum temperature resulting in blue LED illumination |
| 87: LED - temperature for red colour | Minimum temperature resulting in red LED illumination |
| 89: LED - tamper alarm | Indicating mode resembles a police car (white, red and blue |
| 1: Lifeline | Device status |
| 2: Motion |  |
| 3: Tamper |  |
| 4: Motion BC | Motion BC (backward compatibility) |
| 5: Tamper BC | Tamper BC (backward compability) |


#### 1: Motion detection - sensitivity

The lower the value, the more sensitive the PIR sensor.  


##### Overview 

The lower the value, the more sensitive the PIR sensor. Available settings: 8 - 255.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_2 |
| Data Type        | INTEGER |
| Range | 8 to 255 |
| Default Value | 15 |


#### 2: Motion detection - blind time

Period of time through which the PIR sensor is “blind”.  


##### Overview 

Period of time through which the PIR sensor is “blind” (insensitive) to motion. After this time period the PIR sensor will be again able to detect motion. The longer the insensitivity period, the longer the battery life. If the sensor is required to detect motion quickly, the time period may be shortened. The time of insensitivity should be shorter that the time period set in parameter 6.  
Available settings: 0 - 15  
Formula to calculate the time: time \[s\] = 0.5 x (value + 1)  
Default setting: 3 (1.5 seconds)  
Parameter size: 1 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 0 to 15 |
| Default Value | 3 |


#### 3: Motion detection - pulse counter

Sets the number of moves required for the PIR sensor to report motion.  


##### Overview 

Sets the number of moves required for the PIR sensor to report motion. The lower the value, the less sensitive the PIR sensor. It’s not recommended to modify this parameter settings.  
Available settings: 0 - 3  
Formula to calculate the number of pulses: pulses = (value + 1) Default setting: 1 (2 pulses)  
Parameter size: 1 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | 1 pulse (0) |
|  | 2 pulses (1) |
|  | 3 pulses (2) |
|  | 4 pulses (3) |


#### 4: Motion detection - window time

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
| Data Type        | INTEGER || Default Value | 2 |
| Options | 4 seconds (0) |
|  | 8 seconds (1) |
|  | 12 seconds (2) |
|  | 16 seconds (3) |


#### 6: Motion detection - alarm cancellation delay

Period of time after wich Motion alarm will be cancelled.  


##### Overview 

Motion alarm will be cancelled in the main controller and the associated devices after the period of time set in this parameter. Any motion detected during the cancellation delay time countdown will result in the countdown being restarted. In case of small values, below 10 seconds, the value of parameter 2 must be modified (PIR sensor’s “Blind Time”).  
Available settings: 1 - 32767  
Default setting: 30 (30 seconds)  
Parameter size: 2 \[bytes\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_2 |
| Data Type        | INTEGER |
| Range | 1 to 32767 |
| Default Value | 30 |


#### 8: Motion detection - operating mode

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


#### 9: Motion detection - night/day

The parameter defines the difference between night and day.  


##### Overview 

The parameter defines the difference between night and day, in terms of light intensity, used in parameter 8. Available settings: 1 - 32767 Default setting: 200 (200 lux) Parameter size: 2 \[bytes\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_2 |
| Data Type        | INTEGER |
| Range | 1 to 32767 |
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
Parameter size: 2 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 255 |


#### 16: BASIC OFF command frame value

The value of 0 allows to turn OFF a device.  


##### Overview 

The command frame sent at the moment of motion alarm cancellation, after the cancellation delay time, specified in parameter 6, has passed. The value of 0 allows to turn a device OFF while the value of 255 allows to turn ON a device. In case of the Dimmer, the value of 255 means turning ON at the last memorized state, e.g. the Dimmer turned ON at 30% and turned OFF using the value of 255, and then turned OFF, will be turned ON at 30%, i.e. the last memorized state.  
Available settings: 0 - 255  
Default setting: 0  
Parameter size: 2 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_16_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 18: Associations in Z-Wave network Security Mode

This parameter defines how commands are sent in specified association groups  


##### Overview 

This parameter defines how commands are sent in specified association groups: as secure or non-secure. Parameter is Active only in Z-Wave network security mode. It doesn’t apply to 1st Lifeline group.

Available settings: 0 - 15  
0 - all groups sent as non-secure  
1 - 2nd group sent as secure  
2 - 3rd group sent as secure  
4 - 4th group sent as secure  
8 - 5th group sent as secure

Parameter values may be combined, e.g. 1+2=3 means that 2nd &  
3rd group are sent as secure.

Default setting: 15 (all groups sent as secure)  
Parameter size: 1 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_18_1 |
| Data Type        | INTEGER |
| Range | 0 to 15 |
| Default Value | 15 |


#### 20: Tamper - sensitivity

Change in force that will result in tamper alarm  


##### Overview 

This parameter determines the change in force acting on the device, that will result in reporting tamper alarm - g-force acceleration.

Available settigs: 0 - 121 (0.08 - 2g; multiply by 0.016g; 0 = tamper inactive)  
Default setting: 15 (0.320g)  
Parameter size: 1 \[byte\] 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_20_1 |
| Data Type        | INTEGER |
| Range | 0 to 121 |
| Default Value | 20 |


#### 22: Tamper - alarm cancellation delay

Time period after which a tamper alarm will be cancelled.  


##### Overview 

Time period after which a tamper alarm will be cancelled in the main controller and associated devices.

Available settings: 1 - 32767  
Default setting: 30 (seconds)  
Parameter size: 2 \[bytes\] 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_22_2 |
| Data Type        | INTEGER |
| Range | 1 to 32767 |
| Default Value | 30 |


#### 24: Tamper - operating modes

This parameter determines function of the tamper and sent reports  


##### Overview 

This parameter determines function of the tamper and sent reports. It is an advanced feature serving much more functions than just detection of tampering.

0 – Only tamper (default)  
1 – Tamper and earthquake detector. Function may be used as a simple seismograph. Two reports including the strength of shock are  
always sent. First, right after the detection and second (value=0) after tamper alarm cancellation delay time.  
2 – Tamper and orientation in space. Three reports are sent right after tamper alarm cancellation delay time.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_24_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Only tamper (default) (0) |
|  | Tamper and earthquake detector (1) |
|  | Tamper and orientation in space (2) |


#### 25: Tamper - alarm cancellation

This parameter allows to disable cancellation of the tamper alarm.  


##### Overview 

0 - Do not send tamper cancellation report  
1 - Send tamper cancellation report


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_25_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Do not send tamper cancellation report (0) |
|  | Send tamper cancellation report (1) |


#### 28: Tamper - broadcast mode

Determines whether the tamper alarm frame will be sent in broadcast mode  


##### Overview 

The parameter determines whether the tamper alarm frame will or will not be sent in broadcast mode. Alarm frames sent in broadcast mode can be received by all of the devices within Communication range (if they accept such frames). When Fibaro Motion Sensor is operating in protected mode (secure mode), the value should remain default. Device operating in protected mode doesn’t send frames in broadcast mode.

0 - Tamper alarm reported to association groups.  
1 - Tamper alarm reported in broadcast mode to 3rd association group.

Default setting: 0  
Parameter size: 1 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_28_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Reported to association groups. (0) |
|  | Reported in broadcast mode to 3rd association group. (1) |


#### 29: Tamper - backward compatible broadcast mode

Determines whether the tamper alarm frame will be sent in broadcast mode  


##### Overview 

The parameter determines whether the tamper alarm frame will or will not be sent in broadcast mode. Alarm frames sent in broadcast mode can be received by all of the devices within Communication range (if they accept such frames). When Fibaro Motion Sensor is operating in protected mode (secure mode), the value should remain default. Device operating in protected mode doesn’t send frames in broadcast mode.

0 - Tamper alarm reported to association groups.  
1 - Tamper alarm reported in broadcast mode to 5th association group.

Default setting: 0  
Parameter size: 1 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_29_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Reported to association groups. (0) |
|  | Reported in broadcast mode to 5th association group. (1) |


#### 40: Illuminance report - threshold

Change in light intensity level resulting in illumination report  


##### Overview 

The parameter determines the change in light intensity level resulting in illumination report being sent to the main controller.

Available settings: 0 - 32767 (1-32767 lux; 0=reports are not sent)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_40_2 |
| Data Type        | INTEGER |
| Range | 0 to 32767 |
| Default Value | 200 |


#### 42: Illuminance report - interval

Time interval between consecutive illumination reports  


##### Overview 

Time interval between consecutive illumination reports.  
The reports are sent even if there are no changes in the light intensity.

Available settings: 0 - 32767 (1-32767 seconds; 0 = no reports)  
Default setting: 3600


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_42_2 |
| Data Type        | INTEGER |
| Range | 0 to 32767 |
| Default Value | 3600 |


#### 60: Temperature report - threshold

The change in temperature resulting in temperature report  


##### Overview 

The parameter determines the change in level of temperature resulting in temperature report being sent to the main controller.  
Available settings: 0 - 255 (0.1 - 25.5oC; 0 = reports are not sent)  
Default setting: 10 (1oC) Parameter size: 2 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_60_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 20 |


#### 62: Temperature measuring - interval

How often the temperature will be measured  


##### Overview 

The parameter determines how often the temperature will be measured. The shorter the time, the more frequently the temperature will be measured, but the battery life will shorten.  
Available settings: 0 - 32767 (1 - 32767 seconds; 0 = temperature will not be measured)  
Default setting: 900 (900 seconds)  
Parameter size: 2 \[bytes\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_62_2 |
| Data Type        | INTEGER |
| Range | 0 to 32767 |
| Default Value | 900 |


#### 64: Temperature report - interval

How often the temperature reports will be sent  


##### Overview 

The parameter determines how often the temperature reports will be sent to the main controller.  
Available settings: 0 - 32767 (1 - 32767 seconds; 0 = no reports)  
Default setting: 0 Parameter size: 2 \[byte\] 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_64_2 |
| Data Type        | INTEGER |
| Range | 0 to 32767 |
| Default Value | 0 |


#### 66: Temperature offset

Value added to the actual temperature  


##### Overview 

The value to be added to the actual temperature, measured by the sensor (temperature compensation).  
Available settings: -1000 – 1000 (-1000-1000°C, 1°C step)  
Default setting: 0 Parameter size: 2 \[bytes\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_66_2 |
| Data Type        | INTEGER |
| Range | -1000 to 1000 |
| Default Value | 0 |


#### 80: LED - signalling mode

LED signalling mode  


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


#### 81: LED - brightness

LED brightness  


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


#### 82: LED - illuminance for low indicator brightness

Light intensity level below which brightness of visual indicator is set to 1%.  


##### Overview 

AMBIENT ILLUMINATION LEVEL BELOW WHICH LED BRIGHTNESS IS SET TO 1%

The parameter is relevant only when the parameter 81 is set to 0.  
Available settings: 0 to parameter 83 value  
Default setting: 100 (100 lux)  
Parameter size: 2 \[bytes\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_82_2 |
| Data Type        | INTEGER |
| Range | 0 to 32767 |
| Default Value | 100 |


#### 83: LED - illuminance for high indicator brightness

Light intensity level above which brightness of visual indicator is set to 100%.  


##### Overview 

ABOVE WHICH LED BRIGHTNESS IS SET TO 100%

The parameter is relevant only when the parameter 81 is set to 0.  
Available settings: parameter 82 value to 65535  
Default setting: 1 000 (1 000 lux)  
Parameter size: 2 \[bytes\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_83_2 |
| Data Type        | INTEGER |
| Range | 0 to 32767 |
| Default Value | 1000 |


#### 86: LED - temperature for blue colour

Minimum temperature resulting in blue LED illumination  


##### Overview 

This parameter is relevant only when parameter 80 has been properly configured.  
Available settings: 0 to parameter 87 value (degrees celsius)  
Default setting: 18 (18oC)  
Parameter size: 2 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_86_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 18 |


#### 87: LED - temperature for red colour

Minimum temperature resulting in red LED illumination  


##### Overview 

This parameter is relevant only when parameter 80 has been properly configured.  
Available settings: parameter 86 value to 255 (degrees celsius)  
Default setting: 28 (28oC)  
Parameter size: 2 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_87_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 28 |


#### 89: LED - tamper alarm

Indicating mode resembles a police car (white, red and blue


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_89_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | LED does not indicate tamper alarm. (0) |
|  | LED indicates tamper alarm. (1) |


#### 1: Lifeline

Device status  


##### Overview 

"Lifeline" is a reporting group, assigned to the device status. Main Z-Wave+ network controller should be added to this group. The "Lifeline" group can handle only one device. If Fibaro Motion Sensor operates in protected mode, outgoing messages are always encrypted.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Motion

  


##### Overview 

"Motion" is assigned to the motion sensor. At the moment of motion detection or alarm state cancellation, nodes added to this group will receive control frames. The "Motion" group can handle up to five devices (one or multi-channel). If Fibaro Motion Sensor operates in protected mode, outgoing messages are encrypted, depending on whether the added node also operates in secure mode.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Tamper

  


##### Overview 

"Tamper" is assigned to the tamper alarm. Once tampering is detected or cancelled, nodes added to this group will receive alarm frames. The "Tamper" group can handle up to five devices (one or multi-channel). If Fibaro Motion Sensor operates in protected mode, outgoing messages are always encrypted.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Motion BC

Motion BC (backward compatibility)  


##### Overview 

"Motion BC" is assigned to the motion sensor. Once motion is detected or alarm state cancelled, nodes added to this group will receive report frames. This group aims to provide backward compatibility with controllers not supporting the Z-Wave+ protocol. Only a main controller not supporting the Z-wave+ protocol should be added to this group. The "Motion BC" group can handle up to five devices (one or multi-channel). If Fibaro Motion Sensor operates in protected mode, outgoing messages are always encrypted.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


#### 5: Tamper BC

Tamper BC (backward compability)  


##### Overview 

"Tamper BC" is assigned to the tamper alarm. Once tampering is detected or cancelled, nodes added to this group will receive alarm frames. This group aims to provide backward compatibility with devices not supporting the Z-Wave+ protocol. Only nodes not supporting the Z-wave+ protocol should be added to this group. The "Tamper BC" group can handle up to five devices (one or multi-channel). If Fibaro Motion Sensor operates in protected mode, outgoing messages are always encrypted. The Fibaro Motion Sensor allows for controlling 5 regular and 5 multichannel devices per an association group, out of which 1 field is reserved for the Z-Wave network main controller.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_5 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/328).
