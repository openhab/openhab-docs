---
layout: documentation
title: ZW15SM - ZWave
---

{% include base.html %}

# ZW15SM Binary Switch + Meter

This describes the Z-Wave device *ZW15SM*, manufactured by *Wenzhou MTLC Electric Appliances Co.,Ltd.* with the thing type UID of ```enerwave_zw15sm_00_000```. 

Binary Switch + Meter  


### Inclusion Information 

The process of "Inclusion/ Exclusion" is to Add or Remove the device from the Hub. All Z-Wave devices must be "Included" on the Controller (Hub) before it can be controlled from a smart device. The Hub should be brought physically closer to the device just for the "Inclusion" process (recommended within 10ft). When finished, the Hub and device can be moved back to final installation location. 

1.  Go to the "Add Device" page.
2.  Select "Include Device".
3.  When prompted, press the "ON" or "OFF" Button on the switch

  


### Exclusion Information 

1.  From the Control Panel, go the the device Exclusion page.
2.  Select "Exclude Device".
3.  When prompted, press the "ON" or "OFF" Button on the switch.


## Channels
The following table summarises the channels available for the ZW15SM Binary Switch + Meter.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |


### Device Configuration
The following table provides a summary of the configuration parameters available in the ZW15SM Binary Switch + Meter.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: LED Toggle | Synchronization of load power and LED indicator |
| 2: Button Toggle | Configure button toggle |
| 8: Instant Energy Autosend Interval (METER_REPORT) | Instant Energy Autosend Interval (METER\_REPORT) |
| 9: Instant Energy Autosend Interval (SENSOR_MULTILEVEL_REPORT) | Instant Energy Autosend Interval (SENSOR\_MULTILEVEL\_REPORT) |
| 10: Accumulated Energy Autosend Interval report (METER_REPORT) | Accumulated Energy Autosend Interval report (METER\_REPORT) |
| 11: Power change notification | Enable automatic notifications whenever there is a wattage change |
| 12: Power change notification threshold | Minimum change in wattage report |
| 1: Lifeline | Send device reset locally notification |
| 2: StatusReport | Send basic report |
| 3: PowerReport | Send meter power report |
| 4: AssignGroupSet | Send Basic set command |


#### 1: LED Toggle

Synchronization of load power and LED indicator


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Power on, LED off (0) |
|  | Power on, LED on (1) |


#### 2: Button Toggle

Configure button toggle


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 0 |


#### 8: Instant Energy Autosend Interval (METER_REPORT)

Instant Energy Autosend Interval (METER\_REPORT)  


##### Overview 

Send METER\_REPORT at this interval

0 means to not send


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 9: Instant Energy Autosend Interval (SENSOR_MULTILEVEL_REPORT)

Instant Energy Autosend Interval (SENSOR\_MULTILEVEL\_REPORT)  


##### Overview 

Send SENSOR\_MULTILEVEL\_REPORT at this interval

0 means to not send


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 10: Accumulated Energy Autosend Interval report (METER_REPORT)

Accumulated Energy Autosend Interval report (METER\_REPORT)  


##### Overview 

Send accumulated METER\_REPORT at this interval

0 means to not send


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 11: Power change notification

Enable automatic notifications whenever there is a wattage change  


##### Overview 

Enable automatic notifications to associated device whenever there is a wattage change

0: No report

1: Send METER\_REPORT

2: Send SENSOR\_MULTILEVEL\_REPORT

3: Send both METER\_REPORT and SENSOR\_MULTILEVEL\_REPORT


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_1 |
| Data Type        | INTEGER |
| Range | 0 to 3 |
| Default Value | 1 |


#### 12: Power change notification threshold

Minimum change in wattage report  


##### Overview 

When the power changes by this many watts, send an automatic power level notification

0: 0.0W  
....  
255: 25.5W


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 10 |


#### 1: Lifeline

Send device reset locally notification


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: StatusReport

Send basic report


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: PowerReport

Send meter power report


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: AssignGroupSet

Send Basic set command


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/640).
