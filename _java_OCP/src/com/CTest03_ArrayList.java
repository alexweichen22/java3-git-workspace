package com;
import java.util.Scanner;
import java.util.ArrayList;
    /* add, set, get, remove, removeRange, clear, indexOf, isEmpty, toArray, ensureCapacity, clone,
     * equals,
     */
public class CTest03_ArrayList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        test01(scan);
    }
    static void test01(Scanner scan) {
        ArrayList<String> alStr = new ArrayList<>();
        for(int i=0;i<10;i++){
            alStr.add("alStr(" + i + ") = " + 2*i*i);
            System.out.println(alStr.get(i));
        }

    }
}
