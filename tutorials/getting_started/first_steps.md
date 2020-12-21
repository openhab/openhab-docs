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
Once openHAB is installed and started, launch the user interface by navigating to [http://localhost:8080]() (if not running locally, replace localhost with the server's address or hostname accordingly).
If you installed from the openHABian image, you can use [http://openhab:8080]().

By default, the administration pages can only be accessed if you are logged in with an administrator account.
Since there are no users yet, openHAB will ask you to create an administrator account.
The following screen should appear:

![](images/create_user.png)

After creating a first admin user you will be guided trough a first time setup wizard.

You have to add some geographical information and start (or skip) the setup wizard.

![](images/wizard_geo.png)

![](images/wizard_location.png)

You have the ability to install some addons if you already know that you will need them later.

![](images/wizard_addons.png)

After finishing the wizard you will get a welcome message and be redirected to your dashboard.

![](images/wizard_welcome.png)

![](images/welcome_page.png)

### Log in into dashboard with an existing user

To log in with an existing user you can do the following.
Click on the shield icon in the lower-left corner of the sidebar:

![](images/shield.png)

If you don't see it, click on the menu icon ![](menu_icon.png) located at the top-left corner to reveal the sidebar.
Once you have successfully created the admin account, you will be taken back to the previous screen, except the Administration area will now be accessible in the sidebar:

![](images/administrator.png)

Currently the only way to add additional users or manage existing ones (including changing passwords and attributing roles) is with the [Console]({{base}}/administration/console.html).

If you need to sign out, or check what sessions are open with this account with the option to terminate them, click on the account option which has replaced the "Unlock administration" shield:

![](images/account_option.png)

Note that by default, using openHAB doesn't require you to sign in.
Only administrative operations require a user with an administrator role to be logged in.

## Initial Settings

Most of the needed settings have already been accomplished, when you have followed the wizard.
Fro further configuration (e.g. the measurement system) click on Settings.

![](images/initial_settings.png)

Click on Regional Settings under System Services.

![](images/regional_settings.png)

If you're not using the metric system, click "Show advanced" and change the measurement system.

![](images/units_settings.png)

## Additional Settings
The following settings are available but not covered by this tutorial.

Setting | Purpose
-|-
Network Settings | Configure the default networks OH listens on and broadcasts on, IPV6, etc.
Audio | Configure the default microphone and audio destination
Ephemeris | Configure day types (e.g. which days of the week are weekends) and import your locale's holidays. Can be used in rules.
API Security | Allows Basic Auth to be used for accessing protected parts of the openHAB API. By default an authorization token or OAuth2 is required.
Addon Management | Choose whether to download add-ons when they are installed or use a locally stored collection of all the add-ons.
Persistence | Set the system-wide default persistence engine.
Json Storage | Settings for the automatic backup of UI generated configs.
Inbox | Settings that affect how Items are shown and approved in the Inbox where discovered Things appear.
Charts | Default settings for generated charts.
Voice | Settings for voice-to-text, text-to-voice and human language processing.
Other Services | The items that appear here will changed based on the set of add-ons installed. These are places to configure those bindings and capabilities (e.g. set up the connection for InfluxDB Persistence).
