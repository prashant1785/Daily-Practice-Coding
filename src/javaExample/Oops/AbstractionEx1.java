package Oops;

abstract class Bank{
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}
 class SBI extends Bank{
    void deposit(double amount)
    {
        System.out.println("SBI deposit amount: "+ amount);
    }
    void withdraw(double amount)
    {
        System.out.println("SBI withdraw amount: "+ amount);
    }
}
public class AbstractionEx1 {
    public static void main(String[] args) {
        Bank bank = new SBI();
        bank.deposit(10000);
        bank.withdraw(5000);
    }
}
