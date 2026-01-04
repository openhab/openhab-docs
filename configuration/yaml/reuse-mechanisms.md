---
layout: documentation
title: YAML Configuration - Reuse Mechanisms
---

# Choosing a Reuse Mechanism

openHAB's YAML system provides several mechanisms for reusing configuration across files, devices, and patterns. Each mechanism serves a different purpose and offers different strengths. This page provides a high‑level comparison to help you choose the right tool for your use case.

## Overview

There are four primary reuse mechanisms:

- **Variables** — dynamic, parameterized values
- **Anchors & Aliases** — YAML‑native structural reuse
- **Include Files** — cross‑file modularization
- **Packages** — reusable bundles of configuration

The following table summarizes when each mechanism is most appropriate.

## Strategic Usage

| Feature               | Best For…                                                                                                                                                                                                                |
|-----------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Variables**         | Dynamic or parameterized values of any type (scalar, list, map). Supports expressions, concatenation, override layering, and cross‑file reuse. Ideal for templates, device families, and anything requiring flexibility. |
| **Anchors & Aliases** | Pure YAML‑native structural reuse within a single file. Only mechanism that participates in YAML merge semantics (`<<:`). Best for immutable building blocks and deterministic, non‑dynamic patterns.                    |
| **Include Files**     | Reusing configuration across multiple files. Enables modularization, separation of concerns, and parameterized templates via `vars`. Ideal for large setups, shared logic, and reusable templates.                       |
| **Packages**          | Bundling related configuration into modular, reusable units that can be imported as a group. Ideal for distributing device families, organizing complex setups, and sharing standardized patterns across files.          |

## Choosing the Right Mechanism

### Use **Variables** when:

- You need parameterization or dynamic values
- You want to compute or concatenate values
- You need cross‑file reuse without duplication
- You want override layering (e.g., defaults → includes → inline vars)

### Use **Anchors & Aliases** when:

- You want simple structural reuse inside a single file
- You need YAML merge semantics (`<<:`)
- You want deterministic, non‑dynamic behavior
- You prefer pure YAML constructs without substitution

### Use **Include Files** when:

- You want to split configuration across multiple files
- You need reusable templates with parameters
- You want to share logic or structures across multiple devices
- You want to keep large configurations maintainable

### Use **Packages** when:

- You want to distribute or reuse a group of related configuration files
- You want to organize complex setups into logical modules
- You want to share standardized patterns across your system
- You want a clean, declarative way to import whole feature sets

## Summary

Each mechanism has a distinct role:

- **Variables** provide flexibility
- **Anchors** provide structural reuse
- **Includes** provide modularity
- **Packages** provide organization and distribution

Understanding these differences helps you build clean, maintainable YAML configurations that scale with your system.
