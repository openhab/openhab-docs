---
id: meteostick
label: Meteostick
title: Meteostick - Bindings
type: binding
description: "This is the binding for the [Meteostick](http://www.smartbedded.com/wiki/index.php/Meteostick) weather receiver dongle."
since: 2x
install: auto
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# Meteostick Binding

This is the binding for the [Meteostick](http://www.smartbedded.com/wiki/index.php/Meteostick) weather receiver dongle.
This is an RF receiver that can receive data directly from Davis weather devices (and others).

## Supported Things

This binding support 2 different things types

| Thing                | Type   | Description                       |
|----------------------|--------|-----------------------------------|
| meteostick_bridge    | Bridge | This is the Meteostick USB stick  |
| meteostick_davis_iss | Thing  | This is the Davis Vue ISS         |


## Binding Configuration

The Meteostick things need to be manually added - there is no discovery in the Meteostick binding.

First add and configure the Meteostick bridge - the port and frequency band for your region need to be set.
Next add the sensor and configure the channel number.

## Thing Configuration

### meteostick_bridge Configuration Options

| Option | Description                                        |
|--------|----------------------------------------------------|
| port   | Sets the serial port to be used for the stick      |
| mode   | Sets the mode (frequency band)                     |

Set mode to one of the following depending on your device and region:

| Mode  | Device       | Region           | Frequency |
|-------|--------------|------------------|-----------|
| 0     | Davis        | North America    | 915 Mhz   |
| 1     | Davis        | Australia        | 915 Mhz   |
| 2     | Davis        | Europe           | 868 Mhz   |
| 3     | Fine Offset  | North America    | 915 Mhz   |
| 4     | Fine Offset  | Europe           | 868 Mhz   |
| 5     | Davis        | New Zealand      | 931.5 Mhz |

### meteostick_davis_iss Configuration Options

| Option  | Description                               |
|---------|-------------------------------------------|
| channel | Sets the RF channel used for this sensor  |

## Channels

### Meteostick

| Channel Type ID    | Item Type | Description        |
|--------------------|-----------|--------------------|
| pressure           | Number    | Air pressure       |
| indoor-temperature | Number    | Indoor temperature |

### Davis ISS

| Channel Type ID     | Item Type | Description                                     |
|---------------------|-----------|-------------------------------------------------|
| outdoor-temperature | Number    | Outside temperature                             |
| humidity            | Number    | Humidity                                        |
| wind-direction      | Number    | Wind direction                                  |
| wind-speed          | Number    | Wind speed                                      |
| rain-raw            | Number    | Raw rain counter from the tipping bucket sensor |
| rain-currenthour    | Number    | The rainfall in the last 60 minutes             |
| rain-lasthour       | Number    | The rainfall in the previous hour               |
| solar-power         | Number    | Solar power from the sensor station             |
| signal-strength     | Number    | Received signal strength                        |
| low-battery         | Number    | Low battery warning                             |


#### Rainfall

There are three channels associated with rainfall.
The raw counter from the tipping bucket is provided, the rainfall in the last 60 minutes is updated on each received rainfall and provides the past 60 minutes of rainfall.
The rainfall in the previous hour is the rainfall for each hour of the day and is updated on the hour.

## Full Example

Things can be defined in the .thing file as follows

```
meteostick:meteostick_bridge:receiver [ port="/dev/tty.usbserial-AI02XA60", mode=1 ]
meteostick:meteostick_davis_iss:iss (meteostick:meteostick_bridge:receiver) [ channel=1 ]
```
