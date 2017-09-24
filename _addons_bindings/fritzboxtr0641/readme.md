---
id: fritzboxtr064
label: Fritzbox (using TR064 protocol)
title: Fritzbox (using TR064 protocol) - Bindings
type: binding
description: "This is a binding for communication with AVM Fritz!Box using SOAP requests (TR064 protocol)."
source: https://github.com/openhab/openhab1-addons/blob/master/bundles/binding/org.openhab.binding.fritzboxtr064/README.md
since: 1x
install: auto
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# Fritzbox Binding (using TR064 protocol)

This is a binding for communication with AVM Fritz!Box using SOAP requests (TR064 protocol).

It has been tested on:

* 7270
* 7360SL (v6.30)
* 7390
* 6360 Cable (v6.04)
* 7490

## Features

* detect if MAC is online in network (presence detection)
* switching on/off 2,4Hz Wifi, 5GHz Wifi and Guest Wifi (if any)
* getting external IP address of fbox
* getting fbox model name
* call monitor
 * Switch Item: Receives "ON" state when call is incoming
 * Call Items: Shows external an internal number for incoming/outgoing calls
 * Resolve external call number to phonebook name
* enabling/disabling telephone answering machines (TAMs) 
* getting new messages per TAM
* getting missed calls for the last x days

## Prerequisites

* Enable TR064: In the webui goto "Heimnetz" - "Netzwerkeinstellungen": enable option "Zugriff für Anwendungen zulassen" (enabled by default)
* Only if you want to use the call monitor feature (items starting with callmonitor_...), enable the interface by dialing #96\*5\* You may disable it again by dialing #96\*4\*

## Binding Configuration

This binding can be configured in the file `services/fritzboxtr064.cfg`.

| Property | Default | Required | Description |
|----------|---------|:--------:|-------------|
| url      |         |   Yes    | URL. Either use `http://<fbox-ip>:49000` or `https://<fbox-ip>:49443` (https preferred!) |
| refresh  | 60000   |   No     | Refresh interval in milliseconds |
| user     | dslf-config |  No  | User Name.  Only use this value if you configured a user in fbox webui/config!  It is recommended to switch to authentication by username in fritzbox config and add a separate config user for this binding. |
| pass     |         |   Yes    | Password |


## Item Configuration

```
String  fboxName            "FBox Model [%s]"           {fritzboxtr064="modelName"}
# get wan ip if FritzBox establishes the internet connection (e. g. via DSL)
String  fboxWanIP           "FBox WAN IP [%s]"          {fritzboxtr064="wanip"}
# get wan ip if FritzBox uses internet connection of external router
String  fboxWanIPExternal   "FBox external WAN IP [%s]" {fritzboxtr064="externalWanip"}
Switch  fboxWifi24          "2,4GHz Wifi"               {fritzboxtr064="wifi24Switch"}
Switch  fboxWifi50          "5,0GHz Wifi"               {fritzboxtr064="wifi50Switch"}
Switch  fboxGuestWifi       "Guest Wifi"                {fritzboxtr064="wifiGuestSwitch"}
Contact cFboxMacOnline      "Presence (WiFi) [%s]"      {fritzboxtr064="maconline:11-11-11-11-11-11" }

# only when using call monitor
Switch  fboxRinging         "Phone ringing [%s]"                {fritzboxtr064="callmonitor_ringing" }
Switch  fboxRinging_Out     "Phone ringing [%s]"                {fritzboxtr064="callmonitor_outgoing" }
Call    fboxIncomingCall    "Incoming call: [%1$s to %2$s]"     {fritzboxtr064="callmonitor_ringing" } 
Call    fboxOutgoingCall    "Outgoing call: [%1$s to %2$s]"     {fritzboxtr064="callmonitor_outgoing" }

# resolve numbers to names according phonebook
Call    fboxIncomingCallResolved    "Incoming call: [%1$s to %2$s]"     {fritzboxtr064="callmonitor_ringing:resolveName" } 

# Telephone answering machine (TAM) items
# Number after tamSwitch is ID of configured TAM, start with 0
Switch  fboxTAM0Switch   "Answering machine ID 0"       {fritzboxtr064="tamSwitch:0"}
Number  fboxTAM0NewMsg   "New Messages TAM 0 [%s]"      {fritzboxtr064="tamNewMessages:0"}

# Missed calls: specify the number of last days which should be searched for missed calls
Number  fboxMissedCalls     "Missed Calls [%s]"         {fritzboxtr064="missedCallsInDays:5"}

```

## Known issues

See issues [here](https://github.com/gitbock/fritzboxtr064/issues?q=is%3Aissue+is%3Aclosed).
 

## Examples and Hints

### Sitemap

For the "Call" items use "Text" in your sitemap 

### Map for Presence Detection

Use a map for presence detection item:

Create file `transform/presence.map` and add:

```
1=present
0=not present
```

Now, as item configuration use:

```
Contact cFboxMacOnline      "Presence (Wifi) [MAP(presence.map):%d]"    <present>       {fritzboxtr064="maconline:11-22-33-44-55-66 }
```

### Rules

If you need the caller name (resolved from the fritzbox phonebook) in a rule, extract it like this:

```
rule "Phone is ringing"
when
    // fboxRinging is a switch item which switches to ON if call is detected
    Item fboxRinging changed from OFF to ON 
then
    logInfo("Anrufermeldung", "Generating caller name message...")
    // fboxIncoming call receives numbers/name of incoming call
    val CallType incCall = fboxIncomingCall.state as CallType
    var callerName = incCall.destNum //destNum is external number OR resolved Name if no phonebook entry exists

    // do something with callerName
end
```
