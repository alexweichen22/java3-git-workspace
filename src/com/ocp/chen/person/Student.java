package com.chen.person;

public class Student {
    public static int i1;
    public int i2;
    private int idS;
    public String firstNameS;
    public String lastNameS;

    public Student(int id, String fName, String lName) {
        idS = id;
        firstNameS = fName;
        lastNameS = lName;
    }

    public int getIdS() {
        return idS;
    }

}