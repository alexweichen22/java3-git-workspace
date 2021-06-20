/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _java_exe.September_4_Examples.EncapsulationExample.src.encapsulationexample;

import java.util.Scanner;

/**
 *
 * @author 1896217
 */
public class EncapsulationExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);        
        Capsule cap = new Capsule();
        
        System.out.print("Please enter your name: ");
        cap.setName(s.nextLine());
        
        System.out.print("Please enter your age: ");
        cap.setAge(s.nextLine());
        
        System.out.println("Hello! Your name is " + cap.getName()
            + " and you are " + cap.getAge() + " years old");
        
        System.out.println(cap.getName() + " is cool!");
    }
    
}
