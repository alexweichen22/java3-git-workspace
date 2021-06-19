package com.ocp.school.test;

// File Structure:
// ######  package         >>>>     class
// ######  com.chen.test         _______StudentTest
//                                  |___TeacherTest
// ######  com.chen.person       _______Student
//                                  |___Teacher
// ###########################################################

import java.util.ArrayList;
import com.ocp.school.person.Teacher;

public class TeacherTest {
    public static void main(String[] args){

        // Instantiate Object (individual)
        Teacher t1 = new Teacher(9000,"Yuqin","Zhang");
        System.out.println("######## Below is Individual Object  #############");
        System.out.println("#" + t1.id + "   " + t1.FirstName + "  " + t1.LastName);
        Teacher t2 = t1;
        System.out.println("t1.id = " + t1.id);
        System.out.println("t2.id = " + t2.id);
        t2.id = 9999;
        System.out.println("t1.id = " + t1.id);
        System.out.println("t2.id = " + t2.id);

        // Instantiate Object (Array)
        System.out.println("\n######## Below is Array Object    #############");
        Teacher[] tarr = new Teacher[5];
        for(int i=0;i<5;i++){
            tarr[i] = new Teacher((9001+i), ("F"+i), ("L"+2*i));
            System.out.println("#" + tarr[i].id + "   " + tarr[i].FirstName + "     " + tarr[i].LastName);
        }

        // Instantiate Object (ArrayList)
        System.out.println("\n######## Below is ArrayList Object     ###########");
        ArrayList<Teacher> teacher=new ArrayList<Teacher>();

        teacher.add(new Teacher(1000,"Alex","Chen"));
        teacher.add(new Teacher(1001,"Jia","Zhu"));
        teacher.add(new Teacher(1002,"Motong","Chen"));
        teacher.add(new Teacher(1003,"Fiona","Chen"));
        teacher.add(new Teacher(1004,"Florence","Chen"));

        try{
            do {
                System.out.println("......Size = " + teacher.size());
                for(int i=0;i<teacher.size();i++){
                    System.out.println("#" + teacher.get(i).id + "   " + teacher.get(i).FirstName + "      " + teacher.get(i).LastName);
                }
                teacher.remove(teacher.size()-1);
                System.out.println("##########################");
            }while(teacher.size()>=0);
        }
        catch(Exception excep){
            System.out.println("Empty ArrayList");
        }


    }
}

