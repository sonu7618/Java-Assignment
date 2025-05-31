// Input n and print the first n terms of the Fibonacci series.
 
import java.util.Scanner;
 
public class Q24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int num = scanner.nextInt();

        int first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + num + " terms:");

        for (int i = 1; i <= num; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        scanner.close();
    }
}
