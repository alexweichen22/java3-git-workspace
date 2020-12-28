/* 1. Create classes in 2 different named packages. Define static and instance
 *  fields in one of those classes and access those fields from the other
 *   class. See what happens when both the classes try to access the fields
 *   of each other. */
package com.ocp.exe2_4_1.test3a;
public class Test3a {
    public static int TEST3A_VALUE = 3;
    public static void test3aPrint(String str){
        System.out.println("Test3a Print= " + str);
    }
    public int TEST3A_VALUE_2 = 6;
    public void test3aPrint2(String str){
        System.out.println("Test3a Print2= " + str);

    }
}


