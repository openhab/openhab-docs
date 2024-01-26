---
layout: documentation
title: Settings - Things
---

# Settings - Things

<!-- START MAINUI SIDEBAR DOC - DO NOT REMOVE -->
**Things** manage the physical layer of the openHAB system and represent individual devices or services.
The Things that you can add to your system are determined by the bindings that you have installed.

There is a [Things concepts page]({{base}}/concepts/things.html) that explains the idea of Things in detail.

On this page, you can manage all the Things you have added to your system:

- **Add new Things**<br>
  Use the [Thing Inbox](#inbox) to scan for available things or manually add ones that cannot be found automatically using the <!--F7:blue plus_circle_fill --> plus button.
- **Configure Things**<br>
  Click on any Thing in the list to see its configuration page and it's channels.
- **Delete Things**<br>
  Select multiple Things using the top **Select** button and use the **Remove** buttons at the bottom or use the <span style="color: red">Delete Thing</span> button on the individual Thing pages.
- **Enable/Disable Things**<br>
  Select multiple Things using the top **Select** button and use the **Enable** or **Disable** buttons at the bottom or use the <!--F7 pause_circle --> pause button on the individual Thing pages.
<!-- END MAINUI SIDEBAR DOC - DO NOT REMOVE -->

Adding Things via the user interface is described comprehensively in the tutorial section:

- [Adding Things - Simple]({{base}}/tutorial/things_simple.html)
- [Adding Things - Intermediate]({{base}}/tutorial/things_intermediate.html): Things that are dealing with a binding where the bridge-Thing cannot be automatically discovered.
- [Adding Things - Advanced]({{base}}/things_advanced.html): Things that do not support automatic discovery.

## Inbox

Many devices, technologies and systems can be automatically discovered on the network or browsed through some API.
It therefore makes a lot of sense to use these features for a smart home solution.

openHAB bindings can therefore implement Discovery Services for Things, which provide Discovery Results.
All Discovery Results are put into the Thing inbox, from where they can be easily added to openHAB with just a few clicks.

Please read [the tutorial]({{base}}/tutorial/things_simple.html#accept-the-light-bulb-things) to learn how to use the inbox.
