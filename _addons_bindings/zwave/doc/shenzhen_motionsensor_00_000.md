---
layout: documentation
title: Motion Sensor - ZWave
---

{% include base.html %}

# Motion Sensor PIR Motion Sensor

This describes the Z-Wave device *Motion Sensor*, manufactured by *Shenzhen Neo Electronics Co., Ltd* with the thing type UID of ```shenzhen_motionsensor_00_000```. 

PIR Motion Sensor  


### Inclusion Information 

1. Remove the sensor cover.

2. Make sure the sensor is powered.

3. Set Z‐Wave controller or Z‐Wave gateway into inclusion mode (Refer to the controller or

gateway operating manual)

4. Press the button three times within 1.5 second, the device will enter inclusion mode. And the

LED will flash on and off alternately five times..

  


### Exclusion Information 

1. Remove the device cover.

2. Make sure the sensor is powered.

3. Set Z‐Wave controller or Z‐Wave gateway into exclusion mode (Refer to the controller or

gateway operating manual)

4. Press the button three times within 1.5 second, the device will enter exclusion mode.

  


### Wakeup Information 

You can press the button once to wake up the device and send wakeup notification to controller.

If press successfully, the LED will blink one time.

The minimum wakeup interval is 300s

The maximum wakeup interval is 16,777,200s (about 194 days)

Allowable interval among each wakeup interval is 60 second, such as 360, 420, 480…

Note: The default value is 12 hours. This value is longer, the battery life is greater.


## Channels
The following table summarises the channels available for the Motion Sensor PIR Motion Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Sensor (luminance) | sensor_luminance | sensor_luminance | Temperature | Number |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Sensor (temperature)

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the Motion Sensor PIR Motion Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Sensitivity Level Setting | This parameter defines the sensitivity of PIR sensor. Where 8 = highest & 255 = lowest sen... |
| 2: ON/OFF Duration Setting | Determined how long the associated devices should stay ON status. This Parameter value mus... |
| 3: Basic Set Level | Basic Set Command will be sent when the door/window is opened or closed, the receiver will... |
| 4: Enable/Disable PIR Function |  |
| 5: Lux Level Set | Set a lux level value which determines when the light sensor is activated. |
| 6: Re-trigger Interval | Adjust the interval of being re-triggered after the PIR detector has been triggered. No re... |
| 7: Light Sensor Polling Interval | The Intervall after which the Light Sensor Measure is polled. |
| 8: Lux Level Function Enable | 0 = Off, 1 =On and Lux Level must be less than \#5 -> then send Basic Set(Parameter \#3) |
| 9: Lux Level Changed Report | How much the Lux Level must change, in lux, to be reported to the main controller. |
| 10: LED Blink Enable | Defines whether the LED blinking is on / off. 1 = enable -> blink once when motion sensor ... |
| 1: Group 1 | Is assigned to the device status - OPEN/CLOSED. It enables the sensor to send reports and ... |
| 2: Group 2 | Sending Control Command to associated devices. This association group is configured throug... |
| 3: Group 3 | Send Notification to associated devices. |
| 4: Group 4 | Send Notification to associated devices. |


#### 1: Sensitivity Level Setting

This parameter defines the sensitivity of PIR sensor. Where 8 = highest & 255 = lowest sensitivity


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 8 to 255 |
| Default Value | 12 |


#### 2: ON/OFF Duration Setting

Determined how long the associated devices should stay ON status. This Parameter value must be large than Parameter 6\#.  


##### Overview 

For instance, this parameter is set to 30(second), the PIR detector will send a

BASIC SET Command to an associated device with value basic set level if PIR

detector is triggered and the associated device will be turned on 30(second) before it

is turned off.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_2 |
| Data Type        | INTEGER |
| Range | 5 to 600 |
| Default Value | 30 |


#### 3: Basic Set Level

Basic Set Command will be sent when the door/window is opened or closed, the receiver will take it for consideration; for instance, if a lamp module received the BSC of which value is decisive as to how bright of dim level of lamp module shall be.  


##### Overview 

Available Settings:

 0 - Off, Alarm cancelling or turning a device OFF

1~99 or 255 – ON (Binary Switch Device)

                      Dim Level (Multilevel Switch Device)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 255 |


#### 4: Enable/Disable PIR Function


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | Disable PIR Detector Function (0) |
|  | Enable PIR Detector Function (255) |


#### 5: Lux Level Set

Set a lux level value which determines when the light sensor is activated.  


##### Overview 

If the ambient illumination level falls below this value and a person moves

across or within the detected area , PIR detector will send a Z-Wave ON

command(i.e. BASIC\_SET value = parameter 3\#) to an associated device and activate

it.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_2 |
| Data Type        | INTEGER |
| Range | 0 to 1000 |
| Default Value | 100 |


#### 6: Re-trigger Interval

Adjust the interval of being re-triggered after the PIR detector has been triggered. No report will be sent during this interval if a movement is presented. This Parameter value must be less than Parameter 2\#.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER |
| Range | 1 to 8 |
| Default Value | 8 |


#### 7: Light Sensor Polling Interval

The Intervall after which the Light Sensor Measure is polled.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_2 |
| Data Type        | INTEGER |
| Range | 60 to 36000 |
| Default Value | 180 |


#### 8: Lux Level Function Enable

0 = Off, 1 =On and Lux Level must be less than \#5 -> then send Basic Set(Parameter \#3)  


##### Overview 

If this parameter is set to ‘1’, and when Lux level less than the value define by parameter \#5, PIR

detector will send a BASIC\_SET command frame(i.e. BASIC\_SET (value = parameter 3) to an

associated device and activate it. If Lux Level greater than the value define by parameter \#5, PIR

detector will not send a BASIC\_SET command frame.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable Lux Level Function (0) |
|  | Enable Lux Level Function (1) |


#### 9: Lux Level Changed Report

How much the Lux Level must change, in lux, to be reported to the main controller.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 100 |


#### 10: LED Blink Enable

Defines whether the LED blinking is on / off. 1 = enable -> blink once when motion sensor detect movement, 0= disbale


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Disable LED blinking (0) |
|  | Enable LED blinking (1) |


#### 1: Group 1

Is assigned to the device status - OPEN/CLOSED. It enables the sensor to send reports and readings to Z-Wave Controller or Z-Wave Gateway whenever the sensor is triggered.  


##### Overview 

NOTIFICATION\_REPORT

COMMAND\_CLASS\_SENSOR\_BINARY\_V2

COMMAND\_CLASS\_SENSOR\_MULTILEVEL\_V7

BATTERY\_REPORT

DEVICE\_RESET\_LOCALLY\_NOTIFICATION


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Group 2

Sending Control Command to associated devices. This association group is configured through the advanced parameters no. 2, 3, 5 and 8  


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


#### 4: Group 4

Send Notification to associated devices.  


##### Overview 

SENSOR\_BINARY\_REPORT\_V2


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/401).
