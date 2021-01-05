---
layout: documentation
title: Amazon Alexa Smart Home Skill
source: https://github.com/openhab/openhab-alexa/blob/master/USAGE.md
description: "Alexa is an intelligent personal assistant developed by Amazon and designed to run on smart speakers and devices such as the Amazon Echo and Dot."
---

# Amazon Alexa Smart Home Skill

<img align="right" width="150px" src="https://images-na.ssl-images-amazon.com/images/I/51-cpfTnBzL._SL210_QL95_BG0,0,0,0_FMpng_.png">

Alexa is an intelligent personal assistant developed by Amazon and designed to run on smart speakers and devices such as the Amazon Echo and Dot.

This certified Amazon Smart Home Skill allows users to control their openHAB powered smart home with natural voice commands.  Lights, locks, thermostats, AV devices, sensors and many other device types can be controlled through a user's Alexa powered device like the Echo or Dot.

This page describes how to use the [openHAB Alexa Smart Home Skill](https://www.amazon.com/openHAB-Foundation/dp/B01MTY7Z5L).
The skill connects your openHAB setup through the [myopenHAB.org](http://myopenHAB.org) cloud service to Amazon Alexa.

## Table of Contents
* [Setup](#setup)
  * [Requirements](#requirements)
  * [Recommendations](#recommendations)
    * [Item Labels](#item-labels)
    * [Regional Settings](#regional-settings)
  * [Concept](#concept)
    * [Single Endpoint](#single-endpoint)
    * [Group Endpoint](#group-endpoint)
    * [Building Block APIs](#building-block-apis)
    * [Semantic Extensions](#semantic-extensions)
    * [Item Sensor](#item-sensor)
    * [Item State](#item-state)
    * [Item Unit of Measurement](#item-unit-of-measurement)
  * [Item Configuration](#item-configuration)
    * [Supported Item Metadata](#supported-item-metadata)
    * [Supported Group Metadata](#supported-group-metadata)
    * [Supported Metadata Labels](#supported-metadata-labels)
    * [Regional Availability](#regional-availability)
    * [Display Categories](#display-categories)
    * [Asset Catalog](#asset-catalog)
    * [Semantic Catalog](#semantic-catalog)
    * [Unit of Measurement Catalog](#unit-of-measurement-catalog)
    * [Friendly Names Not Allowed](#friendly-names-not-allowed)
  * [Item Tag v2 Support](#item-tag-v2-support)
* [Troubleshooting](#troubleshooting)
  * [Command Not Working](#command-not-working)
  * [Device Not Found](#device-not-found)
  * [Device Not Responding](#device-not-responding)
  * [Duplicate Device Names](#duplicate-device-names)
  * [Request Not Supported](#request-not-supported)
  * [Server Authentication Issue](#server-authentication-issue)
  * [Server Not Accessible](#server-not-accessible)
  * [Temperature Out Of Range](#temperature-out-of-range)
* [Example Voice Commands](#example-voice-commands)
* [Other openHAB Alexa Integrations](#other-openhab-alexa-integrations)
  * [Amazon Echo Control Binding](#amazon-echo-control-binding)
  * [Hue Emulation Service](#hue-emulation-service)

# Setup

* NEW Alexa Version 3 API syntax (v3)
  * Version 3 of the Alex Skill API introduces a more rich and complex set of features that required a change in how items are configured by using the new metadata feature introduced in openaHAB 2.3
  * Version 2 tags are still supported and are converted internally to v3 meta data
  * Supported [item](#supported-item-metadata) & [group](#supported-group-metadata) v3 meta data
  * Automatically determine number precision and unit based on [item state presentation](#item-state) and [unit of measurement](#item-unit-of-measurement).
  * Decoupling between item receiving command and item state via an [item sensor](#item-sensor)
  * Improved Alexa response state accuracy
  * Support for [building block APIs](#building-block-apis) and [semantic extensions](#semantic-extensions) latest features

## Requirements

* [openHAB Cloud Connector](https://www.openhab.org/addons/integrations/openhabcloud/) configured using myopenHAB.org
* Amazon account
* Amazon Echo, Amazon Echo Dot or compatible Alexa device

## Recommendations

### Item Labels
Matching of voice commands to items happens based on the item label (e.g. "Kitchen Light"). If it is not specified, the item will be ignored. It is therefore advisable, to choose labels that can be used to form natural commands. It is important to note that each of these labels needs to be unique to prevent any [duplicate issues](#duplicate-device-names). As an example, compare "Alexa, turn on the Kitchen Light" vs. "Alexa, turn on the Ground Floor LEDs Kitchen".

### Regional Settings
In order for the skill to determine your default language and measurement system to use, during the discovery process, for some of the controllers supporting friendly language-based names and unit of measurement, it is important to set your server regional settings including the language, country/region and measurement system properties. These can either be accomplished by using Paper UI (Configuration > System > Regional Settings) or setting the `language`, `region` and `measurementSystem` properties for `org.openhab.i18n` (openHAB 3.0 and later), `org.eclipse.smarthome.i18n` (openHAB 2.5), or `org.eclipse.smarthome.core.i18nprovider` (openHAB 2.4 and prior) service in `$OPENHAB_CONF/services/runtime.cfg`. If these settings aren't defined, the skill will either use the item level configuration, if available, to determine these properties, or fallback to `en` language and `SI` measurement system, as default values.

## Concept

The Alexa skill API uses the concept of "endpoints".  Endpoints are addressable entities that expose functionality in the form of capability interfaces.  An example endpoint may be a light switch, which has a single capability called power state (ON/OFF).  A more complex endpoint may be a thermostat which has many capabilities to control and report temperature, setpoints, modes, etc...

### Single Endpoint
Single items in openHAB can be mapped to single endpoint in Alex through the use of the Alexa metadata.

An simple example of this is a light switch. In openHAB a light switch is defined as a "Switch" item and responds to ON or OFF commands.
```
Switch LightSwitch "Light Switch"
```
In the Alexa skill a light switch endpoint implements the "PowerController" interface and exposes a "powerState" property. To map our openHAB switch to a PowerController endpoint we use a Alexa metadata:
```
Switch LightSwitch "Light Switch" {alexa="PowerController.powerState"}
```
Setting this on a single item will create an Alexa endpoint with the spoken addressable name "Light Switch" and map the powerState property to our item. You can ask Alexa to turn "Light Switch" on or off.

An example of how this works with other metadata is given in [Items Metadata](https://www.openhab.org/docs/concepts/items.html#item-metadata)

This can also be written using [metadata labels](#supported-metadata-labels), which is a shorthand version of the full Alexa namespace:
```
Switch LightSwitch "Light Switch" {alexa="Switchable"}
```

A slightly more complex example would be a Light Dimmer.  In openHAB a dimmer object responds to both percentage and ON / OFF commands.  In Alexa this is two different interfaces.  To support both types of commands, we need to add both to the item metadata:
```
Dimmer LightSwitch "Light Switch" {alexa="PowerController.powerState,BrightnessController.brightness"}
```

You can ask Alexa to "Turn Light Switch .." on or off as well as "Set Light Switch to .." a certain percentage.

Using [metadata labels](#supported-metadata-labels) this would look like:
```
Dimmer LightSwitch "Light Switch" {alexa="Lighting"}
```

NOTE: the Alexa skill has 3 different percentage interfaces, BrightnessController, PowerLevelController and PercentageController.  Your item should only be using one of these that best describes the type of device.  So for lights this would be the BrightnessController, for roller shades this would be PercentageController.   The skill will not prevent adding more then one, but voice control may suffer for that device.

### Group Endpoint
While single mapping items works for many use cases, occasionally multiple openHAB items need to be mapped to a single endpoint in Alexa. When using a group item, keep in mind that there can only be one specific interface capability per group. If you need to have more than one instance of a given capability, you should use the [building block APIs](#building-block-apis) controllers.

Below are examples for various use cases, such as a thermostat, a smart bulb, a stereo and a security system.

In openHAB a thermostat is modeled as many different items, typically there are items for setpoints (target, heat, cool), modes, and the current temperature. To map these items to a single endpoint in Alexa, we will add them to a group which also uses "Alexa" metadata. When items are Alexa-enabled, but are also a member of a group Alexa-enabled, they will be added to the group endpoint and not exposed as their own endpoints.

```
Group  Thermostat    "Bedroom"                                {alexa="Endpoint.Thermostat"}
Number Temperature   "Temperature [%.0f °F]"   (Thermostat)   {alexa="TemperatureSensor.temperature"}
Number CoolSetpoint  "Cool Setpoint [%.0f °F]" (Thermostat)   {alexa="ThermostatController.upperSetpoint"}
Number HeatSetpoint  "Heat Setpoint [%.0f °F]" (Thermostat)   {alexa="ThermostatController.lowerSetpoint"}
Number Mode          "Mode [%s]"               (Thermostat)   {alexa="ThermostatController.thermostatMode"}
```

The group metadata also describes the category for the endpoint, in this case a "Thermostat".  See the section below on supported [group metadata](#supported-group-metadata) and [categories](#display-categories) for a complete list.  In this example a single endpoint is created called "Bedroom", its various interfaces are mapped to different openHAB items.  You can ask Alexa "Set the Bedroom thermostat to 72" and the 'HeatSetpoint' will receive the command, if currently in heating mode, likewise you can ask Alexa "What's the temperature of the Bedroom" and Alexa will query the "Temperature" items for its value.

When mapping items, sometime we need to pass additional parameters to Alexa to set things like what scale to use (Fahrenheit) or what values our items expect for certain states (thermostat modes). These parameters can be passed in the metadata properties, if they are omitted, then reasonable defaults are used.  In our above example we may wish to use Fahrenheit as our temperature scale, and map the mode strings to numbers.  This would look like:

```
Group  Thermostat    "Thermostat"                             {alexa="Endpoint.Thermostat"}
Number Temperature   "Temperature [%.0f °F]"   (Thermostat)   {alexa="TemperatureSensor.temperature" [scale="Fahrenheit"]}
Number CoolSetpoint  "Cool Setpoint [%.0f °F]" (Thermostat)   {alexa="ThermostatController.upperSetpoint" [scale="Fahrenheit"]}
Number HeatSetpoint  "Heat Setpoint [%.0f °F]" (Thermostat)   {alexa="ThermostatController.lowerSetpoint" [scale="Fahrenheit"]}
Number Mode          "Mode [%s]"               (Thermostat)   {alexa="ThermostatController.thermostatMode" [OFF=0,HEAT=1,COOL=2,AUTO=3]}
```

For thermostat integration such as Nest or Ecobee, a more complex configuration could involve having three setpoints and additional upper and lower setpoints for eco mode when these are different than the standard ones. Compared to the previous example, the temperature scale here will be based on the item state presentation unit (`°F` => Fahrenheit) and the thermostat mode will be mapped according to the binding name.

```
Group  Thermostat      "Thermostat"                                {alexa="Endpoint.Thermostat"}
Number Temperature     "Temperature [%.0f °F]"       (Thermostat)  {alexa="TemperatureSensor.temperature"}
Number TargetSetpoint  "Target Setpoint [%.0f °F]"   (Thermostat)  {alexa="ThermostatController.targetSetpoint"}
Number HighSetpoint    "High Setpoint [%.0f °F]"     (Thermostat)  {alexa="ThermostatController.upperSetpoint"}
Number LowSetpoint     "Low Setpoint [%.0f °F]"      (Thermostat)  {alexa="ThermostatController.lowerSetpoint"}
Number EcoHighSetpoint "High Eco Setpoint [%.0f °F]" (Thermostat)  {alexa="ThermostatController.upperSetpoint#eco"}
Number EcoLowSetpoint  "Low Eco Setpoint [%.0f °F]"  (Thermostat)  {alexa="ThermostatController.lowerSetpoint#eco"}
Number Mode            "Mode [%s]"                   (Thermostat)  {alexa="ThermostatController.thermostatMode" [binding="nest"]}
```

A smart bulb is another example when it supports shade of colors. Below are two ways to set up a color and a dimmable white bulb with color temperature capability.

```
Group  Bulb        "Bulb"                {alexa="Endpoint.Light"}
Color  Color       "Color"       (Bulb)  {alexa="BrightnessController.brightness,PowerController.powerState,ColorController.color"}
Dimmer Temperature "Temperature" (Bulb)  {alexa="ColorTemperatureController.colorTemperatureInKelvin"}
```

```
Group  Bulb        "Bulb"                {alexa="Endpoint.Light"}
Dimmer White       "White"       (Bulb)  {alexa="BrightnessController.brightness,PowerController.powerState"}
Dimmer Temperature "Temperature" (Bulb)  {alexa="ColorTemperatureController.colorTemperatureInKelvin"}
```

A Stereo is another example of a single endpoint that needs many items to function properly.  Power, volume, input, speakers and player controllers are all typical use cases for a stereo that a user may wish to control.

```
Group Stereo    "Stereo"            {alexa="Endpoint.Speaker"}
Number Volume   "Volume"  (Stereo)  {alexa="Speaker.volume"}
Switch Mute     "Mute"    (Stereo)  {alexa="Speaker.muted"}
Switch Power    "Power"   (Stereo)  {alexa="PowerController.powerState"}
String Input    "Input"   (Stereo)  {alexa="InputController.input" [supportedInputs="HDMI1,TV"]}
String Channel  "Channel" (Stereo)  {alexa="ChannelController.channel"}
Player Player   "Player"  (Stereo)  {alexa="PlaybackController.playback"}
Number Bass     "Bass"    (Stereo)  {alexa="EqualizerController.bands:bass" [range="-10:10"]}
Number Midrange "Mid"     (Stereo)  {alexa="EqualizerController.bands:midrange" [range="-10:10"]}
Number Treble   "Treble"  (Stereo)  {alexa="EqualizerController.bands:treble" [range="-10:10"]}
String Mode     "Mode"    (Stereo)  {alexa="EqualizerController.mode" [supportedModes="MOVIE,MUSIC,TV"]}
```

A security system is another example including alarm mode and different alarm states.

```
Group  SecuritySystem      "Security System"                  {alexa="Endpoint.SecurityPanel"}
String AlarmMode           "Alarm Mode"      (SecuritySystem) {alexa="SecurityPanelController.armState" [supportedArmStates="DISARMED,ARMED_STAY,ARMED_AWAY"]}
Switch BurglaryAlarm       "Burglary"        (SecuritySystem) {alexa="SecurityPanelController.burglaryAlarm"}
Switch FireAlarm           "Fire"            (SecuritySystem) {alexa="SecurityPanelController.fireAlarm"}
Switch CarbonMonoxideAlarm "Carbon Monoxide" (SecuritySystem) {alexa="SecurityPanelController.carbonMonoxideAlarm"}
Switch WaterAlarm          "Water"           (SecuritySystem) {alexa="SecurityPanelController.waterAlarm"}
```

### Building Block APIs
For components of a device, which isn't covered by the existing interfaces, that have more than one setting, characterized by a number within a range or just turn on and off, the [Mode](#modecontroller-mode), [Range](#rangecontroller-rangevalue) and [Toggle](#togglecontroller-togglestate) controllers can be used to highly customize how you interact with that device via Alexa. These capabilities can be used like building blocks to model the full feature set of a complex device. With the expansion of these controllers support to other languages, the skill will use your server [regional settings](#regional-settings) if available, falling back to `en`, to determine your default language setting.

A washer and its settings modeled with multiple mode interface capabilities.

```
Group Washer       "Washer"               {alexa="Endpoint.Other"}
String Cycle       "Cycle"       (Washer) {alexa="ModeController.mode" [supportedModes="Normal=Normal:Cottons,Delicate=@Value.Delicate:Knits",friendlyNames="Wash Cycle,Wash Setting",ordered=false]}
Number Temperature "Temperature" (Washer) {alexa="ModeController.mode" [supportedModes="0=Cold:Cool,1=Warm,2=Hot",friendlyNames="Wash Temperature,@Setting.WaterTemperature",ordered=true]}
String Status      "Status"      (Washer) {alexa="ModeController.mode" [supportedModes="Washing,Rinsing,Spinning",friendlyNames="Wash Status",nonControllable=true]}
Switch Power       "Power"       (Washer) {alexa="PowerController.powerState"}
```

A fan and its settings modeled with a mix of range/toggle interface capabilities.

```
Group Fan     "Fan"          {alexa="Endpoint.Fan"}
Number Speed  "Speed"  (Fan) {alexa="RangeController.rangeValue" [supportedRange="1:10:1",presets="1=@Value.Minimum:@Value.Low:Lowest,10=@Value.Maximum:@Value.High:Highest",friendlyNames="@Setting.FanSpeed,Speed"]}
Switch Rotate "Rotate" (Fan) {alexa="ToggleController.toggleState" [friendlyNames="@Setting.Oscillate,Rotate"]}
Switch Power  "Power"  (Fan) {alexa="PowerController.powerState"}
```

A router and its settings modeled with multiple toggle interface capabilities.

```
Group Router       "Router"                 {alexa="Endpoint.NetworkHardware"}
Switch 2GGuestWiFi "2G Guest WiFi" (Router) {alexa="ToggleController.toggleState" [friendlyNames="@Setting.2GGuestWiFi"]}
Switch 5GGuestWiFi "5G Guest WiFi" (Router) {alexa="ToggleController.toggleState" [friendlyNames="@Setting.5GGuestWiFi"]}
Switch Power       "Power"         (Router) {alexa="PowerController.powerState"}
```

### Semantic Extensions
Semantic extensions are used to further customize how to interact with a device. This functionality is only supported by the [Mode](#modecontroller-mode), [Range](#rangecontroller-rangevalue) and [Toggle](#togglecontroller-togglestate) controllers. It currently provides "Close", "Open", "Lower" and "Raise" interactions, removing the need for the Alexa routine workaround to control certain devices such as blinds or doors. Each semantic is composed of action and state mappings. The actions are used for interacting with the device and the states for displaying its current semantic state in the Alexa app (Not available as of yet). The supported action and state names are listed in the [semantic catalog](#semantic-catalog).

A standard blind with range interface capability (Metadata label: [`Blind`](#blind)). For example, requesting "Alexa, open the blind", the item state will be set to `100`. Likewise, asking "Alexa, lower the blind", the item state will be decreased by 10 from its current state.

```
Rollershutter Blind "Blind" {alexa="RangeController.rangeValue" [category="INTERIOR_BLIND", friendlyNames="@Setting.Opening", supportedRange="0:100:10", unitOfMeasure="Percent", actionMappings="Close=0,Open=100,Lower=(-10),Raise=(+10)", stateMappings="Closed=0,Open=1:100"]}
```

A shutter with mode interface capability. For example, requesting "Alexa, open the shutter" or "Alexa, raise the shutter", the item state will be set to `Up`.

```
String Shutter "Shutter" {alexa="ModeController.mode" [category="EXTERIOR_BLIND", friendlyNames="@Setting.Opening", supportedModes="Up=@Value.Open,Down=@Value.Close", actionMappings="Close=Down,Open=Up,Lower=Down,Raise=Up", stateMappings="Closed=Down,Open=Up"]}
```

A door with toggle interface capability (Metadata label: [`Door`](#door)). For example, requesting "Alexa, open the door", the item state will be set to `ON`.

```
Switch Door "Door" {alexa="ToggleController.toggleState" [category="DOOR", friendlyNames="@Setting.Opening", actionMappings="Close=OFF,Open=ON", stateMappings="Closed=OFF,Open=ON"]}
```

### Item Sensor
Whenever, a device in openHAB uses a separate channel for its status, that item (called "sensor") can be mapped in the actionable item parameters. This feature is design to improve state reporting accuracy by allowing the property state of the sensor item to be reported over the actionable one. It is configured by adding the metadata parameter `itemSensor=<itemName>`.

It is important to note that sensor items need to be the same type than their parent item, except for LockController capable items. Additionally, since deferred reporting is not supported by the skill as of yet, their state will need to be available right away for the skill to report the device latest status.

Below is an example of a lock device using an item sensor.

```
Switch LockControl "Lock" {alexa="LockController.lockState" [itemSensor="LockStatus"]}
Contact LockStatus "Status"
```

### Item State
Item states, reported back to Alexa, are formatted based on their [item state presentation](https://www.openhab.org/docs/configuration/items.html#state-presentation) definition if configured. This means you can control the precision of number values (e.g. `%.1f °C` will limit reported temperature value to one decimal point).

For items that don't have a state, these can be configured as not retrievable, automatically when the item [parameter `autoupdate`](https://www.openhab.org/docs/configuration/items.html#parameter-autoupdate) is set as `autoupdate=false` or by using metadata parameter `itemStateRetrievable=false`. In that case, Alexa will not retrieve the given item state, and when a command is issued against that item, the requested state will be returned back without checking the current state in openHAB. If using this feature in a group endpoint, keep in mind that all associated items will need to be configured to either report or not report a state, otherwise the Alexa integration for that endpoint will be broken.

### Item Unit of Measurement
With the introduction of the [unit of measurement](https://www.openhab.org/docs/concepts/units-of-measurement.html) concept, the item unit can be automatically determined for thermostat and temperature using that feature, removing the need of having to set the metadata scale parameter for each of the relevant items or groups.

Below are two examples; the scale on the first will be set to Fahrenheit based on how it is defined in the item state presentation pattern and the second one will be set based on your openHAB system regional settings (US=Fahrenheit; SI=Celsius).

```
Number:Temperature Temperature1 "Temperature [%.1f °F]" {alexa="TemperatureSensor.temperature"}
Number:Temperature Temperature2 "Temperature"           {alexa="TemperatureSensor.temperature"}
```

## Item Configuration

### Supported Item Metadata
The following are a list of supported metadata. It is important to note that not all the capabilities listed below are [available](#regional-availability) globally.

#### `PowerController.powerState`
* Items that turn on or off such as light switches, power states, etc..
* Supported item type:
  * Color
  * Dimmer
  * Switch
* Default category: SWITCH

#### `BrightnessController.brightness`
* Items which response to percentage level and brightness commands (dim, brighten, percent), typically lights.
* Supported item type:
  * Color
  * Dimmer
* Default category: LIGHT

#### `PowerLevelController.powerLevel`
* Items which respond to a specific number setting
* Supported item type:
  * Dimmer
* Default category: SWITCH

#### `PercentageController.percentage`
* Items which respond to percentage commands such as roller shutters.
* Supported item type:
  * Dimmer
  * Rollershutter
* Default category: OTHER

#### `ThermostatController.targetSetpoint`
* Items that represent a target setpoint for a thermostat. The scale is determined based on: (1) value set in parameter `scale="Fahrenheit"`; (2) unit of item state presentation (`°F`=Fahrenheit; `°C`=Celsius); (3) your openHAB server regional measurement system or region settings (US=Fahrenheit; SI=Celsius); (4) defaults to Celsius. By default, the temperature range is limited to predefined setpoint values based on the scale parameter. If necessary, the temperature range can be customized using parameter `setpointRange="60:90"`. When paired with `ThermostatController.thermostatMode`, setpoint requests will be ignored when the thermostat mode is off.
* Supported item type:
  * Number(:Temperature)
* Supported metadata parameters:
  * scale=`<scale>`
    * Celsius [4°C -> 32°C]
    * Fahrenheit [40°F -> 90°F]
  * setpointRange=`<minValue:maxValue>`
    * defaults to defined scale range listed above if omitted
* Default category: THERMOSTAT

#### `ThermostatController.upperSetpoint`
* Items that represent a upper or COOL setpoint for a thermostat. This needs to be paired with `ThermostatController.lowerSetpoint`. The scale is determined based on: (1) value set in parameter `scale="Fahrenheit"`; (2) unit of item state presentation (`°F`=Fahrenheit; `°C`=Celsius); (3) your openHAB server regional measurement system or region settings (US=Fahrenheit; SI=Celsius); (4) defaults to Celsius. By default, the temperature range is limited to predefined setpoint values based on the scale parameter. If necessary, the temperature range can be customized using parameter `setpointRange="60:90"`. When paired with `ThermostatController.thermostatMode`, setpoint requests and responses will be limited based on the current thermostat mode as follows: (1) thermostat mode cannot be off to set/adjust a setpoint temperature; (2) set/adjust upper or lower setpoint to single point target temperature in dual mode with, respectively, thermostat cooling or heating mode. (3) thermostat auto and eco mode will be considered in dual mode if setpoints defined, otherwise in single mode. Additionally, for integration that uses separate upper and lower setpoints for eco mode (e.g. Nest), suffix `#eco` can be appended to the metadata property `ThermostatController.upperSetpoint#eco` to differentiate that property from the standard ones. For triple mode support, the setpoint mode automation will need to be disabled by adding parameter `supportsSetpointMode=false` to the [thermostat mode](#thermostatcontroller-thermostatmode) item configuration.
* Supported item type:
  * Number(:Temperature)
* Supported metadata parameters:
  * scale=`<scale>`
    * Celsius [4°C -> 32°C]
    * Fahrenheit [40°F -> 90°F]
  * comfortRange=`<number>`
    * used in dual setpoint mode to determine:
      * the new upper/lower setpoints spread based on target setpoint
      * the minimum temperature delta between requested upper/lower setpoints by adding relevant comfort range values
    * defaults to 2°F or 1°C
  * setpointRange=`<minValue:maxValue>`
    * defaults to defined scale range listed above if omitted
* Default category: THERMOSTAT

#### `ThermostatController.lowerSetpoint`
* Items that represent a lower or HEAT setpoint for a thermostat. This needs to be paired with `ThermostatController.upperSetpoint`. The scale is determined based on: (1) value set in parameter `scale="Fahrenheit"`; (2) unit of item state presentation (`°F`=Fahrenheit; `°C`=Celsius); (3) your openHAB server regional measurement system or region settings (US=Fahrenheit; SI=Celsius); (4) defaults to Celsius. By default, the temperature range is limited to predefined setpoint values based on the scale parameter. If necessary, the temperature range can be customized using parameter `setpointRange="60:90"`. When paired with `ThermostatController.thermostatMode`, setpoint requests and responses will be limited based on the current thermostat mode as follows: (1) thermostat mode cannot be off to set/adjust a setpoint temperature; (2) set/adjust upper or lower setpoint to single point target temperature in dual mode with, respectively, thermostat cooling or heating mode. (3) thermostat auto and eco mode will be considered in dual mode if setpoints defined, otherwise in single mode. Additionally, for integration that uses separate upper and lower setpoints for eco mode (e.g. Nest), suffix `#eco` can be appended to the metadata property `ThermostatController.lowerSetpoint#eco` to differentiate that property from the standard ones. For triple mode support, the setpoint mode automation will need to be disabled by adding parameter `supportsSetpointMode=false` to the [thermostat mode](#thermostatcontroller-thermostatmode) item configuration.
* Supported item type:
  * Number(:Temperature)
* Supported metadata parameters:
  * scale=`<scale>`
    * Celsius [4°C -> 32°C]
    * Fahrenheit [40°F -> 90°F]
  * comfortRange=`<number>`
    * used in dual setpoint mode to determine:
      * the new upper/lower setpoints spread based on target setpoint
      * the minimum temperature delta between requested upper/lower setpoints by adding relevant comfort range values
    * defaults to 2°F or 1°C
  * setpointRange=`<minValue:maxValue>`
    * defaults to defined scale range listed above if omitted
* Default category: THERMOSTAT

#### `ThermostatController.thermostatMode`
* Items that represent the mode for a thermostat, default string values are `OFF="off",HEAT="heat",COOL="cool",ECO="eco",AUTO="auto"`, but these can be mapped to other values in the metadata. The mapping can be, in order of precedence, user-defined (AUTO=3,...) or preset-based related to the thermostat binding used (binding=`<value>`). For the binding parameter, it will be automatically determined if the associated item is using a 2.x addon (via channel metadata). If neither of these settings are provided, for thermostats that only support a subset of the standard modes, a comma delimited list of the Alexa supported modes should be set using the supportedModes parameter, otherwise, the supported list will be compiled based of the default mapping.
* Supported item type:
  * Number
  * String
  * Switch (Heating only)
* Supported metadata parameters:
  * OFF=`<state>`
  * HEAT=`<state>`
  * COOL=`<state>`
  * ECO=`<state>`
  * AUTO=`<state>`
  * binding=`<value>`
    * [daikin](https://www.openhab.org/addons/bindings/daikin/) [HEAT="HEAT", COOL="COLD", AUTO="AUTO"]
    * [ecobee1](https://www.openhab.org/addons/bindings/ecobee1/) [OFF="off", HEAT="heat", COOL="cool", AUTO="auto"]
    * [max](https://www.openhab.org/addons/bindings/max/) [HEAT="MANUAL", ECO="VACATION", AUTO="AUTOMATIC"]
    * [nest](https://www.openhab.org/addons/bindings/nest/) [OFF="OFF", HEAT="HEAT", COOL="COOL", ECO="ECO", AUTO="HEAT_COOL"]
    * [nest1](https://www.openhab.org/addons/bindings/nest1/) [OFF="off", HEAT="heat", COOL="cool", ECO="eco", AUTO="heat-cool"]
    * [zwave](https://www.openhab.org/addons/bindings/zwave/) [OFF=0, HEAT=1, COOL=2, AUTO=3]
    * [zwave1](https://www.openhab.org/addons/bindings/zwave1/) [OFF=0, HEAT=1, COOL=2, AUTO=3]
    * defaults to [OFF="off", HEAT="heat", COOL="cool", ECO="eco", AUTO="auto"] if omitted
  * supportedModes=`<values>`
    * defaults to, depending on the parameters provided, either user-based, preset-based or default item type-based mapping.
  * supportsSetpointMode=`<boolean>`
    * set to false to disable the thermostat setpoint mode-aware feature (Refer to upper/lower setpoints documentation for more information)
    * defaults to true
* Default category: THERMOSTAT

#### `TemperatureSensor.temperature`
* Items that represent the current temperature. The scale is determined based on: (1) value set in parameter `scale="Fahrenheit"`; (2) unit of item state presentation (`°F`=Fahrenheit; `°C`=Celsius); (3) your openHAB server regional measurement system or region settings (US=Fahrenheit; SI=Celsius); (4) defaults to Celsius.
* Supported item type:
  * Number(:Temperature)
* Supported metadata parameters:
  * scale=`<scale>`
    * Celsius
    * Fahrenheit
* Default category: TEMPERATURE_SENSOR

#### `LockController.lockState`
* Items that represent the state of a lock (ON lock, OFF unlock). When associated to an [item sensor](#item-sensor), the state of that item will be returned instead of the original actionable item. Additionally, when linking to such item, multiple properties to one state can be mapped with column delimiter (e.g. for a Z-Wave lock: `LOCKED="1:3",UNLOCKED="2:4",JAMMED=11`).
* Supported item type:
  * Switch
* Supported sensor type:
  * Contact [LOCKED="CLOSED", UNLOCKED="OPEN"]
  * Number [LOCKED=1, UNLOCKED=2, JAMMED=3]
  * String [LOCKED="locked", "UNLOCKED"="unlocked", JAMMED="jammed"]
  * Switch [LOCKED="ON", UNLOCKED="OFF"]
* Supported metadata parameters:
  * LOCKED=`<state>`
  * UNLOCKED=`<state>`
  * JAMMED=`<state>`
  * defaults based on item sensor type if omitted
* Default category: SMARTLOCK

#### `ColorController.color`
* Items that represent a color
* Supported item type:
  * Color
* Default category: LIGHT

#### `ColorTemperatureController.colorTemperatureInKelvin`
* Items that represents a color temperature, default increment value may be specified in metadata parameters. For dimmer typed items adjustments, INCREASE/DECREASE commands will be sent instead if increment value not defined, while number typed items will default to 500K increments. Optionally, the supported temperature range in Kelvin can be provided using parameter `range="2700:6500"`. Preset-based range values will automatically be used based on the binding name and thing type (to differentiate color/white ranges), if the associated item is linked to one of the addons listed below (via channel metadata). Otherwise, to use these preset settings, use the parameter `binding=hue` or `binding=hue:white`. By default, the color type preset-based range values are used if the binding name is provided and the device/thing type cannot be determined. It is important to note that temperature adjustment requests for endpoints including a color item, will be rejected if the endpoint is in color mode (Dimmer => undefined temperature or color saturation > 0; Number => undefined temperature or temperature = 0). In that event, set the initial white level before requesting subsequent adjustments.
* Supported item type:
  * Dimmer: colder (0%) to warmer (100%) based on defined temperature range [bindings integration]
  * Number: color temperature value in Kelvin [custom integration]
* Supported metadata parameters:
  * increment=`<number>`
    * value in % for dimmer item/in Kelvin for number item
    * defaults to increment=INCREASE/DECREASE (Dimmer) or increment=500 (Number) if omitted
  * range=`<minValue:maxValue>`
    * values in Kelvin
    * defaults to `1000:10000` if omitted or no binding preset-based range values found
  * binding=`<value>`
    * [hue](https://www.openhab.org/addons/bindings/hue/) [color=`2000:6500`, white=`2200:6500`]
    * [lifx](https://www.openhab.org/addons/bindings/lifx/) [color=`2500:9000`, white=`2700:6500`]
    * [milight](https://www.openhab.org/addons/bindings/milight/) [color=`2700:6500`, white=`2700:6500`]
    * [tradfri](https://www.openhab.org/addons/bindings/tradfri/) [color=`1780:6000`, white=`2200:4000`]
    * [yeelight](https://www.openhab.org/addons/bindings/yeelight/) [color=`1700:6500`, white=`2700:6500`]
* Default category: LIGHT

#### `SceneController.scene`
* Items that represent a scene or an activity depending on defined category and may be set not to support deactivation requests based on metadata parameters.
* Supported item type:
  * Switch
* Supported metadata parameters:
  * supportsDeactivation=`<boolean>`
    * true (default if omitted)
    * false
* Default category: SCENE_TRIGGER

#### `ChannelController.channel`
* Items that represent a channel. A channel mapping may be specified in metadata parameters allowing channel request by name. It is important to note only well-known channel names can be used as these are validated against a database on the Alexa side when requested. Unfortunately, Amazon doesn't provide a list of supported channel names.
* Supported item type:
  * Number
  * String
* Supported metadata parameters:
  * `<channelName1>`=`<channelNumber1>`
  * `<channelName2>`=`<channelNumber2>`
  * ...
* Default category: TV

#### `InputController.input`
* Items that represent a source input (e.g. "HDMI 1", or "TUNER" on a stereo). A list of [supported input values](https://developer.amazon.com/en-US/docs/alexa/device-apis/alexa-inputcontroller.html#input-values) needs to be provided using the supportedInputs parameter. The space between the input name and number is not sent to OH (e.g. "HDMI 1" [alexa] => "HDMI1" [OH]). That space can also be omitted in the supported list as well.
* Supported item type:
  * String
* Supported metadata parameters:
  * supportedInputs=`<inputs>`
    * required list of supported input values (e.g. `"HMDI1,TV,XBOX"`)
* Default category: TV

#### `Speaker.volume`
* Items that represent a volume level, default increment may be specified in metadata parameters
* Supported item type:
  * Dimmer
  * Number
* Supported metadata parameters:
  * increment=`<number>`
    * defaults to increment=10 (standard value provided by Alexa) if omitted.
* Default category: SPEAKER

#### `Speaker.muted`
* Items that represent a muted state (ON muted, OFF unmuted)
* Supported item type:
  * Switch
* Default category: SPEAKER

#### `StepSpeaker.volume`
* Items that represent a volume controlled in steps only (e.g. +1, -1), such as a button on a remote control. This should only be used if the current volume level state cannot be tracked in openHAB otherwise just use `Speaker.volume`. Default increment may be specified in metadata parameters.
* Supported item type:
  * Number
* Supported metadata parameters:
  * increment=`<number>`
    * defaults to increment=10 (standard value provided by Alexa) if omitted.
* Default category: SPEAKER

#### `StepSpeaker.muted`
* Items that represent a muted state (ON muted, OFF unmuted). This should only be used if the current muted state cannot be tracked in openHAB otherwise just use `Speaker.muted`.
* Supported item type:
  * Switch
* Default category: SPEAKER

#### `PlaybackController.playback`
* Items that represent the playback controls of a AV device. (Supported commands: Play, Pause, Next, Previous, Rewind, Fast Forward)
* Supported item type:
  * Player
* Default category: OTHER

#### `EqualizerController.bands:{bass,midrange,treble}`
* Items that represent the different equalizer bands and their ranges supported by an audio system. Use specific capability component (`bass`, `midrange` or `treble`) when configuring a band (e.g. `EqualizerController.bands:bass`). Add the band range values in the `range="-10:10"` parameter. For the reset default value, provide the setting in `default=0` parameter or it will be calculated by using midpoint range spread. Additionally, default adjust increment can be configured in `increment=2` parameter. When configuring multiple bands, make sure to synchronize the range parameter across relevant items as the same range values will be used for all bands due to Alexa restriction. However, the reset and increment default values can be different between bands.
* Supported item type:
  * Dimmer
  * Number
* Supported metadata parameters:
  * range=`<minValue:maxValue>`
    * defaults to `"0:100"` for Dimmer and `"-10:10"` for Number item types if omitted
  * default=`<number>`
    * defaults to midpoint range spread if omitted
  * increment=`<number>`
    * defaults to increment=INCREASE/DECREASE (Dimmer) or increment=1 (Number) if omitted
* Default category: SPEAKER

#### `EqualizerController.mode`
* Items that represent a list of equalizer modes supported by an audio system. Set supported modes using `supportedModes="MOVIE,MUSIC,TV"` parameter. The mode listed in additional properties (MOVIE, MUSIC, NIGHT, SPORT, TV) are the only ones supported by the Alexa API currently. For the mapping, default item type mapping (listed below) can be used or if necessary, add each state to the parameters similar to how it is done with other interfaces.
* Supported item type:
  * Number [MOVIE=1, MUSIC=2, NIGHT=3, SPORT=4, TV=5]
  * String [MOVIE="movie", MUSIC="music", NIGHT="night", SPORT="sport", TV="tv"]
* Supported metadata parameters:
  * MOVIE=`<state>`
  * MUSIC=`<state>`
  * NIGHT=`<state>`
  * SPORT=`<state>`
  * TV=`<state>`
  * supportedModes=`<modes>`
    * defaults to, depending on the parameters provided, either user-based or default item type-based mapping.
* Default category: SPEAKER

#### `ContactSensor.detectionState`
* Items that represent a contact sensor that can be used to trigger Alexa routines. (Currently not usable as proactive reporting not supported yet)
* Supported item type:
  * Contact
  * Switch
* Default category: CONTACT_SENSOR

#### `MotionSensor.detectionState`
* Items that represent a motion sensor that can be used to trigger Alexa routines. (Currently not usable as proactive reporting not supported yet)
* Supported item type:
  * Contact
  * Switch
* Default category: MOTION_SENSOR

#### `SecurityPanelController.armState`
* Items that represent a device that controls a security system. Set supported arm states using `supportedArmStates="DISARMED,ARMED_STAY,ARMED_AWAY"` parameter. For the mapping, default item type mapping (listed below) can be used or if necessary, add each state to the parameters similar to how it is done with other interfaces. If using a String item type, supports for pin codes (ability to have the disarm pin code verification done in openHAB) can be configured using `supportsPinCodes=true`. For system that have an exit delay, provide the delay in seconds using parameter `exitDelay=180`. If defined, the delay is provided to Alexa during arm away requests only. For the pin code, you will need to enable voice pin in the Alexa app for the relevant device. If pin codes support is set to true, disarm request will include the pin code in item command delimited by a column sign (e.g. `disarm:1234`), otherwise, the verification is done by Alexa based on the voice pin code you configured. When the pin code is attached to the item command, it is your responsibility to validate the code on the openHAB side and change the item status to UNAUTHORIZED corresponding state in order to indicate that the code is invalid. Otherwise, if no action is taken, the skill will consider the request successful. Other errors state can also be used based on the list of additional properties below. These should only be used when arm/disarm commands are received. When associated to an [item sensor](#item-sensor), the item command and state can be decoupled. Although at this time, the skill doesn't support delayed responses, so there should be no delay in updating the relevant item state.
* Supported item type:
  * Number [DISARMED=0, ARMED_STAY=1, ARMED_AWAY=2, ARMED_NIGHT=3, NOT_READY=4, UNCLEARED_ALARM=5, UNCLEARED_TROUBLE=6, BYPASS_NEEDED=7]
  * String [DISARMED="disarm", ARMED_STAY="stay", ARMED_AWAY="away", ARMED_NIGHT="night", AUTHORIZATION_REQUIRED="authreq", UNAUTHORIZED="unauth", NOT_READY="notrdy", UNCLEARED_ALARM="alarm", UNCLEARED_TROUBLE="trouble", BYPASS_NEEDED="bypass"]
  * Switch [DISARMED="OFF", ARMED_STAY="ON"]
* Supported metadata parameters:
  * DISARMED=`<state>`
  * ARMED_STAY=`<state>`
  * ARMED_AWAY=`<state>`
  * ARMED_NIGHT=`<state>`
  * AUTHORIZATION_REQUIRED=`<state>`
    * error state when in arm away mode while arm request in stay or night
  * UNAUTHORIZED=`<state>`
    * error state when provided disarm pin code is incorrect (Only used with pin codes support)
  * NOT_READY=`<state>`
    * error state when system not ready for arming or disarming
  * UNCLEARED_ALARM=`<state>`
    * error state when system has uncleared alarm preventing arming
  * UNCLEARED_TROUBLE=`<state>`
    * error state when system has uncleared trouble condition preventing arming
  * BYPASS_NEEDED=`<state>`
    * error state when system has open zones preventing arming
  * supportedArmStates=`<states>`
    * supported arm states should only be a list of DISARMED and ARMED_* states; do not put error states in that parameter.
    * defaults to, depending on the parameters provided, either user-based or default item type-based mapping.
  * supportsPinCodes=`<boolean>` (optional)
    * only supported with String item type
    * defaults to false
  * exitDelay=`<number>` (optional)
    * maximum delay Alexa restriction up to 255 seconds.
    * defaults to no value
* Default category: SECURITY_PANEL

#### `SecurityPanelController.burglaryAlarm`
* Items that represent the current state of the burglary alarm part of a security system
* Supported item type:
  * Contact
  * Switch
* Default category: SECURITY_PANEL

#### `SecurityPanelController.fireAlarm`
* Items that represent the current state of the fire alarm part of a security system
* Supported item type:
  * Contact
  * Switch
* Default category: SECURITY_PANEL

#### `SecurityPanelController.carbonMonoxideAlarm`
* Items that represent the current state of the carbon monoxide alarm part of a security system
* Supported item type:
  * Contact
  * Switch
* Default category: SECURITY_PANEL

#### `SecurityPanelController.waterAlarm`
* Items that represent the current state of the water alarm part of a security system
* Supported item type:
  * Contact
  * Switch
* Default category: SECURITY_PANEL

#### `ModeController.mode`
* Items that represent components of a device that have more than one setting. Multiple instances can be configured in a group endpoint. By default, to ask for a specific mode, the item label will be used as the friendly name. To configure it, use `friendlyNames` parameter and provide a comma delimited list of different labels (Keep in mind that some names are [not allowed](#friendly-names-not-allowed)). Additionally, pre-defined [asset ids](#asset-catalog) can be used to label a mode as well prefixing with an @ sign (e.g. `friendlyNames="Wash Temperature,@Setting.WaterTemperature"`). If the component isn't controllable through openHAB, set parameter `nonControllable=true`, that way only status requests will be processed. In regards to supported modes and their mappings, by default if omitted, the openHAB item state description options, if defined, are used to determine these configurations. To configure it, use `supportedModes` parameter and provide a comma delimited list of mode mappings composed of openHAB item states and the associated names/asset ids they should be called, delimited by equal and column signs (e.g. `supportedModes="0=Cold:Cool,1=Warm,2=Hot"`). For string based modes, if the mapping state value and name are the same (case sensitive), a shortened format can be used, where the name doesn't need to be added to the list by either leaving the first element empty or not providing the names at all (e.g. `supportedModes="Normal=:Cottons,Whites"` <=> `supportedModes="Normal=Normal:Cottons,Whites=Whites`). Additionally, if the mode can be adjusted incrementally (e.g. temperature control), set parameter `ordered=true`, otherwise only requests to set a specific mode will be accepted. For text-based name language support, your server [regional settings](#regional-settings) should be setup, otherwise, you can optionally set the language in parameter `language="en"`. For [semantic extensions](#semantic-extensions) support, set actions in parameter `actionMappings="Close=Down,Open=Up,Lower=Down,Raise=Up"` and states in parameter `stateMappings="Closed=Down,Open=Up"`. For actions, you can configure a set request by providing the mode or an adjust request, if `ordered=true`, by providing the delta value in parentheses.
* Supported item type:
  * Number
  * String
* Supported metadata parameters:
  * friendlyNames=`<names>`
    * each name formatted as `<@assetIdOrName>`
    * defaults to item label name
  * nonControllable=`<boolean>`
    * defaults to false
  * supportedModes=`<modes>`
    * each mode formatted as `<mode>=<@assetIdOrName1>:<@assetIdOrName2>:...`
    * requires two modes to be specified at least
    * defaults to item state description options `supportedModes="value1=label1,..."`, if defined, otherwise no supported modes
  * ordered=`<boolean>`
    * defaults to false
  * language=`<code>`
    * two letter language code [`de`, `en`, `es`, `fr`, `hi`, `it`, `ja`, `pt`]
    * defaults to your server [regional settings](#regional-settings), if defined, otherwise `en`
  * actionMappings=`<mappings>`
    * each mapping formatted as, based on action type:
      * set => `<action>=<mode>`
      * adjust => `<action>=(<deltaValue>)` (Supported only if `ordered=true`)
  * stateMappings=`<mappings>`
    * each mapping formatted as `<state>=<mode>`
* Default category: OTHER

#### `RangeController.rangeValue`
* Items that represent components of a device that are characterized by numbers within a minimum and maximum range. Multiple instances can be configured in a group endpoint. By default, to ask for a specific range, the item label will be used as the friendly name. To configure it, use `friendlyNames` parameter and provide a comma delimited list of different labels (Keep in mind that some names are [not allowed](#friendly-names-not-allowed)). Additionally, pre-defined [asset ids](#asset-catalog) can be used to label a mode as well prefixing with an @ sign (e.g. `friendlyNames="@Setting.FanSpeed,Speed"`). If the component isn't controllable through openHAB, set parameter `nonControllable=true`, that way only status requests will be processed. To set the supported range, provide a column delimited list including minimum, maximum and precision values (e.g. `supportedRange="0:100:1"`). The latter value will be use as default increment when requesting adjusted range values. Optionally, named presets can be defined, by providing a list of comma delimited preset mappings composed of a range value and its friendly names/asset ids column delimited (e.g. fan speeds => `presets="1=@Value.Minimum:@Value.Low:Lowest,10=@Value.Maximum:@Value.High:Highest"`). Another optional settings is `unitOfMeasure` parameter which gives a unit of measure to the range values. It is determined based on: (1) [unit id](#unit-of-measurement-catalog) set in parameter `unitOfMeasure=Angle.Degrees`; (2) supported unit of item state presentation; (3) default unit of measurement for item type with dimension based on your openHAB server regional settings; (4) defaults to empty. For text-based name language support, your server [regional settings](#regional-settings) should be setup, otherwise, you can optionally set the language in parameter `language="en"`. For [semantic extensions](#semantic-extensions) support, set actions in parameter `actionMappings="Close=0,Open=100,Lower=(-10),Raise=(+10)"` and states in parameter `stateMappings="Closed=0,Open=1:100"`. For actions, you can configure a set request by providing the number value or an adjust request by providing the delta value in parentheses. For states, you can configure a specific number value or a range by providing a column delimited list including minimum and maximum values.
* Supported item type:
  * Dimmer
  * Number
  * Number:Angle
  * Number:Dimensionless
  * Number:Length
  * Number:Mass
  * Number:Temperature
  * Number:Volume
  * Rollershutter
* Supported metadata parameters:
  * friendlyNames=`<names>`
    * each name formatted as `<@assetIdOrName>`
    * defaults to item label name
  * nonControllable=`<boolean>`
    * defaults to false
  * supportedRange=`<minValue:maxValue:precision>`
    * defaults to `"0:100:1"` for Dimmer/Rollershutter, `"0:10:1"` for Number* item types
  * presets=`<presets>` (optional)
    * each preset formatted as `<presetValue>=<@assetIdOrName1>:<@assetIdOrName2>:...`
  * unitOfMeasure=`<unitId>` (optional)
    * defaults to unit of item state presentation or default unit of measurement for the Number:* item types listed below:
      * Number:Angle [`Angle.Degrees`]
      * Number:Length [`Distance.Meters` (SI); `Distance.Inches` (US)]
      * Number:Temperature [`Temperature.Celsius` (SI); `Temperature.Fahrenheit` (US)]
  * language=`<code>`
    * two letter language code [`de`, `en`, `es`, `fr`, `hi`, `it`, `ja`, `pt`]
    * defaults to your server [regional settings](#regional-settings), if defined, otherwise `en`
  * actionMappings=`<mappings>`
    * each mapping formatted as, based on action type:
      * set => `<action>=<value>`
      * adjust => `<action>=(<deltaValue>)`
  * stateMappings=`<mappings>`
    * each mapping formatted as, based on state type:
      * range => `<state>=<minValue>:<maxValue>`
      * value => `<state>=<value>`
* Default category: OTHER

#### `ToggleController.toggleState`
* Items that represent components of a device that can be turned on or off. Multiple instances can be configured in a group endpoint. By default, to ask for a specific range, the item label will be used as the friendly name. To configure it, use `friendlyNames` parameter and provide a comma delimited list of different labels (Keep in mind that some names are [not allowed](#friendly-names-not-allowed)). Additionally, pre-defined [asset ids](#asset-catalog) can be used to label a mode as well with an @ sign prefix (e.g. `friendlyNames="@Setting.Oscillate,Rotate"`). If the component isn't controllable through openHAB, set parameter `nonControllable=true`, that way only status requests will be processed. For text-based name language support, your server [regional settings](#regional-settings) should be setup, otherwise, you can optionally set the language in parameter `language="en"`. For [semantic extensions](#semantic-extensions) support, set actions in parameter `actionMappings="Close=OFF,Open=ON"` and states in parameter `stateMappings="Closed=OFF,Open=ON"`. Actions and states values must be set to either `ON` or `OFF`.
* Supported item type:
  * Color
  * Dimmer
  * Switch
* Supported metadata parameters:
  * friendlyNames=`<names>`
    * each name formatted as `<@assetIdOrName>`
    * defaults to item label name
  * nonControllable=`<boolean>`
    * defaults to false
  * language=`<code>`
    * two letter language code [`de`, `en`, `es`, `fr`, `hi`, `it`, `ja`, `pt`]
    * defaults to your server [regional settings](#regional-settings), if defined, otherwise `en`
  * actionMappings=`<mappings>`
    * each mapping formatted as `<action>=ON` or `<action>=OFF`
  * stateMappings=`<mappings>`
    * each mapping formatted as `<state>=ON` or `<state>=OFF`
* Default category: OTHER

### Supported Group Metadata
* Functional groups (no group type) can be labelled with one of Alexa [display categories](#display-categories). It can be set using one of the two formats: `Endpoint.<category>` or `<category>` (e.g `{alexa="Endpoint.Thermostat"}` or `{alexa="Thermostat"}`).
* Display categories with underscores can be defined in camel cased format (e.g. `{alexa="Endpoint.SecurityPanel"}` => `SECURITY_PANEL`).
* Child item categories are ignored and only the group category is used to represent the endpoint.
* Case is ignored on the category part of the metadata and any value will be made all uppercase before its passed to the Alexa API.

### Supported Metadata Labels
Item metadata labels translate to a set of capabilities and can be used as a convenience to using the longer meta data format configuration.  These add additional functions and provide the ability to add customization through additional parameters which take precedence over the default ones. Here are some examples:
```
Switch TelevisionPower "Television Power" {alexa="Switchable" [category="TV"]}

Color LightColor "Light Color" {alexa="Lighting"}
```

Here are the labels currently supported and what they translate to. Each example shows using the meta data label and the full translated metadata.

#### Switchable
_(capabilities depending on item type)_
```
Switch DeviceSwitch "Device Switch" {alexa="Switchable"}
Rollershutter ShutterSwitch "Shutter Switch" {alexa="Switchable"}

Switch DeviceSwitch "Device Switch" {alexa="PowerController.powerState" [category="SWITCH"]}
Rollershutter ShutterSwitch "Shutter Switch" {alexa="PercentageController.percentage" [category="SWITCH"]}
```
#### Lighting
_(capabilities depending on item type)_
```
Dimmer LightDimmer "Light Dimmer" {alexa="Lighting"}
Color LightColor "Light Color" {alexa="Lighting"}

Dimmer LightDimmer "Light Dimmer" {alexa="PowerController.powerState,BrightnessController.brightness" [category="LIGHT"]}
Color LightColor "Light Color" {alexa="PowerController.powerState,BrightnessController.brightness,ColorController.color" [category="LIGHT"]}
```
#### Blind
```
Rollershutter Blind "Blind" {alexa="Blind"}

Rollershutter Blind "Blind" {alexa="RangeController.rangeValue" [category="INTERIOR_BLIND", friendlyNames="@Setting.Opening", supportedRange="0:100:10", unitOfMeasure="Percent", actionMappings="Close=0,Open=100,Lower=(-10),Raise=(+10)", stateMappings="Closed=0,Open=1:100"]}
```
#### Door
```
Switch Door "Door" {alexa="Door"}

Switch Door "Door" {alexa="ToggleController.toggleState" [category="DOOR", friendlyNames="@Setting.Opening", actionMappings="Close=OFF,Open=ON", stateMappings="Closed=OFF,Open=ON"]}
```
#### Lock
```
Switch DoorLock "Door Lock" {alexa="Lock"}

Switch DoorLock "Door Lock" {alexa="LockController.lockState"}
```
#### Outlet
```
Switch OutletPlug "Outlet Plug" {alexa="Outlet"}

Switch OutletPlug "Outlet Plug" {alexa="PowerController.powerState" [category="SMARTPLUG"]}
```
#### CurrentHumidity
```
Number CurrentHumidity "Current Humidity" {alexa="CurrentHumidity"}

Number CurrentHumidity "Current Humidity" {alexa="RangeController.rangeValue" [friendlyNames="@Setting.Humidity", nonControllable=true, supportedRange="0:100:1", unitOfMeasure="Percent"]}
```
#### CurrentTemperature
```
Number CurrentTemperature "Current Temperature" {alexa="CurrentTemperature"}

Number CurrentTemperature "Current Temperature" {alexa="TemperatureSensor.temperature" [scale="Celsius"]}
```
#### TargetTemperature
```
Number TargetTemperature "Target Temperature" {alexa="TargetTemperature"}

Number TargetTemperature "Target Temperature" {alexa="ThermostatController.targetSetpoint" [scale="Celsius"]}
```
#### LowerTemperature
```
Number LowerTemperature "Lower Temperature" {alexa="LowerTemperature"}

Number LowerTemperature "Lower Temperature" {alexa="ThermostatController.lowerSetpoint" [scale="Celsius"]}
```
#### UpperTemperature
```
Number UpperTemperature "Upper Temperature" {alexa="UpperTemperature"}

Number UpperTemperature "Upper Temperature" {alexa="ThermostatController.upperSetpoint" [scale="Celsius"]}
```
#### HeatingCoolingMode
```
String HeatingCoolingMode "Thermostat Mode" {alexa="HeatingCoolingMode"}

String HeatingCoolingMode "Thermostat Mode" {alexa="ThermostatController.thermostatMode"}
```
#### ColorTemperature
```
Dimmer ColorTemperature "Color Temperature" {alexa="ColorTemperature"}

Dimmer ColorTemperature "Color Temperature" {alexa="ColorTemperatureController.colorTemperatureInKelvin"}
```
#### Activity
```
Switch Activity "Activity" {alexa="Activity"}

Switch Activity "Activity" {alexa="SceneController.scene" [category="ACTIVITY_TRIGGER"]}
```
#### Scene
```
Switch Scene "Scene" {alexa="Scene"}

Switch Scene "Scene" {alexa="SceneController.scene" [category="SCENE_TRIGGER"]}
```
#### EntertainmentChannel
```
String EntertainmentChannel "Entertainment Channel" {alexa="EntertainmentChannel"}

String EntertainmentChannel "Entertainment Channel" {alexa="ChannelController.channel"}
```
#### EntertainmentInput
```
String EntertainmentInput "Entertainment Input" {alexa="EntertainmentInput"}

String EntertainmentInput "Entertainment Input" {alexa="InputController.input"}
```
#### EqualizerBass
```
Number EqualizerBass "Equalizer Bass" {alexa="EqualizerBass"}

Number EqualizerBass "Equalizer Bass" {alexa="EqualizerController.bands:bass}
```
#### EqualizerMidrange
```
Number EqualizerMidrange "Equalizer Midrange" {alexa="EqualizerMidrange"}

Number EqualizerMidrange "Equalizer Midrange" {alexa="EqualizerController.bands:midrange"}
```
#### EqualizerTreble
```
Number EqualizerTreble "Equalizer Treble" {alexa="EqualizerTreble"}

Number EqualizerTreble "Equalizer Treble" {alexa="EqualizerController.bands:treble"}
```
#### EqualizerMode
```
String EqualizerMode "Equalizer Mode" {alexa="EqualizerMode"}

String EqualizerMode "Equalizer Mode" {alexa="EqualizerController.mode"}
```
#### MediaPlayer
```
Player MediaPlayer "Media Player" {alexa="MediaPlayer"}

Player MediaPlayer "Media Player" {alexa="PlaybackController.playback"}
```
#### SpeakerMute
```
Switch SpeakerMute "Speaker Mute" {alexa="SpeakerMute"}

Switch SpeakerMute "Speaker Mute" {alexa="Speaker.muted"}
```
#### SpeakerVolume
```
Number SpeakerVolume "Speaker Volume" {alexa="SpeakerVolume"}

Number SpeakerVolume "Speaker Volume" {alexa="Speaker.volume"}
```
#### ContactSensor
```
Contact ContactSensor "Contact Sensor" {alexa="ContactSensor"}

Contact ContactSensor "Contact Sensor" {alexa="ContactSensor.detectionState"}
```
#### MotionSensor
```
Contact MotionSensor "Motion Sensor" {alexa="MotionSensor"}

Contact MotionSensor "Motion Sensor" {alexa="MotionSensor.detectionState"}
```
#### SecurityAlarmMode
```
String SecurityAlarmMode "Security Alarm Mode" {alexa="SecurityAlarmMode"}

String SecurityAlarmMode "Security Alarm Mode" {alexa="SecurityPanelController.armState"}
```
#### BurglaryAlarm
```
Contact BurglaryAlarm "Burglary Alarm" {alexa="BurglaryAlarm"}

Contact BurglaryAlarm "Burglary Alarm" {alexa="SecurityPanelController.burglaryAlarm"}
```
#### FireAlarm
```
Contact FireAlarm "Fire Alarm" {alexa="FireAlarm"}

Contact FireAlarm "Fire Alarm" {alexa="SecurityPanelController.fireAlarm"}
```
#### CarbonMonoxideAlarm
```
Contact CarbonMonoxideAlarm "Carbon Monoxide Alarm" {alexa="CarbonMonoxideAlarm"}

Contact CarbonMonoxideAlarm "Carbon Monoxide Alarm" {alexa="SecurityPanelController.carbonMonoxideAlarm"}
```
#### WaterAlarm
```
Contact WaterAlarm "Water Alarm" {alexa="WaterAlarm"}

Contact WaterAlarm "Water Alarm" {alexa="SecurityPanelController.waterAlarm"}
```
#### ModeComponent
```
String ModeComponent "Mode Component" {alexa="ModeComponent"}

String ModeComponent "Mode Component" {alexa="ModeController.mode"}
```
#### RangeComponent
```
Number RangeComponent "Range Component" {alexa="RangeComponent"}

Number RangeComponent "Range Component" {alexa="RangeController.rangeValue"}
```
#### ToggleComponent
```
Switch ToggleComponent "Toggle Component" {alexa="ToggleComponent"}

Switch ToggleComponent "Toggle Component" {alexa="ToggleController.toggleState"}
```

### Regional Availability
  * The availability of a given capability depends on the location setting of your Amazon account under which your echo devices are registered to. Here is the latest list of interface capabilities and their supported locales from [Alexa Skill API](https://developer.amazon.com/docs/device-apis/list-of-interfaces.html):

| Interfaces | AUS | CAN | DEU | ESP | FRA | GBR | IND | ITA | JPN | USA |
| ---------- | :-: | :-: | :-: | :-: | :-: | :-: | :-: | :-: | :-: | :-: |
| BrightnessController | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: |
| ChannelController | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :x: | :x: | :heavy_check_mark: | :heavy_check_mark: | :x: | :x: | :heavy_check_mark: |
| ColorController | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: |
| ColorTemperatureController | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: |
| ContactSensor | :x: | :heavy_check_mark: | :x: | :x: | :x: | :x: | :x: | :x: | :x: | :heavy_check_mark: |
| EqualizerController | :x: | :x: | :x: | :x: | :x: | :x: | :x: | :x: | :x: | :heavy_check_mark: |
| InputController | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :x: | :x: | :heavy_check_mark: | :heavy_check_mark: | :x: | :x: | :heavy_check_mark: |
| LockController (lock) | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :x: | :heavy_check_mark: | :x: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: |
| LockController (unlock) | :x: | :x: | :heavy_check_mark: | :x: | :x: | :x: | :x: | :x: | :heavy_check_mark: | :heavy_check_mark: |
| ModeController | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: |
| MotionSensor | :x: | :heavy_check_mark: | :x: | :x: | :x: | :x: | :x: | :x: | :x: | :heavy_check_mark: |
| PercentageController | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: |
| PlaybackController | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :x: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :x: | :x: | :heavy_check_mark: |
| PowerController | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: |
| PowerLevelController | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: |
| RangeController | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: |
| SceneController | :x: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :x: | :heavy_check_mark: | :heavy_check_mark: |
| SecurityPanelController | :heavy_check_mark: | :heavy_check_mark: | :x: | :x: | :x: | :x: | :heavy_check_mark: | :x: | :x: | :heavy_check_mark: |
| Speaker | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :x: | :x: | :heavy_check_mark: | :heavy_check_mark: | :x: | :x: | :heavy_check_mark: |
| StepSpeaker | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :x: | :x: | :heavy_check_mark: | :heavy_check_mark: | :x: | :x: | :heavy_check_mark: |
| TemperatureSensor | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: |
| ThermostatController | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: |
| ToggleController | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: |

### Display Categories
  * Alexa has certain categories that effect how voice control and their mobile/web UI's display or control endpoints.  An example of this is when you create "Smart Device Groups" in the Alex app and associate a specific Echo or Dot to that Group (typically a room).  When a user asks to turn the lights ON, Alexa looks for devices in that group that have the category "LIGHT" to send the command to.  
  * You can override this default value on items by adding it as a parameter to the metadata (e.g. `Switch LightSwitch "Light Switch" {alexa="PowerController.powerState" [category="OTHER"]}`).
  * List of Alexa categories currently supported from [Alexa Skill API](https://developer.amazon.com/docs/device-apis/alexa-discovery.html#display-categories) docs:

Category | Description
---------|------------
ACTIVITY_TRIGGER | A combination of devices set to a specific state. Use activity triggers for scenes when the state changes must occur in a specific order. For example, for a scene named "watch Netflix" you might power on the TV first, and then set the input to HDMI1.
CAMERA | A media device with video or photo functionality.
COMPUTER | A non-mobile computer, such as a desktop computer.
CONTACT_SENSOR | An endpoint that detects and reports changes in contact between two surfaces.
DOOR | A door.
DOORBELL | A doorbell.
EXTERIOR_BLIND | A window covering on the outside of a structure.
FAN | A fan.
GAME_CONSOLE | A game console, such as Microsoft Xbox or Nintendo Switch
GARAGE_DOOR | A garage door. Garage doors must implement the [ModeController](#modecontroller-mode) interface to open and close the door.
INTERIOR_BLIND | A window covering on the inside of a structure.
LAPTOP | A laptop or other mobile computer.
LIGHT | A light source or fixture.
MICROWAVE | A microwave oven.
MOBILE_PHONE | A mobile phone.
MOTION_SENSOR | An endpoint that detects and reports movement in an area.
MUSIC_SYSTEM | A network-connected music system.
NETWORK_HARDWARE | A network router.
OTHER | An endpoint that doesn't belong to one of the other categories.
OVEN | An oven cooking appliance.
PHONE | A non-mobile phone, such as landline or an IP phone.
SCENE_TRIGGER | A combination of devices set to a specific state. Use scene triggers for scenes when the order of the state change is not important. For example, for a scene named "bedtime" you might turn off the lights and lower the thermostat, in any order.
SCREEN | A projector screen.
SECURITY_PANEL | A security panel.
SMARTLOCK | An endpoint that locks.
SMARTPLUG | A module that is plugged into an existing electrical outlet, and then has a device plugged into it. For example, a user can plug a smart plug into an outlet, and then plug a lamp into the smart plug. A smart plug can control a variety of devices.
SPEAKER | A speaker or speaker system.
STREAMING_DEVICE | A streaming device such as Apple TV, Chromecast, or Roku.
SWITCH | A switch wired directly to the electrical system. A switch can control a variety of devices.
TABLET | A tablet computer.
TEMPERATURE_SENSOR | An endpoint that reports temperature, but does not control it. The temperature data of the endpoint is not shown in the Alexa app.
THERMOSTAT | An endpoint that controls temperature, stand-alone air conditioners, or heaters with direct temperature control.
TV | A television.
WEARABLE | A network-connected wearable device, such as an Apple Watch, Fitbit, or Samsung Gear.

### Asset Catalog
  * List of Alexa asset catalog from [Alexa Skill API](https://developer.amazon.com/docs/device-apis/resources-and-assets.html#global-alexa-catalog) docs:

Asset Identifier | Supported Friendly Names
-----------------|-------------------------
DeviceName.AirPurifier | Air Purifier<br>Air Cleaner<br>Clean Air Machine
DeviceName.Fan | Fan<br>Blower
DeviceName.Router | Router<br>Internet Router<br>Network Router<br>Wifi Router<br>Net Router
DeviceName.Shade | Shade<br>Blind<br>Curtain<br>Roller<br>Shutter<br>Drape<br>Awning<br>Window shade<br>Interior blind
DeviceName.Shower | Shower
DeviceName.SpaceHeater | Space Heater<br>Portable Heater
DeviceName.Washer | Washer<br>Washing Machine
Setting.2GGuestWiFi | 2.4G Guest Wi-Fi<br>2.4G Guest Network<br>Guest Network 2.4G<br>2G Guest Wifi
Setting.5GGuestWiFi | 5G Guest Wi-Fi<br>5G Guest Network<br>Guest Network 5G<br>5G Guest Wifi
Setting.Auto | Auto<br>Automatic<br>Automatic Mode<br>Auto Mode
Setting.Direction | Direction
Setting.DryCycle | Dry Cycle<br>Dry Preset<br>Dry Setting<br>Dryer Cycle<br>Dryer Preset<br>Dryer Setting
Setting.FanSpeed | Fan Speed<br>Airflow speed<br>Wind Speed<br>Air speed<br>Air velocity
Setting.GuestWiFi | Guest Wi-fi<br>Guest Network<br>Guest Net
Setting.Heat | Heat
Setting.Mode | Mode
Setting.Night | Night<br>Night Mode
Setting.Opening | Opening<br>Height<br>Lift<br>Width
Setting.Oscillate | Oscillate<br>Swivel<br>Oscillation<br>Spin<br>Back and forth
Setting.Preset | Preset<br>Setting
Setting.Quiet | Quiet<br>Quiet Mode<br>Noiseless<br>Silent
Setting.Temperature | Temperature<br>Temp
Setting.WashCycle | Wash Cycle<br>Wash Preset<br>Wash setting
Setting.WaterTemperature | Water Temperature<br>Water Temp<br>Water Heat
Shower.HandHeld | Handheld Shower<br>Shower Wand<br>Hand Shower
Shower.RainHead | Rain Head<br>Overhead shower<br>Rain Shower<br>Rain Spout<br>Rain Faucet
Value.Close | Close
Value.Delicate | Delicates<br>Delicate
Value.High | High
Value.Low | Low
Value.Maximum | Maximum<br>Max
Value.Medium | Medium<br>Mid
Value.Minimum | Minimum<br>Min
Value.Open | Open
Value.QuickWash | Quick Wash<br>Fast Wash<br>Wash Quickly<br>Speed Wash

  * List of custom asset catalog defined by skill:

Asset Identifier | Supported Friendly Names
-----------------|-------------------------
Setting.Humidity | Humidity

### Semantic Catalog
  * List of Alexa semantic catalog from [Alexa Skill API](https://developer.amazon.com/docs/device-apis/alexa-discovery.html#semantics-object) docs:

Semantic Type | Identifiers
--------------|------------
Actions | Close<br>Open<br>Lower<br>Raise
States | Closed<br>Open

### Unit of Measurement Catalog
  * List of Alexa unit of measurement catalog from [Alexa Skill API](https://developer.amazon.com/docs/device-apis/alexa-property-schemas.html#units-of-measure) docs:

Unit Identifier |
----------------|
Angle.Degrees |
Angle.Radians |
Distance.Yards |
Distance.Inches |
Distance.Meters |
Distance.Feet |
Distance.Miles |
Distance.Kilometers |
Mass.Kilograms |
Mass.Grams |
Percent |
Temperature.Degrees |
Temperature.Celsius |
Temperature.Fahrenheit |
Temperature.Kelvin |
Volume.Gallons |
Volume.Pints |
Volume.Quarts |
Volume.Liters |
Volume.CubicMeters |
Volume.CubicFeet |
Weight.Pounds |
Weight.Ounces |

### Friendly Names Not Allowed
  * List of Alexa friendly names that cannot be used from [Alexa Skill API](https://developer.amazon.com/docs/device-apis/resources-and-assets.html#names-you-cannot-use) docs:

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

## Item Tag v2 Support

Version 2 (v2) of the Alexa skill used openHAB [HomeKit](https://www.openhab.org/addons/integrations/homekit/#item-configuration) style tags to expose items to Alexa.
Version 3 (v3) of the skill supports this by translating v2 style tags to v3 [metadata labels](#supported-metadata-labels) internally.  These tags are still required if the items are being exposed to the [HomeKit](https://www.openhab.org/addons/integrations/homekit/#item-configuration) or [Google Assistant](https://www.openhab.org/docs/ecosystem/google-assistant/#item-configuration) integrations.  Below is the translation of v2 tags to v3 labels.

### Supported v2 Item Tags

| v2 Item Tag | v3 Metadata Label |
|-------------|-------------------|
| Lighting | Lighting |
| Switchable | Switchable |
| ContactSensor | ContactSensor |
| CurrentTemperature | CurrentTemperature |
| CurrentHumidity | CurrentHumidity |
| Thermostat | Thermostat |
| └ CurrentTemperature | CurrentTemperature |
| └ homekit:HeatingCoolingMode | HeatingCoolingMode |
| └ homekit:TargetHeatingCoolingMode | HeatingCoolingMode |
| └ homekit:TargetTemperature | TargetTemperature |
| └ TargetTemperature | TargetTemperature |
| WindowCovering | Blind |

### Example v2 Items
```
Switch KitchenLights "Kitchen Lights" <light> (gKitchen) [ "Lighting" ]
Dimmer BedroomLights "Bedroom Lights" <light> (gBedroom) [ "Lighting" ]
Number BedroomTemperature "Bedroom Temperature" (gBedroom) [ "CurrentTemperature" ]
Group gDownstairsThermostat "Downstairs Thermostat" (gFF) [ "Thermostat" ]
Number DownstairsThermostatCurrentTemp "Downstairs Thermostat Current Temperature" (gDownstairsThermostat) [ "CurrentTemperature" ]
Number DownstairsThermostatTargetTemperature "Downstairs Thermostat Target Temperature" (gDownstairsThermostat) [ "TargetTemperature" ]
String DownstairsThermostatHeatingCoolingMode "Downstairs Thermostat Heating/Cooling Mode" (gDownstairsThermostat) [ "homekit:HeatingCoolingMode" ]
```

# Troubleshooting

Here are some of the most common generic errors you may encounter while using this skill:

### Command Not Working
* Alexa will respond with "That command doesn't work on _device_"
* It indicates that the command that Alexa is trying to send to openHAB doesn't work, either because the intended device is not configured properly to support that command or because your openHAB items configuration has changed and a previously discovered item may longer accept certain commands. For example, a dimmer item type that was initially setup and was changed to a switch type, will cause Alexa brightness control commands to fail.
* To resolve this error, make sure to update your openHAB items configuration accordingly and run a discovery update either through the Alexa app or just by asking "Alexa, discover" on your echo device.

### Device Not Found
* Alexa will respond with "I couldn't find a device or group named _device_ in your profile"
* It indicates that, either a device currently setup in your Alexa account, no longer exists in your openHAB server, or vice-versa.
* To resolve this error, make sure to run a discovery update either through the Alexa app or just by asking "Alexa, discover" on your echo device. Keep in mind that previously discovered devices that have been removed from the openHAB configuration will show as offline under your Alexa account and not be automatically removed. To prevent potential device name conflicts, it is highly recommended to remove these devices through the Alexa app.
* If all your Alexa-enabled devices in openHAB aren't discovered or getting updated:
  * Check that your [server is available](#server-not-accessible).
  * Look for any relevant errors in your openHAB server logs.
  * If only new devices aren't found, make sure your last Alexa-related config changes are valid.
  * If necessary, stagger the discovery process by adding a couple devices at a time to isolate the culprit.

### Device Not Responding
* Alexa will respond with "_device_ isn't responding, please check its network connection and power supply", and in some rare occasions, no response or acknowledgement will be given.
* It indicates that the state of one or more of the endpoint properties retrieved from the openHAB server are considered invalid, mostly because it is in either uninitialized `NULL` or undefined `UNDEF` state.
* To resolve this error, make sure that all items interfacing with Alexa have a defined state. If necessary, use [item sensors](#item-sensor), or if the state is not available in openHAB, set the [item state](#item-state) to not be retrievable.
* For group endpoints, partial properties responses will be send back to Alexa excluding items with invalid state. This will allow Alexa to acknowledge a command request assuming that the relevant item state is accurate. However, it will cause Alexa to generate this error when requesting the status of a device configured with an interface supporting that feature. For example, using a thermostat group endpoint, a request to set its mode will succeed but requesting its mode status will fail if one of its property state, such as its temperature sensor, is not defined in openHAB.
* This is the default error.

### Duplicate Device Names
* Alexa will respond with "A few things share the name _device_, which one did you want?"
* It indicates that more than one device on your Alexa account matches the device name requested.
* To resolve this error, make sure that all the [item labels](#item-labels) related to your Alexa-enabled items are unique. Additionally, check your Alexa account for discovered devices from other skills or local integrations (e.g. Philips Hue bridge), that may have overlapping names.

### Request Not Supported
* Alexa will respond with "_device_ doesn't support that"
* It indicates that a requested command is not supported by any of the device configured interfaces.
* To resolve this error, make sure that the relevant interfaces are configured properly on the given device. If this is the case, the response implies a limitation on the Alexa side. This will happen for a device with specific interfaces that don't support certain voice requests as of yet, such as the state of a PowerController or BrightnessController interface.

### Server Authentication Issue
* Alexa will respond with "Sorry something wrong, to control _device_ try disabling the skill and re-enabling it from your Alexa app"
* It indicates that Alexa isn't able to control the given device because of an authentication issue.
* To resolve this error, for users that are using the official skill, just disable and re-enable it through the Alexa app. For users that have setup their own custom skill, make sure that the proper credentials were added to the lambda function config.js.

### Server Not Accessible
* Alexa will respond with "Sorry the hub that _device_ is connected to is not responding, please check its network connection and power supply"
* It indicates that your openHAB server is not accessible through [myopenHAB](https://myopenhab.org) cloud service.
* To resolve this error, make sure that your server is running, your openHAB cloud service is configured with mode set to "Notifications & Remote Access", and showing online under your myopenHAB account. For users that have setup their own custom skill, make sure that the proper server base URL was added to the lambda function config.js.
* For users running openHAB 2.4, there is a known issue when running the [Amazon Echo Control](https://www.openhab.org/addons/bindings/amazonechocontrol/) binding, associated to that release, that affects the server accessibility. The workaround is to use the latest stable [release candidate](https://community.openhab.org/t/release-candidate-and-support-amazon-echo-control-binding/37844) version of that binding instead.

### Temperature Out Of Range
* Alexa will respond with "I can only set the temperature between _minValue_ and _maxValue_"
* It indicates that a requested target temperature is out of range, based on the [target](#thermostatcontroller-targetsetpoint), [upper](#thermostatcontroller-uppersetpoint), or [lower](#thermostatcontroller-lowersetpoint) setpoint default range values.
* To resolve this error, add the metadata parameter `setpointRange="<minValue>:<maxValue>"` on your relevant thermostat setpoint items to customize your range values and run a discovery update either through the Alexa app or just by asking "Alexa, discover" on your echo device.

# Example Voice Commands

Here are some example voice commands:

 * Alexa turn on Office Lights
 * Alexa turn off Pool Waterfall
 * Alexa turn on House Fan
 * Alexa turn on Home Theater Scene
 * Alexa dim Kitchen Lights to 30 percent
 * Alexa set house temperature to 70 degrees

# Other openHAB Alexa Integrations

openHAB has two other Alexa integrations that can be used in conjunction with or independently of this skill.

### Amazon Echo Control Binding

Control Amazon Echo devices from your openHAB.  This allows openHAB to send commands to a echo device and control its ability to play music, set alarms, change the volume and use it a Text-To-Speech output device. See the [Amazon Echo Control Binding](https://www.openhab.org/addons/bindings/amazonechocontrol/) for more information..

### Hue Emulation Service

Hue Emulation exposes openHAB items as Hue devices to other Hue HTTP API compatible applications like an Amazon Echo, Google Home or any Hue compatible application. This is done on the local network and does not require the cloud service. See the [Hue Emulation Service](https://www.openhab.org/addons/integrations/hueemulation/) for more information.
