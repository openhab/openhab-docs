---
layout: documentation
---

{% include base.html %}

# Logitech Squeezebox Binding

This binding integrates the [Logitech Media Server](http://www.mysqueezebox.com) and compatible Squeeze players.

## Introduction

Slim Devices was established in 2000, and was first known for its SlimServer used for streaming music, but launched a hardware player named SliMP3 able to play these streams in 2001. Although the first player was fairly simple only supporting wired Ethernet and MP3 natively, it was followed two years later by a slightly more advanced player which was renamed to Squeezebox. Other versions followed, gradually adding native support for additional file formats, Wi-Fi-support, gradually adding larger and more advanced displays as well as a version targeting audiophile users. Support for playing music from external streaming platforms such as Pandora, Napster, Last.fm and Sirius were also added. The devices in general have two operating modes; either standalone where the device connects to an internet streaming service directly, or to a local computer running the Logitech Media Server or a network-attached storage device. Both the server software and large parts of the firmware on the most recent players are released under open source licenses.

In 2006, Slim Devices was acquired by Logitech for $20 million USD. Logitech continued the development of the player until they announced in August 2012 that it would be discontinued. Given the cross-platform nature of the server and software client, some users have ensured the continued use of the platform by utilizing the Raspberry Pi as dedicated Squeezebox device (both client and server).

Taken from: [Wiki](http://en.wikipedia.org/wiki/Squeezebox_%28network_music_player%29)

## Supported Things

At least one Squeeze Server is required to act as a bridge for Squeeze players on the network.  Squeeze players may be official Logitech products or other players like [Squeeze Lites](https://code.google.com/p/squeezelite/).

## Discovery

A Squeeze Server is discovered through UPnP in the local network. Once it is added as a Thing the Squeeze Server bridge will discover Squeeze Players automatically. 

## Binding Configuration

The binding requires no special configuration

## Thing Configuration

The Squeeze Server bridge requires the ip address, web port, and cli port to access it on.
Squeeze Players are identified by their MAC address.
In the thing file, this looks e.g. like

```
Bridge squeezebox:squeezeboxserver:myServer [ ipAddress="192.168.1.10", webport=9000, cliport=9090 ]
{
    Thing squeezeboxplayer myplayer[ mac="00:f1:bb:00:00:f1" ]
}
```

## Channels

All devices support some of the following channels:

| Channel Type ID         | Item Type    | Description  |
|-------------------------|------------------------|--------------|----------------- |------------- |
| power                   | Switch       | Power on/off your device |
| mute                    | Switch       | Mute/unmute your device |
| volume                  | Dimmer       | Volume of your device |
| stop                    | Switch       | Stop the current title|
| control                 | Player       | Control the Zone Player, e.g.  play/pause/next/previous/ffward/rewind|
| stream                  | String       | Play the given HTTP or file stream (file:// or http://)|
| sync                    | String       | Add another player to your device for synchronized playback (other player mac address)|
| playListIndex           | Number       | Playlist Index|
| currentPlayingTime|     | Number       | Current Playing Time|
| currentPlaylistShuffle  | Number       | Current playlist shuffle mode (0 No Shuffle, 1 Shuffle Songs, 2 Shuffle Albums)|
| currentPlaylistRepeat   | Number       | Current playlist repeat Mode (0 No Repeat, 1 Repeat Song, 2 Repeat Playlist)|
| title                   | String       | Title of the current song |
| remotetitle             | String       | Remote Title (Radio) of the current song|
| album                   | String       | Album name of the current song|
| artist                  | String       | Artist name of the current song|
| year                    | String       | Release year of the current song|
| genre                   | String       | Genre name of the current song|
| coverartdata            | Image        | Image data of cover art of the current song|
| ircode                  | String       | Received IR code|
| numberPlaylistTracks    | Number       | Number of playlist tracks|
