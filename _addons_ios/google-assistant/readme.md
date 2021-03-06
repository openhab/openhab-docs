---
layout: documentation
title: Google Assistant
source: https://github.com/openhab/openhab-google-assistant/blob/master/docs/USAGE.md
description: "Google Assistant is Google's virtual personal assistant and uses Actions on Google as the platform for \"Actions\" (software applications) to extend the functionality of the Google Assistant."
---

# Google Assistant Action

Google Assistant is Google’s virtual personal assistant and uses Actions on Google as the platform for "Actions" (software applications) to extend the functionality of the Google Assistant. Users engage Google Assistant in conversation to get things done, like controlling their devices and things at home. You can use the officially certified openHAB Action for Google Assistant to easily manage and control your smart home by conversational experiences between you and your openHAB smart home powered by voiced commands.

This guide describes step by step how to use the [openHAB Google Assistant Smart Home Action](https://assistant.google.com/services/a/uid/000000f5c61c627e?hl=en-US&source=web). The openHAB Action links your openHAB setup through the [myopenHAB.org](https://www.myopenhab.org) cloud service to the Google Assistant platform (for technical insights, please refer to this [guide](https://github.com/openhab/openhab-google-assistant/blob/master/README.md) to read more about setup options and development information).

With the Action you can voice control your openHAB items and it supports lights, plugs, switches, thermostats and many more. The openHAB Action comes with multiple language support like English, German or French language.

## General Configuration Instructions

::: tip
This integration relies on the cloud connector addon.
More information can be found in the corresponding [docs page](https://www.openhab.org/link/openhabcloud).
:::

### Requirements

* openHAB Cloud Connector configured using myopenHAB.org. (Items DO NOT need to be exposed to and will not show up on myopenHAB.org, this is only needed for the IFTTT service!)
* Google account.
* Google Home, Google Home mini, Google Nest or the Google Assistant on your phone.

### Item configuration

In openHAB 2 items are exposed via [metadata](https://www.openhab.org/docs/configuration/items.html#item-definition-and-syntax).

Currently the following metadata values are supported (also depending on Googles API capabilities):

* `Switch / Dimmer / Color { ga="Light" }` (Depending on the item type controlling power, brightness and color is supported)

---

* `Group { ga="Light" [ colorTemperatureRange="2000,9000", useKelvin=true ] }` (Light with separate brightness and color items)
* `Dimmer / Number { ga="lightBrightness" }` as part of Light group
* `Dimmer / Number { ga="lightColorTemperature" }` as part of Light group

---

* `Switch { ga="Switch" [ inverted=true ] }` (all Switch items can use the inverted option)
* `Switch { ga="Outlet" }`
* `Switch { ga="Coffee_Maker" }`
* `Switch { ga="WaterHeater" }`
* `Switch { ga="Fireplace" }`
* `Switch { ga="Valve" }`
* `Switch { ga="Sprinkler" }`
* `Switch { ga="Vacuum" }`
* `Switch { ga="Scene" }`

---

* `Switch / Contact { ga="Lock" [ ackNeeded=true ] }`
* `Switch { ga="SecuritySystem" [ pinNeeded="1234" ] }`
* `String { ga="Camera" [ protocols="hls,dash" ] }`
* `Dimmer { ga="Speaker" }` (Volume control)

---

* `Group { ga="TV" [ volumeDefaultPercentage="20", levelStepSize="10", volumeMaxLevel="100", transportControlSupportedCommands="NEXT,PREVIOUS,PAUSE,RESUME", availableInputs="hdmi1=xbox,hdmi2=settopbox", availableChannels="1=Channel1=NBC,2=Channel2=CBS" ] }`
* `Switch { ga="tvPower" }` as part of TV group (optional)
* `Switch { ga="tvMute" }` as part of TV group (optional)
* `Dimmer { ga="tvVolume" }` as part of TV group (optional)
* `String { ga="tvChannel" }` as part of TV group (optional)
* `String { ga="tvInput" }` as part of TV group (optional)
* `Player { ga="tvTransport" }` as part of TV group (optional)

---

* `Switch / Dimmer { ga="Fan" [ speeds="0=away:zero,50=default:standard:one,100=high:two", lang="en", ordered=true ] }` (for Dimmer the options have to be set)
* `Switch / Dimmer { ga="Hood" }`
* `Switch / Dimmer { ga="AirPurifier" }`

---

* `Rollershutter { ga="Awning" [ inverted=true ] }` (all Rollershutter items can use the inverted option)
* `Rollershutter { ga="Blinds" }`
* `Rollershutter { ga="Curtain" }`
* `Rollershutter { ga="Door" }`
* `Rollershutter { ga="Garage" }`
* `Rollershutter { ga="Gate" }`
* `Rollershutter { ga="Pergola" }`
* `Rollershutter { ga="Shutter" }`
* `Rollershutter { ga="Window" }`

_\* All Rollershutter devices can also be used with a Switch or Contact item with the limitation of only supporting open and close states._

---

* `Group { ga="Thermostat" [ modes="...", thermostatTemperatureRange="10,30", useFahrenheit=true ] }`
* `Number { ga="thermostatTemperatureAmbient" }` as part of Thermostat group
* `Number { ga="thermostatHumidityAmbient" }` as part of Thermostat group
* `Number { ga="thermostatTemperatureSetpoint" }` as part of Thermostat group
* `Number / String { ga="thermostatMode" }` as part of Thermostat group

---

* `Number { ga="TemperatureSensor" } [ useFahrenheit=true ]`

Example item configuration:

  ```js
  Switch KitchenLights "Kitchen Lights" <light> (gKitchen) { ga="Switch" }
  Dimmer BedroomLights "Bedroom Lights" <light> (gBedroom) { ga="Light" }
  Color LivingroomLights "Livingroom Lights" <light> (gLivingroom) { ga="Light" }
  Switch SceneMovie "Livingroom Scene Movie" (gLivingroom) { synonyms="Movie Scene", ga="Scene" }
  Switch CristmasTree "Cristmas Tree" (gLivingroom) { ga="Outlet" }
  Switch DoorLock "Door Lock" { ga="Lock" }

  //Thermostat Setup (Google requires a mode, even if you manually set it up in openHAB)
  Group g_HK_Basement_TSTAT "Basement Thermostat" { ga="Thermostat" [ useFahrenheit=true ] }
  Number HK_Basement_Mode "Basement Heating/Cooling Mode" (g_HK_Basement_TSTAT) { ga="thermostatMode" }
  Number HK_Basement_Setpoint "Basement Setpoint" (g_HK_Basement_TSTAT) { ga="thermostatTemperatureSetpoint" }
  Number HK_Basement_Temp "Basement Temperature" (g_HK_Basement_TSTAT) { ga="thermostatTemperatureAmbient" }
  Number HK_Basement_Humid "Basement Humidity" (g_HK_Basement_TSTAT) { ga="thermostatHumidityAmbient" }
  ```

Item labels are not mandatory in openHAB, but for the Google Assistant Action they are absolutely necessary!

It is the "label text" (e.g. "Kitchen Lights" for example above) and not the item's name that will be available to you via voice commands or in the Google Home app, so make it unique and easy to say!

If you do not want to adjust your labels to be human spellable, you can use the "name" config option in the metadata: `[ name="Kitchen Lights" ]`. This will overwrite the label as the device's name.

Furthermore, you can state synonyms for the device name: `Switch KitchenLight "Kitchen Lights" { synonyms="Top Light", ga="Light" }`.

To ease setting up new devices you can add a room hint: `[ roomHint="Living Room" ]`.

For devices supporting the OpenClose trait, the attributes `[ discreteOnlyOpenClose=false, queryOnlyOpenClose=false ]` can be configured.

* discreteOnlyOpenClose defaults to false. When set to true, this indicates that the device must either be fully open or fully closed (that is, it does not support values between 0% and 100%). An example of such a device may be a valve.
* queryOnlyOpenClose defaults to false. Is set to true for `Contact` items. Indicates if the device can only be queried for state information and cannot be controlled. Sensors that can only report open state should set this field to true.

---

NOTE: metadata is not available via paperUI in openHAB v2. Either you create your items via ".items" files, or you can:

* add metadata via console:

  ```console
  smarthome:metadata add BedroomLights ga Light
  ```

* add metadata using the REST API:

  ```js
  PUT /rest/items/BedroomLights/metadata/ga

  {
    "value": "Light"
  }
  ```

NOTE: Please be aware that for backward compatibilty also the former usage of tags (ref. [Google Assistant Action Documentation v2.5](https://www.openhab.org/v2.5/docs/ecosystem/google-assistant/)) to specify items to be exposed to Google Assistent is supported and may cause unexpected behavior.
Items that contain tags that refer to a valid Google Assistent device will be exposed regardless of having metadata set. E.g.: `Switch MyBulb ["Lighting"]`.

### Special item configurations

#### Two-Factor-Authentication

For some actions, Google recommends to use TFA (Two-Factor-Authentication) to prevent accidential or unauthorized triggers of sensitive actions. See [Two-factor authentication &nbsp;|&nbsp; Actions on Google Smart Home](https://developers.google.com/assistant/smarthome/develop/two-factor-authentication).

The openHAB Google Assistant integration supports both _ackNeeded_ and _pinNeeded_. You can use both types on all devices types and traits.

_ackNeeded_: "A two-factor authentication that requires explicit acknowledgement (yes or no) and can also use trait states as response feedback. This challenge type is not recommended for security devices and traits."

_pinNeeded_: "A two-factor authentication that requires a personal identification number (PIN), which is ideal for security devices and traits."

Example:

```js
Switch DoorLock "Front Door" { ga="Lock" [ ackNeeded=true ] }
Switch HouseAlarm "House Alarm" { ga="SecuritySystem" [ pinNeeded="1234" ] }
```

#### Thermostats

Thermostat requires a group of items to be properly configured to be used with Google Assistant. The default temperature unit is Celsius. `{ ga="Thermostat" }`

To change the temperature unit to Fahrenheit, add the config option `[ useFahrenheit=true ]` to the thermostat group.
To set the temperature range your thermostat supports, add the config option `[ thermostatTemperatureRange="10,30" ]` to the thermostat group.

There must be at least three items as members of the group:

* (Mandatory) Mode: Number or String (off, heat, cool, on, ...). `{ ga="thermostatMode" }`
* (Mandatory) Temperature Ambient: Number. `{ ga="thermostatTemperatureAmbient" }`
* (Mandatory) Temperature Setpoint: Number. `{ ga="thermostatTemperatureSetpoint" }`
* (Optional) Temperature Setpoint High: Number. `{ ga="thermostatTemperatureSetpointHigh" }`
* (Optional) Temperature Setpoint Low: Number. `{ ga="thermostatTemperatureSetpointLow" }`
* (Optional) Humidity Ambient: Number. `{ ga="thermostatHumidityAmbient" }`

If your thermostat does not have a mode, you should create one and manually assign a value (e.g. heat, cool, on, etc.) to have proper functionality.

To map the [default thermostat modes of Google](https://developers.google.com/assistant/smarthome/traits/temperaturesetting.html) (on, off, heat, cool, etc.) to custom ones for your specific setup, you can use the _modes_ config option on the thermostat group.
E.g. `[ modes="off=OFF:WINDOW_OPEN,heat=COMFORT:BOOST,eco=ECO,on=ON,auto" ]` will enable the following five modes in Google Home `"off, heat, eco, on, auto"` that will be translated to `"OFF, COMFORT, ECO, ON, auto"`. You can specify alternative conversions using the colon sign, so that in the former example "BOOST" in openHAB would also be translated to "heat" in Google. For the translation of Google modes to openHAB always the first option after the equal sign is used.
By default the integration will provide `"off,heat,cool,on,heatcool,auto,eco"`.

You can also set up a Thermostat for using it as a temperature sensor. To do so, create a Thermostat group and only add one item member as "thermostatTemperatureAmbient".
However, it is recommended to prefer the `TemperatureSensor` type for simple temperature reports (but currently no UI support in Google Assistant).

#### Fans

_Fans_ (and similar device types, like _AirPurifier_ or _Hood_) support the _FanSpeed_ trait.
With that you will be able to set up and use human speakable modes, e.g. "fast" for 100% or "slow" for 25%.

To set up those modes use a _Dimmer_ item and the following metadata config: `[ speeds="0=away:zero,50=default:standard:one,100=high:two", lang="en", ordered=true ]`.

_speeds_ will be a comma-separated list of modes with a percentage number followed by an equal sign and different aliases for that mode after a colon.
So here both "high" and "two" would set the speed to 100%.
You are also able to define the language of those aliases.
The option _ordered_ will tell the system that your list is ordered and you will then be able to also say "faster" or "slower" and Google will use the next or previous speed.

#### Blinds and similar devices

Blinds should always use the `Rollershutter` item type.
Since Google and openHAB use the oposite percentage value for "opened" or "closed", the action will tranlate this automatically.
If the values are still inverted in your case, you can state the `[ inverted=true ]` option for all `Rollershutter` items.

Since Google only tells the open percentage (and not the verb "close" or "down"), it can not be differentiated between saying "set blind to 100%" or "open blind".
Therefore, it is not possible to "not invert" the verbs, if the user chooses to invert the numbers.

## Setup & Usage on Google Assistant App

* Make sure Google Play Services is up to date.
* Visit "Google Home" app entry in Google Play Store on Android.
* Set up the voice-activated speaker, Pixel, or Android phone (version 6+) with the same  account.
* Make sure you're the correct user.
* Start the updated Google Home app on your phone.
* Go to the settings part: `Account > Settings`.

![openHAB Google App](images/Screenshot_1.png)

* Go to the home control part: `Assistant > Home control`.

![openHAB Google App](images/Screenshot_2.png)

* Press the `+` button.

![openHAB Google App](images/Screenshot_3.png)

* Select `openHAB`.

![openHAB Google App](images/Screenshot_4.png)

* Login at myopenhab.org with your username and password.

![openHAB Google App](images/Screenshot_5.png)

* Allow Google access to your account.

![openHAB Google App](images/Screenshot_6.png)
![openHAB Google App](images/Screenshot_7.png)

* You will now be able to see your previously configured items and devices. Assign them to a room. Press Done.

![openHAB Google App](images/Screenshot_8.png)
![openHAB Google App](images/Screenshot_9.png)

* You can now control those devices from the Google Assistant.

![openHAB Google App](images/Screenshot_10.png)
![openHAB Google App](images/Screenshot_11.png)

## Example Voice Commands

Here are some example voice commands:

* Turn on Office Lights.
* Dim/Brighten Office Lights (increments 15%).
* Set Office Lights to 35%.
* Open/Close the blinds
* Turn off Pool Waterfall.
* Turn on House Fan.
* Turn on Home Theater Scene.
* Set Basement Thermostat to 15 degrees.
* What is the current Basement Thermostat Temperature?

## Frequently Asked Question

My New items did not appear in the Google Home app.

* Say: Hey Google, sync my devices.

I'm not able to connect openHAB to Google Home.

* Check, recheck and after that check again your items!
* The items that you want to expose to Google Assistant should have the right metadata assigned.
* The items that you want to expose to Google Assistant must have a item label! [Item Definition and Syntax](https://www.openhab.org/docs/configuration/items.html#item-definition-and-syntax)
* If you expose thermostats make sure than you have:
  * A group item with the metadata value { ga="Thermostat" }
  * A number or string item with the metadata value { ga="thermostatMode" } as part of the thermostat group
  * A number item with the metadata value { ga="thermostatTemperatureAmbient" } as part of the thermostat group
  * A number item with the metadata value { ga="thermostatTemperatureSetpoint" } as part of the thermostat group

  ```js
  Group g_HK_Basement_TSTAT "Basement Thermostat" { ga="Thermostat" [ useFahrenheit=true ] }
  Number HK_Basement_Mode "Basement Heating/Cooling Mode" (g_HK_Basement_TSTAT) { ga="thermostatMode" }
  Number HK_Basement_Setpoint "Basement Setpoint" (g_HK_Basement_TSTAT) { ga="thermostatTemperatureSetpoint" }
  Number HK_Basement_Temp "Basement Temperature" (g_HK_Basement_TSTAT) { ga="thermostatTemperatureAmbient" }
  ```

* If none of the above solutions works for you:
  * Remove all the metadata.
  * Make a new .item file with 1 item to expose.

  ```js
  Switch TestLight "Test Light" { ga="Switch" }
  ```

  * Relink your account.
