---
layout: documentation
title: PST02B - ZWave
---

{% include base.html %}

# PST02B Slim Multi-Sensor (PIR/Temperature/Illumination)

This describes the Z-Wave device *PST02B*, manufactured by *Philio Technology Corp* with the thing type UID of ```philio_pst02b_00_000```. 

Slim Multi-Sensor (PIR/Temperature/Illumination)


## Channels
The following table summarises the channels available for the PST02B Slim Multi-Sensor (PIR/Temperature/Illumination).

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Sensor (luminance) | sensor_luminance | sensor_luminance | Temperature | Number |
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch |
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
The following table provides a summary of the configuration parameters available in the PST02B Slim Multi-Sensor (PIR/Temperature/Illumination).
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 2: Basic Set Level | BASIC command value sent when turning on lights |
| 3: PIR Sensitivity | PIR Sensitivity setting. |
| 4: Light Threshold | Illumination threshold for turning on associated lights. |
| 5: Operation Mode | Mode of operation and enabled multisensor functions |
| 6: Multisensor Function Switch | Enable or disable functions of the multisensor. |
| 7: Customer Function | Enable or disable functions of the multisensor. |
| 8: PIR Re-Detect Interval Time | Time period to wait until reporting motion detected again. |
| 9: Turn Off Light Time | Time to wait before sending command to turn off lights |
| 10: Auto Report Battery Time | The interval time for auto reporting the battery level. |
| 12: Auto Report Illumination Time | The interval time for auto reporting the illumination state |
| 13: Auto Report Temperature Time | The interval time for auto reporting the temperature. |
| 1: Reports |  |
| 2: Light Control |  |


#### 2: Basic Set Level

BASIC command value sent when turning on lights  


##### Overview 

BASIC command value to send when turning on the light.

 *  \-1 (0xFF): turn on the light
 *  0: turn off the light
 *  1–100: send this dimmer value


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | -1 to 100 |
| Default Value | -1 |


#### 3: PIR Sensitivity

PIR Sensitivity setting.  


##### Overview 

Sensitivity for the PIR (Passiv Infrared) sensor

 *  0: Disable PIR motion detection.
 *  1–99: Motion detection sensitivity, where 1 is the lowest and 99 is the highest.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 0 to 99 |
| Default Value | 70 |


#### 4: Light Threshold

Illumination threshold for turning on associated lights.  


##### Overview 

When the event is triggered and the environment illumination is lower than the threshold, the device will turn on the associated lights.

 *  0: turn off the illumination detection function and *never* turn on the lights
 *  1: darkest threshold level
 *  99 brightest threshold level
 *  100: turn off the illumination detection function and *always* turn on the lights.

Note: when not in test mode, only values in the range 1–99 will enable the illumination detection function and update the illumination value.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 100 |


#### 5: Operation Mode

Mode of operation and enabled multisensor functions  


##### Overview 

Bitfield for setting the device in certain modes and enabling or disabling specific functions of the multisensor device.

 *  Bit 0: reserved.
 *  Bit 1: device mode. 0 = normal mode; 1 = test mode.
 *  Bit 2: disable the door/window function. 0 = enabled; 1 = disabled.
 *  Bit 3: temperature unit. 0 = Fahrenheit; 1 = Celcius.
 *  Bit 4: disable the illumination report after event triggered. 0 = enabled; 1 = disabled.
 *  Bit 5: disable the temperature report after event triggered. 0 = enabled; 1 = disabled.
 *  Bit 6: reserved.
 *  Bit 7: disable the back key release into test mode. 0 = enabled; 1 = disabled.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 0 |


#### 6: Multisensor Function Switch

Enable or disable functions of the multisensor.  


##### Overview 

