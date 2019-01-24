#!/usr/bin/env bash

#!/bin/sh

build() {
    mvn clean install -Dmaven.test.skip=true || exit 1
    docker build -t afayes/product-api . || exit 1
}


start() {
    docker-compose up
}
stop() {
    docker-compose down
}

run() {
    build
    start
}

push() {
    docker push afayes/product-api
    docker push afayes/product-api
}

logs() {
    docker-compose logs -f
}

case "$1" in
    build)
        build
        ;;
    start)
        start
        ;;
    stop)
        stop
        ;;
    run)
        run
        ;;

    push)
        push
        ;;
    logs)
        logs
        ;;
    *)
        echo "USAGE: $0 {build|start|stop|run|push}"
        echo "build: build the maven project and build the docker image"
        echo "start: start the docker containers"
        echo "stop: stop the docker containers"
        echo "run: build and start"
        echo "push: push images to docker hub"
        echo "logs: shows output from docker containers"
esac
