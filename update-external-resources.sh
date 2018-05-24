#!/usr/bin/env bash
set -e

# openHAB documentation
# This script is used to retrieve external resources and integrate them in the documentation (e.g. Binding READMEs).
# If you are here to help improve the documentation content, you can ignore this file.

# Helper functions
timestamp() { date +"%F_%T_%Z"; }
echo_process() { echo -e "\\e[1;94m$(timestamp)\\e[0m $*"; }

# Log everything to a file
#exec &> >(tee -a "update-docs-$(date +%Y-%m-%d_%H%M%S).log")

# Switch to the script folder
cd "$(dirname $0)" || exit 1
if [ ! -f "$(dirname $0)/CNAME" ]; then
  echo "I'm confused and don't know where I am. Exiting." >&2
  exit 1
fi
resourcefolder=$(dirname "$0")/.external-resources
mkdir -p "$resourcefolder"
echo -e "# About\\n\\nUsed to temporarily store repository clones from related openHAB projects for 'update-external-resources.sh'." > "$resourcefolder/README.md"

# Prerequisites
if ! command -v git &>/dev/null || ! command -v mvn &>/dev/null; then
  echo "The git or mvn command were not found on the system. Please install. Exiting."
  exit 1
fi

echo_process "Updating the base openhab-docs repo... (skipping)"
#git pull

# Parameters: $1=name, $2=GitHub project
pull_or_clone_repo() {
  if [ -d "$resourcefolder/$1" ]; then
    echo_process "Updating the '$1' repo... "
    git -C "$resourcefolder/$1" checkout master
    git -C "$resourcefolder/$1" pull
  else
    echo_process "Cloning the '$1' repo... "
    mkdir "$resourcefolder/$1"
    git clone "https://github.com/$2" "$resourcefolder/$1"
  fi
}

pull_or_clone_repo "smarthome" "eclipse/smarthome.git"
pull_or_clone_repo "openhab-distro" "openhab/openhab-distro.git"
pull_or_clone_repo "openhab1-addons" "openhab/openhab1-addons.git"
pull_or_clone_repo "openhab2-addons" "openhab/openhab2-addons.git"
pull_or_clone_repo "openhab-bundles" "openhab/openhab-bundles.git"
pull_or_clone_repo "openhabian" "openhab/openhabian.git"
pull_or_clone_repo "openhab-alexa" "openhab/openhab-alexa.git"
pull_or_clone_repo "openhab-mycroft" "openhab/openhab-mycroft.git"
pull_or_clone_repo "openhab-android" "openhab/openhab-android.git"

echo_process "Updating submodules of the 'openhab-bundles' repo... "
git -C "$resourcefolder/openhab-bundles" submodule update --recursive --remote --init

echo_process "Running Maven Clean Plugin... "
mvn clean
echo_process "Running Maven Package Plugin... "
mvn package
