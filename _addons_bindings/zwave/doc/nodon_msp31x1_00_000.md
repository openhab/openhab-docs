---
layout: documentation
title: MSP-3-1-X1 - ZWave
---

{% include base.html %}

# MSP-3-1-X1 Z-Wave Plus Micro Smart Plug ON/OFF

This describes the Z-Wave device *MSP-3-1-X1*, manufactured by *ID-RF* with the thing type UID of ```nodon_msp31x1_00_000```. 

Z-Wave Plus Micro Smart Plug ON/OFF


## Channels
The following table summarises the channels available for the MSP-3-1-X1 Z-Wave Plus Micro Smart Plug ON/OFF.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Reset Meter | meter_reset | meter_reset | Energy | Switch |
| Alarm (power) | alarm_power | alarm_power | Door | Switch |
| Alarm (system) | alarm_system | alarm_system |  | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the MSP-3-1-X1 Z-Wave Plus Micro Smart Plug ON/OFF.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Default State | Status after a power outage or after being plugged |
| 3: Follow State | Allows to enable or disable Group 2 & Group 3 |
| 4: Always On | Forces the Micro Smart Plug status to be ON |
| 21: Power Auto-Sending Report | Power report for changes of x % W |
| 22: Overload Report | Switch off Micro Smart Plug in case the power is above x W |
| 23: Energy Auto-Sending Report | Auto energy report if value changes of x Wh |
| 24: Metering Heartbeat | Reporting intervall for power and energy to lifeline. |
| 25: Power High Threshold | Defines the High Threshold value in W. |
| 26: Power Low Threshold | Defines the Low Threshold value in W. |
| 27: Power Threshold Action | Defines actions if the power Low/High Threshold are reached. |
| 1: Lifetime | Report Information to Main Controller. |
| 2: Follow State | Send status if local button is used to associated devices. |
| 3: Follow Comp State | Send status if local button is used to associated devices. |
| 4: Metering High Threshold | Send ON/OFF command to associated devices if threshold reached |
| 5: Metering Low Threshold | Send ON/OFF command to associated devices if threshold reached |
| 6: Metering - Report | Report metering to devices in this group. |


#### 1: Default State

Status after a power outage or after being plugged  


##### Overview 

This parameter defines the status of the Micro Smart Plug after a power outage or after being plugged


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | OFF (0) |
|  | ON (1) |
|  | Status before power outage (2) |


#### 3: Follow State

Allows to enable or disable Group 2 & Group 3  


##### Overview 

This parameter allows to enable or disable Group 2 & Group 3

The value may be the sum of available values. For example, if you want to enable Group 2 & 3, the parameter value is 1+2=3


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 3 |
| Options | Group 2 &amp; Group 3 disable (0) |
|  | Group 2 enable (1) |
|  | Group 3 enable (2) |
|  | Group 2 &amp; Group 3 enable (3) |


#### 4: Always On

Forces the Micro Smart Plug status to be ON  


##### Overview 

This parameter forces the Micro Smart Plug status to be ON. While enable it is not possible to switch OFF the plug (local or wireless).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Always ON disable (0) |
|  | Always ON enable (1) |


#### 21: Power Auto-Sending Report

Power report for changes of x % W  


##### Overview 

This parameter will send a power report automatically if  the power value  changes of x % W (Watt) compared to the last report.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_21_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 || Default Value | 10 |
| Options | Power Auto-Polling Report Disable (0) |
|  | Power Auto-Polling Report Enable if 10% (10) |
|  | Power Auto-Polling Report Enable if 20 % (20) |
|  | Power Auto-Polling Report Enable if 30 % (30) |
|  | Power Auto-Polling Report Enable if 40 % (40) |
|  | Power Auto-Polling Report Enable if 50 % (50) |
|  | Power Auto-Polling Report Enable if 60 % (60) |
|  | Power Auto-Polling Report Enable if 70 % (70) |
|  | Power Auto-Polling Report Enable if 80 % (80) |
|  | Power Auto-Polling Report Enable if 90 % (90) |
|  | Power Auto-Polling Report Enable if 100% (100) |


