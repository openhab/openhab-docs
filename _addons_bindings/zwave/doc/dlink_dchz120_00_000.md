---
layout: documentation
title: DCH-Z120 - ZWave
---

{% include base.html %}

# DCH-Z120 Battery Motion Sensor

This describes the Z-Wave device *DCH-Z120*, manufactured by *D-Link* with the thing type UID of ```dlink_dchz120_00_000```. 

Battery Motion Sensor


## Channels
The following table summarises the channels available for the DCH-Z120 Battery Motion Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Sensor (luminance) | sensor_luminance | sensor_luminance | Temperature | Number |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Alarm | alarm_motion | alarm_motion | Door | Switch |
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
The following table provides a summary of the configuration parameters available in the DCH-Z120 Battery Motion Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 2: Basic Set Level | Setting the BASIC command value to turn on the light. |
| 3: PIR Sensitivity | Set the sensitivity for the PIR (Passive Infrared Sensor). |
| 4: Light Threshold | Set the illumination threshold to turn on the light. |
| 5: Operation Mode | Parameter to set the Operation Mode. |
| 6: Multi-Sensor Function Switch | Parameter to set the sensor functions. |
| 7: Customer Function | Parameter to set the Customer Function. |
| 7: Bit1: Enable sending motion OFF report. | 0:Disable, 1:Enable |
| 7: Bit2: Enable PIR super sensitivity mode. | 0:Disable, 1:Enable |
| 7: Bit4: Notification Type | 0: Using Notification Report. 1: Using Sensor Binary Report. |
| 7: Bit5: Disable Multi CC in auto report. | 1:Disable, 0:Enable |
| 7: Bit6: Disable to report battery state when device triggered | 1:Disable, 0 Enable |
| 8: PIR Re-Detect Interval Time | Set re-detect time after PIR motion triggered |
| 9: Turn Off Light Time | Set delay time to turn off light after motion triggered. |
| 10: Auto Report Battery Time | Interval time for auto reporting the battery level |
| 12: Auto Report Illumination Time | Interval time for auto reporting the illumination. |
| 13: Auto Report Temperature Time | Interval time for auto reporting the temperature. |
| 20: Auto Report Tick Interval | Interval time for auto reporting each tick. |
| 21: Temperature Differential Report | The temperature differential to report. |
| 22: Illumination Differential Report | The illumination differential to report. |
| 1: Reports |  |
| 2: Light Control |  |


#### 2: Basic Set Level

Setting the BASIC command value to turn on the light.  


##### Overview 

 *  0: Turn off the light.
 *  1 - 100: For dimmers 1 to 100 means the light level.
 *  255: Turns on the light. (Default) 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 1 to 100 || Default Value | 255 |
| Options | Off (0) |
|  | On (255) |


#### 3: PIR Sensitivity

Set the sensitivity for the PIR (Passive Infrared Sensor).  


##### Overview 

 *  0 = Disable the PIR motion detection.
 *  1 - 99 = 1 means the lowest sensitivity, 99 means the highest sensitivity

High sensitivity means can detected long distance, but if there is more noise signal in the environment, it will re-trigger too frequency.  


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 1 to 99 || Default Value | 80 |
| Options | Disable (0) |


#### 4: Light Threshold

Set the illumination threshold to turn on the light.  


##### Overview 

When the event triggers and the environment illumination is lower than the threshold, the device will turn on the light.

 *  0 means turn off illumination detected function. And never turn on the light.
 *  1 means darkest. 99 means brightest.
 *  100 means turn off illumination detected function. And always turn on the light.  

Notice: In none test mode, only the value in 1 to 99 will enable the illumination detected function and update the illumination value.  


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 1 to 99 || Default Value | 99 |
| Options | Disable, Light OFF (0) |
|  | Disable, Light ON (100) |


#### 5: Operation Mode

Parameter to set the Operation Mode.  


##### Overview 

Bit0: Reserve

Bit1: 1 means test mode, 0 means normal mode

Bit2: Disable the door/window function. (1:Disable, 0:Enable)

Bit3: Setting the temperature scale. 0: Fahrenheit, 1: Celsius

Bit4: Disable the illumination report after event triggered. (1:Disable, 0:Enable)

Bit5: Disable the temperature report after event triggered. (1:Disable, 0:Enable)

Bit6: Reserve

Bit7: Disable the back key release into test mode. (1:Disable, 0:Enable)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 6: Multi-Sensor Function Switch

Parameter to set the sensor functions.  


##### Overview 

Bit0: Disable magnetic integrate illumination to turn ON the lighting nodes in the association group 2. (1:Disable, 0:Enable)

Bit1: Disable PIR integrate Illumination to turn ON the lighting nodes in the association group 2. (1:Disable, 0:Enable)

Bit2: Disable magnetic integrate PIR to turn ON the lighting nodes in the association group 2. (1:Disable, 0:Enable) (Default is Disable)

Bit3: When Bit2 is 0 (Enable), are the device and the lighting in the same room? 0: In the same room(Default), 1: In the different room. Notice: If this bit is 1, it is recommended also set the Bit1 to 1, cause the PIR triggered, doesn't mean the people in that room.

