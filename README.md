# Project: Task Management System
This project features all the necessary components of a Spring Boot REST API
for a task manager using JPA/Hibernate for data persistence
and a MySQL database for data storage and management.

## Main Features
* CRUD operations for task management
* RESTful API endpoints
* JPA/Hibernate integration
* H2/MySQL database support

## Setup
You can run this project by following the steps below:
1. Clone the repository.
2. Configure database settings in `application.properties` if necessary.
3. Run the project's main class (`TaskManagementSystemApplication`).
4. Access the API at `http://localhost:8080/api/tasks/`.

## API Operations
The project performs the following operations:
* **Get all tasks**
   * _HTTP method:_ `GET`
  * _API endpoint:_ `/api/tasks/`
* **Get task by ID**
   * _HTTP method:_ `GET`
   * _API endpoint:_ `/api/tasks/{taskId}`
* **Create task**
   * _HTTP method:_ `POST`
   * _API endpoint:_ `/api/tasks/`
    * _JSON body:_ { "title":"...", "descriptions":"...", "completed":... }
* **Update task**
   * _HTTP method:_ `PUT`
   * _API endpoint:_ `/api/tasks/{taskId}?title=...&descriptions=...&completed=...`
* **Delete task**
   * _HTTP method:_ `DELETE`
   * _API endpoint:_ `/api/tasks/{taskId}`