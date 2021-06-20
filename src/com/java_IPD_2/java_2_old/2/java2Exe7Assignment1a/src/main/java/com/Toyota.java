package _java_exe.java2Exe7Assignment1a.src.main.java.com;

import java.util.ArrayList;

public class Toyota extends Car{
    
    private String owner;
    private License[] licenseArray = new License[100];
    private int licenseCount;
    
   // Constructor
    Toyota(String license){
        License firstLicense = new License();
        firstLicense.setLicense(license);
        this.licenseArray[0]=firstLicense;
        licenseCount=1;
        this.setMake("Toyota");
    }

    public String getOwner() {
        return owner;
    }
    public License[] getLicenseArray() {return licenseArray;}
    public int getLicenseCount() {return licenseCount;}

    public void setOwner(String owner) {
        this.owner = owner;
    }
    
       // Methods    
    public void addLicense(String license){
        License newLicense = new License();
        newLicense.setLicense(license);
        this.licenseArray[licenseCount]=newLicense;
        licenseCount+=1;
    }
    
    public void removeLicense(String license){}
    


  
}



    

    

