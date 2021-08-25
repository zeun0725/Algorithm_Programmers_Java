package com.fastcampus.classpart;

public class Student {
    public int studentID;
    public String studentName;
    public String address;
    Subject korea;
    Subject math;

    public Student(int id, String name) {
        studentID = id;
        studentName = name;
        korea = new Subject();
        math = new Subject();
    }

    public void showStudentInfo() {
        System.out.println(studentName + "," + address);
    }

    public void setSubject(String name, int score) {
        korea.subjectName = name;
        korea.subjectScore = score;
    }



}
