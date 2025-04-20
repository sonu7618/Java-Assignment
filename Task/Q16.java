// Take two numbers and an operator (+, -, *, /) and perform the operation using switch.
 
import java.util.Scanner;
 
public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Perform operation using switch
        switch (operator) {
            case '+':
            System.out.println("Result: " + (num1 + num2));
            break;

            case '-':
            System.out.println("Result: " + (num1 - num2));
            break;

            case '*':
            System.out.println("Result: " + (num1 * num2));
            break;

            case '/':
            if (num2 != 0) {
                System.out.println("Result: " + (num1 / num2));
            } 
            else {
                System.out.println("Error: Division by zero!");
            }
            break;

            default:
            System.out.println("Invalid operator!");
        }

        scanner.close();
    }
}
