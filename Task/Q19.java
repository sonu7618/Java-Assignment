// Take a character input and use switch to display if it is a vowel (a, e, i, o, u).
 
import java.util.Scanner;
 
public class Q19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = scanner.next().toLowerCase().charAt(0);

        switch (character) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println("Vowel");
            break;

            default:
            System.out.println("Consonant");
        }

        scanner.close();
    }
}