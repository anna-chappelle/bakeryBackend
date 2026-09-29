#!/usr/bin/env bash

PORT=35001

printf "\n===== Tunneling to database =====\n"

railway connect Postgres --tunnel-only --port 35001 &
TUNNEL_PID=$!

cleanup() {
    kill "${TUNNEL_PID}" 2>/dev/null || true
}
trap cleanup EXIT

for _ in $(seq 1 30); do
    if nc -z localhost "${PORT}" 2>/dev/null; then
        printf "\nTunnel up 👅\n"
        break
    fi
    sleep 0.5
done

if ! nc -z localhost "${PORT}" 2>/dev/null; then
    printf "\nTimed out 🥀\n"
    exit 1
fi

printf "\n===== Starting service =====\n"

./gradlew bootRun
