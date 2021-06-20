package com.ocp.exe2_4_3_foo.bar;

// ###########    TestFooBar.java  #############
/*
 * 3. Create:
 * ####  a class in a package foo,
 * ####  another class in package foo.bar with a static method.
 *
 * Invoke the static method from the class in package foo using
 * different import statements.
 */

public class TestFooBar {
    public static void printStatic(String str){
        System.out.println("This is print from FooBar Static = " + str);
    }
    public void printNonStatic(String str){
        System.out.println("This is print from FooBar Non-Static = " + str);
    }

}



