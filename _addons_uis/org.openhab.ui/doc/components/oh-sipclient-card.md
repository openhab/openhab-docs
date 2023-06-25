---
title: oh-sipclient-card - SIP Client Card
component: oh-sipclient-card
label: SIP Client Card
description: Use SIP over WebSocket to start and answer calls
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-sipclient-card.md
prev: /docs/ui/components/
---

# oh-sipclient-card - SIP Client Card

<!-- Put a screenshot here if relevant:
![](./images/oh-sipclient-card/header.jpg)
-->

<!-- GENERATED componentDescription -->
SIP Client to start and answer SIP calls
<!-- GENERATED /componentDescription -->

[[toc]]

## Usage

Usage is explained at the [`oh-sipclient` component docs](/docs/ui/components/oh-sipclient.html).

## Configuration

<!-- DO NOT REMOVE the following comments -->
<!-- GENERATED props -->
### Card
<div class="props">
<PropGroup name="card" label="Card">
  Parameters of the card
<PropBlock type="TEXT" name="title" label="Title">
  <PropDescription>
    Title of the card
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="footer" label="Footer text">
  <PropDescription>
    Footer of the card
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="noBorder" label="No Border">
  <PropDescription>
    Do not render the card border
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="noShadow" label="No Shadow">
  <PropDescription>
    Do not render a shadow effect to the card
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="outline" label="Outline">
  <PropDescription>
    Show the card outline
  </PropDescription>
</PropBlock>
</PropGroup>
</div>

### SIP Settings
<div class="props">
<PropGroup name="sip" label="SIP Settings">
<PropBlock type="INTEGER" name="iconSize" label="Icon Size">
  <PropDescription>
    Size of the icon(s) in px
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="websocketUrl" label="Websocket URL" required="true">
  <PropDescription>
    Full URL of the WebRTC SIP websocket, e.g. 'wss://siphost:8089/ws' or relative path, e.g. '/ws', for Android & iOS, you need wss (WebSocket secured)
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
    Single SIP Address (phone number) for a single call target or a comma-separated list of 'phoneNumber=name' for multiple call targets. Used as well to display a name instead of the number for incoming calls.
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
<PropBlock type="BOOLEAN" name="enableSIPDebug" label="Enable SIP debugging to the browser console (dev tools)">
</PropBlock>
</PropGroup>
</div>


<!-- GENERATED /props -->

<!-- If applicable describe how properties are forwarded to a underlying component from Framework7, ECharts, etc.:
### Inherited Properties

-->

<!-- If applicable describe the slots recognized by the component and what they represent:
### Slots

#### `default`

The contents of the oh-sipclient-card.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-sipclient-card/example1.jpg)

```yaml
component: oh-sipclient-card
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-sipclient-card/example2.jpg)

::: details YAML
```yaml
component: oh-sipclient-card
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
