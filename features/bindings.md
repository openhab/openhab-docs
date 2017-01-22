---
layout: documentation
title: Bindings
---

{% include base.html %}

# List of Available Bindings

## 2.0 Bindings
{% assign bindings = site.data.bindings | sort: 'label.toLowerCase()' %}

| Binding | Description |
|-------|----------------------|
{% for binding in bindings %}| [{{ binding.label }}]({{docu}}/features/bindings/{{ binding.id }}/readme.html) | {{ binding.description }} |
{% endfor %}					

## Compatible 1.x Add-ons

| Add-on | Type |
|--------|------|
| Anel | Binding |
| Astro | Binding |
| Comfo Air | Binding |
| Denon | Binding |
| DMX (OLA) | Binding |
| Ecobee | Action |
| Ecobee | Binding |
| EDS OWServer | Binding |
| Energenie | Binding |
| Enocean | Binding |
| Enphaseenergy | Binding |
| Epsonprojector | Binding |
| Exec | Binding |
| Freebox | Binding |
| Freeswitch | Binding |
| FS20 | Binding |
| Heatmiser | Binding |
| Homematic | Binding |
| HTTP | Binding |
| IHC | Binding |
| Intertechno | Binding |
| IRtrans | Binding |
| KNX | Binding |
| LCN | Binding |
| Milight | Binding |
| MiOS | Binding |
| Modbus | Binding |
| MQTT | Binding |
| MyQ | Binding |
| NeoHub | Binding |
| Nest | Binding |
| Netatmo | Binding |
| Networkhealth | Binding |
| Nibeheatpump | Binding |
| NTP | Binding |
| Onkyo | Binding |
| OpenEnergyMonitor | Binding |
| OneWire | Binding |
| RFXCOM | Binding |
| RWE SmartHome | Binding |
| Samsung AC | Binding |
| Sapp | Binding |
| Satel | Binding |
| Serial | Binding |
| SNMP | Binding |
| SwegonVentilation | Binding |
| SystemInfo | Binding |
| TCP | Binding |
| Tellstick | Binding |
| Tinkerforge | Binding |
| Weather | Binding |
| WOL | Binding |
| XBMC | Binding |
| ZWave | Binding |
| InfluxDB | Persistence |
| rrd4j | Persistence |
| MySQL | Persistence |
| MongoDB | Persistence |
| JPA | Persistence |
| Mail | Action |
| MiOS | Action |
| Pushover | Action |
| Telegram | Action |
| XBMC | Action |
| XMPP | Action |
| GoogleTTS | TTS engine |
| MaryTTS | TTS engine |

## Currently Incompatible 1.x Add-ons:

| Add-on | Type | Reason
|--------|------|------|
| CalDAV | Binding | see [issue 4074](https://github.com/openhab/openhab/issues/4074) |
| InsteonPLM | Binding | see [issue 3922](https://github.com/openhab/openhab/issues/3922) |
| SagerCaster | Binding | Not following the architecture guidelines, see [issue 3754](https://github.com/openhab/openhab/issues/3754) |
| Logging | Persistence | openHAB 2 does not use logback anymore |

## Compatible Applications

| Application | Description |
|-------|----------------------|
| [iot_bridge](https://github.com/openhab/openhab/wiki/ROS-Robot-Operating-System) | Bridge between ROS Robot Operating System and openHAB |
