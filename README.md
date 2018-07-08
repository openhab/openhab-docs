# openHAB 2.x Documentation Project

![](https://img.shields.io/badge/markdown_errors-0-orange.svg)
[![](https://img.shields.io/badge/linkchecker_errors-89-red.svg)](https://htmlpreview.github.io/?https://github.com/openhab/openhab-docs/blob/gh-pages/invalidlinks.html)
[![](https://img.shields.io/badge/linkchecker_warnings-421-yellow.svg)](https://htmlpreview.github.io/?https://github.com/openhab/openhab-docs/blob/gh-pages/invalidlinks.html)

## Introduction

This repository contains the documentation for openHAB.

The result is available at [https://www.openhab.org/docs/](https://www.openhab.org/docs/) and [http://docs.openhab.org/](http://docs.openhab.org/) [Deprecated]

## How it works

In this repo you can find and improve all *general* documentation contents.
In fact that is everything you can see in the `master` branch.
There are also other *read-only* branches, which hold external content like the *add-ons* and *concepts* documentation.
We will read about them later.

### So i can't improve a binding article here?

Correct, this is done in the corresponding addon repository.
You may want to know how to find the right file in all of those repos?
Thats fairly easy.
Just visit the page you want to improve in the docs directly.
You will find the following paragraph at the bottom, which will point you directly to the file you want to improve.

![Contribution link to a specific page](.images/contribution_link.png)

When your improvement has been made and merged, we will get the updated article automatically through our build mechanism.
This happens mostly once a day.
Afterwards your change is included in the next homepage build.

## Contributing to the Documentation

The documentation is a community effort, so everyone is welcome to suggest changes, add new sections and fix bugs.
This is done exactly the same way as for the code repositories, simply through pull requests against this repo.
Please read the [contribution guidelines](CONTRIBUTING.md) for details.

## So what are the other branches for?

We use them to bring together all relevant articles or to archive versioned content.
Mostly those branches will get updated automatically through our continuous integration builds.
You can read a bit more below about our external ressources and how we get them.

### Automatically Generated Parts

Those parts are __all__ binding documentation files, no matter if they are from the `openhab1-addons` repo or the `openhab2-addons` repo or any special binding repo like *habmin*, *zwave* or the *alexa skill*.
This includes also some concept articles from the eclipse smarthome repo.

We are keeping all those files at their original location, because it simply doesn't make sense to keep them here.
Imagine you want to do an improvement of the zwave binding and have to update the readme file in a completely different place.
That's twice the effort and also we would have to coordinate two Pull Requests.
So we are saving time for everyone in keeping those files over there.

### How the documentation build works

We have set up our [build server](https://openhab.ci.cloudbees.com/view/Documentation/) to do the magic automatically.
There are several triggers (mostly time based), which will then *gather the external contents* and move them to our *final* branch.
You can find these generated contents in the *final* branch under:

- `addons_*`
- `concepts`

You can even have a look at how this works in detail.
The script which does the work on our build server is `bash update-external-resources.sh` in the repo root.
The folders are updated by the following toolchain

- `update-external-resources.sh` → `pom.xml` → `process_addons.groovy`

This works similar for the *general* documentation contents.
Everything that gets updated in the *master* branch will be copied over to the *final* branch automatically.
Afterwards we will update everything to the website in fixed intervalls.

## Documentation Versioning

Just as openHAB is released in versions, the documentation website provides fixed versions of the documentation articles, e.g., [docs.openhab.org/v2.1/installation/linux.html](http://docs.openhab.org/v2.1/installation/linux.html)

Please see [this issue](https://github.com/openhab/openhab-docs/issues/520#issuecomment-339741820) for all details regarding the current implementation.
In short, the following has to be considered:

- Versions like "2.1.0" are marked by git tags.
- Based on tags branches like "2.1-patch" are created, to include later discovered changes (like fixed links).
