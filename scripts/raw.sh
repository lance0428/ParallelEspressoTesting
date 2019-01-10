#!/bin/bash

. scripts/config.sh
rawTests=$1

echo "Running test on package $package w/ runner $testInstrumentationRunner and redirecting to $rawTests"

adb shell am instrument -w -r -e log true $package.test/$testInstrumentationRunner > $rawTests
