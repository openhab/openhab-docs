---
layout: documentation
title: HS1HT-Z - ZWave
---

{% include base.html %}

# HS1HT-Z Temperature/Humidity Sensor

This describes the Z-Wave device *HS1HT-Z*, manufactured by *Heiman Technology Co. Ltd* with the thing type UID of ```heiman_hs1htz_00_000```. 

Temperature/Humidity Sensor  


## Overview 

Smart Temperature and Humidity Sensor is designed to detect the temperature and humidity in house, and reports the abnormal conditions to users' mobile phone, Users could also check the real-time temperature and humidity via mobile phone, The sensor adopts Z-Wave wireless communication protocol with high sensitivity.

See:  
https://products.z-wavealliance.org/products/2321  
and  
http://www.heimantech.com/product/80.html

  


### Inclusion Information 

Click \[Add\] icon in Z-Wave Controller.  
\-  Press the Net\_Button 3 times within 1.5s, Green LED is Blinking 3 times within 1 second.  
\-  If Inclusion Process is successful, Green LED will turn off.

  


### Exclusion Information 

Click \[Remove\] icon in Z-Wave Controller.  
\-  Press the Net\_Button 3 times within 1.5s  
\-  If Exclusion Process is successful, Green LED is Blinking 6 times, then turn off


## Channels
The following table summarises the channels available for the HS1HT-Z Temperature/Humidity Sensor.

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
The following table provides a summary of the configuration parameters available in the HS1HT-Z Temperature/Humidity Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Lifeline | Association group 1: Lifeline association group Maximum supported node is 1. Include comma... |
| 2: Multilevel sensor temperature | Association group 2: Root Device group(multilevel sensor temperature) Maximum supported no... |
| 3: Multilevel sensor humidity | Association group 3: Root Device group(multilevel sensor humidity) Maximum supported nodes... |


#### 1: Lifeline

Association group 1: Lifeline association group Maximum supported node is 1. Include command classes: Battery report, multilevel sensor report, and Device Reset Locally.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Multilevel sensor temperature

Association group 2: Root Device group(multilevel sensor temperature) Maximum supported nodes are 5. 1- multilevel Sensor reports status of the temperature via Lifeline. 2-When the sensor detects status of the temperature, the device will be triggered.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Multilevel sensor humidity

Association group 3: Root Device group(multilevel sensor humidity) Maximum supported nodes are 5. 1-multilevel Sensor reports status of the humidity via Lifeline. 2-When the sensor detects status of the humidity , the device will be triggered.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/709).