Bitfield for enabling or disabling functions of the multisensor.

 *  Bit 0: Disable magnetic integrate illumination.
 *  Bit 1: Disable PIR integrate Illumination.
 *  Bit 2: Disable magnetic integrate PIR (Default is 1 = disabled).
 *  Bit 3: When bit 2 is 0 (enabled), is the device is installed in the same room as the light? 0 = In the same room; 1 = In another room.
    
     *  Note: If this bit is 1, it is recommended to also set bit 1 to 1, because when the PIR triggered, it doesn't mean that a person is in the room where the lights are.
 *  Bit 4: Disable the 5 seconds delay to turn off the light, when door/window is closed.
 *  Bit 5: Disable auto turn off the light, after door/window opened to turn on the light.
    
     *  *Note: If bit 2 is 0, this setting has no effect.*
     *  *Note: If configuration parameter is 0, **this setting has no effect.*
 *  Bit 6: Reserved
 *  Bit 7: Reserved


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER |
| Range | 0 to 63 |
| Default Value | 4 |


#### 7: Customer Function

Enable or disable functions of the multisensor.  


##### Overview 

Bitfield for enabling or disabling certain customer functions of the multisensor device.

 *  Bit 0: Reserved.
 *  Bit 1: Enable sending motion OFF report. 0=Disable; 1=Enable. *Note: Depends on the value of bit 4, see below:*
    
     *  Bit 4 is 0: Report Notification CC, Type: 0x07, Event: 0xFE.
     *  Bit 4 is 1: Sensor Binary Report, Type: 0x0C, Value: 0x00.
 *  Bit 2: Enable PIR super sensitivity mode. 0=Disable; 1=Enable.
 *  Bit 3: Disable sending BASIC OFF after door/window is closed. 1=Disable, 0=Enable.
 *  Bit 4: Notification type. 0=Using Notification Report; 1=Using Sensor Binary Report.
 *  Bit 5: Disable Multi CC in auto report. 1=Disable; 0=Enable.
 *  Bit 6: Disable reporting battery state when the device is triggered. 1=Disable; 0=Enable.
 *  Bit 7: Reserved.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 || Default Value | 0 |
| Options | Preset for motion detection settings. (22) |


#### 8: PIR Re-Detect Interval Time

Time period to wait until reporting motion detected again.  


##### Overview 

After sending a "motion detected" report, wait at least the configured number of seconds before sending a new "motion detected" report.

The timeout is the configured value multiplied with 8 seconds, i.e. value 3 (the default) means 24 seconds timeout.

*Note:* This setting applies to normal mode only.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER |
| Range | 1 to 127 |
| Default Value | 3 |


#### 9: Turn Off Light Time

Time to wait before sending command to turn off lights  


##### Overview 

When a BASIC SET command has been sent to turn on lights and motion is no longer detected by the PIR sensor, wait the configured time before sending a "turn off light" command.

The timeout is the configured value multiplied with 8 seconds, i.e. value 4 (the default) means 32 seconds timeout.

0 means "never turn off the lights".


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 4 |


#### 10: Auto Report Battery Time

The interval time for auto reporting the battery level.  


##### Overview 

The interval time for auto reporting the battery level. The value is multiplied with the value of configuration parameter 20 and the unit is minutes. If the value is 0, auto reporting of battery level is turned off.

If this parameter has its default value (12) and parameter 20 has its default value (30), the interval time is 6 hours.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 12 |


#### 12: Auto Report Illumination Time

The interval time for auto reporting the illumination state  


##### Overview 

The interval time for auto reporting the battery level. The value is multiplied with the value of configuration parameter 20 and the unit is minutes. If the value is 0, auto reporting of illumination is turned off.

If this parameter has its default value (12) and parameter 20 has its default value (30), the interval time is 6 hours.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 12 |


#### 13: Auto Report Temperature Time

The interval time for auto reporting the temperature.  


##### Overview 

The interval time for auto reporting the temperature. The value is multiplied with the value of configuration parameter 20 and the unit is minutes. If the value is 0, auto reporting of temperature is turned off.

If this parameter has its default value (12) and parameter 20 has its default value (30), the interval time is 6 hours.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 12 |


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
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/169).
