---
title: Developer Tools - Overview
source: https://github.com/openhab/openhab-docs/blob/main/src/mainui/developer/index.md
meta:
  - property: og:title
    content: "Developer Tools - Overview"
  - property: og:description
    content: a vendor and technology agnostic open source automation software for your home
---

# Developer Tools - Overview

<!-- START MAINUI SIDEBAR DOC - DO NOT REMOVE -->
The developer tools page is split into two tabs:

- Expert Features
- Debugging Features: Test the SSE connection and test different implementations of an icon for different states.

## Expert Features

### Advanced Object Managment

- [**Widgets**](widgets)<br>
  Develop custom widgets, that can be then used on your pages. Community made widgets can be installed from the **UI** tab of the add-on store.
- **Block Libraries**<br>
  Even though Blockly comes with a large [library of blocks](/docs/configuration/blockly/) out of the box, you can still extend it by developing your own Block libraries.
- **Add Items from textual definition**<br>
  Create or update Items and links in bulk by using the [`.items`-file syntax](/docs/configuration/items).

### Maintenance Tools

- **Developer Sidebar**<br>
  The [developer sidebar](/docs/mainui/developer/sidebar) is accessible from anywhere in the UI and provides both an integrated help and developer tools, like the universal search or the widget expression tester.
  Open it from this page, with the help icon in the upper right corner, or with <kbd>Alt</kbd><kbd>Shift</kbd><kbd>D</kbd>.
  The integrated help also renders selected parts of the [Main UI documentation](/docs/mainui).
  So if you read this from the website, you can also read this from inside the UI.
- **API Explorer**<br>
  Interactively discover and access the [REST API](/docs/configuration/restdocs), which is also used by Main UI to interact with the openHAB server.
- [**Log Viewer**](log-viewer)<br>
  View the logs of the openHAB server in a convenient way. Filter, highlight, download and copy log messages.
  It can also be toggled from any page as a persistent bottom pane with the `square_list` icon in the upper right corner or with <kbd>Shift</kbd><kbd>Alt</kbd><kbd>L</kbd>.
  When visible, press <kbd>Shift</kbd><kbd>Alt</kbd><kbd>F</kbd> to maximize or restore it.
<!-- END MAINUI SIDEBAR DOC - DO NOT REMOVE -->

<EditPageLink/>
