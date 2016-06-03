#!/bin/sh
# This script can be used to update all submodules and re-generated the automatically constructed documentation pages

cd _repos/smarthome
git checkout master
git pull

cd ../openhab
git checkout master
git pull

cd ../openhab2-addons
git checkout master
git pull

cd ../..
mvn clean package
