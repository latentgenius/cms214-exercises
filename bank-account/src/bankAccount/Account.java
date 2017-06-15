/*
 * File: Account.java
 */
package bankAccount;

/**
 *
 * @author Jonathan Barisere
 */
public class Account {
    public Account(String accountName) {
        this.accountName = accountName;
        this.setBalance(0.0);
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }
    
    public ACCOUNT_TYPE getType() {
        return this.accountType;
    }
    
    public void setType(ACCOUNT_TYPE type) {
        this.accountType = type;
    }
    
    public Boolean debit(double debitValue) {
        double valueTest = this.getBalance() - debitValue;
        if (valueTest >= 0) {
            this.setBalance(valueTest);
            return true;
        } else return false;
    }
    
    public Boolean credit(double creditValue) {
        double valueTest = this.getBalance() + creditValue;
        this.setBalance(valueTest);
        return true;
    }
    
    public enum ACCOUNT_TYPE{SAVINGS, CURRENT, FIXED_DEPOSIT};
    private String accountName;
    private double balance;
    private ACCOUNT_TYPE accountType;
}
