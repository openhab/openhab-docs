---
layout: documentation
title: DTA19 - ZWave
---

{% include base.html %}

# DTA19 Smart LED Light

This describes the Z-Wave device *DTA19*, manufactured by *Domitech Products, LLC* with the thing type UID of ```domitech_ze27_00_000```. 

Smart LED Light  


## Overview 

Domitech Smart LED Retrofit Kit ZE27EU is a member of the Z-Wave® family and communicate with other Z-Wave® certified devices in a control network. The Smart Bulb can be controlled by the Z-Wave remote controller or apps. Each Z-Wave device serves as a node to repeat the signal in the network, thus, extending the overall Z-Wave mesh wireless network range. Different types and brands of Z-Wave devices can be associated with domitech Smart Bulb in your system and they will work together to optimize and expand the coverage of your Z-Wave network. Once setup is completed, you can enjoy the convenience and leisure which Smart Bulb offers. 

  


### Inclusion Information 

Step 1: Place the controller in inclusion mode.

Step 2: Turn on power to the socket after promoted by your network controller inclusion mode. The Smart Bulb will be included into your network within 30 seconds. The smart bulb will flash 2 times after Inclusion is successful. If the controller/gateway shows it failed, repeat the procedure.

Note: If Inclusion still fails after the 2nd attempt, you need to first RESET the Smart Bulb before repeating the above steps.

Before repeating the above steps, try moving the Smart Bulb to the bulb socket in the same room as your home gateway in case the preferred outlet is out of range initially. Repeat step 1-2 until the Smart Bulb is added to your network. Once the light bulb has been successfully added to your home network, you can move it to the preferred location in the home.

Manually Reset – Flick the wall switch “OFF-ON” cycle 4 times within 4 seconds (Turn OFF and turn ON will be counted as 1 “OFF-ON” cycle). The Smart Bulb will flash twice after Reset is successful. Use this procedure only in the event that the network primary controller is lost or otherwise inoperable.

  


### Exclusion Information 

**By controller** \- The Smart Bulb can be excluded from your network by your controller/Gateway. Similar to the Inclusion process, turn off power to your light bulb and place your network controller into exclusion mode by following the controller manufacturer's instructions. Once prompted by your network controller, turn ON the light switch. The Smart Bulb will flash twice to confirm that it has successfully been excluded from your network. Please refer to your controller/gateway instructions manual for details.

**Manually** – The Smart Bulb can be excluded manually by flicking the wall switch ”OFF-ON” cycle 4 times within 4 seconds (Turn OFF and turn ON will be counted as 1 “OFF-ON” cycle). The bulb will flash twice after Reset is successful. Use this procedure only in the event that the network primary controller is lost or otherwise inoperable.


## Channels
The following table summarises the channels available for the DTA19 Smart LED Light.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |


### Dimmer

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the DTA19 Smart LED Light.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Dim level when the bulb is turned on |  |
| 9: Dimming / brightening step level | Controls the speed of dimming / brightening |
| 10: Dimming / brightening step timing |  |
| 1: Group 1 |  |


#### 1: Dim level when the bulb is turned on

  


##### Overview 

You may select the dim level whenever the light is turned back on to be either full brightness (100% dim level) or be the same as the last dim setting when the light is on by flicking the wall switch.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Full brightness (0) |
|  | Last setting (1) |


#### 9: Dimming / brightening step level

Controls the speed of dimming / brightening  


##### Overview 

You may change the dimming step level when you adjust the brightness from your controller.

When the value is low, dimming / brightening is gradual. When the value is high, dimming / brightening is rapid.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER |
| Range | 1 to 99 |
| Default Value | 1 |


#### 10: Dimming / brightening step timing

  


##### Overview 

This parameter controls the dimming speed. When the value is low, the step timing is quick. When the value is high, the step timing is slow.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER |
| Range | 1 to 10 |
| Default Value | 3 |


#### 1: Group 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/280).
