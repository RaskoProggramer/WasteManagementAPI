# Mphorakgope Waste Management System

This is a simple Spring Boot application for managing waste types and their corresponding management instructions. The application exposes RESTful APIs to perform CRUD operations on waste entities.

## Features

- Add new waste types and management instructions
- Retrieve all waste types
- Retrieve a specific waste type by ID
- Update waste type information
- Delete a waste type

## Getting Started

### Prerequisites

- Java 21
- Maven 3.6.3 or higher

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/RaskoProggramer/REST-Api
   
2. Run Application
    - 'Run Icon' In Main Application file
    - Commandline 'mvn clean install'
    - on the browser visit H2 Database console 'http://localhost:8080/h2-console/'
    - make sure JDBC URL: 'jdbc:h2:mem:testdb'
    - leave password blank continue and then inset value
    - on the browser visit 'http://localhost:8080/waste' to view JSON file for the value added

