#!/bin/bash

# Navigate to the project directory
cd /path/to/CustomTrees

# Clean and compile the Maven project
mvn clean package

# Ensure the JAR file is copied to target/CustomTrees-1.0.jar
cp target/CustomTrees-*.jar target/CustomTrees-1.0.jar

# Indicate completion
echo "Build completed: target/CustomTrees-1.0.jar"