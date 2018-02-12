---
layout: documentation
title: ZSE40 - ZWave
---

{% include base.html %}

# ZSE40 Zooz 4-in-one motion/temperature/humidity/luminance sensor

This describes the Z-Wave device *ZSE40*, manufactured by *Vision Security* with the thing type UID of ```vision_zse40_00_000```. 

Zooz 4-in-one motion/temperature/humidity/luminance sensor


## Channels
The following table summarises the channels available for the ZSE40 Zooz 4-in-one motion/temperature/humidity/luminance sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Sensor (motion) | sensor_binary | sensor_binary | Door | Switch |
| Sensor (luminance) | sensor_luminance | sensor_luminance | Temperature | Number |
| Sensor (relative humidity) | sensor_relhumidity | sensor_relhumidity | Humidity | Number |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
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
The following table provides a summary of the configuration parameters available in the ZSE40 Zooz 4-in-one motion/temperature/humidity/luminance sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Temperature Scale | Set the temperature scale |
| 2: Temperature offset |  |
| 3: Humidity | Configure Relative Humidity |
| 4: Light Sensor | Configure Light Sensor |
| 5: Trigger Interval | Set the trigger interval for motion sensor re-activation. |
| 6: Motion Sensor Sensitivity | Adjust sensitivity of the motion sensor. |
| 7: LED indicator mode | Select the LED indicator mode |
| 1: Receive updates | Receive sensor updates |


#### 1: Temperature Scale

Set the temperature scale


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


#### 2: Temperature offset


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 0 to 50 |
| Default Value | 1 |


#### 3: Humidity

Configure Relative Humidity


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 1 to 50 |
| Default Value | 10 |


#### 4: Light Sensor

Configure Light Sensor


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 1 to 50 |
| Default Value | 10 |


#### 5: Trigger Interval

Set the trigger interval for motion sensor re-activation.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 180 |


#### 6: Motion Sensor Sensitivity

Adjust sensitivity of the motion sensor.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER || Default Value | 4 |
| Options | highest (1) |
|  | higher (2) |
|  | high (3) |
|  | normal (4) |
|  | low (5) |
|  | lower (6) |
|  | lowest (7) |


#### 7: LED indicator mode

Select the LED indicator mode


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER || Default Value | 3 |
| Options | Off (1) |
|  | Pulsing Temperature, Flashing Motion (2) |
|  | Flashing Temperature and Motion (3) |


#### 1: Receive updates

Receive sensor updates


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/307).
