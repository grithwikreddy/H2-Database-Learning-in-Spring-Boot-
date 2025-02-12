# Spring Boot H2 Database CRUD Project

## 📌 Overview
This is a simple Spring Boot project that demonstrates CRUD (Create, Read, Update, Delete) operations using **H2 Database** and **Spring Data JPA**.

## ⚡ Features
- REST API for User management
- Uses **Spring Boot**, **Spring Data JPA**, and **H2 Database**
- H2 Console enabled for database inspection
- Supports **GET, POST, DELETE** operations

---

## 🛠️ Technologies Used
- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **H2 Database** (in-memory mode)
- **Maven**

---

## 🚀 Setup Instructions

### 1️⃣ Clone the Repository
```sh
git clone https://github.com/grithwikreddy/H2-Database-Learning-in-Spring-Boot-.git
cd H2-Database-Learning-in-Spring-Boot
```

### 2️⃣ Configure H2 Database
Modify `src/main/resources/application.properties` as needed.

### 3️⃣ Run the Application
```sh
mvn spring-boot:run
```

### 4️⃣ Access H2 Console
- URL: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
- JDBC URL: `jdbc:h2:mem:testdb`

---

## 📌 REST API Endpoints

| Method | Endpoint | Description |
|--------|---------|-------------|
| `GET` | `/users` | Get all users |
| `POST` | `/users` | Create a new user |
| `DELETE` | `/users/{id}` | Delete a user by ID |

