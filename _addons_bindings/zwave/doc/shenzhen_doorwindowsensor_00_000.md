---
layout: documentation
title: Door/Window Sensor - ZWave
---

{% include base.html %}

# Door/Window Sensor Door/Window Sensor

This describes the Z-Wave device *Door/Window Sensor*, manufactured by *Shenzhen Neo Electronics Co., Ltd* with the thing type UID of ```shenzhen_doorwindowsensor_00_000```. 

Door/Window Sensor  


### Inclusion Information 

1. Remove the sensor cover.

2. Make sure the sensor is powered.

3. Set Z‐Wave controller or Z‐Wave gateway into inclusion mode (Refer to the controller or

gateway operating manual)

4. Press the button three times within 1.5 second, the device will enter inclusion mode. And the

LED will flash on and off alternately five times.sor.

  


### Exclusion Information 

1. Remove the device cover.

2. Make sure the sensor is powered.

3. Set Z‐Wave controller or Z‐Wave gateway into exclusion mode (Refer to the controller or

gateway operating manual)

4. Press the button three times within 1.5 second, the device will enter exclusion mode.

  


### Wakeup Information 

You can press the button once to wake up the device and send wakeup notification to controller. If press successfully, the LED will blink one time.

The minimum wakeup interval is 300s (5 minutes)

The maximum wakeup interval is 16,777,200s (about 194 days)

Allowable min step among each wakeup interval is 60 seconds, such as 360s, 420s, 480s…

Note: The default value is 12 hours. This value is longer, the battery life is greater.


## Channels
The following table summarises the channels available for the Door/Window Sensor Door/Window Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Door/Window Sensor | sensor_door | sensor_door | Door | Contact |
| Alarm (access) | alarm_access | alarm_access | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the Door/Window Sensor Door/Window Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: ON/OFF Delay | Adjust the delay before the OFF command is transmitted. 0 means send OFF command immediate... |
| 2: Basic Set Level | Basic Set Command will be sent when the door/window is opened or closed, the receiver will... |
| 1: Group 1 | Is assigned to the device status - OPEN/CLOSED. |
| 2: Group 2 | Sending control commands to associated devices. This association group is configured throu... |
| 3: Group 3 | Send Notification to associated devices. |
| 4: Group 4 | Send Notification to associated devices. |


#### 1: ON/OFF Delay

Adjust the delay before the OFF command is transmitted. 0 means send OFF command immediately.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 0 |


#### 2: Basic Set Level

Basic Set Command will be sent when the door/window is opened or closed, the receiver will take it for consideration; for instance, if a lamp module received the BSC of which value is decisive as to how bright of dim level of lamp module shall be.  


##### Overview 

Available Settings:

 0 - Off, Alarm cancelling or turning a device OFF

1 - 99 or 255 – ON (Binary Switch Device)

                      Dim Level (Multilevel Switch Device)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 255 |


#### 1: Group 1

Is assigned to the device status - OPEN/CLOSED.  


##### Overview 

It enables the sensor to send reports and readings to Z-Wave Controller or Z-Wave Gateway whenever the sensor is triggered.

NOTIFICATION\_REPORT

BATTERY\_REPORT

SENSOR\_BINARY\_REPORT

DEVICE\_RESET\_LOCALLY\_NOTIFICATION


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Group 2

Sending control commands to associated devices. This association group is configured through the advanced parameters no. 1 and 2.  


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

NOTIFICATION\_REPORT


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Group 4

Send Notification to associated devices.  


##### Overview 

SENSOR\_BINARY\_REPORT


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/400).
