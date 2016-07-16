---
layout: documentation
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
openhab> smarthome:status Sonos_Kitchen_Controller
PLAY
```

Changing an item's state:

```
openhab> smarthome:send Light_Kueche_Innen1_Toggle ON
Command has been sent successfully.
```

Get help for a command:

```
openhab> help smarthome:send
Usage: smarthome:send <item> <command> - sends a command for an item
```


### Commands

| smarthome interpret <command> | interprets the human language command
| smarthome update <item> <state> | sends a status update for an item
| smarthome send <item> <command> | sends a command for an item
| smarthome > <script to execute> | Executes a script
| smarthome status <item> | shows the current status of an item

### Firmware

| smarthome firmware list <thingTypeUID> | Lists the available firmwares for a thing type.
| smarthome firmware status <thingUID> | lists the firmware status for a thing
| smarthome firmware update <thingUID> <firmware version> | updates the firmware for a thing

### Inbox

| smarthome inbox | lists all current inbox entries
| smarthome inbox listignored | lists all ignored inbox entries
| smarthome inbox approve <thingUID> <label> | creates a thing for an inbox entry
| smarthome inbox clear | clears all current inbox entries
| smarthome inbox ignore <thingUID> | ignores an inbox entry permanently

### Things

| smarthome things list | lists all things
| smarthome things clear | removes all managed things

### Items

| smarthome items list [<pattern>] | lists names and types of all items (matching the pattern, if given)
| smarthome items clear | removes all items
| smarthome items remove <itemName> | removes the given item

### Links

| smarthome links list | lists all links
| smarthome links addChannelLink <itemName> <channelUID> | links an item with a channel
| smarthome links removeChannelLink <itemName> <thingUID> | unlinks an item with a channel
| smarthome links clear | removes all managed links

### Discovery

| smarthome discovery start <thingTypeUID!bindingID> | runs a discovery on a given thing type or binding
| smarthome discovery enableBackgroundDiscovery <PID> | enables background discovery for the discovery service with the given PID
| smarthome discovery disableBackgroundDiscovery <PID> | disables background discovery for the discovery service with the given PID
