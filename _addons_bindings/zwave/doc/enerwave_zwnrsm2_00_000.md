---
layout: documentation
title: ZWN-RSM2 - ZWave
---

{% include base.html %}

# ZWN-RSM2 Smart Dual Relay Switch Module

This describes the Z-Wave device *ZWN-RSM2*, manufactured by *Wenzhou MTLC Electric Appliances Co.,Ltd.* with the thing type UID of ```enerwave_zwnrsm2_00_000```. 

Smart Dual Relay Switch Module


## Channels
The following table summarises the channels available for the ZWN-RSM2 Smart Dual Relay Switch Module.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch |
| Switch 2 | switch_binary2 | switch_binary | Switch | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the ZWN-RSM2 Smart Dual Relay Switch Module.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 3: Unsolicited Report Configuration | ZWN-RSM2 can send unsolicited status report to primary controller (Node ID 0X01) when swit... |


#### 3: Unsolicited Report Configuration

ZWN-RSM2 can send unsolicited status report to primary controller (Node ID 0X01) when switch toggled due to some controllers designed as gateway. If your controller is not a gateway or does not need the status or you think it could confuse your Z-Wave net


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/465).
