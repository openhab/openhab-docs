---
id: ipp
label: IPP
title: IPP - Bindings
type: binding
description: "This binding integrates printers, which implement the Internet Printing protocol (IPP). This is the successor of the CUPS binding."
since: 2x
install: auto
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# IPP Binding

This binding integrates printers, which implement the Internet Printing protocol (IPP). This is the successor of the CUPS binding.
The main purpose is to check if there are waiting print jobs on a printer, which can be switched on in this case.

## Supported Things

The binding has been tested against a CUPS Server (which implements the Internet Printing Protocol).
So all printers in a CUPS envorinment should work fine. Many network printers also use IPP,
but there are many differencies on which parts of IPP are supported, is is not guaranteed, that every printer will work.

## Discovery

The printers are discovered through mDNS in the local network. As mentioned before: a printer may be discoverable but not
usable by the binding.

## Thing Configuration

## Channels

| Channel Type ID | Item Type | Description                                   |
|-----------------|-----------|-----------------------------------------------|
| jobs            | Number    | Total number of print jobs on the printer     |
| waitingJobs     | Number    | Number of waiting print jobs on the printer   |
| doneJobs        | Number    | Number of completed print jobs on the printer |

<!-- TOTO Create example
## Full Example -->
