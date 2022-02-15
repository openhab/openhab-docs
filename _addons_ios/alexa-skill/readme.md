---
layout: documentation
title: openHAB Skill For Amazon Alexa
source: https://github.com/openhab/openhab-alexa/blob/main/docs/USAGE.md
description: "Alexa is an intelligent personal assistant developed by Amazon and designed to run on smart speakers and devices such as the Amazon Echo and Echo Dot."
---

# Amazon Alexa Smart Home Skill

<img align="right" width="150px" src="./images/skill-logo.png">

Alexa is an intelligent personal assistant developed by Amazon and designed to run on smart speakers and devices such as the Amazon Echo and Dot.

This certified Amazon Smart Home Skill allows users to control their openHAB powered smart home with natural voice commands.  Lights, locks, thermostats, AV devices, sensors and many other device types can be controlled through a user's Amazon Alexa powered device like the Echo or Echo Dot.

This page describes how to use the [openHAB Skill for Amazon Alexa](https://www.amazon.com/openHAB-Foundation/dp/B01MTY7Z5L).
The skill connects your openHAB setup through the [myopenHAB.org](http://myopenHAB.org) cloud service to Amazon Alexa.

## Table of Contents

* [Requirements](#requirements)
* [Recommendations](#recommendations)
  * [Item Labels](#item-labels)
  * [Regional Settings](#regional-settings)
* [Concept](#concept)
  * [Single Endpoint](#single-endpoint)
  * [Group Endpoint](#group-endpoint)
  * [Item State](#item-state)
  * [Item Unit of Measurement](#item-unit-of-measurement)
  * [Networking Capabilities](#networking-capabilities)
  * [Generic Capabilities](#generic-capabilities)
  * [Semantic Extensions](#semantic-extensions)
* [Item Configuration](#item-configuration)
  * [Device Types](#device-types)
  * [Device Attributes](#device-attributes)
* [Troubleshooting](#troubleshooting)
  * [Response Errors](#response-errors)
* [Additional Information](#additional-information)
  * [Regional Availability](#regional-availability)
  * [Asset Catalog](#asset-catalog)
  * [Semantic Catalog](#semantic-catalog)
  * [Unit of Measurement Catalog](#unit-of-measurement-catalog)
  * [Capability Names Not Allowed](#capability-names-not-allowed)
  * [Other openHAB Integrations for Amazon Alexa](#other-openhab-integrations-for-amazon-alexa)

## Latest Changes

* Revamped [item configuration](#item-configuration) syntax using device metadata concept.
  * Deprecated previous syntax, although backward compatible for the time being.
* Added new device capabilities:
  * [Camera](#camera-attributes)
  * [Door/Window Covering](#cover-attributes)
  * [Fan](#fan-attributes)
  * [Networking](#networking-attributes)
  * [Vacuum](#vacuum-attributes)
* Updated existing capabilities:
  * New security [arm state](#armstate) errors handling.
  * Support for [input](#input) custom mappings.
  * Support for [playback stop](#playbackstop) requests.
  * Support for [thermostat hold](#thermostathold) setting and [thermostat fan](#thermostatfan) mode.
* Added new [custom asset ids](#custom-asset-catalog).
* Added new [custom semantic extensions](#custom-semantic-catalog).
* Deprecated general item sensor concept support for decoupling between item receiving command and item states.
  * Decoupled state support maintained for [`LockState`](#lockstate) and added for [`OpenState`](#openstate).
* Removed version 2 tags support for openHAB 3.0 and above.

# Requirements

::: tip
This integration relies on the cloud connector addon.
More information can be found in the corresponding [docs page](https://www.openhab.org/link/openhabcloud).
:::

* openHAB Cloud Connector configured using myopenHAB.org
* Amazon account
* Amazon Echo, Amazon Echo Dot or compatible Amazon Alexa devices

# Recommendations

## Item Labels

Matching of voice commands to items happens based on the item label (e.g. "Kitchen Light"). As an alternative, the metadata parameter `name` can be used over the item label. If neither are specified, the item will be ignored. It is therefore advisable, to choose labels that can be used to form natural commands. It is important to note that each labels needs to be unique to prevent any [duplicate issues](#duplicate-device-names). As an example, compare *Alexa, turn on the Kitchen Light* vs *Alexa, turn on the Ground Floor LEDs Kitchen*.

## Regional Settings

In order for the skill to determine your default language and measurement system to use during the discovery process, it is important to set your server regional settings including the language, country/region and measurement system properties. These can either be accomplished by using the admin UI, or setting the `language`, `region` and `measurementSystem` properties for `org.openhab.i18n` service in `$OPENHAB_CONF/services/runtime.cfg`. If these settings aren't defined, the skill will either use the item level configuration, if available, to determine these properties, or fallback to `en` language and `SI` measurement system, as default values.

# Concept

The Alexa skill API uses the concept of "endpoints".  Endpoints are addressable entities that expose one or more capabilities.  An example endpoint may be a light switch, which has a single capability to control power and report its state (ON/OFF).  A more complex endpoint may be a thermostat which has many capabilities to control and report temperature, setpoints, modes, etc...

There is a maximum of 300 endpoints limit per user with 100 capabilities per endpoint. This restriction is driven by the [Alexa Smart Home API](https://developer.amazon.com/docs/device-apis/alexa-discovery.html#limits).

## Single Endpoint

Single items in openHAB can be mapped to a single endpoint in Alexa through the use of the [item metadata](https://www.openhab.org/docs/concepts/items.html#item-metadata).

A simple example of this is a light switch. In openHAB a light switch is defined as a "Switch" item and responds to ON or OFF commands.

```xtend
Switch LightSwitch "Light Switch" {alexa="Light"}
```

Setting this on a single item will create an Alexa endpoint as a lighting device with the spoken addressable name "Light Switch" and power control capability. You can ask *Alexa, turn on Light Switch*.

In openHAB, a "Dimmer" item responds to both brightness and on/off commands. Using the same metadata device on that item will give power and brightness control to the Alexa endpoint. Alternatively, the device name can be defined in the metadata parameters, instead of the item label, along with a customized description that will show in the Alexa app. You can ask *Alexa, turn on Light Switch* well as *Alexa, set Light Switch to 50%*.

```xtend
Dimmer LightSwitch {alexa="Light" [name="Light Switch", description="Super Smart Light"]}
```

The same for a "Color" item responding to color, brightness and on/off commands. If you need to limit the default capabilities, you can specify in the [item configuration](#item-configuration) each device attribute your device supports, prefixed with the `Light` device type. The example below shows a colored light switch with color and power on/off controls only. The brightness control would be omitted.

```xtend
Color LightSwitch "Light Switch" {alexa="Light.Color,Light.PowerState"}
```

For a general switch, the `Switch` metadata device will give the same capability but as a switchable device Alexa endpoint.

```xtend
Switch ApplianceSwitch "Appliance Switch" {alexa="Switch"}
```

By default, a `Switch` device type will have the category "SWITCH", which can be changed using a more specific device type from the [supported list](#device-types). For example, using the `CoffeeMaker` device type will retain the same power on/off capability but will show as a coffee maker in the Alexa app.

```xtend
Switch CoffeeMaker "Coffee Maker" {alexa="CoffeeMaker"}
```

Likewise, more complex single endpoints can be configured. Such as using a `Blind` device type, which responds to [position state](#positionstate) requests by default.

```xtend
Rollershutter Blind "Blind" {alexa="Blind"}
```

<a name="supported-group-metadata"></a>

## Group Endpoint

While single mapping items works for many use cases, occasionally multiple openHAB items need to be mapped to a single endpoint in Alexa. When using a group item, keep in mind that only one specific attribute capability per group can be defined, except for [generic capabilities](#generic-capabilities).

Only [functional groups](https://www.openhab.org/docs/configuration/items.html#groups) (no group type) can be configured as group endpoint. [State derived groups](https://www.openhab.org/docs/configuration/items.html#derive-group-state-from-member-items) will be considered as single endpoints based on their defined group type.

The below example exposes 3 separate single endpoints, with "Light 1" and "Light 2" as independent lights with brightness and on/off controls, while and "Light Group" controlling these two as a group of lights with on/off control.

```xtend
Group:Switch:OR(ON,OFF) LightGroup "Light Group"              {alexa="Light"}
Dimmer                  Light1     "Light 1"     (LightGroup) {alexa="Light"}
Dimmer                  Light2     "Light 2"     (LightGroup) {alexa="Light"}
```

Below are examples for various use cases currently natively supported by the skill.

In openHAB a thermostat is modeled as many different items, typically there are items for setpoints (target, heat, cool), modes, and the current temperature. To map these items to a single endpoint in Alexa, we will add them to a group which also uses "Alexa" metadata. When items are Alexa-enabled, but are also a member of a group Alexa-enabled, they will be added to the group endpoint and not exposed as their own endpoints.

```xtend
Group  Thermostat    "Bedroom"                                {alexa="Thermostat"}
Number Temperature   "Temperature [%.1f °F]"   (Thermostat)   {alexa="CurrentTemperature"}
Number CoolSetpoint  "Cool Setpoint [%.1f °F]" (Thermostat)   {alexa="CoolingSetpoint"}
Number HeatSetpoint  "Heat Setpoint [%.1f °F]" (Thermostat)   {alexa="HeatingSetpoint"}
Number Mode          "Mode [%s]"               (Thermostat)   {alexa="HeatingCoolingMode"}
```

The group metadata also describes the category for the endpoint, in this case a "Thermostat".  In this example an endpoint is created called "Bedroom", its various capabilities are mapped to different openHAB items.  You can ask *Alexa, set the Bedroom thermostat to 72* and the "HeatSetpoint" will receive the command, if currently in heating mode, likewise you can ask *Alexa, what's the temperature of the Bedroom?* and the current state of "Temperature" will be returned.

When mapping items, sometime we need to pass additional parameters to Alexa to set things like what scale to use (Fahrenheit) or what values our items expect for certain states (thermostat modes). These parameters can be passed in the metadata properties, if they are omitted, then reasonable defaults are used.  In our above example we may wish to use Fahrenheit as our temperature scale, and map the mode strings to numbers.  This would look like:

```xtend
Group  Thermostat    "Thermostat"                             {alexa="Thermostat"}
Number Temperature   "Temperature [%.1f °F]"   (Thermostat)   {alexa="CurrentTemperature" [scale="Fahrenheit"]}
Number CoolSetpoint  "Cool Setpoint [%.1f °F]" (Thermostat)   {alexa="CoolingSetpoint" [scale="Fahrenheit"]}
Number HeatSetpoint  "Heat Setpoint [%.1f °F]" (Thermostat)   {alexa="HeatingSetpoint" [scale="Fahrenheit"]}
Number Mode          "Mode [%s]"               (Thermostat)   {alexa="HeatingCoolingMode" [OFF=0,HEAT=1,COOL=2,AUTO=3]}
Switch Hold          "Hold [%s]"               (Thermostat)   {alexa="ThermostatHold"}
String Fan           "Fan [%s]"                (Thermostat)   {alexa="ThermostatFan"}
```

For thermostat integration such as Nest or Ecobee, a more complex configuration could involve having three setpoints and additional cooling and heating setpoints for eco mode when these are different than the standard ones. Compared to the previous example, the temperature scale here will be based on the item state presentation unit (`°F` => Fahrenheit) and the thermostat mode will be mapped according to the linked binding channel (e.g. `{channel="nest:..."}`).

```xtend
Group  Thermostat      "Thermostat"                                {alexa="Thermostat"}
Number Temperature     "Temperature [%.1f °F]"       (Thermostat)  {alexa="CurrentTemperature"}
Number TargetSetpoint  "Target Setpoint [%.1f °F]"   (Thermostat)  {alexa="TargetTemperature"}
Number CoolSetpoint    "Cool Setpoint [%.1f °F]"     (Thermostat)  {alexa="CoolingSetpoint"}
Number HeatSetpoint    "Heat Setpoint [%.1f °F]"     (Thermostat)  {alexa="HeatingSetpoint"}
Number EcoCoolSetpoint "Eco Cool Setpoint [%.1f °F]" (Thermostat)  {alexa="EcoCoolingSetpoint"}
Number EcoHeatSetpoint "Eco Heat Setpoint [%.1f °F]" (Thermostat)  {alexa="EcoHeatingSetpoint"}
String Mode            "Mode [%s]"                   (Thermostat)  {alexa="HeatingCoolingMode"}
```

A smart bulb with shade of colors controls.

```xtend
Group  Bulb        "Bulb"                {alexa="Light"}
Color  Color       "Color"       (Bulb)  {alexa="PowerState,Brightness,Color"}
Dimmer Temperature "Temperature" (Bulb)  {alexa="ColorTemperature"}
```

A smart bulb with shade of white controls.

```xtend
Group  Bulb        "Bulb"                {alexa="Light"}
Dimmer White       "White"       (Bulb)  {alexa="PowerState,Brightness"}
Dimmer Temperature "Temperature" (Bulb)  {alexa="ColorTemperature"}
```

A window blind with position and tilt angle controls.

```xtend
Group         Blind    "Blind"            {alexa="Blind"}
Rollershutter Position "Position" (Blind) {alexa="PositionState"}
Rollershutter Tilt     "Tilt"     (Blind) {alexa="TiltAngle"}
```

A fan with 6-speed, direction, oscillate and power on/off controls.

```xtend
Group  Fan       "Fan"             {alexa="Fan"}
Number Speed     "Speed"     (Fan) {alexa="FanSpeed" [speedLevels=6]}
Switch Direction "Direction" (Fan) {alexa="FanDirection"}
Switch Oscillate "Oscillate" (Fan) {alexa="FanOscillate"}
Switch Power     "Power"     (Fan) {alexa="PowerState"}
```

A stereo with volume, mute, input, channel, playback, equalizer and power on/off controls.

```xtend
Group  Stereo   "Stereo"             {alexa="Speaker"}
Number Volume   "Volume"   (Stereo)  {alexa="VolumeLevel"}
Switch Mute     "Mute"     (Stereo)  {alexa="MuteState"}
Switch Power    "Power"    (Stereo)  {alexa="PowerState"}
String Input    "Input"    (Stereo)  {alexa="Input" [supportedInputs="HDMI1,TV"]}
Number Channel  "Channel"  (Stereo)  {alexa="Channel"}
String KeyCode  "Key Code" (Stereo)  {alexa="ChannelStep" [CHANNEL_UP="CHUP", CHANNEL_DOWN="CHDOWN"]}
Player Playback "Playback" (Stereo)  {alexa="Playback"}
Switch Stop     "Stop"     (Stereo)  {alexa="PlaybackStop"}
Number Bass     "Bass"     (Stereo)  {alexa="EqualizerBass" [range="-10:10"]}
Number Midrange "Mid"      (Stereo)  {alexa="EqualizerMidrange" [range="-10:10"]}
Number Treble   "Treble"   (Stereo)  {alexa="EqualizerTreble" [range="-10:10"]}
String Mode     "Mode"     (Stereo)  {alexa="EqualizerMode" [MOVIE="movie",MUSIC="music",TV="tv"]}
```

A security panel with alarm mode and different alarm/alert states.

```xtend
Group  SecurityPanel       "Security Panel"                  {alexa="SecurityPanel"}
Number ArmMode             "Arm Mode"        (SecurityPanel) {alexa="ArmState" [DISARMED=0,ARMED_STAY=1,ARMED_AWAY=2]}
Switch BurglaryAlarm       "Burglary"        (SecurityPanel) {alexa="BurglaryAlarm"}
Switch FireAlarm           "Fire"            (SecurityPanel) {alexa="FireAlarm"}
Switch CarbonMonoxideAlarm "Carbon Monoxide" (SecurityPanel) {alexa="CarbonMonoxideAlarm"}
Switch WaterAlarm          "Water"           (SecurityPanel) {alexa="WaterAlarm"}
Switch AlarmAlert          "Alarm Alert"     (SecurityPanel) {alexa="AlarmAlert"}
Switch ReadyAlert          "Ready Alert"     (SecurityPanel) {alexa="ReadyAlert"}
Switch TroubleAlert        "Trouble Alert"   (SecurityPanel) {alexa="TroubleAlert"}
Switch ZonesAlert          "Zones Alert"     (SecurityPanel) {alexa="ZonesAlert"}
```

A vacuum cleaner with vacuum mode and fan speed controls, and battery level status.

```xtend
Group  Vacuum       "Vacuum"                 {alexa="VacuumCleaner"}
String Mode         "Mode"          (Vacuum) {alexa="VacuumMode"}
Dimmer FanSpeed     "Fan Speed"     (Vaccum) {alexa="FanSpeed"}
Number BatteryLevel "Battery Level" (Vacuum) {alexa="BatteryLevel"}
```

A water heater with temperature and power on/off controls.

```xtend
Group  WaterHeater    "Water Heater"                            {alexa="WaterHeater"}
Number Temperature    "Temperature [%.1f °C]"     (WaterHeater) {alexa="CurrentTemperature"}
Number TargetSetpoint "Target Setpoint [%.1f °C]" (WaterHeater) {alexa="TargetTemperature"}
Switch Power          "Power"                     (WaterHeater) {alexa="PowerState"}
```

<a name="item-sensor"></a>

## Item State

Item states, reported back to Alexa, are formatted based on their [item state presentation](https://www.openhab.org/docs/configuration/items.html#state-presentation) definition if configured. This means you can control the precision of number values (e.g. `%.1f °C` will limit reported temperature value to one decimal point).

For items that don't have a state, these can be configured as not retrievable, automatically when the item [parameter `autoupdate`](https://www.openhab.org/docs/configuration/items.html#parameter-autoupdate) is set as `autoupdate="false"` or by using metadata parameter `retrievable="false"`. In that case, the skill will not report back the state of the given item to Alexa. It is important to note that this will affect the usability of some of the advanced features in the Alexa app that require state reporting.

```xtend
Switch Switch1 "Switch 1" {alexa="Switch", autoupdate="false"}
Switch Switch2 "Switch 2" {alexa="Switch" [retrievable="false"]}
```

For item decouple state, only certain [device attributes](#device-attributes), such as [`lockState`](#lockstate) and [`openState`](#openstate), supports that feature using a separate item to report the current state over the actionable one, to improve state reporting accuracy.

It is important to note since asynchronous response is not supported by the skill as of yet, the decouple state will need to be available right away for the skill to report the device latest status.

Below is an example of a lock device with decouple state.

```xtend
Group   Lock    "Lock"           {alexa="Lock"}
Switch  Control "Control" (Lock) {alexa="TargetLockState"}
Contact Status  "Status"  (Lock) {alexa="CurrentLockState"}
```

## Item Unit of Measurement

With the introduction of the [unit of measurement](https://www.openhab.org/docs/concepts/units-of-measurement.html) concept, the item unit can be automatically determined for thermostat and temperature using that feature, removing the need of having to set the metadata scale parameter for each of the relevant items or groups.

Below are two examples; the scale on the first will be set to Fahrenheit based on how it is defined in the item state presentation pattern and the second one will be set based on your openHAB system [regional settings](#regional-settings) (US=Fahrenheit; SI=Celsius).

```xtend
Number:Temperature Temperature1 "Temperature [%.1f °F]" {alexa="CurrentTemperature"}
Number:Temperature Temperature2 "Temperature"           {alexa="CurrentTemperature"}
```

## Networking Capabilities

To interact with the networking capabilities of a router, such as controlling the network access for a specific device, the [networking attributes](#networking-attributes) are available to configure a representation of a home network and its connected devices.

In order to be take advantage of these capabilities, your router must be configured as a [group endpoint](#group-endpoint) based on [`HomeNetwork`](#homenetwork) supported device types. If it doesn't have any other capabilities, it can be an empty group. Likewise, connected devices must be configured based on [`ConnectedDevice`](#connecteddevice) supported device types and metadata parameters.

```xtend
Group  Router  "Router"          {alexa="Router"}

Group  Laptop  "Laptop" (Router) {alexa="Laptop" [macAddress="00:21:86:B5:6E:10"]}
Switch Access1 "Access" (Laptop) {alexa="NetworkAccess"}

Group  Tablet  "Tablet" (Router) {alexa="Tablet" [macAddress="00:21:86:B5:6E:11"]}
Switch Access2 "Access" (Tablet) {alexa="NetworkAccess"}
```

<a name="building-block-apis"></a>

## Generic Capabilities

For general-purpose capabilities that can be used to model different components of a device, which aren't covered by the existing [device attributes](#device-attributes), the [generic attributes](#generic-attributes) are available to highly customize how you interact with that device via Alexa, using various metadata parameters to model the full feature set of a complex device.

A washer and its settings modeled with multiple mode-type generic attributes.

```xtend
Group  Washer      "Washer"               {alexa="Washer"}
String Cycle       "Cycle"       (Washer) {alexa="Mode" [capabilityNames="Wash Cycle,Wash Setting", supportedModes="Normal=Normal:Cottons,Delicate=@Value.Delicate:Knits", ordered=false]}
Number Temperature "Temperature" (Washer) {alexa="Mode" [capabilityNames="Wash Temperature,@Setting.WaterTemperature", supportedModes="0=Cold:Cool,1=Warm,2=Hot", ordered=true]}
String Status      "Status"      (Washer) {alexa="Mode" [capabilityNames="Wash Status", supportedModes="Washing,Rinsing,Spinning", nonControllable=true]}
Switch Power       "Power"       (Washer) {alexa="PowerState"}
```

A camera and its settings modeled with multiple range-type generic attributes.

```xtend
Group  Camera "Camera"          {alexa="Camera"}
Number Pan    "Pan"    (Camera) {alexa="RangeValue" [capabilityNames="Pan,Rotate", supportedRange="-200:200:1", presets="-200=Far Left,0=Center,200=Far Right"]}
Number Tilt   "Tilt"   (Camera) {alexa="RangeValue" [capabilityNames="@Setting.Tilt", supportedRange="-50:50:1", presets="-50=@Value.Down,0=Center,50=@Value.Up"]}
Number Zoom   "Zoom"   (Camera) {alexa="RangeValue" [capabilityNames="Zoom", supportedRange="0:200:50", presets="0=@Value.Minimum,200=@Value.Maximum"]}
String Stream "Stream" (Camera) {alexa="CameraStream"}
Switch Power  "Power"  (Camera) {alexa="PowerState"}
```

A fireplace and its settings modeled with a mix of range/mode-type generic attributes.

```xtend
Group  Fireplace "Fireplace"             {alexa="Other"}
Number Burners   "Burners"   (Fireplace) {alexa="RangeValue" [capabilityNames="@Setting.Preset", supportedRange="1:3:1", presets="1=@Value.Low:@Value.Minimum,2=@Value.Medium:Normal,3=@Value.High:@Value.Maximum"]}
String Flame     "Flame"     (Fireplace) {alexa="Mode" [capabilityNames="Flame Type", supportedModes="Campfire=Campfire:Normal,Candle,IceFlame=Ice Flame"]}
Color  Color     "Color"     (Fireplace) {alexa="Brightness,Color"}
Switch Power     "Power"     (Fireplace) {alexa="PowerState"}
```

A guitar amp and its settings modeled with a mix of range/mode/toggle-type generic attributes.

```xtend
Group  GuitarAmp "Guitar Amp"            {alexa="Other"}
Switch Overdrive "Overdrive" (GuitarAmp) {alexa="ToggleState" [capabilityNames="Overdrive"]}
Number Gain      "Gain"      (GuitarAmp) {alexa="RangeValue" [capabilityNames="Gain,Drive", supportedRange="1:10:1"]}
String Preset    "Preset"    (GuitarAmp) {alexa="Mode" [capabilityNames="@Setting.Preset,Effect", supportedModes="Normal=Normal:Standard,LowGain=Low Gain,LeadBoost=Lead Boost,Metal"]}
Number Volume    "Volume"    (GuitarAmp) {alexa="VolumeLevel"}
Switch Mute      "Mute"      (GuitarAmp) {alexa="MuteState"}
Number Bass      "Bass"      (GuitarAmp) {alexa="EqualizerBass"}
Number Midrange  "Midrange"  (GuitarAmp) {alexa="EqualizerMidrange"}
Number Treble    "Treble"    (GuitarAmp) {alexa="EqualizerTreble"}
Switch Power     "Power"     (GuitarAmp) {alexa="PowerState"}
```

A router and its settings modeled with a mix of mode/toggle-type generic attributes.

```xtend
Group  Router      "Router"                 {alexa="Router"}
Switch 2GGuestWiFi "2G Guest WiFi" (Router) {alexa="ToggleState" [capabilityNames="@Setting.2GGuestWiFi"]}
Switch 5GGuestWiFi "5G Guest WiFi" (Router) {alexa="ToggleState" [capabilityNames="@Setting.5GGuestWiFi"]}
String Mode        "Mode"          (Router) {alexa="Mode" [capabilityNames="@Setting.Mode", supportedModes="Normal,Gaming,Streaming"]}
```

A smart watch and its settings modeled with multiple read-only range-type generic attributes.

```xtend
Group  SmartWatch "SmartWatch"              {alexa="Wearable"}
Number Steps      "Steps"      (SmartWatch) {alexa="RangeValue" [capabilityNames="Steps", supportedRange="0:100000:1", nonControllable=true]}
Number Floors     "Floors"     (SmartWatch) {alexa="RangeValue" [capabilityNames="Floors", supportedRange="0:1000:1", nonControllable=true]}
Number Battery    "Battery"    (SmartWatch) {alexa="BatteryLevel"}
```

## Semantic Extensions

Semantic extensions are used to further customize how to interact with a device. This functionality is only supported by the [generic attributes](#generic-attributes). The Alexa API currently provides `Close`, `Open`, `Lower` and `Raise` interactions, removing the need for the Alexa routine workaround to control certain devices such as blinds or doors. Additionally, the skill includes `Pause`, `Resume`, `Stop`, `TurnOff` and `TurnOn` custom interactions. A semantic is composed of an action mapping and, in some cases, a state mapping. The actions are used for interacting with the device and the states for displaying its current semantic state in the Alexa app (Depending on [device types](#device-types)). The supported action and state names are listed in the [semantic catalog](#semantic-catalog).

It is important to note that only one given semantic is allowed per endpoint. Additionally, adjust action mappings (e.g `Raise=(+10)`) are only supported by Alexa API action semantics.

Here is how some the [device attributes](#device-attributes) using semantic extensions are translating to:

A window blind [position state](#position-state). For example, when requesting *Alexa, open the blind*, the item will receive command `UP`. Likewise, when asking *Alexa, lower the blind*, it will receive command `DOWN`. And when requesting *Alexa, stop the blind*, it will receive command `STOP`. For position request, since Rollershutter range value are inverted by default, when requesting *Alexa, set the blind to 40%*, the item state will be set to `60`.

```xtend
Rollershutter Blind "Blind" {alexa="Blind.RangeValue" [capabilityNames="@Setting.Position", supportedCommands="UP=@Value.Up:@Value.Open,DOWN=@Value.Down:@Value.Close,STOP=@Value.Stop", supportedRange="0:100:1", unitOfMeasure="Percent", actionMappings="Close=DOWN,Open=UP,Lower=DOWN,Raise=UP,Stop=STOP", stateMappings="Closed=100,Open=0:99"]}
```

A window curtain [position state](#position-state). For example, when requesting *Alexa, open the curtain*, the item state will be set to `100`. Likewise, when asking *Alexa, close the blind*, it be set to `0`.

```xtend
Dimmer Curtain "Curtain" {alexa="Curtain.RangeValue" [capabilityNames="@Setting.Position", supportedRange="0:100:1", unitOfMeasure="Percent", actionMappings="Close=0,Open=100", stateMappings="Closed=0,Open=1:100"]}
```

A door [open state](#open-state). For example, when requesting *Alexa, open the door*, the item state will be set to `ON`.

```xtend
Switch Door "Door" {alexa="Door.Mode" [capabilityNames="@Setting.Opening", supportedModes="ON=@Value.Open,OFF=@Value.Close", actionMappings="Close=OFF,Open=ON,Lower=OFF,Raise=ON", stateMappings="Closed=OFF,Open=ON"]}
```

A vacuum cleaner [mode](#vacuum-mode). For example, when requesting *Alexa, turn on the vacuum cleaner*, the item state will be set to `CLEAN`. Likewise, when asking *Alexa, pause the vacuum cleaner*, it be set to `PAUSE`. And when requesting *Alexa, resume the vacuum cleaner*, it will be set to `CLEAN` again.

```xtend
String VacuumCleaner "Vacuum Cleaner" {alexa="VacuumCleaner.Mode" [capabilityNames="@Setting.Mode", supportedModes="CLEAN=@Setting.Clean,DOCK=@Setting.Dock,SPOT=@Setting.Spot,PAUSE=@Setting.Pause,STOP=@Setting.Stop", actionMappings="Resume=CLEAN,Pause=PAUSE,Stop=STOP,TurnOn=CLEAN,TurnOff=DOCK"]}
```

# Item Configuration

In order to configure an Alexa endpoint, one or more device configuration, composed of a [type](#device-types) and an [attribute](#device-attributes) `{alexa="<deviceType>.<deviceAttribute>"}`, must be defined in the "Alexa" item metadata settings. Depending on the type of endpoint being configured, the device type or attribute can be omitted.

For [single endpoints](#single-endpoint), when a device is only composed of a type, the default attribute(s) of that type are used. Using the single dimmer light shorthand example from above, the `Light` device type default attributes for a "Dimmer" item are [`PowerState`](#powerstate) and [`Brightness`](#brightness). The fully qualified definition would be:

```xtend
Dimmer LightSwitch "Light Switch" {alexa="Light.PowerState,Light.Brightness"} // Equivalent to {alexa="Light"}
```

Likewise, when a device is only composed of an attribute, its type would be derived from the default category of each configured attribute. Using the same example again, using [`PowerState`](#powerstate) and [`Brightness`](#brightness) attributes, the categories would be respectively "SWITCH" and "LIGHT" with the former being the main endpoint display category. While not providing a device type is supported, it highly recommended to always specify one, when configuring a single endpoint, to prevent potential functionality limitations on the Alexa end.

```xtend
Dimmer LightSwitch "Light Switch" {alexa="PowerState,Brightness"}
```

For [group endpoints](#group-endpoint), the metadata at the group item level can only be a device type. This defines the endpoint category for all the item capabilities part of it and the supported attributes. The associated items metadata configuration doesn't need to specify that same device type unless aiming to use the default attributes of that device type. Each attribute needs to be supported by the group device type, otherwise they would be ignored. Using the group smart color bulb example above, the fully qualified definition would be:

```xtend
Group  Bulb        "Bulb"                {alexa="Light"}
Color  Color       "Color"       (Bulb)  {alexa="Light.PowerState,Light.Brightness,Light.Color"}
Dimmer Temperature "Temperature" (Bulb)  {alexa="Light.ColorTemperature"}
```

A better way to configure this endpoint, since the `Light` device type default attributes for a "Color" item are [`PowerState`](#powerstate), [`Brightness`](#brightness) and [`Color`](#color), the device type with no attribute can be used as well at the item capability level:

```xtend
Group  Bulb        "Bulb"                {alexa="Light"}
Color  Color       "Color"       (Bulb)  {alexa="Light"} // Equivalent to {alexa="PowerState,Brightness,Color"}
Dimmer Temperature "Temperature" (Bulb)  {alexa="ColorTemperature"}
```

<a name="display-categories"></a>
<a name="supported-item-metadata"></a>

## Device Types

A device type represents an [Alexa display category](https://developer.amazon.com/docs/device-apis/alexa-discovery.html#display-categories) that affects how the endpoint appears in the [Alexa app](https://developer.amazon.com/docs/smarthome/best-practices-for-the-alexa-app.html#how-smart-home-devices-display-in-the-alexa-app) and in some cases, the associated features.

It is important to note that all the below device types supports the [generic attributes](#generic-attributes).

Default attributes for each type are displayed in _italic_ and are depending on supported item types.

Device Types | Supported Attributes | Description
-------------|----------------------|------------
`AirConditioner` | _[`PowerState`](#powerstate)_, [`TargetTemperature`](#targettemperature), [`CurrentTemperature`](#currenttemperature), [`FanSpeed`](#fanspeed), [`FanDirection`](#fandirection), [`FanOscillate`](#fanoscillate) | A device that cools the air in interior spaces.
`AirFreshener` | Same as `Fan` | A device that emits pleasant odors and masks unpleasant odors in interior spaces.
`AirPurifier` | Same as `Fan` | A device that improves the quality of air in interior spaces.
`Automobile` | [`BatteryLevel`](#batterylevel), [`FanSpeed`](#fanspeed), [`LockState`](#lockstate), [`PowerState`](#powerstate), [`TargetTemperature`](#targettemperature), [`CurrentTemperature`](#currenttemperature) | A motor vehicle (automobile, car).
`AutomobileAccessory` | [`BatteryLevel`](#batterylevel), [`CameraStream`](#camerastream), [`FanSpeed`](#fanspeed), [`PowerState`](#powerstate) | A smart device in an automobile, such as a dash camera.
`Blind`, `Curtain`, `Shade` | _[`OpenState`](#openstate)_, _[`PositionState`](#positionstate)_, [`TiltAngle`](#tiltAngle), [`TargetOpenState`](#targetopenstate), [`CurrentOpenState`](#currentopenstate) | A window covering on the inside of a structure.
`BluetoothSpeaker` | _[`PowerState`](#powerstate)_, _[`VolumeLevel`](#volumelevel)_, [`VolumeStep`](#volumestep), [`MuteState`](#mutestate), [`MuteStep`](#mutestep), [`EqualizerBass`](#equalizerbass), [`EqualizerMidrange`](#equalizermidrange), [`EqualizerTreble`](#equalizertreble), [`EqualizerMode`](#equalizermode), [`Channel`](#channel), [`ChannelStep`](#channelstep), [`Input`](#input), [`Playback`](#playback), [`PlaybackStop`](#playbackstop), [`BatteryLevel`](#batterylevel) | A speaker that connects to an audio source over Bluetooth.
`Camera` | _[`PowerState`](#powerstate)_, _[`CameraStream`](#camerastream)_, [`BatteryLevel`](#batterylevel) | A security device with video or photo functionality.
`ChristmasTree` | Same as `Light` | A religious holiday decoration that often contains lights.
`CoffeeMaker` | _[`PowerState`](#powerstate)_ | A device that makes coffee.
`Computer` | _[`PowerState`](#powerstate)_, [`NetworkAccess`](#networkaccess) | A non-mobile computer, such as a desktop computer.
`ContactSensor` | _[`ContactDetectionState`](#contactdetectionstate)_, [`BatteryLevel`](#batterylevel) | An endpoint that detects and reports changes in contact between two surfaces.
`Dishwasher` | _[`PowerState`](#powerstate)_ | A device that cleans dishes.
`Door` | _[`OpenState`](#openstate)_, [`TargetOpenState`](#targetopenstate), [`CurrentOpenState`](#currentopenstate) | A door.
`Doorbell` | Same as `Camera` | A doorbell.
`Dryer` | _[`PowerState`](#powerstate)_ | A device that dries wet clothing.
`Fan` | _[`PowerState`](#powerstate)_, _[`FanSpeed`](#fanspeed)_, [`FanDirection`](#fandirection), [`FanOscillate`](#fanoscillate) | A fan.
`GameConsole` | _[`PowerState`](#powerstate)_, [`NetworkAccess`](#networkaccess) | A game console, such as Microsoft Xbox or Nintendo Switch.
`GarageDoor` | _[`OpenState`](#openstate)_, [`TargetOpenState`](#targetopenstate), [`CurrentOpenState`](#currentopenstate), [`ObstacleAlert`](#obstaclealert) | A garage door. Supports unlock by voice code. Only supported in `en-US`. For other languages, use `Door` instead.
`Headphones` | Same as `BluetoothSpeaker` | A wearable device that transmits audio directly into the ear.
`Hub` | _[`PowerState`](#powerstate)_ | A smart-home hub.
`Laptop` | _[`PowerState`](#powerstate)_, [`BatteryLevel`](#batterylevel), [`NetworkAccess`](#networkaccess) | A laptop or other mobile computer.
`Light` | _[`PowerState`](#powerstate)_, _[`Brightness`](#brightness)_, _[`Color`](#color)_, [`ColorTemperature`](#colortemperature) | A light source or fixture.
`Lock` | _[`LockState`](#lockstate)_, [`TargetLockState`](#targetlockstate), [`CurrentLockState`](#currentlockstate), [`BatteryLevel`](#batterylevel) | An endpoint that locks.
`Microwave` | _[`PowerState`](#powerstate)_ | A microwave oven.
`MobilePhone` | _[`PowerState`](#powerstate)_, [`BatteryLevel`](#batterylevel), [`NetworkAccess`](#networkaccess) | A mobile phone.
`MotionSensor` | _[`MotionDetectionState`](#motiondetectionstate)_, [`BatteryLevel`](#batterylevel) | An endpoint that detects and reports movement in an area.
`MusicSystem` | Same as `StreamingDevice` | A network-connected music system.
`NetworkHardware` | _[`PowerState`](#powerstate)_ | A network router.
`Outlet` | Same as `Switch` | A module that is plugged into an existing electrical outlet, and then has a device plugged into it.
`Oven` | _[`PowerState`](#powerstate)_ | An oven cooking appliance.
`Phone` | _[`PowerState`](#powerstate)_ | A non-mobile phone, such as landline or an IP phone.
`Printer` | _[`PowerState`](#powerstate)_ | A device that prints.
`Router` | Same as `NetworkHardware` | A network router.
`Screen` | Same as `Television` | A projector screen.
`SecurityPanel` | _[`ArmState`](#armstate)_, [`BurglaryAlarm`](#burglaryalarm), [`CarbonMonoxideAlarm`](#carbonmonoxidealarm), [`FireAlarm`](#firealarm), [`WaterAlarm`](#wateralarm), [`AlarmAlert`](#alarmalert), [`ReadyAlert`](#readyalert), [`TroubleAlert`](#troublealert), [`ZonesAlert`](#zonealert) | A security panel.
`SecuritySystem` | Same as `SecurityPanel` | A security system.
`Shutter`, `Awning` | Same as `Blind` | A window covering on the outside of a structure.
`SlowCooker` | _[`PowerState`](#powerstate)_ | An electric cooking device that sits on a countertop, cooks at low temperatures, and is often shaped like a cooking pot.
`Speaker` | _[`PowerState`](#powerstate)_, _[`VolumeLevel`](#volumelevel)_, [`VolumeStep`](#volumestep), [`MuteState`](#mutestate), [`MuteStep`](#mutestep), [`EqualizerBass`](#equalizerbass), [`EqualizerMidrange`](#equalizermidrange), [`EqualizerTreble`](#equalizertreble), [`EqualizerMode`](#equalizermode), [`Channel`](#channel), [`ChannelStep`](#channelstep), [`Input`](#input), [`Playback`](#playback), [`PlaybackStop`](#playbackstop) | A speaker or speaker system.
`StreamingDevice` | _[`PowerState`](#powerstate)_, _[`Playback`](#playback)_, [`PlaybackStop`](#playbackstop), [`Channel`](#channel), [`ChannelStep`](#channelstep), [`Input`](#input), [`VolumeLevel`](#volumelevel), [`VolumeStep`](#volumestep), [`MuteState`](#mutestate), [`MuteStep`](#mutestep), [`EqualizerBass`](#equalizerbass), [`EqualizerMidrange`](#equalizermidrange), [`EqualizerTreble`](#equalizertreble), [`EqualizerMode`](#equalizermode) | A streaming device such as Apple TV, Chromecast, or Roku.
`Switch` | _[`PowerState`](#powerstate)_, _[`PowerLevel`](#powerlevel)_, _[`Percentage`](#percentage)_ | A switch wired directly to the electrical system. A switch can control a variety of devices. For lighting devices, use `Light` instead.
`Tablet` | _[`PowerState`](#powerstate)_,  [`BatteryLevel`](#batterylevel), [`NetworkAccess`](#networkaccess) | A tablet computer.
`Television` | _[`PowerState`](#powerstate)_, _[`Channel`](#channel)_, [`ChannelStep`](#channelstep), [`Input`](#input), [`VolumeLevel`](#volumelevel), [`VolumeStep`](#volumestep), [`MuteState`](#mutestate), [`MuteStep`](#mutestep), [`EqualizerBass`](#equalizerbass), [`EqualizerMidrange`](#equalizermidrange), [`EqualizerTreble`](#equalizertreble), [`EqualizerMode`](#equalizermode), [`Playback`](#playback), [`PlaybackStop`](#playbackstop) | A television.
`TemperatureSensor` | _[`CurrentTemperature`](#currenttemperature)_, [`BatteryLevel`](#batterylevel) | An endpoint that reports temperature, but does not control it. The temperature data of the endpoint doesn't appear in the Alexa app. If your endpoint also controls temperature, use `Thermostat` instead.
`Thermostat` | _[`HeatingCoolingMode`](#heatingcoolingmode)_, [`TargetTemperature`](#targettemperature), [`CoolingSetpoint`](#coolingsetpoint), [`HeatingSetpoint`](#heatingsetpoint), [`EcoCoolingSetpoint`](#ecocoolingsetpoint), [`EcoHeatingSetpoint`](#ecoheatingsetpoint), [`ThermostatHold`](#thermostathold), [`ThermostatFan`](#thermostatfan), [`CurrentTemperature`](#currenttemperature), [`CurrentHumidity`](#currenthumidity), [`BatteryLevel`](#batterylevel) | An endpoint that controls temperature, stand-alone air conditioners, or heaters with direct temperature control. If your endpoint senses temperature but does not control it, use `TemperatureSensor` instead.
`VacuumCleaner` | _[`PowerState`](#powerstate)_, _[`VacuumMode`](#vacuummode)_, [`FanSpeed`](#fanspeed), [`BatteryLevel`](#batterylevel) | A vacuum cleaner.
`Washer` | _[`PowerState`](#powerstate)_ | A device that cleans clothing.
`WaterHeater` | _[`PowerState`](#powerstate)_, [`TargetTemperature`](#targettemperature), [`CurrentTemperature`](#currenttemperature) | A device that heats water, often consisting of a large tank.
`Wearable`| _[`PowerState`](#powerstate)_, [`BatteryLevel`](#batterylevel), [`NetworkAccess`](#networkaccess) | A network-connected wearable device, such as an Apple Watch, Fitbit, or Samsung Gear.
`Other`| [All attributes](#device-attributes), except [networking](#networking-attributes) and [scenes](#scene-attributes) | An endpoint that doesn't belong to one of the other categories.

## Device Attributes

A device attribute represents one or more [Alexa Smart Home interface capabilities](https://developer.amazon.com/docs/device-apis/list-of-interfaces.html) that defines the supported functionalities of a given device.

While the majority of the device attributes are based on the Alexa native/specific capabilities, some, such as [`PositionState`](#positionstate), were introduced in the skill to fill the lack of native support using a combination of [generic capabilities](#generic-capabilities) in order to ease the configuration of commonly used functionalities.

For device attributes used in a [group endpoint](#group-endpoint), if multiple items with the same attribute are part of a group, only the first one will be considered while the others will be ignored. This doesn't apply to [generic attributes](#generic-attributes).

Any group level metadata parameters are passed to each members part of that group. This is useful when the same parameter is used across multiple item capabilities of a group endpoint. For example, the `scale` temperature/setpoint parameter in a `Thermostat` group.

It is important to note that not all the attributes listed below are [available](#regional-availability) globally.

### Camera Attributes

#### `CameraStream`

Items that represent the feed from a security camera.

It requires installing the [IP Camera binding](https://www.openhab.org/addons/bindings/ipcamera/) to create a [HLS live stream](https://www.openhab.org/addons/bindings/ipcamera/#hls-http-live-streaming), and running your [openHAB server behind a reverse proxy](https://www.openhab.org/docs/installation/security.html#running-openhab-behind-a-reverse-proxy) that can be accessed over HTTPS on your local network and port 443 using a valid SSL certificate.

Once setup, configure the item linked to the binding `hlsUrl` channel and set the metadata parameter `proxyBaseUrl="https://openhab.myserver.tld"` pointing to your openHAB subdomain proxy base URL. This will cause the skill to provide a stream URL to your Echo device, when requested, that should be accessible at `https://openhab.myserver.tld/ipcamera/camera1/ipcamera.m3u8` along with a static image URL, replacing the extension with `.jpg`.

* Supported item types:
  * String
* Supported metadata parameters:
  * proxyBaseUrl=`<url>`
    * required proxy base URL
  * resolution=`<resolution>`
    * supported resolutions are `480p`, `720p`, `1080p`
    * defaults to `1080p`
* Utterance examples:
  * *Alexa, show the `<device name>`.*

### Cover Attributes

#### `OpenState`

Items that represent the open state of a door or window blind (ON open, OFF close). For decouple state support, use [`TargetOpenState`](#targetopenstate) and [`CurrentOpenState`](#currentopenstate) instead. For door contact sensors, use [`ContactDetectionState`](#contactdetectionstate) instead.

* Supported item types:
  * Switch
* Supported metadata parameters:
  * inverted=`<boolean>`
    * set to true to invert state
    * defaults to false
* Utterance examples:
  * *Alexa, open the `<device name>`.*
  * *Alexa, close the `<device name>`.*
  * *Alexa, raise the `<device name>`.*
  * *Alexa, lower the `<device name>`.*
  * *Alexa, is the `<device name>` opened?* ([`GarageDoor`](#device-types) type only)
  * *Alexa, what's the `<device name>` opening?*

#### `TargetOpenState`

Items that represent the target open state of a door or window blind with decouple state. This should be paired with [`CurrentOpenState`](#currentopenstate).

Same configuration as [`OpenState`](#openstate).

#### `CurrentOpenState`

Items that represent the current open state of a door or window blind with decouple state. This needs to be paired with [`TargetOpenState`](#targetopenstate). The state of this item will be returned instead of the original actionable item.

* Supported item types:
  * Contact [CLOSED="CLOSED", OPEN="OPEN"]
  * Number [CLOSED=0, OPEN=1]
  * String [CLOSED="CLOSED", OPEN="OPEN"]
  * Switch [CLOSED="OFF", OPEN="ON"]
* Supported metadata parameters:
  * CLOSED=`<state>` (Number/String only)
  * OPEN=`<state>` (Number/String only)
  * inverted=`<boolean>` (Contact/Switch only)
    * set to true to invert state
    * defaults to false

#### `ObstacleAlert`

Items that represent the alert state when an obstacle is detected preventing closing a garage door. This needs to be paired with [`OpenState`](#openstate). This attribute only works with [`GarageDoor`](#device-types) type. When in alert state, close requests will trigger an error response.

* Supported item types:
  * Contact [OK="CLOSED", ALERT="OPEN"]
  * Switch [OK="OFF", ALERT="ON"]
* Supported metadata parameters:
  * inverted=`<boolean>`
    * set to true to invert item state
    * defaults to false

#### `PositionState`

Items that represent the position state of window blind.

If paired with [`TiltAngle`](#tiltangle), the primary controls (open/close/stop) can be defined as position-based or tilt-based setting metadata parameter `primaryControl="position"` at the group level. It is important to note that raise/lower controls aren't affected by these settings and will remain position-based.

* Supported item types:
  * Dimmer
  * Rollershutter
* Supported metadata parameters:
  * inverted=`<boolean>`
    * set to true to invert state
    * defaults to true for Rollershutter, otherwise false for Dimmer
  * primaryControl=`<type>`
    * supported types are `position` or `tilt`
    * only relevant when part of a [group endpoint](#group-endpoint)
    * defaults to `position`
  * presets=`<presets>`
    * each preset formatted as `<presetValue>=<@assetIdOrName1>:...` (e.g. `presets="20=Morning,60=Afternoon,80=Evening:@Setting.Night"`)
    * predefined [asset ids](#asset-catalog)
    * defaults to item state description options `presets="value1=label1,..."` if defined, otherwise no presets
  * language=`<code>`
    * text-based preset name language support
    * two-letter language code: `ar`, `de`, `en`, `es`, `fr`, `hi`, `it`, `ja`, `pt`
    * defaults to your server [regional settings](#regional-settings) if defined, otherwise `en`
  * actionMappings=`<mappings>`
    * each [semantic](#semantic-extensions) mapping formatted as `<action>=<value>`
    * `Open`, `Close` and `Stop` semantics only available when primary control is `position`
    * defaults to:
      * Dimmer => `Close=0,Open=100,Lower=0,Raise=100` or `Close=100,Open=0,Lower=100,Raise=0` (inverted)
      * Rollershutter => `Close=DOWN,Open=UP,Lower=DOWN,Raise=UP,Stop=STOP`
* Utterance examples:
  * *Alexa, open the `<device name>`.*
  * *Alexa, close the `<device name>`.*
  * *Alexa, raise the `<device name>`.*
  * *Alexa, lower the `<device name>`.*
  * *Alexa, stop the `<device name>`.* (Rollershutter only)
  * *Alexa, set the `<device name>` position to 50 percent.*
  * *Alexa, set the `<device name>` position to `<preset name>`.*
  * *Alexa, set the `<device name>` position to up.* (Rollershutter only)
  * *Alexa, set the `<device name>` position to down.* (Rollershutter only)
  * *Alexa, set the `<device name>` position to stop.* (Rollershutter only)
  * *Alexa, increase the `<device name>` position by 10 percent.*
  * *Alexa, decrease the `<device name>` position by 25 percent.*
  * *Alexa, what's the `<device name>` position?*

#### `TiltAngle`

Items that represent the tilt angle of a window blind.

If paired with [`PositionState`](#positionstate), the primary controls (open/close/stop) can be defined as position-based or tilt-based setting metadata parameter `primaryControl="tilt"` at the group level.

* Supported item types:
  * Dimmer (Percentage)
  * Number(:Angle) (Angle degree from -90 to 90)
  * Rollershutter (Percentage)
* Supported metadata parameters:
  * inverted=`<boolean>`
    * set to true to invert state
    * defaults to true for Rollershutter, otherwise false for Dimmer/Number
  * primaryControl=`<type>`
    * supported types are `position` or `tilt`
    * only relevant when part of a [group endpoint](#group-endpoint)
    * defaults to `position`
  * presets=`<presets>`
    * each preset formatted as `<presetValue>=<@assetIdOrName1>:...` (e.g. `presets="20=Morning,60=Afternoon,80=Evening:@Setting.Night"`)
    * predefined [asset ids](#asset-catalog)
    * defaults to item state description options `presets="value1=label1,..."` if defined, otherwise no presets
  * language=`<code>`
    * text-based preset name language support
    * two-letter language code: `ar`, `de`, `en`, `es`, `fr`, `hi`, `it`, `ja`, `pt`
    * defaults to your server [regional settings](#regional-settings) if defined, otherwise `en`
  * actionMappings=`<mappings>`
    * each [semantic](#semantic-extensions) mapping formatted as `<action>=<value>`
    * only available when primary control is `tilt`
    * defaults to:
      * Dimmer => `Close=0,Open=100` or `Close=100,Open=0` (inverted)
      * Number => `Close=-90,Open=0` or `Close=90,Open=0`(inverted)
      * Rollershutter => `Close=DOWN,Open=UP,Stop=STOP`
* Utterance examples:
  * *Alexa, open the `<device name>`.*
  * *Alexa, close the `<device name>`.*
  * *Alexa, stop the `<device name>`.* (Rollershutter only)
  * *Alexa, set the `<device name>` tilt to 30 degrees.* (Number only)
  * *Alexa, set the `<device name>` tilt to 50 percent.* (Dimmer/Rollershutter only)
  * *Alexa, set the `<device name>` tilt to `<preset name>`.*
  * *Alexa, set the `<device name>` tilt to up.* (Rollershutter only)
  * *Alexa, set the `<device name>` tilt to down.* (Rollershutter only)
  * *Alexa, set the `<device name>` tilt to stop.* (Rollershutter only)
  * *Alexa, increase the `<device name>` tilt by 5 degrees.* (Number only)
  * *Alexa, decrease the `<device name>` tilt by 10 percent.*  (Dimmer/Rollershutter only)
  * *Alexa, what's the `<device name>` tilt?*

### Entertainment Attributes

<a name="channelcontroller-channel"></a>
<a name="entertainmentchannel"></a>

#### `Channel`

Items that represent a channel. It is important to note only well-known channel names can be used as these are validated against a database on the Alexa side when requested. Unfortunately, Amazon doesn't provide a list of supported channel names. For String, by default, only requests by name are supported. To enable support for requests by number, set parameter `supportsChannelNumber=true`. For adjustment requests, by default, the increment is linear within the `range` parameter for Number, or the `channelMappings` parameter for String, based on the current state. For adjustment in incremental discrete steps, add [`ChannelStep`](#channelstep) to your entertainment group endpoint.

* Supported item types:
  * Number
  * String
* Supported metadata parameters:
  * channelMappings=`<mappings>`
    * each mapping formatted as `<channelId>=<channelName>` (e.g. `channelMappings="2=CBS,4=NBC,7=ABC,13=PBS"`)
    * required for channel requests by name support
    * defaults to no mappings
  * range=`<range>` (Number only)
    * range formatted as `<minValue>:<maxValue>` (e.g. `range="100:499"`)
    * defaults to `"1:9999"`
  * supportsChannelNumber=`<boolean>` (String only)
    * set to true if supports channel requests by number
    * defaults to false
* Utterance examples:
  * *Alexa, change the channel to `<channel number>` on the `<device name>`.* (Number or if `supportsChannelNumber=true`)
  * *Alexa, change the channel to `<channel name>` on the `<device name>`.*
  * *Alexa, next channel on the `<device name>`.* (if [`ChannelStep`](#channelstep) not defined)
  * *Alexa, previous channel on the `<device name>`.* (if [`ChannelStep`](#channelstep) not defined)
  * *Alexa, channel up on the `<device name>`.* (if [`ChannelStep`](#channelstep) not defined)
  * *Alexa, channel down on the `<device name>`.* (if [`ChannelStep`](#channelstep) not defined)

#### `ChannelStep`

Items that represent a channel adjusted in incremental discrete steps. For change requests by number or by name support, add [`Channel`](#channel) to your entertainment group endpoint.

* Supported item types:
  * String
* Supported metadata parameters:
  * CHANNEL_UP=`<command>`
  * CHANNEL_DOWN=`<command>`
* Utterance examples:
  * *Alexa, next channel on the `<device name>`.*
  * *Alexa, previous channel on the `<device name>`.*
  * *Alexa, channel up on the `<device name>`.*
  * *Alexa, channel down on the `<device name>`.*

<a name="inputcontroller-input"></a>
<a name="entertainmentinput"></a>

#### `Input`

Items that represent an input source (e.g. "HDMI 1" or "TUNER" on a stereo).

* Supported item types:
  * Number
  * String
* Supported metadata parameters:
  * supportedInputs=`<inputs>`
    * each input formatted as `<inputValue>=<inputName1>:...` (e.g. `supportedInputs="HDMI1=Cable:Comcast,HDMI2=Kodi"`)
    * requires at least two inputs to be specified
    * input value used as name if not provided (e.g. `supportedInputs="HDMI1,DVD"` <=> `supportedInputs="HDMI1=HDMI1,DVD=DVD`)
    * defaults to item state description options `supportedInputs="value1=label1,..."`, if defined, otherwise no supported inputs
  * language=`<code>`
    * input name language support
    * two-letter language code: `ar`, `de`, `en`, `es`, `fr`, `hi`, `it`, `ja`, `pt`
    * defaults to your server [regional settings](#regional-settings) if defined, otherwise `en`
* Utterance examples:
  * *Alexa, change the input to `<input name>` on the `<device name>`.*
  * *Alexa, set the `<device name>` input to `<input name>`.*
  * *Alexa, what's the `<device name>` input?*

<a name="speaker-volume"></a>
<a name="speakervolume"></a>

#### `VolumeLevel`

Items that represent a volume level as percentage. For adjustment in incremental discrete steps, use [`VolumeStep`](#volumestep) instead.

* Supported item types:
  * Dimmer
  * Number
* Supported metadata parameters:
  * increment=`<number>`
    * defaults to 10 (standard value provided by Alexa)
* Utterance examples:
  * *Alexa, set the volume of `<device name>` to 50.*
  * *Alexa, turn the volume up on `<device name>`.*
  * *Alexa, turn the volume down on `<device name>` by 20.*
  * *Alexa, increase the volume on the `<device name>`.*
  * *Alexa, lower the volume on the `<device name>` by 20.*

<a name="stepspeaker-volume"></a>

#### `VolumeStep`

Items that represent a volume level adjusted in incremental discrete steps. The skill limits adjustment to a maximum of 10 steps per request.

* Supported item types:
  * String
* Supported metadata parameters:
  * VOLUME_UP=`<command>`
  * VOLUME_DOWN=`<command>`
* Utterance examples:
  * *Alexa, increase the volume on the `<device name>`.*
  * *Alexa, lower the volume on the `<device name>` by 5.*
  * *Alexa, volume up on the `<device name>`.*
  * *Alexa, volume down 5 on the `<device name>`.*

<a name="speaker-muted"></a>
<a name="speakermute"></a>

#### `MuteState`

Items that represent a muted state (ON muted, OFF unmuted). For adjustment in discrete steps, use [`MuteStep`](#mutestep) instead.

* Supported item types:
  * Switch
* Supported metadata parameters:
  * inverted=`<boolean>`
    * set to true to invert state
    * defaults to false
* Utterance examples:
  * *Alexa, mute `<device name>`.*
  * *Alexa, unmute `<device name>`.*

<a name="stepspeaker-muted"></a>

#### `MuteStep`

Items that represent a muted state adjusted in discrete steps.

* Supported item types:
  * String
* Supported metadata parameters:
  * MUTE=`<command>`
* Utterance examples:
  * *Alexa, mute `<device name>`.*
  * *Alexa, unmute `<device name>`.*

<a name="equalizercontroller-bands-bass-midrange-treble"></a>

#### `EqualizerBass`

Items that represent the bass equalizer band range supported by an audio system.

* Supported item types:
  * Dimmer
  * Number
* Supported metadata parameters:
  * range=`<range>`
    * range formatted as `<minValue>:<maxValue>`
    * should be synced across different bands if configured since same values used for all bands due to Alexa restriction.
    * defaults to `"0:100"` for Dimmer, otherwise `"-10:10"` for Number
  * defaultLevel=`<number>`
    * defaults to range midpoint
  * increment=`<number>`
    * defaults to INCREASE/DECREASE for Dimmer, otherwise 1 for Number
* Utterance examples:
  * *Alexa, set bass to -2 on the `<device name>`.*
  * *Alexa, increase bass on the `<device name>`.*
  * *Alexa, decrease bass by 3 on the `<device name>`.*
  * *Alexa, reset bass on the `<device name>`.*
  * *Alexa, reset equalizer on the `<device name>`.*

#### `EqualizerMidrange`

Items that represent the midrange equalizer band range supported by an audio system.

Same configuration as [`EqualizerBass`](#equalizerbass).

#### `EqualizerTreble`

Items that represent the treble equalizer band range supported by an audio system.

Same configuration as [`EqualizerBass`](#equalizerbass).

<a name="equalizercontroller-mode"></a>

#### `EqualizerMode`

Items that represent a list of equalizer modes supported by an audio system.

* Supported item types:
  * Number [MOVIE=1, MUSIC=2, NIGHT=3, SPORT=4, TV=5]
  * String [MOVIE="movie", MUSIC="music", NIGHT="night", SPORT="sport", TV="tv"]
* Supported metadata parameters:
  * MOVIE=`<state>`
  * MUSIC=`<state>`
  * NIGHT=`<state>`
  * SPORT=`<state>`
  * TV=`<state>`
  * supportedModes=`<modes>`
    * comma delimited list (e.g. `supportedModes="MOVIE,MUSIC,TV"`)
    * supported modes are `MOVIE`, `MUSIC`, `NIGHT`, `SPORT`, `TV`
    * defaults to, depending on the parameters provided, either user-based or item type-based default mappings.
* Utterance examples:
  * *Alexa, set mode to movie on the `<device name>`.*

<a name="playbackcontroller-playback"></a>
<a name="mediaplayer"></a>

#### `Playback`

Items that represent the playback controls of a AV device. For stop command support, use [`PlaybackStop`](#playbackstop).

* Supported item types:
  * Player
* Supported metadata parameters:
  * supportedOperations=`<operations>`
    * comma delimited list (e.g. `supportedOperations="Play,Pause,Next,Previous"`)
    * defaults to `Play,Pause,Next,Previous,FastForward,Rewind`.
* Utterance examples:
  * *Alexa, play `<device name>`.*
  * *Alexa, resume `<device name>`.*
  * *Alexa, pause `<device name>`.*
  * *Alexa, next on `<device name>`.*
  * *Alexa, previous on `<device name>`.*
  * *Alexa, fast forward on `<device name>`.*
  * *Alexa, rewind on `<device name>`.*

#### `PlaybackStop`

Items that represent the playback stop command of a AV device. This needs to be paired with [`Playback`](#playback).

* Supported item types:
  * Switch
* Supported metadata parameters:
  * inverted=`<boolean>`
    * set to true to send `OFF` command instead of `ON`
    * defaults to false
* Utterance examples:
  * *Alexa, stop `<device name>`.*

### Fan Attributes

#### `FanSpeed`

Items that represent the speed of a fan.

* Supported item types:
  * Dimmer
  * Number
  * String [OFF="OFF", LOW="LOW", MEDIUM="MEDIUM", HIGH="HIGH"]
* Supported metadata parameters:
  * OFF=`<state>` (String only)
  * LOW=`<state>` (String only)
  * MEDIUM=`<state>` (String only)
  * HIGH=`<state>` (String only)
  * inverted=`<boolean>` (Dimmer only)
    * set to true to invert item state
    * defaults to false
  * speedLevels=`<number>` (Number only)
    * requires at least 2-speed
    * defaults to 3
* Utterance examples:
  * *Alexa, set the `<device name>` speed to off.*
  * *Alexa, set the `<device name>` speed to low.*
  * *Alexa, set the `<device name>` speed to medium.*
  * *Alexa, set the `<device name>` speed to high.*
  * *Alexa, set the `<device name>` speed to minimum.*
  * *Alexa, set the `<device name>` speed to maximum.*
  * *Alexa, set the `<device name>` speed to 30 percent.* (Dimmer only)
  * *Alexa, set the `<device name>` speed to 2.* (Number only)
  * *Alexa, increase the `<device name>` speed.*
  * *Alexa, decrease the `<device name>` speed.*
  * *Alexa, increase the `<device name>` speed by 10 percent.* (Dimmer only)
  * *Alexa, decrease the `<device name>` speed by 2.* (Number only)
  * *Alexa, what's the speed of `<device name>`?*

#### `FanDirection`

Items that represent a direction setting of a fan.

* Supported item types:
  * String [FORWARD="FORWARD", REVERSE="REVERSE"]
  * Switch [FORWARD="ON", REVERSE="OFF"]
* Supported metadata parameters:
  * FORWARD=`<state>` (String only)
  * REVERSE=`<state>` (String only)
  * inverted=`<boolean>` (Switch only)
    * set to true to invert item state
    * defaults to false
* Utterance examples:
  * *Alexa, set the `<device name>` direction to forward.*
  * *Alexa, set the `<device name>` direction to reverse.*
  * *Alexa, what's the direction of `<device name>`?*

#### `FanOscillate`

Items that represent an oscillate setting of a fan.

* Supported item types:
  * Switch
* Supported metadata parameters:
  * inverted=`<boolean>`
    * set to true to invert item state
    * defaults to false
* Utterance examples:
  * *Alexa, turn on the `<device name>` oscillation.*
  * *Alexa, turn off the `<device name>` oscillation.*
  * *Alexa, is the `<device name>` oscillation on?*

### Lighting Attributes

<a name="brightnesscontroller-brightness"></a>

#### `Brightness`

Items that represent a lighting device responding to brightness commands.

* Supported item types:
  * Color
  * Dimmer
* Utterance examples:
  * *Alexa, set the `<device name>` to 50 percent.*
  * *Alexa, brighten the `<device name>` by 25 percent.*
  * *Alexa, dim the `<device name>`.*

<a name="colorcontroller-color"></a>

#### `Color`

Items that represent a lighting device responding to color commands.

* Supported item types:
  * Color
* Utterance examples:
  * *Alexa, set the `<device name>` to red.*

<a name="colortemperaturecontroller-colortemperatureinkelvin"></a>

#### `ColorTemperature`

Items that represents a color temperature. It is important to note that temperature adjustment requests for endpoints including a color item, will be rejected if the endpoint is in color mode (Dimmer => _undefined_ temperature or color saturation > 0; Number => _undefined_ temperature or temperature = 0). In that event, set the initial white level before requesting subsequent adjustments.

* Supported item types:
  * Dimmer (Colder `0%` to warmer `100%` based on defined temperature range for bindings integration)
  * Number (Color temperature value in Kelvin for custom integration)
* Supported binding presets:
  * [hue](https://www.openhab.org/addons/bindings/hue/) [color=`2000:6500`, white=`2200:6500`]
  * [lifx](https://www.openhab.org/addons/bindings/lifx/) [color=`2500:9000`, white=`2700:6500`]
  * [milight](https://www.openhab.org/addons/bindings/milight/) [color=`2700:6500`, white=`2700:6500`]
  * [tradfri](https://www.openhab.org/addons/bindings/tradfri/) [color=`1780:6000`, white=`2200:4000`]
  * [tplinksmarthome](https://www.openhab.org/addons/bindings/tplinksmarthome/) [color=`2500:9000`, white=`2700:6500`]
  * [yeelight](https://www.openhab.org/addons/bindings/yeelight/) [color=`1700:6500`, white=`2700:6500`]
* Supported metadata parameters:
  * binding=`<id>`
    * id formatted as:
      * color type => `<bindingId>(:color)` (e.g. `binding="hue"` or `binding="hue:color"`)
      * white type => `<bindingId>:white` (e.g. `binding="hue:white"`)
    * only for [GUI-based configuration](https://www.openhab.org/docs/configuration/)
    * defaults to channel metadata value for items configured via text files
  * range=`<range>`
    * range formatted as `<minValue>:<maxValue>` in Kelvin (e.g. `range="2700:6500"`)
    * defaults to, depending on the parameters provided in order of precedence:
      * preset-based using the binding linked name and thing type to differentiate color/white ranges, defaulting to color range
      * defaults to `1000:10000`
  * increment=`<number>`
    * expressed in % (Dimmer); in Kelvin (Number)
    * defaults to INCREASE/DECREASE for Dimmer, otherwise 500 for Number
  * requiresSetColorReset=`<boolean>` (Number only)
    * set to true to require color temperature state to be reset on set color requests
    * defaults to false
* Utterance examples:
  * *Alexa, make the `<device name>` warm white.*
  * *Alexa, set the `<device name>` to daylight.*
  * *Alexa, make the `<device name>` warmer.*
  * *Alexa, set the `<device name>` softer.*
  * *Alexa, make the `<device name>` whiter.*
  * *Alexa, set the `<device name>` cooler.*

### Networking Attributes

#### `HomeNetwork`

Items that represent a network router. This attribute cannot be specified by name. It is automatically added when configuring a [group endpoint](#group-endpoint) as one of the supported [device types](#device-types).

* Supported device types:
  * `NetworkHardware`
  * `Router`

#### `ConnectedDevice`

Items that represent a network device, such as a computer or mobile phone, connected to a router. This attribute cannot be specified by name. It is automatically added when configuring a [group endpoint](#group-endpoint) as one of the supported [device types](#device-types), that is a member of the group representing the router, as [`HomeNetwork`](#homenetwork), where the device is connected to, and having at least the metadata parameter `macAddress` defined.

* Supported device types:
  * `Computer`
  * `GameConsole`
  * `Laptop`
  * `MobilePhone`
  * `Tablet`
  * `Wearable`
* Supported metadata parameters:
  * hostname=`<name>`
    * defaults to `N/A`
  * macAddress=`<address>`
    * formatted as EUI-48 or EUI-64 address with colon or dash separators (e.g. `macAddress="00:21:86:B5:6E:10"`)

#### `NetworkAccess`

Items that represent the internet/network access control of a Wi-Fi/Ethernet connection to a router. This needs to be paired with [`ConnectedDevice`](#connecteddevice). To enable the access control by voice, you will need to select the configured device in your Alexa app, by going to Devices > Wi-Fi Access > Add a device. To limit the control based on voice profiles, turn on the option in the Wi-Fi Access settings.

* Supported item types:
  * Switch [ALLOWED="ON", BLOCKED="OFF"]
* Supported metadata parameters:
  * inverted=`<boolean>`
    * set to true to invert item state
    * defaults to false
* Utterance examples:
  * *Alexa, pause the Internet for `<device name>`.*
  * *Alexa, resume the Wi-Fi for `<device name>`.*
  * *Alexa, enable the Internet for `<device name>`.*
  * *Alexa, disable the Wi-Fi for `<device name>`.*
  * *Alexa, turn on the Internet for `<device name>`.*
  * *Alexa, turn off the Wi-Fi for `<device name>`.*

### Scene Attributes

<a name="scenecontroller-scene"></a>

#### `Scene`

Items that represent a combination of devices set to a specific state. Use scene triggers for scenes when the order of the state change is not important. For example, for a scene named "bedtime" you might turn off the lights and lower the thermostat, in any order.

* Supported item types:
  * Switch
* Supported metadata parameters:
  * supportsDeactivation=`<boolean>`
    * defaults to true
* Utterance examples:
  * *Alexa, turn on `<scene name>`.*
  * *Alexa, turn off `<scene name>`.*

#### `Activity`

Items that represent a combination of devices set to a specific state. Use activity triggers for scenes when the state changes must occur in a specific order. For example, for a scene named "watch Netflix" you might power on the TV first, and then set the input to HDMI1.

* Supported item types:
  * Switch
* Supported metadata parameters:
  * supportsDeactivation=`<boolean>`
    * defaults to true
* Utterance examples:
  * *Alexa, turn on `<activity name>`.*
  * *Alexa, turn off `<activity name>`.*

### Security Attributes

<a name="lockcontroller-lockstate"></a>

#### `LockState`

Items that represent the state of a lock (ON lock, OFF unlock). For decouple state support, use [`TargetLockState`](#targetlockstate) and [`CurrentLockState`](#currentlockstate) instead.

* Supported item types:
  * Switch
* Supported metadata parameters:
  * inverted=`<boolean>`
    * set to true to invert item state
    * defaults to false
* Utterance examples:
  * *Alexa, lock the `<device name>`.*
  * *Alexa, unlock the `<device name>`.* (Requires the unlock feature to be enabled in the Alexa app)
  * *Alexa, is the `<device name>` locked?*

#### `TargetLockState`

Items that represent the target state of a lock with decouple state. This should be paired with [`CurrentLockState`](#currentlockstate).

Same configuration as [`LockState`](#lockstate).

#### `CurrentLockState`

Items that represent the current state of a lock with decouple state. This needs to be paired with [`TargetLockState`](#targetlockstate). The state of this item will be returned instead of the original actionable item. For Number and String, the state mappings can be provided in the metadata parameters and, if necessary, multiple properties to one state can be mapped with column delimiter (e.g. for a Z-Wave lock: `LOCKED="1:3",UNLOCKED="2:4",JAMMED="11"`).

* Supported item types:
  * Contact [LOCKED="CLOSED", UNLOCKED="OPEN"]
  * Number [LOCKED=1, UNLOCKED=2, JAMMED=3]
  * String [LOCKED="locked", "UNLOCKED"="unlocked", JAMMED="jammed"]
  * Switch [LOCKED="ON", UNLOCKED="OFF"]
* Supported metadata parameters:
  * LOCKED=`<state>` (Number/String only)
  * UNLOCKED=`<state>` (Number/String only)
  * JAMMED=`<state>` (Number/String only)
  * inverted=`<boolean>` (Contact/Switch only)
    * set to true to invert item state
    * defaults to false

<a name="securitypanelcontroller-armstate"></a>
<a name="securityalarmmode"></a>

#### `ArmState`

Items that represent the arm state of a security panel. Multiple properties to one state can be mapped with column delimiter (e.g. for DSC alarm system, combining standard mode with no delay equivalent: `DISARMED="0",ARMED_AWAY="1:3",ARMED_STAY="2:4"`). To disarm by voice, you will need to set up a voice code in your Alexa app for that device. For security panel errors handling, add [`AlarmAlert`](#alarmalert), [`ReadyAlert`](#readyalert), [`TroubleAlert`](#troublealert) and [`ZonesAlert`](#zonealert) attributes to your security panel group endpoint.

* Supported item types:
  * Number [DISARMED=0, ARMED_STAY=1, ARMED_AWAY=2, ARMED_NIGHT=3]
  * String [DISARMED="disarmed", ARMED_STAY="stay", ARMED_AWAY="away", ARMED_NIGHT="night"]
  * Switch [DISARMED="OFF", ARMED_STAY="ON"]
* Supported metadata parameters:
  * DISARMED=`<state>`
  * ARMED_STAY=`<state>`
  * ARMED_AWAY=`<state>`
  * ARMED_NIGHT=`<state>`
  * supportedArmStates=`<states>`
    * comma delimited list (e.g. `supportedArmStates="DISARMED,ARMED_STAY,ARMED_AWAY"`)
    * requires DISARMED and at least one ARMED state to be specified
    * defaults to, depending on the parameters provided, either user-based or item type-based default mappings.
  * pinCodes=`<codes>`
    * each code formatted as 4-digit pin (e.g. `pinCodes="1234,9876"`)
    * pin codes if configured, are validated by the skill on disarm requests
    * defaults to only using the Alexa voice code for disarming verification
  * exitDelay=`<number>`
    * maximum delay restricted to 255 seconds
    * defaults to no delay
* Utterance examples:
  * *Alexa, arm my home in away mode.*
  * *Alexa, arm my home.*
  * *Alexa, disarm my home.*
  * *Alexa, is my home armed?*

<a name="securitypanelcontroller-burglaryalarm"></a>

#### `BurglaryAlarm`

Items that represent the burglary alarm state of a security panel.

* Supported item types:
  * Contact [OK="CLOSED", ALARM="OPEN"]
  * Switch [OK="OFF", ALARM="ON"]
* Supported metadata parameters:
  * inverted=`<boolean>`
    * set to true to invert item state
    * defaults to false

<a name="securitypanelcontroller-carbonmonoxidealarm"></a>

#### `CarbonMonoxideAlarm`

Items that represent the carbon monoxide alarm state of a security panel.

* Supported item types:
  * Contact [OK="CLOSED", ALARM="OPEN"]
  * Switch [OK="OFF", ALARM="ON"]
* Supported metadata parameters:
  * inverted=`<boolean>`
    * set to true to invert item state
    * defaults to false

<a name="securitypanelcontroller-firealarm"></a>

#### `FireAlarm`

Items that represent the fire alarm state of a security panel.

* Supported item types:
  * Contact [OK="CLOSED", ALARM="OPEN"]
  * Switch [OK="OFF", ALARM="ON"]
* Supported metadata parameters:
  * inverted=`<boolean>`
    * set to true to invert item state
    * defaults to false

<a name="securitypanelcontroller-wateralarm"></a>

#### `WaterAlarm`

Items that represent the water alarm state of a security panel.

* Supported item types:
  * Contact [OK="CLOSED", ALARM="OPEN"]
  * Switch [OK="OFF", ALARM="ON"]
* Supported metadata parameters:
  * inverted=`<boolean>`
    * set to true to invert item state
    * defaults to false

#### `AlarmAlert`

Items that represent the alert state of a security panel when it has uncleared alarm preventing arming. This needs to be paired with [`ArmState`](#armstate).

* Supported item types:
  * Contact [OK="CLOSED", ALERT="OPEN"]
  * Switch [OK="OFF", ALERT="ON"]
* Supported metadata parameters:
  * inverted=`<boolean>`
    * set to true to invert item state
    * defaults to false

#### `ReadyAlert`

Items that represent the alert state of a security panel when it is not ready for arming or disarming. This needs to be paired with [`ArmState`](#armstate).

* Supported item types:
  * Contact [OK="CLOSED", ALERT="OPEN"]
  * Switch [OK="OFF", ALERT="ON"]
* Supported metadata parameters:
  * inverted=`<boolean>`
    * set to true to invert item state
    * defaults to false

#### `TroubleAlert`

Items that represent the alert state of a security panel when it has uncleared trouble condition preventing arming. This needs to be paired with [`ArmState`](#armstate).

* Supported item types:
  * Contact [OK="CLOSED", ALERT="OPEN"]
  * Switch [OK="OFF", ALERT="ON"]
* Supported metadata parameters:
  * inverted=`<boolean>`
    * set to true to invert item state
    * defaults to false

#### `ZonesAlert`

Items that represent the alert state of a security panel when it has open zones, that must be bypassed, preventing arming. This needs to be paired with [`ArmState`](#armstate).

* Supported item types:
  * Contact [OK="CLOSED", ALERT="OPEN"]
  * Switch [OK="OFF", ALERT="ON"]
* Supported metadata parameters:
  * inverted=`<boolean>`
    * set to true to invert item state
    * defaults to false

### Sensor Attributes

#### `BatteryLevel`

Items that represent a battery level percentage of a device.

* Supported item types:
  * Dimmer
  * Number(:Dimensionless)
* Utterance examples:
  * *Alexa, what's the `<device name>` battery level?*

#### `CurrentHumidity`

Items that represent a humidity sensor that provides the ambient humidity.

* Supported item types:
  * Dimmer
  * Number(:Dimensionless)
* Utterance examples:
  * *Alexa, what’s the `<device name>` humidity?*

<a name="temperaturesensor-temperature"></a>

#### `CurrentTemperature`

Items that represent a temperature sensor that provides the ambient temperature.

* Supported item types:
  * Number(:Temperature)
* Supported metadata parameters:
  * scale=`<scale>`
    * Celsius or Fahrenheit
    * defaults to [item unit of measurement](#item-unit-of-measurement), otherwise Celsius
* Utterance examples:
  * *Alexa, what’s the `<device name>` temperature?*
  * *Alexa, what’s the temperature of `<device name>`?*

<a name="contactsensor-detectionstate"></a>

#### `ContactDetectionState`

Items that represent a contact sensor state. Currently not usable in routines as proactive reporting not supported yet.

* Supported item types:
  * Contact [DETECTED="OPEN", NOT_DETECTED="CLOSED"]
  * Switch [DETECTED="ON", NOT_DETECTED="OFF"]
* Supported metadata parameters:
  * inverted=`<boolean>`
    * set to true to invert item state
    * defaults to false
* Utterance examples:
  * *Alexa, is the `<device name>` open?*

<a name="motionSensor-detectionstate"></a>

#### `MotionDetectionState`

Items that represent a motion sensor state. Currently not usable in routines as proactive reporting not supported yet.

* Supported item types:
  * Contact [DETECTED="OPEN", NOT_DETECTED="CLOSED"]
  * Switch [DETECTED="ON", NOT_DETECTED="OFF"]
* Supported metadata parameters:
  * inverted=`<boolean>`
    * set to true to invert item state
    * defaults to false

### Switchable Attributes

<a name="powercontroller-powerstate"></a>

#### `PowerState`

Items that represent a general device responding to on/off commands. For Number and String, the state mappings must be provided in the metadata parameters.

* Supported item types:
  * Color
  * Dimmer
  * Number
  * String
  * Switch
* Supported metadata parameters:
  * OFF=`<state>` (Number/String only)
  * ON=`<state>` (Number/String only)
* Utterance examples:
  * *Alexa, turn on the `<device name>`.*
  * *Alexa, turn off the `<device name>`.*

<a name="powerlevelcontroller-powerlevel"></a>

#### `PowerLevel`

Items that represent a general device responding to power level commands.

* Supported item types:
  * Dimmer
* Utterance examples:
  * *Alexa, set the power to 40 percent on the `<device name>`.*
  * *Alexa, increase the power level by 12 on the `<device name>`.*
  * *Alexa, decrease the power level by 6 on the `<device name>`.*

<a name="percentagecontroller-percentage"></a>

#### `Percentage`

Items that represent a general device responding to percentage commands.

* Supported item types:
  * Dimmer
  * Rollershutter
* Supported metadata parameters:
  * inverted=`<boolean>`
    * set to true to invert item state
    * defaults to true for Rollershutter, otherwise false for Dimmer
* Utterance examples:
  * *Alexa, set the `<device name>` to 30 percent.*
  * *Alexa, increase the `<device name>` by 10 percent.*
  * *Alexa, decrease the `<device name>` by 5 percent.*

### Thermostat Attributes

<a name="thermostatcontroller-targetsetpoint"></a>

#### `TargetTemperature`

Items that represent a target setpoint for a thermostat. For thermostat that requires hold to be set prior to manually changing setpoints, set parameter `requiresSetpointHold=true` on the [`ThermostatHold`](#thermostathold) item.

* Supported item types:
  * Number(:Temperature)
* Supported metadata parameters:
  * scale=`<scale>`
    * Celsius or Fahrenheit
    * defaults to [item unit of measurement](#item-unit-of-measurement), otherwise Celsius
  * setpointRange=`<range>`
    * range formatted as `<minValue>:<maxValue>` (e.g. `setpointRange="60:90"`)
    * defaults to 4°C -> 32°C or 40°F -> 90°F
* Utterance examples:
  * *Alexa, set the `<device name>` to 70.*
  * *Alexa, make it warmer in here.* ([`Thermostat`](#device-types) type only)
  * *Alexa, make it cooler in here.* ([`Thermostat`](#device-types) type only)
  * *Alexa, what's the `<device name>` set to?* ([`Thermostat`](#device-types) type only)
  * *Alexa, what's the `<device name>` target temperature?* (All supported types except [`Thermostat`](#device-types))

<a name="thermostatcontroller-uppersetpoint"></a>
<a name="uppertemperature"></a>

#### `CoolingSetpoint`

Items that represent an upper or cooling setpoint for a thermostat. This needs to be paired with [`HeatingSetpoint`](#heatingsetpoint). It is important to note that only the target setpoint can be requested by voice. Therefore, when the thermostat is in dual mode, the cooling and heating setpoints will be updated based on the `comfortRange` parameter. For thermostat that requires hold to be set prior to manually changing setpoints, set parameter `requiresSetpointHold=true` on the [`ThermostatHold`](#thermostathold) item. By default, if the target, cooling and heating setpoints along with the thermostat mode are defined, the setpoint mode automation will be enabled limiting to dual mode interactions. For true triple mode support, set parameter `supportsSetpointMode=false` on the [`HeatingCoolingMode`](#heatingcoolingmode) item.

* Supported item types:
  * Number(:Temperature)
* Supported metadata parameters:
  * scale=`<scale>`
    * Celsius or Fahrenheit
    * defaults to [item unit of measurement](#item-unit-of-measurement), otherwise Celsius
  * comfortRange=`<number>`
    * used in dual setpoint mode to determine:
      * the adjusted cooling/heating setpoints spread based on target setpoint
      * the minimum temperature delta between requested cooling/heating setpoints by adding relevant comfort range values
    * defaults to 2°F or 1°C
  * setpointRange=`<range>`
    * range formatted as `<minValue>:<maxValue>` (e.g. `setpointRange="60:90"`)
    * defaults to 4°C -> 32°C or 40°F -> 90°F

<a name="thermostatcontroller-lowersetpoint"></a>
<a name="lowertemperature"></a>

#### `HeatingSetpoint`

Items that represent a lower or heating setpoint for a thermostat. This needs to be paired with [`CoolingSetpoint`](#coolingsetpoint).

Same configuration as [`CoolingSetpoint`](#coolingsetpoint).

#### `EcoCoolingSetpoint`

Items that represent an upper or cooling setpoint for a thermostat integration that uses separate cooling/heating setpoints in ECO mode (e.g. Nest). This needs to be paired with [`EcoHeatingSetpoint`](#ecoheatingsetpoint).

Same configuration as [`CoolingSetpoint`](#coolingsetpoint).

#### `EcoHeatingSetpoint`

Items that represent an lower or heating setpoint for a thermostat integration that uses separate cooling/heating setpoints in ECO mode (e.g. Nest). This needs to be paired with [`EcoCoolingSetpoint`](#ecocoolingsetpoint).

Same configuration as [`CoolingSetpoint`](#coolingsetpoint).

<a name="thermostatcontroller-thermostatmode"></a>

#### `HeatingCoolingMode`

Items that represent the heating/cooling mode of a thermostat.

* Supported item types:
  * Number [OFF=0, HEAT=1, COOL=2, AUTO=3, ECO=4]
  * String [OFF="off", HEAT="heat", COOL="cool", AUTO="auto", ECO="eco"]
  * Switch [OFF="OFF", HEAT="ON"]
* Supported binding presets:
  * [broadlinkthermostat](https://www.openhab.org/addons/bindings/broadlinkthermostat/) [HEAT="manual", AUTO="auto"]
  * [daikin](https://www.openhab.org/addons/bindings/daikin/) [HEAT="HEAT", COOL="COLD", AUTO="AUTO"]
  * [ecobee](https://www.openhab.org/addons/bindings/ecobee/) [OFF="off", HEAT="heat", COOL="cool", AUTO="auto"]
  * [insteon](https://www.openhab.org/addons/bindings/insteon/) [OFF=0, HEAT=1, COOL=2, AUTO=3]
  * [max](https://www.openhab.org/addons/bindings/max/) [HEAT="MANUAL", AUTO="AUTOMATIC", ECO="VACATION"]
  * [nest](https://www.openhab.org/addons/bindings/nest/) [OFF="OFF", HEAT="HEAT", COOL="COOL", AUTO="HEAT_COOL", ECO="ECO"]
  * [radiothermostat](https://www.openhab.org/addons/bindings/radiothermostat/) [OFF=0, HEAT=1, COOL=2, AUTO=3]
  * [venstarthermostat](https://www.openhab.org/addons/bindings/venstarthermostat/) [OFF="off", HEAT="heat", COOL="cool", AUTO="auto"]
  * [zwave](https://www.openhab.org/addons/bindings/zwave/) [OFF=0, HEAT=1, COOL=2, AUTO=3]
* Supported metadata parameters:
  * OFF=`<state>`
  * HEAT=`<state>`
  * COOL=`<state>`
  * ECO=`<state>`
  * AUTO=`<state>`
  * binding=`<id>`
    * id formatted as `<bindingId>` (e.g. `binding="nest"`)
    * only for [GUI-based configuration](https://www.openhab.org/docs/configuration/)
    * defaults to channel metadata value for items configured via text files
  * supportedModes=`<modes>`
    * comma delimited list (e.g. `supportedModes="OFF,HEAT,COOL,AUTO"`)
    * defaults to, depending on the parameters provided in order of precedence:
      * user-defined mappings (e.g `OFF=0,HEAT=1,COOL=2`)
      * preset-based related to the thermostat binding linked
      * item type-based default mappings
  * supportsSetpointMode=`<boolean>`
    * set to false to disable the thermostat setpoint mode-aware feature (Refer to [cooling/heating setpoints](#coolingsetpoint))
    * defaults to true
* Utterance examples:
  * *Alexa, set the `<device name>` to heat.*
  * *Alexa, set the `<device name>` to cool.*
  * *Alexa, set the `<device name>` to auto.*
  * *Alexa, set the `<device name>` to eco.*
  * *Alexa, set the `<device name>` to off.*
  * *Alexa, turn on the `<device name>`.* (Switch only)
  * *Alexa, turn off the `<device name>`.* (Switch only)
  * *Alexa, what's the `<device name>` set to?*

#### `ThermostatHold`

Items that represent the hold setting of a thermostat. This needs to be paired with [`HeatingCoolingMode`](#heatingcoolingmode). Only requests to resume schedule (turn off hold) are supported.

* Supported item types:
  * Number [OFF=0, ON=1]
  * String [OFF="schedule", ON="hold"]
  * Switch (on/off control)
* Supported metadata parameters:
  * OFF=`<state>` (Number/String only)
  * ON=`<state>` (Number/String only)
  * inverted=`<boolean>` (Switch only)
    * set to true to invert item state
    * defaults to false
  * requiresSetpointHold=`<boolean>`
    * set to true to require thermostat hold to be set on setpoint requests
    * defaults to false
* Utterance examples:
  * *Alexa, resume the `<device name>` schedule.*

#### `ThermostatFan`

Items that represent the fan mode of a thermostat. Due to a limitation on the Alexa end, the "Auto" fan mode is named "Default" to prevent a conflict between the thermostat heating/cooling and fan modes when requesting by voice.

* Supported item types:
  * String [AUTO="AUTO", ON="ON"]
  * Switch (on/off control)
* Supported metadata parameters:
  * AUTO=`<state>` (String only)
  * ON=`<state>` (String only)
  * inverted=`<boolean>` (Switch only)
    * set to true to invert state
    * defaults to false
* Utterance examples:
  * *Alexa, set the `<device name>` fan to on.* (String only)
  * *Alexa, set the `<device name>` fan to default.* (String only)
  * *Alexa, turn on the `<device name>` fan.* (Switch only)
  * *Alexa, turn off the `<device name>` fan.* (Switch only)

### Vacuum Attributes

#### `VacuumMode`

Items that represent a vacuum mode. At least the clean and dock modes must be defined. The resume/pause controls are depending on pause mode being defined. For stop control, if stop mode not defined, it will fallback to dock mode.

* Supported item types:
  * Number [CLEAN=1, DOCK=2, SPOT=3, PAUSE=4, STOP=5]
  * String [CLEAN="CLEAN", DOCK="DOCK", SPOT="SPOT", PAUSE="PAUSE", STOP="STOP"]
* Supported metadata parameters:
  * CLEAN=`<state>`
  * DOCK=`<state>`
  * SPOT=`<state>`
  * PAUSE=`<state>`
  * STOP=`<state>`
* Utterance examples:
  * *Alexa, turn on the `<device name>`.* (Clean mode)
  * *Alexa, turn off the `<device name>`.* (Dock mode)
  * *Alexa, pause the `<device name>`.* (Pause mode)
  * *Alexa, resume the `<device name>`.* (Clean mode)
  * *Alexa, stop the `<device name>`.* (Stop/Dock mode)
  * *Alexa, set the `<device name>` mode to spot.* (Spot mode)
  * *Alexa, what's the `<device name>` mode?*

### Generic Attributes

<a name="modecontroller-mode"></a>
<a name="modecomponent"></a>

#### `Mode`

Items that represent components of a device that have more than one setting. Multiple instances can be configured in a [group endpoint](#group-endpoint).

* Supported item types:
  * Number
  * String
  * Switch
* Supported metadata parameters:
  * capabilityNames=`<names>`
    * each name formatted as `<@assetIdOrName>` (e.g. `capabilityNames="Wash Temperature,@Setting.WaterTemperature"`)
      * predefined [asset ids](#asset-catalog)
      * list of text-based names [not allowed](#capability-names-not-allowed)
    * defaults to `@Setting.Mode` if [single endpoint](#single-endpoint), otherwise item label and synonyms metadata if part of [group endpoint](#group-endpoint)
  * nonControllable=`<boolean>`
    * set to true for state reporting support only
    * defaults to item state description read only property if defined, otherwise false
  * supportedModes=`<modes>`
    * each mode formatted as `<mode>=<@assetIdOrName1>:...` (e.g. `supportedModes="0=Cold:Cool,1=Warm,2=Hot"`)
    * requires at least two modes to be specified
    * shortened format available for string-based modes by either leaving the first element empty or not providing the mode name at all (e.g. `supportedModes="Normal=:Cottons,Whites"` <=> `supportedModes="Normal=Normal:Cottons,Whites=Whites`)
    * defaults to item state description options `supportedModes="value1=label1,..."`, if defined, otherwise no supported modes
  * ordered=`<boolean>`
    * set to true if modes can be adjusted incrementally (e.g. temperature control)
    * defaults to false
  * language=`<code>`
    * text-based name language support
    * two-letter language code: `ar`, `de`, `en`, `es`, `fr`, `hi`, `it`, `ja`, `pt`
    * defaults to your server [regional settings](#regional-settings) if defined, otherwise `en`
  * actionMappings=`<mappings>`
    * each [semantic](#semantic-extensions) mapping formatted as, based on action type: (e.g. `actionMappings="Close=DOWN,Open=UP,Lower=DOWN,Raise=UP,Stop=STOP"`)
      * set => `<action>=<mode>`
      * adjust => `<action>=(<deltaValue>)` (Supported only if `ordered=true`)
    * [supported action semantics](#semantic-catalog)
    * only one given action semantic allowed per endpoint
    * no support for `TurnOn` and `TurnOff` semantics on Switch, use [`PowerState`](#powerstate) instead
    * defaults to no actions
  * stateMappings=`<mappings>`
    * each [semantic](#semantic-extensions) mapping formatted as `<state>=<mode>` (e.g. `stateMappings="Closed=CLOSED,Open=OPEN"`)
    * [supported state semantics](#semantic-catalog)
    * only one given state semantic allowed per endpoint
    * defaults to no states
* Utterance examples:
  * *Alexa, set the `<device name>` `<capability name>` to `<mode name>`.*
  * *Alexa, increase the `<device name>` `<capability name>`.* (if `ordered=true`)
  * *Alexa, decrease the `<device name>` `<capability name>`.* (if `ordered=true`)
  * *Alexa, what's the `<device name>` `<capability name>`?*
  * *Alexa, open the `<device name>`.* (if `Open` action defined)
  * *Alexa, close the `<device name>`.* (if `Close` action defined)
  * *Alexa, raise the `<device name>`.* (if `Raise` action defined)
  * *Alexa, lower the `<device name>`.* (if `Lower` action defined)
  * *Alexa, resume the `<device name>`.* (if `Resume` action defined)
  * *Alexa, pause the `<device name>`.* (if `Pause` action defined)
  * *Alexa, stop the `<device name>`.* (if `Stop` action defined)
  * *Alexa, turn on the `<device name>`.* (if `TurnOn` action defined)
  * *Alexa, turn off the `<device name>`.* (if `TurnOff` action defined)

<a name="rangecontroller-rangevalue"></a>
<a name="rangecomponent"></a>

#### `RangeValue`

Items that represent components of a device that are characterized by numbers within a minimum and maximum range. Multiple instances can be configured in a [group endpoint](#group-endpoint).

* Supported item types:
  * Dimmer
  * Number(:`<dimension>`)
  * Rollershutter
* Supported metadata parameters:
  * capabilityNames=`<names>`
    * each name formatted as `<@assetIdOrName>` (e.g. `capabilityNames="@Setting.FanSpeed,Speed"`)
      * predefined [asset ids](#asset-catalog)
      * list of text-based names [not allowed](#capability-names-not-allowed)
    * defaults to `@Setting.RangeValue` if [single endpoint](#single-endpoint), otherwise item label and synonyms metadata if part of [group endpoint](#group-endpoint)
  * inverted=`<boolean>`
    * set to true to invert item state
    * defaults to true for Rollershutter, otherwise false for other supported item types.
  * nonControllable=`<boolean>`
    * set to true for state reporting support only
    * defaults to item state description read only property if defined, otherwise false
  * supportedCommands=`<commands>` (Dimmer/Rollershutter only)
    * each command formatted as:
      * default name => `<command>` (e.g. `supportedCommands="INCREASE,DECREASE"`)
      * custom name => `<command>=<@assetIdOrName1>:...` (e.g. `supportedCommands="INCREASE=@Value.Up,DECREASE=@Value.Down"`)
    * supported commands are ON, OFF, INCREASE, DECREASE (Dimmer); UP, DOWN, MOVE, STOP (Rollershutter)
    * defaults to no support
  * supportedRange=`<range>`
    * range formatted as `<minValue>:<maxValue>:<precision>` (e.g. `supportedRange="0:100:1"`)
    * precision value used as default increment for adjusted range value request.
    * defaults to item state description min, max & step values, if defined, otherwise `"0:100:1"` (Dimmer/Rollershutter); `"0:10:1"` (Number)
  * presets=`<presets>`
    * each preset formatted as `<presetValue>=<@assetIdOrName1>:...` (e.g. `presets="1=@Value.Low:Lowest,10=@Value.High:Highest"`)
    * requires to be a multiple of the supported range precision
    * defaults to item state description options `presets="value1=label1,..."` if defined, otherwise no presets
  * unitOfMeasure=`<unitId>`
    * supported [unid id](#unit-of-measurement-catalog)
    * defaults to unit of item state presentation, if available, or item type-based default unit as follow:
      * Dimmer => `Percent`
      * Number:Angle => `Angle.Degrees`
      * Number:Length => `Distance.Meters` (SI); `Distance.Inches` (US)
      * Number:Temperature => `Temperature.Celsius` (SI); `Temperature.Fahrenheit` (US)
      * Rollershutter => `Percent`
  * language=`<code>`
    * text-based name language support
    * two-letter language code: `ar`, `de`, `en`, `es`, `fr`, `hi`, `it`, `ja`, `pt`
    * defaults to your server [regional settings](#regional-settings) if defined, otherwise `en`
  * actionMappings=`<mappings>`
    * each [semantic](#semantic-extensions) mapping formatted as, based on action type: (e.g. `actionMappings="Close=0,Open=100,Lower=(-10),Raise=(+10)"`)
      * set => `<action>=<value>`
      * adjust => `<action>=(<deltaValue>)`
    * supported commands can be mapped as well (e.g. `actionMappings="Close=DOWN,Open=UP,Lower=DOWN,Raise=UP,Stop=STOP"`)
    * [supported action semantics](#semantic-catalog)
    * only one given action semantic allowed per endpoint
    * no support for:
      * any [custom semantics](#custom-semantic-catalog) on Number with defined dimension
      * `TurnOn` and `TurnOff` semantics on Dimmer/Rollershutter
    * defaults to no actions
  * stateMappings=`<mappings>`
    * each [semantic](#semantic-extensions) mapping formatted as, based on state type: (e.g. `stateMappings="Closed=0,Open=1:100"`)
      * range => `<state>=<minValue>:<maxValue>`
      * value => `<state>=<value>`
    * [supported state semantics](#semantic-catalog)
    * only one given state semantic allowed per endpoint
    * defaults to no states
* Utterance examples:
  * *Alexa, set the `<device name>` `<capability name>` to 10.*
  * *Alexa, set the `<device name>` `<capability name>` to 50 percent.* (if `unitOfMeasure="Percent"`)
  * *Alexa, set the `<device name>` `<capability name>` to `<preset name>`.* (if `presets` defined)
  * *Alexa, set the `<device name>` `<capability name>` to `<command name>`.* (if `supportedCommands` defined)
  * *Alexa, increase the `<device name>` `<capability name>` by 5.*
  * *Alexa, decrease the `<device name>` `<capability name>`.*
  * *Alexa, what's the `<device name>` `<capability name>`?*
  * *Alexa, open the `<device name>`.* (if `Open` action defined)
  * *Alexa, close the `<device name>`.* (if `Close` action defined)
  * *Alexa, raise the `<device name>`.* (if `Raise` action defined)
  * *Alexa, lower the `<device name>`.* (if `Lower` action defined)
  * *Alexa, resume the `<device name>`.* (if `Resume` action defined)
  * *Alexa, pause the `<device name>`.* (if `Pause` action defined)
  * *Alexa, stop the `<device name>`.* (if `Stop` action defined)
  * *Alexa, turn on the `<device name>`.* (if `TurnOn` action defined)
  * *Alexa, turn off the `<device name>`.* (if `TurnOff` action defined)

<a name="togglecontroller-togglestate"></a>
<a name="togglecomponent"></a>

#### `ToggleState`

Items that represent components of a device that can be toggled on or off. Multiple instances can be configured in a [group endpoint](#group-endpoint). For Number and String, the state mappings must be provided in the metadata parameters.

* Supported item types:
  * Number
  * String
  * Switch
* Supported metadata parameters:
  * OFF=`<state>` (Number/String only)
  * ON=`<state>` (Number/String only)
  * capabilityNames=`<names>`
    * each name formatted as `<@assetIdOrName>` (e.g. `capabilityNames="@Setting.Oscillate,Rotate"`)
      * predefined [asset ids](#asset-catalog)
      * list of text-based names [not allowed](#capability-names-not-allowed)
    * defaults to `@Setting.ToggleState` if [single endpoint](#single-endpoint), otherwise item label and synonyms metadata if part of [group endpoint](#group-endpoint)
  * inverted=`<boolean>` (Switch only)
    * set to true to invert item state
    * defaults to false
  * nonControllable=`<boolean>`
    * set to true for state reporting support only
    * defaults to item state description read only property if defined, otherwise false
  * language=`<code>`
    * text-based name language support
    * two-letter language code: `ar`, `de`, `en`, `es`, `fr`, `hi`, `it`, `ja`, `pt`
    * defaults to your server [regional settings](#regional-settings) if defined, otherwise `en`
  * actionMappings=`<mappings>`
    * each [semantic](#semantic-extensions) mapping formatted as `<action>=ON` or `<action>=OFF` (e.g. `actionMappings="Close=OFF,Open=ON"`)
    * [supported action semantics](#semantic-catalog)
    * only one given action semantic allowed per endpoint
    * no support for `TurnOn` and `TurnOff` semantics, use [`PowerState`](#powerstate) instead
    * defaults to no actions
  * stateMappings=`<mappings>`
    * each [semantic](#semantic-extensions) mapping formatted as `<state>=ON` or `<state>=OFF` (e.g. `stateMappings="Closed=OFF,Open=ON"`)
    * [supported state semantics](#semantic-catalog)
    * only one given state semantic allowed per endpoint
    * defaults to no states
* Utterance examples:
  * *Alexa, turn on the `<device name>` `<capability name>`.*
  * *Alexa, turn off the `<device name>` `<capability name>`.*
  * *Alexa, what's the `<device name>` `<capability name>`?*
  * *Alexa, is the `<device name>` `<capability name>` on?*
  * *Alexa, open the `<device name>`.* (if `Open` action defined)
  * *Alexa, close the `<device name>`.* (if `Close` action defined)
  * *Alexa, raise the `<device name>`.* (if `Raise` action defined)
  * *Alexa, lower the `<device name>`.* (if `Lower` action defined)
  * *Alexa, resume the `<device name>`.* (if `Resume` action defined)
  * *Alexa, pause the `<device name>`.* (if `Pause` action defined)
  * *Alexa, stop the `<device name>`.* (if `Stop` action defined)

# Troubleshooting

## Response Errors

### Command Not Working

* Alexa will respond with "That command doesn't work on _device_".
* It indicates that the command that Alexa is trying to send to openHAB doesn't work, either because the intended device is not configured properly to support that command or because your openHAB items configuration has changed and a previously discovered item may longer accept certain commands. For example, a dimmer item type that was initially setup and was changed to a switch type, will cause Alexa brightness control commands to fail.
* To resolve this error, make sure to update your openHAB items configuration accordingly and run a discovery update either through the Alexa app or just by asking "Alexa, discover" on your echo device.

### Device Not Found

* Alexa will respond with "I couldn't find a device or group named _device_ in your profile".
* It indicates that, either a device currently setup in your Alexa account, no longer exists in your openHAB server, or vice-versa.
* To resolve this error, make sure to run a discovery update either through the Alexa app or just by asking "Alexa, discover" on your echo device. Keep in mind that previously discovered devices that have been removed from the openHAB configuration will show as offline under your Alexa account and not be automatically removed. To prevent potential device name conflicts, it is highly recommended to remove these devices through the Alexa app.
* If all your Alexa-enabled devices in openHAB aren't discovered or getting updated:
  * Check that your [server is available](#server-not-accessible).
  * Look for any relevant errors in your openHAB server logs.
  * Check the spelling of your Alexa metadata configuration. It is case sensitive.
  * If only new devices aren't found, make sure your last Alexa-related config changes are valid.
  * If necessary, stagger the discovery process by adding a couple devices at a time to isolate the culprit.

### Device Not Responding

* Alexa will respond with "_device_ isn't responding, please check its network connection and power supply", and in some rare occasions, no response or acknowledgement will be given.
* It indicates that the state of one or more of the endpoint properties retrieved from the openHAB server are considered invalid, mostly because it is in either uninitialized `NULL` or undefined `UNDEF` state.
* To resolve this error, make sure that all items interfacing with Alexa have a defined state. If the state is not available in openHAB, set the [item state](#item-state) to not be retrievable.
* For group endpoints, partial properties responses will be send back to Alexa excluding items with invalid state. This will allow Alexa to acknowledge a command request assuming that the relevant item state is accurate. However, it will cause Alexa to generate this error when requesting the status of a device configured with an attribute supporting these requests. For example, using a thermostat group endpoint, a request to set its mode will succeed but requesting its mode status will fail if one of its property state, such as its temperature sensor, is not defined in openHAB.
* This is the default error.

### Duplicate Device Names

* Alexa will respond with "A few things share the name _device_, which one did you want?".
* It indicates that more than one device on your Alexa account matches the device name requested.
* To resolve this error, make sure that all the [item labels](#item-labels) related to your Alexa-enabled items are unique. Additionally, check your Alexa account for discovered devices from other skills or local integrations (e.g. Philips Hue bridge), that may have overlapping names.

### Request Error

* Alexa will respond with "I'm not sure what went wrong".
* It indicates that a requested command caused an error preventing the Alexa Smart Home API from handling it. This is usually due to either a given capability not supported in your language or a bug in the Alexa API handling the request.
* If you have confirmed that the requested capability should be [available in your region](#regional-availability), please search in the [community forum](https://community.openhab.org/c/apps-services/amazon-alexa) for an existing related post and, if necessary, open a new topic including all the details to replicate this error.

### Request Not Supported

* Alexa will respond with "_device_ doesn't support that".
* It indicates that a requested command is not supported by any of the device configured attributes.
* To resolve this error, make sure that the relevant attributes are configured properly on the given device. If this is the case, the response implies a limitation on the Alexa side. This will happen for a device with specific attributes that don't support certain voice requests as of yet, such as the state of a `Switch` or `Light` capable item.

### Server Authentication Issue

* Alexa will respond with "Sorry something wrong, to control _device_ try disabling the skill and re-enabling it from your Alexa app".
* It indicates that Alexa isn't able to control the given device because of an authentication issue.
* To resolve this error, for users that are using the official skill, just disable and re-enable it through the Alexa app. For users that have setup their own custom skill, make sure that the proper credentials were added to the lambda function config.js. If running an openHAB 3.x server, make sure that the API Security Implicit User Role setting is enabled.

### Server Not Accessible

* Alexa will respond with "Sorry the hub that _device_ is connected to is not responding, please check its network connection and power supply".
* It indicates that your openHAB server is not accessible through [myopenHAB](https://myopenhab.org) cloud service.
* To resolve this error, make sure that your server is running, your openHAB cloud service is configured with mode set to "Notifications & Remote Access", and showing online under your myopenHAB account. For users that have setup their own custom skill, make sure that the proper server base URL was added to the lambda function config.js.
* For users running openHAB 2.4, there is a known issue when running the [Amazon Echo Control](https://www.openhab.org/addons/bindings/amazonechocontrol/) binding, associated to that release, that affects the server accessibility. In this instance, make sure to upgrade your server to 2.5 or above.

### Temperature Out Of Range

* Alexa will respond with "I can only set the temperature between _minValue_ and _maxValue_".
* It indicates that a requested target temperature is out of range, based on the [target](#targettemperature), [cooling](#coolingsetpoint), or [heating](#heatingsetpoint) temperature setpoints default range values.
* To resolve this error, add the metadata parameter `setpointRange="<minValue>:<maxValue>"` on your relevant thermostat setpoint items to customize your range values and run a discovery update either through the Alexa app or just by asking "Alexa, discover" on your echo device.

# Additional Information

## Regional Availability

The availability of a given capability depends on the location setting of your Amazon account under which your echo devices are registered to. Here is the latest list of Alexa interface capabilities with their associated supported device attributes and languages from the [Alexa Skill API](https://developer.amazon.com/docs/device-apis/list-of-interfaces.html) documentation:

Alexa Interfaces | Supported Attributes | Supported Languages
-----------------|------------------------|--------------------
BrightnessController | [`Brightness`](#brightness) | `ar-SA`, `de-DE`, `en-AU`, `en-CA`, `en-GB`, `en-IN`, `en-US`, `es-ES`, `es-MX`, `es-US`, `fr-CA`, `fr-FR`, `hi-IN`, `it-IT`, `ja-JP`, `pt-BR`
CameraStreamController | [`CameraStream`](#camerastream) | `ar-SA`, `de-DE`, `en-AU`, `en-CA`, `en-GB`, `en-IN`, `en-US`, `es-ES`, `es-MX`, `es-US`, `fr-CA`, `fr-FR`, `hi-IN`, `it-IT`, `ja-JP`, `pt-BR`
ChannelController | [`Channel`](#channel), [`ChannelStep`](#channelstep) | `ar-SA`, `de-DE`, `en-AU`, `en-CA`, `en-GB`, `en-IN`, `en-US`, `es-ES`, `es-MX`, `es-US`, `fr-CA`, `fr-FR`, `hi-IN`, `it-IT`, `ja-JP`, `pt-BR`
ColorController | [`Color`](#color) | `ar-SA`, `de-DE`, `en-AU`, `en-CA`, `en-GB`, `en-IN`, `en-US`, `es-ES`, `es-MX`, `es-US`, `fr-CA`, `fr-FR`, `hi-IN`, `it-IT`, `ja-JP`, `pt-BR`
ColorTemperatureController | [`ColorTemperature`](#colortemperature) | `ar-SA`, `de-DE`, `en-AU`, `en-CA`, `en-GB`, `en-IN`, `en-US`, `es-ES`, `es-MX`, `es-US`, `fr-CA`, `fr-FR`, `hi-IN`, `it-IT`, `ja-JP`, `pt-BR`
ContactSensor | [`ContactDetectionState`](#contactdetectionstate) | `ar-SA`, `de-DE`, `en-AU`, `en-CA`, `en-GB`, `en-IN`, `en-US`, `es-ES`, `es-MX`, `es-US`, `fr-CA`, `fr-FR`, `hi-IN`, `it-IT`, `ja-JP`, `pt-BR`
EqualizerController | [`EqualizerBass`](#equalizerbass), [`EqualizerMidrange`](#equalizermidrange), [`EqualizerTreble`](#equalizertreble), [`EqualizerMode`](#equalizermode) | `de-DE`, `en-AU`, `en-CA`, `en-GB`, `en-IN`, `en-US`, `es-ES`, `es-MX`, `es-US`, `fr-CA`, `fr-FR`, `hi-IN`, `it-IT`, `ja-JP`, `pt-BR`
LockController | [`LockState`](#lockstate) | `ar-SA`, `de-DE`, `en-AU`, `en-CA`, `en-GB`, `en-IN`, `en-US`, `es-ES`, `es-MX`, `es-US`, `fr-CA`, `fr-FR`, `hi-IN`, `it-IT`, `ja-JP`, `pt-BR`
ModeController | [`Mode`](#mode), [`FanDirection`](#fandirection), [`FanSpeed`](#fanspeed), [`Input`](#input), [`OpenState`](#openstate), [`PositionState`](#positionstate), [`TiltAngle`](#tiltangle), [`ThermostatFan`](#thermostatfan), [`VacuumMode`](#vacuummode) | `de-DE`, `en-AU`, `en-CA`, `en-GB`, `en-IN`, `en-US`, `es-ES`, `es-MX`, `es-US`, `fr-CA`, `fr-FR`, `hi-IN`, `it-IT`, `ja-JP`, `pt-BR`
MotionSensor | [`MotionDetectionState`](#motiondetectionstate) | `de-DE`, `en-AU`, `en-CA`, `en-GB`, `en-IN`, `en-US`, `es-ES`, `es-MX`, `es-US`, `fr-CA`, `fr-FR`, `hi-IN`, `it-IT`, `ja-JP`, `pt-BR`
Networking | [`HomeNetwork`](#homenetwork), [`ConnectedDevice`](#connecteddevice), [`NetworkAccess`](#networkaccess) | `en-US`
PercentageController | [`Percentage`](#percentage) | `de-DE`, `en-AU`, `en-CA`, `en-GB`, `en-IN`, `en-US`, `es-ES`, `es-US`, `fr-CA`, `fr-FR`, `hi-IN`, `it-IT`, `ja-JP`, `pt-BR`
PlaybackController | [`Playback`](#playback), [`PlaybackStop`](#playbackstop) | `ar-SA`, `de-DE`, `en-AU`, `en-CA`, `en-GB`, `en-IN`, `en-US`, `es-ES`, `es-MX`, `es-US`, `fr-CA`, `fr-FR`, `hi-IN`, `it-IT`, `ja-JP`, `pt-BR`
PowerController | [`PowerState`](#powerstate) | `ar-SA`, `de-DE`, `en-AU`, `en-CA`, `en-GB`, `en-IN`, `en-US`, `es-ES`, `es-MX`, `es-US`, `fr-CA`, `fr-FR`, `hi-IN`, `it-IT`, `ja-JP`, `pt-BR`
PowerLevelController | [`PowerLevel`](#powerlevel) | `de-DE`, `en-AU`, `en-CA`, `en-GB`, `en-IN`, `en-US`, `es-ES`, `es-MX`, `fr-CA`, `fr-FR`, `it-IT`, `ja-JP`
RangeController | [`RangeValue`](#rangevalue), [`BatteryLevel`](#batterylevel), [`CurrentHumidity`](#currenthumidity), [`FanSpeed`](#fanspeed), [`PositionState`](#positionstate), [`TiltAngle`](#tiltangle) | `de-DE`, `en-AU`, `en-CA`, `en-GB`, `en-IN`, `en-US`, `es-ES`, `es-MX`, `es-US`, `fr-CA`, `fr-FR`, `hi-IN`, `it-IT`, `ja-JP`, `pt-BR`
Safety | [`ObstacleAlert`](#obstaclealert) | `en-US`
SceneController | [`Scene`](#scene), [`Activity`](#activity) | `ar-SA`, `de-DE`, `en-AU`, `en-CA`, `en-GB`, `en-IN`, `en-US`, `es-ES`, `es-MX`, `es-US`, `fr-CA`, `fr-FR`, `hi-IN`, `it-IT`, `ja-JP`, `pt-BR`
SecurityPanelController | [`ArmState`](#armstate), [`BurglaryAlarm`](#burglaryalarm), [`CarbonMonoxideAlarm`](#carbonmonoxidealarm), [`FireAlarm`](#firealarm), [`WaterAlarm`](#wateralarm) | `de-DE`, `en-AU`, `en-CA`, `en-GB`, `en-IN`, `en-US`, `es-ES`, `es-MX`, `es-US`, `fr-CA`, `fr-FR`, `it-IT`, `ja-JP`, `pt-BR`
Speaker | [`VolumeLevel`](#volumelevel), [`MuteState`](#mutestate) | `de-DE`, `en-AU`, `en-CA`, `en-GB`, `en-IN`, `en-US`, `es-ES`, `es-MX`, `it-IT`, `ja-JP`
StepSpeaker | [`VolumeStep`](#volumestep), [`MuteStep`](#mutestep) | `de-DE`, `en-AU`, `en-CA`, `en-GB`, `en-IN`, `en-US`, `es-ES`, `it-IT`
TemperatureSensor | [`CurrentTemperature`](#currenttemperature) | `ar-SA`, `de-DE`, `en-AU`, `en-CA`, `en-GB`, `en-IN`, `en-US`, `es-ES`, `es-MX`, `es-US`, `fr-CA`, `fr-FR`, `hi-IN`, `it-IT`, `ja-JP`, `pt-BR`
ThermostatController | [`TargetTemperature`](#targettemperature), [`CoolingSetpoint`](#coolingsetpoint), [`HeatingSetpoint`](#heatingsetpoint), [`HeatingCoolingMode`](#heatingcoolingmode), [`ThermostatHold`](#thermostathold) | `ar-SA`, `de-DE`, `en-AU`, `en-CA`, `en-GB`, `en-IN`, `en-US`, `es-ES`, `es-MX`, `es-US`, `fr-CA`, `fr-FR`, `hi-IN`, `it-IT`, `ja-JP`, `pt-BR`
ToggleController | [`ToggleState`](#togglestate), [`FanOscillate`](#fanoscillate), [`ThermostatFan`](#thermostatfan) | `de-DE`, `en-AU`, `en-CA`, `en-GB`, `en-IN`, `en-US`, `es-ES`, `es-MX`, `es-US`, `fr-CA`, `fr-FR`, `hi-IN`, `it-IT`, `ja-JP`, `pt-BR`

## Asset Catalog

### Alexa Asset Catalog

List of Alexa asset catalog from the [Alexa Skill API](https://developer.amazon.com/docs/device-apis/resources-and-assets.html#global-alexa-catalog) documentation:

Asset Identifier | Supported Friendly Names
-----------------|-------------------------
`@DeviceName.AirPurifier` | Air Purifier<br>Air Cleaner<br>Clean Air Machine
`@DeviceName.Camera` | Camera
`@DeviceName.Fan` | Fan<br>Blower
`@DeviceName.Router` | Router<br>Internet Router<br>Network Router<br>Wi-Fi Router<br>Net Router
`@DeviceName.Shade` | Shade<br>Blind<br>Curtain<br>Roller<br>Shutter<br>Drape<br>Awning<br>Window Shade<br>Interior blind
`@DeviceName.Shower` | Shower
`@DeviceName.SpaceHeater` | Space Heater<br>Portable Heater
`@DeviceName.Washer` | Washer<br>Washing Machine
`@Setting.2GGuestWiFi` | 2.4G Guest Wi-Fi<br>2.4G Guest Network<br>Guest Network 2.4G<br>2G Guest Wi-Fi
`@Setting.5GGuestWiFi` | 5G Guest Wi-Fi<br>5G Guest Network<br>Guest Network 5G<br>5G Guest Wi-Fi
`@Setting.Auto` | Auto<br>Automatic<br>Automatic Mode<br>Auto Mode
`@Setting.Direction` | Direction
`@Setting.DryCycle` | Dry Cycle<br>Dry Preset<br>Dry Setting<br>Dryer Cycle<br>Dryer Preset<br>Dryer Setting
`@Setting.FanSpeed` | Fan Speed<br>Airflow Speed<br>Wind Speed<br>Air Speed<br>Air Velocity
`@Setting.GuestWiFi` | Guest Wi-Fi<br>Guest Network<br>Guest Net
`@Setting.Heat` | Heat
`@Setting.Mode` | Mode
`@Setting.Night` | Night<br>Night Mode
`@Setting.Opening` | Opening<br>Height<br>Lift<br>Width
`@Setting.Oscillate` | Oscillate<br>Swivel<br>Oscillation<br>Spin<br>Back and Forth
`@Setting.Preset` | Preset<br>Setting
`@Setting.Quiet` | Quiet<br>Quiet Mode<br>Noiseless<br>Silent
`@Setting.Temperature` | Temperature<br>Temp
`@Setting.WashCycle` | Wash Cycle<br>Wash Preset<br>Wash setting
`@Setting.WaterTemperature` | Water Temperature<br>Water Temp<br>Water Heat
`@Shower.HandHeld` | Handheld Shower<br>Shower Wand<br>Hand Shower
`@Shower.RainHead` | Rain Head<br>Overhead Shower<br>Rain Shower<br>Rain Spout<br>Rain Faucet
`@Value.Close` | Close
`@Value.Delicate` | Delicates<br>Delicate
`@Value.High` | High
`@Value.Low` | Low
`@Value.Maximum` | Maximum<br>Max
`@Value.Medium` | Medium<br>Mid
`@Value.Minimum` | Minimum<br>Min
`@Value.Open` | Open
`@Value.QuickWash` | Quick Wash<br>Fast Wash<br>Wash Quickly<br>Speed Wash

### Custom Asset Catalog

List of custom asset catalog defined by the skill:

Asset Identifier | Supported Friendly Names
-----------------|-------------------------
`@Setting.Angle` | Angle
`@Setting.BatteryLevel` | Battery Level
`@Setting.Clean` | Clean
`@Setting.Dock` | Dock
`@Setting.Forward` | Forward
`@Setting.Humidity` | Humidity
`@Setting.Input` | Input
`@Setting.Position` | Position
`@Setting.RangeValue` | Range Value
`@Setting.Reverse` | Reverse
`@Setting.Speed` | Speed
`@Setting.Spot` | Spot
`@Setting.TargetTemperature` | Target Temperature
`@Setting.Tilt` | Tilt
`@Setting.ToggleState` | Toggle State
`@Value.Decrease` | Decrease
`@Value.Default` | Default
`@Value.Down` | Down
`@Value.Increase` | Increase
`@Value.Left` | Left
`@Value.Move` | Move
`@Value.Off` | Off
`@Value.On` | On
`@Value.Pause` | Pause
`@Value.Resume` | Resume
`@Value.Right` | Right
`@Value.Start` | Start
`@Value.Stop` | Stop
`@Value.Up` | Up

## Semantic Catalog

### Alexa Semantic Catalog

List of Alexa semantic catalog from the [Alexa Skill API](https://developer.amazon.com/docs/alexa-voice-service/generic-controllers.html#semantics-syntax) documentation:

Semantic Type | Identifiers
--------------|------------
Actions | `Close`<br>`Open`<br>`Lower`<br>`Raise`
States | `Closed`<br>`Open`

### Custom Semantic Catalog

List of custom semantic catalog defined by skill:

Semantic Type | Identifiers
--------------|------------
Actions | `Pause`<br>`Resume`<br>`Stop`<br>`TurnOff`<br>`TurnOn`
States |

## Unit of Measurement Catalog

List of Alexa unit of measurement catalog from the [Alexa Skill API](https://developer.amazon.com/docs/device-apis/alexa-property-schemas.html#units-of-measure) documentation:

Unit Identifier |
----------------|
`Angle.Degrees` |
`Angle.Radians` |
`Distance.Yards` |
`Distance.Inches` |
`Distance.Meters` |
`Distance.Feet` |
`Distance.Miles` |
`Distance.Kilometers` |
`Mass.Kilograms` |
`Mass.Grams` |
`Percent` |
`Temperature.Degrees` |
`Temperature.Celsius` |
`Temperature.Fahrenheit` |
`Temperature.Kelvin` |
`Volume.Gallons` |
`Volume.Pints` |
`Volume.Quarts` |
`Volume.Liters` |
`Volume.CubicMeters` |
`Volume.CubicFeet` |
`Weight.Pounds` |
`Weight.Ounces` |

<a name="friendly-names-not-allowed"></a>

## Capability Names Not Allowed

List of Alexa friendly names that cannot be used from the [Alexa Skill API](https://developer.amazon.com/docs/device-apis/resources-and-assets.html#reserved-words) documentation:

Friendly Names |
---------------|
alarm |
alarms |
all alarms |
away mode |
bass |
camera |
date |
date today |
day |
do not disturb |
drop in |
music |
night light |
notification |
playing |
sleep sounds |
time |
timer |
today in music |
treble |
volume |
way f. m. |

<a name="other-openhab-alexa-integrations"></a>

## Other openHAB Integrations for Amazon Alexa

openHAB has two other integrations for Amazon Alexa that can be used in conjunction with or independently of this skill.

### Amazon Echo Control Binding

Control Amazon Echo devices from your openHAB.  This allows openHAB to send commands to a echo device and control its ability to play music, set alarms, change the volume and use it a Text-To-Speech output device. See the [Amazon Echo Control Binding](https://www.openhab.org/addons/bindings/amazonechocontrol/) for more information..

### Hue Emulation Service

Hue Emulation exposes openHAB items as Hue devices to other Hue HTTP API compatible applications like an Amazon Echo, Google Home or any Hue compatible application. This is done on the local network and does not require the cloud service. See the [Hue Emulation Service](https://www.openhab.org/addons/integrations/hueemulation/) for more information.
