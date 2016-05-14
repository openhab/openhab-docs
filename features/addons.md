---
layout: documentation
---

{% include base.html %}

# List of available Add-ons

All optional add-ons for openHAB 2 are part of the distribution. This includes all new 2.0 bindings as well as all 1.x add-ons that were reported to be compatible. If you are successfully using a 1.x add-on with the 2.0 runtime, which is not yet on this list, please create a PR for adding it.

## 2.0 Bindings

| Binding | Description |
|-------|----------------------|
| [Astro Binding](bindings-oh2/org.openhab.binding.astro/readme.html) | Astronomical calculations for sun and moon positions |
| [Autelis Binding](bindings-oh2/org.openhab.binding.autelis/readme.html) | Pool controller |
| [AVM Fritz!Box Binding](bindings-oh2/org.openhab.binding.avmfritz/readme.html) | currently only supports FRITZ AHA devices |
| [DSCAlarm Binding](bindings-oh2/org.openhab.binding.dscalarm/readme.html) | DSC PowerSeries alarm systems |
| [Freebox Binding](bindings-oh2/org.openhab.binding.freebox/readme.html) | the french [Freebox Revolution](http://www.free.fr/adsl/freebox-revolution.html) server |
| [HDanywhere Binding](bindings-oh2/org.openhab.binding.hdanywhere/) | HDMI matrix |
| [IPP Binding](bindings-oh2/org.openhab.binding.ipp/readme.html) | Internet Printing Protocol (replaces 1.x CUPS Binding) |
| [KEBA Binding](bindings-oh2/org.openhab.binding.keba/readme.html) | Electric vehicle charging station |
| [Kostal Inverter Binding](bindings-oh2/org.openhab.binding.kostalinverter/readme.html) | Photovoltaic converter |
| [FS Internet Radio Binding](bindings-esh/org.eclipse.smarthome.binding.fsinternetradio/readme.html) | Internet radios with chip from Frontier Silicon |
| [LIFX Binding](bindings-esh/org.eclipse.smarthome.binding.lifx/readme.html) | Wifi-enabled LED bulbs |
| [Lutron Binding](bindings-oh2/org.openhab.binding.lutron/readme.html) | Dimmers And Lighting Controls |
| [MAX! Binding](bindings-oh2/org.openhab.binding.max/readme.html) | Heater control solution by eQ-3 |
| [Network Binding](bindings-oh2/org.openhab.binding.network/) | Scans local network (replaces 1.x networkhealth Binding) |
| [NTP Binding](bindings-esh/org.eclipse.smarthome.binding.ntp/readme.html) | NTP time servers |
| [OpenSprinkler Binding](bindings-oh2/org.openhab.binding.opensprinkler/readme.html) | Open sprinkler system |
| [PioneerAVR Binding](bindings-oh2/org.openhab.binding.pioneeravr/readme.html) | AV receivers by Pioneer |
| [Philips Hue Binding](bindings-esh/org.eclipse.smarthome.binding.hue/readme.html) | LED lighting system |
| [Pulseaudio Binding](bindings-oh2/org.openhab.binding.pulseaudio/readme.html) | software-based audio distribution |
| [Rfxcom Binding](bindings-oh2/org.openhab.binding.rfxcom/readme.html) | 433MHz radio transceiver and devices |
| [SamsungTV Binding](bindings-oh2/org.openhab.binding.samsungtv/readme.html) | Samsung Smart TVs |
| [SMAEnergyMeter Binding](bindings-oh2/org.openhab.binding.smaenergymeter/readme.html) | SMA Energy Meter for photovoltaic systems |
| [Sonos Binding](bindings-esh/org.eclipse.smarthome.binding.sonos/readme.html) | Multi-room audio system |
| [Squeezebox Binding](bindings-oh2/org.openhab.binding.squeezebox/readme.html) | Logitech's connected speakers |
| [Tesla Binding](bindings-oh2/org.openhab.binding.tesla/readme.html) | Teslas Model S Electric Vehicle |
| [Vitotronic Binding](bindings-oh2/org.openhab.binding.vitotronic/readme.html) | Heating systems by Viessmann |
| [WeMo Binding](bindings-esh/org.eclipse.smarthome.binding.wemo/readme.html) | Switchable sockets by Belkin |
| [YahooWeather Binding](bindings-esh/org.eclipse.smarthome.binding.yahooweather/readme.html) | Weather information from Yahoo |
| [Z-Wave Binding](bindings-oh2/org.openhab.binding.zwave/readme.html) | Z-Wave radio controlled devices |

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

## Currently incompatible 1.x Add-ons:

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
