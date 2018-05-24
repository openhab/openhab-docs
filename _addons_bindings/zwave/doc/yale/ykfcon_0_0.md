---
layout: documentation
title: YKFCON - ZWave
---

{% include base.html %}

# YKFCON Smart Living Keyfree Smart Lock
This describes the Z-Wave device *YKFCON*, manufactured by *ASSA ABLOY* with the thing type UID of ```yale_ykfcon_00_000```.

The device is in the category of Lock, defining Devices whose primary pupose is locking something.

# Overview

## Channels
The following table summarises the channels available for the YKFCON

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Door Lock | lock_door | Door | Switch | 
| Alarm | alarm_general | Door | Switch | 

### Door Lock
The ```lock_door``` channel supports the ```Switch``` item and is in the ```Door``` category.

### Alarm
The ```alarm_general``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |



## Device Configuration
The following table provides a summary of the 7 configuration parameters available in the YKFCON.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Audio Volume | Sets the volume level of the beeps and voice prompts |
| 2 | Auto Re-lock | When enabled, the unit will automatically re-lock |
| 3 | Re-lock Time | Time after unlocking that the device will lock |
| 4 | Wrong Code Entry Limit | The number of invalid tries before the lock shutdowns and sends an alarm |
| 5 | Language | Language used by the voice prompts |
| 7 | Shutdown Time | Number of times the device is locked out after the invalid retries are exceeded |
| 8 | Operating Mode | Sets if the unit operates normal, or disables keypad and Z-Wave lock/unlock |

### Parameter 1: Audio Volume
Sets the volume level of the beeps and voice prompts
1 = Silent

2 = Low

3 = High
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Silent |
| 2 | Low |
| 3 | High |

The manufacturer defined default value is 3 (High).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Auto Re-lock
When enabled, the unit will automatically re-lock
0 = Off

255 = On
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Off |
| 255 | On |

The manufacturer defined default value is 0 (Off).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Re-lock Time
Time after unlocking that the device will lock

Values in the range 5 to 255 may be set.

The manufacturer defined default value is 30.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Wrong Code Entry Limit
The number of invalid tries before the lock shutdowns and sends an alarm

Values in the range 1 to 7 may be set.

The manufacturer defined default value is 5.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Language
Language used by the voice prompts
1 = English

2 = Spanish

3 = French
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | English |
| 2 | Spanish |
| 3 | French |

The manufacturer defined default value is 1 (English).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 7: Shutdown Time
Number of times the device is locked out after the invalid retries are exceeded

Values in the range 1 to 255 may be set.

The manufacturer defined default value is 30.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Operating Mode
Sets if the unit operates normal, or disables keypad and Z-Wave lock/unlock
0 = Normal

1 = Vacation Mode (User Codes Disabled)

2 = Privacy Mode (User Codes and ZWave Codes Disabled
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Normal |
| 1 | Vacation Mode |
| 2 | Privacy Mode |

The manufacturer defined default value is 0 (Normal).

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


## Association Groups
Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The YKFCON supports 1 association group.

### Group 1: Alarm Reports
Alarm reports are sent out to all devices in the association group
This group supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_DOOR_LOCK_LOGGING_V1| |
| COMMAND_CLASS_SCHEDULE_ENTRY_LOCK_V3| |
| COMMAND_CLASS_DOOR_LOCK_V1| |
| COMMAND_CLASS_USER_CODE_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_PROTECTION_V2| |
| COMMAND_CLASS_LOCK_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_TIME_V2| |
| COMMAND_CLASS_TIME_PARAMETERS_V1| |
| COMMAND_CLASS_SECURITY_V1| |

---

Did you spot an error in the above definition or want to improve the content?
You can [edit the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/292).
