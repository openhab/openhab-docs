---
layout: documentation
title: PST02C - ZWave
---

{% include base.html %}

# PST02C Slim Multi-Sensor (Door/Temperature/Illumination)

This describes the Z-Wave device *PST02C*, manufactured by *Philio Technology Corp* with the thing type UID of ```philio_pst02c_00_000```. 

Slim Multi-Sensor (Door/Temperature/Illumination)  


## Overview 

The slim multisensor PST02 has PIR, door/window, temperature and illumination, 4 sensors function in one, based on Z-WaveTM technology. It is the Z-WaveTM plus product, it support the security, OTA... Those newest features of the Z-WaveTM technology. Z-WaveTM is a wireless communication protocol designed for home automation, specifically to remotely control applications in residential and light commercial environments. The technology uses a low-power RF radio embedded or retrofitted into home electronics devices and systems, such as lighting, home access control, entertainment systems and household appliances.

This product can be included and operated in any Z-WaveTM network with other Z-WaveTM certified devices from other manufacturers and/or other applications. All non-battery operated nodes within the network will act as repeaters regardless of vendor to increase reliability of the network.

The device adopt the Z-WaveTM 500 series chip, when your Z-WaveTM network system is all made by Z-WaveTM 500 series devices. The network system will have the advantages as below.

  


### Inclusion Information 

There are two tamper keys in the device, one is in the back side, another is in the front side. Both of them can add, remove, reset or association from Z-WaveTM network.

In the first time, add the device into the Z-WaveTM network. First, make sure the primary controller is in the add mode. And then power on the device, just take out the insulation Mylar in the back side of the device. The device will auto start the NWI (Network Wide Inclusion) mode. And it should be included in 5 seconds. You will see the LED light ON one second.

1.  Have Z-WaveTM Controller entered inclusion mode.
2.  Pressing tamper key three times within 1.5 seconds to enter the inclusion mode.
3.  After add successful, the device will wake to receive the setting command from Z-WaveTM Controller about 20 seconds.

  


### Exclusion Information 

There are two tamper keys in the device, one is in the back side, another is in the front side. Both of them can add, remove, reset or association from Z-WaveTM network.

In the first time, add the device into the Z-WaveTM network. First, make sure the primary controller is in the add mode. And then power on the device, just take out the insulation Mylar in the back side of the device. The device will auto start the NWI (Network Wide Inclusion) mode. And it should be included in 5 seconds. You will see the LED light ON one second.

1.  Have Z-WaveTM Controller entered exclusion mode.
2.  Pressing tamper key three times within 1.5 seconds to enter the exclusion mode. Node ID has been excluded.

  


### Wakeup Information 

After the device adding to the network, it will wake-up once per day in default. When it wake-up it will broadcast the “Wake Up Notification” message to the network, and wake-up 10 seconds for receive the setting commands.

The wake-up interval minimum setting is 30 minutes, and maximum setting is 120 hours. And the interval step is 30 minutes.

If the user want to wake-up the device immediately, please remove the front cover, and press the tamper key once. The device will wake-up 10 seconds.


## Channels
The following table summarises the channels available for the PST02C Slim Multi-Sensor (Door/Temperature/Illumination).

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor (door) | sensor_binary | sensor_binary | Door | Switch |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Sensor (luminance) | sensor_luminance | sensor_luminance | Temperature | Number |
| Door sensor | sensor_door | sensor_door | Door | Contact |
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
The following table provides a summary of the configuration parameters available in the PST02C Slim Multi-Sensor (Door/Temperature/Illumination).
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 2: Basic Set Level | Setting the BASIC command value to turn on the light. |
| 4: Light Threshold | Setting the illumination threshold to turn on the light. |
| 5: Operation Mode | Parameter to set the Operation Mode. |
| 6: Multi-Sensor Function Switch | Parameter to set the sensor functions. |
| 7: Customer Function | Parameter to set the Customer Function. |
| 8: PIR Re-Detect Interval Time |  |
| 9: Turn Off Light Time |  |
| 10: Auto Report Battery Time |  |
| 11: Auto Report Door/Window State Time |  |
| 12: Auto Report Illumination Time | The Interval time for auto reporting the illumination state. |
| 13: Auto Report Temperature Time | The interval time for auto reporting the temperature state. |
| 20: Auto Report Tick Interval | The interval time for each auto report tick. |
| 21: Temperature Differential Report | The temperature differential to report. |
| 22: Illumination Differential Report | The illumination differential to report. |
| 1: Reports |  |
| 2: Light Control |  |


#### 2: Basic Set Level

Setting the BASIC command value to turn on the light.  


##### Overview 

Setting the BASIC command value to turn on the light.

 *  \-1 = 0xFF(-1) turns on the light. (Default)
 *  0 = Turn off the light.
 *  1 - 100 = For dimmers 1 to 100 means the light strength.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | -1 to 100 |
| Default Value | -1 |


#### 4: Light Threshold

Setting the illumination threshold to turn on the light.  


##### Overview 

Setting the illumination threshold to turn on the light. When the event triggers and the environment illumination is lower than the threshold, the device will turn on the light.

 *  0 = Turn off illumination detected function and never turn 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 100 |


