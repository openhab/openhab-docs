---
layout: developersguide
title: Governance
license: Parts of this page have been derived from the EPLv2 licensed https://www.eclipse.org/projects/handbook
---

{% include base.html %}

# Governance of the openHAB Project

## Principles

The guiding principles for openHAB are the "open source rules of engagement", which comprise:
- Transparency
- Openness
- Meritocracy

To operate with transparency, discussions, minutes, deliberations, project plans, plans for new features, and other artifacts are open, public, and easily accessible.

Openness means quite a lot more than "open book" (which is really a synonym for transparent). The project is open to all; openHAB provides the same opportunity to all. Everyone participates with the same rules; there are no rules to exclude any potential contributors.

openHAB is a meritocracy. The more that somebody contributes, the more responsibility they will earn. A pattern of quality contribution may lead to an invitation to join the project as a maintainer. Leadership roles are merit-based and earned by peer acclaim. Merit must be demonstrated in publicly-accessible activities. Maintainers are added to a project via election.

## Structure

The openHAB project is a big ecosystem of different components.
While people often think of the runtime + addons when talking about openHAB, there are other parts like openHAB Cloud, the mobile apps, the voice skills, etc. - all in all, there are well over [40 different repos](https://github.com/openhab) under the openHAB GitHub organisation.

The different components are mostly maintained independently of each other. Many have their own release cycles and a dedicated maintainer team.

## Maintainers

The [maintainers of openHAB](https://github.com/orgs/openhab/teams/maintainers) is the superset of [all maintainers of the different code repositories](https://github.com/orgs/openhab/teams/maintainers/teams).
This means that the maintainer role is always related to a certain repository/component only and not to the entire project as such.

Every component can (and should!) have more than one maintainer. All maintainers of a given repository build the maintainer team of the component in this repository.

The maintainers are the ones with write access to the repository and they are responsible for the source code, the proper processing of PRs against the repo and the overall evolution of the code base.

### Responsibilities

Maintainers take care of the respective repository, i.e. they
- define coding guidelines
- decide the architecture and features of the code
- review PRs
- process and answer issues
- deal with releases
- sync with other maintainer teams wrt cross-team changes
- announce important news in the community

In general, a maintainer team is free to define its own rules of how the work in the team is organised, e.g. what is required for a PR to be accepted. Those rules should be written down as a pinned discussion on the GitHub team page, see [this one](https://github.com/orgs/openhab/teams/2-x-add-ons-maintainers) as an example.

A [couple of rules](https://github.com/orgs/openhab/teams/maintainers/discussions/1) must be followed by all maintainer teams, they ensure that there's some consistency in the workflows across the different repositories.

### Maintainer Elections

Contributors who have the trust of the component’s maintainers can, through election, be promoted to maintainer status for that component. The breadth of a maintainer's influence corresponds to the breadth of their contribution.

A maintainer gains voting rights allowing them to affect the future of the project. Becoming a maintainer is a privilege that is earned by contributing and showing discipline and good judgment. It is a responsibility that should be neither given nor taken lightly.

#### Nominations

A maintainer nomination should explain the candidate’s contributions to the component and thus why they should be elected as a maintainer. Cite the issues they have fixed via PRs; cite the community forum postings they have answered; cite the design discussions to which they have contributed; etc. In all cases, provide urls to source material.

Only the component's maintainers may nominate a new maintainer or vote in a maintainer election. To be successful, the election must receive a minimum of three positive +1 votes. Any maintainer can veto the election by casting a -1 vote. For components with three or fewer committers all maintainers must vote. Maintainer elections run for one week, but will end prematurely if all project committers vote +1.

Nominations must be done on the GitHub team discussion page (as a public post) and voting is done through _reactions_ on that post.

#### Ending Maintainership

A maintainer can resign from the maintainer role at any time without specifying reasons.
Maintainers that are inactive for more than 3 months can be excluded from the maintainer team through a vote by the other maintainers which concludes without a veto after one week.

## Architecture Council

The [openHAB Architecture Council](https://github.com/orgs/openhab/teams/architecture-council) (AC) serves the community by identifying and tackling any issues that hinder openHAB’s continued technological success and innovation, widespread adoption, and future growth.
This involves technical architecture as well as open source processes and social aspects.
Comprising the finest technical leaders from all community stake holders, it is the council’s goal to keep the project successful and healthy, the processes simple and smooth, and the communities vibrant and cohesive.

### Responsibilities

The Architecture Council is responsible for all decisions that have a significant impact across different components and which touch any fundamental concepts how openHAB works and behaves.

Discussions and decisions are done on the [Github team page](https://github.com/orgs/openhab/teams/architecture-council).
Decisions are taken unanimously.
This is the case if no member of the AC vetos against a proposed resolution within a week of the call for votes on the topic.

The AC is the entity entitled to do changes to the governance rules.

### Architecture Council Nominations & Elections

The Architecture Council has 5 seats.
The president and vice president of the openHAB Foundation are permanent members of the AC.
Existing AC members nominate and vote new members.
Any AC member can veto the election by casting a -1 vote.
AC member elections run for one week, but will end prematurely if all AC members vote +1.

Nominations must be done on the basis of meritocracy and according proof must be given.
Nominations should furthermore ensure that the AC has a broad scope of knowledge about openHAB and that different perspectives are represented.

#### Ending Architecture Council Membership

An AC member can resign at any time without specifying reasons.
AC members can be excluded from the AC through an unanimous vote by the other AC members which concludes without a veto after one week.
When excluding a member, a reason has to be provided, such as inactivity, mis-behaviour, etc. and the excluded member must be given the chance to publicly respond to this.

The openHAB Foundation's General Assembly can request that the AC is dissolved and has to be newly appointed.
