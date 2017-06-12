# pact-poc

## Developing a Service Locally

NOTE: Each Terminal begins at the project root, `pact-poc/`.

### Setup

#### Terminal 1: Start Pact Broker

The Pact Broker needs to run continuously in the background. It is configured to run on port 80.

```bash
cd pact-poc-pact-broker/
docker-compose up --build
```

#### Terminal 2: Build JVM Consumer and Publish Pact to Pact Broker

JVM Consumers implement PactFragment classes to specify the expectation they have for services they rely on. Building will create these 'mocks' and gradle `pactPublish` will publish them to the Pact Broker. It is up to each consumer to update the Pact Broker with any expectations they have for services and to update the broker with changes to the pacts. This allows services to reach out to the broker and verify they continue to meet the pacts they have.

```bash
cd pact-poc-jvm-consumer/
./gradlew build
./gradlew pactPublish
```

#### Terminal 3: Start Microservice

The service being developed/tested must be running for the pacts to be verified. It is configured to run on port 8080. This service has the SpringBoot DevTools package included which enables the service to be reloaded when changes are made to the source during development.

```bash
cd pact-poc-microservice/
./gradlew clean build
./gradlew bootRun
```

### Developing the Service

#### Terminal 4: Verify Pacts

As changes are made, run gradle `pactVerify` to have the service reach out to the Pact Broker to receive all the consumer pacts and verify the pacts are still being met.

```bash
cd pact-poc-microservice/
./gradlew pactVerify
```
