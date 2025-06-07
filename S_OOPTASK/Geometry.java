// 3. Imagine that you are building a geometry calculator program. You need to implement the calculation of areas for different shapes, including rectangles, squares, and circles. To achieve this, you decide to use a multilevel inheritance hierarchy.

class Shape{
    int length;
    int breath;
    int radius;

    Shape(int length, int breadth){
        this.length = length;
        this.breath = breadth;
    }

    Shape(int radius){
        this.radius = radius;
    }
}

class Rectangle extends Shape{
    Rectangle(int length, int breadth){
        super(length,breadth);
    }
    void calculateArea(){
        int area = super.length * super.breath;
        System.out.println("Rectang;e Area: " + area);
    }
}

class Square extends Rectangle{
    Square(int side){
        super(side, side);
    }
    void calculateArea(){
        int area = super.length * super.length;
        System.out.println("Square Area: " + area);
    }
}

class Circle extends Shape{
    Circle(int radius){
        super(radius);
    }
    void calculateArea(){
        double area = Math.PI * super.radius * super.radius;
        System.out.println("Circle Area: " + area);
    }
}
public class Geometry {
    public static void main(String[] args) {
        Rectangle r = new  Rectangle(10, 6);
        r.calculateArea();

        Square s = new Square(8);
        s.calculateArea();

        Circle c = new Circle(5);
        c.calculateArea();
    }
}