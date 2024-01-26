---
layout: documentation
title: Developer Tools - Developer Sidebar
---

# Developer Tools - Developer Sidebar

<!-- START MAINUI SIDEBAR DOC - DO NOT REMOVE -->
Main UI provides a developer sidebar for administrator user(s), that is accessible from anywhere in the UI.
The developer sidebar is split into a "tools" section with several useful tools including a [universal search]({{base}}/mainui/developer/sidebar#developer-sidebar-search) across nearly all UI-configurable entities and a widget expression tester,
and a "help" section aiming at providing help and useful information regarding configuration and setup.
<!-- END MAINUI SIDEBAR DOC - DO NOT REMOVE -->

If your device's screen is wide enough (it has to be at least 1280 pixels wide), you can open the developer side-panel by:

- Opening the **Developer Tools** page from the menu and enabling the developer sidebar.
- Clicking on the help icon displayed in the upper right corner of most pages.
- Pressing the key combination <kbd>Alt</kbd><kbd>Shift</kbd><kbd>D</kbd> on your keyboard.

## Developer Sidebar Search

As already mentioned, the developer sidebar provides a universal search across nearly all UI-configurable entities.
This means, you can search through most configuration available in Main UI, including Things, Items, pages.

Imagine you need to find all usages of an Item.
You could start to open all rules, scenes and scripts, check persistence configuration and have a look at pages and sitemaps to find usages of that Item - Or you use the developer sidebar search.

The developer sidebar search ignores case (so it doesn't matter whether you search `LivingRoom_Light` or `livingroom_light`) and searches inside the following entities:

- Things
  - UID
  - label
- Items
  - name
  - label
  - tags (requires exact match, i.e. if the Item has a tag `Lightbulb`, only the search query `Lightbulb` (case doesn't matter) will match)
  - metadata
- Pages (including Sitemaps)
  - uid
  - label
  - content (widgets, tabs, charts, etc. with their configuration)/slots
- Transformations
  - uid
  - label
  - type
- Rules, Scenes & Scripts
  - Item name & Thing UID of triggers, actions & conditions
  - script code (e.g. Rules DSL, JavaScript, and even Blockly)
  - script MIME types (requires exact match)
  - Blockly scripts (using `block`, `blockly` or `blocksource` as search string, where case is ignored)
  - tags (requires exact match)
- Persistence Configurations:
  - label & service id of persistence service
  - Items persisted by persistence service
