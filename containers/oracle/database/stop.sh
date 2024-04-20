#!/bin/bash

set -o allexport
[[ -f .env ]] && source .env &> /dev/null
[[ ! -z "$1" ]] && source "$1.env" &> /dev/null
set +o allexport

compose_file=$([[ -f "$DOCKER_COMPOSE_FILE" ]] && echo "$DOCKER_COMPOSE_FILE" || echo "docker-compose.yml")
IFS=','
read -ra TOKEN_LIST <<< "$SED_PERL_REPLACE_TOKENS"
for token in "${TOKEN_LIST[@]}"; do
  replace_this=$(echo ${!token} | sed 's/[^[:alnum:]]/\[&\]/g')
  with_this=$(echo "\${$token}" | sed 's/[^[:alnum:]]/\\&/g')
  echo "Restoring ${!token} back to \${$token} in $DOCKER_COMPOSE_FILE by using this pattern $replace_this and replace it with $with_this"
  if [[ "$(uname)" == "Darwin"* ]]; then
    sed -i '' -e "s/$replace_this/$with_this/g" $compose_file
  else
    sed -i -e "s/$replace_this/$with_this/g" $compose_file
  fi
done

if [[ "$2" == "prune"  ]]; then
  docker compose -p "$PROJECT_NAME" down
  docker volume rm "$VOLUME_NAME"
else
  docker compose -p "$PROJECT_NAME" down
fi

./clean.sh
