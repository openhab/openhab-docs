---
layout: documentation
title: ZW20R - ZWave
---

{% include base.html %}

# ZW20R 20A Tamper Resistant Duplex Receptacle

This describes the Z-Wave device *ZW20R*, manufactured by *Wenzhou MTLC Electric Appliances Co.,Ltd.* with the thing type UID of ```enerwave_zw20r_00_000```. 

20A Tamper Resistant Duplex Receptacle  


### Inclusion Information 

When the controller is in inclusion mode and the blue LED blinks on the  
ZW20R, press the program button of ZW20R, and then the controller will  
verify the inclusion

  


### Exclusion Information 

When the controller is in exclusion mode, press the  
program button of ZW20R, and then the controller will remove it from the  
current Z-Wave network, and the LED will blink on the receptacle.

  


### Wakeup Information 

mains device


## Channels
The following table summarises the channels available for the ZW20R 20A Tamper Resistant Duplex Receptacle.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch |
| Switch 2 | switch_binary2 | switch_binary | Switch | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the ZW20R 20A Tamper Resistant Duplex Receptacle.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Toggle LED mode | Set to 1 for LED to be in sync with switch. |


#### 1: Toggle LED mode

Set to 1 for LED to be in sync with switch.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | 0: LED is on when switch is off (0) |
|  | 1: LED is on when switch is on (1) |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/185).
