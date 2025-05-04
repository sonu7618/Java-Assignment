import java.util.Scanner;
 public class Cube{
 
     public static void calculateCube(int num) {
         int cube = num * num * num;
         System.out.println("Cube of " + num + " is: " + cube);
     }
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int num = sc.nextInt();
         calculateCube(num);
     }
 }