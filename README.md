# Restaurant Management System

A full-stack application for managing restaurant information, featuring a RESTful API backend and a modern web frontend built with Spring Boot, Thymeleaf, and Bootstrap.

## Features

- RESTful API for restaurant management
- Modern web interface with responsive design
- CRUD operations for restaurants
- Real-time form validation
- Bootstrap-based UI components

## Tech Stack

### Backend
- Java 17
- Spring Boot
- Spring MVC
- H2 Database
- Liquibase for database migrations

### Frontend
- Thymeleaf templates
- Bootstrap 5
- JavaScript (ES6+)
- AJAX for API communication

## Getting Started

### Prerequisites
- Java 17 or higher
- Maven
- Git

### Installation

1. Clone the repository:
```bash
git clone <repository-url>
cd resturant-api
```

2. Build the project:
```bash
mvn clean install
```

3. Run the application:
```bash
mvn spring-boot:run
```

The application will be available at:
- Frontend: http://localhost:8080/era/restaurants
- H2 Console: http://localhost:8080/era/h2-console
  - JDBC URL: jdbc:h2:mem:test2db
  - Username: sa
  - Password: sa

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/v1/restaurants | Get all restaurants |
| GET | /api/v1/restaurant/{id} | Get restaurant by ID |
| POST | /api/v1/restaurant | Create new restaurant |
| PUT | /api/v1/restaurant/{id} | Update existing restaurant |
| DELETE | /api/v1/restaurant/{id} | Delete restaurant |

## Frontend Routes

| Route | Description |
|-------|-------------|
| /restaurants | List all restaurants |
| /restaurants/add | Add new restaurant form |
| /restaurants/{id} | View restaurant details |
| /restaurants/{id}/edit | Edit restaurant form |

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── app/
│   │           └── apiexamples/
│   │               ├── features/
│   │               │   └── restaurants/
│   │               │       ├── RestaurantController.java
│   │               │       └── RestaurantViewController.java
│   │               └── data/
│   │                   └── dto/
│   │                       ├── Restaurant.java
│   │                       └── RestaurantsListResponse.java
│   └── resources/
│       ├── templates/
│       │   ├── layout.html
│       │   └── restaurants/
│       │       ├── list.html
│       │       ├── detail.html
│       │       └── form.html
│       └── application.properties
```

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details. 
