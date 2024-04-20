#!/bin/bash

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
echo "Location of [$(basename "${BASH_SOURCE[0]}")] is: $SCRIPT_DIR"

git config init.defaultBranch main
git config core.autocrlf false
git config user.name "Andy"
git config user.email "duyanhnn@outlook.com"
git remote add origin https://$GITHUB_TOKEN@github.com/onlyuuuuu/prototypes &> /dev/null
git branch --set-upstream-to=origin/"$1" "$1" &> /dev/null
git checkout "$1"
git pull
git add $SCRIPT_DIR
git commit -m "$2"
git push --set-upstr
