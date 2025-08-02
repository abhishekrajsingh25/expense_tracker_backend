# 💸 Expense Tracker Application

A full-stack Expense Tracker web application built using **React**, **Spring Boot**, and **MySQL** for development (switched to **PostgreSQL** in production). The application includes data visualization with **Recharts**, file download as **Excel**, email sending with Excel reports, and **Cloudinary** for media storage. Styled with **Tailwind CSS** for a responsive, modern UI.

---

## ✨ Features

### ✅ Core Functionalities:

* Track income and expenses with category-based filtering
* Visualize data using charts (**Recharts**)
* Download reports as **Excel files**
* Send Excel reports via **email**
* Responsive and mobile-friendly design using **Tailwind CSS**
* Media/file upload support via **Cloudinary**

### 🔐 Authentication & Security:

* Secure user registration and login
* **JWT-based authentication**
* Password hashing using **Bcrypt**

### ☁️ Cloud Integration:

* Store receipts or related images in **Cloudinary**
* Email integration for sending Excel reports

---

## 🛠 Tech Stack

### 💅️ Frontend:

* **React.js**
* **Axios** for API communication
* **React Router**
* **Tailwind CSS**
* **Recharts** for charts and graphs

### ⚙️ Backend:

* **Spring Boot**
* **MySQL** (for local development)
* **PostgreSQL** (for production)
* **JWT** for authentication
* **Bcrypt** for password hashing
* **Apache POI** for Excel generation
* **JavaMailSender** for email functionality
* **Cloudinary Java SDK**

---

## ⚙️ Setup Instructions

### 🔧 Prerequisites

* Node.js & npm
* Java 17+
* Maven
* MySQL for local development
* PostgreSQL for production (optional)
* Cloudinary account (for media uploads)
* SMTP credentials (for email reports)

---

### 📦 Installation Steps

#### 1. Clone the Repository

```bash
git clone https://github.com/abhishekrajsingh25/Expense-Tracker.git
cd expense-tracker-app
```

---

#### 2. Backend Setup

```bash
git clone https://github.com/abhishekrajsingh25/expense_tracker_backend.git
cd expense_tracker_backend
```

Create or edit `src/main/resources/application.properties` with the following content:

```properties
# Development DB (MySQL)
spring.datasource.url=jdbc:mysql://localhost:3306/expense_db
spring.datasource.username=your_mysql_user
spring.datasource.password=your_mysql_password

server.servlet.context-path = /api

# JWT Secret
jwt.secret=your_jwt_secret

#JPA Configuration
spring.jpa.hibernate.ddl-auto = update
spring.jpa.show-sql = true
spring.jpa.properties.hibernate.format_sql = true

# Email SMTP
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username = ${BREVO_USERNAME}
spring.mail.password = ${BREVO_PASSWORD}
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
spring.mail.properties = smtp
spring.mail.properties.mail.smtp.from = ${BREVO_FROM_EMAIL}

app.activation.url=${EXPENSE_TRACKER_BACKEND_URL}

spring.profiles.active=prod
```

Run the backend server:

```bash
./mvnw spring-boot:run
```

---

#### 3. Frontend Setup

```bash
cd ../frontend
npm install
```

Create a `.env` file in the root of the frontend folder:

```env
VITE_BACKEND_URL=http://localhost:8080
VITE_CLOUDINARY_CLOUD_NAME = your_cloudinary_cloud_name
```

Start the frontend:

```bash
npm run dev
```

---

### 🔄 App URLs

* Frontend: [http://localhost:5173](http://localhost:5173)
* Backend: [http://localhost:8080](http://localhost:8080)

---

## 🚀 Deployment

### Frontend

* Deploy using **Vercel**

### Backend

* Deploy using **Render**

### Database

* Use **PostgreSQL** in production

### Assets

* Store uploaded images in **Cloudinary**

---

## 🤝 Contributing

We welcome contributions from developers of all experience levels.

Steps to contribute:

1. Fork the repository
2. Create a new branch (`feature/your-feature-name`)
3. Make your changes
4. Commit and push to your fork
5. Open a Pull Request

---

## 📸 Demo

> Frontend Demo: Click <a href="https://expense-tracker-abhishekrajsingh.vercel.app" >Here</a>

> Frontend Code: Click <a href="https://github.com/abhishekrajsingh25/Expense-Tracker">Here</a>

---

Thank you for checking out the project! 🙌
Feel free to ⭐ the repo if you find it helpful.
