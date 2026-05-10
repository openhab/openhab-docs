#!/bin/sh
# This is a temporary script ('2026) used to migrate the documentation files to the new structure under the src directory.
# Once the migration is done and the files are moved into src/, this script can be removed.


# sanity check
if [ ! -d ".vuepress" ]; then
  echo "This script should be run from the root of the documentation repository."
  exit 1
fi

smart_move() {
    local src="$1"
    local dst="$2"

    if [ ! -d "$src" ]; then
        echo "Skipping '$src': Not a directory."
        return 1
    fi

    # Ensure dst exists
    mkdir -p "$dst"

    if rsync -a --remove-source-files "$src/" "$dst/"; then
        # Delete the remaining empty directory structure
        # 'rm -rf' is safe here because rsync already moved the files
        rm -rf "$src"
        echo "Success: Moved $src to $dst"
    else
        echo "Error: rsync failed"
        return 1
    fi
}

mkdir -p src

mv introduction.md src/index.md

smart_move addons/uis/apps src/apps
smart_move tutorials/getting_started src/tutorial
smart_move developers src/developer

sed -i 's|openhab-docs/main/developers/ide/|openhab-docs/main/src/developer/ide/|g' src/developer/ide/vscode.md

for folder in administration concepts configuration installation mainui ui; do
    smart_move "$folder" "src/$folder"
done

# remove old files
rm -f src/installation/designer.md
rm -f src/configuration/transform.md
rm -rf src/developer/extensionservices
rm -rf community appendix tutorials