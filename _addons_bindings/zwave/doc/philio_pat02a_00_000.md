---
layout: documentation
title: PAT02-A - ZWave
---

{% include base.html %}

# PAT02-A Flood Multisensor (incl. humidty and temperature)

This describes the Z-Wave device *PAT02-A*, manufactured by *Philio Technology Corp* with the thing type UID of ```philio_pat02a_00_000```. 

Flood Multisensor (incl. humidty and temperature)  


## Overview 

The flood multisensor PAT02 has flood, temperature and humidity, 3 sensors function in one, based on Z-WaveTM technology. It is the Z-WaveTM plus product, it support the security, OTA... Those newest features of the Z-WaveTM technology. Z-WaveTM is a wireless communication protocol designed for home automation, specifically to remotely control applications in residential and light commercial environments. The technology uses a low-power RF radio embedded or retrofitted into home electronics devices and systems, such as lighting, home access control, entertainment systems and household appliances.

This product can be included and operated in any Z-WaveTM network with other Z-WaveTM certified devices from other manufacturers and/or other applications. All non-battery operated nodes within the network will act as repeaters regardless of vendor to increase reliability of the network.

  


### Inclusion Information 

There are one tamper keys in the back side of the device, It can add, remove, reset or association from the Z-WaveTM network. 

In the first time, add the device into the Z-WaveTM network. First, make sure the primary controller is in the add mode. And then power on the device, just take out the insulation Mylar in the back side of the device. The device will auto start the NWI (Network Wide Inclusion) mode. And it should be included in 5 seconds. You will see the LED light ON one second.

Notice: Including a node ID allocated by Z-WaveTM Controller means “Add” or “Inclusion”. Excluding a node ID allocated by Z-WaveTM Controller means “Remove” or “Exclusion”.

1.  Have Z-WaveTM Controller entered inclusion mode.
2.  Pressing the tamper key three times within 1.5 seconds to enter the inclusion mode.
3.  After add successful, the device will wake to receive the setting command from Z-WaveTM Controller about 20 seconds.

  


### Exclusion Information 

There are one tamper keys in the back side of the device, It can add, remove, reset or association from the Z-WaveTM network. 

In the first time, add the device into the Z-WaveTM network. First, make sure the primary controller is in the add mode. And then power on the device, just take out the insulation Mylar in the back side of the device. The device will auto start the NWI (Network Wide Inclusion) mode. And it should be included in 5 seconds. You will see the LED light ON one second.

Notice: Including a node ID allocated by Z-WaveTM Controller means “Add” or “Inclusion”. Excluding a node ID allocated by Z-WaveTM Controller means “Remove” or “Exclusion”.

1.  Have Z-WaveTM Controller entered exclusion mode.
2.  Pressing tamper key three times within 1.5 seconds to enter the exclusion mode. Node ID has been excluded.

  


### Wakeup Information 

After the device adding to the network, it will wake-up once per day in default. When it wake-up it will broadcast the “Wake Up Notification” message to the network, and wake-up 10 seconds for receive the setting commands.

The wake-up interval minimum setting is 30 minutes, and maximum setting is 120 hours. And the interval step is 30 minutes.

Press the tamper key once. The device will wake-up 10 seconds.


## Channels
The following table summarises the channels available for the PAT02-A Flood Multisensor (incl. humidty and temperature).

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Sensor (relative humidity) | sensor_relhumidity | sensor_relhumidity | Humidity | Number |
| Alarm (water) | alarm_flood | alarm_flood | Door | Switch |
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
The following table provides a summary of the configuration parameters available in the PAT02-A Flood Multisensor (incl. humidty and temperature).
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Basic Set OFF Level | Setting the BASIC command value. |
| 2: Basic Set ON Level | Setting the BASIC command value. |
| 5: Operation Mode | Parameter to set the Operation Mode. |
| 6: Multi-Sensor Function Switch | Parameter to set the sensor functions. |
| 7: Customer Function | Customer function switch, using bit control. |
| 10: Auto Report Battery Time | The interval time for auto reporting the battery level. |
| 13: Auto Report Temperature Time | The interval time for auto reporting the temperature state. |
| 14: Auto Report Humidity Time | The interval time for auto reporting the humidity state. |
| 15: Auto Report Flood Time | The interval time for auto reporting the flood state. |
| 20: Auto Report Tick Interval | The interval time for auto report each tick. |
| 21: Temperature Differential Report | The temperature differential to report. |
| 23: Humidity Differential Report | The humidity differential to report. |
| 1: Reports |  |
| 2: Light Control |  |


#### 1: Basic Set OFF Level

Setting the BASIC command value.  


##### Overview 

Setting the BASIC command value.

When the flood trigger off (0x00), send the BASIC CC to the group 2


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 1 to 100 |
| Default Value | 0 |


#### 2: Basic Set ON Level

Setting the BASIC command value.  


##### Overview 

Setting the BASIC command value.

When the flood trigger on(0xFF), send the BASIC CC to the group 2.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 1 to 100 |
| Default Value | 0 |


#### 5: Operation Mode

Parameter to set the Operation Mode.  


##### Overview 

Parameter to set the Operation Mode.

 *  Bit 0: Disable the Flood function
 *  Bit 1: Reserved.
 *  Bit 2: Reserved.
 *  Bit 3: Set the temperature scale. 0: Fahrenheit, 1:Celsius
 *  Bit 4: Reserved.


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

 *  Bit 0: Reserved.
 *  Bit 1: Reserved.
 *  Bit 2: Reserved.
 *  Bit 3: Reserved.
 *  Bit 4: Reserved.
 *  Bit 5: Reserved.
 *  Bit 6: Disable the 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 0 |


#### 7: Customer Function

Customer function switch, using bit control.  


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
| Range | 0 to 127 || Default Value | 0 |
| Options | Preset: Notification Type &#x3D; Binary (16) |


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
| Range | 0 to 127 |
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

 *  0 = Turn off auto report temperature.
 *  1-127 = Number of ticks. The default value is 12. The tick time can be set by configuration No. 20.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_1 |
| Data Type        | INTEGER |
| Range | 1 to 127 |
| Default Value | 12 |


#### 15: Auto Report Flood Time

The interval time for auto reporting the flood state.  


##### Overview 

The interval time for auto reporting the flood state.

 *  0 = Turn off auto report temperature.
 *  1-127 = Number of ticks. The default value is 12. The tick time can be set by configuration No. 20.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_15_1 |
| Data Type        | INTEGER |
| Range | 1 to 127 |
| Default Value | 12 |


#### 20: Auto Report Tick Interval

The interval time for auto report each tick.  


##### Overview 

The interval time for auto report each tick. Setting configuration will affect configuration no. 10, 13, 14 and 15.

 *  0 = Caution: Setting to 0 means turn off all auto report function.
 *  1-254 = Caution: The value is unsigned byt


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_20_1 |
| Data Type        | INTEGER |
| Range | 0 to 254 |
| Default Value | 30 |


#### 21: Temperature Differential Report

The temperature differential to report.  


##### Overview 

The temperature differential to report. The unit is Fahrenheit. Enable this function the device will detect every 10 seconds.

 *  0 = means turn off this function.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_21_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 1 |


#### 23: Humidity Differential Report

The humidity differential to report.  


##### Overview 

The humidity differential to report. The unit is percentage. Enable this function the device will detect every 10 seconds.

 *  0 = means turn off this function.


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
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/261).
