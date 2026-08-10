<div align="center">

# 💧 AquaStore

### High-Concurrency E-Commerce & Order Management Engine

<p>
  A full-stack e-commerce platform engineered to maintain
  <b>inventory consistency under concurrent purchase requests.</b>
</p>

<br/>

<img src="https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk" />
<img src="https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=springboot&logoColor=white" />
<img src="https://img.shields.io/badge/Spring_Security-6.x-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white" />
<img src="https://img.shields.io/badge/JWT-Authentication-black?style=for-the-badge&logo=jsonwebtokens" />
<img src="https://img.shields.io/badge/PostgreSQL-16-336791?style=for-the-badge&logo=postgresql&logoColor=white" />
<img src="https://img.shields.io/badge/React-18+-61DAFB?style=for-the-badge&logo=react&logoColor=black" />
<img src="https://img.shields.io/badge/Tailwind_CSS-3.x-06B6D4?style=for-the-badge&logo=tailwindcss&logoColor=white" />
<img src="https://img.shields.io/badge/Maven-Build-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white" />
<img src="https://img.shields.io/badge/Git-GitHub-F05032?style=for-the-badge&logo=git&logoColor=white" />

<br/><br/>

### ⚡ Built for Concurrency · 🔒 Designed for Consistency · 🚀 Engineered for Scale

</div>

---

# 📌 Table of Contents

- [About AquaStore](#-about-aquastore)
- [Problem Statement](#-problem-statement)
- [Project Objectives](#-project-objectives)
- [Core Problem: High Concurrency](#-core-problem-high-concurrency)
- [Key Features](#-key-features)
- [High-Concurrency Engine](#-high-concurrency-engine)
- [System Architecture](#-system-architecture)
- [Application Flow](#-application-flow)
- [Order Processing Flow](#-order-processing-flow)
- [Authentication Flow](#-authentication-flow)
- [Database Architecture](#-database-architecture)
- [Database Entities](#-database-entities)
- [Technology Stack](#-technology-stack)
- [Project Structure](#-project-structure)
- [API Architecture](#-api-architecture)
- [Security](#-security)
- [Concurrency Strategy](#-concurrency-strategy)
- [Transaction Management](#-transaction-management)
- [Error Handling](#-error-handling)
- [Testing Strategy](#-testing-strategy)
- [Concurrency Testing](#-concurrency-testing)
- [Performance Metrics](#-performance-metrics)
- [Git Workflow](#-git-workflow)
- [Development Roadmap](#-development-roadmap)
- [Local Setup](#-local-setup)
- [Environment Configuration](#-environment-configuration)
- [Running the Application](#-running-the-application)
- [Future Enhancements](#-future-enhancements)
- [Project Goals](#-project-goals)
- [Contributing](#-contributing)
- [License](#-license)

---

# 💧 About AquaStore

**AquaStore** is a full-stack e-commerce platform built using
**Spring Boot, React, and PostgreSQL**, with a major focus on
**high-concurrency order processing and inventory consistency**.

The application provides the functionality expected from a modern
e-commerce platform:

- User registration and authentication
- Product browsing
- Product management
- Shopping cart
- Order placement
- Order tracking
- Inventory management
- Administrative operations

However, the primary engineering focus of AquaStore is different from a
basic e-commerce CRUD application.

The system is designed to solve the following problem:

> **How can an e-commerce system safely handle multiple users attempting
> to purchase the same limited-stock product at the same time?**

AquaStore addresses this problem using:

- Database transactions
- Concurrency control
- Inventory validation
- Locking strategies
- Atomic operations
- Consistent order processing
- Proper rollback handling

---

# ❗ Problem Statement

Traditional e-commerce applications often begin with a simple inventory
operation:

```text
Current Stock = 10

Customer places order

Stock = Stock - 1
