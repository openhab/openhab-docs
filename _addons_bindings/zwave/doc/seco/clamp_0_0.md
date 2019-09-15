---
layout: documentation
title: Zwave Clamp - ZWave
---

{% include base.html %}

# Zwave Clamp Clamp Energy Meter
This describes the Z-Wave device *Zwave Clamp*, manufactured by *[Seco](http://www.seco.com/)* with the thing type UID of ```seco_clamp_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![Zwave Clamp product image](https://www.cd-jackson.com/zwave_device_uploads/569/569_default.png)


The Zwave Clamp supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The Wireless Energy Meter performs real-time measurement of power, energy, voltage, and current, and transmits them wirelessly to a central controller.

### Inclusion Information

Press the WEM button for about 1 second.

WEM enters the “Learning” state and the LED changes blinking pattern.

When the learning phase ends successfully, WEM enters the “Synchronizing” state, and then the “Joined, Comm. Ok” state.

### Exclusion Information

Press the WEM button for about 3 seconds.

WEM enters the “Leaving” state, and waits for the controller to acknowledge its exclusion.

When the exclusion process is complete, WEM goes into the “Idle” state.

## Channels

The following table summarises the channels available for the Zwave Clamp -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Electric meter (amps) | meter_current | meter_current | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number | 
| Clock Time Offset | time_offset | time_offset | Temperature | Number | 

### Electric meter (amps)
Indicates the instantaneous current consumption.

The ```meter_current``` channel is of type ```meter_current``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (volts)
Indicates the instantaneous voltage.

The ```meter_voltage``` channel is of type ```meter_voltage``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Clock Time Offset
Provides the current time difference for the devices time.

The ```time_offset``` channel is of type ```time_offset``` and supports the ```Number``` item and is in the ```Temperature``` category.



## Device Configuration

The following table provides a summary of the 8 configuration parameters available in the Zwave Clamp.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 2 | MEAS_PERIOD | MEAS_PERIOD |
| 3 | MAX_REP_INTERVAL | MAX\_REP\_INTERVAL |
| 4 | RES_ACTIVE_POWER | RES\_ACTIVE\_POWER |
| 5 | RES_RMS_VOLTAGE | RES\_RMS\_VOLTAGE |
| 6 | RES_RMS_CURRENT | RES\_RMS\_CURRENT |
| 8 | CLAMP_REVERSED | CLAMP_REVERSED |
| 9 | ENABLE_CRC16 | ENABLE_CRC16 |
| 10 | AVG_PERIOD | AVG_PERIOD |

### Parameter 2: MEAS_PERIOD

MEAS_PERIOD
MEAS\_PERIOD represents the minimum reporting interval, i.e. 1/MEAS\_PERIOD is the maximum reporting frequency. WEM checks for changes in the line measures every MEAS_PERIOD. If there are meaningful changes, a report is sent to the controller.
Values in the range 30 to 120 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: MAX_REP_INTERVAL

MAX\_REP\_INTERVAL
**Units of 10 sec**

MAX\_REP\_INTERVAL is the maximum time that can elapse without sending a report. If no meaningful events occur, WEM sends one measurement every MAX\_REP\_INTERVAL seconds. Notice that, since the check is performed every MEAS\_PERIOD, the reporting interval is rounded to the smallest multiple integer of MEAS\_PERIOD (e.g. MEAS\_PERIOD = 45, MAX\_REP_INTERVAL = 12, reports are sent every 135 s).
Values in the range 3 to 60 may be set.

The manufacturer defined default value is ```6```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: RES_ACTIVE_POWER

RES\_ACTIVE\_POWER
The minimum quantity (resolution) that triggers a report
Values in the range 1 to 100 may be set.

The manufacturer defined default value is ```4```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: RES_RMS_VOLTAGE

RES\_RMS\_VOLTAGE
**Units of 100 mV**

The minimum quantity (resolution) that triggers a report
Values in the range 1 to 1000 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_5_2``` and is of type ```INTEGER```.


### Parameter 6: RES_RMS_CURRENT

RES\_RMS\_CURRENT
**Units of 10 mA**

The minimum quantity (resolution) that triggers a report
Values in the range 1 to 1000 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_6_2``` and is of type ```INTEGER```.


### Parameter 8: CLAMP_REVERSED

CLAMP_REVERSED
CLAMP\_REVERSED is a read-only parameter that the controller can query to learn about the current placement of the clamp. During the measurement phase, WEM checks whether the clamp has been placed correctly or reversed (with regard to phase rotation). In the latter case, WEM notifies the user with a different blink pattern and stores this information into the CLAMP\_REVERSED parameter.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Clamp placed Correctly |
| 1 | Clamp is REVERSED |
| 255 | Could not detect position |

The manufacturer defined default value is ```255``` (Could not detect position).

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 9: ENABLE_CRC16

ENABLE_CRC16
ENABLE\_CRC16 parameter provides for an extra layer of redundancy in order to protect low bit rate transmissions against radio channel errors. This applies to the reports and frames sent spontaneous by WEM. Requests from the controller are always answered as asked. WEM will send CRC16 encapsulated frames to the associated node if this has proved to support it and the ENABLE\_CRC16 parameter is set to 1. Otherwise, reports will be sent with no extra CRC16 encapsulation.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | False |
| 1 | True |

The manufacturer defined default value is ```1``` (True).

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: AVG_PERIOD

AVG_PERIOD
**Units of 5 seconds**

AVG\_PERIOD determines the time window used to compute an average over the line readings. Each unit of AVG\_PERIOD is worth 5 seconds. If AVG\_PERIOD = 0 no average is computed and the last sample is returned. Note that the maximum average window coincides with the minimum value of MAX\_REP_INTERVAL. Also note that a delay of up to the average window can be introduced in returning the measurements (each measurement is returned only when ready).
Values in the range 0 to 6 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Zwave Clamp supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_METER_TBL_MONITOR_V1| |
| COMMAND_CLASS_CRC_16_ENCAP_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_TIME_V1| |
| COMMAND_CLASS_TIME_PARAMETERS_V1| |

### Documentation Links

* [Manual](https://www.cd-jackson.com/zwave_device_uploads/569/72027101-UM-01-meter-user-manual-v1-0.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/569).
