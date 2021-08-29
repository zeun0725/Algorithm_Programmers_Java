package com.fastcampus.staticex;

public class StudentTest {
    public static void main(String[] args) {
        Student Lee = new Student("lee");
        //static 메서드는 인스턴스 변수와 상관 없이 클래스 이름으로 접근 가능
        System.out.println(Student.getSerialNum());
        System.out.println(Lee.getStudentID());
        Student Kim = new Student("kim");
        System.out.println(Student.getSerialNum());
        System.out.println(Kim.getStudentID());
        System.out.println(Student.getSerialNum());
        System.out.println(Lee.getStudentID());

    }
}
