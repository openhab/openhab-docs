---
layout: documentation
title: SF812 - ZWave
---

{% include base.html %}

# SF812 Smoke Sensor

This describes the Z-Wave device *SF812*, manufactured by *Everspring* with the thing type UID of ```everspring_sf812_00_000```. 

Smoke Sensor  


## Overview 

The photoelectric Smoke Detector is a Z-WaveTM enabled device which is fully  
compatible with any Z-WaveTM enabled network. Z-WaveTM enabled devices  
displaying the Z-WaveTM logo can also be used with it regardless of the  
manufacturer, and ours can also be used in other manufacturer’s Z-WaveTM  
enabled networks. Inclusion of this detector on other manufacturer’s Wireless  
Controller menu allows remote operation of connected modules when the  
detector is triggered.  
The detector is designed to sense smoke that comes into the detector chamber.  
It does not sense gas, heat, or flame. The working principle is when the smoke  
detector detects a certain density of smoke, the horn of smoke detector will  
sound and in the meantime, the detector will emit the signals to the associated  
devices for further execution. It can provide precious time for you and your  
family to escape before a fire spreads.

  


### Inclusion Information 

Pressing link key three times within 1.5 second will enter inclusion mode. The Detector will stay “awake” for 10 minutes to allow time for setting and device status enquiring.

  


### Exclusion Information 

Pressing link key three times within 1.5 second will enter exclusion mode. The Detector will stay “awake” for 10 minutes to allow time for setting and device status enquiring.


## Channels
The following table summarises the channels available for the SF812 Smoke Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Alarm (tamper) | alarm_tamper | alarm_tamper |  | Switch |
| Alarm (Low battery) | alarm_battery | alarm_battery |  | Switch |
|  | battery-level | system.battery-level |  |  |
| Alarm (smoke) | alarm_smoke | alarm_smoke | Door | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the SF812 Smoke Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Alarm notifications |  |


#### 1: Alarm notifications


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/33).
