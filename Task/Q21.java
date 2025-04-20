// Write a program to find the sum of digits of a number using a loop.
 
import java.util.Scanner;
 
public class Q21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        for (; number != 0; number /= 10) {
            sum += number % 10;
        }
        System.out.println("The sum of the digits is: " + sum);

        scanner.close();
    }
}
