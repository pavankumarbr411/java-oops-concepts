# 🔷 Day-04: Polymorphism in Java

---

## 🔍 What is Polymorphism?

Polymorphism is one of the four main OOPs concepts in Java (along with:

- Encapsulation
- Inheritance
- Abstraction

**Definition:**  
Polymorphism means **"many forms"**. It allows the **same method or object** to behave differently based on the context.

In Java, polymorphism helps us:

- Use the same method name with different implementations.
- Make code more flexible and reusable.

---

## 🎯 Types of Polymorphism

### 🔸 1. Compile-Time Polymorphism (Method Overloading)
- Happens at **compile time**.
- Same method name but different parameters (type, number, or order).
- Example:  
  ```java
  add(int a, int b)
  add(double a, double b)
