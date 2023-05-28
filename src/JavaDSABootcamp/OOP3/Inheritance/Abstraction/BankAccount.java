package JavaDSABootcamp.OOP3.Inheritance.Abstraction;


public abstract class BankAccount {
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    abstract double getBalance();
}
