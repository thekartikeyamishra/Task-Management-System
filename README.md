# Task Management System

A simple Task Management System built with **Spring Boot** to demonstrate core features such as REST APIs, Dependency Injection, Database Integration, Profiles, Exception Handling, and Scheduling.

---

## Features

1. **REST API**: Manage tasks using endpoints.
2. **Dependency Injection**: Decoupled service and controller layers.
3. **H2 Database Integration**: In-memory database for storing tasks.
4. **Profiles**: Separate configurations for development and production environments.
5. **Exception Handling**: Global exception handling for consistent error responses.
6. **Task Scheduling**: Periodic execution of scheduled tasks.

---

## Technology Stack

- **Java**
- **Spring Boot**
- **H2 Database**
- **Maven**

---

## Prerequisites

1. **Java JDK 17 or higher**
2. **Maven**
3. **Visual Studio Code** with Java Extension Pack

---

## Setup Instructions

1. Clone the repository:
   ```bash
   git clone [thekartikeyamishra/Task-Management-System](https://github.com/thekartikeyamishra/Task-Management-System)
   cd task-management-system
   ```

2. Import the project into your IDE (e.g., VSCode).

3. Build the project:
   ```bash
   mvn clean install
   ```

4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

5. Access the H2 Database Console:
   - URL: `http://localhost:8080/h2-console`
   - JDBC URL: `jdbc:h2:mem:testdb`

---

## API Endpoints

### 1. Get All Tasks
**Request**: `GET /tasks`  
**Response**:
```json
[
  {
    "id": 1,
    "name": "Learn Spring Boot",
    "completed": false
  }
]
```

### 2. Add a Task
**Request**: `POST /tasks`  
**Body**:
```json
{
  "name": "Learn Spring Boot",
  "completed": false
}
```
**Response**:
```json
{
  "id": 1,
  "name": "Learn Spring Boot",
  "completed": false
}
```

---

## Configuration

### Default Configuration (`application.properties`):
```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```

### Development Profile (`application-dev.properties`):
```properties
server.port=8081
```

### Production Profile (`application-prod.properties`):
```properties
server.port=8082
```

Switch profiles during runtime:
```bash
mvn spring-boot:run -Dspring-boot.run.profiles=dev
```

---

## Scheduled Tasks

The application includes a scheduled task that runs every 5 seconds and prints a message to the console.

---

## Exception Handling

Global exception handling is implemented using `@ControllerAdvice`. For example, if an error occurs, the response will look like this:
```json
{
  "message": "Error: Something went wrong!"
}
```

---

## Future Enhancements

1. Add authentication and authorization.
2. Integrate with an external database like MySQL or PostgreSQL.
3. Implement unit and integration tests.

---

