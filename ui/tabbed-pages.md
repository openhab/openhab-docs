---
title: Tabbed Pages
---

# Tabbed Pages

Tabbed Pages are composite Pages which are able to display other Pages in tabs.

![Tabbed Example](./images/tabbed_example.png)

## Anatomy of a Tabbed Page

Tabbed pages are very simple: you can only add `oh-tabs` components which will have a label, icon, and a reference to another Page.
The tabs will be displayed in the order they're defined.

## Building a Tabbed Page

In the Design view, under Tabs, click **Add tab** to add another tab. Then click on the newly added entry to configure the tab. using the black context menu, you can reorder or remove existing tabs.

## Navigating Tabs

As you can see in the screenshot above, navigating through the tabs of tabbed pages is done through a toolbar on the bottom.

However, it is also possible to programatically navigate between the tabs, e.g. when using the [UI Command Item]({{base}}/mainui/about.html#ui-command-item) or the [actions of cloud notifications](/addons/integrations/openhabcloud/#title-tag-reference-id-media-attachments-actions)
This is done by providing the index of the tab in the route, e.g. assuming the UID of the tabbed page in the above example is `MyTabbedPage`, you can navigate to the "Isometric View" tab using the route `/page/MyTabbedPage/0`, to the "Kitchen Picture" tab using `/page/MyTabbedPage/1` and to the "Plan" tab using `/pages/MyTabbedPage/2`.
