---
id: pebble
label: Pebble
title: Pebble - Actions
type: action
description: "The Pebble action service allows you to send pins and notifications directly to your Pebble watch."
source: https://github.com/openhab/openhab1-addons/blob/master/bundles/action/org.openhab.action.pebble/README.md
since: 1x
install: auto
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# Pebble Actions

The Pebble action service allows you to send pins and notifications directly to your Pebble watch. 

You'll need to install the openHAB app on your Pebble watch and lookup the Timeline token. This token is displayed at the bottom of the configuration page when you configure the app on your phone.

## Configuration

You can either configure the required Pebble token in `services/pebble.cfg` and refer to it by name, or provide it explicitly in your action calls.

| Property | Default | Required | Description |
|----------|---------|:--------:|-------------|
| `<name>.token` | | | A token to use in action calls by name |

### Configuration Example

```
dave.token=88889999aaaabbbbccccddddeeeeffff
```

## Actions

* `pebblePin(String instanceOrToken, Date time, String title, String body)`: Insert a pin at a given time with a title and body. 
* `pebblePin(String instanceOrToken, Date time, String pinTitle, String actionTitle, String url)`: Insert a pin at a given time with a title and add an action. This action is a simple HTTP GET on the given url. 
* `pebbleNotification(String instanceOrToken, String title, String body)`: Push a notification directly, with the given title and body. 

All actions accept an instance name _or_ the timeline token as the first parameter.

## Examples

```
pebblePin("88889999aaaabbbbccccddddeeeeffff", now.toDate, "Dave left", "Dave is on his way")
pebblePin("dave", new DateTime().withHourOfDay(23).withMinuteOfHour(30).toDate, "Bed time", "Shutdown", "http://192.168.1.15:8090/CMD?Lights_All=OFF")
pebbleNotification("dave", "Dave left", "Dave left the house")
```
