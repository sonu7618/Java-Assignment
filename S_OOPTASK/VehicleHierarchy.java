// 4. Design a class hierarchy for different types of vehicles. Create a base class 'Vehicle' with methods 'startEngine()' and 'stopEngine()'. Derive two classes 'Car' and 'Motorcycle' from 'Vehicle'. Add methods 'drive()' in 'Car' and 'ride()' in 'Motorcycle'. Write a Java program to demonstrate hierarchical inheritance and invoke the relevant methods for a car and a motorcycle object.

class Vehicle{
    void startEngine(){
        System.out.println("Engine started");
    }
    void stopEngine(){
        System.out.println("Engine stopped");
    }
}

class Car extends Vehicle{
    void drive(){
        System.out.println("Ram is driving car");
    }
}

class Motorcycle extends Vehicle{
    void ride(){
        System.out.println("Ram is riding motorcycle");
    }
}

public class VehicleHierarchy {
    public static void main(String[] args) {
        Car c = new Car();
        c.startEngine();
        c.drive();
        c.stopEngine();

        Motorcycle m = new Motorcycle();
        m.startEngine();
        m.ride();
        m.stopEngine();
    }
}