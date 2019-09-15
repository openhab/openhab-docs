---
layout: documentation
title: ZMNHXD - ZWave
---

{% include base.html %}

# ZMNHXD Qubino 3-Phase Smart Meter
This describes the Z-Wave device *ZMNHXD*, manufactured by *[Goap](http://www.qubino.com/)* with the thing type UID of ```qubino_zmnhxd_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![ZMNHXD product image](https://www.cd-jackson.com/zwave_device_uploads/900/900_default.png)


The ZMNHXD supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Qubino 3-Phase Smart Meter is used for energy measurements in three-phase electrical power network. It reduces energy consumption, lowers your utility

**FACTORY RESET**

  1. Connect the device to the power supply
  2. Press and hold the S service button between 6 seconds and 20 seconds
  3. Device will be removed from you network

**LED1 (Green)**

  * LED is ON = Power ON, module is included
  * LED is 1s OFF, 1s ON = Power ON, module is excluded

**LED2 (Yellow)**

  1. External IR relay enabled only 
      * LED is ON = External IR relay is turned ON
      * LED is OFF = External IR relay is turned OFF
      * LED is 0.5s OFF, 0.5s ON = IR communication error
  2. External TRIAC relay enabled only 
      * LED is ON = External IR relay is turned ON
      * LED is OFF = External IR relay is turned OFF
  3. Both TRIAC an IR enabled 
      * LED is ON = External IR relay is turned ON
      * LED is OFF = External IR relay is turned OFF
      * LED is 0.5s OFF, 0.5s ON = IR communication error
  4. External IR relay disabled 
      * LED is ON = modbus packet is sent
      * LED is OFF = modbus packet is received

### Inclusion Information

**AUTOMATICALLY ADDING THE DEVICE TO A Z-WAVE NETWORK (AUTO INCLUSION)**

  1. Enable add/remove mode on your Z-Wave gateway (hub)
  2. Automatic selection of secure/insecure inclusion
  3. The device can be automatically added to a Z-Wave network during the first 2 minutes
  4. Connect the device to the power supply
  5. Auto-inclusion will be initiated within 5 seconds of connection to the power supply and the device will automatically enroll in your network

NOTE: For S2 inclusion please check chapter – »16. Z-Wave Security«.

**MANUALLY ADDING THE DEVICE TO A Z-WAVE NETWORK (MANUAL INCLUSION)**

  1. Connect the device to the power supply
  2. Enable add/remove mode on your Z-Wave gateway (hub)
  3. Toggle the Service button S between 0.2 and 6 seconds
  4. A new multi-channel device will appear on your dashboard

### Exclusion Information

**REMOVAL FROM A ZWAVE NETWORK (Z-WAVE EXCLUSION)**

  1. Connect the device to the power supply
  2. Make sure the device is within direct range of your Z-Wave gateway (hub) or use a hand-held Z-Wave remote to perform exclusion
  3. Enable add/remove mode on your Z-Wave gateway (hub)
  4. Press and hold the S service button between 0.2 and 6 seconds
  5. The device will be removed from your network but custom configuration parameters will not be erased

### General Usage Information

**Installation**

Before installing the device, please read the following carefully and follow the instructions exactly:

**Danger of electrocution!**

Installation of this device requires a great degree of skill and may be performed only by a licensed and qualified electrician. Please keep in mind that even when the device is turned off, voltage may still be present in the device’s terminals.

**Note!**

Do not connect the device to loads exceeding the recommended values. Connect the device exactly as shown in the provided diagrams. Improper wiring may be dangerous and result in equipment damage.

Electrical installation must be protected by directly associated overcurrent protection fuse with rated current up to 65A, it must be used according to wiring diagram to achieve appropriate overload protection of the device.  
  
The installation process, tested and approved by professional electricians, consists of the following simple steps:

  * Step 1 – Turn OFF the fuse:  
    To prevent electrical shock and/or equipment damage, disconnect electrical power at the main fuse or circuit breaker before installation and maintenance.  
    Be aware that even if the circuit breaker is off, some voltage may remain in the wires — before proceeding with the installation, be sure no voltage is present in the wiring.  
    Take extra precautions to avoid accidentally turning the device on during installation.
  * Step 2 – Installing the device:  
    Connect the device exactly according to the diagrams shown below

## Channels

The following table summarises the channels available for the ZMNHXD -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Electric meter (power factor) | meter_powerfactor | meter_powerfactor | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (kVAh) | meter_kvah | meter_kvah | Energy | Number | 
| Electric meter (power factor) 1 | meter_powerfactor1 | meter_powerfactor | Energy | Number | 
| Electric meter (watts) 1 | meter_watts1 | meter_watts | Energy | Number | 
| Electric meter (kWh) 1 | meter_kwh1 | meter_kwh | Energy | Number | 
| Electric meter (kVAh) 1 | meter_kvah1 | meter_kvah | Energy | Number | 
| Electric meter (power factor) 2 | meter_powerfactor2 | meter_powerfactor | Energy | Number | 
| Electric meter (amps) 2 | meter_current2 | meter_current | Energy | Number | 
| Electric meter (watts) 2 | meter_watts2 | meter_watts | Energy | Number | 
| Electric meter (volts) 2 | meter_voltage2 | meter_voltage | Energy | Number | 
| Electric meter (power factor) 3 | meter_powerfactor3 | meter_powerfactor | Energy | Number | 
| Electric meter (amps) 3 | meter_current3 | meter_current | Energy | Number | 
| Electric meter (watts) 3 | meter_watts3 | meter_watts | Energy | Number | 
| Electric meter (volts) 3 | meter_voltage3 | meter_voltage | Energy | Number | 
| Electric meter (power factor) 4 | meter_powerfactor4 | meter_powerfactor | Energy | Number | 
| Electric meter (amps) 4 | meter_current4 | meter_current | Energy | Number | 
| Electric meter (watts) 4 | meter_watts4 | meter_watts | Energy | Number | 
| Electric meter (volts) 4 | meter_voltage4 | meter_voltage | Energy | Number | 

### Electric meter (power factor)
Indicates the instantaneous power factor.

The ```meter_powerfactor``` channel is of type ```meter_powerfactor``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kVAh)
Indicates the energy consumption (kVAh).

The ```meter_kvah``` channel is of type ```meter_kvah``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (power factor) 1
Indicates the instantaneous power factor.

The ```meter_powerfactor1``` channel is of type ```meter_powerfactor``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts) 1
Indicates the instantaneous power consumption.

The ```meter_watts1``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh) 1
Indicates the energy consumption (kWh).

