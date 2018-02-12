---
layout: documentation
title: SES FS-ZW - ZWave
---

{% include base.html %}

# SES FS-ZW Plug Actuator

This describes the Z-Wave device *SES FS-ZW*, manufactured by *Diehl AKO* with the thing type UID of ```diehl_sesfszw_00_000```. 

Plug Actuator  


### Inclusion Information 

The inclusion process is controlled by the central unit – refer to the documentation for the central unit.

1. Plug the plug actuator into a fixed mains outlet with grounding contacts (CEE 7/4).

2. Start “Inclusion” mode on the chosen central unit.

3. Press the button on the plug actuator 3 times within a period of around 2 seconds.

The Status LED lights up white.

During the next 5 seconds, the wireless connection is established and the inclusion process for linking the plug actuator to the central unit is performed.

  


### Exclusion Information 

The exclusion process is controlled by the central unit – refer to the documentation for the central unit.

1. Make sure that no device is plugged into the plug actuator.

2. Start “Exclusion” mode on the chosen central unit.

3. Press the button on the plug actuator 3 times within a period of around 2 seconds.

The Status LED lights up white.

The exclusion process for disconnecting the plug actuator from the central unit runs for the next 5 seconds. The Status LED flashes white 3x once the exclusion process has been successfully completed.


## Channels
The following table summarises the channels available for the SES FS-ZW Plug Actuator.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Alarm (system) | alarm_system | alarm_system |  | Switch |
| Alarm (heat) | alarm_heat | alarm_heat |  | Switch |
| Alarm (power) | alarm_power | alarm_power | Door | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the SES FS-ZW Plug Actuator.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Default switch state | Behaviour after mains failure |
| 2: Energy minimum report time | Minimum time between two (non-requested) energy values |
| 3: Energy maximum report time | Maximum time between two energy values, independently of changes in the value |
| 4: Power minimum report time | Minimum time between two (non-requested) power values |
| 5: Power maximum report time | Maximum time between two power values, independently of changes in the value |
| 6: Energy delta value | Minimum change required for a new energy value to be transmitted. |
| 7: Power delta value | Minimum change required for a new power value to be transmitted. |
| 8: Safety shutdown configuration | Behaviour in the event of a safety shutdown |
| 10: Night mode | Set Night mode of the Status LED |
| 11: Info LED colour | Set color of the Info LED |
| 9: Reset of overcurrent shutdown | Activation despite 3x safety shutdown |
| 1: reportd |  |


#### 1: Default switch state

Behaviour after mains failure


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | Plug actuator OFF (0) |
|  | Plug actuator ON (1) |
|  | Last status is restored (2) |


#### 2: Energy minimum report time

Minimum time between two (non-requested) energy values


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_2 |
| Data Type        | INTEGER |
| Range | 0 to 32767 |
| Default Value | 10 |


#### 3: Energy maximum report time

Maximum time between two energy values, independently of changes in the value


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_2 |
| Data Type        | INTEGER |
| Range | 0 to 32767 |
| Default Value | 120 |


#### 4: Power minimum report time

Minimum time between two (non-requested) power values


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_2 |
| Data Type        | INTEGER |
| Range | 0 to 32767 |
| Default Value | 10 |


#### 5: Power maximum report time

Maximum time between two power values, independently of changes in the value


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_2 |
| Data Type        | INTEGER |
| Range | 0 to 32767 |
| Default Value | 120 |


#### 6: Energy delta value

Minimum change required for a new energy value to be transmitted.  


##### Overview 

The transmission must take place in the time window between parameter 2 and 3.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_2 |
| Data Type        | INTEGER |
| Range | 0 to 32767 |
| Default Value | 10 |


#### 7: Power delta value

Minimum change required for a new power value to be transmitted.  


##### Overview 

The transmission must take place in the time window between parameter 4 and 5


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_2 |
| Data Type        | INTEGER |
| Range | 0 to 32767 |
| Default Value | 150 |


#### 8: Safety shutdown configuration

Behaviour in the event of a safety shutdown  


##### Overview 

The plug actuator remains OFF after 3x safety shutdowns.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Plug actuator remains OFF (0) |
|  | Automatic restart (1) |


#### 10: Night mode

Set Night mode of the Status LED


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Night mode OFF (0) |
|  | Night mode ON (1) |


#### 11: Info LED colour

Set color of the Info LED


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_2 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Info LED OFF (0) |
|  | Info LED green (1) |
|  | Info LED yellow (2) |
|  | Info LED red (3) |


#### 9: Reset of overcurrent shutdown

Activation despite 3x safety shutdown  


##### Overview 

 Activation despite 3x safety shutdown (parameter 8 = 1)

 A reset request (“Set” command) is normally executed very quickly, as a result of which a query (“Get” command) for this parameter usually returns the response “0” (no reset) for this parameter. In some cases, this can be interpreted incorrectly. Consequently, this parameter should be treated only as “write only”. 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1_wo |
| Data Type        | INTEGER || Default Value | 0 |
| Options | No reset (0) |
|  | Reset (1) |


#### 1: reportd


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/671).
