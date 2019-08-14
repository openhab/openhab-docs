# Amazon Alexa Smart Home Skill

<img align="right" width="150px" src="https://images-na.ssl-images-amazon.com/images/I/51-cpfTnBzL._SL210_QL95_BG0,0,0,0_FMpng_.png">

Alexa is an intelligent personal assistant developed by Amazon and designed to run on smart speakers and devices such as the Amazon Echo and Dot.

This certified Amazon Smart Home Skill allows users to control their openHAB powered smart home with natural voice commands.  Lights, locks, thermostats, AV devices, sensors and many other device types can be controlled through a user's Alexa powered device like the Echo or Dot.

This page describes how to use the [openHAB Alexa Smart Home Skill](https://www.amazon.com/openHAB-Foundation/dp/B01MTY7Z5L).
The skill connects your openHAB setup through the [myopenHAB.org](http://myopenHAB.org) cloud service to Amazon Alexa.

## Table of Contents
* [Requirements](#requirements)
* [Troubleshooting](#troubleshooting)
  * [Command Not Working](#command-not-working)
  * [Device Not Found](#device-not-found)
  * [Device Not Responding](#device-not-responding)
  * [Server Authentication Issue](#server-authentication-issue)
  * [Server Not Accessible](#server-not-accessible)
* [Setup](#setup)
  * [Item Label Recommendation](#item-label-recommendation)
  * [Item Configuration](#item-configuration)
    * [Single items](#single-items)
    * [Group Items](#group-items)
    * [Item Sensor](#item-sensor)
    * [Item State](#item-state)
    * [Item Unit of Measurement](#item-unit-of-measurement)
    * [Supported Item Metadata](#supported-item-metadata)
      * [Regional Availability](#regional-availability)
      * [Display Categories](#display-categories)
      * [Asset Catalog](#asset-catalog)
      * [Friendly Names Not Allowed](#friendly-names-not-allowed)
      * [Unit of Measurement Catalog](#unit-of-measurement-catalog)
    * [Supported Group Metadata](#supported-group-metadata)
    * [Supported Metadata Labels](#supported-metadata-labels)
  *  [Item Tag v2 Support](#item-tag-v2-support)
* [Example Voice Commands](#example-voice-commands)
* [Other openHAB Alexa Integrations](#other-openhab-alexa-integrations)
  * [Amazon Echo Control Binding](#amazon-echo-control-binding)
  * [Hue Emulation Service](#hue-emulation-service)

## Requirements

* [openHAB Cloud Connector](http://docs.openhab.org/addons/ios/openhabcloud/readme.html) configured using myopenHAB.org
* Amazon account
* Amazon Echo, Amazon Echo Dot or compatible Alexa device

## Troubleshooting

Here are some of the most common generic errors you may encounter while using this skill:

#### Command Not Working
* Alexa will respond with "That command doesn't work on _device_"
* It indicates that the command that Alexa is trying to send to openHAB doesn't work, either because the intended device is not configured properly to support that command or because your openHAB items configuration has changed and a previously discovered item may longer accept certain commands. For example, a dimmer item type that was initially setup and was changed to a switch type, will cause Alexa brightness control commands to fail.
* To resolve this error, make sure to update your openHAB items configuration accordingly and run a discovery update either through the Alexa app or just by asking "Alexa, discover" on your echo device.

#### Device Not Found
* Alexa will respond with "I couldn't find a device or group named _device_ in your profile"
* It indicates that, either a device currently setup in your Alexa account, no longer exists in your openHAB server, or vice-versa.
* To resolve this error, make sure to run a discovery update either through the Alexa app or just by asking "Alexa, discover" on your echo device. Keep in mind that previously discovered devices that have been removed from the openHAB configuration will show as offline under your Alexa account and not be automatically removed. To prevent potential device name conflicts, it is highly recommended to remove these devices through the Alexa app.

#### Device Not Responding
* Alexa will respond with "_device_ isn't responding, please check its network connection and power supply", and in some rare occasions, no response or acknowledgement will be given.
* It indicates that the state of one or more of the endpoint properties retrieved from the openHAB server are considered invalid, mostly because it is in either uninitialized `NULL` or undefined `UNDEF` state.
* To resolve this error, make sure that all items interfacing with Alexa have a defined state.
* For group endpoints, partial properties responses will be send back to Alexa excluding items with invalid state. This will allow Alexa to acknowledge a command request assuming that the relevant item state is accurate. However, it will cause Alexa to generate this error when requesting the status of a device configured with an interface supporting that feature. For example, using a thermostat group endpoint, a request to set its mode will succeed but requesting its mode status will fail if one of its property state, such as its temperature sensor, is not defined in openHAB.
* This is the default error.

#### Server Authentication Issue
* Alexa will respond with "Sorry something wrong, to control _device_ try disabling the skill and re-enabling it from your Alexa app"
* It indicates that Alexa isn't able to control the given device because of an authentication issue.
* To resolve this error, for users that are using the official skill, just disable and re-enable it through the Alexa app. For users that have setup their own custom skill, make sure that the proper credentials were added to the lambda function config.js.

#### Server Not Accessible
* Alexa will respond with "Sorry the hub that _device_ is connected to is not responding, please check its network connection and power supply"
* It indicates that your openHAB server is not accessible through [myopenHAB](https://myopenhab.org) cloud service.
* To resolve this error, make sure that your server is running and showing online under your myopenHAB account. For users that have setup their own custom skill, make sure that the proper server base URL was added to the lambda function config.js.

## Setup

* NEW Alexa Version 3 API syntax (v3)
  * Version 3 of the Alex Skill API introduces a more rich and complex set of features that required a change in how items are configured by using the new metadata feature introduced in openaHAB 2.3
  * Version 2 tags are still supported and are converted internally to v3 meta data
  * Supported [item](#supported-item-metadata) & [group](#supported-group-metadata) v3 meta data
  * Automatically determine number precision and unit based on [item state presentation](#item-state) and [unit of measurement](#item-unit-of-measurement).
  * Decoupling between item receiving command and item state via an [item sensor](#item-sensor)
  * Improved Alexa response state accuracy

### Item Label Recommendation

Matching of voice commands to Items happens based on the Item label (e.g. "Kitchen Light"). It is therefore advisable, to choose labels that can be used to form natural commands. As an example, compare "Alexa, turn on the Kitchen Light" vs. "Alexa, turn on the Ground Floor LEDs Kitchen".

### Item Configuration

The Alexa skill API uses the concept of "endpoints".  Endpoints are addressable entities that expose functionality in the form of capability interfaces.  An example endpoint may be a light switch, which has a single capability called power state (ON/OFF).  A more complex endpoint may be a thermostat which has many capabilities to control and report temperature, setpoints, modes, etc...  It is important to note that not all the capabilities listed below are [available](#regional-availability) globally.

#### Single items
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

#### Group Items

While single mapping items works for many use cases, occasionally multiple openHAB items need to be mapped to a single endpoint in Alexa. When using a group item, keep in mind that there can only be one specific interface capability per group. If you need to have more than one instance of a given capability, you should use the Mode, Range and Toggle controllers that are described at the end of this section.

For this example we will use various use cases, a thermostat, a stereo, a security system, a washer and a fan.

In openHAB a thermostat is modeled as many different items, typically there are items for setpoints (target, heat, cool), modes, and the current temperature. To map these items to a single endpoint in Alexa, we will add them to a group which also uses "Alexa" metadata. When items are Alexa-enabled, but are also a member of a group Alexa-enabled, they will be added to the group endpoint and not exposed as their own endpoints.

```
Group  Thermostat    "Bedroom"                                {alexa="Endpoint.Thermostat"}
Number Temperature   "Temperature [%.0f F]"    (Thermostat)   {alexa="TemperatureSensor.temperature"}
Number HeatSetpoint  "Heat Setpoint [%.0f F]"  (Thermostat)   {alexa="ThermostatController.upperSetpoint"}
Number CoolSetpoint  "Cool Setpoint [%.0f F]"  (Thermostat)   {alexa="ThermostatController.lowerSetpoint"}
Number Mode          "Mode [%s]"               (Thermostat)   {alexa="ThermostatController.thermostatMode"}
```

The group metadata also describes the category for the endpoint, in this case a "Thermostat".  See the section below on supported [group metadata](#supported-group-metadata) and [categories](#display-categories) for a complete list.  In this example a single endpoint is created called "Bedroom", its various interfaces are mapped to different openHAB items.  You can ask Alexa "Set the Bedroom heat to 72" and the 'HeatSetpoint' will receive the command, likewise you can ask Alexa "What's the temperature of the Bedroom" and Alexa will query the 'Temperature' items for its value.

When mapping items, sometime we need to pass additional parameters to Alexa to set things like what scale to use (Fahrenheit) or what values our items expect for certain states (thermostat modes). These parameters can be passed in the metadata properties, if they are omitted, then reasonable defaults are used.  In our above example we may wish to use Fahrenheit as our temperature scale, and map the mode strings to numbers.  This would look like:

```
Group  Thermostat    "Thermostat"                             {alexa="Endpoint.Thermostat"}
Number Temperature   "Temperature [%.0f F]"    (Thermostat)   {alexa="TemperatureSensor.temperature" [scale="Fahrenheit"]}
Number HeatSetpoint  "Heat Setpoint [%.0f F]"  (Thermostat)   {alexa="ThermostatController.upperSetpoint" [scale="Fahrenheit"]}
Number CoolSetpoint  "Cool Setpoint [%.0f F]"  (Thermostat)   {alexa="ThermostatController.lowerSetpoint" [scale="Fahrenheit"]}
Number Mode          "Mode [%s]"               (Thermostat)   {alexa="ThermostatController.thermostatMode" [OFF=0,HEAT=1,COOL=2,AUTO=3]}
```

A Stereo is another example of a single endpoint that needs many items to function properly.  Power, volume, input, speakers and player controllers are all typical use cases for a stereo that a user may wish to control.

```
Group Stereo    "Stereo"            {alexa="Endpoint.Speaker"}
Number Volume   "Volume"  (Stereo)  {alexa="Speaker.volume"}
Switch Mute     "Mute"    (Stereo)  {alexa="Speaker.muted"}
Switch Power    "Power"   (Stereo)  {alexa="PowerController.powerState"}
String Input    "Input"   (Stereo)  {alexa="InputController.input" [supportedInputs="HDMI1,TV"]}
String Channel  "Channel" (Stereo)  {alexa="ChannelController.channel"}
Player Player   "Player"  (Stereo)  {alexa="PlaybackController.playback,PlaybackStateReporter.playbackState"}
Number Bass     "Bass"    (Stereo)  {alexa="EqualizerController.bands:bass" [range="-10:10"]}
Number Midrange "Mid"     (Stereo)  {alexa="EqualizerController.bands:midrange" [range="-10:10"]}
Number Treble   "Treble"  (Stereo)  {alexa="EqualizerController.bands:treble" [range="-10:10"]}
String Mode     "Mode"    (Stereo)  {alexa="EqualizerController.modes" [supportedModes="MOVIE,MUSIC,TV"]}
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

For components of a device, which isn't covered by the existing interfaces, that have more than one setting, characterized by a number within a range or just turn on and off, the Mode, Range and Toggle controllers can be used to highly customize how you interact with that device via Alexa. Below are few examples on how these interfaces can be used. Details about to the configuration settings are listed in the next section under the relevant interface.

```
Group Washer       "Washer"               {alexa="Endpoint.Other"}
String Cycle       "Cycle"       (Washer) {alexa="ModeController.mode" [supportedModes="Normal=Normal:Cottons,Delicate=@Value.Delicate:Knites",friendlyNames="Wash Cycle,Wash Setting",ordered=false]}
Number Temperature "Temperature" (Washer) {alexa="ModeController.mode" [supportedModes="0=Cold:Cool,1=Warm,2=Hot",friendlyNames="Wash Temperature,@Setting.WaterTemperature",ordered=true]}  
Switch Power       "Power"       (Washer) {alexa="ToggleController.toggleState" [friendlyNames="@DeviceName.Washer"]}
```
```
Group Fan     "Fan"          {alexa="Endpoint.Other"}
Number Speed  "Speed"  (Fan) {alexa="RangeController.rangeValue" [supportedRange="1:10:1",presets="1=@Value.Minimum:@Value.Low:Lowest,10=@Value.Maximum:@Value.High:Highest",friendlyNames="@Setting.FanSpeed,Speed"]}
Switch Rotate "Rotate" (Fan) {alexa="ToggleController.toggleState" [friendlyNames="@Setting.Oscillate,Rotate"]}
Switch Power  "Power"  (Fan) {alexa="ToggleController.toggleState" [friendlyNames="@DeviceName.Fan"]}
```

#### Item Sensor
* When available, use a specific item (called "sensor") for property state reporting over the actionable item state.
* Design to bridge channel status items to provide improved reporting state accuracy.
* Configured by adding the `itemSensor=<itemName>` metadata parameter.
* Sensor items need to be the same type than their parent item, except for LockController capable items.

#### Item State
* Item states, reported back to Alexa, are formatted based on their [item state presentation](https://www.openhab.org/docs/configuration/items.html#state-presentation) definition if configured. This means you can control the precision of number values (e.g. `%.1f °C` will limit reported temperature value to one decimal point).

#### Item Unit of Measurement
* With the introduction of the [unit of measurement](https://www.openhab.org/docs/concepts/units-of-measurement.html) concept, the item unit can be automatically determined for thermostat and temperature using that feature, removing the need of having to set the metadata scale parameter for each of the relevant items or groups.
* Below are two examples; the scale on the first will be set to Fahrenheit based on how it is defined in the item state presentation pattern and the second one will be set based on your openHAB system regional settings (US=Fahrenheit; SI=Celsius).

```
Number:Temperature Temperature1 "Temperature [%.1f °F]" {alexa="TemperatureSensor.temperature"}
Number:Temperature Temperature2 "Temperature"           {alexa="TemperatureSensor.temperature"}
```

#### Supported Item Metadata
* The following are a list of supported metadata.
  * `PowerController.powerState`
    * Items that turn on or off such as light switches, power states, etc..
    * Supported item type:
      * Color
      * Dimmer
      * Switch
    * Default category: SWITCH
  * `BrightnessController.brightness`
    * Items which response to percentage level and brightness commands (dim, brighten, percent), typically lights.
    * Supported item type:
      * Color
      * Dimmer
    * Default category: LIGHT
  * `PowerLevelController.powerLevel`
    * Items which respond to a specific number setting
    * Supported item type:
      * Dimmer
    * Default category: SWITCH
  * `PercentageController.percentage`
    * Items which respond to percentage commands such as roller shutters.
    * Supported item type:
      * Dimmer
      * Rollershutter
    * Default category: OTHER
  * `ThermostatController.targetSetpoint`
    * Items that represent a target setpoint for a thermostat. The scale is determined based on: (1) value set in parameter `scale="Fahrenheit"`; (2) unit of measurement unit if Number:Temperature item type; (3) your openHAB server regional measurement system or region settings (US=Fahrenheit; SI=Celsius); (4) defaults to Celsius. By default, the temperature range is limited to predefined setpoint values based on the scale parameter. If necessary, the temperature range can be customized using parameter `setpointRange="60:90"`.
    * Supported item type:
      * Number(:Temperature)
    * Supported metadata parameters:
      * scale=`<scale>`
        * Celsius [10°C -> 32°C]
        * Fahrenheit [50°F -> 90°F]
      * setpointRange=`<minValue:maxValue>`
        * defaults to defined scale range listed above if omitted
    * Default category: THERMOSTAT
  * `ThermostatController.upperSetpoint`
    * Items that represent a upper or HEAT setpoint for a thermostat. The scale is determined based on: (1) value set in parameter `scale="Fahrenheit"`; (2) unit of measurement unit if Number:Temperature item type; (3) your openHAB server regional measurement system or region settings (US=Fahrenheit; SI=Celsius); (4) defaults to Celsius. By default, the temperature range is limited to predefined setpoint values based on the scale parameter. If necessary, the temperature range can be customized using parameter `setpointRange="60:90"`.
    * Supported item type:
      * Number(:Temperature)
    * Supported metadata parameters:
      * scale=`<scale>`
        * Celsius [10°C -> 32°C]
        * Fahrenheit [50°F -> 90°F]
      * comfortRange=`<number>`
        * When dual setpoints (upper, lower) are used this is the amount over the requested temperature when requesting Alexa to set or adjust the current temperature.  Defaults to comfortRange=1 if using Fahrenheit and comfortRange=.5 if using Celsius. Ignored if a targetSetpoint is included in the thermostat group.
      * setpointRange=`<minValue:maxValue>`
        * defaults to defined scale range listed above if omitted
    * Default category: THERMOSTAT
  * `ThermostatController.lowerSetpoint`
    * Items that represent a lower or COOL setpoint for a thermostat. The scale is determined based on: (1) value set in parameter `scale="Fahrenheit"`; (2) unit of measurement unit if Number:Temperature item type; (3) your openHAB server regional measurement system or region settings (US=Fahrenheit; SI=Celsius); (4) defaults to Celsius. By default, the temperature range is limited to predefined setpoint values based on the scale parameter. If necessary, the temperature range can be customized using parameter `setpointRange="60:90"`.
    * Supported item type:
      * Number(:Temperature)
    * Supported metadata parameters:
      * scale=`<scale>`
        * Celsius [10°C -> 32°C]
        * Fahrenheit [50°F -> 90°F]
      * comfortRange=`<number>`
        * When dual setpoints (upper,lower) are used this is the amount under the requested temperature when requesting Alexa to set or adjust the current temperature.  Defaults to comfortRange=1 if using Fahrenheit and comfortRange=.5 if using Celsius.  Ignored if a targetSetpoint is included in the thermostat group.
      * setpointRange=`<minValue:maxValue>`
        * defaults to defined scale range listed above if omitted
    * Default category: THERMOSTAT
  * `ThermostatController.thermostatMode`
    * Items that represent the mode for a thermostat, default string values are "OFF=off,HEAT=heat,COOL=cool,ECO=eco,AUTO=auto", but these can be mapped to other values in the metadata. The mapping can be, in order of precedence, user-defined (AUTO=3,...) or preset-based related to the thermostat binding used (binding=`<value>`). For the binding parameter, it will be automatically determined if the associated item is using a 2.x addon (via channel metadata). If neither of these settings are provided, for thermostats that only support a subset of the standard modes, a comma delimited list of the Alexa supported modes should be set using the supportedModes parameter, otherwise, the supported list will be compiled based of the default mapping.
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
        * [ecobee1](https://www.openhab.org/addons/bindings/ecobee1/) [OFF=off, HEAT=heat, COOL=cool, AUTO=auto]
        * [max](https://www.openhab.org/addons/bindings/max/) [HEAT=MANUAL, ECO=VACATION, AUTO=AUTOMATIC]
        * [nest](https://www.openhab.org/addons/bindings/nest/) [OFF=OFF, HEAT=HEAT, COOL=COOL, ECO=ECO, AUTO=HEAT_COOL]
        * [nest1](https://www.openhab.org/addons/bindings/nest1/) [OFF=off, HEAT=heat, COOL=cool, ECO=eco, AUTO=heat-cool]
        * [zwave](https://www.openhab.org/addons/bindings/zwave/) [OFF=0, HEAT=1, COOL=2, AUTO=3]
        * [zwave1](https://www.openhab.org/addons/bindings/zwave1/) [OFF=0, HEAT=1, COOL=2, AUTO=3]
        * defaults to [OFF=off, HEAT=heat, COOL=cool, ECO=eco, AUTO=auto] if omitted
      * supportedModes=`<values>`
        * defaults to, depending on the parameters provided, either user-based, preset-based or default item type-based mapping.
    * Default category: THERMOSTAT
  * `TemperatureSensor.temperature`
    * Items that represent the current temperature. The scale is determined based on: (1) value set in parameter `scale="Fahrenheit"`; (2) unit of measurement unit if Number:Temperature item type; (3) your openHAB server regional measurement system or region settings (US=Fahrenheit; SI=Celsius); (4) defaults to Celsius.
    * Supported item type:
      * Number(:Temperature)
    * Supported metadata parameters:
      * scale=`<scale>`
        * Celsius
        * Fahrenheit
    * Default category: TEMPERATURE_SENSOR
  * `LockController.lockState`
    * Items that represent the state of a lock (ON lock, OFF unlock). When associated to an [item sensor](#item-sensor), the state of that item will be returned instead of the original actionable item. Additionally, when linking to such item, multiple properties to one state can be mapped with column delimiter (e.g. for a Z-Wave lock: [LOCKED="1:3",UNLOCKED="2:4",JAMMED=11]).
    * Supported item type:
      * Switch
    * Supported sensor type:
      * Contact [LOCKED=CLOSED, UNLOCKED=OPEN]
      * Number [LOCKED=1, UNLOCKED=2, JAMMED=3]
      * String [LOCKED=locked, UNLOCKED=unlocked, JAMMED=jammed]
      * Switch [LOCKED=ON, UNLOCKED=OFF]
    * Supported metadata parameters:
      * LOCKED=`<state>`
      * UNLOCKED=`<state>`
      * JAMMED=`<state>`
      * defaults based on item sensor type if omitted
    * Default category: SMARTLOCK
  * `ColorController.color`
    * Items that represent a color
    * Supported item type:
      * Color
    * Default category: LIGHT
  * `ColorTemperatureController.colorTemperatureInKelvin`
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
  * `SceneController.scene`
    * Items that represent a scene or an activity depending on defined category and may be set not to support deactivation requests based on metadata parameters.
    * Supported item type:
      * Switch
    * Supported metadata parameters:
      * supportsDeactivation=`<boolean>`
        * true (default if omitted)
        * false
    * Default category: SCENE_TRIGGER
  * `ChannelController.channel`
    * Items that represent a channel. A channel mapping may be specified in metadata parameters allowing channel request by name.
    * Supported item type:
      * Number
      * String
    * Supported metadata parameters:
      * `<channelName1>`=`<channelNumber1>`
      * `<channelName2>`=`<channelNumber2>`
      * ...
    * Default category: TV
  * `InputController.input`
    * Items that represent a source input (e.g. "HDMI 1", or "TUNER" on a stereo). A list of [supported input values](https://developer.amazon.com/docs/device-apis/alexa-property-schemas.html#input-values) needs to be provided using the supportedInputs parameter. The space between the input name and number is not sent to OH (e.g. "HDMI 1" [alexa] => "HDMI1" [OH]). That space can also be omitted in the supported list as well.
    * Supported item type:
      * String
    * Supported metadata parameters:
      * supportedInputs=`<inputs>`
        * required list of supported input values (e.g. "HMDI1,TV,XBOX")
    * Default category: TV
  * `Speaker.volume`
    * Items that represent a volume level, default increment may be specified in metadata parameters
    * Supported item type:
      * Dimmer
      * Number
    * Supported metadata parameters:
      * increment=`<number>`
        * defaults to increment=10 (standard value provided by Alexa) if omitted.
    * Default category: SPEAKER
  * `Speaker.muted`
    * Items that represent a muted state (ON muted, OFF unmuted)
    * Supported item type:
      * Switch
    * Default category: SPEAKER
  * `StepSpeaker.volume`
    * Items that represent a volume controlled in steps only (e.g. +1, -1), such as a button on a remote control. This should only be used if the current volume level state cannot be tracked in openHAB otherwise just use `Speaker.volume`. Default increment may be specified in metadata parameters.
    * Supported item type:
      * Number
    * Supported metadata parameters:
      * increment=`<number>`
        * defaults to increment=10 (standard value provided by Alexa) if omitted.
    * Default category: SPEAKER
  * `StepSpeaker.muted`
    * Items that represent a muted state (ON muted, OFF unmuted). This should only be used if the current muted state cannot be tracked in openHAB otherwise just use `Speaker.muted`.
    * Supported item type:
      * Switch
    * Default category: SPEAKER
  * `PlaybackController.playback`
    * Items that represent the playback controls of a AV device. (Supported commands: Play, Pause, Next, Previous, Rewind, Fast Forward)
    * Supported item type:
      * Player
    * Default category: OTHER
  * `PlaybackStateReporter.playbackState`
    * Items that represent the playback state of a AV device. It should be used in combination with `PlaybackController.playback` to provide state back to Alexa.
    * Supported item type:
      * Player
    * Default category: OTHER  
  * `EqualizerController.bands:{bass,midrange,treble}`
    * Items that represent the different equalizer bands and their ranges supported by an audio system. Use specific capability component (`bass`, `midrange` or `treble`) when configuring a band (e.g. `EqualizerController.bands:bass`). Add the band range values in the `range="-10:10"` parameter. For the reset default value, provide the setting in `default=0` parameter or it will be calculated by using midpoint range spread. Additionally, default adjust increment can be configured in `increment=2` parameter. When configuring multiple bands, make sure to synchronize the range parameter across relevant items as the same range values will be used for all bands due to Alexa restriction. However, the reset and increment default values can be different between bands.
    * Supported item type:
      * Dimmer
      * Number
    * Supported metadata parameters:
      * range=`<minValue:maxValue>`
        * defaults to `[0:100]` for Dimmer and `[-10:10]` for Number item types if omitted
      * default=`<number>`
        * defaults to midpoint range spread if omitted
      * increment=`<number>`
        * defaults to increment=INCREASE/DECREASE (Dimmer) or increment=1 (Number) if omitted
    * Default category: SPEAKER
  * `EqualizerController.modes`
    * Items that represent a list of equalizer modes supported by an audio system. Set supported modes using `supportedModes="MOVIE,MUSIC,TV"` parameter. The mode listed in additional properties are the only ones supported by the Alexa API currently. For the mapping, default item type mapping (listed below) can be used or if necessary, add each state to the parameters similar to how it is done with other interfaces.
    * Supported item type:
      * Number [MOVIE=1, MUSIC=2, NIGHT=3, SPORT=4, TV=5]
      * String [MOVIE=movie, MUSIC=music, NIGHT=night, SPORT=sport, TV=tv]
    * Supported metadata parameters:
      * MOVIE=`<state>`
      * MUSIC=`<state>`
      * NIGHT=`<state>`
      * SPORT=`<state>`
      * supportedModes=`<modes>`
        * defaults to, depending on the parameters provided, either user-based or default item type-based mapping.
    * Default category: SPEAKER
  * `ContactSensor.detectionState`
    * Items that represent a contact sensor that can be used to trigger Alexa routines. (Currently not usable as proactive reporting not supported yet)
    * Supported item type:
      * Contact
      * Switch
    * Default category: CONTACT_SENSOR
  * `MotionSensor.detectionState`
    * Items that represent a motion sensor that can be used to trigger Alexa routines. (Currently not usable as proactive reporting not supported yet)
    * Supported item type:
      * Contact
      * Switch
    * Default category: MOTION_SENSOR
  * `SecurityPanelController.armState`
    * Items that represent a device that controls a security system. Set supported arm states using `supportedArmStates="DISARMED,ARMED_STAY,ARMED_AWAY"` parameter. For the mapping, default item type mapping (listed below) can be used or if necessary, add each state to the parameters similar to how it is done with other interfaces. If using a String item type, supports for pin codes (ability to have the disarm pin code verification done in openHAB) can be configured using `supportsPinCodes=true`. For system that have an exit delay, provide the delay in seconds using parameter `exitDelay=180`. If defined, the delay is provided to Alexa during arm away requests only. For the pin code, you will need to enable voice pin in the Alexa app for the relevant device. If pin codes support is set to true, disarm request will include the pin code in item command delimited by a column sign (e.g. `disarm:1234`), otherwise, the verification is done by Alexa based on the voice pin code you configured. When the pin code is attached to the item command, it is your responsibility to validate the code on the openHAB side and change the item status to UNAUTHORIZED corresponding state in order to indicate that the code is invalid. Otherwise, if no action is taken, the skill will consider the request successful. Other errors state can also be used based on the list of additional properties below. These should only be used when arm/disarm commands are received. When associated to an [item sensor](#item-sensor), the item command and state can be decoupled. Although at this time, the skill doesn't support delayed responses, so there should be no delay in updating the relevant item state.
    * Supported item type:
      * Number [DISARMED=0, ARMED_STAY=1, ARMED_AWAY=2, ARMED_NIGHT=3, NOT_READY=4, UNCLEARED_ALARM=5, UNCLEARED_TROUBLE=6, BYPASS_NEEDED=7]
      * String [DISARMED=disarm, ARMED_STAY=stay, ARMED_AWAY=away, ARMED_NIGHT=night, AUTHORIZATION_REQUIRED=authreq, UNAUTHORIZED=unauth, NOT_READY=notrdy, UNCLEARED_ALARM=alarm, UNCLEARED_TROUBLE=trouble, BYPASS_NEEDED=bypass]
      * Switch [DISARMED=OFF, ARMED_STAY=ON]
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
  * `SecurityPanelController.burglaryAlarm`
    * Items that represent the current state of the burglary alarm part of a security system
    * Supported item type:
      * Contact
      * Switch
    * Default category: SECURITY_PANEL
  * `SecurityPanelController.fireAlarm`
    * Items that represent the current state of the fire alarm part of a security system
    * Supported item type:
      * Contact
      * Switch
    * Default category: SECURITY_PANEL
  * `SecurityPanelController.carbonMonoxideAlarm`
    * Items that represent the current state of the carbon monoxide alarm part of a security system
    * Supported item type:
      * Contact
      * Switch
    * Default category: SECURITY_PANEL
  * `SecurityPanelController.waterAlarm`
    * Items that represent the current state of the water alarm part of a security system
    * Supported item type:
      * Contact
      * Switch
    * Default category: SECURITY_PANEL
  * `ModeController.mode`
    * Items that represent components of a device that have more than one setting. Multiple instances can be configured in a group endpoint. By default, to ask for a specific mode, the item label will be used as the friendly name. To configure it, use `friendlyNames` parameter and provide a comma delimited list of different labels (Keep in mind that some names are [not allowed](#friendly-names-not-allowed)). Additionally, pre-defined [asset ids](#asset-catalog) can be used to label a mode as well prefixing with an @ sign (e.g. `friendlyNames=Wash Temperature,@Setting.WaterTemperature`). In regards to supported modes and their mappings, by default if omitted, the openHAB item state description options, if defined, are used to determine these configurations. To configure it, use `supportedModes` parameter and provide a comma delimited list of mode mappings composed of openHAB item states and the associated names/asset ids they should be called, delimited by equal and column signs (e.g. `supportedModes="0=Cold:Cool,1=Warm,2=Hot"`). For string based modes if the mapping state value and name are the same (case sensitive), a shortened format can be used, where the name doesn't need to be added to the list by either leaving the first element empty or not providing the names at all (e.g. `supportedModes="Normal=:Cottons,Whites"` <=> `supportedModes="Normal=Normal:Cottons,Whites=Whites`). Additionally, if the mode can be adjusted incrementally (e.g. temperature control), set parameter `ordered=true`, otherwise only requests to set a specific mode will be accepted.
    * Supported item type:
      * Number
      * String
    * Supported metadata parameters:
      * friendlyNames=`<names>`
        * each name formatted as `<@assetIdOrName>`
        * defaults to item label name
      * supportedModes=`<modes>`
        * each mode formatted as `<modeValue>=<@assetIdOrName1>:<@assetIdOrName2>:...`
        * defaults to item state description options `supportedModes="value1=label1,..."`, if defined, otherwise no supported modes
      * ordered=`<boolean>`
        * defaults to false
    * Default category: OTHER
  * `RangeController.rangeValue`
    * Items that represent components of a device that are characterized by numbers within a minimum and maximum range. Multiple instances can be configured in a group endpoint. By default, to ask for a specific range, the item label will be used as the friendly name. To configure it, use `friendlyNames` parameter and provide a comma delimited list of different labels (Keep in mind that some names are [not allowed](#friendly-names-not-allowed)). Additionally, pre-defined [asset ids](#asset-catalog) can be used to label a mode as well  prefixing with an @ sign (e.g. `friendlyNames="@Setting.FanSpeed,Speed"`). To set the supported range, provide a column delimited list including minimum, maximum and precision values. The latter value will be use as default increment when requesting adjusted range values. Optionally, to name specific presets, like fan speeds low [1] & high value [10], can be added in `presets` parameter and provide a comma delimited list of preset mappings composed of range value and the associated names/asset ids they should be called, delimited by equal and column signs (e.g. `presets="1=@Value.Minimum:@Value.Low:Lowest,10=@Value.Maximum:@Value.High:Highest"`). Another optional settings is `unitOfMeasure` parameter which gives a unit of measure to the range values. By default if omitted, it is based on the unit of measurement number item type that have a supported unit, otherwise, a [unit id](#unit-of-measurement-catalog) can be used. (e.g. `unitOfMeasure=Angle.Degrees`)
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
      * supportedRange=`<minValue:maxValue:precision>`
        * defaults to `[0:100:1]` for Dimmer/Rollershutter, `[0:10:1]` for Number* item types
      * presets=`<presets>` (optional)
        * each preset formatted as `<presetValue>=<@assetIdOrName1>:<@assetIdOrName2>:...`
      * unitOfMeasure=`<unitId>` (optional)
        * defaults to item state unit of measurement symbol for Number:* item types
    * Default category: OTHER
  * `ToggleController.toggleState`
    * Items that represent components of a device that can be turned on or off. Multiple instances can be configured in a group endpoint. By default, to ask for a specific range, the item label will be used as the friendly name. To configure it, use `friendlyNames` parameter and provide a comma delimited list of different labels (Keep in mind that some names are [not allowed](#friendly-names-not-allowed)). Additionally, pre-defined [asset ids](#asset-catalog) can be used to label a mode as well with an @ sign prefix (e.g. `friendlyNames="@Setting.Oscillate,Rotate"`).
    * Supported item type:
      * Color
      * Dimmer
      * Switch
    * Supported metadata parameters:
      * friendlyNames=`<names>`
        * each name formatted as `<@assetIdOrName>`
        * defaults to item label name
    * Default category: OTHER

##### Regional Availability
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
| LockController | :x: | :x: | :heavy_check_mark: | :x: | :x: | :x: | :x: | :x: | :heavy_check_mark: | :heavy_check_mark: |
| ModeController | :x: | :x: | :x: | :x: | :x: | :x: | :x: | :x: | :x: | :heavy_check_mark: |
| MotionSensor | :x: | :heavy_check_mark: | :x: | :x: | :x: | :x: | :x: | :x: | :x: | :heavy_check_mark: |
| PercentageController | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: |
| PlaybackController | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :x: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :x: | :x: | :heavy_check_mark: |
| PlaybackStateReporter | :x: | :x: | :heavy_check_mark: | :x: | :heavy_check_mark: | :heavy_check_mark: | :x: | :x: | :x: | :heavy_check_mark: |
| PowerController | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: |
| PowerLevelController | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: |
| RangeController | :x: | :x: | :x: | :x: | :x: | :x: | :x: | :x: | :x: | :heavy_check_mark: |
| SceneController | :x: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :x: | :heavy_check_mark: | :heavy_check_mark: |
| SecurityPanelController | :heavy_check_mark: | :heavy_check_mark: | :x: | :x: | :x: | :x: | :heavy_check_mark: | :x: | :x: | :heavy_check_mark: |
| Speaker | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :x: | :x: | :heavy_check_mark: | :heavy_check_mark: | :x: | :x: | :heavy_check_mark: |
| StepSpeaker | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :x: | :x: | :heavy_check_mark: | :heavy_check_mark: | :x: | :x: | :heavy_check_mark: |
| TemperatureSensor | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: |
| ThermostatController | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: | :heavy_check_mark: |
| ToggleController | :x: | :x: | :x: | :x: | :x: | :x: | :x: | :x: | :x: | :heavy_check_mark: |

##### Display Categories
  * Alexa has certain categories that effect how voice control and their mobile/web UI's display or control endpoints.  An example of this is when you create "Smart Device Groups" in the Alex app and associate a specific Echo or Dot to that Group (typically a room).  When a user asks to turn the lights ON, Alexa looks for devices in that group that have the category "LIGHT" to send the command to.  
  * You can override this default value on items by adding it as a parameter to the metadata, ex:

  `Switch LightSwitch "Light Switch" {alexa="PowerController.powerState" [category="OTHER"]}`
  * List of Alexa categories currently supported from [Alexa Skill API](https://developer.amazon.com/docs/device-apis/alexa-discovery.html#display-categories) docs:

Category | Description | Notes
---------|-------------|-------
ACTIVITY_TRIGGER | Describes a combination of devices set to a specific state, when the state change must occur in a specific order. |For example, a "watch Netflix" scene might require the: 1. TV to be powered on & 2. Input set to HDMI1. | Applies to Scenes
CAMERA | Indicates media devices with video or photo capabilities.  
CONTACT_SENSOR | Indicates an endpoint that detects and reports changes in contact between two surfaces.
DOOR | Indicates a door.  
DOORBELL | Indicates a doorbell.
LIGHT | Indicates light sources or fixtures.
MICROWAVE | Indicates a microwave oven endpoint.  
MOTION_SENSOR | Indicates an endpoint that detects and reports movement in an area.
OTHER | An endpoint that cannot be described in on of the other categories.  
SCENE_TRIGGER | Describes a combination of devices set to a specific state, when the order of the state change is not important. For example a bedtime scene might include turning off lights and lowering the thermostat, but the order is unimportant. | Applies to Scenes
SECURITY_PANEL | Indicates a security panel.
SMARTLOCK | Indicates an endpoint that locks.  
SMARTPLUG | Indicates modules that are plugged into an existing electrical outlet. | Can control a variety of devices.
SPEAKER | Indicates the endpoint is a speaker or speaker system.  
SWITCH | Indicates in-wall switches wired to the electrical system. | Can control a variety of devices.
TEMPERATURE_SENSOR | Indicates endpoints that report the temperature only.  
THERMOSTAT | Indicates endpoints that control temperature, stand-alone air conditioners, or heaters with direct temperature control.  
TV | Indicates the endpoint is a television.  

##### Asset Catalog
  * List of Alexa asset catalog from [Alexa Skill API](https://developer.amazon.com/docs/device-apis/resources-and-assets.html#global-alexa-catalog) docs:

Asset Identifier | Supported Friendly Names
-----------------|-------------------------
DeviceName.Shower | Shower
DeviceName.Washer | Washer<br>Washing Machine
DeviceName.Router | Router<br>Internet Router<br>Network Router<br>Wifi Router<br>Net Router
DeviceName.Fan | Fan<br>Blower
DeviceName.AirPurifier | Air Purifier<br>Air Cleaner<br>Clean Air Machine
DeviceName.SpaceHeater | Space Heater<br>Portable Heater
Shower.RainHead | Rain Head<br>Overhead shower<br>Rain Shower<br>Rain Spout<br>Rain Faucet
Shower.HandHeld | Handheld Shower<br>Shower Wand<br>Hand Shower
Setting.WaterTemperature | Water Temperature<br>Water Temp<br>Water Heat
Setting.Temperature | Temperature<br>Temp
Setting.WashCycle | Wash Cycle<br>Wash Preset<br>Wash setting
Setting.2GGuestWiFi | 2.4G Guest Wi-Fi<br>2.4G Guest Network<br>Guest Network 2.4G<br>2G Guest Wifi
Setting.5GGuestWiFi | 5G Guest Wi-Fi<br>5G Guest Network<br>Guest Network 5G<br>5G Guest Wifi
Setting.GuestWiFi | Guest Wi-fi<br>Guest Network<br>Guest Net
Setting.Auto | Auto<br>Automatic<br>Automatic Mode<br>Auto Mode
Setting.Night | Night<br>Night Mode
Setting.Quiet | Quiet<br>Quiet Mode<br>Noiseless<br>Silent
Setting.Oscillate | Oscillate<br>Swivel<br>Oscillation<br>Spin<br>Back and forth
Setting.FanSpeed | Fan Speed<br>Airflow speed<br>Wind Speed<br>Air speed<br>Air velocity<br>
Setting.Preset | Preset<br>Setting
Setting.Mode | Mode
Setting.Direction | Direction
Value.Delicate | Delicates<br>Delicate
Value.QuickWash | Quick Wash<br>Fast Wash<br>Wash Quickly<br>Speed Wash
Value.Maximum | Maximum<br>Max
Value.Minimum | Minimum<br>Min
Value.High | High
Value.Low | Low
Value.Medium | Medium<br>Mid

##### Friendly Names Not Allowed
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

##### Unit of Measurement Catalog
  * List of Alexa unit of measurement catalog from [Alexa Skill API](https://developer.amazon.com/docs/device-apis/alexa-rangecontroller.html#supported-values-for-unitofmeasure) docs:

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

#### Supported Group Metadata
* Functional groups (no group type) can be labelled with one of Alexa [display categories](#display-categories). It can be set using one of the two formats: `Endpoint.<category>` or `<category>`
* Example `{alexa="Endpoint.Thermostat"}` or `{alexa="Thermostat"}`
* Child item categories are ignored and only the group category is used on items.
* Case is ignored on the category part of the metadata and any value will be made all uppercase before its passed to the Alexa API.

#### Supported Metadata Labels
Item metadata labels translate to a set of capabilities and can be used as a convenience to using the longer meta data format configuration.  These add additional functions and provide the ability to add customization through additional properties which take precedence over the default ones. Here are some examples:
```
Switch OutletPlug "Outlet Plug" {alexa="Switchable" [category="SMARTPLUG"]}
Switch TelevisionPower "Television Power" {alexa="Switchable" [category="TV"]}

Color LightColor "Light Color" {alexa="Lighting"}
```

Here are the labels currently supported and what they translate to. Each example shows using the meta data label and the full translated metadata.

* Switchable (capabilities depending on item type)
```
Switch DeviceSwitch "Device Switch" {alexa="Switchable"}
Rollershutter ShutterSwitch "Shutter Switch" {alexa="Switchable"}

Switch DeviceSwitch "Device Switch" {alexa="PowerController.powerState" [category="SWITCH"]}
Rollershutter ShutterSwitch "Shutter Switch" {alexa="PercentageController.percentage" [category="SWITCH"]}
```
* Lighting (capabilities depending on item type)
```
Dimmer LightDimmer "Light Dimmer" {alexa="Lighting"}
Color LightColor "Light Color" {alexa="Lighting"}

Dimmer LightDimmer "Light Dimmer" {alexa="PowerController.powerState,BrightnessController.brightness" [category="LIGHT"]}
Color LightColor "Light Color" {alexa="PowerController.powerState,BrightnessController.brightness,ColorController.color" [category="LIGHT"]}
```

* Lock
```
Switch DoorLock "Door Lock" {alexa="Lock"}

Switch DoorLock "Door Lock" {alexa="LockController.lockState"}
```
* CurrentTemperature
```
Number CurrentTemperature "Current Temperature" {alexa="CurrentTemperature"}

Number CurrentTemperature "Current Temperature" {alexa="TemperatureSensor.temperature" [scale="Celsius"]}
```
* TargetTemperature
```
Number TargetTemperature "Target Temperature" {alexa="TargetTemperature"}

Number TargetTemperature "Target Temperature" {alexa="ThermostatController.targetSetpoint" [scale="Celsius"]}
```
* LowerTemperature
```
Number LowerTemperature "Lower Temperature" {alexa="LowerTemperature"}

Number LowerTemperature "Lower Temperature" {alexa="ThermostatController.lowerSetpoint" [scale="Celsius"]}
```
* UpperTemperature
```
Number UpperTemperature "Upper Temperature" alexa="UpperTemperature"}

Number UpperTemperature "Upper Temperature" {alexa="ThermostatController.upperSetpoint" [scale="Celsius"]}
```
* HeatingCoolingMode
```
String HeatingCoolingMode "Thermostat Mode" {alexa="HeatingCoolingMode"}

String HeatingCoolingMode "Thermostat Mode" {alexa="ThermostatController.thermostatMode"}
```
* ColorTemperature
```
Dimmer ColorTemperature "Color Temperature" {alexa="ColorTemperature"}

Dimmer ColorTemperature "Color Temperature" {alexa="ColorTemperatureController.colorTemperatureInKelvin"}
```
* Activity
```
Switch Activity "Activity" {alexa="Activity"}

Switch Activity "Activity" {alexa="SceneController.scene" [category="ACTIVITY_TRIGGER"]}
```
* Scene
```
Switch Scene "Scene" {alexa="Scene"}

Switch Scene "Scene" {alexa="SceneController.scene" [category="SCENE_TRIGGER"]}
```
* EntertainmentChannel
```
String EntertainmentChannel "Entertainment Channel" {alexa="EntertainmentChannel"}

String EntertainmentChannel "Entertainment Channel" {alexa="ChannelController.channel"}
```
* EntertainmentInput
```
String EntertainmentInput "Entertainment Input" {alexa="EntertainmentInput"}

String EntertainmentInput "Entertainment Input" {alexa="InputController.input"}
```
* EqualizerBass
```
Number EqualizerBass "Equalizer Bass" {alexa="EqualizerBass"}

Number EqualizerBass "Equalizer Bass" {alexa="EqualizerController.bands:bass}
```
* EqualizerMidrange
```
Number EqualizerMidrange "Equalizer Midrange" {alexa="EqualizerMidrange"}

Number EqualizerMidrange "Equalizer Midrange" {alexa="EqualizerController.bands:midrange"}
```
* EqualizerTreble
```
Number EqualizerTreble "Equalizer Treble" {alexa="EqualizerTreble"}

Number EqualizerTreble "Equalizer Treble" {alexa="EqualizerController.bands:treble"}
```
* EqualizerMode
```
String EqualizerMode "Equalizer Mode" {alexa="EqualizerMode"}

String EqualizerMode "Equalizer Mode" {alexa="EqualizerController.modes"}
```
* MediaPlayer
```
Player MediaPlayer "Media Player" ["MediaPlayer"]

Player MediaPlayer "Media Player" {alexa="PlaybackController.playback,PlaybackStateReporter.playbackState"}
```
* SpeakerMute
```
Switch SpeakerMute "Speaker Mute" {alexa="SpeakerMute"}

Switch SpeakerMute "Speaker Mute" {alexa="Speaker.muted"}
```
* SpeakerVolume
```
Number SpeakerVolume "Speaker Volume" {alexa="SpeakerVolume"}

Number SpeakerVolume "Speaker Volume" {alexa="Speaker.volume"}
```
* ContactSensor
```
Contact ContactSensor "Contact Sensor" {alexa="ContactSensor"}

Contact ContactSensor "Contact Sensor" {alexa="ContactSensor.detectionState"}
```
* MotionSensor
```
Contact MotionSensor "Motion Sensor" {alexa="MotionSensor"}

Contact MotionSensor "Motion Sensor" {alexa="MotionSensor.detectionState"}
```
* SecurityAlarmMode
```
String SecurityAlarmMode "Security Alarm Mode" {alexa="SecurityAlarmMode"}

String SecurityAlarmMode "Security Alarm Mode" {alexa="SecurityPanelController.armState"}
```
* BurglaryAlarm
```
Contact BurglaryAlarm "Burglary Alarm" {alexa="BurglaryAlarm"}

Contact BurglaryAlarm "Burglary Alarm" {alexa="SecurityPanelController.burglaryAlarm"}
```
* FireAlarm
```
Contact FireAlarm "Fire Alarm" {alexa="FireAlarm"}

Contact FireAlarm "Fire Alarm" {alexa="SecurityPanelController.fireAlarm"}
```
* CarbonMonoxideAlarm
```
Contact CarbonMonoxideAlarm "Carbon Monoxide Alarm" {alexa="CarbonMonoxideAlarm"}

Contact CarbonMonoxideAlarm "Carbon Monoxide Alarm" {alexa="SecurityPanelController.carbonMonoxideAlarm"}
```
* WaterAlarm
```
Contact WaterAlarm "Water Alarm" {alexa="WaterAlarm"}

Contact WaterAlarm "Water Alarm" {alexa="SecurityPanelController.waterAlarm"}
```
* ModeComponent
```
String ModeComponent "Mode Component" {alexa="ModeComponent"}

String ModeComponent "Mode Component" {alexa="ModeController.range"}
```
* RangeComponent
```
Number RangeComponent "Range Component" {alexa="RangeComponent"}

Number RangeComponent "Range Component" {alexa="RangeController.rangeValue"}
```
* ToggleComponent
```
Switch ToggleComponent "Toggle Component" {alexa="ToggleComponent"}

Switch ToggleComponent "Toggle Component" {alexa="ToggleController.toggleState"}
```

### Item Tag v2 Support

Version 2 (v2) of the Alexa skill used openHAB [HomeKit](https://www.openhab.org/addons/integrations/homekit/#item-configuration) style tags to expose items to Alexa.
Version 3 (v3) of the skill supports this by translating v2 style tags to v3 [metadata labels](#supported-metadata-labels) internally.  These tags are still required if the items are being exposed to the [HomeKit](https://www.openhab.org/addons/integrations/homekit/#item-configuration) or [Google Assistant](https://www.openhab.org/docs/ecosystem/google-assistant/) integrations.  Below is the translation of v2 tags to v3 labels.

#### Supported v2 Item Tags

| v2 Item Tag                | v3 Metadata Label  |
|----------------------------|--------------------|
| Lighting                   | Lighting           |
| Switchable                 | Switchable         |
| CurrentTemperature         | CurrentTemperature |
| Thermostat                 | Thermostat         |
| CurrentTemperature         | CurrentTemperature |
| homekit:HeatingCoolingMode | HeatingCoolingMode |
| TargetTemperature          | TargetTemperature  |

#### Example v2 Items
```
Switch KitchenLights "Kitchen Lights" <light> (gKitchen) [ "Lighting" ]
Dimmer BedroomLights "Bedroom Lights" <light> (gBedroom) [ "Lighting" ]
Number BedroomTemperature "Bedroom Temperature" (gBedroom) [ "CurrentTemperature" ]
Group gDownstairsThermostat "Downstairs Thermostat" (gFF) [ "Thermostat" ]
Number DownstairsThermostatCurrentTemp "Downstairs Thermostat Current Temperature" (gDownstairsThermostat) [ "CurrentTemperature" ]
Number DownstairsThermostatTargetTemperature "Downstairs Thermostat Target Temperature" (gDownstairsThermostat) [ "TargetTemperature" ]
String DownstairsThermostatHeatingCoolingMode "Downstairs Thermostat Heating/Cooling Mode" (gDownstairsThermostat) [ "homekit:HeatingCoolingMode" ]
```

## Example Voice Commands

Here are some example voice commands:

 * Alexa turn on Office Lights
 * Alexa turn off Pool Waterfall
 * Alexa turn on House Fan
 * Alexa turn on Home Theater Scene
 * Alexa dim Kitchen Lights to 30 percent
 * Alexa set house temperature to 70 degrees

## Other openHAB Alexa Integrations

openHAB has two other Alexa integrations that can be used in conjunction with or independently of this skill.

### Amazon Echo Control Binding

Control Amazon Echo devices from your openHAB.  This allows openHAB to send commands to a echo device and control its ability to play music, set alarms, change the volume and use it a Text-To-Speech output device. See the [Amazon Echo Control Binding](https://www.openhab.org/addons/bindings/amazonechocontrol/) for more information..

### Hue Emulation Service

Hue Emulation exposes openHAB items as Hue devices to other Hue HTTP API compatible applications like an Amazon Echo, Google Home or any Hue compatible application. This is done on the local network and does not require the cloud service. See the [Hue Emulation Service](https://www.openhab.org/addons/integrations/hueemulation/) for more information.
