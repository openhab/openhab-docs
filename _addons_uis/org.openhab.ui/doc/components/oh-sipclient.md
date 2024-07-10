---
title: oh-sipclient - SIP Client
component: oh-sipclient
label: SIP Client
description: Use SIP over WebSocket to start and answer calls
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-sipclient.md
prev: /docs/ui/components/
---

# oh-sipclient - SIP Client

<!-- Put a screenshot here if relevant:
![](./images/oh-sipclient/header.jpg)
-->

<!-- GENERATED componentDescription -->
SIP Client to start and answer SIP calls
<!-- GENERATED /componentDescription -->

[[toc]]

The `oh-sipclient` component allows to call and answer SIP calls using the [JsSIP](https://jssip.net) library.

## Usage

### General

The color of the call icon depends on the state of the connection to the SIP server:
- yellow: no connection yet, but `oh-sipclient` tries to establish the connection 
- green: successfully connected to the SIP server, ready to perform calls

![](./images/oh-sipclient/outgoing.gif)

When the call button is green, a tap on it either directly starts a call or opens a popup to choose from the `phonebook` property.
As soon as you start an outgoing call, a hangup button will be displayed.
The hangup button is coloured yellow, if the call has not been accepted yet.
If the call has been accepted, the hangup button will become red.

![](./images/oh-sipclient/incoming.gif)

When a call is coming in, a green accept and a red decline button are displayed.
If the call is accepted, a red hangup button is accepted.
The number or the name (looked up in the `phonebook` property) of the caller is displayed between these two buttons, but this called id can be hidden.

`oh-sipclient` also supports video calling, playing ringtone as well as ringback sounds and performing DTMF operations, e.g. for doorstations to open the door.

This configuration is standard widget configuration and stored on the openHAB server, it is therefore shared across all clients.

### Intercom Functionality

It is even possible to establish an intercom functionality between multiple MainUI clients, e.g. between several wall-mounted tablets across your house.

To use the intercom functionality, it is required that each client gets his own SIP account configured.
This can be achieved by configuring the widget as usual, but setting SIP username & password in the `Local SIP Account Settings`:

1. Open the UI page with the `oh-sipclient` on the individual client.
1. Enter `Edit` mode.
1. `oh-sipclient` will show a button names `Local SIP Account Settings` in the upper right corner.
1. Insert your SIP account credentials, they are used instead of those stored on the openHAB server.
1. Insert the SIP address/phone number of your SIP account, it is used to hide your local identity from the call dial.

## SIP Connection State Item

The advanced `sipStateItem` property allows to define a String Item to publish the current SIP connection state to the openHAB server.

There are the following basic states:

- `connected`: The SIP client has connected to the SIP server and ready to make outgoing calls.
- `registered`: The SIP client has registered at the SIP server and ready to receive calls.
- `disconnected`: The SIP client has disconnected from the SIP server.

In addition, there are the following call states, which provide the caller ID of the remote party, e.g. `**620@fritz.box` after a colon:

- `incoming`: An incoming call is received, e.g. `incoming:**620@fritz.box`.
- `incoming-accepted`: An incoming call has been accepted and is now active, e.g. `incoming-accepted:**620@fritz.box`.
- `outgoing`: An outgoing call is started.
- `outgoing-accepted`: An outgoing call has been accepted and is now active.
- `ended`: The call has been ended.
- `failed`: The call has failed.

The `sipStateItem` is useful to track the SIP connection state on the openHAB server and work with it, e.g. in rules.

## Configuration

<!-- DO NOT REMOVE the following comments -->
<!-- GENERATED props -->
### General
<div class="props">
<PropGroup label="General">
<PropBlock type="INTEGER" name="iconSize" label="Icon Size">
  <PropDescription>
    Size of the icon(s) in px
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="websocketUrl" label="Websocket URL" required="true">
  <PropDescription>
    Full URL of the WebRTC SIP websocket, e.g. <code>wss://siphost:8089/ws</code> or relative path, e.g. <code>/ws</code>, for Android & iOS, you need <code>wss</code> (WebSocket secured)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="domain" label="SIP Domain" required="true">
</PropBlock>
<PropBlock type="TEXT" name="username" label="SIP Username">
</PropBlock>
<PropBlock type="TEXT" name="password" label="SIP Password">
</PropBlock>
<PropBlock type="BOOLEAN" name="enableTones" label="Enable tones">
  <PropDescription>
    Enable ringback and ring tone. Not recommended for mobile browsers, might cause issues. Ring tone might only work after interaction with the webpage.
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="phonebook" label="Phonebook" required="true">
  <PropDescription>
    Single SIP Address (phone number) for a single call target or a comma-separated list of <code>phoneNumber=name</code> for multiple call targets. Used as well to display a name instead of the number for incoming calls.
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="dtmfString" label="DTMF String">
  <PropDescription>
    Display a button to send a preset DTMF string while in calls for remote doors, gates, etc...
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="hideCallerId" label="Hide caller id">
  <PropDescription>
    Hides the username of the remote party for incoming calls.
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="enableVideo" label="Enable Video">
  <PropDescription>
    Enable video calling
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="enableLocalVideo" label="Enable Local Video View">
  <PropDescription>
    Display the local camera on video calls
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="defaultVideoAspectRatio" label="Default Aspect Ratio">
  <PropDescription>
    Default video aspect ratio used to size the widget before video is loaded. Defaults to 4/3, 16/9 and 1 are common alternatives.
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="disableRegister" label="Disable REGISTER">
  <PropDescription>
    SIP registration can be disabled in case you only want to initiate calls, but not receive calls with the SIP widgets.
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="autoAnswer" label="Auto Answer">
  <PropDescription>
    Automatically answer an incoming call from one of the comma delimited SIP addresses (<code>userInfo@hostname</code>, <code>userInfo</code>, ...) or use * for all incoming calls.
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="autoDial" label="Auto Dial">
  <PropDescription>
    Automatically dial the SIP address when loaded
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="stateItem" label="State Item" context="item">
  <PropDescription>
    String Item to publish the current SIP connection state to the openHAB server and make it accessible from rules etc.
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="enableSIPDebug" label="Enable SIP Debug">
  <PropDescription>
    Enable SIP debugging to the browser console (dev tools)
  </PropDescription>
</PropBlock>
</PropGroup>
</div>


<!-- GENERATED /props -->

<!-- If applicable describe how properties are forwarded to a underlying component from Framework7, ECharts, etc.: -->
### Inherited Properties

The `iconSize` property is forwarded to the `icon-size` property and the CSS `height` attribute of the [`f7-button`](https://framework7.io/vue/button).

The `defaultVideoAspectRatio` property is forwarded to the CSS `aspect-ratio` attribute of the `video-container` class.

<!-- If applicable describe the slots recognized by the component and what they represent:
### Slots

#### `default`

The contents of the oh-sipclient.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-sipclient/example1.jpg)

```yaml
component: oh-sipclient
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-sipclient/example2.jpg)

::: details YAML
```yaml
component: oh-sipclient
config:
  prop1: value1
  prop2: value2
slots
```
:::

-->

<!-- Try to clean up URLs to the forum (https://community.openhab.org/t/<threadID>[/<postID>] should suffice)
## Community Resources

- [Community Post 1](https://community.openhab.org/t/12345)
- [Community Post 2](https://community.openhab.org/t/23456)
-->
