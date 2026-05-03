---
layout: documentation
title: YAML Pages
---

# YAML Pages

This page describes the `pages` element for [YAML Configuration](./).

[[toc]]

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

| Component        | Description                                                                                                                                                          |
|------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `oh-layout-page` | [Layout Pages]({{base}}/ui/layout-pages.html)  are used in the main web user interface to display widgets in an organized manner (responsive or fixed-grid layouts). |
| `oh-tabs-page`   | [Tabbed Pages]({{base}}/ui/tabbed-pages.html) to create composite pages that display other Pages in tabs.                                                            |
| `oh-map-page`    | [Map Pages]({{base}}/ui/map-pages.html) displays fixed markers or Location items on a map; supports markers and circle markers.                                      |
| `oh-plan-page`   | [Floorplan Pages]({{base}}/ui/floorplan-pages.html) displays markers or elements over a custom image background with zoom and pan.                                   |
| `oh-chart-page`  | [Chart Pages]({{base}}/ui/chart-pages.html) display historical values in a full-screen chart.                                                                        |

The `oh-home-page` component is not supported for file-based YAML pages.

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

- Pages can be copy-pasted from the Main UI YAML representation, then wrapped under `version: 1` and `pages:`.
- When creating a file-based page manually, use the page UID as the map key.
- Unlike some other YAML entities, page content is mostly component-driven, so the useful keys under `config` and `slots` depend on the selected component.
