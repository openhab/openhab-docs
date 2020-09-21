---
id: habot
label: HABot
title: HABot - UIs
type: ui
description: "HABot is a chatbot for [openHAB](https://openhab.org), running inside the [Eclipse SmartHome](https://openhab.org/) runtime with no dependency; it can run offline and keep your data out of third-party clouds, but works very well remotely if served from an openHAB Cloud instance (like [myopenhab.org](https://www.myopenhab.org))."
since: 3x
install: manual
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# HABot

HABot is a chatbot for [openHAB](https://openhab.org), running inside the [Eclipse SmartHome](https://openhab.org/) runtime with no dependency; it can run offline and keep your data out of third-party clouds, but works very well remotely if served from an openHAB Cloud instance (like [myopenhab.org](https://www.myopenhab.org)).
In that scenario it can even be added to the Android homescreen as a [Progressive Web App](https://developers.google.com/web/progressive-web-apps/), and adds features working only on "secure origins" like push notifications, speech recognition and resource caching.

It consists in:

- a machine-learning natural language processor based on [Apache OpenNLP](https://opennlp.apache.org) for intent classification and entity extraction (thanks to [nlp-intent-toolkit](https://github.com/mlehman/nlp-intent-toolkit));
- a modular intent-based skill system with learning data provisioning (basic skills to retrieve item statuses, historical data and send basic commands are built-in, but more can be injected by other OSGi dependency injection);
- a fully-featured responsive card-based user interface built with the [Quasar Framework](http://quasar-framework.org) and its companion REST API to interact with the bot;
- an Eclipse SmartHome [Human Language Interpreter](http://docs.openhab.org/configuration/multimedia.html#human-language-interpreter) - this means once the natural language answers expand to more than "here's what I found" and "there you go", you will eventually be able to ask HABot questions and give it orders without a visual UI when coupled with speech-to-text and text-to-speech engines in ESH, for instance to build privacy-focused specialized voice assistant.

It is another step to have a full, open source, privacy-focused, integrated natural language processing toolchain for your openHAB smart home.

## Screenshots

<img src="https://i.imgur.com/dTGNui3.png" width="350"> <img src="https://i.imgur.com/3vtnzfY.png" width="350"> <img src="https://i.imgur.com/rh5Tljq.png" width="350"> <img src="https://i.imgur.com/l4ktHGZ.png" width="350">

## Walkthrough Series

Follow the [Walkthrough Series on the Community Forum](https://community.openhab.org/tags/c/apps-services/habot/walkthrough) to learn more HABot, its features and how to make the most out of it.
