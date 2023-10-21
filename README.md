# Springboot-Docker-API-MySQL

This repository contains a simple Spring Boot API along with Docker configuration for containerization, integrated with MySQL.

## Description

This project is a Spring Boot-based API that connects to a MySQL database through Docker. It provides basic CRUD (Create, Read, Update, Delete) operations to manage data related to a car dealership.

## Features

- Offers complete CRUD operations to manage data through the API.
- Utilizes Docker to containerize the application along with a MySQL instance.

## Installation

To run this project locally, ensure you have Java, Docker, and Docker Compose installed on your system.

1. Clone this repository:

```bash
git clone https://github.com/Aensil/Springboot-Docker-API-MySQL.git
```

2. Navigate to the project directory:

```bash
cd Springboot-Docker-API-MySQL/dealer
```

3. Build the Docker image:

```bash
docker build -t springboot-api .
```

4. After building the image, run the following command to bring up the containers:

```bash
docker-compose up -d
```

This command will configure both the Spring Boot API and the MySQL database in interconnected Docker containers.

## Usage

Once the containers are up and running, you can access the Spring Boot API via `http://localhost:8080`. Use tools like Postman or your web browser to interact with the API endpoints.

## Contributions

Contributions are always welcome! If you have any ideas or improvements, please open an issue or a pull request.

1. Fork the repository.
2. Create your feature branch (`git checkout -b feature/AmazingFeature`).
3. Commit your changes (`git commit -m 'Add an amazing feature'`).
4. Push to the branch (`git push origin feature/AmazingFeature`).
5. Open a pull request.
