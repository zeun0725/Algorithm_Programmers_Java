package com.fastcampus.test;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(31, 2, 2021);
        System.out.println(date1.isDate());
        MyDate date2 = new MyDate(28, 2, 2021);
        System.out.println(date2.isDate());
    }
}
