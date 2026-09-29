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

**TIP:** If the service fails to run with errors saying that connection to the database was refused,
check to make sure the database is not sleeping.
If it is sleeping, open the frontend to send a request to the backend for data, this will wake it up.
After which you can try again.

### Manual run

`./gradlew bootRun`

### Manually tunneling to the database

You can tunnel with the following command (assuming you already have the Railway CLI and are already logged in):

`railway connect Postgres --tunnel-only --port 35001`

This will spawn a long running process that will keep a tunnel to the database open, accessible on localhost:35001.
