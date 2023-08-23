
package account;


public class ChackingAccount extends BankAccount{

    public ChackingAccount() {
    }

    public ChackingAccount(String accountNumber, String accountHolder, double ballance) {
        super(accountNumber, accountHolder, ballance);
    }

    
    
    
    @Override
    public double deposit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double withdraw() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
