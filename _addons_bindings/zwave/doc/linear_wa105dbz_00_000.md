---
layout: documentation
title: Siren &amp; Strobe Alarm - ZWave
---

{% include base.html %}

# Siren &amp; Strobe Alarm Siren

This describes the Z-Wave device *Siren &amp; Strobe Alarm*, manufactured by *Linear Corp* with the thing type UID of ```linear_wa105dbz_00_000```. 

Siren


## Channels
The following table summarises the channels available for the Siren &amp; Strobe Alarm Siren.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the Siren &amp; Strobe Alarm Siren.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 0: Siren Strobe Mode | Defines the reaction of the siren |
| 1: Alarm auto stop | Defines the auto time out of the alarm indication |


#### 0: Siren Strobe Mode

Defines the reaction of the siren


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_0_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | All Enabled (0) |
|  | Siren Only (1) |
|  | Strobe Only (2) |


#### 1: Alarm auto stop

Defines the auto time out of the alarm indication


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | 30 seconds (0) |
|  | 60 seconds (1) |
|  | 120 seconds (2) |
|  | Continuous (3) |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/365).
