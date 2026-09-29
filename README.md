# Something Baked Website - Backend 🔥

Built with Kotlin and Spring Boot

## Env variables

To start the service, you will need an `.env` file at the root of the project.
This file needs 3 values:
- DB_URL=jdbc:postgresql://127.0.0.1:35001/railway
- DB_USERNAME=<get_from_railway>
- DB_PASSWORD=<get_from_raliway>

## Building

`./gradlew build`

## Running

### Via Makefile

There is a helpful command in the Makefile called `run`.
In addition to starting the service, it also tunnels to the database running in Railway.

To get this to work, you will need the [Railway CLI](https://docs.railway.com/cli). 
Once installed, make sure you [log in via the CLI](https://docs.railway.com/cli#authentication).

After that is done, simply run `make run` in your terminal to start the service with a connection to the deployed database.

### Manual run

`./gradlew bootRun`

