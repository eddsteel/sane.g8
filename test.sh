#!/bin/sh

set -x

mkdir -p target
cd target
g8  --name=test --force file://../
cd test
sbt compile
