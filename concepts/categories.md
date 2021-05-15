---
layout: documentation
title: Categories
---

# Categories

Categories in openHAB are used to provide meta information about Things, Channels, etc. UIs can use this information to render specific icons or provide a search functionality to for example filter all Things for a certain category.

## Differences between categories

We separate the categories into `functional` and `visual`.
Therefore we treat `Thing categories` as how the physical device **looks like** and `Channel categories` as something that describes the **functional purpose** of the Channel.

## Thing Categories

The Thing type definition allows to specify a category.
User interfaces can parse this category to get an idea how to render this Thing.
A Binding can classify each Thing into one of the existing categories.
The list of all predefined categories can be found in our categories overview:

| Category         | Description                                                                                          | Icon Example    |
|------------------|------------------------------------------------------------------------------------------------------|-----------------|
| Battery          | Batteries, Energy Storages                                                                           | ![battery](/iconsets/classic/battery.png)     |
| Blinds           | Roller shutters, window blinds, etc.                                                                 | ![blinds](/iconsets/classic/blinds.png)      |
| Camera           | All kinds of cameras                                                                                 | ![camera](/iconsets/classic/camera.png)      |
| Car              | Smart Cars                                                                                           |                 |
| CleaningRobot    | Vacuum robots, mopping robots, etc.                                                                  |                 |
| Door             | Door                                                                                                 | ![door](/iconsets/classic/door.png)        |
| FrontDoor        | Front Door                                                                                           | ![frontdoor](/iconsets/classic/frontdoor.png)   |
| GarageDoor       | Garage Door                                                                                          | ![garagedoor](/iconsets/classic/garagedoor.png)  |
| HVAC             | Air condition devices, Fans                                                                          |                 |
| Inverter         | Power inverter, such as solar inverters etc.                                                         |                 |
| LawnMower        | Lawn mowing robots, etc.                                                                             | ![lawnmower](/iconsets/classic/lawnmower.png)   |
| Lightbulb        | Devices that illuminate something, such as bulbs, etc.                                               | ![lightbulb](/iconsets/classic/lightbulb.png)   |
| Lock             | Devices whose primary pupose is locking something                                                    | ![lock](/iconsets/classic/lock.png)        |
| MotionDetector   | Motion sensors/detectors                                                                             |                 |
| NetworkAppliance | Bridges/Gateway need to access other devices like used by Philips Hue for example, Routers, Switches |                 |
| PowerOutlet      | Small devices to be plugged into a power socket in a wall which stick there                          | ![poweroutlet](/iconsets/classic/poweroutlet.png) |
| Projector        | Devices that project a picture somewhere                                                             | ![projector](/iconsets/classic/projector.png)   |
| RadiatorControl  | Controls on radiators used to heat up rooms                                                          |                 |
| Receiver         | Audio/Video receivers, i.e. radio receivers, satelite or cable receivers, recorders, etc.            | ![receiver](/iconsets/classic/receiver.png)    |
| Screen           | Devices that are able to show a picture                                                              | ![screen](/iconsets/classic/screen.png)      |
| Sensor           | Device used to measure something                                                                     |                 |
| Siren            | Siren used by Alarm systems                                                                          | ![siren](/iconsets/classic/siren.png)       |
| SmokeDetector    | Smoke detectors                                                                                      |                 |
| Speaker          | Devices that are able to play sounds                                                                 |                 |
| WallSwitch       | Any device attached to the wall that controls a binary status of something, for ex. a light switch   | ![wallswitch](/iconsets/classic/wallswitch.png)  |
| WebService       | Account with credentials for a website                                                               |                 |
| Window           | Window                                                                                               | ![window](/iconsets/classic/window.png)      |
| WhiteGood        | Devices that look like Waschingmachines, Dishwashers, Dryers, Fridges, Ovens, etc.                   | ![whitegood](/iconsets/classic/whitegood.png)   |

### Channel Group Categories

Channel Groups can be seen as a kind of `sub-device` as they combine certain (physical) abilities of a `Thing` into one. For such `Group Channels` one can set a category from the `Thing` category list.

