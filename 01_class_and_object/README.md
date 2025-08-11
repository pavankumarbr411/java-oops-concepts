# Day 01 - Class and Object

This example explains the basic concept of Class and Object in Java in a simple way.

## 🔹 What is a Class?

A class is like a template or blueprint. It tells Java how to create an object — like what variables (data) and methods (actions) that object should have.

In our example, `Student` is a class that has:
- Two variables: `name` and `age`
- One method: `displayInfo()`, which shows the student's details

So basically, a class defines what an object will look like and what it can do.

## 🔸 What is an Object?

An object is a real instance of a class. When an object is created, it allocates memory and allows us to access the properties (variables) and methods defined in the class.

It represents a real-world entity. For example, a Student, Car, or Employee can all be objects.l thing created using a class. We use the `new` keyword to create an object in Java.

In this code:
``java
Student s1 = new Student();``

## 🔹 What is Method?

A method is a block of code inside a class that performs a specific task.
It defines the behavior of the object.
Think of a method like a function—you define once and call many times.
 ```Example:

void displayInfo() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);

###############################################################################################################################################


