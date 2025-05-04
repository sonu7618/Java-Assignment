//Write a method to print all odd numbers from 1 to a given number n
import java.util.Scanner;

public class Odd {
    public static void odd (int n) {
        for (int i = 1; i <=n; i++) {
            if (i % 2 !=0) {
            System.out.println("odd");
        }
    }   
    
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        odd(num);

        scanner.close();
    }

}
