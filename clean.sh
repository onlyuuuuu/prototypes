#!/bin/bash

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
echo "Location of [$(basename "${BASH_SOURCE[0]}")] is: $SCRIPT_DIR"

find $SCRIPT_DIR -name ".DS_Store" -type f -print -delete
find $SCRIPT_DIR -name "* 2" -type f -print -delete
find $SCRIPT_DIR -name "* 2" -type d -print -delete
