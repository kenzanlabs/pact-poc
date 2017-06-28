#!/bin/bash

echo "Navigating to Microservice directory..."

cd microservice-repo/pact-poc-microservice

echo "Building application..."

./gradlew clean build

echo "Running application in background..."

nohup ./gradlew bootRun >/dev/null 2>&1 &

echo "Sleeping for 5 seconds to ensure application running..."

sleep 5

echo "Verifying application with Pacts from Pact Broker..."

./gradlew pactVerify
