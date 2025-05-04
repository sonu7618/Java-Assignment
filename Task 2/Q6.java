import java.util.Scanner;
 public class Pallindrome {
     public static void CheckPallindrome(int num){
         int original_num = num;
         int reversed = 0;
         while(num != 0){
             int digit = num % 10;
             reversed = reversed * 10 + digit;
             num /= 10;
         }
         System.out.println(reversed);
         if(original_num == reversed){
             System.out.println("Pallindrome");
         }
         else{
             System.out.println("Not pallindrome");
         }
     }
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number: ");
         int num = sc.nextInt();
         CheckPallindrome(num);
     }
 }