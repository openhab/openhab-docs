---
layout: documentation
title: FGWP102 - ZWave
---

{% include base.html %}

# FGWP102 Metered Wall Plug Switch

This describes the Z-Wave device *FGWP102*, manufactured by *Fibargroup* with the thing type UID of ```fibaro_fgwp102_03_002```. 

Metered Wall Plug Switch  


## Overview 

FIBARO Wall Plug is a universal, Z-Wave Plus compatible, remotely controlled outlet adapter. This device may be applied wherever you want to control electrical devices with up to 2500W load.

The Wall Plug is equipped with a power and energy metering function. It uses a LED ring to visualize the current load with colour changing illumination and operating mode. This is the smallest and most attractive device of this type available in the world.

The Wall Plug may be operated using the B-button located on its casing or via any Z-Wave compatible controller.

  


### Inclusion Information 

To add the device to the Z-Wave network:

1.  Plug the device into a socket nearby the main Z-Wave controller.
2.  The LED ring will glow red signalling not being added (reset or remove the device otherwise).
3.  Set the main controller in (security/non-security) add mode (see the controller’s manual).
4.  Quickly, triple click the B-button located on the casing.
5.  Wait for the adding process to end.
6.  Successful adding will be confirmed by the Z-Wave controller’s message.

  


### Exclusion Information 

To remove the device from the Z-Wave network:

1.  Plug the device into a socket nearby the main Z-Wave controller.
2.  The LED ring will glow green signalling being added (removing is not necessary otherwise).
3.  Set the main controller into remove mode (see the controller’s manual).
4.  Quickly, triple click the B-button located on the casing.
5.  Wait for the removing process to end.
6.  Successful removing will be confirmed by the Z-Wave controller’s message.


## Channels
The following table summarises the channels available for the FGWP102 Metered Wall Plug Switch.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Sensor (power) | sensor_power | sensor_power | Energy | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Reset the total power consumption | meter_reset | meter_reset | Energy | Switch |
| Alarm (power) | alarm_power | alarm_power | Door | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the FGWP102 Metered Wall Plug Switch.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: “Always On” mode | Will turn on connected device permanently |
| 2: Remember device status before the power failure | determines how the Wall Plug will react in the event of power supply failure |
| 3: Overload safety switch | allows to turn off the controlled device in case of exceeding the defined power. |
| 10: High priority power report | minimum percentage change in active power |
| 11: Standard power report | minimum percentage change in active power |
| 12: Power reporting interval | defines the time interval of sending at most 5 standard power reports |
| 13: Energy reporting threshold | specifies the minimum change in energy consumption |
| 14: Power and energy periodic reports | defines time period between independent reports sent |
| 15: Measuring energy consumed by the Wall Plug itself | determines whether power metering should include the amount of power |
| 20: Control of „On/Off (Button)” association group (2) | Control of „On/Off (Button)” association group (2) devices |
| 21: DOWN value - „On/Off (Power)” association group (3) | Lower power threshold, used in parameter 23 |
| 22: UP value - „On/Off (Power)” association group (3) | Upper power threshold, used in parameter 23. |
| 23: The response after exceeding defined power values | defines the way that 3rd association group devices are controlled. |
| 24: SWITCH ON value - „On/Off” association groups | SWITCH ON value - „On/Off” association groups |
| 30: Active alarms | Define Z-Wave network alarms to which the Wall Plug will respond |
| 31: Response to alarm frames | defines how the Wall Plug will respond to alarms |
| 32: Alarm state duration | specifies the duration of alarm state |
| 40: Power load for violet colour | determines maximum active power value |
| 41: LED ring colour when controlled device is on | LED ring colour when controlled device is on |
| 42: LED ring colour when controlled device is off | LED ring colour when controlled device is off |
| 43: LED ring colour at the Z-Wave network alarm detection | LED ring colour at the Z-Wave network alarm detection |
| 50: Associations in Z-Wave network security mode | defines how commands are sent in specified association groups |
| 1: Lifeline |  |
| 2: On/Off (Button) |  |
| 3: On/Off (Power) |  |


#### 1: “Always On” mode

Will turn on connected device permanently  


