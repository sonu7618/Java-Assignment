// Write a program that takes a number and checks if it is divisible by both 5 and 11.
 
import java.util.Scanner;
 
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println("Number is divisible by both 5 and 11");
        } else if (num % 5 == 0) {
            System.out.println("Number is divisible by 5 but not by 11");
        } else if (num % 11 == 0) {
            System.out.println("Number is divisible by 11 but not by 5");
        } else {
            System.out.println("Number is not divisible by either 5 or 11");
        }

        scanner.close();
    }
}
