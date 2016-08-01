---
layout: intro
---

{% include base.html %}

# Migration from openHAB 1 to openHAB 2

There are a few changes in openHAB 2 that you should be aware of, if you are coming from openHAB 1.

Note: This page is work in progress and serves as a place to collect whatever you feel is important to mention when migrating your existing setup to openHAB 2.

## Important Changes

### Configuration and Folder Structure

- The `configurations` folder has been renamed to `conf`
- Instead of the global `configurations/openhab.cfg` file, there is now an individual file per add-on in `conf/services`.  The `<key>:` prepended to each configuration property is removed in the new `<key>.cfg` files.
- You can still put additional jar files in the `addons` folder to install bindings that are not available in the distribution, but please note that removing a jar file from this folder will not uninstall it. To uninstall it, you will have to use the console command bundle:uninstall.
- The OSGi console commands are now available as "smarthome", not as "openhab" anymore.
- The webapps folder has been discontinued, but static resources can be placed in `conf/html`.

### User Interfaces

- The Classic UI URL has changed from `/openhab.app` to `/classicui/app`, so you can access your sitemaps at `http://<server>:8080/classicui/app?sitemap=<yoursitemap>`
- A new default sitemap provider is in place, which provides a dynamic sitemap with the name `_default`, which lists all group items that are not contained within any other group.
- It is possible to provide your own custom icons in the `conf/icons/classic` folder - no need to overwrite the icons that come with the runtime.
- For custom dynamic icons depending on an item state, you need in openHAB 2 to define in the `conf/icons/classic` folder a default icon (without the state part) in addition to the icons for the different states. This default icon was not required in openHAB 1. For example, for a Wifi level that can take a value from 1 to 4, in addition to the files wifi-1.png, wifi-2.png, wifi-3.png and wifi-4.png, you need to provide a file named wifi.png.
- Note that Basic UI requires icons with SVG format by default; a Basic UI setting is available to choose between SVG and PNG formats.

### Rules

In order to continue using rules from openHAB 1, a few minor changes might be necessary:

1. Import statements at the top are not required anymore for any org.openhab package, so these can be removed
1. The state "Uninitialized" has been renamed to "NULL" and thus needs to be replaced in the rules
1. The `HSBType` state type can no longer be constructed using a `java.awt.Color` object, and there is no longer a `toColor()` method.  Use the following alternatives:

```java
var HSBType hsb = HSBType::fromRGB(color.red, color.green, color.blue)
var Color color = Color::getHSBColor(hsb.hue.floatValue / 360, hsb.saturation.floatValue / 100, hsb.brightness.floatValue / 100)
```

### Transformations

The **SCALE** transformation has evolved. 
- Old syntax that was : `[minbound,maxbound]` has to be changed to `[minbound..maxbound]`. 
- Note that you now have the ability to exclude bounds from the ranges (eg `]minbound..maxbound]`) and also define open ranges : `[minbound..]`

## New Concepts

### Understanding "Things"

One of the new notions that people quickly come across when moving to openHAB 2 is that of a ["Thing"](../concepts/things.html).
To understand what they are and how they relate to Items, we have to look at the past:

In openHAB 1 you had to add a so-called ["binding configuration"](https://github.com/openhab/openhab/wiki/Explanation-of-items#binding-config) in curly brackets to your item definition in order to link your item (representing a logical function in your setup) to some physical device. The openHAB wiki gives a nice example of how that looked like:

```
Switch  Light_Floor        "Light at Floor"                { knx="1/0/15+0/0/15" }
Switch  Presence           "I'm at home"                   { bluetooth="123456ABCD" }
Switch  Doorbell           "Doorbell"                      { serial="/dev/usb/ttyUSB0" }
Contact Garage             "Garage is [MAP(en.map):%s]"    { zwave="21:command=sensor_binary,respond_to_basic=true" }
String  Error_Ventilation  "Error in Ventilation %s"       { comfoair="error_message" }
Number  DiningRoomTemp     "Maximum Away Temp. [%.1f °F]"  { nest="<[thermostats(Dining Room).away_temperature_high_f]" }
```

As can be seen, every binding came up with its own syntax for this binding configuration and while the rest of the item file had nice syntax checks and content assist, this wasn't possible to provide for the binding configurations. The only way for the user to figure out what to put in there was to visit the wiki page of the according binding and read up the right syntax and its meaning there.
This not only meant that syntax errors and typos weren't easily detected, it also completely prevented any "automated" editing of the binding configurations, e.g. through user-friendly UIs.

Besides the syntax, the old scheme left the binding developers also the choice about whether there is multi-instance support or not. As a matter of fact, usually most bindings started off with supporting a single instance, only to notice later on that it would be useful to also support more than one. As an example, you can see the KNX binding configuration above, which simply does not allow to select an interface (KNX system) - instead, a single connection is configured globally in the openhab.cfg file.

These issues were defined [a long time ago](https://groups.google.com/d/msg/openhab/NSiveF9U1vk/PVLemrdrpVsJ) and a suggestion was to standardize the binding configuration to use JSON. Using JSON would have meant a huge impact on the readability of the item-files, though, since the goal of a short, concise and one-line configuration per item would not have been kept up. Furthermore, it still would have meant that the configuration is fully done within the item file, so having UIs changing this configuration would have meant to mess around in the user-created file.

Having all this in mind, Eclipse SmartHome came up with the [Thing concept](https://www.eclipse.org/forums/index.php/t/668424/). The general idea was to standardize the binding configuration and move it away from the item file - instead of requiring JSON, Java interfaces were defined, which could either be serialized to JSON (e.g. for the use in UIs through the REST API) or to a user-friendly Xtext-DSL. A Thing represents a configurable device/system/unit, which provides different functionality through a set of Channels. Each channel corresponds exactly to one binding configuration string in openHAB 1. 

Given the Thing

```
Thing yahooweather:weather:berlin [ location="638242", unit="c" ]
```

with the channels "temperature" and "humidity", all that have to do is to link our items to the desired channel. As a result, instead of the openHAB 1 definition similar to

```
# openHAB 1 Syntax
Number Temperature   { yahooweather="woeid=638242,value=temperature,unit=c" }
Number Humidity      { yahooweather="woeid=638242,value=humidity,unit=c" }
```

we now merely reference our channels:

```
# openHAB 2 Syntax
Number Temperature   { channel="yahooweather:weather:berlin#temperature" }
Number Humidity      { channel="yahooweather:weather:berlin#humidity" }
```

As a result, the Things are now holding all configuration to tell the binding which information should be retrieved from the devices and where to send commands to. These therefore serve as a standardized structure for the binding configuration. Besides specifying such configurations statically in a file, openHAB 2 is now also capable of discovering devices and providing the required configuration (e.g. their IP address) automatically. All that is left to be done for the user is to link the items to a channel of any of the available Things.
