---
layout: documentation
title: Agentic AI Examples for openHAB
---

# Agentic AI Examples for openHAB

These examples show outcome-style requests (see [Agentic AI Best Practices for openHAB](best-practices.md)), what a capable agent typically does with them, and what you should review afterwards.
They assume `OPENHAB_URL` and `OPENHAB_API_TOKEN` are available as described in [Injecting the openHAB API Token into an Agent Harness](harness.md).

## REST API quick reference

All calls send `-H "Authorization: Bearer $OPENHAB_API_TOKEN"`.
The full, interactive reference is in the Main UI under **Developer Tools → API Explorer**.

| Purpose                     | Request                                                                     |
|-----------------------------|-----------------------------------------------------------------------------|
| System information          | `GET /rest/systeminfo`                                                      |
| List Things and status      | `GET /rest/things`                                                          |
| One Thing's status          | `GET /rest/things/{thingUID}/status`                                        |
| List Items                  | `GET /rest/items`                                                           |
| Read an Item's state        | `GET /rest/items/{itemName}/state`                                          |
| Send a command              | `POST /rest/items/{itemName}` with a `text/plain` body such as `ON`         |
| Update a state (no command) | `PUT /rest/items/{itemName}/state` with a `text/plain` body                 |
| Create or replace an Item   | `PUT /rest/items/{itemName}` with a JSON body                               |
| Link an Item to a channel   | `PUT /rest/links/{itemName}/{channelUID}`                                   |
| Inbox (discovery results)   | `GET /rest/inbox`                                                           |
| Approve a discovered Thing  | `POST /rest/inbox/{thingUID}/approve` with the label as a `text/plain` body |
| List rules                  | `GET /rest/rules`                                                           |
| Run a rule now              | `POST /rest/rules/{ruleUID}/runnow`                                         |
| Persistence history         | `GET /rest/persistence/items/{itemName}?starttime=...&endtime=...`          |

For example:

```bash
curl -s -H "Authorization: Bearer $OPENHAB_API_TOKEN" "$OPENHAB_URL/rest/things" | jq '.[] | {UID, label, status: .statusInfo.status}'
```

## Example 1: health check

> "Give me a health report of my openHAB instance: anything offline, anything misconfigured, and anything that looks unused. Don't change anything."

The agent typically lists Things and their status, finds Items with no links or `NULL` states, looks for rules that failed or are disabled, and reads recent warnings from the log.

Review: this is read-only, so the main check is whether its conclusions are right. Ask it to show the evidence for each finding.

## Example 2: add a newly discovered device

> "I just included a new Z-Wave plug for the coffee machine. Get it into openHAB like the other kitchen plugs, with power monitoring."

The agent typically checks the Inbox, approves the Thing with a label matching your conventions, inspects an existing kitchen plug to copy its Item names, groups, semantic tags, and units, creates and links the Items, and reads the states back to confirm they update.

Review: Item names, groups, and semantic placement; that power and energy Items use units (`Number:Power`, `Number:Energy`); and that the plug actually switches when you toggle it in the Main UI.

## Example 3: write a rule

> "If the freezer temperature stays above -10 °C for 15 minutes, notify me once, and notify me again when it recovers. Show me the rule before you add it."

The agent typically finds the freezer temperature Item, checks how you write rules (DSL, JavaScript, Blockly, rule templates), drafts the rule with a debounce and a recovery notification, and waits for your approval.
After approval it adds the rule and tests it, for example by temporarily posting a state update to a test Item or by running the rule and checking the log.

Review: the trigger and the "notify once" logic, that testing did not leave a fake state on a real Item, and that the notification action is the one you use.

## Example 4: diagnose a flaky Thing

> "The garage door controller goes OFFLINE a few times a night. Work out why and recommend a fix. Don't restart anything without asking."

The agent typically reads the Thing's status details, searches the log for the Thing UID around the outages, compares timestamps with other events (Wi-Fi, polling interval, other Things going offline at the same time), and proposes a cause and a change.

Review: whether the evidence supports the conclusion, and approve any configuration change or restart yourself.

## Example 5: test a binding you are developing

> "Build the binding I'm working on, deploy it to my test instance, and confirm that the Thing comes ONLINE and every channel reports a sensible value. Tell me about anything that doesn't."

The agent typically builds the bundle (for example `./mvnw clean install -pl :org.openhab.binding.<name>`), copies the JAR into the test instance's `addons` folder, watches the log for the bundle starting and errors, checks the Thing status through the REST API, reads every linked Item's state, sends test commands to writable channels, and reports what worked and what did not.

Review: the build and log output it relied on, that it used the test instance and not production, and any commands it sent to real hardware.

## Example 6: bulk tidy-up

> "Many of my Items have inconsistent labels and are missing semantic tags. Propose consistent labels and tags for the ground floor. List the changes; don't apply them yet."

The agent typically reads the Items in the ground-floor groups, infers your preferred style from the best-labeled ones, and produces a table of proposed changes.
After you approve (all or part), it applies them and lists exactly what changed.

Review: the proposal table before applying, then spot-check in the Main UI. Take a backup before applying bulk changes.
