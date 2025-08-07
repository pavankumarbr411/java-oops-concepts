-- Polymorphism in Java
🔍 What is Polymorphism?
Polymorphism is one of the four main OOPs concepts in Java (along with Encapsulation, Inheritance, and Abstraction).

Definition:
Polymorphism means "many forms". It allows the same method or object to behave differently based on the context.

In Java, polymorphism allows:

Same method name but different implementations.

Code that is more flexible and reusable.

🎯 Types of Polymorphism
🔸 Compile-Time Polymorphism (Method Overloading)
Happens at compile time.

Same method name with different parameters (type, number, or order).

Example: add(int a, int b) and add(double a, double b)

🔸 Run-Time Polymorphism (Method Overriding)
Happens at runtime.

Subclass provides its own version of a method that is already defined in the parent class.

Decided dynamically during program execution.

💡 Why Polymorphism?
Makes the code more flexible and maintainable.

Helps in reusing code.

Enables a single interface to control different data types.

🏠 Real-Life Example
Imagine a Remote Control:

You press the "Power" button.

It may turn ON the TV, AC, or Music Player based on which device you're controlling.

➡️ Same button, but different actions depending on the object — that's Polymorphism!

⏱ Time Complexity
Polymorphism is a concept, not an algorithm, so time complexity does not apply directly.
However, it slightly increases runtime overhead due to dynamic method dispatch in runtime polymorphism.
