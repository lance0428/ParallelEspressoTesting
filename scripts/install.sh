#!/bin/bash

# prepare devices
devices=()
for device in $(adb devices | grep -v List | grep device)
do
    if [ $device == "device" ]; then
        continue
    fi
    devices+=("$device")
done

for index in "${!devices[@]}"
do
    device=${devices[$index]}
    echo "Setting up device = $device"
    adb -s $device uninstall com.ldj.parallelespressotesting
    adb -s $device uninstall com.ldj.parallelespressotesting.test
    adb -s $device install app/build/outputs/apk/debug/app-debug.apk
    adb -s $device install app/build/outputs/apk/androidTest/debug/app-debug-androidTest.apk
done
