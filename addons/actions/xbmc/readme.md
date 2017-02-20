---
layout: documentation
title: XBMC - Actions
source: https://github.com/openhab/openhab1-addons/blob/master/bundles/action/org.openhab.action.xbmc/README.md
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# XBMC Actions

Sends notifications to the Kodi open source home theater software (formerly known as XBMC).

## Actions

* `sendXbmcNotification(host, port, title, message)`: Sends a message to a given XBMC instance
*  `sendXbmcNotification(host, port, title, message, image, displayTime)`: Sends a message to a given XBMC instance (image=a URL pointing to an image, displayTime=a display time for the message in milliseconds)
