---
layout: documentation
title:  Semantic Model
---

# Semantic Model

Things represent devices and the sensors and actuators of those devices.
But one of the purposes of openHAB is to abstract away the specifics of each of the hundreds of supported technologies and APIs so that a light switch is a light switch whether it's controlling a Hue light bulb, a KNX wall switch, or a custom DIY relay that speaks MQTT.
To provide that abstraction openHAB uses Items.

There are a fixed set of Item types representing all the different ways that a sensor reading can be represented or a device can be controlled.
The configuration of your Items is where meaning is applied to your devices.
For example, instead of dealing with `zwave:1231242:node12:switch` we can deal with "Livingroom_Lamp".

Items are the main entities that the rest of openHAB works with including Pages, Sitemaps, Rules, and persistence.

There are many ways to organize your items, one of which is to make use of the semantic model (descriptions for location, type of equipment and more).
openHAB 3 makes extensive use of the semantic model to automatically create Pages (see next section) and to provide natural language interaction.
Therefore we recommend creating the semantic model right from the start and sticking to it.
This will make your life easier in the long run.
Taking the time to understand and choose a logical structure for your home will save you from needing to re-do the work in the future.

However, the model is not intended to represent all your Groups and Items.
The model only represents the physical layout of your home automation.
Consequently it has some constraints discussed below.
But that does not mean that other ways of organizing and grouping Items are not supported.
For example, one can create a cross cutting functional based Group like `AllLights`.
Just don't put `AllLights` into your model.

