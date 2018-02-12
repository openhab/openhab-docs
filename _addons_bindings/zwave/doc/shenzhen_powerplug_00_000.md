---
layout: documentation
title: Power Plug - ZWave
---

{% include base.html %}

# Power Plug Metered Wall Plug Switch

This describes the Z-Wave device *Power Plug*, manufactured by *Shenzhen Neo Electronics Co., Ltd* with the thing type UID of ```shenzhen_powerplug_00_000```. 

Metered Wall Plug Switch  


## Overview 

This Plug provides line voltage, current load, power consumption and energy

consumption measuring. 

**Voltage** – The Supply Power Voltage For Plug.

**Current** – The Current for the Electric Device Connect to Plug Consumption.

**Power** – Power Consumed by an Electric Device in an instant, unit: Watt (W).

**Energy** – Energy Consumed by an Electric Device through a Time Period. Most

commonly measured in Kilowatt-hours (kWh). One kilowatt-hour is Equal to One

Kilowatt of Power Consumed over a Period of One Hour, 1kWh = 1000Wh.0Wh.

  


### Inclusion Information 

1. Make sure the sensor is powered.

2. Set Z‐Wave controller or Z‐Wave gateway into inclusion mode (Refer to the controller or

gateway operating manual)

3. Press the button three times within 1.5 second, the device will enter inclusion mode. And the

LED will flash on and off with green alternately five times within 2 seconds.

  


### Exclusion Information 

1. Make sure the sensor is powered.

2. Set Z‐Wave controller or Z‐Wave gateway into exclusion mode (Refer to the controller or

gateway operating manual)

3. Press the button three times within 1.5 second, the device will enter exclusion mode. And

the LED will flash on and off with yellow alternately five times within 2 seconds.


## Channels
The following table summarises the channels available for the Power Plug Metered Wall Plug Switch.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Electric meter (amps) | meter_current | meter_current | Energy | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number |
| Alarm (power) | alarm_power | alarm_power | Door | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the Power Plug Metered Wall Plug Switch.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Meter Report Enable | This parameter defines Disable/Enable meter report measure data to controller. |
| 2: Meter Report Interval | This parameter defines interval time (in seconds) that Meter report data to main controlle... |
| 3: Maxium over-load current | This parameter defines maximum current the plug can provide to load that be connected to p... |
| 4: Maximum alarm current | Defines maximum current, if the current plug provide to load great than this parameter, th... |
| 5: LED enable | This parameter defines the LED indication Function ON/OFF. |
| 6: Power Report Threshold | How much the power consumed must change to be reported. If the rate of power consumed chan... |
| 7: Remember Relay ON/OFF status after power failure. | Define how will the Plug react after the power supply is back on. 0 = will be off after th... |
| 8: Plug Time switch Function | Defines if the timer function is enabled/disabled to switch the Plug OFF after the time pe... |
| 9: Time switch Period | This parameter defines the time after the plug is switched off. If Parameter 8\# is set to... |
| 10: Button On/Off Enable | If this parameter is set to ‘1’, users can turn on and off the wall plug by pressing the b... |
| 1: Group 1 | is assigned to Plugs status - On/Off. Allows for receiving control command from trigger de... |
| 2: Group 2 | Sending control commands to associated devices. If current load is over the max current de... |
| 3: Group 3 | Send Notification to associated devices. |


#### 1: Meter Report Enable

This parameter defines Disable/Enable meter report measure data to controller.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Disable Report (0) |
|  | Enable Report (1) |


#### 2: Meter Report Interval

This parameter defines interval time (in seconds) that Meter report data to main controller.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_2 |
| Data Type        | INTEGER |
| Range | 1 to 65535 |
| Default Value | 300 |


#### 3: Maxium over-load current

This parameter defines maximum current the plug can provide to load that be connected to plug. If the current consumed by load greater than maximum current, the plug will cut off power and send alarm.  


##### Overview 

send Alarm NOTIFICATION\_EVENT\_POWER\_MANAGEMENT\_OVER\_LOAD\_DETECTED to associated

devices in lifeline. Red Led will blink every seconds until current is normal (less than Parameter

\#3). You must remove the loader and turn on the Plug (press the button once) to enable current

monitor and clear NOTIFICATION ALARM.

This parameter value must be great than \#4. If user set this parameter to default by Configure CC,

the parameter \#4 will be set to default value.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 1 to 16 |
| Default Value | 13 |


#### 4: Maximum alarm current

Defines maximum current, if the current plug provide to load great than this parameter, the plug will send over-current notification to main controller and the LED will be turn RED, but plug cannot cut-off power. Value must be less than parameter 3\#.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 1 to 15 |
| Default Value | 12 |


#### 5: LED enable

This parameter defines the LED indication Function ON/OFF.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Disable LED indication Function (0) |
|  | Enable LED indication Function (1) |


#### 6: Power Report Threshold

How much the power consumed must change to be reported. If the rate of power consumed change ratio is greater than this parameter, the plug will report the results, voltage, current, power and energy.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER |
| Range | 1 to 100 |
| Default Value | 5 |


#### 7: Remember Relay ON/OFF status after power failure.

Define how will the Plug react after the power supply is back on. 0 = will be off after the power supply is reconnected. Others = remember relay status


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Don’t Remember, the relay will keep OFF when Plug Supply Power. (0) |
|  | Remember the Relay Status. (1) |


#### 8: Plug Time switch Function

Defines if the timer function is enabled/disabled to switch the Plug OFF after the time period, which is defined in parameter 9\#.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Time switch Disable (0) |
|  | Time switch Enable (1) |


#### 9: Time switch Period

This parameter defines the time after the plug is switched off. If Parameter 8\# is set to ‘1’, and relay is turn ON, the relay will be turn OFF after delay this parameter.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_2 |
| Data Type        | INTEGER |
| Range | 1 to 65535 |
| Default Value | 150 |


#### 10: Button On/Off Enable

If this parameter is set to ‘1’, users can turn on and off the wall plug by pressing the button on the top of the wall plug.If this parameter is set to ‘0’, the wall plug cannot be turned on and off by pressing the button.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Disable Button (0) |
|  | Enable Button (1) |


#### 1: Group 1

is assigned to Plugs status - On/Off. Allows for receiving control command from trigger devices whenever the Plug is turned On or Off.  


##### Overview 

NOTIFICATION\_REPORT\_V4

METER\_REPORT\_V4

SWITCH\_BINARY\_REPORT

DEVICE\_RESET\_LOCALLY\_NOTIFICATION


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Group 2

Sending control commands to associated devices. If current load is over the max current defined in parameter \#3, the Plug will send a BASIC\_SET (0xFF) to associated devices. When current load is normal, plug will send a BASIC\_SET (0x00).  


##### Overview 

BASIC\_SET


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Group 3

Send Notification to associated devices.  


##### Overview 

NOTIFICATION\_REPORT\_V4


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/397).
