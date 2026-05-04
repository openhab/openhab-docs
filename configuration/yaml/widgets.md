---
layout: documentation
title: YAML Widgets
---

# YAML Widgets

This page describes the `widgets` element for [YAML Configuration](./).

## Widgets

The `widgets` top-level key contains a map of Main UI widgets, defined by their widget UID.

The YAML structure matches the native Main UI widget structure, wrapped in a `widgets:` parent key.
Widgets defined in YAML files are read-only in Main UI.

### YAML Definition Syntax

```yaml
widgets:
  <widget_uid>:
    component: <widget component> # mandatory
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

- `<widget_uid>`: The unique widget UID used by Main UI.
- `component`: The widget component type. This is mandatory.
- `config`: The widget configuration map.
- `slots`: A map of named slots containing nested UI components.
- `tags`: Optional tags attached to the widget.
- `props`: Optional widget property definitions. These correspond to the widget props used by Main UI and the marketplace.
- `timestamp`: Optional widget timestamp.
  The following formats are supported: `MMM d, yyyy, h:mm:ss a`, `yyyy-MM-dd'T'HH:mm:ssXXX` (ISO 8601 with offset), `yyyy-MM-dd'T'HH:mm:ss`, (ISO8601) `yyyy-MM-dd HH:mm:ss`, or `yyyy-MM-dd` (date only).

### Example

```yaml
version: 1

widgets:
  custom-clock-card:
    component: oh-clock-card

  custom-switch-card:
    component: oh-toggle-card
    config:
      title: Light Switch
      item: LivingRoom_Light
```

### Notes

- Widgets from the marketplace can usually be copied almost verbatim into a YAML file.
- Use the widget UID as the map key and indent the widget body underneath it.
- As with Main UI widgets in general, the supported `config`, `slots`, and `props` content depends on the selected widget component.
