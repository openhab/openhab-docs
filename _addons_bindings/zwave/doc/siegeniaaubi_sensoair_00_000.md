---
layout: documentation
title: Sensoair - ZWave
---

{% include base.html %}

# Sensoair Air quality sensor for indoor use

This describes the Z-Wave device *Sensoair*, manufactured by *SIEGENIA-AUBI KG* with the thing type UID of ```siegeniaaubi_sensoair_00_000```. 

Air quality sensor for indoor use


## Channels
The following table summarises the channels available for the Sensoair Air quality sensor for indoor use.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Sensor (CO2) | sensor_co2 | sensor_co2 |  | Number |


### Device Configuration
The following table provides a summary of the configuration parameters available in the Sensoair Air quality sensor for indoor use.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Device Configuration Value 1 | Configuration of the device operating mode |
| 2: Interval for unsolicited Sensor Report Mode B | defines how often a Sensor report is sent |
| 1: Group 1 |  |


#### 1: Device Configuration Value 1

Configuration of the device operating mode  


##### Overview 

 *  bit 0    Unsolicited Multilevel Report Mode A    0 = disabled, 1 = **enabled**
 *  bit 1    Unsolicited Multilevel Report Mode B    0 = **disabled**, 1 = enabled
 *  bit 2    Basic Set                                         0 = disabled, 1 = **enabled**
 *  bit 3    Broadcast Multilevel Report                 0 = disabled, 1 = **enabled**
 *  bit 7    SENSOAIR LEDs                               0 = disabled, 1 = **enabled**

**Unsolicited Multilevel Report Mode A**

SENSOAIR sends an usolicited multilevel report when the CO2 value  
exceeds one of the following threshold values:  
600 ppm, 800 ppm, 1000 ppm, 1500 ppm, 2000 ppm, 2500 ppm

**Unsolicited Multilevel Report Mode B**  


SENSOAIR sends the current CO2 value (without being requested) in an interval of  
5 - 65000 seconds. The interval can be configured with parameter 2.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 143 |
| Default Value | 141 |


#### 2: Interval for unsolicited Sensor Report Mode B

defines how often a Sensor report is sent  


##### Overview 

When enabled by parameter 1, SENSOAIR sends the current CO2 value (without being requested) in an interval of 5 - 65000 seconds. The interval (default setting = 30s) is configured as follows:

Device Configuration Value 1 = MSB (default 0x00)

Device Configuration Value 2 = LSB (default 0x1e)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_2 |
| Data Type        | INTEGER |
| Range | 5 to 65000 |
| Default Value | 30 |


#### 1: Group 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/451).
