---
layout: developersguide
title: Framework Tools
---

# Framework Tools

The openHAB framework provides a number of Java tools and utilities so that addon developers do not have the _"re-invent the wheel"_ when writing their own addon code:

- [Channel Types](#channel-types)
- [Thing Properties](#thing-properties)
- [Hex Utilities](#hex-utilities)
- [Statistics Utilities](#statistics-utilities)
- [String Utilities](#string-utilities)
- [Lighting Model and Color Utilities](#lighting-model-and-color-utilities)
- [Unique ID Utilities](#unique-id-utilities)
- [Network Configuration Utilities](#network-address-service)
- [Caching Support](#caching)

## Channel Types

The openHAB framework provides many standard channel types.
These should be used wherever possible in preference to defining your own.

```java
    ChannelType on = DefaultSystemChannelTypeProvider.SYSTEM_POWER;
```

## Thing Properties

The openHAB framework provides many standard property types.
These should be used wherever possible in preference to defining your own.

```java
    String id = Thing.PROPERTY_SERIAL_NUMBER;
```

## Hex Utilities

The openHAB framework provides utilities for converting between hex encoded characters and byte arrays.

```java
    String hexString = HexUtils.bytesToHex(byte[] bytes, @Nullable CharSequence delimiter);
    byte[] bytes = HexUtils.hexToBytes(String hexString, String delimiter);
```

## Statistics Utilities

The openHAB framework provides some utilities for statistical functions.

```java
    BigDecimal median = Statistics.median(List<BigDecimal> inputList);
```

## String Utilities

The openHAB framework provides some utilities for string manipulation functions.

```java
    String title = StringUtils.capitalizeByWhitespace("openHAB is cool");
```

## Lighting Model and Color Utilities

The openHAB framework provides modelling capabilities and utilities for lighting Things.
The openHAB framework uses one single standard class `HSBType` for representing the state of light devices.
This class encapsusates the hue (H), saturation (S) and brightness (B) of the light; and depending on whether B is zero, therefore also its on/off state.
In addition a light device may have a color temperature (e.g. warm, cool) which represents a specific white-like color.

By contrast many (if indeed not most) actual lighting equipment does NOT use the HSB model.
Some equipment use the color X-Y model.
And others use led color models such as RGB (three color leds), RGBW (three color leds plus white), or even RGBCW (three color leds plus cool and warm white).

The openHAB framework provides tools for converting between the openHAB HSB model and these other actual equipment models.
There are two types of tools:

- A full featured "anything to anything" [Lighting Model](#lighting-model)
- Individual "point-to-point" [Color Conversion Utilities](#color-conversion-utilities)

### Lighting Model

The openHAB framework provides a full featured "anything to anything" state machine model for maintaining and modifying the state of a light.
It is intended to be used within the Thing Handler of a lighting binding.
It models the full physical state of a light device within Java code.
The state machine has two programming "sides":

1. The openHAB side, which "speaks the language of openHAB" using the standard openHAB `Command` and `State` classes such as `HSBType`, `OnOffType`, `PercentType` etc.
2. The physical device side, which "speaks the physical language of the equipment using models like `CIE XY`, `RGB`, `RGBW`, `RGBCW` etc.

It supports lights with different capabilities, including:

- On/Off only
- On/Off with Brightness
- On/Off with Brightness and Color Temperature
- On/Off with Brightness and Color (HSB, RGB, or CIE XY)
- On/Off with Brightness, Color Temperature, and Color

It maintains an internal representation of the state of the light.
It provides methods to handle commands from openHAB and to update the state from the remote light.
It also provides configuration methods to set the capabilities and parameters of the light.
The state machine maintains a consistent state, ensuring that the On/Off state is derived from the
brightness, and that the color temperature and color are only set if the capabilities are supported.
It also provides utility methods to convert between different color representations.

The model specifically handles the following "exotic" cases:

- It handles inter relationships between the brightness PercentType state, the 'B' part of the HSBType state, and the OnOffType state.
    Where if the brightness goes below the configured `minimum on brightness level` the on/off state changes from ON to OFF, and the brightness is clamped to 0%.
    And analogously if the on/off state changes from OFF to ON, the brightness changes from 0% to its last non zero value.
- It handles IncreaseDecreaseType commands to change the brightness up or down by the configured `stepSize`, and ensures that the brightness is clamped in the range [0%..100%].
- It handles both color temperature PercentType states and QuantityType states (which may be either in Mirek/Mired or Kelvin).
    Where color temperature PercentType values are internally converted to Mirek/Mired values on the percentage scale between the configured cooleast and warmest Mirek/Mired values, and vice versa.
- When the color temperature changes then the HS values are adapted to match the corresponding color temperature point on the Planckian Locus in the CIE color chart.
- It handles input/output values in RGB format in the range [0..255].
    The behavior depends on the `rgbDataType` setting.
    - `DEFAULT`: the RGB values read/write all three parts of the HSBType state.
    Whereas if it is `RGB_NO_BRIGHTNESS` the RGB values read/write only the 'HS' parts.
    - `RGB_W`: it handles values in RGBW format.
    The behavior is similar to the RGB case above except that the white channel is derived from the lowest of the RGB values.
    - `RGB_C_W` it handles values in RGBCW format.
    The behavior is similar to the `RGB_W` case above except that the white channel is derived from the RGB values by a custom algorithm.

```java
public class LightModelHandler extends BaseThingHandler {

    // initialize the light model with default capabilities and parameters
    private final LightModel model = new LightModel();

    @Override
    public void initialize() {
      // Set up the light state machine capabilities.
      model.configSetLightCapabilities(LightCapabilities.COLOR_WITH_COLOR_TEMPERATURE);

      // Optionally: set up the light state machine configuration parameters.
      // These would typically be read from the thing configuration or read from the remote device.
      model.configSetRgbDataType(RgbDataType.RGB_NO_BRIGHTNESS); // RGB data type
      model.configSetMinimumOnBrightness(2); // minimum brightness level when on 2%
      model.configSetIncreaseDecreaseStep(10); // step size for increase/decrease commands
      model.configSetMirekControlCoolest(153); // color temperature control range
      model.configSetMirekControlWarmest(500); // color temperature control range

      // Optionally: if the light has warm and cool white LEDS then set up their LED color temperatures.
      // These would typically be read from the thing configuration or read from the remote device.
      model.configSetMirekCoolWhiteLED(153);
      model.configSetMirekWarmWhiteLED(500);

      // now set the status to UNKNOWN to indicate that we are initialized
      updateStatus(ThingStatus.UNKNOWN);
    }

    @Override
    public void handleCommand(ChannelUID channelUID, Command command) {
        // update the model state based on a command from OpenHAB
        model.handleCommand(command);

        // or if it is a color temperature command
        model.handleColorTemperatureCommand(command);

        sendBindingSpecificCommandToUpdateRemoteLight(
              .. model.getOnOff() or
              .. model.getBrightness() or
              .. model.getColor() or
              .. model.getColorTemperature() or
              .. model.getColorTemperaturePercent() or
              .. model.getRGBx() or
              .. model.getXY() or
        );
    }

    // method that sends the updated state data to the remote light
    private void sendBindingSpecificCommandToUpdateRemoteLight(..) {
      // binding specific code
    }

    // method that receives data from remote light, and updates the model, and then OH
    private void receiveBindingSpecificDataFromRemoteLight(double... receivedData) {
        // update the model state based on the data received from the remote
        model.setBrightness(receivedData[0]);
        model.setRGBx(receivedData[1], receivedData[2], receivedData[3]);
        model.setMirek(receivedData[4]);

        // update the OH channels with the new state values
        updateState(onOffChannelUID, model.getOnOff());
        updateState(brightnessChannelUID, model.getBrightness());
        updateState(colorChannelUID, model.getColor());
        updateState(colorTemperatureChannelUID, model.getColorTemperature());
    }
 }
 ```

### Color Conversion Utilities

The openHAB framework provides some "point to point" utilities for simpler color conversions.

```java
    int[] rgb = hsbToRgb(HSBType hsb);
    PercentType[] rgbPercent = hsbToRgbPercent(HSBType hsb);

    double[] cieXY = hsbToXY(HSBType hsb);
    HSBType hsb = xyToHsb(double[] xy);

    double[] cieXY = kelvinToXY(double kelvin);
    double kelvin =  xyToKelvin(double[] xy);
```

## Unique ID Utilities

### Unique Instance ID Generator

When communicating with external systems, it is often desirable to have a unique identifier.
The `org.openhab.core.id` bundle is a mean to generate such an id, which is automatically persisted.
The persistence is done in the configured `userdata` directory as a file called `uuid`.

The id is provided through a static method and can be retrieved through

```java
    String uuid = InstanceUUID.get();
```

### UUID Encoder and Decoder

In openhHAB only certain characters are allowed in Thing and Channel UUIDs (Universally Unique Identifiers).
The UIDUtils allow to convert a string containing any characters to a string containing only the allowed characters.

```java
    String uuid = UIDUtils.encode("anyString");

    String anyString = UIDUtils.decode(uui);
```

## Network Address Service

The `NetworkAddressService` is an OSGi service that can be used like any other OSGi service by adding a service reference to it.
Its OSGi service name is `org.openhab.core.network`.
A user can configure his default network address via UI under `Settings -> Network Settings`.
One can obtain the configured address via the `getPrimaryIpv4HostAddress()` method on the service.
This service is useful for example in the `ThingHandlerFactory` or an `AudioSink` where one needs a specific IP address of the host system to provide something like a `callback` URL.

Some static methods like `getAllBroadcastAddresses()` for retrieving all interface broadcast addresses or `getInterfaceAddresses()` for retrieving all assigned interface addresses might be usefull as well for discovery services.

### Network Address Change Listener

The `NetworkAddressChangeListener` is a consumer type OSGi service interface.
If listeners want to be notified about network interface address changes, they can implement `NetworkAddressChangeListener` and register as an OSGi service.

Please be aware that not all network interface changes are notified to the listeners, only "useful" network interfaces :--
When a network interface status changes from "up" to "down", it is considered as "removed".
When a "loopback" or "down" interface is added, the listeners are not notified.

## Caching

The framework provides some caching solutions for common scenarios.

A common usage case is in a `ThingHandler` to encapsulate one value of an internal state and attach an expire time on that value.
A cache action will be called to refresh the value if it is expired.
This is what `ExpiringCache` implements.
If `handleCommand(ChannelUID channelUID, Command command)` is called with the "RefreshType" command, you just return `cache.getValue()`.

It is a good practice to return as fast as possible from the `handleCommand(ChannelUID channelUID, Command command)` method to not block callers especially UIs.
Use this type of cache only, if your refresh action is a quick to compute, blocking operation.
If you deal with network calls, consider the asynchronously reloading cache implementation instead.

### Expiring and asynchronously reloading cache

If we refreshed a value of the internal state in a `ThingHandler` just recently, we can return it immediately via the usual `updateState(channel, state)` method in response to a "RefreshType" command.
If the state is too old, we need to fetch it first and this may involve network calls, interprocess operations or anything else that will would block for a considerable amount of time.

A common usage case of the `ExpiringCacheAsync` cache type is in a `ThingHandler` to encapsulate one value of an internal state and attach an expire time on that value.

A **handleCommand** implementation with the interesting _RefreshType_ could look like this:

```java
public void handleCommand(ChannelUID channelUID, Command command) {
    if (command instanceof RefreshType) {
        switch (channelUID.getId()) {
            case CHANNEL_1:
                cache1.getValue(updater).thenAccept(value -> updateState(CHANNEL_1, value));
                break;
            ...
        }
    }
}
```

The interesting part is the `updater`.
If the value is not yet expired, the returned CompletableFuture will complete immediately and the given code is executed.
If the value is expired, the updater will be used to request a refreshed value.

An updater can be any class or lambda that implements the functional interface of `Supplier<CompletableFuture<VALUE_TYPE>>`.

In the following example the method `CompletableFuture<VALUE_TYPE> get()` is accordingly implemented.
The example assumes that we deal
with a still very common callback based device refreshing method `doSuperImportantAsyncStuffHereToGetRefreshedValue(listener)`.
The listener is the class
itself, which implements `DeviceStateUpdateListener`.
We will be called back with a refreshed device state in `asyncCallbackFromDeviceStateRefresh`
and mark the Future as _complete_.

```java
class FetchValueFromDevice implements Supplier<CompletableFuture<double>>, DeviceStateUpdateListener {
    CompletableFuture<double> c;

    @Override
    CompletableFuture<double> get() {
       if (c != null) {
          c = new CompletableFuture<double>();
          doSuperImportantAsyncStuffHereToGetRefreshedValue( (DeviceStateUpdateListener)this );
       }
       return c;
    }

    // Here you process the callback from your device refresh method
    @Override
    void asyncCallbackFromDeviceStateRefresh(double newValue) {
       // Notify the future that we have something
       if (c != null) {
          c.complete(newValue);
          c = null;
       }
    }
}
```

If you deal with a newer implementation with a CompletableFuture support, it is even easier.
You would just return your CompletableFuture.
