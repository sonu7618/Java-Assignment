// Input a number and reverse it using a for loop.
 
import java.util.Scanner;
 
public class Q22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        String str = String.valueOf(number);
        int lengthOfStr = str.length();

        System.out.print("Reversed number: ");
        for (int i = lengthOfStr - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        scanner.close();
    }
}

