---
layout: documentation
title: Sailfish OS App
description: native Sailfish OS client for openHAB - the vendor and technology agnostic open source automation software
source: https://github.com/openhab/openhab-sailfishos/blob/main/docs/USAGE.md
---

# Sailfish OS App

The openHAB Sailfish OS application is a native client for openHAB, compatible with phones and tablets.
The app follows the basic principles of the other openHAB UIs, like Basic UI, and presents your predefined openHAB [sitemap(s)](https://www.openhab.org/docs/ui/sitemaps.html) and other UIs, like Main UI.

<a href="https://github.com/openhab/openhab-sailfishos/releases"><img src="images/get-it-on-logos/get-it-on-jollaStore.png" alt="Get it on Jolla Store" height="80"></a>
<a href="https://openrepos.net/content/openhabfoundationev/openhab-smart-home-automation"><img src="images/get-it-on-logos/get-it-on-openrepos.png" alt="Get it on OpenRepos" height="55"></a>
<a href="https://github.com/openhab/openhab-sailfishos/releases"><img src="images/get-it-on-logos/direct-apk-download.png" alt="Get it on GitHub" height="80"></a>

[[toc]]

## Features

- Demo Mode: Explore the app without connecting to an openHAB server
- Local authentication supported - if enabled on openHAB server.
- Display your Main UI Webview
- Display your sitemaps and widgets and control your devices from your mobile device
- Supported widgets/element-types within sitemap: Frame, Text, Group, Switch, Switches with Button-Mappings, Selections, Slider, Rollershutter, Colorpicker, Setpoint, Image, Mapview, Input, Webview, Video, Colortemperaturepicker, Buttongrid, Chart
- Customizable CoverAction-Buttons via Settings
- Customizable CoverPage (display of max. 2 item states) via Settings

<div class="row">
  <img src="images/main-ui.png" alt="Main UI" width="200">
  <img src="images/sitemap-1.png" alt="Sitemap view" width="200">
  <img src="images/sitemap-2.png" alt="Sitemap view" width="200">
</div>

## App Configuration

<p float="left">
<img src="images/settings-1.png" alt="Settings" width="200">
</p>

### Connection Settings

#### Demo Mode

This sets up the app to use the openHAB demo server and can be used to experience the app without needing to install openHAB.

Disable this to use the app with your own openHAB instance.

#### Local Server

- URL: This is the primary connection to your openHAB instance, a fully qualified URL with an IP address or hostname is required.

Example:
`http://192.168.0.10:8080`
`https://testdomain.com`

- Username: The username of your openHAB user (if authentication is enabled on your openHAB server).
- Password: The password of your openHAB user (if authentication is enabled on your openHAB server). Your password will be saved obfuscated on your device and is not shared with anyone.

### Cover Actions

Allows you to set custom App-Cover-Quick-Actions for the cover widget when you view all open applications.

<div class="row">
  <img src="images/cover-with-coveractions.png" alt="Cover with coveractions" width="200">
  <img src="images/settings-1.png" alt="Settings" width="200">
  <img src="images/settings-2.png" alt="Settings" width="200">
</div>

- Left button - Item-ID: The [Name](https://www.openhab.org/docs/configuration/items.html#name) (Item-ID -- **not** the label) of the item you want to send a command to when the left button is pressed.
- Left button - Command: The command (eg. ON, OFF, UP, DOWN) you want to send to the item when the left button is pressed.
- Right button - Item-ID: The [Name](https://www.openhab.org/docs/configuration/items.html#name) (Item-ID -- **not** the label) of the item you want to send a command to when the right button is pressed.
- Right button - Command: The command (eg. ON, OFF, UP, DOWN) you want to send to the item when the right button is pressed.

Note: If you don't want to use App-Cover-Quick-Actions, please leave the fields empty.
You can also use one button only, just leave the other button configuration empty.
It will be deactivated if no Item-ID AND command is provided.

### Cover Items

Allows you to set two items for app cover display. The state of these items will be displayed on the app cover when you view all open applications.

<div class="row">
  <img src="images/cover-with-coveractions.png" alt="Cover with coveractions" width="200">
  <img src="images/settings-1.png" alt="Settings" width="200">
  <img src="images/settings-2.png" alt="Settings" width="200">
</div>

- Item-ID: The [Name](https://www.openhab.org/docs/configuration/items.html#name) (Item-ID -- **not** the label) of the item you want display on the app cover.
- Item-ID: The [Name](https://www.openhab.org/docs/configuration/items.html#name) (Item-ID -- **not** the label) of the item you want display on the app cover.
- Item-refresh-interval: The interval in milliseconds in which the app should refresh the state of the items for display on the cover.

Note: If you don't want to display item values on your app cover, please leave the fields empty.
You can also use one item only, just leave the other item configuration empty.

## Navigation, Main UI and Sitemap Usage

Tap the hamburger menu at the top right to open the menu and navigate to the Main UI, sitemaps or settings.

<div class="row">
  <img src="images/main-ui.png" alt="Main UI" width="200">
  <img src="images/navigation-page.png" alt="Navigation" width="200">
</div>

Pull-Up: Use the native [Pulley Menu](https://docs.sailfishos.org/Develop/Apps/UI/#gestures-for-navigation-and-actions) gesture:

- Scroll to top: Scrolls to the top of the current view.

Pull-Down: Use the native [Pulley Menu](https://docs.sailfishos.org/Develop/Apps/UI/#gestures-for-navigation-and-actions) gesture:

- Refresh Sitemap: Will load current sitemap again and update all item states. Only needed if you change your sitemap structure on openHAB server and want to see the changes in the app without switching to another sitemap and back again.

## Contributing to the project

We are happy about any contribution to the project, whether it's bug fixes, new features, translations or documentation.

Please check out our GitHub repository for more information on how to contribute.

## Trademark Disclaimer

Product names, logos, brands and other trademarks referred to within the openHAB website are the property of their respective trademark holders.
These trademark holders are not affiliated with openHAB or our website.
They do not sponsor or endorse our materials.

Sailfish OS and the Sailfish OS logo are trademarks of Jolla Group Ltd.
