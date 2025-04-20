// Take a number n and print the sum of first n natural numbers using a loop.
 
import java.util.Scanner;
 
public class Q13 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = i + sum;
        }
        System.out.println("Sum of first " + num + "  natural numbers is " + sum);
        
        scanner.close();
    }
    
}