## Channel Categories

The Channel type definition allows to specify a category.
A Binding should classify each Channel into one of the existing categories or leave the category blank, if there is no good match.
There are different types of categories for Channels, which are listed below.

### Widgets

| Category      | Icon Example                             |
|---------------|------------------------------------------|
| Colorpicker   | ![colorpicker](/iconsets/classic/colorpicker.png)   |
| Number        | ![number](/iconsets/classic/number.png)        |
| Rollershutter | ![rollershutter](/iconsets/classic/rollershutter.png) |
| Slider        | ![slider](/iconsets/classic/slider.png)        |
| Switch        | ![switch](/iconsets/classic/switch.png)        |
| Text          | ![text](/iconsets/classic/text.png)          |
| Group         | ![group](/iconsets/classic/group.png)         |

#### Weather

| Category    | Icon Example                           |
|-------------|----------------------------------------|
| Sun         | ![sun](/iconsets/classic/sun.png)         |
| Moon        | ![moon](/iconsets/classic/moon.png)        |
| Clouds      | ![clouds](/iconsets/classic/clouds.png)      |
| Sun_Clouds  | ![sun_clouds](/iconsets/classic/sun_clouds.png)  |
| Rain        | ![rain](/iconsets/classic/rain.png)        |
| Snow        | ![snow](/iconsets/classic/snow.png)        |
| Wind        | ![wind](/iconsets/classic/wind.png)        |
| Humidity    | ![humidity](/iconsets/classic/humidity.png)    |
| Temperature | ![temperature](/iconsets/classic/temperature.png) |

#### Properties

| Category         | Icon Example                                |
|------------------|---------------------------------------------|
| BatteryLevel     | ![batterylevel](/iconsets/classic/batterylevel.png)     |
| LowBattery       | ![lowbattery](/iconsets/classic/lowbattery.png)       |
| CarbonDioxide    | ![carbondioxide](/iconsets/classic/carbondioxide.png)    |
| Energy           | ![energy](/iconsets/classic/energy.png)           |
| Gas              | ![gas](/iconsets/classic/gas.png)              |
| Oil              | ![oil](/iconsets/classic/oil.png)              |
| Water            | ![water](/iconsets/classic/water.png)            |
| Light            | ![light](/iconsets/classic/light.png)            |
| ColorLight       | ![colorlight](/iconsets/classic/colorlight.png)       |
| Temperature      | ![temperature](/iconsets/classic/temperature.png)      |
| Smoke            | ![smoke](/iconsets/classic/smoke.png)            |
| SoundVolume      | ![soundvolume](/iconsets/classic/soundvolume.png)      |
| Pressure         | ![pressure](/iconsets/classic/pressure.png)         |
| Fire             | ![fire](/iconsets/classic/fire.png)             |
| Motion           | ![motion](/iconsets/classic/motion.png)           |
| QualityOfService | ![qualityofservice](/iconsets/classic/qualityofservice.png) |
| Moisture         | ![moisture](/iconsets/classic/moisture.png)         |
| Noise            | ![noise](/iconsets/classic/noise.png)            |
| Flow             | ![flow](/iconsets/classic/flow.png)             |
| Price            | ![price](/iconsets/classic/price.png)            |
| Time             | ![time](/iconsets/classic/time.png)             |

#### Control

| Category     | Icon Example                            |
|--------------|-----------------------------------------|
| Heating      | ![heating](/iconsets/classic/heating.png)      |
| MediaControl | ![mediacontrol](/iconsets/classic/mediacontrol.png) |
| MoveControl  | ![movecontrol](/iconsets/classic/movecontrol.png)  |
| Zoom         | ![zoom](/iconsets/classic/zoom.png)         |

#### Purpose

| Category | Icon Example                        |
|----------|-------------------------------------|
| Alarm    | ![alarm](/iconsets/classic/alarm.png)    |
| Presence | ![presence](/iconsets/classic/presence.png) |
| Vacation | ![vacation](/iconsets/classic/vacation.png) |
| Party    | ![party](/iconsets/classic/party.png)    |
