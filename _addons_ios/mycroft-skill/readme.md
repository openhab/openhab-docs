# Mycroft AI Skill

[Mycroft AI](https://mycroft.ai/) is the world’s first open source voice enabled assistant.
The skill allows you to connect a running Mycroft instance to your openHAB system.
Supported natural voice commands and responses can freely be modified and extended.

The skill currently supportes the English (U.S.) and English (U.K.) languages but new languages are easily added via configuration files.

## General Configuration Instructions

### Requirements

- A running [instance of Mycroft](https://mycroft.ai/get-mycroft/) (Mark 1, picroft, ...)
- A running instance of openHAB (version 1.x or v2.x)
- openHAB must be reacheable from the Mycroft instance

### Skill Installation

The openHAB skill has to be installed on your Mycroft instance, please refer to the [official documentation](https://mycroft.ai/documentation/msm/) to learn how to install a skill. 

From 18.2.5b mycroft-core release it is possible to install the skill using the voice command:
- *"Hey Mycroft, install openhab"*

or via the [msm](https://mycroft.ai/documentation/msm/) command:
```shell
msm install openhab
```

To manually install the skill:

Clone the [skill repository](https://github.com/openhab/openhab-mycroft.git) into the Mycroft skills directory,
then trigger installation of needed dependencies:

```shell
cd ~/.mycroft/skills
git clone https://github.com/openhab/openhab-mycroft.git skill-openhab
workon mycroft
cd skill-openhab
pip install -r requirements.txt
```

If on [picroft](https://mycroft.ai/documentation/picroft/), use the skills directory `/opt/mycroft/skills` and skip the `workon mycroft` command.

### Skill Configuration

The skill is configured using the mycroft skill settings. After the skill installation, configuration will be available at https://home.mycroft.ai/skills. After it is updated there, reload configuration is needed by saying:

- *"Hey Mycroft, reload configuration"* 

The new settings will downloaded to settings.json in the skill folder.

### openHAB Item Configuration

Items are exposed to openHAB skill for Mycroft through the use of tags.
See the [Hue Emulation](https://www.openhab.org/addons/integrations/hueemulation/) and [HomeKit Add-on](https://www.openhab.org/addons/integrations/homekit/) documentation for details about tagging and available tags.

* **Items via .items - File**

  See [Item Definition and Syntax](https://www.openhab.org/docs/configuration/items.html#item-definition-and-syntax)
     
  Some examples of tagged items are:
  
  ```java
  Color KitchenLight "Kitchen Light" <light> (gKitchen) ["Lighting"] {channel="hue:0200:1:bloom1:color"}
  Color DiningroomLight "Diningroom Light" <light> (gKitchen) ["Lighting"] {channel="hue:0200:1:bloom1:color"}
  Switch GoodNight "Good Night"	["Switchable"]	

  Number MqttID1Temperature "Bedroom Temperature" <temperature> ["CurrentTemperature"] {mqtt="<[mosquitto:mysensors/SI/1/1/1/0/0:state:default]"}
  Number MqttID1Humidity "Bedroom Humidity" ["CurrentHumidity"] {mqtt="<[mosquitto:mysensors/SI/1/0/1/0/1:state:default]"}

  Group gThermostat "Main Thermostat" ["gMainThermostat"]
  Number MainThermostatCurrentTemp "Main Thermostat Current Temperature" (gMainThermostat) ["CurrentTemperature"]
  Number MainThermostatTargetTemperature "Main Thermostat Target Temperature" (gMainThermostat) ["TargetTemperature"]
  String MainThermostatHeatingCoolingMode "Main Thermostat Heating/Cooling Mode" (gMainThermostat) ["homekit:HeatingCoolingMode"]
  ```
 
If items are modified in openHAB, a refresh in Mycroft is needed by the voice command:

- *"Hey Mycroft, refresh openHAB Items"*

#### Item Label Recommendation

Matching of voice commands to Items happens based on the Item label (e.g. "Kitchen Light").
It is therefore advisable, to choose labels that can be used to form natural commands.
As an example, compare "Hey Mycroft, turn on the *Kitchen Light*" vs. "Hey Mycroft, turn on the *Ground Floor LEDs Kitchen*".

In combination with the Mycroft skill (and other similar services) you are thereby tempted to break with your naming scheme and introduce confusion into your setup.
openHAB Tip: You may define multiple Items bound to one channel.
Instead of manipulating the label of one single Item, you can define multiple Items specifically for voice commands.
See the following example:

```java
// Common/main Item bound to a binding channel
Switch Kitchen_Light    "Ground Floor LEDs Kitchen" <light> (gKitchen) {channel="..."}
// Two Items with labels fitting for voice commands, bound to the same binding channel
Switch Kitchen_Light_A  "Kitchen Light"                   ["Lighting"] {channel="..."}
Switch Kitchen_Light_A2 "Kitchen LEDs"                    ["Lighting"] {channel="..."}
```

### Example Voice Commands

Each item tag supports different command, here is the summary:

| Tag                    | Key word    | Commands            |
|------------------------|-------------|---------------------|
| `Switchable`           | turn        | on, off             |
|                        | switch      | on, off             |
|                        | put         | on, off             |
|                        | what's      | status              |
|                        |             |                     |
| `Lighting`             | turn        | on, off             |
|                        | switch      | on, off             |
|                        | put         | on, off             |
|                        | dim         |                     |
|                        | dim by      | value in percentage |
|                        | bright      |                     |
|                        | bright by   | value in percentage |
|                        |             |                     |
| `Thermostat`           | adjust to   | values in degrees   |
|                        | regulate to | values in degrees   |
|                        | tune to     | values in degrees   |
|                        | decrease by | values in degrees   |
|                        | increase by | values in degrees   |
|                        | what's      | adjusted to         |
|                        | what's      | regulated to        |
|                        | what's      | tuned to            |
|                        |             |                     |
| `CurrentHumidity`      | what's      | humidity            |
|                        |             |                     |
| `CurrentTemperature`   | what's      | temperature         |

With references to the above item definitions, here are an examples of working commands:

- * "Hey Mycroft, turn on Diningroom Light"
- * "Hey Mycroft, switch off Kitchen Light"
- * "Hey Mycroft, put on Good Night"
- * "Hey Mycroft, what is Good Night status?"
- * "Hey Mycroft, what is the status of Good Night?"
- * "Hey Mycroft, set Diningroom to 50 percent"
- * "Hey Mycroft, dim Kitchen"
- * "Hey Mycroft, bright Kitchen"
- * "Hey Mycroft, dim Kitchen by 20 percent"
- * "Hey Mycroft, what's Bedroom temperature?"
- * "Hey Mycroft, tell me the temperature of Bedroom"
- * "Hey Mycroft, what's the Bedroom humidity?"
- * "Hey Mycroft, I'd like to know the humidity of Bedroom"
- * "Hey Mycroft, adjust Main Thermostat to 21 degrees"
- * "Hey Mycroft, regulate Main Thermostat to 20 degrees"
- * "Hey Mycroft, decrease Main Thermostat by 2 degrees"
- * "Hey Mycroft, increase Main Thermostat by 1 degrees"
- * "Hey Mycroft, what is Main Thermostat is regulated to?"
- * "Hey Mycroft, how the Main Thermostat tuned to?"

### Additional Comments

* By default all temperatures are in Celsius, no test so far about the tag Fahrenheit to the thermostat group item (which should also be tagged with `Thermostat`).
