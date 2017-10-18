---
id: cosm
label: Xively (formerly Cosm)
title: Xively (formerly Cosm) - Persistence Services
type: persistence
description: "This service allows you to feed item states to the [Xively IoT Platform](https://www.xively.com/)."
source: https://github.com/openhab/openhab1-addons/blob/master/bundles/persistence/org.openhab.persistence.cosm/README.md
since: 1x
install: manual
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# Xively (formerly Cosm) Persistence

This service allows you to feed item states to the [Xively IoT Platform](https://www.xively.com/).

This persistence service supports only writing information, and so features such as `restoreOnStartup` and sitemap Chart widgets cannot be used with this service.

## Prerequisites

You need a Xively API key and data feed in order to send data. Each item being persisted represens a separate datastream.

## Configuration

This service can be configured in the file `services/cosm.cfg`.

| Property | Default | Required | Description |
|----------|---------|:--------:|-------------|
| url      |         |   Yes    | The data feed URL to which your item states will be sent.  This is in the format `http://api.cosm.com/v2/feeds/<feed>/datastreams/`, where `<feed>` should be replaced with your data feed number. |
| apikey   |         |   Yes    | Your Xively API key |

All item and event related configuration is done in the file `persistence/cosm.persist`. Aliases correspond to cosm datastream IDs for the cosm persistence service.
