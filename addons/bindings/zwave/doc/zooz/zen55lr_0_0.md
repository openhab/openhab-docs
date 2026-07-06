---
layout: documentation
title: ZEN55 LR - ZWave
---

{% include base.html %}

# ZEN55 LR DC Signal Sensor (Smoke and CO Detector Bridge)
This describes the Z-Wave device *ZEN55 LR*, manufactured by *[Zooz](http://www.getzooz.com/)* with the thing type UID of ```zooz_zen55lr_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![ZEN55 LR product image](https://opensmarthouse.org/zwavedatabase/1593/image/)


The ZEN55 LR supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

  * Z-Wave alerts from low-voltage trigger signals
  * Connect to smoke or CO detectors to monitor activity
  * 120 V relay to control a security siren or lights
  * Installs in the box with the last smoke detector in series
  * 800 series Z-Wave chip for better range and faster control
  * Z-Wave Long Range for ultra reliable no-mesh communication
  * Advanced settings to customize the device’s behavior
  * Built-in Z-Wave signal repeater for boosted communication
  * SmartStart and S2 Authenticate Security for a safer network

### Inclusion Information

  1. Initiate inclusion (pairing) in the app (or web interface).
  2. Tap the Z-WAVE button 3 times quickly if using traditional Z-Wave inclusion.
  3. The LED indicator will blink green to signal communication and turn green for 2 seconds if inclusion is successful or turn red for 2 seconds if the pairing attempt fails.

### Exclusion Information

  1. Bring your Z-Wave gateway (hub) close to the relay if possible
  2. Put the Z-Wave hub into exclusion mode (not sure how to do that? ask@getzooz.com)
  3. Click the on the relay 3 times quickly (the Z-Wave button LED indicator will start blinking green)
  4. Your hub will confirm exclusion, the LED indicator on the relay will turn green for 2 seconds, and the device will disappear from your controller's device list.

### General Usage Information



## Channels

The following table summarises the channels available for the ZEN55 LR -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Alarm (smoke) | alarm_smoke | alarm_smoke | Smoke | Switch | 
| Alarm (CO) | alarm_co | alarm_co |  | Switch | 

### Alarm (smoke)
Indicates if a smoke is triggered.

The ```alarm_smoke``` channel is of type ```alarm_smoke``` and supports the ```Switch``` item and is in the ```Smoke``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (CO)
Indicates if the carbon monoxide alarm is triggered.

The ```alarm_co``` channel is of type ```alarm_co``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 9 configuration parameters available in the ZEN55 LR.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | LED Indicator | Enable or disable the LED indicator to reflect the current on/off status of the connected load (LED on when the load is on, LED off when the load is off). |
| 2 | Relay Alarm Trigger | Use this parameter to automatically trigger the relay to turn the connected load on when alarm is detected on the input (signal) side. |
| 3 | Auto Turn-Off Timer | Use this parameter to set the time after which you want the device connected to the relay to automatically turn off once it has been turned on. The number entered as value corresponds to the number of seconds. |
| 4 | Auto Turn-Off Timer | Use this parameter to set the time after which you want the device connected to the relay to automatically turn on once it has been turned off. The number entered as value corresponds to the number of seconds. |
| 5 | On/Off Status After Power Failure | Set the on/off status for the relay after power failure |
| 6 | Association Reports (Group 2) - Smoke Alarm | Decide when the device will send BASIC_SET commands to devices associated in Group 2 (Smoke Alarm). |
| 7 | Association Reports (Group 3) - CO Alarm | Decide when the device will send BASIC_SET commands to devices associated in Group 3 (CO Alarm). |
| 8 | Disable the Sensors or Relay | After changing this parameter and re-inclusion, the device will show up as a switch, which can be controlled via Z-Wave. |
| 9 | Relay Status Reports | Decide what type of reports the relay part of the device sends back to the hub when it changes status. |

### Parameter 1: LED Indicator

Enable or disable the LED indicator to reflect the current on/off status of the connected load (LED on when the load is on, LED off when the load is off).

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | LED Indicator disabled |
| 1 | LED Indicator enabled (default) |

The manufacturer defined default value is ```1``` (LED Indicator enabled (default)).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Relay Alarm Trigger

Use this parameter to automatically trigger the relay to turn the connected load on when alarm is detected on the input (signal) side.

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | auto-trigger disabled |
| 1 | auto-trigger enabled (default) |

The manufacturer defined default value is ```1``` (auto-trigger enabled (default)).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Auto Turn-Off Timer

Use this parameter to set the time after which you want the device connected to the relay to automatically turn off once it has been turned on. The number entered as value corresponds to the number of seconds.
0 – timer disabled (default); 1 – 4294967295
Values in the range 0 to 4294967294 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_3_4``` and is of type ```INTEGER```.


### Parameter 4: Auto Turn-Off Timer

Use this parameter to set the time after which you want the device connected to the relay to automatically turn on once it has been turned off. The number entered as value corresponds to the number of seconds.
0 – timer disabled (default); 1 – 4294967295
Values in the range 0 to 4294967294 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_4_4``` and is of type ```INTEGER```.


### Parameter 5: On/Off Status After Power Failure

Set the on/off status for the relay after power failure

The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | forced to OFF (regardless of state prior to power outage) |
| 1 | forced to ON (regardless of state prior to power outage) |
| 2 | remembers and restores on/off status after power failure (default) |

The manufacturer defined default value is ```2``` (remembers and restores on/off status after power failure (default)).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Association Reports (Group 2) - Smoke Alarm

Decide when the device will send BASIC_SET commands to devices associated in Group 2 (Smoke Alarm).

The following option values may be configured, in addition to values in the range 0 to 5 -:

| Value  | Description |
|--------|-------------|
| 0 | BASIC\_SET (0xFF) ON when smoke is detected, BASIC\_SET (0x00) OFF when |
| 1 | BASIC\_SET (0x00) OFF when smoke is detected, BASIC\_SET (0xFF) ON when |
| 2 | BASIC_SET (0xFF) ON when smoke is detected, no commands sent when smok |
| 3 | BASIC_SET (0x00) OFF when smoke is detected, no commands sent when smo |
| 4 | BASIC_SET (0x00) OFF when smoke is not detected, no commands sent when |
| 5 | BASIC_SET (0xFF) ON when smoke is not detected, no commands sent when |

The manufacturer defined default value is ```0``` (BASIC_SET (0xFF) ON when smoke is detected, BASIC_SET (0x00) OFF when ).

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Association Reports (Group 3) - CO Alarm

Decide when the device will send BASIC_SET commands to devices associated in Group 3 (CO Alarm).

The following option values may be configured, in addition to values in the range 0 to 5 -:

| Value  | Description |
|--------|-------------|
| 0 | BASIC\_SET (0xFF) ON when CO is detected, BASIC\_SET (0x00) OFF when CO |
| 1 | BASIC\_SET (0x00) OFF when CO is detected, BASIC\_SET (0xFF) ON when CO |
| 2 | BASIC_SET (0xFF) ON when CO is detected, no commands sent when CO is n |
| 3 | BASIC_SET (0x00) OFF when CO is detected, no commands sent when CO is |
| 4 | BASIC_SET (0x00) OFF when CO is not detected, no commands sent when CO |
| 5 | BASIC_SET (0xFF) ON when CO is not detected, no commands sent when CO |

The manufacturer defined default value is ```0``` (BASIC_SET (0xFF) ON when CO is detected, BASIC_SET (0x00) OFF when CO ).

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Disable the Sensors or Relay

After changing this parameter and re-inclusion, the device will show up as a switch, which can be controlled via Z-Wave.
NOTE: You need to exclude and re-include the device to your hub or re-configure (re-interview) the device if the value of this setting is changed.
The following option values may be configured, in addition to values in the range 1 to 7 -:

| Value  | Description |
|--------|-------------|
| 1 | Enable smoke and CO sensor endpoints and disable the relay switch endp |
| 2 | Enable the CO sensor endpoint and disable the smoke sensor and relay e |
| 3 | Enable the smoke sensor endpoint and disable the CO sensor and relay e |
| 4 | Enable the smoke sensor, CO sensor, and the relay endpoints (all endpo |
| 5 | Enable the relay and CO sensor endpoints and disable the smoke sensor |
| 6 | Enable the relay and smoke sensor endpoints and disable the CO sensor |
| 7 | Enable the relay endpoint and disable the CO sensor and smoke sensor e |

The manufacturer defined default value is ```1``` (Enable smoke and CO sensor endpoints and disable the relay switch endp).

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Relay Status Reports

Decide what type of reports the relay part of the device sends back to the hub when it changes status.

The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | binary switch report for Z-Wave control and input control (from the DC |
| 1 | binary switch report for Z-Wave control and basic report for input con |
| 2 | basic report for Z-Wave control and input control (from the DC signal |

The manufacturer defined default value is ```0``` (binary switch report for Z-Wave control and input control (from the DC).

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZEN55 LR supports 4 association groups.

### Group 1: Group 1 - Lifeline

Send BASIC REPORT and NOTIFICATION REPORT to Group 1

Association group 1 supports 5 nodes.

### Group 2: Group 2 - Smoke Alarm

Send BASIC SET command

Association group 2 supports 5 nodes.

### Group 3: Group 3 - CO Alarm

Send BASIC SET command

Association group 3 supports 5 nodes.

### Group 4: Group 4

Send BASIC SET command

Association group 4 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
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
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [manual](https://opensmarthouse.org/zwavedatabase/1593/reference/zooz-800-lr-dc-signal-sensor-zen55-manual.pdf)
* [parameters](https://opensmarthouse.org/zwavedatabase/1593/reference/zooz-800-lr-dc-signal-sensor-zen55-parameters.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1593).
