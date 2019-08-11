---
layout: documentation
title: SmartCode 888 - ZWave
---

{% include base.html %}

# SmartCode 888 Touchpad Electronic Deadbolt
This describes the Z-Wave device *SmartCode 888*, manufactured by *[Black & Decker](http://www.kwikset.com/)* with the thing type UID of ```kwikset_smartcode888_00_000```.

The device is in the category of *Lock*, defining Devices whose primary pupose is locking something.

![SmartCode 888 product image](https://www.cd-jackson.com/zwave_device_uploads/864/864_default.jpg)


The SmartCode 888 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

Kwikset®, the leader in residential security, introduces the SmartCode™ 888 Touchpad Electronic Deadbolt with Z-Wave.

  * Backlit keypad with One touch locking 
  * 30 user codes 
  * BHMA grade 3 certified 
  * Full 128-bit encryption security 
  * Drill and pick resistant backup keyway 
  * SmartKey: Re-key the lock in seconds

### Inclusion Information

 Press button “A” on the lock one time to include it in your system.

### Exclusion Information

 Press button “A” on the lock one time to include it in your system.

## Channels

The following table summarises the channels available for the SmartCode 888 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Door Lock | lock_door | lock_door | Door | Switch | 
| Alarm (access) | alarm_access | alarm_access | Door | Switch | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 
| Alarm (number) | alarm_raw | alarm_raw |  | String | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Door Lock
Lock and unlock the door.

The ```lock_door``` channel is of type ```lock_door``` and supports the ```Switch``` item and is in the ```Door``` category.
The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Locked |
| OFF | Unlocked |

### Alarm (access)
Indicates if the access control alarm is triggered.

The ```alarm_access``` channel is of type ```alarm_access``` and supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (power)
Indicates if a power alarm is triggered.

The ```alarm_power``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (number)
Provides alarm parameters as json string.

The ```alarm_raw``` channel is of type ```alarm_raw``` and supports the ```String``` item. This is a read only channel so will only be updated following state changes from the device.
This channel sets, and provides the alarm state as a JSON string. It is designed for use in rules.
### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The following table provides a summary of the 8 configuration parameters available in the SmartCode 888.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 33 | SKU | Set the first four most significant bytes of the SKU |
| 34 | SKU (Last 4) | The four least significant bytes of the SKU |
| 35 | Interior Status LED | Allows user to get/set the value for the Interior Status LED control |
| 36 | Auto-Lock Feature Control | Enables or disables automatically re-locking of door |
| 36 | Auto-Lock Feature Control Timing | The number of seconds before the Auto-Lock will occur |
| 37 | Audio Feature Control | Allows the user to get/set the audio feed back command |
| 40 | Factory Default | Reset to factory default settings |
| 47 | Motor Load Control | Allows the device to send motor load alarms |
|  | Lock Timeout | Sets the time after which the door will auto lock |

### Parameter 33: SKU

Set the first four most significant bytes of the SKU
The configuration parameters 33 and 34 are used to set and get the SKU part numbers. The SKU is made up of 8 bytes. Each parameter consists of four bytes of data. Parameter 33 contains the first four most significant bytes of the SKU, while parameter 34 contains the four least significant bytes of the SKU. When setting the SKU, it must be done in two set commands, one for each parameter. The order of programming the SKU does not matter. Most printable values are accepted for the set command. When getting the SKU, it must be done in two get commands, one for each parameter. The order of getting the SKU does not matter. Getting parameter 33 will retrieve the first four bytes of the SKU. Getting parameter 34 will retrieve the last 4 bytes of the SKU. This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 4 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_33_4``` and is of type ```INTEGER```.


### Parameter 34: SKU (Last 4)

The four least significant bytes of the SKU
The configuration parameters 33 and 34 are used to set and get the SKU part numbers. The SKU is made up of 8 bytes. Each parameter consists of four bytes of data. Parameter 33 contains the first four most significant bytes of the SKU, while parameter 34 contains the four least significant bytes of the SKU. When setting the SKU, it must be done in two set commands, one for each parameter. The order of programming the SKU does not matter. Setting parameter 33 will program the first four bytes of the SKU. Setting parameter 34 will program the last 4 bytes of the SKU. Most printable values are accepted for the set command. When getting the SKU, it must be done in two get commands, one for each parameter. The order of getting the SKU does not matter. Getting parameter 33 will retrieve the first four bytes of the SKU. Getting parameter 34 will retrieve the last 4 bytes of the SKU.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 4 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_34_4``` and is of type ```INTEGER```.


### Parameter 35: Interior Status LED

Allows user to get/set the value for the Interior Status LED control
The configuration parameter 35 is a one byte field that will allow the user to get / set the value for the Interior Status LED control. The value of 0 means that the setting is disabled; whereas the value of 1 means that the setting is enabled. Sending a set command with the default field set to 1 will cause the control to revert back to its factory default setting.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Off |
| 1 | On |

The manufacturer defined default value is ```0``` (OFF).

This parameter has the configuration ID ```config_35_1``` and is of type ```INTEGER```.


### Parameter 36: Auto-Lock Feature Control

Enables or disables automatically re-locking of door
The configuration parameter 36 uses 2 bytes that will allow the user to get / set the value for the Auto Lock feature and timing for that feature. The first byte will be the enable/disable byte. The value of 0 means that the setting is disabled; whereas the value of 1 means that the setting is enabled. The second byte will be the timing for the Auto Lock feature and should contain the number of seconds before the Auto Lock will occur. The valid values are: 0 (default – 30 seconds), 30, 60, 90, 120, 180. For example, setting the auto lock feature for 60 seconds, the two timing bytes should be: 0x003C. Sending a set command with the default field set to 1 will cause the control to revert back to its factory default settings. 
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Off |
| 1 | On |

The manufacturer defined default value is ```0``` (OFF).

This parameter has the configuration ID ```config_36_2_00000001``` and is of type ```INTEGER```.


### Parameter 36: Auto-Lock Feature Control Timing

The number of seconds before the Auto-Lock will occur
The number of seconds before the Auto-Lock will occur in increments of 30 starting and going to a max value of 180 seconds.  Only allows certain values.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 30 | Thirty seconds |
| 60 | Sixty Seconds |
| 90 | Ninety Seconds |
| 120 | One-Twenty Seconds |
| 180 | One-Eighty Seconds |

The manufacturer defined default value is ```30``` (Thirty seconds).

This parameter has the configuration ID ```config_36_2_0000FF00``` and is of type ```INTEGER```.


### Parameter 37: Audio Feature Control

Allows the user to get/set the audio feed back command
Enables or disables the audible notifications on the device
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Off |
| 1 | On |

The manufacturer defined default value is ```1``` (ON).

This parameter has the configuration ID ```config_37_1``` and is of type ```INTEGER```.


### Parameter 40: Factory Default

Reset to factory default settings
Reset factory default settings, except for the anti-theft setting.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Normal |
| 1 | Factory Default |

The manufacturer defined default value is ```0``` (Normal).

This parameter has the configuration ID ```config_40_1``` and is of type ```INTEGER```.


### Parameter 47: Motor Load Control

Allows the device to send motor load alarms
The configuration parameter 47 uses 1 byte that will allow the user to get / set the value to enable or disable the motor load alarm. Setting this byte to 0 will disable the alarm, whereas setting this byte to 1 will enable the alarm. If a motor load alarm has been activated and the alarm has been enabled, the alarm will be sent via the Power Management group in the Notification Command Class as a Load Error (0x09). 
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Off |
| 1 | On |

The manufacturer defined default value is ```0``` (OFF).

This parameter has the configuration ID ```config_47_1``` and is of type ```INTEGER```.

### Lock Timeout

Sets the time after which the door will auto lock.

This parameter has the configuration ID ```doorlock_timeout``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The SmartCode 888 supports 2 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Group 1 is assigned to the Lifeline group and can only support 1 node. The Lifeline group supports the following unsolicited messages:                                

<table>
  <tr>
    <td>
      <strong>Command Class</strong>
    </td>
    
    <td>
      <strong>Command</strong>
    </td>
  </tr>
  
  <tr>
    <td>
      Command Class Battery
    </td>
    
    <td>
      Battery Report
    </td>
  </tr>
  
  <tr>
    <td>
      Command Class Door Lock   
    </td>
    
    <td>
      Door Lock Operation Report
    </td>
  </tr>
  
  <tr>
    <td>
      Command Class Notification
    </td>
    
    <td>
      Notification Report
    </td>
  </tr>
  
  <tr>
    <td>
      Command Class Device Reset Locally 
    </td>
    
    <td>
      Device Reset Locally Notification
    </td>
  </tr>
</table>

Association group 1 supports 1 node.

### Group 2: Doorlock notify report

Provides all Notificaton Reports
Association group 2 is identified as the “Doorlock notify report” group. It allows at most 5 other nodes to be associated with the lock and will provide all Notification Reports, via the Command Class Notification, generated by the lock. 

Association group 2 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_DOOR_LOCK_LOGGING_V1| |
| COMMAND_CLASS_SCHEDULE_ENTRY_LOCK_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_DOOR_LOCK_V1| |
| COMMAND_CLASS_USER_CODE_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V4| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_PROTECTION_V1| |
| COMMAND_CLASS_LOCK_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_TIME_PARAMETERS_V1| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Installation Guide and Manual](https://www.cd-jackson.com/zwave_device_uploads/864/Install-Guide-and-Manual-888-ENG.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/864).