##### Overview 

In this mode Wall Plug will turn on connected device permanently and will stop reacting to attempts of turning it off (through Z-Wave network or pushing the B-button).

“Always On” function turns the Wall Plug into a power and energy meter. Connected device will not be turned off upon receiving an alarm frame from another Z-Wave device (parameter 31 will be ignored).

In “Always on” mode, connected device may be turned off after exceeding the power defined in parameter 3 or in case of detecting current greater than 110% of rated current. In such cases, connected device can be turned on again by pushing the B-button or sending a control frame. By default, overload protection is inactive.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | function inactive (0) |
|  | function activated (1) |


#### 2: Remember device status before the power failure

determines how the Wall Plug will react in the event of power supply failure  


##### Overview 

This parameter determines how the Wall Plug will react in the event of power supply failure (e.g. power outage or taking out from the electrical outlet).

After the power supply is back on, the Wall Plug can be restored to previous state or remain switched off.

This parameter is ignored in „Always On” mode - the device automatically turns ON after plugging it into the socket.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | device remains switched off (0) |
|  | device restores the state from before the power failure (1) |


#### 3: Overload safety switch

allows to turn off the controlled device in case of exceeding the defined power.  


##### Overview 

This function allows to turn off the controlled device in case of exceeding the defined power. Controlled device will be turned off even if “Always On” function is active (parameter 1).

Controlled device can be turned back on via B-button or sending a control frame. By default this function is inactive.

10-30000 (1.0-3000.0W, step 0.1W) - power threshold


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_2 |
| Data Type        | INTEGER |
| Range | 10 to 30000 || Default Value | 0 |
| Options | function inactive (0) |


#### 10: High priority power report

minimum percentage change in active power  


##### Overview 

This parameter determines the minimum percentage change in active power that will result in sending power report to the main controller with the highest priority in the Z-Wave network.

By default, the Wall Plug immediately sends the power report if the power load changes by 80%.

1-99 - power change in percent

100 - reports are disabled


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER |
| Range | 1 to 100 |
| Default Value | 80 |


#### 11: Standard power report

minimum percentage change in active power  


##### Overview 

This parameter determines the minimum percentage change in active power that will result in sending power report to the main controller

Compared to parameter 10, the maximum number of reports sent is reduced (parameter 12) to 5 in a specified time interval. In addition, the reports are not sent in mode, which may result in overloading the Z-Wave network.

By default changes in power load may be reported up to 5 times per 30 seconds, when power load changes by 15%.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_1 |
| Data Type        | INTEGER |
| Range | 1 to 100 |
| Default Value | 15 |


#### 12: Power reporting interval

defines the time interval of sending at most 5 standard power reports  


##### Overview 

This parameter defines the time interval of sending at most 5 standard power reports when the power changes by the value set in parameter 11. The higher the value of parameter 12, the fewer reports the device will send.

Settings in second

Default: 30s


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_2 |
| Data Type        | INTEGER |
| Range | 5 to 600 |
| Default Value | 30 |


#### 13: Energy reporting threshold

specifies the minimum change in energy consumption  


##### Overview 

This parameter specifies the minimum change in energy consumption (in relation to the previously reported), that will result in sending a new report.

0 - energy reports inactive  
1-500 (0.01-5kWh, step 0.01kWh) - threshold

Default: 10 (0.1kWh)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_2 |
| Data Type        | INTEGER |
| Range | 0 to 500 || Default Value | 10 |
| Options | energy reports inactive (0) |


#### 14: Power and energy periodic reports

defines time period between independent reports sent  


##### Overview 

This parameter defines time period between independent reports sent when changes in power load have not been recorded or if changes are insignificant. By default reports are sent every hour.

Default: 3600 second (1h)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_2 |
| Data Type        | INTEGER |
| Range | 5 to 32400 || Default Value | 3600 |
| Options | periodic reports inactive (0) |


#### 15: Measuring energy consumed by the Wall Plug itself

determines whether power metering should include the amount of power  


##### Overview 

This parameter determines whether power metering should include the amount of power consumed by the Wall Plug itself. Results are being added to the value of power consumed by controlled device.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_15_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | function inactive (0) |
|  | function activated (1) |


