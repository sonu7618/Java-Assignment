import java.util.Scanner;
 
 public class Count {
     public static void Counter(String string){
         int length = string.length();
         System.out.println(length);
     }
     public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         System.out.println("Enter a string");
         String string = sc.nextLine();
         Counter(string);
     }
 }