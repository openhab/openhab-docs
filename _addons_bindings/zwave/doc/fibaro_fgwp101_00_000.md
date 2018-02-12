---
layout: documentation
title: FGWP101 - ZWave
---

{% include base.html %}

# FGWP101 Metered Wall Plug Switch

This describes the Z-Wave device *FGWP101*, manufactured by *Fibargroup* with the thing type UID of ```fibaro_fgwp101_00_000```. 

Metered Wall Plug Switch


## Channels
The following table summarises the channels available for the FGWP101 Metered Wall Plug Switch.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Sensor (power) | sensor_power | sensor_power | Energy | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Reset the total power consumption | meter_reset | meter_reset | Energy | Switch |
| LED color when device is on | config_decimal_param61 | fibaro_fgwp101_00_000_config_decimal_param61 |  | Number |
| LED color when device is off | config_decimal_param62 | fibaro_fgwp101_00_000_config_decimal_param62 |  | Number |
| Start Alarm LED Illumination | notification_send | notification_send |  | Number |


### Device Configuration
The following table provides a summary of the configuration parameters available in the FGWP101 Metered Wall Plug Switch.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Always on function | Once activated, Wall Plug will keep a connected device ... |
| 16: Remember device status after power failure | Define how will the Plug react after the power supply is back on. |
| 34: Reaction to alarms | Define Z-Wave network alarms to which the Wall Plug will respond. |
| 35: Response to alarms | Parameter defines how the Wall Plug will respond to alarms ... |
| 39: Alarm duration | Wall Plug's alarm mode duration. If a device sending an ... |
| 40: Immediate power report | Parameter defines by how much power load must change ... |
| 42: Standard power load report | Parameter defines by how much power load must change .. |
| 43: Power reporting frequency | This parameter defines how frequently standard power ... |
| 45: Reporting Changes in energy consumed by controlled devices | Reporting changes in energy consumed by controlled devices |
| 47: Time Period between reports on power and energy consumption | Time Period between reports on power and energy ... |
| 49: Metering energy consumed by the Wall Plug itself. | This parameter determines whether energy metering ... |
| 50: DOWN value | Lower power threshold, used in parameter 52. |
| 51: UP value | Upper power threshold, used in parameter 52. |
| 52: Action in case defined power values exceeded | Parameter defines the way 2nd association group devices ... |
| 60: Power load to make red ring flash violet | Function is active only when parameter 61 is set to 0 or 1. |
| 61: LED color when device is on |  |
| 62: LED color when device is off |  |
| 63: LED color when Z Wave alarm |  |
| 70: Overload safety switch | This function allows for turning off the controlled device... |
| 1: Group 1 (on/off controlled devices) |  |
| 2: Group 2 (measured load controlled devices) |  |
| 3: Controller Updates |  |


#### 1: Always on function

Once activated, Wall Plug will keep a connected device ...  


##### Overview 

... ON, will stop reacting to alarm frames and B-button push.  
"Always on" function turns the Plug into a power and energy meter.  
Also, connected device will not be turned off upon receiving an alarm  
frame from another Z-Wave device (parameter 35 will be ignored).  
In "Always on" mode, connected device may be turned off only after  
user defined power has been exceeded (parameter 70). In such a  
case, connected device can be turned on again by pushing the  
B-button or sending a control frame. By default, overload protection  
is inactive. Default setting: 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Activated (0) |
|  | Inactive (1) |


#### 16: Remember device status after power failure

Define how will the Plug react after the power supply is back on.  


##### Overview 

Default setting: 1

Available settings:

 *  0 - Wall Plug does not memorize its state after a power failure.
 *  1 - Connected device will be off after the power supply is reconnected.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_16_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Do not remember state (0) |
|  | Remember state before power failure (1) |


#### 34: Reaction to alarms

Define Z-Wave network alarms to which the Wall Plug will respond.  


##### Overview 

Default setting: 63

Available settings: 0 - 63.

 *  1 - general alarm
 *  2 - smoke alarm4 - CO alarm
 *  8 - CO2 alarm
 *  16 - high temperature alarm
 *  32 - flood alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_34_1 |
| Data Type        | INTEGER |
| Range | 0 to 63 |
| Default Value | 63 |


#### 35: Response to alarms

Parameter defines how the Wall Plug will respond to alarms ...  


##### Overview 

