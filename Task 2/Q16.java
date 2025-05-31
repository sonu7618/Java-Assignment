import java.util.Scanner;
 public class Q16 {
     public static void isKaprekar(int num) {
         if (num == 1) {
             System.out.println("1 is a Kaprekar number.");
             return;
         }
         int square = num * num;
         String squareStr = String.valueOf(square);
         int len = squareStr.length();
         for (int i = 1; i < len; i++) {
             String leftPart = squareStr.substring(0, i);
             String rightPart = squareStr.substring(i);
             int left = Integer.parseInt(leftPart);
             int right = Integer.parseInt(rightPart);
             if (right != 0 && (left + right) == num) {
                 System.out.println(num + " is a Kaprekar number.");
                 return;
             }
         }
         System.out.println(num + " is not a Kaprekar number.");
     }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int num = sc.nextInt();
         isKaprekar(num);
     }
 }