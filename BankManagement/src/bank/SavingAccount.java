
package bank;

import account.BankAccount;




public class SavingAccount extends BankAccount{

    public SavingAccount() {
    }

    public SavingAccount(String accountNumber, double balance, String accountHolder) {
        super(accountNumber, balance, accountHolder);
    }

    @Override
    public void deposit(double amount) {
        double newBalance=amount>0? super.getBalance()+amount:super.getBalance();
       super.setBalance(newBalance);
       if(amount>0){
           System.out.println("Transaction succesfully. Deposit amount = "+amount+"\nnew ballance = "+super.getBalance());
       }
       else{
           System.out.println("Trancstion faill ");}
    }

    @Override
    public void withdraw(double amount) {
        if(super.getBalance()>=amount&&(amount>0)){
        double newBalance=amount>0? super.getBalance()-amount:super.getBalance();
        System.out.println("Transaction succesfully. Deposit amount = "+amount+"\nnew ballance = "+super.getBalance());
        }
        else{ System.out.println("Trancstion faill not enough ballance ");}
    }
    }
   

