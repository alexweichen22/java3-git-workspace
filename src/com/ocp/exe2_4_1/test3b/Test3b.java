/* 1. Create classes in 2 different named packages. Define static and instance
 *  fields in one of those classes and access those fields from the other
 *   class. See what happens when both the classes try to access the fields
 *   of each other. */
package com.ocp.exe2_4_1.test3b;
import com.ocp.exe2_4_1.test3a.Test3a;
//Or import "wild-card" chen.test3a.*  (Always import Class, not a package)
public class Test3b {
    public static int TEST3B_VALUE = Test3a.TEST3A_VALUE * 3;
    public static void test3bPrint(String str){
        System.out.println("Test3b Print = " + str);
    }
    public int TEST3B_VALUE_2=18;
    public void test3bPrint2(String str){
        System.out.println("Test3b Print2 = " + str);
    }
}

