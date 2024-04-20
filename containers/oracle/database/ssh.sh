#!/bin/bash

set -o allexport
[[ -f .env ]] && source .env &> /dev/null
[[ ! -z "$1" ]] && source "$1.env" &> /dev/null
set +o allexport

uid=0
if [[ ! -z "$2" && "$2" == "root" ]]; then
    uid=0
elif [[ ! -z "$2" ]]; then
    uid="$2"
else
    uid=0
fi

docker exec -u "$uid" -it "$CONTAINER_NAME" /bin/bash
