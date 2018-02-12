---
layout: documentation
title: DMOF1 - ZWave
---

{% include base.html %}

# DMOF1 Dome On/Off zwave wall plug for controlling small appliances and lights.

This describes the Z-Wave device *DMOF1*, manufactured by *Elexa Consumer Products Inc.* with the thing type UID of ```elexa_dmof1_00_000```. 

Dome On/Off zwave wall plug for controlling small appliances and lights.


## Channels
The following table summarises the channels available for the DMOF1 Dome On/Off zwave wall plug for controlling small appliances and lights..

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Electric meter (amps) | meter_current | meter_current | Energy | Number |
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number |
| Alarm (power) | alarm_power | alarm_power | Door | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the DMOF1 Dome On/Off zwave wall plug for controlling small appliances and lights..
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Disable Meter Functionality | Enable/Disable the meter report. |
| 2: METER_REPORT | The time between meter reports. |
| 3: Set &quot;Overload&quot; Current level | Maximum current the plug will pass |
| 4: Set &quot;Alert&quot; Current Level | Current level warning threshold |
| 5: Enable/Disable Indicator LED | This parameter enables or disables the indicator LED. |
| 6: Current change METER_REPORT level | Report of relative change in current flow |
| 7: Remember On/Off status | Remember status from last plug in. |
| 8: 01 | Timer once plugged in before it turn off the device. |
| 9: Set Timer Time Interval | Time before auto shut off if on. |
| 10: Enable/Disable BUTTON | Turn off the button |
| 1: Lifeline |  |
| 2: Group 2 |  |
| 3: Group 3 |  |


#### 1: Disable Meter Functionality

Enable/Disable the meter report.  


##### Overview 

This parameter enables/disables the METER\_REPORT function, which sends periodic reports to Group1 members with information on line voltage, current load, and power & energy consumption. Also see Param 2 & 6.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Disable Meter Functionality (0) |
|  | Enable Meter Functionality (1) |


#### 2: METER_REPORT

The time between meter reports.  


##### Overview 

This parameter sets the amount of time between each successive METER\_REPORT signal sent to Group 1 (also see Param 1 & 6.)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_2 |
| Data Type        | INTEGER |
| Range | 1 to 65535 |
| Default Value | 300 |


#### 3: Set &quot;Overload&quot; Current level

Maximum current the plug will pass  


##### Overview 

Sets the maximum current the plug will pass before it cuts off power and sends a NOTIFICATION\_EVENT\_POWER\_ MANAGEMENT\_OVER\_LOAD\_DETECTED signal to Group 1 and a BASIC\_SET(FF) to Group 2. The LED will then blink red once per second until the current returns to normal. To clear the NOTIFICATION and start monitoring again, the BUTTON must be pushed once (only after the current is back to normal.) **NOTE: this value must be higher than Param 4**


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 1 to 16 |
| Default Value | 13 |


#### 4: Set &quot;Alert&quot; Current Level

Current level warning threshold  


##### Overview 

Sets the current level at which the On/Off Plug-In Switch will flash its LED yellow, until the current returns to below this level. It will NOT cut off current to the device; this functions as a visible warning to the user. **NOTE: this value must be lower than Param 3**


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 1 to 16 |
| Default Value | 12 |


#### 5: Enable/Disable Indicator LED

This parameter enables or disables the indicator LED.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Disable LED (0) |
|  | Enable LED (1) |


#### 6: Current change METER_REPORT level

Report of relative change in current flow  


##### Overview 

In addition to sending a METER\_REPORT to Group 1 in the time interval set by Param 2, the On/Off Plug-In Switch also sends a METER\_REPORT when it detects a relative change in current flow. This parameter sets this minimum current change amount, in percent, at which point the On/Off Plug-In Switch will send a METER\_REPORT to Group 1. Also see Param 1 & 2.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER |
| Range | 1 to 64 |
| Default Value | 5 |


#### 7: Remember On/Off status

Remember status from last plug in.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Don&#x27;t Remember (0) |
|  | Remember (1) |


#### 8: 01

Timer once plugged in before it turn off the device.  


##### Overview 

If this parameter is enabled, whenever the On/Off Plug-In Switch is turned on, it will automatically turn off after a set amount of time (set in Param 9.)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 0 |


#### 9: Set Timer Time Interval

Time before auto shut off if on.  


##### Overview 

Sets the time interval before the On/Off Plug-In Switch automatically shuts off. See Param 8.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_4 |
| Data Type        | INTEGER |
| Range | 1 to 65535 |
| Default Value | 96 |


#### 10: Enable/Disable BUTTON

Turn off the button  


##### Overview 

If this parameter is enabled, the user can turn the device on or off using the BUTTON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Disable Button (0) |
|  | Enable Button (1) |


#### 1: Lifeline

  


##### Overview 

Group 1 is the “Lifeline” group, which can hold five devices. The On/Off Plug-In Switch sends this group a Notification Report and Binary Switch Report whenever it is turned on or off. It also sends a Meter Report incrementally based on time (see Param 2,) or when a relative change in power usage is detected (see Param 6.) Finally, the On/Off Plug-In Switch sends this group a Device Reset Locally notification to remove itself from the Z-Wave network. 


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Group 2

  


##### Overview 

The On/Off Plug-In Switch sends a BASIC\_SET(FF) command to Association Group 2 to directly trigger devices (like a siren, chime, etc.) when the current passes above the level set in Parameter 3. When the current drops below the level again, a BASIC\_SET(00) command is sent to reset the device (e.g. turn off the siren.) This Group can hold five devices.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Group 3

  


##### Overview 

The On/Off Plug-In Switch sends Notification Reports to Group 3, and it can hold five devices.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/645).
