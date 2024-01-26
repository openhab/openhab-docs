---
layout: documentation
title: Settings - Persistence
---

# Settings - Persistence

<!-- START MAINUI SIDEBAR DOC - DO NOT REMOVE -->
**Persistence** stores data over time.
The data may be retrieved at a later time, for example to restore your system after startup, or to prepare graphs for display on the UI.

openHAB by default ships with the [RRD4J persistence service](/addons/persistence/rrd4j/) installed by default, which persists every Item on every state change and at least once a minute.
Additionally, it restores the last stored value at system startup.

To change this behaviour, you already found the correct page!

On this page, you can:

- Set the **default persistence service**.
- **Configure Persistence Policies**<br>
  For each installed persistence service, a list entry is added.
  Clicking on a persistence service from that list opens a page to create a new or edit the existing persistence configuration of that persistence service.
- **Install more persistence add-ons**<br>
  Click on the <!--F7:green plus_circle_fill --> plus button to switch to the add-ons store and install more persistence services.
<!-- END MAINUI SIDEBAR DOC - DO NOT REMOVE -->
