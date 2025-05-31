// Input the age of a person and check if they are eligible to vote (18 or older).
 
import java.util.Scanner;
 
public class Q7 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        String vote=age>=18? "Eligible to vote":"Not Eligible to vote";
        System.out.println(vote);

        scanner.close();

    }
}
