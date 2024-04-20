#!/bin/sh

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
echo "Location of [$(basename "${BASH_SOURCE[0]}")] is: $SCRIPT_DIR"
source $SCRIPT_DIR/bin/setenv.sh
# Re-update var SCRIPT_DIR since it has changed after the source
SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )

rm -rf $CATALINA_BASE/webapps/* $CATALINA_BASE/work/* $CATALINA_BASE/temp/* $CATALINA_BASE/logs/* $CATALINA_BASE/errs
