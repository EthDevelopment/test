# Interview Test

## Introduction

Welcome to MagiDash Corp - Our mission is to empower people in corporations to have one place to visualise any data relevant to their job. As such, we create rich and flexible dashboarding tools which will integrate seamlessly with any data source and present the data in many different formats.

To get the project started we want to be able to show a list of dummy dashboards to users so that we can get a feel for if the clients like the concepts in a demo form.

Provided is a docker based environment that uses [docker-compose](https://docs.docker.com/compose/) which contains a mysql container and an nginx container.

## Interview Task

Your task is to build an api service which implements a `/dashboards` endpoint that returns a list of dashboard objects retrieved from the mysql database provided.

The expected format of the dashboard object should be roughly

```json
{
  "id": <Long>,
  "createdAt": <Date>,
  "updatedAt": <Date>,
  "title": <String>
}
```

You may choose any language and framework to build the api. During the onsite portion of the interview you will be expected to work through a set of stories which will evolve this api service to meet new requirements.

You will need to update the docker-compose.yml file to include your api service so that `smoke_tests.sh` runs against your service.

You should also ensure that the smoke tests pass. This will require a sql script that seeds the database with some data.

## Getting Started

### Prerequisites

Before running the environment you will need to ensure you have the required software installed.

Running `./check_prerequisites.sh` will check what software you need to install on your machine to get this working.

### Running the environment

To run the environment, run `docker-compose up --force-recreate` in the terminal. This will bring up the terminal and the "fake" api service.

Once the environment is running, in another shell you should be able to run `./smoke_tests.sh` which will test that the service returns at least one dashboard and it has the correct properties.

The api is available on `http://localhost/` and the mysql server is available on mysql:3306. These ports can be easily changed in the docker-compose.yml file, however be aware that the smoke_tests.sh file will also need updating.

### Working with the database

The seed scripts for the database are located in the `database` folder. When the database container is created, the
scripts will be run automatically.

To apply any script changes when the database is already running you will need to stop the running database container
and destroy it. Running `docker-compose down` will stop the environment and destroy the containers for you, the next
time you bring the environment up the containers will be created again.

### Tasks

Part 1 - Setup and verification

1. ./check_prerequisites.sh ✅
2. docker --version (24.0.2) ✅
3. docker compose version v2.19.1 ✅
4. test docker-compose-up ❌

(base) swalehabdulrehman@MachineX anaplan_interview % docker-compose up --force-recreate
[+] Running 0/1
⠹ mysql-db Pulling 2.1s
no matching manifest for linux/arm64/v8 in the manifest list entries

5. Fix docker-compose-up ✅

   image: arm64v8/mysql:8.0

“Update the docker-compose.yml file to use ARM-compatible images, ensuring that the services can build and run seamlessly on ARM architecture machines.”

6. smoketests ✅
7. check db is seeding data ✅

Part 2 - API Implementation

Framework and language

Selected Java and Spring
Reasoning - I have limited experience with Java and Python from projects and university and since java will be used for the roll it makes sense to get some experience

Practice? - I will do the helloworld endpoint available in the spring docs to get familiar
https://spring.io/quickstart

https://github.com/EthDevelopment/springHelloWorld

HelloWorld complete, I have a fundamental understanding of how it works

1. Create a dummy endpoint to display text and test input setup ✅

2. Connect my db and display it in any format ❌
   Error 404 thrown

3. Manually seeded the endpoint with ✅
   INSERT INTO dashboards (created_at, updated_at, title) VALUES
   (NOW(), NOW(), 'Dashboard 1'),
   (NOW(), NOW(), 'Dashboard 2'),
   (NOW(), NOW(), 'Dashboard 3');

4. dashboards returns the data formatted as intended ✅

Part 3 - Docker API integration

1. Docker runs with all containers ✅

2. Dashboard endpoint is returning the data ❌

3. Dashboard data is formatted as expected

Part 4 - SmokeTests

1. Smoke tests are adjusted for Dashboard API
