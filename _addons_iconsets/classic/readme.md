---
id: classic
label: Classic Icon Set
title: Classic Icon Set - Icon Sets
type: iconset
description: "This is a modernized version of the original icon set from openHAB 1.x."
install: manual
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# Classic Icon Set

This is a modernized version of the original icon set from openHAB 1.x.
The set is provided with the distribution in both the PNG and SVG file format.

{% assign allIconsStr = "alarm.svg,attic.svg,baby_1.svg,baby_2.svg,baby_3.svg,baby_4.svg,baby_5.svg,baby_6.svg,bath.svg,battery.svg,batterylevel.svg,batterylevel-0.svg,batterylevel-10.svg,batterylevel-20.svg,batterylevel-30.svg,batterylevel-40.svg,batterylevel-50.svg,batterylevel-60.svg,batterylevel-70.svg,batterylevel-80.svg,batterylevel-90.svg,batterylevel-100.svg,battery-0.svg,battery-10.svg,battery-20.svg,battery-30.svg,battery-40.svg,battery-50.svg,battery-60.svg,battery-70.svg,battery-80.svg,battery-90.svg,battery-100.svg,bedroom.svg,bedroom_blue.svg,bedroom_orange.svg,bedroom_red.svg,blinds.svg,blinds-0.svg,blinds-10.svg,blinds-20.svg,blinds-30.svg,blinds-40.svg,blinds-50.svg,blinds-60.svg,blinds-70.svg,blinds-80.svg,blinds-90.svg,blinds-100.svg,bluetooth.svg,boy_1.svg,boy_2.svg,boy_3.svg,boy_4.svg,boy_5.svg,boy_6.svg,calendar.svg,camera.svg,carbondioxide.svg,cellar.svg,chart.svg,cinema.svg,cinemascreen.svg,cinemascreen-0.svg,cinemascreen-10.svg,cinemascreen-20.svg,cinemascreen-30.svg,cinemascreen-40.svg,cinemascreen-50.svg,cinemascreen-60.svg,cinemascreen-70.svg,cinemascreen-80.svg,cinemascreen-90.svg,cinemascreen-100.svg,cistern.svg,cistern-0.svg,cistern-10.svg,cistern-20.svg,cistern-30.svg,cistern-40.svg,cistern-50.svg,cistern-60.svg,cistern-70.svg,cistern-80.svg,cistern-90.svg,cistern-100.svg,climate.svg,climate-on.svg,colorlight.svg,colorpicker.svg,colorwheel.svg,contact.svg,contact-ajar.svg,contact-closed.svg,contact-open.svg,corridor.svg,door.svg,door-closed.svg,door-open.svg,dryer.svg,dryer-0.svg,dryer-1.svg,dryer-2.svg,dryer-3.svg,dryer-4.svg,dryer-5.svg,energy.svg,error.svg,fan.svg,fan_box.svg,fan_ceiling.svg,faucet.svg,fire.svg,fire-off.svg,fire-on.svg,firstfloor.svg,flow.svg,flowpipe.svg,frontdoor.svg,frontdoor-closed.svg,frontdoor-open.svg,garage.svg,garagedoor.svg,garagedoor-0.svg,garagedoor-10.svg,garagedoor-20.svg,garagedoor-30.svg,garagedoor-40.svg,garagedoor-50.svg,garagedoor-60.svg,garagedoor-70.svg,garagedoor-80.svg,garagedoor-90.svg,garagedoor-100.svg,garagedoor-ajar.svg,garagedoor-closed.svg,garagedoor-open.svg,garage_detached.svg,garage_detached_selected.svg,garden.svg,gas.svg,girl_1.svg,girl_2.svg,girl_3.svg,girl_4.svg,girl_5.svg,girl_6.svg,greenhouse.svg,groundfloor.svg,group.svg,heating.svg,heating-0.svg,heating-20.svg,heating-40.svg,heating-60.svg,heating-80.svg,heating-100.svg,heating-off.svg,heating-on.svg,house.svg,humidity.svg,humidity-0.svg,humidity-10.svg,humidity-20.svg,humidity-30.svg,humidity-40.svg,humidity-50.svg,humidity-60.svg,humidity-70.svg,humidity-80.svg,humidity-90.svg,humidity-100.svg,incline.svg,input.svg,keyring.svg,kitchen.svg,lawnmower.svg,light.svg,lightbulb.svg,light-0.svg,light-10.svg,light-20.svg,light-30.svg,light-40.svg,light-50.svg,light-60.svg,light-70.svg,light-80.svg,light-90.svg,light-100.svg,light-off.svg,light-on.svg,line.svg,line-decline.svg,line-incline.svg,line-stagnation.svg,lock.svg,lock-closed.svg,lock-open.svg,lowbattery.svg,lowbattery-off.svg,lowbattery-on.svg,man_1.svg,man_2.svg,man_3.svg,man_4.svg,man_5.svg,man_6.svg,mediacontrol.svg,microphone.svg,moon.svg,motion.svg,movecontrol.svg,network.svg,network-off.svg,network-on.svg,niveau.svg,office.svg,oil.svg,outdoorlight.svg,pantry.svg,parents-off.svg,parents_1_1.svg,parents_1_2.svg,parents_1_3.svg,parents_1_4.svg,parents_1_5.svg,parents_1_6.svg,parents_2_1.svg,parents_2_2.svg,parents_2_3.svg,parents_2_4.svg,parents_2_5.svg,parents_2_6.svg,parents_3_1.svg,parents_3_2.svg,parents_3_3.svg,parents_3_4.svg,parents_3_5.svg,parents_3_6.svg,parents_4_1.svg,parents_4_2.svg,parents_4_3.svg,parents_4_4.svg,parents_4_5.svg,parents_4_6.svg,parents_5_1.svg,parents_5_2.svg,parents_5_3.svg,parents_5_4.svg,parents_5_5.svg,parents_5_6.svg,parents_6_1.svg,parents_6_2.svg,parents_6_3.svg,parents_6_4.svg,parents_6_5.svg,parents_6_6.svg,party.svg,pie.svg,piggybank.svg,player.svg,poweroutlet.svg,poweroutlet-off.svg,poweroutlet-on.svg,poweroutlet_au.svg,poweroutlet_eu.svg,poweroutlet_uk.svg,poweroutlet_us.svg,presence.svg,presence-off.svg,pressure.svg,price.svg,projector.svg,pump.svg,qualityofservice.svg,qualityofservice-0.svg,qualityofservice-1.svg,qualityofservice-2.svg,qualityofservice-3.svg,qualityofservice-4.svg,radiator.svg,rain.svg,receiver.svg,receiver-off.svg,receiver-on.svg,recorder.svg,returnpipe.svg,rgb.svg,rollershutter.svg,rollershutter-0.svg,rollershutter-10.svg,rollershutter-20.svg,rollershutter-30.svg,rollershutter-40.svg,rollershutter-50.svg,rollershutter-60.svg,rollershutter-70.svg,rollershutter-80.svg,rollershutter-90.svg,rollershutter-100.svg,screen.svg,screen-off.svg,screen-on.svg,settings.svg,sewerage.svg,sewerage-0.svg,sewerage-10.svg,sewerage-20.svg,sewerage-30.svg,sewerage-40.svg,sewerage-50.svg,sewerage-60.svg,sewerage-70.svg,sewerage-80.svg,sewerage-90.svg,sewerage-100.svg,shield.svg,shield-0.svg,shield-1.svg,siren.svg,siren-off.svg,siren-on.svg,slider.svg,slider-0.svg,slider-10.svg,slider-20.svg,slider-30.svg,slider-40.svg,slider-50.svg,slider-60.svg,slider-70.svg,slider-80.svg,slider-90.svg,slider-100.svg,smiley.svg,smoke.svg,snow.svg,sofa.svg,softener.svg,solarplant.svg,soundvolume.svg,soundvolume-0.svg,soundvolume-33.svg,soundvolume-66.svg,soundvolume-100.svg,soundvolume_mute.svg,soundvolume_mute-off.svg,soundvolume_mute-on.svg,status.svg,suitcase.svg,sun.svg,sunrise.svg,sunset.svg,sun_clouds.svg,switch.svg,switch-off.svg,switch-on.svg,temperature.svg,temperature_cold.svg,temperature_hot.svg,terrace.svg,text.svg,time.svg,time-on.svg,toilet.svg,vacation.svg,video.svg,wallswitch.svg,wallswitch-off.svg,wallswitch-on.svg,wardrobe.svg,washingmachine.svg,washingmachine_2.svg,washingmachine_2-0.svg,washingmachine_2-1.svg,washingmachine_2-2.svg,washingmachine_2-3.svg,water.svg,whitegood.svg,wind.svg,window.svg,window-ajar.svg,window-closed.svg,window-open.svg,woman_1.svg,woman_2.svg,woman_3.svg,woman_4.svg,woman_5.svg,woman_6.svg,zoom.svg," %}
{% assign allIcons = allIconsStr | split: ',' %}

