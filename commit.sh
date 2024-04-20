#!/bin/bash

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
echo "Location of [$(basename "${BASH_SOURCE[0]}")] is: $SCRIPT_DIR"

git config pull.rebase true
git config init.defaultBranch main
git config core.autocrlf false
git config push.autoSetupRemote true
git config user.name "Andy"
git config user.email "duyanhnn@outlook.com"
git fetch
git stash
git pull
git stash pop
./clean.sh
git add $SCRIPT_DIR
git commit -m "Auto-generated commit message: /dev/null"
git push
