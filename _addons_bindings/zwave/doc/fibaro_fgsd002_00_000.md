---
layout: documentation
title: FGSD002 - ZWave
---

{% include base.html %}

# FGSD002 Smoke Detector

This describes the Z-Wave device *FGSD002*, manufactured by *Fibargroup* with the thing type UID of ```fibaro_fgsd002_00_000```. 

Smoke Detector


## Channels
The following table summarises the channels available for the FGSD002 Smoke Detector.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Temperature Sensor | sensor_temperature | sensor_temperature | Temperature | Number |
| Smoke Alarm | alarm_smoke | alarm_smoke | Door | Switch |
| Tamper Alarm | alarm_tamper | alarm_tamper |  | Switch |
| Low Battery Alarm | alarm_battery | alarm_battery |  | Switch |
| Hardware Failure Alarm | alarm_system | alarm_system |  | Switch |
| Heat Alarm | alarm_heat | alarm_heat |  | Switch |
|  | battery-level | system.battery-level |  |  |
| Clock Time Offset | time_offset | time_offset | Temperature | Number |


### Temperature Sensor

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
The following table provides a summary of the configuration parameters available in the FGSD002 Smoke Detector.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Smoke Sensor sensitivity | There are 3 levels of sensitivity to smoke presence. |
| 2: Z-Wave notifications status | This parameter allows to activate excess temperature ... |
| 2: Z-Wave notifications status | This parameter allows to activate excess temperature ... |
| 3: Visual indicator notifications status | This parameter allows to activate visual indications |
| 4: Sound notifications status | This parameter allows to activate sound signals... |
| 10: Configuration of control frames in BASIC command class | This parameter defines which frames will be sent ... |
| 11: BASIC ON frame value | BASIC ON frame is sent in case of smoke presence detection ... |
| 12: BASIC OFF frame value | BASIC OFF frame is sent in case of FIRE ALARM cancellation. |
| 13: Alarm broadcast | A value other than 0 means that alarms are being sent in ... |
| 20: Temperature report interval | Time interval between consecutive temperature reports. |
| 21: Temperature report hysteresis | The temperature report will only be sent if there is a difference ... |
| 30: Temperature threshold | Temperature threshold for activating alarms |
| 31: Excess temperature signaling interval | Time interval of signaling (visual indication/sound) excess ... |
| 32: Lack of Z-Wave range indication interval | Time interval of signaling (visual indication/sound) lack of ... |
| 1: Device Status |  |
| 2: Battery capacity low |  |
| 3: Tamper Alarm |  |
| 4: Fire Alarm |  |
| 5: Tamper Alarm |  |


#### 1: Smoke Sensor sensitivity

There are 3 levels of sensitivity to smoke presence.  


##### Overview 

Level 1 means the highest sensitivity. Rising the parameter value lowers the sensitivity to smoke presence.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | HIGH Sensitivity (1) |
|  | MEDIUM Sensitivity (2) |
|  | LOW Sensitivity (3) |


#### 2: Z-Wave notifications status

This parameter allows to activate excess temperature ...  


##### Overview 

...  and/or enclosure opening notifications sent to the main controller


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | All notifications disabled (0) |
|  | Enclosure opening notification enabled (1) |
|  | Exceeding temperature threshold notification enabled (2) |
|  | All notifications enabled (3) |


#### 2: Z-Wave notifications status

This parameter allows to activate excess temperature ...  


##### Overview 

...  and/or enclosure opening notifications sent to the main controller


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 255 |


#### 3: Visual indicator notifications status

This parameter allows to activate visual indications  


##### Overview 

 but does not apply to major alarms, such as FIRE, TROUBLE and LOW BATTERY ALARM.

Available settings: 0 - 7


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | All notifications disabled (0) |
|  | Enclosure opening notification enabled (1) |
|  | Exceeding temperature threshold notification enabled (2) |
|  | Enclosure opening notification enabled + (3) |
|  | Lack of Z-Wave range notification (4) |
|  | Enclosure opening notification enabled + (5) |
|  | Exceeding temperature threshold notification enabled + (6) |
|  | Enclosure opening notification enabled + (7) |


#### 4: Sound notifications status

This parameter allows to activate sound signals...  


##### Overview 

 but does not apply to major alarms, such as FIRE, TROUBLE and LOW BATTERY ALARM.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | All notifications disabled (0) |
|  | Enclosure opening notification enabled (1) |
|  | Exceeding temperature threshold notification enabled (2) |
|  | Enclosure opening notification enabled + (3) |
|  | Lack of Z-Wave range notification (4) |
|  | Enclosure opening notification enabled + (5) |
|  | Exceeding temperature threshold notification enabled + (6) |
|  | Enclosure opening notification enabled + (7) |


