import java.util.Scanner;
public class Harshad {
    public static void Harshad(int number){
        int store = 0;
        String strNum = String.valueOf(number);
        for(int i = 0; i < strNum.length(); i++){
        char ch = String.valueOf(number).charAt(i);
        int digit = ch - '0';
        store += digit;
        }
        System.out.println(store);
        if(number % store == 0){
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not Harshad");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number to check for Harshid Number: ");
        int number = sc.nextInt();
        Harshad(number);
    }
}
