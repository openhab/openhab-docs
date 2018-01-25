---
layout: documentation
---

{% include base.html %}

# Add-ons

All add-ons for openHAB 2 are part of the distribution.
This includes all new 2.0 bindings as well as all 1.x add-ons that were reported to be compatible.
Add-ons can be installed easily in different ways, which are described below in detail.

| Add-on Type                             | Description                                                                                                               |
|-----------------------------------------|---------------------------------------------------------------------------------------------------------------------------|
| [Bindings](bindings.html)               | Bindings integrate physical hardware, external systems and web services in openHAB                                        |
| [User Interfaces](uis.html)             | User interfaces are either native smartphone apps or web applications that access the openHAB server through the REST API |
| [Persistence](persistence.html)         | Persistence services allow openHAB to store time series data for history-based actions or statistics                      |
| [Actions](actions.html)                 | Actions are predefined methods for openHAB rules and scripts                                                              |
| [Transformations](transformations.html) | Transformations are used to translate between technical and human-readable values for items                               |
| [Voice Services](voices.html)           | Services that provide voice enabling features, such as text-to-speech, speech-to-text etc.                                |
| [3rd Party System Integration](io.html) | Expose openHAB to external systems                                                                                        |

## Installation of Add-ons

Depending on the [package]({{base}}/configuration/packages.html) you have choosen during your first time setup, there are already some pre-installed add-ons.
Additional add-ons can be installed in the different ways, described below.

### Through Paper UI

Navigate to the add-ons section.
Search for the desired add-on in the categories and press install.

![installing Add-ons through Paper UI](images/index_installation_paperui.gif)

### From the openHAB Console

Connect to the [openHAB console]({{base}}/administration/console.html) in your prefered [way]({{base}}/administration/console.html#accessing-the-console).
Use either the [bundle]({{base}}/administration/bundles.html) command family to install a specific add-on:

```sh
bundle:install <URL-TO-ADD-ON-JAR-FILE>
```

You can find valid bundle `.jar` files on [cloudbees](https://openhab.ci.cloudbees.com) for example.
Just navigate to your desired add-on through the cloudbees page and copy the
url of the corresponding `.jar` file.

![installing Add-ons from Karaf console](images/index_installation_karaf.gif)

Or you could also use the feature command family to install a specific add-on:

```sh
feature:install <feature>[/version]
```

You can find out correct feature names with `feature:list`.
Optionally you can add the add-on version you want to install.
Running the command without the parameter, will install the latest stable version.

Example:

```sh
feature:install openhab-binding-network
```

### With a `.jar` file

For this installation option you need a bundles `.jar` file.
One way of retrieving those files is mentiones above in the openHAB consle part.

Place the `.jar` file in the `add-ons` folder on the machine you are running openHAB on.
The path is depending on your installation.
You can find out the correct locations on the corresponding documentation pages, e.g. [linux]({{base}}/installation/linux.html#file-locations) or [windows]({{base}}/installation/windows.html#file-locations).
