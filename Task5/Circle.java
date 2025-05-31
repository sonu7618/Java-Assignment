/* Write a Java program to create a class called "Circle" with a radius attribute. You can access Add commentMore actions
this attribute using setter and getter method. Calculate the area and circumference of the circle.*/


public class Circle {
    private double  radius;


    // setter
    public void setRadius(double radius){
        this.radius = radius;
    }

    // getter
    public double getRadius(){
        return radius;
    }

    // method to claculate area
    public double getArea(){
        return Math.PI * radius * radius;
    }

    // method to calculate circumference
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
}

class Circleimp{
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(5);

        System.out.println("Radius: " + c.getRadius());
        System.out.println("Area: " + c.getArea());
        System.out.println("Circumference: " + c.getCircumference());
    }
}