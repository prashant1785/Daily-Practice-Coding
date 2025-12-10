package Multithreading;

class Bank{

    public synchronized void withdrawAmount(double withdrawAmount)
    {
       // System.out.println(Thread.currentThread().getName() + " accessing the bank...");
        double totalMoney  = 5000.00;
        System.out.println("Welcome to the Bank....");

        //   double remeaningAmount = 0;

        try {
            if (withdrawAmount > totalMoney)
            {
                throw new IllegalArgumentException("withdraw Amount less than total amount....");
            }
            System.out.println("withdraw Amount: "+ withdrawAmount);
            System.out.println("Amount withdrawal successful....");
            totalMoney = totalMoney - withdrawAmount;
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Remeaning Amount is: "+ totalMoney);
    }
}/*
class AccountHolder1 extends Thread{
    Bank bank;
    double amount;
    public AccountHolder1(Bank bank, double amount) {
        this.bank = bank;
        this.amount = amount;
    }
    @Override
    public void run() {
        bank.withdrawAmount(amount);
    }
}
class AccountHolder2 extends Thread{
    Bank bank;
    double amount;
    public AccountHolder2(Bank bank, double amount) {
        this.bank = bank;
        this.amount = amount;
    }
    @Override
    public void run() {
        bank.withdrawAmount(amount);
    }
}*/
public class SynchronizedBankEx
{
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        bank1.withdrawAmount(2000);

        Bank bank2 = new Bank();
        bank2.withdrawAmount(7000);

//        AccountHolder1 ah1 = new AccountHolder1(sb,2000.500);
//        AccountHolder2 ah2 = new AccountHolder2(sb,1000);
//
//        ah1.setName("Prashant");
//        ah2.setName("Rohit");
//        ah1.start();
//        ah2.start();

    }
}
