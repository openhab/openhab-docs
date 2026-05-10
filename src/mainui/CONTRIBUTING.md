# openHAB Main UI Documentation

The documentation located in this directory (`mainui`) is picked up by Main UI's sidebar help (<kbd>Shift</kbd><kbd>Alt</kbd><kbd>D</kbd>).

The file structure in this directory MUST NOT be changed, otherwise Main UI won't be able to pick up the docs!
To allow the embedding into the UI, some conventions have to be made:

## Conventions

In general, each `.md` file in this directory should provide a header section which is ready to be used in the UI.

The content to be shown in the UI has to be enclosed into these special comments:

```markdown
<!-- START MAINUI SIDEBAR DOC - DO NOT REMOVE -->
Lorem ipsum dolor sit amet, consectetur adipisici elit, ...
<!-- END MAINUI SIDEBAR DOC - DO NOT REMOVE -->
```

## Features && Behaviour

Inside these comments, the UI allows the following features:

- Embed [Framework7 icons](https://framework7.io/icons/) into the UI-rendered docs using these comments:
  - `<!--F7 $iconname -->`, where `$iconname` is a Framework7 icon's name
  - `<!--F7:blue $iconame -->` to set the icon's color to blue
  - `<!--F7:green $iconame -->` to set the icon's color to green

  Please note that the docs website does NOT render these icons, so you should always describe the icon, e.g.:

  ```markdown
  Add ... using the <!--F7:blue plus_circle_fill --> plus button ...
  ```

- Link to UI pages by linking to a file relative to the current file without adding a file extension, e.g.
  `[Rules](rules)` in [settings/index.md](settings/index.md) links to `/settings/rules/` or
  `[Settings](settings)` in [index.md](index.md) links to `/settings/`.

  **Please consider that when adding or changing links inside the UI-shown content section!**
  If you want to make sure you don't break anything, never change links without actually testing the consequences in Main UI.

- Link to other documentation pages by using links starting with ``{{base}}`` (recommended) or `/docs`, e.g.
  `[Inbox]({{base}}/tutorial/things_simple.html#accept-the-light-bulb-things)`

The following is not supported:

- Images are not loaded and not rendered, which means you can use images inside the comments, but they will only be shown on the website.
- `[Section A](#section-a)` links are currently not supported in the UI.

For advanced information on how the UI manipulates the documentation before rendering it, please have a look at the [source code](https://github.com/openhab/openhab-webui/blob/main/bundles/org.openhab.ui/web/src/components/developer/help/context.vue).
