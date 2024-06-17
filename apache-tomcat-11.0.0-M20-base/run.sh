#!/bin/sh

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
echo "Location of [$(basename "${BASH_SOURCE[0]}")] is: $SCRIPT_DIR"
source $SCRIPT_DIR/bin/setenv.sh
# Re-update var SCRIPT_DIR since it has changed after the source
SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )

if [[ "$1" == "" ]]; then
  echo "Usage: ./run.sh <project> [--build][OPTIONAL]"
  exit 1
fi

echo "SCRIPT_DIR: $SCRIPT_DIR"
echo "PROJECT: $1"

CODEBASE=$(dirname $SCRIPT_DIR)/"$1"

echo "CODEBASE: $CODEBASE"

if [ "$2" = "--build" ]; then
  cd $CODEBASE
  ./gradlew clean build
fi

echo "Clearing deprecated items..."
cd $CATALINA_BASE
./clear.sh

echo "Copying archive..."
mkdir -p $CATALINA_BASE/webapps/ROOT/
cp -rf $CODEBASE/build/libs/*.war $CATALINA_BASE/webapps/ROOT/ROOT.war

echo "Extracting and installing..."
cd $CATALINA_BASE/webapps/ROOT
jar xf *.war
rm -rf *.war

trap "echo '' && $CATALINA_BASE/stop.sh" EXIT

echo "Starting Tomcat..."
$CATALINA_HOME/bin/startup.sh
(sleep 3)
tail -f -n +1 $CATALINA_BASE/logs/catalina.out
