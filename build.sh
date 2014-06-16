#!/bin/bash
mvn clean package && cp target/*.zip ~/git/gitblit/data/plugins

