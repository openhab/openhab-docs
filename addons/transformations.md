---
layout: documentation
title: Transformations
---

{% include base.html %}

# Transformations

Transformations are used to translate data from a cluttered or technical raw value to a processed or human-readable representation.
They are often useful, to **interpret received Item values**, like sensor readings or state variables, into a human-readable or better processible format.

Examples:

* Translation of a technical Binding output, e.g., "SUN_RISE" can be translated to the spanish translation "Salida solar"
* Conversion of sensor readings, e.g., temperature conversion from degree Celsius to degree Fahrenheit
* Processing of a raw Item value, e.g., Parsing a number from a JSON string like `{ "temperature": 23.2 }`

Transformations are applicable in:

1. Item and Sitemap Label [State Presentation]({{base}}/configuration/items.html#state-transformations)

   Transformations used in Labels are applied **on the fly**.
   While the **transformed value** will (for example) be visible in a Sitemap, the **original value** is stored in the item.
   
   The following example shows a Map transformation (see below) used in the State part of an Items Label to transform the technical state of a Contact Item (e.g. `CLOSED`) into a human readable representation (e.g. "currently closed."):
   ```java
   Contact LR_Window "Livingroom Window [MAP(window.map):%s]"  { someBinding:... }
   ```
   
   The same method can be used in the [Label parameter of Sitemap Elements]({{base}}/configuration/sitemaps.html).

2. Rules

   Transformations can also be used in Rules to **transform/translate/convert data**.
   The following shows the general syntax:
   ```java
   transform("<transformation-name>","<logic or transformation file name>", <input-data or variable>)
   ```
   
   The following shows two examples. For more details regarding the Map and JsonPath transformations, check the individual transformation articles:
   ```java
   var condition = transform("MAP", "weather_esp.map", "SUN_RISE")
   var author = transform("JSONPATH", "$.store.book[0].author", jsonstring)
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
