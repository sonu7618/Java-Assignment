1. Explain the difference between abstract class and interface in Java. Provide one example for each.

Abstract class
- Used to provide a common base with some implemented methods for subclasses.
- Can have abstract and non-abstract methods (with body).
- Can have instance variables.
- Supports single inheritance only.
- Can have public, protected, private methods and variables.
Eg: 
abstract class Animal {
    abstract void sound();

    void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks.");
    }
}

public class TestAbstract {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.sleep();
    }
}


Interface
- Used to provide full abstraction and define capabilities that classes should implement.
- All methods are abstract by default (until Java 8), but can have default/static methods with body from Java 8 onward.
- Variables are public, static, and final by default.
- Supports multiple inheritance (a class can implement multiple interfaces).
- Methods are public and abstract by default.
Eg: 
interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting.");
    }
}

public class TestInterface {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}


2. Describe the concept of polymorphism in Java with suitable examples. Differentiate between compile-time and runtime polymorphism.

    Polymorphism means “many forms”. It allows a single action to behave differently based on the object that invokes it, enabling code reusability 
and flexibility.
            In Java, polymorphism is achieved in two ways:

a) Compile-time Polymorphism (Method Overloading)
- Occurs when two or more methods in a class have the same name but different parameters (type/number/order).
- Method call is resolved at compile-time.
Eg:
class AreaCalculator {
    // Calculate area of a rectangle
    int area(int length, int breadth) {
        return length * breadth;
    }

    // Calculate area of a square
    int area(int side) {
        return side * side;
    }

    // Calculate area of a circle
    double area(double radius) {
        return 3.1416 * radius * radius;
    }
}

public class TestOverloadingArea {
    public static void main(String[] args) {
        AreaCalculator ac = new AreaCalculator();
        System.out.println("Area of Rectangle: " + ac.area(5, 4));
        System.out.println("Area of Square: " + ac.area(5));
        System.out.println("Area of Circle: " + ac.area(3.5));
    }
}


b) Runtime Polymorphism (Method Overriding)
- Occurs when a subclass provides its own implementation of a method already defined in the superclass with the same signature.
- Method call is resolved at runtime based on the object type.
Eg:
class Animal {
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows.");
    }
}

public class TestOverriding {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.sound();
    }
}
