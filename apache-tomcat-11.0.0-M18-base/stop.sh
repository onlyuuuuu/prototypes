#!/bin/sh

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
echo "Location of [$(basename "${BASH_SOURCE[0]}")] is: $SCRIPT_DIR"
source $SCRIPT_DIR/bin/setenv.sh
# Re-update var SCRIPT_DIR since it has changed after the source
SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )

echo "Stopping Tomcat..."
$CATALINA_HOME/bin/shutdown.sh
(sleep 3)
$CATALINA_BASE/clear.sh
