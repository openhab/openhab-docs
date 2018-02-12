---
layout: documentation
title: WT00Z-1 - ZWave
---

{% include base.html %}

# WT00Z-1 3-Way Wall Accessory Switch

This describes the Z-Wave device *WT00Z-1*, manufactured by *Linear Corp* with the thing type UID of ```linear_wt00z1_00_000```. 

3-Way Wall Accessory Switch


## Channels
The following table summarises the channels available for the WT00Z-1 3-Way Wall Accessory Switch.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |


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
The following table provides a summary of the configuration parameters available in the WT00Z-1 3-Way Wall Accessory Switch.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Dim Start Level | Set Ignore Start Level Bit When Transmitting Dim Commands |
| 2: Suspend Group 4 | Suspend Group 4 |
| 3: Night Light | Relationship between LED and status of devices in Group 1 |
| 4: Invert Switch | Setting the relationship between the top of the transmitter to ON or OFF |
| 5: Ignore start level when recieving dim commands | Ignore start level when recieving dim commands |
| 7: ON/OFF dim rate | dim step parameter valid values: 1-99 |
| 8: ON/OFF dim rate | dim timer parameter valid values: 1-255 |
| 9: Local control dim rate | dim step parameter valid values: 1-99 |
| 10: Local control dim rate | dim timer parameter valid values: 1-255 |
| 11: ALL ON/ ALL OFF dim rate | dim step parameter valid values: 1-99 |
| 12: ALL ON/ ALL OFF dim rate | dim timer parameter valid values: 1-255 |
| 13: Disable group 4 during a dim command | Disable group 4 during a dim command |
| 14: Enable Shade Control Group 2 | The switch can control shade control devices if this parameter is set to 1. |
| 15: Enable Shade Control Group 3 | The switch can control shade control devices if this parameter is set to 1. |
| 16: Enable Shade Control Group 1 | The switch can control shade control devices if this parameter is set to 1. |
| 19: LED Transmission Indication | LED Transmission Indication |
| 20: Poll: minutes | Frequency that WT00Z-1 will poll first node in Group 1 |
| 21: Poll first node in group 1 | Activate/Deactivate polling of first node in Group 1 |
| 1: Associating Group 1 |  |
| 2: Associating Group 2 |  |
| 3: Associating Group 3 |  |
| 4: Associating Group 4 |  |


#### 1: Dim Start Level

Set Ignore Start Level Bit When Transmitting Dim Commands  


##### Overview 

The WT00Z-1 can send Dim commands to Z-Wave enabled dimmers.The Dim command has a start level embedded in it. A dimmer receivingthis command will start dimming from that start level. However, thecommand can be sent so that the dimmer ignores the start level andinstead starts dimming from its current level. By default, the WT00Z-1sends the command so that the dimmer will start dimming from itscurrent dim level rather than the start level embedded in the command.To change this, simply set the conﬁguration parameter to 0.

**• Parameter No: 1• **

**Length: 1 Byte• **

**Valid Values = 0 or 1 (default 1)**

**NOTE:**

Any ACT Z-Wave enabled dimmers have the conﬁguration optionto ignore the start level no matter how you conﬁgure the WT00Z-1

 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Use Start Level (0) |
|  | Ignore Start Level (1) |


#### 2: Suspend Group 4

Suspend Group 4  


##### Overview 

You may wish to disable transmitting commands to Z-Wave devices that are in Group 4 without “un-associating” those devices from the group. Setting parameter 2 to the value of 1 will stop the WT00Z-1 from transmitting to devices that are “associated” into Group 4.

**• Parameter No: 2•**

** Length: 1 **

