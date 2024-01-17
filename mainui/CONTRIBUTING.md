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

Inside these comments, the UI allows the following features:

- Embed [Framework7 icons](https://framework7.io/icons/) into the UI-rendered docs using these comments:
  - `<!--F7 $iconame -->`, where `$iconname` is a Framework7 icon's name
  - `<!--F7:blue $iconame -->` to set the icon's color to blue

  Please note that the docs website does NOT render these icons, so you should always describe the icon, e.g.:

  ```markdown
  Add ... using the <!--F7:blue plus_circle_fill --> plus button ...
  ```

- Link to UI pages by linking to
  - `.html` files inside this directory:<br>
    `[Items](items.html)` will navigate to `items/`.
  - a folder inside this directory:<br>
    `[Settings](settings)` will navigate to `/settings/`.

  Please consider that when adding or changing links inside the UI-shown content section.
  If you want to make sure you don't break anything, never change links without actually testing the consequences in Main UI.

`[Section A](#section-a)` links are currently not supported in the UI.
