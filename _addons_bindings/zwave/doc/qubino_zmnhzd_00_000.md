---
layout: documentation
title: ZMNHZD - ZWave
---

{% include base.html %}

# ZMNHZD Multifunctional Weather Station

This describes the Z-Wave device *ZMNHZD*, manufactured by *Goap* with the thing type UID of ```qubino_zmnhzd_00_000```. 

Multifunctional Weather Station


## Channels
The following table summarises the channels available for the ZMNHZD Multifunctional Weather Station.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Sensor (velocity) | sensor_velocity | sensor_velocity |  | Number |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Sensor (relative humidity) | sensor_relhumidity | sensor_relhumidity | Humidity | Number |
| Sensor (direction) | sensor_direction | sensor_direction |  | Number |
| Sensor (rain rate) | sensor_rainrate | sensor_rainrate | Humidity | Number |
|  | battery-level | system.battery-level |  |  |
| Thermo/ Hygro Sensor Ch1 – Temperature | sensor_temperature1 | sensor_temperature | Temperature | Number |
|  | battery-level1 | system.battery-level |  |  |
| Wind Gauge – Direction | sensor_direction2 | sensor_direction |  | Number |
|  | battery-level2 | system.battery-level |  |  |
| Wind Gauge – Velocity | sensor_velocity3 | sensor_velocity |  | Number |
|  | battery-level3 | system.battery-level |  |  |
| Wind Gauge – Wind gust | sensor_velocity4 | sensor_velocity |  | Number |
|  | battery-level4 | system.battery-level |  |  |
| Wind Gauge – Temperature | sensor_temperature5 | sensor_temperature | Temperature | Number |
|  | battery-level5 | system.battery-level |  |  |
| Wind Gauge – Wind Chill | sensor_temperature6 | sensor_temperature | Temperature | Number |
|  | battery-level6 | system.battery-level |  |  |
| Rain Sensor | sensor_rainrate7 | sensor_rainrate | Humidity | Number |
|  | battery-level7 | system.battery-level |  |  |
| Thermo/ Hygro Sensor Ch1 – Humidity | sensor_relhumidity8 | sensor_relhumidity | Humidity | Number |
|  | battery-level8 | system.battery-level |  |  |
| Thermo/ Hygro Sensor Ch2 – Temperature | sensor_temperature9 | sensor_temperature | Temperature | Number |
|  | battery-level9 | system.battery-level |  |  |
| Thermo/ Hygro Sensor Ch2 – Humidity | sensor_relhumidity10 | sensor_relhumidity | Humidity | Number |
|  | battery-level10 | system.battery-level |  |  |


### Sensor (temperature)

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Thermo/ Hygro Sensor Ch1 – Temperature

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Wind Gauge – Temperature

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Wind Gauge – Wind Chill

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Thermo/ Hygro Sensor Ch2 – Temperature

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the ZMNHZD Multifunctional Weather Station.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Wind Gauge | Wind Gauge, Wind Gust Top Value |
| 2: Rain Gauge | Rain Rate top value |
| 3: Wind Gauge | Wind Gust |
| 4: Rain Gauge | Rain Rate |
| 5: End Point 1 | Unsolicited report |
| 6: End Point 2 | Unsolicited report |
| 7: End Point 3 | Unsolicited report |
| 8: End Point 4 | Unsolicited report |
| 9: End Point 5 | Unsolicited report |
| 10: End Point 6 | Unsolicited report |
| 11: End Point 7 | Unsolicited report |
| 12: End Point 8 | Unsolicited report |
| 13: End Point 9 | Unsolicited report |
| 14: End Point 10 | Unsolicited report |
| 15: Random ID enable | enables/disables random ID |
| 250: Unsecure / Secure Inclusion | Unsecure / Secure Inclusion |
| 1: Lifeline group | reserved for the communication with the main controller |
| 2: Basic on/off | triggered when the wind gust of the wind gauge exceed the configuration parameter 1 value |
| 3: Basic on/off | triggered when the rain rate exceed the configuration parameter 2 value |


#### 1: Wind Gauge

Wind Gauge, Wind Gust Top Value  


##### Overview 

Wind Gauge, Wind Gust Top Value, if the Wind Gust is Higher than the Parameter Value, a device triggers an Association


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_2 |
| Data Type        | INTEGER |
| Range | 0 to 8800 |
| Default Value | 1000 |


