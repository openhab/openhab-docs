---
layout: documentation
title: Wave Plug - ZWave
---

{% include base.html %}

# Wave Plug Plug On Off with power measurement
This describes the Z-Wave device *Wave Plug*, manufactured by *Shelly* with the thing type UID of ```shelly_waveplug_00_000```.

The device is in the category of *Power Outlet*, defining Small devices to be plugged into a power socket in a wall which stick there.

![Wave Plug product image](https://opensmarthouse.org/zwavedatabase/1642/image/)


The Wave Plug supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The Wave Plug (Device) is a smart plug/outlet with power measurement and overheating protection, which allows remote control of electric appliances through a mobile phone, tablet, PC, or home automation system.

### Inclusion Information

SmartStart adding (inclusion)

SmartStart enabled products can be added into a Z-Wave® network by scanning the Z-Wave® QR Code present on the Device with a gateway providing SmartStart inclusion. No further action is required, and the SmartStart device will be added automatically within 10 minutes of being switched on in the network vicinity.

With the gateway application scan the QR code on the Device label and add the Security 2 (S2) Device Specific Key (DSK) to the provisioning list in the gateway.

Connect the Device to a power supply.

Check if the blue LED is blinking in Mode 1. If so, the Device is not added to a Z-Wave® network.

Adding will be initiated automatically within a few seconds after connecting the Device to a power supply, and the Device will be added to a Z-Wave® network automatically.

The blue LED will be blinking in Mode 2 during the adding process.

The green LED will be blinking in Mode 1 if the Device is successfully added to a Z-Wave® network.

Adding (inclusion) with the S button

Connect the Device to a power supply.

Check if the blue LED is blinking in Mode 1. If so, the Device is not added to a Z-Wave® network.

Enable add/remove mode on the gateway.

To enter the Setting mode, press and hold the S button on the Device until the LED turns solid blue.

Release and then press and hold (> 2s) the S button on the Device until the blue LED starts blinking in Mode 3. Releasing the S button will start the Learn mode.

The blue LED will be blinking in Mode 2 during the adding process.

The green LED will be blinking in Mode 1 if the Device is successfully added to a Z-Wave® network.

### Exclusion Information

Removing (exclusion) with the S button

Connect the Device to a power supply.

Check if the green LED is blinking in Mode 1. If so, the Device is added to a Z-Wave® network.

Enable add/remove mode on the gateway.

To enter the Setting mode, press and hold the S button on the Device until the LED turns solid blue.

Release and then press and hold (> 2s) the S button on the Device until the blue LED starts blinking in Mode 3. Releasing the S button will start the LEARN MODE.

The blue LED will be blinking in Mode 2 during the removing process.

The blue LED will be blinking in Mode 1 if the Device is successfully removed from a Z-Wave® network.

### General Usage Information



## Channels

The following table summarises the channels available for the Wave Plug -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number | 
| Electric meter (amps) | meter_current | meter_current | Energy | Number | 
| Alarm (heat) | alarm_heat | alarm_heat | temperature_hot | Switch | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (volts)
Indicates the instantaneous voltage.

The ```meter_voltage``` channel is of type ```meter_voltage``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (amps)
Indicates the instantaneous current consumption.

The ```meter_current``` channel is of type ```meter_current``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (heat)
Indicates if a heat alarm is triggered.

The ```alarm_heat``` channel is of type ```alarm_heat``` and supports the ```Switch``` item and is in the ```temperature_hot``` category. This is a read only channel so will only be updated following state changes from the device.

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



## Device Configuration

The following table provides a summary of the 17 configuration parameters available in the Wave Plug.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 17 | Restore state of O (O1) after power failure | This parameter determines if the on/off status is saved and restored for the load connected to output after a power failure. |
| 19 | O (O1) Auto OFF with timer | If Load O (O1) is ON, you can schedule it to turn OFF automatically after a period of time defined in this parameter. The timer is reset to zero each time the device receives an ON command, either remotely (from the Gateway or associated device) or local |
| 20 | O (O1) Auto ON with timer | If the load O (O1) is OFF, you can schedule it to turn ON automatically after the period of time defined in this parameter. The timer resets to zero each time the Device receives an OFF command, either remotely (from the gateway or associated device) or l |
| 23 | O (O1) contact type - NO/NC | The set value determines the relay contact type for output O (O1). The relay contact type can be normally open (NO) or normally closed (NC). |
| 25 | Set timer units to s or ms for O (O1) | Set the timer units to seconds or milliseconds. Choose if you want to set the timer in seconds or milliseconds in Parameters No. 19, 20. |
| 36 | O (O1) Power report on change - percentage | This parameter determines the minimum change in consumed power that will result in sending a new report to the gateway. |
| 39 | Minimum time between reports (O) O1 | This parameter determines the minimum time that must elapse before a new power report on O (O1) is sent to the gateway. |
| 91 | Water Alarm | This parameter determines how the device should respond to the reports of alarm frames. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification. |
| 92 | Smoke Alarm | This parameter determines how the device should respond to the reports of alarm frames. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification. |
| 93 | CO Alarm | This parameter determines how the device should respond to the reports of alarm frames. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification. |
| 94 | Heat Alarm | This parameter determines how the device should respond to the reports of alarm frames. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification. |
| 105 | LED Signalisation intensity | In Wave 1, Wave 1PM and Wave 2PM, this parameter will be implemented in 2024. This parameter determines the intensity of the LED on the Device. Some Devices have RGB LEDs and some have Blue/Red LEDs, but all are dimmable. |
| 117 | Remote Device reboot | This parameter enable restarting or rebooting the Device without physical intervention. Use this parameter only for troubleshooting scope. After device reboot value will be set to default |
| 120 | Factory Reset | Reset to factory default settings and removed from the Z-Wave network. |
| 201 | Serial Number 1 | This parameter contains a part of device’s serial number. |
| 201 | Serial Number 2 | This parameter contains a part of device’s serial number. |
| 203 | Serial Number 3 | This parameter contains a part of device’s serial number. |

### Parameter 17: Restore state of O (O1) after power failure

This parameter determines if the on/off status is saved and restored for the load connected to output after a power failure.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Device saves last on/off status and restores it after a power failure |
| 1 | Device does not save on/off status and does not restore after power fa |

The manufacturer defined default value is ```0``` (Device saves last on/off status and restores it after a power failure).

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 19: O (O1) Auto OFF with timer

If Load O (O1) is ON, you can schedule it to turn OFF automatically after a period of time defined in this parameter. The timer is reset to zero each time the device receives an ON command, either remotely (from the Gateway or associated device) or local
0 : Auto ON Disabled

1 - 32535 : seconds (or milliseconds – see Parameter no. 25. Auto ON timer enabled for a given amount of seconds (or milliseconds) resolution 100ms
Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_19_2``` and is of type ```INTEGER```.


### Parameter 20: O (O1) Auto ON with timer

If the load O (O1) is OFF, you can schedule it to turn ON automatically after the period of time defined in this parameter. The timer resets to zero each time the Device receives an OFF command, either remotely (from the gateway or associated device) or l
0 - Auto ON Disabled

1 - 32535 = 1 - 32535 seconds or milliseconds – see Parameter No. 25. Set timer units to s or ms for O (O1) resolution 100ms.
Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_20_2``` and is of type ```INTEGER```.


### Parameter 23: O (O1) contact type - NO/NC

The set value determines the relay contact type for output O (O1). The relay contact type can be normally open (NO) or normally closed (NC).
Relay logic:  


+\---\---\-----+\---\---\---\---\---\---\---\---\---+\---\---\---\---\---\---\---+

| Par-NO/NC | Command (switch, Z-Wave…) | Device output state |

+\---\---\-----+\---\---\---\---\---\---\---\---\---+\---\---\---\---\---\---\---+

| NO (0) | OFF | OFF (0 V) |

| NO (0) | ON | ON (230 V) |

| NC (1) | OFF | ON (230 V) |

| NC (1) | ON | OFF (0 V) |

+\---\---\-----+\---\---\---\---\---\---\---\---\---+\---\---\---\---\---\---\---+
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_23_1``` and is of type ```INTEGER```.


### Parameter 25: Set timer units to s or ms for O (O1)

Set the timer units to seconds or milliseconds. Choose if you want to set the timer in seconds or milliseconds in Parameters No. 19, 20.

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_25_1``` and is of type ```INTEGER```.


### Parameter 36: O (O1) Power report on change - percentage

This parameter determines the minimum change in consumed power that will result in sending a new report to the gateway.
Values & descriptions:

0 - reports are disabled

1-100 (1-100%) - change in power NOTE: When the Device reports the power consumption (W), it will also automatically report the voltage (V) and current (A). NOTE: Regardless of the power consumption change in percentage, the report will not be sent more frequently than defined by Parameter No. 39
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_36_1``` and is of type ```INTEGER```.


### Parameter 39: Minimum time between reports (O) O1

This parameter determines the minimum time that must elapse before a new power report on O (O1) is sent to the gateway.
Values & descriptions:

0 - reports are disabled

1-120 (1-120s) - report interval

NOTE: This Parameter is in relation to Parameter No. 36. NOTE: Setting the value to less than 30s can cause the Z-Wave network congestion state (slow Device response and decreased network stability).
Values in the range 0 to 120 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_39_1``` and is of type ```INTEGER```.


### Parameter 91: Water Alarm

This parameter determines how the device should respond to the reports of alarm frames. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification.
The notification types it reacts to are as followed,

Notification Type: - NOTIFICATION\_TYPE\_WATER_ALARM 0x05

Notification Events: - All except ALARM\_NO\_EVENT 0x00This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_91_4``` and is of type ```INTEGER```.


### Parameter 92: Smoke Alarm

This parameter determines how the device should respond to the reports of alarm frames. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification.
The notification types it reacts to are as followed,

Notification Type: - NOTIFICATION\_TYPE\_SMOKE_ALARM 0x01

Notification Events: - NOTIFICATION\_EVENT\_SMOKE\_ALARM\_SMOKE\_DETECTED 0x01 - NOTIFICATION\_EVENT\_SMOKE\_ALARM\_SMODE\_DETECTED\_UNKNOWN\_LOCATION 0x02This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_92_4``` and is of type ```INTEGER```.


### Parameter 93: CO Alarm

This parameter determines how the device should respond to the reports of alarm frames. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification.
The notification types it reacts to are as followed,

Notification Type: - NOTIFICATION\_TYPE\_CO_ALARM 0x02

Notification Events: - All except ALARM\_NO\_EVENT 0x00This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_93_4``` and is of type ```INTEGER```.


### Parameter 94: Heat Alarm

This parameter determines how the device should respond to the reports of alarm frames. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification.
The notification types it reacts to are as followed,

Notification Type: - NOTIFICATION\_TYPE\_HEAT_ALARM 0x04

Notification Events: - NOTIFICATION\_EVENT\_HEAT\_ALARM\_RAPID\_TEMPERATURE\_RISE\_LOCATION\_PROVIDED 0x03 - NOTIFICATION\_EVENT\_HEAT\_ALARM\_RAPID\_TEMPERATURE\_RISE 0x04 - NOTIFICATION\_EVENT\_HEAT\_ALARM\_RAPID\_TEMPERATURE\_FALL\_LOCATION\_PROVIDED 0x0C - NOTIFICATION\_EVENT\_HEAT\_ALARM\_RAPID\_TEMPERATURE\_FALL 0x0DThis is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_94_4``` and is of type ```INTEGER```.


### Parameter 105: LED Signalisation intensity

In Wave 1, Wave 1PM and Wave 2PM, this parameter will be implemented in 2024. This parameter determines the intensity of the LED on the Device. Some Devices have RGB LEDs and some have Blue/Red LEDs, but all are dimmable.
Values & descriptions:

 0-100 (0-100%, every 1%)
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_105_1``` and is of type ```INTEGER```.


### Parameter 117: Remote Device reboot

This parameter enable restarting or rebooting the Device without physical intervention. Use this parameter only for troubleshooting scope. After device reboot value will be set to default
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_117_1``` and is of type ```INTEGER```.


### Parameter 120: Factory Reset

Reset to factory default settings and removed from the Z-Wave network.
Values & descriptions:

0 - Don’t do Factory reset

1431655765 - Do the Factory reset (hex 0x55555555)
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_120_4``` and is of type ```INTEGER```.


### Parameter 201: Serial Number 1

This parameter contains a part of device’s serial number.
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_201_4``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 201: Serial Number 2

This parameter contains a part of device’s serial number.
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_201_4``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 203: Serial Number 3

This parameter contains a part of device’s serial number.
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_203_4``` and is of type ```INTEGER```.
This is a read only parameter.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Wave Plug supports 2 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Lifeline

Association group 1 supports 9 nodes.

### Group 2: Switch 1 - Basic ON/OFF

Switch 1 - Basic ON/OFF

Association group 2 supports 9 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_INDICATOR_V3| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [Device Image](https://opensmarthouse.org/zwavedatabase/1642/reference/Wave_Plug_US_user_guide_V5.pdf)
* [Extended Manual](https://opensmarthouse.org/zwavedatabase/1642/reference/Extended_User_Guide_Wave_PlugUSV1.5.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1642).
