// Input a month number (1–12) and print the number of days in that month using switch
 
import java.util.Scanner;
 
public class Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number from (1 to 12): ");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            System.out.println("This month has 31 days.");
            break;

            case 4:
            case 6:
            case 9:
            case 11:
            System.out.println("This month has 30 days.");
            break;

            case 2:
            System.out.println("This month has 28 or 29 days (February).");
            break;

            default:
            System.out.println("Invalid month number!");
        }

        scanner.close();
    }
}
