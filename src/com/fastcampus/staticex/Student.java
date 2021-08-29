package com.fastcampus.staticex;

public class Student {
    private static int serialNum = 1000;
    private int studentID;
    public String studentName;
    public String address;

    public Student(String name) {
        studentName = name;
        serialNum++;
        studentID = serialNum; //assign
    }

    public Student(String name, int id) {
        studentName = name;
        studentID = id;
        serialNum++;
        studentID = serialNum;
    }

    public int getStudentID() {
        return studentID;
    }

    public static int getSerialNum() {
        return serialNum;
    }
    public static void setSerialNum(int serialNum) {
        Student.serialNum = serialNum;
    }

}
