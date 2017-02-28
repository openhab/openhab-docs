---
layout: documentation
title: AVM FRITZ! - Bindings
source: external
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# AVM FRITZ! Binding

The binding integrates the AHA ( [AVM Home Automation](http://avm.de/ratgeber/smart-home/) ) system.  


## Supported Things

### FRITZ!Box

The well known FRITZ!Boxes are supported as bridge for accessing other AHA devices. It is planned to support some channels directly at the bridge like call monitoring and others - but these things are under current development by now. The Box has to run at least on firmware FRITZ!OS 6.00 and hast to support the "Smart Home" service.

### FRITZ!DECT 200 / FRITZ!DECT 210

This switchable outlets [FRITZ!DECT 210](https://avm.de/produkte/fritzdect/fritzdect-210/) and [FRITZ!DECT 200](https://avm.de/produkte/fritzdect/fritzdect-200/) have to be connected to a FRITZ!Box by DECT protocol. They support switching the outlet, current power and accumulated energy consumption and temperature readings.

### FRITZ!DECT Repeater 100

This [DECT repeater](https://avm.de/produkte/fritzdect/fritzdect-repeater-100/) has to be connected to a FRITZ!Box by DECT protocol. It only supports temperature readings.

### FRITZ!Powerline 546E

This [powerline adapter](http://avm.de/produkte/fritzpowerline/fritzpowerline-546e/) can be used via the bridge or in standalone mode. It supports switching the outlet and current power and energy consumption readings. This device does not contain a temperature sensor.

## Discovery

The FRITZ!Box and the powerline adapter are discovered through UPNP in the local network. When added as things, a username/password has eventually to be set depending on your Box/Powerline security configuration. The credentials given in the settings must have HomeAuto permissions.

If correct credentials are set in the bridge configuration, connected AHA devices are discovered automatically (may last up to 3 minutes).


## Thing Configuration

### FRITZ!Box

* ipAddress (mandatory), default "fritz.box"
* protocol (optional, http or https), default "http"
* port (optional, 0 to 65335), no default (derived from protocol: 80 or 443)
* password (optional), no default (depends on FRITZ!Box security configuration)
* user (optional), no default (depends on FRITZ!Box security configuration)
* pollingInterval (optional, 5 to 60), default 15 (in seconds)
* asyncTimeout (optional, 1000 to 60000), default 10000 (in millis)
* syncTimeout (optional, 500 to 15000), default 2000 (in millis)

### FRITZ!Powerline 546E

* ipAddress (mandatory), default "fritz.powerline"
* protocol (optional, http or https), default "http"
* port (optional, 0 to 65335), no default (derived from protocol: 80 or 443)
* password (optional), no default (depends on FRITZ!Powerline security configuration)
* pollingInterval (optional, 5 to 60), default 15 (in seconds)
* asyncTimeout (optional, 1000 to 60000), default 10000 (in millis)
* syncTimeout (optional, 500 to 15000), default 2000 (in millis)

### AHA things connected to FRITZ!Box bridge

* AIN (mandatory), no default (AIN number of device)

## Channels

| Channel Type ID | Item Type    | Description  | Available on thing |
|-------------|--------|-----------------------------|------------------------------------|
| temperature | Number | Actual measured temperature (in °C) | FRITZ!DECT 210, FRITZ!DECT 200, FRITZ!DECT Repeater 100 |
| energy | Number | Accumulated energy consumption (in Wh) | FRITZ!DECT 210, FRITZ!DECT 200, FRITZ!Powerline 546E |
| power | Number | Current power consumption (in W) | FRITZ!DECT 210, FRITZ!DECT 200, FRITZ!Powerline 546E |
| outlet | Switch | Switchable outlet (ON/OFF) | FRITZ!DECT 210, FRITZ!DECT 200, FRITZ!Powerline 546E |

## Full Example

demo.Things:

```
Bridge avmfritz:fritzbox:1 [ ipAddress="192.168.xxx.xxx", password ="xxx", user="xxx" ] {
	FRITZ_DECT_200 xxxxxxxxxxx "Name"
	FRITZ_Powerline_546E yy:yy:yy:yy:yyy "Name"
}
```

demo.items:

```
Switch Outlet1 "Switchable outlet" { channel="avmfritz:FRITZ_DECT_200:1:DECT1:outlet" }
Number Temperature1 "Actual measured temperature [%.1f °C]" { channel="avmfritz:FRITZ_DECT_200:1:DECT1:temperature" }
Number Energy1 "Accumulated energy consumption [%.3 Wh]" { channel="avmfritz:FRITZ_DECT_200:1:DECT1:energy" }
Number Power1 "Current power consumption [%.2 W]" { channel="avmfritz:FRITZ_DECT_200:1:DECT1:power" }

Switch Outlet2 { channel="avmfritz:FRITZ_Powerline_546E:1:PL1:outlet" }
```

demo.sitemap:

```
sitemap demo label="Main Menu"
{
	Frame "FRITZ!DECT 200 switchable outlet" {
		Switch item=Outlet1 icon="PowerOutlet"
		Text item=Temperature1 icon="temperature"
		Text item=Energy1 icon="energy"
		Text item=Power1 icon="energy"
	}
	Frame "FRITZ!Powerline 546E switchable outlet" {
		Switch item=Outlet2
	}
}
```
