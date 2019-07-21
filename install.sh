#!/bin/bash
git pull origin
version=1.0.2
#mvn versions:set -DnewVersion=${version} package -Dmaven.test.skip=true
workdir=$(cd $(dirname $0); pwd)
echo ${workdir}
mvn package -DskipTests



