---
layout: documentation
title: PAT02-C - ZWave
---

{% include base.html %}

# PAT02-C Flood Sensor

This describes the Z-Wave device *PAT02-C*, manufactured by *Philio Technology Corp* with the thing type UID of ```philio_pat02c_00_000```. 

Flood Sensor


## Channels
The following table summarises the channels available for the PAT02-C Flood Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Alarm (flood) | alarm_flood | alarm_flood | Door | Switch |
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the PAT02-C Flood Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Basic Set OFF Level | Setting the BASIC command value |
| 2: Basic Set ON Level | Setting the BASIC command value |
| 5: Operation Mode | Operation mode. Using bit to control. |
| 7: Customer Function | Parameter to set the sensor functions |
| 10: Auto Report Battery Time | The interval time for auto report the battery level. |
| 15: Auto Report Flood Time | The interval time for auto report the flood state. |
| 20: Auto Report Tick Interval | The interval time for auto reporting each tick. |
| 1: Reports |  |
| 2: Light Control |  |


#### 1: Basic Set OFF Level

Setting the BASIC command value  


##### Overview 

 *  Setting the BASIC command value
    
     *  When the flood trigger off(0x00), send the BASIC CC to the group 2.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 2: Basic Set ON Level

Setting the BASIC command value  


##### Overview 

 *  Setting the BASIC command value
    
     *  When the flood trigger on(0xFF), send the BASIC CC to the group 2.  


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 255 |


#### 5: Operation Mode

Operation mode. Using bit to control.  


##### Overview 

Operation mode. Using bit to control.

 *  Bit0: Disable the Flood function.
 *  Bit1: Reserve.
 *  Bit2: Reserve.
 *  Bit3: not applicable for this device variant, set to 0
 *  Bit4: Reserve.
 *  Bit5: not applicable for this device variant, set to 1
 *  Bit6: Reserve.
 *  Bit7: Reserve.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 || Default Value | 0 |
| Options | Flood function is enabled (32) |
|  | Flood function is disabled (33) |


#### 7: Customer Function

Parameter to set the sensor functions  


##### Overview 

Customer Function switch using bit control

 *  Bit 0: Reserve
 *  Bit 1: Reserve
 *  Bit 2: Reserve
 *  Bit 3: Disable send out BASI OFF after flood event cleared
    
     *  0: Enable
     *  1: Disable
 *  Bit 4: Notification Type
    
     *  0: Using Notification Report
     *  1: Using Sensor Binary Report
 *  Bit 5: Disable Multi CC in auto report
    
     *  0: Enable
     *  1: Disable
 *  Bit 6: Disable to report Battery state when the device triggered
    
     *  0: Enable
     *  1: Disable
 *  Bit 7: Reserve


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 10: Auto Report Battery Time

The interval time for auto report the battery level.  


##### Overview 

The interval time for auto report the battery level.

0 means turn off auto report. The default value is 12. The tick time can setting by the configuration No.20.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 12 |


#### 15: Auto Report Flood Time

The interval time for auto report the flood state.  


##### Overview 

The interval time for auto report the flood state.

0 means turn off auto report. The default value is 12. The tick time can setting by the configuration No.20.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_15_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 12 |


#### 20: Auto Report Tick Interval

The interval time for auto reporting each tick.  


##### Overview 

The interval time for auto report each tick.

Setting this configuration will effect configuration No.10, No.13, No.14 and No.15.

Units of one minute.

Caution1: Setting to 0 means turn off all auto report function.

Caution2: The value is unsigned byte


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_20_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 30 |


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
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/178).
