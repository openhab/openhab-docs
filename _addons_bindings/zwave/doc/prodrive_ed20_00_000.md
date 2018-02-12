---
layout: documentation
title: ED2.0 - ZWave
---

{% include base.html %}

# ED2.0 Eneco Meter Adapter

This describes the Z-Wave device *ED2.0*, manufactured by *Prodrive Technologies* with the thing type UID of ```prodrive_ed20_00_000```. 

Eneco Meter Adapter  


## Overview 

The meter adapter measures gas and electricity usage of analog and digital meters. Analog meters are read by means of optical sensors that can be placed on the meter to monitor the rotating disc or the blinking LED. In case of a digital meter, the meter adapter can be connected to the digital meter by means of a P1 digital communication interface. The meter adapter measures the cumulative and instantaneous gas and electricity consumption and sends this information to a Z-Wave enabled display (ED2.0 Display).

  


### Inclusion Information 

Press Button


## Channels
The following table summarises the channels available for the ED2.0 Eneco Meter Adapter.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Clock Time Offset | time_offset | time_offset | Temperature | Number |
| Gas meter (cubic meters) | meter_gas_cubic_meters1 | meter_gas_cubic_meters | Energy | Number |
| Electric meter (kWh) | meter_kwh2 | meter_kwh | Energy | Number |
| Electric meter (kWh) | meter_kwh3 | meter_kwh | Energy | Number |
| Electric meter (kWh) | meter_kwh4 | meter_kwh | Energy | Number |
| Electric meter (kWh) | meter_kwh5 | meter_kwh | Energy | Number |
| Electric meter (kWh) | meter_kwh6 | meter_kwh | Energy | Number |


### Clock Time Offset

#### Automatic Update Offset

The number of seconds difference in the time before it is reset  
Setting this will automatically update the devices clock when the time difference between the device, and the computer exceeds this number of seconds.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_offset |
| Data Type        | INTEGER |
| Range | 10 to 600 || Default Value | 60 |
| Options | Disable Auto Update (0) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the ED2.0 Eneco Meter Adapter.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 0: Gas Metering | Enable and disable gas metering |
| 1: Gas Meter resolution | The resolution of the analog gas meter |
| 2: Electricity metering | Enable and disable Electricity metering |
| 3: Electricity meter resolution | The resolution of the analog electricity meter |


#### 0: Gas Metering

Enable and disable gas metering


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_0_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | disable gas metering (0) |
|  | enable gas metering (1) |


#### 1: Gas Meter resolution

The resolution of the analog gas meter  


##### Overview 

The resolution of the analog gas meter (revolutions per m³) in unsigned Q14.2 notation.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 400 |


#### 2: Electricity metering

Enable and disable Electricity metering


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | disable electricity metering (0) |
|  | enable electricity metering (1) |


#### 3: Electricity meter resolution

The resolution of the analog electricity meter  


##### Overview 

The resolution of the analog electricity meter (revolutions per kWh) in unsigned Q14.2 notation.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 400 |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/345).
