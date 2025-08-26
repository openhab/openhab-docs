---
layout: documentation
title: Developer Tools - Developer Sidebar
---

# Developer Tools - Developer Sidebar

<!-- START MAINUI SIDEBAR DOC - DO NOT REMOVE -->
Main UI provides a developer sidebar for administrator user(s), that is accessible from anywhere in the UI.
The developer sidebar is split into a "**Tools**" section with several useful tools including a [universal search]({{base}}/mainui/developer/sidebar.html#developer-sidebar-search), a widget expression tester,
and a "**Help**" section aiming at providing help and useful information regarding configuration and setup.
<!-- END MAINUI SIDEBAR DOC - DO NOT REMOVE -->

If your device's screen is wide enough (it has to be at least 1280 pixels wide), you can open the developer side-panel by:

- Opening the **Developer Tools** page from the menu and enabling the developer sidebar.
- Clicking on the help icon displayed in the upper right corner of most pages.
- Pressing the key combination <kbd>Alt</kbd><kbd>Shift</kbd><kbd>D</kbd> on your keyboard.

## Developer Sidebar Search

The Developer Sidebar provides a powerful, case-insensitive search across nearly all UI-configurable entities in Main UI — including Things, Items, Pages, Rules, Scenes, Scripts, and more.

Instead of manually digging through rules, scenes, scripts, persistence configurations, sitemaps, and pages to find where a string is used, the Developer Sidebar Search lets you locate all entities that contain the string, whether it’s an Item name, label, metadata, uid, or other textual content.

### Search Syntax

The Developer Sidebar supports extended syntax to help fine-tune your search results:

- **Whitespace** acts as a logical **AND**, meaning all separate terms must be present somewhere in the matched content.
- A single **pipe (`|`)** is treated as a logical **OR**, matching entries that contain any of the terms.
- Enclose a phrase with **double quotes (`"`)** to treat it as a single unit and avoid splitting it — useful for partial exact matches.
- Prefix with an **equals sign (`=`)** for full-string matches (still case-insensitive), ensuring the entire field matches the query.

| Token   | Meaning                                                                            |
|:--------|:-----------------------------------------------------------------------------------|
| `word`  | Find the word `word` anywhere within the text.                                     |
| `^word` | The matching field must begin with `word`.                                         |
| `word$` | The matching field must end with `word`.                                           |
| `=word` | Find an exact match (but still case-insensitive). The entire field must be `word`. |

Some examples:

- `living room` -> matches `Living Room Light`, `Light in the living Room`, `Room Living`
- `"living room"` -> matches `Living Room`, `Living Room1`, `Living Room Light`, `My Living Room Light` but not `Room Living` or `Living1 Room`.
- `="living room"` -> matches only the exact string `Living Room`.
- `living room | dining room` -> matches entries containing either (`Living` and `Room`) or (`Dining` and `Room`), e.g. `My Living Room`, `Living My Room`, `My Dining Room`.
  It will not match `Living Dining`.
- `^garden` -> matches `Garden Light`, not `Light in the Garden` or `Rose Garden`.

### Search Scope

Entities searched include:

- **Things**
  - UID, label
- **Items**
  - Name, label, tags, metadata
- **Pages** and **Sitemaps**
  - UID, label, content (widgets, tabs, charts, slots)
- **Widgets**
  - UID, props, slot content
- **Transformations**
  - UID, label, function
- **Rules**, **Scenes** & **Scripts**
  - UID, name, description, tags
  - Item name & Thing UID of triggers, actions & conditions
  - Script code (Rules DSL, JavaScript, Blockly, etc.)
  - Script MIME type
  - Blockly scripts (using `block`, `blockly` or `blocksource` as search string)
- **Persistence Configurations**:
  - Label, Service ID
  - Persisted Items
