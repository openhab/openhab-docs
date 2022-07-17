---
layout: documentation
title: ZMNHYD - ZWave
---

{% include base.html %}

# ZMNHYD Smart Plug
This describes the Z-Wave device *ZMNHYD*, manufactured by *[Goap](http://www.qubino.com/)* with the thing type UID of ```qubino_zmnhyd_00_000```.

The device is in the category of *Power Outlet*, defining Small devices to be plugged into a power socket in a wall which stick there.

![ZMNHYD product image](https://opensmarthouse.org/zwavedatabase/822/image/)


The ZMNHYD supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

This Z-Wave module is used for switching and energy measurements in single-phase electrical power networks and can be used in residential, industrial and utility applications.

  * Power supply: 230V +/- 10%, 50 Hz
  * Power load: 15A resistive max.
  * Overload protection >16 A
  * Power consumption <1W

### Inclusion Information

Auto inclusion (first time usage)

  * start inclusion mode of z-wave controller
  * plug device into power outlet (5 seconds auto inclusion)

Manual inclusion

  * plug device into power outlet
  * start inclusion mode of z-wave controller
  * press the service button (S) 3 times within 3 seconds

### Exclusion Information

  * plug device into power outlet
  * ensure device is within maximum 1 meter (3 feet) of the main controller
  * enable exclusion mode on main controller
  * press service button (S) on module 3 times within 3 seconds (please note: configuration parameters will not be reset!)

## Channels

The following table summarises the channels available for the ZMNHYD -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number | 
| Electric meter (amps) | meter_current | meter_current | Energy | Number | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Reset Power Consumption | meter_reset | meter_reset | Energy | Switch | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Electric meter (volts)
Indicates the instantaneous voltage.

The ```meter_voltage``` channel is of type ```meter_voltage``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (amps)
Indicates the instantaneous current consumption.

The ```meter_current``` channel is of type ```meter_current``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Reset Power Consumption
Reset the meter.

The ```meter_reset``` channel is of type ```meter_reset``` and supports the ```Switch``` item and is in the ```Energy``` category.

### Alarm (power)
Indicates if a power alarm is triggered.

The ```alarm_power``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 16 configuration parameters available in the ZMNHYD.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 10 | ALL ON / ALL OFF | Activate / deactivate ALL ON / ALL OFF Functionality |
| 11 | Auto Off Timer | Turn Smart plug 16A Off Automatically with Timer |
| 12 | Auto On Timer | Turn Smart plug 16A On Automatically with Timer |
| 15 | Timer Settings Unit | Set Timer Units to Seconds or Milliseconds |
| 30 | Restore state after power failure | Restore on/off status for Smart plug 16A after power failure |
| 40 | Power Consumption Reporting Threshold | Power Consumption Reporting Threshold [%] |
| 42 | Power Consumption Reporting Time Threshold | Power Consumption Reporting Time Threshold [seconds] |
| 50 | Down value | Lower power threshold used in parameter no. 52 [watt] |
| 51 | Up value | Upper power threshold used in parameter no. 52 [watt] |
| 52 | Action in case of exceeding defined power values | Action in case of exceeding defined power values (parameters 50 and 51) |
| 70 | Overload safety switch | Turn off the controlled device in case of exceeding the defined power |
| 71 | Power threshold | Allows setting the power threshold for triggering the Program started notification |
| 72 | Time interval | Allows setting the time interval for triggering the Program completed notification |
| 73 | Turn Smart Plug OFF | Allows turning the Smart Plug output to OFF once the time interval is expired and the Program completed notification is sent to the controller |
| 74 | Enable/disable LED | Allows enabling or disabling the Smart Plug LED |
| 249 | Enable/Disable Reporting on Set command | Enable/Disable Reporting on Set command |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 10: ALL ON / ALL OFF

Activate / deactivate ALL ON / ALL OFF Functionality
Smart Plug 16A device responds to commands ALL ON / ALL OFF that may be sent by the primary or secondary gateway (hub) within the Z-Wave network.

Values (size is 2 byte dec):

- default value 255

- 255 - ALL ON active, ALL OFF active

- 0 - ALL ON not active, ALL OFF not active

- 1 - ALL ON not active, ALL OFF active

- 2 - ALL ON active, ALL OFF not active
The following option values may be configured, in addition to values in the range 0 to 0 -:

| Value  | Description |
|--------|-------------|
| 0 | ALL ON not active, ALL OFF not active |
| 1 | ALL ON not active, ALL OFF active |
| 2 | ALL ON active, ALL OFF not active |
| 255 | ALL ON active, ALL OFF active |

The manufacturer defined default value is ```255``` (ALL ON active, ALL OFF active).

This parameter has the configuration ID ```config_10_2``` and is of type ```INTEGER```.


### Parameter 11: Auto Off Timer

Turn Smart plug 16A Off Automatically with Timer
If Smart plug 16A is ON, you can schedule it to turn OFF automatically after a period of time defined in this parameter. The timer is reset each time, the module receives an ON command either remotely (from the gateway (hub) or associated device) or locally from the switch.

  * 0 = Auto OFF disabled
  * 1 - 32535 = 1 - 32535 seconds (or milliseconds – see Parameter no. 15) Auto OFF timer enabled for a given amount of seconds (or milliseconds)
Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


### Parameter 12: Auto On Timer

Turn Smart plug 16A On Automatically with Timer
If Smart plug 16A is OFF, you can schedule it to turn ON automatically after a period of time defined in this parameter. The timer is reset to zero each time the device receives an OFF command, either remotely (from the gateway (hub) or associated device) or locally from the switch.

  * 0 - Auto ON Disabled
  * 1 - 32535 = 1 - 32535 seconds (or milliseconds – see Parameter no. 15) Auto ON timer enabled- for a given amount of seconds (or milliseconds).
Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 15: Timer Settings Unit

Set Timer Units to Seconds or Milliseconds
Choose if you want to set the timer in seconds or milliseconds in parameters 11 and 12. Please note that the value for this parameter applies to settings for Smart plug 16A in all of the above parameters (timer on / timer off).
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | timer set in seconds |
| 1 | timer set in milliseconds |

The manufacturer defined default value is ```0``` (timer set in seconds).

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 30: Restore state after power failure

Restore on/off status for Smart plug 16A after power failure

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Restore state after power failure |
| 1 | Do not restore state after power failure |

The manufacturer defined default value is ```0``` (Restore state after power failure).

This parameter has the configuration ID ```config_30_1``` and is of type ```INTEGER```.


### Parameter 40: Power Consumption Reporting Threshold

Power Consumption Reporting Threshold [%]
Choose by how much power consumption needs to increase or decrease to be reported. Values correspond to percentages, so if 20 is set (by default), the device will report any power consumption changes of 20% or more compared to the last reading.

  * 0 - Power consumption reporting disabled
  * 1 - 100 = 1% - 100% Power consumption reporting enabled. New value is reported only when Wattage in real time changes by more than the percentage value set in this parameter compared to the previous Wattage reading, starting at 1% (the lowest value possible).

NOTE: Power consumption needs to increase or decrease by at least 1 Watt to be reported, REGARDLESS of percentage set in this parameter.

NOTE: When reporting Watts, module will automatically report also \[V\] (Voltage) and \[A\] (Amperes)
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```20```.

This parameter has the configuration ID ```config_40_1``` and is of type ```INTEGER```.


### Parameter 42: Power Consumption Reporting Time Threshold

Power Consumption Reporting Time Threshold [seconds]
Set value refers to the time interval with which power consumption in Watts is reported (30 – 32535 seconds).

Values :

  * 0 : Power consumption reporting disabled
  * 30 - 32535 : 30 - 32535 seconds. Power consumption reporting enabled. Report is sent according to time interval (value) set here.

The device is reporting the following values (if there was a change): W, V and A.

NOTE: The energy consumption (kWh) is reported regardless of the values, set in the parameters 40 and 42. The energy consumption will be reported, when it increases for at least 0,1 kWh.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Power consumption reporting disabled |

The manufacturer defined default value is ```0``` (Power consumption reporting disabled).

This parameter has the configuration ID ```config_42_2``` and is of type ```INTEGER```.


### Parameter 50: Down value

Lower power threshold used in parameter no. 52 [watt]
Lower power threshold used in parameter no. 52. 

Values:

  * default value 30 : 30 W  
    
  * 0 – 4000 : 0W – 4000 W  
    

Down value cannot be higher than a value specified in parameter no. 51  


NOTE:

  * if parameter no. 50 value is 100W and if measured power is lower than 100W, the association is send association is send again if measured power will rise above 105W
  * Power threshold step is 1W
Values in the range 0 to 4000 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_50_2``` and is of type ```INTEGER```.


### Parameter 51: Up value

Upper power threshold used in parameter no. 52 [watt]
Values

  * default value 50 : 50 W
  * 0 – 4000 : 0 W – 400 W 

Up value cannot be lower than a value specified in the parameter no. 50.

NOTE:

  * If parameter no. 51 value is 200W and if measured power is higher than 200W the association is send
  * Association is send again if measured power will fall below 190W
  * Power threshold step is 1W
Values in the range 0 to 4000 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_51_2``` and is of type ```INTEGER```.


### Parameter 52: Action in case of exceeding defined power values

Action in case of exceeding defined power values (parameters 50 and 51)

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Inactive |
| 1 | Turn the associated devices on if underpowered |
| 2 | Turn the associated devices off if underpowered |
| 3 | Turn the associated devices on if overpowered |
| 4 | Turn the associated devices off if overpowered |
| 5 | Turn the associated devices on/off |
| 6 | Turn the associated devices off/on |

The manufacturer defined default value is ```6``` (Turn the associated devices off/on).

This parameter has the configuration ID ```config_52_1``` and is of type ```INTEGER```.


### Parameter 70: Overload safety switch

Turn off the controlled device in case of exceeding the defined power
The function allows for turning off the controlled device in case of exceeding the defined power for more than 3 seconds. Controlled device can be turned back on by S-button or sending a control frame. By default this function is inactive.

Values (size is 2 byte dec):

• default value 0

• 1 – 4000 = 1 W – 4000W

• 0 = function not active

NOTE: This functionality is not an overload safety protection, please check installation note for details.

In case of overload the following message will be send towards the controller:

• COMMAND\_CLASS\_NOTIFICATION_V5

• The Alarm V1 type field set to 0x00

• Notification Type 0x08 and 0x08

(Overload detected)

NOTE: Regardless of the value set in this parameter the overcurrent protection is always active and can not be disabled. 
Values in the range 0 to 4000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_70_2``` and is of type ```INTEGER```.


### Parameter 71: Power threshold

Allows setting the power threshold for triggering the Program started notification
This function allows setting the power threshold for triggering the Program started notification. When the threshold is reached, the notification will let the user know that the device connected to the smart plug started working.

Values (size is 2 byte dec):

• default value 0

• 1–4000=1W–4000W

• 0 = function not active

When the threshold is reached the following message will be send towards the controller:

• COMMAND\_CLASS\_NOTIFICATION_V5

• The Alarm V1 type field set to 0x00

• Notification Type 0x0C and 0x01 (Program started)
Values in the range 0 to 4000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_71_2``` and is of type ```INTEGER```.


### Parameter 72: Time interval

Allows setting the time interval for triggering the Program completed notification
This function allows setting the time interval for triggering the Program completed notification. When the active power will fall below the power threshold set in parameter 71, the time interval will start and when it will expire the notification will let the user know that the device connected to the smart plug finished working. The time interval is useful for the devices that have pause intervals during operations.

Values (size is 1 byte dec):

• default value 1

• 0–125=0–125minutes

• 0 = immediate sending of notification when active power drops below the threshold set

in the parameter 71

When the time interval expires the following message will be send towards the controller:

• COMMAND\_CLASS\_NOTIFICATION_V5

• The Alarm V1 type field set to 0x00

• Notification Type 0x0C and 0x03 (Program completed)
Values in the range 0 to 125 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_72_1``` and is of type ```INTEGER```.


### Parameter 73: Turn Smart Plug OFF

Allows turning the Smart Plug output to OFF once the time interval is expired and the Program completed notification is sent to the controller
This function allows turning the Smart Plug output to OFF once the time interval is expired and the Program completed notification is sent to the controller.

Values (size is 1 byte dec):

• default value 0

• 0 – function disabled

• 1 – turn OFF relay once the notification Program completed is sent
The following option values may be configured, in addition to values in the range 0 to 0 -:

| Value  | Description |
|--------|-------------|
| 0 | function disabled |
| 1 | turn OFF relay once the notification Program completed is sent |

The manufacturer defined default value is ```0``` (function disabled).

This parameter has the configuration ID ```config_73_1``` and is of type ```INTEGER```.


### Parameter 74: Enable/disable LED

Allows enabling or disabling the Smart Plug LED
This function allows enabling or disabling the Smart Plug LED. In case the user doesn’t want the LED indicator, it can be turned OFF with this parameter.

NOTE: if an overload or overcurrent occurs the red LED will still turn ON regardless of the value set in this parameter.

Values (size is 1 byte dec):

• default value 1

• 0 – LED is disabled

• 1 – LED is enabled
The following option values may be configured, in addition to values in the range 0 to 0 -:

| Value  | Description |
|--------|-------------|
| 0 | LED is disabled |
| 1 | LED is enabled |

The manufacturer defined default value is ```1``` (LED is enabled).

This parameter has the configuration ID ```config_74_1``` and is of type ```INTEGER```.


### Parameter 249: Enable/Disable Reporting on Set command

Enable/Disable Reporting on Set command
Using this parameter it is possible to enable/disable reporting after the set command (i.e. Basic set).

Values (size is 1 byte dec):

• default value 1

• 0 - disable reporting

• 1 - enable reporting
The following option values may be configured, in addition to values in the range 0 to 0 -:

| Value  | Description |
|--------|-------------|
| 0 | disable reporting |
| 1 | enable reporting |

The manufacturer defined default value is ```1``` (enable reporting).

This parameter has the configuration ID ```config_249_1``` and is of type ```INTEGER```.

### Switch All Mode

Set the mode for the switch when receiving SWITCH ALL commands.

The following option values may be configured -:
| Value  | Description |
|--------|-------------|
| 0 | Exclude from All On and All Off groups |
| 1 | Include in All On group |
| 2 | Include in All Off group |
| 255 | Include in All On and All Off groups |

This parameter has the configuration ID ```switchall_mode``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZMNHYD supports 5 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Reserved for communication with main controller

Association group 1 supports 1 node.

### Group 2: Status on/off

Send control command BASIC_SET 0x00/0xFF
This group is assigned to the Smart Plug status On/Off. It allows sending the control command BASIC_SET 0x00/0xFF to associated devices whenevert the Smart Plug is turned On or Off.

Association group 2 supports 5 nodes.

### Group 3: Load dependent 

sending control commands BASIC_SET 0x00/0xFF depending on current load
This groups allows to send control commands BASIC_SET 0x00/0xFF to associated devices depending on the current load. This association group is configured through the parameters no. 50, 51 and 52.

Association group 3 supports 5 nodes.

### Group 4: Secure Status On/Off

Send control command BASIC_SET 0x00/0xFF
This group is equivalent to association group 2, except commands are sent securily encapsulated.

Association group 4 supports 5 nodes.

### Group 5: Secure Load dependent 

sending control commands BASIC_SET 0x00/0xFF depending on current load
This group is equivalent to association group 3, except commands are sent securily encapsulated.

Association group 5 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V5| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Qubino Smart Plug 16A extended manual](https://opensmarthouse.org/zwavedatabase/822/reference/Qubino-Smart-Plug-16A-PLUS-extended-manual-eng-2-2-2.pdf)
* [Qubino Smart Plug 16A extended manual V2.6](https://opensmarthouse.org/zwavedatabase/822/reference/qubino-smart-plug-16a-plus-extended-manual-eng-V2.6_2019-04-10.pdf)
* [Qubino Smart Plug 16A extended manual V2.7](https://opensmarthouse.org/zwavedatabase/822/reference/qubino-smart-plug-16a-plus-extended-manual-eng-V2.7_2019-05-09.pdf)
* [Qubino Smart Plug 16A extended manual V2.5](https://opensmarthouse.org/zwavedatabase/822/reference/Qubino_Smart_Plug_16A_PLUS_extended_manual_eng_2.5.pdf)
* [Qubino Smart Plug 16A extended manual V41.06](https://opensmarthouse.org/zwavedatabase/822/reference/Qubino_Smart-Plug-16A-PLUS-extended-manual_eng_41.06.1.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/822).
