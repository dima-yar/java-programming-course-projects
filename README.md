# ☕ Second Java course Project
A simple REST API application built with Spring Framework 

---

## 🛠️ Technologies Used for this Project

- **Java**
- **Spring Framework**
- H2 database
- Open API (library for springboot)
- Swagger
- Postman

---

## ✨ Program Features

### 🏗️ Product Controller 
A controller that allows users to GET, POST, PUT, and DELETE Products: 

![Controller](https://github.com/user-attachments/assets/300d8183-5617-4fc7-80fc-54ba5c787955)

### 📛 Exceptions Handling 
The program handles a ProductNotFoundException

![Handling Exception](https://github.com/user-attachments/assets/d3053a3d-ca3e-4014-8485-1867e0775d0c)

### 💾 Product Repository
The main bridge between our model and the database. Can get, create, update, and delete products in our database.

### ↔️ Data Transfer Object (Response & Request handling)
The classes ProductResponce and ProductRequest can create/get actual JSON files.

### 👨‍🔧 Product Service
The main brain of the project`s logic, here we process data and send it to the database.

### 🗺️ Product Mapper
The part of the project`s logic that deals with rewriting data from one object to another.

---

## ✨ Product Controller Features

### 📥 GET
Allows us to get a product from the database
<img width="1438" height="886" alt="image" src="https://github.com/user-attachments/assets/15203fb3-22c4-472b-a4e0-6f5da15bbc2e" />

### 📥 GET all 
Allows us to get all products from the database
<img width="1147" height="812" alt="image" src="https://github.com/user-attachments/assets/f488c191-86e6-4950-bd4a-cf2f84e31bf5" />

### 📨 POST
Allows us to create a product and save it in the database
<img width="1150" height="888" alt="image" src="https://github.com/user-attachments/assets/e40771ef-d87c-4ffc-bd83-a4aa2f6da4e4" />

### 🔄 PUT
Allows us to find a product in the database and update its existing data.
<img width="950" height="846" alt="image" src="https://github.com/user-attachments/assets/9bc8ecf9-1ead-491a-9b66-7e36102b3b1f" />

### 🗑️ DELETE
Allows us to find a product in the database and remove the found product. (returns 204 status!)
<img width="1060" height="563" alt="image" src="https://github.com/user-attachments/assets/58309181-4e37-4adb-8608-5b190d52c59f" />

---

## 📚 What I Learned During This Project

- Building a basic REST API application with GET, POST, PUT, DELETE
- Work with actual databases in Spring Framework
- How to write proper Exception Handling
- Work with tools such as Postman and Swagger 

---

## 👤 Author: [Dmytro Yarmoliuk](https://github.com/dima-yar)
