---
layout: developersguide
title: Contribution
---

{% include base.html %}

# Contributing to the Development of openHAB

## The Repositories

The main parts of openHAB can be found in the following repositories:

* [openHAB Core](https://github.com/openhab/openhab-core): This repo contains the core framework bundles of which the openHAB runtime is constructed.
* [openHAB Add-ons](https://github.com/openhab/openhab-addons): Add-ons (such as bindings, voice services, etc.) of openHAB can be found within this repository. They cannot be used with an openHAB 1.x runtime, since they provide features that the old runtime does not support.
* [openHAB 1 Add-ons](https://github.com/openhab/openhab1-addons): Legacy add-ons that were developed for openHAB 1. Most of them are working smoothly on the openHAB 2 runtime and thus they are made available for backward compatibility reasons. They are not suggested for new users, though.
* [openHAB Distro](https://github.com/openhab/openhab-distro): This repo contains all parts that are required for assembling the binary distribution of openHAB.

Besides those "main" repositories, there are a dozen further ones, which are not listed here in detail - just [check out the list](https://github.com/openhab) and you will find separate repos for openHAB Cloud, the Alexa skill, the Google Action, the Android and iOS apps, the Zigbee and ZWave bindings, HABPanel and HABot and many more.
If you want to get involved with any of these, best check their respective README and CONTRIBUTING files in the root of the repos.

## Contribution Guidelines

### Pull Requests are Always Welcome

We are always thrilled to receive pull requests, and do our best to process them as fast as possible.
Not sure if that typo is worth a pull request? Do it! We will appreciate it.

If your pull request is not accepted on the first try, don't be discouraged!
If there's a problem with the implementation, hopefully you received feedback on what to improve.

We're trying very hard to keep openHAB lean and focused.
We don't want it to do everything for everybody.
This means that we might decide against incorporating a new feature.
However, there might be a way to implement that feature *on top of* openHAB.

### Discuss Your Design in the Community

We recommend discussing your plans [in the discussion forum](https://community.openhab.org)
before starting to code - especially for more ambitious contributions.
This gives other contributors a chance to point you in the right
direction, give feedback on your design, and maybe point out if someone
else is working on the same thing.

### Create Issues...

Any significant improvement should be documented as a GitHub
issue in the [appropriate repository](#the-repositories) before anybody
starts working on it.

### ...but Check for Existing Issues First!

Please take a moment to check that an issue doesn't already exist
documenting your bug report or improvement proposal. If it does, it
never hurts to add a quick "+1" or "I have this problem too". This will
help prioritize the most common problems and requests.

### Conventions

Fork the repo and make changes on your fork in a feature branch:

- If it's a bugfix branch, name it XXX-something where XXX is the number of the
  issue
- If it's a feature branch, create an enhancement issue to announce your
  intentions, and name it XXX-something where XXX is the number of the issue.

Submit unit tests for your changes.  openHAB has a great test framework built in; use
it! Take a look at existing tests for inspiration. Run the full test suite on
your branch before submitting a pull request.

Update the documentation when creating or modifying features. Test
your documentation changes for clarity, concision, and correctness, as
well as a clean documentation build.

Write clean code. Universally formatted code promotes ease of writing, reading,
and maintenance.

Pull requests descriptions should be as clear as possible and include a
reference to all the issues that they address.

Pull requests must not contain commits from other users or branches.

Commit messages must start with a capitalized and short summary (max. 50
chars) written in the imperative, followed by an optional, more detailed
explanatory text which is separated from the summary by an empty line.

Code review comments may be added to your pull request. Discuss, then make the
suggested modifications and push additional commits to your feature branch. Be
sure to post a comment after pushing. The new commits will show up in the pull
request automatically, but the reviewers will not be notified unless you
comment.

Before the pull request is merged, make sure that you squash your commits into
logical units of work using `git rebase -i` and `git push -f`. After every
commit the test suite should be passing. Include documentation changes in the
same commit so that a revert would remove all traces of the feature or fix.

Commits that fix or close an issue should include a reference like `Closes #XXX`
or `Fixes #XXX`, which will automatically close the issue when merged.

### Merge Approval

openHAB maintainers use the [GitHub review feature](https://help.github.com/articles/about-pull-request-reviews/) to indicate acceptance.


<a id="sign-your-work"></a>
### Sign your Work

The sign-off is a simple line at the end of the explanation for the
patch, which certifies that you wrote it or otherwise have the right to
pass it on as an open-source patch.  The rules are pretty simple: if you
can certify the below (from
[developercertificate.org](https://developercertificate.org/)):

```
Developer Certificate of Origin
Version 1.1

Copyright (C) 2004, 2006 The Linux Foundation and its contributors.
660 York Street, Suite 102,
San Francisco, CA 94110 USA

Everyone is permitted to copy and distribute verbatim copies of this
license document, but changing it is not allowed.


Developer's Certificate of Origin 1.1

By making a contribution to this project, I certify that:

(a) The contribution was created in whole or in part by me and I
    have the right to submit it under the open source license
    indicated in the file; or

(b) The contribution is based upon previous work that, to the best
    of my knowledge, is covered under an appropriate open source
    license and I have the right under that license to submit that
    work with modifications, whether created in whole or in part
    by me, under the same open source license (unless I am
    permitted to submit under a different license), as indicated
    in the file; or

(c) The contribution was provided directly to me by some other
    person who certified (a), (b) or (c) and I have not modified
    it.

(d) I understand and agree that this project and the contribution
    are public and that a record of the contribution (including all
    personal information I submit with it, including my sign-off) is
    maintained indefinitely and may be redistributed consistent with
    this project or the open source license(s) involved.
```

then you just add a line to every git commit message:

    Signed-off-by: Joe Smith <joe.smith@email.com>

using your real name (sorry, no pseudonyms or anonymous contributions.) and an
e-mail address under which you can be reached (sorry, no github noreply e-mail
addresses (such as username@users.noreply.github.com) or other non-reachable
addresses are allowed).

Additionally can also sign off commits automatically by adding the `-s` or `--signoff` parameter to your usual git commit commands.

If your commit contains code from others as well, please ensure that they certify the DCO as well and add them with an "Also-By" line to your commit message:

    Also-by: Ted Nerd <ted.nerd@email.com>
    Also-by: Sue Walker <sue.walker@email.com>
    Signed-off-by: Joe Smith <joe.smith@email.com>

#### Small Patch Exception

There are several exceptions to the signing requirement. Currently these are:

* Your patch fixes spelling or grammar errors.
* Your patch is a single line change to documentation.

### How can I Become a Maintainer?

* Step 1: learn the component inside out
* Step 2: make yourself useful by contributing code, bugfixes, support etc.
* Step 3: volunteer [in the community] (https://community.openhab.org/c/development/misc) or in the appropriate GitHub project and have a [maintainer](governance.html#maintainers) [nominate you](governance.html#nominations).

Don't forget: being a maintainer is a time investment.
Make sure you will have time to make yourself available.
You don't have to be a maintainer to make a difference on the project!

### Contributing to the Documentation
Sharing your knowledge through documentation contributions is incredibly valuable for the community allowing everybody to benefit from your lessons learned. 
If you are not yet ready to contribute code don't let that stop you from contributing to the documentation. 
Documentation change requests are very easy. 
No need to file an issue. 
You don't even need to know Git. 
* Create a GitHub account and configure your full name in your profile.
* Go to the documentation page that you want to update and click on "Edit this page on GitHub" at the bottom.
* GitHub will bring up a web editor where you can enter your desired changes.
* You can preview your changes under the "Preview changes" tab.
* Add a title and optional description for your proposed change at the bottom of the editor.
* The [sign off rules](#sign-your-work) described above do apply to documentation contributions as well. 
Simply add an empty line and the sign off statement "Signed-off-by: Joe Smith \<joe.smith@email.com\>" at the end of your change description at the bottom of the editor.  
Note that as per the rules you have to provide your full name in the sign off and that full name has to match the name you configured in your GitHub profile for the DCO check to succeed.
* Click the "Propose file change" button at the bottom of the editor, then click "Create pull request" on the next page, and then on the summary page click "Create pull request" one more time.

If you prefer to use Git you can of course use the code contribution process for documentation contributions as well. 

## Community Guidelines

We want to keep the openHAB community awesome, growing and collaborative. We
need your help to keep it that way. To help with this we've come up with some
general guidelines for the community as a whole:

* Be nice: Be courteous, respectful and polite to fellow community members: no
  regional, racial, gender, or other abuse will be tolerated. We like nice people
  way better than mean ones!

* Encourage diversity and participation: Make everyone in our community
  feel welcome, regardless of their background and the extent of their
  contributions, and do everything possible to encourage participation in
  our community.

* Keep it legal: Basically, don't get us in trouble. Share only content that
  you own, do not share private or sensitive information, and don't break the
  law.

* Stay on topic: Make sure that you are posting to the correct channel
  and avoid off-topic discussions. Remember when you update an issue or
  respond to an email you are potentially sending to a large number of
  people.  Please consider this before you update.  Also remember that
  nobody likes spam.
