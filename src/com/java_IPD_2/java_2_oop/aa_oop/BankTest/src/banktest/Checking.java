package _java_exe.BankTest.src.banktest;

public class Checking implements IAccount {

    private double checkingBalance;
    private Currency checkingCur;
    
    public double getCheckingBalance() {
        return checkingBalance;
    }

    public Currency getCheckingCur() {
        return checkingCur;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

 

    @Override
    public void withdraw(double amt) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(checkingBalance >=amt)checkingBalance -=amt;
    }

    @Override
    public void deposit(double amt) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        checkingBalance +=amt;
    }
    
    public void setCheckingCur(Currency cur){
        this.checkingCur = cur;
    }
   
}
