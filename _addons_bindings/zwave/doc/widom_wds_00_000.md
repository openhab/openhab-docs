---
layout: documentation
title: WDS - ZWave
---

{% include base.html %}

# WDS Universal Double Switch

This describes the Z-Wave device *WDS*, manufactured by *wiDom* with the thing type UID of ```widom_wds_00_000```. 

Universal Double Switch  


## Overview 

Universal Double Switch is an ON/OFF control device designed to independently control two separate loads, suited for use as both a local and remote switch. Similarly to the other WiDom “in wall” devices, it can be fully integrated into pre-existing systems and configured to associate configurable behaviours to a specific number of clicks, in full integration with the Z-Wave home automation ecosystem.

Each of its two channels features an integrated consumption measurement device. The Universal Double Switch also boasts the lowest energy consumption on the market.

At the same time, it is completely configurable so that it can adapt to the most varied needs while also being ready to be used without needing additional configurations in order to operate.

Thanks to the framework developed by WiDom, the various types of “events” on the “External Switch” can be recognised and associated to actions to be performed on the device, on any associated devices, on all devices on the network. The events that the system recognises are the number of “clicks” or hold on the External Switch.

  
External switch: External button or switch connected to the input I1 or I2

Events: The actions performed on the external Switch: Clicks or Hold.

Click: If the external switch is a button (when pressed it autonomously returns to the initial position), a click means pressing and then releasing it. If the external switch is bistable (when pressed it does not return to the initial position), a single click means one single flip of the switch.

Technical Specifications

Power Supply: 230 VAC±10% 50/60 Hz  
Maximum Load on Relay Resistive Loads: 8 A for each channel; 10A for both channels  
Limit Temperature: 105 °C  
Work Temperature: -10 – 40 °C  
Radio Protocol Z-Wave: 868,4 MHz  
Radio Range: Up to 100 m outdoor, Up to 40 m indoor  
Dimensions (WxDxH): 37x37x17 mm  
Consumption: < 260 mW in standby; < 480 mW with one working load; < 700 mW with both working loads  
Electrical IP Rating: IP 20  
Actuator element: Relay  
Conformity: CE, RoHS

  


### Inclusion Information 

The device supports both the Network Wide Inclusion (which offers the opportunity of inclusion into a network even if the device is not directly connected to the controller) and the Normal Inclusion mechanisms.

If the device is not included into a Z-Wave network, a single click on the (B) button or on one of the external switches will launch the process of traditional inclusion. If the device inclusion procedure does not start within 2 seconds, the Network Wide Inclusion network will be launched lasting a variable amount of time between 15-30 seconds.

INFO: Through the inclusion procedure, activated with a single click on one of the external switches, the system determines the type of external switch (see parameter No. 62).

  


### Exclusion Information 

Only a controller can remove a device from the network. WiDom Universal Double Switch is compatible with all Z-Wave certified controllers. After the exclusion procedure has been activated by the controller, the device can be removed, putting it in Exclusion Mode by three consecutive clicks on the (B) button or on the external switch, when available.


## Channels
The following table summarises the channels available for the WDS Universal Double Switch.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch |
| Electric meter (watts) 1 | meter_watts1 | meter_watts | Energy | Number |
| Switch 2 | switch_binary2 | switch_binary | Switch | Switch |
| Electric meter (watts) 2 | meter_watts2 | meter_watts | Energy | Number |


### Device Configuration
The following table provides a summary of the configuration parameters available in the WDS Universal Double Switch.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 0: Defines how to control the devices associated to group 4 and 5. | Defines how to control the devices associated to group 4 and 5. |
| 1: Outputs status upon receipt of 1 click on its command | Defines the status of the output O1/O2 when the switch connected to I1/I2 receives 1 Click |
| 2: Outputs status upon receipt of 2 clicks on its command | Defines the status of the output O1/O2 when the switch connected to I1/I2 receives 2 Click |
| 3: Type of outputs | Defines if the outputs are controlled individually, as a traditional device with two chann... |
| 4: Number of clicks that activate the control of the associated devices | Defines the number of clicks on the Switch 1 or Switch 2 that enable the control of the co... |
| 5: Level used to control the devices associated to group 2 and 3 | Defines how to control the devices associated to group 2 and 3. |
| 10: Timer to switch OFF the Channel 1 | Defines the time after which the Channel 1 is switched OFF |
| 11: Timer to switch OFF the Channel 2 | Defines the time after which the Channel 2 is switched OFF |
| 12: Timer to switch ON the Channel 1 | Defines the time after which the Channel 1 is switched ON |
| 13: Timer to switch ON the Channel 2 | Defines the time after which the Channel 2 is switched ON |
| 20: Outputs status upon receipt of a Multi-Channel Basic Set command | The two channels can be controlled individually by Z-Wave network. The status of the chann... |
| 21: Outputs status upon receipt of a Basic Set command | The channels of the device can be controlled individually from all other Z-Wave devices th... |
| 60: Start-up status | Defines the status of the device following a restart. |
| 61: Configuration reset | Defines which parameters should be reset to default values |
| 62: Type of external switch | Defines the type of external switch connected to the device |
| 1: LifeLine Group |  |
| 2: On/Off control (Switch 1) |  |
| 3: Dimming control (Switch 1) |  |
| 4: On/Off control (Switch 2) |  |
| 5: Dimming control (Switch 2) |  |


