---
layout: developersguide
title: Developer Guidelines on Semantic Tags
---

# Developer Guidelines on Semantic Tags

## Introduction

A semantic tag is an attribute of an openHAB [object](#objects-that-use-semantic-tags) that provides information to the openHAB User Interface about the type (i.e. the nature) of either things or items.
Note the use of the word `type`.

Semantic tags are divided into the following categories:

- EQUIPMENT (relates to the `type` of a piece of equipment)
- POINT (relates to the `type` of a particular data point within some equipment)
- PROPERTY (relates to the `type` of the information carried by a point)
- LOCATION (relates to the `type` of the location of an equipment or point).

## Purpose of Semantic Tags

The various equipment, points, properties, and locations are displayed in the openHAB User Interface in a hierarchical tree structure, which is based on a hierarchy of semantic tags defined in openHAB Core.
The primary purpose of semantic tags is to help the User Interface generate such a hierarchical tree structure of the user’s home system with its respective nested rooms, devices (things) and items.
Semantic tags are also used by HABot and end users in rules.

The purpose of this document is to provide rules for openHAB developers and openHAB maintainers in applying existing semantic tags as follows:

- By addon developers/reviewers at design time in the addon's `thing-type` and `channel-type` xml definitions.
- By addon developers/reviewers at run-time dynamically in the addon's Java code.
- By addon developers/reviewers in deciding whether to propose/approve a new semantic tag.

## Objects that use Semantic Tags

Semantic tags can be applied to the following openHAB objects with a chain of inheritance as follows:

- `Channel-Type` : POINT/PROPERTY tags applied at design time via the channel-type xml.
- `Channel` : POINT/PROPERTY tags inherited from `Channel-Type` above, and/or applied at run time in the binding.
- `Item` : POINT/PROPERTY tags inherited from Channel above, and/or all types of tags applied at run time by users.
- `Thing-Type` : EQUIPMENT tag (single) applied at design time in the thing-type xml.
- `Thing`: EQUIPMENT tag inherited from `Thing-Type` above, and/or applied at run time in the binding.
- `Semantic Model`: EQUIPMENT tree structure ("create equipment from thing") inherited from `Thing` above, and/or by users.

## General Rules for Semantic Tags

The list of semantic tags defined in openHAB Core is extensible.
This document describes the developer rules for applying or extending this list.

The core predefined semantic tags are presented to users as propositions, suggestions, or hints.
It is possible for users to add their own customised tags at their own discretion.
The remainder of this document does NOT relate to user customised tags.
It applies solely to the openHAB Core tags.

### Rules for **APPLYING** Core Predefined Semantic Tags

1. Developers MUST apply core predefined tags in their addons where possible.
1. Developers MAY hard code the tags in the ‘thing-type.xml’ or apply them dynamically at run time.
1. Developers SHALL NOT hard code LOCATION tags in the ‘thing-type.xml’.
1. Developers MAY apply LOCATION tags dynamically at run time (if the addon can determine the location).
1. Developers SHALL NOT apply customised tags in their addons.
1. Developers MAY apply a POINT tag without a PROPERTY tag (in cases where a property makes no sense). However, in such a case the developer MAY submit a new PROPERTY tag that fits.
1. Developers SHALL NOT apply a PROPERTY tag without a POINT tag.
1. Semantic EQUIPMENT tags MUST be applied at the thing level.
1. Semantic POINT and PROPERTY tags MUST be applied at channel level.
1. Developers MAY open a new PR to propose extensions to the core predefined tags as follows.

### Rules for **EXTENDING** Core Predefined Semantic Tags

The purpose of the semantic model is to provide a stable base set of tags for binding authors to use.
Submiting and adopting new tags should be a rare occurance.

11. New tags MUST fit within the hierarchy of semantic tags already defined in openHAB Core.
1. New tags SHALL NOT be synonyms of existing tags e.g. kitchen/kitchenette, sitting/living room.
1. New tags MUST show that new PROPERTY, POINT and EQUIPMENT tags could be applied to three or more bindings.
1. Developers MUST provide supporting evidence in their PR that the rules above and below are met.

## Equipment Tags

An EQUIPMENT tag describes the equipment type of a piece of equipment.
Examples are thermostat, pump, car, wall switch, push button, alarm system, or alarm detector.

16. New EQUIPMENT tags MUST describe the equipment type of a physical or virtual device.
1. New EQUIPMENT tags MUST be a noun.

## Point Tags

A POINT is a tag that describes the functional type (or purpose) of a data point within an equipment.
Examples are measurement, control, set point, or status.

18. New POINT tags MUST describe the functional type (or purpose) of the data point.
1. New POINT tags MUST be what you do to, or how you get, the state of the Item.

## Property Tags

A PROPERTY is a tag that describes the information type (or content type) of the data produced or consumed by a point.
Examples are temperature, brightness, on-off, time stamp

20. New PROPERTY tags MUST describe the information type (or content type) of the point.
1. New PROPERTY tags MUST be a noun and represent some attribute commonly controlled or sensed in a home automation context.
1. New PROPERTY tags MUST be defined in conjunction with a functional type of a POINT tag.

## Location Tags

A LOCATION is a tag that describes the location type of a point.
Its  most common use case is to put equipment into a location.
Examples are ground floor, dining (eating) room, kitchen (cooking room), living room, or garage.

23. New LOCATION tags SHALL NOT be synonyms of existing tags (see rule 13.)