#### 20: Control of „On/Off (Button)” association group (2)

Control of „On/Off (Button)” association group (2) devices  


##### Overview 

Controlling devices with the B-Button. This parameter is inactive in “Always On” mode (parameter 1).  
Control as the Wall Plug:

 *  switching the Wall Plug on – switch the devices on (parameter 24)  
    switching the Wall Plug off – switch the devices off (parameter 24)

Control opposite to the Wall Plug:

 *  switching the Wall Plug on – switch the devices off
 *  switching the Wall Plug off – switch the devices on


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_20_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | control as the Wall Plug (0) |
|  | control opposite to the Wall Plug (1) |


#### 21: DOWN value - „On/Off (Power)” association group (3)

Lower power threshold, used in parameter 23  


##### Overview 

Lower power threshold, used in parameter 23. DOWN value cannot be higher than a value specified in parameter 22.

Setting: 0-24900 (0.0-2490.0W, step 0.1W)

Default: 300 (30W)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_21_2 |
| Data Type        | INTEGER |
| Range | 0 to 24900 |
| Default Value | 300 |


#### 22: UP value - „On/Off (Power)” association group (3)

Upper power threshold, used in parameter 23.  


##### Overview 

Upper power threshold, used in parameter 23. UP value cannot belower than a value specified in parameter 21.

Available settings: 100-25000 (10.0-2500.0W, step 0.1W)  
Default setting: 500 (50W)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_22_2 |
| Data Type        | INTEGER |
| Range | 100 to 25000 |
| Default Value | 500 |


#### 23: The response after exceeding defined power values

defines the way that 3rd association group devices are controlled.  


##### Overview 

This parameter defines the way that 3rd association group devices are controlled. Depends on the actual measured power (as parameters 21 and 22 settings).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_23_1 |
| Data Type        | INTEGER || Default Value | 6 |
| Options | turn the associated devices ON (DOWN) (1) |
|  | turn the associated devices OFF (DOWN) (2) |
|  | turn the associated devices ON (UP) (3) |
|  | turn the associated devices OFF (UP) (4) |
|  | combination of 1 and 4 (5) |
|  | combination of 2 and 3 (6) |


#### 24: SWITCH ON value - „On/Off” association groups

SWITCH ON value - „On/Off” association groups  


##### Overview 

The value of BASIC SET command frame sent to the devices associated in „On/Off” association groups (2, 3).

„On/Off (Button)” association group - in accordance with parameter 20.  
„On/Off (Power)” association group - in accordance with parameter 23.

Available settings: 0-99 or255

Default setting: 255


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_24_2 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | Default (255) |


#### 30: Active alarms

Define Z-Wave network alarms to which the Wall Plug will respond  


##### Overview 

Available settings:

 *  1 - general alarm
 *  2 - smoke alarm
 *  4 - CO alarm
 *  8 - CO2 alarm
 *  16 - high temperature alarm
 *  32 - flood alarm
 *  63 - All


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_30_1 |
| Data Type        | INTEGER || Default Value | 63 |
| Options | general alarm (1) |
|  | smoke alarm (2) |
|  | CO alarm (4) |
|  | CO2 alarm (8) |
|  | high temperature alarm (16) |
|  | flood alarm (32) |
|  | All (63) |


#### 31: Response to alarm frames

defines how the Wall Plug will respond to alarms  


##### Overview 

This parameter defines how the Wall Plug will respond to alarms (device’s status change).

In case of values 1 or 2 the Wall Plug is operating normally and LED ring signals an alarm through time defined in parameter 32 or until the alarm is cancelled.

In case of values 5 to 50 the Wall Plug does not report status change, power changes, ignores BASIC SET command frames. After time defined in parameter 32 or after the alarm cancellation, connected device is set to the previous state.

Available settings: 0 - no reaction,

 *  1 - turn connected device on
 *  2 - turn connected device off
 *  5-50 (0.5-5.0s, step 0.1s) - cyclically change device state with set period


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_31_1 |
| Data Type        | INTEGER |
| Range | 5 to 50 || Default Value | 0 |
| Options | no reaction (0) |
|  | turn connected device on (1) |
|  | turn connected device off (2) |


