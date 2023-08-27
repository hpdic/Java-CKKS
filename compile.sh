#!/usr/bin/bash

javac -d build main/java/edu/uw/ckks/*.java
javac -d build -cp build test/java/edu/uw/ckks/*.java