#### 22: Overload Report

Switch off Micro Smart Plug in case the power is above x W  


##### Overview 

This parameter will switch off the Micro Smart Plug in case the power is above  x W (Watt) and send an alarm to the primary controller. This parameter has the highest execution priority between all the metering configurations for security reason.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_22_2 |
| Data Type        | INTEGER |
| Range | 0 to 2000 || Default Value | 2000 |
| Options | Overload Report Disable (Not Recommended) (0) |
|  | Overload Report enable with a upper limit of 50 W (50) |
|  | Overload Report enable with a upper limit of 100 W (100) |
|  | Overload Report enable with a upper limit of 150 W (150) |
|  | Overload Report enable with a upper limit of 200 W (200) |
|  | Overload Report enable with a upper limit of 250 W (250) |
|  | Overload Report enable with a upper limit of 500 W (500) |
|  | Overload Report enable with a upper limit of 1000 W (1000) |
|  | Overload Report enable with a upper limit of 1500 W (1500) |
|  | Overload Report enable with a upper limit of 2000 W (2000) |


#### 23: Energy Auto-Sending Report

Auto energy report if value changes of x Wh  


##### Overview 

This parameter will send a new energy report automatically if the energy value changes of x Wh (Watt-hour) compared to the last report.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_23_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 || Default Value | 1000 |
| Options | Energy Auto-Polling Report Disable (0) |
|  | Energy Auto-Polling Report enable if 1000 Wh variation (1000) |
|  | Energy Auto-Polling Report enable if 2000 Wh variation (2000) |
|  | Energy Auto-Polling Report enable if 3000 Wh variation (3000) |
|  | Energy Auto-Polling Report enable if 4000 Wh variation (4000) |
|  | Energy Auto-Polling Report enable if 5000 Wh variation (5000) |
|  | Energy Auto-Polling Report enable if 10.000 Wh variation (10000) |
|  | Energy Auto-Polling Report enable if 20.000 Wh variation (20000) |
|  | Energy Auto-Polling Report enable if 30.000 Wh variation (30000) |
|  | Energy Auto-Polling Report enable if 40.000 Wh variation (40000) |
|  | Energy Auto-Polling Report enable if 50.000 Wh variation (50000) |
|  | Energy Auto-Polling Report enable if 60.000 Wh variation (60000) |
|  | Energy Auto-Polling Report enable if 65.535 Wh variation (65535) |


#### 24: Metering Heartbeat

Reporting intervall for power and energy to lifeline.  


##### Overview 

Whatever other metering reports, this parameter will send one power and one energy report to the lifeline every x s (Seconds).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_24_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 || Default Value | 3600 |
| Options | Metering Pulse disable (0) |
|  | Metering Pulse enable and send report every hour (3600) |
|  | Metering Pulse enable and send report every 6 hours (21600) |
|  | Metering Pulse enable and send report every 12 hours (43200) |


#### 25: Power High Threshold

Defines the High Threshold value in W.  


##### Overview 

This parameter defines the High Threshold power value.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_25_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 || Default Value | 20 |
| Options | Power High Threshold disable (0) |
|  | Power High Threshold enable with the value from 10 W (10) |
|  | Power High Threshold enable with the value from 20 W (20) |
|  | Power High Threshold enable with the value from 30 W (30) |
|  | Power High Threshold enable with the value from 40 W (40) |
|  | Power High Threshold enable with the value from 50 W (50) |
|  | Power High Threshold enable with the value from 100 W (100) |
|  | Power High Threshold enable with the value from 200 W (200) |
|  | Power High Threshold enable with the value from 300 W (300) |
|  | Power High Threshold enable with the value from 400 W (400) |
|  | Power High Threshold enable with the value from 500 W (500) |
|  | Power High Threshold enable with the value from 1000 W (1000) |
|  | Power High Threshold enable with the value from 1500 W (1500) |
|  | Power High Threshold enable with the value from 2000 W (2000) |


