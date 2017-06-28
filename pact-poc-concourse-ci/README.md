# pact-poc: pact-poc-concourse-ci

Concourse CI pipelines for Publishing and Verifying Contracts using Pact. The pipelines are specified in `pipeline.yml`, specifying tasks to run in containers. The container definitions and scripts to run for each task are located in the `tasks` directory.

## Concourse Help

```bash
fly help
```

## First Time Login

```bash
fly --target my-target login --concourse-url <CONCOURSE_URL>
```

NOTE: The shortform for `--target` is `-t` and will be used in subsequent commands.

## Subsequent Logins

```bash
fly -t my-target login
```

## Set Pipeline

```bash
fly -t my-target set-pipeline -p pact-poc -c pipeline.yml -l params.yml
```

## Unpause Pipeline

```bash
fly -t my-target unpause-pipeline -p pact-poc
```

## Watch Pipeline Logs

```bash
fly -t my-target watch --job pact-poc/publish-pact --build 1
fly -t my-target watch --job pact-poc/verify-pacts --build 1
```
