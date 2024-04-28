#!/bin/bash

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
echo "Location of [$(basename "${BASH_SOURCE[0]}")] is: $SCRIPT_DIR"

javac Factorial.java
jar --verbose --create --main-class Factorial --file factorial.jar Factorial.class
target="-jar factorial.jar"
if [[ ! -z "$1" && "$1" == "jar" ]]; then
  target="-jar factorial.jar"
else
  target="Factorial"
fi
java -Xms256m -Xmx512m -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,quiet=y,address=*:1199 $target
