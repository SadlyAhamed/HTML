
package account;


public abstract class BankAccount {
    public String accountNumber;
    public String accountHolder;
    public double ballance;

    public BankAccount() {
    }

    public BankAccount(String accountNumber, String accountHolder, double ballance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.ballance = ballance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBallance() {
        return ballance;
    }

    public void setBallance(double ballance) {
        this.ballance = ballance;
    }
    
    public abstract double deposit();
    public abstract double withdraw();
    
}
