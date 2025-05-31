// Take marks of five subjects and calculate the total, percentage, and grade using if-else.
 
import java.util.Scanner;
 
public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter mark of 1st subject (out of 100): ");
        int sub1 = scanner.nextInt();

        System.out.print("Enter mark of 2nd subject (out of 100): ");
        int sub2 = scanner.nextInt();

        System.out.print("Enter mark of 3rd subject (out of 100): ");
        int sub3 = scanner.nextInt();

        System.out.print("Enter mark of 4th subject (out of 100): ");
        int sub4 = scanner.nextInt();

        System.out.print("Enter mark of 5th subject (out of 100): ");
        int sub5 = scanner.nextInt();

        int total = sub1 + sub2 +sub3 + sub4 + sub5;
        float per = (float) total/500 * 100;
        System.out.println(per+"%");

        if (per >= 90) {
            System.out.println("Grade A");
        }
        else if (per >= 80) {
            System.out.println("Grade B");
        }
        else if (per >= 70) {
            System.out.println("Grade C");
        }
        else if (per >= 60) {
            System.out.println("Grade D");
        }
        else if (per >= 50) {
            System.out.println("Grade E");
        }
        else {
            System.out.println("Fail");
        }

        scanner.close();
    }
    
}