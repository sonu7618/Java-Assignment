public class MultiplicationTables {
 
    public static void printTables() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Multiplication Table for " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); // adds a blank line between tables
        }
    }

    public static void main(String[] args) {
        printTables();
    }
}