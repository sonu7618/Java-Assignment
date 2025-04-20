// Write a program to check whether a given number is positive, negative, or zero using if-else.
 
import java.util.Scanner;
 
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The given number is positive.");
        }
        else if (number < 0) {
            System.out.println("The given number is negative.");
        }
        else {
            System.out.println("The given number is zero.");
        }

        scanner.close();
    }
    
}