#### 10: Configuration of control frames in BASIC command class

This parameter defines which frames will be sent ...  


##### Overview 

in the 2-nd Association Group (FIRE ALARM). The values of BASIC ON and BASIC OFF frames may be defined as described in further parameters.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | BASIC ON and BASIC OFF enabled (0) |
|  | BASIC ON enabled (1) |
|  | BASIC OFF enabled (2) |


#### 11: BASIC ON frame value

BASIC ON frame is sent in case of smoke presence detection ...  


##### Overview 

and FIRE ALARM triggering. Its value is defined by the parameter. Available settings: 0-99, 255. 0 - turn off the device. 1-99 - set the device to 1-99%. 255 - set the last status


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_2 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 255 |


#### 12: BASIC OFF frame value

BASIC OFF frame is sent in case of FIRE ALARM cancellation.  


##### Overview 

Its value is defined by the parameter. Available settings: 0-99, 255. 0 - turn off the device. 1-99 - set the device to 1-99%. 255 - set the last status


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 255 |


#### 13: Alarm broadcast

A value other than 0 means that alarms are being sent in ...  


##### Overview 

broadcast mode, i.e. to all devices within a Fibaro Smoke Sensor’s range


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | broadcast inactive (0) |
|  | FIRE ALARM broadcast (2-nd and 4-th Association Group) ... (1) |
|  | FIRE ALARM broadcast (2-nd and 4-th Association Group) ... (2) |
|  | FIRE ALARM broadcast (2-nd and 4-th Association Group) ... (3) |


#### 20: Temperature report interval

Time interval between consecutive temperature reports.  


##### Overview 

Report is sent when new temperature value is different from the one previously reported - according to the set hysteresis (parameter 21). Temperature reports can be also sent as a result of polling.  


Available settings: 0, 1-8640 (multiply by 10 seconds) \[10s-24h\]  


0 – reports inactive  
1-8640 - \[10s-24h\]  


Default setting: 1 (10 seconds)  
Parameter size: 2 \[bytes\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_20_2 |
| Data Type        | INTEGER |
| Range | 0 to 8640 |
| Default Value | 1 |


#### 21: Temperature report hysteresis

The temperature report will only be sent if there is a difference ...  


##### Overview 

in temperature value from the previous value reported, defined in this parameter (hysteresis). Temperature reports can be also sent as a result of polling.  


Available settings: 1 – 100 (in 0,1oC steps)  
1-100 - (multiply by 0,1) \[0,1oC - 10oC\]  


Default setting: 10 (1oC)  
Parameter size: 1 \[byte\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_21_1 |
| Data Type        | INTEGER |
| Range | 1 to 100 |
| Default Value | 10 |


#### 30: Temperature threshold

Temperature threshold for activating alarms  


##### Overview 

This is the temperature threshold, measured by the internal sensor above which the excess temperature notification is sent (visual indication/sound/Z-Wave report).

Note that the alarm will not be deactivated again until the temperature drops by at least 2 degrees below this threshold.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_30_1 |
| Data Type        | INTEGER |
| Range | 1 to 100 |
| Default Value | 55 |


#### 31: Excess temperature signaling interval

Time interval of signaling (visual indication/sound) excess ...  


##### Overview 

 temperature level

  
Available settings: 1-8640 (multiply by 10 seconds) \[10s-24h\]  
1-8640 - \[10s-24h\]  


Default setting: 1 (10 seconds)  
Parameter size: 2 \[bytes\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_31_2 |
| Data Type        | INTEGER |
| Range | 1 to 8640 |
| Default Value | 1 |


#### 32: Lack of Z-Wave range indication interval

Time interval of signaling (visual indication/sound) lack of ...  


##### Overview 

Z-Wave range.

  
Available settings: 1-8640 (multiply by 10 seconds) \[10s-24h\]  
1-8640 - \[10s-24h\]  


Default setting: 180 (30min)  
Parameter size: 2 \[bytes\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_32_2 |
| Data Type        | INTEGER |
| Range | 1 to 8640 |
| Default Value | 180 |


#### 1: Device Status


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Battery capacity low

  


##### Overview 

The Home Control Smoke Detector continuously checks the battery capacity. If the battery capacity falls below a defined value of approx. 2.7V +-0.1V, a low battery alarm will be sent via Z-Wave®. If the capacity continues falling, the visual and acoustic battery capacity warning will be activated additionally.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Tamper Alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Fire Alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


#### 5: Tamper Alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_5 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/129).
