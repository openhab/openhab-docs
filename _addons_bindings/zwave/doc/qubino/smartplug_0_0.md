---
layout: documentation
title: Smart Plug 16A - ZWave
---

{% include base.html %}

# Smart Plug 16A Smart Plug
This describes the Z-Wave device *Smart Plug 16A*, manufactured by *[Goap](http://www.qubino.com/)* with the thing type UID of ```qubino_smartplug_00_000```.

The device is in the category of *Power Outlet*, defining Small devices to be plugged into a power socket in a wall which stick there.

![Smart Plug 16A product image](https://www.cd-jackson.com/zwave_device_uploads/822/822_default.png)


The Smart Plug 16A supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

This Z-Wave module is used for switching and energy measurements in single-phase electrical power networks and can be used in residential, industrial and utility applications.

Power supply: 230V +/- 10%, 50 Hz

Power load: 15A resistive max.

Overload protection >16 A

Power consumption <1W

### Inclusion Information

Auto inclusion (first time usage)

- start inclusion mode of z-wave controller
- plug device into power outlet (5 seconds auto inclusion)

Manual inclusion

- plug device into power outlet
- start inclusion mode of z-wave controller
- press the service button (S) 3 times within 3 seconds

### Exclusion Information

- plug device into power outlet
- ensure device is within maximum 1 meter (3 feet) of the main controller
- enable exclusion mode on main controller
- press service button (S) on module 3 times within 3 seconds (please note: configuration parameters will not be reset!)

### Wakeup Information

Press the Service button (S) 3 times within 3 seconds.

## Channels

The following table summarises the channels available for the Smart Plug 16A -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 
| Electric meter (volts) | meter_voltage | Energy | Number | 
| Electric meter (amps) | meter_current | Energy | Number | 
| Electric meter (kWh) | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | Energy | Number | 
| Alarm (power) | alarm_power | Door | Switch | 

### Switch

Switch the power on and off.

The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Electric meter (volts)

Indicates the instantaneous voltage.

The ```meter_voltage``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (amps)

Indicates the instantaneous current consumption.

The ```meter_current``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)

Indicates the energy consumption (kWh).

The ```meter_kwh``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)

Indicates the instantaneous power consumption.

The ```meter_watts``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (power)

Indicates if a power alarm is triggered.

The ```alarm_power``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 7 configuration parameters available in the Smart Plug 16A.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 10 | Activate / deactivate functions ALL ON / ALL OFF |  |
| 11 | Automatic turning OFF relay after set time | When the relay is turned ON, it automatically turns OFF after the defined time |
| 12 | On automatically with timer | Turn Smart plug On Automatically with Timer |
| 15 | Timer Settings Unit | Set Timer Units to Seconds or Milliseconds |
| 30 | Restore state ofter power failure | Restore on/off status for Smart plug 16A after power failure |
| 40 | Treshold Change in Power  for reporting | Change of power consumption \[Watt\] reporting threshold |
| 41 | Treshold time for power reporting | Treshold time for power reporting \[Watt\] |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 10: Activate / deactivate functions ALL ON / ALL OFF



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | ALL ON disabled, ALL of disabled |
| 1 | ALL ON disabled, AL OFF active |
| 2 | ALL ON active, ALL OFF disabled |
| 255 | ALL ON active, ALL OFF active |

The manufacturer defined default value is ```255``` (ALL ON active, ALL OFF active).

This parameter has the configuration ID ```config_10_2``` and is of type ```INTEGER```.


### Parameter 11: Automatic turning OFF relay after set time

When the relay is turned ON, it automatically turns OFF after the defined time
The timer is reset each time, the module receives an ON command (from push button/main controller/association).

- 0 = Auto OFF disabled
- 1 - 32535 = 1 second to 32535 seconds delay. Auto OFF is enabled with defined time. Step is 1s.
The following option values may be configured, in addition to values in the range 0 to 32535 -:

| Value  | Description |
|--------|-------------|
| 0 | Auto OFF disabled |

The manufacturer defined default value is ```0``` (Auto OFF disabled).

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


### Parameter 12: On automatically with timer

Turn Smart plug On Automatically with Timer
If Smart plug 16A is OFF, you can schedule it to turn ON automatically after a period of time defined in this parameter. The timer is reset to zero each time the device receives an OFF command, either remotely (from the gateway (hub) or associated device) or locally from the switch.

- 0 - Auto ON Disabled
- 1 - 32535 = 1 - 32535 seconds (or milliseconds – see Parameter no. 15) Auto ON timer enabled- for a given amount of seconds (or milliseconds).
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Auto ON Disabled |
| 0 | please delete this option |

The manufacturer defined default value is ```0``` (please delete this option).

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 15: Timer Settings Unit

Set Timer Units to Seconds or Milliseconds
Choose if you want to set the timer in seconds or milliseconds in parameters 11 and 12. Please note that the value for this parameter applies to settings for Smart plug 16A in all of the above parameters (timer on / timer off).
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | timer set in seconds |
| 1 | timer set in milliseconds |

The manufacturer defined default value is ```0``` (timer set in seconds).

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 30: Restore state ofter power failure

Restore on/off status for Smart plug 16A after power failure

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Restore state after power failure |
| 1 | Do not restore state after power failure |

The manufacturer defined default value is ```0``` (Restore state after power failure).

This parameter has the configuration ID ```config_30_1``` and is of type ```INTEGER```.


### Parameter 40: Treshold Change in Power  for reporting

Change of power consumption \[Watt\] reporting threshold
Choose by how much power consumption needs to increase or decrease to be reported. Values correspond to percentages, so if 20 is set (by default), the device will report any power consumption changes of 20% or more compared to the last reading.

- 0 - Power consumption reporting disabled
- 1 - 100 = 1% - 100% Power consumption reporting enabled. New value is reported only when Wattage in real time changes by more than the percentage value set in this parameter compared to the previous Wattage reading, starting at 1% (the lowest value possible).

NOTE: Power consumption needs to increase or decrease by at least 1 Watt to be reported, REGARDLESS of percentage set in this parameter.

NOTE: When reporting Watts, module will automatically report also \[V\] (Voltage) and \[A\] (Amperes)
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```20```.

This parameter has the configuration ID ```config_40_1``` and is of type ```INTEGER```.


### Parameter 41: Treshold time for power reporting

Treshold time for power reporting \[Watt\]
Set value refers to the time interval with which power consumption in Watts is reported (0 – 32535 seconds). If 300 is entered (by default), energy consumption reports will be sent to the gateway (hub) every 300 seconds (or 5 minutes).

- 0 - Power consumption reporting disabled
- 30 - 32535 = 30 - 32535 seconds. Power consumption reporting enabled. Report is sent according to time interval (value) set here.

The device is reporting the following values (if there was a change): Power \[W\], Voltage \[V\] and Current \[A\]
Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_41_2``` and is of type ```INTEGER```.

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

The Smart Plug 16A supports 5 association groups.

### Group 1: Lifeline

Reserved for communication with main controller
This group supports 1 nodes.

### Group 2: Status on/off

Send control command BASIC\_SET 0x00/0xFF
This group supports 5 nodes.

### Group 3: Load dependent 

sending control commands BASIC\_SET 0x00/0xFF depending on current load
This group supports 5 nodes.

### Group 4: Secure Status On/Off

Send control command BASIC\_SET 0x00/0xFF
This group supports 5 nodes.

### Group 5: Secure Load dependent 

sending control commands BASIC\_SET 0x00/0xFF depending on current load
This group supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V0| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V5| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V0| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Qubino Smart Plug 16A extended manual](https://www.cd-jackson.com/zwave_device_uploads/822/Qubino-Smart-Plug-16A-PLUS-extended-manual-eng-2-2-2.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/822).
