package com.fastcampus.classpart;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.studentName = "테스트";
        studentLee.address = "seoul";

        studentLee.showStudentInfo();

    }
}
