---
layout: documentation
title: ASP-3-1 - ZWave
---

{% include base.html %}

# ASP-3-1 Smart Plug

This describes the Z-Wave device *ASP-3-1*, manufactured by *ID-RF* with the thing type UID of ```nodon_asp31_00_000```. 

Smart Plug  


## Overview 

## "Learning Mode" 

Press on the Smart Plug button during 2 seconds until the LED becomes red. Release the button, the LED will then glow in red. The Smart Plug is in “Learning mode”. To add or to remove the Smart Plug from a Z-Wave® network, follow “INCLUSION” or “EXCLUSION” procedures below.

If the Smart Plug is not added or removed from a network within 30 seconds (or if the button is pushed during learning mode), the Smart Plug will automatically exit learning mode.

## “Factory Reset” 

To perform a factory reset, press on the Smart Plug button during 5 seconds until the LED becomes orange. Release the button, the LED will blink red/green. Factory Reset clears the Smart Plug’s memory and set parameters to default value.

Please use this procedure only when the primary controller is missing or otherwise inoperable. Resetting the Smart Plug does not mean it has been removed from Z-Wave network controller’s memory. Use the primary controller to remove the Smart Plug from its Z-Wave network (follow “EXCLUSION” procedures below), before doing a Factory Reset.

  


### Inclusion Information 

To add the Smart Plug into a Z-Wave network:

1.  Plug the Smart Plug.
2.  Put the Smart Plug in “Learning mode”.
3.  Within 30 seconds put the Z-Wave Controller in “Learning mode” (See the Controller user guide for its own Inclusion procedure).
4.  The Smart Plug will confirm the Inclusion procedure by blinking its LED in Green.

  


### Exclusion Information 

To remove the Smart Plug from a Z-Wave network:

1.  Make sure the Smart Plug is plugged.
2.  Put the Smart Plug in “Learning mode”.
3.  Within 30 seconds put the Z-Wave Controller in “Learning mode” (See the Controller user guide for its own Exclusion procedure).
4.  The Smart Plug will confirm the Exclusion procedure by blinking its LED in Red.


## Channels
The following table summarises the channels available for the ASP-3-1 Smart Plug.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Alarm (system) | alarm_system | alarm_system |  | Switch |
| Alarm (power) | alarm_power | alarm_power | Door | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the ASP-3-1 Smart Plug.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Default State |  |
| 2: Power Failure |  |
| 3: Follow State |  |
| 4: Always On |  |
| 1: Lifeline |  |
| 2: Follow State |  |
| 3: Follow Complementary State |  |
| 4: Power Failure Notification |  |
| 5: Power Failure Set ON |  |
| 6: Power Failure Set OFF |  |
| 7: Power Recover Set ON |  |
| 8: Power Recover Set OFF |  |


#### 1: Default State

  


##### Overview 

Status of the Smart Plug after a Power Failure or after being plugged


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 63 || Default Value | 2 |
| Options | OFF (0) |
|  | ON (1) |
|  | Status before Power Failure (2) |


#### 2: Power Failure

  


##### Overview 

This parameter is to set-up the Power Failure / Recover notification and the associated group (Groups 4, 5, 6, 7, 8).

The value may be a sum of available values. For example, if you want to activate Power Failure and enable group 4 & 5, the parameter value should be 1+2+4=7.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 0 to 63 || Default Value | 0 |
| Options | Power Failure detection disable (0) |
|  | Power Failure enable (report to Lifeline only) (1) |
|  | Enable group 4 (2) |
|  | Enable group 5 (4) |
|  | Enable group 6 (8) |
|  | Enable group 7 (16) |
|  | Enable group 8 (32) |


#### 3: Follow State


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 3 |
| Options | Disable group 2 &amp; 3 (0) |
|  | Enable group 2 (1) |
|  | Enable group 3 (2) |
|  | Enable group 2 &amp; 3 (3) |


#### 4: Always On


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Always ON disabled (0) |
|  | Always ON enabled (1) |


#### 1: Lifeline

  


##### Overview 

This group is generally used to report information of the Smart Plug to the Main Controller of the network.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Follow State

  


##### Overview 

When the Smart Plug is switched ON (respectively OFF) using the local button, it will send ON (respectively OFF) command to the associated devices. No command is sent if the Smart Plug is switched ON or OFF wirelessly.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Follow Complementary State

  


##### Overview 

When the Smart Plug is switched ON (respectively OFF) using the local button, it will send OFF (respectively ON) command to the associated devices. No command is sent if the Smart Plug is switched ON or OFF wirelessly.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Power Failure Notification

  


##### Overview 

When the Smart Plug detects a power failure or recovers from a power failure, it sends the notification report to the associated devices.

The notification sent is “Notification Report: Power Management – AC Disconnected / Re-connected”.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


#### 5: Power Failure Set ON

  


##### Overview 

When the Smart Plug detects a Power Failure, it will switch ON the associated devices.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_5 |
| Data Type        | TEXT |
| Range |  to  |


#### 6: Power Failure Set OFF

  


##### Overview 

When the Smart Plug detects a Power Failure, it will switch OFF the associated devices.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_6 |
| Data Type        | TEXT |
| Range |  to  |


#### 7: Power Recover Set ON

  


##### Overview 

When the Smart Plug detects a Power Recover, it will switch ON the associated devices.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_7 |
| Data Type        | TEXT |
| Range |  to  |


#### 8: Power Recover Set OFF

  


##### Overview 

When the Smart Plug detects a Power Recover, it will switch OFF the associated devices.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_8 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/425).
