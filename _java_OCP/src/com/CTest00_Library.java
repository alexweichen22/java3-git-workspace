package com;

import java.util.Scanner;
// Scanner scan = new Scanner(System.in)
import java.util.ArrayList;
// ArrayList<T> arrList = new ArrayList<>(initialCapacity)       (Simplified syntax since Java_7)
// ArrayList<T> arrList = new ArrayList<T>(initialCapacity)      (Old syntax before Java_7)
// arrList.add();
// arrList.set(index, value)
// arrList.get(index);
// arrList.indexOf();
// arrList.toArray(arrName);
// [  Array Length >= ArrayList Size  ]  Over flow part, assigned as "null"
// If Array length is smaller, not working, all array will not be assigned, stay as "null"
import java.lang.Integer;
import java.lang.StringBuffer;


public class CTest00_Library {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);       // java.util.Scanner
        /* ________________ Test other methods ________________ */
        //scanner_test(scan);
        array_list_test(scan);
    }

    static void scanner_test(Scanner scan) {
        System.out.println("Enter Your Input: ");
        String testString = scan.nextLine();
        System.out.println("This is Your Input:\n" + testString);
    }

    static void array_list_test(Scanner scan) {
        ArrayList<String> al_str = new ArrayList<>(5);
        ArrayList<Integer> al_int = new ArrayList<>(10);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter String for ArrayList al_str[ " + i + " ]");
            al_str.add(scan.nextLine());
        }
        //al_str.set(5,"one more");
        //al_str.set(6,"another one more");
        /*
        for (int i = 0; i < 5; i++) {
            System.out.print(al_str.indexOf(al_str.get(i)));
            System.out.print(" of ArrayList = ");
            System.out.println(al_str.get(i));
        }
        for (String x : al_str) {
            System.out.println(x);
        }
         */
        /*
        String[] a_str = new String[al_str.size()];
        al_str.toArray(a_str);
        System.out.println("--------\n + converted array with length of " + a_str.length + ":");
        for (String x : a_str) {
            System.out.println(x);
        }
         */
    }

}