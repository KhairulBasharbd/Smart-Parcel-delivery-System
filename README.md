# 📦 Smart Parcel Delivery System

---
## 📑 Table of Contents

- [Live Deployment](#live-deloyment)
- [Team Members & Mentor](#-team-members--mentor)
- [Project Context](#-project-context)
- [Key Features](#-key-features)
    - [Customer (P2P)](#-customer-p2p)
    - [E-Commerce Seller (B2C)](#-e-commerce-seller-b2c)
    - [Delivery Rider](#-delivery-rider)
    - [System Admin](#-system-admin)
- [Tech Stack](#-tech-stack)
- [Project Structure](#-project-structure-simplified)
- [Project Resources](#-project-resources)
- [Getting Started](#getting-started)
- [Development Guidelines](#development-guidelines)
- [Resources](#resources)

---

# Live Deloyment

### Live Link: https://quickdrop-q0q3.onrender.com/
### 🔐 Portal Access Credentials

| Portal       | URL                                                        | Email                | Password           |
|--------------|------------------------------------------------------------|----------------------|---------------------|
| **Customer** | [Login](https://quickdrop-q0q3.onrender.com/auth/login)    | user2@gmail.com      | @Padma&1953         |
| **Rider**    | [Login](https://quickdrop-q0q3.onrender.com/rider/login)   | amirider@gmail.com   | @Amirider&1953      |
| **Admin**    | [Login](https://quickdrop-q0q3.onrender.com/admin/login)   | *Access Restricted*  | *Access Restricted* |
---

## 👥 Team Members & Mentor

| Role        | Name                                                         | GitHub Profile                                      |
|-------------|--------------------------------------------------------------|-----------------------------------------------------|
| Team Leader | Suvash Kumar                                                 | [@suvashsumon](https://github.com/suvashsumon)     |
| Member      | Md. Khairul Bashar                                           | [@KhairulBasharbd](https://github.com/KhairulBasharbd) |
| Member      | Md. Tofael Ahmed                                             | [@Tofaal9152](https://github.com/Tofaal9152)        |
| Mentor      | Jamilur Rahman, *Senior Software Engineer, Brain Station 23* | [@jamilxt](https://github.com/jamilxt)             |


---

<h1 align= "center">Smart Parcel Delivery System</h1>

A tech-driven, role-based parcel delivery platform designed to address the modern challenges of intra-city logistics. Built to streamline the delivery process for **customers**, **e-commerce sellers**, and **delivery riders**, with powerful admin tools and real-time tracking capabilities.

---

## 🚀 Project Context

With rapid urbanization and the e-commerce boom, the demand for reliable, efficient, and transparent parcel delivery services has skyrocketed. Traditional systems fall short—facing issues like delays, poor tracking, and ineffective communication.

**Smart Parcel Delivery System** bridges this gap through a robust, GPS-enabled, user-friendly solution that offers:
- Real-time tracking
- Role-specific dashboards
- Transparent communication
- Seamless delivery management

---
## 🔑 Key Features

### 👤 Customer (P2P)
- 📍 **User-Friendly Booking** – Set pickup/drop-off locations and parcel details
- 🧱 **Product Categorization** – Choose from predefined categories with limits
- 🔔 **Order Notifications** – Updates when a rider accepts/completes a delivery
- 📡 **Real-Time Tracking** – GPS tracking for live parcel status
- ⭐ **Feedback System** – Rate and review rider performance
- 🤝 **Secure Handover** – Only authenticated riders can receive parcels

### 🛒 E-Commerce Seller (B2C)
- 📊 **Seller Dashboard** – Track deliveries and rider assignments
- 🔔 **Order Notifications** – Instant alerts on delivery progress
- 📡 **Live Tracking** – Monitor each parcel in real time
- 📈 **Analytics & Reports** – View rider performance, success rates
- ⭐ **Feedback System** – Rate and review services
- 🤝 **Secure Handover** – Verified handover to rider

### 🛵 Delivery Rider
- 📶 **Rider Status** – Set availability status
- 🔔 **Delivery Alerts** – Nearby requests via push notifications
- 🗺️ **Route Navigation** – Optimized GPS-based routing
- 📦 **Order Management** – Accept, manage, and complete deliveries
- ⭐ **Performance Reviews** – Access feedback and ratings
- 🤝 **Secure Delivery** – Handover only to verified recipients
- 💵 **Payment** – Receive payment after each delivery

### 🛠️ System Admin
- 👥 **User & Delivery Management** – Oversee accounts and operations
- 📊 **Analytics Dashboard** – Insights into system and rider efficiency
- 🎯 **Parcel & Pricing Control** – Define pricing models and limits
- 🛡️ **Fraud Detection** – Monitor and prevent suspicious activity

---

## 🧰 Tech Stack

| Layer           | Technology                                 |
|----------------|--------------------------------------------|
| **Frontend**    | React.js, Thymeleaf                        |
| **Styling**     | HTML, Tailwind CSS                         |
| **Backend**     | Java, Spring Boot                          |
|**Databse Versioning** | Flyway                                     |
| **Authentication** | Spring Security, JWT                       |
| **Database**    | PostgreSQL (Relational), Hibernate ORM     |
| **APIs**        | RESTful APIs, Spring MVC                   |
| **Testing**     | JUnit (Unit), Postman (API), JMeter (Load) |
| **DevOps**      | AWS (Deployment), GitHub Actions (CI/CD)   |
| **Version Control** | Git, GitHub                                |
---

## 📁 Project Structure (Simplified)
```
├───config
├───controller
├───dto
│   ├───paymentapiresponse
│   ├───request
│   └───response
├───enums
├───exception
│   └───custom
├───mapper
├───model
├───repository
├───security
├───service
└───util
```


## 📄 Project Resources

| Category             | Document Name           | Link                                                                 |
|----------------------|-------------------------|----------------------------------------------------------------------|
| 📘 Documents         | Requirement Breakdown    | [View](https://docs.google.com/spreadsheets/d/1xkvcfqKs8xaK-G49qsPYhYuLTmGR0uW70pVxoA6MyY0/edit?gid=1403762707#gid=1403762707) |
| 📘 Documents         | Project Documentation    | [View](docs/Team/)                                                   |
| 🧩 UML Diagram       | UML Diagram              | [View](docs/Team/UML/)                                               |
| 🗄️ Database Schema   | Database Schema          | [View](docs/Team/database/)                                          |





## Getting Started
0. **Ensure Prerequisites:** Ensure your system have those running:

| Tool        | Required Version | Download Link                                          |
|-------------|------------------|--------------------------------------------------------|
| Java JDK    | 17+              | [Download JDK](https://adoptium.net/)                 |
| Gradle      | Wrapper included | N/A (uses `./gradlew`)                                |
| PostgreSQL  | 12+              | [Download](https://www.postgresql.org/download/)      |
| Git         | Any              | [Download](https://git-scm.com/downloads)             |

1. **Clone Project:** Clone the project to your local machine using SSH:
```
git clone git@github.com:Learnathon-By-Geeky-Solutions/byte-breeze.git
```
2. **Nevigate to Directory:** Navigate to the Project Directory:
```
cd byte-breeze
```
3. **Install Dependencies:** Use Gradle Wrapper to install dependencies and build the application:
```
./gradlew build --refresh-dependencies
```
Make sure you have executable permission on `gradlew`. If not, run:
```
chmod +x gradlew
```
4. **Set Environment Variables:** To run this project you need to set the following environment variables on your environment:
```
DB_URL=your_postgresql_database_url
DB_USERNAME=your_postgresql_database_username
DB_PASSWORD=your_postgresql_database_password
SSLCOM_STORE_ID=your_sslcommerz_store_id
SSLCOM_STORE_PASSWD=your_sslcommerz_store_password 
SSLCOM_BASE_URL=your_sslcommerz_base_url
```
5. **Run:** Run the Application by this command:
```
./gradlew bootRun
```
The app will start on the default port: `http://localhost:8080`

## Resources
- [Project Documentation](docs/)
- [Development Setup](docs/setup.md)
- [Contributing Guidelines](CONTRIBUTING.md)
