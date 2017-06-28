#!/bin/bash

echo "Navigating to JVM Consumer directory..."

cd code-repository/pact-poc-jvm-consumer

echo "Building application..."

./gradlew clean build

echo "Publishing Pact to Pact Broker..."

./gradlew pactPublish
