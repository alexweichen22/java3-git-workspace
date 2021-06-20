/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _java_exe.September_4_Examples.EncapsulationExample.src.encapsulationexample;

/**
 *
 * @author 1896217
 */
public class Capsule {
    private String name;
    private int age;
    
    public void setName(String name) {
        if (name.length() > 20 || name.charAt(0) != 'T')          
            System.err.println("Name must be 20 characters or less and start with T!");
        else
            this.name = name;
    }
    
    public String getName() { return name; }
    
    public void setAge(String age) {
        try {
            int parsedAge = Integer.parseInt(age);
            
            if (parsedAge < 100)
                this.age = parsedAge;
            else
                System.err.println("Age must be less than 100!");
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("Could not set age!");
        }
        
        System.out.println("AAAAAAAAAAAAAAAAAAAAAA!");
    }
    
    public int getAge() {
        if (age == 0)
            throw new IllegalArgumentException("Age cannot be 0!");
        return age;
    }
}