#### 0: Defines how to control the devices associated to group 4 and 5.

Defines how to control the devices associated to group 4 and 5.  


##### Overview 

######## Configuration value and Action performed on the associated device 

#####    0 – SWITCH\_OFF #####

The associated devices are switched OFF

#####    \-1 – SWITCH\_ON #####

The associated devices are switched ON

##### From 1 to 99 #####

The associated devices (dimmer, roller shutters) are set to the indicated level (only for devices associated to group 3)

#####    100 – RELAY\_STATUS (Default Value) #####

If the Relay 1 is ON/OFF, the associated devices are ON/OFF

#####    101 – RELAY\_STATUS\_BUT\_IGNORE\_IF\_OFF #####

If the Relay 1 is ON the associated devices are ON; if it is OFF no action is taken on the associated devices

#####    102 – RELAY\_STATUS\_BUT\_IGNORE\_IF\_ON #####

If the Relay 1 is OFF the associated devices are OFF; if it is ON no action is taken on the associated devices

#####    103 – RELAY\_OPPOSITE\_BUT\_IGNORE\_IF\_OFF #####

If the Relay 1 is ON the associated devices are OFF; if it is OFF no action is taken on the associated devices

#####    104 – RELAY\_OPPOSITE\_BUT\_IGNORE\_IF\_ON #####

If the Relay 1 is OFF the associated devices are ON; if it is ON no action is taken on the associated devices

#####    105 – RELAY\_OPPOSITE #####

If the Relay 1 is ON/OFF, the associated devices are OFF/ON

##### 106 – IGNORE #####

No action is taken on the associated devices


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_0_1 |
| Data Type        | INTEGER |
| Range | -1 to 106 |
| Default Value | 100 |


#### 1: Outputs status upon receipt of 1 click on its command

Defines the status of the output O1/O2 when the switch connected to I1/I2 receives 1 Click  


##### Overview 

INFO:

0 – IN\_OUT configuration is available on WiDom Universal Double Switch starting from the  
firmware version 1.40.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | IN_OUT (0) |
|  | TOGGLE (1) |
|  | ON (2) |
|  | OFF (3) |
|  | IGNORE (4) |


#### 2: Outputs status upon receipt of 2 clicks on its command

Defines the status of the output O1/O2 when the switch connected to I1/I2 receives 2 Click


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | TOGGLE (1) |
|  | ON (2) |
|  | OFF (3) |
|  | IGNORE (4) |


#### 3: Type of outputs

Defines if the outputs are controlled individually, as a traditional device with two channels, or if its behaviour simulates a single pole double throw relay  


##### Overview 

**Parameter value and** d**evice reaction**

0 – SINGLE CHANNELS (Default Value)

Channel 1 and Channel 2 are controlled individually

From 1 to 9 – SINGLE POLE DOUBLE THROW RELAY

The two channels are in opposite status. If the Channel 1 is close the Channel 2 is open, if the Channel 1 is open the Channel 2 is close. The value of the parameter defines the closing delay of the relay in tenth of seconds

From 10 to 19 – SEQUENCING RELAY

Channels are toggled in this way: both channels ON, only channel 1 ON, only channel 2 ON, both channels OFF. The value of the parameter, deducted of 9, defines the closing delay of the relay in tenth of seconds.

From 20 to 39 – SELECTOR

Both channels can be OFF but they can never be ON simultaneously. It can be used for fan coil control, roller shutters, and in general for two-speed systems. The value of the parameter, deducted of 19, defines the closing delay of the relay in tenth of seconds.

INFO: 0 – configuration is available on WiDom Universal Double Switch starting from the  
firmware version 1.40.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 0 to 39 |
| Default Value | 0 |


#### 4: Number of clicks that activate the control of the associated devices

Defines the number of clicks on the Switch 1 or Switch 2 that enable the control of the correspondent associated devices  


##### Overview 

TIP:

Through this parameter, together the setting of the parameters 1 and 2, it is possible to control simultaneously the local load and the associated devices (e.g. 1 click control both local load and associated devices) or in totally independent way (e.g. 1 click control only the local load, 2 clicks control only the associated devices).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | 1 CLICK (1) |
|  | 2 CLICKS (2) |


#### 5: Level used to control the devices associated to group 2 and 3

Defines how to control the devices associated to group 2 and 3.  


##### Overview 

######## Configuration value and Action performed on the associated device 

#####    0 – SWITCH\_OFF #####

The associated devices are switched OFF

#####    \-1 – SWITCH\_ON #####

The associated devices are switched ON

