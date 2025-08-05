// Parent class
class Vehicle {
    String brand = "Ford";

    public void honk() {
        System.out.println("Beep beep!");
    }
}

// Child class
class Car extends Vehicle {
    String model = "Mustang";

    public void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();         // inherited from Vehicle
        myCar.showDetails();  // from Car
    }
}
