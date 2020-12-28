package com;

import java.util.ArrayList;

import com.sampleObj.ObjCar;
import com.sampleObj.ObjGeneric;

public class CTest05_Generic {
    public static void main(String[] args) {
        testStringGen();
        testIntegerGen();
        testObjCarGen();
    }

    static void testStringGen() {
        ObjGeneric<String> sampleOG1 = new ObjGeneric<>();
        sampleOG1.testObjGen.add("Apple");
        sampleOG1.testObjGen.add("Banana");
        sampleOG1.testObjGen.add("Cherry");
        sampleOG1.testObjGen.add("Dragon Fruit");
        System.out.println("------------ testStringGen --------------");
        for (String x : sampleOG1.testObjGen) {
            System.out.println(x);
        }
    }

    static void testIntegerGen() {
        System.out.println("------------ testIntegerGen --------------");
        ObjGeneric<Integer> sampleOG2 = new ObjGeneric<>();
        sampleOG2.testObjGen.add(11);
        sampleOG2.testObjGen.add(22);
        sampleOG2.testObjGen.add(33);
        sampleOG2.testObjGen.add(44);
        for (Integer x : sampleOG2.testObjGen) {
            System.out.println(x);
        }
    }

    static void testObjCarGen() {
        System.out.println("------------ testObjCarGen --------------");
        ObjGeneric<ObjCar> sampleOG3 = new ObjGeneric<>();
        for (int i = 0; i < 5; i++) {
            sampleOG3.testObjGen.add(new ObjCar());
            sampleOG3.testObjGen.get(i).plateNumber = 90000 + i + "";
        }
        for (ObjCar x : sampleOG3.testObjGen) {
            System.out.println(x.plateNumber);
        }
    }
}
