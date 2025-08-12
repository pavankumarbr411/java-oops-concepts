// Abstract class
abstract class Vehicle {
    // Abstract method (no body)
    abstract void start();

    // Normal method (has body)
    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

// Subclass provides implementation for abstract method
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started with key ignition.");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike started with self-start button.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start(); // Calls Car's implementation
        myCar.stop();

        Vehicle myBike = new Bike();
        myBike.start(); // Calls Bike's implementation
        myBike.stop();
    }
}
