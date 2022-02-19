---
layout: documentation
title: Rules Blockly - Before Using
---

# Before using blockly in openHAB

[return to Blockly Reference](index.html#before-using-blockly)

## Preface

Blocklies are an easy entry to the world of writing rules.
However, after some times, you end up writing more and more complex rules, so more sooner than later you will encounter some challenges. This section intends to provide some hints to get started and how to deals with those challenges.
Please read them carefully before asking questions in the forum.

{::options toc_levels="2..4"/}

- TOC
{:toc}

{: #blockly-before-uding}

## **OpenHAB Configuration Files**

Some openHAB blocks rely on particular configuration files found in the openHAB configuration folder.
This folder is referred to as $OPENHAB_CONF in this page, and the location of this folder for your setup can be found via the UI: *Help & About* -> *Technical Information* -> *Configuration folder*.

- via mounting the files shares from the server to your client-PC.
In the main UI as an admin you can go to *Help & About* and will have the different folder locations under *Technical information*.
  - the exact configuration of the shares can be found on your server at [/etc/samba/smb.conf](https://github.com/openhab/openhabian/blob/main/includes/smb.conf).
- Use the share *openHAB*-conf when mounting it from Windows or MacOS

**Link the openHAB share in Windows**

- Find you openHAB-Server via the network share functionality
- User the share *openHAB*-conf to assign it to a network drive

**Link the openHAB share in macOS**

- Finder -> Go -> Connect to Server
  - Enter the username and server name to connect to the openHAB Server

  ![macos-share-1.png](../images/blockly/blockly-openhab-macos-share-1.png)
  - then choose the folder you want to mount

  ![macos-share-2](../images/blockly/blockly-openhab-macos-share-2.png)

**Finding it on Linux**

- Access the folder directly on the openHAB server at */etc/openhab*

All methods reveal the following folders

- html
- icons
- items
- services
- html
- persistence
- rules
- scripts
- sitemaps
- sounds
- things
- transform

## Creating a blockly rule via the UI

- go to Settings -> Rules
- press ![plus](../images/blockly/blockly-plus-small.png) on bottom right
- enter a unique id and rule name for your new blockly rule
- Under "When" click on "Add Trigger" to define a trigger for the rule (you may add multiple triggers which are perceived as any of those triggers may occurs which stands for an OR combination of the triggers)
  - choose a title for the rule
  - choose "item" (or something else) that should trigger the rule
  - select the item from your model and the click PICK on the upper right corner
  - choose "received a command", "was updated" or "changed"
- Under "Then" click on "Add Action"
- choose ![run-script-1](../images/blockly/blockly-run-script.png)
- click on ![run-script-2](../images/blockly/blockly-run-script-2.png) und you should now see this screen
  ![blockly-edit-screen](../images/blockly/blockly-edit-screen.png)
- you can now click the ![toolbox-submenu](../images/blockly/blockly-arrow.png) to access all openHAB Blocks.
- Drag and Drop the blocks to the white area
- Press `Ctrl-s` (Windows) or `Command-s` (MacOS) to save your rule
- Press `Ctrl-r` (Windows) or `Command-r` (MacOS) to directly run your rule with the trigger
- Press `Ctrl-d` (Windows) or `Command-d` (MacOS) to disable / enable your rule
- Click on ![showcode](../images/blockly/blockly-showcode.png) on the lower right to see the generated code (click again to come back to the blocks)

## Use Frontail for viewing log files

During development the log-block is lot very often which writes information into the log files.

- To be able to conveniently view your log files it is recommended to setup *frontail* which can be achieved easily via [openhabian-config](https://www.openhab.org/docs/installation/openhabian.html#optional-components)
- Start `openhabian-config` on your server and choose option 20 and then option 21
- After installation you can view your logs under [openhabian-config](http://myopenhab-server:9001) (adapt the server name)
- **see [how to log](https://www.openhab.org/docs/administration/logging.html)**

## Return to Blockly Reference

[return to Blockly Reference](index.html#before-using-blockly)
