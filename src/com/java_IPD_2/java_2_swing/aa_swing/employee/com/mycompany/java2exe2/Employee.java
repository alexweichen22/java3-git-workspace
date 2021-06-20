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
public class Employee {                    
    private String name;                  // Encapsulation: Private variables + Public Method, >>>> To hide information from outside, however make it visible from inside of the method
    private double salary;                 
    
    public Employee(){}                  // Static Polymorphism (Overloading)
        
    public Employee(String ename){       // Static Polymorphism (Overloading)
        name=ename;
    }
    public Employee(String ename, double esalary){
        this(ename);
        salary=esalary;
    }
    
    
    public String getName(){             // Encapsulation
        return name;
    }
    
    public double getSalary(){           // This is not Encapsulation, because there is no disclosure!
        return salary;
    }
    
    public double calculateBonus(){
        double bonus;
        bonus = this.getSalary()*0.05;
        return bonus;
    }
}
