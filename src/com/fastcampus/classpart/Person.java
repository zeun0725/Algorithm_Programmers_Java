package com.fastcampus.classpart;

public class Person {
    int age;
    String name;

    public Person() {
        this("이름 없음", 1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println(name + "," + age);
    }

    public Person getSelf() {
        return this;
    }


}
