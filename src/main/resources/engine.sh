#!/bin/bash

file=$( cat "src/main/resources/engine.log" | grep "starting" | awk '{ print $3 }' )

echo "$file"

