![Language](https://img.shields.io/badge/language-Java-orange)
![Project Type](https://img.shields.io/badge/project-type_academic-blue)
![Feature](https://img.shields.io/badge/Feature-Reservations_✔️-blue)
![Feature](https://img.shields.io/badge/Feature-Employee_Mgmt_✔️-blue)
![Feature](https://img.shields.io/badge/Feature-Billing_✔️-blue)
![License](https://img.shields.io/badge/license-MIT-green)

# 🏨 Java Hotel Management System  

[![Java Version](https://img.shields.io/badge/Java-17+-blue)](https://openjdk.org/projects/jdk/17/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellowgreen)](https://opensource.org/licenses/MIT)
![Java](https://img.shields.io/badge/Java-17%2B-blue)
![License](https://img.shields.io/badge/License-MIT-green)
![Status](https://img.shields.io/badge/Status-Active-brightgreen)

A complete hotel management system built with Java for academic purposes. This application handles reservations, customer management, employee administration, and billing operations.

## ✨ Features

### Core Modules
- **Reservation Management**
  - Room booking system
  - Stay duration tracking
  - Automated pricing calculations
- **Customer Management**
  - Profile creation/editing
  - Contact information storage
- **Employee Administration**
  - Role-based access tracking
  - Staff details management
- **Billing System**
  - Dynamic discount calculations
  - VAT compliance (13%)
  - Detailed invoice generation

### Advanced Functionality
- Multi-tier discounts (long stays, bulk purchases)
- Room type management (Single, Double, Suite)
- Additional services tracking (Breakfast, Spa, etc.)
- Interactive console interface

## 🚀 Getting Started

### Prerequisites
- Java JDK 17 or later
- Git (for version control)

### Installation
1. Clone the repository:
```bash
git clone https://github.com/mischa24/Java-hotel-management-system-for-school-project.git



📂 Project Structure
src/
├── main/
│   ├── java/
│   │   ├── com/
│   │   │   ├── koutsakis/
│   │   │   │   ├── hotel/
│   │   │   │   │   ├── model/         # Data models
│   │   │   │   │   │   ├── Customer.java
│   │   │   │   │   │   ├── Employee.java
│   │   │   │   │   │   ├── Room.java
│   │   │   │   │   │   └── ...
│   │   │   │   │   ├── service/       # Business logic
│   │   │   │   │   │   ├── DiscountManager.java
│   │   │   │   │   │   ├── ReservationManager.java
│   │   │   │   │   │   └── ...
│   │   │   │   │   ├── util/          # Utilities
│   │   │   │   │   │   └── RoomInput.java
│   │   │   │   │   └── HotelApp.java  # Main class
