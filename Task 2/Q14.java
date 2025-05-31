public class Q14 {
    public static int sumOfSquares(int num){
        int sum = 0;
        while(num != 0){
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args){
        int number = 123;
        int result = sumOfSquares(number);
        System.out.println("Result :"+ result);
    }
}