The ```meter_kwh1``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kVAh) 1
Indicates the energy consumption (kVAh).

The ```meter_kvah1``` channel is of type ```meter_kvah``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (power factor) 2
Indicates the instantaneous power factor.

The ```meter_powerfactor2``` channel is of type ```meter_powerfactor``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (amps) 2
Indicates the instantaneous current consumption.

The ```meter_current2``` channel is of type ```meter_current``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts) 2
Indicates the instantaneous power consumption.

The ```meter_watts2``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (volts) 2
Indicates the instantaneous voltage.

The ```meter_voltage2``` channel is of type ```meter_voltage``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (power factor) 3
Indicates the instantaneous power factor.

The ```meter_powerfactor3``` channel is of type ```meter_powerfactor``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (amps) 3
Indicates the instantaneous current consumption.

The ```meter_current3``` channel is of type ```meter_current``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts) 3
Indicates the instantaneous power consumption.

The ```meter_watts3``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (volts) 3
Indicates the instantaneous voltage.

The ```meter_voltage3``` channel is of type ```meter_voltage``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (power factor) 4
Indicates the instantaneous power factor.

The ```meter_powerfactor4``` channel is of type ```meter_powerfactor``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (amps) 4
Indicates the instantaneous current consumption.

The ```meter_current4``` channel is of type ```meter_current``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts) 4
Indicates the instantaneous power consumption.

