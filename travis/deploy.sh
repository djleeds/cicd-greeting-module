#!/bin/bash
mvn deploy:deploy-file -Durl=$NEXUS_HOST/nexus/content/repositories/releases -DrepositoryId=$NEXUS_REPOSITORY_ID -Dfile=target/greeting-module-$BASE_VERSION_NUMBER.$TRAVIS_BUILD_NUMBER.jar -DpomFile=pom.xml -s travis/maven-settings.xml
