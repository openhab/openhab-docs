---
id: prowl
label: Prowl
title: Prowl - Actions
type: action
description: "Prowl lets you use push notifications on iOS devices."
source: https://github.com/openhab/openhab1-addons/blob/master/bundles/action/org.openhab.action.prowl/README.md
since: 1x
install: auto
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# Prowl Actions

Prowl lets you use push notifications on iOS devices.

## Actions

- `pushNotification(String subject, String message)`: Pushes a Prowl Notification
- `pushNotification(String apikey, String subject, String message, int priority)`: Pushes a Prowl Notification with the given priority

## Configuration

This action service can be configured via the `services/prowl.cfg` file.

| Property        | Default | Required | Description |
| --------------- | ------- | -------- | ----------- |
| apikey          |         | Yes      | The apikey for authentication, generated on the Prowl website |
| defaultpriority | 0       | No       | The default priority of Prowl notifications                   |
| url             | https://prowl.weks.net/publicapi/ | No | The URL of the Prowl public api           |

