// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass 1
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass 2
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal a;       // Reference of parent class

        a = new Dog();  // Dog object
        a.sound();      // Output: Dog barks

        a = new Cat();  // Cat object
        a.sound();      // Output: Cat meows
    }
}
