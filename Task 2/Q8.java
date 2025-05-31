public class Q8 {
    public static void swap(int a, int b) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        swap(num1, num2);
    }
}