---
id: habot
label: HABot
title: HABot - UIs
type: ui
description: "[![Build Status](https://travis-ci.org/ghys/habot.svg?branch=master)](https://travis-ci.org/ghys/habot)"
since: 2x
install: auto
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# HABot

[![Build Status](https://travis-ci.org/ghys/habot.svg?branch=master)](https://travis-ci.org/ghys/habot)

HABot is a chatbot for [openHAB](https://openhab.org), running inside the [Eclipse SmartHome](https://eclipse.org/smarthome/) runtime with no dependency; it can run offline and keep your data out of third-party clouds, but works very well remotely if served from an openHAB Cloud instance (like [myopenhab.org](https://www.myopenhab.org)). In that scenario it can even be added to the Android homescreen as a [Progressive Web App](https://developers.google.com/web/progressive-web-apps/), and adds features working only on "secure origins" like push notifications, speech recognition and resource caching.

It consists in:

- a machine-learning natural language processor based on [Apache OpenNLP](https://opennlp.apache.org) for intent classification and entity extraction (thanks to [nlp-intent-toolkit](https://github.com/mlehman/nlp-intent-toolkit));
- a modular intent-based skill system with learning data provisioning (basic skills to retrieve item statuses, historical data and send basic commands are built-in, but more can be injected by other OSGi dependency injection);
- a fully-featured responsive card-based user interface built with the [Quasar Framework](http://quasar-framework.org) and its companion REST API to interact with the bot;
- an Eclipse SmartHome [Human Language Interpreter](http://docs.openhab.org/configuration/multimedia.html#human-language-interpreter) - this means once the natural language answers expand to more than "here's what I found" and "there you go", you will eventually be able to ask HABot questions and give it orders without a visual UI when coupled with speech-to-text and text-to-speech engines in ESH, for instance to build privacy-focused specialized voice assistant. It is another step to have a full, open source, privacy-focused, integrated natural language processing toolchain for your openHAB smart home.

## Screenshots

<img src="https://i.imgur.com/dTGNui3.png" width="350"> <img src="https://i.imgur.com/3vtnzfY.png" width="350"> <img src="https://i.imgur.com/rh5Tljq.png" width="350"> <img src="https://i.imgur.com/l4ktHGZ.png" width="350">

## Installation & Configuration

### Install the bundle

Grab the latest release from https://github.com/ghys/habot/releases and drop the .jar in openHAB's `addons` folder. The actual location of that folder depends on your installation and is documented in the installation instructions for [Linux](https://docs.openhab.org/installation/linux.html#file-locations) and [Windows](https://docs.openhab.org/installation/windows.html#file-locations).

To upgrade, just replace the .jar by the new version. Also go the web app's settings and hit _"Refresh the application"_ to make sure the old version doesn't remain cached. Verify the version by checking the build date under _About HABot_. You might encounter exceptions after upgrading (see https://github.com/ghys/habot/projects/5#card-8141287), this is known and will be fixed. Restarting openHAB should fix the problem.

### Configure named attributes on your items

#### What are named attributes?

When chatting with HABot you'll likely mention some _object_ (the "what", which can be a physical thing, or a property or purpose like "temperature" or "smoke alarm") and/or a _location_ (the "where", for instance "kitchen" or "first floor").

It will try to extract those concepts from your query and then match items to display or act upon, by looking into "named attributes" it knows about them.

A table of named attributes for each item can be displayed by selecting the "View item attributes" option in HABot webapp's Settings page.

#### How to add named attributes

Named attributes can be added to items in several ways:

1. Using tags from the Eclipse SmartHome [semantic tag library](https://github.com/eclipse/smarthome/wiki/Semantic-Tag-Library). Examples of those tags include `object:Camera`, `property:Temperature`, `purpose:Heating` or `location:FirstFloor`. If a semantic tag is applied on an item, HABot will translate it into one of several named attributes (including synonyms and plurals) for you using an internal dictionary, available in 3 languages. Semantic tags can be added on items through .items files, or they may be set automatically by bindings or other means in the future. Multiple tags, even of the same type (for instance both `location:GroundFloor` and `location:Kitchen`), are allowed on a item.
```
Group  LivingRoom    "Living Room"    ["location:LivingRoom"]
Group  Windows       "Windows"        ["object:Window"]
Switch Light_FF_Bed  "Bedroom Lights" ["purpose:Lighting"]
```

2. Using a comma-separated list of monikers in the item's `habot` [metadata namespace](http://www.eclipse.org/smarthome/documentation/concepts/items.html#item-metadata) - this is especially useful for very specific names or items not corresponding to any known concept in the semantic tag library. Monikers added though metadata in this way are supposed to be of the "object" ("what") type unless you specify `type="location"` in the additional metadata configuration:
```
Switch Bedside_Lamp     <light>     { habot="Bedside Lamp" }
Group  FF_Child_Bedroom <bedroom>   { habot="Amelia's Room,Amy's Room" [ type="location" ] }

```

3. If (and only if) no semantic tag was found on the item, HABot will look up the [category](https://www.eclipse.org/smarthome/documentation/concepts/categories.html) of the item, specified between brackets in the .items files (also used to specify a default [icon for the Classic set](https://www.openhab.org/docs/configuration/iconsets/classic/)), and will translate it to one or several named attributes in the same manner as semantic tags:
```
Group           gFF                  <firstfloor>
Group           Lights               <light>
Number          Outside_Temperature  <temperature>
Rollershutter   Living_GF_Living     <rollershutter>
```
Tags are preferred over categories, but in many cases they will already be present in existing item configurations, and they may be assigned automatically by default when linking Channels to Items, which minimizes the needed changes to the configuration. If a category leads to incorrect named attributes on a item, you can prevent using it altogether with a special variable in the "habot" item metadata namespace:
```
// useCategory=false in the metadata means the "whitegood" category won't be used to derive attributes
Group GF_Laundry "Laundry Room"     <whitegood> ["location:cellar"] { habot="Laundry Room" [ useCategory=false ] }
```


In the "View item attributes" setting dialog, named attributes added through categories appears as orange chips, while those added through semantic tags appear as blue chips, and those added through the "habot" metadata namespace appear as dark gray chips.

#### Group inheritance principle

To avoid adding the same attributes individually to similar items one by one, HABot will by default consider that attributes added to Group items, whether through a semantic tag, the group category, or metadata, applies implicitely to all direct or indirect members of the group too. This is shown on the "View item attributes" setting dialog: attributes inherited from a parent group are shown in a faded color:

![Attributes review example](https://i.imgur.com/ymCmGmb.png)

You can however prevent this behavior for a specific group, and for tags only, with a special property in the item's "habot" metadata namespace configuration:

```
Group GF_Kitchen "Kitchen Beacon" ["object:room"] { habot="" [ inheritAttributes=false ] }
```

Attributes added though metadata are always inherited to group members.

#### Complete example

```
Group gFF           "First Floor"   <firstfloor>
Group gGF           "Ground Floor"  <groundfloor>
Group gC            "Cellar"        <cellar>
Group Garden        "Garden"        <garden>

Group GF_Living     "Living Room"   <video>     (gGF) ["location:LivingRoom"] { habot="Family Room" [ useCategory=false ]}
Group GF_Kitchen    "Kitchen"       <kitchen>   (gGF)
Group GF_Toilet     "Toilet"        <bath>      (gGF) ["location:Toilet"]
Group GF_Corridor   "Corridor"      <corridor>  (gGF)

Group FF_Bath       "Bathroom"      <bath>      (gFF)
Group FF_Office     "Office"        <office>    (gFF)

Group FF_Son        "Oliver's Room" <boy_1>     (gFF) ["location:Bedroom"] { habot="Oli's Room,Oliver's Room" [ type="location" ] }
Group FF_Daughter   "Amelia's Room" <girl_1>    (gFF) ["location:Bedroom"] { habot="Amy's Room,Amelia's Room" [ type="location" ] }
Group FF_Bed        "Bedroom"       <bedroom>   (gFF) { habot="Master Bedroom, Parents' Room" [ type="location" ] }
Group FF_Corridor   "Corridor"      <corridor>  (gFF)

Group:Switch:OR(ON, OFF)        Lights      "All Lights [(%d)]"     <light>
Group:Switch:OR(ON, OFF)        Heating     "No. of Active Heatings [(%d)]"     <heating>
Group:Number:AVG                Temperature "Avg. Room Temperature [%.1f °C]"   <temperature>
Group:Contact:OR(OPEN, CLOSED)  Windows     "Open windows [(%d)]"               <contact>   ["object:Window"]

Dimmer Light_GF_Living_Table        "Table"         (GF_Living, Lights)
Switch Light_GF_Corridor_Ceiling    "Ceiling"       (GF_Corridor, Lights)
Switch Light_GF_Kitchen_Ceiling     "Ceiling"       (GF_Kitchen, Lights)
Switch Light_GF_Kitchen_Table       "Table"         (GF_Kitchen, Lights)
Switch Light_GF_Corridor_Wardrobe   "Wardrobe"      (GF_Corridor, Lights)
Switch Light_GF_Toilet_Ceiling      "Ceiling"       (GF_Toilet, Lights)
Switch Light_GF_Toilet_Mirror       "Mirror"        (GF_Toilet, Lights)

Switch Light_FF_Bath_Ceiling        "Ceiling"       (FF_Bath, Lights)
Switch Light_FF_Bath_Mirror         "Mirror"        (FF_Bath, Lights)
Switch Light_FF_Corridor_Ceiling    "Corridor"      (FF_Corridor, Lights)
Switch Light_FF_Office_Ceiling      "Ceiling"       (FF_Office, Lights)
Switch Light_FF_Son_Ceiling         "Ceiling"       (FF_Son, Lights)
Switch Light_FF_Daughter_Ceiling    "Ceiling"       (FF_Daughter, Lights)
Switch Light_FF_Bed_Ceiling         "Ceiling"       (FF_Bed, Lights)

...

Number Temperature_GF_Corridor  "Temperature [%.1f °C]" <temperature>   (Temperature, GF_Corridor)
Number Temperature_GF_Toilet    "Temperature [%.1f °C]" <temperature>   (Temperature, GF_Toilet)
Number Temperature_GF_Living    "Temperature [%.1f °C]" <temperature>   (Temperature, GF_Living)
Number Temperature_GF_Kitchen   "Temperature [%.1f °C]" <temperature>   (Temperature, GF_Kitchen)
Number Temperature_FF_Bath      "Temperature [%.1f °C]" <temperature>   (Temperature, FF_Bath)
Number Temperature_FF_Office    "Temperature [%.1f °C]" <temperature>   (Temperature, FF_Office)
Number Temperature_FF_Son       "Temperature [%.1f °C]" <temperature>   (Temperature, FF_Son)
Number Temperature_FF_Daughter  "Temperature [%.1f °C]" <temperature>   (Temperature, FF_Daughter)
Number Temperature_FF_Bed       "Temperature [%.1f °C]" <temperature>   (Temperature, FF_Bed)

...

Contact Window_GF_Frontdoor     "Frontdoor [MAP(en.map):%s]"        <frontdoor> (GF_Corridor, Windows)
Contact Window_GF_Kitchen       "Kitchen [MAP(en.map):%s]"          (GF_Kitchen, Windows)
Contact Window_GF_Living        "Terrace door [MAP(en.map):%s]"     (GF_Living, Windows)
Contact Window_GF_Toilet        "Toilet [MAP(en.map):%s]"           (GF_Toilet, Windows)

Contact Window_FF_Bath          "Bath [MAP(en.map):%s]"             (FF_Bath, Windows)
Contact Window_FF_Bed           "Bedroom [MAP(en.map):%s]"          (FF_Bed, Windows)
Contact Window_FF_Office_Window "Office Window [MAP(en.map):%s]"    (FF_Office, Windows)
Contact Window_FF_Office_Door   "Balcony Door [MAP(en.map):%s]"     <door>          (FF_Office, Windows) { habot="Balcony Door" }

```

### Build cards to replace the defaults

Once attributes are properly set on items, you can try chatting with HABot by asking questions and giving orders like _"what's the temperature in the kitchen?"_ or _"switch on the tv in the living room"_ (check the [training data](https://github.com/ghys/habot/tree/master/src/main/resources/train) for some clues about what it can do at the moment. It will reply with a natural language answer and present you with a card containing the matching items, but you can also alter those cards!

Cards in HABot also have objects and locations attributes, and **if there is already a card with the same attributes as those extracted from a chat query saved in your "card deck", HABot will display the saved card instead of generating one.** You can save an auto-generated card to the card deck with the _"Add to Card deck"_ option its context menu while chatting, and it will have the same attributes (objects and locations) as recognized in the corresponding query, therefore from then on, subsequent queries with the same recognized object and/or location will reuse the saved card, not build a new one. This allows you to make the necessary changes to the card in the Card designer as you see fit, and bring it back by simply asking HABot the same query you used intially. Only remember if the matching items evolve (for example if some are added, renamed or removed), this won't be reflected automatically in the saved card, it's now your responsibility to add them to it.

The Card Designer will eventually be properly documented but is quite easy to use; just remember the card is a tree of _components_, each having its own configuration and sometimes also _slots_, which are placeholders in certain locations within the component where other subcomponents may be added. Certain components can only be added to certain slots; when selecting a slot, the designer only lets you add components valid for that slot. The HABot components are mostly mapped to their [Quasar framework counterparts](http://quasar-framework.org/components/), often with the same property names, so their accepted values might also be found in the Quasar docs.

Some components also accept expressions in certain config properties, for instance the HbCard title and subtitle, or the HbListItem label and sublabel. Simply prefix the expression with '=' (example: `=2+3` or `="Desired temperature: " + items.Temperature_Setpoing.state + "°C"` and it will be considered an expression/formula rather than literal text - much like Excel! The [jexl](https://github.com/TomFrost/Jexl) library (not Apache JEXL) is used to evaluate expressions. Stay tuned for a more complete description of what they can do. You can for instance use a ternary operator to change a color property dynamically: `=items.Alarm.state == 'ON' > "red" : "green"`

Finally, certain rendering features for specific items can be specified though the item's tags and metadata:

- Switches will be added alongside sliders for Dimmer items representations if they have the `capability:Switchable` tag;
- If there is a `control="knob"` in the "habot" metadata property of a Dimmer item, a knob will be rendered instead of a slider on generated single-item cards;
- Generated multi-item cards will use the "label", "sublabel", "leftIcon", "leftLetter", "leftColor" properties from metadata if specified on the HbListItem components (all accept expressions like described below)
- HbSlider and HbKnob will use the "min", "max", "step" metadata properties in the "habot" namespace.

Examples:
```
Dimmer Thermostat <thermostat> { habot="Nest" [ control="knob", min=18, max=27, step=0.5, color="=items.Temperature.state < 16 ? 'blue' : 'black'" ] }
Number Temperature { habot="Average temperature" [ sublabel="='Last change: ' + items.state.Temperature_LastChange", leftIcon="mdi-temperature", leftColor="primary" ] }
```

Please refer to https://quasar-framework.org/components/color-palette.html and https://quasar-framework.org/components/icons.html#Basic-Usage to learn more about accepted values for colors and icons (material-icons and mdi iconsets are available in HABot).

### Bookmarked cards & Suggestions

You can bookmark a card and it will appear in the "Bookmarks" section. This is useful for cards you find yourself needing all the time - don't bookmark too many cards, only those you really use daily! Others can always be accessed from the card deck.

Suggestions are a way to have quick access to cards that are relevant in certain contexts only. For example, you will likely need different cards depending on whether you're at home or not, or in certain parts of the day. If the temperature falls outside a certain range, you would want a card with the thermostat controls. If motion was detected while you're away, you will likely get a quick way of displaying the webcams and the sensor status. You decide when a card should be suggested with a formula you set up in the card designer. The expression syntax allows simple operations and lets you access items' statuses and (soon) the current time.

Examples of expressions include `items.Temperature.state < 16` and `items.Motion_Detected.state == "ON" && items.Presence.state == "OFF"`.

### How to add HABot as a home screen app (Android)

HABot is a Progressive Web App, this means if you access it over HTTPS (for example, if you've connected it with myopenhab.org, it will be accessible at https://home.myopenhab.org/habot/index.html after authenticating), a banner should appear asking you if you'd want HABot added to home screen as an app (it is supported by the Chrome, Firefox and the Samsung Internet browser) - if not, look for the option in the browser's menu. You can also add HABot to your desktop by enabling a couple of Chrome experimental flags: check https://www.xda-developers.com/progressive-web-apps-chrome-how-to/ for instructions.

Using HTTPS will also unlock features only available from "secure origins", including spoken input (either with the browser's built-in recognition or a cloud service) if the browser supports it. See the "Get the full experience" slideshow in HABot's Help page to learn more.

Remember to cleanup the cache if you upgrade the app - to speed up the loading, the browser will cache most resources using the Web Cache API, and might not always detect that they have changed. You can do so with the "Refresh the application" option in the Settings page. If you're using Chrome, you can also make the browser retain your remote access credentials with the "Store openHAB Cloud Credentials" option (this is actually not specific to openHAB Cloud but will work with all HTTP Basic authentication schemes).

## Roadmap

HABot is very much a work in progress.
You can check the roadmap in the [Projects](https://github.com/ghys/habot/projects) section. Contributions (PR) are welcome and appreciated!
If you have feature requests or issues though, that's okay, but please consider the fact that it's first and foremost a personal pet project :)
