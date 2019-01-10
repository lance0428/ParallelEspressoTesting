#!/bin/bash

. scripts/config.sh
rawTests=$1

# prepare devices
devices=()
for device in $(adb devices | grep -v List | grep device)
do
    if [ $device == "device" ]; then
        continue
    fi
    devices+=("$device")
done

adb -s ${devices[0]} shell am instrument -w -r -e log true $package.test/$testInstrumentationRunner > $rawTests
