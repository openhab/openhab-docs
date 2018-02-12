---
layout: documentation
title: ZWS12n - ZWave
---

{% include base.html %}

# ZWS12n Chain actuator - window opener

This describes the Z-Wave device *ZWS12n*, manufactured by *Fakro* with the thing type UID of ```fakro_zws12n_00_000```. 

Chain actuator - window opener  


## Overview 

FAKRO ZWS12 chain motor thanks to their small dimensions and suitable force output are ideal for roof window operating, being fully compatible with the Z-Wave Plus system. The motors can be applied in both centre pivot and top hung and pivot roof windows as well as windows of non-standard dimensions. 

The chain has **2 output speed** and reach 24cm. 

The ZWS12 motor is equipped with **encoder and two limit switches**:

limit switch at maximum chain travel position,

overload limit in both directions (used mainly when closing the window).

This product can be operated in any Z-Wave network with other Z-Wave certified devices from other manufacturers.

ZWS12 also can be **controlled manually **by button and **closed by rain sensor and timer**.

There are four **association groups** in actuator ZWS12:

Life Line – group for position reporting actuator after each a stoppage and alarm reporting

Basic Repeat – group used to transfer the received basic commands to the devices included in this group.

Multilevel Repeat – group used to transfer the received multilevel commands to the devices included in this group. 

Basic Rain – group used to transfer the received commands from actuator & rain detector to the devices included in this group. 

Z-Wave Plus Secure Enabled Product

This device is a security enabled Z-Wave Plus product that is able to use encrypted Z-Wave Plus messages to communicate to other security enabled Z-Wave Plus products.

**Technical Parameters:** 

Chain reach: 240 mm

Output power : 9 W

Rated current: 0.72 A

Standby current: 0.03 A

Chain pushing force: 200 N

Closing force: 200 N

Current limit: YES

Power voltage: 15V DC

Power cable: 2 x 0.75 mm2 (0,4 m)

**Reset:**

Device Reset Locally – This function allows you to reset the Z-Wave

network without the use of Z-Wave controller. Press 5 times the

programming button P fast, the actuator was removed from the Z-Wave

network, restore the default parameters, name and locations. 

Please use this procedure only when the network primary controller is missing or otherwise inoperable.

  


### Inclusion Information 

**Autoinclusion** \- This feature allow you to add hard to reach devices to Z-Wave network. 3-times ON and OFF the power actuator (OFF-ON-OFFON-OFF-ON) causes the introduction of actuator to Autoinclusion mode.

Please note that the procedure has been started the time between on and off can not exceed 20s. Autoinclusion mode is activated for a maximum of 10 minutes. During this time, we can add an actuator to any Z-Wave controller running in the Include procedure.

**Include** \- This function allow you to add actuator to the network Z-Wave.

Follow the procedure adding device to the network Z-Wave according to user manual supplied with the product. Then, press the programming button P on the actuator for 1 second.

  


### Exclusion Information 

**Exclude** \- This function allow you to remove actuator from the network Z-Wave. Follow the procedure removing device from the network Z-Wave

according to user manual supplied with the product. Then, press the

programming button P on the actuator for 1 second. Function removes

information only about network Z-Wave.


## Channels
The following table summarises the channels available for the ZWS12n Chain actuator - window opener.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |
| Alarm (power) | alarm_power | alarm_power | Door | Switch |
| Alarm (flood) | alarm_flood | alarm_flood | Door | Switch |


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
The following table provides a summary of the configuration parameters available in the ZWS12n Chain actuator - window opener.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 7: Motor speed I | Motor speed I |
| 8: 1 Motor speed II (rain sensor) | 1 Motor speed II (rain sensor) |
| 12: Callibrate | This parameter on/off callibration function |
| 13: Last saved position | Set servomotor in previous position |
| 15: Close after time | Close after time min |
| 1: Lifeline | Position reporting |
| 2: Basic Repeat | Basic commands |
| 3: Multilevel Repeat | Transfer the received multilevel commands |
| 4: Basic Rain | Transfer the received commands from actuator & rain detector to the devices |


#### 7: Motor speed I

Motor speed I  


##### Overview 

1- the lowest speed

2- default

4 - the higest speed


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER |
| Range | 1 to 4 |
| Default Value | 2 |


#### 8: 1 Motor speed II (rain sensor)

1 Motor speed II (rain sensor)  


##### Overview 

1- the lowest speed

2- default

4 - the higest speed


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER |
| Range | 1 to 4 |
| Default Value | 2 |


#### 12: Callibrate

This parameter on/off callibration function  


##### Overview 

Value 1 – calibrated

Value 2 – discalibrated

to enter the calibration mode must first time discalibrate and then calibrate.

Calibration possible after prior recalibration of the device. It is possible via gate (Gateway Z-Wave), remote control with a display, e.g. ZRS24 remote control (FAKRO). 

See manual.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_1 |
| Data Type        | INTEGER |
| Range | 1 to 2 |
| Default Value | 1 |


#### 13: Last saved position

Set servomotor in previous position  


##### Overview 

This parameter set servomotor in previous position after using Basic Mode operation.

1 – FF go to Max

2 – FF go to previous position


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_1 |
| Data Type        | INTEGER |
| Range | 1 to 2 |
| Default Value | 1 |


#### 15: Close after time

Close after time min  


##### Overview 

0-120 minutes


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_15_1 |
| Data Type        | INTEGER |
| Range | 0 to 120 |
| Default Value | 120 |


#### 1: Lifeline

Position reporting  


##### Overview 

Life Line – group for position reporting actuator after each a stoppage and alarm reporting (overcurrent, damage encoders). This group can be a maximum 1 device.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Basic Repeat

Basic commands  


##### Overview 

Basic Repeat – group used to transfer the received basic commands to the devices included in this group. This group can be a maximum 5 devices.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Multilevel Repeat

Transfer the received multilevel commands  


##### Overview 

Multilevel Repeat – group used to transfer the received multilevel commands to the devices included in this group. This group can be a maximum 5 devices.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Basic Rain

Transfer the received commands from actuator & rain detector to the devices  


##### Overview 

Basic Rain – group used to transfer the received commands from actuator & rain detector to the devices included in this group. This group can be a maximum 5 devices.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/777).
