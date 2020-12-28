/* 1. Create classes in 2 different named packages. Define static and instance
 *  fields in one of those classes and access those fields from the other
 *   class. See what happens when both the classes try to access the fields
 *   of each other. */
package com.ocp.exe2_4_1.test3c;

import com.ocp.exe2_4_1.test3b.Test3b;
import com.ocp.exe2_4_1.test3a.Test3a;
public class Test3c {
    public static int TEST3C_VALUE = Test3b.TEST3B_VALUE * 3;
    public static void main(String[] args){
        System.out.println(Test3a.TEST3A_VALUE);
        System.out.println(Test3b.TEST3B_VALUE);
        System.out.println(TEST3C_VALUE);
        Test3a.test3aPrint("Hello to test3a from test3c");
        Test3b.test3bPrint("HOORAY TO TEST3B FROM TEST3C");
        test3cPrint("OK, I AM FROM YOU");

        Test3c abc = new Test3c();
        abc.test3cPrint2("yes, this is from instance");
    }
    public static void test3cPrint(String str){
        System.out.println("Here is greeting from inside test3c: "+ str);
    }
    public void test3cPrint2(String str){
        System.out.println("test3c print2 test" + str);
    }
}


