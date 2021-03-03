---
layout: documentation
title: Intro to Pages
---

# Introduction to Pages

openHAB 3 introduces a new user unified user interface called MainUI. 
Should you choose to, almost everything that can be configured in openHAB can be configured through MainUI. 
You've already seen how to create and configure Things and how create Items and build the semantic model.  
Later you will see how to create Rules.

In addition to the administration of openHAB, MainUI can be used as the interface you present to the users of your home automation.
You can find an example of the MainUI on the [demo page](https://demo.openhab.org/#!/).

{::options toc_levels="2..4"/}

- TOC
{:toc}

## Role Based Access

MainUI presents two different views to users based on whether and as what type of user they log in as. 
The two types of users are regular users and administrators. 

### Regular Users

Regular are users who have not logged in or users who have not been configured to be administrators. 
These users can see all of the interactive parts of the UI (i.e. Pages) and can open other apps (icon at the upper right hand corner of the screen) but they cannot see any of the administration user interfaces nor can they access the administration functions through the REST API. 

![regular user view](images/regular_user.png)

Notice that none of the administration menus are shown; only the Pages defined to interact with your home automation.

The sidebar menu can be hidden by clicking the push pin icon right above the openHAB logo.

By default, these menus can be accessed by anyone on your network whether or not they are logged in or not. 

### Administration Users

These users have full access to all parts of openHAB. 
The list of menu options includes Settings, Developer Tools, and the Developer Sidebar. 
These are most of the parts of openHAB you have been interacting with thus far. 
Way back in First Steps the first thing you did was create an administration user.

![admin user view](images/admin_user.png)

Notice the new Settings and Developer Tools menus are now accessible.

## Other User Interfaces

Every openHAB deployment is unique. 
Consequently every administrator of an openHAB instance will need to create a custom interface for the users of their bespoke home automation.
openHAB 3 provides a number of options to supports this in addition Main UI Pages.

Interface | Purpose | How the UI is Defined | Notes
-|-|-
[Sitemaps]({{base}}/ui/sitemaps.html) | A simple declaritive way to define a simple user interface | Created using .sitemap files or through MainUI. | Used by BasicUI and the phone apps by default.
[HABPanel]({{base}}/ui/habpanel/habpanel.html) | UI designed for fixed wall mounted tablets and similar touch screen displays using a blocks interface (e.g. the Windows 10 start menu) with a lot of customization options. | Built graphically though the browser. A number of custom widgets are defined and installable.
HABot <!-- Where did the HABot docs go? --> | Provides a basic chatbot interaace to interact with your home automation through natural langauge. | Requires the configuration of the semantic model.
[Pages]({{base}}/ui/index.html) | Built into MainUI that allows for a rich set of options to present your home automation. | Can be built automatiaclly through the semantic model as well as cutomized.

Once installed, any non-Pages UI can be accessed in the "Other Apps" menu that pops up when clicking on the square icon in the upper right corner of the MainUI Overview page (first page you see when first accessing openHAB.

![other apps menu](images/other_apps.png)

In addition, HABot will add a text box to the top of your Pages where one can start a conversation with openhab.

![HABot text entry](images/habot_text.png)

The rest of this tutorial will focus on Pages. 

