---
layout: documentation
title: Transformations
---

{% include base.html %}

# Transformations

Transformations are used to translate data from a cluttered or technical raw value to a processed or human-readable representation.
They are often useful, to interpret received Item values, like sensor readings or state variables, into a human-readable or more common format.

Examples:

* Translation of a technical Binding output, e.g., "SUN_RISE" can be translated to spanish "Salida solar"
* Conversion of sensor readings, e.g., temperature conversion from degree Celsius to degree Fahrenheit
* Processing of a raw Item value, e.g., Parsing a number out of a JSON string like `{ "temperature": 23.2 }`

Transformations are applicable in

1. Item and Sitemap Element [Label Transformation](http://docs.openhab.org/configuration/items.html#state-transformations)

   Transformations used in Labels are applied on the fly.
   While the transformed value will for example be visible in a Sitemap, the original value is stored in the item.
   
   The following example shows a Map transformation used to transform the technical state of a Contact Item into a human readable representation (see [Map transformation]({{base}}/addons/transformations/map/readme.html) for more details):
   ```java
   Contact LR_Window "Livingroom window [MAP(window.map):%s]"  { someBinding:... }
   ```

2. Rules

   Transformations can also be used in Rules to transform/translate/convert data.
   The following shows the general syntax and an example of a JsonPath transformation inside a rule:
   ```java
   transform("<transformation-name>","<logic or transformation file name>", <input-data or variable>)
   
   var weather = transform("MAP", "weather_en.map", rawvalue)
   var author = transform("JSONPATH", "$.store.book[0].author", jsonstring)
   ```

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
