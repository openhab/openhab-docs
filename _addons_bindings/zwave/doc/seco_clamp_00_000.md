---
layout: documentation
title: Zwave Clamp - ZWave
---

{% include base.html %}

# Zwave Clamp Clamp Energy Meter

This describes the Z-Wave device *Zwave Clamp*, manufactured by *Seco* with the thing type UID of ```seco_clamp_00_000```. 

Clamp Energy Meter


## Channels
The following table summarises the channels available for the Zwave Clamp Clamp Energy Meter.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Electric meter (amps) | meter_current | meter_current | Energy | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number |
| Clock Time Offset | time_offset | time_offset | Temperature | Number |


### Clock Time Offset

#### Automatic Update Offset

The number of seconds difference in the time before it is reset  
Setting this will automatically update the devices clock when the time difference between the device, and the computer exceeds this number of seconds.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_offset |
| Data Type        | INTEGER |
| Range | 10 to 600 || Default Value | 60 |
| Options | Disable Auto Update (0) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the Zwave Clamp Clamp Energy Meter.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/569).