{% for icon in allIcons %}
  {% assign iconLower = icon | downcase | split: "." %}
  {% assign iconWithoutExt = iconLower[0] %}
  {% assign allIconsWithoutExtensionStr = allIconsWithoutExtensionStr | append: iconWithoutExt | append: ',' %}
{% endfor %}
{% assign allIconsWithoutExtension = allIconsWithoutExtensionStr | split: ',' %}


## Places

{% for category in site.data.categories_places %}
    {% assign categoryNamesStr = categoryNamesStr | append: category.name | downcase | append: ',' %}
{% endfor %}
{% assign placesCategoryNames = categoryNamesStr | split: ',' %}

<div id="iconset-preview-locations" class="icons">
{% for category in placesCategoryNames %}
  {% assign iconSrc = base | append: "/img/icon_no_category.png" %}
  {% if allIconsWithoutExtension contains category %}
    {% assign iconSrc = "icons/" | append: category | append: ".svg" %}
  {% endif %}
  <figure>
    <img src="{{iconSrc}}" alt="{{category}}" title="{{category}}" width="64" height="64">
    <figcaption>{{category}}</figcaption>
  </figure>
{% endfor %}
</div>

## Things

{% assign categoryNamesStr = "" %}
{% for category in site.data.categories_thing %}
    {% assign categoryNamesStr = categoryNamesStr | append: category.name | downcase | append: ',' %}
{% endfor %}
{% assign thingCategoryNames = categoryNamesStr | split: ',' %}

