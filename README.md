# SDAT Sprint CLI (Java)
## This project is a Command Line Interface (CLI) application that consumes the SDAT Sprint API and displays report data directly in the terminal.

## The CLI allows users to request reports related to:
- Cities
- Airports
- Aircraft
- Passengers

## Tech 
- Java 17
- Maven
- REST API (HTTP requests)

## How It Works
- The CLI sends HTTP requests to the SDAT Sprint API
- The API processes data using Spring Boot + MySQL
- The CLI prints the returned JSON to the console

## How to run 
1. Start the API 
- Make sure the SDAT sprint API runs on : http://localhost:8080

2. Build the CLI 
- From the project root : mvn clean package

3. Run the CLI 
- java -cp target/sprintcli-1.0-SNAPSHOT.jar com.keyin.sdat.App

4. When started, the CLI displays a menu
- Each option:
- Calls the appropriate API endpoint
- Prints the response as formatted JSON


### API Dependency

- This project depends on the SDAT Sprint API.
- If the API is not running, the CLI will not return data.