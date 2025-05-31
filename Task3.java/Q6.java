// Take a number from the user and print whether it is even or odd.
 
import java.util.Scanner;
 
public class Q6 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("The given number is even: ");
        }
        else {
            System.out.println("The given number is odd: ");
        }

        scanner.close();
    }
}
