// Write a program to input a number from 1 to 7 and display the day of the week using switch.
 
 import java.util.Scanner;
 
 public class Q17 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         System.out.print("Enter a number from (1 to 7): ");
         int day = scanner.nextInt();
 
         switch (day) {
             case 1 : 
             System.out.println("Sunday");
             break;
 
             case 2 :
             System.out.println("Monday");
             break;
 
             case 3 :
             System.out.println("Tuesday");
             break;
 
             case 4 :
             System.out.println("Wednesday");
             break;
 
             case 5 :
             System.out.println("Thursday");
             break;
 
             case 6 :
             System.out.println("Friday");
             break;
 
             case 7 :
             System.out.println("Saturday");
             break;
             
             default:
             System.out.println("Invalid number");
         }
     }
 }