#### 32: Alarm state duration

specifies the duration of alarm state  


##### Overview 

This parameter specifies the duration of alarm state. If a device sending an alarm frame through the Z-Wave network sets alarm duration as well, this settings are ignored.

Available settings: 1-32400 (in seconds)  
Default setting: 600 (10min)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_32_2 |
| Data Type        | INTEGER |
| Range | 1 to 32400 |
| Default Value | 600 |


#### 40: Power load for violet colour

determines maximum active power value  


##### Overview 

This parameter determines maximum active power value, which when exceeded, causes the LED ring flash violet. Function is active only when parameter 41 is set to 1 or 2.

Available settings: 1000-30000 (100.0-3000.0W, step 0.1W)  
Default setting: 25000 (2500W)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_40_2 |
| Data Type        | INTEGER |
| Range | 1000 to 30000 |
| Default Value | 25000 |


#### 41: LED ring colour when controlled device is on

LED ring colour when controlled device is on  


##### Overview 

When set to 1 or 2, LED ring colour will change depending on active power and parameter 40. Other colours are set permanently and do not depend on power consumption.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_41_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | illumination turned off completely (0) |
|  | colour changes continuously depending on active power (1) |
|  | colour changes in steps depending on active power (2) |
|  | white (3) |
|  | red (4) |
|  | green (5) |
|  | blue (6) |
|  | yellow (7) |
|  | cyan (8) |
|  | magenta (9) |


#### 42: LED ring colour when controlled device is off

LED ring colour when controlled device is off  


##### Overview 

This parameter defines the illumination colour after turning off


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_42_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | illumination turned off completely (0) |
|  | LED ring is illuminated (1) |
|  | white (3) |
|  | red (4) |
|  | green (5) |
|  | blue (6) |
|  | yellow (7) |
|  | cyan (8) |
|  | magenta (9) |


#### 43: LED ring colour at the Z-Wave network alarm detection

LED ring colour at the Z-Wave network alarm detection  


##### Overview 

This parameter defines the illumination colour in case of Z-Wave alarm.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_43_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | illumination turned off completely (0) |
|  | no change in colour (1) |
|  | LED ring flashes red/blue/white (2) |
|  | white (3) |
|  | red (4) |
|  | green (5) |
|  | blue (6) |
|  | yellow (7) |
|  | cyan (8) |
|  | magenta (9) |


#### 50: Associations in Z-Wave network security mode

defines how commands are sent in specified association groups  


##### Overview 

This parameter defines how commands are sent in specified association groups: as secure or non-secure. Parameter is active only in Z-Wave network security mode. This parameter does not apply to 1st „Lifeline” group


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_50_1 |
| Data Type        | INTEGER || Default Value | 3 |
| Options | none of the groups sent as secure (0) |
|  | 2nd group sent as secure (1) |
|  | 3rd group sent as secure (2) |
|  | 2nd and 3rd group sent as secure (3) |


#### 1: Lifeline

  


##### Overview 

1st Association Group – “Lifeline” reports the device status and allows for assigning single device only (main controller by default).


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: On/Off (Button)

  


##### Overview 

2nd Association Group – “On/Off (Button)” devices in this group will be switched on or off when relay status is changed using the B-button (uses Basic command class).

The Wall Plug in 2nd and 3rd group allows to control up to 10 regular or multichannel devices per an association group. “LifeLine” group is reserved solely for the controller and hence only 1 node can be assigned.

It is not recommended to associate more than 10 devices in general, as the response time to control commands depends on the number of associated devices. In extreme cases, system response may be delayed.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: On/Off (Power)

  


##### Overview 

3rd Association Group – “On/Off (Power)” devices in this group will be switched on or off depending on the current load (uses Basic command class).

The Wall Plug in 2nd and 3rd group allows to control up to 10 regular or multichannel devices per an association group. “LifeLine” group is reserved solely for the controller and hence only 1 node can be assigned.

It is not recommended to associate more than 10 devices in general, as the response time to control commands depends on the number of associated devices. In extreme cases, system response may be delayed.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/513).
