import java.util.Scanner;
 
public class Interest {
    public static void Calculate(int p,int t,float r){
        double  compountInterest = p * Math.pow(1 + (r/100),t);
        System.out.println(compountInterest); 
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle: ");
        int p = sc.nextInt();
        System.out.println("Enter the rate: ");
        float r = sc.nextFloat();
        System.out.println("Enter the time: ");
        int t = sc.nextInt();
        Calculate(p,t,r);
    }
    
}