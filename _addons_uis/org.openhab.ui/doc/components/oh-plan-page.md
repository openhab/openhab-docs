---
title: oh-plan-page - Floor plan
component: oh-plan-page
label: Floor plan
description: Displays markers on an image overlay
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-plan-page.md
---

# oh-plan-page - Floor plan

<!-- GENERATED componentDescription -->
Displays markers on an image overlay
<!-- GENERATED /componentDescription -->

## Configuration

<!-- GENERATED props -->

- `imageUrl` <small>TEXT</small> _Image URL_

  The URL of the image to display as background

- `imageWidth` <small>INTEGER</small> _Image Width_

  The width of the image (by default 1000 pixels). Please specify if the image is not square to compute the aspect ratio

- `imageHeight` <small>INTEGER</small> _Image Height_

  The height of the image (by default 1000 pixels). Please specify if the image is not square to compute the aspect ratio

- `noZoomOrDrag` <small>BOOLEAN</small> _Disable Zooming & Dragging_

  Disable the ability to zoom and drag

- `noZoomAnimation` <small>BOOLEAN</small> _No Zoom Animation_

  Change zoom levels without animation, can also avoid graphic glitches with persistent tooltips

- `noMarkerZoomAnimation` <small>BOOLEAN</small> _Hide Markers during Zoom Animation_

- `backgroundColor` <small>TEXT</small> _Background Color_

  Color outside the bounds of the image. "Black or White" means it will be black in dark mode and white in light mode

  | Option | Label |
  |--------|-------|
  | `(empty)` | Default |
  | `white` | Always White |
  | `black` | Always Black |
  | `blackwhite` | Black or White |


- `darkModeInvert` <small>BOOLEAN</small> _Invert Image in Dark Mode_

  Apply an invert filter to the image in dark mode - use with images in black & white or grayscale for best results

<!-- GENERATED /props -->
