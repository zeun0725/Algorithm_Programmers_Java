package com.fastcampus.staticex;

public class StudentTest {
    public static void main(String[] args) {
        Student Lee = new Student("lee");
        System.out.println(Student.getSerialNum());
        System.out.println(Lee.getStudentID());
        Student Kim = new Student("kim");
        System.out.println(Student.getSerialNum());
        System.out.println(Kim.getStudentID());
        System.out.println(Student.getSerialNum());
        System.out.println(Lee.getStudentID());

    }
}
