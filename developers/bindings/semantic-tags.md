---
layout: developersguide
title: Developer Guidelines on Semantic Tags
---

# Developer Guidelines on Semantic Tags

## Introduction

A semantic tag is something that provides information to the openHAB User Interface about the type (i.e. the nature) of either things, or items linked to channels. Note the use of the word `type`.

Semantic tags are divided into the following categories: EQUIPMENT (relates to the `type` of a piece of equipment), POINT (relates to the `type` of a particular data point within some equipment), PROPERTY (relates to the `type` of the information carried by a point), and LOCATION (relates to the `type` of the location of an equipment or point).

## Purpose of Semantic Tags

The primary purpose of semantic tags is to help the openHAB User Interface generate an overview of the user’s home system with its respective nested rooms, devices (things) and items. They are also used by HABot and end users in rules.

The purpose of this document is to provide rules for openHAB developers and openHAB maintainers in applying existing semantic tags, and in deciding whether proposed new semantic tags shall be permitted.

## General Rules for Semantic Tags

The various equipment, points, properties, and locations are displayed in the openHAB User Interface in a hierarchical tree structure, which is based on a hierarchy of semantic tags defined in openHAB Core. The list of semantic tags defined in openHAB Core is extensible. This document describes the developer rules for applying or extending this list.

Note: the core predefined semantic tags are presented to users as propositions, suggestions, or hints. It is possible for users to override or customise such tags at their own discretion. The remainder of this document does NOT relate to user overrides or customisation. It applies solely to the openHAB Core tags.

### Rules for **APPLYING** Core Predefined Semantic Tags

1. Developers MUST apply core predefined tags in their addons where possible.
1. Developers MAY hard code the tags in the ‘thing-type.xml’ or apply them dynamically at run time.
1. Developers SHALL NOT hard code LOCATION tags in the ‘thing-type.xml’.
1. Developers MAY apply LOCATION tags dynamically at run time (if the addon can determine the location).
1. Developers SHALL NOT apply overridden or customised tags in their addons.
1. Developers MAY apply a POINT tag without a PROPERTY tag (in cases where a property makes no sense). However, in such a case the developer MAY submit a new PROPERTY tag that fits.
1. Developers SHALL NOT apply a PROPERTY tag without a POINT tag.
1. Semantic EQUIPMENT tags MUST be applied at thing level.
1. Semantic POINT and PROPERTY tags MUST be applied at channel level.
1. Developers MAY open a new PR to propose extensions to the core predefined tags as follows.

### Rules for **EXTENDING** Core Predefined Semantic Tags

11. The purpose of the semantic model is to maintain a stable structure, so it is intended that only rarely shall new tags be submitted or adopted.
1. New tags MUST fit within the hierarchy of semantic tags already defined in openHAB Core.
1. New tags SHALL NOT be synonyms of existing tags e.g. kitchen/kitchenette, sitting/living room.
1. New tags MUST prove that PROPERTY, POINT and EQUIPMENT tags could be applied to three or more bindings.
1. Developers MUST provide supporting evidence in their PR that the rules above and below are met.

## Equipment Tags

An EQUIPMENT tag describes the equipment type of a piece of equipment. Examples are light bulb, thermostat, pump, car, wall switch, push button, alarm system, or alarm detector.

16. New EQUIPMENT tags MUST describe the equipment type of a physical or virtual device.
1. New EQUIPMENT tags MUST be a noun.

## Point Tags

A POINT is a tag that describes the functional type (or purpose) of a data point within an equipment. Examples are measurement, control, set point, or status.

18. New POINT tags MUST describe the functional type (or purpose) of the data point.
1. New POINT tags MUST be what you do to, or how you get, the state of the Item.

## Property Tags

A PROPERTY is a tag that describes the information type (or content type) of the data produced or consumed by a point. Examples are temperature, brightness, on-off, time stamp

20. New PROPERTY tags MUST describe the information type (or content type) of the point.
1. New PROPERTY tags MUST be a noun and represent some attribute commonly controlled or sensed in a home automation context.
1. New PROPERTY tags MUST be defined in conjunction with a functional type of a POINT tag.

## Location Tags

A LOCATION is a tag that describes the location type of a point. Examples are ground floor, dining (eating) room, kitchen (cooking room), living room, or garage.

23. New LOCATION tags SHALL NOT be synonyms of existing tags (see rule 13.)