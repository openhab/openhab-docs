---
layout: documentation
title: VMZ Solar z-wave plus - ZWave
---

{% include base.html %}

# VMZ Solar z-wave plus Awning Blind z-wave plus version

This describes the Z-Wave device *VMZ Solar z-wave plus*, manufactured by *Fakro* with the thing type UID of ```fakro_vmzsolarplus_00_000```. 

Awning Blind z-wave plus version


## Channels
The following table summarises the channels available for the VMZ Solar z-wave plus Awning Blind z-wave plus version.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Blinds control | blinds_control | blinds_control | Blinds | Rollershutter |
| Alarm (power) | alarm_power | alarm_power | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Blinds control

#### Invert control

Invert the blinds control


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_invert_control |
| Data Type        | BOOLEAN || Default Value | false |
| Options | Yes (true) |
|  | No (false) |


#### Invert percentage value

Invert the blinds percentage value


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_invert_percent |
| Data Type        | BOOLEAN || Default Value | false |
| Options | Yes (true) |
|  | No (false) |


#### Step duration

Sets the dim rate speed  
Values from 1 to 127 are defined in seconds, while values from 128 to 254 are defined in minutes.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_duration |
| Data Type        | INTEGER |
| Range | 1 to 254 || Default Value | 255 |
| Options | Device Default (255) |
|  | Change Instantly (0) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the VMZ Solar z-wave plus Awning Blind z-wave plus version.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: operating mode | operating mode |
| 2: winter mode | Summer/Winter mode |
| 3: Delay time | delay to auto shade |
| 4: Level of sensitivity for day | Level of insolation to open/close the shades |
| 5: Temperature | Temperature |
| 6: STM active | STM AutoShade active |
| 13: Restore last position | Restore last position |
| 17: Insolation level | Current on autoshade solar panel |
| 21: Motor current | Motor current |
| 77: CLOSE current | CLOSE current |
| 78: OPEN current | OPEN current |
| 79: CLOSE overload current | CLOSE overload current |
| 80: OPEN overload current | OPEN overload current |
| 99: Restore default config values | Restore default config values |
| 100: Autoexclude | Autoexclude |
| 1: Lifeline |  |
| 2: BasicRepeat |  |
| 3: MultilevelRepeat |  |
| 4: BasicControl |  |


#### 1: operating mode

operating mode  


##### Overview 

Operating mode. Available values:

0 - manual

1 - semiauto: goes down automatically but does not go up.

2 - auto


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | manual (0) |
|  | semiauto (1) |
|  | auto (2) |


#### 2: winter mode

Summer/Winter mode  


##### Overview 

summer mode: go down if sun shines and go up if it is cloudy

winter mode: if temperature is below 0 deg C and sun shines then go up if it is cloudy go down. If temperature is above 0 deg C works as a summer mode


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | summer mode only (1) |
|  | winter mode (2) |


#### 3: Delay time

delay to auto shade  


##### Overview 

Delay time in minutes after which the shade is open or closed in auto mode


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 0 to 30 |
| Default Value | 0 |


#### 4: Level of sensitivity for day

Level of insolation to open/close the shades  


##### Overview 

Level of insolation in mA to open/close the shades in the auto mode


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 3 to 100 |
| Default Value | 3 |


#### 5: Temperature

Temperature  


##### Overview 

T\[oC\] = x minus 50


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 6: STM active

STM AutoShade active


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | no (0) |
|  | yes (1) |


#### 13: Restore last position

Restore last position  


##### Overview 

Restore last position or always go down till the end.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | go down (1) |
|  | restore last position (2) |


#### 17: Insolation level

Current on autoshade solar panel  


##### Overview 

Current from autoshade solar panel for loading battery: 0 - 255 mA


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_17_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 21: Motor current

Motor current  


##### Overview 

Current used by motor: 10\[mA\] - 2,55\[A\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_21_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 77: CLOSE current

CLOSE current  


##### Overview 

CLOSE current: 1\[mA\] - 255\[mA\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_77_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 1 |


#### 78: OPEN current

OPEN current  


##### Overview 

OPEN current: 1\[mA\] - 255\[mA\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_78_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 1 |


#### 79: CLOSE overload current

CLOSE overload current  


##### Overview 

CLOSE overload current: 10\[mA\] - 2,55\[A\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_79_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 80: OPEN overload current

OPEN overload current  


##### Overview 

OPEN overload current: 10\[mA\] - 2,55\[A\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_80_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 99: Restore default config values

Restore default config values  


##### Overview 

Restore default config values.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_99_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | restore default config values (1) |
|  | user values (2) |


#### 100: Autoexclude

Autoexclude


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_100_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | off (1) |
|  | on (2) |


#### 1: Lifeline

  


##### Overview 

<commandClass>BATTERY</commandClass>  
<commandClass>ALARM</commandClass>  
<commandClass>DEVICE\_RESET\_LOCALLY</commandClass>  
<commandClass>BASIC</commandClass>  
 


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: BasicRepeat

  


##### Overview 

<commandClass>BASIC</commandClass>


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: MultilevelRepeat

  


##### Overview 

<commandClass>SWITCH\_MULTILEVEL</commandClass>


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: BasicControl

  


##### Overview 

<commandClass>BASIC</commandClass>


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/750).
