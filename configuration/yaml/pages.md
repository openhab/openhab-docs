---
layout: documentation
title: YAML Pages
---

# YAML Pages

This page describes the `pages` element for [YAML Configuration](./).

## Pages

The `pages` top-level key contains a map of Main UI pages, defined by their page UID.

The YAML structure matches the native Main UI page structure, wrapped in a `pages:` parent key.
Pages defined in YAML files are read-only in Main UI.

### YAML Definition Syntax

```yaml
pages:
  <page_uid>:
    component: <page component> # mandatory
    config:
      <config key>: <config value>
    slots:
      <slot_name>:
        - component: <child component>
          config:
            <config key>: <config value>
          slots:
            <slot_name>:
              - <nested UI component>
    tags:
      - <tag>
    props:
      parameters:
        - name: <prop name>
          label: <prop label>
          type: <prop type>
    timestamp: <timestamp>
```

- `<page_uid>`: The unique page UID used by Main UI.
- `component`: The component that defines the page type.
  This is mandatory and must match the page type you are defining.
  See [Supported Components](#supported-components) below.
- `config`: The page configuration map. The available keys depend on the page component.
- `slots`: A map of named slots containing UI components. This is where the page content is defined.
- `tags`: Optional tags attached to the page.
- `props`: Optional widget-style property definitions used by components inside the page.
- `timestamp`: Optional page timestamp.
  The following formats are supported: `MMM d, yyyy, h:mm:ss a`, `yyyy-MM-dd'T'HH:mm:ssXXX` (ISO 8601 with offset), `yyyy-MM-dd'T'HH:mm:ss`, (ISO8601) `yyyy-MM-dd HH:mm:ss`, or `yyyy-MM-dd` (date only).

### Supported Components

YAML pages support the following component names for the page type you are defining:

| Component        | Description                                                                                                                                                         |
|------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `oh-home-page`   | The Home Page is a unique page that configures how the default page is displayed when the main openHAB URL is accessed.                                             |
| `oh-layout-page` | [Layout Pages]({{base}}/ui/layout-pages.html) are used in the main web user interface to display widgets in an organized manner (responsive or fixed-grid layouts). |
| `oh-tabs-page`   | [Tabbed Pages]({{base}}/ui/tabbed-pages.html) to create composite pages that display other Pages in tabs.                                                           |
| `oh-map-page`    | [Map Pages]({{base}}/ui/map-pages.html) displays fixed markers or Location items on a map; supports markers and circle markers.                                     |
| `oh-plan-page`   | [Floorplan Pages]({{base}}/ui/floorplan-pages.html) displays markers or elements over a custom image background with zoom and pan.                                  |
| `oh-chart-page`  | [Chart Pages]({{base}}/ui/chart-pages.html) display historical values in a full-screen chart.                                                                       |

### Example

```yaml
version: 1

pages:
  filemap:
    component: oh-map-page
    config:
      label: testmap
      initialCenter: "-26.115986,145.898438"
    slots:
      default:
        - component: oh-map-marker
          config:
            label: New Marker
            item: SomeItem
          slots:
            default: []

  filetabs:
    component: oh-tabs-page
    config:
      label: testtab
    slots:
      default:
        - component: oh-tab
          config:
            title: New Tab
            icon: f7:squares_below_rectangle
          slots:
            default: []

  testpage:
    component: oh-layout-page
    config:
      label: yaml page
    slots:
      default:
        - component: oh-block
          slots:
            default:
              - component: oh-grid-row
                slots:
                  default:
                    - component: oh-grid-col
                      slots:
                        default:
                          - component: widget:custom-clock-card
```

### Notes

- Pages can be copy-pasted directly from the Main UI Code tab representation without any modifications, as its output already includes the required `version:` and `pages:` structure.
- When creating a file-based page manually, use the page UID as the map key.
- Unlike some other YAML entities, page content is mostly component-driven, so the useful keys under `config` and `slots` depend on the selected component.

### Special Cases for Home & Overview Pages

The `home` and `overview` pages are unique system configurations that require extra consideration when defining them via files:

- **The `home` Page:** This is the default page shown when opening your openHAB URL, which subsequently redirects to `/overview/`.
  It specifies the structure of the default landing page (such as defining the displayed Overview, Locations, Equipment, and Properties tabs) rather than holding actual UI controls.
  To use a file-based version, it **must** use the literal UID `home` and it must use `oh-home-page` as its component type.
  Because UIDs must be unique, any existing UI-managed page with the UID `home` must be deleted first for the file-based configuration to load.
  Be sure to copy its definition beforehand if you want to preserve your layout.
- **The `overview` Page:** This page sits inside the "Overview" tab of the home page and uses an `oh-layout-page` component.
  Much like the home page, it relies on the fixed UID `overview`.
  Only one instance can exist across the system; therefore, an existing UI-managed `overview` page must be deleted before your file-based one will be accepted. Be sure to copy the UI page definition beforehand if you want to preserve its contents.
