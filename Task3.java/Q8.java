// Write a program to input a character and check if it is a vowel or a consonant using if-else.
 
import java.util.Scanner;
 
public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = scanner.next().toLowerCase().charAt(0); // Convert to lowercase for uniformity

        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
            System.out.println("Vowel");
        } else if (Character.isLetter(character)) { // Check if it's a letter
            System.out.println("Consonant");
        } else {
            System.out.println("Invalid input. Please enter a letter.");
        }

        scanner.close();
    }
}
