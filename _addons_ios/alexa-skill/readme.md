# Amazon Alexa Skill

An intelligent voice guided personal assistant. Amazon Alexa became famous by the Amazon Echo speaker but is also available through independent solutions. The certified openHAB Alexa skill allows to naturally control the openHAB smart home by voiced commands.  

This page describes how to use the [openHAB Alexa Smart Home Skill](https://www.amazon.com/openHAB-Foundation/dp/B01MTY7Z5L).
The skill connects your openHAB setup through the [myopenHAB.org](http://myopenHAB.org) cloud service to Amazon Alexa.
(See [this document](https://github.com/openhab/openhab-alexa/blob/master/README.md) for other setup options and development information.)

With this skill you can control Items that respond to on/off and numeric commands.
The skill as well has limited support for thermostats.
Currently supported are the English (U.S.), English (U.K.), and German language. 

## General Configuration Instructions

### Requirements

* [openHAB Cloud Connector](https://www.openhab.org/addons/integrations/openhabcloud/) configured using myopenHAB.org
* Amazon account
* Amazon Echo, Amazon Echo Dot or compatible Alexa speaker or solution (e.g. [Reverb](https://reverb.ai/))

### 1. Item Configuration

Items are exposed to Alexa through the use of tags which follow the [HomeKit](https://www.openhab.org/addons/integrations/homekit/) binding tagging syntax.
See the [Hue Emulation](https://www.openhab.org/addons/integrations/hueemulation/) and [HomeKit Add-on](https://www.openhab.org/addons/integrations/homekit/) documentation for details about tagging and available tags.

* **Items via .items - File**

  See [Item Definition and Syntax](https://www.openhab.org/docs/configuration/items.html#item-definition-and-syntax)
     
  Some examples of tagged items are:
  
  ```java
  Switch Kitchen_Light "Kitchen Light" <light> (gKitchen) ["Lighting"] {channel="..."}
  Dimmer Bedroom_Light "Bedroom Light" <light> (gBedroom) ["Lighting"] {channel="..."}
  Number Bedroom_Temperature "Bedroom Temperature" (gBedroom) ["CurrentTemperature"] {channel="..."}
  
  Group gDownstairsThermostat "Downstairs Thermostat" (gFF) ["Thermostat"]
  Number Downstairs_Thermostat_CurrentTemp "Downstairs Thermostat Current Temperature" (gDownstairsThermostat) ["CurrentTemperature"]
  Number Downstairs_Thermostat_Target_Temperature "Downstairs Thermostat Target Temperature" (gDownstairsThermostat) ["TargetTemperature"]
  String Downstairs_Thermostat_Heating_Cooling_Mode "Downstairs Thermostat Heating/Cooling Mode" (gDownstairsThermostat) ["homekit:HeatingCooling"]
  ```

* **Other Configuration Options**

    * The interactive REST API interface available through the openHAB 2 dashboard
    * PaperUI does not yet allow manipulation of tags

#### Item Label Recommendation

Matching of voice commands to Items happens based on the Item label (e.g. "Kitchen Light").
It is therefore advisable, to choose labels that can be used to form natural commands.
As an example, compare "Alexa, turn on the *Kitchen Light*" vs. "Alexa, turn on the *Ground Floor LEDs Kitchen*".

In combination with the Alexa skill (and other similar services) you are thereby tempted to break with your naming scheme and introduce confusion into your setup.
openHAB Tip: YOu may define multiple Items bound to one channel.
Instead of manipulating the label of one single Item, you can define multiple Items specifically for voice commands.
See the following example:

```java
// Common/main Item bound to a binding channel
Switch Kitchen_Light    "Ground Floor LEDs Kitchen" <light> (gKitchen) {channel="..."}
// Two Items with labels fitting for voice commands, bound to the same binding channel
Switch Kitchen_Light_A  "Kitchen Light"                   ["Lighting"] {channel="..."}
Switch Kitchen_Light_A2 "Kitchen LEDs"                    ["Lighting"] {channel="..."}
```

### 2. Skill Configuration

1. Visit the [Alexa website](https://alexa.amazon.com/) or use the Alexa app on your mobile device.
2. Navigate to "Smart Home" -> "Configure Smart Home" and search for openHAB.
3. Follow the instructions to authorize Alexa using your myopenhab.org account.

### 3. Final Configuration

After tagging your items you can go back to the Alexa application and search for devices.

### Example Voice Commands

Here are some example voice commands:

<!-- https://www.amazon.com/gp/help/customer/display.html?nodeId=201751280 -->

- "Alexa, turn on the Kitchen Light"
- "Alexa, turn off the Kitchen Light"
- "Alexa, dim the Kitchen Lights to 30 percent"
- "Alexa, what's the downstairs temperature?"
- "Alexa, set the downstairs temperature to 22 degrees"

### Additional Comments

* Thermostats are created by adding the items of a thermostat to a group which has the tag "Thermostat" which follows the HomeKit binding configuration. 
See [HomeKit Add-on](https://www.openhab.org/addons/integrations/homekit/) for more information on how to configure thermostats.
* Channels which are tagged "CurrentTemperature" but NOT part of a thermostat group will be exposed as a Temperature item in Alexa and can be asked what their current value is ("Alex what is the upstairs temperature? ")
* By default all temperatures are in Celsius, for Fahrenheit add the tag `Fahrenheit` to the thermostat group item (which should also be tagged with `Thermostat`).
For standalone temperature channels, add it directly to the item.
* In addition you can tag Rollershutter items by `[ "Switchable" ]` and get support for `setPercentage`, `incrementPercentage`and `decrementPercentage` commands.
Example:
  ```java
  Rollershutter Shutter_GF_Kitchen "Rollershutter Kitchen" [ "Switchable" ]
  ```
* With commands like `Alexa, set rollershutter kitchen to 100%` you control the rollershutter in the kitchen.
