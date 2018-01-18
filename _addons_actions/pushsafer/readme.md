---
id: pushsafer
label: Pushsafer
title: Pushsafer - Actions
type: action
description: "The Pushsafer action allows you to notify iOS, Android & Windows 10 Phone & Desktop devices of a message using the Pushsafer API web service."
source: https://github.com/openhab/openhab1-addons/blob/master/bundles/action/org.openhab.action.pushsafer/README.md
since: 1x
install: auto
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# Pushsafer Actions

The Pushsafer action allows you to notify iOS, Android & Windows 10 Phone & Desktop devices of a message using the Pushsafer API web service.

## Actions

The following is a valid action call that can be made when the plugin is loaded.
For specific information on each item, see the [Pushsafer API](https://www.pushsafer.com/en/pushapi).

```
pushsafer(String apiToken, String message, String title, String device, String icon, String vibration, String sound)
```

You must at least provide an API token (Private or Alias Key from Pushsafer.com) and a message in some manner before a message can be pushed.
All other parameters are optional.
If you use an alias key, the parameters (device, icon, sound, vibration) are overwritten by the alias setting on pushsafer.
