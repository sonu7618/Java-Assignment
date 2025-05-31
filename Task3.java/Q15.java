// Input a number and display the factorial of that number using a for loop.
 
import java.util.Scanner;
 
public class Q15 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = i * fact;
        }
        System.out.println("Factorial of " + num + " is " + fact);
        
        scanner.close();
    }
}
