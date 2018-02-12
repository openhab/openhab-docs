---
layout: documentation
title: EU-2 - ZWave
---

{% include base.html %}

# EU-2 Light Switch 2 Channel

This describes the Z-Wave device *EU-2*, manufactured by *Shenzhen Neo Electronics Co., Ltd* with the thing type UID of ```shenzhen_eu2_00_000```. 

Light Switch 2 Channel  


## Overview 

Light Switch is an intelligent device that can be remotely controlled through Z-Wave network and radio waves. In the Z-Wave network communications, light switch can be connected to any Z-Wave gateway. When using radio waves, light switch can be used in conjunction with Z-Wave gateway. The frequency of radio waves used by gateway and switch is like this: different countries or areas, the radio frequency is different. Each light switch has a unique ID code. When we add or remove the switch from the alarm host, just place light switch in the Z-Wave network range of gateway. Then we can easily find the switch through the device ID code. In communication with gateway, light switch not only can send signals to Z-Wave gateway, but also can receive signals from it. When touch the button on light switch, it would send signals to Z-Wave gateway, then gateway can correctly display the switch on / off state; when light switch receives signals from gateway, the switch state would be remotely switched on/off.

  


### Inclusion Information 

1.  Connect switch to power source, after making it powred, please do not operate it within 20s.
2.  Make sure Light Switch is powered.
3.  Set Z-Wave gateway into inclusion mode (Refer to gateway user manual)
4.  Touch the button three times continuously within 1.5 second, then Light Switch will enter inclusion mode. Meanwhile, LED light would flash red color five times on and off alternately.
5.  Light Switch will be detected and included in the Z-Wave network.
6.  Wait for gateway to configure the switch.

**Note:** If Light Switch has not been added to Z-Wave network, it can enter inclusion mode automatically when it is powered on. But in order to run this function, should let the controller enter into inclusion first before making Light Switch powered on.

  


### Exclusion Information 

1.  Make sure Light Switch is powered.
2.  Set Z-Wave gateway into exclusion mode (Refer to gateway user manual)
3.  Touch the button three times continuously within 1.5 second, then Light Switch will enter exclusion mode. Meanwhile, LED light would flash red color once then pink color 4 times on and off alternately.
4.  Wait for gateway to delete the switch.


## Channels
The following table summarises the channels available for the EU-2 Light Switch 2 Channel.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch |
| Switch 2 | switch_binary2 | switch_binary | Switch | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the EU-2 Light Switch 2 Channel.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Back light Enable | Enable back light when Light Switch is powered on. |
| 2: Relay On/Off Indicate | Switch on LED indicator. |
| 3: Relay On/Off Status Saved Enable | Restore switch status on power restore. |
| 4: Root Device Mapped Setting | Endpoint device mapping setting for associated devices. |
| 1: Lifeline | GROUP 1 is lifeline service that assigned to Light Switch status. It enables Light Switch ... |
| 2: Group 2 | GROUP 2 allows Sending Binary Switch Report to associated devices in this group. This grou... |
| 3: Group 3 | GROUP 3 allows Sending Binary Switch Report to associated devices in this group. This grou... |


#### 1: Back light Enable

Enable back light when Light Switch is powered on.  


##### Overview 

This parameter defines the back light state of touch buton. The back light LED would be on when Light Switch is powered on if this parameter is set to '1'; otherwise the back light LED would be off.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Disable back light LED (0) |
|  | Enable back light LED (1) |


#### 2: Relay On/Off Indicate

Switch on LED indicator.  


##### Overview 

This parameter defines the relay state. The LED will be turned on with pink color when the button is touched to turn on relay if this parameter is set to '1'; otherwise the LED state is not changed.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Do not change LED state when on (0) |
|  | Pink LED state when on (1) |


#### 3: Relay On/Off Status Saved Enable

Restore switch status on power restore.  


##### Overview 

This parameter defines the on/off status of relay needs saving or not. The status will be saved when relay status is changed if this parameter is set to '1'; otherwise the relay status is not saved. The Light Switch will restore the relay status when is powered on again.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Do not save the On/Off status (0) |
|  | Save and restore the relay On/Off status (1) |


#### 4: Root Device Mapped Setting

Endpoint device mapping setting for associated devices.  


##### Overview 

This parameter defines which endpoint is mapped to root device (Endpoint 0). Devices that send BASIC\_SET = 0xFF command to Light Switch the configured endpoints will be turned on.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | 0 - No endpoint is mapped to root device (0) |
|  | 1 - Endpoint 1 is mapped to root device (1) |
|  | 2 - Endpoint 2 is mapped to root device (2) |
|  | 3 - Endpoint 1 and 2 are mapped to root device (3) |


#### 1: Lifeline

GROUP 1 is lifeline service that assigned to Light Switch status. It enables Light Switch to send reports to Z-Wave Gateway whenever some button is touched. This Group Support: SWITCH\_BINARY\_REPORT, DEVICE\_RESET\_LOCALLY\_NOTIFICATION


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Group 2

GROUP 2 allows Sending Binary Switch Report to associated devices in this group. This group is mapped to Endpoint 1. This Group Support: SWITCH\_BINARY\_REPORT


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Group 3

GROUP 3 allows Sending Binary Switch Report to associated devices in this group. This group is mapped to Endpoint 2. This Group Support: SWITCH\_BINARY\_REPORT


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/613).
