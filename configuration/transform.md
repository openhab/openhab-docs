---
layout: documentation
title: Transformations Configuration
---

{% include base.html %}

# Transformations Configuration

Transformations are used to translate data from a cluttered or technical raw value to a processed or human-readable representation.
They are often useful, to **interpret received Item values**, like sensor readings or state variables, and to translate them into a human-readable or better processible format.

Details about the usage of Transformations and the available Transformation services can be found in the [main Transformation services article]({{base}}/addons/transformations.html).

Be aware that a transformation service just as any other openHAB add-on needs to be installed prior to first usage.

The configuration folder `$OPENHAB_CONF/transform` is home for Transformation service files.
Those files contain service specific data or logic and their syntax depends on the Transformation service.
Some but not all Transformation services rely on such additional files.
