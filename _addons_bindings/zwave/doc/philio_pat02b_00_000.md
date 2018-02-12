---
layout: documentation
title: PAT02-B - ZWave
---

{% include base.html %}

# PAT02-B Z-Wave room sensor

This describes the Z-Wave device *PAT02-B*, manufactured by *Philio Technology Corp* with the thing type UID of ```philio_pat02b_00_000```. 

Z-Wave room sensor


## Channels
The following table summarises the channels available for the PAT02-B Z-Wave room sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Sensor (relative humidity) | sensor_relhumidity | sensor_relhumidity | Humidity | Number |
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
The following table provides a summary of the configuration parameters available in the PAT02-B Z-Wave room sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 5: Operation Mode | set Operation Mode using bit to control |
| 7: Customer Function | Customer Function switch using bit control |
| 10: Auto Report Battery Time | The interval time for auto reporting the battery level. |
| 13: Auto Report Temperature Time | The interval time for auto reporting the temperature state. |
| 14: Auto Report Humidity Time | The interval time for auto reporting the humidity state. |
| 20: Auto Report Tick Interval | The interval time for auto report each tick. |
| 21: Temperature Differential Report | The temperature differential to report. |
| 23: Humidity Differential Report | The humidity differential to report. |
| 1: Reports |  |
| 2: Light Control |  |


#### 5: Operation Mode

set Operation Mode using bit to control  


##### Overview 

set Operation Mode using bit to control

 *  Bit 0: Reserve
 *  Bit 1: Reserve
 *  Bit 2: Reserve
 *  Bit 3: Setting temperature scale
    
     *  0: Fahrenheit
     *  1: Celsius
 *  Bit 4: Reserve
 *  Bit 5: Reserve
 *  Bit 6: Reserve
 *  Bit 7: Reserve


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 7: Customer Function

Customer Function switch using bit control  


##### Overview 

Customer Function switch using bit control

 *  Bit 0: Reserve
 *  Bit 1: Reserve
 *  Bit 2: Reserve
 *  Bit 3: not applicable for this device variant, set to 0
 *  Bit 4: Notification Type
    
     *  0: Using Notification Report
     *  1: Using Sensor Binary Report
 *  Bit 5: Disable Multi CC in auto report
    
     *  0: Enable
     *  1: Disable
 *  Bit 6: not applicable for this device variant, set to 0
 *  Bit 7: Reserve


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 10: Auto Report Battery Time

The interval time for auto reporting the battery level.  


##### Overview 

The interval time for auto reporting the battery level.

 *  0 = Turn off auto report battery.
 *  1-127 = Number of ticks. The default value is 12. The tick time can be set by configuration No. 20.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
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


#### 14: Auto Report Humidity Time

The interval time for auto reporting the humidity state.  


##### Overview 

The interval time for auto reporting the humidity state.

 *  0 = Turn off auto report.
 *  1-127 = Number of ticks. The default value is 12. The tick time can be set by configuration No. 20.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 0 |


#### 20: Auto Report Tick Interval

The interval time for auto report each tick.  


##### Overview 

The interval time for auto report each tick. Units of one minute. Setting configuration will affect configuration no. 10, 13, 14 and 15.

 *  Caution1: Setting to 0 means turn off all auto report function.
 *  Caution2: The value is unsigned byte.


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

 *  The unit is Fahrenheit.
 *  Enable this function the device will detect every 10 seconds.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_21_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 0 |


#### 23: Humidity Differential Report

The humidity differential to report.  


##### Overview 

The humidity differential to report.

 *  The unit is percentage.
 *  Enable this function the device will detect every 10 seconds.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_23_1 |
| Data Type        | INTEGER |
| Range | 0 to 60 |
| Default Value | 5 |


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
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/533).
