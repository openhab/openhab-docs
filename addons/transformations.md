---
layout: documentation
title: Transformations
---

{% include base.html %}

# Transformations

Transformations are used to translate data from a cluttered or technical raw value to a processed or human-readable representation.
They are often useful, to **interpret received Item values**, like sensor readings or state variables, and translate them into a human-readable or better processible format.

**Examples:**

* Translation of a technical Binding output, e.g., "CLOSED" can be translated to the spanish translation "cerrado"
* Processing of a raw Item value, e.g., Parsing a number from a JSON string, like `{ "temperature": 23.2 }`
* Conversion of sensor readings, e.g., temperature in degree Celsius can be converted to degree Fahrenheit

**Transformations are applicable in:**

1. Item and Sitemap Label

   Transformations used in the [state/value part]({{base}}/configuration/items.html#state-transformations) of Labels are applied **on the fly**.
   While the **transformed value** will (for example) be visible on a Sitemap, the **original value** is however stored in the Item.
   
   The following example shows a Map transformation (see below) used in the State part of an Items label to transform the technical state of a Contact Item (e.g. "CLOSED") into a human readable representation ("cerrado"):
   ```java
   Contact LR_Window "Livingroom Window [MAP(window_esp.map):%s]"  { someBinding:... }
   ```
   
   The same method can be used in the [Label parameter of Sitemap Elements]({{base}}/configuration/sitemaps.html).

2. Rules

   Transformations can also be used in Rules to **transform/translate/convert data**.
   The general syntax is as follows:
   ```java
   transform("<transformation-identifier>", "<transf. expression or transf. file name>", <input-data or variable>)
   ```
   
   The following shows two examples. For more details regarding the Map and JsonPath transformations, check the individual transformation articles below.
   ```java
   var condition = transform("MAP", "window_esp.map", "CLOSED")
   var temperature = transform("JSONPATH", "$.temperature", jsonstring)
   var fahrenheit = transform("JS", "convertTempToF.js", temperature)
   ```

## Available Transformations

<table id="transformations-overview" class="bordered addon-table">
  <thead>
    <tr>
      <th data-field="label" width="20%">Name</th>
      <th data-field="description">Description</th>
    </tr>
  </thead>
  <tbody>
    {% for transformation in site.transformations %}
    <tr class="install-{{transformation.install}} since-{{transformation.since}}">
      <td>
        <h4><a href="{{transformation.url}}">{% if transformation.logo %}<img class="logo" src="{{base}}/{{transformation.logo}}" title="{{ transformation.label }}" alt="{{ transformation.label }}" />{% else %}{{ transformation.label }}{% endif %}</a></h4>
        <img src="{{base}}/images/tag-install-{{transformation.install}}.svg">
      </td>
      <td>{{ transformation.description | markdownify }}</td>
    </tr>
    {% endfor %}
 </tbody>
</table>
