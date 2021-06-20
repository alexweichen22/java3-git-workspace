package _java_exe.September_4_Examples.AbstractionExample.src.abstractionexample;l/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractionexample;

/**
 *
 * @author 1896217
 */
public class AbstractionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Greetings g = new Greetings();
        g.saySomething();
        g.sayGoodbye();
        g.sayHello();
        g.sayIDontKnow();
    }
    
}

abstract class AbstractTest {
    public void sayHello() {
        System.out.println("Hello world!");
    }
    
    public abstract void sayGoodbye();
}

class Greetings extends AbstractTest implements TaylorsInterface {
    
    @Override
    public void sayGoodbye() {
        System.out.println("Goodbye!!");
    }
    
    public void saySomething() {
        System.out.println("Something");
    }

    @Override
    public void sayIDontKnow() {
        System.out.println("I don't know what to say help!");
    }
    
}
