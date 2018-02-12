---
layout: documentation
title: builtInDimmer - ZWave
---

{% include base.html %}

# builtInDimmer Built-in Dimmer

This describes the Z-Wave device *builtInDimmer*, manufactured by *BeNext* with the thing type UID of ```benext_builtindimmer_00_000```. 

Built-in Dimmer


## Channels
The following table summarises the channels available for the builtInDimmer Built-in Dimmer.

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
The following table provides a summary of the configuration parameters available in the builtInDimmer Built-in Dimmer.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Reset to factory settings | Set all configuration values to default values (factory settings). |
| 2: The way how the button reacts when press/released | The way how the button reacts when press/released |
| 3: The way the Built-in Dimmer reacts when light is turned on/off with button | The way the Built-in Dimmer reacts when light is turned on/off with button |
| 4: Enable dimming | This parameter is used to enable the dimming option of the product. When disabled the dimm... |
| 6: Maximum load | The maximum powerload in watts when light is turned on, when measured higher then this val... |
| 7: Dimming speed | The speed of dimming when activated (manual and RF). Dim speed is 1% per value (\* 10 ms) |
| 8: Fading up speed | The speed of fading when activated (manual and RF). Fade speed is 1% per value (\* 10 ms) |
| 9: Toggle time | The time window to repress button to start dimming. Toggle time is value (\* 10ms) |
| 11: Auto meter report: percentage | A percentage that an energy value must be different compared to a previous sent value befo... |
| 12: Auto meter report: watt | A watt value that an energy value must be different compared to a previous sent value befo... |
| 13: Auto meter report: time | A time value that has to be passed compared to a previous sent value before a unsolicited ... |
| 14: Last known status | What to do with lamp status when power applied. If 0x00: Always switch light off when powe... |
| 15: Fading down speed | The speed of fading when activated (manual and RF). Fade speed is 1% per value (\* 10 ms) |
| 1: Group 1 |  |
| 2: Group 2 |  |
| 3: Group 3 |  |


#### 1: Reset to factory settings

Set all configuration values to default values (factory settings).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 2: The way how the button reacts when press/released

The way how the button reacts when press/released


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Toggle light when button is pressed, no action when button is released (0) |
|  | Toggle light when button is released, Start dimming when button presse (1) |
|  | Toggle light when button is pressed and when button is Released, start (2) |


#### 3: The way the Built-in Dimmer reacts when light is turned on/off with button

The way the Built-in Dimmer reacts when light is turned on/off with button


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Switch own light on and send a Z-Wave message to all associated nodes (0) |
|  | Don.t switch own light on but only send a Z-Wave message to associated (1) |


#### 4: Enable dimming

This parameter is used to enable the dimming option of the product. When disabled the dimming and fading routine are disabled.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable (0) |
|  | Enable (1) |


#### 6: Maximum load

The maximum powerload in watts when light is turned on, when measured higher then this value the Inline Dimmer is automatically turned off.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 200 |


#### 7: Dimming speed

The speed of dimming when activated (manual and RF). Dim speed is 1% per value (\* 10 ms)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 3 |


#### 8: Fading up speed

The speed of fading when activated (manual and RF). Fade speed is 1% per value (\* 10 ms)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 3 |


#### 9: Toggle time

The time window to repress button to start dimming. Toggle time is value (\* 10ms)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 50 |


#### 11: Auto meter report: percentage

A percentage that an energy value must be different compared to a previous sent value before an unsolicited meter report is sent. Minimum value = 10% Maximum value = 100%


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 20 |


#### 12: Auto meter report: watt

A watt value that an energy value must be different compared to a previous sent value before an unsolicited meter report is sent. Minimum value = 5 watt Maximum value = 255 watt


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 10 |


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

The speed of fading when activated (manual and RF). Fade speed is 1% per value (\* 10 ms)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_15_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 1 |


#### 1: Group 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Group 2


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Group 3


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/225).
