---
layout: documentation
title: Oomi Plug - ZWave
---

{% include base.html %}

# Oomi Plug Oomi Plug is a low-cost Z-Wave Switch plug-in module specifically used to enable Z-Wave command and control (on/off) of any plug-in tool.

This describes the Z-Wave device *Oomi Plug*, manufactured by *Fantem* with the thing type UID of ```oomi_oomiplug_00_000```. 

Oomi Plug is a low-cost Z-Wave Switch plug-in module specifically used to enable Z-Wave command and control (on/off) of any plug-in tool.


## Channels
The following table summarises the channels available for the Oomi Plug Oomi Plug is a low-cost Z-Wave Switch plug-in module specifically used to enable Z-Wave command and control (on/off) of any plug-in tool..

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number |
| Electric meter (amps) | meter_current | meter_current | Energy | Number |
| Meter Reset | meter_reset | meter_reset | Energy | Switch |
| Color Control | color_color | color_color |  | Color |
| Color Temperature | color_temperature | color_temperature | ColorLight | Dimmer |
| Clock Time Offset | time_offset | time_offset | Temperature | Number |


### Dimmer

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


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
The following table provides a summary of the configuration parameters available in the Oomi Plug Oomi Plug is a low-cost Z-Wave Switch plug-in module specifically used to enable Z-Wave command and control (on/off) of any plug-in tool..
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 3: Current overload protection enable | Current overload protection enable |
| 20: Output load after re-power | Configure the output load status after re‐power |
| 80: Enable send to associated devices | Enable to send notifications to Group 1 |
| 81: Configure LED state | Configure the state of the LED |
| 83: Color in night light mode |  |
| 83: Blue night light color value | Blue night light color value |
| 83: Green night light color value | Green night light color value |
| 83: Red night light color value | Configure the RGB value when it is in Night light mode |
| 84: Color in energy mode |  |
| 84: Green brightness in energy mode (%) | Green brightness in energy mode (%) |
| 84: Yellow brightness in energy mode (%) | Yellow brightness in energy mode (%) |
| 84: Red brightness in energy mode (%) | Red brightness in energy mode (%) |
| 90: Enable items 91 and 92 | Enables/disables parameter 91 and 92 |
| 91: Wattage Threshold | minimum change in wattage to trigger |
| 92: Wattage Percent Change | minimum change in wattage percent |
| 101: Values to send to group 1 | Which reports need to send in Report group 1 |
| 102: Values to send to group 2 | Which reports need to send in Report group 2 |
| 103: Values to send to group 3 | Which reports need to send in Report group 3 |
| 111: Time interval for sending to group 1 | Group 1 automatic update interval |
| 112: Time interval for sending to group 2 | Group 2 automatic update interval |
| 113: Time interval for sending to group 3 | Group 3 automatic update interval |
| 252: Configuration Locked | Enable/disable Configuration Locked (0 =disable, 1 = enable). |
| 33: RGB LED color testing | Set the RGB LED color value for testing. |
| 100: Set 101‐103 to default. | Set 101‐103 to default. |
| 110: Set 111‐113 to default. | Set 111‐113 to default. |
| 255: RESET | Reset the device to defaults |
| 1: Group 1 | load notification type (lifeline) |
| 2: Group 2 | forwarding basic set (retransmit) |


#### 3: Current overload protection enable

Current overload protection enable  


##### Overview 

Current Overload Protection. Load will be closed when the Current overrun (US: 15.5A, other country: 16.2A) and the time more than 2 minutes (0=disabled, 1=enabled).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | disabled (0) |
|  | enabled (1) |


#### 20: Output load after re-power

Configure the output load status after re‐power  


##### Overview 

Configure the output load status after re-power on  
(0=last status, 1=always on, 2=always off)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_20_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | last status (0) |
|  | always on (1) |
|  | always off (2) |


#### 80: Enable send to associated devices

Enable to send notifications to Group 1  


##### Overview 

Enable to send notifications to associated devices (Group 1) when the state of Micro Switch’s load changed (0=nothing, 1=hail CC, 2=basic CC report).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_80_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | nothing (0) |
|  | hail CC (1) |
|  | basic CC report (2) |


#### 81: Configure LED state

Configure the state of the LED  


##### Overview 

Configure the state of LED when it is in 3 modes below:

 *  0= The LED will follow the status (on/off) of its load (Energy mode).
 *  1= When the state of Switch’s load changed, The LED will follow the status (on/off) of its load, but the red LED will turn off after 5 seconds if there is no any switch action (momentary indicate mode).
 *  2= Night light mode.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_81_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | LED follows load (0) |
|  | LED follows load for 5 seconds (1) |
|  | Night light mode (2) |


#### 83: Color in night light mode


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_83_3 |
| Data Type        | INTEGER |
| Range | 0 to 16777215 |
| Default Value | 0 |


#### 83: Blue night light color value

Blue night light color value  


##### Overview 

Value for parameter 83, night light blue color


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_83_3_000000FF |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 221 |


#### 83: Green night light color value

Green night light color value  


##### Overview 

Green color value for parameter 83, night light mode.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_83_3_0000FF00 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 160 |


#### 83: Red night light color value

Configure the RGB value when it is in Night light mode  


##### Overview 

Configure the RGB value when it is in Night light mode.  
Value1: Red color value  
Value2: Green color value  
Value3: Blue color value

defaults:

