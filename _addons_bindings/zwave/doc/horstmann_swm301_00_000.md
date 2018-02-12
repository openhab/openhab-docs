---
layout: documentation
title: SWM301 - ZWave
---

{% include base.html %}

# SWM301 Z-Wave Module for Water Meter

This describes the Z-Wave device *SWM301*, manufactured by *Horstmann Controls Limited* with the thing type UID of ```horstmann_swm301_00_000```. 

Z-Wave Module for Water Meter  


## Overview 

SWM 301 is a battery-powered RF module using Z-Wave® technology for reporting secondary water metering readings in domestic dwellings.

The RF module records the meter reading by backlash-free pick-up on the litre wheel of the meter register and transmits the data over the Zwave network either on a time or delta change.

  


### Inclusion Information 

1.  Put network controller in Inclusion / Exclusion mode.
2.  Hold a small magnet near to reed switch until the LED is turned on. Remove magnet right away when LED turned on. LED will remain on for next 4 seconds and then it will flash once to indicate NIF is sent.
3.  Repeat the step 2 if LED is not flashed once.
4.  The controller will indicate the successful inclusion/ exclusion operation.

  


### Wakeup Information 

Hold a small magnet near to reed switch until the LED is turned on. Remove magnet right away when LED turned on. LED will remain on for next 4 seconds and then it will flash once to indicate NIF is sent.

SWM301 will wake up for 10 seconds after sending NIF


## Channels
The following table summarises the channels available for the SWM301 Z-Wave Module for Water Meter.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Water meter (amps) | meter_water_cubic_meters | meter_water_cubic_meters | Energy | Number |
|  | battery-level | system.battery-level |  |  |
| Alarm (heat) | alarm_heat | alarm_heat |  | Switch |


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
The following table provides a summary of the configuration parameters available in the SWM301 Z-Wave Module for Water Meter.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Meter register offset | current meter reading |
| 2: Meter reading reporting intervals | how often meter reading is sent |
| 3: Delta config for meter reading | min. delta for automatic report |
| 4: Mechanical meter serial number |  |
| 5: Temperature monitor on / off | enable temperature monitor |
| 6: Temperature delta | change in temperature for report |
| 7: Temperature Alarm Threshold | temperature triggering alarm |
| 1: Meter reading | Group receiving meter readings |
| 2: low battery | Group receiving battery warnings |
| 3: Temperature and low temp alarm | Group receiving temperature |


#### 1: Meter register offset

current meter reading  


##### Overview 

Offset to adjust the reported to the actual meter reading.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_4 |
| Data Type        | INTEGER |
| Range | 0 to 99999999 |
| Default Value | 0 |


#### 2: Meter reading reporting intervals

how often meter reading is sent  


##### Overview 

Defines how often the meter reading is sent.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_2 |
| Data Type        | INTEGER |
| Range | 1 to 10000 |
| Default Value | 1440 |


#### 3: Delta config for meter reading

min. delta for automatic report  


##### Overview 

Defines the minimum change of the meter reading that results in an unsolicited meter report.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_2 |
| Data Type        | INTEGER |
| Range | 0 to 10000 |
| Default Value | 0 |


#### 4: Mechanical meter serial number


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_4 |
| Data Type        | INTEGER |
| Range | 0 to 4294967295 |
| Default Value | 0 |


#### 5: Temperature monitor on / off

enable temperature monitor  


##### Overview 

Enables or disables the temperature monitor.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 0 |


#### 6: Temperature delta

change in temperature for report  


##### Overview 

Defines how much the temperature has to change for an unsolicited temperature report.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER |
| Range | 0 to 30 |
| Default Value | 0 |


#### 7: Temperature Alarm Threshold

temperature triggering alarm  


##### Overview 

Defines below what temperature a low temperature alarm is reported.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER |
| Range | 0 to 40 |
| Default Value | 0 |


#### 1: Meter reading

Group receiving meter readings  


##### Overview 

Group 1 - Nodes to receive unsolicited water meter reading.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: low battery

Group receiving battery warnings  


##### Overview 

Group 2 - Nodes to receive unsolicited low battery warnings report.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Temperature and low temp alarm

Group receiving temperature  


##### Overview 

Group 3 - Nodes to receive unsolicited temperature report and low temperature alarm.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/459).
