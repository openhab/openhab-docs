---
layout: documentation
title:  Configuration
---

# Settings - Configuration

This section allows the configuration of things, items and user interface pages

- TOC
  [[toc]]

Next to the entity the count of that entity is shown, though the Things count is not the number of all configured Things but the count of the Things waiting in the [Inbox](/docs/tutorial/things_simple.html#accept-the-light-bulb-things).

![config-overview.png](images/config-overview.png)

## Things

_Things_ manage the physical layer of the openHAB System.
There is a [Things concepts page](/docs/concepts/things.html) that explains the idea of Things in detail.

The general explanation on how to **configure things** via things-files is described in the [Things configuration page](/docs/configuration/things.html)

Adding Things via the user interface as part of the _settings section_ is described comprehensively in the tutorial section

- [Addings Things - Simple](/docs/tutorial/things_simple.html)
- [Adding Things - Intermediate](/docs/tutorial/things_intermediate.html): Things that are dealing with a binding where the bridge-Thing cannot be automatically discovered.
- [Adding Things - Advanced](/docs/things_advanced.html): Things that do not support automatic discovery

## Semantic Model and Items

_Items_ manage the functional layer of openHAB.
Items, which are linked to a Thing, represent functionality that is used by the application (mainly user interfaces or automation logic).
Items have a state and are used through events.

There is an [Items concepts page](/docs/concepts/items.html) that explains the idea of Items in detail.

The general explanation on how to **configure items** via things-files is described in the [Items configuration page](/docs/configuration/items.html)

An integral part on how to model items is the [Semantic Model](/docs/tutorial/model.html) of your home which structures Items in a hierarchical, tree-like model.
That documentation also explains [how to build the Model](/docs/tutorial/model.html#building-the-locations-model) via the openHAB user interface.

## User Interface Pages

This configuration section allows to design displays for user control & monitoring.
openHAB 3 has introduced a new unified user interface called MainUI. Almost everything that can be configured in openHAB can be configured through MainUI.

Though openHAB automatically creates an [overview page](/docs/tutorial/auto_overview.html#overview-page) based on the semantic model, it also allows to design and create custom user interface pages with sophisticated [standard widgets](/docs/tutorial/item_widgets.html) and [custom widgets](/docs/tutorial/custom_widgets.html).
Therefore, it is highly recommended reading the [User Interface Design Overview](/docs/ui/) first.

The [pages tutorial section](/docs/tutorial/pages_intro.html) explains how to create and design user interface pages within openHAB.

Within this section the following page types can be created:

- [Layout](/docs/ui/layout-pages.html): Layout Pages are used in the main web user interface to display widgets in an organized manner.
- [Tabbed Pages](/docs/ui/tabbed-pages.html): Tabbed Pages are composite Pages which are able to display other Pages in tabs.
- [Charts](/docs/ui/chart-pages.html): Chart Pages can display historical values in a full-screenchart component.
- [Floor Plans](/docs/ui/floorplan-pages.html): Floorplan Pages can display markers or other elements over a custom image.
- [Map Views](/docs/ui/map-pages.html): Map Pages can display either fixed markers or markers representating items of type Location, on a map.
- [Sitemap](/docs/ui/sitemaps.html): Sitemaps have existed since the first versions of openHAB and were used as an easy way display items. Keep in mind that the main UI is not currently able to display them, though the mobile apps still are.
