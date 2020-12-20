---
layout: documentation
title: Getting Started - First Steps
---

{% include base.html %}

# First Steps

The following instructions will guide you through the initial steps to take after first installing openHAB.

{::options toc_levels="2..4"/}

- TOC
{:toc}

## Create the Admin User
Once installed and started, launch openHAB's user interface by navigating to [http://localhost:8080]() (if not running locally, replace localhost with the server's address or hostname accordingly).
If you installed from the openHABian image, you can use [http://openhab:8080]().

The following screen should appear:
![](images/welcome_page.png)

By default, the administration pages can only be accessed if you are logged in with an administrator account.
Click on the shield icon in the lower-left corner of the sidebar:

![](images/shield.png)

If you don't see it, click on the menu icon ![](menu_icon.png) located at the top-left corner to reveal the sidebar.

Since there are no users yet, openHAB will ask you to create an administrator account.

![](images/create_user.png).

Currently the only way to add additional users or manage existing ones (including changing passwords and attributing roles) is with the [Console]({{base}}/administration/console.html).

Once you have successfully created the admin account, you will be taken back to the previous screen, except the Administration area will now be accessible in the sidebar:

![](images/administrator.png)

If you need to sign out, or check what sessions are open with this account with the option to terminate them, click on the account option which has replaced the "Unlock administration" shield:

![](images/account_option.png)

Note that by default, using openHAB doesn't require you to sign in, only administrative operations require a user with an administrator role to be logged in.

## Initial Settings
Click on Settings.

![](images/initial_settings.png)

Click on Regional Settings under System Services.

![](images/regional_settings.png)

Configure the local language, region and time zone.
You can also specify the exact location (latitude, longitude, altitude) of your home, which some add-ons can use to preset their configuration - for instance the Astro binding will use the location to determine the time of astrological events, like sunrise and sunset in your area.

If you're not using the metric system, click "Show advanced" and change the measurement system.

![](images/units_settings.png)

## Additional Settings
The following settings are available but not covered by this tutorial.

Setting | Purpose
-|-
Network Settings | Configure the default networks OH listens on and broadcasts on, IPV6, etc.
Audio | Configure the default microphone and audio destination
Ephemeris | Configure day types (e.g. which days of the week are weekends and import your locale's holidays), can be used in rules
API Security | Allows Basic Auth to be used for accessing protected parts of the openHAB API. Otherwise an authorization token or OAuth2 is required.
Addon Management | Whether to download add-ons when they are installed or use a locally installed collection of all the add-ons.
Persistence | Set the system wide default persistence engine.
Json Storage | Settings for the automatic backup of UI generated configs.
Inbox | Settings that affect how Items are shown and approved in the Inbox where discovered Things appear.
Charts | Default settings for generated charts.
Voice | Settings for voice-to-text, text-to-voice and human language processing.
Other Services | The items that appear here will changed based on the set of add-ons installed. These are places to configure those bindings and capabilities (e.g. set up the connection for InfluxDB Persistence).

Next: [Adding Things - Simple]({{base}}/tutorial/things_simple.html)
Previous: [Introduction]({{base}}/tutorial/index.html)