---
layout: documentation
title: Google Assistant
source: https://github.com/openhab/openhab-google-assistant/blob/master/docs/USAGE.md
description: "Google Assistant is Google's virtual personal assistant and uses Actions on Google as the platform for \"Actions\" (software applications) to extend the functionality of the Google Assistant."
---

# Google Assistant Action

Google Assistant is Google’s virtual personal assistant and uses Actions on Google as the platform for "Actions" (software applications) to extend the functionality of the Google Assistant. Users engage Google Assistant in conversation to get things done, like controlling their devices and things at home. You can use the officially certified openHAB Action for Google Assistant to easily manage and control your smart home by conversational experiences between you and your openHAB smart home powered by voiced commands.

This guide describes step by step how to use the [openHAB Google Assistant Smart Home Action](https://assistant.google.com/services/a/uid/000000f5c61c627e?hl=en-US&source=web). The openHAB Action links your openHAB setup through the [myopenHAB.org](https://www.myopenhab.org) cloud service to the Google Assistant platform (for technical insights, please refer to this [guide](https://github.com/openhab/openhab-google-assistant/blob/master/README.md) to read more about setup options and development information).

With the Action you can voice control your openHAB items and it supports lights, plugs, switches and thermostats. The openHAB Action comes with multiple language support like English, German or French language.

# General Configuration Instructions

## Requirements

* [openHAB Cloud Connector](http://docs.openhab.org/addons/ios/openhabcloud/readme.html) configured using myopenHAB.org. (Items DO NOT need to be exposed to and will not show up on myopenHAB.org, this is only needed for the IFTTT service!)
* Google account.
* Google Home or Google Home mini.

## Item configuration
In openHAB 2 items are exposed via [metadata](https://www.openhab.org/docs/configuration/items.html#item-definition-and-syntax).

Currently the following metadata values are supported (also depending on Googles API capabilities):

* Switch / Dimmer / Color { ga="Light" }
* Switch { ga="Switch" }
* Switch { ga="Outlet" }
* Switch { ga="CoffeeMaker" }
* Switch { ga="WaterHeater" }
* Switch { ga="Fireplace" }
* Switch { ga="Valve" }
* Switch { ga="Sprinkler" }
* Switch { ga="Vacuum" }
* Switch { ga="Scene" }
* Switch { ga="Lock" [ tfaAck=true ] }
* Switch { ga="SecuritySystem" [ tfaPin="1234" ] }
* Dimmer { ga="Speaker" }
* Switch / Dimmer { ga="Fan" [ speeds="0=away:zero,50=default:standard:one,100=high:two", lang="en", ordered=true ] } (for Dimmer the options have to be set)
* Rollershutter { ga="Awning" [ inverted=true ] } (all Rollershutter items can use the inverted option)
* Rollershutter { ga="Blinds" }
* Rollershutter { ga="Curtain" }
* Rollershutter { ga="Door" }
* Rollershutter { ga="Garage" }
* Rollershutter { ga="Gate" }
* Rollershutter { ga="Pergola" }
* Rollershutter { ga="Shutter" }
* Rollershutter { ga="Window" }
* Group { ga="Thermostat" }
* Number { ga="thermostatTemperatureAmbient" } as part of Thermostat.
* Number { ga="thermostatHumidityAmbient" } as part of Thermostat.
* Number { ga="thermostatTemperatureSetpoint" } as part of Thermostat.
* Number / String { ga="thermostatMode" } as part of Thermostat.

  ```
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

It is the "label text" (e.g. "Kitchen Lights" for example above) and not the item's name that will be available to you via vocal commands or in the Google Home app, so make it unique and easy to say!

NOTA : metadata is not (yet?) available via paperUI. Either you create your items via ".items" files, or you can:
- add metadata via console :
 ```
 smarthome:metadata add BedroomLights ga Light
 ```

Notes Regarding Thermostat Items:
- Thermostat requires a group to be properly setup with Google Assistant, default format is Celsius.
- There must be at least 3 elements:
  * (Mandatory) Mode: Number (Zwave THERMOSTAT_MODE Format) or String (off, heat, cool, on).
  * (Mandatory) Temperature Ambient: Number.
  * (Mandatory) Temperature Setpoint: Number.
  * (Optional) Humidity Ambient: Number.
- If your thermostat does not have a mode, you should create one and manually assign a value (e.g. heat, cool, on, etc.) to have proper functionality.

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
  ```
  Group g_HK_Basement_TSTAT "Basement Thermostat" { ga="Thermostat" [ useFahrenheit=true ] }
  Number HK_Basement_Mode "Basement Heating/Cooling Mode" (g_HK_Basement_TSTAT) { ga="thermostatMode" }
  Number HK_Basement_Setpoint "Basement Setpoint" (g_HK_Basement_TSTAT) { ga="thermostatTemperatureSetpoint" }
  Number HK_Basement_Temp "Basement Temperature" (g_HK_Basement_TSTAT) { ga="thermostatTemperatureAmbient" }
  ```
* If none of the above solutions works for you:
  * Remove all the metadata.
  * Make a new .item file with 1 item to expose.
  ```
  Switch TestLight "Test Light" { ga="Switch" }
  ```
  * Relink your account.

