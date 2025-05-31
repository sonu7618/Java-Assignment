public class Q18 {
    public static void generateFibonacci(int n) {
        int first = 0, second = 1;
        System.out.print("Fibonacci series up to " + n + " terms: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n = 10; 
        generateFibonacci(n);
    }
}