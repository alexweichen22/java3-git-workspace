package ca.jac.a05a_studentinfo;

import java.io.Serializable;

public class Student implements Serializable {
    String studentId;
    String name;
    String age;

    public Student(String id, String name, String age){
        this.studentId = id;
        this.name = name;
        this.age = age;
    }

    public String getStudentId(){
        return studentId;
    }
    @Override
    public String toString() {
        String output = "Student Id: " + studentId + "\n" +
                "      Name: " + name + "\n" +
                "       Age: " + age;
        return output;
    }
}