Value1=0xDD  
Value2=0xA0  
Value3=0xDD


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_83_3_00FF0000 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 221 |


#### 84: Color in energy mode


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_84_3 |
| Data Type        | INTEGER |
| Range | 0 to 16777215 |
| Default Value | 0 |


#### 84: Green brightness in energy mode (%)

Green brightness in energy mode (%)  


##### Overview 

Configure the brightness level of RGB LED (0%-100%) when  
it is in Energy Mode/momentary indicate mode.  
Value1: green color value.  
Value2: yellow color value.  
Value3: red color value.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_84_3_000000FF |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 50 |


#### 84: Yellow brightness in energy mode (%)

Yellow brightness in energy mode (%)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_84_3_0000FF00 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 50 |


#### 84: Red brightness in energy mode (%)

Red brightness in energy mode (%)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_84_3_00FF0000 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 50 |


#### 90: Enable items 91 and 92

Enables/disables parameter 91 and 92  


##### Overview 

Enables/disables parameter 91 and 92 below (1=enabled, 0=disabled).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_90_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | disabled (0) |
|  | enabled (1) |


#### 91: Wattage Threshold

minimum change in wattage to trigger  


##### Overview 

The value here represents minimum change in wattage (in  
terms of wattage) for a REPORT to be sent (Valid values 0-  
60000).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_91_2 |
| Data Type        | INTEGER |
| Range | 0 to 60000 |
| Default Value | 25 |


#### 92: Wattage Percent Change

minimum change in wattage percent  


##### Overview 

The value here represents minimum change in wattage  
percent (in terms of percentage) for a REPORT to be sent  
(Valid values 0-100).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_92_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 5 |


#### 101: Values to send to group 1

Which reports need to send in Report group 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_101_4 |
| Data Type        | INTEGER || Default Value | 4 |
| Options | Nothing (0) |
|  | Voltage (1) |
|  | Current (2) |
|  | Wattage (4) |
|  | kWh (8) |
|  | All Values (15) |


#### 102: Values to send to group 2

Which reports need to send in Report group 2


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_102_4 |
| Data Type        | INTEGER || Default Value | 8 |
| Options | Nothing (0) |
|  | Voltage (1) |
|  | Current (2) |
|  | Wattage (4) |
|  | kWh (8) |
|  | All Values (15) |


#### 103: Values to send to group 3

Which reports need to send in Report group 3


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_103_4 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Nothing (0) |
|  | Voltage (1) |
|  | Current (2) |
|  | Wattage (4) |
|  | kWh (8) |
|  | All Values (15) |


#### 111: Time interval for sending to group 1

Group 1 automatic update interval  


##### Overview 

The time interval of sending Report group 1 (Valid values 0x01-0xFFFFFFFF).

Default value is 3

Note: Only up to 0x7fffffff is currently supported


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_111_4 |
| Data Type        | INTEGER |
| Range | 1 to 2147483647 |
| Default Value | 3 |


#### 112: Time interval for sending to group 2

Group 2 automatic update interval  


##### Overview 

The time interval of sending Report group 1 (Valid values 0x01-0xFFFFFFFF).

Default value is 600

Note: Only up to 0x7fffffff is currently supported


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_112_4 |
| Data Type        | INTEGER |
| Range | 1 to 2147483647 |
| Default Value | 600 |


#### 113: Time interval for sending to group 3

Group 3 automatic update interval  


##### Overview 

The time interval of sending Report group 1 (Valid values 0x01-0xFFFFFFFF).

Default value is 600

Note: Only up to 0x7fffffff is currently supported


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_113_4 |
| Data Type        | INTEGER |
| Range | 600 to 1 |
| Default Value | 2147483647 |


#### 252: Configuration Locked

Enable/disable Configuration Locked (0 =disable, 1 = enable).  


##### Overview 

Enable/disable Configuration Locked (0 =disable, 1 =enable).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_252_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | disabled (0) |
|  | enabled (1) |


#### 33: RGB LED color testing

Set the RGB LED color value for testing.  


##### Overview 

Value1: Reserved

Value2: Red value

Value3: Green value

Value4: Blue value


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_33_4_wo |
| Data Type        | INTEGER |
| Range | 0 to 4294967295 |
| Default Value | 0 |


#### 100: Set 101‐103 to default.

Set 101‐103 to default.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_100_1_wo |
| Data Type        | INTEGER || Default Value | 0 |
| Options | False (0) |
|  | True (1) |


#### 110: Set 111‐113 to default.

Set 111‐113 to default.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_110_1_wo |
| Data Type        | INTEGER || Default Value | 0 |
| Options | False (0) |
|  | True (1) |


#### 255: RESET

Reset the device to defaults  


##### Overview 

Reset configuration set up to default setting.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_255_1_wo |
| Data Type        | INTEGER |
| Range |  to  |
| Default Value | 0 |


#### 1: Group 1

load notification type (lifeline)  


##### Overview 

When the state of Smart Switch (turn on/off the load ) is changed:

1.  Set Configuration parameter 80 to 0 Reserved (Default).
2.  Set Configuration parameter 80 to 1 Send Hail CC.
3.  Set Configuration parameter 80 to 2: Send the Basic Report.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Group 2

forwarding basic set (retransmit)  


##### Overview 

Forward the Basic Set, Switch Binary Set to associated nodes in Group 2 when the Smart Switch receives the Basic Set, Switch Binary Set commands from main controller.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/730).
