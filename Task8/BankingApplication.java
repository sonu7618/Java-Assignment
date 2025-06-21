/* You are developing a banking application that includes different types of accounts. Each account has a method named calculateInterest to 
calculate the interest based on the account type. Implement the calculateInterest method in the base class Account and override it in the derived 
classes SavingsAccount and FixedDepositAccount to calculate interest based on their specific rules. Write the code to demonstrate method overriding
 for calculating interest. */


class Account {
    protected String accountHolder;
    protected double balance;

    public Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double calculateInterest() {
        return 0;  // Default: no interest
    }
}

class SavingsAccount extends Account {

    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.04; 
    }
}

class FixedDepositAccount extends Account {

    public FixedDepositAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.07;  
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        Account generalAcc = new Account("John General", 10000);
        SavingsAccount savingsAcc = new SavingsAccount("Alice Saver", 15000);
        FixedDepositAccount fdAcc = new FixedDepositAccount("Bob FD", 20000);

        System.out.println("General Account Interest: " + generalAcc.calculateInterest());
        System.out.println("Savings Account Interest: " + savingsAcc.calculateInterest());
        System.out.println("Fixed Deposit Account Interest: " + fdAcc.calculateInterest());
    }
}
