/* You are designing a calculator application. Create a class called "Calculator" with the following overloaded methods:
a) int add(int a, int b) - This method should add two integers and return the result.
b) double add(double a, double b) - This method should add two doubles and return the result.
c) int add(int a, int b, int c) - This method should add three integers and return the result. */


class Calculator {

    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum1 = calc.add(5, 10);             
        double sum2 = calc.add(3.5, 2.8);        
        int sum3 = calc.add(1, 2, 3);           

        System.out.println("Sum of 5 and 10: " + sum1);
        System.out.println("Sum of 3.5 and 2.8: " + sum2);
        System.out.println("Sum of 1, 2 and 3: " + sum3);
    }
}

