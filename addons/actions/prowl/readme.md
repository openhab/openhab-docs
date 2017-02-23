---
layout: documentation
title: Prowl - Actions
source: https://github.com/openhab/openhab1-addons/blob/master/bundles/action/org.openhab.action.prowl/README.md
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# Prowl Actions

Prowl lets you use push notifications on iOS devices (please check openhab.cfg for required configuration settings):

## Actions

* `pushNotification(String subject, String message)`: Pushes a Prowl Notification
* `pushNotification(String apikey, String subject, String message, int priority)`: Pushes a Prowl Notification with the given priority