##### From 1 to 99 #####

The associated devices (dimmer, roller shutters) are set to the indicated level (only for devices associated to group 3)

#####    100 – RELAY\_STATUS (Default Value) #####

If the Relay 1 is ON/OFF, the associated devices are ON/OFF

#####    101 – RELAY\_STATUS\_BUT\_IGNORE\_IF\_OFF #####

If the Relay 1 is ON the associated devices are ON; if it is OFF no action is taken on the associated devices

#####    102 – RELAY\_STATUS\_BUT\_IGNORE\_IF\_ON #####

If the Relay 1 is OFF the associated devices are OFF; if it is ON no action is taken on the associated devices

#####    103 – RELAY\_OPPOSITE\_BUT\_IGNORE\_IF\_OFF #####

If the Relay 1 is ON the associated devices are OFF; if it is OFF no action is taken on the associated devices

#####    104 – RELAY\_OPPOSITE\_BUT\_IGNORE\_IF\_ON #####

If the Relay 1 is OFF the associated devices are ON; if it is ON no action is taken on the associated devices

#####    105 – RELAY\_OPPOSITE #####

If the Relay 1 is ON/OFF, the associated devices are OFF/ON

##### 106 – IGNORE #####

No action is taken on the associated devices


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER |
| Range | -1 to 106 |
| Default Value | 100 |


#### 10: Timer to switch OFF the Channel 1

Defines the time after which the Channel 1 is switched OFF  


##### Overview 

0 (Default Value): Timer disabled

  
From 1 to 32000 (seconds): After this time the relay of the Channel 1 is OFF


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_2 |
| Data Type        | INTEGER |
| Range | 0 to 32000 |
| Default Value | 0 |


#### 11: Timer to switch OFF the Channel 2

Defines the time after which the Channel 2 is switched OFF  


##### Overview 

0 (Default Value): Timer disabled

  
From 1 to 32000 (seconds): After this time the relay of the Channel 2 is OFF


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_2 |
| Data Type        | INTEGER |
| Range | 0 to 32000 |
| Default Value | 0 |


#### 12: Timer to switch ON the Channel 1

Defines the time after which the Channel 1 is switched ON  


##### Overview 

0 (Default Value): Timer disabled

From 1 to 32000 (seconds): After this time the relay of the Channel 1 is ON


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_2 |
| Data Type        | INTEGER |
| Range | 0 to 32000 |
| Default Value | 0 |


#### 13: Timer to switch ON the Channel 2

Defines the time after which the Channel 2 is switched ON  


##### Overview 

0 (Default Value): Timer disabled

From 1 to 32000 (seconds): After this time the relay of the Channel 2 is ON


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_2 |
| Data Type        | INTEGER |
| Range | 0 to 32000 |
| Default Value | 0 |


#### 20: Outputs status upon receipt of a Multi-Channel Basic Set command

The two channels can be controlled individually by Z-Wave network. The status of the channels upon receipt of a Multi-Channel Basic Set command is defined by the value set on the parameter.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_20_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | AS RECEIVED (1) |
|  | IGNORE IF ON (2) |
|  | IGNORE IF OFF (3) |
|  | IGNORE (4) |


#### 21: Outputs status upon receipt of a Basic Set command

The channels of the device can be controlled individually from all other Z-Wave devices that support the multichannel feature. In order to support also the integration with no-multichannel systems, this parameter allows to define if the receipt of a no-mu


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_21_2 |
| Data Type        | INTEGER || Default Value | 3 |
| Options | CHANNEL 1 (1) |
|  | BOTH CHANNELS (3) |


#### 60: Start-up status

Defines the status of the device following a restart.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_60_1 |
| Data Type        | INTEGER || Default Value | 4 |
| Options | OFF_OFF (0) |
|  | ON_OFF (1) |
|  | OFF_ON (2) |
|  | ON_ON (3) |
|  | PREVIOUS STATUS (4) |


#### 61: Configuration reset

Defines which parameters should be reset to default values


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_61_1 |
| Data Type        | INTEGER || Default Value | 4 |
| Options | FACTORY RESET (0) |
|  | ASSOCIATIONS RESET (1) |
|  | CONFIGURATIONS RESET (2) |
|  | RESTART DEVICE (3) |
|  | IGNORE (4) |


#### 62: Type of external switch

Defines the type of external switch connected to the device


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_62_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | IGNORE (0) |
|  | BUTTON (1) |
|  | SWITCH (2) |


#### 1: LifeLine Group

  


##### Overview 

Devices to receive notifications on: status changes; instantaneous power level; device local reset 


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: On/Off control (Switch 1)

  


##### Overview 

Devices controlled by switch 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Dimming control (Switch 1)

  


##### Overview 

Devices controlled by switch 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: On/Off control (Switch 2)

  


##### Overview 

Devices controlled by switch 2


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


#### 5: Dimming control (Switch 2)

  


##### Overview 

Devices controlled by switch 2


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_5 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/432).
