---
layout: documentation
title: MH10 PM2.5 WA - ZWave
---

{% include base.html %}

# MH10 PM2.5 WA PM2.5 Monitor

This describes the Z-Wave device *MH10 PM2.5 WA*, manufactured by *McoHome Technology Co., Ltd* with the thing type UID of ```mcohome_mh10pm25_00_000```. 

PM2.5 Monitor


## Channels
The following table summarises the channels available for the MH10 PM2.5 WA PM2.5 Monitor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Particulate Sensor | sensor_particulate | sensor_particulate |  | Number |
| Sensor (relative humidity) | sensor_relhumidity | sensor_relhumidity | Humidity | Number |


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
The following table provides a summary of the configuration parameters available in the MH10 PM2.5 WA PM2.5 Monitor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Gateway | Report to this the associated device(gateway)when detected data change |


#### 1: Gateway

Report to this the associated device(gateway)when detected data change


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/716).
