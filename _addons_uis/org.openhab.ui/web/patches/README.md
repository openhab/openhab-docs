This directory contains patches to node_modules.
Typically, these are related to:

- Vue 3 changes
- TypeScript changes
- bugs in the original version
- updates to imports

Patches are created via the `npx patch-package` command.
Normally, this does not patch package.json files, so if you want to patch a package.json, use the following command:

```shell
npx patch-package package-name --exclude
```

Packages are automatically applied through the `postinstall` script in `package.json`.
