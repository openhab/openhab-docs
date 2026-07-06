---
layout: developersguide
title: Add-ons
---

# Developing an Add-on

{:.no_toc}

An add-on is an extension to openHAB that integrates external components like software services or hardware devices.
Depending on their use-case they have different types:

- `automation` for add-ons that provide scripting languages or rule templates
- `binding` for controlling physical devices or software systems
- `misc` for other integrations like Apple's HomeKit or the openHAB cloud
- `persistence` for services that can be used to store and read historical data
- `transform` for add-on that provide a way to manipulate values
- `ui` for bundles that provide UIs or UI-additions (like widgets)
- `voice` for add-ons that provide voice services

Every add-on needs to define a `addon.xml` file.
Find more information in the respective [Add-on XML reference](addon.html).

# Include the Add-on in the Build

Once you are happy with your implementation, you need to integrate it in the Maven build and add it to the official distro.

- Add a new line in the [bundle pom.xml](https://github.com/openhab/openhab-addons/blob/main/bundles/pom.xml).
- Add a new line in the [binding pom.xml](https://github.com/openhab/openhab-addons/blob/main/bom/openhab-addons/pom.xml).
- If you have a dependency on a transport bundle (e.g. upnp, mdns or serial) or an external library,
  make sure to add a line for this dependency in the `/src/main/feature/feature.xml` file in your add-on folder. See the other add-ons as an example.
- Add your binding to the [CODEOWNERS](https://github.com/openhab/openhab-addons/blob/main/CODEOWNERS) file so that you get notified by GitHUB when someone adds a pull request towards your add-on.

> Please make sure you add the above entries at their alphabetically correct position!

Before you create a pull request on GitHub, you should now run

```bash
mvn clean install
```

from the repository root to ensure that the build works smoothly (that step takes about 30 minutes).

The build includes [Tooling for static code analysis](https://github.com/openhab/static-code-analysis) that will validate your code against the openHAB Coding Guidelines and some additional best practices.
Please fix all the priority 1 issues and all issues with priority 2 and 3 that are relevant (if you have any doubt don't hesitate to ask).

You can always run the above command from within your add-on's directory to speed the build up and fix and check reported errors.
Formatting error can be fixed by

```bash
mvn spotless:apply
```

Re-run the build to confirm that the checks are passing.
If it does, it is time to [contribute your work](../contributing.html)!

# Add your add-on's logo to the openHAB website and the UI

After your pull request has been merged and the next openHAB version is released, your add-on will be available on the openHAB website and in the UI's add-on store with a default logo.

You can upload a logo to display it on the openHAB website (start page, add-on search and readme) and the UI.

These are the requirements for logos:

- SVG
- Less than 10 kB

In case you don't have an SVG version of the logo, you can instead provide a PNG version, these are the requirements for PNG logos:

- PNG (transparency is preferred)
- 512x512 pixels or smaller in one dimension, if it's not a square logo
- Less than 30kB

File size is key as the website displays hundreds of small logos on the same page:

SVG logos should normally be less than 10 kB, in case they are not, you may be able to shrink the file size be importing the SVG logo into a vector graphics software, e.g. Affinity Designer, and export it with a preset for small size.

To shrink the file size of PNG logos, save your logo with Palette-Based Colors (sometimes called "Indexed-RGBA").
Also, JPEG compression artifacts from prior conversions or halo around the logo increases file size dramatically.
You may use online converters to convert your True Color PNG logo to Palette-Based Colors, e.g. <https://compresspng.com/> or use zopflipng: `zopflipng -m --filters=0me --lossy_8bit --lossy_transparent -y logo.png logo.png`

_After_ your binding's pull request has been merged, you can upload your logo by filing another pull request to the [openhab-docs/images/addons/](https://github.com/openhab/openhab-docs/tree/main/images/addons) repository.
Your logo will be available after the next website build.
