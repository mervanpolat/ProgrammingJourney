// Define the public class 'BankAccount'
public class BankAccount {

    // Declare a private double variable 'balance'. This variable can only be accessed directly within this class.
    private double balance;

    // Define a public constructor for the BankAccount class that takes one parameter: balance.
    // This constructor is used to create new instances of the 'BankAccount' class.
    public BankAccount(double balance) {
        // Use an 'if' statement to check whether the balance is greater than or equal to 0.
        // If it is, set this instance's balance field to the given balance.
        if(balance >= 0) {
            this.balance = balance;
        } else {
            // If the balance is less than 0, print an error message.
            System.out.println("Balance can't be negative");
        }
    }

    // Define a public method 'getBalance' that returns the balance of the bank account.
    // Other classes can use this method to find out the balance of the bank account.
    public double getBalance() {
        return balance;
    }

    // Define a public method 'deposit' that takes one parameter: amount.
    // This method is used to deposit money into the bank account.
    public void deposit(double amount) {
        // Check whether the amount to be deposited is greater than 0.
        // If it is, add the amount to the balance.
        if(amount > 0) {
            this.balance += amount;
        } else {
            // If the amount is less than or equal to 0, print an error message.
            System.out.println("Deposit amount must be positive");
        }
    }

    // Define a public method 'withdraw' that takes one parameter: amount.
    // This method is used to withdraw money from the bank account.
    public void withdraw(double amount) {
        // Check whether the amount to be withdrawn is greater than 0 and less than or equal to the balance.
        // If it is, subtract the amount from the balance.
        if(amount > 0 && amount <= this.balance) {
            this.balance -= amount;
        } else {
            // If the amount is less than or equal to 0 or greater than the balance, print an error message.
            System.out.println("Insufficient balance or invalid withdrawal amount");
        }
    }
}
