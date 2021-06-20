package com;
// This is to test primitive vs wrapper type

import java.util.ArrayList;

public class CTest04_DataTypes {
    public static void main(String[] args) {

        // #### Test StringBuffer
        //string_buffer_test();

        // ##### Test Wrapper Class
        //test_Integer();
        //test_Boolean();
        test_Enum();
    }
    static void test_Enum(){

        System.out.println(CountryName.CANADA);
    }

    static void string_buffer_test() {
        StringBuffer strBuf = new StringBuffer("StringBuffer Testing");
        System.out.println(strBuf);
    }

    static void test_Integer() {
        Integer int_01 = Integer.valueOf(50);
        System.out.println(int_01);

        ArrayList<Integer> al_Int = new ArrayList<>(5);
        System.out.println("___" + al_Int.size());
        for (int i = 0; i < 5; i++) {
            Integer temp_Int = Integer.valueOf(i * i);
            al_Int.add(temp_Int);
            System.out.println(al_Int.get(i));

        }
        System.out.println("___" + al_Int.size());


    }

    static void test_Boolean() {
        Boolean bl_01 = Boolean.valueOf(true);
        System.out.println(!bl_01);
        ArrayList<Boolean> al_Bl = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            Boolean bl_temp = (i % 2 == 0) ? Boolean.valueOf(true) : Boolean.valueOf(false);
            al_Bl.add(bl_temp);
            System.out.println("al_Bl[ " + i + " ] = " + al_Bl.get(i));
        }
    }

}
