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
public class Teacher extends Employee {                          // Inheritance
    private String subject;                                      // Encapsulation
    
    
    // Constructor
    public Teacher(){};                                          // Static Polymorphism (Overloading)
    
    public Teacher(String ename) {                               // Static Polymorphism (Overloading)
        super(ename);      // super == Constructor of the higher level class (Employee)
        subject="Math";
    }
    
    public Teacher(String tname, String tsubject){               // Static Polymorphism (Overloading)
        super(tname);
        subject=tsubject;
    }
    
    
    // Getter
    public String getSubject(){
        return subject;
    }       
}


    class Grade1Teacher extends Teacher {                        // Inheritance
        public Grade1Teacher(String name){
            super(name);
        }
        public void printTitle(String title){
            System.out.println(title);
        }
        
    }