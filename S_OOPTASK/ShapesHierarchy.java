// 5. Implement a class hierarchy for various shapes. Create a base class 'Shape' with a method 'calculateArea()'. Derive two classes 'Rectangle' and 'Circle' from 'Shape'. Add additional methods 'calculatePerimeter()' in 'Rectangle' and 'calculateCircumference()' in 'Circle'. Write a Java program to demonstrate hierarchical inheritance and compute the area and perimeter/circumference for a rectangle and a circle object.

abstract class Shape {
    abstract void calculateArea();
}

class Rectangle extends Shape {
    int length;
    int breadth;

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    void calculateArea(){
        int area = length * breadth;
        System.out.println("Rectangle Area: " + area);
    }

    void calculatePerimeter(){
        int perimeter = 2 * (length * breadth);
        System.out.println("Rectangle Perimeter: " + perimeter);
    }
}

class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }

    void calculateCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circle Circumference: " + circumference );
    }
}

public class ShapesHierarchy {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 5);
        r.calculateArea();
        r.calculatePerimeter();

        Circle c = new Circle(3);
        c.calculateArea();
        c.calculateCircumference();
    }
}