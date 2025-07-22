# BookStoreApp

Application to test Bookstore Functionality

## Overview

This project is a simple Bookstore API built with FastAPI. 
- It allows users to manage books and perform user authentication, including sign-up and login functionalities. 
- The API uses JWT tokens for securing endpoints related to book management.

## Features

- **Book Management**: Users can create, update, delete, and retrieve books.
- **User Authentication**: Includes user sign-up and login functionalities.
- **Secure Endpoints**: Uses Bearer tokens to secure book management endpoints.

## Technologies

- **Java 8**: An Object Oriented Programming Language used for scripting the requirements.
- **Cucumber**:  A modern, fast (high-performance) automation framework for testing used Gherkin Language.
- **RestAssured**: RestAssured is a java library to perform restAssured (GET, POST, PUT, PATCH, and DELETE) methods.
- **Maven**: It is an build tool to build and organize the dependencies and jars.

## Getting Started

### Prerequisites

- Java 8
- Cucumber 7.16.1
- RestAssured 5.5.0

### Installation

1. Clone the repository:
    ```git bash
    git clone https://github.com/therameagle/BookStoreAppTest.git
    ```

2. Navigate to the project directory using Eclipse

3. Create the MAVEN Project named as BookStoreAppTest

4. Import all the dependencies and jars

5. Configure for the Cucumber Plugins

6. Start the Scripting for the requirement


    
### Running the Application

1. Start the Testing using right click on cucmberRunner file

2. And PressStart


### API Endpoints

- Book Management

    - POST /BookStore/v1/Books: Create a new book.
    - PUT /BookStore/v1/Books/{isbn}: Update a book by ID.
    - DELETE /BookStore/v1/Book: Delete a book by ID.
    - GET BookStore/books/{book_id}: Get a book by ID.
    - GET /BookStore/v1/Books: Get all books.

- User Authentication

    - POST /Account/v1/Authorized: Sign up a new user.
    - POST /login: Log in and receive an access token.
    - GET /Account/v1/User: It is used to ADD the user



