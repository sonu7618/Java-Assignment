// Write a program to print the multiplication table of a given number using for loop.
 
import java.util.Scanner;
 
public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Multiplication table of ");
        int num = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            int multi = num * i;
            System.out.println(num + " X "+ i + " = " + multi );
        }

        scanner.close();
    }
}
