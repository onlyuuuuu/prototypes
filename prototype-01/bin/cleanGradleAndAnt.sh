#!/bin/sh

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
echo "Location of [$(basename "${BASH_SOURCE[0]}")] is: $SCRIPT_DIR"
CODEBASE_BASEDIR=$(dirname $SCRIPT_DIR)
PROJECT=$(basename $CODEBASE_BASEDIR)
echo "Location of project [$PROJECT] is: $CODEBASE_BASEDIR"
CODEBASE_PARENT_DIR=$(dirname $CODEBASE_BASEDIR)
echo "Parent directory of project [$PROJECT] is: $CODEBASE_PARENT_DIR"

CATALINA_BASE=$(find $CODEBASE_PARENT_DIR -maxdepth 1 -type d -name '*tomcat*base*' -print -quit); export CATALINA_BASE
CATALINA_HOME="${CATALINA_BASE/-base/-home}"; export CATALINA_HOME

echo "CATALINA_HOME: $CATALINA_HOME"
echo "CATALINA_BASE: $CATALINA_BASE"

cd $CODEBASE_BASEDIR

ant -Dproperties.source=$CODEBASE_BASEDIR/ant.properties -Dcatalina.home=$CATALINA_HOME clean

./gradlew clean
