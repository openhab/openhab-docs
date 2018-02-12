---
layout: documentation
title: DCH-Z110 - ZWave
---

{% include base.html %}

# DCH-Z110 Door &amp; Window Sensor

This describes the Z-Wave device *DCH-Z110*, manufactured by *D-Link* with the thing type UID of ```dlink_dchz110_00_000```. 

Door & Window Sensor


## Channels
The following table summarises the channels available for the DCH-Z110 Door &amp; Window Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Door / Window Status | sensor_door | sensor_door | Door | Contact |
| Sensor (luminance) | sensor_luminance | sensor_luminance | Temperature | Number |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Alarm | alarm_general | alarm_general | Door | Switch |
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
The following table provides a summary of the configuration parameters available in the DCH-Z110 Door &amp; Window Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 2: Basic Set Level | Setting the BASIC command value to turn on the light. |
| 3: PIR Sensitivity | Set the sensitivity for the PIR (Passive Infrared Sensor). |
| 4: Light Threshold | Set the illumination threshold to turn on the light. |
| 5: Operation Mode | Parameter to set the Operation Mode. Bit 0: Reserved. Bit 1: 1 means enable test mode; 0 m... |
| 6: Multi-Sensor Function Switch | Parameter to set the sensor functions. |
| 7: Customer Function | Parameter to set the Customer Function. |
| 7: Disable send of BASIC OFF after door closed |  |
| 7: Notification Type |  |
| 7: Disable Multi CC in auto report |  |
| 7: Disable to report battery state when the device triggered |  |
| 8: PIR Re-Detect Interval Time | In the normal mode, after the PIR motion detected, setting the re-detect time. 8 seconds p... |
| 9: Turn Off Light Time | After turn on the light, setting the delay time to turn off the light when the PIR motion ... |
| 10: Auto Report Battery Time | The interval time for auto reporting the battery level. |
| 11: Auto Report Door/Window State Time | The interval time for auto reporting the door/window state. |
| 12: Auto Report Illumination Time | The Interval time for auto reporting the illumination state. |
| 13: Auto Report Temperature Time | The interval time for auto reporting the temperature state. |
| 20: Auto Report Tick Interval | The interval time for each auto report tick. Setting this configuration will effect config... |
| 21: Temperature Differential Report | The temperature differential to report. The unit is Fahrenheit. When enabled, the device w... |
| 22: Illumination Differential Report | The illumination differential to report. The unit is percentage. When enabled, the device ... |
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
| Range | 0 to 100 || Default Value | 255 |
| Options | Off (0) |
|  | On (255) |


#### 3: PIR Sensitivity

Set the sensitivity for the PIR (Passive Infrared Sensor).  


##### Overview 

 *  0 = Disable the PIR motion detection.
 *  1 - 99 = 1 means the lowest sensitivity, 99 means the highest sensitivity

High sensitivity means de


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 0 to 99 || Default Value | 70 |
| Options | Disable (0) |


#### 4: Light Threshold

Set the illumination threshold to turn on the light.  


##### Overview 

When the event triggers and the environment illumination is lower than the threshold, the device will turn on the light.

 *  0 = Turn off illumination detected function and never turn


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 || Default Value | 100 |
| Options | Disable (0) |


#### 5: Operation Mode

Parameter to set the Operation Mode. Bit 0: Reserved. Bit 1: 1 means enable test mode; 0 means normal mode. Notice: Ignored if DIP Switch is not set to Customer Mode. Bit 2: Disable the door/window function. 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 || Default Value | 0 |
| Options | Preset: Celsius and LED on &#x3D; Bits: 00001010 &#x3D; 10 (10) |


#### 6: Multi-Sensor Function Switch

Parameter to set the sensor functions.  


 *  Bit 0: Disable magnetic integrate illumination to turn on the lighting nodes in the association group 2. 1: Disable, 0: Enable
 *  Bit 1: Disable PIR integrate Illumination to turn on the


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 4 |


#### 7: Customer Function

Parameter to set the Customer Function.  


##### Overview 

l


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 || Default Value | 4 |
| Options | Preset: PIR Super Sensitivity and Binary Report &#x3D; Bits: 00010100 &#x3D; 20 (20) |


#### 7: Disable send of BASIC OFF after door closed


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1_00000008 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Enable (0) |
|  | Disable (1) |


#### 7: Notification Type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1_00000010 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Notification Report (0) |
|  | Sensor Binary Report (1) |


#### 7: Disable Multi CC in auto report


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1_00000020 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Enable (0) |
|  | Disable (1) |


#### 7: Disable to report battery state when the device triggered


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1_00000040 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Enable (0) |
|  | Disable (1) |


#### 8: PIR Re-Detect Interval Time

In the normal mode, after the PIR motion detected, setting the re-detect time. 8 seconds per tick, default is 3 (24 seconds).  


 *  1 - 127 = Number of ticks. 8 seconds per tick, default value is 3 (24 seconds).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER |
| Range | 1 to 127 |
| Default Value | 3 |


#### 9: Turn Off Light Time

After turn on the light, setting the delay time to turn off the light when the PIR motion is not detected.  


 *  0 = Never send turn off light command.
 *  1 - 127 = Number of ticks. 8 seconds per tick, default value is 4 (32 seconds


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 4 |


#### 10: Auto Report Battery Time

The interval time for auto reporting the battery level.  


 *  0 = Turn off auto report battery.
 *  1-127 = Number of ticks. The default value is 12. The tick time can be set by configuration No. 20.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 12 |


#### 11: Auto Report Door/Window State Time

The interval time for auto reporting the door/window state.  


 *  0 = Turn off auto report door/window state.
 *  1-127 = Number of ticks. The default value is 12. The tick time can be set by configuration No. 20.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 12 |


#### 12: Auto Report Illumination Time

The Interval time for auto reporting the illumination state.  
0 = Turn off auto report illumination. 1-127 = Number of ticks. The default value is 12. The tick time can be set by configuration No. 20.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_1 |
| Data Type        | INTEGER |
| Range | 1 to 127 |
| Default Value | 12 |


#### 13: Auto Report Temperature Time

The interval time for auto reporting the temperature state.  


 *  0 = Turn off auto report temperature.
 *  1-127 = Number of ticks. The default value is 12. The tick time can be set by configuration No. 20.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_1 |
| Data Type        | INTEGER |
| Range | 1 to 127 |
| Default Value | 12 |


#### 20: Auto Report Tick Interval

The interval time for each auto report tick. Setting this configuration will effect configuration No.10, No.11, No.12 and No.13. 0 = Turn off all auto report functions. 1-255 = Interval time for each tick. Default is 30. Unit is in minutes


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_20_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 30 |


#### 21: Temperature Differential Report

The temperature differential to report. The unit is Fahrenheit. When enabled, the device will measure the temperature every minute and when the temperature is over 140 degree Fahrenheit, it will continuesly report. Enabling this functionality will cause s


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_21_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 1 |


#### 22: Illumination Differential Report

The illumination differential to report. The unit is percentage. When enabled, the device will measure every minute. Enabling this functionality will cause some issue. Please check the “Illumination Report” section of the Multisensor manual.  


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_22_1 |
| Data Type        | INTEGER |
| Range | 0 to 99 |
| Default Value | 1 |


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
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/252).
