# Connect IQ SDK Installation

## Troubleshooting

When you run into issues with the installation of the Connect IQ SDK, please try if the following steps help.

### Fedora 42

After downloading the Connect IQ SDK Manager, you may need to install the following dependencies:

- `libwebkit2gtk-4.0.so.37`:

  ```bash
  dnf install webkit2gtk4.0
  ```

- `libjpeg.so.8`: The libjpeg coming with Fedora/CentOS project (libjpeg-turbo) only provides v6 implementation of JPEG (aka. libjpeg.so.62).
  You can install libjpeg 7, 8 and nine library files from the [aflyhorse/libjpeg copr](https://copr.fedorainfracloud.org/coprs/aflyhorse/libjpeg/):

  ```bash
  dnf copr enable -y aflyhorse/libjpeg
  dnf install libjpeg8
  ```
