#!/bin/sh

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
echo "Location of [$(basename "${BASH_SOURCE[0]}")] is: $SCRIPT_DIR"
SCRIPT_PARENT_DIR=$(dirname $SCRIPT_DIR)

if [[ "$SCRIPT_PARENT_DIR" == *tomcat*base* || "$SCRIPT_PARENT_DIR" == *base*tomcat* ]]; then
  echo "This is most likely to be CATALINA_BASE, setting CATALINA_BASE now"
  CATALINA_BASE="$SCRIPT_PARENT_DIR"
  CATALINA_HOME="${CATALINA_BASE/-base/-home}"
else
  echo "This is most likely to be CATALINA_HOME, setting CATALINA_HOME now"
  CATALINA_HOME="$SCRIPT_PARENT_DIR"
  CATALINA_BASE="${CATALINA_HOME/-home/-base}"
fi

export CATALINA_BASE
export CATALINA_HOME

echo "CATALINA_BASE: $CATALINA_BASE"
echo "CATALINA_HOME: $CATALINA_HOME"

CATALINA_OPTS="-Xms2048m -Xmx4096m -Xdebug -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:1199"; export CATALINA_OPTS
CATALINA_PID="$CATALINA_BASE/tomcat.pid"; export CATALINA_PID

CHOSEN_JAVA_VERSION=22.0.1
CHOSEN_ANT_VERSION=1.10.14
if [[ "$(uname)" == "Darwin"* ]]; then
  JAVA_HOME="/Users/$USER/Documents/Developments/jdk-$CHOSEN_JAVA_VERSION.jdk/Contents/Home"; export JAVA_HOME
  JRE_HOME="/Users/$USER/Documents/Developments/jdk-$CHOSEN_JAVA_VERSION.jdk/Contents/Home"; export JRE_HOME
  ANT_HOME="/Users/$USER/Documents/Developments/apache-ant-$CHOSEN_ANT_VERSION"; export ANT_HOME
elif [[ "$(uname)" == "MINGW64_NT"* ]]; then
  JAVA_HOME="C:/dev/Java/jdk-$CHOSEN_JAVA_VERSION"; export JAVA_HOME
  JRE_HOME="C:/dev/Java/jdk-$CHOSEN_JAVA_VERSION"; export JRE_HOME
  ANT_HOME="C:/dev/apache-ant-$CHOSEN_ANT_VERSION"; export ANT_HOME
else
  JAVA_HOME="/dev/Java/jdk-$CHOSEN_JAVA_VERSION"; export JAVA_HOME
  JRE_HOME="/dev/Java/jdk-$CHOSEN_JAVA_VERSION"; export JRE_HOME
  ANT_HOME="/dev/apache-ant-$CHOSEN_ANT_VERSION"; export ANT_HOME
fi

JAVA_OPTS="-Xms2048m -Xmx4096m"; export JAVA_OPTS
