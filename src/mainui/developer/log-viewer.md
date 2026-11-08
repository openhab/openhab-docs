---
layout: documentation
title: Developer Tools - Log Viewer
---

# Developer Tools - Log Viewer

<!-- START MAINUI SIDEBAR DOC - DO NOT REMOVE -->
Main UI provides an integrated log viewer that allows to view the logs of the openHAB server.
It provides filtering and highlighting capabilities, as well as download and copy options.

You can open the log viewer from **Developer Tools** or toggle it as a persistent bottom pane from any Main UI page.
Click the `square_list` icon in the upper right corner, next to the developer sidebar icon, or press <kbd>Shift</kbd><kbd>Alt</kbd><kbd>L</kbd>.
The pane remains visible while you navigate between pages.
When it is open, press <kbd>Shift</kbd><kbd>Alt</kbd><kbd>F</kbd> to maximize or restore it.

As the log viewer is using WebSockets to receive log messages, some restrictions apply:

- Fancy firewall rules or proxies may block the WebSocket connection.
- When using HTTPS with a self-signed certificate, your browser may block the WebSocket connection.
  In some browsers, it is possible to bypass this restriction by setting hidden flags, but unfortunately, this is not possible in all browsers.
  The only real solution is to use a valid certificate from a trusted certificate authority, which however either requires having a publicly accessible server (not recommended) or having your own CA.

<!-- END MAINUI SIDEBAR DOC - DO NOT REMOVE -->
