# 🛒 Internet Shop System

This is a Java-based client-server shopping cart application that allows users to view products, add them to a cart, and proceed to checkout. It uses JavaFX for the user interface and sockets for communication between the client and server.

---

## 📦 Features

- View product list retrieved from the server
- Add products to a shopping cart
- Checkout with a confirmation dialog
- JavaFX graphical user interface
- Server-client architecture using TCP sockets

---

## 🧱 Technologies Used

- Java 11+
- JavaFX
- Java I/O and Serialization
- TCP Socket Programming
- Object-Oriented Programming

---

## 🗂️ Project Structure

com.example.shoppingcart/
├── Product.java # Defines the product model
├── Database.java # Simulates a simple product database
├── Cart.java # Manages cart items
├── Server.java # Server logic to handle product requests
├── ClientApp.java # JavaFX application entry point
├── ClientController.java# JavaFX UI logic
└── client-view.fxml # JavaFX layout file (FXML)


---

## 🚀 Getting Started

### 🖥️ Start the Server

1. Compile and run the server:
```bash
javac com/example/shoppingcart/Server.java
java com.example.shoppingcart.Server
The server will listen on port 12345 for incoming client requests.
💻 Start the Client
Compile and run the client app (make sure JavaFX is properly configured):


javac com/example/shoppingcart/ClientApp.java
java com.example.shoppingcart.ClientApp
The UI will allow you to:

Load products from the server

Add products to the cart

Checkout and get confirmation
✍️ Author
Paskalina Mashimba

GitHub

LinkedIn
