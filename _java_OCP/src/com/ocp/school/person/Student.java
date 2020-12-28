// File Structure:
// ######  package         >>>>     class
// ######  com.chen.test         _______StudentTest
//                                  |___TeacherTest
// ######  com.chen.person       _______Student
//                                  |___Teacher
// #########################################################

package com.ocp.school.person;

public class Student {
    public int id;
    public String FirstName;
    public String LastName;
    public Student(int id, String FirstName, String LastName){
        this.id=id;
        this.FirstName=FirstName;
        this.LastName=LastName;
    }
}


