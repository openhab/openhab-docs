---
layout: documentation
title: MQTT - Actions
source: https://github.com/openhab/openhab1-addons/blob/master/bundles/action/org.openhab.action.mqtt/README.md
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# MQTT Actions

Publish a message to a topic on an MQTT broker.

## Prerequisites

In addition to the MQTT Action service, the MQTT binding (1.x) must be installed and configured.  The action can refernce the broker(s) that are configured for the MQTT binding.

## Action

* `publish(String brokerName, String topic, String message)`: Publish the message to topic using the specified MQTT broker.