---
layout: documentation
title: Flood sensor - ZWave
---

{% include base.html %}

# Flood sensor Flood/water sensor

This describes the Z-Wave device *Flood sensor*, manufactured by *Shenzhen Neo Electronics Co., Ltd* with the thing type UID of ```shenzhen_floodsensor_00_000```. 

Flood/water sensor  


### Inclusion Information 

1. Remove the sensor cover.

2. Make sure the sensor is powered.

3. Set Z‐Wave controller or Z‐Wave gateway into inclusion mode (Refer to the controller or gateway operating manual)

4. Press the button three times within 1.5 second, the device will enter inclusion mode. And the LED will flash on and off alternately five times..

  


### Exclusion Information 

1. Remove the device cover.

2. Make sure the sensor is powered.

3. Set Z‐Wave controller or Z‐Wave gateway into exclusion mode (Refer to the controller or gateway operating manual)

4. Press the button three times within 1.5 second, the device will enter exclusion mode.

  


### Wakeup Information 

You can press the button once to wake up the device and send wakeup notification to controller.

If press successfully, the LED will blink one time.

The minimum wakeup interval is 300s

The maximum wakeup interval is 16,777,200s (about 194 days)

Allowable interval among each wakeup interval is 60 second, such as 360, 420, 480…

Note: The default value is 12 hours. This value is longer, the battery life is greater.


## Channels
The following table summarises the channels available for the Flood sensor Flood/water sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Alarm | alarm_general | alarm_general | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the Flood sensor Flood/water sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Basic setting command | Basic setting command to be transmitted |
| 2: OFF delay | The amount of delay before the OFF command is transmitted |
| 1: Device status | Sends the BASIC SET control frame when the probe detects water |
| 2: Controller updates |  |


#### 1: Basic setting command

Basic setting command to be transmitted  


##### Overview 

When the water sensor trigger alarm, it will send basic setting with these parameters. The receiver will execute this parameters. For example when the lamp receive the basic setting command, the parameters decide the brightness of the lamp.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 99 |
| Options | OFF (0) |
|  | Dim level (lower bound) (multilevel switch) (1) |
|  | Dim level (upper bound) (multilevel switch) (99) |
|  | ON (Binary switch) (255) |


#### 2: OFF delay

The amount of delay before the OFF command is transmitted  


##### Overview 

Adjust the amount of delay before the OFF command is transmitted


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_2 |
| Data Type        | INTEGER |
| Range | 1 to 65535 |
| Default Value | 30 |


#### 1: Device status

Sends the BASIC SET control frame when the probe detects water  


##### Overview 

Association group 1 is assigned the status of the device - it sends the BASIC SET control frame to the associated devices when the probe has detected water.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Controller updates


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/493).
