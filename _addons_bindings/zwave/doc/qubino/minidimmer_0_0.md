---
layout: documentation
title: ZMNHHD - ZWave
---

{% include base.html %}

# ZMNHHD Mini Dimmer
This describes the Z-Wave device *ZMNHHD*, manufactured by *[Goap](http://www.qubino.com/)* with the thing type UID of ```qubino_minidimmer_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![ZMNHHD product image](https://www.cd-jackson.com/zwave_device_uploads/1100/1100_default.png)


The ZMNHHD supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Mini Dimmer is a MOSFET-switching light device that also supports control of low-voltage halogen lamps with electronic transformers, dimmable compact fluorescent lights, and dimmable LED bulbs. It measures power consumption of the connected device. It supports push-button/momentary switches (default) and toggle switches. It can work with or without the neutral line. Qubino Mini Dimmer allows the easiest and quickest installation. It is designed to be mounted inside a “flush mounting box”, hidden behind a traditional wall switch. It acts as repeater in order to improve range and stability of Z-Wave network.

### Inclusion Information

Inclusion

AUTOMATICALLY ADDING THE DEVICE TO A Z-WAVE NETWORK (AUTO INCLUSION)

  1. Enable add/remove mode on your Z-Wave gateway (hub)
  2. Automatic selection of secure/unsecure inclusion.
  3. The device can be automatically added to a Z-Wave network during the first 2 minutes
  4. Connect the device to the power supply
  5. Auto-inclusion will be initiated within 5 seconds of connection to the power supply and the device will automatically enrol in your network. 

(when the device is excluded and connected to the power supply it automatically eneters the LEARN MODE state.)

**NOTE: LEARN MODE state allows the device to receive network infromation from the controller**

**NOTE: Please wait at least 30 seconds between each inclusion and exclusion.**

MANUALLY ADDING THE DEVICE TO A Z-WAVE NETWORK (MANUAL INCLUSION)

  1. Connect the device to the power supply
  2. Enable add/remove mode on your Z-Wave gateway (hub)
  3. Toggle the switch connected to the I1 terminal 3 times within 3 seconds (this procedure put the device in LEARN MODE)

OR

Press and hold the S (Service) button between 2 and 6 seconds if connected to 24-30VDC (this procedure put the device in LEARN MODE)

4. A new device will appear on your dashboard

**NOTE: LEARN MODE state allows the device to receive network infromation from the conttoller **

**NOTE: Please wait at least 30 seconds between each inclusion and exclusion.**

Mini Dimmer supports the latest Security 2 feature. When adding the Mini Dimmer to a Z-Wave network with a controller supporting Security 2 (S2), the PIN code of the Z-Wave Device Specific Key (DSK) is required. The unique DSK code is printed on the product label and a copy is inserted in the packaging, which must not be lost. Do not remove the DSK from the product. As a backup measure, use the label in the packaging. The first five digits of the key are highlighted or underlined to help the user identify the PIN code portion of the DSK text.

### Exclusion Information

Exclusion

REMOVAL FROM A Z-WAVE NETWORK (Z-WAVE EXCLUSION)

  1. Connect the device to the power supply
  2. Make sure the device is within direct range of your Z-Wave gateway (hub) or use a hand-held Z-Wave remote to perform exclusion
  3. Enable add/remove mode on your Z-Wave gateway (hub)
  4. Toggle the switch connected to the I1 terminal 3 times within 3 seconds (this procedure put the device in LEARN MODE)

OR

Press and hold the S (Service) button between 2 and 6 seconds if connected to 24-30VDC (this procedure put the device in LEARN MODE)

  1. The device will be removed from your network, but any custom configuration parameters will not be erased

**NOTE: LEARN MODE state allows the device to receive network infromation from the conttoller **

**NOTE: Please wait at least 30 seconds between each inclusion and exclusion.**

### General Usage Information

**FACTORY RESET**

  1. Connect the device to the power supply.
  2. Within the first minute (60seconds) the device is connected to the power supply, toggle the switch connected to the I1 terminal 5 times within 3 seconds.

OR

Press and hold the S (Service) button for at least 6 seconds if connected to 24-30VDC.

**NOTE:** By resetting the device, all custom parameters previously set on the device will return to their default values, and the node ID will be deleted. Use this reset procedure only when the main gateway (hub) is missing or otherwise inoperable.

**NOTE:** the reset with switch connected to I1 is possible only in the first minute after the device is connected to the power.

**NOTE:** after the reset is successfully done the autocalibration will trigger and the green LED will start blinking.

**LED SIGNALIZATION FOR INCLUSION/EXCLUSION**

LED (green)

  * LED is blinking (1 sec ON, 1 sec OFF) = module is excluded
  * LED is ON = module is included

LED (red)

  * LED is OFF = normal operation
  * LED is ON = overload
  * LED is blinking (1 sec ON, 1 sec OFF) = over temperature

LED (blue)

  * LED is OFF = normal operation
  * LED is blinking (1 sec ON, 1 sec OFF) = calibration in progress
  * LED is ON = calibration failed

**NOTE:** After each power cycle all 3 LEDs will blink once before resuming normal operation.

## Channels

The following table summarises the channels available for the ZMNHHD -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (power)
Indicates if a power alarm is triggered.

The ```alarm_power``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 19 configuration parameters available in the ZMNHHD.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | In-wall Switch Type for Load to control I1 | In-wall Switch Type for Load to control I1 |
| 5 | Working mode | Working mode |
| 11 | Turn Load 1 Off Automatically with Timer | Turn Load 1 Off Automatically with Timer |
| 12 | Turn Load 1 On Automatically with Timer | Turn Load 1 On Automatically with Timer |
| 21 | Enable/Disable the Double click function | Enable/Disable the Double click function |
| 30 | Restore on/off status for load after power failure | Restore on/off status for load after power failure |
| 40 | Power Consumption Threshold | Power Consumption Threshold |
| 42 | Power Consumption Threshold (time) | Power Consumption Threshold (time) |
| 60 | Minimum dimming value | Minimum dimming value |
| 61 | Maximum dimming value | Maximum dimming value |
| 65 | Dimming time when key pressed | Dimming time when key pressed |
| 66 | Dimming time when key hold | Dimming time when key hold |
| 67 | Ignore start level | Ignore start level |
| 68 | Dimming duration | Dimming duration |
| 70 | Overload safety switch | Overload safety switch |
| 71 |  Calibration trigger | Calibration trigger |
| 72 | Calibration status (read only) | Calibration status (read only) |
| 73 | Alarm/Notification events | Alarm/Notification events |
| 74 | Alarm/Notification time interval | Alarm/Notification time interval |

### Parameter 1: In-wall Switch Type for Load to control I1

In-wall Switch Type for Load to control I1
With this parameter, you can select between push-button (momentary) and on/off toggle switch types. 

Values: 

• default value 0  
• 0 - push-button (momentary)  
• 1 - on/off toggle switch
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | push-button (momentary) |
| 1 | on/off toggle switch |

The manufacturer defined default value is ```0``` (push-button (momentary)).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 5: Working mode

Working mode
With this parameter, you can change the device presentation on the user interface.

Values:  
• default value 0  
• 0 - Dimmer mode  
• 1 - Switch mode (works only in 3 way wiring-connection with neutral line)

**NOTE: After parameter change, first exclude the device (without setting parameters to default value) then wait at least 30s before reinclusion.**
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Dimmer mode |
| 1 | Switch mode |

The manufacturer defined default value is ```0``` (Dimmer mode).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 11: Turn Load 1 Off Automatically with Timer

Turn Load 1 Off Automatically with Timer
If Load is ON, you can schedule it to turn OFF automatically after a period of time defined in this parameter. The timer is reset to zero each time the device receives an ON or OFF command, either remotely (from the gateway (hub) or associated device) or locally from the switch.  


Values:  
• default value 0  
• 0 - Auto OFF Disabled  
• 1 - 32536 = 1 - 32536 seconds - Auto OFF timer enabled for a given amount of seconds
Values in the range 0 to 32536 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


### Parameter 12: Turn Load 1 On Automatically with Timer

Turn Load 1 On Automatically with Timer
If Load is OFF, you can schedule it to turn ON automatically after a period of time defined in this parameter. The timer is reset to zero each time the device receives an OFF or ON command, either remotely (from the gateway (hub) or associated device) or locally from the switch.

  
Values:  
• default value 0  
• 0 - Auto ON Disabled  
• 1 - 32536 = 1 - 32536 seconds - Auto ON timer enabled for a given amount of seconds
Values in the range 0 to 32536 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 21: Enable/Disable the Double click function

Enable/Disable the Double click function
If the Double click function is enabled, a fast double click on the push-button will set the dimming level to the maximum dimming value.

  
Values:  
• default value 0  
• 0 - double click disabled  
• 1 - double click enabled
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Double click disabled |
| 1 | Double click enabled |

The manufacturer defined default value is ```0``` (Double click disabled).

This parameter has the configuration ID ```config_21_1``` and is of type ```INTEGER```.


### Parameter 30: Restore on/off status for load after power failure

Restore on/off status for load after power failure
This parameter determines if on/off status is saved and restored for the load after power failure.

  
Values:  
• default value 0  
• 0 - Device saves last on/off status and restores it after a power failure.  
• 1 - Device does not save on/off status and does not restore it after a power failure, it remains off.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Save last on/off status |
| 1 | Don't save last on/off status |

The manufacturer defined default value is ```0``` (Save last on/off status).

This parameter has the configuration ID ```config_30_1``` and is of type ```INTEGER```.


### Parameter 40: Power Consumption Threshold

Power Consumption Threshold
Watt Power Consumption Reporting Threshold for Load  

Choose by how much the power consumption needs to increase or decrease to be reported. Values correspond to percentages so if 10 is set (by default), the device will report any power consumption changes of 10% or more compared to the last reading.

  
Values (size is 1 byte dec):  
• default value 10  
• 0 - Power consumption reporting disabled  
• 1 - 100 = 1% - 100%

Power consumption reporting enabled. New value is reported only when Wattage in real time changes by more than the percentage value set in this parameter compared to the previous Wattage reading, starting at 1% (the lowest value possible).

**NOTE: The power consumption needs to increase or decrease by at least 2 Watts to be reported, regardless of percentage set in this parameter.**
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_40_1``` and is of type ```INTEGER```.


### Parameter 42: Power Consumption Threshold (time)

Power Consumption Threshold (time)
Watt Power Consumption Reporting Time Threshold for Load  

Set value refers to the time interval with which power consumption in Watts is reported (0 – 32767 seconds). If 300 is entered, energy consumption reports will be sent to the gateway (hub) every 300 seconds (or 5 minutes) if there was a change compared from the last report.

  
Values:  
• default value 0  
• 0 - Power consumption reporting on time interval disabled  
• 30 - 32767= 30 - 32767seconds. Power consumption reporting enabled. Report is sent according to time interval (value) set here.

  
**NOTE: Values from 1 to 29 are ignored by device due to standard recommendation.**  
**NOTE: The report will be send only if there was a change compared to the last report**
Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_42_2``` and is of type ```INTEGER```.


### Parameter 60: Minimum dimming value

Minimum dimming value
The value set in this parameter determines the minimum dimming value (the lowest value which can be set on the device, when, for example, dimming lights with wall switch or slider in the GUI (Gateway - hub)).

Values:  
• default value 0 = 0% (minimum dimming value)  
• 0- 98 = 0% - 98%, step is 1%. Minimum dimming value is set by entering a value.

**NOTE: The minimum level may not be higher than the maximum level!**
Values in the range 0 to 98 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_60_1``` and is of type ```INTEGER```.


### Parameter 61: Maximum dimming value

Maximum dimming value
The value set in this parameter determines the maximum dimming value (the highest value which can be set on the device, when, for example, dimming lights with wall switch or slider in the GUI (Gateway - hub))

Values:  
• default value 99 = 99% (Maximum dimming value)  
• 1- 99 = 1% - 99%, step is 1%. Maximum dimming value is set by entering a value.

**NOTE: The maximum level may not be lower than the minimum level!**
Values in the range 1 to 99 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_61_1``` and is of type ```INTEGER```.


### Parameter 65: Dimming time when key pressed

Dimming time when key pressed
Choose the time during which the device will move between the min. and max. dimming values by a short press of the push-button I1.  


Values:  
• default value 1 = 1s  
• 1 - 127 = 1 seconds- 127 seconds, step is 1 second
Values in the range 1 to 127 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_65_1``` and is of type ```INTEGER```.


### Parameter 66: Dimming time when key hold

Dimming time when key hold
Choose the time during which the Dimmer will move between the min. and max. dimming values during a continuous press of the push-button I1, by an associated device or through the UI controls (BasicSet, SwitchMultilevelSet).  


Values:  
• default value 3 = 3s  
• 1-127 = 1 second – 127 seconds  
• 128 – 253 = 1 minute – 126 minutes
Values in the range 1 to 127 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_66_2``` and is of type ```INTEGER```.


### Parameter 67: Ignore start level

Ignore start level
Choose whether the device should use (or disregard) the start dimming level value. If the device is configured to use the start level, it should start the dimming process from the currently set dimming level. This parameter is used with association group 3.

Values:  
• default value 0  
• 0 – use the start level value  
• 1 - ignore the start level value

**NOTE: Parameter is valid only in Dimmer mode. In Switch mode the parameter has no effect.**
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | use the start level value |
| 1 | ignore the start level value |

The manufacturer defined default value is ```0``` (use the start level value).

This parameter has the configuration ID ```config_67_1``` and is of type ```INTEGER```.


### Parameter 68: Dimming duration

Dimming duration
Choose the time during which the device will transition from the current value to the new target value. This parameter applies to the association group 3.

  
Values:  
• default value 0 (dimming duration according to parameter 66)  
• 1 - 127 (from 1 to 127 seconds)

**NOTE: Parameter is valid only in Dimmer mode. In Switch mode the parameter has no effect.**
Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_68_1``` and is of type ```INTEGER```.


### Parameter 70: Overload safety switch

Overload safety switch
The function allows for turning off the controlled device in case of exceeding the defined power for more than 5s. Controlled device can be turned back on by input I1 or sending a control frame.

  
Values:  
• default value 200  
• 1 – 200 = 1 W – 200W  
• 0 = function not active

**NOTE: This functionality is not an overload safety protection, please check the technical specifications chapter for more details.**

In case of overload the following message will be send towards the controller:  
• COMMAND\_CLASS\_NOTIFICATION_V5  
• The Alarm V1 type field set to 0x00  
• Notification Type 0x08 and 0x08 (Overload detected)
Values in the range 1 to 200 may be set.

The manufacturer defined default value is ```200```.

This parameter has the configuration ID ```config_70_2``` and is of type ```INTEGER```.


### Parameter 71:  Calibration trigger

Calibration trigger
Choose when will be the calibration procedure triggered.

  
Values:  
• default value 0 - calibration done after power cycle if module is excluded  
• 1 – calibration done after power cycle regardless of inclusion status  
• 2 – force calibration. Calibration will start immediately
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | calibration after exclusion |
| 1 | calibration after power cycle |
| 2 | force calibration |

The manufacturer defined default value is ```1``` (calibration after power cycle).

This parameter has the configuration ID ```config_71_1``` and is of type ```INTEGER```.


### Parameter 72: Calibration status (read only)

Calibration status (read only)
Whit this parameter you can check the calibration status.

  
Values:  
• default value 2 – calibration failed  
• 1 – calibration was successful  
• 2 – calibration failed
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | calibration was successful |
| 2 | calibration failed |

The manufacturer defined default value is ```2``` (calibration failed).

This parameter has the configuration ID ```config_72_1``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 73: Alarm/Notification events

Alarm/Notification events
This parameter defines the module behaviour in case it receives any Alarm/Notification events.

  
Values:  
• default value 0 – function not active  
• 1 – turn OFF  
• 2 – turn ON  
• 3 – start blinking (output turns 1s ON, and 1s OFF)

  
**NOTE: When value 3 is selected the default time interval of the blinking is 10 minutes. It can be stopped with a button press or sending a control frame. To adjust the time interval please refer to parameter 74 – Alarm/Notification time interval.**
Values in the range 0 to 3 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_73_1``` and is of type ```INTEGER```.


### Parameter 74: Alarm/Notification time interval

Alarm/Notification time interval
Alarm/Notification time interval (dependant on parameter 73)

  
This parameter defines the time interval of the blinking state, once the module receives an alarm/notification event. Minimum step increase is 1 minute.

  
Values (size is 1 byte dec):  
• default value 10 = 10 minutes  
• 1 – 125 = 1 -125 minutes

  
**NOTE: This parameter does not have any effect if parameter 73 is not set to value 3**
Values in the range 1 to 125 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_74_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZMNHHD supports 4 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Lifeline


Association group 1 supports 1 node.

### Group 2: Basic OnOff

Basic OnOff
Supports the following command classes:

• Basic set: triggered at change of output and reflecting its state

Association group 2 supports 16 nodes.

### Group 3: StartStop level change

StartStop level change
Supports the following command classes:

• Start/Stop Level Change: triggered upon holding and releasing the switch connected to I1

**NOTE: Association 3 StartStop level change is switch type dependant. The switch must be a bi-stable switch type otherwise the association can not be trigered. To know how to change the switch type connected, please refer to chapter "Configuration parameters", in the official manual, for more information.**

**NOTE: When the device is in switch mode (parameter 5 set to 1), this association group is**** not available. **

Association group 3 supports 16 nodes.

### Group 4: Multilevel set

Multilevel set
Supports the following command classes:

• Switch Multilevel Set: triggered at change of output and reflecting its state

**NOTE: When the device is in switch mode (parameter 5 set to 1), this association group is not available. **

Association group 4 supports 16 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| Linked to BASIC|
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V5| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [MiniDimmer_product_manual](https://www.cd-jackson.com/zwave_device_uploads/1100/Qubino-Mini-Dimmer-extended-manual-eng-1-8.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1100).
