class Vehicle{
    public void drive(){
        System.out.println("Vehicle is driving");
    }
}

class Car extends Vehicle{
    String brand;
    String model;

    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;

    }
    public void display(){
        System.out.println("Car brand: " + brand);
        System.out.println("Car model: " + model);
    }

}

public class VehiclesMain {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", "SUVs");
        c1.drive();
        c1.display();
    }
}