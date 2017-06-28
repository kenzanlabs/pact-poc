#!/bin/bash

echo "Navigating to Microservice directory..."

cd code-repository/pact-poc-microservice

echo "Building application..."

./gradlew clean build

echo "Running application in background..."

nohup ./gradlew bootRun &

sleep 10

echo "Verifying application with Pacts from Pact Broker..."

./gradlew pactVerify
