class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println(brand + " vehicle is starting.");
    }
}

class Car extends Vehicle {
    String model;

    Car(String brand, String model) {
        super(brand);
        this.model = model;
    }

    @Override
    void start() {
        super.start();
        System.out.println(model + " car is now running.");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car myCar = new Car("BMW", "SUVs");
        myCar.start();
    }
}
