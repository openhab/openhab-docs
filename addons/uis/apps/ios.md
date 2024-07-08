---
layout: documentation
title: iOS App
---

# iOS App

The openHAB iOS application is a native client for openHAB, compatible with iPhone and iPad.

## openHAB (Primary)

This is the primary openHAB app which contains the latest features and is updated regularly. This includes Apple Watch support, enhanced notifications, widgets and more.
Requires at least iOS 16 and openHAB 2.x and later.

(Official App Store Link Coming Soon)

<a href="https://testflight.apple.com/join/0uFYONeF"><img src="https://developer.apple.com/assets/elements/icons/testflight/testflight-128x128_2x.png" width="75" alt="Download on TestFlight"></a>
Beta releases are available on [TestFlight](https://testflight.apple.com/join/0uFYONeF).

## openHAB V1 (Legacy)

This is the legacy app for users on iOS 15 or earlier as well as openHAB system 1.x and later (tested to at least openHAB 4).
This app only receives security updates and minor fixes and is not intended for most users.

<a href="https://itunes.apple.com/us/app/openhab/id492054521?ls=1&mt=8"><img src="images/download-on-the-app-store.png" alt="Download on the App Store" width="150px"></a>

Beta releases are available on [TestFlight](https://testflight.apple.com/join/563WBakc).

## Features

- Control your openHAB server directly and through a [openHAB Cloud instance](https://github.com/openhab/openhab-cloud)
- [Enhanced push notification](#push-notifications) from openHAB Cloud and the openHAB cloud binding
- [Apple Watch](#apple-watch-configuration) companion app
- [Widgets](#widgets) (coming soon!)
- Natively supports both iPhone and iPad

<p float="left">
  <img src="images/mainui.png" alt="Main UI" width="200">
  <img src="images/sitemap.png" alt="Sitemap" width="200">
</p>

## App Configuration

<p float="left">
<img alt="Logo" src="images/settings1.jpeg" width="200">
<img alt="Logo" src="images/settings2.jpeg" width="200">
</p>

### Connection Settings

The app will try and connect using the Local URL as the primary connection, and if that fails or is not reachable, falls back to the Remote URL.  

### Demo Mode

This sets up the app to use the openHAB demo server and can be used to experience the app without needing to install openHAB.

#### Local URL

This is the primary connection to your openHAB instance, a fully qualified URL with a IP or host is required.

Example:
`https://openhab.local:8443`

#### Remote URL

This is the secondary connection to your openHAB instance, a fully qualified URL with a IP or host is required.
If using the openHAB cloud service, leave this as the default setting of `https://myopenhab.org`.
When set to the public cloud, the app will also register for push notifications (as long as credentials are correct)

Example:
`https://myopenhab.org`

### Username / Password

This will be sent if the local or remote server challenges for authentication, or if "Always Send Credentials" is checked on.
If using the openHAB cloud, these should be set to those login credentials.

### Application Settings

### Certificates

Allows the installation of p12 formatted certificates for use in client side authentication setups.

To install a client certificate, rename the certificate with the extension `.ohp12`, then send it to your iOS device (airdrop, icloud, dropbox, etc..), then open/save and select `openHAB` from the "Open In" menu (you may need to select "More..." to see all apps).

To delete a certificate, swipe left on the certificate name in the certificate menu.

If using openssl v3 to generate certificates, make sure to add `-legacy -certpbe pbeWithSHA1And40BitRC2-CBC` to the pk12 export command.
See [Apple OpenSSL 3.0.x Issues](https://github.com/openssl/openssl/issues/19871) for more information on V3 compatibility with Apple products.  

### Idle Timeout

Useful for wall or fixed installations, will disable the Idle screen timeout.

### Crash Reporting

Sends crash reports to Google / Firebase.

### Main UI Settings

#### WebRTC

Allows audio and video communications in the Main UI for views and widgets that require it.

#### Default Path

Allows the user to enter a path to act as the starting point when the Main UI is loaded.
Clicking the "+" button will prompt to enter the current path the of Main UI view.

#### Clear Cache

Clears the Main UI web cache.

### Sitemap Settings

#### Realtime Sliders

Allows sitemap sliders to send changes as the control is sliding in realtime.

### Image Cache

Clears the sitemap cached images.

### Icon Type

Select which type of icon the sitemap view will attempt to load for icons.

### Sitemap Sorting

Sort order when presenting multiple sitemaps for selection.

## Apple Watch Configuration

The Apple watch requires a sitemap with the name `watch.sitemap`.
Note that some advanced sitemap features may not be supported on the Apple watch and its recommended to keep this sitemap simple and appropriate for interaction on a small display.

When using the Watch app, slide left to bring up the configuration view and select "sync" to ensure the local, remote and username/password configurations are synced to the watch.

## Main UI and Sitemap Usage

<img alt="Side Menu" src="images/sidemenu.jpeg" width="200">

Clicking "Home" will navigate to the Main UI from the user's openHAB system.  Clicking this when the Main UI is already visible will force a reload the Main UI.

Tiles are the alternative UIs installed on a user's system and will be opened in an embedded browser.

Sitemaps show the available sitemaps on the users system.  Selecting a sitemap will present the native sitemap renderer view.

Notifications is a list of push notification retrieved from the openHAB cloud (if configured).

Settings opens the application settings view.

The app will persist the last primary view opened (Main UI or Sitemaps) when the app is opened or restarted.

## Push Notifications

The [openHAB Cloud Connector](https://next.openhab.org/addons/integrations/openhabcloud/)  allows users to send push notifications mobile devices registered with an [openHAB Cloud instance](https://github.com/openhab/openhab-cloud) such as [myopenHAB.org](https://www.myopenhab.org).

<p float="left">
<img alt="Notifications" src="images/notifications.png" width="500">
</p>

Push Notifications on iOS support:

- Title and message text
- Image and video attachments
- Up to 3 action buttons (long press notification)
- Collapsible / updated notifications
- Removing notifications

## Widgets

Coming soon !

## Help and Resources

If your question or problem isn't covered here in the documentation pages, check the [openHAB Community Forum](https://community.openhab.org).

Also, please refer to the [openhab.ios project](https://github.com/openhab/openhab.ios) on GitHub for more technical details.
