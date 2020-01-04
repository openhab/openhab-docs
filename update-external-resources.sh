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
    # Make sure to get all available branches in case of future script adaptions
    git -C "$resourcefolder/$1" fetch origin -v

    echo_process "Updating the '$1' repo... "
    git -C "$resourcefolder/$1" checkout $3
    git -C "$resourcefolder/$1" pull
  else
    echo_process "Cloning the '$1' repo... "
    mkdir "$resourcefolder/$1"
    git clone --branch $3 "https://github.com/$2" "$resourcefolder/$1"
  fi
}

# Pull or clone the repo with a specified branch into the given folder
pull_or_clone_repo "smarthome" "eclipse/smarthome.git" master
pull_or_clone_repo "openhab-distro" "openhab/openhab-distro.git" 2.5.x
pull_or_clone_repo "openhab1-addons" "openhab/openhab1-addons.git" master
pull_or_clone_repo "openhab-addons" "openhab/openhab-addons.git" 2.5.x
pull_or_clone_repo "openhab-bundles" "openhab/openhab-bundles.git" 2.5.x
pull_or_clone_repo "openhabian" "openhab/openhabian.git" master
pull_or_clone_repo "openhab-alexa" "openhab/openhab-alexa.git" master
pull_or_clone_repo "openhab-mycroft" "openhab/openhab-mycroft.git" master
pull_or_clone_repo "openhab-android" "openhab/openhab-android.git" master
pull_or_clone_repo "openhab-google-assistant" "openhab/openhab-google-assistant.git" master
pull_or_clone_repo "openhab-webui" "openhab/openhab-webui.git" 2.5.x

echo_process "Updating submodules of the 'openhab-bundles' repo... "
git -C "$resourcefolder/openhab-bundles" submodule update --recursive --remote --init

echo_process "Fetching feature.xml file from the snapshot repository..."
wget -r -l 1 -npdH -A '*.xml' -P "$resourcefolder/jfrog-files" "https://openhab.jfrog.io/openhab/libs-snapshot/org/openhab/distro/openhab-addons/2.5.1-SNAPSHOT/"
# Copy the lates feature file into the finally used feature.xml
cp `ls .external-resources/jfrog-files/openhab-addons-2.5.0-*-features.xml | sort | tail -1` .external-resources/jfrog-files/feature.xml

echo_process "Running Maven Clean Plugin... "
mvn clean
echo_process "Running Maven Package Plugin... "
mvn package
