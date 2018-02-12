
# DP-32Z / IX-32 Ceiling Mounted PIR Sensor PIR sensor

This describes the Z-Wave device **DP-32Z / IX-32 Ceiling Mounted PIR Sensor**, manufactured by **Kaipule Technology Co., Ltd.** with the thing type UID of ```kaipule_dp32z_01_036```. 

PIR sensor  


# Overview #

• Special Fresnel lens with patented technology, built-in far infrared wave with above 95% transmittance rate

• Using Heimann sensor with high sensitivity & few false alarm

• Real anti-visible light technology, no false alarm under 6500LUX strong light interference with sealed induction cavity design, preventing false alarms caused by thermal current interference

• Configurable detection sensitivity, suitable for a variety of detection environments with fuzzy logic algorithm & fuzzy recognition technology, 

• 2 years of battery life 

  


## Inclusion Information ##

The sensor must be added to the Zwave network prior to use.

To include the sensor in a network both the sensor and the Network controller or HUB must be in inclusion mode at the same time. Start by placing the controller in inclusion mode. Activate the inclusion mode at the sensor pressing the tamper switch 3 times, then the PIR sensor will stay in inclution state. Wait about 15-30 seconds while the sensor and controller finish the inclusion process.

  


## Exclusion Information ##

The sensor must be added to the Zwave network prior to use. To include the sensor in a network both the sensor and the Network controller or HUB must be in inclusion mode at the same time. Enter the Exclusion Mode on the controller, and press the tamper switch 3 times, then the PIR sensor will be removed after 15-30 seconds. 

## Channels
The following table summarises the channels available for the DP-32Z / IX-32 Ceiling Mounted PIR Sensor PIR sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Alarm (motion) | alarm_motion | alarm_motion | Door | Switch |
|  | battery-level | system.battery-level |  |  |




### Device Configuration
The following table provides a summary of the configuration parameters available in the DP-32Z / IX-32 Ceiling Mounted PIR Sensor PIR sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Basic Set | If there is any device in Association Group 2 the PIR Sensor will send BASIC Set = Value c... |
| 2: Turn Off Light Time Configuration | If there is any device in Association Group 2 the PIR Sensor will send BASIC Set = Value c... |
| 3: PIR Sensor Alarm Elemination Time Configuration | Min time is 5s. Eg If the config is 1, this means it will eliminate alarm after 1 \* 5s = ... |
| 1: Lifeline | Send "notification\_Report" to the device in Life line group |
| 2: Basic Set Command |  |




#### 1: Basic Set

If there is any device in Association Group 2 the PIR Sensor will send BASIC Set = Value command to control that deivce when the PIR is triggered.  


# Overview #

If there is any device in Association Group 2 the PIR Sensor will send BASIC Set = Value command to control that deivce when the PIR is triggered.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 1 to 100 |
| Default Value | 255 |






#### 2: Turn Off Light Time Configuration

If there is any device in Association Group 2 the PIR Sensor will send BASIC Set = Value command to Group 2 and send Basic Set = 0x00 to turn of light after 5 x t seconds- Set value t means to send the BAsic Set command after t seconds.  


# Overview #

If there is any device in Association Group 2 the PIR Sensor will send BASIC Set = Value command to Group 2 and send Basic Set = 0x00 to turn of light after 5 x t seconds- Set value t means to send the BAsic Set command after t seconds.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 1 to 120 |
| Default Value | 20 |






#### 3: PIR Sensor Alarm Elemination Time Configuration

Min time is 5s. Eg If the config is 1, this means it will eliminate alarm after 1 \* 5s = 5 seconds


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 1 to 120 |
| Default Value | 20 |






#### 1: Lifeline

Send "notification\_Report" to the device in Life line group


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |






#### 2: Basic Set Command

  


# Overview #

When sensor is triggered:

\[Command Class BAsic, Basic Set, Value = 0xFF(default 0xFF, configurable, see Config Parameters)

When light up timeout:

\[Command Class BAsic, BAsic Set, Value =0x00\]


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |






---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/559).

