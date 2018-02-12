---
layout: documentation
title: plugInDimmer - ZWave
---

{% include base.html %}

# plugInDimmer Plug-in Dimmer

This describes the Z-Wave device *plugInDimmer*, manufactured by *BeNext* with the thing type UID of ```benext_plugindimmer_00_000```. 

Plug-in Dimmer


## Channels
The following table summarises the channels available for the plugInDimmer Plug-in Dimmer.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |


### Dimmer

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the plugInDimmer Plug-in Dimmer.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Reset to factory settings | Set all configuration values to default values (factory settings). |
| 4: Enable dimming | This parameter is used to enable the dimming option of the product. When disabled the dimm... |
| 6: Maximum powerload | The maximum powerload in watts when light is turned on, when measured higher then this val... |
| 7: Dimming speed | The speed of dimming when activated (manual and RF). Dim speed is 1% per value (\* 10 ms) |
| 8: Fading up speed | The speed of fading up when activated (manual and RF). Fade speed is 1% per value (\* 10 m... |
| 11: Auto meter report: percentage | A percentage that an energy value must be different compared to a previous sent value befo... |
| 12: Auto meter report: watt | A watt value that an energy value must be different compared to a previous sent value befo... |
| 13: Auto meter report: time | A time value that has to be passed compared to a previous sent value before a unsolicited ... |
| 14: Last known status | What to do with lamp status when power applied. If 0x00: Always switch light off when powe... |
| 15: Fading down speed | The speed of fading down when activated (manual and RF). Fade speed is 1% per value (\* 10... |
| 1: Group 1 | Receives BASIC SET commands |
| 2: Group 2 | Receives METER and MULTILEVEL\_SWITCH commands |


#### 1: Reset to factory settings

Set all configuration values to default values (factory settings).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 4: Enable dimming

This parameter is used to enable the dimming option of the product. When disabled the dimming and fading routine are disabled.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable (0) |
|  | Enable (1) |


#### 6: Maximum powerload

The maximum powerload in watts when light is turned on, when measured higher then this value the Plugin Dimmer is automatically stops with dimming or is turned off.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_2 |
| Data Type        | INTEGER |
| Range | 25 to 150 |
| Default Value | 125 |


#### 7: Dimming speed

The speed of dimming when activated (manual and RF). Dim speed is 1% per value (\* 10 ms)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 3 |


#### 8: Fading up speed

The speed of fading up when activated (manual and RF). Fade speed is 1% per value (\* 10 ms)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 1 |


#### 11: Auto meter report: percentage

A percentage that an energy value must be different compared to a previous sent value before an unsolicited meter report is sent. Minimum value = 1% Maximum value = 100%


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 1 |


#### 12: Auto meter report: watt

A watt value that an energy value must be different compared to a previous sent value before an unsolicited meter report is sent. Minimum value = 5 watt Maximum value = 255 watt


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 5 |


#### 13: Auto meter report: time

A time value that has to be passed compared to a previous sent value before a unsolicited meter report is sent. Minimum value = 10 seconds Maximum value = 255 seconds


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 10 |


#### 14: Last known status

What to do with lamp status when power applied. If 0x00: Always switch light off when power applied. If > 0x00: Switch lamp on/off depending on last known lampstatus before power was disconnected.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 15: Fading down speed

The speed of fading down when activated (manual and RF). Fade speed is 1% per value (\* 10 ms)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_15_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 1 |


#### 1: Group 1

Receives BASIC SET commands


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Group 2

Receives METER and MULTILEVEL\_SWITCH commands


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/226).
