---
layout: documentation
title: KFOB - ZWave
---

{% include base.html %}

# KFOB 4 button keyfob
This describes the Z-Wave device *KFOB*, manufactured by *Z-Wave.Me* with the thing type UID of ```zwaveme_kfob_00_000```.

# Overview


## Channels

The following table summarises the channels available for the KFOB

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Scene Number | scene_number |  | Number | 

### Scene Number

The ```scene_number``` channel supports the ```Number``` item.



## Device Configuration

The following table provides a summary of the 11 configuration parameters available in the KFOB.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Button 1 and 3 pair mode | In separate mode button 1 works with group 1, button 3 with groups 3. Click is On, Hold is dimming Up, Double click is Off, Click-Hold is dimming Down. In pair button 1/3 are Up/Down correspondingly. Click is On/Off, Hold is dimming Up/Down. Single clicks |
| 2 | Button 2 and 4 pair mode | In separate mode button 1 works with group 2, button 4 with groups 3. Click is On, Hold is dimming Up, Double click is Off, Click-Hold is dimming Down. In pair button 2/4 are Up/Down correspondingly. Click is On/Off, Hold is dimming Up/Down. Single clicks |
| 11 | Action on group 1 | In Switch On/Off only mode On command is sent on Dim Up, Off on Dim Down. In Scenes mode the scene ID sent is (10 \* group + ActionID), where ActionID is: 1 = On, 2 = Off, 3 = Dim Up Start, 4 = Dim Down Start, 5 = Dim Up Stop, 6 = Dim Down Stop |
| 12 | Action on group 2 | In Switch On/Off only mode On command is sent on Dim Up, Off on Dim Down. In Scenes mode the scene ID sent is (10 \* group + ActionID), where ActionID is: 1 = On, 2 = Off, 3 = Dim Up Start, 4 = Dim Down Start, 5 = Dim Up Stop, 6 = Dim Down Stop |
| 13 | Action on group 3 | In Switch On/Off only mode On command is sent on Dim Up, Off on Dim Down. In Scenes mode the scene ID sent is (10 \* group + ActionID), where ActionID is: 1 = On, 2 = Off, 3 = Dim Up Start, 4 = Dim Down Start, 5 = Dim Up Stop, 6 = Dim Down Stop |
| 14 | Action on group 4 | In Switch On/Off only mode On command is sent on Dim Up, Off on Dim Down. In Scenes mode the scene ID sent is (10 \* group + ActionID), where ActionID is: 1 = On, 2 = Off, 3 = Dim Up Start, 4 = Dim Down Start, 5 = Dim Up Stop, 6 = Dim Down Stop |
| 20 | Typical click timeout | Typical time used to differenciate click, hold and double clicks in 10ms units |
| 21 | Send the following Switch All commands |  |
| 22 | Invert buttons |  |
| 24 | LED confirmation mode |  |
| 30 | Send unsolicited Battery Report on Wake Up |  |

### Parameter 1: Button 1 and 3 pair mode

In separate mode button 1 works with group 1, button 3 with groups 3. Click is On, Hold is dimming Up, Double click is Off, Click-Hold is dimming Down. In pair button 1/3 are Up/Down correspondingly. Click is On/Off, Hold is dimming Up/Down. Single clicks

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Separately |
| 1 | In pair without double clicks |
| 2 | In pair with double clicks |

The manufacturer defined default value is 1 (In pair without double clicks).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Button 2 and 4 pair mode

In separate mode button 1 works with group 2, button 4 with groups 3. Click is On, Hold is dimming Up, Double click is Off, Click-Hold is dimming Down. In pair button 2/4 are Up/Down correspondingly. Click is On/Off, Hold is dimming Up/Down. Single clicks

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Separately |
| 1 | In pair without double clicks |
| 2 | In pair with double clicks |

The manufacturer defined default value is 1 (In pair without double clicks).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 11: Action on group 1

