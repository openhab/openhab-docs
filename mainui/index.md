---
layout: documentation
title: Main UI
---

# Main UI - Overview

<!-- START MAINUI SIDEBAR DOC - DO NOT REMOVE -->
Since openHAB 3.0, the so-called "Main UI" is the primary web user interface of openHAB.
It allows you to configure openHAB system, and provides a user interface for monitoring and control of your smart home.

If you are new to openHAB, please refer to the [Getting Started guide]({{base}}/tutorial/), which is introducing you to Main UI by using it to set up openHAB.

Users with the administrator role can use the left panel menu to access:

- [**Settings**](settings)<br>
  The settings menu provides access to all settings that are configurable from the UI.
- [**Add-on Store**](addons)<br>
  openHAB can and has to be extended via add-ons. Add-ons include bindings, automation, persistence and much more. Visit the store to discover all available add-ons.
- [**Developer Tools**](developer)<br>
  Special functions including creation of custom widgets and block libraries as well as the developer sidebar.
- [**Help & About**](about)<br>
  The about page shows general information of your openHAB configuration and allows to configure some client related configuration.

The left panel menu can be pinned to make it stay visible, but for a narrower screen, it may be hidden.
Pressing the key combination <kbd>Alt</kbd><kbd>Shift</kbd><kbd>M</kbd> on your keyboard will toggle the visibility of the left panel menu.
<!-- END MAINUI SIDEBAR DOC - DO NOT REMOVE -->

## Special Features

This section attempts to highlight some of Main UI's "special" features by linking to their respective documentation:

- [Developer Sidebar Search]({{base}}/mainui/developer/sidebar.html#developer-sidebar-search): Provides a universal search across nearly all UI-configurable entities (i.e. Items, rules etc.).
- [Web Audio Sink]({{base}}/mainui/about.html#web-audio-sink) support: Allows the openHAB server to play audio trough the browser on Main UI clients.
- [UI Command Item]({{base}}/mainui/about.html#ui-command-item): Allows the openHAB server to control Main UI, e.g. navigate to UI pages or display a notification.
