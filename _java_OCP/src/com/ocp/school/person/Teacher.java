package com.ocp.school.person;

// File Structure:
// ######  package         >>>>     class
// ######  com.chen.test         _______StudentTest
//                                  |___TeacherTest
// ######  com.chen.person       _______Student
//                                  |___Teacher
// #########################################################


public class Teacher {
    public int id;
    public String FirstName;
    public String LastName;
    public Teacher(int id, String FirstName, String LastName){
        this.id=id;
        this.FirstName=FirstName;
        this.LastName=LastName;
    }
}

