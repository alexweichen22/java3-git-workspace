package ca.jac.wei.model;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Account implements Serializable{

    private int accountNumberBase = 1000;
    private int accountNumber;
    private String openDate;
    private float balance;

    public Account(String openDate, String balanceString) {
        accountNumberBase ++;
        this.accountNumber = accountNumberBase;
        this.openDate = openDate;
        this.balance = Float.parseFloat(balanceString);
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }
    public void setAccountNumber(int input){
        this.accountNumber=input;
    }
    public String getOpenDate(){
        return this.openDate;
    }
    public void setOpenDate(String input){
        this.openDate=input;
    }
    public float getBalance(){
        return this.balance;
    }
    public void setBalance(float input){
        this.balance=input;
    }

    @Override
    public String toString() {
        return accountNumber + "," + openDate + "," + String.valueOf(balance);
    }
}