The ```meter_watts4``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (volts) 4
Indicates the instantaneous voltage.

The ```meter_voltage4``` channel is of type ```meter_voltage``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.



## Device Configuration

The following table provides a summary of the 8 configuration parameters available in the ZMNHXD.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 7 | Input switch (i1) function selection | Available configuration parameters for input switch I1 |
| 40 | Reporting on power change | This parameter is valid for Active Powers Total, Phase1, Phase2 and Phase3. |
| 42 | Reporting on time interval | Energy report time intervals |
| 43 | Other Values - Reporting on time interval | Energy reports for Voltage, Current, Total Power Factor, Total Reactive Power |
| 100 | Enable / Disable External IR relay (BICOM) | Enable / Disable External IR relay (BICOM) |
| 101 | Enable / Disable External relay (IKA) | Enable / Disable External relay (IKA) |
| 106 | maximum power threshold of all phases together | maximum power threshold of all phases together |
| 112 | Power threshold – Delay before power on | Power threshold – Delay before power on |

### Parameter 7: Input switch (i1) function selection

Available configuration parameters for input switch I1
  * 0 – disabled
  * 2 – IR external relay control – mono stable push button
  * 3 – IR external relay control – bi-stable switch
  * 4 – External relay control – mono stable push button
  * 5 – External relay control – bi-stable switch

**Note!**

  * By setting the parameter 7 to value 4 or 5 the external Relay (IKA) is working with input switch without enabling parameter no. 101
  * To make the IR Relay (BICOM) responsive to the digital input, in addition to the setting of the configuration parameter 7, parameter 100 must also be set to value 1 or 2.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured, in addition to values in the range 0 to 5 -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 2 | IR ext relay ctrl – mono stable push btn |
| 3 | IR external relay control – bi-stable switch |
| 4 | External relay control – mono stable push button |
| 5 | External relay control – bi-stable switch |

The manufacturer defined default value is ```0``` (disabled).

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 40: Reporting on power change

