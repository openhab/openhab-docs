---
layout: documentation
title: Categories
---

{% include base.html %}

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
| Battery          | Batteries, Energy Storages                                                                           | ![](/iconsets/classic/battery.png)     |
| Blinds           | Roller shutters, window blinds, etc.                                                                 | ![](/iconsets/classic/blinds.png)      |
| Camera           | All kinds of cameras                                                                                 | ![](/iconsets/classic/camera.png)      |
| Car              | Smart Cars                                                                                           |                 |
| CleaningRobot    | Vacuum robots, mopping robots, etc.                                                                  |                 |
| Door             | Door                                                                                                 | ![](/iconsets/classic/door.png)        |
| FrontDoor        | Front Door                                                                                           | ![](/iconsets/classic/frontdoor.png)   |
| GarageDoor       | Garage Door                                                                                          | ![](/iconsets/classic/garagedoor.png)  |
| HVAC             | Air condition devices, Fans                                                                          |                 |
| Inverter         | Power inverter, such as solar inverters etc.                                                         |                 |
| LawnMower        | Lawn mowing robots, etc.                                                                             | ![](/iconsets/classic/lawnmower.png)   |
| Lightbulb        | Devices that illuminate something, such as bulbs, etc.                                               | ![](/iconsets/classic/lightbulb.png)   |
| Lock             | Devices whose primary pupose is locking something                                                    | ![](/iconsets/classic/lock.png)        |
| MotionDetector   | Motion sensors/detectors                                                                             |                 |
| NetworkAppliance | Bridges/Gateway need to access other devices like used by Philips Hue for example, Routers, Switches |                 |
| PowerOutlet      | Small devices to be plugged into a power socket in a wall which stick there                          | ![](/iconsets/classic/poweroutlet.png) |
| Projector        | Devices that project a picture somewhere                                                             | ![](/iconsets/classic/projector.png)   |
| RadiatorControl  | Controls on radiators used to heat up rooms                                                          |                 |
| Receiver         | Audio/Video receivers, i.e. radio receivers, satelite or cable receivers, recorders, etc.            | ![](/iconsets/classic/receiver.png)    |
| Screen           | Devices that are able to show a picture                                                              | ![](/iconsets/classic/screen.png)      |
| Sensor           | Device used to measure something                                                                     |                 |
| Siren            | Siren used by Alarm systems                                                                          | ![](/iconsets/classic/siren.png)       |
| SmokeDetector    | Smoke detectors                                                                                      |                 |
| Speaker          | Devices that are able to play sounds                                                                 |                 |
| WallSwitch       | Any device attached to the wall that controls a binary status of something, for ex. a light switch   | ![](/iconsets/classic/wallswitch.png)  |
| WebService       | Account with credentials for a website                                                               |                 |
| Window           | Window                                                                                               | ![](/iconsets/classic/window.png)      |
| WhiteGood        | Devices that look like Waschingmachines, Dishwashers, Dryers, Fridges, Ovens, etc.                   | ![](/iconsets/classic/whitegood.png)   |

### Channel Group Categories

Channel Groups can be seen as a kind of `sub-device` as they combine certain (physical) abilities of a `Thing` into one. For such `Group Channels` one can set a category from the `Thing` category list.

## Channel Categories

The Channel type definition allows to specify a category.
A Binding should classify each Channel into one of the existing categories or leave the category blank, if there is no good match.
There are different types of categories for Channels, which are listed below.

#### Widgets

| Category      | Icon Example                             |
|---------------|------------------------------------------|
| Colorpicker   | ![](/iconsets/classic/colorpicker.png)   |
| Number        | ![](/iconsets/classic/number.png)        |
| Rollershutter | ![](/iconsets/classic/rollershutter.png) |
| Slider        | ![](/iconsets/classic/slider.png)        |
| Switch        | ![](/iconsets/classic/switch.png)        |
| Text          | ![](/iconsets/classic/text.png)          |
| Group         | ![](/iconsets/classic/group.png)         |

#### Weather

| Category    | Icon Example                           |
|-------------|----------------------------------------|
| Sun         | ![](/iconsets/classic/sun.png)         |
| Moon        | ![](/iconsets/classic/moon.png)        |
| Clouds      | ![](/iconsets/classic/clouds.png)      |
| Sun_Clouds  | ![](/iconsets/classic/sun_clouds.png)  |
| Rain        | ![](/iconsets/classic/rain.png)        |
| Snow        | ![](/iconsets/classic/snow.png)        |
| Wind        | ![](/iconsets/classic/wind.png)        |
| Humidity    | ![](/iconsets/classic/humidity.png)    |
| Temperature | ![](/iconsets/classic/temperature.png) |

#### Properties

| Category         | Icon Example                                |
|------------------|---------------------------------------------|
| BatteryLevel     | ![](/iconsets/classic/batterylevel.png)     |
| LowBattery       | ![](/iconsets/classic/lowbattery.png)       |
| CarbonDioxide    | ![](/iconsets/classic/carbondioxide.png)    |
| Energy           | ![](/iconsets/classic/energy.png)           |
| Gas              | ![](/iconsets/classic/gas.png)              |
| Oil              | ![](/iconsets/classic/oil.png)              |
| Water            | ![](/iconsets/classic/water.png)            |
| Light            | ![](/iconsets/classic/light.png)            |
| ColorLight       | ![](/iconsets/classic/colorlight.png)       |
| Temperature      | ![](/iconsets/classic/temperature.png)      |
| Smoke            | ![](/iconsets/classic/smoke.png)            |
| SoundVolume      | ![](/iconsets/classic/soundvolume.png)      |
| Pressure         | ![](/iconsets/classic/pressure.png)         |
| Fire             | ![](/iconsets/classic/fire.png)             |
| Motion           | ![](/iconsets/classic/motion.png)           |
| QualityOfService | ![](/iconsets/classic/qualityofservice.png) |
| Moisture         | ![](/iconsets/classic/moisture.png)         |
| Noise            | ![](/iconsets/classic/noise.png)            |
| Flow             | ![](/iconsets/classic/flow.png)             |
| Price            | ![](/iconsets/classic/price.png)            |
| Time             | ![](/iconsets/classic/time.png)             |

#### Control

| Category     | Icon Example                            |
|--------------|-----------------------------------------|
| Heating      | ![](/iconsets/classic/heating.png)      |
| MediaControl | ![](/iconsets/classic/mediacontrol.png) |
| MoveControl  | ![](/iconsets/classic/movecontrol.png)  |
| Zoom         | ![](/iconsets/classic/zoom.png)         |

#### Purpose

| Category | Icon Example                        |
|----------|-------------------------------------|
| Alarm    | ![](/iconsets/classic/alarm.png)    |
| Presence | ![](/iconsets/classic/presence.png) |
| Vacation | ![](/iconsets/classic/vacation.png) |
| Party    | ![](/iconsets/classic/party.png)    |