Bit4: Disable delay 5 seconds to turn off the light, when door/window closed. (1:Disable, 0:Enable)

Bit5: Disable auto turn off the light, after door/window opened to turn on the light. (1:Disable, 0:Enable) Notice: If bit2 is zero, this setting isuseless. Notice: If the configuration No.9 is zero, this setting is useless.

Bit6: Reserve.

Bit7: Reserve.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER |
| Range | 0 to 63 |
| Default Value | 4 |


#### 7: Customer Function

Parameter to set the Customer Function.  


##### Overview 

Bit0: Reserve.

Bit1: Enable sending motion OFF report. (0:Disable, 1:Enable) Note: Depends on the Bit4, 0: Report Notification CC, Type: 0x07, Event: 0xFE 1: Sensor Binary Report, Type: 0x0C, Value: 0x00

Bit2: Enable PIR super sensitivity mode. (0:Disable, 1:Enable)

Bit3: Disable send out BASIC OFF after door closed. (1:Disable, 0:Enable) **NOT USED WITH DCH-Z120**

Bit4: Notification Type, 0: Using Notification Report. 1: Using Sensor Binary Report.

Bit5: Disable Multi CC in auto report. (1:Disable, 0:Enable)

Bit6: Disable to report battery state when the device triggered. (1:Disable,0:Enable)

Bit7: Reserve.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 4 |


#### 7: Bit1: Enable sending motion OFF report.

0:Disable, 1:Enable  


##### Overview 

Note: Depends on the Bit4, 0: Report Notification CC, Type: 0x07, Event: 0xFE 1: Sensor Binary Report, Type: 0x0C, Value: 0x00  


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1_00000002 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable (0) |
|  | Enable (1) |


#### 7: Bit2: Enable PIR super sensitivity mode.

0:Disable, 1:Enable


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1_00000004 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Disable (0) |
|  | Enable (1) |


#### 7: Bit4: Notification Type

0: Using Notification Report. 1: Using Sensor Binary Report.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1_00000010 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Notification Report (0) |
|  | Sensor Binary Report (1) |


#### 7: Bit5: Disable Multi CC in auto report.

1:Disable, 0:Enable


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1_00000020 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Enable (0) |
|  | Disable (1) |


#### 7: Bit6: Disable to report battery state when device triggered

1:Disable, 0 Enable


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1_00000040 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Enable (0) |
|  | Disable (1) |


#### 8: PIR Re-Detect Interval Time

Set re-detect time after PIR motion triggered  


##### Overview 

8 seconds per tick, default tick is 3 (24 seconds).  
Setting the suitable value to prevent received the trigger signal too frequently. Also can save the battery energy.  
Notice: If this value bigger than the configuration setting NO. 9. There is a period after the light turned off and the PIR not start detecting.  


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER |
| Range | 1 to 127 |
| Default Value | 3 |


#### 9: Turn Off Light Time

Set delay time to turn off light after motion triggered.  


##### Overview 

After turn on the lighting, setting the delay time to turn off the lighting when the PIR motion is not detected.  
8 seconds per tick, default tick is 4 (32 seconds).  
0 means never send turn off light command.  


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 4 |


#### 10: Auto Report Battery Time

Interval time for auto reporting the battery level  


##### Overview 

The interval time for auto report the battery level.  
0 means turn off auto report battery. The default value is 12. The tick time can setting by the configuration No.20.  


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 12 |


#### 12: Auto Report Illumination Time

Interval time for auto reporting the illumination.  


##### Overview 

The interval time for auto report the illumination.  
0 means turn off auto report illumination.  
The default value is 12. The tick time can setting by the configuration No.20.  


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 12 |


#### 13: Auto Report Temperature Time

Interval time for auto reporting the temperature.  


##### Overview 

The interval time for auto report the temperature.  
0 means turn off auto report temperature.  
The default value is 12. The tick time can setting by the configuration No.20.  


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 12 |


#### 20: Auto Report Tick Interval

Interval time for auto reporting each tick.  


##### Overview 

The interval time for auto report each tick. Setting this configuration will effect configuration No.10, No.11, No.12 and No.13.  
Caution: Setting to 0 means turn off all auto report function  


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_20_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 30 |


#### 21: Temperature Differential Report

The temperature differential to report.  


##### Overview 

The temperature differential to report.  
0 means turn off this function.  
The unit is Fahrenheit.  
Enable this function the device will detect every minutes.  
And when the temperature is over 140 degree Fahrenheit, it will continue report.  
Enable this functionality will cause some issue please see the detail in the “Temperature Report” section.  


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_21_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 1 |


#### 22: Illumination Differential Report

The illumination differential to report.  


##### Overview 

The illumination differential to report.  
0 means turn off this function.  
The unit is percentage.  
Enable this function the device will detect every minutes.  
Enable this functionality will cause  
some issue please see the detail in the  
“Illumination Report” section  


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_22_1 |
| Data Type        | INTEGER |
| Range | 0 to 99 |
| Default Value | 0 |


#### 1: Reports


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Light Control


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/308).
