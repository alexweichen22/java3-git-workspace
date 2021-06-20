/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _java_exe.BankTest.src.banktest;


/**
 *
 * @author 6151742
 */
public class BankTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Checking checkingAccount = new Checking();
        checkingAccount.deposit(1000.00);
        checkingAccount.withdraw(500.00);
        System.out.println(checkingAccount.getCheckingBalance());
        checkingAccount.setCheckingCur(Currency.CAD);
        
        double currentAmmount = checkingAccount.getCheckingBalance();
        Currency ammountCurrency = checkingAccount.getCheckingCur();
        
        System.out.println("");
    }
    
}
