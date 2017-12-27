---
layout: tutorial-beginner
---

{% include base.html %}

# OpenHAB 2 UIs

OpenHAB 2 offers different UIs in its standard configuration: the *Paper UI*, the *Basic UI* and the *Classic UI* (this has to be installed manually from within Paper UI or via config file).

## The Paper UI

The Paper UI is a new interface that helps setting up and configuring your openHAB instance.
It does not (yet) cover all aspects, so you still need to resort to textual configuration files, but it already offers the following:

-   Add-on management: Easily install or uninstall openHAB add-ons
![](images/picture_05.jpg)

-   Thing discovery: See devices and services found on your network and add them to your setup.
![](images//picture_09.jpg)

-   Linking items to channels: Instead of adding a binding configuration to your item file, you can directly link Thing channels to your items.
![](images//picture_21.jpg)

Note that you still need to define your items, sitemaps, persistence configurations and rules in the according configuration files (as done in openHAB 1).
Such functionality will be added bit by bit to the Paper UI only.

All these aspects are explained in the rest of this tutorial.

Here you can find a small screencast about the Paper UI:

[![Paper UI](http://img.youtube.com/vi/MV2a5qwtmRE/0.jpg)](http://www.youtube.com/watch?v=MV2a5qwtmRE)

## The Basic UI

The Basic UI is a web interface based on Material Design Lite from Google. This interface is used to present the different sitemaps.

The UIs features are:

- Responsive layout suitable for various screen sizes
- AJAX navigation
- Live update<sup>1</sup>

<sup>1</sup>: as for now, only control states and icons are updated. Visibility changes require a page reload.

![](images/screenshot-1-full.png)

![](images/screenshot-2-full.png)

## The Classic UI

The Classic UI offers the same services that the Basic UI but with a different look and feel, close to an old iOS one.

![](images/classicui1.png)

![](images/classicui2.png)

Now let's start with the [configuration of openHAB 2]({{base}}/tutorials/beginner/configuration.html)