In Switch On/Off only mode On command is sent on Dim Up, Off on Dim Down. In Scenes mode the scene ID sent is (10 \* group + ActionID), where ActionID is: 1 = On, 2 = Off, 3 = Dim Up Start, 4 = Dim Down Start, 5 = Dim Up Stop, 6 = Dim Down Stop

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim (send Basic Set and Switch Multilevel) |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch all |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |
| 6 | Control devices in proximity |

The manufacturer defined default value is 1 (Switch On/Off and Dim (send Basic Set and Switch Multilevel)).

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Action on group 2

In Switch On/Off only mode On command is sent on Dim Up, Off on Dim Down. In Scenes mode the scene ID sent is (10 \* group + ActionID), where ActionID is: 1 = On, 2 = Off, 3 = Dim Up Start, 4 = Dim Down Start, 5 = Dim Up Stop, 6 = Dim Down Stop

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim (send Basic Set and Switch Multilevel) |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch all |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |
| 6 | Control devices in proximity |

The manufacturer defined default value is 1 (Switch On/Off and Dim (send Basic Set and Switch Multilevel)).

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: Action on group 3

In Switch On/Off only mode On command is sent on Dim Up, Off on Dim Down. In Scenes mode the scene ID sent is (10 \* group + ActionID), where ActionID is: 1 = On, 2 = Off, 3 = Dim Up Start, 4 = Dim Down Start, 5 = Dim Up Stop, 6 = Dim Down Stop

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim (send Basic Set and Switch Multilevel) |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch all |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |
| 6 | Control devices in proximity |

The manufacturer defined default value is 1 (Switch On/Off and Dim (send Basic Set and Switch Multilevel)).

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: Action on group 4

In Switch On/Off only mode On command is sent on Dim Up, Off on Dim Down. In Scenes mode the scene ID sent is (10 \* group + ActionID), where ActionID is: 1 = On, 2 = Off, 3 = Dim Up Start, 4 = Dim Down Start, 5 = Dim Up Stop, 6 = Dim Down Stop

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim (send Basic Set and Switch Multilevel) |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch all |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |
| 6 | Control devices in proximity |

The manufacturer defined default value is 1 (Switch On/Off and Dim (send Basic Set and Switch Multilevel)).

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.


### Parameter 20: Typical click timeout

Typical time used to differenciate click, hold and double clicks in 10ms units

Values in the range 0 to 255 may be set.

The manufacturer defined default value is 50.

This parameter has the configuration ID ```config_20_1``` and is of type ```INTEGER```.


### Parameter 21: Send the following Switch All commands



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| -1 | Switch all on and off |
| 1 | NO (Normal Open) |
| 2 | NC (Normal Close) |

The manufacturer defined default value is 1 (NO (Normal Open)).

This parameter has the configuration ID ```config_21_1``` and is of type ```INTEGER```.


### Parameter 22: Invert buttons



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No |
| 1 | Yes |

The manufacturer defined default value is 0 (No).

This parameter has the configuration ID ```config_22_1``` and is of type ```INTEGER```.


### Parameter 24: LED confirmation mode



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No confirmations |
| 1 | Confirm button press |
| 2 | Confirm button press and delivery |

The manufacturer defined default value is 2 (Confirm button press and delivery).

This parameter has the configuration ID ```config_24_1``` and is of type ```INTEGER```.


### Parameter 30: Send unsolicited Battery Report on Wake Up



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No |
| 1 | To same node as wake up notification |
| 2 | Broadcast to neighbours |

The manufacturer defined default value is 0 (No).

This parameter has the configuration ID ```config_30_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The KFOB supports 4 association groups.

### Group 1: Controlled by button 1 or single clicks of buttons 1 and 3


This group supports 8 nodes.

### Group 2: Controlled by button 3 or double clicks of buttons 1 and 3


This group supports 8 nodes.

### Group 3: Controlled by button 2 or single clicks of buttons 2 and 4


This group supports 8 nodes.

### Group 4: Controlled by button 4 or double clicks of buttons 2 and 4


This group supports 8 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_CENTRAL_SCENE_V1| Linked to BASIC|
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_MULTI_CMD_V1| |

---

Did you spot an error in the above definition or want to improve the content?
You can [edit the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/146).
