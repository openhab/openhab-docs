---
id: mios
label: MiOS
title: MiOS - Actions
type: action
description: "This bundle exposes openHAB Rule extensions to be used with the MiOS Binding (1.x)."
source: https://github.com/openhab/openhab1-addons/blob/master/bundles/action/org.openhab.action.mios/README.md
since: 1x
install: auto
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# MiOS Actions

This bundle exposes openHAB Rule extensions to be used with the MiOS Binding (1.x).

It exposes the ability to do the following things in the MiOS HA Controller from within openHAB rules]:

* _Device Actions_ - Asynchronously invoke MiOS Device Actions involving 0, 1 or more parameters.
* _Scenes Invocation_ - Asynchronously invoke MiOS Scenes

## Prerequisites

The MiOS Action bundle relies upon the MiOS Binding (1.x) being installed and configured.  Once these are done, you're ready to use the rule extensions this bundle provides.

## Actions

* `sendMiosAction(Item item, String action)` - requests the _parameterless_ Device Action, specified through `action`, be invoked on the MiOS Device bound to `item`.
* `sendMiosAction(Item item, String action, List<<String,Object>> params)` - as above, but for parameterized Device Actions.
* `sendMiosScene(Item scene)` - requests the scene associated with the `scene` parameter be invoked on the MiOS Unit.

The `action` argument of the `sendMiosAction` action is a string of the form:

```
<ServiceURN>/<ServiceAction>
```

or

```
<ServiceAlias>/<ServiceAction>
```

where _ServiceURN_, _ServiceAlias_ and _ServiceAction_ have the same form as described in MiOS Binding (1.x) commands.

You can use the MiOS `invoke` URL to discover the _Actions_, and _Action-parameters_, your particular MiOS device supports:
 
```
http://<host>:3480/data_request?id=invoke
```

The available _ServiceAction_'s are described in the [MiOS Luup UPnP Variables and Actions](http://wiki.micasaverde.com/index.php/Luup_UPnP_Variables_and_Actions) documentation.

## Examples

* Invoking a Device Action and calling a Scene to turn off the AV.

```
rule "Test action rules Off"
    when 
        Time cron "0 45 23 * * ?"
    then
        sendMiosAction(FamilyMainLightsId, "Dimmer/SetLoadLevelTarget", newArrayList('newLoadlevelTarget' -> 0))
        sendMiosScene(SceneGoodNight)
end
```

* Invoking a Sonos Device on MiOS to _say_ something

```
rule "Test action say"
    when
        Item HallGarageDoorZoneTripped changed to OPEN
    then
        sendMiosAction(OfficeSonosId, "Sonos/Say", newArrayList('Text' -> 'Warning! Garage door opened', 'Volume' -> 50))
end
```

* Disarm your Alarm Panel (Paradox, GE, Ademco/Vista, DSC, etc)

```
rule "Test action Disarm"
    when
        ...
    then
        sendMiosAction(EVL3VistaPartition1ArmMode, 'Alarm/RequestArmMode', newArrayList('State' -> 'Disarmed', PINCode' -> 1234)
end
```
