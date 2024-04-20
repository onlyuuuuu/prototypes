#!/bin/sh

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
echo "Location of [$(basename "${BASH_SOURCE[0]}")] is: $SCRIPT_DIR"
CODEBASE_BASEDIR=$(dirname $SCRIPT_DIR)
PROJECT=$(basename $CODEBASE_BASEDIR)
echo "Location of project [$PROJECT] is: $CODEBASE_BASEDIR"
CODEBASE_PARENT_DIR=$(dirname $CODEBASE_BASEDIR)
echo "Parent directory of project [$PROJECT] is: $CODEBASE_PARENT_DIR"

./gradlew wrapper --gradle-version latest
