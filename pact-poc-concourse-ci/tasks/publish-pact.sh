#!/bin/bash

echo "Navigating to JVM Consumer directory..."

cd jvm-consumer-repo/pact-poc-jvm-consumer

echo "Building application..."

./gradlew clean build

echo "Publishing Pact to Pact Broker..."

./gradlew pactPublish
