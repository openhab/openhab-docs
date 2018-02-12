
# Danalock V3-BTZE Z-Wave Controlled door lock with Bluetooth Smart

This describes the Z-Wave device **Danalock V3-BTZE**, manufactured by **Poly-control** with the thing type UID of ```polycontrol_btze_01_002```. 

Z-Wave Controlled door lock with Bluetooth Smart  


# Overview #

Danalock supports:   
\- S0/S2 Z-Wave Security   
\- Bluetooth Smart   
\- Twist Assist   
\- Auto Lock   
\- Hold And Release   
\- Back To Back

  


## Inclusion Information ##

To add or include the Danalock into a Z-Wave network

1.  Set the controller in inclusion mode
2.  Push the switch once.
3.  Wait 5 seconds. 

  


## Exclusion Information ##

To remove or exclude the Danalock into a Z-Wave network

1.  Set the controller in exclusion mode
2.  Push the switch once.
3.  Wait 5 seconds. 

## Channels
The following table summarises the channels available for the Danalock V3-BTZE Z-Wave Controlled door lock with Bluetooth Smart.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Door Lock | lock_door | lock_door | Door | Switch |
|  | battery-level | system.battery-level |  |  |




### Device Configuration
The following table provides a summary of the configuration parameters available in the Danalock V3-BTZE Z-Wave Controlled door lock with Bluetooth Smart.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Twin Assist | Helps you to lock and unlock your door lock. |
| 2: Hold and Release | After a unlock operation the lock holds the lock, so the door can be opened |
| 3: Block to block | The lock will run the motor until it hits resistance. |
| 4: BLE Temporary Allowed | The BLE is enabled for a number of seconds. |
| 5: BLE Always Allowed | BLE Always Allowed |
| 6: Autolock | Lock after an unlock.Value is delay in sec before lock is locked again. |
| 1: Lifeline | Z-Wave Plus Lifeline |




#### 1: Twin Assist

Helps you to lock and unlock your door lock.  


# Overview #

0 -> disabled

1 -> enabled


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | disabled (0) |
|  | enabled (1) |






#### 2: Hold and Release

After a unlock operation the lock holds the lock, so the door can be opened  


# Overview #

0 -> disabled

1 to 2147483647 -> enabled no. of seconds


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_4 |
| Data Type        | INTEGER || Default Value | 0 |
| Options |  (0) |






#### 3: Block to block

The lock will run the motor until it hits resistance.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disabled (0) |
|  | Enabled (1) |






#### 4: BLE Temporary Allowed

The BLE is enabled for a number of seconds.  


# Overview #

0 -> Disabled

1 to 2147483647 -> enabled no. of seconds


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_4 |
| Data Type        | INTEGER |
| Range | 0 to 2147483647 |
| Default Value | 0 |






#### 5: BLE Always Allowed

BLE Always Allowed  


# Overview #

0 -> BLE Always disabled

1 -> BLE Always enabled


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | BLE Always disabled (0) |
|  | BLE Always enabled (1) |






#### 6: Autolock

Lock after an unlock.Value is delay in sec before lock is locked again.  


# Overview #

0 -> disabled

1 to 2147483647 -> enabled no. of seconds


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_4 |
| Data Type        | INTEGER |
| Range | 0 to 2147483647 |
| Default Value | 0 |






#### 1: Lifeline

Z-Wave Plus Lifeline  


# Overview #

Z-Wave Plus Lifeline • Device Reset Locally: triggered upon reset. • Battery/notification: triggered upon low battery. • Door Lock operation report: triggered upon a change in door lock • Notification: triggered upon a change in door lock


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |






---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/708).

