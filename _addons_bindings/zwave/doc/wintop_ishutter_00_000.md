---
layout: documentation
title: iShutter - ZWave
---

{% include base.html %}

# iShutter iShutter

This describes the Z-Wave device *iShutter*, manufactured by *Wintop* with the thing type UID of ```wintop_ishutter_00_000```. 

iShutter


## Channels
The following table summarises the channels available for the iShutter iShutter.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|


### Device Configuration
The following table provides a summary of the configuration parameters available in the iShutter iShutter.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Buttons Mode | See overview |
| 2: Automatically close after | If not zero, automatically close blind after a user defined time |
| 3: What to do on RF close command | Defines how to interpret RF Off command. |
| 4: Typical click timeout | time used to differentiate click, hold, double and triple clicks |
| 5: Invert buttons | Invert buttons |
| 6: Action on button press or hold | Defines which command should be sent to Association group |
| 7: LED mode | Set LED indication mode |
| 10: Full close time | Time to go from opened to closed state. |
| 11: Full open time | Time to go from closed to open state |
| 12: Node Id of the blocking device | Id of the device which commands would not be Open/Close, but as block/unblock. |
| 13: which command from blocking node to enable the protection | Which command from blocking device is closed door and hence, unprotected. |
| 14: Invert open and close relays | Allow exchanging open and close relays |
| 1: Click, press and hold of up/down buttons | Click, press and hold of up/down buttons |
| 2: Send Reports on blind state change | Send Reports on blind state change |


#### 1: Buttons Mode

See overview  


##### Overview 

0 -> One push button

1 -> Two paddles with Power and Direction

2 -> Two toggle switch

3 -> Two buttons with neutral position 

One push button: One button is used (chose any), press while moving up and down, stops, while stopped moves to opposite direction to previous. Two buttons with neutral position: Up click moves up if stopped and stops if moving down, Down click moves down 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | One push button (0) |
|  | Two paddles with Power and Direction (1) |
|  | Two toggle switch (2) |
|  | Two buttons with neutral position (3) |


#### 2: Automatically close after

If not zero, automatically close blind after a user defined time


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 0 |


#### 3: What to do on RF close command

Defines how to interpret RF Off command.  


##### Overview 

0 -> Close

1 -> Ignore

2 -> Open

3 -> Open if closed, otherwise Close

Can be used in conjunction with Auto Close function: Ignore - to open the door by motion detectors and close it back after some amount of time: in case of multiple motion detectors each would try to open that would that would break logics; Open - to open on both On and Off paddle press on the remote and close after some amount of time. Button close click will still work (if button operations are not disabled). Note that Dim Down command will still begin close motion. 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Close (0) |
|  | Ignore (1) |
|  | Open (2) |
|  | Open if closed, otherwise Close (3) |


#### 4: Typical click timeout

time used to differentiate click, hold, double and triple clicks  


##### Overview 

1 - 100 -> in 10ms units


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 50 |


#### 5: Invert buttons

Invert buttons  


##### Overview 

0 -> No

1 -> Yes 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | No (0) |
|  | Yes (1) |


#### 6: Action on button press or hold

Defines which command should be sent to Association group  


##### Overview 

Defines which command should be sent to Association group on button press or hold. Scene mode will send 1 for Up event, 2 for Stop, 3 for Down.

1 -> Switch On, Off and dim using Basic Set and MultiLevel Start/Stop Changing

2 -> Send Scene 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Switch On, Off and dim using Basic Set (1) |
|  | Send Scene (2) |


#### 7: LED mode

Set LED indication mode  


##### Overview 

0 -> Disabled

1 -> Show working state

2 -> Always on

3 -> Show opened state

4 -> Indicator Command Class


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Disabled (0) |
|  | Show working state (1) |
|  | Always on (2) |
|  | Show opened state (3) |
|  | Indicator Command Class (4) |


#### 10: Full close time

Time to go from opened to closed state.  


##### Overview 

Used to estimate the current level. Note that in Permanent motion mode the reported value would a be Closed or Opened, while all Basic and  multilevel Set values (1-99, 255) would Open except 0 value that would Close. 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 60 |


#### 11: Full open time

Time to go from closed to open state  


##### Overview 

Time to go from closed to open state. This value may differ from Full close time for some blinds due to gravity. Used to estimate the current level. Note that in Permanent motion mode the reported value would a be Closed or Opened, while all Basic and Multilevel Set values (1-99, 255) would Open except 0 value that would Close


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 60 |


#### 12: Node Id of the blocking device

Id of the device which commands would not be Open/Close, but as block/unblock.  


##### Overview 

Id of the device which commands would be interpreted not as Open/Close, but as block/unblock. Usefull with door opening detector: if the door is open, block the blind not to break shades while they move.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 13: which command from blocking node to enable the protection

Which command from blocking device is closed door and hence, unprotected.  


##### Overview 

0 -> on On

1 -> on Off


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | on On (0) |
|  | on Off (1) |


#### 14: Invert open and close relays

Allow exchanging open and close relays  


##### Overview 

Allow exchanging open and close relays if blind control is wired to the motor incorrectly 

0 -> No

1 -> Yes


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | No (0) |
|  | Yes (1) |


#### 1: Click, press and hold of up/down buttons

Click, press and hold of up/down buttons


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Send Reports on blind state change

Send Reports on blind state change


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/329).
