---
title: oh-location-card - Location Card
component: oh-location-card
label: Location Card
description: A card showing model items in a certain location
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-location-card.md
---

# oh-location-card - Location Card

<!-- GENERATED componentDescription -->
A card showing model items in a certain location
<!-- GENERATED /componentDescription -->

## Configuration

<!-- GENERATED props -->

### Model Card

General settings for this card


- `title` <small>TEXT</small> _Title_

  Title of the card

- `subtitle` <small>TEXT</small> _Subtitle_

  Subtitle of the card

- `backgroundColor` <small>TEXT</small> _Background Color_

  Color of the card's background; if unset, choose automatically from built-in defaults for certain semantic classes

  | Option | Label |
  |--------|-------|
  | `red` | Red |
  | `green` | Green |
  | `blue` | Blue |
  | `pink` | Pink |
  | `yellow` | Yellow |
  | `(empty)` | Orange |
  | `purple` | Purple |
  | `deeppurple` | Deep Purple |
  | `lightblue` | Light Blue |
  | `teal` | Teal |
  | `lime` | Lime |
  | `deeporange` | Deep Orange |
  | `gray` | Gray |
  | `black` | Black |


- `backgroundImage` <small>TEXT</small> _Background Image_

  URL of an image to display in the background

- `invertText` <small>BOOLEAN</small> _Invert Text_

  Display the text in black (for light backgrounds)

### Card at-a-glance badges


- `disableBadges` <small>BOOLEAN</small> _Disable badges_

  Do not examine items to display badges - can help with performance if you don't need them.

- `badges` <small>TEXT</small> _Enabled badges_

  Select the badges you wish to show in the header of the card. Display all if none are selected.

  | Option | Label |
  |--------|-------|
  | `lights` | Lights On |
  | `windows` | Open Windows |
  | `doors` | Open Doors |
  | `garagedoors` | Open Garage Doors |
  | `blinds` | Open Blinds |
  | `presence` | Presence Detected |
  | `lock` | Locks |
  | `climate` | Climate Control Powered On |
  | `screens` | Screens Powered On |
  | `projectors` | Projectors Powered On |
  | `speakers` | Speakers/AV Receivers Powered On |
  | `temperature` | Average Temperature (+ Setpoint) |
  | `humidity` | Average Humidity |
  | `luminance` | Average Luminance |

  Multiple options are allowed.


<!-- GENERATED /props -->
