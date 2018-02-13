---
layout: documentation
title: HS1SA - ZWave
---

{% include base.html %}

# HS1SA Smoke Detector

This describes the Z-Wave device *HS1SA*, manufactured by *Heiman Technology Co. Ltd* with the thing type UID of ```heiman_hs1sa_00_000```. 

Smoke Detector  


## Overview 

The smart smoke sensor detects smoke, and sends an alarm signals to alert of danger. When the smart smoke sensor detects smoke, it will send an alarm notification to your controller through wireless Z-Wave communication protocol.

  


### Inclusion Information 

Press the pin 3 times within 1.5s, Green LED is Blinking 3 times within 1 second. If Inclusion Process is successful, Green led will turn off.

  


### Exclusion Information 

Press the pin 3 times within 1.5s. If Exclusion Process is successful, Green led is Blinking 6 times, then turn off. 

  


### Wakeup Information 

Wake up Notification is transmitted every 24 hours by default. Wake up Notification is transmitted after Notification Report is Transmitted.


## Channels
The following table summarises the channels available for the HS1SA Smoke Detector.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Alarm (smoke) | alarm_smoke | alarm_smoke | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the HS1SA Smoke Detector.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/530).
