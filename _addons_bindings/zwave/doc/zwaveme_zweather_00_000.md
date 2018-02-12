---
layout: documentation
title: Z-Weather - ZWave
---

{% include base.html %}

# Z-Weather Z-Wave weather interface

This describes the Z-Wave device *Z-Weather*, manufactured by *Z-Wave.Me* with the thing type UID of ```zwaveme_zweather_00_000```. 

Z-Wave weather interface


## Channels
The following table summarises the channels available for the Z-Weather Z-Wave weather interface.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Sensor (luminance) | sensor_luminance | sensor_luminance | Temperature | Number |
| Sensor (velocity) | sensor_velocity | sensor_velocity |  | Number |
| Sensor (barometric pressure) | sensor_barpressure | sensor_barpressure | Temperature | Number |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Sensor (relative humidity) | sensor_relhumidity | sensor_relhumidity | Humidity | Number |
| Sensor (dew point) | sensor_dewpoint | sensor_dewpoint | Temperature | Number |
| Electric meter (pulses) | meter_pulse | meter_pulse | Energy | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
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
The following table provides a summary of the configuration parameters available in the Z-Weather Z-Wave weather interface.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Wind Speed Action Threshold | Available Parameters: 0 - Off 1 - 30 in milliseconds Default = 6 m/s |
| 2: Twilight Action Threshold | Set from 0 - 100 % Default = 37% (street lighting) |
| 1: Life Line |  |
| 2: Wind Speed | Wind speed is higher than 6 m/s (22 Km/h) |
| 3: End of Dawn | At the end of the dawn if it becomes bright |
| 4: End of Dusk | At the end of the dusk if it becomes bright |


#### 1: Wind Speed Action Threshold

Available Parameters: 0 - Off 1 - 30 in milliseconds Default = 6 m/s


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 30 |
| Default Value | 6 |


#### 2: Twilight Action Threshold

Set from 0 - 100 % Default = 37% (street lighting)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 37 |


#### 1: Life Line


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Wind Speed

Wind speed is higher than 6 m/s (22 Km/h)


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: End of Dawn

At the end of the dawn if it becomes bright


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: End of Dusk

At the end of the dusk if it becomes bright


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/258).
