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

- By addon developers/reviewers at design time in the addon's `thing-type.xml` and `channel-type.xml` definitions.
- By addon developers/reviewers at run-time dynamically in the addon's Java code.
- By addon developers/reviewers in deciding whether to propose/approve a new semantic tag.

## Objects that use Semantic Tags

Semantic tags can be applied to the following openHAB objects with a chain of inheritance as follows:

- `Channel-Type` : POINT/PROPERTY tags applied at design time via the `channel-type.xml`.
- `Channel` : POINT/PROPERTY tags inherited from the `Channel-Type` above, and/or applied at run time by the binding Java code.
- `Item` : POINT/PROPERTY tags inherited from the `Channel` above, and/or all types of tags applied at run time by users.
- `Thing-Type` : EQUIPMENT tag (single) applied at design time in the `thing-type.xml`.
- `Thing`: EQUIPMENT tag inherited from the `Thing-Type` above, and/or applied at run time by the binding Java code.
- `Semantic Model`: EQUIPMENT tree structure ("create equipment from thing") inherited from the `Thing` above, and/or by users.

## General Rules for Semantic Tags

The list of semantic tags defined in openHAB Core is extensible.
This document describes the developer rules for applying or extending this list.

The core predefined semantic tags are presented to users as propositions, suggestions, or hints.
It is possible for users to add their own customised tags at their own discretion.
The remainder of this document does NOT relate to user customised tags.
It applies solely to the openHAB Core tags.

This following uses terms "MUST", "MAY", "SHALL", "SHALL NOT", etc. that are defined in Internet Standard [RFC-2119](https://datatracker.ietf.org/doc/html/rfc2119)

### A. Rules for **APPLYING** Core Predefined Semantic Tags

1. Developers MUST apply core predefined tags in their addons where possible.
1. Developers MAY hard code the tags in the `thing-type.xml` or apply them dynamically at run time via the Java code.
1. Developers SHALL NOT apply LOCATION tags either in the `thing-type.xml`, or via the Java code.
1. Developers SHALL NOT apply customised tags in their addons.
1. Developers MAY apply a POINT tag without a PROPERTY tag (in cases where a property makes no sense). However, in such a case the developer MAY submit a new PROPERTY tag that fits.
1. Developers SHALL NOT apply a PROPERTY tag without a POINT tag.
1. Semantic EQUIPMENT tags MUST be applied at the thing level.
1. Semantic POINT and PROPERTY tags MUST be applied at channel level.
1. Developers MAY open a new PR to propose extensions to the core predefined tags as follows.

### B. Rules for **EXTENDING** Core Predefined Semantic Tags

The purpose of the semantic model is to provide a stable base set of tags for binding authors to use.
Submiting and adopting new tags should be a rare occurance.

1. New tags MUST fit within the hierarchy of semantic tags already defined in openHAB Core.
1. New tags SHALL NOT be synonyms of existing tags e.g. kitchen/kitchenette, sitting/living room.
1. New tags MUST show that new PROPERTY, POINT and EQUIPMENT tags could be applied to three or more bindings.
1. Developers MUST provide supporting evidence in their PR that the rules above and below are met.

## C. Rules for extending EQUIPMENT Tags

An EQUIPMENT tag describes the equipment type of a piece of equipment.
Examples are thermostat, pump, car, wall switch, push button, alarm system, or alarm detector.

1. New EQUIPMENT tags MUST describe the equipment type of a physical or virtual device.
1. New EQUIPMENT tags MUST be a noun.

## D. Rules for extending POINT Tags

A POINT is a tag that describes the functional type (or purpose) of a data point within an equipment.
Examples are measurement, control, set point, or status.

1. New POINT tags MUST describe the functional type (or purpose) of the data point.
1. New POINT tags MUST be what you (the binding) does to, or how you (the binding) gets, the state of the Item.
1. New POINT tags SHOULD be defined in conjunction with an information type in a PROPERTY tag. See examples [below](#examples-of-point-and-property-tags).

## E. Rules for extending PROPERTY Tags

A PROPERTY is a tag that describes the information type (or content type) of the data produced or consumed by a point.
Examples are temperature, brightness, on-off, time stamp.

1. New PROPERTY tags MUST describe the information type (or content type) of the point.
1. New PROPERTY tags MUST be a noun and represent some attribute commonly controlled or sensed in a home automation context.
1. New PROPERTY tags MUST be defined in conjunction with the functional type of a POINT tag. See examples below.

### Examples of Point and Property Tags:

- A humidity sensor would have POINT=`Measurement` plus PROPERTY=`Humidity`.
- A thermostat's target temperature would have POINT=`Setpoint` plus PROPERTY=`Temperature`.
- A smoke alarm would have POINT=`Alarm` plus PROPERTY=`Smoke`.

## F. Rules for extending LOCATION Tags

A LOCATION is a tag that describes the location type of a point.
Its  most common use case is to assign equipment to a location.
Examples are ground floor, dining (eating) room, kitchen (cooking room), living room, or garage.

1. New LOCATION tags SHALL NOT be synonyms of existing tags (see [rule B.2.](#b-rules-for-extending-core-predefined-semantic-tags))
