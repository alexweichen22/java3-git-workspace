package com.ocp.school.test;

// File Structure:
// ######  package         >>>>     class
// ######  com.chen.test         _______StudentTest
//                                  |___TeacherTest
// ######  com.chen.person       _______Student
//                                  |___Teacher
// ###########################################################

import java.util.ArrayList;
import com.ocp.school.person.Student;

public class StudentTest {
    public static void main(String[] args){
        methodTest();
        try{
            System.out.println(methodTest().id);
        }
        catch(Exception excep){
            System.out.println("Exception Error - null value for Student");
        }
    }
    static Student methodTest(){
        System.out.println("methodTest print");
        return null;
    }


}

