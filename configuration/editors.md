---
layout: documentation
title: Editors
---

{% include base.html %}

# Editors - Different ways to power up your textual configuration

There are several existing solutions, that can help you configuring your openHAB instance in a textual way.
Mainly there are two bigger projects for this. _Eclipse Smart Home - Designer_ as a standalone editor and _openhab-vscode_ as an extension for the Visual Studio Code open source editor.
Additionally there some syntax highligting solutions existing for other text editors.

{::options toc_levels="2"/}

* TOC
{:toc}

## openhab-vscode

openhab-vscode is an extension for the [Visual Studio Code](https://code.visualstudio.com) editor.

### Manual Installation

1. Download the latest release from <https://github.com/openhab/openhab-vscode/releases>
2. Open command line in the same folder you downloaded the extension
3. Type the following command:
    ```
    code --install-extension openhab-0.0.2.vsix
    ```
Currently openhab-vscode isn't yet listed in [Microsoft Visual Studio Marketplace](https://marketplace.visualstudio.com/vscode), but the contributors are working on it already.

[Visit the Extensions GitHub Page for further Informations](https://github.com/openhab/openhab-vscode/blob/master/README.md "GitHub Repo for the VS Code Extension")

## Others

### mcedit

mcedit is an editor which comes with mc (Midnight Commander).


#### Installing the syntax-files

- download copy the syntax-files to */usr/share/mc/syntax/*
- <https://groups.google.com/forum/#!searchin/openhab/syntax$20highlighting%7Csort:relevance/openhab/zJrfTDjahbc/r8GcpKDgr1cJ>

- insert the following lines to the file *Syntax* in */usr/share/mc/syntax/*
```shell
    file ..\*\\.(items)$ openHAB\sItems 
    include openhab-items.syntax  
     
    file ..\*\\.(sitemap)$ openHAB\sSitemap 
    include openhab-sitemap.syntax
     
    file ..\*\\.(persist)$ openHAB\sPersistence
    include openhab-persist.syntax
     
    file ..\*\\.(rules)$ openHAB\sRules
    include openhab-rules.syntax 
```
- edit the Debian-line from
`file (rules|rocks)$ Debian\srules`
to 
`file (rocks)$ Debian\srules`
because it interferes with openHABs rules-files.

### Notepad++

Notepad++ Version 6.2 or above is required to support UDL2 (User Defined Language v2).

#### Comments

```shell
color brightgreen "//.*"
color brightgreen start="/\*" end="\*/"
color brightgreen start="/\*\*" end="\*/"# Comments
color brightgreen "//.*"
color brightgreen start="/\*" end="\*/"
color brightgreen start="/\*\*" end="\*/"# Comments
color brightgreen "//.*"
color brightgreen start="/\*" end="\*/"
color brightgreen start="/\*\*" end="\*/"# Comments
color brightgreen "//.*"
color brightgreen start="/\*" end="\*/"
color brightgreen start="/\*\*" end="\*/"# Comments
color brightgreen "//.*"
color brightgreen start="/\*" end="\*/"
color brightgreen start="/\*\*" end="\*/"# Comments
color brightgreen "//.*"
color brightgreen start="/\*" end="\*/"
color brightgreen start="/\*\*" end="\*/"# Comments
color brightgreen "//.*"
color brightgreen start="/\*" end="\*/"
color brightgreen start="/\*\*" end="\*/"# Comments
color brightgreen "//.*"
color brightgreen start="/\*" end="\*/"
color brightgreen start="/\*\*" end="\*/"# Comments
color brightgreen "//.*"
color brightgreen start="/\*" end="\*/"
color brightgreen start="/\*\*" end="\*/"# Comments
color brightgreen "//.*"
color brightgreen start="/\*" end="\*/"
color brightgreen start="/\*\*" end="\*/"# Comments
color brightgreen "//.*"
color brightgreen start="/\*" end="\*/"
color brightgreen start="/\*\*" end="\*/"
```
http://notepad-plus-plus.org/news/notepad-6.2-release-udl2.html

#### How to import UDL2-files?

- Download the UDL2-Files (openHAB-`*`.xml)
- <https://github.com/thefrip/openhab-samples>
- Install or update Notepad++ if necessary
- http://notepad-plus-plus.org/download/
- Open Notepad++
- Click "Language" (1)
- Click "Define your language.." (2)
- Click "Import..." (3)
- Select one of the downloaded XML-files
- Done.

### vi

#### Installing the syntax-files

##### Automatic installation

Paste the following code into a commandline

```shell
mkdir -p ~/.vim/{ftdetect,syntax} && \
curl -L -o ~/.vim/syntax/openhab.vim https://github.com/cyberkov/openhab-vim/raw/master/syntax/openhab.vim && \
curl -L -o ~/.vim/ftdetect/openhab.vim https://github.com/cyberkov/openhab-vim/raw/master/ftdetect/openhab.vim
```

##### Manual installation

- Download the syntax files from [openhab-vim](https://github.com/cyberkov/openhab-vim)
- place them in your home directory under `~/.vim/`
- start vim with an openHAB configuration file and it should work.

### nano

Nano is a common editor in linux systems

#### Installing the syntax-files

- Download the syntax file openhab.nanorc from [openhabnano](https://github.com/airix1/openhabnano) repository
- place them in your nanorc directory ie: `~/.nano` or `/usr/share/nano`. Then simply include the openhab.nanorc file in your `~/.nanorc` or `/etc/nanorc` file ie:

```shell

## Openhab

include /usr/share/nano/openhab.nanorc
```

### Textwrangler

Textwrangler is a text and code editor for MAC OS X.

#### Manual installation

- Download the syntax file from [openhab-syntax-textwrangler](https://github.com/GrisoMG/openhab-syntax-textwrangler/blob/master/openhab.plist) repository
- Copy the file openhab.plist into `~/Library/Application Support/TextWrangler/Language Modules`