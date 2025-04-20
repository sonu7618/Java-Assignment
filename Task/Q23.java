// Take a number and check whether it is a palindrome or not using if-else and loop.
 
 import java.util.Scanner;
 
 public class Q23 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         System.out.print("Enter a number: ");
         int original = scanner.nextInt();
         int reverse = 0;
 
         // Reverse the number using for loop
         for (int num = original; num != 0; num /= 10) {
             reverse = reverse * 10 + num % 10;
         }
 
         // Check and print result
         if (original == reverse) {
             System.out.println(original + " is a palindrome.");
         } else {
             System.out.println(original + " is not a palindrome.");
         }
 
         scanner.close();
     }
 }
