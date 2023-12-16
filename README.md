# Swifty Ecommerce API
Welcome to the Swifty E-Commerce Backend API! This API powers the backend functionality of our e-commerce application, allowing seamless management of products and orders.

## Project Overview
The Swifty E-Commerce Backend API is built using Spring Boot and facilitates the core functionalities of our e-commerce platform. It includes features for product management and order processing.

## Functional Requirements

### 1. Product Management

#### 1.1 Create a Product

- **Endpoint:** `POST /api/products`
- **Request Payload:**
  ```json
  {
    "name": "Product Name",
    "description": "Product Description",
    "price": 29.99,
    "stockQuantity": 100
  }
  ```
- **Response:**
  - Successful Response (HTTP 201 Created):
    ```json
    {
      "id": 1,
      "name": "Product Name",
      "description": "Product Description",
      "price": 29.99,
      "stockQuantity": 100
    }
    ```

#### 1.2 Get All Products

- **Endpoint:** `GET /api/products`
- **Response:**
  - Successful Response (HTTP 200 OK):
    ```json
    [
      {
        "id": 1,
        "name": "Product Name",
        "description": "Product Description",
        "price": 29.99,
        "stockQuantity": 100
      },
      {
        "id": 2,
        "name": "Another Product",
        "description": "Another Description",
        "price": 39.99,
        "stockQuantity": 50
      }
    ]
    ```

#### 1.3 Get Product by ID

- **Endpoint:** `GET /api/products/{id}`
- **Response:**
  - Successful Response (HTTP 200 OK):
    ```json
    {
      "id": 1,
      "name": "Product Name",
      "description": "Product Description",
      "price": 29.99,
      "stockQuantity": 100
    }
    ```

### 2. Order Management

#### 2.1 Create an Order

- **Endpoint:** `POST /api/orders`
- **Request Payload:**
  ```json
  {
    "customerId": 1,
    "products": [
      {
        "productId": 1,
        "quantity": 2
      },
      {
        "productId": 2,
        "quantity": 1
      }
    ]
  }
  ```
- **Response:**
  - Successful Response (HTTP 201 Created):
    ```json
    {
      "id": 1,
      "customerId": 1,
      "orderDate": "2023-12-10T12:30:45",
      "totalAmount": 99.97,
      "orderItems": [
        {
          "productId": 1,
          "quantity": 2,
          "subtotal": 59.98
        },
        {
          "productId": 2,
          "quantity": 1,
          "subtotal": 39.99
        }
      ]
    }
    ```

#### 2.2 Get All Orders

- **Endpoint:** `GET /api/orders`
- **Response:**
  - Successful Response (HTTP 200 OK):
    ```json
    [
      {
        "id": 1,
        "customerId": 1,
        "orderDate": "2023-12-10T12:30:45",
        "totalAmount": 99.97,
        "orderItems": [
          {
            "productId": 1,
            "quantity": 2,
            "subtotal": 59.98
          },
          {
            "productId": 2,
            "quantity": 1,
            "subtotal": 39.99
          }
        ]
      },
      // Other orders...
    ]
    ```

#### 2.3 Get Order by ID

- **Endpoint:** `GET /api/orders/{id}`
- **Response:**
  - Successful Response (HTTP 200 OK):
    ```json
    {
      "id": 1,
      "customerId": 1,
      "orderDate": "2023-12-10T12:30:45",
      "totalAmount": 99.97,
      "orderItems": [
        {
          "productId": 1,
          "quantity": 2,
          "subtotal": 59.98
        },
        {
          "productId": 2,
          "quantity": 1,
          "subtotal": 39.99
        }
      ]
    }
    ```

## Technical Requirements

- Use Spring Boot for developing the API.
- Implement appropriate error handling and validation.
- Use MYSQL for Database
- Include proper documentation for the API using Swagger/OpenAPI.

## Submission Guidelines

- Submit the source code along with necessary instructions to run the project.
- Provide API documentation including endpoints, request/response formats, and examples.