This parameter is valid for Active Powers Total, Phase1, Phase2 and Phase3.
Available configuration parameters (data type is 1 Byte DEC)

  * Default value 50
  * 0 – reporting disabled
  * 1-100 = 1% - 100% reporting enabled. Power report is send only when actual power in Watts (in real time changes for more than set percentage comparing to previous Active Power, step is 1%.

**NOTE:** if power change is less than 5 W, the report is not send (pushed).  
**NOTE:** Device is measuring also some disturbances even if on the output is no load. To avoid disturbances:

  * If measured Active Power (W) is below e.g. 5W-> the reported value in this case is 0WThis is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured, in addition to values in the range 0 to 100 -:

| Value  | Description |
|--------|-------------|
| 0 | reporting disabled |

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_40_1``` and is of type ```INTEGER```.


### Parameter 42: Reporting on time interval

Energy report time intervals
This parameter is currently valid only for Active Energy Total Import/Export (kWh), Reactive  
Energy Total (kvarh), Total Energy (kVAh)

**Available configuration parameters (data type is 2 Byte DEC)**

  * Default value 600 (600 seconds - 10 minutes)
  * 0 – reporting disabled
  * 600-65536 = 600 (600 seconds – 65536 seconds). Reporting enabled. Report is send with the time interval set by entered value.

**Note:** Device is reporting only if there was a change of 0.1 in Energy

**Note:** In the future will be possible to measure and report also Active Energy on PH1, PH2 and PH3.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured, in addition to values in the range 600 to 65535 -:

| Value  | Description |
|--------|-------------|
| 0 | reporting disabled |

The manufacturer defined default value is ```600```.

This parameter has the configuration ID ```config_42_2``` and is of type ```INTEGER```.


### Parameter 43: Other Values - Reporting on time interval

Energy reports for Voltage, Current, Total Power Factor, Total Reactive Power
**Available configuration parameters (data type is 2 Byte DEC)**

  * Default value 600 (600 seconds - 10 minutes)
  * 0 – reporting disabled
  * 600-65536 = 600 (600 seconds – 65536 seconds). Reporting enabled. Report is sent with the time interval set by entered value.
  * Note: Device is reporting only if there was a changeThis is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured, in addition to values in the range 600 to 65535 -:

| Value  | Description |
|--------|-------------|
| 0 | reporting disabled |

The manufacturer defined default value is ```600```.

This parameter has the configuration ID ```config_43_2``` and is of type ```INTEGER```.


### Parameter 100: Enable / Disable External IR relay (BICOM)

Enable / Disable External IR relay (BICOM)
Available configuration parameters (data type is 1 Byte DEC):

  * default value 0
  * 0 – External IR relay disabled
  * 1 – External IR relay enabled and connected to all 3 Phases
  * 2 – External IR relay enabled and connected to a Phase 1

**NOTE1:** After parameter change, first exclude module (without setting parameters to default value) and then re include the module.

**NOTE 2:** If you don't have IR BICOM relay module mounted and you enable IR communication (parameter 100 is 1 or 2) there will be no valid IR relay state reported. It will be reported IR COMMUNICATION ERROR and LED2 will BLINK.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | External IR relay disabled |
| 1 | IR relay enabled for all 3 phases |
| 2 | IR relay enabled for Phase 1 |

The manufacturer defined default value is ```0``` (External IR relay disabled).

This parameter has the configuration ID ```config_100_1``` and is of type ```INTEGER```.


### Parameter 101: Enable / Disable External relay (IKA)

Enable / Disable External relay (IKA)
Available configuration parameters (data type is 1 Byte DEC):

  * default value 0
  * 0 – External relay disabled
  * 1 – External relay enabled and connected to Phase 2

**NOTE:** After parameter change, first exclude module (without setting parameters to default value) and then re include the module.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | External relay disabled |
| 1 | External relay enabled |

The manufacturer defined default value is ```0``` (External relay disabled).

This parameter has the configuration ID ```config_101_1``` and is of type ```INTEGER```.


### Parameter 106: maximum power threshold of all phases together

maximum power threshold of all phases together
External IR relay (BICOM) power threshold settings – maximum power of all phases together

This parameter defines a threshold when External IR relay is being turned off. (If Parameter no. 100 is set to the value 1 or 2)

Available configuration parameters (data type is 2 Byte  
DEC)

  * Default value 0
  * 0 – no function
  * 10-60000 – 10W-60000W

**NOTE:** Meter is capable of measuring max 3x65A!This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 60000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_106_2``` and is of type ```INTEGER```.


### Parameter 112: Power threshold – Delay before power on

Power threshold – Delay before power on
External IR relay/ External relay is turned off due to detected overload (as set by parameter 106&107) and remains off for a time, defined in this parameter. After that time, the output turns on to check, if the overload is still present.

Available configuration parameters (data type is 2 Byte DEC)

  * Default value 0 (disabled)
  * 0 – External IR relay/ External relay will not turn back on
  * 30 – 32535 = 30 s – 32535 s

**NOTE:** the delay time may be prolonged for more then 10s of the time set by the parameter.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured, in addition to values in the range 0 to 32535 -:

| Value  | Description |
|--------|-------------|
| 0 | External relay will not turn back on |

The manufacturer defined default value is ```0``` (External relay will not turn back on).

This parameter has the configuration ID ```config_112_2``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZMNHXD supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Lifeline group (reserved for communication with the gateway (hub))

Association group 1 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_METER_V3| Linked to BASIC|
| COMMAND_CLASS_CRC_16_ENCAP_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_METER_V3| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_METER_V3| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
#### Endpoint 3

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_METER_V3| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
#### Endpoint 4

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_METER_V3| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Extended Manual](https://www.cd-jackson.com/zwave_device_uploads/900/Qubino-3-Phase-Smart-Meter-PLUS-extended-manual-eng-3-3-2.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/900).
