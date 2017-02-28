---
id: astro
label: Astro
title: Astro - Actions
type: action
description: "With the Astro actions, you can calculate sunrise and sunset DataTime values in rules."
source: https://github.com/openhab/openhab1-addons/blob/master/bundles/action/org.openhab.action.astro/README.md
since: 1x
install: manual
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# Astro Actions

With the Astro actions, you can calculate sunrise and sunset DataTime values in rules.

**Important:** The action also requires the installation of the corresponding Astro 1.x binding.

## Examples

```
import java.util.Date

rule "Astro Action Example"
when
	...
then
	var Date current = now.toDate
	var double lat = xx.xxxxxx
	var double lon = xx.xxxxxx

	logInfo("sunRiseStart: ", new DateTimeType(getAstroSunriseStart(current, lat, lon)).toString)
	logInfo("sunRiseEnd: ", new DateTimeType(getAstroSunriseEnd(current, lat, lon)).toString)

	logInfo("sunSetStart: ", new DateTimeType(getAstroSunsetStart(current, lat, lon)).toString)
	logInfo("sunSetEnd: ", new DateTimeType(getAstroSunsetEnd(current, lat, lon)).toString)
end
```
