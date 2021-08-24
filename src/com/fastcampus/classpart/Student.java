package com.fastcampus.classpart;

public class Student {
    public int studentID;
    public String studentName;
    public String address;

    public Student(int id, String name) {
        studentID = id;
        studentName = name;
    }

    public void showStudentInfo() {
        System.out.println(studentName + "," + address);
    }

    public String getStudentName() {
        return studentName;
    }



}
