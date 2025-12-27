# 🔍 Mini Search Engine- Document Indexing System

> **Java | Data Structures | React | REST API**

A **keyword-based search engine** built from scratch using **Java and core data structures**, implementing an **inverted index** for fast document retrieval and a **React + Vite frontend** for real-time search interaction.

This project demonstrates **algorithmic thinking, backend system design, and full-stack integration**, making it suitable for **SDE / Backend / Full-Stack internship roles**.

---

## ✨ Highlights (Quick Scan)

- ⚡ Inverted Index using `HashMap<String, Set<Integer>>`
- 🚀 O(1) average-time keyword search
- 🌐 RESTful API built in Java
- 🎨 Premium React UI with cards & keyword highlighting
- 🔗 End-to-end backend ↔ frontend integration
- 📊 Time–space complexity analysis

---

## 🧠 How It Works (High Level)

User Search (React UI)
↓
REST API Call (/search?q=keyword)
↓
Java Backend (Search Service)
↓
Inverted Index Lookup (HashMap)
↓
Matching Documents Returned as JSON

---

## ⚙️ Tech Stack

### Backend
- **Java 17**
- Data Structures: HashMap, HashSet
- Inverted Index
- REST API (Spark Java)
- Maven
- Gson

### Frontend
- **React**
- Vite
- JavaScript (ES6+)
- HTML5
- CSS3 (custom styling)

---

## 🧩 Core Feature — Inverted Index

Instead of scanning every document on each search, documents are **preprocessed** into an inverted index:

```text
java    → [1, 3]
search  → [2]
engine  → [2]
```
**This enables fast keyword-based retrieval and demonstrates real-world search engine fundamentals.**

---

## ⏱️ Algorithm & Complexity Analysis
Index Construction

Time Complexity: O(N × W)

N → number of documents

W → average words per document

Search Operation

Time Complexity: O(1) (average case)

Space Complexity

O(K + D)

## 🎨 UI Preview (What the User Sees) 

Clean search input

Card-based result layout

Document preview text

Highlighted matching keywords

Minimal, professional UI

(Frontend communicates with backend via REST API)

K → unique keywords

D → document references

Demonstrates effective time–space tradeoff optimization using hash-based indexing.

---

## 📂 Project Structure

```text
Search-engine/
├── backend/
│   ├── src/main/java/
│   │   ├── api/
│   │   ├── index/
│   │   ├── model/
│   │   ├── service/
│   │   └── app/
│   └── pom.xml
│
├── frontend/
│   ├── src/
│   │   ├── components/
│   │   ├── App.jsx
│   │   └── index.css
│
└── README.md
```

## 🚀 Run Locally
Backend (Java)
cd backend
mvn clean compile
mvn exec:java


Server runs at:
```
http://localhost:4567
```

Test API:

```
http://localhost:4567/search?q=java
```

Frontend (React)
```
cd frontend
npm install
npm run dev
```

Frontend runs at:
```
http://localhost:5173
```


### ⭐ Why This Project Matters

This project goes beyond tutorials and demonstrates real backend logic, algorithmic efficiency, and full-stack execution, making it a strong addition to an SDE internship or entry-level software engineering resume.
