---
layout: documentation
title: Wave Plug S EU - ZWave
---

{% include base.html %}

# Wave Plug S EU The Device is a smart plug/outlet with power measurement and overheating protection.
This describes the Z-Wave device *Wave Plug S EU*, manufactured by *Shelly* with the thing type UID of ```shelly_waveplugseu_00_000```.

The device is in the category of *Power Outlet*, defining Small devices to be plugged into a power socket in a wall which stick there.

![Wave Plug S EU product image](https://opensmarthouse.org/zwavedatabase/1656/image/)


The Wave Plug S EU supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The Device is a smart plug/outlet with power measurement and overheating protection, which allows remote control of electrical appliances through a mobile phone, tablet, PC, or home automation system.

### Inclusion Information

SmartStart adding (inclusion)

SmartStart enabled products can be added into a Z-Wave® network by scanning the Z-Wave® QR Code present on the Device with a gateway providing SmartStart inclusion. No further action is required, and the SmartStart device will be added automatically within 10 minutes of being switched on in the network vicinity.

With the gateway application scan the QR code on the Device label and add the Security 2 (S2) Device Specific Key (DSK) to the provisioning list in the gateway.

Connect the Device to a power supply.

Check if the blue LED is blinking in Mode 1. If so, the Device is not added to a Z-Wave® network.

Adding will be initiated automatically within a few seconds after connecting the Device to a power supply, and the Device will be added to a Z-Wave® network automatically.

The blue LED will be blinking in Mode 2 during the adding process.

The green LED will be blinking in Mode 1 if the Device is successfully added to a Z-Wave® network.

Adding (inclusion) with the S button (*not available for Long Range inclusion)

Connect the Device to a power supply.

Check if the blue LED is blinking in Mode 1. If so, the Device is not added to a Z-Wave® network.

Enable add/remove mode on the gateway.

To enter the Setting mode, press and hold the S button on the Device until the LED turns solid blue.

Release and then press and hold (> 2s) the S button on the Device until the blue LED starts blinking in Mode 3. Releasing the S button will start the Learn mode.

The blue LED will be blinking in Mode 2 during the adding process.

The green LED will be blinking in Mode 1 if the Device is successfully added to a Z-Wave® network.

Note! In Setting mode, the Device has a timeout of 10s before entering again into Normal mode.

### Exclusion Information

Removing the Device from a Z-Wave® network (exclusion)

Note! The Device will be removed from your Z-Wave® network, but any custom configuration parameters will not be erased.

Removing (exclusion) with the S button

Connect the Device to a power supply.

Check if the green LED is blinking in Mode 1. If so, the Device is added to a Z-Wave® network.

Enable add/remove mode on the gateway.

To enter the Setting mode, press and hold the S button on the Device until the LED turns solid blue.

Release and then press and hold (> 2s) the S button on the Device until the blue LED starts blinking in Mode 3. Releasing the S button will start the Learn mode.

The blue LED will be blinking in Mode 2 during the removing process.

The blue LED will be blinking in Mode 1 if the Device is successfully removed from a Z-Wave® network.

Note! In Setting mode, the Device has a timeout of 10s before entering again into Normal mode.

### General Usage Information



## Channels

The following table summarises the channels available for the Wave Plug S EU -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Alarm (heat) | alarm_heat | alarm_heat | Fire | Switch | 
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

### Alarm (heat)
Indicates if a heat alarm is triggered.

The ```alarm_heat``` channel is of type ```alarm_heat``` and supports the ```Switch``` item and is in the ```Fire``` category. This is a read only channel so will only be updated following state changes from the device.

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

The following table provides a summary of the 13 configuration parameters available in the Wave Plug S EU.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 17 | Restore the O (O1) state after a power failure | This parameter determines if the on/off status is saved and restored for the load connected to O (O1) after a power failure. |
| 19 | O (O1) Auto OFF with timer | If the load O (O1) is ON, you can schedule it to turn OFF automatically after the period of time defined in this parameter. The timer resets to zero each time the Device receives an ON command, either remotely (from the gateway or associated device) or lo |
| 20 | O (O1) Auto ON with timer | If the load O (O1) is OFF, you can schedule it to turn ON automatically after the period of time defined in this parameter. The timer resets to zero each time the Device receives an OFF command, either remotely (from the gateway or associated device) or l |
| 23 | O (O1) contact type - NO/NC | The set value determines the relay contact type for output O (O1). The relay contact type can be normally open (NO) or normally closed (NC). |
| 25 | Set timer units to s or ms for O (O1) | Set the timer units to seconds or milliseconds. Choose if you want to set the timer in seconds or milliseconds in Parameters No. 19, 20. |
| 36 | O (O1) Power report on change - percentage | This parameter determines the minimum change in consumed power that will result in sending a new report to the gateway. |
| 39 | Minimum time between reports (O) O1 | This parameter determines the minimum time that must elapse before a new power report on O (O1) is sent to the gateway. |
| 105 | LED Signalisation intensity | In Wave 1, Wave 1PM and Wave 2PM, Plug US, Plug UK, this parameter will be implemented in 2024. This parameter determines the intensity of the LED on the Device. Some Devices have RGB LEDs and some have Blue/Red LEDs, but all are dimmable. |
| 117 | Remote Device reboot | This parameter enable restarting or rebooting the Device without physical intervention. Use this parameter only for troubleshooting scope. After device reboot the parameter value will be set to default. |
| 120 | Factory Reset | Reset to factory default settings and removed from the Z-Wave network. The parameter is Advanced and may be hidden under the Advanced tag. |
| 201 |  Serial Number 1 | This parameter contains a part of device’s serial number. |
| 202 | Serial Number 2 | This parameter contains a part of device’s serial number. |
| 203 | Serial Number 3 | This parameter contains a part of device’s serial number. |

### Parameter 17: Restore the O (O1) state after a power failure

This parameter determines if the on/off status is saved and restored for the load connected to O (O1) after a power failure.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Device saves last on/off status and restores it after a power failure |
| 1 | Device does not save on/off status and does not restore it after a pow |

The manufacturer defined default value is ```0``` (Device saves last on/off status and restores it after a power failure).

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 19: O (O1) Auto OFF with timer

If the load O (O1) is ON, you can schedule it to turn OFF automatically after the period of time defined in this parameter. The timer resets to zero each time the Device receives an ON command, either remotely (from the gateway or associated device) or lo
0 - Auto OFF Disabled

1 - 32535 = 1 - 32535 seconds or milliseconds – see Parameter no. 25. Set timer units to s or ms for O (O1) resolution 100ms
Values in the range 0 to 32535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_19_2``` and is of type ```INTEGER```.


### Parameter 20: O (O1) Auto ON with timer

If the load O (O1) is OFF, you can schedule it to turn ON automatically after the period of time defined in this parameter. The timer resets to zero each time the Device receives an OFF command, either remotely (from the gateway or associated device) or l
0 - Auto ON Disabled

1 - 32535 = 1 - 32535 seconds or milliseconds – see Parameter no. 25. Set timer units to s or ms for O (O1) resolution 100ms
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
0 – timer set in seconds

1 – timer set in milliseconds
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_25_1``` and is of type ```INTEGER```.


### Parameter 36: O (O1) Power report on change - percentage

This parameter determines the minimum change in consumed power that will result in sending a new report to the gateway.
0 - reports are disabled

1-100 (1-100%) - change in power

NOTE: Regardless of the power consumption change in percentage, the report will not be sent more frequently than defined by Parameter No. 39.
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_36_1``` and is of type ```INTEGER```.


### Parameter 39: Minimum time between reports (O) O1

This parameter determines the minimum time that must elapse before a new power report on O (O1) is sent to the gateway.
0 - reports are disabled

1-120 (1-120s) - report interval

NOTE: This Parameter is in relation to Parameter No. 36.

NOTE: Setting the value to less than 30s can cause the Z-Wave network congestion state (slow Device response and decreased network stability).
Values in the range 0 to 120 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_39_1``` and is of type ```INTEGER```.


### Parameter 105: LED Signalisation intensity

In Wave 1, Wave 1PM and Wave 2PM, Plug US, Plug UK, this parameter will be implemented in 2024. This parameter determines the intensity of the LED on the Device. Some Devices have RGB LEDs and some have Blue/Red LEDs, but all are dimmable.
0-100 (0-100%, every 1%)
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_105_1``` and is of type ```INTEGER```.


### Parameter 117: Remote Device reboot

This parameter enable restarting or rebooting the Device without physical intervention. Use this parameter only for troubleshooting scope. After device reboot the parameter value will be set to default.
0 - function inactive

1 - Remote device reboot
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_117_1``` and is of type ```INTEGER```.


### Parameter 120: Factory Reset

Reset to factory default settings and removed from the Z-Wave network. The parameter is Advanced and may be hidden under the Advanced tag.
0 - No action

1 - Factory reset

After reset is performed, the parameter value is automatically set to 0.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_120_4``` and is of type ```INTEGER```.


### Parameter 201:  Serial Number 1

This parameter contains a part of device’s serial number.
0x00000000 - 0x7FFFFFFFThis is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_201_4``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 202: Serial Number 2

This parameter contains a part of device’s serial number.
0x00000000 - 0x7FFFFFFFThis is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_202_4``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 203: Serial Number 3

This parameter contains a part of device’s serial number.
0x00000000 - 0x7FFFFFFFThis is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_203_4``` and is of type ```INTEGER```.
This is a read only parameter.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Wave Plug S EU supports 2 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Lifeline group
"Lifeline group" sends to the controlling device it's command class notifications and or command class reports when said command classes are triggered. Max. 9 nodes are allowed

Association group 1 supports 9 nodes.

### Group 2: O1 - Basic On/Off

It is assigned to output O (O1) (uses Basic command class).
Triggered by O (O1). Supports the following command classes:

BASIC_SET : set On / Off state at the associated device

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

* [Device Manual](https://opensmarthouse.org/zwavedatabase/1656/reference/Shelly_Wave_Plug_S_EU_V2_B2453_Print.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1656).
