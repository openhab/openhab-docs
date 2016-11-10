---
layout: documentation
title: Runtime Commands
---

{% include base.html %}

# Runtime Commands

It is also possible to query and even change the state of entities like items or things. Therefore the console offers commands in various areas:

- [Commands](#commands)
- [Firmware](#firmware)
- [Inbox](#inbox)
- [Things](#things)
- [Items](#items)
- [Discovery](#discovery)

__Please note: Some of the commands described here are executed on the internal database and could brake your installation. So please use this functionality only if you know what you are doing!__


## Examples

Query an item's state:

```
openhab> smarthome:status Heating_GF_Corridor
OFF
```

Changing an item's state:

```
openhab> smarthome:send Heating_GF_Corridor ON
Command has been sent successfully.
```

Get help for a command:

```
openhab> help smarthome:send
Usage: smarthome:send <item> <command> - sends a command for an item
```

### Items

| smarthome:status <item> | shows the current status of an item
| smarthome:update <item> <state> | sends a status update for an item
| smarthome:send <item> <command> | sends a command for an item
| smarthome:items list [<pattern>] | lists names and types of all items (matching the pattern, if given)
| smarthome:items clear | removes all items
| smarthome:items remove <itemName> | removes the given item

### Discovery

| smarthome:discovery start <thingTypeUID!bindingID> | runs a discovery on a given thing type or binding
| smarthome:discovery enableBackgroundDiscovery <PID> | enables background discovery for the discovery service with the given PID
| smarthome:discovery disableBackgroundDiscovery <PID> | disables background discovery for the discovery service with the given PID

### Inbox

| smarthome:inbox | lists all current inbox entries
| smarthome:inbox listignored | lists all ignored inbox entries
| smarthome:inbox approve <thingUID> <label> | creates a thing for an inbox entry
| smarthome:inbox clear | clears all current inbox entries
| smarthome:inbox ignore <thingUID> | ignores an inbox entry permanently

### Things

| smarthome:things list | lists all things
| smarthome:things clear | removes all managed things

### Links

| smarthome:links list | lists all links
| smarthome:links addChannelLink <itemName> <channelUID> | links an item with a channel
| smarthome:links removeChannelLink <itemName> <thingUID> | unlinks an item with a channel
| smarthome:links clear | removes all managed links

### Audio

| smarthome:audio play [<sink>] <filename> | plays a sound file from the `conf/sounds` folder through the optionally specified audio sink(s)
| smarthome:audio stream [<sink>] <url> | streams the sound from the url through the optionally specified audio sink(s)
| smarthome:audio sources | lists the audio sources
| smarthome:audio sinks | lists the audio sinks

### Voice

| smarthome:voice say <text> - speaks a text on the default audio sink with the default TTS and voice
| smarthome:voice voices - lists available voices of the active TTS services
| smarthome:voice interpret <command> - interprets a human language command

### Automation

| smarthome:> <script to execute> | Executes a script from the `conf/scripts` folder

### Firmware

| smarthome:firmware list <thingTypeUID> | Lists the available firmwares for a thing type.
| smarthome:firmware status <thingUID> | lists the firmware status for a thing
| smarthome:firmware update <thingUID> <firmware version> | updates the firmware for a thing

