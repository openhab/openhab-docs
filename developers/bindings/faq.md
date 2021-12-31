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

1. _How do I model a dimmable light?_

    A dimmable light should only have a single channel of type `system.brightness` for its control.
    Note that although this channel type is declared for item type 'Dimmer', it is perfectly possible to link a `Switch`
    item to it, additionally to a `Dimmer` item.
    The possibility to switch the light ON/OFF is therefore implicitly available and there is no need for an additional channel with item type `Switch`, even if the hardware might have separated switching and dimming in different commands.
    In the openHAB abstraction layer, 0% brightness is identical to OFF.
    Sending an ON command to such a channel does not have to switch to 100% brightness, though.
    Depending on whether the device supports it, it can also dim to the last brightness value (other than 0%) it was in before.

1. _How do I model a color light?_

    This is very similar to dimmable lights, just that this time the channel should be of type `system.color`.
    Note again that this channel is very versatile: The user can link `Switch`, `Dimmer` and `Color` items to it, possibly also all at the same time.
    When the brightness is changed (through a linked `Dimmer` item), the hue and saturation values are simply kept.
    Likewise, an OFF command will simply adjust the brightness to 0%, so that with the next ON (or brightness change), the hue and saturation values are untouched.

1. _How do I deal with a color temperature feature of a bulb?

    In theory, color temperature is nothing else than a color palette with a limited (linear) choice of colors.
    We do not have a dedicated item type for it in openHAB and it would be very tricky to map color temperatures to HSB values of an `Color` channel.
    So unlike the solution for color bulbs above, we cannot simply "upgrade" our channel to another item type and openHAB therefore defines the `system.color-temperature` channel type, which should be used for a dedicated channel additionally to the brightness/color channel.

    As color temperature is a linear control, its typical controls are Dimmer items, where the value defines the amount of "heat", i.e. 0% is cold light, while 100% is warm light.
    `Dimmer` items are a great match for physical controls, such as rotary controls or rockers (with repeating INCREASE/DECREASE commands) and therefore allow an easy integration with input interfaces, be it physical devices or UI widgets.

    If the light bulb also offers setting absolute color temperatures, the Thing can additionally also offer a channel of the advanced `system.color-temperature-abs` channel type.
    This is especially useful when being used from within automation rules where different light bulbs from different vendors should be set to the very same color temperature.

1. _I have an image in my binding and want to pass it to the framework. What is the best way to achieve this?_

    The Thing that wants to provide the image should have a Channel defined with item type `Image`.
The `ThingHandler` can update this channel with a state of type `RawType` that represents the raw bytes of the image.
If the image should be downloaded from a URL, the helper method `HttpUtil.downloadImage(URL url)` can be used.
A user may link this channel to an Item of type `Image` which can then be displayed.
Please note that data put as a `RawType` in a channel will stay in **memory only**, i.e., this data will **not** be persisted anywhere.
Also keep in mind that the memory needed for these images will be consumed on the server running the framework, so creating a lot of `RawType` channels is not recommended.
