---
layout: documentation
title: FGDW002 - ZWave
---

{% include base.html %}

# FGDW002 Fibaro Door Window Sensor 2

This describes the Z-Wave device *FGDW002*, manufactured by *Fibargroup* with the thing type UID of ```fibaro_fgdw002_00_000```. 

Fibaro Door Window Sensor 2  


### Wakeup Information 

Available settings: 0 or 3600-64800 (in seconds (1-18h), 3600s (1h)  
step)  
Default setting: 21600 (6h)

  
The Door/Window Sensor will wake up after each defined time interval and always try to connect with the main controller. After a successful communication attempt, the sensor will update configuration parameters, associations and settings and will go into standby mode.

  
After failed communication attempt (e.g. lack of Z-Wave range) the device will go into standby mode and retry to establish connection with the main controller after the next time interval.

  
Setting wake up interval to 0 disables sending Wake Up Notification frame automatically.

Wake up may be still performed manually by a clicking one of the TMP buttons (while the other button is pressed).

Longer time interval means less frequent communication and thus a longer battery life.


## Channels
The following table summarises the channels available for the FGDW002 Fibaro Door Window Sensor 2.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Tamper alarm | alarm_tamper | alarm_tamper |  | Switch |
| Door sensor | sensor_door | sensor_door | Door | Contact |
| Alarm (power) | alarm_power | alarm_power | Door | Switch |
|  | battery-level | system.battery-level |  |  |


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
The following table provides a summary of the configuration parameters available in the FGDW002 Fibaro Door Window Sensor 2.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Door/window state | What state is door/window when the magnet is close to the sensor |
| 2: Visual LED indications - Open/close | Visual LED indications - Open/close |
| 2: Visual LED indications - wake up | Visual LED indications - wake up |
| 2: Visual LED indications - tampering | Visual LED indications - tampering |
| 3: Associations in Z-Wave network Security Mode | Associations in Z-Wave network Security Mode |
| 11: 2nd association group triggers | 2nd association group triggers |
| 12: Value of ON command frame sent to 2nd association group | Value of ON command frame sent to 2nd association group |
| 13: Value of OFF command frame sent to 2nd association group | Value of OFF command frame sent to 2nd association group |
| 14: Association for opening - time delay | Association for opening - time delay |
| 15: Association for closing - time delay | Association for closing - time delay |
| 30: Tamper - alarm cancellation delay | Tamper - alarm cancellation delay |
| 31: Tamper - reporting alarm cancellation | Tamper - reporting alarm cancellation |
| 50: Interval of temperature measurements | Interval of temperature measurements |
| 51: Temperature reports threshold | Temperature reports threshold |
| 52: Interval of temperature reports | Interval of temperature reports |
| 53: Temperature offset | Temperature offset |
| 54: Temperature alarm reports | Temperature alarm reports |
| 55: High temperature alarm threshold | High temperature alarm threshold |
| 56: Low temperature alarm threshold | Low temperature alarm threshold |
| 1: Lifeline | reports the device status and allows for assigning single device only (main controller by ... |
| 2: On/Off | is assigned to the device status - Hall effect sensor (sends Basic Set command frames) |
| 3: Tamper | is assigned to the TMP switch (sends alarm command frames) |


#### 1: Door/window state

What state is door/window when the magnet is close to the sensor  


##### Overview 

0 - closed when magnet near

1 - opened when magnet near


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | closed when magnet near (0) |
|  | opened when magnet near (1) |


#### 2: Visual LED indications - Open/close

Visual LED indications - Open/close  


##### Overview 

Set or reset the indication of opening/closing status change (input IN) by the visual LED indicator.  
Disabling events might extend battery life.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1_00000001 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | no indication (0) |
|  | open/close indication (1) |


#### 2: Visual LED indications - wake up

Visual LED indications - wake up  


##### Overview 

Show indication of wake up events by the visual LED indicator.  
Disabling events might extend battery life.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1_00000002 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | no indication (0) |
|  | Enable wake up notification (2) |


#### 2: Visual LED indications - tampering

Visual LED indications - tampering  


##### Overview 

Enable or disable device tampering events indicated by the visual LED indicator.  
Disabling events might extend battery life.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1_00000004 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | no indication (0) |
|  | Enable indication of device tampering (4) |


#### 3: Associations in Z-Wave network Security Mode

Associations in Z-Wave network Security Mode  


##### Overview 

This parameter defines how commands are sent in specified association groups: as secure or non-secure. Parameter is active only in Z-Wave network Security Mode. It does not apply to 1st group "Lifeline".


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 3 |
| Options | none of the groups sent as secure (0) |
|  | 2nd group &quot;On/Off&quot; sent as secure (1) |
|  | 3rd group &quot;Tamper&quot; sent as secure (2) |
|  | 2nd and 3rd group sent as secure (3) |


#### 11: 2nd association group triggers

2nd association group triggers  


##### Overview 

Parameter defines events which result in sending on/off commands to devices added to the 2nd association group.

These commands are sent alternately to switch the devices on and off.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | switch after opening and closing (0) |
|  | switch after opening (parameter 12) (1) |
|  | switch after closing (parameter 13) (2) |


#### 12: Value of ON command frame sent to 2nd association group

Value of ON command frame sent to 2nd association group  


##### Overview 

Value sent to devices in 2nd association group when opening is detected The value of 0 turns OFF the device, 255 turns it ON. In case of associating devices allowing smooth control, values 1-99 allow to set an associated device to a specified level.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 255 |


#### 13: Value of OFF command frame sent to 2nd association group

Value of OFF command frame sent to 2nd association group  


##### Overview 

Value sent to devices in 2nd association group when closing is detected The value of 0 turns OFF the device, 255 turns it ON. In case of associating devices allowing smooth control, values 1-99 allow to set an associated device to a specified level.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 255 |


#### 14: Association for opening - time delay

Association for opening - time delay  


##### Overview 

Time that must elapse from opening to send the command frame to to devices in 2nd association group.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_2 |
| Data Type        | INTEGER |
| Range | 0 to 32400 |
| Default Value | 0 |


#### 15: Association for closing - time delay

Association for closing - time delay  


##### Overview 

Time (in seconds) that must elapse from closing to send the command frame to devices in 2nd association group


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_15_2 |
| Data Type        | INTEGER |
| Range | 0 to 32400 |
| Default Value | 0 |


#### 30: Tamper - alarm cancellation delay

Tamper - alarm cancellation delay  


##### Overview 

Time period after which a tamper alarm will be cancelled.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_30_2 |
| Data Type        | INTEGER |
| Range | 0 to 32400 |
| Default Value | 5 |


#### 31: Tamper - reporting alarm cancellation

Tamper - reporting alarm cancellation  


##### Overview 

Reporting cancellation of tamper alarm to the controller and 3rd association group.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_31_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | do not send tamper cancellation report (0) |
|  | send tamper cancellation report (1) |


#### 50: Interval of temperature measurements

Interval of temperature measurements  


##### Overview 

This parameter defines how often the temperature will be measured. The shorter the time, the more frequently the temperature will be measured, but the battery life will shorten.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_50_2 |
| Data Type        | INTEGER |
| Range | 0 to 32400 |
| Default Value | 300 |


#### 51: Temperature reports threshold

Temperature reports threshold  


##### Overview 

This parameter defines the change of temperature in comparison with last reported, resulting in temperature report being sent to the main controller.

Available settings:

 *  0 - temperature reports based on threshold disabled
 *  1-300 - temperature threshold (0.1-30°C, 0.1°C step)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_51_2 |
| Data Type        | INTEGER |
| Range | 0 to 300 |
| Default Value | 10 |


#### 52: Interval of temperature reports

Interval of temperature reports  


##### Overview 

This parameter determines how often the temperature reports will be sent to the main controller (regardless of parameters 50 and 51).

Available settings:

 *  0 - periodic temperature reports disabled
 *  300-32400 - time in seconds


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_52_2 |
| Data Type        | INTEGER |
| Range | 0 to 32400 |
| Default Value | 0 |


#### 53: Temperature offset

Temperature offset  


##### Overview 

The value to be added to the actual temperature, measured by the sensor (temperature compensation). Available settings: -1000–1000 (-100–100°C, 0.1°C step)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_53_2 |
| Data Type        | INTEGER |
| Range | -1000 to 1000 |
| Default Value | 0 |


#### 54: Temperature alarm reports

Temperature alarm reports  


##### Overview 

Temperature alarms reported to the Z-Wave controller. Thresholds are set in parameters 55 and 56. Available settings: 0 - temperature alarms disabled 1 - high temperature alarm 2 - low temperature alarm 3 - high and low temperature alarms enabled


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_54_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | temperature alarms disabled (0) |
|  | high temperature alarm (1) |
|  | low temperature alarm (2) |
|  | high and low temperature alarms enabled (3) |


#### 55: High temperature alarm threshold

High temperature alarm threshold  


##### Overview 

If temperature is higher than set value, overheat notification will be sent and high temperature alarm will be triggered (if activated).

Available settings:

 *  1-600 (0.1-60°C, 0.1°C step)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_55_2 |
| Data Type        | INTEGER |
| Range | 1 to 600 |
| Default Value | 350 |


#### 56: Low temperature alarm threshold

Low temperature alarm threshold  


##### Overview 

If temperature is lower than the set value, underheat notification will be sent and low temperature alarm will be triggered (if activated). Available settings: 0-599 (0-59.9°C, 0.1°C step)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_56_2 |
| Data Type        | INTEGER |
| Range | 0 to 599 |
| Default Value | 100 |


#### 1: Lifeline

reports the device status and allows for assigning single device only (main controller by default).  


##### Overview 

reports the device status and allows for assigning single device only (main controller by default).


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: On/Off

is assigned to the device status - Hall effect sensor (sends Basic Set command frames)  


##### Overview 

is assigned to the device status - Hall effect sensor (sends Basic Set command frames).


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Tamper

is assigned to the TMP switch (sends alarm command frames)  


##### Overview 

is assigned to the TMP switch (sends alarm command frames)


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/604).
