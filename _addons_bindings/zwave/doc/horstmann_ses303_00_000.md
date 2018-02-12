---
layout: documentation
title: SES 303 - ZWave
---

{% include base.html %}

# SES 303 Temperature and humidity sensor

This describes the Z-Wave device *SES 303*, manufactured by *Horstmann Controls Limited* with the thing type UID of ```horstmann_ses303_00_000```. 

Temperature and humidity sensor


## Channels
The following table summarises the channels available for the SES 303 Temperature and humidity sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Sensor (relative humidity) | sensor_relhumidity | sensor_relhumidity | Humidity | Number |
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
The following table provides a summary of the configuration parameters available in the SES 303 Temperature and humidity sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Delta Temp | Precision of measured temperature (delta) |
| 2: Temp Reporting Interval | Reporting interval in minutes |
| 3: Delta Humidity | Precision of measured humidity (delta) |
| 4: Humidity Reporting Interval | Reporting interval in minutes |


#### 1: Delta Temp

Precision of measured temperature (delta)  


##### Overview 

Configuration value : Desired value / Resolution. (Resolution = 0.1)

**Example**: To configure Delta temperature to 2 °C,  the value needed to be configured in device is 2/0.1 = 20.

  
**IMPORTANT**: Controllers may only allow configuring signed values. In order to set values in the range 128...255, the value sent in the application shall be equal to desired value minus 256. For example, to set Delta Temperature to 130, it may be needed to set a value 130−256=−126.  
  


Zero configuration means that the corresponding functionality is disabled.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 2: Temp Reporting Interval

Reporting interval in minutes  


##### Overview 

**IMPORTANT**: Controllers may only allow configuring signed values. In order to set values in the range 128...255, the value sent in the application shall be equal to desired value minus 256. For example, to set Delta Temperature to 130, it may be needed to set a value 130−256=−126.  
  


Zero configuration means that the corresponding functionality is disabled.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 5 |


#### 3: Delta Humidity

Precision of measured humidity (delta)  


##### Overview 

Configuration value : Desired value / Resolution. (Resolution = 0.1)

**Example**: To configure Delta temperature to 2 °C,  the value needed to be configured in device is 2/0.1 = 20.

**IMPORTANT**: Controllers may only allow configuring signed values. In order to set values in the range 128...255, the value sent in the application shall be equal to desired value minus 256. For example, to set Delta Temperature to 130, it may be needed to set a value 130−256=−126.  
  


Zero configuration means that the corresponding functionality is disabled.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 5 |


#### 4: Humidity Reporting Interval

Reporting interval in minutes  


##### Overview 

**IMPORTANT**: Controllers may only allow configuring signed values. In order to set values in the range 128...255, the value sent in the application shall be equal to desired value minus 256. For example, to set Delta Temperature to 130, it may be needed to set a value 130−256=−126.  
  


Zero configuration means that the corresponding functionality is disabled.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 5 |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/782).