... (device's status change) Default setting: 0  
Available settings:  
0 - no reaction,  
1 - turn on connected device. LED ring signals an alarm through  
defined time period (parameter 39) or untill the alarm is  
cancelled.  
2 - turn off connected device. LED ring signals an alarm through  
defined time period (parameter 39) or untill the alarm is  
cancelled.  
3 - cyclically change device state, each 1second. In alarm mode  
Wall Plug does not report status change, power changes,  
ignores alarm frames. After the defined time period has passed  
(parameter 39) or after the alarm cancellation, connected  
device is set to the previous state.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_35_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | No reaction (0) |
|  | Turn ON (1) |
|  | Turn OFF (2) |
|  | Cycle ON/OFF (3) |


#### 39: Alarm duration

Wall Plug's alarm mode duration. If a device sending an ...  


##### Overview 

... alarm frame through the Z-Wave network sets alarm duration as well, this parameter's settings are ignored.  
Default setting: 600 (seconds).  
Available settings: 1 - 65536 (seconds)  
 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_39_2 |
| Data Type        | INTEGER |
| Range | 1 to 65535 |
| Default Value | 600 |


#### 40: Immediate power report

Parameter defines by how much power load must change ...  


##### Overview 

...in percents, to be reported to the main controller, with the highest  
priority in the Z-Wave network. By default, Fibaro Wall Plug  
immediately sends power report if the power load changes by 80%.  
Default setting: 80 (%)  
Available settings: 1 - 100 (%).  
Value of 100 (%) means the reports are turned off.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_40_1 |
| Data Type        | INTEGER |
| Range | 1 to 100 |
| Default Value | 80 |


#### 42: Standard power load report

Parameter defines by how much power load must change ..  


##### Overview 

... in percents, to be reported to the main controller. By default, Fibaro  
Wall Plug sends power report if the power load changes by 15%.  
By default such changes in power load may be reported up to 5 times  
per 30 seconds. Wall Plug sends 5 reports during time period  
specified in paramater 43.  
Default setting: 15 (%)  
Available settings: 1 - 100 (%)  
Value of 100 (%) means the reports are turned off


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_42_1 |
| Data Type        | INTEGER |
| Range | 1 to 100 |
| Default Value | 15 |


#### 43: Power reporting frequency

This parameter defines how frequently standard power ...  


##### Overview 

... (parameter 42) will be sent. By default Wall Plug sends up to 5  
reports each 30 seconds, provided the power load changes by 15%.  
Default seting: 30 (s)  
Available settings: 1 - 254 (s)  
Value of 255 - Reports will be sent only as a result of parameter 47  
settings or in case of polling.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_43_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 30 |


#### 45: Reporting Changes in energy consumed by controlled devices

Reporting changes in energy consumed by controlled devices  


##### Overview 

... New, reported energy value is calculated based on last reported  
value. Default setting: 10 (0,1 kWh).  
Available settings: 1 - 254 (0,01kWh - 2,54kWh).  
Value of 255 - changes in consumed energy will not be reported.  
Reports will be sent only in case of polling.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_45_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 1 |


#### 47: Time Period between reports on power and energy consumption

Time Period between reports on power and energy ...  


##### Overview 

... consumption.

Parameter defines time period between reports sent when changes  
in power load have not been recorded. By default, if power load  
changes have not been recorded, reports are sent every hour.  
Default setting: 3 600 (s),  
Available settings: 1 - 65534 (s)  
Value of 65535 - no periodic reports. Reports will be sent only in  
case of power load / energy consumption changes (parameters 40,  
42, 43,45) or in case of polling.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_47_2 |
| Data Type        | INTEGER |
| Range | 1 to 65534 |
| Default Value | 3600 |


#### 49: Metering energy consumed by the Wall Plug itself.

This parameter determines whether energy metering ...  


##### Overview 

... should include the amount of energy consumed by the Wall Plug itself.  
Results are being added to energy consumed by controlled device.  
Default setting: 0  
Available settings:  
0 - function inactive,  
1 - function activated.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_49_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Inactive (0) |
|  | Activated (1) |


#### 50: DOWN value

Lower power threshold, used in parameter 52.  


##### Overview 

Default setting: 300 (30 W)  
Available settings: 0 - 25 000 (0,0W - 2 500W)  
DOWN value cannot be higher than a value specified in parameter  
51.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_50_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 300 |


#### 51: UP value

Upper power threshold, used in parameter 52.  


##### Overview 

Default setting: 500 (50 W)  
Available settings: 1 - 25 000 (0,1W - 2 500W)  
UP value cannot be lower than a value specified in parameter 50.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_51_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 500 |


#### 52: Action in case defined power values exceeded

Parameter defines the way 2nd association group devices ...  


##### Overview 

... are controlled, depending on the current power load.  
Default setting: 6  
Available settings:  
0 - function inactive,  
1 - turn the associated devices on, once the power drops below  
DOWN value (parameter 50),  
2 - turn the associated devices off, once the power drops below  
DOWN value (parameter 50),  
3 - turn the associated devices on, once the power rises above UP  
value (parameter 51),  
4 - turn the associated devices off, once the power rises above UP  
value (parameter 51),  
5 - 1 and 4 combined. Turn the associated devices on, once the  
power drops below DOWN value (parameter 50). Turn the  
associated devices off, once the power rises above UP value  
(parameter 51).  
6 - 2 and 3 combined. Turn the associated devices off, once the  
power drops below DOWN value (parameter 50). Turn the  
associated devices on, once the power rises above UP value  
(parameter 51).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_52_1 |
| Data Type        | INTEGER || Default Value | 6 |
| Options | Function inactive (0) |
|  | Turn devices ON when power below DOWN (1) |
|  | Turn devices OFF when power below DOWN (2) |
|  | Turn devices ON when power above UP (3) |
|  | Turn devices OFF when power above UP (4) |
|  | Turn devices ON when power below DOWN and off ... (5) |
|  | Turn devices OFF when power below DOWN ... (6) |


#### 60: Power load to make red ring flash violet

Function is active only when parameter 61 is set to 0 or 1.  


##### Overview 

Default setting: 25 000 (2 500W)  
Available settings: 1 000 - 32 000 (100W - 3200W)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_60_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 25000 |


#### 61: LED color when device is on


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_61_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | LED will use predefined steps depending on power (0) |
|  | LED will use continuous color depending on power (1) |
|  | White illumination (2) |
|  | Red illumination (3) |
|  | Green illumination (4) |
|  | Blue illumination (5) |
|  | Yellow illumination (6) |
|  | Cyan illumination (7) |
|  | Magenta illumination (8) |
|  | NO illumination (9) |


#### 62: LED color when device is off


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_62_1 |
| Data Type        | INTEGER || Default Value | 8 |
| Options | LED ring is illuminated with a color corresponding to ... (0) |
|  | White illumination (1) |
|  | Red illumination (2) |
|  | Green illumination (3) |
|  | Blue illumination (4) |
|  | Yellow illumination (5) |
|  | Cyan illumination (6) |
|  | Magenta illumination (7) |
|  | NO illumination (8) |


#### 63: LED color when Z Wave alarm


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_63_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | No change in color (0) |
|  | LED flashes RED BLUE WHITE (1) |
|  | White illumination (2) |
|  | Red illumination (3) |
|  | Green illumination (4) |
|  | Blue illumination (5) |
|  | Yellow illumination (6) |
|  | Cyan illumination (7) |
|  | Magenta illumination (8) |
|  | NO illumination (9) |


#### 70: Overload safety switch

This function allows for turning off the controlled device...  


##### Overview 

... in case of exceeding the defined power. Controlled device will be turned off  
even if "always on" function is active (parameter 1).  
Controlled device can be turned back on via B-button or sending a  
control frame. By default this function is inactive.  
Default setting: 65 535 (6 553,5W)  
Available settings: 10 - 65 535 (1W - 6 553,5W).  
Value higher than 32 000 (3 200W) turns the overload safety switch  
off, i.e. this functionality is turned off by default.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_70_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 65535 |


#### 1: Group 1 (on/off controlled devices)

  


##### Overview 

Is assigned to the device status – sending command frames to the associated devices whenever the Wall Plug is turned ON or OFF via B-button.

Fibaro Association Group Info

Allows to control 5 regular and 5 multichannel devices per an association group.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Group 2 (measured load controlled devices)

  


##### Overview 

Is assigned to the measured active power – sending command frames to the associated devices depending on the measured load (configured via advanced parameters 50, 51 and 52).

Fibaro Association Group Info

Allows to control 5 regular and 5 multichannel devices per an association group.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Controller Updates

  


##### Overview 

Reports the device status and allows to assign single device only (the main controller by default).

Fibaro Association Group Info

3rd group is reserved solely for the controller and hence only 1 node can be assigned.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/130).
