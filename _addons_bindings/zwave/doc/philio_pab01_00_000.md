---
layout: documentation
title: ZIP-PAB01 - ZWave
---

{% include base.html %}

# ZIP-PAB01 Zipato Micromodule Energy Meter

This describes the Z-Wave device *ZIP-PAB01*, manufactured by *Philio Technology Corp* with the thing type UID of ```philio_pab01_00_000```. 

Zipato Micromodule Energy Meter


## Channels
The following table summarises the channels available for the ZIP-PAB01 Zipato Micromodule Energy Meter.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Intensty meter 0 (amps) | meter_current | meter_current | Energy | Number |
| Power factor 0 | meter_powerfactor | meter_powerfactor | Energy | Number |
| Power meter 0 (watts) | meter_watts | meter_watts | Energy | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Line voltage (volts) | meter_voltage | meter_voltage | Energy | Number |
| Intensity meter 1 (amps) | meter_current1 | meter_current | Energy | Number |
| Power factor meter 1 | meter_powerfactor1 | meter_powerfactor | Energy | Number |
| Power meter 1 (watts) | meter_watts1 | meter_watts | Energy | Number |
| Energy meter 1 (kWh) | meter_kwh1 | meter_kwh | Energy | Number |
| Line voltage (volts) | meter_voltage1 | meter_voltage | Energy | Number |
| Intensity meter 2 (amps) | meter_current2 | meter_current | Energy | Number |
| power factor 2 | meter_powerfactor2 | meter_powerfactor | Energy | Number |
| Power meter 2 (watts) | meter_watts2 | meter_watts | Energy | Number |
| Energy meter 2 (kWh) | meter_kwh2 | meter_kwh | Energy | Number |
| Line voltage 2 (volts) | meter_voltage2 | meter_voltage | Energy | Number |
| Intensity meter 3 (amps) | meter_current3 | meter_current | Energy | Number |
| Power factor 3 | meter_powerfactor3 | meter_powerfactor | Energy | Number |
| Power meter 3 (watts) | meter_watts3 | meter_watts | Energy | Number |
| Energy meter 3 (kWh) | meter_kwh3 | meter_kwh | Energy | Number |
| Voltage 3 (volts) | meter_voltage3 | meter_voltage | Energy | Number |


### Device Configuration
The following table provides a summary of the configuration parameters available in the ZIP-PAB01 Zipato Micromodule Energy Meter.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Power meter report period | Power meter report period, in 5 seconds unit. 720 -> 1 hour |
| 2: Energy meter report period | The accumulated power consumption report period |
| 3: Selected default endpoint | 1 => CT1 and CT2, 2 => CT1, 3 => CT2 |
| 1: CT1 and CT2 | Sum of CT1 and CT2 |
| 2: CT1 | Data from CT1 |
| 3: CT2 | Data from CT2 |


#### 1: Power meter report period

Power meter report period, in 5 seconds unit. 720 -> 1 hour  


##### Overview 

If the setting is configured for 1 hour (set value 720), the module will report its instant power consumption every 1 hour to the node of the corresponding group. The maximum interval to report its instant power consumption is 45h (5s \* 32767 / 3600 = 45h)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_2 |
| Data Type        | INTEGER |
| Range | 1 to 32767 |
| Default Value | 720 |


#### 2: Energy meter report period

The accumulated power consumption report period  


##### Overview 

If the setting is configured for 1 hour (set value 720), the module will report its accumulated power consumption every 1 hour to the node of the corresponding group. The maximum interval to report its accumulated power consumption is 45h (5s \* 32767 / 3600 = 45h)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_2 |
| Data Type        | INTEGER |
| Range | 1 to 32767 |
| Default Value | 720 |


#### 3: Selected default endpoint

1 => CT1 and CT2, 2 => CT1, 3 => CT2  


##### Overview 

If Controller does not use Multi Channel command class to access the endpoint of the module, you may configure the endpoint that will react to the Basic Command Class, Binary Switch command class or Meter command class V3.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 1 to 3 |
| Default Value | 1 |


#### 1: CT1 and CT2

Sum of CT1 and CT2  


##### Overview 

Sum of :

 *  Instant power consumption from CT1 and CT2 (W)
 *  Accumulated power consumption from CT1 and CT2 (kWh)


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: CT1

Data from CT1  


##### Overview 

 *  Instant power consumption from CT1 (W)
 *  Accumulated power consumption from CT1 (kWh)


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: CT2

Data from CT2  


##### Overview 

1.  Instant power consumption from CT2 (W)
2.  Accumulated power consumption from CT2 (kWh)


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/560).
