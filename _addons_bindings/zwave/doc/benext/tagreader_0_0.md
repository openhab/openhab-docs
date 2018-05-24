---
layout: documentation
title: Tag Reader - ZWave
---

{% include base.html %}

# Tag Reader Tag Reader
This describes the Z-Wave device *Tag Reader*, manufactured by *BeNext* with the thing type UID of ```benext_tagreader_00_000```.

# Overview

## Channels
The following table summarises the channels available for the Tag Reader

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 
| Alarm (burglar) | alarm_burglar | Door | Switch | 
| Alarm (access) | notification_access_control |  | Number | 

### Switch
The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Alarm (burglar)
The ```alarm_burglar``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |

### Alarm (access)
The ```notification_access_control``` channel supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Number``` item type -:

| Value | Label     |
|-------|-----------|
| 0 | Previous Events cleared |
| 1 | Manual Lock Operation |
| 2 | Manual Unlock Operation |
| 3 | RF Lock Operation |
| 4 | RF Unlock Operation |
| 5 | Keypad Lock Operation |
| 6 | Keypad Unlock Operation |
| 7 | Manual Not Fully Locked Operation |
| 8 | RF Not Fully Locked Operation |
| 9 | Auto Lock Locked Operation |
| 10 | Auto Lock Not Fully Operation |
| 11 | LockJammed |
| 12 | All user codes deleted |
| 13 | Single user code deleted |
| 14 | New user code added |
| 15 | New user code not added due to duplicate code |
| 16 | Keypad temporary disabled |
| 17 | Keypad busy |
| 18 | New Program code Entered- Unique code for lock configuration |
| 19 | Manually Enter user Access code exceeds code limit |
| 20 | Unlock by RF with invalid user code |
| 21 | Locked by RF with invalid user code |
| 22 | Window/Door is open |
| 23 | Window/Door is closed |
| 64 | Barrier performing initialization process |
| 65 | Barrier operation (Open / Close) force has been exceeded |
| 66 | Barrier motor has exceeded manufacturer's operational time limit |
| 67 | Barrier operation has exceeded physical mechanical limits |
| 68 | Barrier unable to perform requested operation due to UL requirements |
| 69 | Barrier Unattended operation has been disabled per UL requirements |
| 70 | Barrier failed to perform Requested operation, device malfunction |
| 71 | Barrier Vacation Mode |
| 72 | Barrier Safety Beam Obstacle |
| 73 | Barrier Sensor Not Detected / Supervisory Error |
| 74 | Barrier Sensor Low Battery Warning |
| 75 | Barrier detected short in WallStation wires |
| 76 | Barrier associated with non-Z-wave remote control |



## Device Configuration
The following table provides a summary of the 6 configuration parameters available in the Tag Reader.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Set to Default | Set all configuration values to default values (factory settings) |
| 2 | Feedback time | the time the beep goes to off |
| 3 | Feedback time-out | waiting for the wake-up-no-more command |
| 4 | feedback beeps per second | Amount of beeps a second |
| 5 | Mode  | To configure mode |
| 6 | RFID circuit start-up time | The time the RFID will be started after pressing "home" or "away" |

### Parameter 1: Set to Default
Set all configuration values to default values (factory settings)
If the Value is set to 0xFF (255) this device will return to factory settings.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is 0.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Feedback time
the time the beep goes to off
0x00 = Off, 0xFF = endless
Values in the range 0 to 255 may be set.

The manufacturer defined default value is 15.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Feedback time-out
waiting for the wake-up-no-more command
Too configure the time-out, waiting on the wakeup\_no\_more\_information command before the error sound starts automatically. The error sound is set to 8 short beeps.

0x00 = off
Values in the range 0 to 255 may be set.

The manufacturer defined default value is 0.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: feedback beeps per second
Amount of beeps a second
To set the amount of beeps per second, every beep is around 10ms.
Values in the range 0 to 5 may be set.

The manufacturer defined default value is 2.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Mode 
To configure mode
Mode 1 = normal working mode

Mode 3 = z-wave chip is always on to be asked for information, for example version or manufacturer ID.

Any other value will be reported after a GET, but will be seen as a mode 1.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is 1.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: RFID circuit start-up time
The time the RFID will be started after pressing "home" or "away"
0x64 (100 \* 10 ms = 1 s)

The time (\*10 ms) the RFID circuit waits to start after "home" or "away" has been pressed.

the time \*10 miliseconds, minimum = 0 seconds, max = 2,55 seconds. If the value is not in the allowed size the frame will be ignored.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is 100.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


## Association Groups
Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Tag Reader supports 1 association group.

### Group 1: Association group 1
Link devices to the tag reader
This group supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_USER_CODE_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V2| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_LOCK_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

---

Did you spot an error in the above definition or want to improve the content?
You can [edit the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/444).
