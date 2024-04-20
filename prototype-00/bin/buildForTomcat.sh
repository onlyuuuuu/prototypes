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

source $CATALINA_BASE/bin/setenv.sh
# Re-update var SCRIPT_DIR since it has changed after the source
SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )

cd $CODEBASE_BASEDIR

rm -rf $CODEBASE_BASEDIR/src/main/java/org/apache/jsp/* $CODEBASE_BASEDIR/src/main/webapp/WEB-INF/generated_web.xml

ant -Dproperties.source=$CODEBASE_BASEDIR/ant.properties -Dcatalina.home=$CATALINA_HOME jspc

java $CODEBASE_BASEDIR/src/main/java/com/onlyu/app/tasks/WebXmlFormatter.java $CODEBASE_BASEDIR/src/main/webapp/WEB-INF/web.xml

./gradlew clean build


