import java.util.Scanner;
 public class NaturalSum {
     public static void findSum(int n) {
         int sum = n * (n + 1) / 2;
         System.out.println("Sum of first " + n + " natural numbers is: " + sum);
     }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a positive integer: ");
         int n = sc.nextInt();
         if(n > 0){
             findSum(n);
         } else {
             System.out.println("invalid");
         }
     }
 }