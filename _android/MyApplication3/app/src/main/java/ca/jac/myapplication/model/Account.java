package ca.jac.myapplication.model;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Account implements Serializable, Comparable {

    private String accountNumber;
    private String openDate;
    private float balance;

    public Account(String accountNumber, String openDate, String balanceString) {
        this.accountNumber = accountNumber;
        this.openDate = openDate;
        this.balance = Float.parseFloat(balanceString);
    }

    public String getCountryName() {
        return countryName.toUpperCase();
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCapital() {
        return capital.substring(0,1).toUpperCase() + capital.substring(1).toLowerCase();
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return  getCountryName() + ", " + getCapital();
    }

    @Override
    public int compareTo(@NonNull Object o) {
        Account otherAccount = (Account) o;
        return getCountryName().compareTo(otherAccount.getCountryName());
    }
}
