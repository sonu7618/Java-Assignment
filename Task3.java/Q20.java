
// Input a number and check if it is a perfect square using for loop.
 
import java.util.Scanner;
 
public class Q20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        boolean isPerfectSquare = false;

        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                isPerfectSquare = true;
                break; // Exit the loop as we found the number is a perfect square
            }
        }

        if (isPerfectSquare) {
            System.out.println(num + " is a perfect square.");
        } 
        else {
            System.out.println(num + " is not a perfect square.");
        }

        scanner.close();
    }
}