**Byte• Valid Values = 0 or 1 (default 0**


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Enable Group 4 (0) |
|  | Disable Group 4 (1) |


#### 3: Night Light

Relationship between LED and status of devices in Group 1  


##### Overview 

The LED on the WT00Z-1 will by default, turn ON when the status of the devices in Group 1 is ON. To make the LED turn ON when the status of Group 1 is OFF set this parameter to a value of 1.

**Parameter No: 3• **

**Length: 1 Byte• **

**Valid Values = 0 or 1 (default 0**


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | On when load is on (0) |
|  | On when load is off (1) |


#### 4: Invert Switch

Setting the relationship between the top of the transmitter to ON or OFF  


##### Overview 

To change the top of the transmitter to OFF and the bottom of the transmitter to ON, set parameter 4 to 1.

To change back to original settings, set this parameter to the value of 0.

**Parameter No: 4**

**Length: 1 Byte**

**Valid Values = 0 or 1 (default 0)**


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Top-ON, Bottom-OFF (0) |
|  | Bottom-ON, Top-OFF (1) |


#### 5: Ignore start level when recieving dim commands

Ignore start level when recieving dim commands  


##### Overview 

The WT00Z-1 can send Dim commands to Z-Wave enabled dimmers. The Dim command has a start level embedded in it. A dimmer receiving this command will start dimming from that start level. However, the command can be sent so that the dimmer ignores the start level and instead start dimming from its current level. By default, the WT00Z-1 sends the command so that the dimmer will start dimming from its current dim level rather then the start level embedded in the command. To change this, simply set the conﬁguration parameter to 0.

**Parameter No: 5•**

**Length: 1 Byte**

**Valid Values = 0 or 1 (default 1**


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Use start level (0) |
|  | Ignore start level (1) |


#### 7: ON/OFF dim rate

dim step parameter valid values: 1-99


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER |
| Range | 1 to 99 |
| Default Value | 3 |


#### 8: ON/OFF dim rate

dim timer parameter valid values: 1-255


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 10 |


#### 9: Local control dim rate

dim step parameter valid values: 1-99


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER |
| Range | 1 to 99 |
| Default Value | 3 |


#### 10: Local control dim rate

dim timer parameter valid values: 1-255


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 10 |


#### 11: ALL ON/ ALL OFF dim rate

dim step parameter valid values: 1-99


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_1 |
| Data Type        | INTEGER |
| Range | 1 to 99 |
| Default Value | 3 |


#### 12: ALL ON/ ALL OFF dim rate

dim timer parameter valid values: 1-255


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 10 |


#### 13: Disable group 4 during a dim command

Disable group 4 during a dim command  


##### Overview 

After the WT00Z-1 is commanded to stop dimming when dimming because of the DIM START command, it will then command the Z-Wave devices that are in Group 4 to its new level. To prevent the WT00Z-1 from commanding the Z-Wave devices in Group 4 during this particular occurrence, set Parameter 13 to the value of 1.

**Parameter 13**

**Length: 1 Byte**

**Valid Values = 0 or 1 (default 0**


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Enable (0) |
|  | Disable (1) |


#### 14: Enable Shade Control Group 2

The switch can control shade control devices if this parameter is set to 1.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable (0) |
|  | Enable (1) |


#### 15: Enable Shade Control Group 3

The switch can control shade control devices if this parameter is set to 1.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_15_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable (0) |
|  | Enable (1) |


#### 16: Enable Shade Control Group 1

The switch can control shade control devices if this parameter is set to 1.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_16_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable (0) |
|  | Enable (1) |


#### 19: LED Transmission Indication

LED Transmission Indication  


##### Overview 

The WT00Z-1 will ﬂicker its LED when it is transmitting to any of its 4 groups. This ﬂickering can be set to not ﬂicker at all (set to 0), to ﬂicker the entire time it is transmitting (set to 1), or to ﬂicker for only 1 second when it begins transmitting (set to 2). By default, the WT00Z-1 is set to ﬂicker for only 1 second.

**Parameter 19**

**Length: 1 Byte**

**Valid Values = 0 , 1, 2 (default 2)**


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_19_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | Disable Flicker (0) |
|  | Flicker while transmitting (1) |
|  | Flicker for 1 second (2) |


#### 20: Poll: minutes

Frequency that WT00Z-1 will poll first node in Group 1  


##### Overview 

The WT00Z-1 will poll the ﬁrst node in Group 1 in order to keep itself synchronized with the group if this conﬁguration parameter is set to 1. How often it will poll is conﬁgured using this parameter.

**Parameter 20**

**Length: 1 Byte**

**Valid Values = 1 through 255 (default: 2)**


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_20_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 2 |


#### 21: Poll first node in group 1

Activate/Deactivate polling of first node in Group 1  


##### Overview 

The WT00Z-1 will poll the ﬁrst node in Group 1 in order to keep itself synchronized with the group if this conﬁguration parameter is set to 1.

**Parameter 21**

**Length: 1 Byte**

**Valid Values = 0 , 1 (default 0)**


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_21_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Do not poll first node in group (0) |
|  | Poll first node in group (1) |


#### 1: Associating Group 1

  


##### Overview 

Nodes in this group are turned ON by tapping the top of the paddle or OFF by tapping the bottom of the paddle. Nodes associated into this group are dimmed by pressing and holding the bottom of the paddle until the desired dim level is reached or brightened by pressing and holding the top of the paddle until the desired level is reached. The LED on the WT00Z-1 will indicate the status of this group ONLY.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Associating Group 2

  


##### Overview 

Nodes in this group are turned ON by tapping the top of the paddle twice or OFF by tapping the bottom of the paddle twice. Nodes associated into this group are dimmed by tapping the bottom of the paddle once and then pressing and holding the bottom of the paddle until the desired dim level is reached or brightened by tapping the top  of  the  paddle  once  then  pressing and holding the top of the paddle  until the desire level is reached


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Associating Group 3

  


##### Overview 

Nodes in this group are turned ON by tapping the top of the paddle three times or OFF by tapping the bottom of the paddle three times. Nodes associated into this group are dimmed by tapping the bottom of the paddle twice and then pressing and holding the bottom of the paddle until the desired dim level is reached or brightened by tapping the top of the paddle twice then pressing and holding the top of the paddle until the desired level is reached


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Associating Group 4

  


##### Overview 

Nodes in this group are turned ON or OFF or set to a speciﬁc dim level when the WT00Z-1 is controlled remotely. You can place up to 5 nodes in each group. If controlling dimmers, for best results, associate the dimmers into the group ﬁrst


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/13).
