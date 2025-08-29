---
layout: developersguide
title: FAQ
---

# Frequently Asked Questions (FAQs)

Here is a list of frequently asked questions around the development of bindings.
If you do not find an answer to your question, do not hesitate to ask it on the support forum.

## Structuring Things and Thing Types

1. _I am implementing a binding for system X. Shall I design this as one Thing or as a Bridge with multiple Things for the different functionalities?_

    In general, both options are valid:

    1. You have one Thing which has channels for all your actors, sensors and other functions
    1. You have one Bridge and an additional Thing for every actor and sensor and they would hold the channels

    The preferred architecture is the latter, if this is feasible.
    This means that the physical devices should be represented by a Thing each.
    This only makes sense if your system allows you to identify the different physical devices at all.
    Especially, such an architecture is useful if you can do a discovery of new devices that could then be presented to the user/admin.

    If your system does not provide you any possibility to get hold of such information, but rather only shows you a "logical" view of it, then 1) is also a valid option to pursue.

1. _Do I have to create XML files in `OH-INF/thing` for all devices or is there any other option?_

    No, the XML files are only one way to describe your devices.
    Alternatively, you can implement your own [ThingTypeProvider](https://github.com/openhab/openhab-core/blob/main/bundles/org.openhab.core.thing/src/main/java/org/openhab/core/thing/binding/ThingTypeProvider.java), through which you can provide thing descriptions in a programmatic way.
    Nonetheless, the static XML descriptions of thing types can be picked up for documentation generation and other purposes.
    So whenever possible, static XML descriptions should be provided.

1. _For my system XY, there are so many different variants of devices. Do I really need to define a thing type for every single one of them?_

    Thing types are important if you have no chance to request any structural information about the devices from your system and if you need users to manually chose a thing to add or configure (i.e. there is also no automatic discovery).
    The thing types that you provide will be the list the user can choose from.
    If your system supports auto-discovery and you can also dynamically construct things (and their channels) from structural information that you can access during runtime, there is in theory no need to provide any thing type description at all.
    Nonetheless, static descriptions of thing types have the advantage that the user knows which kind of devices are supported, no matter if he has a device at home or not - so you should at least have static XML descriptions for the devices that are known to you at implementation time.

1. _I have a device that can have different firmware versions with slightly different functionality. Should I create one or two thing types for it?_

    If the firmware version makes a huge difference for the device (and can be seen as a different model of it), then it is ok to have different things defined.
    If the list of channels can be determined by knowing the firmware revision, this is good.
    If you can only determine the existing channels by querying the device itself, it might be the better option to have only one thing type and construct its channels upon first access.

1. _When creating a Thing through my ThingHanderFactory, does it exactly have to have the channels that are defined in the thing type description?_

    It must at least have the channels that are defined in its thing type (and they are already automatically added by the super() implementation).
    Nonetheless, you are free to add any number of additional channels to the thing.

### Modelling Channels

1. _How do I model a light with color, brightness, on/off, and/or color temperature channels?_

    Lights have different capabilities -- some are just on/off, some are dimmable, some have cold/warm color temperature control, and some have full color control.
So when you model a light in your binding, you must follow the _**"Highest Capability Channel Rule"**_.
This rule means supporting **only one** of the following _Single Color Channel for Top Capability Light, Single Dimmer Channel for Mid Capability Light_, or _Single Switch Channel for Low Capability Light_ scenarios:

    - _Single Color Channel for Top Capability Light:_
    If the light supports full color, it must expose one single `Color` channel only.
    This should have the channel-type `system.color` therefore inheriting default tags `[Control, Color]`.
    Although the channel is of type `Color`, items of type `Dimmer` or `Switch` can be linked to it.
    The ability to dim or switch the light is therefore implicitly available so there is no need for an additional channel with item type `Dimmer` or `Switch`, even if the hardware might have separated switching and dimming in different commands.
    Therefore the channel must be able to process all of the following types of command:
      - HSBType commands control the color hue, brightness, and on/off state, _plus_
      - PercentType commands control the brightness, and on/off state, _plus_
      - OnOffType commands control the on/off state

      When the brightness is changed through a linked `Dimmer` item, the hue and saturation values must be kept.
    Likewise, when an `OFF` command is sent through a linked `Switch` item, it must adjust the brightness to 0%, and/or set the on/off state to OFF, so that with the next ON (or brightness change), the hue and saturation values are restored untouched.
    In the openHAB abstraction layer, 0% brightness is identical to `OFF`.
    Sending an `ON` command to such a channel does not have to switch to 100% brightness, though.
    Depending on whether the device supports it, it can also dim to the last brightness value (other than 0%) it was in before.

    - _Single Dimmer Channel for Mid Capability Light:_
    If the light supports dimming, (but not full color), it must expose one single `Dimmer` channel only.
    This should have the channel-type `system.brightness` thus inheriting default tags `[Control, Brightness]`.
    Although the channel is of type `Dimmer`, items of type `Switch` can be linked to it too.
    The possibility to switch the light is therefore implicitly available so there is no need for an additional channel with item type `Switch`, even if the hardware might have separated switching and dimming in different commands.
    Therefore the channel must be able to process all of the following types of command:
      - PercentType commands which controls  the brightness, and the on/off state, _plus_
      - OnOffType commands which controls the on/off state.

      When an `ON` or `OFF` command is sent through a linked `Switch` item, the behaviour must be similar to the _Highest Capability Light_ scenario above.

    - _Single Switch Channel for Low Capability Light:_
If the light supports on/off only, then it must expose one single `Switch` channel only.
The channel-type should have default tags `[Switch, Light]` rather than `[Switch, Power]`.
This channel must be able to process the following type of command:
      - OnOffType commands which controls the on/off state.

    - _Color Temperature Channel:_
If the light also supports variable color temperature (in percent) the following applies.
Color temperature is nothing else than a color palette with a limited (linear) choice of colors.
However there is no dedicated item type for color temperature and it is tricky (though not impossible) to map color temperatures to HSB values.
So you cannot "overload" the `Color` channel in the same way as is done for brightness above.
Instead you must expose a separate `Dimmer` channel.
This should have the channel-type `system.color-temperature` thus inheriting default tags `[Control, ColorTemperature]`.
This channel is orthogonal to the brightness and on/off state, but not orthogonal to the HS part of the HSB.
So changing the color temperature may (or may not) have a consequent impact on the color channel.

    - _Absolute Color Temperature Channel:_
If the light also supports absolute color temperature (in Kelvin).
The case is similar to color temperature in percent above.
You can implement this by exposing another separate `Dimmer` channel.
This channel should have the channel-type `system.color-temperature-abs` thus inheriting the `Advanced` attribute.
This is especially useful when being used from within automation rules where different light bulbs from different vendors should be set to the very same color temperature.
Additionally the web UI has a dedicated picker widget for selecting color temperature in Kelvin.

    - _Extra (Advanced) Channels:_
HSBType commands combine a mixture of color (HS), brightness (B) and on/off state (B>0) values in a single state variable.
There may be use cases that require pure access to these state variables independently.
So it is also allowed (optionally) to have advanced pure channels e.g. `colorOnly`, `brightnessOnly` and/or `onOffOnly`.
However such channels **must** have the `Advanced` attribute and **must** have no default semantic tags applied to them.

1. _I have an image in my binding and want to pass it to the framework. What is the best way to achieve this?_

    The Thing that wants to provide the image should have a Channel defined with item type `Image`.
The `ThingHandler` can update this channel with a state of type `RawType` that represents the raw bytes of the image.
If the image should be downloaded from a URL, the helper method `HttpUtil.downloadImage(URL url)` can be used.
A user may link this channel to an Item of type `Image` which can then be displayed.
Please note that data put as a `RawType` in a channel will stay in **memory only**, i.e., this data will **not** be persisted anywhere.
Also keep in mind that the memory needed for these images will be consumed on the server running the framework, so creating a lot of `RawType` channels is not recommended.
