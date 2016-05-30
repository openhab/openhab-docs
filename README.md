# Introduction

This repository contains the documentation for openHAB.

The result is available at [http://docs.openhab.org/](http://docs.openhab.org/)

# Contributing to the Documentation

The documentation is a community effort, so everyone is welcome to suggest changes, add new sections and fix bugs.
This is done exactly the same way as for the code repositories, simply through pull requests against this repo.
Please read the [contribution guidelines](CONTRIBUTING.md) for details.

## Prerequisites

Our documentation is built with Jekyll and served through Github Pages.

In order to run Jekyll locally, you also need Ruby being installed.
Please see the [Jekyll installation instructions](https://jekyllrb.com/docs/installation/) for details.

## Serving the Documentation locally

Once you have Jekyll installed and the repository checked out, simply run

```
jekyll serve
```

from within the repository root folder and point your browser to [`http://localhost:4000`[(http://localhost:4000).
This will give you a preview of the documentation in the same way as it will appear on docs.openhab.org once your PR is merged.
Changes to the markdown files will automatically be taken into account as Jekyll re-generates the pages on the fly.

## Automatically Generated Parts

Please note that a few parts MUST NOT BE MANUALLY EDITED!
These are copied from the source code repositories and some files are generated from them. These files/folders are:

```
_source/_data
_source/concepts
_source/addons/bindings
_source/addons/iconsets
_source/addons/io
_source/addons/uis
```

The generation/update of these files can be triggered through `mvn clean package` in the repo root.
Please note that this repository works with sub-modules, so if you want to run this Maven generation, you should check out the repository recursively:

```
git clone --recursive https://github.com/openhab/openhab-docs
```
