---
id: chromecast
label: Chromecast
title: Chromecast - Bindings
type: binding
description: "The binding integrates Google Chromecast streaming devices."
since: 2x
logo: images/addons/chromecast.png
install: auto
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# Chromecast Binding

The binding integrates Google Chromecast streaming devices.  

It not only acts as a typical binding, but also registers each Chromecast device as an audio sink that can be used for playback.

In order play audio streams that are served from the runtime, the binding needs to know the url to access. This can be configured on the binding level:

| Configuration Parameter | Type    | Description  | 
|-------------|--------|-----------------------------|
| callbackUrl | text | optional Callback URL - url to use for playing notification sounds, e.g. http://192.168.0.2:8080 | 


## Supported Things

The binding currently supports the "classic" Chromecast that is an HDMI dongle as well as the Chromecast Audio, which only does audio streaming and offers a headphone jack.

## Discovery

Chromecast devices are discovered on the network using UPnP.
No authentication is required for accessing the devices on the network.

## Thing Configuration

Chromecast devices can also be manually added. The only configuration parameter is the `ipAddress`.

## Channels

| Channel Type ID | Item Type    | Description  | 
|-------------|--------|-----------------------------|
| control | Player | Player control; currently only supports play/pause and does not correctly update, if the state changes on the device itself |
| volume | Dimmer | Control the volume, this is also updated if the volume is changed by another app |
| playuri | String | Can be used to tell the Chromecast to play media from a given url |

## Full Example

services.cfg:

```
binding.chromecast:callbackUrl=http://192.168.30.58:8080
```

demo.things:

```
chromecast:audio:myCC [ ipAddress="192.168.xxx.xxx"]
```

demo.items:

```
Dimmer Volume { channel="chromecast:audio:myCC:volume" }
Player Music { channel="chromecast:audio:myCC:control" }
```

demo.sitemap:

```
sitemap demo label="Main Menu"
{
    Frame {
        Default item=Music
        Slider item=Volume icon=soundvolume
    }
}
```
