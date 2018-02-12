---
layout: documentation
title: ZMNHTD - ZWave
---

{% include base.html %}

# ZMNHTD Smart Meter

This describes the Z-Wave device *ZMNHTD*, manufactured by *Goap* with the thing type UID of ```qubino_zmnhtd_00_000```. 

Smart Meter  


## Overview 

This Z-Wave module is used for energy measurements in single-phase electrical power network and can be used in residential, industrial and utility applications. Meters measure energy directly in 2-wire networks according to the principle of fast sampling of voltage and current signals. A built-in microprocessor calculates energy, power and power factor from the measured signals. The module can be controlled through Z-wave network and it acts as repeater in order to improve range and stability of Z-wave network. It is designed to be mounted on DIN rail. 

Measurements: Voltage V Current I Power – Active W Power – Active total Import kWh Power – Active total Export kWh Power – Reactive var Power – Reactive total kvarh Power – Apparent total kVAh Power Factor PF 

It is possible to connect two external relay to Smart Meter module. One controlled by built-in optical (IR) communication port on the side, second controlled by output on terminal 5. 

  


### Inclusion Information 

Module Inclusion (Adding to Z-wave network)

 *  Connect module to power supply
 *  enable add/remove mode on main controller
 *  auto-inclusion (works for about 5 seconds after connected to power supply) or
 *  press service button S for more than 2 second

NOTE: For auto-inclusion procedure, first set main controller into inclusion mode and then connect module to power supply.

  


### Exclusion Information 

Module Exclusion/Reset (Removing from Z-Wave network):

 *  Connect module to power supply
 *  bring module within maximum 1 Meter (3 feet) of the main controller,
 *  enable add/remove mode on main controller
 *  press service button S for more than 6 seconds.

By this function all parameters of the module are set to default values and own ID is deleted. If service button S is pressed more than 2 and less than 6 seconds module is excluded, but configuration parameters are not set to default values.


## Channels
The following table summarises the channels available for the ZMNHTD Smart Meter.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
|  | switch_binary | switch_binary | Switch | Switch |
| Power factor | meter_powerfactor | meter_powerfactor | Energy | Number |
| Votage | meter_voltage | meter_voltage | Energy | Number |
| Active Power | meter_watts | meter_watts | Energy | Number |
| Active Energy Comsumption | meter_kwh | meter_kwh | Energy | Number |
| Aparent Energy Consumption | meter_kvah | meter_kvah | Energy | Number |
| Current | meter_current | meter_current | Energy | Number |
| Reset Meter Stats | meter_reset | meter_reset | Energy | Switch |
| switch_binary | switch_binary1 | switch_binary | Switch | Switch |
| Switch Relay | switch_binary2 | switch_binary | Switch | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the ZMNHTD Smart Meter.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 7: Input 1 switch function selection | IR external relay or External Relay control mode |
| 10: Activate / deactivate functions ALL ON / ALL OFF | Activate / deactivate functions |
| 11: Timer turning off IR external relay | Automatic turning off IR external relay output after set time |
| 12: Timer turning on IR external relay output | Automatic turning on IR external relay output after set time |
| 13: Timer turning off External relay output | Automatic turning off External relay output after set time |
| 14: Timer turning on External relay after output | Automatic turning on External relay after output set time |
| 40: Power reporting (Watts) on power change | Power reporting in Watts on power change |
| 42: Power reporting (Watts) by time interval | Power reporting in Watts by time interval |
| 45: Reset Power counters | Reset Power counters |
| 100: Enable / Disable endpoints relays | Enable / Disable endpoints IR external relay and External relay |
| 110: Maximum Power auto off | Maximum Power auto off |
| 111: Delay overpower off | Delay overpower off |
| 112: Relay to power off | Relay to power off |
| 130: Serial Number |  |
| 131: Meter Software reference |  |
| 132: Meter Hardware reference |  |
| 140: Voltage U1 |  |
| 141: Current I1 |  |
| 142: Active Power Total (Pt) |  |
| 143: Reactive Power Total (Qt) |  |
| 144: Power Factor Total (PFt) |  |
| 145: Active power accumulated (import) |  |
| 146: Reactive power accumulated |  |
| 147: Apparent power accumulated |  |
| 148: Active power accumulated (export) |  |
| 1: Lifeline group | Reserved for communication with the main controller |


