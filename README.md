# Account Manager Application Blue-Bank

## Requirements

Java: openjdk 17

## Build the project

    mvn clean install

## Package the project in one JAR

    mvn clean package

## Run project from command line
	
	 java -jar target/account-manager-0.0.1-SNAPSHOT.jar
	
## Explore Rest API

  POST /api/v1/account
  
  GET /api/v1/customer/{customerId}
