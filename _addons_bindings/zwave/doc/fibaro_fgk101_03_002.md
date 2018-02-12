---
layout: documentation
title: FGK101 - ZWave
---

{% include base.html %}

# FGK101 Door Opening Sensor

This describes the Z-Wave device *FGK101*, manufactured by *Fibargroup* with the thing type UID of ```fibaro_fgk101_03_002```. 

Door Opening Sensor


## Channels
The following table summarises the channels available for the FGK101 Door Opening Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Scene Number | scene_number | scene_number |  | Number |
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Sensor (Temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Door Sensor | sensor_door | sensor_door | Door | Contact |
| Tamper Alarm | alarm_tamper | alarm_tamper |  | Switch |
|  | battery-level | system.battery-level |  |  |
| Alarm (general) | alarm_general | alarm_general | Door | Switch |


### Sensor (Temperature)

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the FGK101 Door Opening Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Operations mode | Parameter defines device operation mode |
| 2: Door/Window or alarm status | Parameter defines state of the sensor when the magnet ... |
| 3: Visual LED indications | This parameter defines events indicated by the visual ... |
| 4: Range test after double click | Allows to enable activation of Z-Wave range test with ... |
| 10: 2nd association group triggers | Parameter defines events which result in sending on/off ... |
| 11: Commands sent to 2nd association group | Command frames sent to devices added to the 2nd association group. |
| 12: Value of ON command frame sent to 2nd association group | Value of ON command frame sent to 2nd association group |
| 13: Value of OFF command frame sent to 2nd association group | The value of 0 turns OFF the device, 255 turns it ON. |
| 14: Time delay of ON command frame | Time period after which ON command frame will be sent. |
| 15: Time delay of OFF command frame | Time period after which OFF command frame will be sent. |
| 20: Type of sent alarm frames | Type of control frames transmitted to the main controller ... |
| 30: Delay of tamper alarm cancellation | Time period after which a tamper alarm will be cancelled. |
| 31: Reporting tamper alarm cancellation | Reporting cancellation of tamper alarm to the controller ... |
| 50: Interval of temperature measurements | This parameter defines how often the temperature will ... |
| 51: Temperature reports threshold | This parameter defines the change of temperature in ... |
| 52: Interval of temperature reports | This parameter determines how often the temperature ... |
| 53: Temperature offset | The value to be added to the actual temperature, measured ... |
| 54: Temperature alarm reports | Temperature alarms reported to the Z-Wave controller. |
| 55: High temperature alarm threshold | If temperature is higher than set value, overheat ... |
| 56: Low temperature alarm threshold | If temperature is lower than the set value, underheat ... |
| 70: Scene activation functionality | The device can trigger scenes using scene IDs assigned ... |
| 71: Alarm broadcast | Settings for broadcasting ON/OFF commands, sensor ... |
| 72: Associations in Z-Wave network Security Mode | This parameter defines how commands are sent in ... |
| 1: Lifeline |  |
| 2: Control |  |
| 3: Alarm |  |
| 4: Sensor ZW3 |  |
| 5: Tamper ZW3 |  |


#### 1: Operations mode

Parameter defines device operation mode  


##### Overview 

Available settings:

0 - Door/Window Sensor or external alarm sensor  
1 - external button


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 0 |


#### 2: Door/Window or alarm status

Parameter defines state of the sensor when the magnet ...  


##### Overview 

... is close. If the alarm sensor is connected, it determines the output type. Parameter inactive in external button mode (parameter 1 set to 1).

Available settings:

0 - Door/Window Sensor or external alarm sensor  
1 - external button


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 0 |


#### 3: Visual LED indications

This parameter defines events indicated by the visual ...  


##### Overview 

... LED indicator. Disabling events might extend battery life.

Available settings:

0 - no indications  
1 - indication of opening/closing status change  
(input IN)  
2 - indication of wake up (1 x click or periodical)  
4 - indication of device tampering


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 0 to 6 |
| Default Value | 6 |


#### 4: Range test after double click

Allows to enable activation of Z-Wave range test with ...  


##### Overview 

... double click of a TMP button.

Available settings:

0 - disabled  
1 - enabled


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 0 |


#### 10: 2nd association group triggers

Parameter defines events which result in sending on/off ...  


##### Overview 

... commands to devices added to the 2nd association group. These commands are sent alternately to switch the devices on and off. Commands represent the values of BASIC SET command frames. Parameter is inactive in external button mode (parameter 1 set to 1).

Available settings:

0 - switch after opening and closing  
1 - switch after opening  
2 - switch after closing


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER |
| Range | 0 to 2 |
| Default Value | 0 |


#### 11: Commands sent to 2nd association group

Command frames sent to devices added to the 2nd association group.  


##### Overview 

Available settings:

0 - ON  
1 - OFF  
2 - ON & OFF


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_1 |
| Data Type        | INTEGER |
| Range | 0 to 2 |
| Default Value | 2 |


#### 12: Value of ON command frame sent to 2nd association group

Value of ON command frame sent to 2nd association group  


##### Overview 

The value of 0 turns OFF the device, 255 turns it On. In case of associating the Dimmer or Roller Shutter module, values 1-99 allow to set  
an associated device to a specifed level.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 255 |


#### 13: Value of OFF command frame sent to 2nd association group

The value of 0 turns OFF the device, 255 turns it ON.  


##### Overview 

In case of associating the Dimmer or Roller Shutter module, values 1-99 allow to set an associated device to a specified level

The value of 0 turns OFF the device, 255 turns it On. In case of associating the Dimmer or Roller Shutter module, values 1-99 allow to set  
an associated device to a specifed level.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 14: Time delay of ON command frame

Time period after which ON command frame will be sent.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_2 |
| Data Type        | INTEGER |
| Range | 0 to 32400 |
| Default Value | 0 |


#### 15: Time delay of OFF command frame

Time period after which OFF command frame will be sent.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_15_2 |
| Data Type        | INTEGER |
| Range | 0 to 32400 |
| Default Value | 0 |


#### 20: Type of sent alarm frames

Type of control frames transmitted to the main controller ...  


##### Overview 

... and 3rd association group “Alarm”. If an external sensor is connected to IN input, it is possible to choose its functionality. Otherwise it is recommended to set this parameter to default value.

Available settings:

0 - Door/Window Sensor (General Purpose Alarm)  
1 - smoke sensor (Smoke Alarm)  
2 - CO detector (CO Alarm)  
3 - CO2 detector (CO2 Alarm)  
4 - high temperature sensor (Heat Alarm)  
5 - flood sensor (Water Alarm)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_20_1 |
| Data Type        | INTEGER |
| Range | 0 to 5 |
| Default Value | 0 |


#### 30: Delay of tamper alarm cancellation

Time period after which a tamper alarm will be cancelled.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_30_2 |
| Data Type        | INTEGER |
| Range | 0 to 32400 |
| Default Value | 5 |


#### 31: Reporting tamper alarm cancellation

Reporting cancellation of tamper alarm to the controller ...  


##### Overview 

... and 5th association group.

Available settings:

0 - do not send tamper cancellation report  
1 - send tamper cancellation report


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_31_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 1 |


#### 50: Interval of temperature measurements

This parameter defines how often the temperature will ...  


##### Overview 

... be measured. The shorter the time, the more frequently the temperature will be measured, but the battery life will shorten.

Available settings:

0 - temperature measurements disabled  
5-32400 - time in seconds


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_50_2 |
| Data Type        | INTEGER |
| Range | 0 to 32400 |
| Default Value | 300 |


#### 51: Temperature reports threshold

This parameter defines the change of temperature in ...  


##### Overview 

...comparison with last reported, resulting in temperature report being sent to the main controller.

Available settings:

0 - temperature reports based on threshold disabled  
1-300 - temperature threshold (0.1-30°C, 0.1°C step)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_51_2 |
| Data Type        | INTEGER |
| Range | 0 to 300 |
| Default Value | 10 |


#### 52: Interval of temperature reports

This parameter determines how often the temperature ...  


##### Overview 

...  reports will be sent to the main controller.

Available settings:

0 - periodic temperature reports disabled  
5-32400 - time in seconds


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_52_2 |
| Data Type        | INTEGER |
| Range | 0 to 32400 |
| Default Value | 0 |


#### 53: Temperature offset

The value to be added to the actual temperature, measured ...  


##### Overview 

... by the sensor (temperature compensation).

Available settings:

\-1000-1000 (-100-100°C, 0.1°C step)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_53_4 |
| Data Type        | INTEGER |
| Range | -1000 to 1000 |
| Default Value | 0 |


#### 54: Temperature alarm reports

Temperature alarms reported to the Z-Wave controller.  


##### Overview 

Thresholds are set in parameters 55 and 56.

Available settings:

0 - temperature alarms disabled  
1 - high temperature alarm  
2 - low temperature alarm  
3 - high and low temperature alarms enabled


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_54_1 |
| Data Type        | INTEGER |
| Range | 0 to 3 |
| Default Value | 0 |


#### 55: High temperature alarm threshold

If temperature is higher than set value, overheat ...  


##### Overview 

... notification will be sent and high temperature scene will be triggered (if activated).

Available settings:

0-1000 (0-100°C, 0.1°C step)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_55_2 |
| Data Type        | INTEGER |
| Range | 0 to 1000 |
| Default Value | 540 |


#### 56: Low temperature alarm threshold

If temperature is lower than the set value, underheat ...  


##### Overview 

... notification will be sent and low temperature scene will be triggered (if activated).

Available settings:

\-300-700 (-30-70°C, 0.1°C step)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_56_2 |
| Data Type        | INTEGER |
| Range | -300 to 700 |
| Default Value | 40 |


#### 70: Scene activation functionality

The device can trigger scenes using scene IDs assigned ...  


##### Overview 

... to different events. To deactivate all scenes set the value to 0. To activate all scenes set the value to 3903.

Available settings:

1 - \[ID 10\] opening door/window (single click)  
2 - \[ID 11\] closing door/window (single click)  
4 - \[ID 12\] holding  
8 - \[ID 13\] releasing  
16 - \[ID 14\] double click  
32 - \[ID 15\] triple click  
256 - \[ID 50\] high temperature - door/window  
opened  
512 - \[ID 50\] high temperature - door/window  
closed  
1024 - \[ID 51\] low temperature - door/window  
opened  
2048 - \[ID 51\] low temperature - door/window  
closed


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_70_2 |
| Data Type        | INTEGER |
| Range | 0 to 2048 |
| Default Value | 0 |


#### 71: Alarm broadcast

Settings for broadcasting ON/OFF commands, sensor ...  


##### Overview 

... alarm and tamper alarm. Value other than 0 means alarms are sent in Broadcast Mode, to all devices only within the range of the device. They are not repeated by the mesh network.

Available settings:

0 - broadcasts inactive  
1 - ON/OFF commands broadcast active  
2 - sensor alarm broadcast active  
4 - tamper alarm broadcast active


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_71_1 |
| Data Type        | INTEGER |
| Range | 0 to 4 |
| Default Value | 0 |


#### 72: Associations in Z-Wave network Security Mode

This parameter defines how commands are sent in ...  


##### Overview 

... specified association groups: as secure or non-secure. Parameter is active only in Z-Wave network security mode. It does not apply to 1st group “Lifeline”.

Available settings:

0 - none of the groups sent as secure  
1 - 2nd group ”Control” sent as secure  
2 - 3rd group ”Alarm” sent as secure  
4 - 4th group “Sensor ZW3” sent as secure  
8 - 5th group “Tamper ZW3” sent as secure

15 - (all)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_72_1 |
| Data Type        | INTEGER |
| Range | 0 to 15 |
| Default Value | 15 |


#### 1: Lifeline


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Control


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Sensor ZW3


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


#### 5: Tamper ZW3


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_5 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/381).
