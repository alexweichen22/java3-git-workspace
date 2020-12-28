// To Test Basic Syntax
package com;
import java.util.Scanner;

public class CTest01_Basic {
    public static void main(String[] args) {
        // Main
        Scanner scan = new Scanner(System.in);
        // Testing Methods
        testForEachLoop();

    }

    static void testForEachLoop() {
        int[] intArr = new int[20];
        System.out.println("\n--------------------------------------------------------");
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i;
            System.out.printf(intArr[i] + " ");
        }
        System.out.println("\n--------------------------------------------------------");
        for (int x : intArr) {
            System.out.printf(x + 1 + " ");
        }
    }
    static void testArrList(){
        System.out.println("ok google");

    }
}
