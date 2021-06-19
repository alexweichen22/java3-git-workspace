// ##########  TestFoo.java ########
/*
 * 3. Create:
 * ####  a class in a package foo,
 * ####  another class in package foo.bar with a static method.
 *
 * Invoke the static method from the class in package foo using
 * different import statements.
 */
package com.ocp.exe2_4_3_foo;
import com.ocp.exe2_4_3_foo.bar.TestFooBar;


public class TestFoo {
    public static void main(String[] args) throws Exception{
        try{
            System.out.println("args[0] = " + args[0]);
            TestFooBar.printStatic("args[1] = " + args[1]);
            TestFooBar abc = new TestFooBar();
            abc.printNonStatic("args[2] = " + args[2]);
        }
        catch(Exception exp){
            System.out.println("You might forget to Enter 'Argument' ");
        }
    }

}
