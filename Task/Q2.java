// Take two numbers as input and print their sum, difference, product, and quotient.
 
import java.util.Scanner;
 
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter 1st number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int diff  = num1 - num2;
        double quot = (double) num1 / num2;

        System.out.println("Sum of two number is "+sum);
        System.out.println("Difference of two number is "+diff);
        System.out.println("Qoutient of two number is "+quot);

        scanner.close();
    }
}
