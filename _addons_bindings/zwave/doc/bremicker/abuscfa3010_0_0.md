---
layout: documentation
title: CFA3010 - ZWave
---

{% include base.html %}

# CFA3010 Z-Wave controlled door lock
This describes the Z-Wave device *CFA3010*, manufactured by *ABUS August Bremicker Söhne KG* with the thing type UID of ```bremicker_abuscfa3010_00_000```.

The device is in the category of *Lock*, defining Devices whose primary pupose is locking something.

![CFA3010 product image](https://www.cd-jackson.com/zwave_device_uploads/1200/1200_default.jpg)


The CFA3010 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

The ABUS Z-Wave HomeTec CFA3010 wireless door lock actuator is a system designed for retrofitting to doors that open inwards to provide motorized locking and unlocking functions. The door can be electronically operated using local buttons and any Z-Wave device capable to control door locks. For the wireless door lock actuator to work, the cylinder must project 7-12 mm on the inside of the door (plus the thickness of the fitting or collar). Because the actuator operates with a key permanently inserted in the lock, the cylinder must have an emergency feature where the door can be opened with a key from the outside even when another key is inserted on the inside. In addition, the door lock must be a profile cylinder compliant with DIN 18252. This device is security enabled Z-Wave Plus product that is able to use encrypted Z-Wave Plus messages to communicate to other security enabled Z-Wave Plus products. This device must be used in conjunction with a Security Enabled Z-Wave Controller in order to fully utilize all implemented functions.

### Inclusion Information

In order to include (add) a Z-Wave device to a network it **must be in factory default state.** Please make sure to reset the device into factory default. You can do this by performing an Exclusion operation as described below in the manual. Every Z-Wave controller is able to perform this operation however it is recommended to use the primary controller of the previous network to make sure the very device is excluded properly from this network.  **Reset to factory defaul** This device also allows to be reset without any involvement of a Z-Wave controller. This procedure should only be used when the primary controller is inoperable.

  * Enable management mode by holding down **F1** and **F2** for 3 seconds. Green left LED will light up to confirm management mode.
  * Move in this menu by pushing **F1** or **F2** Arrows. The left LED will change its color to indicate different menu items. left LED = green: Learn Mode, left LED = red: Reset Mode
  * Enter the menu, where left LED is RED, by pushing **F1** or **F2**.
  * Hit Enter (door close button). The right LED will change its color to indicate different reset options.  
    right LED = green: Reset only Lock,  
    right LED = yellow: Reset only Z-Wave,   
    right LED = red: Reset Lock and Z-Wave
  * Using the keys **F1** and **F2** you can change the setting. Change the setting to be RED (Reset Lock and Z-Wave)
  * Push the Enter-button for 3 seconds until both LEDs are flashing.
  * Push the Enter-button again for 3 seconds to confirm the reset to factory default.

All settings are deleted. Configuration parameters are NOT reset to default values. The user must explicitly reset them. **Enable Fallback to S0 Security**  
  
The device will not allow legacy security S0 on default. If you like to operate the device with a controller not supporting S2 security you need to enable fallback into S0.

  * Enable management mode by holding down **F1** and **F2** for 3 seconds. Green left LED will light up to confirm management mode.
  * Again pushing **F1** and **F2** for 3 seconds to enter Menu mode. Green left LED will blink to confirm.
  * Move in this menu by pushing F1 or F2 Arrows. The left LED will change its color to indicate different menu items. left LED = yellow: Speed settings, left LED = green: Power settings,   
    left LED = red: Z-Wave Security
  * Enter the menu, where left LED blinks RED, by pushing **F1** or **F2** Arrows.
  * Hit "Enter" (door close button). Now you will see the actual status of S0 fallback: right LED = red: S2+S0, right LED = green: S2 only
  * Using the keys **F1** and **F2** you can change the setting. Change the setting to be RED (S2 + S0)
  * Confirm selection with "Enter" (door close button)
  * Leave the menu by clicking "door open". Leave the management mode by clicking "door open" again

**Inclusion**

  * Set Z-Wave controller to inclusion mode
  * Enable management mode by holding down **F1** and **F2** for 3 seconds. Green left LED will light up to confirm management mode.
  * Move in this menu by pushing **F1** or **F2**. The left LED will change its color to indicate different menu items.  
    left LED = green: Learn Mode,   
    left LED = red: Reset Mode
  * Enter the menu, where the left LED is GREEN, by pushing F1 or F2 Arrows.
  * Hit "Enter" (door close button).
  * Both LED will flash GREEN indicating readiness to include
  * After successful inclusion left LED is GREEN, right LED is off
  * Hit "Return" (door unlock button)

Clicking the "unlock button", when Learn Mode is started, will terminate the inclusion mode and also the management mode.

### Exclusion Information

**Exclusion**

  * Set Z-Wave controller to exclusion mode
  * Enable management mode by holding down **F1** and **F2** for 3 seconds. Green left LED will light up to confirm management mode.
  * Move in this menu by pushing **F1** or **F2**. The left LED will change its color to indicate different menu items.  
    left LED = green: Learn Mode,   
    left LED = red: Reset Mode
  * Enter the menu, where the left LED is GREEN, by pushing F1 or F2 Arrows.
  * Hit "Enter" (door close button).
  * Both LED will flash GREEN indicating readiness to exclude
  * After successful exclusion left LED is GREEN, right LED is off
  * Hit "Return" (door unlock button)

Clicking the "unlock button", when Learn Mode is started, will terminate the inclusion mode and also the management mode.

### General Usage Information

This door lock can be operated by a central Z-Wave enabled controller (using e.g. mobile phone), a dedicated Z-Wave remote control and from local buttons. Once installed, the ABUS Z-Wave HomeTec CFA3010 can turn the door lock to open and close. In parallel legacy operation using a key from the outside remains possible. The local buttons "door open" and "door close" accessible from the inside allows convenient locking and unlocking the key. It is possible to just close the door and really lock it up moving the deadbolt into the "close" position.

## Channels

The following table summarises the channels available for the CFA3010 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Door Lock | lock_door | lock_door | Door | Switch | 
| Alarm (access) | alarm_access | alarm_access | Door | Switch | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 
| Alarm (system) | alarm_system | alarm_system |  | Switch | 
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

### Alarm (system)
Indicates if a system alarm is triggered.

The ```alarm_system``` channel is of type ```alarm_system``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The following table provides a summary of the 11 configuration parameters available in the CFA3010.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Latch Hold Time | This parameter defines how long the latch is hold open. |
| 2 | Latch Torque | This parameter defines the torque of the latch. |
| 3 | Acoustic Feedback  | This parameter defines Acoustic Feedback signals. |
| 4 | Travel Time | This parameter defines the travel path of the Lock. |
| 5 | Touch Panel Settings | This parameter defines Touch Panel settings. |
| 6 | Motor Force | This parameter defines the motor force, when turning the lock. |
| 153 | Driving Cycles Interlocked | Counter, how often in the direction of "Locked" navigated was. |
| 250 | Lock Status | This parameter reports the status of the lock. |
| 251 | Drive Cycles Trap | Counter, how often the trap is activated was. |
| 252 | Driving Cycles Unlocked | Counter, how often in the direction of Unlocked navigated was. |
| 254 | ABUS Firmware Version | Display of ABUS Firmware version, e.g. 1.05. |
|  | Lock Timeout | Sets the time after which the door will auto lock |

### Parameter 1: Latch Hold Time

This parameter defines how long the latch is hold open.

Values in the range 1 to 20 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Latch Torque

This parameter defines the torque of the latch.
Setting of  current torque  during travel of  latch:  
1 = high (max.)  
2 = medium (standard/default)  
3 = low (min.)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Torque of the latch is high |
| 2 | Torque of the latch is medium |
| 3 | Torque of the latch is low |

The manufacturer defined default value is ```2``` (Torque of the latch is medium).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Acoustic Feedback 

This parameter defines Acoustic Feedback signals.
Setting of  acoustic signals to the following values:  
1 = all signals inactive  
2 = signal only at start of  travel  
3 = signal when latch position is reached  
4 = signal when  locked position is reached  
5 = signal when  end position is reached  
Button, low-battery and error/alarm signals cannot be changed.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Acoustic signal is inactive |
| 2 | Acoustic signal only at beginning of ock travel |
| 3 | Acoustic signal when reaching position of event |
| 4 | Acoustic signal when reaching position "Locked" |
| 5 | Acoustic signal when reaching each end position |

The manufacturer defined default value is ```3``` (Acoustic signal when reaching position of event).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Travel Time

This parameter defines the travel path of the Lock.
Current setting of travel path  at drive that is  intended and/ or allowed to  be travelled:  
1 = Automatic/ normal  (travel  according to  teach-in run parameters)  
2 = in case of multiple locking only  one locking action  
3 = motor travel from window tilt position is allowed (ABUS FCA3000)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Automatic/Normal |
| 2 | Multiple turns for one Open/Close action |
| 3 | Travel from Tilted Position is turned on (CFA3000) |

The manufacturer defined default value is ```1``` (Automatic/Normal).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Touch Panel Settings

This parameter defines Touch Panel settings.
Current setting  of touch field  function:  
1 = all active  
2 = only operating buttons active  
3 = all inactive  
4 = only latch pull inactive
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Touch Panel is active |
| 2 | Only Touch Panel Control Buttons are active |
| 3 | Touch Panel is inactive |
| 4 | Touch Panel Trap is inactive |

The manufacturer defined default value is ```1``` (Touch Panel is active).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Motor Force

This parameter defines the motor force, when turning the lock.
Setting of current torque  during travel of  bolt:  
1 = Automatic/normal (travel  according to  teach-in run parameters)  
2 = maximum
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Automatic/Normal force |
| 2 | Maximum force |

The manufacturer defined default value is ```1``` (Automatic/Normal force).

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 153: Driving Cycles Interlocked

Counter, how often in the direction of "Locked" navigated was.
Counter, how  often travel in „Locked“ direction.
Values in the range 0 to 16700000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_153_4``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 250: Lock Status

This parameter reports the status of the lock.
Status of lock:  
0 = unknown  
1 = open  
2 = unlocked  
3 = 1 x locked  
4 = 2 x locked  
5 = locked (end stop)  
6 = multiple  locking
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | unknown |
| 1 | Open |
| 2 | Unlocked |
| 3 | 1 x locked |
| 4 | 2 x locked |
| 5 | locked (end stop) |
| 6 | multiple interlocked |

The manufacturer defined default value is ```0``` (unknown).

This parameter has the configuration ID ```config_250_1``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 251: Drive Cycles Trap

Counter, how often the trap is activated was.
Counter, how often latch was actuated.
Values in the range 0 to 16700000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_251_4``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 252: Driving Cycles Unlocked

Counter, how often in the direction of Unlocked navigated was.
Counter, how often travel in „Unlocked“ direction.
Values in the range 0 to 16700000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_252_4``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 254: ABUS Firmware Version

Display of ABUS Firmware version, e.g. 1.05.
Display ABUS  firmware version, e.g. 1.05.
Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_254_2``` and is of type ```INTEGER```.
This is a read only parameter.

### Lock Timeout

Sets the time after which the door will auto lock.

This parameter has the configuration ID ```doorlock_timeout``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The CFA3010 supports 1 association group.

### Group 1: Assossiation Groups

Lifeline
Z-Wave devices control other Z-Wave devices. The relationship between one device controlling another device is called association. In order to control a different device, the controlling device needs to maintain a list of devices that will receive controlling commands. These lists are called association groups and they are always related to certain events (e.g. button pressed, sensor triggers, ...). In case the event happens all devices stored in the respective association group will receive the same wireless command wireless command, typically a 'Basic Set' Command.

Association group 1 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_DOOR_LOCK_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [ABUS Z-Wave HomeTec CFA3010 Manual (DE, GB, FR, NL, IT, ES)](https://www.cd-jackson.com/zwave_device_uploads/1200/Handbuch-ABUS-HomeTec-CFA3010-Z-Wave-T--rschlossantrieb.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1200).
