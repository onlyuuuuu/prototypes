#!/bin/bash

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
echo "Location of [$(basename "${BASH_SOURCE[0]}")] is: $SCRIPT_DIR"

javac Factorial.java
java -Xms256m -Xmx512m -Xdebug -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:1199 Factorial
