---
layout: documentation
title: iOS openHAB App
---

{% include base.html %}

## iOS openHAB App

<!-- https://developer.apple.com/app-store/marketing/guidelines/de/#downloadOnAppstore -->

We provide a native iOS app for openHAB, compatible with iPhone and iPad.
It uses the REST API of openHAB to render sitemaps of your openHAB installation.

### Features

* View and control openHAB sitemaps
* Connect to local openHAB instances on the local network
* Connect to your openHAB instance remotely, either using a direct connection or via myopenHAB
* Receive push notifications on your iOS devices via myopenHAB
* Natively supports both iPhone and iPad

### Screenshots

<div class="row">
  <div class="col s12 m4"><img src="images/ios01.png" alt="Demo Main Menu"></div>
  <div class="col s12 m4"><img src="images/ios02.png" alt="Demo Widget Overview"></div>
  <div class="col s12 m4"><img src="images/ios03.png" alt="Settings"></div>
</div>

### Installation and Setup

The latest release version of the app is always available through the Apple App Store.

[![Download openHAB app on the App Store](images/download-on-the-app-store.png)](https://itunes.apple.com/us/app/openhab/id492054521)

Upon first installation, the iOS openHAB app is set up to demo mode.
This allows you to explore the possibilities of an openHAB installation, but to view and control your own devices you'll need to connect to your own openHAB server.
If you haven't yet installed and configured openHAB, see the [openHAB installation](http://docs.openhab.org/installation/index.html) pages for more details.

To connect your iOS app to your openHAB server, navigate to the settings page, then disable the "Demo mode" checkbox. 
In the local URL field, enter either your server's IP address (It should look something like 'http://192.168.1.125:8080/') or, if available, your server's name (For openHABian, try 'http://openhabianpi.local:8080/').

You can also connect to openHAB remotely, using either a direct connection or myopenHAB.

### Help and Resources

If your question or problem isn't covered here in the documentation pages, check the [openHAB Community Forum](https://community.openhab.org). 

Also, please refer to the [openhab.ios project](https://github.com/openhab/openhab.ios) on GitHub for more technical details.