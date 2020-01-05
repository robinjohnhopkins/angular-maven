#!/bin/sh

echo building...
mvn install && java -jar  target/angular-maven-0.0.1-SNAPSHOT.jar

echo yeh baby

