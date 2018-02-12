---
layout: documentation
title: FGFS101 - ZWave
---

{% include base.html %}

# FGFS101 Flood Sensor

This describes the Z-Wave device *FGFS101*, manufactured by *Fibargroup* with the thing type UID of ```fibaro_fgfs101_03_002```. 

Flood Sensor


## Channels
The following table summarises the channels available for the FGFS101 Flood Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch |
| Alarm (flood) | alarm_flood | alarm_flood | Door | Switch |
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
The following table provides a summary of the configuration parameters available in the FGFS101 Flood Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Alarm cancellation delay | Time in seconds that the flood state is retained after flooding event |
| 2: Select alarm type (visual/acoustic) | This parameter allows for deactivation visual and acoustic alarm. |
| 7: Requested dimming level to 2nd assoc. group | “On” level to be sent to devices from 2nd association group on flood event |
| 9: Device off and alarm cancellations | Enable/disable device off/alarm cancellation updates to 2nd/3rd assoc groups |
| 10: Temperature measurement interval | Seconds between consecutive measurements of battery level/temperature |
| 12: Temperature measurement hysteresis | Minimum change in temperature value for report to be sent to controller |
| 50: Low temperature alarm threshold | Temperature value below which visual indicator blinks |
| 51: High temperature alarm threshold | Temperature value above which visual indicator blinks |
| 61: Low temperature alarm indicator colour | Parameter stores RGB colour value. |
| 62: High temperature alarm indicator colour | Parameter stores RGB colour value. |
| 63: Visual temperature indicator | Enable or disable visual temperature indicator via device's LED |
| 73: Temperature measurement compensation | Offset to current temperature to account temperature difference |
| 74: Alarm frame for movement/tamper | Movement/tamper alarm sent to 1st & 4th assoc. group |
| 75: Alarms signalization duration | Turn off alarm after given timeout |
| 76: Alarm signalization reactivation period | Time period after which an alarm will be turned back on |
| 77: Flood sensor functionality turned off | Allows the internal flood sensor to be turned off. |
| 78: Associations in Z-Wave network security mode | Defines whether commands are sent as secure or non-secure |
| 1: Lifeline | Reports the device status and allows for assigning single device only (main controller by ... |
| 2: Flood Control | Devices in this group will be switched on or off when flood status changes (done via BASIC... |
| 3: Flood Alarm | Assigned to the device status – devices in this group will receive notification about floo... |
| 4: Tamper Alarm | Assigned to the TMP button and tilt sensor – devices in this group will receive a notifica... |


#### 1: Alarm cancellation delay

Time in seconds that the flood state is retained after flooding event  


##### Overview 

Determines time period (in seconds) by which a Flood Sensor will retain the flood state after the flooding itself has ceased. The sensor will keep on reporting flooding to the main controller. This parameter setting does not affect acoustic and visual ala


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_2 |
| Data Type        | INTEGER |
| Range | 0 to 3600 |
| Default Value | 0 |


#### 2: Select alarm type (visual/acoustic)

This parameter allows for deactivation visual and acoustic alarm.  


##### Overview 

This parameter allows for deactivation visual and acoustic alarm.

Available settings:

0 – acoustic and visual alarms inactive

1 – acoustic alarm inactive, visual alarm active

2 – acoustic alarm active, visual alarm inactive

3 – acoustic and visual alarms active

Parameter allows for increasing a battery life. Setting changes will not affect the sensor’s communication with the main controller – commands to association groups, alarms and reports will still be sent.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 3 |
| Options | Acoustic and visual alarms inactive (0) |
|  | Acoustic alarm inactive, visual alarm active (1) |
|  | Acoustic alarm active, visual alarm inactive (2) |
|  | Acoustic and visual alarms active (3) |


#### 7: Requested dimming level to 2nd assoc. group

“On” level to be sent to devices from 2nd association group on flood event  


##### Overview 

Requested dimming level / roller blind opening level when sending turn on / open command to 2nd association group devices.

Available settings:  
**1-99** – requested level  
**255** – turn a device on

Determines the requested “on” level to be sent to devices from 2nd association group upon flood event. The value of 255 allows for turning a device on. In case of a Dimmer it means turning it on with the last memorized state, e.g. Dimmer set to 30% and turned off, turned on again using 255 command is turned on with last state i.e. 30%.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 255 |


#### 9: Device off and alarm cancellations

Enable/disable device off/alarm cancellation updates to 2nd/3rd assoc groups  


##### Overview 

Deactivate turning off devices in 2nd association group & alarm cancellation in 3rd group

This setting decides whether device turn off commands and alarm cancellation notifications will be sent to devices in 2nd and 3rd association groups (respectively).

Setting the parameter’s value to 0 disables sending these two commands to associated devices. This means that these devices WILL NOT be informed when the flooding has ceased. It is still possible to cancel alarms in 3rd association group by choosing second (green) menu position.

Available settings:  
**0** – alarm (flooding) cancellation inactive  
**1** – alarm (flooding) cancellation active


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Alarm (flooding) cancellation inactive (0) |
|  | Alarm (flooding) cancellation active (1) |


#### 10: Temperature measurement interval

Seconds between consecutive measurements of battery level/temperature  


##### Overview 

Time interval (in seconds) between consecutive measurements of battery level and temperature (done by built-in temperature sensor). If the temperature differs from previously reported by a value determined in parameter 12, it will be reported to the Z-Wave controller. In battery mode more significant battery level changes will be reported. Short time intervals mean more frequent communication, which results in shortened battery life. After consecutive FAILED and SUCCESSFUL communication attempts, the Sensor will go to standby mode.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_4 |
| Data Type        | INTEGER |
| Range | 1 to 65535 |
| Default Value | 300 |


#### 12: Temperature measurement hysteresis

Minimum change in temperature value for report to be sent to controller  


##### Overview 

Determines a minimum temperature change value (insensitivity level), resulting in a temperature report being sent to the main controller, according to the Parameter 10 settings.

Available settings: **1 – 1 000** (each 0.01°C)  
Default setting: **50** (0.5°C)  
Parameter size: **2 \[bytes\]**


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_2 |
| Data Type        | INTEGER |
| Range | 1 to 1000 |
| Default Value | 50 |


#### 50: Low temperature alarm threshold

Temperature value below which visual indicator blinks  


##### Overview 

The parameter stores a temperature value, below which visual indicator blinks with a colour determined by a parameter 61 settings. By default the visual indicator blinks blue.

Available settings: **-10 000 to +10 000** (each 0.01°C)  
Default setting: **1 500** (15.00°C)  
Parameter size: **2 \[bytes\]**

The main controller does not interpret negative numbers as decimals. That’s why read value may be different than entered. Negative numbers are coded in U2 standard.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_50_2 |
| Data Type        | INTEGER |
| Range | -10000 to 10000 |
| Default Value | 1500 |


#### 51: High temperature alarm threshold

Temperature value above which visual indicator blinks  


##### Overview 

Available settings: **-10 000 to +10 000** (each 0.01°C)  
Default setting: **3 500** (35°C)  
Parameter size: **2 \[bytes\]**

The parameter stores a temperature value, above which visual indicator blinks with a colour determined by the parameter 62 settings. By default the visual indicator blinks red.

The main controller does not interpret negative numbers as decimals. That’s why read value may be different than entered. Negative numbers are coded in U2 standard.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_51_2 |
| Data Type        | INTEGER |
| Range | -10000 to 10000 |
| Default Value | 3500 |


#### 61: Low temperature alarm indicator colour

Parameter stores RGB colour value.  


##### Overview 

A main controller interprets colours as a sum of it component colours value. Each colours value is a number from 0 to 255.

Example:

Indicated colour = 65536 \* RED value + 256 \* GREEN value + BLUE value


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_61_4 |
| Data Type        | INTEGER |
| Range | 0 to 16777215 |
| Default Value | 255 |


#### 62: High temperature alarm indicator colour

Parameter stores RGB colour value.  


##### Overview 

Parameter stores RGB colour value.

Available settings: **0 – 16777215**  
Default setting: **16711680** (red 0x00FF0000)  
Parameter size: **4 \[bytes\]**

A main controller interprets colours as a sum of it component colours value. Each colours value is a number from 0 to 255.

Example:  
Indicated colour = 65536 \* RED value + 256 \* GREEN value + BLUE value


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_62_4 |
| Data Type        | INTEGER |
| Range | 0 to 16777215 |
| Default Value | 16711680 |


#### 63: Visual temperature indicator

Enable or disable visual temperature indicator via device's LED  


##### Overview 

Parameter determines visual indicator’s operation. Setting to 0 turns the temperature LED indication off, saving battery life.

Available settings:  
**0** – visual indicator does not indicate the temperature  
**1** – visual indicator indicates the temperature (blink) every Temperature Measurement Interval (parameter 10, constant current and battery) and Wake Up Interval (battery mode)  
**2** – visual indicator indicates the temperature continuously, only in constant power mode  
Default setting: **2**  
Parameter size: **1 \[byte\]**


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_63_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | Visual indicator does not indicate the temperature (0) |
|  | Indicator at every temperature measurement and wake up (1) |
|  | Visual indicator indicates the temperature continuously (2) |


#### 73: Temperature measurement compensation

Offset to current temperature to account temperature difference  


##### Overview 

Available settings: **-10 000 to +10 000**  
Default setting: **0** (0.00°C)  
Parameter size: **2 \[bytes\]**

Parameter stores a temperature value to be added to or deducted from the current temperature measured by internal temperature sensor in order to compensate the difference between air temperature and temperature at the floor level.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_73_2 |
| Data Type        | INTEGER |
| Range | -10000 to 10000 |
| Default Value | 0 |


#### 74: Alarm frame for movement/tamper

Movement/tamper alarm sent to 1st & 4th assoc. group  


##### Overview 

Available settings:

**0** – tamper alarms inactive  
**1** – button tamper alarm active  
**2** – movement tamper alarm active  
**3** – button and movement tampers alarm active  
Default setting: **2**  
Parameter size: **1 \[byte\]**

The device is able to report tamper alarms resulting from sensor’s tilt/movement or TMP button state change (e.g. taking off the top cover).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_74_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | Tamper alarm inactive (0) |
|  | Button tamper alarm active (1) |
|  | Movement tamper alarm active (2) |
|  | Button and movement tampers alarm active (3) |


#### 75: Alarms signalization duration

Turn off alarm after given timeout  


##### Overview 

The device is capable of automatically turning off alarm signalization after a certain amount of time. Long lasting alarm may reduce battery life, when constantly signalized.

Available settings:  
**0** – alarms active indefinitely  
**1-65535** – time in seconds  
Default setting: **0**  
Parameter size: **4 \[bytes\]**

The parameter determines time after which alarm will become “quiet” – still active but the device will go into battery saving mode. Visual or acoustic alarm will be reactivated after time specified in the parameter 76. When alarm status ceases, alarm will be turned off immediately.

The value of 0 means visual and acoustic alarms are active indefinitely. In battery power mode the Sensor will never go to sleep which may shorten battery life significantly.

The parameter is ignored when Parameter 2 is set to 0.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_75_4 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 0 |


#### 76: Alarm signalization reactivation period

Time period after which an alarm will be turned back on  


##### Overview 

Parameter determines a time period after which an alarm will be turned back on (in case it was turned off by parameter 75 setting). It will also resend commands to 2nd and 3rd association groups as if the alarm was detected again.

Available settings:  
**0** – alarm reactivation inactive  
**1-65535** – time in seconds  
Default setting: **0**  
Parameter size: **4 \[bytes\]**

In case a time period set in parameter 76 is shorter than the one specified in parameter 75, the device will not quiet the alarm, it will remain active.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_76_4 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 0 |


#### 77: Flood sensor functionality turned off

Allows the internal flood sensor to be turned off.  


##### Overview 

Allows to turn off the internal flood sensor. Tamper and built in temperature sensor will remain active.

Available settings:  
**0** – Default flood sensor operation (flood detection, reactions)  
**1** – Built-in flood sensor TURNED OFF (does not change its state in the main controller, does not send alarm notifications nor turn on/off commands to 2nd/3rd association groups with flood state changes. Always visible in the main controller as turned off)  
Default setting: **0**  
Parameter size: **1 \[byte\]**


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_77_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Default flood sensor operation (flood detection, reactions) (0) |
|  | Built-in flood sensor TURNED OFF (1) |


#### 78: Associations in Z-Wave network security mode

Defines whether commands are sent as secure or non-secure  


##### Overview 

This parameter defines how commands are sent in specified association groups: as secure or non-secure. Parameter is active only in Z-Wave network security mode. It does not apply to 1st “Lifeline “group.

Available settings:  
**0** – none of the groups sent as secure  
**1** – 2nd group ”Control” sent as secure  
**2** – 3rd group ”Alarm” sent as secure  
**4** – 4th group „Tamper” sent as secure  
Default setting: **7**  
Parameter size: **1 \[byte\]**


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_78_1 |
| Data Type        | INTEGER || Default Value | 7 |
| Options | None of the groups are sent as secure (0) |
|  | 2nd group ”Control” sent as secure (1) |
|  | 3rd group ”Alarm” sent as secure (2) |
|  | 4th group &quot;Tamper” sent as secure (3) |


#### 1: Lifeline

Reports the device status and allows for assigning single device only (main controller by default)


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Flood Control

Devices in this group will be switched on or off when flood status changes (done via BASIC SET command frames)


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Flood Alarm

Assigned to the device status – devices in this group will receive notification about flood detection or cancellation. Useful for devices that can trigger alarms.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Tamper Alarm

Assigned to the TMP button and tilt sensor – devices in this group will receive a notification when the sensor is moved or the cover is taken off (which normally holds the button). Useful for devices that can trigger alarms. Functionality can be altered b


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/392).
