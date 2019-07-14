#!/bin/sh
mvn clean package && docker build -t de.schoeffm/conneg .
docker rm -f conneg || true && docker run -d -p 8080:8080 -p 4848:4848 --name conneg de.schoeffm/conneg 
