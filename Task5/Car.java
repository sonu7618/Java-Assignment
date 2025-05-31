/* You are designing a car rental system, and you need to create a Car class. The Car class should have private instance variables for the car's make, Add commentMore actions
model, and rental price per day. Implement appropriate getter and setter methods for these variables, ensuring that the make and model can only be set 
once during object creation. Additionally, include a private variable to track the availability of the car (e.g., true if available for rent, false if 
rented), and provide public methods to rent and return the car, updating its availability status. */


public class Car {
    private String make;
    private String model;
    private double rentalprice;
    private boolean isAvailable;

    public Car(String make, String model, double rentalprice) {
        this.make = make;
        this.model = model;
        this.rentalprice = rentalprice;
        this.isAvailable = true;
    }

    // setter
    public void setRentalprice(double rentalprice) {
        if (rentalprice >= 0) {
            this.rentalprice = rentalprice;
        }
    }

    // getter
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getRentalprice() {
        return rentalprice;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public void rentCar() {
        if (isAvailable) {
            isAvailable = false;
        }
    }
    public void returnCar() {
        isAvailable = true;
    }

    public void carinfo() {
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Rental Price per Day: " + getRentalprice());
    }
}

class CarDriver{
    public static void main(String[] args) {
        Car car = new Car("BMW", "SUV", 10000);
        car.carinfo();
        car.rentCar();
        System.out.println("Car Available: " + car.isAvailable());
        car.returnCar();
        System.out.println("Car Available after return: " + car.isAvailable());
    }
}