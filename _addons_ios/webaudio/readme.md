---
id: webaudio
label: Web Audio
title: Web Audio - System Integrations
type: io
description: "This IO bundle provides an `AudioSink` that is capable of accepting 'FixedLengthAudioStreams' and 'URLAudioStreams'."
since: 2x
install: auto
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# Web Audio

This IO bundle provides an `AudioSink` that is capable of accepting "FixedLengthAudioStreams" and "URLAudioStreams".
It defines and registers a new `Event` called `PlayURLEvent` to let eventbus consumers know that an audio stream should be played.
