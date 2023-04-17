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
    	=> input sample as raw JSON body: {"customerID": 2, "initialCredit": 70}
  
  GET /api/v1/customer/{customerId}
    	=> customerId can be set to 1, 2, or 3. 
