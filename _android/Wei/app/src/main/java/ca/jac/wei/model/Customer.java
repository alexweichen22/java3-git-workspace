package ca.jac.wei.model;
import androidx.annotation.NonNull;
import java.io.Serializable;
public class Customer implements Serializable, Comparable{
    String firstName;
    String familyName;
    String phoneNumber;
    String sinNumber;
    Account account;

    public Customer(String firstName, String familyName, String phoneNumber, String sinNumber, String openDate, String balanceString){
        this.firstName = firstName;
        this.familyName = familyName;
        this.phoneNumber = phoneNumber;
        this.sinNumber = sinNumber;
        account = new Account(openDate, balanceString);
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String input){
        this.firstName = input;
    }

    public String getFamilyName(){
        return this.familyName;
    }

    public void setFamilyName(String input){
        this.familyName = input;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setPhoneNumber(String input){
        this.phoneNumber = input;
    }

    public String getSinNumber(){
        return this.sinNumber;
    }

    public void setSinNumber(String input){
        this.sinNumber = input;
    }

    public Account getAccount(){
        return account;
    }

    @Override
    public String toString(){
        return firstName + ", " + familyName + ", " + phoneNumber + ", " + sinNumber;
    }

    @Override
    public int compareTo(@NonNull Object o) {
        Customer otherCustomer = (Customer) o;
        return getFamilyName().compareTo(otherCustomer.getFamilyName());
    }
}
