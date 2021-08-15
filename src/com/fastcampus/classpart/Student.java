package com.fastcampus.classpart;

public class Student {
    public int studentID;
    public String studentName;
    public String address;

    public void showStudentInfo() {
        System.out.println(studentName + "," + address);
    }

    public String getStudentName() {
        return studentName;
    }

//    public void setStudentName(String studentName) {
//        this.studentName = studentName;
//    }


}
