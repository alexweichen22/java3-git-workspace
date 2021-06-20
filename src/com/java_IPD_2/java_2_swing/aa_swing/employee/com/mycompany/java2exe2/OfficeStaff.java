/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _java_exe.java2Exe2.src.main.java.com.mycompany.java2exe2;

/**
 *
 * @author 6151742
 */
public class OfficeStaff extends Employee {              // Inheritance
    private String dept;                                 // Encapsulation
    
    
    // Constructor
    public OfficeStaff(String ename){
        super(ename);
    }
 
    
    
    // Getter   
    public String getDept(){
    return dept;    
    }
    // Setter
    public void setDept(String osdept){
        dept = osdept;
    }
    
    // modify the inheritance
    @Override                                          // Dynamic Polymorphism
    
    public String getName(){
        return "This is the name from officestaff: "+super.getName();
    }
}
