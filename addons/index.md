---
layout: documentation
---

{% include base.html %}

# Add-ons

All add-ons for openHAB 2 are part of the distribution.
This includes all new 2.0 bindings as well as all 1.x add-ons
that were reported to be compatible.
Add-ons can be easily installed through the Paper UI (menu entry "Add-ons").

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

Add-ons can be installed in different ways.

### Through Paper UI

Navigate to the add-ons section.
Search for the needed add-on in the categories and press install.

![installing Add-ons through Paper UI](images/index_installation_paperui.gif){: width="720px"}

### From the Karaf Console

Connect to the device which is running openHAB and ssh into the karaf console.
Use the following command to install a specific add-on:

```sh
bundle:install <URL-TO-ADD-ON-JAR-FILE>
```

You can find valid bundle *.jar* files on [cloudbees](https://openhab.ci.cloudbees.com)
for example.
Just navigate to your needed add-on through the cloudbees page and copy the
url of the corresponding *.jar* file.

![installing Add-ons from Karaf console](images/index_installation_karaf.gif){: width="720px"}

### With a *.jar* file

Place the file in the add-ons folder on the machine you are running openHAB.
The path is depending on your installation.

You can find out the correct locations on the corresponding documentation
pages like the [linux]({{base}}/installation/linux.html#file-locations)
or [windows]({{base}}/installation/windows.html#file-locations) page.
