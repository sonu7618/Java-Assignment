import java.util.Scanner;
 
 public class Duck {
 
     public static void checkDuckNumber(int num) {
         String numStr = Integer.toString(num);
         if (numStr.charAt(0) == '0') {
             System.out.println(num + " is not a Duck number.");
             return;
         }
         if (numStr.contains("0")) {
             System.out.println(num + " is a Duck number.");
         } else {
             System.out.println(num + " is not a Duck number.");
         }
     }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int num = sc.nextInt();
         checkDuckNumber(num);
     }
 }
