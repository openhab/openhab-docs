---
id: bigassfan
label: BigAssFan
title: BigAssFan - Bindings
type: binding
description: "The [BigAssFan](http://www.bigassfans.com/) binding is used to enable communication between openHAB and Big Ass Fans'  Haiku family of residential fans and lights that implement the SenseME technology."
since: 2x
logo: images/addons/bigassfan.png
install: auto
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# BigAssFan Binding

The [BigAssFan](http://www.bigassfans.com/) binding is used to enable communication between openHAB and Big Ass Fans'  Haiku family of residential fans and lights that implement the SenseME technology.

## Overview

Fans and lights are discovered dynamically.
There is a single thing created for each fan and/or connected to the network.
Each thing has channels that allow control of the fan and light, as well as to monitor the status.
When a fan or light is controlled from the remote control, Wall Controller, or smartphone app, the openHAB items linked to the device's channels will be updated to reflect the status.

## Device Discovery

The BigAssFan binding discovers Haiku fans and lights on the network, and creates an inbox entry for each discovered device.
Once added as a thing, the user can control the fan and light, similarly to how the device is controlled using the remote, Wall Controller, or smartphone app.

Background discovery polls the network every few minutes for devices.
Background discovery is **enabled** by default.
To **disable** background discovery, add the following line to the *conf/services/runtime.cfg* file:

```text
discovery.bigassfan:background=false
```

## Thing Configuration

The device's IP address, MAC address, and name is set at time of discovery.
However, in the event that any of this information changes, the configuration must be updated.

### Manual Thing Creation

Fans and lights can be manually created in the *PaperUI* or *HABmin*, or by placing a *.things* file in the *conf/things* directory.
See example below.

## Channels

The following channels are supported for fans:

| Channel Name            | Item Type    | Description                                           |
|-------------------------|--------------|-------------------------------------------------------|
| fan-power               | Switch       | Power on/off the fan                                  |
| fan-speed               | Dimmer       | Adjust the speed of the fan                           |
| fan-direction           | String       | Indicates the direction in which the fan is turning   |
| fan-auto                | Switch       | Enable/disable fan auto mode                          |
| fan-whoosh              | Switch       | Enable/disable fan "whoosh" mode                      |
| fan-smartmode           | String       | Set Smartmode to HEATING, COOLING, or OFF             |
| fan-learn-minspeed      | Dimmer       | Set minimum fan speed for Smartmode COOLING           |
| fan-learn-maxspeed      | Dimmer       | Set maximum fan speed for Smartmode COOLING           |
| fan-wintermode          | Switch       | Enable/disable fan winter mode                        |
| fan-speed-min           | Dimmer       | Set minimum fan speed                                 |
| fan-speed-max           | Dimmer       | Set maximum fan speed                                 |
| light-power             | Switch       | Power on/off the light                                |
| light-level             | Dimmer       | Adjust the brightness of the light                    |
| light-auto              | Switch       | Enable/disable light auto mode                        |
| light-smarter           | String       | Enable/disable Smarter Lighting                       |
| light-level-min         | Dimmer       | Set minimum light level for Smarter Lighting          |
| light-level-max         | Dimmer       | Set maximum light level for Smarter Lighting          |
| light-present           | String       | Indicates is a light is installed in the fan          |
| motion                  | Switch       | Motion was detected                                   |
| time                    | DateTime     | Fan's date and time                                   |

The following channels are supported for lights:

| Channel Name            | Item Type    | Description                                           |
|-------------------------|--------------|-------------------------------------------------------|
| light-power             | Switch       | Power on/off the light                                |
| light-level             | Dimmer       | Adjust the brightness of the light                    |
| light-hue               | Dimmer       | Adjust the color temperature of the light             |
| light-present           | String       | Indicates if a light is installed                     |
| light-color             | String       | Indicates if the light supports hue adjustment        |
| motion                  | Switch       | Motion was detected                                   |
| time                    | DateTime     | Light's date and time                                 |

The following channels are supported for wall controllers:

| Channel Name            | Item Type    | Description                                           |
|-------------------------|--------------|-------------------------------------------------------|
| motion                  | Switch       | Motion was detected                                   |
| time                    | DateTime     | Wall controllers date and time                        |

## Fan Items

The following item definitions would be used to control the fan.

```java
Switch PorchFanPower                { channel="bigassfan:fan:20F85EDAA56A:fan-power" }
Dimmer PorchFanSpeed                { channel="bigassfan:fan:20F85EDAA56A:fan-speed" }
Switch PorchFanAuto                 { channel="bigassfan:fan:20F85EDAA56A:fan-auto" }
Switch PorchFanWhoosh               { channel="bigassfan:fan:20F85EDAA56A:fan-whoosh" }
String PorchFanSmartmode            { channel="bigassfan:fan:20F85EDAA56A:fan-smartmode" }
Dimmer PorchFanSpeedMin             { channel="bigassfan:fan:20F85EDAA56A:fan-learn-minspeed" }
Dimmer PorchFanSpeedMax             { channel="bigassfan:fan:20F85EDAA56A:fan-learn-maxspeed" }
```

The following item definitions would be used to control the light.

```java
Switch PorchFanLightPower           { channel="bigassfan:fan:20F85EDAA56A:light-power" }
Dimmer PorchFanLightLevel           { channel="bigassfan:fan:20F85EDAA56A:light-level" }
Switch PorchFanLightAuto            { channel="bigassfan:fan:20F85EDAA56A:light-auto" }
Switch PorchFanLightSmarter         { channel="bigassfan:fan:20F85EDAA56A:light-smarter" }
Dimmer PorchFanLightLevelMin        { channel="bigassfan:fan:20F85EDAA56A:light-level-min" }
Dimmer PorchFanLightLevelMax        { channel="bigassfan:fan:20F85EDAA56A:light-level-max" }
```

The following read-only items are provided by the fan.

```java
String PorchFanLightPresent         { channel="bigassfan:fan:20F85EDAA56A:light-present" }
Switch PorchFanMotionSensor         { channel="bigassfan:fan:20F85EDAA56A:motion" }
DateTime PorchFanTime               { channel="bigassfan:fan:20F85EDAA56A:time" }
```

## Light Items

```java
Switch KitchenLightPower            { channel="bigassfan:light:20F85EDA87A0:light-power" }
Dimmer KitchenLightLevel            { channel="bigassfan:light:20F85EDA87A0:light-level" }
Switch KitchenLightHue              { channel="bigassfan:light:20F85EDA87A0:light-hue" }
```

The following read-only items are provided by the light.

```java
String KitchenLightPresent          { channel="bigassfan:light:20F85EDA87A0:light-present" }
String KitchenLightColor            { channel="bigassfan:light:20F85EDA87A0:light-color" }
Switch KitchenLightMotionSensor     { channel="bigassfan:light:20F85EDA87A0:motion" }
DateTime KitchenLightTime           { channel="bigassfan:light:20F85EDA87A0:time" }
```

## Wall Controller Items

The following read-only items are provided by the wall controller.

```java
Switch PorchControllerMotionSensor  { channel="bigassfan:controller:20F85ED87F01:motion" }
DateTime PorchControllerTime        { channel="bigassfan:controller:20F85ED87F01:time" }
```

### Sitemap

This is an example of how to set up your sitemap.

```perl
Frame label="Control My BigAssFan" {
    Switch item=PorchFanPower label="Fan Power [%s]"
    Slider item=PorchFanSpeed label="Fan Speed [%s %%]"
    Switch item=PorchFanLightPower label="Light Power [%s]"
    Slider item=PorchFanLightLevel label="Light Brightness [%s %%]"
}
Frame label="Control My Light" {
    Switch item=KitchenLightPower label="Light Power [%s]"
    Slider item=KitchenLightLevel label="Light Level [%s %%]"
    Slider item=KitchenLightHue label="Light Hue [%s]"
}
```

### Manual Thing Creation

Place a file named *bigassfan.things* in the *conf/things* directory.
The file should contain lines formatted like this.

```java
bigassfan:fan:20F85EDAA56A [ label="Porch Fan", ipAddress="192.168.12.62", macAddress="20:F8:5E:DA:A5:6A" ]
```

#### Unsupported Features

Standalone lights are not supported.
