#!/bin/bash

echo "Oracle database has started..."
cd $CONTAINER_RESOURCES_DIR
echo exit | sqlplus SYSTEM/\""$ORACLE_PWD"\"@LEARNPDB @0_patient_zero.sql "$PATIENT_ZERO_USERNAME" "$PATIENT_ZERO_PASSWORD"
tar -xvf db-sample-schemas-19c.tar.gz --directory $HOME
cd $HOME/db-sample-schemas-19c/
replace_this=$(echo '__SUB__CWD__' | sed 's/[^[:alnum:]]/\\&/g')
with_this=$(echo $(pwd) | sed 's/[^[:alnum:]]/\\&/g')
sed -i -e "s/$replace_this/$with_this/g" *.sql
sed -i -e "s/$replace_this/$with_this/g" */*.sql
sed -i -e "s/$replace_this/$with_this/g" ./product_media/pm_p_lob.dat
source /usr/local/bin/oraenv
if [[ "$SAMPLE_SCHEMAS_INSTALL" == "true" ]]; then
  $HOME/setPassword.sh verySimple
  echo exit | sqlplus SYS/verySimple@LEARNPDB as SYSDBA @mksample \
    verySimple \
    verySimple \
    verySimple \
    verySimple \
    verySimple \
    verySimple \
    verySimple \
    verySimple \
    USERS \
    TEMP \
    $HOME/logs/ \
    LEARNPDB
  $HOME/setPassword.sh "$ORACLE_PWD"
  cd $CONTAINER_RESOURCES_DIR
  echo exit | sqlplus SYSTEM/\""$ORACLE_PWD"\"@LEARNPDB @1_sample_schemas_passwords.sql "$SAMPLE_SCHEMAS_PASSWORD"
fi
