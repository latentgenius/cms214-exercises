/*
 * File: AccountTest.java
 */

/**
 *
 * @author Jonathan Barisere
 */

import bankAccount.Account;
import javax.swing.JOptionPane;

public class AccountTest {
    public static void main(String[] args) {
        String[] accountDetails = {};
        
        JOptionPane.showMessageDialog(null, "New Account Creation: Enter"
                + " your account name in the next dialog!",
                "New Account", JOptionPane.INFORMATION_MESSAGE);
        accountDetails[0] = JOptionPane.showInputDialog(null,
                "Enter Account Name: ", "", JOptionPane.INFORMATION_MESSAGE);
        accountDetails[1] = JOptionPane.showInputDialog(null,
                "Enter Account Type: ", "", JOptionPane.INFORMATION_MESSAGE);
        
        String accountName = accountDetails[0];
        String accountType = accountDetails[1].toLowerCase();
        
        if (accountName == "") {
            JOptionPane.showMessageDialog(null,
                    "No acount name entered! Exiting...",
                    "Malformed Input", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        
        if (accountType == "") {
            JOptionPane.showMessageDialog(null,
                    "No acount type entered! Exiting...",
                    "Malformed Input", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        
        Account account = new Account(accountName);
        
        switch(accountType) {
            case "savings": account.setType(Account.ACCOUNT_TYPE.SAVINGS);
                break;
            case "current": account.setType(Account.ACCOUNT_TYPE.CURRENT);
                break;
            case "fixed deposit": account.setType(Account.ACCOUNT_TYPE.FIXED_DEPOSIT);
                break;
            default: JOptionPane.showMessageDialog(null, "Wrong Account Type!"
                    + "\n Account types allowed are:\n"
                    + "savings\n"
                    + "current\n"
                    + "fixed deposit", "Wrong Account Type",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        double deposit = 0.0;
        try {
            deposit = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Enter Deposit Amount", "Deposit",
                JOptionPane.QUESTION_MESSAGE));
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.toString(),
                    "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
        
        if (deposit > 0.0) {
            if (account.credit(deposit) != true) {
                JOptionPane.showMessageDialog(null,
                            "Deposit Failed!", accountName,
                            JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                            "Success!", accountName,
                            JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
