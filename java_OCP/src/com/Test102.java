package com;

import com.chen.person.Student;
import java.util.Scanner;
import java.util.ArrayList;

public class Test102 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //literalTest();                               // test_001  literal
        //radixTest();                                 // test_002  radix
        //inputTest(input);                            // test_003  System.in
        //arrayTest();                                 // test_004  array
        //arrayListTest(input);                        // test_005  array list
        //lcTwoSum();                                  // test_006  LeetCode TwoSum
        tempTest();
    }
    static void tempTest(){
        int a = (int)(Math.pow(2,31)-1);
        System.out.println(Integer.toString(a,2));
        System.out.println(Integer.parseInt("10000000"));
        System.out.println(a);
    }
    static void lcTwoSum() {

    }                        // test_006  lcTwoSum
    static void arrayListTest(Scanner input) {
        System.out.println("########### ArrayList Test (Start) ###########");

        // Test ArrayList of primitive
        ArrayList<String> arrL = new ArrayList<String>();
        System.out.println("Add to ArrayList index 0");
        arrL.add(input.next());
        System.out.println(arrL.get(0));

        System.out.println("Add to ArrayList index 1");
        arrL.add(input.next());
        System.out.println(arrL.get(1));
        System.out.println("#####################\n");

        // Test ArrayList of reference type
        ArrayList<Student> arrS = new ArrayList<Student>();
        arrS.add(new Student(90001, "Florence", "Chen"));
        arrS.add(new Student(90002, "Fiona", "Chen"));
        arrS.add(new Student(90003, "Motong", "Chen"));
        System.out.println(arrS.get(0)
                .getIdS() + "----" + arrS.get(0).firstNameS + "  " + arrS.get(0).lastNameS);
        System.out.println(arrS.get(1).getIdS() + "----" + arrS.get(1).firstNameS + "  " + arrS.get(1).lastNameS);
        System.out.println(arrS.get(2).getIdS() + "----" + arrS.get(2).firstNameS + "  " + arrS.get(2).lastNameS);
        System.out.println("#_________  ArrayList Test (End) _________#\n\n");
    }   // test_005  array list
    static void arrayTest() {
        System.out.println("########### Array Test (Start) ###########");
        // Test Array of primitive
        System.out.println("hi");

        // Test Array of reference type
        System.out.println("#_________ Array Test (End) _________#\n\n");

    }                    // test_004  array
    static void inputTest(Scanner input) {
        System.out.println("########### Input Test (Start) ###########");
        System.out.println("Test IDE - Enter Your Input");
        String str = input.next();
        System.out.println(str);
        System.out.println("#_________ Input Test (End) _________#\n\n");
    }       // test_003  System.in
    static void radixTest(){
        System.out.println("########### Radix Test (Start) ###########");

        long i1 = Math.round(Math.random()*10);           // why int not working
        int i2 = Math.round(123.456f);
        int i3 = (int)Math.round((Math.random())*100);
        String b1 = Integer.toString(255,2);
        String h1 = Integer.toString(255,16);
        String o1 = Integer.toString(255,8);
        int i4 = Integer.parseInt("123");
        int i5 = Integer.parseInt("11110000",2);
        int i6 = Integer.parseInt("ff",16);
        int i7 = Integer.parseInt("11",8);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(b1);
        System.out.println(h1);
        System.out.println(o1);
        System.out.println("parseInt String '123' to int          ----    " + i4);
        System.out.println("parseInt binary '11110000' to decimal ----    " + i5);
        System.out.println("parseInt 'hexidecimal' ff to decimal  ----    " + i6);
        System.out.println("parseInt octal '11' to decimal        ----    " + i7);
        System.out.println("#_________ Radix Test (End) _________#\n\n");

    }                     // test_002  radix
    static void literalTest() {
        System.out.println("########### Literal Test (Start) ###########");
        int n1 = 10_000;
        long n2 = 10_000_000L;
        long n3 = 11_222_333l;
        float n4 = 1_2_3_7.4_2_5_637f;
        float n5 = 1.5F;
        double n6 = 1.5;
        double n7 = 2_345.012_345;
        double n8 = 2_345.012_345d;
        float n9 = 99.99f;
        int n10 = 0B10000001;
        int n11 = 011;
        int n12 = 0xFF;

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
        System.out.println("n4 = " + n4);
        System.out.println("n5 = " + n5);
        System.out.println("n6 = " + n6);
        System.out.println("n7 = " + n7);
        System.out.println("n8 = " + n8);
        System.out.println("n9 = " + n9);
        System.out.println("n10 (0B11111111) = " + n10);
        System.out.println("n11 (011) = " + n11);
        System.out.println("n12 (0XFF) = " + n12);
        System.out.println("#_________ Literal Test (End) _________#\n\n");
    }                  // test_001  literal

}