#### 26: Power Low Threshold

Defines the Low Threshold value in W.  


##### Overview 

This parameter defines the Low Threshold power value.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_26_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 || Default Value | 5 |
| Options | Power Low Threshold disable (0) |
|  | Power Low Threshold enable with the value from 5 W (5) |
|  | Power Low Threshold enable with the value from 10 W (10) |
|  | Power Low Threshold enable with the value from 20 W (20) |
|  | Power Low Threshold enable with the value from 30 W (30) |
|  | Power Low Threshold enable with the value from 40 W (40) |
|  | Power Low Threshold enable with the value from 50 W (50) |
|  | Power Low Threshold enable with the value from 100 W (100) |
|  | Power Low Threshold enable with the value from 200 W (200) |
|  | Power Low Threshold enable with the value from 300 W (300) |
|  | Power Low Threshold enable with the value from 400 W (400) |
|  | Power Low Threshold enable with the value from 500 W (500) |
|  | Power Low Threshold enable with the value from 1000 W (1000) |
|  | Power Low Threshold enable with the value from 1500 W (1500) |
|  | Power Low Threshold enable with the value from 2000 W (2000) |


#### 27: Power Threshold Action

Defines actions if the power Low/High Threshold are reached.  


##### Overview 

This parameter will define the Micro Smart Plug actions if the power Low and High Threshold are reached.

The value may be the sum of available values. For example, if you want:

 *  Power High Threshold Action is enable and sent ON to Group 4 (3)
 *  Power Low Threshold Action is enable and sent OFF to Group 5 (4)

the parameter value must be 3+4=7.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_27_1 |
| Data Type        | INTEGER || Default Value | 7 |
| Options | Power Threshold Action is disable. (0) |
|  | Power High Group 4 OFF (1) |
|  | Power High Group 4 ON (3) |
|  | Power Low Group 5 OFF (4) |
|  | Power High Group 4 OFF &amp; Power Low Group 5 OFF (5) |
|  | Power High Group 4 ON &amp; Power Low Group 5 OFF (7) |
|  | Power High Group 5 ON (12) |
|  | Power High Group 4 OFF &amp; Power Low Gourp 5 ON (13) |
|  | Power High Group 4 ON &amp; Power Low Group 5 ON (15) |


#### 1: Lifetime

Report Information to Main Controller.  


##### Overview 

This group is generally used to report information of the Micro Smart Plug to the Main Controller of the network.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Follow State

Send status if local button is used to associated devices.  


##### Overview 

When the Micro Smart Plug is switched ON (respectively OFF) using the local button, it will send ON (respectively OFF) command to the associated devices. No command is sent if the Micro Smart Plug is switched ON or OFF wirelessly.

This group is configurable through the parameter 3.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Follow Comp State

Send status if local button is used to associated devices.  


##### Overview 

When the Micro Smart Plug is switched ON (respectively OFF) using the local button, it will send OFF (respectively ON) command to the associated devices. No command is sent if the Micro Smart Plug is switched ON or OFF wirelessly.

This group is configurable through the parameter 3.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Metering High Threshold

Send ON/OFF command to associated devices if threshold reached  


##### Overview 

When the Micro Smart Plug reaches over the high threshold of power defined by the configuration parameter, it will send OFF or ON command to the associated devices.

This group is configurable through the parameter 25 and 27.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


#### 5: Metering Low Threshold

Send ON/OFF command to associated devices if threshold reached  


##### Overview 

When the Micro Smart Plug reaches below the low threshold of power defined by the configuration parameter, it will send OFF or ON command to the associated devices.

This group is configurable through the parameters 26 and 27.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_5 |
| Data Type        | TEXT |
| Range |  to  |


#### 6: Metering - Report

Report metering to devices in this group.  


##### Overview 

All the meter reports and notifications triggered by Metering parameters will be reported to the devices present in this group.

This group is configurable through the parameters 21, 22, 23 and 24.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_6 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/435).
