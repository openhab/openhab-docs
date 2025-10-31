---
title: oh-video-card - Video Card
component: oh-video-card
label: Video Card
description: Display a video (URL or URL from String item) in a card
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-video-card.md
prev: /docs/ui/components/
---

# oh-video-card - Video Card

<!-- Put a screenshot here if relevant:
![](./images/oh-video-card/header.jpg)
-->

[[toc]]

<!-- Note: you can overwrite the definition-provided description and add your own intro/additional sections instead -->
<!-- DO NOT REMOVE the following comments if you intend to keep the definition-provided description -->
<!-- GENERATED componentDescription -->
Display a video (URL or URL from String item) in a card
<!-- GENERATED /componentDescription -->

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

### Video
<div class="props">
<PropGroup name="video" label="Video">
<PropBlock type="TEXT" name="item" label="Item" context="item">
  <PropDescription>
    Item containing the address of the video
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="url" label="URL">
  <PropDescription>
    URL to show (if item if not specified)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="type" label="Type">
  <PropDescription>
    Content Type of the video, for example <em>video/mp4</em> (optional)
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="hideControls" label="Hide Controls">
  <PropDescription>
    Hide the control buttons of the video
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="startManually" label="Start Manually">
  <PropDescription>
    Does not start playing the video automatically
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="startMuted" label="Start Muted">
  <PropDescription>
    Mute audio output by default
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="posterItem" label="Poster Item" context="item">
  <PropDescription>
    Image item or String item containing the URL of an image to use as a poster before the video loads
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="posterURL" label="Poster URL">
  <PropDescription>
    URL of an image to use as a poster before the video loads (if item if not specified)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="playerType" label="Player Type">
  <PropDescription>
    Select the player type (optional), defaults to Video.js
  </PropDescription>
  <PropOptions>
    <PropOption value="videojs" label="Video.js (Dash, HLS, Others)" />
    <PropOption value="webrtc" label="WebRTC" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="stunServer" label="Stun Server">
  <PropDescription>
    WebRTC stun server (optional), defaults to 'stun:stun.l.google.com:19302'
  </PropDescription>
</PropBlock>
<PropBlock type="DECIMAL" name="candidatesTimeout" label="ICE candidates timeout">
  <PropDescription>
    WebRTC ICE candidates discovery timeout length in milliseconds (optional), defaults to '2000', '0' to disable
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="sendAudio" label="Two Way Audio">
  <PropDescription>
    Send audio to the WebRTC connection if supported (requires WebRTC player type)
  </PropDescription>
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

The contents of the oh-video-card.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-video-card/example1.jpg)

```yaml
component: oh-video-card
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-video-card/example2.jpg)

::: details YAML
```yaml
component: oh-video-card
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