#### 5: Operation Mode

Parameter to set the Operation Mode.  


##### Overview 

Parameter to set the Operation Mode.

 *  Bit 0: Reserved.
 *  Bit 1: 1 means enable test mode; 0 means normal mode. Notice: Ignored if DIP Switch is not set to Customer Mode. Otherwise it decides by DIP switch setting to Test or Normal mode
 *  Bit 2: Disable the door/window function. (1: Disable, 0: Enable)
 *  Bit 3: Setting the temperature scale (0: Fahrenheit, 1: Celcius)
 *  Bit 4: Disable the illumination report after event triggered (1: Disable, 0: Enable)
 *  Bit 5: Disable the temperature report after event triggered (1: Disable, 0: Enable)
 *  Bit 6: Reserved
 *  Bit 7: Disable the back key release into test mode (1: Disable, 0: Enable)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 0 |


#### 6: Multi-Sensor Function Switch

Parameter to set the sensor functions.  


##### Overview 

Parameter to set the sensor functions.

 *  Bit 0: Disable magnetic integrate illumination to turn ON the lighting nodes in the association group 2. (1:Disable, 0:Enable)
 *  Bit 1: Disable PIR integrate Illumination to turn ON the lighting nodes in the association group 2. (1:Disable, 0:Enable)
 *  Bit 2: Disable magnetic integrate PIR to turn ON the lighting nodes in the association group 2. (1:Disable, 0:Enable) (Default is Disable)
 *  Bit 3: When Bit2 is 0 (Enable), Are the device and the lighting in the same room?

0: In the same room(Default),  
1: In the different room.  
Notice: If this bit is 1, it is recommended also set the Bit1 to 1, cause the PIR triggered, doesn't mean the people in that room.

 *  Bit 4: Disable delay 5 seconds to turn off the light, when door/window closed. (1:Disable, 0:Enable)
 *  Bit 5: Disable auto turn off the light, after door/window opened to turn on the light. (1:Disable, 0:Enable)

Notice: If bit2 is zero, this setting is useless  
Notice: If the configuration No.9 is zero, this setting is useless.

 *  Bit 6: Reserve.
 *  Bit 7: Reserve.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 4 |


#### 7: Customer Function

Parameter to set the Customer Function.  


##### Overview 

Parameter to set the Customer Function.

 *  Bit 0: Reserve.
 *  Bit 1: Enable sending motion OFF report. (0:Disable, 1:Enable)  
    Note: Depends on the Bit4,  
    Report Notification CC, Type: 0x07, Event: 0xFE 1: Sensor Binary Report, Type: 0x0C, Value: 0x00
 *  Bit 2: Enable PIR super sensitivity mode. (0:Disable, 1:Enable)
 *  Bit 3: Disable send out BASIC OFF after door closed. (1:Disable, 0:Enable)
 *  Bit 4: Notification Type,  
    Using Notification Report. 1: Using Sensor Binary Report.
 *  Bit 5: Disable Multi CC in auto report. (1:Disable, 0:Enable)
 *  Bit 6: Disable to report battery state when the device triggered. (1:Disable, 0:Enable)
 *  Bit 7: Reserve.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 4 |


#### 8: PIR Re-Detect Interval Time

  


##### Overview 

In the normal mode, after the PIR motion detected, setting the re-detect time. 8 seconds per tick, default is 3 (24 seconds).

 *  1 - 127 = Number of ticks. 8 seconds per tick, default value is 3 (24 seconds).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER |
| Range | 1 to 127 |
| Default Value | 3 |


#### 9: Turn Off Light Time

  


##### Overview 

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

  


##### Overview 

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

  


##### Overview 

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


##### Overview 

The Interval time for auto reporting the illumination state.

 *  0 = Turn off auto report illumination.
 *  1-127 = Number of ticks. The default value is 12. The tick time can be set by configuration No. 20.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_1 |
| Data Type        | INTEGER |
| Range | 1 to 127 |
| Default Value | 12 |


#### 13: Auto Report Temperature Time

The interval time for auto reporting the temperature state.  


##### Overview 

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

The interval time for each auto report tick.  


##### Overview 

The interval time for each auto report tick. Setting this configuration will effect configuration No.10, No.11, No.12 and No.13.

 *  0 = Turn off all auto report functions.
 *  1-255 = Interval time for each tick. Default is 30.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_20_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 30 |


#### 21: Temperature Differential Report

The temperature differential to report.  


##### Overview 

The temperature differential to report. 0 means turn off this function. The unit is Fahrenheit. Enable this function the device will detect every minutes. And when the temperature is over 140 degree Fahrenheit, it will continue report. Enable this functionality will cause some issue please see the detail in the “Temperature Report” section.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_21_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 1 |


#### 22: Illumination Differential Report

The illumination differential to report.  


##### Overview 

The illumination differential to report. 0 means turn off this function. The unit is percentage. Enable this function the device will detect every minutes. Enable this functionality will cause some issue please see the detail in the “Illumination Report” section.


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
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/170).
