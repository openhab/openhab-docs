---
layout: documentation
title: Runtime Commands
---

{% include base.html %}

# Runtime Commands

It is possible to query and even change the state of entities like items or things. Therefore the console offers commands in various areas:

{::options toc_levels="3..4"/}

- TOC
{:toc}

::: tip Note
Some of the described commands are executed on the internal database and could break your installation. Please use this functionality only if you know what you are doing!
:::

## Examples

Query an item's state:

```shell
openhab> openhab:status Heating_GF_Corridor
OFF
```

Changing an item's state:

```shell
openhab> openhab:send Heating_GF_Corridor ON
Command has been sent successfully.
```

Get help for a command:

```shell
openhab> help openhab:send
Usage: openhab:send <item> <command> - sends a command for an item
```

### Items

| Command                           | Description                                                         |
|-----------------------------------|---------------------------------------------------------------------|
| `openhab:status <item>`           | shows the current status of an item                                 |
| `openhab:update <item> <state>`   | sends a status update for an item                                   |
| `openhab:send <item> <command>`   | sends a command for an item                                         |
| `openhab:items list [<pattern>]`  | lists names and types of all items (matching the pattern, if given) |
| `openhab:items clear`             | removes all items                                                   |
| `openhab:items remove <itemName>` | removes the given item                                              |

### Discovery

| Command                                              | Description                                                                |
|------------------------------------------------------|----------------------------------------------------------------------------|
| `openhab:discovery start <thingTypeUID!bindingID>`   | runs a discovery on a given thing type or binding                          |
| `openhab:discovery enableBackgroundDiscovery <PID>`  | enables background discovery for the discovery service with the given PID  |
| `openhab:discovery disableBackgroundDiscovery <PID>` | disables background discovery for the discovery service with the given PID |

### Inbox

| Command                                    | Description                        |
|--------------------------------------------|------------------------------------|
| `openhab:inbox`                            | lists all current inbox entries    |
| `openhab:inbox listignored`                | lists all ignored inbox entries    |
| `openhab:inbox approve <thingUID> <label>` | creates a thing for an inbox entry |
| `openhab:inbox clear`                      | clears all current inbox entries   |
| `openhab:inbox ignore <thingUID>`          | ignores an inbox entry permanently |

### Things

| Command                | Description                |
|------------------------|----------------------------|
| `openhab:things list`  | lists all things           |
| `openhab:things clear` | removes all managed things |

### Links

| Command                                                 | Description                                                                      |
|---------------------------------------------------------|----------------------------------------------------------------------------------|
| `openhab:links list`                                    | lists all links                                                                  |
| `openhab:links link <itemName> <channelUID>`            | links an item with to channel                                                    |
| `openhab:links unlink <itemName> <thingUID>`            | unlinks an item with to channel                                                  |
| `openhab:links clear`                                   | removes all managed links                                                        |
| `openhab:links orphan <list|purge>`                     | lists/purges all orphaned - one missing element (either item or channel) - links |

### Audio

| Command                                         | Description                                                                                                             |
|-------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------|
| `openhab:audio play [<sink>] <filename>`        | plays a sound file from the `$OPENHAB_CONF/sounds` folder through the optionally specified audio sink(s)                |
| `openhab:audio play <sink> <filename> <volume>` | plays a sound file from the `$OPENHAB_CONF/sounds` folder through the specified audio sink(s) with the specified volume |
| `openhab:audio stream [<sink>] <url>`           | streams the sound from the url through the optionally specified audio sink(s)                                           |
| `openhab:audio sources`                         | lists the audio sources                                                                                                 |
| `openhab:audio sinks`                           | lists the audio sinks                                                                                                   |

### Voice

| Command                             | Description                                                            |
|-------------------------------------|------------------------------------------------------------------------|
| `openhab:voice say <text>`          | speaks a text on the default audio sink with the default TTS and voice |
| `openhab:voice voices`              | lists available voices of the active TTS services                      |
| `openhab:voice interpret <command>` | interprets a human language command                                    |

### Automation

| Command                              | Description                                               |
|--------------------------------------|-----------------------------------------------------------|
| `openhab:script <script to execute>` | Executes a script from the `$OPENHAB_CONF/scripts` folder |

### Firmware

| Command                                                 | Description                                     |
|---------------------------------------------------------|-------------------------------------------------|
| `openhab:firmware list <thingTypeUID>`                  | Lists the available firmwares for a thing type. |
| `openhab:firmware status <thingUID>`                    | lists the firmware status for a thing           |
| `openhab:firmware update <thingUID> <firmware version>` | updates the firmware for a thing                |
