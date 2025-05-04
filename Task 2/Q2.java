import java.util.Scanner;
 
public class Dateconverter {
    public static void convertDays(int totalDays){
        int years = totalDays / 365;
        int remainingDaysAfterYears = totalDays % 365;
        int months = remainingDaysAfterYears / 30;
        int days  = remainingDaysAfterYears % 30;
        System.out.println("Years: "+ years);
        System.out.println("Months: "+ months);
        System.out.println("Days: "+ days );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the ttotal number of days:");
        int totalDays = sc.nextInt();
        convertDays(totalDays);
    }
}