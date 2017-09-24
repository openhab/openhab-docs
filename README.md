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

An alternative for a local setup is a virtual machine provided by Vagrant.

## Serving the Documentation locally

Once you have Jekyll installed and the repository checked out, simply run

```
jekyll serve
```

from within the repository root folder and point your browser to [`http://localhost:4000`](http://localhost:4000).
This will give you a preview of the documentation in the same way as it will appear on docs.openhab.org once your PR is merged.
Changes to the markdown files will automatically be taken into account as Jekyll re-generates the pages on the fly.

### Alternative: Vagrant VM

You can also have a virtual machine serving a Jekyll and webserver instance for you, without changing your base system or being limited by it.
The virtual machine will run in the background, process your changes to the source and presenting the results on your hosts [`http://localhost:4000`](http://localhost:4000).
A [Vagrant](https://www.vagrantup.com) machine configured by a [`Vagrantfile`](Vagrantfile) file is provided for that purpose.

You need to have [VirtualBox](https://www.virtualbox.org) and [Vagrant](https://www.vagrantup.com/downloads.html) installed.
After that, it's as easy as:

```shell
/path-to/openhab-docs$ vagrant up
```

## Automatically Generated Parts

Please note that a few parts of this repository MUST NOT BE MANUALLY EDITED!
These are copied from the source code repositories and some files are generated from them. These files/folders are:

- `addons_*`
- `concepts`

The generation/update of these files can be triggered through `bash update-external-resources.sh` in the repo root.
The process will create a temporary folder `.external-resources`, which is only used by the update script and can be ignored.

## About the `_addons_*` Folders

See [Jekyll Collections](https://jekyllrb.com/docs/collections/) for general details.
The folders represent collections of the different Addons types.

If you are here to help improve one of the contained READMEs, read carefully.
These files are mere copies of files in other repositories and will be overwritten on a regular basis.
Please find the original repository and add your contribution there.

At the time of this writing, the folders are automatically created and updated by the toolchain

- `update-external-resources.sh` → `pom.xml` → `process_addons.groovy`

Configuration of the collections happens through `_config.yml`.
The most important setting you need to be aware of, is, that all files in collections are mapped to certain paths:

- e.g. `_addons_bindings\astro\readme.md` → http://docs.openhab.org/addons/bindings/astro/readme.html

Check the mentioned files for more details.
