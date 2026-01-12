# Java Basic Exercises

This repository contains **two basic Java exercises** that help practice using `Scanner` for input and performing simple calculations.

---

## 📌 Contents
- **Exercise 1 (`bai1.java`)**: Input two numbers `a` and `b`, then calculate **sum, difference, product, and quotient**.
- **Exercise 2 (`bai2.java`)**: Input two sides of a rectangle and calculate **area** and **perimeter**.

---

## 📂 Project Structure

Both files belong to the same package:

```
package baitap;
```

Recommended folder structure:

```
src/
└── baitap/
    ├── bai1.java
    └── bai2.java
```

---

## ⚙️ Requirements
- **Java JDK 8+**
- IDE: IntelliJ IDEA / Eclipse / VS Code (optional)
- Terminal or Command Prompt

---

## ▶️ How to Run

### 1. Compile
From the root folder:

```bash
javac -d out src/baitap/bai1.java
javac -d out src/baitap/bai2.java
```

### 2. Run
```bash
java -cp out baitap.bai1
java -cp out baitap.bai2
```

---

## 🧮 Exercise 1 – Basic Calculations (`bai1.java`)

### Features
- Input two numbers `a` and `b`
- Calculate:
  - Sum: `a + b`
  - Difference: `a - b`
  - Product: `a * b`
  - Quotient: `a / b`

### Sample Run
Input:
```
Nhap so a: 10
Nhap so b: 2
```

Output:
```
Tong hai so la: 12.0
Hieu hai so la: 8.0
Tich hai so la: 20.0
Thuong hai so la: 5.0
```

---

## 📐 Exercise 2 – Rectangle Calculator (`bai2.java`)

### Features
- Input two sides `a` and `b`
- Calculate:
  - Area: `a * b`
  - Perimeter: `(a + b) * 2`

### Sample Run
Input:
```
Nhap so a: 5
Nhap so b: 3
```

Output:
```
Dien tich hinh chu nhat la: 15.0
Chu vi hinh chu nhat la: 16.0
```

---

## 📝 Notes
- The programs use the `double` data type to support both integers and decimals.
- In **Exercise 1**, dividing by zero may cause unexpected results, so it is recommended to check `b != 0` before dividing.

---

## 🚀 Future Improvements
- Add input validation.
- Handle division by zero safely.
- Convert programs into reusable methods.

---

## 👤 Author
**Your Name Here**  
(Java Beginner)

---

---

# Bài tập Java cơ bản

Kho lưu trữ này gồm **2 bài tập Java cơ bản**, giúp luyện tập nhập dữ liệu với `Scanner` và thực hiện các phép tính đơn giản.

---

## 📌 Nội dung
- **Bài 1 (`bai1.java`)**: Nhập hai số `a` và `b`, sau đó tính **tổng, hiệu, tích, thương**.
- **Bài 2 (`bai2.java`)**: Nhập hai cạnh hình chữ nhật và tính **diện tích** và **chu vi**.

---

## 📂 Cấu trúc dự án

Cả hai file đều thuộc cùng package:

```
package baitap;
```

Cấu trúc thư mục khuyến nghị:

```
src/
└── baitap/
    ├── bai1.java
    └── bai2.java
```

---

## ⚙️ Yêu cầu
- **Java JDK 8+**
- IDE: IntelliJ IDEA / Eclipse / VS Code (tùy chọn)
- Terminal hoặc Command Prompt

---

## ▶️ Cách chạy chương trình

### 1. Biên dịch
Tại thư mục gốc:

```bash
javac -d out src/baitap/bai1.java
javac -d out src/baitap/bai2.java
```

### 2. Chạy chương trình
```bash
java -cp out baitap.bai1
java -cp out baitap.bai2
```

---

## 🧮 Bài 1 – Tính toán cơ bản (`bai1.java`)

### Chức năng
- Nhập hai số `a` và `b`
- Tính:
  - Tổng: `a + b`
  - Hiệu: `a - b`
  - Tích: `a * b`
  - Thương: `a / b`

---

## 📐 Bài 2 – Tính hình chữ nhật (`bai2.java`)

### Chức năng
- Nhập hai cạnh `a` và `b`
- Tính:
  - Diện tích: `a * b`
  - Chu vi: `(a + b) * 2`

---

## 📝 Ghi chú
- Chương trình sử dụng kiểu dữ liệu `double` để hỗ trợ cả số nguyên và số thập phân.
- Ở **Bài 1**, nên kiểm tra `b != 0` trước khi thực hiện phép chia để tránh lỗi logic.

---

## 🚀 Hướng phát triển
- Thêm kiểm tra dữ liệu đầu vào.
- Xử lý an toàn trường hợp chia cho 0.
- Tách chương trình thành các hàm để tái sử dụng.

---

## 👤 Tác giả
**Tên của bạn**  
(Sinh viên học Java)

---

⭐ If you like this