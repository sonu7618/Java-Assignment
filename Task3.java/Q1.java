// Write a Java program to input your full name and print a greeting message.
 
import java.util.Scanner;
 
public class Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello my name is " + name+".I hope you are doing good");

        scanner.close();
    }
}