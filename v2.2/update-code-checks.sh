#!/usr/bin/env bash
set -e

# openHAB documentation
# This script is used to generate statistics for the repository

# Helper functions
timestamp() { date +"%F_%T_%Z"; }
echo_process() { echo -e "\e[1;94m$(timestamp)\e[0m $*"; }

# Log everything to a file
#exec &> >(tee -a "update-docs-$(date +%Y-%m-%d_%H%M%S).log")

# Switch to the script folder
cd $(dirname $0) || exit 1
if [ ! -f "$(dirname $0)/CNAME" ]; then
  echo "I'm confused and don't know where I am. Exiting." >&2
  exit 1
fi

# Prerequisites
if ! command -v linkchecker &>/dev/null || ! command -v npm &>/dev/null; then
  echo "The npm or linkchecker command were not found on the system. Please install. Exiting."
  exit 1
fi

echo_process "Checking for invalid links on docs.openhab.org, this will take some time... "
linkchecker -F html/lc_result.html -F text/lc_result.txt -r 3 --quiet http://docs.openhab.org

echo_process "Processing invalid links results... "
lc_result=$(tail -2 lc_result.txt | head -1)
rm -f lc_result.txt
if [[ $lc_result != "That's it"* ]]; then
  echo "Linkchecker encountered an error. Exiting." >&2
  rm -f lc_result.html
  exit 1
fi
echo $lc_result

lc_warnings=$(echo $lc_result | cut -d' ' -f 6)
lc_errors=$(echo $lc_result | cut -d' ' -f 9)
sed -i "/linkchecker_warnings/s/-[0-9]\+-/-$lc_warnings-/g" README.md
sed -i "/linkchecker_errors/s/-[0-9]\+-/-$lc_errors-/g" README.md

rm -f invalidlinks.html
mv lc_result.html invalidlinks.html
echo_process "Results written to README.md, details will be available in \"invalidlinks.html\"."

echo_process "Checking for remark linting errors... (not yet implemented)"
#npm install
#node_modules/.bin/remark . > remarkerrors.txt
# echo "https://img.shields.io/badge/markdown_errors-$remark_warnings-orange.svg"