#### 2: Rain Gauge

Rain Rate top value  


##### Overview 

If the sensor Rain Rate is higher than the parameter value, a device triggers a association.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_2 |
| Data Type        | INTEGER |
| Range | 0 to 30000 |
| Default Value | 200 |


#### 3: Wind Gauge

Wind Gust  


##### Overview 

0 - if the wind gauge is higher than the parameter No. 1 value, then a device sends basic set = 0x00

1 - if the wind gauge is higher than the parameter No. 1 value, then a device sends basic set =0xff


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 1 |


#### 4: Rain Gauge

Rain Rate  


##### Overview 

0 - if the rain amount is higher than the parameter No. 2 value, then a device sends basic set = 0x00

1 - if the rain amount is higher than the parameter No. 2 value, then a device sends basic set =0xff


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 1 |


#### 5: End Point 1

Unsolicited report  


##### Overview 

0 - Unsolicited report disabled

1 - Unsolicited report enabled


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 1 |


#### 6: End Point 2

Unsolicited report  


##### Overview 

0 - Unsolicited report disabled

1 - Unsolicited report enabled


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 1 |


#### 7: End Point 3

Unsolicited report  


##### Overview 

0 - Unsolicited report disabled

1 - Unsolicited report enabled


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 1 |


#### 8: End Point 4

Unsolicited report  


##### Overview 

0 - Unsolicited report disabled

1 - Unsolicited report enabled


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 1 |


#### 9: End Point 5

Unsolicited report  


##### Overview 

0 - Unsolicited report disabled

1 - Unsolicited report enabled


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 1 |


#### 10: End Point 6

Unsolicited report  


##### Overview 

0 - Unsolicited report disabled

1 - Unsolicited report enabled


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 1 |


#### 11: End Point 7

Unsolicited report  


##### Overview 

0 - Unsolicited report disabled

1 - Unsolicited report enabled


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 1 |


#### 12: End Point 8

Unsolicited report  


##### Overview 

0 - Unsolicited report disabled

1 - Unsolicited report enabled


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 1 |


#### 13: End Point 9

Unsolicited report  


##### Overview 

0 - Unsolicited report disabled

1 - Unsolicited report enabled


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 1 |


#### 14: End Point 10

Unsolicited report  


##### Overview 

0 - Unsolicited report disabled

1 - Unsolicited report enabled


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 1 |


#### 15: Random ID enable

enables/disables random ID  


##### Overview 

If Random ID is disabled, the Weather Station USB Key can receive data from multiple 433 MHz Sensors on the same Channel. If the Random ID is enabled, the USB Key can receive data from only one sensor on the same channel. If the USB Key does not receive a data from a sensor on a specific channel for more than 2.5 hours, it clears the Random ID of the device and waits for a new ID. If you replace the batteries in the modules, the Random ID will change. If you want that the USB Key accept a module immediately, set the Parameter No. 15 to “0” and in the next step again to “1”.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_15_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 0 |


#### 250: Unsecure / Secure Inclusion

Unsecure / Secure Inclusion  


##### Overview 

 *  default Value 0
 *  0 – Unsecure Inclusion
 *  1 – Secure Inclusion

The Weather Station Key supports both, the secure and unsecure inclusion. Even if the controller does not support security command classes, the Key could be included as unsecure and keep all the functionality. By default, the Key includes as unsecure. To include the Key as secure follow the procedure:

1.  Include the Key into the controller
2.  Set the parameter 250 to the value “1”
3.  Enable add/remove mode on main controller,
4.  Hold service button S between 1.5 and 4 seconds to exclude the module
5.  If the exclusion of the module was successful, the LED on the module starts blinking
6.  Unplug the module out of the power supply
7.  enable add/remove mode on main controller
8.  Plug the module into the power supply to star autoinclusion
9.  Now the module should be included as secure

The same procedure is to include the module as unsecure


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_250_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 0 |


#### 1: Lifeline group

reserved for the communication with the main controller


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Basic on/off

triggered when the wind gust of the wind gauge exceed the configuration parameter 1 value


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Basic on/off

triggered when the rain rate exceed the configuration parameter 2 value


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/364).
