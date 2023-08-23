
package account;


public abstract class BankAccount {
    public String accountNumber;
    public double balance;
    public String accountHolder;

    public BankAccount() {
    }

    public BankAccount(String accountNumber, double balance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    
    public abstract void deposit(double amount);
    
    public abstract void withdraw(double amount);

    @Override
    public String toString() {
        return "BankAccount{" + "accountNumber=" + accountNumber + ", balance=" + balance + ", accountHolder=" + accountHolder + '}';
    }
    
    
}
