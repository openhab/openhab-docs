---
layout: documentation
title: HKZW_SO03 - ZWave
---

{% include base.html %}

# HKZW\_SO03 Smart Plug
This describes the Z-Wave device *HKZW_SO03*, manufactured by *[Hank](http://www.hank-tech.com/)* with the thing type UID of ```hank_hkzwso03_00_000```.

The device is in the category of *Power Outlet*, defining Small devices to be plugged into a power socket in a wall which stick there.

![HKZW_SO03 product image](https://www.cd-jackson.com/zwave_device_uploads/677/677_default.jpg)


The HKZW_SO03 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

WELL DONE!  
 You have picked the finest solution for your smart home, congratulations!  
 Now it's time to enjoy these great features of your new Smart Plug:  
\- Wireless control of floor lamps and small appliances  
\- Energy monitoring in live mode or over time (your Z-Wave gateway needs to support this feature)  
\- Scene inclusion for custom automation scenarios when included to a Z-Wave gateway controller  
\- LED indicator displaying Z-Wave signal strength and power usage  
\- Security enabled Z-Wave device with AES signal encryption (requires a security enabled gateway controller for full functionality)  
\- Z-Wave Plus with improved 500 chip for faster and safer wireless communication  
\- Built-in range extender for a stronger, more reliable network  
\- 2 USB charging ports for your smart phone or tablet (no Z-Wave functionality)  
\- Built-in overload protection in Z-Wave outlet and USB ports

SPECIFICATIONS  
 Model Number: ZEN06  
 Z-Wave Signal Frequency: 908.42 MHz

Power: 110V, 60Hz  
 Maximum Load: 15A, 1800W  
 USB Charging Port Power: 1A and 2.4A Operating Temperature: 14 – 104 F Range: Up to 130 feet line of sight Installation and Use: Indoor only Dimensions: 4” x 2.5” x 1.2”  
Weight: 7oz

Z-WAVE COMMAND CLASSES  
 This device requires the following command classes to be supported and recognized by your Z-Wave controller:  
 COMMAND\_CLASS\_ALLSWITCH  
 COMMAND\_CLASS\_ASSOCIATION  
 COMMAND\_CLASS\_ASSOCIATION\_GROUP\_INFORMATION  
 COMMAND\_CLASS\_BASIC  
 COMMAND\_CLASS\_CONFIGURATION  
 COMMAND\_CLASS\_DEVICE\_RESET\_LOCAL  
 COMMAND\_CLASS\_FIRMWARE\_UPDATE\_MD  
 COMMAND\_CLASS\_MANUFACTURER\_SPECIFIC  
 COMMAND\_CLASS\_METER  
 COMMAND\_CLASS\_POWERLEVEL  
 COMMAND\_CLASS\_SCENE\_ACTIVATION COMMAND\_CLASS\_SCENE\_ACTUATOR\_CONFIGURATION  
 COMMAND\_CLASS\_SECURITY  
 COMMAND\_CLASS\_SWITCH\_BINARY  
 COMMAND\_CLASS\_VERSION  
 COMMAND\_CLASS\_ZWAVEPLUS\_INFO

### Inclusion Information

Z-WAVE INCLUSION

Auto Z-Wave Inclusion  
 1. Put your Z-Wave controller in inclusion mode  
 2. Plug the smart plug into a grounded receptacle located within 3 feet from your Z-Wave gateway controller  
 3. LED indicator will flash blue  
 4. A new on / off device should be recognized by your Z-Wave controller

Manual Z-Wave Inclusion  
 1. Plug the smart plug into a grounded receptacle located within 3 feet from your Z-Wave gateway controller  
 2. Put your Z-Wave controller in inclusion mode  
 3. Press and release the Z-Wave button 3 TIMES QUICKLY  
 4. LED indicator will flash blue

5\. A new on / off device should be recognized by your Z-Wave controller

Secure Z-Wave Inclusion  
 1. Plug the smart plug into a grounded receptacle located within 3 feet from your Z-Wave gateway controller  
 2. Put your Z-Wave controller in secure inclusion mode  
 3. Press and HOLD the Z-Wave button for at least 3 seconds  
 4. LED indicator will flash green  
 5. LED indicator will turn solid green once the inclusion is completed. Please allow 5 minutes for configuration. DO NOT press any buttons or move the device during that time  
 6. A new secure on / off device should be recognized by your Z-Wave controller

### Exclusion Information

Z-WAVE EXCLUSION

1\. Plug the smart plug into a grounded receptacle located within 3 feet from your Z-Wave gateway controller  
 2. Put your Z-Wave controller in exclusion mode  
 3. Press and release the Z-Wave button 3 TIMES QUICKLY

4\. LED indicator will flash orange  
 5. The smart plug should disappear from your controller's device list and LED indicator will remain solid orange for a few seconds to indicate exclusion

Please repeat the process following all steps carefully if the first attempt is unsuccessful

## Channels

The following table summarises the channels available for the HKZW_SO03 -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 
| Scene Number | scene_number |  | Number | 
| Electric meter (kWh) | meter_kwh | Energy | Number | 
| Electric meter (volts) | meter_voltage | Energy | Number | 
| Electric meter (watts) | meter_watts | Energy | Number | 
| Electric meter (amps) | meter_current | Energy | Number | 

### Switch

Switch the power on and off.

The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Scene Number

Triggers when a scene button is pressed.

The ```scene_number``` channel supports the ```Number``` item.

### Electric meter (kWh)

Indicates the energy consumption (kWh).

The ```meter_kwh``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (volts)

Indicates the instantaneous voltage.

The ```meter_voltage``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)

Indicates the instantaneous power consumption.

The ```meter_watts``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (amps)

Indicates the instantaneous current consumption.

The ```meter_current``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.



## Device Configuration

The following table provides a summary of the 4 configuration parameters available in the HKZW_SO03.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 20 | Overload Protection | Overload Protection |
| 21 | On/Off Status Recovery After Power Failure | On/Off Status Recovery After Power Failure |
| 24 | On/Off Status Change Notifications | On/Off Status Change Notifications |
| 27 | Led Indicator Control | Led Indicator Control |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 20: Overload Protection

Overload Protection
16.5A for over 5 seconds when this setting is enabled. We DO NOT recommend changing this parameter’s value as it may result in device damage and malfunction.

Values: 0 – Disabled; 1 – Enabled (default).

Size: 1 byte dec.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_20_1``` and is of type ```INTEGER```.


### Parameter 21: On/Off Status Recovery After Power Failure

On/Off Status Recovery After Power Failure
Parameter 21: Choose the recovery state for your Smart Plug if power outage occurs.

Values: 0 – Smart Plug remembers the status prior to power outage and turns back to it

(default); 1 – Smart Plug automatically turns ON once power is restored (it does not

remember the status prior to power outage); 2 – Smart Plug automatically turns OFF once

power is restored (it does not remember the status prior to power outage);

Size: 1 byte dec.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_21_1``` and is of type ```INTEGER```.


### Parameter 24: On/Off Status Change Notifications

On/Off Status Change Notifications
Parameter 24: Your Smart Plug will automatically send a notification to the controller and

other associated devices if its status changes from on to off or the other way round. Choose

when you want it to send the report.

Values: 0 – disabled (it will not send status change notifications); 1 – sends notification if

status is changed manually or remotely via Z-Wave (default); 2 – sends notification ONLY if

status is changed manually by pressing and releasing the Z-Wave button on the Smart Plug;

Size: 1 byte dec.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_24_1``` and is of type ```INTEGER```.


### Parameter 27: Led Indicator Control

Led Indicator Control
Parameter 27: You can choose how the LED indicator displays power consumption on thesmart plug

Values: 0 – LED indicator will display power consumption whenever the device is plugged in

(LED stays on at all times – default setting); 1 – LED indicator will display the level of power

consumption for 5 seconds only whenever the device is turned on or off (LED indicator will

stay off for most of the time)

Size: 1 byte dec.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_27_1``` and is of type ```INTEGER```.

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

The device does not support associations.
## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_SCENE_ACTUATOR_CONF_V1| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [Zooz ZEN06 Manual](https://www.cd-jackson.com/zwave_device_uploads/677/Zooz-Z-Wave-Smart-Plug-ZEN06-Manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/677).