#### 7: Input 1 switch function selection

IR external relay or External Relay control mode  


##### Overview 

Available config. parameters (data type is 1 Byte DEC


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER || Default Value | 4 |
| Options | disabled (0) |
|  | IR external relay control – mono stable push button (2) |
|  | IR external relay control - bi stable switch (3) |
|  | External relay control – mono stable push button (4) |
|  | External relay control – bi stable switch (5) |


#### 10: Activate / deactivate functions ALL ON / ALL OFF

Activate / deactivate functions  


##### Overview 

Smart Meter module responds to commands ALL ON/ ALL OFF that may be sent by the main controller or by other controller belonging to the system


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_3 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | ALL ON is not active, ALL OFF is not active (0) |
|  | ALL ON is not active, ALL OFF active (1) |
|  | ALL ON active, ALL OFF is not active (2) |
|  | ALL ON active, ALL OFF active (255) |


#### 11: Timer turning off IR external relay

Automatic turning off IR external relay output after set time  


##### Overview 

When IR external relay is ON it goes automatically OFF after time defined by this Parameter. Timer is reset to zero each time the module receive ON command regardless from where it comes (push button, associated module, controller,..). Available configuration parameters (data type is 2 Byte DEC):


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_2_00007F17 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Auto OFF disabled (0) |
|  | Auto OFF enabled with define time, step is 1s (32535) |


#### 12: Timer turning on IR external relay output

Automatic turning on IR external relay output after set time  


##### Overview 

When IR external relay is OFF it goes automatically ON after time defined by this Parameter. Timer is reset to zero each time the module receive OFF command regardless from where it comes (push button, associated module, controller,..). Available configuration parameters (data type is 2 Byte DEC)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_2 |
| Data Type        | INTEGER |
| Range | 0 to 32535 |
| Default Value | 0 |


#### 13: Timer turning off External relay output

Automatic turning off External relay output after set time  


##### Overview 

When External relay is ON it goes automatically OFF after time defined by this parameter. Timer is reset to zero each time the module receive ON command regardless from where it comes (push button, associated module, controller,..). Available configuration parameters (data type is 2 Byte DEC)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_2 |
| Data Type        | INTEGER |
| Range | 0 to 32535 |
| Default Value | 0 |


#### 14: Timer turning on External relay after output

Automatic turning on External relay after output set time  


##### Overview 

When External relay is OFF it goes automatically ON after time defined by this parameter. Timer is reset to zero each time the module receive OFF command regardless from where it comes (push button, associated module, controller,..). Available configuration parameters (data type is 2 Byte DEC)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_2 |
| Data Type        | INTEGER |
| Range | 0 to 32535 |
| Default Value | 0 |


#### 40: Power reporting (Watts) on power change

Power reporting in Watts on power change  


##### Overview 

Set value means percentage, set value from 0 – 100 = 0% - 100%. Available configuration parameters (data type is 1 Byte DEC)

Power report is send (push) only when actual power in Watts in real time changes for more than set percentage comparing to previous actual power in Watts, step is 1%

NOTE: if power changed is less than 1W, the report is not send (pushed), independent of percentage set. When reporting Watts, module will automatically reports also V (Voltage), A (Amperes), Power factor, kVar (Reactive Power). 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_40_2 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 10 |


#### 42: Power reporting (Watts) by time interval

Power reporting in Watts by time interval  


##### Overview 

Set value means time interval (0 – 32535) in seconds, when power report is send. Available config. parameters (data type is 2 Byte DEC).

Power report is send with time interval set by entered value. When reporting Watts, module will automatically reports also V (Voltage), A (Amperes), Power factor, kVar (Reactive Power)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_42_2 |
| Data Type        | INTEGER |
| Range | 0 to 32535 |
| Default Value | 0 |


#### 45: Reset Power counters

Reset Power counters  


##### Overview 

Available config. parameters (data type is 1 Byte DEC


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_45_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | No function (0) |
|  | reset counter 1 – KWh (1) |
|  | reset counter 2 – kVARh (2) |
|  | reset counter 3 – kVAh (4) |
|  | reset ALL counters (15) |


#### 100: Enable / Disable endpoints relays

Enable / Disable endpoints IR external relay and External relay  


##### Overview 

Enabling IR external relay and External relay or both of them, means that endpoint (IR external relay) and endpoint (External relay) or both will be present on UI. Disabling them will result in hiding endpoints according to Parameter set value. Note that hiding endpoint has no impact on its functionality. Available configuration parameters (data type is 1 Byte DEC)

NOTE1: After parameter change, first exclude module (without setting parameters to default value) and then re include the module. NOTE 2: If you don't have IR BiComm relay module mounted and you enable IR communication (parameter 100 is 2 or 3) there will be no valid IR relay state reported. It will be reported IR COMMUNICATION ERROR and LED2 will BLINK


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_100_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Endpoints IR external relay and External relay disabled (0) |
|  | Endpoints IR external relay disabled, External relay enabled (1) |
|  | Endpoints IR external relay enabled, External relay disabled (2) |
|  | Endpoints IR external relay and External relay enabled (3) |


#### 110: Maximum Power auto off

Maximum Power auto off  


##### Overview 

Set value means Maximum Power Consumption (0 - 15000) in watts (W), when relays are turned off according to parameters no. 111 and 112. Available configuration parameters (data type is 2 Bytes DEC


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_110_2 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | No function (0) |
|  | Maximum Power Consumption (15000) |


#### 111: Delay overpower off

Delay overpower off  


##### Overview 

Set value means number of second to power off relay (defined by parameters no. 110 and 112) before restart (30 - 32535) in seconds (s). Available configuration parameters (data type is 2 Bytes DEC): 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_111_2 |
| Data Type        | INTEGER |
| Range | 0 to 32525 |
| Default Value | 30 |


#### 112: Relay to power off

Relay to power off  


##### Overview 

Set value selects relay to be powered off when threshold is reached (defined by parameters no. 110 and 111). Available config. parameters (data type is 1 Byte DEC)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_112_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | switch between the 2 relays (0) |
|  | always power off relay 1 (IR external relay) (1) |
|  | always power off relay 2 (External relay) (2) |
|  | always power off both relays (relay 1 and relay 2) (3) |


#### 130: Serial Number


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_130_32 |
| Data Type        | INTEGER |
| Range | 0 to 4294967295 |
| Default Value | 0 |


#### 131: Meter Software reference


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_131_16 |
| Data Type        | INTEGER |
| Range | 0 to 4294967295 |
| Default Value | 0 |


#### 132: Meter Hardware reference


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_132_16 |
| Data Type        | INTEGER |
| Range | 0 to 4294967295 |
| Default Value | 0 |


#### 140: Voltage U1


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_140_24 |
| Data Type        | INTEGER |
| Range | 0 to 4294967295 |
| Default Value | 0 |


#### 141: Current I1


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_141_24 |
| Data Type        | INTEGER |
| Range | 0 to 4294967295 |
| Default Value | 0 |


#### 142: Active Power Total (Pt)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_142_24 |
| Data Type        | INTEGER |
| Range | 0 to 4294967295 |
| Default Value | 0 |


#### 143: Reactive Power Total (Qt)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_143_24 |
| Data Type        | INTEGER |
| Range | 0 to 4294967295 |
| Default Value | 0 |


#### 144: Power Factor Total (PFt)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_144_16 |
| Data Type        | INTEGER |
| Range | 0 to 4294967295 |
| Default Value | 0 |


#### 145: Active power accumulated (import)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_145_32 |
| Data Type        | INTEGER |
| Range | 0 to 4294967295 |
| Default Value | 0 |


#### 146: Reactive power accumulated


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_146_32 |
| Data Type        | INTEGER |
| Range | 0 to 4294967295 |
| Default Value | 0 |


#### 147: Apparent power accumulated


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_147_32 |
| Data Type        | INTEGER |
| Range | 0 to 4294967295 |
| Default Value | 0 |


#### 148: Active power accumulated (export)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_148_32 |
| Data Type        | INTEGER |
| Range | 0 to 4294967295 |
| Default Value | 0 |


#### 1: Lifeline group

Reserved for communication with the main controller


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/414).
