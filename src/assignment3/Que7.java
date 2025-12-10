package assignment3;
//Create a BankAccount class:
public class Que7
{
    private String accountHolder;
    private String accountNumber;
    private double balance = 0;
    private String accountType;

    public void BankAccount(String accountHolder, String accountNumber, String accountType, double balance)
    {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.accountType = (accountType);
        this.balance = balance;

    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if(accountNumber.length() == 10)
            this.accountNumber = accountNumber;
        else
        {
            System.out.println("Invalid Account Number");
            System.out.println("Account Number must be numeric and 10 digit");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
       if(balance >= 0)
           this.balance = balance;
       else
           System.out.println("Balance cannot be negative!");
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        if(accountType.equals("Checking") || accountType.equals("Saving"))
            this.accountType = accountType;
        else
            System.out.println("Account type must be 'Checking' or 'Savings' only");
    }

    public void displayAccountDetails()
    {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args)
    {
        Que7 bankAccount = new Que7();

        bankAccount.setAccountHolder("Prashant Domkawale");
        bankAccount.setAccountNumber("2234555566");
        bankAccount.setBalance(733);
        bankAccount.setAccountType("Saving");

        bankAccount.displayAccountDetails();
    }


}
