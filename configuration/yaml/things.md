---
layout: documentation
title: YAML Things
---

# YAML Things

This page describes the `things` element for [YAML Configuration](./).

[[toc]]

## Things

The `things` top-level key contains a map of Things, defined by their Thing UID.

### YAML Definition Syntax

```yaml
things:
  <thing_uid>:
    isBridge: true|false
    bridge: <bridge_uid>
    label: <Thing label>
    location: <Location>
    config:
      <config key>: <config value>
    channels: # To set channel config or define custom channels
      <channel_id>:
        type: <channel type>
        kind: state|trigger # Default: state
        itemType: <item type>
        itemDimension: <item dimension> # Only if itemType is "Number"
        label: <channel label>
        description: <description>
        config:
          <channel config key>: <config value>
```

| Key           | Description                                                                                                                                     |
|:--------------|:------------------------------------------------------------------------------------------------------------------------------------------------|
| `<thing_uid>` | The UID of the Thing or Bridge being defined. The UID format is `<binding_id>:<thing_type_id>:[<bridge_id>:]<thing_id>`, e.g. `astro:sun:home`. |
| `isBridge`    | Whether the entity is a Bridge (`true`) or a Thing (`false`). Default: `false` (a Thing).                                                       |
| `bridge`      | The bridge UID that this Thing belongs to.                                                                                                      |
| `label`       | Thing label.                                                                                                                                    |
| `location`    | The location of the Thing.                                                                                                                      |
| `config`      | A key-value map of the Thing's configuration. Refer to the Binding's documentation for details.                                                 |
| `channels`    | Configure built-in channel parameters, or define custom channels.                                                                               |

### Channels Section

| Key             | Description                                                                                                                                                                          |
|:----------------|:-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `<channel_id>`  | The channel ID. It is a single word that when combined with the Thing UID forms the full channel UID.                                                                                |
| `type`          | Channel type as defined by the Binding. When the channel type is defined, `kind`, `itemType`, and `itemDimension` should not be defined because the channel type will override them. |
| `kind`          | Whether it's a `state` channel or a `trigger` channel. Default: `state`                                                                                                              |
| `itemType`      | The item type that this channel can be linked to. It is required when the channel type is not defined.                                                                               |
| `itemDimension` | This may be used to further define a `Number` `itemType`.                                                                                                                            |
| `label`         | Channel label.                                                                                                                                                                       |
| `description`   | Channel description.                                                                                                                                                                 |
| `config`        | A key-value or a key-array-of-values map of the channel's configuration. Refer to the Binding's documentation for details.                                                           |

### Example

```yaml
version: 1

things:
  mqtt:broker:mosquitto:
    isBridge: true
    config:
      host: 192.168.1.1
      lwtMessage: offline
      lwtTopic: openhab/status
      lwtQos: 1
      birthMessage: online
      birthTopic: openhab/status
      shutdownMessage: offline
      shutdownTopic: openhab/status
      enableDiscovery: false

  mqtt:topic:bedroom1-switch:
    bridge: mqtt:broker:mosquitto
    label: Bed Room1 Switch
    config:
      availabilityTopic: bedroom1-switch/status
      payloadAvailable: online
      payloadNotAvailable: offline
    channels:
      switch1:
        type: switch
        config:
          stateTopic: bedroom1-switch/switch/switch1/state
          commandTopic: bedroom1-switch/switch/switch1/command
      button1:
        type: string
        config:
          stateTopic: bedroom1-switch/button1
          postCommand: true
      statusled:
        type: switch
        config:
          stateTopic: bedroom1-switch/light/status_led/state
          commandTopic: bedroom1-switch/light/status_led/command
          transformationPattern:
            - JSONPATH:$.state
          formatBeforePublish: '{"state": "%s"}' # This needs to be quoted to be parsed as a string
                                                 # because YAML interprets {} as a map object

  # Example to configure a built-in channel
  astro:sun:home:
    config:
      geolocation: 52.5200066,13.4049540,100
      interval: 60
    channels:
      rise#event:
        type: rangeEvent
        config:
          offset: -30
```
