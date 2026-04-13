<!-- markdownlint-disable MD041 -->
# Development and Contribution Guide

## Contribution guidelines

We welcome contributions to the openHAB client for Sailfish OS!
Whether it's bug fixes, new features, or improvements to documentation, your contributions are valuable.

Please follow these guidelines to ensure a smooth contribution process:

- Please read and agree to the [openHAB Contribution](https://next.openhab.org/docs/developer/contributing.html) Guidelines before submitting a pull request.
- Especially, each commit needs to be **signed-off** by the contributor, which is a declaration that the contribution is made in accordance with the Developer Certificate of Origin (DCO).
This is a requirement for all contributions to openHAB. You can find more information about signing your work in the [contribution guidelines](https://next.openhab.org/docs/developer/contributing.html#sign-your-work).

## Getting Started

### Setting up development environment

If you want to contribute to Sailfish OS application we are here to help you to set up development environment.
openHAB client for Sailfish OS is developed using Sailfish IDE.

- Download and install [Sailfish IDE](https://docs.sailfishos.org/Tools/Sailfish_SDK/Installation/)

You are ready to contribute!

### Running the app in the emulator

To run the app in the emulator, follow these steps:

1. Open Sailfish IDE, click on "File", "open File or Project" and select the `harbour-openhab.pro` file.
1. Adjust on the left sidebar the mode to "Debug" and select the emulator "Sailfishos-XXXXXX-i486"
1. Click on Build the project
1. Click on Run the project
1. Now the Emulator should start and you are ready to debug.

Please also check out the official documentation on [Sailfish OS - Your first app](https://docs.sailfishos.org/Develop/Apps/Your_First_App/) for more information.

## Localization

All language/regional translations are managed here [translations/*](/translations/) in the GitHub repository.
If you want to contribute translations, please submit them as pull requests against the `translations/*/openHAB-{language-code}.ts` files directly.

- Go to folder translations.
- If there is a file with your language code, click on it and select the edit icon
- If not:
  - Click on harbour-openHAB.ts file
  - Select copy icon (Copy raw file)
  - Go back, click Add file -> Create new file
  - Enter openHAB-xx.ts replacing xx with your language code as the name. For example, de for german
  - Paste the copied file in the new file's contents
- replace:

  ```xml
  <source>Save</source>
  <translation type="unfinished"></translation>
  ```

  with the correct translation for your language (remove "type="unfinished" and add the translation in between the <translation> tags). For example, for german:

  ```xml
  <source>Save</source>
  <translation>Speichern</translation>
  ```

Thanks for your consideration and contribution!

## CI/CD Pipeline

The project uses two separate GitHub Actions workflows:

- **CI Build** – [`.github/workflows/build.yaml`](/.github/workflows/build.yaml) – runs on every push/PR
- **Release** – [`.github/workflows/release.yaml`](/.github/workflows/release.yaml) – runs only when a version tag is pushed

### CI Build (every push)

On every push to any branch (and on PRs from forks), the CI pipeline automatically:

1. **Builds** RPM packages for all three architectures (aarch64, armv7hl, i486)
1. **Validates** the build output and runs harbour compliance checks
1. Build artifacts (SNAPSHOT RPM files) are available for download from the workflow run for 30 days

No release is created. This is a pure CI check.

> **Note:** When a Pull Request is opened from an internal feature branch, the build runs only once (triggered by `push`). The `pull_request` trigger is reserved for PRs from **forks**, avoiding duplicate builds. A manual build can always be started via `workflow_dispatch`.

### Creating a Release

Releases are triggered by pushing a **git tag** with a specific naming convention:

| Tag format                     | Example          | Result                                  |
|--------------------------------|------------------|-----------------------------------------|
| `v<Version>-<Release>-release` | `v0.1-3-release` | Full GitHub Release (must be on `main`) |
| `v<Version>-<Release>-beta`    | `v0.1-4-beta`    | GitHub Pre-Release (any branch)         |

#### Release workflow

1. Bump `Version` and/or `Release` in `harbour-openhab.spec` (and `harbour-openhab.pro`)
1. Update `harbour-openhab.changes` with a changelog entry
1. For a **full release**: merge your PR into `main`, then create and push the tag:

   ```shell
   git tag v0.1-3-release
   git push origin v0.1-3-release
   ```

1. For a **beta / pre-release**: push the tag from your feature branch:

   ```shell
   git tag v0.1-4-beta
   git push origin v0.1-4-beta
   ```

The release pipeline will build all architectures, verify tag ↔ spec consistency, and create the GitHub Release with all RPM packages attached.

### Build targets

| Architecture | Description            |
|--------------|------------------------|
| aarch64      | 64-bit ARM devices     |
| armv7hl      | 32-bit ARM devices     |
| i486         | Emulator / x86 devices |

### Local build (sfdk)

To build locally with the Sailfish SDK, run the following commands for each target:

```shell
sfdk config target=SailfishOS-5.0.0.43-aarch64
sfdk config --show
sfdk build
```

Repeat with `armv7hl` and `i486` targets to produce all three packages.

## Checks to be done before submitting a pull request

- Decide on the next version number for the app. Please follow [Semantic Versioning](https://rpm.org/docs/6.0.x/man/rpm-version.7) and update the VERSION and RELEASE in the `harbour-openhab.spec` and `harbour-openhab.pro` files.
- Update the [harbour-openhab.changes](/rpm/harbour-openhab.changes) with a description of the changes you have made.
- Check folder [translations/*](/translations/) for missing translations and add them if needed.
- Are new permissions needed for the app? If so, please add them to the `harbour-openhab.desktop`.
- If you have added new features, please update:
  - [USAGE.md](/docs/USAGE.md) for full documentation
  - [README.md](/docs/README.md) update short list of features
  - add new screenshots - if needed - to the [images](/docs/images/) folder and update the screenshots in the documentation accordingly.
- Do we need to update our privacy policy? If so, please update the [PRIVACY_POLICY](https://github.com/openhabfoundation/openhabfoundation.github.io/blob/main/privacy.md) documentation and raise a Pull Request.
