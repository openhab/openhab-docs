---
layout: documentation
title: User Interfaces
---

{% include base.html %}

# User Interfaces

openHAB offers a variety of frontends for user interaction, from administrative web frontends to dedicated smartphone apps.

| Web Application | Description   |
|-----------------|---------------|
| [Basic UI]({{base}}/configuration/ui/basic/) | The Basic UI is an HTML5 web application in Material Design, designed for operating openHAB. |
| [Classic UI]({{base}}/configuration/ui/classic/) | The Classic UI is the original openHAB 1.x webui, designed for operating openHAB. |
| [HABmin]({{base}}/configuration/ui/habmin/l) | HABmin is a modern, professional and portable user interface for openHAB, providing both user and administrative functions. |
| [HABPanel]({{base}}/configuration/ui/habpanel/) | HABPanel is a lightweight dashboard interface for openHAB. |
| [Paper UI]({{base}}/configuration/ui/paperui/) | The Paper UI is an AngularJS-based HTML5 web application in Material Design, designed for setup and administration purposes. |
| [HaBot]({{base}}/configuration/ui/habot/) | A chatbot for openHAB |

| App     | Description          |
|---------|----------------------|
| [Android App]({{base}}/apps/android.html) | The native Android app to access openHAB on the go. |
| [iOS App]({{base}}/apps/ios.html) | The native iOS app to access openHAB on the go. |
| [Windows 10 App]({{base}}/apps/windows.html) | The native Windows 10 app to access openHAB on the go. |

## Iconsets

Basic UI, Classic UI and all openHAB apps present a graphical user interface as defined in [Sitemaps]({{base}}/configuration/sitemaps.html), with the help of [Items]({{base}}/configuration/items.html).
Each Item as well as each Sitemap element may be associated with an icon visible next to it.
Currently only the Classic Icon Set is provided.

Addition of personal icons and customization of the existing ones is supported and encouraged.
See the instructions about [Custom Icons and Custom Dynamic Icons]({{base}}/configuration/items.html#icons) for more details.

| Iconset | Description          |
|---------|----------------------|
| [Classic Icons]({{base}}/configuration/iconsets/classic/) | This is a modernized version of the original icon set of openHAB 1. |