This section gives an example of one way to model your home with locations and equipment descriptions.
The semantic model, when set up correctly, will allow openHAB to turn all lights off in the kitchen when asked, as the framework can understand the kitchen location and what items are lights in that location.
Once created, a model allows one to use [Semantics Actions]({{base}}/configuration/actions.html#semantics) in Rules to e.g. determine the Location of an Item or the related Equipment.
This will help one create, generalize, and simplify Rules based on patterns and purpose.

{::options toc_levels="2..4"/}

- TOC
{:toc}

## Introduction to the Ontology and Relationships

![ontology relationships](images/ontology_relationships.jpeg)

The above drawing shows the relationship between the four main concepts in the model.

- A Location is a Group Item that can contain sub-Locations, Equipment, and Points, and represents a physical location (building, room, etc.).
- An Equipment is normally a Group Item that can contain sub-Equipment, and Points.
- A Point is not a Group, but represents any other type of Item and is usually linked to a Channel.
- A Property is an additional tag on a Point Item that indicates what sort of point it is. For example, a thermometer might be a Point of type Measurement with a Property of type Temperature.

In addition to these relationships, there are restrictions.

- A Location can only be the direct member of zero or one Location Group.
- An Equipment can only be the direct member of zero or one Location, or the direct member of zero or one Equipment. Put another way, an Equipment can only be the direct member of one Group that has a semantic tag.
- A Point can only be the direct member of zero or one Location, or the direct member of zero of one Equipment. Put another way, a Point can only be the direct member of one Group that has a Location or Equipment tag.

Because the model represents the physical, it makes no sense to deviate from these restrictions.
An Equipment or Point cannot be in more than one location at the same time.
A Point cannot be a part of more than one Equipment at the same time.

Example of an advanced model:

![example model](images/example_model.png)
<!--(made with https://www.diagrameditor.com - file here: [Semantic Model.txt|attachment](upload://qEPmmmDomSr4F5dRBHMXajOzO0c.txt) (3.3 KB) change extension to .drawio) -->

We have an Indoor location which has a House.
The House has a Ground Floor and the Ground Floor has rooms including a Living Room.
The Living Room has a Rollershutter equipment which in turn has a Control and Power point Item.
The locations and equipment are Group Items and Control and Power are other types of Items.

As discussed, one is not required to *only* use the semantic model.
It is possible and encouraged to create Groups and Items that are outside of the model where necessary.
In this example, the Rollershutter in the Living Room is a member of the `AllRollershutters` Group which could be used to determine if any are OPEN and send commands to all the rollershutters in the house at once.
But this functional cross cutting Group is not an Equipment nor is it a Location and it violates the restrictions of the model.
A typical installation may only have 60%-80% of all the Items in the model.
More about creating Items and Groups outside of the model is below.

You can use as few or as many layers of Locations as you wish to model your home.
For instance if you live in a flat (apartment) your root Locations might just be the rooms.
If you only have one building, you can omit the indoor/outdoor layer and the building layer to only have a hierarchy of floors and rooms, etc.

Equipment are often mapped to Things, but not always.
You can represent a single Equipment with several Things.
For instance, a computer might have points to switch it on (send a wake-on-lan packet), off (shell command), determine if it is online (network polling), and how much power it consumes (Z-Wave wall plug).
All of these multiple Things from different bindings can be combined to model a single piece of Equipment.

The `Computer` is the equipment and it could be located in a room called the `study` location.
The computer is made up of multiple Things, some of which are not physical devices.

A front door can have points to determine if it is open or closed (with a sensor) or locked (with a smart lock), and a camera/motion detector.

Finally, an Equipment can be made up of multiple Equipment.
Using the example above, the Z-Wave plug might be modeled as a subequipment of the `Computer` equipment.

## Building the Locations Model

From the Settings screen, click on Model.

![start model](images/start_model.png)

Let's start with a hierarchy of Locations. Click on Add Location.

![create location](images/create_location.png)

Add your first item, a Group representing the ground floor.
Give it a name, but choose carefully as you cannot change it afterward.
Choose a label, a category (it mostly defines the default icon), and then specialize the item by choosing a more accurate semantic class than "Location".
Here we use "GroundFloor".

Once it's created, make sure it's still selected on the left, and click on "Add Location" again.
This will add another location _within_ the ground floor.
Typically rooms are directly under floor locations.
Add an item representing the living room, calling it `LivingRoom`.
Set the `sofa` category and the `LivingRoom` semantic class.

Now let's add the kitchen. Make sure to select Ground Floor again and choose Add Location to add the third item (name: `Kitchen`, category: kitchen, semantic class: Kitchen).

To add the first floor to the root level, we need to clear the selection first.
Click on the white space in the tree, or Clear in the bottom toolbar.
Add the ground floor and its rooms (master bedroom, bathroom, etc...) to your model.

You should end up with something resembling this:

![model locations](images/locations_model.png)

## Modeling Equipment

Now let's add some Equipment and Points.
You could proceed as you did for the Locations and create them by hand, but there's an easier way.
If the Equipment you're adding is one of the Things that you have already added, you have two options.

### From the Model Page

Select where in the model you want to add the Equipment, for instance the kitchen, and click on Create Equipment from Thing.

![model create equipment](images/create_equipment_model.png)

Select the Thing you want to create the Equipment from, and alter the details of the Equipment item that will be created.
If you don't find an appropriate Semantic Class, choose **Equipment**.

Below are all the Channels defined by the Thing.
Sometimes Things will have hundreds of channels, so here you have the opportunity of choosing which ones will be linked to new Points items.
Check the channels you're interested in and only those.

![model create equipment channels](images/create_equipment_model_channels.png)

For the plant sensor Thing added earlier, we have an opportunity to change the default basic Number types and make them quantifiable.
Quantity types (Number with a dimension) provide conversion facilities between Units of Measurement, and the default persistence is more granular.
For percentages like humidity or battery levels, use `Number:Dimensionless` which is a quantity type without a dimension.

Also set the semantic class to Measurement and choose an appropriate related property.

When you're finished, click Add in the title bar.
The Equipment and Points should be added to the model where you wanted.

![model created equipment added](images/create_equipment_model_added.png)

The "Plant Sensor" Equipment has now been created under the Kitchen location, and all the selected Points represent the selected Channels of the Thing.

### From a Thing's Page

From the Settings, click on Things and then click on the Thing you wish to add to the model.
Switch to the Channels tab.

![create equipment things channels](images/create_equipment_things_channels.png)

Click on Add Equipment to Model below the list.
You'll encounter a similar screen to the one above.
The difference is, rather than selecting the Thing, you have to select where in the model you want to add the Equipment.

![create equipment things location](images/create_equipment_things_location.png)

Select Pick From Model in the Parent Group section, and the tree view of the Locations and Equipments will appear.
Select the parent group, for instance Living Room, then choose Pick in the top-right corner of the dialog box.
If this equipment is a part of another equipment, choose that equipment as the parent instead of a location.

![create equipment things parent](images/create_equipment_things_parent.png)

Then do the same as above, configure the Equipment item and the Points, then click Add.

Go back to the Model by choosing Model in the sidebar and verify that the Equipment added to the model from the thing page is effectively there as well as, its Points.

![create equipment things added](images/create_equipment_things_added.png)

Note how the Channel Links section lists the link to the Thing/Channel, and you also have a control widget to control the item.
Since it's linked to the Color channel of the Hue bulb, the light will reflect the state of the item.

Finish adding Equipment and Points from your Things.

## Retrofitting Existing Items to the Model

There may be times where a user needs to add existing Items to their model.
Perhaps they are migrating from an older version of OH, they did not follow the advice above to start with the model to begin with, or they are following a tutorial or example that doesn't include the model.
In this case all is not lost.
Existing Items can be added to the model.
Browse to the Item in the Items settings, click on Edit and choose an appropriate Semantic Class and Semantic Property.
Then add the Point as a member of the appropriate Equipment or Location Group.
If the Equipment Group doesn't exist yet, create a Group and use the appropriate Equipment semantic tag first and add the Equipment to the appropriate Location Group.

## Modifying the Model

As illustrated here, the model consists mainly of Group membership and tags on Items.
To change the location of an equipment or room, simply change the parent Group.
To change the type of an equipment or point, simply edit the tags.
Some of these edits are possible from the Model Page itself.
Where that's not supported, you can make the changes through the Item's Page.

## Badges

This is a table describing the Equipment, Point and Property classes needed to enable the display of status and measurement badges on the location cards.

| Badge        | Type        | Equipment                                                  | Point                              | Property    |
|--------------|-------------|------------------------------------------------------------|------------------------------------|-------------|
| Low Battery  | Status      | *Any*                                                      | LowBattery                         | *Any*       |
| Lights       | Status      | *Any*                                                      | Control, Switch                    | Light       |
| Windows      | Status      | Window                                                     | OpenState                          | *Any*       |
| Doors        | Status      | Door, FrontDoor, BackDoor, InnerDoor, CellarDoor, SideDoor | OpenState                          | *Any*       |
| Garage Doors | Status      | GarageDoor                                                 | OpenState                          | *Any*       |
| Blinds       | Status      | Blinds                                                     | OpenState                          | *Any*       |
| Presence     | Status      | *Any*                                                      | Status                             | Presence    |
| Lock         | Status      | Lock                                                       | Status, OpenState, Control, Switch | *Any*       |
| Climate      | Status      | HVAC                                                       | Status, Control, Switch            | *Any*       |
| Screens      | Status      | Screen, Television                                         | Status, Control, Switch            | Power       |
| Speakers     | Status      | Receiver, Speaker                                          | Status, Control, Switch            | Power       |
| Projectors   | Status      | Projector                                                  | Status, Control, Switch            | Power       |
| Alarms       | Status      | *Any*                                                      | Alarm                              | *Any*       |
| Luminance    | Measurement | *Any*                                                      | Measurement                        | Light       |
| Temperature  | Measurement | *Any*                                                      | Measurement                        | Temperature |
| Humidity     | Measurement | *Any*                                                      | Measurement                        | Humidity    |

This table is based off the sources:

- <https://github.com/openhab/openhab-webui/blob/main/bundles/org.openhab.ui/web/src/components/cards/glance/location/status-badge.vue#L63>
- <https://github.com/openhab/openhab-webui/blob/main/bundles/org.openhab.ui/web/src/components/cards/glance/location/measurement-badge.vue#L48>

# Non-semantic Items and Groups

As discussed above, many Items and Groups are expected to be outside of the semantic model.
Perhaps they are only supporting Items only used for Rules.
Maybe they are the raw Items that feed a proxy Item or summarizing Group.
If they are a Group, perhaps they are functionally based instead of physically based, e.g. `AllLights`.

As discussed above, existing Items can be added to the model.
The reverse is also true, an Item can be removed from the model simply by removing their semantic tags by setting them to "None".
Note, when removing a Point/Property pair of tags, remove the Property first or else the Property tag will remain on the Item.

## Creating Non-semantic Items

Note that a Group is a special type of Item.
It can only be created from the Items Settings Page (when not created from the model), but the process to create a Group is the same as any other Item.

### From the Model Page

Selecting an existing Item and remove the sematic tags by clicking on "Edit" and setting the semantic tags to "None"..
This is particularly useful if one has created an Equipment from a Thing but only some of the Items created are to be a part of the model.

![Remove Item from Model](images/remove_from_model.png)

### From the Things's Page

Select a Things and click on the "Channels" tab.
Click on the Channel from which the Item is to be created.
Click on "Add Link to Item..." and select "Create new Item".
Fill out the information about the Item to be created, omitting the semantic tags.
Finally click on "Create Link".

![Create Item from Channel](images/create_link.png)

### From the Items Settings Page

Under "Administration" click on "Settings" and then on "Items".
All the Items defined in the system are listed.
The list of Items can be filtered by using the search box at the top of the list.
One can search by Item name, Item Label, or Item type (e.g. show all the Switch Items).

At the bottom of this page there is a blue "+" icon which when clicked allows the creation of an Item.
Clicking on this offers two options: "Add Items from textual definition" which allows one to import one or more Items based on the [textual configuration syntax]({{base}}/configuration/items.html), and "Add Item" which allows the creation of the UI by filling in a form.

![Create Item Form](images/create_item.png)

Again, leave out the semantic tags and the Item will not become a part of the model.

## Group Membership

Once a Group is created, other Items can be added as members of the Group.
Note that this process also works for semantically tagged Groups.
Navigate to or search for the Group on the Items Settings page and select the Group.
In the middle of the page will be a field labeled "Direct Group Members".
Click on "Change" and then "Members".

![Change Group Members](images/add_members_change.png)

This brings up a searchable list of your Items.
Find and add a check next to those that should be a member of this Group.
Remove the check for those that should not be a member of the Group.

![Select Group Members](images/select_members.png)

Click "close" when done and then click "Apply" to change the Group's members.

# Items Best Practices

- Only include Items in the model that make sense. Not all Items can nor should they be in the model.
- Use meaningful and unique labels for Items. If all the Temperature Items are just labeled "Temperature" there will be no way to tell which one is which when using the search on the Items settings page or in the UI.
- Use manually created Groups that are outside the model to create functional capabilities such as a way to send a command to all the lights in the house with one tap or see the maximum temperature in the house.
- Groups have the option to apply an aggregation function. One can semantically tag these Groups using a Point/Property tag and put the Group into an Equipment or Location. This can be useful in cases where a number of Items are logically controllable as one device, such as three smart bulbs in one lamp.
