---
layout: documentation
title:  Rules - Other Technologies
---

# Rule Technology Overview

Sometimes the built in rule engine is not the perfect fit.
It's possible to use openHAB with a variety of different rule engines and automation technologies.

Some are native and can be used out of the box with openHAB and some require installation of
additional services which interact with openHAB through its REST API.

The list is sorted alphabetically by name and it is meant as a starting point for further research.

| Name                | Native             | Language/Graphical  | Notes                         |
|---------------------|--------------------|---------------------|-------------------------------|
| Blockly             | :heavy_check_mark: | Graphical           | Only available through the UI |
| GraalVM JavaScript  | :heavy_check_mark: | ECMAScript 11       |                               |
| Groovy              | :heavy_check_mark: | Groovy 3.0          |                               |
| HABApp              | :x:                | >= Python 3.8       |                               |
| jRuby               | :heavy_check_mark: | Ruby 3.1            |                               |
| Jython              | :heavy_check_mark: | Python 2.7          |                               |
| NodeRed             | :x:                | Graphical           | Own UI                        |
| Nashorn JavaScript  | :heavy_check_mark: | ECMAScript 5.1      |                               |
| RulesDSL            | :heavy_check_mark: | RulesDSL            |                               |
