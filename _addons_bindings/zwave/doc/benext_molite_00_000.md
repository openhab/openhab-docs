---
layout: documentation
title: Molite - ZWave
---

{% include base.html %}

# Molite Movement sensor with temperature and light sensor

This describes the Z-Wave device *Molite*, manufactured by *BeNext* with the thing type UID of ```benext_molite_00_000```. 

Movement sensor with temperature and light sensor


## Channels
The following table summarises the channels available for the Molite Movement sensor with temperature and light sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Sensor (luminance) | sensor_luminance | sensor_luminance | Temperature | Number |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Alarm | alarm_general | alarm_general | Door | Switch |
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
The following table provides a summary of the configuration parameters available in the Molite Movement sensor with temperature and light sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Reset to factory settings | Set all configuration values to default values (factory settings). |
| 2: Mode timeout | The time used in mode 2 to turn the sensor off. This time will start running as soon as de... |
| 3: Switch off time | The switch off time will start running as soon as mode timeout is done. The Motion sensor ... |
| 4: sensitivity | the sensitivity of the motion circuit |
| 5: The mode | The mode that is entered after detection |
| 6: The temperature offset | An offset for the temperature. |
| 7: Light table 100 % | If a LDR resistance measured lower then this value the returned light percentage is 100%. ... |
| 8: Light table 90 % | If a LDR resistance measured lower then this value the returned light percentage is 90%. S... |
| 9: Light table 80 % | If a LDR resistance measured lower then this value the returned light percentage is 80%. S... |
| 10: Light table 70 % | If a LDR resistance measured lower then this value the returned light percentage is 70%. S... |
| 11: Light table 60 % | If a LDR resistance measured lower then this value the returned light percentage is 60%. S... |
| 12: Light table 50 % | If a LDR resistance measured lower then this value the returned light percentage is 50%. S... |
| 13: Light table 40 % | If a LDR resistance measured lower then this value the returned light percentage is 40%. S... |
| 14: Light table 30 % | If a LDR resistance measured lower then this value the returned light percentage is 30%. S... |
| 15: Light table 20 % | If a LDR resistance measured lower then this value the returned light percentage is 20%. S... |
| 16: Light table 10 % | If a LDR resistance measured lower then this value the returned light percentage is 10%. S... |
| 1: Devices to be switched on when motion detected and off after on time |  |


#### 1: Reset to factory settings

Set all configuration values to default values (factory settings).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 2: Mode timeout

The time used in mode 2 to turn the sensor off. This time will start running as soon as detection is seen.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_2 |
| Data Type        | INTEGER |
| Range | 0 to 900 |
| Default Value | 900 |


#### 3: Switch off time

The switch off time will start running as soon as mode timeout is done. The Motion sensor is turned on and when movement is detected again. The mode timeout (cfg param 1) will start running all over again. When switch off time is done a basic off message


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_2 |
| Data Type        | INTEGER |
| Range | 0 to 2700 |
| Default Value | 2700 |


#### 4: sensitivity

the sensitivity of the motion circuit


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 80 |


#### 5: The mode

The mode that is entered after detection


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | Mode 1: no detection possible. Battery save mode. (1) |
|  | Mode 2: normal operation mode: send on after detection and off after g (2) |
|  | Mode 3: Z-Wave chip is always on to request e.g. version or manufactur (3) |


#### 6: The temperature offset

An offset for the temperature.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 0 |


#### 7: Light table 100 %

If a LDR resistance measured lower then this value the returned light percentage is 100%. See chapter light table for more information.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_2 |
| Data Type        | INTEGER |
| Range | 0 to 17 |
| Default Value | 17 |


#### 8: Light table 90 %

If a LDR resistance measured lower then this value the returned light percentage is 90%. See chapter light table for more information.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_2 |
| Data Type        | INTEGER |
| Range | 0 to 38 |
| Default Value | 38 |


#### 9: Light table 80 %

If a LDR resistance measured lower then this value the returned light percentage is 80%. See chapter light table for more information.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_2 |
| Data Type        | INTEGER |
| Range | 0 to 85 |
| Default Value | 85 |


#### 10: Light table 70 %

If a LDR resistance measured lower then this value the returned light percentage is 70%. See chapter light table for more information.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_2 |
| Data Type        | INTEGER |
| Range | 0 to 186 |
| Default Value | 186 |


#### 11: Light table 60 %

If a LDR resistance measured lower then this value the returned light percentage is 60%. See chapter light table for more information.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_2 |
| Data Type        | INTEGER |
| Range | 0 to 407 |
| Default Value | 407 |


#### 12: Light table 50 %

If a LDR resistance measured lower then this value the returned light percentage is 50%. See chapter light table for more information.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_2 |
| Data Type        | INTEGER |
| Range | 0 to 891 |
| Default Value | 891 |


#### 13: Light table 40 %

If a LDR resistance measured lower then this value the returned light percentage is 40%. See chapter light table for more information.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_2 |
| Data Type        | INTEGER |
| Range | 0 to 1949 |
| Default Value | 1949 |


#### 14: Light table 30 %

If a LDR resistance measured lower then this value the returned light percentage is 30%. See chapter light table for more information.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_2 |
| Data Type        | INTEGER |
| Range | 0 to 4265 |
| Default Value | 4265 |


#### 15: Light table 20 %

If a LDR resistance measured lower then this value the returned light percentage is 20%. See chapter light table for more information.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_15_2 |
| Data Type        | INTEGER |
| Range | 0 to 9332 |
| Default Value | 9332 |


#### 16: Light table 10 %

If a LDR resistance measured lower then this value the returned light percentage is 10%. See chapter light table for more information.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_16_2 |
| Data Type        | INTEGER |
| Range | 0 to 20417 |
| Default Value | 20417 |


#### 1: Devices to be switched on when motion detected and off after on time


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/374).