<div id="iconset-preview-things" class="icons">
{% for category in thingCategoryNames %}
  {% assign iconSrc = base | append: "/img/icon_no_category.png" %}
  {% if allIconsWithoutExtension contains category %}
    {% assign iconSrc = "icons/" | append: category | append: ".svg" %}
  {% endif %}

  {% assign altText = "" %}
  {% for i in allIcons %}
    {% assign prefix = category | append: "-" %}    
    {% if i contains prefix %}
      {% assign iWithoutExt = i | split: "." %}
      {% assign altText = altText | append: iWithoutExt[0] | append: " " %}
    {% endif %}
  {% endfor %}
  <figure>
    <img src="{{iconSrc}}" alt="{{altText}}" title="{{altText}}" width="64" height="64">
    <figcaption>{{category}}</figcaption>
  </figure>
{% endfor %}
</div>

## Channels

{% for category in site.data.categories %}
    {% assign typesStr = typesStr | append: category.type | append: ',' %}
{% endfor %}
{% assign types = typesStr | split: ',' | uniq %}

{% for type in types %}

#### {{type}}

  {% assign channelCategoryNamesStr = "" %}
  {% for category in site.data.categories %}
    {% if category.type == type %}
      {% assign channelCategoryNamesStr = channelCategoryNamesStr | append: category.name | downcase | append: ',' %}
    {% endif %}
  {% endfor %}
  {% assign channelCategoryNames = channelCategoryNamesStr | split: ',' %}
  {% assign channelCategories = channelCategories | concat: channelCategoryNames %}

  <div id="iconset-preview-channels" class="icons">
  {% for channelCategory in channelCategoryNames %}
    {% assign iconSrc = base | append: "/img/icon_no_category.png" %}
    {% if allIconsWithoutExtension contains channelCategory %}
      {% assign iconSrc = "icons/" | append: channelCategory | append: ".svg" %}
    {% endif %}

    {% assign altText = "" %}
    {% for i in allIcons %}
      {% assign prefix = channelCategory | append: "-" %}    
      {% if i contains prefix %}
        {% assign iWithoutExt = i | split: "." %}
        {% assign altText = altText | append: iWithoutExt[0] | append: " " %}
      {% endif %}
    {% endfor %}

    <figure>
      <img src="{{iconSrc}}" alt="{{altText}}" title="{{altText}}" width="64" height="64">
      <figcaption>{{channelCategory}}</figcaption>
    </figure>
  {% endfor %}
  </div>

{% endfor %}

## Other Icons

{% assign allCategories = thingCategoryNames | concat: channelCategories | concat: placesCategoryNames | sort | uniq %}

<div id="iconset-preview-other" class="icons">
{% for icon in allIcons %}
  {% assign categoryLower = icon | downcase | split: "." %}
  {% assign plainCategory = categoryLower[0] %}

  {% assign otherIcon = true %}
  {% for catWithIcon in allCategories %}
    {% if catWithIcon.size <= plainCategory.size %}
      {% assign plainCategoryStart = plainCategory | truncate: catWithIcon.size, "" %}
      {% if plainCategoryStart == catWithIcon %}
        {% assign otherIcon = false %}
        {% break %}
      {% endif %}
    {% endif %}
  {% endfor %}

  {% if otherIcon == false %}
    {% continue %}
  {% endif %}

  {% unless icon contains "-" %}

    {% assign altText = "" %}
    {% for i in allIcons %}
      {% assign prefix = plainCategory | append: "-" %}    
      {% if i contains prefix %}
        {% assign iWithoutExt = i | split: "." %}
        {% assign altText = altText | append: iWithoutExt[0] | append: " " %}
      {% endif %}
    {% endfor %}
  
    <figure>
      <img src="icons/{{icon}}" alt="{{altText}}" title="{{altText}}" width="64" height="64">
      <figcaption>{{plainCategory}}</figcaption>
    </figure>
  {% endunless %}
{% endfor %}
</div>

