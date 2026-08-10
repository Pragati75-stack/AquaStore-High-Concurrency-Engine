<div align="center">

# 💧 AquaStore

### High-Concurrency E-Commerce & Order Management Engine

<p>
  <b>Built to handle the race between thousands of buyers and limited inventory.</b>
</p>

<p>
  <img src="https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?style=for-the-badge&logo=springboot">
  <img src="https://img.shields.io/badge/React-18+-61DAFB?style=for-the-badge&logo=react&logoColor=black">
  <img src="https://img.shields.io/badge/PostgreSQL-Database-336791?style=for-the-badge&logo=postgresql">
  <img src="https://img.shields.io/badge/JWT-Authentication-black?style=for-the-badge&logo=jsonwebtokens">
  <img src="https://img.shields.io/badge/Java-21+-orange?style=for-the-badge&logo=openjdk">
</p>

</div>

---

## 🚀 About AquaStore

AquaStore is a full-stack e-commerce platform designed around one
critical engineering challenge:

> **How do you safely process multiple users attempting to purchase
> the same limited-stock product at the same time?**

Unlike a traditional CRUD-based shopping application, AquaStore focuses
on **high-concurrency order processing**, inventory consistency,
transaction management, and race-condition prevention.

The system is designed so that if a product has:

```text
Stock = 10
