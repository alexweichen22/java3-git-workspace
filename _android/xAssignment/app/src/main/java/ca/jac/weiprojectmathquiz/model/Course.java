package ca.jac.weiprojectmathquiz.model;

import java.io.Serializable;
import java.util.Random;

public class Course implements Serializable {
        private int courseId;
        private String courseName;
        private String teacherName;
        private String programName;

    public Course(int course_id, String course_name, String teacher_name, String program_name){
        this.courseId = course_id;
        this.courseName = course_name;
        this.teacherName = teacher_name;
        this.programName = program_name;
    }

    public void setCourseId(int s){
        this.courseId = s;
    }
    public void setCourseName(String s){
        this.courseName = s;
    }
    public void setTeacherName(String s){
        this.teacherName = s;
    }
    public void setProgramName(String s){
        this.programName= s;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getProgramName() {
        return programName;
    }

    public String getTeacherName() {
        return teacherName;
    }


    @Override
    public String toString(){
        String result = courseId + ", " + courseName + ", " + programName+ ", "+teacherName;
        return result;
    }
}