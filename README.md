# Java Backend Developer — 6-Week Learning Journey

A self-paced, daily-progress course to go from Java fundamentals to a fully deployed
Spring Boot e-commerce backend — built as part of my final-year placement preparation.

## 🎯 Goal
Build and deploy a real, working e-commerce backend (Products, Cart, Orders, JWT authentication)
using **Java + Spring Boot + PostgreSQL**, live on the internet, as a portfolio project.

## 🗺️ Roadmap
| Week | Focus |
|------|-------|
| 1–2  | Java fundamentals revision — OOP, Collections, Exception Handling (backend-flavored examples) |
| 3    | Spring Boot basics + REST APIs — Product CRUD |
| 4    | JPA/Hibernate + PostgreSQL — real persistence, Cart feature |
| 5    | Orders, entity relationships, JWT authentication |
| 6    | Polish, frontend connection, deployment on Render |

## 📁 Structure
Each folder represents one day of learning — code, concepts, and a short summary of what was built.

```
day01-encapsulation-inheritance/
day02-polymorphism-interfaces/
day03-collections-framework/
day04-exception-handling/
...
final-project-ecommerce/   (added in Week 6)
```

## 📌 Progress Log
- **Day 1** — Encapsulation, Classes & Objects, Inheritance → `BankAccount`, `Product`, `Employee`/`Manager` hierarchy
- **Day 2** — Method Overloading & Overriding, Interfaces, Abstract Classes → `Invoice`, `Discountable`/`RegularCustomer`/`PremiumCustomer`
- **Day 3** — Collections Framework: `List`, `Set`, `Map` → in-memory inventory system with restock logic and low-stock alerts
- **Day 4** — Exception Handling: custom exceptions, exception propagation, `NullPointerException` → `InventoryService` with `ProductNotFoundException` and `InsufficientStockException`

*(updated daily)*

## 🧠 Also in this repo
- **Java Memory Model (Stack & Heap)** — a standalone reference on object references, pass-by-value-of-reference, and why abstract classes/interfaces never get their own heap object.

*(Weeks 1–2 fundamentals complete. Next up: Spring Boot basics and the Product REST API — Week 3.)*
